package com.scobolsolo.application;

import org.apache.commons.lang3.Validate;

import com.scobolsolo.persistence.RoomUserFacing;

/**
 * This interface may be changed at will.
 *
 * <p>This interface and the {@link RoomFactory} class are the only two automatically generated files for this type that are intended to be referenced in user code. Other automatically generated files package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */

public interface Room extends RoomUserFacing {
	default int countMatchesIn(Phase argP) {
		Validate.notNull(argP);
		
		return (int) streamMatch().filter(argM -> argM.getRound().getRoundGroup().getPhase() == argP).count();
	}
	
	default boolean hasAnyAssignedStaffWithComputer(Phase argP) {
		Validate.notNull(argP);
		
		return streamStaffAssignment()
			.map(StaffAssignment::getStaff)
			.anyMatch(Staff::hasComputer);
	}
}
