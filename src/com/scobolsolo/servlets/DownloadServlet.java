package com.scobolsolo.servlets;

import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;

import org.apache.commons.lang3.Validate;

import com.opal.TransactionContext;

import com.scobolsolo.application.Account;

public abstract class DownloadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// private static final org.apache.log4j.Logger ourLogger = org.apache.log4j.Logger.getLogger(DownloadServlet.class.getName());
	
	private static final String FILENAME_SEPARATOR = "-";
	
	/** The Opal system links each Thread to a single (possibly null) TransactionContext; if that link is null, then the
	 * thread does not have an active TransactionContext (and is therefore not in the middle of modifying any Opals).
	 * 
	 * A servlet should NOT join an active TransactionContext and then finish its execution while that TransactionContext
	 * is still active, because subsequent web requests that want to continue manipulating the same Opals will not
	 * necessarily be handled by the same Thread.
	 * 
	 * To detect problems with this, whenever a (subclass of a) DownloadServlet starts up, we check to see if the
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
	
	@Override
	protected void doGet(final HttpServletRequest argRequest, final HttpServletResponse argResponse) throws ServletException, IOException {
		run(argRequest, argResponse);
	}
	
	@Override
	protected void doPost(final HttpServletRequest argRequest, final HttpServletResponse argResponse) throws ServletException, IOException {
		run(argRequest, argResponse);
	}
	
	protected void run(final HttpServletRequest argRequest, final HttpServletResponse argResponse) throws IOException {
		/* Make sure we aren't starting execution with an active Opal TransactionContext before having done any work. */
		ensureNoActiveTransactionContext(true);
		
		/* Turn the username into an Account. */
		final Account lclUser = Account.determineCurrent(argRequest);
		/* Is there actually a logged-in user? */
		if (lclUser == null) {
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
		
		final Download lclDownload = Validate.notNull(makeDownload(argRequest, lclUser));
		
		argResponse.setContentType(lclDownload.getMimeType());
		argResponse.setHeader("Content-Disposition", "inline;filename=" + lclDownload.getFilename());
		
		try (BufferedInputStream lclBIS = new BufferedInputStream(new FileInputStream(lclDownload.getFile()))) {
			int lclByte;
			while ((lclByte = lclBIS.read()) != -1) {
				argResponse.getWriter().write(lclByte);
			}
		}
		
		/* Make sure we aren't ending our execution with an active TransactionContext. */
		ensureNoActiveTransactionContext(false);
	}
	
	protected abstract Download makeDownload(final HttpServletRequest argRequest, final Account argUser);
	
	protected boolean requireUser() {
		return true;
	}
	
	protected static String cleanFilename(final String argS) {
		final StringBuilder lclSB = new StringBuilder(argS.length());
		
		boolean lclJustAppendedNonAlphanumeric = false;
		for (final char lclC : argS.toCharArray()) {
			if (Character.isLetterOrDigit(lclC)) {
				lclSB.append(Character.toLowerCase(lclC));
				lclJustAppendedNonAlphanumeric = false;
			} else {
				if (!lclJustAppendedNonAlphanumeric) {
					lclSB.append(FILENAME_SEPARATOR);
					lclJustAppendedNonAlphanumeric = true;
				}
			}
		}
		
		return lclSB.toString();
	}
	
	protected static class Download {
		private final File myFile;
		private final String myMimeType;
		private final String myFilename;
		
		public Download(final File argFile, final String argMimeType, final String argFilename) {
			myFile = argFile;
			myMimeType = argMimeType;
			myFilename = argFilename;
		}
		
		public File getFile() {
			return myFile;
		}
		
		public String getMimeType() {
			return myMimeType;
		}
		
		public String getFilename() {
			return myFilename;
		}
	}
}
