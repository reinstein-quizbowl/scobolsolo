package com.scobolsolo.application;

import com.opal.*;
import com.scobolsolo.persistence.PlayerOpalFactory;
import com.scobolsolo.persistence.PlayerOpal;
import com.scobolsolo.persistence.OpalFactoryFactory;

public class PlayerFactory extends com.opal.AbstractFactory<Player, PlayerOpal> implements com.opal.FactoryCreator<Player>, com.opal.IdentityFactory<Player> {
	/** This static variable holds the Singleton instance of the Factory for application
		objects of this type.  It is private, but can be accessed via the getInstance() method.
	*/

	private static final PlayerFactory ourInstance = new PlayerFactory(OpalFactoryFactory.getInstance().getPlayerOpalFactory());

	public static PlayerFactory getInstance() { return ourInstance; }

	public PlayerOpalFactory getPlayerOpalFactory() { return (PlayerOpalFactory) getOpalFactory(); }

	protected PlayerFactory(OpalFactory<Player, PlayerOpal> argOpalFactory) {
		super(argOpalFactory);
	}

	@Override
	public Class<Player> getUserFacingInterface() {
		return Player.class;
	}

	@Override
	public Player create() {
		return getPlayerOpalFactory().create().getUserFacing();
	}

	public Player forInitialCardId(java.lang.Integer argInitialCardId) {
		PlayerOpal lclPlayerOpal = getPlayerOpalFactory().forInitialCardId(argInitialCardId);
		return (lclPlayerOpal == null) ? null : lclPlayerOpal.getUserFacing();
	}

	public Player forId(java.lang.Integer argId) {
		PlayerOpal lclPlayerOpal = getPlayerOpalFactory().forId(argId);
		return (lclPlayerOpal == null) ? null : lclPlayerOpal.getUserFacing();
	}

	@Override
	public Player[] createArray(int argSize) {
		return new Player[argSize];
	}

	public Player fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		return fromHttpRequest(argRequest, "player_id");
	}

	public Player fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argId) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		String lclIdString = argRequest.getParameter(argId);
		if (lclIdString == null || lclIdString.equals("")) {
			return null;
		}
		java.lang.Integer lclId = java.lang.Integer.valueOf(lclIdString);
		return forId(lclId);
	}

	public <T extends java.util.Collection<? super Player>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
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
			Player lclResult = forId(lclId);
			org.apache.commons.lang3.Validate.notNull(lclResult, "'" + lclValue + "' is not a valid Id for any Player");
			argCollection.add(lclResult);
		}
		return argCollection;
	}

	public <T extends java.util.Collection<? super Player>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest) {
		return acquireFromHttpRequest(argCollection, argRequest, "player_id");
	}

	public java.util.Collection<Player> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		return acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
	}

	public java.util.Collection<Player> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return multipleFromHttpRequest(argRequest, "player_id");
	}

	public Player[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		java.util.LinkedList<Player> lclUs = acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
		return lclUs.toArray(createArray(lclUs.size()));
	}

	public Player[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return arrayFromHttpRequest(argRequest, "player_id");
	}

	@Override
	public Player forUniqueString(String argUniqueString) {
		if (argUniqueString == null) {
			return null;
		}
		PlayerOpal lclOpal = getOpalFactory().forUniqueString(argUniqueString);
		return lclOpal != null ? lclOpal.getUserFacing() : null;
	}
}
