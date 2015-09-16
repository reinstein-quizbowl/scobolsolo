package com.scobolsolo.application;

import com.scobolsolo.persistence.StandbyEntryOpalFactory;
import com.scobolsolo.persistence.StandbyEntryOpal;
import com.scobolsolo.persistence.OpalFactoryFactory;

public class StandbyEntryFactory extends com.opal.AbstractFactory<StandbyEntry, StandbyEntryOpal> implements com.opal.FactoryCreator<StandbyEntry>, com.opal.IdentityFactory<StandbyEntry> {
	/** This static variable holds the Singleton instance of the Factory for application
		objects of this type.  It is private, but can be accessed via the getInstance() method.
	*/

	private static final StandbyEntryFactory ourInstance = new StandbyEntryFactory(OpalFactoryFactory.getInstance().getStandbyEntryOpalFactory());

	public static StandbyEntryFactory getInstance() { return ourInstance; }

	public StandbyEntryOpalFactory getStandbyEntryOpalFactory() { return (StandbyEntryOpalFactory) getOpalFactory(); }

	protected StandbyEntryFactory(com.opal.OpalFactory<StandbyEntry, StandbyEntryOpal> argOpalFactory) {
		super(argOpalFactory);
	}

	@Override
	public Class<StandbyEntry> getUserFacingInterface() {
		return StandbyEntry.class;
	}

	@Override
	public StandbyEntry create() {
		return getStandbyEntryOpalFactory().create().getUserFacing();
	}

	public StandbyEntry forId(java.lang.Integer argId) {
		StandbyEntryOpal lclStandbyEntryOpal = getStandbyEntryOpalFactory().forId(argId);
		return (lclStandbyEntryOpal == null) ? null : lclStandbyEntryOpal.getUserFacing();
	}

	@Override
	public StandbyEntry[] createArray(int argSize) {
		return new StandbyEntry[argSize];
	}

	public StandbyEntry fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		return fromHttpRequest(argRequest, "standby_entry_id");
	}

	public StandbyEntry fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argId) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		String lclIdString = argRequest.getParameter(argId);
		if (org.apache.commons.lang3.StringUtils.isBlank(lclIdString)) {
			return null;
		}
		java.lang.Integer lclId = java.lang.Integer.valueOf(lclIdString);
		return forId(lclId);
	}

	public <T extends java.util.Collection<? super StandbyEntry>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
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
			StandbyEntry lclResult = forId(lclId);
			org.apache.commons.lang3.Validate.notNull(lclResult, "'" + lclValue + "' is not a valid Id for any StandbyEntry");
			argCollection.add(lclResult);
		}
		return argCollection;
	}

	public <T extends java.util.Collection<? super StandbyEntry>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest) {
		return acquireFromHttpRequest(argCollection, argRequest, "standby_entry_id");
	}

	public java.util.Collection<StandbyEntry> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		return acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
	}

	public java.util.Collection<StandbyEntry> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return multipleFromHttpRequest(argRequest, "standby_entry_id");
	}

	public StandbyEntry[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		java.util.LinkedList<StandbyEntry> lclUs = acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
		return lclUs.toArray(createArray(lclUs.size()));
	}

	public StandbyEntry[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return arrayFromHttpRequest(argRequest, "standby_entry_id");
	}

	@Override
	public StandbyEntry forUniqueString(String argUniqueString) {
		if (argUniqueString == null) {
			return null;
		}
		StandbyEntryOpal lclOpal = getOpalFactory().forUniqueString(argUniqueString);
		return lclOpal != null ? lclOpal.getUserFacing() : null;
	}
}
