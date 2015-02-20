package com.scobolsolo.application;

import com.scobolsolo.persistence.GameVOpal;
import com.scobolsolo.persistence.GameOpal;
import com.scobolsolo.persistence.TournamentOpal;
import com.scobolsolo.persistence.PlayerOpal;
import com.scobolsolo.persistence.StaffOpal;
import com.scobolsolo.persistence.RoomOpal;
import com.scobolsolo.persistence.PerformanceOpal;
import com.scobolsolo.persistence.RoundOpal;
import com.scobolsolo.persistence.CardOpal;

public class GameVImpl extends com.opal.AbstractImpl<GameVOpal> implements GameV {
	private final GameVOpal myGameVOpal;

	public GameVImpl(GameVOpal argGameVOpal) {
		super();
		myGameVOpal = org.apache.commons.lang3.Validate.notNull(argGameVOpal);
	}

	protected GameVOpal getGameVOpal() {
		return myGameVOpal;
	}

	@Override
	protected /* Opal<? extends UserFacing> */ GameVOpal getBottomOpal() {
		return getGameVOpal();
	}

	@Override
	protected /* Opal<? extends UserFacing> */ GameVOpal[] getOpalArray() {
		return new /* Opal<?> */ GameVOpal[] {
			getGameVOpal(),
		};
	}

	@Override
	public java.lang.String getTournamentCode() {
		return getGameVOpal().getTournamentCode();
	}

	@Override
	public java.lang.Integer getGameIdAsObject() {
		return getGameVOpal().getGameIdAsObject();
	}

	@Override
	public java.lang.Integer getRoundIdAsObject() {
		return getGameVOpal().getRoundIdAsObject();
	}

	@Override
	public java.lang.Integer getRoomIdAsObject() {
		return getGameVOpal().getRoomIdAsObject();
	}

	@Override
	public java.lang.Integer getWinningCardIdAsObject() {
		return getGameVOpal().getWinningCardIdAsObject();
	}

	@Override
	public java.lang.Integer getLosingCardIdAsObject() {
		return getGameVOpal().getLosingCardIdAsObject();
	}

	@Override
	public java.lang.Integer getModeratorStaffIdAsObject() {
		return getGameVOpal().getModeratorStaffIdAsObject();
	}

	@Override
	public java.lang.Integer getTossupsHeardAsObject() {
		return getGameVOpal().getTossupsHeardAsObject();
	}

	@Override
	public java.lang.Integer getIncomingWinningCardPlayerIdAsObject() {
		return getGameVOpal().getIncomingWinningCardPlayerIdAsObject();
	}

	@Override
	public java.lang.Integer getIncomingLosingCardPlayerIdAsObject() {
		return getGameVOpal().getIncomingLosingCardPlayerIdAsObject();
	}

	@Override
	public java.lang.Integer getWinnerPlayerIdAsObject() {
		return getGameVOpal().getWinnerPlayerIdAsObject();
	}

	@Override
	public java.lang.Integer getLoserPlayerIdAsObject() {
		return getGameVOpal().getLoserPlayerIdAsObject();
	}

	@Override
	public java.lang.Integer getWinnerPerformanceIdAsObject() {
		return getGameVOpal().getWinnerPerformanceIdAsObject();
	}

	@Override
	public java.lang.Integer getLoserPerformanceIdAsObject() {
		return getGameVOpal().getLoserPerformanceIdAsObject();
	}

	@Override
	public java.lang.Integer getWinnerScoreAsObject() {
		return getGameVOpal().getWinnerScoreAsObject();
	}

	@Override
	public java.lang.Integer getLoserScoreAsObject() {
		return getGameVOpal().getLoserScoreAsObject();
	}

	/* The following methods allow direct access to the user objects for which
	this object has foreign keys in the database. */

	/** Access to the Game object created from the table game_v through foreign key UNNAMED_INFERRED_KEY */

	@Override
	public Game getGame() {
		GameOpal lclGameOpal = getGameVOpal().getGameOpal();
		return lclGameOpal == null ? null : lclGameOpal.getUserFacing();
	}

	/** Access to the Tournament object created from the table game_v through foreign key UNNAMED_INFERRED_KEY */

