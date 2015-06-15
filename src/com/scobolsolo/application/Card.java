package com.scobolsolo.application;

import org.apache.commons.lang3.Validate;

import com.scobolsolo.persistence.CardUserFacing;

/**
 * This interface may be changed at will.
 *
 * <p>This interface and the {@link CardFactory} class are the only two automatically generated files for this type that are intended to be referenced in user code. Other automatically generated files package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */

public interface Card extends CardUserFacing {
	default Tournament getTournament() {
		return getPhase().getTournament();
	}
	
	default Match getNextMatch(final Round argAfterWhen) {
		Validate.notNull(argAfterWhen);
		
		for (final Round lclOtherRound : getPhase().getRounds()) { // Tournament.getRounds() returns the Rounds in order; this is important here
			if (lclOtherRound.isAfter(argAfterWhen)) {
				for (final Match lclM : lclOtherRound.createMatchArray()) {
					if (lclM.getWinningCard() == this || lclM.getLosingCard() == this) {
						return lclM;
					}
				}
			}
		}
		
		return null;
	}
}
