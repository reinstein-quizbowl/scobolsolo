package com.scobolsolo.persistence;

public class GameVImpl extends com.opal.AbstractImpl<com.scobolsolo.application.GameV, com.scobolsolo.persistence.GameVOpal> implements com.scobolsolo.application.GameV {

	private final com.scobolsolo.persistence.GameVOpal myGameVOpal;

	public GameVImpl(GameVOpal argGameVOpal) {
		super();
		myGameVOpal = org.apache.commons.lang3.Validate.notNull(argGameVOpal);
	}

	protected com.scobolsolo.persistence.GameVOpal getGameVOpal() {
		return myGameVOpal;
	}

	@Override
	public com.scobolsolo.persistence.GameVOpal getOpal() {
		return getGameVOpal();
	}

	@Override
	public com.scobolsolo.persistence.GameVOpal getBottomOpal() {
		return getGameVOpal();
	}

	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getTournamentCode() {
		return getGameVOpal().getTournamentCode();
	}

	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getGameIdAsObject() {
		return getGameVOpal().getGameIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getRoundIdAsObject() {
		return getGameVOpal().getRoundIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getRoomIdAsObject() {
		return getGameVOpal().getRoomIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getWinningCardIdAsObject() {
		return getGameVOpal().getWinningCardIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getLosingCardIdAsObject() {
		return getGameVOpal().getLosingCardIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getModeratorStaffIdAsObject() {
		return getGameVOpal().getModeratorStaffIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getScorekeeperStaffIdAsObject() {
		return getGameVOpal().getScorekeeperStaffIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getTossupsHeardAsObject() {
		return getGameVOpal().getTossupsHeardAsObject();
	}

	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getIncomingWinningCardPlayerIdAsObject() {
		return getGameVOpal().getIncomingWinningCardPlayerIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getIncomingLosingCardPlayerIdAsObject() {
		return getGameVOpal().getIncomingLosingCardPlayerIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getWinnerPlayerIdAsObject() {
		return getGameVOpal().getWinnerPlayerIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getLoserPlayerIdAsObject() {
		return getGameVOpal().getLoserPlayerIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getWinnerPerformanceIdAsObject() {
		return getGameVOpal().getWinnerPerformanceIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getLoserPerformanceIdAsObject() {
		return getGameVOpal().getLoserPerformanceIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getWinnerScoreAsObject() {
		return getGameVOpal().getWinnerScoreAsObject();
	}

	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getLoserScoreAsObject() {
		return getGameVOpal().getLoserScoreAsObject();
	}

	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Double getWinnerAverageCorrectBuzzDepthAsObject() {
		return getGameVOpal().getWinnerAverageCorrectBuzzDepthAsObject();
	}

	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Double getLoserAverageCorrectBuzzDepthAsObject() {
		return getGameVOpal().getLoserAverageCorrectBuzzDepthAsObject();
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the Game object created from game_v through reference UNNAMED_INFERRED_KEY */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.application.Game getGame() {
		GameOpal lclGameOpal = getGameVOpal().getGameOpal();
		return lclGameOpal == null ? null : lclGameOpal.getUserFacing();
	}

	/** @return the Tournament object created from game_v through reference UNNAMED_INFERRED_KEY */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.Tournament getTournament() {
		TournamentOpal lclTournamentOpal = getGameVOpal().getTournamentOpal();
		return lclTournamentOpal == null ? null : lclTournamentOpal.getUserFacing();
	}

	/** @return the Player object created from game_v through reference UNNAMED_INFERRED_KEY */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.application.Player getIncomingWinningCardPlayer() {
		PlayerOpal lclPlayerOpal = getGameVOpal().getIncomingWinningCardPlayerOpal();
		return lclPlayerOpal == null ? null : lclPlayerOpal.getUserFacing();
	}

	/** @return the Player object created from game_v through reference UNNAMED_INFERRED_KEY */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.application.Player getIncomingLosingCardPlayer() {
		PlayerOpal lclPlayerOpal = getGameVOpal().getIncomingLosingCardPlayerOpal();
		return lclPlayerOpal == null ? null : lclPlayerOpal.getUserFacing();
	}

	/** @return the Player object created from game_v through reference UNNAMED_INFERRED_KEY */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.application.Player getWinnerPlayer() {
		PlayerOpal lclPlayerOpal = getGameVOpal().getWinnerPlayerOpal();
		return lclPlayerOpal == null ? null : lclPlayerOpal.getUserFacing();
	}

	/** @return the Player object created from game_v through reference UNNAMED_INFERRED_KEY */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.application.Player getLoserPlayer() {
		PlayerOpal lclPlayerOpal = getGameVOpal().getLoserPlayerOpal();
		return lclPlayerOpal == null ? null : lclPlayerOpal.getUserFacing();
	}

	/** @return the Staff object created from game_v through reference UNNAMED_INFERRED_KEY */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.application.Staff getModeratorStaff() {
		StaffOpal lclStaffOpal = getGameVOpal().getModeratorStaffOpal();
		return lclStaffOpal == null ? null : lclStaffOpal.getUserFacing();
	}

	/** @return the Staff object created from game_v through reference UNNAMED_INFERRED_KEY */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.application.Staff getScorekeeperStaff() {
		StaffOpal lclStaffOpal = getGameVOpal().getScorekeeperStaffOpal();
		return lclStaffOpal == null ? null : lclStaffOpal.getUserFacing();
	}

	/** @return the Room object created from game_v through reference UNNAMED_INFERRED_KEY */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.application.Room getRoom() {
		RoomOpal lclRoomOpal = getGameVOpal().getRoomOpal();
		return lclRoomOpal == null ? null : lclRoomOpal.getUserFacing();
	}

	/** @return the Performance object created from game_v through reference UNNAMED_INFERRED_KEY */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.application.Performance getWinnerPerformance() {
		PerformanceOpal lclPerformanceOpal = getGameVOpal().getWinnerPerformanceOpal();
		return lclPerformanceOpal == null ? null : lclPerformanceOpal.getUserFacing();
	}

	/** @return the Performance object created from game_v through reference UNNAMED_INFERRED_KEY */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.application.Performance getLoserPerformance() {
		PerformanceOpal lclPerformanceOpal = getGameVOpal().getLoserPerformanceOpal();
		return lclPerformanceOpal == null ? null : lclPerformanceOpal.getUserFacing();
	}

	/** @return the Round object created from game_v through reference UNNAMED_INFERRED_KEY */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.application.Round getRound() {
		RoundOpal lclRoundOpal = getGameVOpal().getRoundOpal();
		return lclRoundOpal == null ? null : lclRoundOpal.getUserFacing();
	}

	/** @return the Card object created from game_v through reference UNNAMED_INFERRED_KEY */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.application.Card getWinningCard() {
		CardOpal lclCardOpal = getGameVOpal().getWinningCardOpal();
		return lclCardOpal == null ? null : lclCardOpal.getUserFacing();
	}

	/** @return the Card object created from game_v through reference UNNAMED_INFERRED_KEY */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.application.Card getLosingCard() {
		CardOpal lclCardOpal = getGameVOpal().getLosingCardOpal();
		return lclCardOpal == null ? null : lclCardOpal.getUserFacing();
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

}
