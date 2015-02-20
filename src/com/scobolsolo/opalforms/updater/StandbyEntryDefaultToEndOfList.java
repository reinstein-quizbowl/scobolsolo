package com.scobolsolo.opalforms.updater;

import java.util.List;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.Validate;

import com.opal.cma.OpalFormUpdater;
import com.opal.cma.Validator;

import com.scobolsolo.application.StandbyEntry;

public class StandbyEntryDefaultToEndOfList extends OpalFormUpdater<StandbyEntry> {
	public StandbyEntryDefaultToEndOfList(final HttpServletRequest argRequest, final String argPrefix, final String argParameterName) {
		super(argRequest, argPrefix, argParameterName);
	}
	
	public StandbyEntryDefaultToEndOfList(final HttpServletRequest argRequest, final String argPrefix, final String argParameterName, final Validator<StandbyEntry> argValidator) {
		super(argRequest, argPrefix, argParameterName, argValidator);
	}
	
	public StandbyEntryDefaultToEndOfList(final HttpServletRequest argRequest, final String argPrefix, final Validator<StandbyEntry> argValidator) {
		super(argRequest, argPrefix, argValidator);
	}
	
	@Override
	public void processSpecial() {
		final StandbyEntry lclSE = Validate.notNull(getUserFacing());
		
		if (lclSE.getSequenceAsObject() == null) {
			final List<StandbyEntry> lclOtherStandbyEntries = lclSE.getSchoolRegistration().getTournament().getStandbyEntries();
			lclOtherStandbyEntries.removeIf(argSE -> argSE == lclSE);
			
			lclSE.setSequence(lclOtherStandbyEntries.isEmpty() ? 1 : lclOtherStandbyEntries.get(lclOtherStandbyEntries.size() - 1).getSequence() + 1);
		}
	}
}
