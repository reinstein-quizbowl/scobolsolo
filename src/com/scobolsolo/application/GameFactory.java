package com.scobolsolo.application;

import com.opal.*;
import com.scobolsolo.persistence.GameOpalFactory;
import com.scobolsolo.persistence.GameOpal;
import com.scobolsolo.persistence.OpalFactoryFactory;

public class GameFactory extends com.opal.AbstractFactory<Game, GameOpal> implements com.opal.FactoryCreator<Game>, com.opal.IdentityFactory<Game> {
	/** This static variable holds the Singleton instance of the Factory for application
		objects of this type.  It is private, but can be accessed via the getInstance() method.
	*/

	private static final GameFactory ourInstance = new GameFactory(OpalFactoryFactory.getInstance().getGameOpalFactory());

	public static GameFactory getInstance() { return ourInstance; }

	public GameOpalFactory getGameOpalFactory() { return (GameOpalFactory) getOpalFactory(); }

	protected GameFactory(OpalFactory<Game, GameOpal> argOpalFactory) {
		super(argOpalFactory);
	}

	@Override
	public Class<Game> getUserFacingInterface() {
		return Game.class;
	}

	@Override
	public Game create() {
		return getGameOpalFactory().create().getUserFacing();
	}

	public Game forId(java.lang.Integer argId) {
		GameOpal lclGameOpal = getGameOpalFactory().forId(argId);
		return (lclGameOpal == null) ? null : lclGameOpal.getUserFacing();
	}

	@Override
	public Game[] createArray(int argSize) {
		return new Game[argSize];
	}

	public Game fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		return fromHttpRequest(argRequest, "game_id");
	}

	public Game fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argId) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		String lclIdString = argRequest.getParameter(argId);
		if (lclIdString == null || lclIdString.equals("")) {
			return null;
		}
		java.lang.Integer lclId = java.lang.Integer.valueOf(lclIdString);
		return forId(lclId);
	}

	public <T extends java.util.Collection<? super Game>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
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
			Game lclResult = forId(lclId);
			org.apache.commons.lang3.Validate.notNull(lclResult, "'" + lclValue + "' is not a valid Id for any Game");
			argCollection.add(lclResult);
		}
		return argCollection;
	}

	public <T extends java.util.Collection<? super Game>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest) {
		return acquireFromHttpRequest(argCollection, argRequest, "game_id");
	}

	public java.util.Collection<Game> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		return acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
	}

	public java.util.Collection<Game> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return multipleFromHttpRequest(argRequest, "game_id");
	}

	public Game[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		java.util.LinkedList<Game> lclUs = acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
		return lclUs.toArray(createArray(lclUs.size()));
	}

	public Game[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return arrayFromHttpRequest(argRequest, "game_id");
	}

	@Override
	public Game forUniqueString(String argUniqueString) {
		if (argUniqueString == null) {
			return null;
		}
		GameOpal lclOpal = getOpalFactory().forUniqueString(argUniqueString);
		return lclOpal != null ? lclOpal.getUserFacing() : null;
	}
}
