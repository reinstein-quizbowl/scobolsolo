package com.scobolsolo.application;

import com.scobolsolo.persistence.RoundOpalFactory;
import com.scobolsolo.persistence.RoundOpal;
import com.scobolsolo.persistence.OpalFactoryFactory;

public class RoundFactory extends com.opal.AbstractIdentityFactory<Round, RoundOpal> implements com.opal.FactoryCreator<Round> {

	/** This static variable holds the Singleton instance of the Factory for application
		objects of this type.  It is private, but can be accessed via the getInstance() method.
	*/

	private static final RoundFactory ourInstance = new RoundFactory(OpalFactoryFactory.getInstance().getRoundOpalFactory());

	public static RoundFactory getInstance() { return ourInstance; }

	public RoundOpalFactory getRoundOpalFactory() { return (RoundOpalFactory) getOpalFactory(); }

	protected RoundFactory(com.opal.IdentityOpalFactory<Round, RoundOpal> argOpalFactory) {
		super(argOpalFactory);
	}

	@Override
	public Class<Round> getUserFacingInterface() {
		return Round.class;
	}

	@com.opal.annotation.RequiresActiveTransaction
	@Override
	public Round create() {
		return getRoundOpalFactory().create().getUserFacing();
	}

	public Round forId(java.lang.Integer argId) {
		RoundOpal lclRoundOpal = getRoundOpalFactory().forId(argId);
		return (lclRoundOpal == null) ? null : lclRoundOpal.getUserFacing();
	}

	@Override
	public Round[] createArray(int argSize) {
		return new Round[argSize];
	}

	public Round fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		return fromHttpRequest(argRequest, "round_id");
	}

	public Round fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argId) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		String lclIdString = argRequest.getParameter(argId);
		if (org.apache.commons.lang3.StringUtils.isBlank(lclIdString)) {
			return null;
		}
		java.lang.Integer lclId = java.lang.Integer.valueOf(org.apache.commons.lang3.StringUtils.trimToNull(lclIdString));
		return forId(lclId);
	}

	public <T extends java.util.Collection<? super Round>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
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
			Round lclResult = forId(lclId);
			org.apache.commons.lang3.Validate.notNull(lclResult, "'" + lclValue + "' is not a valid Id for any Round");
			argCollection.add(lclResult);
		}
		return argCollection;
	}

	public <T extends java.util.Collection<? super Round>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest) {
		return acquireFromHttpRequest(argCollection, argRequest, "round_id");
	}

	public java.util.Collection<Round> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		return acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
	}

	public java.util.Collection<Round> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return multipleFromHttpRequest(argRequest, "round_id");
	}

	public Round[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		java.util.LinkedList<Round> lclUs = acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
		return lclUs.toArray(createArray(lclUs.size()));
	}

	public Round[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return arrayFromHttpRequest(argRequest, "round_id");
	}

	@Override
	public Round forUniqueString(String argUniqueString) {
		if (argUniqueString == null) {
			return null;
		}
		RoundOpal lclOpal = getOpalFactory().forUniqueString(argUniqueString);
		return lclOpal != null ? lclOpal.getUserFacing() : null;
	}
}
