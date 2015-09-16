package com.scobolsolo.application;

import com.scobolsolo.persistence.PerformanceOpal;
import com.scobolsolo.persistence.GameOpal;
import com.scobolsolo.persistence.PlayerOpal;

public class PerformanceImpl extends com.opal.AbstractIdentityImpl<Performance, PerformanceOpal> implements Performance {
	private final PerformanceOpal myPerformanceOpal;

	public PerformanceImpl(PerformanceOpal argPerformanceOpal) {
		super();
		myPerformanceOpal = org.apache.commons.lang3.Validate.notNull(argPerformanceOpal);
	}

	protected PerformanceOpal getPerformanceOpal() {
		return myPerformanceOpal;
	}

	@Override
	protected com.opal.IdentityOpal<? extends Performance> getOpal() {
		return getPerformanceOpal();
	}

	@Override
	protected com.opal.IdentityOpal<? extends Performance> getBottomOpal() {
		return getPerformanceOpal();
	}

	@Override
	public java.lang.Integer getIdAsObject() {
		return getPerformanceOpal().getIdAsObject();
	}

	@Override
	public PerformanceImpl setId(java.lang.Integer argId) {
		getPerformanceOpal().setId(argId);
		return this;
	}

	@Override
	public PerformanceImpl setId(int argId) {
		getPerformanceOpal().setId(argId);
		return this;
	}

	@Override
	public java.lang.Integer getGameIdAsObject() {
		return getPerformanceOpal().getGameIdAsObject();
	}

	@Override
	public PerformanceImpl setGameId(java.lang.Integer argGameId) {
		getPerformanceOpal().setGameId(argGameId);
		return this;
	}

	@Override
	public PerformanceImpl setGameId(int argGameId) {
		getPerformanceOpal().setGameId(argGameId);
		return this;
	}

	@Override
	public java.lang.Integer getPlayerIdAsObject() {
		return getPerformanceOpal().getPlayerIdAsObject();
	}

	@Override
	public PerformanceImpl setPlayerId(java.lang.Integer argPlayerId) {
		getPerformanceOpal().setPlayerId(argPlayerId);
		return this;
	}

	@Override
	public PerformanceImpl setPlayerId(int argPlayerId) {
		getPerformanceOpal().setPlayerId(argPlayerId);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the Game object created from performance through reference performance_game_id_fkey */

	@Override
	public Game getGame() {
		GameOpal lclGameOpal = getPerformanceOpal().getGameOpal();
		return lclGameOpal == null ? null : lclGameOpal.getUserFacing();
	}

	@Override
	public Performance setGame(Game argGame) {
		getPerformanceOpal().setGameOpal(argGame == null ? null : ((GameImpl) argGame).getGameOpal());
		return this;
	}

	/** @return the Player object created from performance through reference performance_player_id_fkey */

	@Override
	public Player getPlayer() {
		PlayerOpal lclPlayerOpal = getPerformanceOpal().getPlayerOpal();
		return lclPlayerOpal == null ? null : lclPlayerOpal.getUserFacing();
	}

	@Override
	public Performance setPlayer(Player argPlayer) {
		getPerformanceOpal().setPlayerOpal(argPlayer == null ? null : ((PlayerImpl) argPlayer).getPlayerOpal());
		return this;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public com.scobolsolo.application.Performance addResponse(Response argResponse) {
		getPerformanceOpal().addResponseOpal(((ResponseImpl) argResponse).getResponseOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Performance removeResponse(Response argResponse) {
		getPerformanceOpal().removeResponseOpal(((ResponseImpl) argResponse).getResponseOpal());
		return this;
	}

	@Override
	public int getResponseCount() {
		return getPerformanceOpal().getResponseOpalCount();
	}

	@Override
	public java.util.stream.Stream<Response> streamResponse() {
		return getPerformanceOpal().streamResponseOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<Response> createResponseIterator() {
		return new com.opal.OpalIterator<> (getPerformanceOpal().createResponseOpalIterator());
	}

	@Override
	public com.scobolsolo.application.Performance clearResponse() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void unlink() {
		getPerformanceOpal().unlink();
	}

	@Override
	public void reload() {
		getPerformanceOpal().reload();
	}

	@Override
	public Performance copy() {
		return getPerformanceOpal().copy().getUserFacing();
	}

}
