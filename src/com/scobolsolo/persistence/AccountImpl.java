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
	public com.scobolsolo.persistence.AccountOpal getOpal() {
		return getAccountOpal();
	}

	@Override
	public com.scobolsolo.persistence.AccountOpal getBottomOpal() {
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
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.Account setContact(com.scobolsolo.application.Contact argContact) {
		getAccountOpal().setContactOpal(argContact == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.Contact, com.scobolsolo.persistence.ContactOpal>) argContact).getOpal());
		return this;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public java.util.Set<com.scobolsolo.application.PronunciationGuideSuppression> getPronunciationGuideSuppressionSet() {
		return new com.opal.UserFacingBackCollectionSet<>(getAccountOpal().getPronunciationGuideSuppressionOpalSet());
	}

	@Override
	public java.util.Set<com.scobolsolo.application.Question> getWriterQuestionSet() {
		return new com.opal.UserFacingBackCollectionSet<>(getAccountOpal().getWriterQuestionOpalSet());
	}

	@Override
	public java.util.Set<com.scobolsolo.application.Diff> getEditorDiffSet() {
		return new com.opal.UserFacingBackCollectionSet<>(getAccountOpal().getEditorDiffOpalSet());
	}

	@Override
	public java.util.Set<com.scobolsolo.application.Message> getFromMessageSet() {
		return new com.opal.UserFacingBackCollectionSet<>(getAccountOpal().getFromMessageOpalSet());
	}

	@Override
	public java.util.Set<com.scobolsolo.application.Message> getToMessageSet() {
		return new com.opal.UserFacingBackCollectionSet<>(getAccountOpal().getToMessageOpalSet());
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
