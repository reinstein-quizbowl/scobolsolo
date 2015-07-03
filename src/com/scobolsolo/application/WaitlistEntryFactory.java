package com.scobolsolo.application;

import com.opal.*;
import com.scobolsolo.persistence.WaitlistEntryOpalFactory;
import com.scobolsolo.persistence.WaitlistEntryOpal;
import com.scobolsolo.persistence.OpalFactoryFactory;

public class WaitlistEntryFactory extends com.opal.AbstractFactory<WaitlistEntry, WaitlistEntryOpal> implements com.opal.FactoryCreator<WaitlistEntry>, com.opal.IdentityFactory<WaitlistEntry> {
	/** This static variable holds the Singleton instance of the Factory for application
		objects of this type.  It is private, but can be accessed via the getInstance() method.
	*/

	private static final WaitlistEntryFactory ourInstance = new WaitlistEntryFactory(OpalFactoryFactory.getInstance().getWaitlistEntryOpalFactory());

	public static WaitlistEntryFactory getInstance() { return ourInstance; }

	public WaitlistEntryOpalFactory getWaitlistEntryOpalFactory() { return (WaitlistEntryOpalFactory) getOpalFactory(); }

	protected WaitlistEntryFactory(OpalFactory<WaitlistEntry, WaitlistEntryOpal> argOpalFactory) {
		super(argOpalFactory);
	}

	@Override
	public Class<WaitlistEntry> getUserFacingInterface() {
		return WaitlistEntry.class;
	}

	@Override
	public WaitlistEntry create() {
		return getWaitlistEntryOpalFactory().create().getUserFacing();
	}

	public WaitlistEntry forId(java.lang.Integer argId) {
		WaitlistEntryOpal lclWaitlistEntryOpal = getWaitlistEntryOpalFactory().forId(argId);
		return (lclWaitlistEntryOpal == null) ? null : lclWaitlistEntryOpal.getUserFacing();
	}

	@Override
	public WaitlistEntry[] createArray(int argSize) {
		return new WaitlistEntry[argSize];
	}

	public WaitlistEntry fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		return fromHttpRequest(argRequest, "waitlist_entry_id");
	}

	public WaitlistEntry fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argId) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		String lclIdString = argRequest.getParameter(argId);
		if (org.apache.commons.lang3.StringUtils.isBlank(lclIdString)) {
			return null;
		}
		java.lang.Integer lclId = java.lang.Integer.valueOf(lclIdString);
		return forId(lclId);
	}

	public <T extends java.util.Collection<? super WaitlistEntry>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
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
			WaitlistEntry lclResult = forId(lclId);
			org.apache.commons.lang3.Validate.notNull(lclResult, "'" + lclValue + "' is not a valid Id for any WaitlistEntry");
			argCollection.add(lclResult);
		}
		return argCollection;
	}

	public <T extends java.util.Collection<? super WaitlistEntry>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest) {
		return acquireFromHttpRequest(argCollection, argRequest, "waitlist_entry_id");
	}

	public java.util.Collection<WaitlistEntry> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		return acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
	}

	public java.util.Collection<WaitlistEntry> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return multipleFromHttpRequest(argRequest, "waitlist_entry_id");
	}

	public WaitlistEntry[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		java.util.LinkedList<WaitlistEntry> lclUs = acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
		return lclUs.toArray(createArray(lclUs.size()));
	}

	public WaitlistEntry[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return arrayFromHttpRequest(argRequest, "waitlist_entry_id");
	}

	@Override
	public WaitlistEntry forUniqueString(String argUniqueString) {
		if (argUniqueString == null) {
			return null;
		}
		WaitlistEntryOpal lclOpal = getOpalFactory().forUniqueString(argUniqueString);
		return lclOpal != null ? lclOpal.getUserFacing() : null;
	}
}
