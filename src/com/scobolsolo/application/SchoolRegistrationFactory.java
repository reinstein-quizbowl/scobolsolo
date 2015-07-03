package com.scobolsolo.application;

import com.opal.*;
import com.scobolsolo.persistence.SchoolRegistrationOpalFactory;
import com.scobolsolo.persistence.SchoolRegistrationOpal;
import com.scobolsolo.persistence.OpalFactoryFactory;

public class SchoolRegistrationFactory extends com.opal.AbstractFactory<SchoolRegistration, SchoolRegistrationOpal> implements com.opal.FactoryCreator<SchoolRegistration>, com.opal.IdentityFactory<SchoolRegistration> {
	/** This static variable holds the Singleton instance of the Factory for application
		objects of this type.  It is private, but can be accessed via the getInstance() method.
	*/

	private static final SchoolRegistrationFactory ourInstance = new SchoolRegistrationFactory(OpalFactoryFactory.getInstance().getSchoolRegistrationOpalFactory());

	public static SchoolRegistrationFactory getInstance() { return ourInstance; }

	public SchoolRegistrationOpalFactory getSchoolRegistrationOpalFactory() { return (SchoolRegistrationOpalFactory) getOpalFactory(); }

	protected SchoolRegistrationFactory(OpalFactory<SchoolRegistration, SchoolRegistrationOpal> argOpalFactory) {
		super(argOpalFactory);
	}

	@Override
	public Class<SchoolRegistration> getUserFacingInterface() {
		return SchoolRegistration.class;
	}

	@Override
	public SchoolRegistration create() {
		return getSchoolRegistrationOpalFactory().create().getUserFacing();
	}

	public SchoolRegistration forId(java.lang.Integer argId) {
		SchoolRegistrationOpal lclSchoolRegistrationOpal = getSchoolRegistrationOpalFactory().forId(argId);
		return (lclSchoolRegistrationOpal == null) ? null : lclSchoolRegistrationOpal.getUserFacing();
	}

	@Override
	public SchoolRegistration[] createArray(int argSize) {
		return new SchoolRegistration[argSize];
	}

	public SchoolRegistration fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		return fromHttpRequest(argRequest, "school_registration_id");
	}

	public SchoolRegistration fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argId) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		String lclIdString = argRequest.getParameter(argId);
		if (org.apache.commons.lang3.StringUtils.isBlank(lclIdString)) {
			return null;
		}
		java.lang.Integer lclId = java.lang.Integer.valueOf(lclIdString);
		return forId(lclId);
	}

	public <T extends java.util.Collection<? super SchoolRegistration>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
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
			SchoolRegistration lclResult = forId(lclId);
			org.apache.commons.lang3.Validate.notNull(lclResult, "'" + lclValue + "' is not a valid Id for any SchoolRegistration");
			argCollection.add(lclResult);
		}
		return argCollection;
	}

	public <T extends java.util.Collection<? super SchoolRegistration>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest) {
		return acquireFromHttpRequest(argCollection, argRequest, "school_registration_id");
	}

	public java.util.Collection<SchoolRegistration> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		return acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
	}

	public java.util.Collection<SchoolRegistration> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return multipleFromHttpRequest(argRequest, "school_registration_id");
	}

	public SchoolRegistration[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		java.util.LinkedList<SchoolRegistration> lclUs = acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
		return lclUs.toArray(createArray(lclUs.size()));
	}

	public SchoolRegistration[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return arrayFromHttpRequest(argRequest, "school_registration_id");
	}

	@Override
	public SchoolRegistration forUniqueString(String argUniqueString) {
		if (argUniqueString == null) {
			return null;
		}
		SchoolRegistrationOpal lclOpal = getOpalFactory().forUniqueString(argUniqueString);
		return lclOpal != null ? lclOpal.getUserFacing() : null;
	}
}
