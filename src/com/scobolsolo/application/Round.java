package com.scobolsolo.application;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.scobolsolo.persistence.RoundUserFacing;

/**
 * This interface may be changed at will.
 *
 * <p>This interface and the {@link RoundFactory} class are the only two automatically generated files for this type that are intended to be referenced in user code. Other automatically generated files package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */

public interface Round extends RoundUserFacing, Comparable<Round> {
	static final Comparator<Round> NATURAL_COMPARATOR = Comparator.comparing(Round::getPhase).thenComparingInt(Round::getSequence);
	
	@Override
	default int compareTo(Round that) {
		return NATURAL_COMPARATOR.compare(this, that);
	}
	
	default String getNameWithStartTime() {
		if (getStartTime() == null) {
			return getName();
		} else {
			return getName() + " (" + getStartTime() + ")";
		}
	}
	
	default String getShortNameWithStartTime() {
		if (getStartTime() == null) {
			return getShortName();
		} else {
			return getShortName() + " (" + getStartTime() + ")";
		}
	}
	
	default boolean isBefore(final Round that) {
		return this.compareTo(that) < 0;
	}
	
	default boolean isAfter(final Round that) {
		return this.compareTo(that) > 0;
	}
	
	default boolean isCardSystem() {
		return getPhase().isCardSystem();
	}
	
	default Tournament getTournament() {
		return getPhase().getTournament();
	}
	
	default List<Match> findMatches(Room argR) {
		return streamMatch().filter(argM -> argM.getRoom() == argR).collect(Collectors.toList());
	}
}
