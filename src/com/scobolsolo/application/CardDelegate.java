package com.scobolsolo.application;

import org.apache.commons.lang3.Validate;

public abstract class CardDelegate {
	static Tournament getTournament(final Card argC) {
		Validate.notNull(argC);
		
		return argC.getPhase().getTournament();
	}
	
	static Match getNextMatch(final Card argC, final Round argAfterWhen) {
		Validate.notNull(argC);
		Validate.notNull(argAfterWhen);
		
		// for (final Round lclOtherRound : argC.getPhase().getRounds()) { // Tournament.getRounds() returns the Rounds in order; this is important here
			// if (lclOtherRound.isAfter(argAfterWhen)) {
				// for (final Match lclM : lclOtherRound.createMatchArray()) {
					// if (lclM.getWinningCard() == argC || lclM.getLosingCard() == argC) {
						// return lclM;
					// }
				// }
			// }
		// }
		
		return null;
	}
}
