package com.scobolsolo.application;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

import org.apache.commons.lang3.Validate;

import com.opal.ImplicitTableDatabaseQuery;

import com.scobolsolo.matches.MatchStatus;
import com.scobolsolo.persistence.MatchUserFacing;


/**
 * This interface may be changed at will.
 *
 * <p>This interface and the {@link MatchFactory} class are the only two automatically generated files for this type that are intended to be referenced in user code. Other automatically generated files package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */

public interface Match extends MatchUserFacing, Comparable<Match> {
	static final org.apache.log4j.Logger ourLogger = org.apache.log4j.Logger.getLogger(Match.class);
	
	public static final Comparator<Match> ENTERING_PRIORITY_COMPARATOR = Comparator.comparing(Match::determineStatus).thenComparing(Match::getRound);
	
	@Override
	default public int compareTo(final Match that) {
		return this.getRound().compareTo(that.getRound());
	}
	
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
					for (Performance lclP : lclG.getPerformanceSet()) {
						lclResponsesRecorded += lclP.getResponseSet().size();
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
	
	default Staff determineLikelyModerator() {
		List<StaffAssignment> lclModerators = getRoom().streamStaffAssignment()
			.filter(argSA -> argSA.getPhase() == this.getPhase())
			.filter(argSA -> argSA.getRole() == StaffRoleFactory.MODERATOR())
			.collect(Collectors.toList());
		if (lclModerators.size() == 1) {
			return lclModerators.get(0).getStaff();
		} else {
			return null;
		}
	}
	
	default Staff determineLikelyScorekeeper() {
		List<StaffAssignment> lclScorekeepers = getRoom().streamStaffAssignment()
			.filter(argSA -> argSA.getPhase() == this.getPhase())
			.filter(argSA -> argSA.getRole() == StaffRoleFactory.SCOREKEEPER())
			.collect(Collectors.toList());
		if (lclScorekeepers.size() == 1) {
			return lclScorekeepers.get(0).getStaff();
		} else {
			return determineLikelyModerator(); // ???
		}
	}
	
	default Phase getPhase() {
		return getRound().getPhase();
	}
	
	default boolean isCardSystem() {
		return getRound().isCardSystem();
	}
	
	default Tournament getTournament() {
		return getPhase().getTournament();
	}
	
	default boolean isDual() {
		if (getRound().getPhase().isCardSystem()) {
			return true;
		} else {
			return getGame() != null && getGame().getPerformanceSet().size() == 2;
		}
	}
	
	default boolean isFirstForCards() {
		if (isCardSystem()) {
			boolean lclFirstForWinning = this == getWinningCard().getFirstMatch();
			boolean lclFirstForLosing = this == getLosingCard().getFirstMatch();
			
			if (lclFirstForWinning == true && lclFirstForLosing == true) {
				return true;
			} else {
				if (lclFirstForWinning == true && lclFirstForLosing == false) {
					ourLogger.warn(this + " is the first match for its winning card, " + getWinningCard() + ", but not for its losing card, " + getLosingCard());
				} else if (lclFirstForWinning == false && lclFirstForLosing == true) {
					ourLogger.warn(this + " is not the first match for its winning card, " + getWinningCard() + ", but is the first match for its losing card, " + getLosingCard());
				}
				
				return false;
			}
		} else {
			return false;
		}
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
	
	public static Match forRoundRoom(Round argRound, Room argRoom) {
		Validate.notNull(argRound);
		Validate.notNull(argRoom);
		
		List<Match> lclCandidates = MatchFactory.getInstance().acquireForQuery(
			new ArrayList<>(1),
			new ImplicitTableDatabaseQuery("round_id = ? AND room_id = ?", argRound.getIdAsObject(), argRoom.getIdAsObject())
		);
		
		if (lclCandidates.isEmpty()) {
			return null;
		} else if (lclCandidates.size() == 1) {
			return lclCandidates.iterator().next();
		} else {
			throw new IllegalStateException("Multiple matches for " + argRoom.getName() + " in " + argRound.getName());
		}
	}
}
