package com.scobolsolo.application;

import com.scobolsolo.persistence.BuzzerOpalFactory;
import com.scobolsolo.persistence.BuzzerOpal;
import com.scobolsolo.persistence.OpalFactoryFactory;

public class BuzzerFactory extends com.opal.AbstractFactory<Buzzer, BuzzerOpal> implements com.opal.FactoryCreator<Buzzer>, com.opal.IdentityFactory<Buzzer> {
	/** This static variable holds the Singleton instance of the Factory for application
		objects of this type.  It is private, but can be accessed via the getInstance() method.
	*/

	private static final BuzzerFactory ourInstance = new BuzzerFactory(OpalFactoryFactory.getInstance().getBuzzerOpalFactory());

	public static BuzzerFactory getInstance() { return ourInstance; }

	public BuzzerOpalFactory getBuzzerOpalFactory() { return (BuzzerOpalFactory) getOpalFactory(); }

	protected BuzzerFactory(com.opal.OpalFactory<Buzzer, BuzzerOpal> argOpalFactory) {
		super(argOpalFactory);
	}

	@Override
	public Class<Buzzer> getUserFacingInterface() {
		return Buzzer.class;
	}

	@Override
	public Buzzer create() {
		return getBuzzerOpalFactory().create().getUserFacing();
	}

	public Buzzer forId(java.lang.Integer argId) {
		BuzzerOpal lclBuzzerOpal = getBuzzerOpalFactory().forId(argId);
		return (lclBuzzerOpal == null) ? null : lclBuzzerOpal.getUserFacing();
	}

	@Override
	public Buzzer[] createArray(int argSize) {
		return new Buzzer[argSize];
	}

	public Buzzer fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		return fromHttpRequest(argRequest, "buzzer_id");
	}

	public Buzzer fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argId) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		String lclIdString = argRequest.getParameter(argId);
		if (org.apache.commons.lang3.StringUtils.isBlank(lclIdString)) {
			return null;
		}
		java.lang.Integer lclId = java.lang.Integer.valueOf(lclIdString);
		return forId(lclId);
	}

	public <T extends java.util.Collection<? super Buzzer>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
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
			Buzzer lclResult = forId(lclId);
			org.apache.commons.lang3.Validate.notNull(lclResult, "'" + lclValue + "' is not a valid Id for any Buzzer");
			argCollection.add(lclResult);
		}
		return argCollection;
	}

	public <T extends java.util.Collection<? super Buzzer>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest) {
		return acquireFromHttpRequest(argCollection, argRequest, "buzzer_id");
	}

	public java.util.Collection<Buzzer> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		return acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
	}

	public java.util.Collection<Buzzer> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return multipleFromHttpRequest(argRequest, "buzzer_id");
	}

	public Buzzer[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		java.util.LinkedList<Buzzer> lclUs = acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
		return lclUs.toArray(createArray(lclUs.size()));
	}

	public Buzzer[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return arrayFromHttpRequest(argRequest, "buzzer_id");
	}

	@Override
	public Buzzer forUniqueString(String argUniqueString) {
		if (argUniqueString == null) {
			return null;
		}
		BuzzerOpal lclOpal = getOpalFactory().forUniqueString(argUniqueString);
		return lclOpal != null ? lclOpal.getUserFacing() : null;
	}
}
