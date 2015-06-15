package com.scobolsolo.opalforms.updater;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.Validate;

import com.opal.cma.OpalFormUpdater;
import com.opal.cma.Validator;

import com.scobolsolo.application.Tournament;

public class TournamentUpdater extends OpalFormUpdater<Tournament> {
	public TournamentUpdater(final HttpServletRequest argRequest, final String argPrefix, final String argParameterName) {
		super(argRequest, argPrefix, argParameterName);
	}
	
	public TournamentUpdater(final HttpServletRequest argRequest, final String argPrefix, final String argParameterName, final Validator<Tournament> argValidator) {
		super(argRequest, argPrefix, argParameterName, argValidator);
	}
	
	public TournamentUpdater(final HttpServletRequest argRequest, final String argPrefix, final Validator<Tournament> argValidator) {
		super(argRequest, argPrefix, argValidator);
	}
	
	@Override
	protected void processSpecial() {
		final Tournament lclT = Validate.notNull(getUserFacing());
		
		if (lclT.getWebXmlRoleCode() == null) {
			lclT.setWebXmlRoleCode(lclT.getCode());
		}
	}
}
