package com.scobolsolo.application;

import com.scobolsolo.persistence.PlayerUserFacing;

/**
 * This interface may be changed at will.
 *
 * <p>This interface and the {@link PlayerFactory} class are the only two automatically generated files for this type that are intended to be referenced in user code. Other automatically generated files package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */

public interface Player extends PlayerUserFacing {
	default Performance findPerformance(Game argG) {
		if (argG == null) {
			return null;
		}
		
		for (Performance lclP : argG.createPerformanceArray()) {
			if (lclP.getPlayer() == this) {
				return lclP;
			}
		}
		
		return null;
	}
	
	default String getNameWithSchool() {
		return getContact().getName() + " (" + getSchoolRegistration().getSchool().getName() + ")";
	}
	
	default String getNameWithSchoolShortName() {
		return getContact().getName() + " (" + getSchoolRegistration().getSchool().getShortName() + ")";
	}
	
	default Tournament getTournament() {
		return getSchoolRegistration().getTournament();
	}
}
