package com.scobolsolo.opalforms.updater;

import java.util.List;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.Validate;

import com.opal.cma.OpalFormUpdater;
import com.opal.cma.Validator;

import com.scobolsolo.application.WaitlistEntry;

public class WaitlistEntryDefaultToEndOfList extends OpalFormUpdater<WaitlistEntry> {
	public WaitlistEntryDefaultToEndOfList(final HttpServletRequest argRequest, final String argPrefix, final String argParameterName) {
		super(argRequest, argPrefix, argParameterName);
	}
	
	public WaitlistEntryDefaultToEndOfList(final HttpServletRequest argRequest, final String argPrefix, final String argParameterName, final Validator<WaitlistEntry> argValidator) {
		super(argRequest, argPrefix, argParameterName, argValidator);
	}
	
	public WaitlistEntryDefaultToEndOfList(final HttpServletRequest argRequest, final String argPrefix, final Validator<WaitlistEntry> argValidator) {
		super(argRequest, argPrefix, argValidator);
	}
	
	@Override
	public void processSpecial() {
		final WaitlistEntry lclWE = Validate.notNull(getUserFacing());
		
		if (lclWE.getSequenceAsObject() == null) {
			final List<WaitlistEntry> lclOtherWaitlistEntries = lclWE.getSchoolRegistration().getTournament().getWaitlistEntries();
			lclOtherWaitlistEntries.removeIf(argWE -> argWE == lclWE);
			
			lclWE.setSequence(lclOtherWaitlistEntries.isEmpty() ? 1 : lclOtherWaitlistEntries.get(lclOtherWaitlistEntries.size() - 1).getSequence() + 1);
		}
	}
}
