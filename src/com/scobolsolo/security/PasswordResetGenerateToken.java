package com.scobolsolo.security;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

import com.siliconage.util.Fast3Set;

import com.opal.ImplicitTableDatabaseQuery;
import com.opal.TransactionContext;

import com.scobolsolo.application.Account;
import com.scobolsolo.application.AccountFactory;
import com.scobolsolo.servlets.ScobolSoloControllerServlet;
import com.scobolsolo.Mail;
import com.scobolsolo.AccountUtility;

public class PasswordResetGenerateToken extends ScobolSoloControllerServlet {
	private static final String FROM_ADDRESS = "jonah@jonahgreenthal.com";
	private static final String NOTIFICATION_TO_ADDRESS = "jonah@jonahgreenthal.com";
	
	private static final String LINK_BASE_URL = "http://www.scobolsolo.com/password-reset/reset.jsp";
	private static final String START_URL = "/password-reset/";
	private static final String SEND_TO_BASE_URL = "token-sent.jsp";
	private static final String ERROR_URL = "error.jsp";
	
	private static final long serialVersionUID = 1L;
	
	@SuppressWarnings("hiding")
	private static final org.apache.log4j.Logger ourLogger = org.apache.log4j.Logger.getLogger(PasswordResetGenerateToken.class);
	
	@Override
	protected String processInternalTwo(HttpServletRequest argRequest, HttpSession argSession, Account argUser) throws Exception {
		Validate.isTrue(argUser == null, "A password reset token cannot be generated for a user who is logged in.");
		
		Account lclA = null;
		try {
			lclA = findAccount(argRequest);
		} catch (AccountFindingException lclAFE) {
			String lclMessage = lclAFE.getMessage();
			if (lclMessage != null) {
				argSession.setAttribute("PASSWORD_RESET_ERROR", lclMessage);
			}
			return ERROR_URL;
		}
		
		if (lclA == null) {
			argSession.setAttribute("PASSWORD_RESET_ERROR", "No account could be found from the information provided. You may <a href=\"" + START_URL + "\">try again</a> if you wish.");
			return ERROR_URL;
		}
		
		try (TransactionContext lclTC = TransactionContext.createAndActivate()) {
			String lclToken = AccountUtility.generatePasswordResetToken();
			LocalDateTime lclExpiration = AccountUtility.generatePasswordResetTokenExpiration();
			
			lclA.setPasswordResetToken(lclToken);
			lclA.setPasswordResetTokenExpiration(lclExpiration);
			
			lclTC.complete();
			
			sendTokenEmail(lclA, lclToken, lclExpiration);
			sendNotificationEmail(lclA, lclExpiration);
			
			return SEND_TO_BASE_URL + "?account_id=" + lclA.getId();
		} catch (Exception lclE) {
			lclE.printStackTrace(System.out);
			ourLogger.error(lclE);
			return ERROR_URL;
		}
	}
	
	protected Account findAccount(HttpServletRequest argRequest) throws AccountFindingException {
		Validate.notNull(argRequest);
		
		String lclUsername = StringUtils.trimToNull(argRequest.getParameter("username"));
		String lclEmail = StringUtils.trimToNull(argRequest.getParameter("email"));
		
		if (lclUsername == null && lclEmail == null) {
			return null;
		}
		
		Account lclByUsername = null;
		if (lclUsername != null) {
			lclByUsername = AccountFactory.getInstance().forUsername(lclUsername);
			if (lclByUsername != null && lclByUsername.getContact().getEmailAddress() == null) { // it doesn't do us any good
				throw new AccountFindingException("The specified username's account does not have an e-mail address, so its password cannot be reset automatically.");
			}
		}
		
		if (lclEmail != null) {
			Collection<Account> lclEmailCandidates = new Fast3Set<>();
			AccountFactory.getInstance().acquireForQuery(
				lclEmailCandidates,
				new ImplicitTableDatabaseQuery("id in (SELECT id FROM Contact WHERE LOWER(email_address) = ?)", lclEmail.toLowerCase())
			);
			
			if (lclByUsername != null) {
				if (lclEmailCandidates.isEmpty()) {
					return lclByUsername;
				} else {
					for (Account lclA : lclEmailCandidates) {
						if (lclA == lclByUsername) {
							return lclA;
						}
					}
					// None of them match, indicating a contradiction between username and e-mail
					throw new AccountFindingException("The given username's account is not the same as the given e-mail address's account.");
				}
			} else {
				if (lclEmailCandidates.isEmpty()) {
					return null;
				} else {
					if (lclEmailCandidates.size() > 1) {
						// There are multiple users with this e-mail address, and the username didn't disambiguate. We don't allow a reset in this case.
						throw new AccountFindingException("There are multiple users with the given username, so the password cannot be reset automatically.");
					} else {
						// There's one user with this email address, so return it
						for (Account lclA : lclEmailCandidates) {
							return lclA;
						}
					}
				}
			}
		}
		
		return lclByUsername;
	}
	
