package com.scobolsolo.security;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

import com.opal.TransactionContext;

import com.scobolsolo.application.Account;
import com.scobolsolo.application.AccountFactory;
import com.scobolsolo.servlets.ScobolSoloControllerServlet;
import com.scobolsolo.Mail;
import com.scobolsolo.ScobolSoloConfiguration;

public class PasswordResetFromToken extends ScobolSoloControllerServlet {
	private static final String FROM_ADDRESS = "jonah@jonahgreenthal.com";
	private static final String NOTIFICATION_TO_ADDRESS = "jonah@jonahgreenthal.com";
	private static final String SEND_TO_BASE_URL = "confirmation.jsp";
	private static final String ERROR_URL = "error.jsp";
	
	private static final long serialVersionUID = 1L;
	
	@SuppressWarnings("hiding")
	private static final org.apache.log4j.Logger ourLogger = org.apache.log4j.Logger.getLogger(PasswordResetFromToken.class);
	
	@Override
	protected String processInternalTwo(HttpServletRequest argRequest, HttpSession argSession, Account argUser) throws Exception {
		Validate.isTrue(argUser == null, "A password reset token cannot be applied for a user who is logged in.");
		
		Account lclA = AccountFactory.getInstance().fromHttpRequest(argRequest);
		
		if (lclA == null) {
			argSession.setAttribute("PASSWORD_RESET_ERROR", "No account was specified.");
			return ERROR_URL;
		}
		
		String lclProvidedToken = StringUtils.trimToNull(argRequest.getParameter("token"));
		if (lclProvidedToken == null) {
			argSession.setAttribute("PASSWORD_RESET_ERROR", "No password reset token was provided.");
			return ERROR_URL;
		}
		String lclCorrectToken = lclA.getPasswordResetToken();
		LocalDateTime lclCorrectTokenExpires = lclA.getPasswordResetTokenExpiration();
		if (lclCorrectToken == null || lclCorrectTokenExpires == null) {
			argSession.setAttribute("PASSWORD_RESET_ERROR", "This user has not been issued a token for resetting their password.");
			return ERROR_URL;
		}
		LocalDateTime lclNow = LocalDateTime.now();
		if (lclCorrectTokenExpires.isBefore(lclNow)) {
			argSession.setAttribute("PASSWORD_RESET_ERROR", "The password reset token has expired.");
			return ERROR_URL;
		}
		if (lclProvidedToken.equals(lclCorrectToken) == false) {
			argSession.setAttribute("PASSWORD_RESET_ERROR", "The password reset token is invalid.");
			return ERROR_URL;
		}
		
		int lclMinimumPasswordLength = ScobolSoloConfiguration.getInstance().getInt(PasswordChange.MINIMUM_PASSWORD_LENGTH_KEY, PasswordChange.DEFAULT_MINIMUM_PASSWORD_LENGTH);
		int lclMaximumPasswordLength = ScobolSoloConfiguration.getInstance().getInt(PasswordChange.MAXIMUM_PASSWORD_LENGTH_KEY, PasswordChange.DEFAULT_MAXIMUM_PASSWORD_LENGTH);
		
		String lclNewPassword = StringUtils.trimToNull(argRequest.getParameter("new_password"));
		String lclNewPasswordConfirmation = StringUtils.trimToNull(argRequest.getParameter("new_password_confirm"));
		
		if (lclNewPassword == null) {
			argSession.setAttribute("PASSWORD_RESET_ERROR", "No new password was provided.");
			return ERROR_URL;
		}
		
		if (lclNewPasswordConfirmation == null) {
			argSession.setAttribute("PASSWORD_RESET_ERROR", "The new password was not confirmed.");
			return ERROR_URL;
		}
		
		if (lclNewPasswordConfirmation.equals(lclNewPassword) == false) {
			argSession.setAttribute("PASSWORD_RESET_ERROR", "The new passwords did not match.");
			return ERROR_URL;
		}
		
		if (lclNewPassword.length() < lclMinimumPasswordLength) {
			argSession.setAttribute("PASSWORD_RESET_ERROR", "The new password was too short; it must be between " + lclMinimumPasswordLength + " and " + lclMaximumPasswordLength + " characters (inclusive).");
			return ERROR_URL;
		}
		
		if (lclNewPassword.length() > lclMaximumPasswordLength) {
			argSession.setAttribute("PASSWORD_RESET_ERROR", "The new password was too long; it must be between " + lclMinimumPasswordLength + " and " + lclMaximumPasswordLength + " characters (inclusive).");
			return ERROR_URL;
		}
		
		try (TransactionContext lclTC = TransactionContext.createAndActivate()) {
			lclA.setPassword(lclNewPassword);
			lclA.setPasswordResetToken(null);
			lclA.setPasswordResetTokenExpiration(null);
			
			lclTC.complete();
			
			sendNotificationEmail(lclA);
			
			return SEND_TO_BASE_URL;
		} catch (Exception lclE) {
			System.err.println("Squashing exception thrown in ResetPasswordFromToken.");
			lclE.printStackTrace(System.err);
			ourLogger.error("error", lclE);
			return ERROR_URL;
		}
	}
	
	protected void sendNotificationEmail(Account argA) {
		Validate.notNull(argA);
		Validate.notNull(argA.getUsername());
		Validate.notNull(argA.getContact().getEmailAddress());
		
		String lclSubject = "Scobol Solo password reset for " + argA.getContact().getName();
		
		StringBuilder lclSB = new StringBuilder(1024);
		
		lclSB.append(argA.getUsername() + " (" + argA.getContact().getName() + ", #" + argA.getContact().getId() + ", " + argA.getContact().getEmailAddress() + ") has automatically reset their password.\n");
		
		try {
			Mail.createEmail()
				.setFrom(FROM_ADDRESS, "Scobol Solo Password Reset")
				.addTo(NOTIFICATION_TO_ADDRESS)
				.setSubject(lclSubject)
				.setMsg(lclSB.toString());
		} catch (Exception lclE) {
			ourLogger.error("Could not send password token generation notification", lclE);
		}
	}
	
	// This servlet doesn't require a user. (Practically speaking, it requires *not* a user, but we don't actually have a way to represent that.)
	@Override
	protected boolean requireUser() {
		return false;
	}
}
