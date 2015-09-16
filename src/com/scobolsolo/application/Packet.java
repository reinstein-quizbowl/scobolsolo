package com.scobolsolo.application;

import java.util.List;
import java.util.stream.Collectors;

import com.scobolsolo.persistence.PacketUserFacing;

/**
 * This interface may be changed at will.
 *
 * <p>This interface and the {@link PacketFactory} class are the only two automatically generated files for this type that are intended to be referenced in user code. Other automatically generated files package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */

public interface Packet extends PacketUserFacing, Comparable<Packet> {
	@Override
	default int compareTo(Packet that) {
		if ((this.getRound() == null && that.getRound() == null) || (this.getRound() == that.getRound())) {
			return this.getSequence() - that.getSequence();
		} else if (this.getRound() == null && that.getRound() != null) {
			return 1;
		} else if (this.getRound() != null && that.getRound() == null) {
			return -1;
		} else {
			return this.getRound().compareTo(that.getRound());
		}
	}
	
	default String getNameWithTournament() {
		return getTournament().getName() + ": " + getName();
	}
	
	default String getShortNameWithTournament() {
		return getTournament().getShortName() + ": " + getShortName();
	}
	
	default int getNextSequenceNumber() {
		return 1 + streamPlacement().filter(argPL -> argPL.getSequenceAsObject() != null).mapToInt(Placement::getSequence).max().orElse(0);
	}
	
	default List<Placement> getAllPlacements() {
		return streamPlacement().sorted().collect(Collectors.toList());
	}
	
	default List<Placement> getRegulationPlacements() {
		return streamPlacement().filter(Placement::isRegulation).sorted().collect(Collectors.toList());
	}
	
	default List<Placement> getOvertimePlacements() {
		return streamPlacement().filter(Placement::isTiebreaker).sorted().collect(Collectors.toList());
	}
}
