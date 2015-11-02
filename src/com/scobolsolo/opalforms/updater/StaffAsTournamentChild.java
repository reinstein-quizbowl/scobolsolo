package com.scobolsolo.opalforms.updater;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.Validate;

import com.opal.cma.OpalFormUpdater;
import com.opal.cma.Validator;

import com.scobolsolo.application.Staff;
import com.scobolsolo.application.StaffAssignment;

public class StaffAsTournamentChild extends OpalFormUpdater<Staff> {
	public StaffAsTournamentChild(final HttpServletRequest argRequest, final String argPrefix, final String argParameterName) {
		super(argRequest, argPrefix, argParameterName);
	}
	
	public StaffAsTournamentChild(final HttpServletRequest argRequest, final String argPrefix, final String argParameterName, final Validator<Staff> argValidator) {
		super(argRequest, argPrefix, argParameterName, argValidator);
	}
	
	public StaffAsTournamentChild(final HttpServletRequest argRequest, final String argPrefix, final Validator<Staff> argValidator) {
		super(argRequest, argPrefix, argValidator);
	}
	
	@Override
	protected void beforeDelete() {
		final Staff lclS = Validate.notNull(getUserFacing());
		
		for (final StaffAssignment lclSA : lclS.createStaffAssignmentArray()) {
			lclSA.unlink();
		}
	}
}
