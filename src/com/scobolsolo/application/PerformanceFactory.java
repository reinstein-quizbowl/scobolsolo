package com.scobolsolo.application;

import com.scobolsolo.persistence.PerformanceOpalFactory;
import com.scobolsolo.persistence.PerformanceOpal;
import com.scobolsolo.persistence.OpalFactoryFactory;

public class PerformanceFactory extends com.opal.AbstractFactory<Performance, PerformanceOpal> implements com.opal.FactoryCreator<Performance>, com.opal.IdentityFactory<Performance> {
	/** This static variable holds the Singleton instance of the Factory for application
		objects of this type.  It is private, but can be accessed via the getInstance() method.
	*/

	private static final PerformanceFactory ourInstance = new PerformanceFactory(OpalFactoryFactory.getInstance().getPerformanceOpalFactory());

	public static PerformanceFactory getInstance() { return ourInstance; }

	public PerformanceOpalFactory getPerformanceOpalFactory() { return (PerformanceOpalFactory) getOpalFactory(); }

	protected PerformanceFactory(com.opal.OpalFactory<Performance, PerformanceOpal> argOpalFactory) {
		super(argOpalFactory);
	}

	@Override
	public Class<Performance> getUserFacingInterface() {
		return Performance.class;
	}

	@Override
	public Performance create() {
		return getPerformanceOpalFactory().create().getUserFacing();
	}

	public Performance forGameIdPlayerId(java.lang.Integer argGameId, java.lang.Integer argPlayerId) {
		PerformanceOpal lclPerformanceOpal = getPerformanceOpalFactory().forGameIdPlayerId(argGameId, argPlayerId);
		return (lclPerformanceOpal == null) ? null : lclPerformanceOpal.getUserFacing();
	}

	public Performance forId(java.lang.Integer argId) {
		PerformanceOpal lclPerformanceOpal = getPerformanceOpalFactory().forId(argId);
		return (lclPerformanceOpal == null) ? null : lclPerformanceOpal.getUserFacing();
	}

	@Override
	public Performance[] createArray(int argSize) {
		return new Performance[argSize];
	}

	public Performance fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		return fromHttpRequest(argRequest, "performance_id");
	}

	public Performance fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argId) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		String lclIdString = argRequest.getParameter(argId);
		if (org.apache.commons.lang3.StringUtils.isBlank(lclIdString)) {
			return null;
		}
		java.lang.Integer lclId = java.lang.Integer.valueOf(lclIdString);
		return forId(lclId);
	}

	public <T extends java.util.Collection<? super Performance>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
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
			Performance lclResult = forId(lclId);
			org.apache.commons.lang3.Validate.notNull(lclResult, "'" + lclValue + "' is not a valid Id for any Performance");
			argCollection.add(lclResult);
		}
		return argCollection;
	}

	public <T extends java.util.Collection<? super Performance>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest) {
		return acquireFromHttpRequest(argCollection, argRequest, "performance_id");
	}

	public java.util.Collection<Performance> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		return acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
	}

	public java.util.Collection<Performance> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return multipleFromHttpRequest(argRequest, "performance_id");
	}

	public Performance[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		java.util.LinkedList<Performance> lclUs = acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
		return lclUs.toArray(createArray(lclUs.size()));
	}

	public Performance[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return arrayFromHttpRequest(argRequest, "performance_id");
	}

	@Override
	public Performance forUniqueString(String argUniqueString) {
		if (argUniqueString == null) {
			return null;
		}
		PerformanceOpal lclOpal = getOpalFactory().forUniqueString(argUniqueString);
		return lclOpal != null ? lclOpal.getUserFacing() : null;
	}
}
