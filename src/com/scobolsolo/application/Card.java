package com.scobolsolo.application;

import java.util.Comparator;

import com.siliconage.util.NullSafeComparator;

import org.apache.commons.lang3.Validate;

import com.scobolsolo.persistence.CardUserFacing;

/**
 * This interface may be changed at will.
 *
 * <p>This interface and the {@link CardFactory} class are the only two automatically generated files for this type that are intended to be referenced in user code. Other automatically generated files package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */

public interface Card extends CardUserFacing, Comparable<Card> {
	static final Comparator<Card> NATURAL_COMPARATOR = Comparator.comparing(Card::getPhase).thenComparingInt(Card::getSequence);
	
	@Override
	default int compareTo(final Card that) {
		return NATURAL_COMPARATOR.compare(this, that);
	}
	
	default Tournament getTournament() {
		return getPhase().getTournament();
	}
	
	// Only looks within the current phase
	default Match getNextMatch(final Round argAfterWhen) {
		Validate.notNull(argAfterWhen);
		
		return getPhase().getRounds() // returns the Roudns in order; this is important here
			.stream()
			.filter(argOtherRound -> argOtherRound.isAfter(argAfterWhen))
			.flatMap(Round::streamMatch)
			.filter(argM -> argM.getWinningCard() == this || argM.getLosingCard() == this)
			.findAny().orElse(null);
	}
	
	default boolean isAssigned() {
		return getInitialPlayer() != null;
	}
	
	public static final class InitialPlayerSchoolNameComparator extends NullSafeComparator<Card> {
		private static final InitialPlayerSchoolNameComparator ourInstance = new InitialPlayerSchoolNameComparator();
		
		public static InitialPlayerSchoolNameComparator getInstance() {
			return ourInstance;
		}
		
		private InitialPlayerSchoolNameComparator() {
			super();
		}
		
		@Override
		protected int compareInternal(final Card argA, final Card argB) {
			if (argA.getInitialPlayer() == null && argB.getInitialPlayer() == null) {
				return argA.getSequence() - argB.getSequence();
			} else if (argA.getInitialPlayer() == null) {
				return -1;
			} else if (argB.getInitialPlayer() == null) {
				return 1;
			} else {
				final int lclSchoolComparison = Player.SchoolNameComparator.getInstance().compare(argA.getInitialPlayer(), argB.getInitialPlayer());
				
				if (lclSchoolComparison != 0) {
					return lclSchoolComparison;
				} else {
					return Player.NameComparator.getInstance().compare(argA.getInitialPlayer(), argB.getInitialPlayer());
				}
			}
		}
	}
}
