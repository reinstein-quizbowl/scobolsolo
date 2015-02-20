package com.scobolsolo.opalforms.filter;

import org.apache.commons.lang3.Validate;

import com.siliconage.util.Filter;

import com.scobolsolo.application.Match;
import com.scobolsolo.application.Phase;

public class MatchInPhase extends Filter<Match> {
	private final Phase myPhase;
	
	public MatchInPhase(final Phase argP) {
		super();
		
		myPhase = Validate.notNull(argP);
	}
	
	@Override
	public boolean accept(final Match argM) {
		return argM != null && argM.getRound().getRoundGroup().getPhase() == getPhase();
	}
	
	public Phase getPhase() {
		return myPhase;
	}
}
