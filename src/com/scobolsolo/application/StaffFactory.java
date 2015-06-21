package com.scobolsolo.application;

import com.opal.*;
import com.scobolsolo.persistence.StaffOpalFactory;
import com.scobolsolo.persistence.StaffOpal;
import com.scobolsolo.persistence.OpalFactoryFactory;

public class StaffFactory extends com.opal.AbstractFactory<Staff, StaffOpal> implements com.opal.FactoryCreator<Staff>, com.opal.IdentityFactory<Staff> {
	/** This static variable holds the Singleton instance of the Factory for application
		objects of this type.  It is private, but can be accessed via the getInstance() method.
	*/

	private static final StaffFactory ourInstance = new StaffFactory(OpalFactoryFactory.getInstance().getStaffOpalFactory());

	public static StaffFactory getInstance() { return ourInstance; }

	public StaffOpalFactory getStaffOpalFactory() { return (StaffOpalFactory) getOpalFactory(); }

	protected StaffFactory(OpalFactory<Staff, StaffOpal> argOpalFactory) {
		super(argOpalFactory);
	}

	@Override
	public Class<Staff> getUserFacingInterface() {
		return Staff.class;
	}

	@Override
	public Staff create() {
		return getStaffOpalFactory().create().getUserFacing();
	}

	public Staff forId(java.lang.Integer argId) {
		StaffOpal lclStaffOpal = getStaffOpalFactory().forId(argId);
		return (lclStaffOpal == null) ? null : lclStaffOpal.getUserFacing();
	}

	@Override
	public Staff[] createArray(int argSize) {
		return new Staff[argSize];
	}

	public Staff fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		return fromHttpRequest(argRequest, "staff_id");
	}

	public Staff fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argId) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		String lclIdString = argRequest.getParameter(argId);
		if (lclIdString == null || lclIdString.equals("")) {
			return null;
		}
		java.lang.Integer lclId = java.lang.Integer.valueOf(lclIdString);
		return forId(lclId);
	}

	public <T extends java.util.Collection<? super Staff>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
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
			Staff lclResult = forId(lclId);
			org.apache.commons.lang3.Validate.notNull(lclResult, "'" + lclValue + "' is not a valid Id for any Staff");
			argCollection.add(lclResult);
		}
		return argCollection;
	}

	public <T extends java.util.Collection<? super Staff>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest) {
		return acquireFromHttpRequest(argCollection, argRequest, "staff_id");
	}

	public java.util.Collection<Staff> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		return acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
	}

	public java.util.Collection<Staff> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return multipleFromHttpRequest(argRequest, "staff_id");
	}

	public Staff[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		java.util.LinkedList<Staff> lclUs = acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
		return lclUs.toArray(createArray(lclUs.size()));
	}

	public Staff[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return arrayFromHttpRequest(argRequest, "staff_id");
	}

	@Override
	public Staff forUniqueString(String argUniqueString) {
		if (argUniqueString == null) {
			return null;
		}
		StaffOpal lclOpal = getOpalFactory().forUniqueString(argUniqueString);
		return lclOpal != null ? lclOpal.getUserFacing() : null;
	}
}
