package com.scobolsolo.opalforms.filter;

import org.apache.commons.lang3.Validate;

import com.siliconage.util.Filter;

import com.scobolsolo.application.School;
import com.scobolsolo.application.SchoolRegistration;
import com.scobolsolo.application.Tournament;

public class SchoolNotAlreadyRegistered extends Filter<School> {
	private final Tournament myTournament;
	
	public SchoolNotAlreadyRegistered(final Tournament argT) {
		super();
		
		myTournament = Validate.notNull(argT);
	}
	
	@Override
	public boolean accept(final School argS) {
		for (final SchoolRegistration lclSR : getTournament().createSchoolRegistrationArray()) {
			if (lclSR.getSchool() == argS) {
				return false;
			}
		}
		
		return true;
	}
	
	protected Tournament getTournament() {
		return myTournament;
	}
}
