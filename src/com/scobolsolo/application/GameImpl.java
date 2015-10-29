package com.scobolsolo.application;

import com.scobolsolo.persistence.GameOpal;
import com.scobolsolo.persistence.MatchOpal;
import com.scobolsolo.persistence.StaffOpal;
import com.scobolsolo.persistence.PlayerOpal;

public class GameImpl extends com.opal.AbstractIdentityImpl<Game, GameOpal> implements Game {
	private final GameOpal myGameOpal;

	public GameImpl(GameOpal argGameOpal) {
		super();
		myGameOpal = org.apache.commons.lang3.Validate.notNull(argGameOpal);
	}

	protected GameOpal getGameOpal() {
		return myGameOpal;
	}

	@Override
	protected com.opal.IdentityOpal<? extends Game> getOpal() {
		return getGameOpal();
	}

	@Override
	protected com.opal.IdentityOpal<? extends Game> getBottomOpal() {
		return getGameOpal();
	}

	@Override
	public java.lang.Integer getIdAsObject() {
		return getGameOpal().getIdAsObject();
	}

	@Override
	public GameImpl setId(java.lang.Integer argId) {
		getGameOpal().setId(argId);
		return this;
	}

	@Override
	public GameImpl setId(int argId) {
		getGameOpal().setId(argId);
		return this;
	}

	@Override
	public java.lang.Integer getTossupsHeardAsObject() {
		return getGameOpal().getTossupsHeardAsObject();
	}

	@Override
	public GameImpl setTossupsHeard(java.lang.Integer argTossupsHeard) {
		getGameOpal().setTossupsHeard(argTossupsHeard);
		return this;
	}

	@Override
	public GameImpl setTossupsHeard(int argTossupsHeard) {
		getGameOpal().setTossupsHeard(argTossupsHeard);
		return this;
	}

	@Override
	public java.lang.Integer getIncomingWinningCardPlayerIdAsObject() {
		return getGameOpal().getIncomingWinningCardPlayerIdAsObject();
	}

	@Override
	public GameImpl setIncomingWinningCardPlayerId(java.lang.Integer argIncomingWinningCardPlayerId) {
		getGameOpal().setIncomingWinningCardPlayerId(argIncomingWinningCardPlayerId);
		return this;
	}

	@Override
	public GameImpl setIncomingWinningCardPlayerId(int argIncomingWinningCardPlayerId) {
		getGameOpal().setIncomingWinningCardPlayerId(argIncomingWinningCardPlayerId);
		return this;
	}

	@Override
	public java.lang.Integer getIncomingLosingCardPlayerIdAsObject() {
		return getGameOpal().getIncomingLosingCardPlayerIdAsObject();
	}

	@Override
	public GameImpl setIncomingLosingCardPlayerId(java.lang.Integer argIncomingLosingCardPlayerId) {
		getGameOpal().setIncomingLosingCardPlayerId(argIncomingLosingCardPlayerId);
		return this;
	}

	@Override
	public GameImpl setIncomingLosingCardPlayerId(int argIncomingLosingCardPlayerId) {
		getGameOpal().setIncomingLosingCardPlayerId(argIncomingLosingCardPlayerId);
		return this;
	}

	@Override
	public java.lang.Integer getOutgoingWinningCardPlayerIdAsObject() {
		return getGameOpal().getOutgoingWinningCardPlayerIdAsObject();
	}

	@Override
	public GameImpl setOutgoingWinningCardPlayerId(java.lang.Integer argOutgoingWinningCardPlayerId) {
		getGameOpal().setOutgoingWinningCardPlayerId(argOutgoingWinningCardPlayerId);
		return this;
	}

	@Override
	public GameImpl setOutgoingWinningCardPlayerId(int argOutgoingWinningCardPlayerId) {
		getGameOpal().setOutgoingWinningCardPlayerId(argOutgoingWinningCardPlayerId);
		return this;
	}

	@Override
	public java.lang.Integer getOutgoingLosingCardPlayerIdAsObject() {
		return getGameOpal().getOutgoingLosingCardPlayerIdAsObject();
	}

	@Override
	public GameImpl setOutgoingLosingCardPlayerId(java.lang.Integer argOutgoingLosingCardPlayerId) {
		getGameOpal().setOutgoingLosingCardPlayerId(argOutgoingLosingCardPlayerId);
		return this;
	}

	@Override
	public GameImpl setOutgoingLosingCardPlayerId(int argOutgoingLosingCardPlayerId) {
		getGameOpal().setOutgoingLosingCardPlayerId(argOutgoingLosingCardPlayerId);
		return this;
	}

	@Override
	public java.lang.Integer getModeratorStaffIdAsObject() {
		return getGameOpal().getModeratorStaffIdAsObject();
	}

