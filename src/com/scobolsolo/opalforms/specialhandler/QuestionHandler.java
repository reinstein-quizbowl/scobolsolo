package com.scobolsolo.opalforms.specialhandler;

import org.apache.commons.lang3.Validate;

import com.opal.IdentityFactory;
import com.opal.IdentityUserFacing;
import com.opal.UserFacing;
import com.opal.cma.OpalForm;
import com.opal.cma.OpalFormUpdater;
import com.opal.cma.SpecialHandler;

import com.scobolsolo.application.Question;
import com.scobolsolo.application.QuestionFactory;

public class QuestionHandler extends SpecialHandler<Question> {
	public QuestionHandler() {
		super();
	}
	
	@Override
	public String getDisplay(OpalForm<? extends UserFacing> argOF, String argFieldName) {
		Question lclQ = argOF.target(argFieldName, QuestionFactory.getInstance());
		return lclQ == null ? "" : String.valueOf(lclQ.getId());
	}
	
	@Override
	public Question determineUserFacing(OpalFormUpdater<? extends IdentityUserFacing> argUpdater, IdentityFactory<Question> argFactory, String argFieldName, String argData) {
		Validate.notNull(argUpdater);
		Validate.notNull(argFactory);
		
		if (argData == null || argData.equals("")) {
			return null;
		} else {
			return QuestionFactory.getInstance().forId(Integer.valueOf(argData));
		}
	}
}

