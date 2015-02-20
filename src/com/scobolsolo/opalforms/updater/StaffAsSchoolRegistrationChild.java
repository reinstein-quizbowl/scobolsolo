package com.scobolsolo.opalforms.updater;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.Validate;

import com.opal.cma.OpalFormUpdater;
import com.opal.cma.Validator;

import com.scobolsolo.application.Staff;

public class StaffAsSchoolRegistrationChild extends OpalFormUpdater<Staff> {
	public StaffAsSchoolRegistrationChild(final HttpServletRequest argRequest, final String argPrefix, final String argParameterName) {
		super(argRequest, argPrefix, argParameterName);
	}
	
	public StaffAsSchoolRegistrationChild(final HttpServletRequest argRequest, final String argPrefix, final String argParameterName, final Validator<Staff> argValidator) {
		super(argRequest, argPrefix, argParameterName, argValidator);
	}
	
	public StaffAsSchoolRegistrationChild(final HttpServletRequest argRequest, final String argPrefix, final Validator<Staff> argValidator) {
		super(argRequest, argPrefix, argValidator);
	}
	
	@Override
	protected void afterUpdate() {
		final Staff lclS = Validate.notNull(getUserFacing());
		if (lclS.isNew()) {
			Validate.notNull(lclS.getSchoolRegistration());
			lclS.setTournament(lclS.getSchoolRegistration().getTournament());
		}
	}
}
