package com.scobolsolo.opalforms.validator;

import org.apache.commons.validator.routines.EmailValidator;

import com.opal.cma.Validator;

import com.scobolsolo.application.Contact;

public class ContactValidator extends Validator<Contact> {
	public ContactValidator() {
		super();
	}
	
	public void validateEmailAddress(final String argEmailAddress) {
		if (argEmailAddress == null) {
			return;
		} else {
			if (EmailValidator.getInstance().isValid(argEmailAddress) == false) {
				addError("EmailAddress", "Invalid email address");
			}
		}
	}
}
