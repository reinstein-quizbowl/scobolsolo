package com.scobolsolo.application;

import java.math.BigInteger;
import java.security.Principal;
import java.security.SecureRandom;
import java.time.LocalDateTime;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

import com.scobolsolo.persistence.AccountUserFacing;
import com.scobolsolo.security.BCrypt;
import com.scobolsolo.ScobolSoloConfiguration;

/**
 * This interface may be changed at will.
 *
 * <p>This interface and the {@link AccountFactory} class are the only two automatically generated files for this type that are intended to be referenced in user code. Other automatically generated files package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */

public interface Account extends AccountUserFacing {
	static final SecureRandom SECURE_RANDOM = new SecureRandom();
	static final int PASSWORD_RESET_TOKEN_LENGTH = ScobolSoloConfiguration.getInstance().getInt("PASSWORD_RESET_TOKEN_LENGTH");
	static final int PASSWORD_RESET_TOKEN_EXPIRATION = ScobolSoloConfiguration.getInstance().getInt("PASSWORD_RESET_TOKEN_EXPIRATION"); // in days
	
	default boolean mayActAsTournamentDirector(final Tournament argT) {
		Validate.notNull(argT);
		
		if (isAdministrator()) {
			return true;
		} else {
			final Staff lclS = findStaff(argT);
			if (lclS == null) {
				return false;
			} else {
				return lclS.streamStaffAssignment().anyMatch(argSA -> argSA.getRole() == StaffRoleFactory.TOURNAMENT_DIRECTOR());
			}
		}
	}
	
	default boolean mayManageCardSystem(final Tournament argT) {
		return mayActAsTournamentDirector(argT);
	}
	
	default boolean mayManageQuestions(final Tournament argT) {
		return isAdministrator();
	}
	
	default boolean mayEnter(final Match argM) {
		Validate.notNull(argM);
		
		Tournament lclT = argM.getTournament();
		
		if (mayActAsTournamentDirector(lclT)) {
			return true;
		} else {
			final Staff lclS = findStaff(lclT);
			if (lclS == null) {
				return false;
			} else {
				return lclS.streamStaffAssignment().anyMatch(argSA -> argSA.getRole().isMayEnterAnyMatch() || (argSA.getRole().isMayEnterMatchesInAssignedRoom() && argSA.getPhase() == argM.getPhase() && argSA.getRoom() == argM.getRoom()));
			}
		}
	}
	
	// TODO: How is this used? Make it more specific.
	// default boolean mayUpdate(final Tournament argT) {
		// if (argT == null) {
			// return false;
		// }
		
		// if (isAdministrator()) {
			// return true;
		// }
		
		// return getContact().findStaff(argT) != null;
	// }
	
	default Staff findStaff(final Tournament argT) {
		return getContact().findStaff(argT);
	}
	
	default String getName() {
		return getContact().getName();
	}
	
	default Account setPassword(final String argPassword) {
		Validate.notNull(argPassword);
		
		String lclSalt = BCrypt.gensalt();
		String lclPasswordHash = BCrypt.hashpw(argPassword,  lclSalt);
		setPasswordHash(lclPasswordHash);
		
		return this;
	}
	
	public static Account determineCurrent(final HttpServletRequest argRequest) {
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
	
	public static Account demand(final HttpServletRequest argRequest) {
		final Account lclA = determineCurrent(argRequest);
		
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
