package com.scobolsolo;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

import com.scobolsolo.application.Account;
import com.scobolsolo.application.AccountFactory;

public final class AccountUtility {
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
}
