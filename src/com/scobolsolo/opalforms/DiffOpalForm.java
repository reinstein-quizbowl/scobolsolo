package com.scobolsolo.opalforms;

import java.util.Comparator;

import org.apache.commons.lang3.Validate;

import com.opal.FieldUtility;
import com.opal.cma.OpalForm;
import com.opal.cma.OpalSubform;

import com.scobolsolo.application.Diff;
import com.scobolsolo.application.DiffFactory;
import com.scobolsolo.application.Question;

public class DiffOpalForm extends OpalSubform<Diff> {
	private final OpalForm<Diff> myBaseDiffOpalForm;
	private final Diff myPreviousDiff;
	
	public DiffOpalForm(final Diff argPreviousDiff, final OpalForm<Diff> argBase) {
		super(
			argBase,
			"",
			argBase.getUserFacing(),
			DiffFactory.getInstance()
		);
		
		myBaseDiffOpalForm = Validate.notNull(argBase);
		myPreviousDiff = argPreviousDiff; // May be null, as for a new question
	}
	
	protected OpalForm<Diff> getBase() {
		return myBaseDiffOpalForm;
	}
	
	public Diff getPreviousDiff() {
		return myPreviousDiff;
	}
	
	/* public Question getQuestion() {
		return getPreviousDiff() == null ? null : getPreviousDiff().getQuestion();
	} */
	
	@Override
	protected Object getSavedValue(final String argFieldName) {
		return FieldUtility.getValue(getPreviousDiff(), argFieldName);
	}
	
	@Override
	public String getPrefix() {
		return "/Diff/0";
	}
	
	public static DiffOpalForm create(final OpalForm<Question> argQOF) {
		Validate.notNull(argQOF);
		
		return new DiffOpalForm(
			argQOF.isNew() ? null : argQOF.getUserFacing().getCurrentDiff(),
			argQOF.children("Diff", DiffFactory.getInstance(), 1, x -> false, Comparator.naturalOrder()).get(0)
		);
	}
}
