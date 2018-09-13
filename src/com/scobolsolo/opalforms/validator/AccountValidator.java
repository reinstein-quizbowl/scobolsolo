package com.scobolsolo.opalforms.validator;

import com.opal.cma.Validator;

import org.apache.commons.lang3.StringUtils;

import com.scobolsolo.application.Account;
import com.scobolsolo.application.AccountFactory;

public class AccountValidator extends Validator<Account> {
	public AccountValidator() {
		super();
	}
	
	public void validate(final Account argA) {
		if (argA != null) {
			final String lclUsername = StringUtils.trimToNull(argA.getUsername());
			if (lclUsername != null) {
				final Account lclUsernameDuplicate = AccountFactory.getInstance().forUsername(lclUsername);
				if (lclUsernameDuplicate != null && lclUsernameDuplicate != argA) {
					addError("Username", "There is already an account, " + lclUsernameDuplicate.getContact().getName() + ", with username " + lclUsername);
				}
			}
		}
	}
}
