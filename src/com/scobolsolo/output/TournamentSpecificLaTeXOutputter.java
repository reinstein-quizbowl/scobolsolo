package com.scobolsolo.output;

import java.io.File;

import org.apache.commons.lang3.Validate;

import com.scobolsolo.application.Tournament;

public abstract class TournamentSpecificLaTeXOutputter extends LaTeXOutputter {
	private final Tournament myTournament;
	
	public TournamentSpecificLaTeXOutputter(final File argOutputFile, final Tournament argT) {
		super(argOutputFile);
		
		Validate.notNull(argT);
		myTournament = argT;
	}
	
	public Tournament getTournament() {
		return myTournament;
	}
}
