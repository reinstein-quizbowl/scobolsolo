package com.scobolsolo.opalforms.updater;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

import com.opal.cma.OpalFormUpdater;
import com.opal.cma.Validator;

import com.scobolsolo.application.Account;
import com.scobolsolo.application.AccountFactory;
import com.scobolsolo.application.Diff;
import com.scobolsolo.application.DiffFactory;
import com.scobolsolo.application.Question;

public class QuestionUpdater extends OpalFormUpdater<Question> {
	public QuestionUpdater(final HttpServletRequest argRequest, final String argPrefix, final String argParameterName) {
		super(argRequest, argPrefix, argParameterName);
	}
	
	public QuestionUpdater(final HttpServletRequest argRequest, final String argPrefix, final String argParameterName, final Validator<Question> argValidator) {
		super(argRequest, argPrefix, argParameterName, argValidator);
	}
	
	public QuestionUpdater(final HttpServletRequest argRequest, final String argPrefix, final Validator<Question> argValidator) {
		super(argRequest, argPrefix, argValidator);
	}
	
	private String myInitialText = null;
	private String myInitialAnswer = null;
	private String myInitialNote = null;
	
	@Override
	protected void beforeUpdate() {
		Question lclQ = getUserFacing();
		
		if (lclQ != null && !lclQ.isNew()) {
			myInitialText = lclQ.getText();
			myInitialAnswer = lclQ.getAnswer();
			myInitialNote = lclQ.getNote();
		}
	}
	
	@Override
	protected void processSpecial() {
		Question lclQ = Validate.notNull(getUserFacing());
		
		Account lclUser = getUser();
		Validate.isTrue(lclUser.isWriter(), "User is not a writer!");
		
		if (lclQ.isNew() && lclQ.getWriter() == null) {
			lclQ.setWriter(lclUser);
		}
	}
	
	@Override
	protected void afterUpdate() {
		Question lclQ = Validate.notNull(getUserFacing());
		
		Account lclUser = getUser();
		Validate.isTrue(lclUser.isWriter(), "User is not a writer!");
		
		boolean lclChange = false;
		String lclRemark = StringUtils.trimToNull(getPrefixedParameter("DiffRemark"));
		
		if (lclQ.isNew()) {
			lclChange = true;
		} else if (!Objects.equals(myInitialText, lclQ.getText())) {
			lclChange = true;
		} else if (!Objects.equals(myInitialAnswer, lclQ.getAnswer())) {
			lclChange = true;
		} else if (!Objects.equals(myInitialNote, lclQ.getNote())) {
			lclChange = true;
		} else if (lclRemark != null) {
			lclChange = true;
		}
		
		if (lclChange) {
			int lclRevisionNumber = lclQ.getNextRevisionNumber();
			
			Diff lclD = DiffFactory.getInstance().create()
				.setQuestion(lclQ)
				.setRevisionNumber(lclRevisionNumber)
				.setEditor(lclUser)
				.setText(lclQ.getText())
				.setAnswer(lclQ.getAnswer())
				.setNote(lclQ.getNote())
				.setRemark(lclRemark)
				.setEditDistance(StringUtils.getLevenshteinDistance(ObjectUtils.firstNonNull(myInitialText, ""), lclQ.getText()))
				.setTimestamp(LocalDateTime.now());
		}
	}
	
	@Override
	protected void beforeDelete() {
		if (getUser().isAdministrator()) {
			Question lclQ = Validate.notNull(getUserFacing());
			if (lclQ.isUsed()) {
				addError("This question has been used in a tournament, so it cannot be deleted.");
				return;
			} else {
				Validate.isTrue(lclQ.getPlacementCount() == 0);
				lclQ.streamDiff().forEach(Diff::unlink);
			}
		} else {
			addError("Only administrators may delete questions.");
		}
	}
	
	private Account getUser() {
		return Validate.notNull(AccountFactory.getInstance().forUsername(getUsername()));
	}
}
