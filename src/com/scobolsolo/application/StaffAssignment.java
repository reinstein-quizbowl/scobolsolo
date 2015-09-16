package com.scobolsolo.application;

import java.util.Comparator;

import com.scobolsolo.persistence.StaffAssignmentUserFacing;

/**
 * This interface may be changed at will.
 *
 * <p>This interface and the {@link StaffAssignmentFactory} class are the only two automatically generated files for this type that are intended to be referenced in user code. Other automatically generated files package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */

public interface StaffAssignment extends StaffAssignmentUserFacing {
	public static final Comparator<StaffAssignment> STAFF_NAME_COMPARATOR = Comparator.comparing(StaffAssignment::getPhase).thenComparing(argSA -> argSA.getStaff().getContact().getName());
	public static final Comparator<StaffAssignment> ROOM_COMPARATOR = Comparator.comparing(StaffAssignment::getPhase).thenComparing(StaffAssignment::getRoom);
}
