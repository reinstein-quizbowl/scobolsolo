package com.scobolsolo.application;

import com.scobolsolo.persistence.GameOpal;
import com.scobolsolo.persistence.MatchOpal;
import com.scobolsolo.persistence.PlayerOpal;
import com.scobolsolo.persistence.StaffOpal;

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
	public void setId(java.lang.Integer argId) {
		getGameOpal().setId(argId);
		return;
	}

	@Override
	public void setId(int argId) {
		getGameOpal().setId(argId);
		return;
	}

	@Override
	public java.lang.Integer getTossupsHeardAsObject() {
		return getGameOpal().getTossupsHeardAsObject();
	}

	@Override
	public void setTossupsHeard(java.lang.Integer argTossupsHeard) {
		getGameOpal().setTossupsHeard(argTossupsHeard);
		return;
	}

	@Override
	public void setTossupsHeard(int argTossupsHeard) {
		getGameOpal().setTossupsHeard(argTossupsHeard);
		return;
	}

	@Override
	public java.lang.Integer getIncomingWinningCardPlayerIdAsObject() {
		return getGameOpal().getIncomingWinningCardPlayerIdAsObject();
	}

	@Override
	public void setIncomingWinningCardPlayerId(java.lang.Integer argIncomingWinningCardPlayerId) {
		getGameOpal().setIncomingWinningCardPlayerId(argIncomingWinningCardPlayerId);
		return;
	}

	@Override
	public void setIncomingWinningCardPlayerId(int argIncomingWinningCardPlayerId) {
		getGameOpal().setIncomingWinningCardPlayerId(argIncomingWinningCardPlayerId);
		return;
	}

	@Override
	public java.lang.Integer getIncomingLosingCardPlayerIdAsObject() {
		return getGameOpal().getIncomingLosingCardPlayerIdAsObject();
	}

	@Override
	public void setIncomingLosingCardPlayerId(java.lang.Integer argIncomingLosingCardPlayerId) {
		getGameOpal().setIncomingLosingCardPlayerId(argIncomingLosingCardPlayerId);
		return;
	}

	@Override
	public void setIncomingLosingCardPlayerId(int argIncomingLosingCardPlayerId) {
		getGameOpal().setIncomingLosingCardPlayerId(argIncomingLosingCardPlayerId);
		return;
	}

	@Override
	public java.lang.Integer getOutgoingWinningCardPlayerIdAsObject() {
		return getGameOpal().getOutgoingWinningCardPlayerIdAsObject();
	}

	@Override
	public void setOutgoingWinningCardPlayerId(java.lang.Integer argOutgoingWinningCardPlayerId) {
		getGameOpal().setOutgoingWinningCardPlayerId(argOutgoingWinningCardPlayerId);
		return;
	}

	@Override
	public void setOutgoingWinningCardPlayerId(int argOutgoingWinningCardPlayerId) {
		getGameOpal().setOutgoingWinningCardPlayerId(argOutgoingWinningCardPlayerId);
		return;
	}

	@Override
	public java.lang.Integer getOutgoingLosingCardPlayerIdAsObject() {
		return getGameOpal().getOutgoingLosingCardPlayerIdAsObject();
	}

	@Override
	public void setOutgoingLosingCardPlayerId(java.lang.Integer argOutgoingLosingCardPlayerId) {
		getGameOpal().setOutgoingLosingCardPlayerId(argOutgoingLosingCardPlayerId);
		return;
	}

	@Override
	public void setOutgoingLosingCardPlayerId(int argOutgoingLosingCardPlayerId) {
		getGameOpal().setOutgoingLosingCardPlayerId(argOutgoingLosingCardPlayerId);
		return;
	}

	@Override
	public java.lang.Integer getModeratorStaffIdAsObject() {
		return getGameOpal().getModeratorStaffIdAsObject();
	}

	@Override
	public void setModeratorStaffId(java.lang.Integer argModeratorStaffId) {
		getGameOpal().setModeratorStaffId(argModeratorStaffId);
		return;
	}

	@Override
	public void setModeratorStaffId(int argModeratorStaffId) {
		getGameOpal().setModeratorStaffId(argModeratorStaffId);
		return;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** Access to the Match object created from game through reference game_id_fkey */

	@Override
	public Match getMatch() {
		MatchOpal lclMatchOpal = getGameOpal().getMatchOpal();
		return lclMatchOpal == null ? null : lclMatchOpal.getUserFacing();
	}

	@Override
	public void setMatch(Match argMatch) {
		getGameOpal().setMatchOpal(argMatch == null ? null : ((MatchImpl) argMatch).getMatchOpal());
		return;
	}

	/** Access to the Player object created from game through reference game_incoming_losing_card_player_id_fkey */

	@Override
	public Player getIncomingLosingCardPlayer() {
		PlayerOpal lclPlayerOpal = getGameOpal().getIncomingLosingCardPlayerOpal();
		return lclPlayerOpal == null ? null : lclPlayerOpal.getUserFacing();
	}

	@Override
	public void setIncomingLosingCardPlayer(Player argPlayer) {
		getGameOpal().setIncomingLosingCardPlayerOpal(argPlayer == null ? null : ((PlayerImpl) argPlayer).getPlayerOpal());
		return;
	}

	/** Access to the Player object created from game through reference game_incoming_winning_card_player_id_fkey */

	@Override
	public Player getIncomingWinningCardPlayer() {
		PlayerOpal lclPlayerOpal = getGameOpal().getIncomingWinningCardPlayerOpal();
		return lclPlayerOpal == null ? null : lclPlayerOpal.getUserFacing();
	}

	@Override
	public void setIncomingWinningCardPlayer(Player argPlayer) {
		getGameOpal().setIncomingWinningCardPlayerOpal(argPlayer == null ? null : ((PlayerImpl) argPlayer).getPlayerOpal());
		return;
	}

	/** Access to the Staff object created from game through reference game_moderator_staff_id_fkey */

	@Override
	public Staff getModeratorStaff() {
		StaffOpal lclStaffOpal = getGameOpal().getModeratorStaffOpal();
		return lclStaffOpal == null ? null : lclStaffOpal.getUserFacing();
	}

	@Override
	public void setModeratorStaff(Staff argStaff) {
		getGameOpal().setModeratorStaffOpal(argStaff == null ? null : ((StaffImpl) argStaff).getStaffOpal());
		return;
	}

	/** Access to the Player object created from game through reference game_outgoing_losing_card_player_id_fkey */

	@Override
	public Player getOutgoingLosingCardPlayer() {
		PlayerOpal lclPlayerOpal = getGameOpal().getOutgoingLosingCardPlayerOpal();
		return lclPlayerOpal == null ? null : lclPlayerOpal.getUserFacing();
	}

	@Override
	public void setOutgoingLosingCardPlayer(Player argPlayer) {
		getGameOpal().setOutgoingLosingCardPlayerOpal(argPlayer == null ? null : ((PlayerImpl) argPlayer).getPlayerOpal());
		return;
	}

	/** Access to the Player object created from game through reference game_outgoing_winning_card_player_id_fkey */

	@Override
	public Player getOutgoingWinningCardPlayer() {
		PlayerOpal lclPlayerOpal = getGameOpal().getOutgoingWinningCardPlayerOpal();
		return lclPlayerOpal == null ? null : lclPlayerOpal.getUserFacing();
	}

	@Override
	public void setOutgoingWinningCardPlayer(Player argPlayer) {
		getGameOpal().setOutgoingWinningCardPlayerOpal(argPlayer == null ? null : ((PlayerImpl) argPlayer).getPlayerOpal());
		return;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public void addPerformance(Performance argPerformance) {
		getGameOpal().addPerformanceOpal(((PerformanceImpl) argPerformance).getPerformanceOpal());
	}

	@Override
	public void removePerformance(Performance argPerformance) {
		getGameOpal().removePerformanceOpal(((PerformanceImpl) argPerformance).getPerformanceOpal());
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
	public void clearPerformance() {
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