	protected void sendTokenEmail(Account argA, String argToken, LocalDateTime argExpiration) {
		Validate.notNull(argA);
		
		Validate.isTrue(argA.getContact().getEmailAddress() != null);
		Validate.notNull(argToken);
		Validate.notNull(argExpiration);
		
		String lclUrl = LINK_BASE_URL + "?account_id=" + argA.getId() + "&token=" + argToken;
		DateTimeFormatter lclF = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy 'at' h:mm a zzzz");
		
		String lclSubject = "Scobol Solo password reset for " + argA.getContact().getName();
		
		StringBuilder lclSB = new StringBuilder(1024);
		
		lclSB.append("You, or someone pretending to be you, has requested a password reset for www.scobolsolo.com, username '" + argA.getUsername() + "'.\n\n");
		lclSB.append("If you wish to reset your password, please go to\n\t" + lclUrl + "\n");
		lclSB.append("That link will expire on " + argExpiration.atZone(ZoneId.systemDefault()).format(lclF) + ".\n\n");
		lclSB.append("If you did not request this, you may ignore this e-mail.  Your password will not be changed.\n\n");
		lclSB.append("If you have any questions, respond to this e-mail or write to " + FROM_ADDRESS + ".\n");
		
		try {
			Mail.createEmail()
				.addTo(argA.getContact().getEmailAddress())
				.setFrom(FROM_ADDRESS, "Scobol Solo Password Reset")
				.setSubject(lclSubject)
				.setMsg(lclSB.toString())
				.send();
		} catch (Exception lclE) {
			ourLogger.error("Could not send password reset token", lclE);
		}
	}
	
	protected void sendNotificationEmail(Account argA, LocalDateTime argExpiration) {
		Validate.notNull(argA);
		Validate.notNull(argA.getUsername());
		Validate.notNull(argA.getContact().getEmailAddress());
		Validate.notNull(argExpiration);
		
		DateTimeFormatter lclF = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy 'at' h:mm a zzzz");
		
		String lclSubject = "Scobol Solo password reset token generated for " + argA.getContact().getName();
		
		StringBuilder lclSB = new StringBuilder(1024);
		
		lclSB.append("A password reset token has been generated for " + argA.getUsername() + " (" + argA.getContact().getName()
				+ ", #" + argA.getId() + ", " + argA.getContact().getEmailAddress() + ").\n\n");
		lclSB.append("The token will expire on " + argExpiration.atZone(ZoneId.systemDefault()).format(lclF) + ".\n");
		
		try {
			Mail.createEmail()
				.addTo(NOTIFICATION_TO_ADDRESS)
				.setFrom(FROM_ADDRESS, "Scobol Solo Password Reset")
				.setSubject(lclSubject)
				.setMsg(lclSB.toString())
				.send();
		} catch (Exception lclE) {
			ourLogger.error("Could not send password token generation notification", lclE);
		}
	}
	
	// This servlet doesn't require a user. (Practically speaking, it requires *not* a user, but we don't actually have a way to represent that.)
	@Override
	protected boolean requireUser() {
		return false;
	}
	
	private static class AccountFindingException extends IllegalArgumentException {
		private static final long serialVersionUID = 1L;
		
		public AccountFindingException(String argMessage) {
			super(argMessage);
		}
	}
}
