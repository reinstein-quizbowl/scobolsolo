package com.scobolsolo.opalforms.filter;

import org.apache.commons.lang3.Validate;

import com.siliconage.util.Filter;

import com.scobolsolo.application.Staff;
import com.scobolsolo.application.Tournament;

public class StaffForTournament extends Filter<Staff> {
	private final Tournament myTournament;
	
	public StaffForTournament(final Tournament argT) {
		super();
		
		myTournament = Validate.notNull(argT);
	}
	
	@Override
	public boolean accept(final Staff argS) {
		return argS != null && argS.getTournament() == getTournament();
	}
	
	public Tournament getTournament() {
		return myTournament;
	}
}
