package com.scobolsolo.application;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

import com.scobolsolo.persistence.PacketUserFacing;
import com.scobolsolo.servlets.tournament.OrderPackets;

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
	
	default String getNameWithRound() {
		if (getRound() == null) {
			return getName();
		} else {
			return getName() + " (" + getRound().getName() + ")";
		}
	}
	
	default int getNextNumber() {
		return 1 + streamPlacement().filter(argPL -> argPL.getNumberAsObject() != null).mapToInt(Placement::getNumber).max().orElse(0);
	}
	
	default List<Placement> getAllPlacements() {
		return streamPlacement().sorted().collect(Collectors.toList());
	}
	
	default List<Placement> getRegulationPlacements() {
		return streamPlacement().filter(Placement::isRegulation).sorted().collect(Collectors.toList());
	}
	
	default List<Placement> getOvertimePlacements() {
		return streamPlacement().filter(Placement::isOvertime).sorted().collect(Collectors.toList());
	}
	
	default List<String> determineIncompletionWarnings() {
		List<String> lclWarnings = new ArrayList<>(3);
		
		int lclEmpty = (int) streamPlacement().filter(Placement::isEmpty).count();
		if (lclEmpty == 1) {
			lclWarnings.add("There is one empty placement.");
		} else if (lclEmpty > 1) {
			lclWarnings.add("There are " + lclEmpty + " empty placements.");
		}
		
		int lclUnapproved = (int) streamPlacement()
			.filter(Placement::isFilled)
			.map(Placement::getQuestion)
			.filter(argQ -> argQ.getStatus() != QuestionStatusFactory.APPROVED())
			.count();
		if (lclUnapproved == 1) {
			lclWarnings.add("There is one unapproved question.");
		} else if (lclUnapproved > 1) {
			lclWarnings.add("There are " + lclUnapproved + " unapproved questions.");
		}
		
		if (!OrderPackets.isOrdered(this)) {
			lclWarnings.add("The current ordering is invalid.");
		}
		
		return lclWarnings;
	}
}
