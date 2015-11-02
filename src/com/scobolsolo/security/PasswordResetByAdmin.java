package com.scobolsolo.security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;

import com.opal.TransactionContext;

import com.scobolsolo.application.Account;
import com.scobolsolo.application.AccountFactory;
import com.scobolsolo.servlets.ScobolSoloControllerServlet;
import com.scobolsolo.ScobolSoloConfiguration;

public class PasswordResetByAdmin extends ScobolSoloControllerServlet {
	private static final long serialVersionUID = 1L;
	
	public static final String CONFIRMATION_URL = "/admin/contact-reset-password-confirmation.jsp";
	public static final String ERROR_URL = "/admin/contact-reset-password-error.jsp";
	
	@Override
	protected String processInternalTwo(final HttpServletRequest argRequest, final HttpSession argSession, final Account argUser) {
		String lclProblems = null;
		final Account lclAccount = AccountFactory.getInstance().fromHttpRequest(argRequest);
		
		if (lclAccount == null) {
			lclProblems = "There is no such account. ";
			argSession.setAttribute("error", lclProblems);
			return ERROR_URL;
		} else if (lclAccount != argUser && !argUser.isAdministrator()) {
			lclProblems = "A user's password may only be reset by an administrator.";
			argSession.setAttribute("error", lclProblems);
			return ERROR_URL + "?account_id=" + lclAccount.getId();
		} else {
			final String lclNewPW1 = StringUtils.trimToNull(argRequest.getParameter("new_password"));
			final String lclNewPW2 = StringUtils.trimToNull(argRequest.getParameter("new_password_confirm"));
			if (lclNewPW1 != null && lclNewPW2 != null) {
				if (lclNewPW1.equals(lclNewPW2) == false) {
					lclProblems = "The new passwords did not match.<br />";
				}
				
				final int lclMinimumPasswordLength = ScobolSoloConfiguration.getInstance().getInt(PasswordChange.MINIMUM_PASSWORD_LENGTH_KEY, PasswordChange.DEFAULT_MINIMUM_PASSWORD_LENGTH);
				final int lclMaximumPasswordLength = ScobolSoloConfiguration.getInstance().getInt(PasswordChange.MAXIMUM_PASSWORD_LENGTH_KEY, PasswordChange.DEFAULT_MAXIMUM_PASSWORD_LENGTH);
				
				if (lclNewPW1.length() < lclMinimumPasswordLength || lclNewPW1.length() > lclMaximumPasswordLength) {
					lclProblems += "The new password must be between " + lclMinimumPasswordLength + " and " + lclMaximumPasswordLength + " characters.<br />";
				}
			}
			
			if (lclProblems != null) {
				argSession.setAttribute("error", lclProblems);
				return ERROR_URL + "?account_id=" + lclAccount.getId();
			} else {
				try (TransactionContext lclTC = TransactionContext.createAndActivate()) {
					lclAccount.setPassword(lclNewPW1);
					
					lclTC.complete();
					
					argSession.setAttribute("mod", "ok");
					
					return CONFIRMATION_URL + "?account_id=" + lclAccount.getId();
				} catch (Exception lclE) {
					System.err.println("Squashing exception thrown in PasswordResetByAdmin.");
					lclE.printStackTrace(System.err);
					lclProblems = "An internal error occurred."; 
					argSession.setAttribute("error", lclProblems);
					return ERROR_URL + "?account_id=" + lclAccount.getId();
				}
			}
		}
	}
}

