package com.scobolsolo.persistence;

public class MessageImpl extends com.opal.AbstractIdentityImpl<com.scobolsolo.application.Message, com.scobolsolo.persistence.MessageOpal> implements com.scobolsolo.application.Message {

	private final com.scobolsolo.persistence.MessageOpal myMessageOpal;

	public MessageImpl(MessageOpal argMessageOpal) {
		super();
		myMessageOpal = org.apache.commons.lang3.Validate.notNull(argMessageOpal);
	}

	protected com.scobolsolo.persistence.MessageOpal getMessageOpal() {
		return myMessageOpal;
	}

	@Override
	public com.scobolsolo.persistence.MessageOpal getOpal() {
		return getMessageOpal();
	}

	@Override
	public com.scobolsolo.persistence.MessageOpal getBottomOpal() {
		return getMessageOpal();
	}

	@Override
	public int compareTo(com.scobolsolo.application.Message argSecond) {
		return this.getSentTimestamp().compareTo(argSecond.getSentTimestamp());
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getIdAsObject() {
		return getMessageOpal().getIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.MessageImpl setId(java.lang.Integer argId) {
		getMessageOpal().setId(argId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.MessageImpl setId(int argId) {
		getMessageOpal().setId(argId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getFromAccountIdAsObject() {
		return getMessageOpal().getFromAccountIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.MessageImpl setFromAccountId(java.lang.Integer argFromAccountId) {
		getMessageOpal().setFromAccountId(argFromAccountId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.MessageImpl setFromAccountId(int argFromAccountId) {
		getMessageOpal().setFromAccountId(argFromAccountId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getToAccountIdAsObject() {
		return getMessageOpal().getToAccountIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.MessageImpl setToAccountId(java.lang.Integer argToAccountId) {
		getMessageOpal().setToAccountId(argToAccountId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.MessageImpl setToAccountId(int argToAccountId) {
		getMessageOpal().setToAccountId(argToAccountId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public java.lang.String getText() {
		return getMessageOpal().getText();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public com.scobolsolo.persistence.MessageImpl setText(java.lang.String argText) {
		getMessageOpal().setText(argText);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.CurrentDateTimeDefault
	@Override
	public java.time.LocalDateTime getSentTimestamp() {
		return getMessageOpal().getSentTimestamp();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.CurrentDateTimeDefault
	@Override
	public com.scobolsolo.persistence.MessageImpl setSentTimestamp(java.time.LocalDateTime argSentTimestamp) {
		getMessageOpal().setSentTimestamp(argSentTimestamp);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.time.LocalDateTime getAcknowledgedTimestamp() {
		return getMessageOpal().getAcknowledgedTimestamp();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.persistence.MessageImpl setAcknowledgedTimestamp(java.time.LocalDateTime argAcknowledgedTimestamp) {
		getMessageOpal().setAcknowledgedTimestamp(argAcknowledgedTimestamp);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@Override
	public java.lang.Boolean isArchivedAsObject() {
		return getMessageOpal().isArchivedAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@Override
	public com.scobolsolo.persistence.MessageImpl setArchived(java.lang.Boolean argArchived) {
		getMessageOpal().setArchived(argArchived);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.MessageImpl setArchived(boolean argArchived) {
		getMessageOpal().setArchived(argArchived);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the Account object created from message through reference message_from_account_id_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.Account getFromAccount() {
		AccountOpal lclAccountOpal = getMessageOpal().getFromAccountOpal();
		return lclAccountOpal == null ? null : lclAccountOpal.getUserFacing();
	}

	@Override
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.Message setFromAccount(com.scobolsolo.application.Account argAccount) {
		getMessageOpal().setFromAccountOpal(argAccount == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.Account, com.scobolsolo.persistence.AccountOpal>) argAccount).getOpal());
		return this;
	}

	/** @return the Account object created from message through reference message_to_account_id_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.Account getToAccount() {
		AccountOpal lclAccountOpal = getMessageOpal().getToAccountOpal();
		return lclAccountOpal == null ? null : lclAccountOpal.getUserFacing();
	}

	@Override
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.Message setToAccount(com.scobolsolo.application.Account argAccount) {
		getMessageOpal().setToAccountOpal(argAccount == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.Account, com.scobolsolo.persistence.AccountOpal>) argAccount).getOpal());
		return this;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public void unlink() {
		getMessageOpal().unlink();
	}

	@Override
	public void reload() {
		getMessageOpal().reload();
	}

	@Override
	public com.scobolsolo.application.Message copy() {
		return getMessageOpal().copy().getUserFacing();
	}

}
