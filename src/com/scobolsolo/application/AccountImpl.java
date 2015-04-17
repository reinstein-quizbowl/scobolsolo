package com.scobolsolo.application;

import com.opal.Opal;
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
	protected com.opal.IdentityOpal<? extends Account> getBottomOpal() {
		return getAccountOpal();
	}

	@Override
	protected Opal<? super Account>[] getOpalArray() {
		return (Opal<? super Account>[]) new Opal<?>[] {
			getAccountOpal(),
		};
	}

	@Override
	public java.lang.Integer getIdAsObject() {
		return getAccountOpal().getIdAsObject();
	}

	@Override
	public void setId(java.lang.Integer argId) {
		getAccountOpal().setId(argId);
		return;
	}

	@Override
	public void setId(int argId) {
		getAccountOpal().setId(argId);
		return;
	}

	@Override
	public java.lang.String getUsername() {
		return getAccountOpal().getUsername();
	}

	@Override
	public void setUsername(java.lang.String argUsername) {
		getAccountOpal().setUsername(argUsername);
		return;
	}

	@Override
	public java.lang.String getPasswordHash() {
		return getAccountOpal().getPasswordHash();
	}

	@Override
	public void setPasswordHash(java.lang.String argPasswordHash) {
		getAccountOpal().setPasswordHash(argPasswordHash);
		return;
	}

	@Override
	public java.lang.Boolean isAdministratorAsObject() {
		return getAccountOpal().isAdministratorAsObject();
	}

	@Override
	public void setAdministrator(java.lang.Boolean argAdministrator) {
		getAccountOpal().setAdministrator(argAdministrator);
		return;
	}

	@Override
	public void setAdministrator(boolean argAdministrator) {
		getAccountOpal().setAdministrator(argAdministrator);
		return;
	}

	@Override
	public java.lang.Boolean isActiveAsObject() {
		return getAccountOpal().isActiveAsObject();
	}

	@Override
	public void setActive(java.lang.Boolean argActive) {
		getAccountOpal().setActive(argActive);
		return;
	}

	@Override
	public void setActive(boolean argActive) {
		getAccountOpal().setActive(argActive);
		return;
	}

	/* The following methods allow direct access to the user objects for which
	this object has foreign keys in the database. */

	/** Access to the Contact object created from the table account through foreign key account_id_fkey */

	@Override
	public Contact getContact() {
		ContactOpal lclContactOpal = getAccountOpal().getContactOpal();
		return lclContactOpal == null ? null : lclContactOpal.getUserFacing();
	}

	@Override
	public void setContact(Contact argContact) {
		getAccountOpal().setContactOpal(argContact == null ? null : ((ContactImpl) argContact).getContactOpal());
		return;
	}

	/* The following methods allow access to the user objects that have foreign keys
	to this object. */

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
