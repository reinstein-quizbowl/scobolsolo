package com.scobolsolo.opalforms.updater;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.Validate;

import com.opal.cma.OpalFormUpdater;
import com.opal.cma.Validator;

import com.scobolsolo.application.Account;
import com.scobolsolo.application.AccountFactory;
import com.scobolsolo.application.Diff;
import com.scobolsolo.application.Question;

public class QuestionUpdater extends OpalFormUpdater<Question> {
	// private static final org.apache.log4j.Logger ourLogger = org.apache.log4j.Logger.getLogger(QuestionUpdater.class);
	
	public QuestionUpdater(final HttpServletRequest argRequest, final String argPrefix, final String argParameterName) {
		super(argRequest, argPrefix, argParameterName);
	}
	
	public QuestionUpdater(final HttpServletRequest argRequest, final String argPrefix, final String argParameterName, final Validator<Question> argValidator) {
		super(argRequest, argPrefix, argParameterName, argValidator);
	}
	
	public QuestionUpdater(final HttpServletRequest argRequest, final String argPrefix, final Validator<Question> argValidator) {
		super(argRequest, argPrefix, argValidator);
	}
	
	@Override
	protected void processSpecial() {
		final Question lclQ = Validate.notNull(getUserFacing());
		
		final Account lclUser = getUser();
		Validate.isTrue(lclUser.isWriter(), "User is not a writer!");
		
		if (lclQ.isNew() && lclQ.getWriter() == null) {
			lclQ.setWriter(lclUser);
		}
	}
	
	@Override
	protected void afterUpdate() {
		if (hasErrors()) {
			return;
		}
		
		final Question lclQ = Validate.notNull(getUserFacing());
		
		final Diff lclLatest = Validate.notNull(lclQ.getCurrentDiff());
		final Diff lclPrevious = lclLatest.getPrevious();
		
		if (lclPrevious != null && lclLatest.sameContentAs(lclPrevious)) {
			lclLatest.unlink();
		}
		
		lclQ.recache();
	}
	
	@Override
	protected void beforeDelete() {
		if (getUser().isAdministrator()) {
			final Question lclQ = Validate.notNull(getUserFacing());
			if (lclQ.isUsed()) {
				addError("This question has been used in a tournament, so it cannot be deleted.");
				return;
			} else {
				Validate.isTrue(lclQ.getPlacementSet().isEmpty());
				lclQ.getDiffSet().clear();
			}
		} else {
			addError("Only administrators may delete questions.");
		}
	}
	
	@Override
	protected boolean mustCreateChild(String argPrefixedReferenceName) {
		return argPrefixedReferenceName.equals("Diff");
	}
	
	private Account getUser() {
		return Validate.notNull(AccountFactory.getInstance().forUsername(getUsername()));
	}
}
