package com.scobolsolo.application;

import com.scobolsolo.persistence.PerformanceOpal;
import com.scobolsolo.persistence.GameOpal;
import com.scobolsolo.persistence.PlayerOpal;

public class PerformanceImpl extends com.opal.AbstractIdentityImpl<PerformanceOpal> implements Performance {
	private final PerformanceOpal myPerformanceOpal;

	public PerformanceImpl(PerformanceOpal argPerformanceOpal) {
		super();
		myPerformanceOpal = org.apache.commons.lang3.Validate.notNull(argPerformanceOpal);
	}

	protected PerformanceOpal getPerformanceOpal() {
		return myPerformanceOpal;
	}

	@Override
	protected /* Opal<? extends UserFacing> */ PerformanceOpal getBottomOpal() {
		return getPerformanceOpal();
	}

	@Override
	protected /* Opal<? extends UserFacing> */ PerformanceOpal[] getOpalArray() {
		return new /* Opal<?> */ PerformanceOpal[] {
			getPerformanceOpal(),
		};
	}

	@Override
	public java.lang.Integer getIdAsObject() {
		return getPerformanceOpal().getIdAsObject();
	}

	@Override
	public void setId(java.lang.Integer argId) {
		getPerformanceOpal().setId(argId);
		return;
	}

	@Override
	public void setId(int argId) {
		getPerformanceOpal().setId(argId);
		return;
	}

	@Override
	public java.lang.Integer getGameIdAsObject() {
		return getPerformanceOpal().getGameIdAsObject();
	}

	@Override
	public void setGameId(java.lang.Integer argGameId) {
		getPerformanceOpal().setGameId(argGameId);
		return;
	}

	@Override
	public void setGameId(int argGameId) {
		getPerformanceOpal().setGameId(argGameId);
		return;
	}

	@Override
	public java.lang.Integer getPlayerIdAsObject() {
		return getPerformanceOpal().getPlayerIdAsObject();
	}

	@Override
	public void setPlayerId(java.lang.Integer argPlayerId) {
		getPerformanceOpal().setPlayerId(argPlayerId);
		return;
	}

	@Override
	public void setPlayerId(int argPlayerId) {
		getPerformanceOpal().setPlayerId(argPlayerId);
		return;
	}

	/* The following methods allow direct access to the user objects for which
	this object has foreign keys in the database. */

	/** Access to the Game object created from the table performance through foreign key performance_game_id_fkey */

	@Override
	public Game getGame() {
		GameOpal lclGameOpal = getPerformanceOpal().getGameOpal();
		return lclGameOpal == null ? null : lclGameOpal.getUserFacing();
	}

	@Override
	public void setGame(Game argGame) {
		getPerformanceOpal().setGameOpal(argGame == null ? null : ((GameImpl) argGame).getGameOpal());
		return;
	}

	/** Access to the Player object created from the table performance through foreign key performance_player_id_fkey */

	@Override
	public Player getPlayer() {
		PlayerOpal lclPlayerOpal = getPerformanceOpal().getPlayerOpal();
		return lclPlayerOpal == null ? null : lclPlayerOpal.getUserFacing();
	}

	@Override
	public void setPlayer(Player argPlayer) {
		getPerformanceOpal().setPlayerOpal(argPlayer == null ? null : ((PlayerImpl) argPlayer).getPlayerOpal());
		return;
	}

	/* The following methods allow access to the user objects that have foreign keys
	to this object. */

	@Override
	public void addResponse(Response argResponse) {
		getPerformanceOpal().addResponseOpal(((ResponseImpl) argResponse).getResponseOpal());
	}

	@Override
	public void removeResponse(Response argResponse) {
		getPerformanceOpal().removeResponseOpal(((ResponseImpl) argResponse).getResponseOpal());
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
	public void clearResponse() {
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
