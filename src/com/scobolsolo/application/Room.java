package com.scobolsolo.application;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.Validate;

import com.siliconage.util.NullSafeComparator;

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
	
	default List<Match> findMatches(Round argR) {
		return streamMatch().filter(argM -> argM.getRound() == argR).collect(Collectors.toList());
	}
	
	public static class PrimaryStaffNameComparator extends NullSafeComparator<Room> {
		private final Phase myPhase;
		
		public PrimaryStaffNameComparator(Phase argP) {
			super();
			
			myPhase = Validate.notNull(argP);
		}
		
		@Override
		public int compareInternal(Room argA, Room argB) {
			Validate.notNull(argA);
			Validate.notNull(argB);
			
			StaffAssignment lclATop = argA.streamStaffAssignment()
				.filter(argSA -> argSA.getPhase() == getPhase())
				.sorted(Comparator.<StaffAssignment>comparingInt(argSA -> argSA.getRole().getSequence()).thenComparing(argSA -> argSA.getStaff().getContact().getSortBy()))
				.findFirst().orElse(null);
			StaffAssignment lclBTop = argB.streamStaffAssignment()
				.filter(argSA -> argSA.getPhase() == getPhase())
				.sorted(Comparator.<StaffAssignment>comparingInt(argSA -> argSA.getRole().getSequence()).thenComparing(argSA -> argSA.getStaff().getContact().getSortBy()))
				.findFirst().orElse(null);
			
			if (lclATop == null) {
				if (lclBTop == null) {
					return 0;
				} else {
					return 1;
				}
			} else {
				if (lclBTop == null) {
					return -1;
				} else {
					return lclATop.getStaff().getContact().getSortBy().compareTo(lclBTop.getStaff().getContact().getSortBy());
				}
			}
		}
		
		public Phase getPhase() {
			return myPhase;
		}
	}
}
