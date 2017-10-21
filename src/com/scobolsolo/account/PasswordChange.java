package com.scobolsolo.account;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;

import com.opal.TransactionContext;

import com.scobolsolo.application.Account;
import com.scobolsolo.application.AccountFactory;
import com.scobolsolo.servlets.ScobolSoloControllerServlet;
import com.scobolsolo.security.BCrypt;
import com.scobolsolo.ScobolSoloConfiguration;

public class PasswordChange extends ScobolSoloControllerServlet {
	// private static final org.apache.log4j.Logger ourLogger = org.apache.log4j.Logger.getLogger(PasswordChange.class);
	
	private static final long serialVersionUID = 1L;
	
	public static final String MINIMUM_PASSWORD_LENGTH_KEY = "PASSWORD_LENGTH_MIN";
	public static final int DEFAULT_MINIMUM_PASSWORD_LENGTH = 6;
	
	public static final String MAXIMUM_PASSWORD_LENGTH_KEY = "PASSWORD_LENGTH_MAX";
	public static final int DEFAULT_MAXIMUM_PASSWORD_LENGTH = 1024;
	
	public static final String CONFIRMATION_PAGE = "/account/change-password-confirmation.jsp";
	public static final String ERROR_PAGE = "/account/change-password-error.jsp";
	
	@Override
	protected String processInternalTwo(final HttpServletRequest argRequest, final HttpSession argSession, final Account argUser) {
		String lclProblems = null;
		final Account lclAccount = AccountFactory.getInstance().fromHttpRequest(argRequest);
		
		if (lclAccount == null) {
			argSession.setAttribute("error", "the account for whom to change the password was not provided");
			return ERROR_PAGE;
		} else if (lclAccount != argUser) {
			argSession.setAttribute("error", "the account for whom to change the password was not the same as the logged-in user");
			return ERROR_PAGE;
		} else {
			final String lclOldPW  = StringUtils.trimToNull(argRequest.getParameter("password_old"));
			
			if (lclOldPW == null) {
				argSession.setAttribute("error", "no old password was provided");
				return ERROR_PAGE;
			}

			final String lclNewPW1 = StringUtils.trimToNull(argRequest.getParameter("new_password"));
			final String lclNewPW2 = StringUtils.trimToNull(argRequest.getParameter("new_password_confirm"));
			boolean lclChangePW = false;
			
			if (lclNewPW1 != null && lclNewPW2 != null) {
				final String lclOldHash = argUser.getPasswordHash();
				if (lclOldHash != null) {
					if (BCrypt.checkpw(lclOldPW, lclOldHash) == false) {
						argSession.setAttribute("error", "the old password was incorrect");
						return ERROR_PAGE;
					}
				}
				
				
				if (lclNewPW1.equals(lclNewPW2) == false) {
					lclProblems = "the new passwords did not match";
				}
				
				final int lclMinimumPasswordLength = ScobolSoloConfiguration.getInstance().getInt(MINIMUM_PASSWORD_LENGTH_KEY, DEFAULT_MINIMUM_PASSWORD_LENGTH);
				final int lclMaximumPasswordLength = ScobolSoloConfiguration.getInstance().getInt(MAXIMUM_PASSWORD_LENGTH_KEY, DEFAULT_MAXIMUM_PASSWORD_LENGTH);
				
				if (lclNewPW1.length() < lclMinimumPasswordLength || lclNewPW1.length() > lclMaximumPasswordLength) {
					if (lclProblems != null) {
						lclProblems += ", and ";
					}
					
					lclProblems = lclProblems + "the new password must be between " + lclMinimumPasswordLength + " and " + lclMaximumPasswordLength + " characters";
				} else {
					lclChangePW = true;
				}
			}
			
			if (lclProblems != null) {
				argSession.setAttribute("error", lclProblems);
				return ERROR_PAGE;
			}
			
			if (lclChangePW) {
				try (TransactionContext lclTC = TransactionContext.createAndActivate()) {
					lclAccount.setPassword(lclNewPW1);
					
					lclTC.complete();
					
					argSession.setAttribute("mod", "ok");
					return CONFIRMATION_PAGE;
				} catch (Exception lclE) {
					System.err.println("Squashing exception thrown in PasswordResetController.");
					lclE.printStackTrace(System.err);
					argSession.setAttribute("error", "an internal error occurred");
					return ERROR_PAGE;
				}
			} else {
				argSession.setAttribute("error", "an internal error occurred");
				return ERROR_PAGE;
			}
		}
	}
}

