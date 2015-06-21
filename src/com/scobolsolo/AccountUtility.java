package com.scobolsolo;

import java.math.BigInteger;
import java.security.Principal;
import java.security.SecureRandom;
import java.time.LocalDateTime;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

import com.scobolsolo.application.Account;
import com.scobolsolo.application.AccountFactory;

public final class AccountUtility {
	private static final SecureRandom SECURE_RANDOM = new SecureRandom();
	private static final int PASSWORD_RESET_TOKEN_LENGTH = ScobolSoloConfiguration.getInstance().getInt("PASSWORD_RESET_TOKEN_LENGTH");
	private static final int PASSWORD_RESET_TOKEN_EXPIRATION = ScobolSoloConfiguration.getInstance().getInt("PASSWORD_RESET_TOKEN_EXPIRATION"); // in days
	
	private AccountUtility() {
		throw new UnsupportedOperationException();
	}
	
	public static Account getLoggedInAccount(final HttpServletRequest argRequest) {
		Validate.notNull(argRequest);
		
		final Principal lclPrincipal = argRequest.getUserPrincipal();
		if (lclPrincipal == null) {
			return null;
		}
		
		final String lclUsername = StringUtils.trimToNull(lclPrincipal.getName());
		if (lclUsername == null) {
			return null;
		}
		
		final Account lclA = AccountFactory.getInstance().forUsername(lclUsername);
		
		if (lclA != null && lclA.isActive() && lclA.getContact().isActive()) {
			return lclA;
		} else {
			return null;
		}
	}
	
	public static Account demandLoggedInAccount(final HttpServletRequest argRequest) {
		final Account lclA = getLoggedInAccount(argRequest);
		
		if (lclA == null) {
			throw new IllegalStateException("No user is logged in");
		}
		
		return lclA;
	}
	
	public static String generatePasswordResetToken() {
		String lclToken = "";
		
		int lclTries = 0;
		
		while (lclTries < 100 && lclToken.length() != PASSWORD_RESET_TOKEN_LENGTH) {
			++lclTries;
			lclToken = new BigInteger(320, SECURE_RANDOM).toString(32);
		}
		
		if (lclToken.length() == PASSWORD_RESET_TOKEN_LENGTH) {
			return lclToken;
		} else {
			throw new IllegalStateException("Could not generate a password reset token with length " + PASSWORD_RESET_TOKEN_LENGTH + " over the course of " + lclTries + " tries");
		}
	}
	
	public static LocalDateTime generatePasswordResetTokenExpiration() {
		return LocalDateTime.now().plusDays(PASSWORD_RESET_TOKEN_EXPIRATION);
	}
}
