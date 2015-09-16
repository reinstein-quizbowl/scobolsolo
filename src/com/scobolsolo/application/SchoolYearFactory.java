package com.scobolsolo.application;

import com.scobolsolo.persistence.SchoolYearOpalFactory;
import com.scobolsolo.persistence.SchoolYearOpal;
import com.scobolsolo.persistence.OpalFactoryFactory;

public class SchoolYearFactory extends com.opal.AbstractFactory<SchoolYear, SchoolYearOpal> implements com.opal.FactoryCreator<SchoolYear>, com.opal.IdentityFactory<SchoolYear> {
	/** This static variable holds the Singleton instance of the Factory for application
		objects of this type.  It is private, but can be accessed via the getInstance() method.
	*/

	private static final SchoolYearFactory ourInstance = new SchoolYearFactory(OpalFactoryFactory.getInstance().getSchoolYearOpalFactory());

	public static SchoolYearFactory getInstance() { return ourInstance; }

	public SchoolYearOpalFactory getSchoolYearOpalFactory() { return (SchoolYearOpalFactory) getOpalFactory(); }

	protected SchoolYearFactory(com.opal.OpalFactory<SchoolYear, SchoolYearOpal> argOpalFactory) {
		super(argOpalFactory);
	}

	@Override
	public Class<SchoolYear> getUserFacingInterface() {
		return SchoolYear.class;
	}


	/* These Singleton objects are initialized on system start up to refer to unchanging objects
		from the database.
	*/

	public static final SchoolYear _10() { return getInstance().forCode("10"); }
	public static final SchoolYear _11() { return getInstance().forCode("11"); }
	public static final SchoolYear _12() { return getInstance().forCode("12"); }
	public static final SchoolYear _6() { return getInstance().forCode("6"); }
	public static final SchoolYear _7() { return getInstance().forCode("7"); }
	public static final SchoolYear _8() { return getInstance().forCode("8"); }
	public static final SchoolYear _9() { return getInstance().forCode("9"); }

	@Override
	public SchoolYear create() {
		return getSchoolYearOpalFactory().create().getUserFacing();
	}

	public SchoolYear forName(java.lang.String argName) {
		SchoolYearOpal lclSchoolYearOpal = getSchoolYearOpalFactory().forName(argName);
		return (lclSchoolYearOpal == null) ? null : lclSchoolYearOpal.getUserFacing();
	}

	public SchoolYear forCode(java.lang.String argCode) {
		SchoolYearOpal lclSchoolYearOpal = getSchoolYearOpalFactory().forCode(argCode);
		return (lclSchoolYearOpal == null) ? null : lclSchoolYearOpal.getUserFacing();
	}

	public SchoolYear forShortName(java.lang.String argShortName) {
		SchoolYearOpal lclSchoolYearOpal = getSchoolYearOpalFactory().forShortName(argShortName);
		return (lclSchoolYearOpal == null) ? null : lclSchoolYearOpal.getUserFacing();
	}

	public SchoolYear forVeryShortName(java.lang.String argVeryShortName) {
		SchoolYearOpal lclSchoolYearOpal = getSchoolYearOpalFactory().forVeryShortName(argVeryShortName);
		return (lclSchoolYearOpal == null) ? null : lclSchoolYearOpal.getUserFacing();
	}

	@Override
	public SchoolYear[] createArray(int argSize) {
		return new SchoolYear[argSize];
	}

	public SchoolYear fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		return fromHttpRequest(argRequest, "school_year_code");
	}

	public SchoolYear fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argCode) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		String lclCodeString = argRequest.getParameter(argCode);
		if (org.apache.commons.lang3.StringUtils.isBlank(lclCodeString)) {
			return null;
		}
		java.lang.String lclCode = lclCodeString;
		return forCode(lclCode);
	}

	public <T extends java.util.Collection<? super SchoolYear>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
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
			java.lang.String lclCode = lclValue;
			SchoolYear lclResult = forCode(lclCode);
			org.apache.commons.lang3.Validate.notNull(lclResult, "'" + lclValue + "' is not a valid Code for any SchoolYear");
			argCollection.add(lclResult);
		}
		return argCollection;
	}

	public <T extends java.util.Collection<? super SchoolYear>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest) {
		return acquireFromHttpRequest(argCollection, argRequest, "school_year_code");
	}

	public java.util.Collection<SchoolYear> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		return acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
	}

	public java.util.Collection<SchoolYear> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return multipleFromHttpRequest(argRequest, "school_year_code");
	}

	public SchoolYear[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		java.util.LinkedList<SchoolYear> lclUs = acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
		return lclUs.toArray(createArray(lclUs.size()));
	}

	public SchoolYear[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return arrayFromHttpRequest(argRequest, "school_year_code");
	}

	@Override
	public SchoolYear forUniqueString(String argUniqueString) {
		if (argUniqueString == null) {
			return null;
		}
		SchoolYearOpal lclOpal = getOpalFactory().forUniqueString(argUniqueString);
		return lclOpal != null ? lclOpal.getUserFacing() : null;
	}
}
