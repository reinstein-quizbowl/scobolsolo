package com.scobolsolo.application;

import com.scobolsolo.persistence.StaffAssignmentOpalFactory;
import com.scobolsolo.persistence.StaffAssignmentOpal;
import com.scobolsolo.persistence.OpalFactoryFactory;

public class StaffAssignmentFactory extends com.opal.AbstractIdentityFactory<StaffAssignment, StaffAssignmentOpal> implements com.opal.FactoryCreator<StaffAssignment> {

	/** This static variable holds the Singleton instance of the Factory for application
		objects of this type.  It is private, but can be accessed via the getInstance() method.
	*/

	private static final StaffAssignmentFactory ourInstance = new StaffAssignmentFactory(OpalFactoryFactory.getInstance().getStaffAssignmentOpalFactory());

	public static StaffAssignmentFactory getInstance() { return ourInstance; }

	public StaffAssignmentOpalFactory getStaffAssignmentOpalFactory() { return (StaffAssignmentOpalFactory) getOpalFactory(); }

	protected StaffAssignmentFactory(com.opal.IdentityOpalFactory<StaffAssignment, StaffAssignmentOpal> argOpalFactory) {
		super(argOpalFactory);
	}

	@Override
	public Class<StaffAssignment> getUserFacingInterface() {
		return StaffAssignment.class;
	}

	@com.opal.annotation.RequiresActiveTransaction
	@Override
	public StaffAssignment create() {
		return getStaffAssignmentOpalFactory().create().getUserFacing();
	}

	public StaffAssignment forId(java.lang.Integer argId) {
		StaffAssignmentOpal lclStaffAssignmentOpal = getStaffAssignmentOpalFactory().forId(argId);
		return (lclStaffAssignmentOpal == null) ? null : lclStaffAssignmentOpal.getUserFacing();
	}

	@Override
	public StaffAssignment[] createArray(int argSize) {
		return new StaffAssignment[argSize];
	}

	public StaffAssignment fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		return fromHttpRequest(argRequest, "staff_assignment_id");
	}

	public StaffAssignment fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argId) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		String lclIdString = argRequest.getParameter(argId);
		if (org.apache.commons.lang3.StringUtils.isBlank(lclIdString)) {
			return null;
		}
		java.lang.Integer lclId = java.lang.Integer.valueOf(org.apache.commons.lang3.StringUtils.trimToNull(lclIdString));
		return forId(lclId);
	}

	public <T extends java.util.Collection<? super StaffAssignment>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
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
			java.lang.Integer lclId = java.lang.Integer.valueOf(org.apache.commons.lang3.StringUtils.trimToNull(lclValue));
			StaffAssignment lclResult = forId(lclId);
			org.apache.commons.lang3.Validate.notNull(lclResult, "'" + lclValue + "' is not a valid Id for any StaffAssignment");
			argCollection.add(lclResult);
		}
		return argCollection;
	}

	public <T extends java.util.Collection<? super StaffAssignment>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest) {
		return acquireFromHttpRequest(argCollection, argRequest, "staff_assignment_id");
	}

	public java.util.Collection<StaffAssignment> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		return acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
	}

	public java.util.Collection<StaffAssignment> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return multipleFromHttpRequest(argRequest, "staff_assignment_id");
	}

	public StaffAssignment[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		java.util.LinkedList<StaffAssignment> lclUs = acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
		return lclUs.toArray(createArray(lclUs.size()));
	}

	public StaffAssignment[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return arrayFromHttpRequest(argRequest, "staff_assignment_id");
	}

	@Override
	public StaffAssignment forUniqueString(String argUniqueString) {
		if (argUniqueString == null) {
			return null;
		}
		StaffAssignmentOpal lclOpal = getOpalFactory().forUniqueString(argUniqueString);
		return lclOpal != null ? lclOpal.getUserFacing() : null;
	}
}
