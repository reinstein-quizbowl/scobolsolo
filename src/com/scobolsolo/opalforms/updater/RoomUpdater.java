package com.scobolsolo.opalforms.updater;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.Validate;

import com.opal.cma.OpalFormUpdater;
import com.opal.cma.Validator;

import com.scobolsolo.application.Buzzer;
import com.scobolsolo.application.Room;

public class RoomUpdater extends OpalFormUpdater<Room> {
	public RoomUpdater(final HttpServletRequest argRequest, final String argPrefix, final String argParameterName) {
		super(argRequest, argPrefix, argParameterName);
	}
	
	public RoomUpdater(final HttpServletRequest argRequest, final String argPrefix, final String argParameterName, final Validator<Room> argValidator) {
		super(argRequest, argPrefix, argParameterName, argValidator);
	}
	
	public RoomUpdater(final HttpServletRequest argRequest, final String argPrefix, final Validator<Room> argValidator) {
		super(argRequest, argPrefix, argValidator);
	}
	
	@Override
	protected void beforeDelete() {
		final Room lclR = Validate.notNull(getUserFacing());
		
		if (lclR.getMatchSet().isEmpty()) {
			lclR.getBuzzerSet().clear();
		} else {
			addError("Cannot delete " + lclR.getName() + " because it has matches assigned to it.");
		}
		
	}
}
