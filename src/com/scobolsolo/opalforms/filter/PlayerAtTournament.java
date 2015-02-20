package com.scobolsolo.opalforms.filter;

import org.apache.commons.lang3.Validate;

import com.siliconage.util.Filter;

import com.scobolsolo.application.Player;
import com.scobolsolo.application.Tournament;

public class PlayerAtTournament extends Filter<Player> {
	private final Tournament myTournament;
	
	public PlayerAtTournament(final Tournament argT) {
		super();
		
		myTournament = Validate.notNull(argT);
	}
	
	@Override
	public boolean accept(final Player argP) {
		return argP != null && argP.getSchoolRegistration().getTournament() == getTournament();
	}
	
	public Tournament getTournament() {
		return myTournament;
	}
}
