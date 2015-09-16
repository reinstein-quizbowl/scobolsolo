package com.scobolsolo.application;

import java.util.Comparator;

import org.apache.commons.lang3.Validate;

import com.scobolsolo.persistence.MatchUserFacing;

import com.scobolsolo.matches.MatchStatus;


/**
 * This interface may be changed at will.
 *
 * <p>This interface and the {@link MatchFactory} class are the only two automatically generated files for this type that are intended to be referenced in user code. Other automatically generated files package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */

public interface Match extends MatchUserFacing, Comparable<Match> {
	@Override
	default public int compareTo(final Match that) {
		return this.getRound().compareTo(that.getRound());
	}
	
	public static final Comparator<Match> ENTERING_PRIORITY_COMPARATOR = Comparator.comparing(Match::determineStatus).thenComparing(Match::getRound);
	
	default MatchStatus determineStatus() {
		final Game lclG = getGame();
		if (lclG == null) {
			return MatchStatus.NO_DATA;
		} else {
			int lclIncomingCardsKnown = 0;
			if (lclG.getIncomingWinningCardPlayer() != null) {
				++lclIncomingCardsKnown;
			}
			if (lclG.getIncomingLosingCardPlayer() != null) {
				++lclIncomingCardsKnown;
			}
			
			if (lclIncomingCardsKnown == 0) {
				return MatchStatus.NO_DATA;
			} else if (lclIncomingCardsKnown == 1) {
				return MatchStatus.ONE_PLAYER_KNOWN;
			} else {
				if (lclG.getOutgoingWinningCardPlayer() != null && lclG.getOutgoingLosingCardPlayer() != null) {
					return MatchStatus.COMPLETE;
				} else {
					int lclResponsesRecorded = 0;
					for (Performance lclP : lclG.createPerformanceArray()) {
						lclResponsesRecorded += lclP.getResponseCount();
					}
					
					if (lclResponsesRecorded == 0) {
						return MatchStatus.READY;
					} else {
						return MatchStatus.IN_PROGRESS;
					}
				}
			}
		}
	}
	
	default boolean isDual() {
		if (getRound().getRoundGroup().getPhase().isCardSystem()) {
			return true;
		} else {
			return getGame() != null && getGame().getPerformanceCount() == 2;
		}
	}
	
	default Staff determineLikelyModerator() {
		if (getRoom().getStaffAssignmentCount() == 1) {
			return getRoom().createStaffAssignmentIterator().next().getStaff();
		} else {
			return null;
		}
	}
	
	default boolean mayBeEnteredBy(final Account argA) {
		Validate.notNull(argA);
		
		if (argA.isAdministrator()) {
			return true;
		}
		
		Game lclG = getGame();
		if (lclG == null) {
			return argA.getContact() == determineLikelyModerator().getContact();
		} else if (argA.getContact() == lclG.getModeratorStaff().getContact()) {
			return true;
		} else {
			return false;
		}
	}
	
	default RoundGroup getRoundGroup() {
		return getRound().getRoundGroup();
	}
	
	default Phase getPhase() {
		return getRoundGroup().getPhase();
	}
	
	default Tournament getTournament() {
		return getPhase().getTournament();
	}
	
	default boolean requiresIdentificationOfWinningAndLosingCardPlayers() {
		return getGame() == null || (getGame().getIncomingWinningCardPlayer() == null && getGame().getIncomingLosingCardPlayer() == null);
	}
	
	// Only looks within the current phase
	default Match getNextForWinner() {
		return getWinningCard().getNextMatch(getRound());
	}
	
	// Only looks within the current phase
	default Match getNextForLoser() {
		return getLosingCard().getNextMatch(getRound());
	}
}
