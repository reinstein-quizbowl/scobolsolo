package com.scobolsolo.opalforms.updater;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

import com.opal.cma.OpalFormUpdater;
import com.opal.cma.Validator;

import com.scobolsolo.application.Placement;

public class PlacementUpdater extends OpalFormUpdater<Placement> {
	public PlacementUpdater(final HttpServletRequest argRequest, final String argPrefix, final String argParameterName) {
		super(argRequest, argPrefix, argParameterName);
	}
	
	public PlacementUpdater(final HttpServletRequest argRequest, final String argPrefix, final String argParameterName, final Validator<Placement> argValidator) {
		super(argRequest, argPrefix, argParameterName, argValidator);
	}
	
	public PlacementUpdater(final HttpServletRequest argRequest, final String argPrefix, final Validator<Placement> argValidator) {
		super(argRequest, argPrefix, argValidator);
	}
	
	@Override
	protected void processSpecial() {
		Placement lclPL = Validate.notNull(getUserFacing());
		
		if (lclPL.getSequenceAsObject() == null) {
			lclPL.setSequence(lclPL.getPacket().getNextSequenceNumber());
		}
		
		if (lclPL.getQuestion() != null) {
			lclPL.setCategory(lclPL.getQuestion().getCategory());
		}
	}
}