	@Override
	public Tournament getTournament() {
		TournamentOpal lclTournamentOpal = getGameVOpal().getTournamentOpal();
		return lclTournamentOpal == null ? null : lclTournamentOpal.getUserFacing();
	}

	/** Access to the Player object created from the table game_v through foreign key UNNAMED_INFERRED_KEY */

	@Override
	public Player getIncomingWinningCardPlayer() {
		PlayerOpal lclPlayerOpal = getGameVOpal().getIncomingWinningCardPlayerOpal();
		return lclPlayerOpal == null ? null : lclPlayerOpal.getUserFacing();
	}

	/** Access to the Player object created from the table game_v through foreign key UNNAMED_INFERRED_KEY */

	@Override
	public Player getIncomingLosingCardPlayer() {
		PlayerOpal lclPlayerOpal = getGameVOpal().getIncomingLosingCardPlayerOpal();
		return lclPlayerOpal == null ? null : lclPlayerOpal.getUserFacing();
	}

	/** Access to the Player object created from the table game_v through foreign key UNNAMED_INFERRED_KEY */

	@Override
	public Player getWinnerPlayer() {
		PlayerOpal lclPlayerOpal = getGameVOpal().getWinnerPlayerOpal();
		return lclPlayerOpal == null ? null : lclPlayerOpal.getUserFacing();
	}

	/** Access to the Player object created from the table game_v through foreign key UNNAMED_INFERRED_KEY */

	@Override
	public Player getLoserPlayer() {
		PlayerOpal lclPlayerOpal = getGameVOpal().getLoserPlayerOpal();
		return lclPlayerOpal == null ? null : lclPlayerOpal.getUserFacing();
	}

	/** Access to the Staff object created from the table game_v through foreign key UNNAMED_INFERRED_KEY */

	@Override
	public Staff getModeratorStaff() {
		StaffOpal lclStaffOpal = getGameVOpal().getModeratorStaffOpal();
		return lclStaffOpal == null ? null : lclStaffOpal.getUserFacing();
	}

	/** Access to the Room object created from the table game_v through foreign key UNNAMED_INFERRED_KEY */

	@Override
	public Room getRoom() {
		RoomOpal lclRoomOpal = getGameVOpal().getRoomOpal();
		return lclRoomOpal == null ? null : lclRoomOpal.getUserFacing();
	}

	/** Access to the Performance object created from the table game_v through foreign key UNNAMED_INFERRED_KEY */

	@Override
	public Performance getWinnerPerformance() {
		PerformanceOpal lclPerformanceOpal = getGameVOpal().getWinnerPerformanceOpal();
		return lclPerformanceOpal == null ? null : lclPerformanceOpal.getUserFacing();
	}

	/** Access to the Performance object created from the table game_v through foreign key UNNAMED_INFERRED_KEY */

	@Override
	public Performance getLoserPerformance() {
		PerformanceOpal lclPerformanceOpal = getGameVOpal().getLoserPerformanceOpal();
		return lclPerformanceOpal == null ? null : lclPerformanceOpal.getUserFacing();
	}

	/** Access to the Round object created from the table game_v through foreign key UNNAMED_INFERRED_KEY */

	@Override
	public Round getRound() {
		RoundOpal lclRoundOpal = getGameVOpal().getRoundOpal();
		return lclRoundOpal == null ? null : lclRoundOpal.getUserFacing();
	}

	/** Access to the Card object created from the table game_v through foreign key UNNAMED_INFERRED_KEY */

	@Override
	public Card getWinningCard() {
		CardOpal lclCardOpal = getGameVOpal().getWinningCardOpal();
		return lclCardOpal == null ? null : lclCardOpal.getUserFacing();
	}

	/** Access to the Card object created from the table game_v through foreign key UNNAMED_INFERRED_KEY */

	@Override
	public Card getLosingCard() {
		CardOpal lclCardOpal = getGameVOpal().getLosingCardOpal();
		return lclCardOpal == null ? null : lclCardOpal.getUserFacing();
	}

	/* The following methods allow access to the user objects that have foreign keys
	to this object. */

	@Override
	public void unlink() {
		getGameVOpal().unlink();
	}

	@Override
	public void reload() {
		getGameVOpal().reload();
	}

}
