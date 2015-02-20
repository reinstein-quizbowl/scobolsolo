package com.scobolsolo.servlets;

import java.io.File;
import java.util.Collections;
import java.util.Collection;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.FileCleanerCleanup;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FileCleaningTracker;
import org.apache.commons.lang3.Validate;

import com.siliconage.web.ControllerServlet;

import com.opal.TransactionContext;

import com.scobolsolo.application.Account;
import com.scobolsolo.AccountUtility;

public abstract class ScobolSoloControllerServlet extends ControllerServlet {
	private static final long serialVersionUID = 1L;
	
	protected static final org.apache.log4j.Logger ourLogger = org.apache.log4j.Logger.getLogger(ScobolSoloControllerServlet.class);
	
	/** The Opal system links each Thread to a single (possibly null) TransactionContext; if that link is null, then the
	 * thread does not have an active TransactionContext (and is therefore not in the middle of modifying any Opals).
	 * 
	 * A servlet should NOT join an active TransactionContext and then finish its execution while that TransactionContext
	 * is still active, because subsequent web requests that want to continue manipulating the same Opals will not
	 * necessarily be handled by the same Thread.
	 * 
	 * To detect problems with this, whenever an ScobolSoloControllerServlet (or its subclass) starts up, we check to see if the
	 * Thread already has an active TransactionContext (which it shouldn't, because it hasn't done any work).  If it does,
	 * it means that some other *servlet* started a TransactionContext but didn't commit it, roll it back, or "leave" it
	 * prior to finishing execution.  That's a serious bug, so we throw an Exception.
	 * 
	 * If a programmer wants a single TransactionContext to span multiple web requests, he should create it, change some
	 * objects, put the TransactionContext in the HttpSession, and then have the Thread leave the TransactionContext.
	 * The next servlet in the chain can retrieve the TransactionContext from the session and reactivate it.  Note that
	 * you may need a very, very long timeout value for this to work.
	 * 
	 * @param argStart <code>true</code> if we are starting the servlet; <code>false</code> if we are finishing it
	 */
	private void ensureNoActiveTransactionContext(final boolean argStart) {
		if (TransactionContext.hasActive()) {
			throw new IllegalStateException("Servlet " + this + " had an active TransactionContext " + (argStart ? "before it started" : "after it finished") + " its work.  We're hosed.");
		}
	}
	
	/** In general, invoking an ScobolSoloControllerServlet does all of the things a ControllerServlet does, then translates the
	 * username into an ScobolSolo Contact so it can pass that to processInternal (which should be overridden to do the actual
	 * work.
	 * 
	 * This method returns the URL to which the user should be redirected (which it obtains from processInternal).
	 * 
	 * @param argRequest the HttpServletRequest
	 * @param argSession the HttpSession
	 * @param argUsername the username of the logged-in user, or null if the user is not logged in
	 * @return the URL to which the user should be redirected.
	 */
	@Override
	protected final String processInternal(final HttpServletRequest argRequest, final HttpSession argSession, final String argUsername) throws Exception {
		try {
			
			/* Make sure we aren't starting execution with an active Opal TransactionContext before having done any work. */
			ensureNoActiveTransactionContext(true);
			
			/* Turn the username into an ScobolSolo Account. */
			final Account lclAccount = AccountUtility.getLoggedInAccount(argRequest);
			/* Is there actually a logged-in user? */
			if (lclAccount == null) {
				/* Yes. Does this servlet require the user to be logged in? */
				if (requireUser()) {
					/* Yes. The null user is not allowed, so we throw an Exception. */ 
					throw new IllegalStateException("A user must be logged in to access this servlet.");
				} else {
					/* No. The null user is okay. */
				}
			} else {
				/* We have a user, so there is nothing further to check.  Or, more precisely, all other security checks are
				 * the responsibility of processInternal. */
			}
			
			/* Actually perform this servlet's work. */
			final String lclReturnURL = processInternalTwo(argRequest, argSession, lclAccount);
			assert lclReturnURL != null;
			
			/* Make sure we aren't ending our execution with an active TransactionContext. */
			ensureNoActiveTransactionContext(false);
			
			/* Return the URL to which the user should be redirected; our superclass is responsible for actually
			 * generating the redirect. */
			return lclReturnURL;
		} catch (Exception lclE) {
			ourLogger.error(lclE.getMessage(), lclE);
			throw lclE;
		}
	}

	/** Override this method to do whatever this servlet is actually supposed to do.
	 * 
	 * @param argRequest the HttpServletRequest
	 * @param argSession the HttpSession
	 * @param argAccount the Account of the logged-in user, or null if the user is not logged in
	 * @return the URL to which the user should be redirected.
	 * @throws Exception if there is a problem executing the servlet
	 * 
	 * ScobolSoloControllerServlets should not try to send HTML (or anything else) to the user (which is why the internal
	 * methods don't have access to the HttpResponse).  Instead they should redirect to a JSP page and put
	 * appropriate objects in the session for that JSP page to tell the user what happened.
	 */
	protected abstract String processInternalTwo(final HttpServletRequest argRequest, final HttpSession argSession, final Account argAccount) throws Exception;
	
	/** By default, the sorts of servlets that override this require a user to be logged in.  If you are writing one that
	 * doesn't, override this method to return false.
	 @return <code>true</code> if the servlet requires that a user be logged in; <code>false</code> if not
	 */
	protected boolean requireUser() {
		return true;
	}
	
	protected static boolean hasUpload(final HttpServletRequest argRequest) {
		Validate.notNull(argRequest);
		
		return ServletFileUpload.isMultipartContent(argRequest);
	}
	
	protected List<FileItem> getUploadItems(final HttpServletRequest argRequest) throws FileUploadException {
		Validate.notNull(argRequest);
		
		if (hasUpload(argRequest)) {
			final DiskFileItemFactory lclItemFactory = newDiskFileItemFactory(getServletConfig().getServletContext());
			
			final ServletFileUpload lclUpload = new ServletFileUpload(lclItemFactory);
			return lclUpload.parseRequest(argRequest);
		} else {
			return Collections.emptyList();
		}
	}
	
	protected FileItem getUpload(final Collection<FileItem> argItems, final String argKey) {
		Validate.notNull(argItems);
		Validate.notNull(argKey);
		
		if (argItems == null || argItems.isEmpty()) {
			return null;
		} else {
			for (final FileItem lclFI : argItems) {
				if (lclFI != null && !lclFI.isFormField() && lclFI.getFieldName().equals(argKey)) {
					return lclFI;
				}
			}
			
			return null;
		}
	}
	
	protected String getUploadParameterValue(final Collection<FileItem> argItems, final String argKey) {
		Validate.notNull(argItems);
		Validate.notNull(argKey);
		
		if (argItems == null || argItems.isEmpty()) {
			return null;
		} else {
			for (final FileItem lclFI : argItems) {
				if (lclFI != null && lclFI.isFormField() && lclFI.getFieldName().equals(argKey)) {
					return lclFI.getString();
				}
			}
			
			return null;
		}
	}
	
	public static DiskFileItemFactory newDiskFileItemFactory(final ServletContext argContext) {
		final FileCleaningTracker lclFileCleaningTracker = FileCleanerCleanup.getFileCleaningTracker(argContext);
		final DiskFileItemFactory lclFactory = new DiskFileItemFactory(DiskFileItemFactory.DEFAULT_SIZE_THRESHOLD, (File) argContext.getAttribute("javax.servlet.context.tempdir"));
		lclFactory.setFileCleaningTracker(lclFileCleaningTracker);
		return lclFactory;
	}
}
