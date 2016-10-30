package com.scobolsolo.persistence;


public class AccountImpl extends com.opal.AbstractIdentityImpl<com.scobolsolo.application.Account, com.scobolsolo.persistence.AccountOpal> implements com.scobolsolo.application.Account {

	private final com.scobolsolo.persistence.AccountOpal myAccountOpal;

	public AccountImpl(AccountOpal argAccountOpal) {
		super();
		myAccountOpal = org.apache.commons.lang3.Validate.notNull(argAccountOpal);
	}

	protected com.scobolsolo.persistence.AccountOpal getAccountOpal() {
		return myAccountOpal;
	}

	@Override
	protected com.opal.IdentityOpal<? extends com.scobolsolo.application.Account> getOpal() {
		return getAccountOpal();
	}

	@Override
	protected com.opal.IdentityOpal<? extends com.scobolsolo.application.Account> getBottomOpal() {
		return getAccountOpal();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getIdAsObject() {
		return getAccountOpal().getIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.AccountImpl setId(java.lang.Integer argId) {
		getAccountOpal().setId(argId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.AccountImpl setId(int argId) {
		getAccountOpal().setId(argId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 64L)
	@Override
	public java.lang.String getUsername() {
		return getAccountOpal().getUsername();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 64L)
	@Override
	public com.scobolsolo.persistence.AccountImpl setUsername(java.lang.String argUsername) {
		getAccountOpal().setUsername(argUsername);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 60L)
	@com.opal.annotation.Default(value = "$2a$16$XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")
	@Override
	public java.lang.String getPasswordHash() {
		return getAccountOpal().getPasswordHash();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 60L)
	@com.opal.annotation.Default(value = "$2a$16$XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")
	@Override
	public com.scobolsolo.persistence.AccountImpl setPasswordHash(java.lang.String argPasswordHash) {
		getAccountOpal().setPasswordHash(argPasswordHash);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@Override
	public java.lang.Boolean isAdministratorAsObject() {
		return getAccountOpal().isAdministratorAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@Override
	public com.scobolsolo.persistence.AccountImpl setAdministrator(java.lang.Boolean argAdministrator) {
		getAccountOpal().setAdministrator(argAdministrator);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.AccountImpl setAdministrator(boolean argAdministrator) {
		getAccountOpal().setAdministrator(argAdministrator);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	@Override
	public java.lang.Boolean isActiveAsObject() {
		return getAccountOpal().isActiveAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	@Override
	public com.scobolsolo.persistence.AccountImpl setActive(java.lang.Boolean argActive) {
		getAccountOpal().setActive(argActive);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.AccountImpl setActive(boolean argActive) {
		getAccountOpal().setActive(argActive);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@Override
	public java.lang.Boolean isWriterAsObject() {
		return getAccountOpal().isWriterAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@Override
	public com.scobolsolo.persistence.AccountImpl setWriter(java.lang.Boolean argWriter) {
		getAccountOpal().setWriter(argWriter);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.AccountImpl setWriter(boolean argWriter) {
		getAccountOpal().setWriter(argWriter);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 64L)
	@Override
	public java.lang.String getPasswordResetToken() {
		return getAccountOpal().getPasswordResetToken();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 64L)
	@Override
	public com.scobolsolo.persistence.AccountImpl setPasswordResetToken(java.lang.String argPasswordResetToken) {
		getAccountOpal().setPasswordResetToken(argPasswordResetToken);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.time.LocalDateTime getPasswordResetTokenExpiration() {
		return getAccountOpal().getPasswordResetTokenExpiration();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.persistence.AccountImpl setPasswordResetTokenExpiration(java.time.LocalDateTime argPasswordResetTokenExpiration) {
		getAccountOpal().setPasswordResetTokenExpiration(argPasswordResetTokenExpiration);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@Override
	public java.lang.Boolean isCanReceiveUnsolicitedMessagesAsObject() {
		return getAccountOpal().isCanReceiveUnsolicitedMessagesAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@Override
	public com.scobolsolo.persistence.AccountImpl setCanReceiveUnsolicitedMessages(java.lang.Boolean argCanReceiveUnsolicitedMessages) {
		getAccountOpal().setCanReceiveUnsolicitedMessages(argCanReceiveUnsolicitedMessages);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.AccountImpl setCanReceiveUnsolicitedMessages(boolean argCanReceiveUnsolicitedMessages) {
		getAccountOpal().setCanReceiveUnsolicitedMessages(argCanReceiveUnsolicitedMessages);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the Contact object created from account through reference account_id_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.Contact getContact() {
		ContactOpal lclContactOpal = getAccountOpal().getContactOpal();
		return lclContactOpal == null ? null : lclContactOpal.getUserFacing();
	}

	@Override
	public com.scobolsolo.application.Account setContact(com.scobolsolo.application.Contact argContact) {
		getAccountOpal().setContactOpal(argContact == null ? null : ((ContactImpl) argContact).getContactOpal());
		return this;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public com.scobolsolo.application.Account addPronunciationGuideSuppression(com.scobolsolo.application.PronunciationGuideSuppression argPronunciationGuideSuppression) {
		getAccountOpal().addPronunciationGuideSuppressionOpal(((PronunciationGuideSuppressionImpl) argPronunciationGuideSuppression).getPronunciationGuideSuppressionOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Account removePronunciationGuideSuppression(com.scobolsolo.application.PronunciationGuideSuppression argPronunciationGuideSuppression) {
		getAccountOpal().removePronunciationGuideSuppressionOpal(((PronunciationGuideSuppressionImpl) argPronunciationGuideSuppression).getPronunciationGuideSuppressionOpal());
		return this;
	}

	@Override
	public int getPronunciationGuideSuppressionCount() {
		return getAccountOpal().getPronunciationGuideSuppressionOpalCount();
	}

	@Override
	public java.util.stream.Stream<com.scobolsolo.application.PronunciationGuideSuppression> streamPronunciationGuideSuppression() {
		return getAccountOpal().streamPronunciationGuideSuppressionOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<com.scobolsolo.application.PronunciationGuideSuppression> createPronunciationGuideSuppressionIterator() {
		return new com.opal.OpalIterator<> (getAccountOpal().createPronunciationGuideSuppressionOpalIterator());
	}

	@Override
	public com.scobolsolo.application.Account addWriterQuestion(com.scobolsolo.application.Question argQuestion) {
		getAccountOpal().addWriterQuestionOpal(((QuestionImpl) argQuestion).getQuestionOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Account removeWriterQuestion(com.scobolsolo.application.Question argQuestion) {
		getAccountOpal().removeWriterQuestionOpal(((QuestionImpl) argQuestion).getQuestionOpal());
		return this;
	}

	@Override
	public int getWriterQuestionCount() {
		return getAccountOpal().getWriterQuestionOpalCount();
	}

	@Override
	public java.util.stream.Stream<com.scobolsolo.application.Question> streamWriterQuestion() {
		return getAccountOpal().streamWriterQuestionOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<com.scobolsolo.application.Question> createWriterQuestionIterator() {
		return new com.opal.OpalIterator<> (getAccountOpal().createWriterQuestionOpalIterator());
	}

	@Override
	public com.scobolsolo.application.Account addEditorDiff(com.scobolsolo.application.Diff argDiff) {
		getAccountOpal().addEditorDiffOpal(((DiffImpl) argDiff).getDiffOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Account removeEditorDiff(com.scobolsolo.application.Diff argDiff) {
		getAccountOpal().removeEditorDiffOpal(((DiffImpl) argDiff).getDiffOpal());
		return this;
	}

	@Override
	public int getEditorDiffCount() {
		return getAccountOpal().getEditorDiffOpalCount();
	}

	@Override
	public java.util.stream.Stream<com.scobolsolo.application.Diff> streamEditorDiff() {
		return getAccountOpal().streamEditorDiffOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<com.scobolsolo.application.Diff> createEditorDiffIterator() {
		return new com.opal.OpalIterator<> (getAccountOpal().createEditorDiffOpalIterator());
	}

	@Override
	public com.scobolsolo.application.Account addFromMessage(com.scobolsolo.application.Message argMessage) {
		getAccountOpal().addFromMessageOpal(((MessageImpl) argMessage).getMessageOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Account removeFromMessage(com.scobolsolo.application.Message argMessage) {
		getAccountOpal().removeFromMessageOpal(((MessageImpl) argMessage).getMessageOpal());
		return this;
	}

	@Override
	public int getFromMessageCount() {
		return getAccountOpal().getFromMessageOpalCount();
	}

	@Override
	public java.util.stream.Stream<com.scobolsolo.application.Message> streamFromMessage() {
		return getAccountOpal().streamFromMessageOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<com.scobolsolo.application.Message> createFromMessageIterator() {
		return new com.opal.OpalIterator<> (getAccountOpal().createFromMessageOpalIterator());
	}

	@Override
	public com.scobolsolo.application.Account addToMessage(com.scobolsolo.application.Message argMessage) {
		getAccountOpal().addToMessageOpal(((MessageImpl) argMessage).getMessageOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Account removeToMessage(com.scobolsolo.application.Message argMessage) {
		getAccountOpal().removeToMessageOpal(((MessageImpl) argMessage).getMessageOpal());
		return this;
	}

	@Override
	public int getToMessageCount() {
		return getAccountOpal().getToMessageOpalCount();
	}

	@Override
	public java.util.stream.Stream<com.scobolsolo.application.Message> streamToMessage() {
		return getAccountOpal().streamToMessageOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<com.scobolsolo.application.Message> createToMessageIterator() {
		return new com.opal.OpalIterator<> (getAccountOpal().createToMessageOpalIterator());
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
	public com.scobolsolo.application.Account copy() {
		return getAccountOpal().copy().getUserFacing();
	}

}
