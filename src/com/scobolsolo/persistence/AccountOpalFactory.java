package com.scobolsolo.persistence;
import com.scobolsolo.application.Account;
import com.opal.PersistenceException;

public interface AccountOpalFactory extends com.opal.OpalFactory<Account, AccountOpal>, com.opal.OpalFactoryCreator<Account, AccountOpal> {
	public AccountOpal forId(java.lang.Integer argId) throws PersistenceException;
	public AccountOpal forUsername(java.lang.String argUsername) throws PersistenceException;
}
