package com.scobolsolo.output;

import java.io.File;

import org.apache.commons.lang3.Validate;

import com.scobolsolo.application.Phase;

public abstract class PhaseSpecificLaTeXOutputter extends TournamentSpecificLaTeXOutputter {
	private final Phase myPhase;
	
	public PhaseSpecificLaTeXOutputter(final File argOutputFile, final Phase argP) {
		super(argOutputFile, Validate.notNull(argP).getTournament());
		
		myPhase = argP;
	}
	
	public Phase getPhase() {
		return myPhase;
	}
}
