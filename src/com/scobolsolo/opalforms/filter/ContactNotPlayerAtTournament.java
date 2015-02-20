package com.scobolsolo.opalforms.filter;

import org.apache.commons.lang3.Validate;

import com.siliconage.util.Filter;

import com.scobolsolo.application.Contact;
import com.scobolsolo.application.Player;
import com.scobolsolo.application.Tournament;

public class ContactNotPlayerAtTournament extends Filter<Contact> {
	private final Tournament myTournament;
	
	public ContactNotPlayerAtTournament(final Tournament argT) {
		super();
		
		myTournament = Validate.notNull(argT);
	}
	
	@Override
	public boolean accept(final Contact argC) {
		if (argC == null) {
			return false;
		}
		
		for (final Player lclP : argC.createPlayerArray()) {
			if (lclP.getSchoolRegistration().getTournament() == getTournament()) {
				return false;
			}
		}
		
		return true;
	}
	
	public Tournament getTournament() {
		return myTournament;
	}
}
