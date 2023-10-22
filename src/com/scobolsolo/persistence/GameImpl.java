package com.scobolsolo.persistence;

public class GameImpl extends com.opal.AbstractIdentityImpl<com.scobolsolo.application.Game, com.scobolsolo.persistence.GameOpal> implements com.scobolsolo.application.Game {

	private final com.scobolsolo.persistence.GameOpal myGameOpal;

	public GameImpl(GameOpal argGameOpal) {
		super();
		myGameOpal = org.apache.commons.lang3.Validate.notNull(argGameOpal);
	}

	protected com.scobolsolo.persistence.GameOpal getGameOpal() {
		return myGameOpal;
	}

	@Override
	public com.scobolsolo.persistence.GameOpal getOpal() {
		return getGameOpal();
	}

	@Override
	public com.scobolsolo.persistence.GameOpal getBottomOpal() {
		return getGameOpal();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getIdAsObject() {
		return getGameOpal().getIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.GameImpl setId(java.lang.Integer argId) {
		getGameOpal().setId(argId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.GameImpl setId(int argId) {
		getGameOpal().setId(argId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getTossupsHeardAsObject() {
		return getGameOpal().getTossupsHeardAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.persistence.GameImpl setTossupsHeard(java.lang.Integer argTossupsHeard) {
		getGameOpal().setTossupsHeard(argTossupsHeard);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.GameImpl setTossupsHeard(int argTossupsHeard) {
		getGameOpal().setTossupsHeard(argTossupsHeard);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getIncomingWinningCardPlayerIdAsObject() {
		return getGameOpal().getIncomingWinningCardPlayerIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.persistence.GameImpl setIncomingWinningCardPlayerId(java.lang.Integer argIncomingWinningCardPlayerId) {
		getGameOpal().setIncomingWinningCardPlayerId(argIncomingWinningCardPlayerId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.GameImpl setIncomingWinningCardPlayerId(int argIncomingWinningCardPlayerId) {
		getGameOpal().setIncomingWinningCardPlayerId(argIncomingWinningCardPlayerId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getIncomingLosingCardPlayerIdAsObject() {
		return getGameOpal().getIncomingLosingCardPlayerIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.persistence.GameImpl setIncomingLosingCardPlayerId(java.lang.Integer argIncomingLosingCardPlayerId) {
		getGameOpal().setIncomingLosingCardPlayerId(argIncomingLosingCardPlayerId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.GameImpl setIncomingLosingCardPlayerId(int argIncomingLosingCardPlayerId) {
		getGameOpal().setIncomingLosingCardPlayerId(argIncomingLosingCardPlayerId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getOutgoingWinningCardPlayerIdAsObject() {
		return getGameOpal().getOutgoingWinningCardPlayerIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.persistence.GameImpl setOutgoingWinningCardPlayerId(java.lang.Integer argOutgoingWinningCardPlayerId) {
		getGameOpal().setOutgoingWinningCardPlayerId(argOutgoingWinningCardPlayerId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.GameImpl setOutgoingWinningCardPlayerId(int argOutgoingWinningCardPlayerId) {
		getGameOpal().setOutgoingWinningCardPlayerId(argOutgoingWinningCardPlayerId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getOutgoingLosingCardPlayerIdAsObject() {
		return getGameOpal().getOutgoingLosingCardPlayerIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.persistence.GameImpl setOutgoingLosingCardPlayerId(java.lang.Integer argOutgoingLosingCardPlayerId) {
		getGameOpal().setOutgoingLosingCardPlayerId(argOutgoingLosingCardPlayerId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.GameImpl setOutgoingLosingCardPlayerId(int argOutgoingLosingCardPlayerId) {
		getGameOpal().setOutgoingLosingCardPlayerId(argOutgoingLosingCardPlayerId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getModeratorStaffIdAsObject() {
		return getGameOpal().getModeratorStaffIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.persistence.GameImpl setModeratorStaffId(java.lang.Integer argModeratorStaffId) {
		getGameOpal().setModeratorStaffId(argModeratorStaffId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.GameImpl setModeratorStaffId(int argModeratorStaffId) {
		getGameOpal().setModeratorStaffId(argModeratorStaffId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getScorekeeperStaffIdAsObject() {
		return getGameOpal().getScorekeeperStaffIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.persistence.GameImpl setScorekeeperStaffId(java.lang.Integer argScorekeeperStaffId) {
		getGameOpal().setScorekeeperStaffId(argScorekeeperStaffId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.GameImpl setScorekeeperStaffId(int argScorekeeperStaffId) {
		getGameOpal().setScorekeeperStaffId(argScorekeeperStaffId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.time.LocalDateTime getStartTime() {
		return getGameOpal().getStartTime();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.persistence.GameImpl setStartTime(java.time.LocalDateTime argStartTime) {
		getGameOpal().setStartTime(argStartTime);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.time.LocalDateTime getEndTime() {
		return getGameOpal().getEndTime();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.persistence.GameImpl setEndTime(java.time.LocalDateTime argEndTime) {
		getGameOpal().setEndTime(argEndTime);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the Match object created from game through reference game_id_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.Match getMatch() {
		MatchOpal lclMatchOpal = getGameOpal().getMatchOpal();
		return lclMatchOpal == null ? null : lclMatchOpal.getUserFacing();
	}

	@Override
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.Game setMatch(com.scobolsolo.application.Match argMatch) {
		getGameOpal().setMatchOpal(argMatch == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.Match, com.scobolsolo.persistence.MatchOpal>) argMatch).getOpal());
		return this;
	}

	/** @return the Player object created from game through reference game_incoming_losing_card_player_id_fkey */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.application.Player getIncomingLosingCardPlayer() {
		PlayerOpal lclPlayerOpal = getGameOpal().getIncomingLosingCardPlayerOpal();
		return lclPlayerOpal == null ? null : lclPlayerOpal.getUserFacing();
	}

	@Override
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.Game setIncomingLosingCardPlayer(com.scobolsolo.application.Player argPlayer) {
		getGameOpal().setIncomingLosingCardPlayerOpal(argPlayer == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.Player, com.scobolsolo.persistence.PlayerOpal>) argPlayer).getOpal());
		return this;
	}

	/** @return the Player object created from game through reference game_incoming_winning_card_player_id_fkey */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.application.Player getIncomingWinningCardPlayer() {
		PlayerOpal lclPlayerOpal = getGameOpal().getIncomingWinningCardPlayerOpal();
		return lclPlayerOpal == null ? null : lclPlayerOpal.getUserFacing();
	}

	@Override
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.Game setIncomingWinningCardPlayer(com.scobolsolo.application.Player argPlayer) {
		getGameOpal().setIncomingWinningCardPlayerOpal(argPlayer == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.Player, com.scobolsolo.persistence.PlayerOpal>) argPlayer).getOpal());
		return this;
	}

	/** @return the Staff object created from game through reference game_moderator_staff_id_fkey */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.application.Staff getModeratorStaff() {
		StaffOpal lclStaffOpal = getGameOpal().getModeratorStaffOpal();
		return lclStaffOpal == null ? null : lclStaffOpal.getUserFacing();
	}

	@Override
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.Game setModeratorStaff(com.scobolsolo.application.Staff argStaff) {
		getGameOpal().setModeratorStaffOpal(argStaff == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.Staff, com.scobolsolo.persistence.StaffOpal>) argStaff).getOpal());
		return this;
	}

	/** @return the Player object created from game through reference game_outgoing_losing_card_player_id_fkey */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.application.Player getOutgoingLosingCardPlayer() {
		PlayerOpal lclPlayerOpal = getGameOpal().getOutgoingLosingCardPlayerOpal();
		return lclPlayerOpal == null ? null : lclPlayerOpal.getUserFacing();
	}

	@Override
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.Game setOutgoingLosingCardPlayer(com.scobolsolo.application.Player argPlayer) {
		getGameOpal().setOutgoingLosingCardPlayerOpal(argPlayer == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.Player, com.scobolsolo.persistence.PlayerOpal>) argPlayer).getOpal());
		return this;
	}

	/** @return the Player object created from game through reference game_outgoing_winning_card_player_id_fkey */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.application.Player getOutgoingWinningCardPlayer() {
		PlayerOpal lclPlayerOpal = getGameOpal().getOutgoingWinningCardPlayerOpal();
		return lclPlayerOpal == null ? null : lclPlayerOpal.getUserFacing();
	}

	@Override
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.Game setOutgoingWinningCardPlayer(com.scobolsolo.application.Player argPlayer) {
		getGameOpal().setOutgoingWinningCardPlayerOpal(argPlayer == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.Player, com.scobolsolo.persistence.PlayerOpal>) argPlayer).getOpal());
		return this;
	}

	/** @return the Staff object created from game through reference game_scorekeeper_staff_id_fkey */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.application.Staff getScorekeeperStaff() {
		StaffOpal lclStaffOpal = getGameOpal().getScorekeeperStaffOpal();
		return lclStaffOpal == null ? null : lclStaffOpal.getUserFacing();
	}

	@Override
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.Game setScorekeeperStaff(com.scobolsolo.application.Staff argStaff) {
		getGameOpal().setScorekeeperStaffOpal(argStaff == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.Staff, com.scobolsolo.persistence.StaffOpal>) argStaff).getOpal());
		return this;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public java.util.Set<com.scobolsolo.application.Performance> getPerformanceSet() {
		return new com.opal.UserFacingBackCollectionSet<>(getGameOpal().getPerformanceOpalSet());
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
	public com.scobolsolo.application.Game copy() {
		return getGameOpal().copy().getUserFacing();
	}

}
