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
		List<StaffAssignment> lclModerators = getRoom().streamStaffAssignment()
			.filter(argSA -> argSA.getRole() == StaffRoleFactory.MODERATOR())
			.collect(Collectors.toList());
		if (lclModerators.size() == 1) {
			return lclModerators.iterator().next().getStaff();
		} else {
			return null;
		}
	}
	
	default Staff determineLikelyScorekeeper() {
		List<StaffAssignment> lclScorekeepers = getRoom().streamStaffAssignment()
			.filter(argSA -> argSA.getRole() == StaffRoleFactory.SCOREKEEPER())
			.collect(Collectors.toList());
		if (lclScorekeepers.size() == 1) {
			return lclScorekeepers.iterator().next().getStaff();
		} else {
			return null;
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
