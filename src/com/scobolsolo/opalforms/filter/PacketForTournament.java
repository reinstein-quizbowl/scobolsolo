package com.scobolsolo.opalforms.filter;

import org.apache.commons.lang3.Validate;

import com.siliconage.util.Filter;

import com.scobolsolo.application.Packet;
import com.scobolsolo.application.Tournament;

public class PacketForTournament extends Filter<Packet> {
	private final Tournament myTournament;
	
	public PacketForTournament(final Tournament argT) {
		super();
		
		myTournament = Validate.notNull(argT);
	}
	
	@Override
	public boolean accept(final Packet argP) {
		return argP != null && argP.getTournament() == getTournament();
	}
	
	public Tournament getTournament() {
		return myTournament;
	}
}
