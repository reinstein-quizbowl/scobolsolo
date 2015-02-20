package com.scobolsolo.opalforms.updater;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.Validate;

import com.opal.cma.OpalFormUpdater;
import com.opal.cma.Validator;

import com.scobolsolo.application.Buzzer;
import com.scobolsolo.application.Player;
import com.scobolsolo.application.SchoolRegistration;
import com.scobolsolo.application.Staff;
import com.scobolsolo.application.StandbyEntry;
import com.scobolsolo.application.WaitlistEntry;

public class SchoolRegistrationUpdater extends OpalFormUpdater<SchoolRegistration> {
	public SchoolRegistrationUpdater(final HttpServletRequest argRequest, final String argPrefix, final String argParameterName) {
		super(argRequest, argPrefix, argParameterName);
	}
	
	public SchoolRegistrationUpdater(final HttpServletRequest argRequest, final String argPrefix, final String argParameterName, final Validator<SchoolRegistration> argValidator) {
		super(argRequest, argPrefix, argParameterName, argValidator);
	}
	
	public SchoolRegistrationUpdater(final HttpServletRequest argRequest, final String argPrefix, final Validator<SchoolRegistration> argValidator) {
		super(argRequest, argPrefix, argValidator);
	}
	
	@Override
	protected void processSpecial() {
		final SchoolRegistration lclSR = Validate.notNull(getUserFacing());
		
		if (lclSR.getSpotsReserved() < 0) {
			addError("SpotsReserved", "The number of spots reserved must be non-negative.");
		}
	}
	
	@Override
	protected void beforeDelete() {
		final SchoolRegistration lclSR = Validate.notNull(getUserFacing());
		
		lclSR.streamPlayer().forEach(Player::unlink);
		lclSR.streamStandbyEntry().forEach(StandbyEntry::unlink);
		lclSR.streamWaitlistEntry().forEach(WaitlistEntry::unlink);
		lclSR.streamStaff().forEach(Staff::unlink);
		lclSR.streamBuzzer().forEach(Buzzer::unlink);
	}
}
