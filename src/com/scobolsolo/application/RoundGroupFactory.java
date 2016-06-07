package com.scobolsolo.application;

import com.scobolsolo.persistence.RoundGroupOpalFactory;
import com.scobolsolo.persistence.RoundGroupOpal;
import com.scobolsolo.persistence.OpalFactoryFactory;

public class RoundGroupFactory extends com.opal.AbstractIdentityFactory<RoundGroup, RoundGroupOpal> implements com.opal.FactoryCreator<RoundGroup> {

	/** This static variable holds the Singleton instance of the Factory for application
		objects of this type.  It is private, but can be accessed via the getInstance() method.
	*/

	private static final RoundGroupFactory ourInstance = new RoundGroupFactory(OpalFactoryFactory.getInstance().getRoundGroupOpalFactory());

	public static RoundGroupFactory getInstance() { return ourInstance; }

	public RoundGroupOpalFactory getRoundGroupOpalFactory() { return (RoundGroupOpalFactory) getOpalFactory(); }

	protected RoundGroupFactory(com.opal.IdentityOpalFactory<RoundGroup, RoundGroupOpal> argOpalFactory) {
		super(argOpalFactory);
	}

	@Override
	public Class<RoundGroup> getUserFacingInterface() {
		return RoundGroup.class;
	}

	@Override
	public RoundGroup create() {
		return getRoundGroupOpalFactory().create().getUserFacing();
	}

	public RoundGroup forId(java.lang.Integer argId) {
		RoundGroupOpal lclRoundGroupOpal = getRoundGroupOpalFactory().forId(argId);
		return (lclRoundGroupOpal == null) ? null : lclRoundGroupOpal.getUserFacing();
	}

	@Override
	public RoundGroup[] createArray(int argSize) {
		return new RoundGroup[argSize];
	}

	public RoundGroup fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		return fromHttpRequest(argRequest, "round_group_id");
	}

	public RoundGroup fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argId) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		String lclIdString = argRequest.getParameter(argId);
		if (org.apache.commons.lang3.StringUtils.isBlank(lclIdString)) {
			return null;
		}
		java.lang.Integer lclId = java.lang.Integer.valueOf(lclIdString);
		return forId(lclId);
	}

	public <T extends java.util.Collection<? super RoundGroup>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
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
			RoundGroup lclResult = forId(lclId);
			org.apache.commons.lang3.Validate.notNull(lclResult, "'" + lclValue + "' is not a valid Id for any RoundGroup");
			argCollection.add(lclResult);
		}
		return argCollection;
	}

	public <T extends java.util.Collection<? super RoundGroup>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest) {
		return acquireFromHttpRequest(argCollection, argRequest, "round_group_id");
	}

	public java.util.Collection<RoundGroup> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		return acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
	}

	public java.util.Collection<RoundGroup> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return multipleFromHttpRequest(argRequest, "round_group_id");
	}

	public RoundGroup[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		java.util.LinkedList<RoundGroup> lclUs = acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
		return lclUs.toArray(createArray(lclUs.size()));
	}

	public RoundGroup[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return arrayFromHttpRequest(argRequest, "round_group_id");
	}

	@Override
	public RoundGroup forUniqueString(String argUniqueString) {
		if (argUniqueString == null) {
			return null;
		}
		RoundGroupOpal lclOpal = getOpalFactory().forUniqueString(argUniqueString);
		return lclOpal != null ? lclOpal.getUserFacing() : null;
	}
}
