package com.scobolsolo.application;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.scobolsolo.persistence.PhaseUserFacing;

/**
 * This interface may be changed at will.
 *
 * <p>This interface and the {@link PhaseFactory} class are the only two automatically generated files for this type that are intended to be referenced in user code. Other automatically generated files package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */

public interface Phase extends PhaseUserFacing, Comparable<Phase> {
	@Override
	default public int compareTo(Phase that) {
		return Comparator.comparing(Phase::getTournament).thenComparingInt(Phase::getSequence).compare(this, that);
	}
	
	default List<Round> getRounds() {
		return streamRoundGroup().flatMap(RoundGroup::streamRound).sorted().collect(Collectors.toList());
	}
	
	default List<Card> getCards() {
		return streamCard().sorted().collect(Collectors.toList());
	}
	
	default List<Room> getGameRooms() {
		return streamRoundGroup()
			.flatMap(RoundGroup::streamRound)
			.flatMap(Round::streamMatch)
			.map(Match::getRoom)
			.distinct()
			.sorted()
			.collect(Collectors.toList());
	}
}
