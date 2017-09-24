package com.scobolsolo.application;

import com.scobolsolo.persistence.SchoolRegistrationUserFacing;

/**
 * This interface may be changed at will.
 *
 * <p>This interface and the {@link SchoolRegistrationFactory} class are the only two automatically generated files for this type that are intended to be referenced in user code. Other automatically generated files package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */

public interface SchoolRegistration extends SchoolRegistrationUserFacing {
	default int getFullPlayerCount() {
		return getPlayerSet().size() + getSpotsReserved();
	}
}
