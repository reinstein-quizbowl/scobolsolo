package com.scobolsolo.application;

import com.opal.*;
import com.scobolsolo.persistence.CardOpalFactory;
import com.scobolsolo.persistence.CardOpal;
import com.scobolsolo.persistence.OpalFactoryFactory;

public class CardFactory extends com.opal.AbstractFactory<Card, CardOpal> implements com.opal.FactoryCreator<Card> , com.opal.IdentityFactory<Card> {
	/** This static variable holds the Singleton instance of the Factory for application
		objects of this type.  It is private, but can be accessed via the getInstance() method.
	*/

	private static final CardFactory ourInstance = new CardFactory(OpalFactoryFactory.getInstance().getCardOpalFactory());

	public static CardFactory getInstance() { return ourInstance; }

	public CardOpalFactory getCardOpalFactory() { return (CardOpalFactory) getOpalFactory(); }

	protected CardFactory(OpalFactory<Card, CardOpal> argOpalFactory) {
		super(argOpalFactory);
	}

	@Override
	public Class<Card> getUserFacingInterface() {
		return Card.class;
	}

	@Override
	public Card create() {
		return getCardOpalFactory().create().getUserFacing();
	}

	public Card forNamePhaseId(java.lang.String argName, java.lang.Integer argPhaseId) {
		CardOpal lclCardOpal = getCardOpalFactory().forNamePhaseId(argName, argPhaseId);
		return (lclCardOpal == null) ? null : lclCardOpal.getUserFacing();
	}

	public Card forShortNamePhaseId(java.lang.String argShortName, java.lang.Integer argPhaseId) {
		CardOpal lclCardOpal = getCardOpalFactory().forShortNamePhaseId(argShortName, argPhaseId);
		return (lclCardOpal == null) ? null : lclCardOpal.getUserFacing();
	}

	public Card forId(java.lang.Integer argId) {
		CardOpal lclCardOpal = getCardOpalFactory().forId(argId);
		return (lclCardOpal == null) ? null : lclCardOpal.getUserFacing();
	}

	@Override
	public Card[] createArray(int argSize) {
		return new Card[argSize];
	}

	public Card fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		return fromHttpRequest(argRequest, "card_id");
	}

	public Card fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argId) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		String lclIdString = argRequest.getParameter(argId);
		if (lclIdString == null || lclIdString.equals("")) {
			return null;
		}
		java.lang.Integer lclId = java.lang.Integer.valueOf(lclIdString);
		return forId(lclId);
	}

	public <T extends java.util.Collection<? super Card>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
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
			Card lclResult = forId(lclId);
			org.apache.commons.lang3.Validate.notNull(lclResult, "'" + lclValue + "' is not a valid Id for any Card");
			argCollection.add(lclResult);
		}
		return argCollection;
	}

	public <T extends java.util.Collection<? super Card>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest) {
		return acquireFromHttpRequest(argCollection, argRequest, "card_id");
	}

	public java.util.Collection<Card> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		return acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
	}

	public java.util.Collection<Card> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return multipleFromHttpRequest(argRequest, "card_id");
	}

	public Card[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		java.util.LinkedList<Card> lclUs = acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
		return lclUs.toArray(createArray(lclUs.size()));
	}

	public Card[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return arrayFromHttpRequest(argRequest, "card_id");
	}

	@Override
	public Card forUniqueString(String argUniqueString) {
		if (argUniqueString == null) {
			return null;
		}
		CardOpal lclOpal = getOpalFactory().forUniqueString(argUniqueString);
		return lclOpal != null ? lclOpal.getUserFacing() : null;
	}
}
