package com.scobolsolo.persistence;


public class QuestionImpl extends com.opal.AbstractIdentityImpl<com.scobolsolo.application.Question, com.scobolsolo.persistence.QuestionOpal> implements com.scobolsolo.application.Question {

	private final com.scobolsolo.persistence.QuestionOpal myQuestionOpal;

	public QuestionImpl(QuestionOpal argQuestionOpal) {
		super();
		myQuestionOpal = org.apache.commons.lang3.Validate.notNull(argQuestionOpal);
	}

	protected com.scobolsolo.persistence.QuestionOpal getQuestionOpal() {
		return myQuestionOpal;
	}

	@Override
	protected com.opal.IdentityOpal<? extends com.scobolsolo.application.Question> getOpal() {
		return getQuestionOpal();
	}

	@Override
	protected com.opal.IdentityOpal<? extends com.scobolsolo.application.Question> getBottomOpal() {
		return getQuestionOpal();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getIdAsObject() {
		return getQuestionOpal().getIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.QuestionImpl setId(java.lang.Integer argId) {
		getQuestionOpal().setId(argId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.QuestionImpl setId(int argId) {
		getQuestionOpal().setId(argId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public java.lang.String getDescription() {
		return getQuestionOpal().getDescription();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public com.scobolsolo.persistence.QuestionImpl setDescription(java.lang.String argDescription) {
		getQuestionOpal().setDescription(argDescription);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getCategoryCode() {
		return getQuestionOpal().getCategoryCode();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public com.scobolsolo.persistence.QuestionImpl setCategoryCode(java.lang.String argCategoryCode) {
		getQuestionOpal().setCategoryCode(argCategoryCode);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public java.lang.String getNote() {
		return getQuestionOpal().getNote();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public com.scobolsolo.persistence.QuestionImpl setNote(java.lang.String argNote) {
		getQuestionOpal().setNote(argNote);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getWriterAccountIdAsObject() {
		return getQuestionOpal().getWriterAccountIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.persistence.QuestionImpl setWriterAccountId(java.lang.Integer argWriterAccountId) {
		getQuestionOpal().setWriterAccountId(argWriterAccountId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.QuestionImpl setWriterAccountId(int argWriterAccountId) {
		getQuestionOpal().setWriterAccountId(argWriterAccountId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public java.lang.String getText() {
		return getQuestionOpal().getText();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public com.scobolsolo.persistence.QuestionImpl setText(java.lang.String argText) {
		getQuestionOpal().setText(argText);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public java.lang.String getAnswer() {
		return getQuestionOpal().getAnswer();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public com.scobolsolo.persistence.QuestionImpl setAnswer(java.lang.String argAnswer) {
		getQuestionOpal().setAnswer(argAnswer);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@com.opal.annotation.Default(value = "DRAFTED")
	@Override
	public java.lang.String getQuestionStatusCode() {
		return getQuestionOpal().getQuestionStatusCode();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@com.opal.annotation.Default(value = "DRAFTED")
	@Override
	public com.scobolsolo.persistence.QuestionImpl setQuestionStatusCode(java.lang.String argQuestionStatusCode) {
		getQuestionOpal().setQuestionStatusCode(argQuestionStatusCode);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the Category object created from question through reference question_category_code_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.Category getCategory() {
		CategoryOpal lclCategoryOpal = getQuestionOpal().getCategoryOpal();
		return lclCategoryOpal == null ? null : lclCategoryOpal.getUserFacing();
	}

	@Override
	public com.scobolsolo.application.Question setCategory(com.scobolsolo.application.Category argCategory) {
		getQuestionOpal().setCategoryOpal(argCategory == null ? null : ((CategoryImpl) argCategory).getCategoryOpal());
		return this;
	}

	/** @return the Account object created from question through reference question_writer_account_id_fkey */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.application.Account getWriter() {
		AccountOpal lclAccountOpal = getQuestionOpal().getWriterOpal();
		return lclAccountOpal == null ? null : lclAccountOpal.getUserFacing();
	}

	@Override
	public com.scobolsolo.application.Question setWriter(com.scobolsolo.application.Account argAccount) {
		getQuestionOpal().setWriterOpal(argAccount == null ? null : ((AccountImpl) argAccount).getAccountOpal());
		return this;
	}

	/** @return the QuestionStatus object created from question through reference question_question_status_code_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.QuestionStatus getStatus() {
		QuestionStatusOpal lclQuestionStatusOpal = getQuestionOpal().getStatusOpal();
		return lclQuestionStatusOpal == null ? null : lclQuestionStatusOpal.getUserFacing();
	}

	@Override
	public com.scobolsolo.application.Question setStatus(com.scobolsolo.application.QuestionStatus argQuestionStatus) {
		getQuestionOpal().setStatusOpal(argQuestionStatus == null ? null : ((QuestionStatusImpl) argQuestionStatus).getQuestionStatusOpal());
		return this;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public com.scobolsolo.application.Question addDiff(com.scobolsolo.application.Diff argDiff) {
		getQuestionOpal().addDiffOpal(((DiffImpl) argDiff).getDiffOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Question removeDiff(com.scobolsolo.application.Diff argDiff) {
		getQuestionOpal().removeDiffOpal(((DiffImpl) argDiff).getDiffOpal());
		return this;
	}

	@Override
	public int getDiffCount() {
		return getQuestionOpal().getDiffOpalCount();
	}

	@Override
	public java.util.stream.Stream<com.scobolsolo.application.Diff> streamDiff() {
		return getQuestionOpal().streamDiffOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<com.scobolsolo.application.Diff> createDiffIterator() {
		return new com.opal.OpalIterator<> (getQuestionOpal().createDiffOpalIterator());
	}

	@Override
	public com.scobolsolo.application.Question addPlacement(com.scobolsolo.application.Placement argPlacement) {
		getQuestionOpal().addPlacementOpal(((PlacementImpl) argPlacement).getPlacementOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Question removePlacement(com.scobolsolo.application.Placement argPlacement) {
		getQuestionOpal().removePlacementOpal(((PlacementImpl) argPlacement).getPlacementOpal());
		return this;
	}

	@Override
	public int getPlacementCount() {
		return getQuestionOpal().getPlacementOpalCount();
	}

	@Override
	public java.util.stream.Stream<com.scobolsolo.application.Placement> streamPlacement() {
		return getQuestionOpal().streamPlacementOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<com.scobolsolo.application.Placement> createPlacementIterator() {
		return new com.opal.OpalIterator<> (getQuestionOpal().createPlacementOpalIterator());
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
	public com.scobolsolo.application.Question copy() {
		return getQuestionOpal().copy().getUserFacing();
	}

}