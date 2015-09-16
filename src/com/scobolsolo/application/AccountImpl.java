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

	@Override
	public java.lang.Integer getIdAsObject() {
		return getAccountOpal().getIdAsObject();
	}

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

	@Override
	public java.lang.String getUsername() {
		return getAccountOpal().getUsername();
	}

	@Override
	public AccountImpl setUsername(java.lang.String argUsername) {
		getAccountOpal().setUsername(argUsername);
		return this;
	}

	@Override
	public java.lang.String getPasswordHash() {
		return getAccountOpal().getPasswordHash();
	}

	@Override
	public AccountImpl setPasswordHash(java.lang.String argPasswordHash) {
		getAccountOpal().setPasswordHash(argPasswordHash);
		return this;
	}

	@Override
	public java.lang.Boolean isAdministratorAsObject() {
		return getAccountOpal().isAdministratorAsObject();
	}

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

	@Override
	public java.lang.Boolean isActiveAsObject() {
		return getAccountOpal().isActiveAsObject();
	}

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

	@Override
	public java.lang.Boolean isWriterAsObject() {
		return getAccountOpal().isWriterAsObject();
	}

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

	@Override
	public java.lang.String getPasswordResetToken() {
		return getAccountOpal().getPasswordResetToken();
	}

	@Override
	public AccountImpl setPasswordResetToken(java.lang.String argPasswordResetToken) {
		getAccountOpal().setPasswordResetToken(argPasswordResetToken);
		return this;
	}

	@Override
	public java.time.LocalDateTime getPasswordResetTokenExpiration() {
		return getAccountOpal().getPasswordResetTokenExpiration();
	}

	@Override
	public AccountImpl setPasswordResetTokenExpiration(java.time.LocalDateTime argPasswordResetTokenExpiration) {
		getAccountOpal().setPasswordResetTokenExpiration(argPasswordResetTokenExpiration);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the Contact object created from account through reference account_id_fkey */

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
	public com.scobolsolo.application.Account clearWriterQuestion() {
		throw new UnsupportedOperationException();
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
	public com.scobolsolo.application.Account clearEditorDiff() {
		throw new UnsupportedOperationException();
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
