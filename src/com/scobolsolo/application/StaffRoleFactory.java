package com.scobolsolo.application;

import com.scobolsolo.persistence.StaffRoleOpalFactory;
import com.scobolsolo.persistence.StaffRoleOpal;
import com.scobolsolo.persistence.OpalFactoryFactory;

public class StaffRoleFactory extends com.opal.AbstractFactory<StaffRole, StaffRoleOpal> implements com.opal.FactoryCreator<StaffRole>, com.opal.IdentityFactory<StaffRole> {
	/** This static variable holds the Singleton instance of the Factory for application
		objects of this type.  It is private, but can be accessed via the getInstance() method.
	*/

	private static final StaffRoleFactory ourInstance = new StaffRoleFactory(OpalFactoryFactory.getInstance().getStaffRoleOpalFactory());

	public static StaffRoleFactory getInstance() { return ourInstance; }

	public StaffRoleOpalFactory getStaffRoleOpalFactory() { return (StaffRoleOpalFactory) getOpalFactory(); }

	protected StaffRoleFactory(com.opal.OpalFactory<StaffRole, StaffRoleOpal> argOpalFactory) {
		super(argOpalFactory);
	}

	@Override
	public Class<StaffRole> getUserFacingInterface() {
		return StaffRole.class;
	}


	/* These Singleton objects are initialized on system start up to refer to unchanging objects
		from the database.
	*/

	public static final StaffRole MODERATOR() { return getInstance().forCode("MODERATOR"); }
	public static final StaffRole ON_CALL() { return getInstance().forCode("ON_CALL"); }
	public static final StaffRole RUNNER() { return getInstance().forCode("RUNNER"); }
	public static final StaffRole SCOREKEEPER() { return getInstance().forCode("SCOREKEEPER"); }
	public static final StaffRole STATISTICIAN() { return getInstance().forCode("STATISTICIAN"); }
	public static final StaffRole TOURNAMENT_DIRECTOR() { return getInstance().forCode("TOURNAMENT_DIRECTOR"); }

	@Override
	public StaffRole create() {
		return getStaffRoleOpalFactory().create().getUserFacing();
	}

	public StaffRole forName(java.lang.String argName) {
		StaffRoleOpal lclStaffRoleOpal = getStaffRoleOpalFactory().forName(argName);
		return (lclStaffRoleOpal == null) ? null : lclStaffRoleOpal.getUserFacing();
	}

	public StaffRole forCode(java.lang.String argCode) {
		StaffRoleOpal lclStaffRoleOpal = getStaffRoleOpalFactory().forCode(argCode);
		return (lclStaffRoleOpal == null) ? null : lclStaffRoleOpal.getUserFacing();
	}

	public StaffRole forShortName(java.lang.String argShortName) {
		StaffRoleOpal lclStaffRoleOpal = getStaffRoleOpalFactory().forShortName(argShortName);
		return (lclStaffRoleOpal == null) ? null : lclStaffRoleOpal.getUserFacing();
	}

	public StaffRole forVeryShortName(java.lang.String argVeryShortName) {
		StaffRoleOpal lclStaffRoleOpal = getStaffRoleOpalFactory().forVeryShortName(argVeryShortName);
		return (lclStaffRoleOpal == null) ? null : lclStaffRoleOpal.getUserFacing();
	}

	@Override
	public StaffRole[] createArray(int argSize) {
		return new StaffRole[argSize];
	}

	public StaffRole fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		return fromHttpRequest(argRequest, "staff_role_code");
	}

	public StaffRole fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argCode) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		String lclCodeString = argRequest.getParameter(argCode);
		if (org.apache.commons.lang3.StringUtils.isBlank(lclCodeString)) {
			return null;
		}
		java.lang.String lclCode = lclCodeString;
		return forCode(lclCode);
	}

	public <T extends java.util.Collection<? super StaffRole>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
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
			StaffRole lclResult = forCode(lclCode);
			org.apache.commons.lang3.Validate.notNull(lclResult, "'" + lclValue + "' is not a valid Code for any StaffRole");
			argCollection.add(lclResult);
		}
		return argCollection;
	}

	public <T extends java.util.Collection<? super StaffRole>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest) {
		return acquireFromHttpRequest(argCollection, argRequest, "staff_role_code");
	}

	public java.util.Collection<StaffRole> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		return acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
	}

	public java.util.Collection<StaffRole> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return multipleFromHttpRequest(argRequest, "staff_role_code");
	}

	public StaffRole[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		java.util.LinkedList<StaffRole> lclUs = acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
		return lclUs.toArray(createArray(lclUs.size()));
	}

	public StaffRole[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return arrayFromHttpRequest(argRequest, "staff_role_code");
	}

	@Override
	public StaffRole forUniqueString(String argUniqueString) {
		if (argUniqueString == null) {
			return null;
		}
		StaffRoleOpal lclOpal = getOpalFactory().forUniqueString(argUniqueString);
		return lclOpal != null ? lclOpal.getUserFacing() : null;
	}
}
