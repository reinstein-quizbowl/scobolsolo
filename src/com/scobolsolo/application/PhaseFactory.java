package com.scobolsolo.application;

import com.scobolsolo.persistence.PhaseOpalFactory;
import com.scobolsolo.persistence.PhaseOpal;
import com.scobolsolo.persistence.OpalFactoryFactory;

public class PhaseFactory extends com.opal.AbstractFactory<Phase, PhaseOpal> implements com.opal.FactoryCreator<Phase>, com.opal.IdentityFactory<Phase> {
	/** This static variable holds the Singleton instance of the Factory for application
		objects of this type.  It is private, but can be accessed via the getInstance() method.
	*/

	private static final PhaseFactory ourInstance = new PhaseFactory(OpalFactoryFactory.getInstance().getPhaseOpalFactory());

	public static PhaseFactory getInstance() { return ourInstance; }

	public PhaseOpalFactory getPhaseOpalFactory() { return (PhaseOpalFactory) getOpalFactory(); }

	protected PhaseFactory(com.opal.OpalFactory<Phase, PhaseOpal> argOpalFactory) {
		super(argOpalFactory);
	}

	@Override
	public Class<Phase> getUserFacingInterface() {
		return Phase.class;
	}

	@Override
	public Phase create() {
		return getPhaseOpalFactory().create().getUserFacing();
	}

	public Phase forId(java.lang.Integer argId) {
		PhaseOpal lclPhaseOpal = getPhaseOpalFactory().forId(argId);
		return (lclPhaseOpal == null) ? null : lclPhaseOpal.getUserFacing();
	}

	public Phase forTournamentCodeName(java.lang.String argTournamentCode, java.lang.String argName) {
		PhaseOpal lclPhaseOpal = getPhaseOpalFactory().forTournamentCodeName(argTournamentCode, argName);
		return (lclPhaseOpal == null) ? null : lclPhaseOpal.getUserFacing();
	}

	public Phase forTournamentCodeShortName(java.lang.String argTournamentCode, java.lang.String argShortName) {
		PhaseOpal lclPhaseOpal = getPhaseOpalFactory().forTournamentCodeShortName(argTournamentCode, argShortName);
		return (lclPhaseOpal == null) ? null : lclPhaseOpal.getUserFacing();
	}

	@Override
	public Phase[] createArray(int argSize) {
		return new Phase[argSize];
	}

	public Phase fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		return fromHttpRequest(argRequest, "phase_id");
	}

	public Phase fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argId) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		String lclIdString = argRequest.getParameter(argId);
		if (org.apache.commons.lang3.StringUtils.isBlank(lclIdString)) {
			return null;
		}
		java.lang.Integer lclId = java.lang.Integer.valueOf(lclIdString);
		return forId(lclId);
	}

	public <T extends java.util.Collection<? super Phase>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
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
			Phase lclResult = forId(lclId);
			org.apache.commons.lang3.Validate.notNull(lclResult, "'" + lclValue + "' is not a valid Id for any Phase");
			argCollection.add(lclResult);
		}
		return argCollection;
	}

	public <T extends java.util.Collection<? super Phase>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest) {
		return acquireFromHttpRequest(argCollection, argRequest, "phase_id");
	}

	public java.util.Collection<Phase> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		return acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
	}

	public java.util.Collection<Phase> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return multipleFromHttpRequest(argRequest, "phase_id");
	}

	public Phase[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		java.util.LinkedList<Phase> lclUs = acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
		return lclUs.toArray(createArray(lclUs.size()));
	}

	public Phase[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return arrayFromHttpRequest(argRequest, "phase_id");
	}

	@Override
	public Phase forUniqueString(String argUniqueString) {
		if (argUniqueString == null) {
			return null;
		}
		PhaseOpal lclOpal = getOpalFactory().forUniqueString(argUniqueString);
		return lclOpal != null ? lclOpal.getUserFacing() : null;
	}
}
