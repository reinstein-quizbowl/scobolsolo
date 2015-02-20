package com.scobolsolo.opalforms.validator;

import com.opal.cma.Validator;

import com.scobolsolo.application.Account;
import com.scobolsolo.application.AccountFactory;

public class AccountValidator extends Validator<Account> {
	public AccountValidator() {
		super();
	}
	
	public void validateUsername(final String argUsername) {
		if (argUsername == null) {
			return;
		}
		
		final Account lclUsernameDuplicate = AccountFactory.getInstance().forUsername(argUsername.trim());
		if (lclUsernameDuplicate != null) {
			addError("Username", "There is already an account, " + lclUsernameDuplicate.getContact().getName() + ", with username " + argUsername);
		}
	}
}
