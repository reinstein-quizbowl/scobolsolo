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
	public com.scobolsolo.persistence.QuestionOpal getOpal() {
		return getQuestionOpal();
	}

	@Override
	public com.scobolsolo.persistence.QuestionOpal getBottomOpal() {
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

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the Account object created from question through reference question_writer_account_id_fkey */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.application.Account getWriter() {
		AccountOpal lclAccountOpal = getQuestionOpal().getWriterOpal();
		return lclAccountOpal == null ? null : lclAccountOpal.getUserFacing();
	}

	@Override
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.Question setWriter(com.scobolsolo.application.Account argAccount) {
		getQuestionOpal().setWriterOpal(argAccount == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.Account, com.scobolsolo.persistence.AccountOpal>) argAccount).getOpal());
		return this;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public java.util.Set<com.scobolsolo.application.Diff> getDiffSet() {
		return new com.opal.UserFacingBackCollectionSet<>(getQuestionOpal().getDiffOpalSet());
	}

	@Override
	public java.util.Set<com.scobolsolo.application.Placement> getPlacementSet() {
		return new com.opal.UserFacingBackCollectionSet<>(getQuestionOpal().getPlacementOpalSet());
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
