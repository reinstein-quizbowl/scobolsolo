package com.scobolsolo.opalforms.filter;

import org.apache.commons.lang3.Validate;

import com.siliconage.util.Filter;

import com.scobolsolo.application.Card;
import com.scobolsolo.application.Phase;

public class CardInPhase extends Filter<Card> {
	private final Phase myPhase;
	
	public CardInPhase(final Phase argP) {
		super();
		
		myPhase = Validate.notNull(argP);
	}
	
	@Override
	public boolean accept(final Card argC) {
		return argC != null && argC.getPhase() == getPhase();
	}
	
	public Phase getPhase() {
		return myPhase;
	}
}
