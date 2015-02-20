package com.scobolsolo.opalforms.filter;

import org.apache.commons.lang3.Validate;

import com.siliconage.util.Filter;

import com.scobolsolo.application.SchoolRegistration;
import com.scobolsolo.application.Tournament;

public class SchoolRegistrationRegisteredFor extends Filter<SchoolRegistration> {
	private final Tournament myTournament;
	
	public SchoolRegistrationRegisteredFor(final Tournament argT) {
		super();
		
		myTournament = Validate.notNull(argT);
	}
	
	@Override
	public boolean accept(final SchoolRegistration argSR) {
		for (final SchoolRegistration lclSR : getTournament().createSchoolRegistrationArray()) {
			if (lclSR == argSR) {
				return true;
			}
		}
		
		return false;
	}
	
	protected Tournament getTournament() {
		return myTournament;
	}
}
