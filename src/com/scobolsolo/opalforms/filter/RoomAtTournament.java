package com.scobolsolo.opalforms.filter;

import org.apache.commons.lang3.Validate;

import com.siliconage.util.Filter;

import com.scobolsolo.application.Room;
import com.scobolsolo.application.Tournament;

public class RoomAtTournament extends Filter<Room> {
	private final Tournament myTournament;
	
	public RoomAtTournament(final Tournament argT) {
		super();
		
		myTournament = Validate.notNull(argT);
	}
	
	@Override
	public boolean accept(final Room argR) {
		return argR != null && argR.getTournament() == getTournament();
	}
	
	public Tournament getTournament() {
		return myTournament;
	}
}
