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
import com.scobolsolo.application.Category;
import com.scobolsolo.application.Diff;
import com.scobolsolo.application.DiffFactory;
import com.scobolsolo.application.Question;
import com.scobolsolo.application.QuestionStatus;
import com.scobolsolo.application.QuestionStatusFactory;

public class QuestionUpdater extends OpalFormUpdater<Question> {
	private Category myInitialCategory = null;
	private QuestionStatus myInitialStatus = null;
	private String myInitialText = null;
	private String myInitialAnswer = null;
	private String myInitialNote = null;
	
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
	protected void beforeUpdate() {
		final Question lclQ = getUserFacing();
		
		if (lclQ != null && !lclQ.isNew()) {
			myInitialCategory = lclQ.getCategory();
			myInitialStatus = lclQ.getStatus();
			myInitialText = lclQ.getText();
			myInitialAnswer = lclQ.getAnswer();
			myInitialNote = lclQ.getNote();
		}
	}
	
	@Override
	protected void processSpecial() {
		final Question lclQ = Validate.notNull(getUserFacing());
		
		final Account lclUser = getUser();
		Validate.isTrue(lclUser.isWriter(), "User is not a writer!");
		
		if (lclQ.isNew() && lclQ.getWriter() == null) {
			lclQ.setWriter(lclUser);
		}
		
		if (lclQ.isNew() && lclQ.getStatus() == null) {
			if (lclQ.getText() == null) {
				lclQ.setStatus(QuestionStatusFactory.ANSWER_CHOSEN());
			} else {
				lclQ.setStatus(QuestionStatusFactory.DRAFTED()); // This is the database column's default, so this line isn't necessary. But I like being clear.
			}
		}
		
		if (lclQ.getText() == null && lclQ.getStatus() == QuestionStatusFactory.ANSWER_CHOSEN()) {
			lclQ.setText("Answer claim only");
		} else {
			if (lclQ.getText() == null) {
				addError("Text", "You must input question text.");
			}
		}
		
		if (lclQ.getAnswer() == null) {
			addError("Answer", "You must input the answer line.");
		}
	}
	
	@Override
	protected void afterUpdate() {
		if (hasErrors()) {
			return;
		}
		
		final Question lclQ = Validate.notNull(getUserFacing());
		
		final Account lclUser = getUser();
		Validate.isTrue(lclUser.isWriter(), "User is not a writer!");
		
		final String lclRemark = StringUtils.trimToNull(getPrefixedParameter("DiffRemark"));
		
		final boolean lclChange = 
			lclQ.isNew() ||
			myInitialCategory != lclQ.getCategory() ||
			myInitialStatus != lclQ.getStatus() ||
			!Objects.equals(myInitialText, lclQ.getText()) ||
			!Objects.equals(myInitialAnswer, lclQ.getAnswer()) ||
			!Objects.equals(myInitialNote, lclQ.getNote()) ||
			lclRemark != null ||
			false; // final irrelevant line so that all the above ones can end with || and I don't have to muck around with the last one being different
		
		if (lclChange) {
			final int lclRevisionNumber = lclQ.getNextRevisionNumber();
			
			DiffFactory.getInstance().create()
				.setQuestion(lclQ)
				.setRevisionNumber(lclRevisionNumber)
				.setEditor(lclUser)
				.setCategory(lclQ.getCategory())
				.setStatus(lclQ.getStatus())
				.setText(lclQ.getText())
				.setAnswer(lclQ.getAnswer())
				.setNote(lclQ.getNote())
				.setRemark(lclRemark)
				.setEditDistance(StringUtils.getLevenshteinDistance(ObjectUtils.firstNonNull(myInitialText, ""), lclQ.getText()))
				.setTimestamp(LocalDateTime.now());
			
			lclQ.recache();
		}
	}
	
	@Override
	protected void beforeDelete() {
		if (getUser().isAdministrator()) {
			final Question lclQ = Validate.notNull(getUserFacing());
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
