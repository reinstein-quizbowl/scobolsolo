package com.scobolsolo.persistence;


public class PerformanceImpl extends com.opal.AbstractIdentityImpl<com.scobolsolo.application.Performance, com.scobolsolo.persistence.PerformanceOpal> implements com.scobolsolo.application.Performance {

	private final com.scobolsolo.persistence.PerformanceOpal myPerformanceOpal;

	public PerformanceImpl(PerformanceOpal argPerformanceOpal) {
		super();
		myPerformanceOpal = org.apache.commons.lang3.Validate.notNull(argPerformanceOpal);
	}

	protected com.scobolsolo.persistence.PerformanceOpal getPerformanceOpal() {
		return myPerformanceOpal;
	}

	@Override
	protected com.opal.IdentityOpal<? extends com.scobolsolo.application.Performance> getOpal() {
		return getPerformanceOpal();
	}

	@Override
	protected com.opal.IdentityOpal<? extends com.scobolsolo.application.Performance> getBottomOpal() {
		return getPerformanceOpal();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getIdAsObject() {
		return getPerformanceOpal().getIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.PerformanceImpl setId(java.lang.Integer argId) {
		getPerformanceOpal().setId(argId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.PerformanceImpl setId(int argId) {
		getPerformanceOpal().setId(argId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getGameIdAsObject() {
		return getPerformanceOpal().getGameIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.PerformanceImpl setGameId(java.lang.Integer argGameId) {
		getPerformanceOpal().setGameId(argGameId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.PerformanceImpl setGameId(int argGameId) {
		getPerformanceOpal().setGameId(argGameId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getPlayerIdAsObject() {
		return getPerformanceOpal().getPlayerIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.PerformanceImpl setPlayerId(java.lang.Integer argPlayerId) {
		getPerformanceOpal().setPlayerId(argPlayerId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.PerformanceImpl setPlayerId(int argPlayerId) {
		getPerformanceOpal().setPlayerId(argPlayerId);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the Game object created from performance through reference performance_game_id_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.Game getGame() {
		GameOpal lclGameOpal = getPerformanceOpal().getGameOpal();
		return lclGameOpal == null ? null : lclGameOpal.getUserFacing();
	}

	@Override
	public com.scobolsolo.application.Performance setGame(com.scobolsolo.application.Game argGame) {
		getPerformanceOpal().setGameOpal(argGame == null ? null : ((GameImpl) argGame).getGameOpal());
		return this;
	}

	/** @return the Player object created from performance through reference performance_player_id_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.Player getPlayer() {
		PlayerOpal lclPlayerOpal = getPerformanceOpal().getPlayerOpal();
		return lclPlayerOpal == null ? null : lclPlayerOpal.getUserFacing();
	}

	@Override
	public com.scobolsolo.application.Performance setPlayer(com.scobolsolo.application.Player argPlayer) {
		getPerformanceOpal().setPlayerOpal(argPlayer == null ? null : ((PlayerImpl) argPlayer).getPlayerOpal());
		return this;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public com.scobolsolo.application.Performance addResponse(com.scobolsolo.application.Response argResponse) {
		getPerformanceOpal().addResponseOpal(((ResponseImpl) argResponse).getResponseOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Performance removeResponse(com.scobolsolo.application.Response argResponse) {
		getPerformanceOpal().removeResponseOpal(((ResponseImpl) argResponse).getResponseOpal());
		return this;
	}

	@Override
	public int getResponseCount() {
		return getPerformanceOpal().getResponseOpalCount();
	}

	@Override
	public java.util.stream.Stream<com.scobolsolo.application.Response> streamResponse() {
		return getPerformanceOpal().streamResponseOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<com.scobolsolo.application.Response> createResponseIterator() {
		return new com.opal.OpalIterator<> (getPerformanceOpal().createResponseOpalIterator());
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
	public com.scobolsolo.application.Performance copy() {
		return getPerformanceOpal().copy().getUserFacing();
	}

}