	@Override
	public GameImpl setModeratorStaffId(java.lang.Integer argModeratorStaffId) {
		getGameOpal().setModeratorStaffId(argModeratorStaffId);
		return this;
	}

	@Override
	public GameImpl setModeratorStaffId(int argModeratorStaffId) {
		getGameOpal().setModeratorStaffId(argModeratorStaffId);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the Match object created from game through reference game_id_fkey */

	@Override
	public Match getMatch() {
		MatchOpal lclMatchOpal = getGameOpal().getMatchOpal();
		return lclMatchOpal == null ? null : lclMatchOpal.getUserFacing();
	}

	@Override
	public Game setMatch(Match argMatch) {
		getGameOpal().setMatchOpal(argMatch == null ? null : ((MatchImpl) argMatch).getMatchOpal());
		return this;
	}

	/** @return the Staff object created from game through reference game_moderator_staff_id_fkey */

	@Override
	public Staff getModeratorStaff() {
		StaffOpal lclStaffOpal = getGameOpal().getModeratorStaffOpal();
		return lclStaffOpal == null ? null : lclStaffOpal.getUserFacing();
	}

	@Override
	public Game setModeratorStaff(Staff argStaff) {
		getGameOpal().setModeratorStaffOpal(argStaff == null ? null : ((StaffImpl) argStaff).getStaffOpal());
		return this;
	}

	/** @return the Player object created from game through reference game_outgoing_losing_card_player_id_fkey */

	@Override
	public Player getOutgoingLosingCardPlayer() {
		PlayerOpal lclPlayerOpal = getGameOpal().getOutgoingLosingCardPlayerOpal();
		return lclPlayerOpal == null ? null : lclPlayerOpal.getUserFacing();
	}

	@Override
	public Game setOutgoingLosingCardPlayer(Player argPlayer) {
		getGameOpal().setOutgoingLosingCardPlayerOpal(argPlayer == null ? null : ((PlayerImpl) argPlayer).getPlayerOpal());
		return this;
	}

	/** @return the Player object created from game through reference game_outgoing_winning_card_player_id_fkey */

	@Override
	public Player getOutgoingWinningCardPlayer() {
		PlayerOpal lclPlayerOpal = getGameOpal().getOutgoingWinningCardPlayerOpal();
		return lclPlayerOpal == null ? null : lclPlayerOpal.getUserFacing();
	}

	@Override
	public Game setOutgoingWinningCardPlayer(Player argPlayer) {
		getGameOpal().setOutgoingWinningCardPlayerOpal(argPlayer == null ? null : ((PlayerImpl) argPlayer).getPlayerOpal());
		return this;
	}

	/** @return the Player object created from game through reference game_incoming_losing_card_player_id_fkey */

	@Override
	public Player getIncomingLosingCardPlayer() {
		PlayerOpal lclPlayerOpal = getGameOpal().getIncomingLosingCardPlayerOpal();
		return lclPlayerOpal == null ? null : lclPlayerOpal.getUserFacing();
	}

	@Override
	public Game setIncomingLosingCardPlayer(Player argPlayer) {
		getGameOpal().setIncomingLosingCardPlayerOpal(argPlayer == null ? null : ((PlayerImpl) argPlayer).getPlayerOpal());
		return this;
	}

	/** @return the Player object created from game through reference game_incoming_winning_card_player_id_fkey */

	@Override
	public Player getIncomingWinningCardPlayer() {
		PlayerOpal lclPlayerOpal = getGameOpal().getIncomingWinningCardPlayerOpal();
		return lclPlayerOpal == null ? null : lclPlayerOpal.getUserFacing();
	}

	@Override
	public Game setIncomingWinningCardPlayer(Player argPlayer) {
		getGameOpal().setIncomingWinningCardPlayerOpal(argPlayer == null ? null : ((PlayerImpl) argPlayer).getPlayerOpal());
		return this;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public com.scobolsolo.application.Game addPerformance(Performance argPerformance) {
		getGameOpal().addPerformanceOpal(((PerformanceImpl) argPerformance).getPerformanceOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Game removePerformance(Performance argPerformance) {
		getGameOpal().removePerformanceOpal(((PerformanceImpl) argPerformance).getPerformanceOpal());
		return this;
	}

	@Override
	public int getPerformanceCount() {
		return getGameOpal().getPerformanceOpalCount();
	}

	@Override
	public java.util.stream.Stream<Performance> streamPerformance() {
		return getGameOpal().streamPerformanceOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<Performance> createPerformanceIterator() {
		return new com.opal.OpalIterator<> (getGameOpal().createPerformanceOpalIterator());
	}

	@Override
	public com.scobolsolo.application.Game clearPerformance() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void unlink() {
		getGameOpal().unlink();
	}

	@Override
	public void reload() {
		getGameOpal().reload();
	}

	@Override
	public Game copy() {
		return getGameOpal().copy().getUserFacing();
	}

}
