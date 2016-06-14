package com.scobolsolo.application;

import com.scobolsolo.persistence.MessageOpal;
import com.scobolsolo.persistence.AccountOpal;

public class MessageImpl extends com.opal.AbstractIdentityImpl<Message, MessageOpal> implements Message {

	private final MessageOpal myMessageOpal;

	public MessageImpl(MessageOpal argMessageOpal) {
		super();
		myMessageOpal = org.apache.commons.lang3.Validate.notNull(argMessageOpal);
	}

	protected MessageOpal getMessageOpal() {
		return myMessageOpal;
	}

	@Override
	protected com.opal.IdentityOpal<? extends Message> getOpal() {
		return getMessageOpal();
	}

	@Override
	protected com.opal.IdentityOpal<? extends Message> getBottomOpal() {
		return getMessageOpal();
	}

	@Override
	public int compareTo(Message argSecond) {
		return this.getSentTimestamp().compareTo(argSecond.getSentTimestamp());
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getIdAsObject() {
		return getMessageOpal().getIdAsObject();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public MessageImpl setId(java.lang.Integer argId) {
		getMessageOpal().setId(argId);
		return this;
	}

	@Override
	public MessageImpl setId(int argId) {
		getMessageOpal().setId(argId);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getFromAccountIdAsObject() {
		return getMessageOpal().getFromAccountIdAsObject();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public MessageImpl setFromAccountId(java.lang.Integer argFromAccountId) {
		getMessageOpal().setFromAccountId(argFromAccountId);
		return this;
	}

	@Override
	public MessageImpl setFromAccountId(int argFromAccountId) {
		getMessageOpal().setFromAccountId(argFromAccountId);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getToAccountIdAsObject() {
		return getMessageOpal().getToAccountIdAsObject();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public MessageImpl setToAccountId(java.lang.Integer argToAccountId) {
		getMessageOpal().setToAccountId(argToAccountId);
		return this;
	}

	@Override
	public MessageImpl setToAccountId(int argToAccountId) {
		getMessageOpal().setToAccountId(argToAccountId);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public java.lang.String getText() {
		return getMessageOpal().getText();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public MessageImpl setText(java.lang.String argText) {
		getMessageOpal().setText(argText);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.CurrentDateTimeDefault
	@Override
	public java.time.LocalDateTime getSentTimestamp() {
		return getMessageOpal().getSentTimestamp();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.CurrentDateTimeDefault
	@Override
	public MessageImpl setSentTimestamp(java.time.LocalDateTime argSentTimestamp) {
		getMessageOpal().setSentTimestamp(argSentTimestamp);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.time.LocalDateTime getAcknowledgedTimestamp() {
		return getMessageOpal().getAcknowledgedTimestamp();
	}

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public MessageImpl setAcknowledgedTimestamp(java.time.LocalDateTime argAcknowledgedTimestamp) {
		getMessageOpal().setAcknowledgedTimestamp(argAcknowledgedTimestamp);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the Account object created from message through reference message_from_account_id_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public Account getFromAccount() {
		AccountOpal lclAccountOpal = getMessageOpal().getFromAccountOpal();
		return lclAccountOpal == null ? null : lclAccountOpal.getUserFacing();
	}

	@Override
	public Message setFromAccount(Account argAccount) {
		getMessageOpal().setFromAccountOpal(argAccount == null ? null : ((AccountImpl) argAccount).getAccountOpal());
		return this;
	}

	/** @return the Account object created from message through reference message_to_account_id_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public Account getToAccount() {
		AccountOpal lclAccountOpal = getMessageOpal().getToAccountOpal();
		return lclAccountOpal == null ? null : lclAccountOpal.getUserFacing();
	}

	@Override
	public Message setToAccount(Account argAccount) {
		getMessageOpal().setToAccountOpal(argAccount == null ? null : ((AccountImpl) argAccount).getAccountOpal());
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
	public Message copy() {
		return getMessageOpal().copy().getUserFacing();
	}

}
