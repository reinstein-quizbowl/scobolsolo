package com.scobolsolo.opalforms.filter;

import org.apache.commons.lang3.Validate;

import com.siliconage.util.Filter;

import com.scobolsolo.application.Round;
import com.scobolsolo.application.Tournament;

public class RoundAtTournament extends Filter<Round> {
	private final Tournament myTournament;
	
	public RoundAtTournament(final Tournament argT) {
		super();
		
		myTournament = Validate.notNull(argT);
	}
	
	@Override
	public boolean accept(final Round argR) {
		return argR != null && argR.getRoundGroup().getPhase().getTournament() == getTournament();
	}
	
	public Tournament getTournament() {
		return myTournament;
	}
}
