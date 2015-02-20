package com.scobolsolo.opalforms.updater;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.Validate;

import com.opal.cma.OpalFormUpdater;
import com.opal.cma.Validator;

import com.scobolsolo.application.Buzzer;

public class BuzzerUnassigningUpdater extends OpalFormUpdater<Buzzer> {
	public BuzzerUnassigningUpdater(final HttpServletRequest argRequest, final String argPrefix, final String argParameterName) {
		super(argRequest, argPrefix, argParameterName);
	}
	
	public BuzzerUnassigningUpdater(final HttpServletRequest argRequest, final String argPrefix, final String argParameterName, final Validator<Buzzer> argValidator) {
		super(argRequest, argPrefix, argParameterName, argValidator);
	}
	
	public BuzzerUnassigningUpdater(final HttpServletRequest argRequest, final String argPrefix, final Validator<Buzzer> argValidator) {
		super(argRequest, argPrefix, argValidator);
	}
	
	@Override
	protected void delete() {
		Validate.notNull(getUserFacing()).setRoom(null);
	}
}
