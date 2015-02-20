package com.scobolsolo.application;

import com.scobolsolo.persistence.QuestionOpal;
import com.scobolsolo.persistence.CategoryOpal;
import com.scobolsolo.persistence.TournamentOpal;

public class QuestionImpl extends com.opal.AbstractIdentityImpl<QuestionOpal> implements Question {
	private final QuestionOpal myQuestionOpal;

	public QuestionImpl(QuestionOpal argQuestionOpal) {
		super();
		myQuestionOpal = org.apache.commons.lang3.Validate.notNull(argQuestionOpal);
	}

	protected QuestionOpal getQuestionOpal() {
		return myQuestionOpal;
	}

	@Override
	protected /* Opal<? extends UserFacing> */ QuestionOpal getBottomOpal() {
		return getQuestionOpal();
	}

	@Override
	protected /* Opal<? extends UserFacing> */ QuestionOpal[] getOpalArray() {
		return new /* Opal<?> */ QuestionOpal[] {
			getQuestionOpal(),
		};
	}

	@Override
	public java.lang.Integer getIdAsObject() {
		return getQuestionOpal().getIdAsObject();
	}

	@Override
	public void setId(java.lang.Integer argId) {
		getQuestionOpal().setId(argId);
		return;
	}

	@Override
	public void setId(int argId) {
		getQuestionOpal().setId(argId);
		return;
	}

	@Override
	public java.lang.String getDescription() {
		return getQuestionOpal().getDescription();
	}

	@Override
	public void setDescription(java.lang.String argDescription) {
		getQuestionOpal().setDescription(argDescription);
		return;
	}

	@Override
	public java.lang.String getCategoryCode() {
		return getQuestionOpal().getCategoryCode();
	}

	@Override
	public void setCategoryCode(java.lang.String argCategoryCode) {
		getQuestionOpal().setCategoryCode(argCategoryCode);
		return;
	}

	@Override
	public java.lang.String getTournamentCode() {
		return getQuestionOpal().getTournamentCode();
	}

	@Override
	public void setTournamentCode(java.lang.String argTournamentCode) {
		getQuestionOpal().setTournamentCode(argTournamentCode);
		return;
	}

	@Override
	public java.lang.String getNote() {
		return getQuestionOpal().getNote();
	}

	@Override
	public void setNote(java.lang.String argNote) {
		getQuestionOpal().setNote(argNote);
		return;
	}

	/* The following methods allow direct access to the user objects for which
	this object has foreign keys in the database. */

	/** Access to the Category object created from the table question through foreign key question_category_code_fkey */

	@Override
	public Category getCategory() {
		CategoryOpal lclCategoryOpal = getQuestionOpal().getCategoryOpal();
		return lclCategoryOpal == null ? null : lclCategoryOpal.getUserFacing();
	}

	@Override
	public void setCategory(Category argCategory) {
		getQuestionOpal().setCategoryOpal(argCategory == null ? null : ((CategoryImpl) argCategory).getCategoryOpal());
		return;
	}

	/** Access to the Tournament object created from the table question through foreign key question_tournament_code_fkey */

	@Override
	public Tournament getTournament() {
		TournamentOpal lclTournamentOpal = getQuestionOpal().getTournamentOpal();
		return lclTournamentOpal == null ? null : lclTournamentOpal.getUserFacing();
	}

	@Override
	public void setTournament(Tournament argTournament) {
		getQuestionOpal().setTournamentOpal(argTournament == null ? null : ((TournamentImpl) argTournament).getTournamentOpal());
		return;
	}

	/* The following methods allow access to the user objects that have foreign keys
	to this object. */

	@Override
	public void addPlacement(Placement argPlacement) {
		getQuestionOpal().addPlacementOpal(((PlacementImpl) argPlacement).getPlacementOpal());
	}

	@Override
	public void removePlacement(Placement argPlacement) {
		getQuestionOpal().removePlacementOpal(((PlacementImpl) argPlacement).getPlacementOpal());
	}

	@Override
	public int getPlacementCount() {
		return getQuestionOpal().getPlacementOpalCount();
	}

	@Override
	public java.util.stream.Stream<Placement> streamPlacement() {
		return getQuestionOpal().streamPlacementOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<Placement> createPlacementIterator() {
		return new com.opal.OpalIterator<> (getQuestionOpal().createPlacementOpalIterator());
	}

	@Override
	public void clearPlacement() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void unlink() {
		getQuestionOpal().unlink();
	}

	@Override
	public void reload() {
		getQuestionOpal().reload();
	}

	@Override
	public Question copy() {
		return getQuestionOpal().copy().getUserFacing();
	}

}
