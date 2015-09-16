package com.scobolsolo.application;

import com.scobolsolo.persistence.SchoolOpalFactory;
import com.scobolsolo.persistence.SchoolOpal;
import com.scobolsolo.persistence.OpalFactoryFactory;

public class SchoolFactory extends com.opal.AbstractFactory<School, SchoolOpal> implements com.opal.FactoryCreator<School>, com.opal.IdentityFactory<School> {
	/** This static variable holds the Singleton instance of the Factory for application
		objects of this type.  It is private, but can be accessed via the getInstance() method.
	*/

	private static final SchoolFactory ourInstance = new SchoolFactory(OpalFactoryFactory.getInstance().getSchoolOpalFactory());

	public static SchoolFactory getInstance() { return ourInstance; }

	public SchoolOpalFactory getSchoolOpalFactory() { return (SchoolOpalFactory) getOpalFactory(); }

	protected SchoolFactory(com.opal.OpalFactory<School, SchoolOpal> argOpalFactory) {
		super(argOpalFactory);
	}

	@Override
	public Class<School> getUserFacingInterface() {
		return School.class;
	}

	@Override
	public School create() {
		return getSchoolOpalFactory().create().getUserFacing();
	}

	public School forName(java.lang.String argName) {
		SchoolOpal lclSchoolOpal = getSchoolOpalFactory().forName(argName);
		return (lclSchoolOpal == null) ? null : lclSchoolOpal.getUserFacing();
	}

	public School forId(java.lang.Integer argId) {
		SchoolOpal lclSchoolOpal = getSchoolOpalFactory().forId(argId);
		return (lclSchoolOpal == null) ? null : lclSchoolOpal.getUserFacing();
	}

	public School forShortName(java.lang.String argShortName) {
		SchoolOpal lclSchoolOpal = getSchoolOpalFactory().forShortName(argShortName);
		return (lclSchoolOpal == null) ? null : lclSchoolOpal.getUserFacing();
	}

	public School forVeryShortName(java.lang.String argVeryShortName) {
		SchoolOpal lclSchoolOpal = getSchoolOpalFactory().forVeryShortName(argVeryShortName);
		return (lclSchoolOpal == null) ? null : lclSchoolOpal.getUserFacing();
	}

	@Override
	public School[] createArray(int argSize) {
		return new School[argSize];
	}

	public School fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		return fromHttpRequest(argRequest, "school_id");
	}

	public School fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argId) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		String lclIdString = argRequest.getParameter(argId);
		if (org.apache.commons.lang3.StringUtils.isBlank(lclIdString)) {
			return null;
		}
		java.lang.Integer lclId = java.lang.Integer.valueOf(lclIdString);
		return forId(lclId);
	}

	public <T extends java.util.Collection<? super School>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
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
			School lclResult = forId(lclId);
			org.apache.commons.lang3.Validate.notNull(lclResult, "'" + lclValue + "' is not a valid Id for any School");
			argCollection.add(lclResult);
		}
		return argCollection;
	}

	public <T extends java.util.Collection<? super School>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest) {
		return acquireFromHttpRequest(argCollection, argRequest, "school_id");
	}

	public java.util.Collection<School> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		return acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
	}

	public java.util.Collection<School> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return multipleFromHttpRequest(argRequest, "school_id");
	}

	public School[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		java.util.LinkedList<School> lclUs = acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
		return lclUs.toArray(createArray(lclUs.size()));
	}

	public School[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return arrayFromHttpRequest(argRequest, "school_id");
	}

	@Override
	public School forUniqueString(String argUniqueString) {
		if (argUniqueString == null) {
			return null;
		}
		SchoolOpal lclOpal = getOpalFactory().forUniqueString(argUniqueString);
		return lclOpal != null ? lclOpal.getUserFacing() : null;
	}
}
