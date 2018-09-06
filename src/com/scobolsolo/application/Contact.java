package com.scobolsolo.application;

import org.apache.commons.lang3.Validate;

import com.scobolsolo.persistence.ContactUserFacing;

/**
 * This interface may be changed at will.
 *
 * <p>This interface and the {@link ContactFactory} class are the only two automatically generated files for this type that are intended to be referenced in user code. Other automatically generated files package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */

public interface Contact extends ContactUserFacing {
	default boolean isPlayerAt(final Tournament argT) {
		return streamPlayer().anyMatch(argP -> argP.getTournament() == argT);
	}
	
	default boolean isStaffAt(final Tournament argT) {
		return streamStaff().anyMatch(argS -> argS.getTournament() == argT);
	}
	
	default boolean isOccupiedAt(final Tournament argT) {
		return isPlayerAt(argT) || isStaffAt(argT);
	}
	
	default Staff findStaff(final Tournament argT) {
		Validate.notNull(argT);
		
		return streamStaff().filter(argS -> argS.getTournament() == argT).findAny().orElse(null);
	}
}
