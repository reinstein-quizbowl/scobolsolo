package com.scobolsolo.application;

import com.scobolsolo.persistence.AccountOpal;
import com.scobolsolo.persistence.ContactOpal;

public class AccountImpl extends com.opal.AbstractIdentityImpl<Account, AccountOpal> implements Account {

	private final AccountOpal myAccountOpal;

	public AccountImpl(AccountOpal argAccountOpal) {
		super();
		myAccountOpal = org.apache.commons.lang3.Validate.notNull(argAccountOpal);
	}

	protected AccountOpal getAccountOpal() {
		return myAccountOpal;
	}

	@Override
	protected com.opal.IdentityOpal<? extends Account> getOpal() {
		return getAccountOpal();
	}

	@Override
	protected com.opal.IdentityOpal<? extends Account> getBottomOpal() {
		return getAccountOpal();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getIdAsObject() {
		return getAccountOpal().getIdAsObject();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public AccountImpl setId(java.lang.Integer argId) {
		getAccountOpal().setId(argId);
		return this;
	}

	@Override
	public AccountImpl setId(int argId) {
		getAccountOpal().setId(argId);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 64L)
	@Override
	public java.lang.String getUsername() {
		return getAccountOpal().getUsername();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 64L)
	@Override
	public AccountImpl setUsername(java.lang.String argUsername) {
		getAccountOpal().setUsername(argUsername);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 60L)
	@com.opal.annotation.Default(value = "$2a$16$XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")
	@Override
	public java.lang.String getPasswordHash() {
		return getAccountOpal().getPasswordHash();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 60L)
	@com.opal.annotation.Default(value = "$2a$16$XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")
	@Override
	public AccountImpl setPasswordHash(java.lang.String argPasswordHash) {
		getAccountOpal().setPasswordHash(argPasswordHash);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@Override
	public java.lang.Boolean isAdministratorAsObject() {
		return getAccountOpal().isAdministratorAsObject();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@Override
	public AccountImpl setAdministrator(java.lang.Boolean argAdministrator) {
		getAccountOpal().setAdministrator(argAdministrator);
		return this;
	}

	@Override
	public AccountImpl setAdministrator(boolean argAdministrator) {
		getAccountOpal().setAdministrator(argAdministrator);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	@Override
	public java.lang.Boolean isActiveAsObject() {
		return getAccountOpal().isActiveAsObject();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	@Override
	public AccountImpl setActive(java.lang.Boolean argActive) {
		getAccountOpal().setActive(argActive);
		return this;
	}

	@Override
	public AccountImpl setActive(boolean argActive) {
		getAccountOpal().setActive(argActive);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@Override
	public java.lang.Boolean isWriterAsObject() {
		return getAccountOpal().isWriterAsObject();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@Override
	public AccountImpl setWriter(java.lang.Boolean argWriter) {
		getAccountOpal().setWriter(argWriter);
		return this;
	}

	@Override
	public AccountImpl setWriter(boolean argWriter) {
		getAccountOpal().setWriter(argWriter);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 64L)
	@Override
	public java.lang.String getPasswordResetToken() {
		return getAccountOpal().getPasswordResetToken();
	}

	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 64L)
	@Override
	public AccountImpl setPasswordResetToken(java.lang.String argPasswordResetToken) {
		getAccountOpal().setPasswordResetToken(argPasswordResetToken);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.time.LocalDateTime getPasswordResetTokenExpiration() {
		return getAccountOpal().getPasswordResetTokenExpiration();
	}

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public AccountImpl setPasswordResetTokenExpiration(java.time.LocalDateTime argPasswordResetTokenExpiration) {
		getAccountOpal().setPasswordResetTokenExpiration(argPasswordResetTokenExpiration);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the Contact object created from account through reference account_id_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public Contact getContact() {
		ContactOpal lclContactOpal = getAccountOpal().getContactOpal();
		return lclContactOpal == null ? null : lclContactOpal.getUserFacing();
	}

	@Override
	public Account setContact(Contact argContact) {
		getAccountOpal().setContactOpal(argContact == null ? null : ((ContactImpl) argContact).getContactOpal());
		return this;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public com.scobolsolo.application.Account addPronunciationGuideSuppression(PronunciationGuideSuppression argPronunciationGuideSuppression) {
		getAccountOpal().addPronunciationGuideSuppressionOpal(((PronunciationGuideSuppressionImpl) argPronunciationGuideSuppression).getPronunciationGuideSuppressionOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Account removePronunciationGuideSuppression(PronunciationGuideSuppression argPronunciationGuideSuppression) {
		getAccountOpal().removePronunciationGuideSuppressionOpal(((PronunciationGuideSuppressionImpl) argPronunciationGuideSuppression).getPronunciationGuideSuppressionOpal());
		return this;
	}

	@Override
	public int getPronunciationGuideSuppressionCount() {
		return getAccountOpal().getPronunciationGuideSuppressionOpalCount();
	}

	@Override
	public java.util.stream.Stream<PronunciationGuideSuppression> streamPronunciationGuideSuppression() {
		return getAccountOpal().streamPronunciationGuideSuppressionOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<PronunciationGuideSuppression> createPronunciationGuideSuppressionIterator() {
		return new com.opal.OpalIterator<> (getAccountOpal().createPronunciationGuideSuppressionOpalIterator());
	}

	@Override
	public com.scobolsolo.application.Account addWriterQuestion(Question argQuestion) {
		getAccountOpal().addWriterQuestionOpal(((QuestionImpl) argQuestion).getQuestionOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Account removeWriterQuestion(Question argQuestion) {
		getAccountOpal().removeWriterQuestionOpal(((QuestionImpl) argQuestion).getQuestionOpal());
		return this;
	}

	@Override
	public int getWriterQuestionCount() {
		return getAccountOpal().getWriterQuestionOpalCount();
	}

	@Override
	public java.util.stream.Stream<Question> streamWriterQuestion() {
		return getAccountOpal().streamWriterQuestionOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<Question> createWriterQuestionIterator() {
		return new com.opal.OpalIterator<> (getAccountOpal().createWriterQuestionOpalIterator());
	}

	@Override
	public com.scobolsolo.application.Account addEditorDiff(Diff argDiff) {
		getAccountOpal().addEditorDiffOpal(((DiffImpl) argDiff).getDiffOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Account removeEditorDiff(Diff argDiff) {
		getAccountOpal().removeEditorDiffOpal(((DiffImpl) argDiff).getDiffOpal());
		return this;
	}

	@Override
	public int getEditorDiffCount() {
		return getAccountOpal().getEditorDiffOpalCount();
	}

	@Override
	public java.util.stream.Stream<Diff> streamEditorDiff() {
		return getAccountOpal().streamEditorDiffOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<Diff> createEditorDiffIterator() {
		return new com.opal.OpalIterator<> (getAccountOpal().createEditorDiffOpalIterator());
	}

	@Override
	public void unlink() {
		getAccountOpal().unlink();
	}

	@Override
	public void reload() {
		getAccountOpal().reload();
	}

	@Override
	public Account copy() {
		return getAccountOpal().copy().getUserFacing();
	}

}
