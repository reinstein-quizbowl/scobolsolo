package com.scobolsolo.application;

import com.scobolsolo.persistence.MatchOpalFactory;
import com.scobolsolo.persistence.MatchOpal;
import com.scobolsolo.persistence.OpalFactoryFactory;

public class MatchFactory extends com.opal.AbstractFactory<Match, MatchOpal> implements com.opal.FactoryCreator<Match>, com.opal.IdentityFactory<Match> {
	/** This static variable holds the Singleton instance of the Factory for application
		objects of this type.  It is private, but can be accessed via the getInstance() method.
	*/

	private static final MatchFactory ourInstance = new MatchFactory(OpalFactoryFactory.getInstance().getMatchOpalFactory());

	public static MatchFactory getInstance() { return ourInstance; }

	public MatchOpalFactory getMatchOpalFactory() { return (MatchOpalFactory) getOpalFactory(); }

	protected MatchFactory(com.opal.OpalFactory<Match, MatchOpal> argOpalFactory) {
		super(argOpalFactory);
	}

	@Override
	public Class<Match> getUserFacingInterface() {
		return Match.class;
	}

	@Override
	public Match create() {
		return getMatchOpalFactory().create().getUserFacing();
	}

	public Match forId(java.lang.Integer argId) {
		MatchOpal lclMatchOpal = getMatchOpalFactory().forId(argId);
		return (lclMatchOpal == null) ? null : lclMatchOpal.getUserFacing();
	}

	public Match forRoundIdLosingCardId(java.lang.Integer argRoundId, java.lang.Integer argLosingCardId) {
		MatchOpal lclMatchOpal = getMatchOpalFactory().forRoundIdLosingCardId(argRoundId, argLosingCardId);
		return (lclMatchOpal == null) ? null : lclMatchOpal.getUserFacing();
	}

	public Match forRoundIdWinningCardId(java.lang.Integer argRoundId, java.lang.Integer argWinningCardId) {
		MatchOpal lclMatchOpal = getMatchOpalFactory().forRoundIdWinningCardId(argRoundId, argWinningCardId);
		return (lclMatchOpal == null) ? null : lclMatchOpal.getUserFacing();
	}

	@Override
	public Match[] createArray(int argSize) {
		return new Match[argSize];
	}

	public Match fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		return fromHttpRequest(argRequest, "match_id");
	}

	public Match fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argId) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		String lclIdString = argRequest.getParameter(argId);
		if (org.apache.commons.lang3.StringUtils.isBlank(lclIdString)) {
			return null;
		}
		java.lang.Integer lclId = java.lang.Integer.valueOf(lclIdString);
		return forId(lclId);
	}

	public <T extends java.util.Collection<? super Match>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
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
			Match lclResult = forId(lclId);
			org.apache.commons.lang3.Validate.notNull(lclResult, "'" + lclValue + "' is not a valid Id for any Match");
			argCollection.add(lclResult);
		}
		return argCollection;
	}

	public <T extends java.util.Collection<? super Match>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest) {
		return acquireFromHttpRequest(argCollection, argRequest, "match_id");
	}

	public java.util.Collection<Match> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		return acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
	}

	public java.util.Collection<Match> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return multipleFromHttpRequest(argRequest, "match_id");
	}

	public Match[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		java.util.LinkedList<Match> lclUs = acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
		return lclUs.toArray(createArray(lclUs.size()));
	}

	public Match[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return arrayFromHttpRequest(argRequest, "match_id");
	}

	@Override
	public Match forUniqueString(String argUniqueString) {
		if (argUniqueString == null) {
			return null;
		}
		MatchOpal lclOpal = getOpalFactory().forUniqueString(argUniqueString);
		return lclOpal != null ? lclOpal.getUserFacing() : null;
	}
}
