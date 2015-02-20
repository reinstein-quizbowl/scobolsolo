package com.scobolsolo.opalforms.updater;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.Validate;

import com.opal.cma.OpalFormUpdater;
import com.opal.cma.Validator;

import com.scobolsolo.application.Contact;

public class ContactUpdater extends OpalFormUpdater<Contact> {
	public ContactUpdater(final HttpServletRequest argRequest, final String argPrefix, final String argParameterName) {
		super(argRequest, argPrefix, argParameterName);
	}
	
	public ContactUpdater(final HttpServletRequest argRequest, final String argPrefix, final String argParameterName, final Validator<Contact> argValidator) {
		super(argRequest, argPrefix, argParameterName, argValidator);
	}
	
	public ContactUpdater(final HttpServletRequest argRequest, final String argPrefix, final Validator<Contact> argValidator) {
		super(argRequest, argPrefix, argValidator);
	}
	
	@Override
	protected void processSpecial() {
		final Contact lclC = Validate.notNull(getUserFacing());
		
		if (lclC.getSortBy() == null && lclC.getName() != null) {
			String lclSortBy = null;
			
			final String[] lclNameParts = Validate.notEmpty(lclC.getName().split(" "));
			
			String lclFirstName, lclMiddleName, lclLastName;
			
			if ("The".equalsIgnoreCase(lclNameParts[0])) {
				lclSortBy = lclC.getName();
			} else if (lclNameParts.length == 1) {
				lclSortBy = lclNameParts[0];
			} else if (lclNameParts.length == 2) {
				lclFirstName = lclNameParts[0];
				lclLastName = lclNameParts[1];
				
				lclSortBy = lclLastName + ", " + lclFirstName;
			} else if (lclNameParts.length == 3) {
				if (lclNameParts[1].equalsIgnoreCase("van") || lclNameParts[1].equalsIgnoreCase("du")) {
					lclFirstName = lclNameParts[0];
					lclLastName = lclNameParts[1] + ' ' + lclNameParts[2];
					
					lclSortBy = lclLastName + ", " + lclFirstName;
				} else {
					lclFirstName = lclNameParts[0];
					lclMiddleName = lclNameParts[1];
					lclLastName = lclNameParts[2];
					
					lclSortBy = lclLastName + ", " + lclFirstName + ' ' + lclMiddleName;
				}
			} else if (lclNameParts.length > 3) {
				lclSortBy = lclC.getName();
			} else {
				throw new IllegalStateException();
			}
			
			lclC.setSortBy(lclSortBy);
		}
	}
}
