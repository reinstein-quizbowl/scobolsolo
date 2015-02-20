package com.scobolsolo.application;

import org.apache.commons.lang3.Validate;

import com.scobolsolo.matches.MatchStatus;

public abstract class MatchDelegate {
	static MatchStatus determineStatus(final Match argM) {
		Validate.notNull(argM);
		
		final Game lclG = argM.getGame();
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
	
	static boolean isDual(final Match argM) {
		Validate.notNull(argM);
		
		if (argM.getRound().getRoundGroup().getPhase().isCardSystem()) {
			return true;
		} else {
			return argM.getGame() != null && argM.getGame().getPerformanceCount() == 2;
		}
	}
	
	static Staff determineLikelyModerator(final Match argM) {
		if (argM == null) {
			return null;
		}
		
		if (argM.getRoom().getStaffAssignmentCount() == 1) {
			return argM.getRoom().createStaffAssignmentIterator().next().getStaff();
		} else {
			return null;
		}
	}
}
