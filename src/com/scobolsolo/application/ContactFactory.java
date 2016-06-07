package com.scobolsolo.application;

import com.scobolsolo.persistence.ContactOpalFactory;
import com.scobolsolo.persistence.ContactOpal;
import com.scobolsolo.persistence.OpalFactoryFactory;

public class ContactFactory extends com.opal.AbstractIdentityFactory<Contact, ContactOpal> implements com.opal.FactoryCreator<Contact> {

	/** This static variable holds the Singleton instance of the Factory for application
		objects of this type.  It is private, but can be accessed via the getInstance() method.
	*/

	private static final ContactFactory ourInstance = new ContactFactory(OpalFactoryFactory.getInstance().getContactOpalFactory());

	public static ContactFactory getInstance() { return ourInstance; }

	public ContactOpalFactory getContactOpalFactory() { return (ContactOpalFactory) getOpalFactory(); }

	protected ContactFactory(com.opal.IdentityOpalFactory<Contact, ContactOpal> argOpalFactory) {
		super(argOpalFactory);
	}

	@Override
	public Class<Contact> getUserFacingInterface() {
		return Contact.class;
	}

	@Override
	public Contact create() {
		return getContactOpalFactory().create().getUserFacing();
	}

	public Contact forId(java.lang.Integer argId) {
		ContactOpal lclContactOpal = getContactOpalFactory().forId(argId);
		return (lclContactOpal == null) ? null : lclContactOpal.getUserFacing();
	}

	@Override
	public Contact[] createArray(int argSize) {
		return new Contact[argSize];
	}

	public Contact fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		return fromHttpRequest(argRequest, "contact_id");
	}

	public Contact fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argId) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		String lclIdString = argRequest.getParameter(argId);
		if (org.apache.commons.lang3.StringUtils.isBlank(lclIdString)) {
			return null;
		}
		java.lang.Integer lclId = java.lang.Integer.valueOf(lclIdString);
		return forId(lclId);
	}

	public <T extends java.util.Collection<? super Contact>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		org.apache.commons.lang3.Validate.notNull(argCollection);
		org.apache.commons.lang3.Validate.notNull(argRequest);
		org.apache.commons.lang3.Validate.notEmpty(argParameterName);
		String[] lclValues = argRequest.getParameterValues(argParameterName);
		if (lclValues == null || lclValues.length == 0) {
			return argCollection;
		}
		for (String lclValueUntrimmed : lclValues) {
			String lclValue = org.apache.commons.lang3.StringUtils.trimToNull(lclValueUntrimmed);
			if (lclValue == null) {
				continue;
			}
			java.lang.Integer lclId = java.lang.Integer.valueOf(lclValue);
			Contact lclResult = forId(lclId);
			org.apache.commons.lang3.Validate.notNull(lclResult, "'" + lclValue + "' is not a valid Id for any Contact");
			argCollection.add(lclResult);
		}
		return argCollection;
	}

	public <T extends java.util.Collection<? super Contact>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest) {
		return acquireFromHttpRequest(argCollection, argRequest, "contact_id");
	}

	public java.util.Collection<Contact> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		return acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
	}

	public java.util.Collection<Contact> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return multipleFromHttpRequest(argRequest, "contact_id");
	}

	public Contact[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		java.util.LinkedList<Contact> lclUs = acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
		return lclUs.toArray(createArray(lclUs.size()));
	}

	public Contact[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return arrayFromHttpRequest(argRequest, "contact_id");
	}

	@Override
	public Contact forUniqueString(String argUniqueString) {
		if (argUniqueString == null) {
			return null;
		}
		ContactOpal lclOpal = getOpalFactory().forUniqueString(argUniqueString);
		return lclOpal != null ? lclOpal.getUserFacing() : null;
	}
}
