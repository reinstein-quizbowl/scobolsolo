package com.scobolsolo.application;

import com.scobolsolo.persistence.PlayerMatchVOpal;
import com.scobolsolo.persistence.GameOpal;
import com.scobolsolo.persistence.TournamentOpal;
import com.scobolsolo.persistence.PlayerOpal;
import com.scobolsolo.persistence.MatchOpal;
import com.scobolsolo.persistence.PerformanceOpal;

public class PlayerMatchVImpl extends com.opal.AbstractImpl<PlayerMatchV, PlayerMatchVOpal> implements PlayerMatchV {
	private final PlayerMatchVOpal myPlayerMatchVOpal;

	public PlayerMatchVImpl(PlayerMatchVOpal argPlayerMatchVOpal) {
		super();
		myPlayerMatchVOpal = org.apache.commons.lang3.Validate.notNull(argPlayerMatchVOpal);
	}

	protected PlayerMatchVOpal getPlayerMatchVOpal() {
		return myPlayerMatchVOpal;
	}

	@Override
	protected com.opal.EphemeralOpal<? extends PlayerMatchV> getOpal() {
		return getPlayerMatchVOpal();
	}

	@Override
	protected com.opal.EphemeralOpal<? extends PlayerMatchV> getBottomOpal() {
		return getPlayerMatchVOpal();
	}

	@Override
	public java.lang.String getTournamentCode() {
		return getPlayerMatchVOpal().getTournamentCode();
	}

	@Override
	public java.lang.Integer getPlayerIdAsObject() {
		return getPlayerMatchVOpal().getPlayerIdAsObject();
	}

	@Override
	public java.lang.Integer getPerformanceIdAsObject() {
		return getPlayerMatchVOpal().getPerformanceIdAsObject();
	}

	@Override
	public java.lang.Integer getOpponentPlayerIdAsObject() {
		return getPlayerMatchVOpal().getOpponentPlayerIdAsObject();
	}

	@Override
	public java.lang.Integer getOpponentPerformanceIdAsObject() {
		return getPlayerMatchVOpal().getOpponentPerformanceIdAsObject();
	}

	@Override
	public java.lang.Integer getMatchIdAsObject() {
		return getPlayerMatchVOpal().getMatchIdAsObject();
	}

	@Override
	public java.lang.Integer getGameIdAsObject() {
		return getPlayerMatchVOpal().getGameIdAsObject();
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the Game object created from player_match_v through reference UNNAMED_INFERRED_KEY */

	@Override
	public Game getGame() {
		GameOpal lclGameOpal = getPlayerMatchVOpal().getGameOpal();
		return lclGameOpal == null ? null : lclGameOpal.getUserFacing();
	}

	/** @return the Tournament object created from player_match_v through reference UNNAMED_INFERRED_KEY */

	@Override
	public Tournament getTournament() {
		TournamentOpal lclTournamentOpal = getPlayerMatchVOpal().getTournamentOpal();
		return lclTournamentOpal == null ? null : lclTournamentOpal.getUserFacing();
	}

	/** @return the Player object created from player_match_v through reference UNNAMED_INFERRED_KEY */

	@Override
	public Player getPlayer() {
		PlayerOpal lclPlayerOpal = getPlayerMatchVOpal().getPlayerOpal();
		return lclPlayerOpal == null ? null : lclPlayerOpal.getUserFacing();
	}

	/** @return the Player object created from player_match_v through reference UNNAMED_INFERRED_KEY */

	@Override
	public Player getOpponentPlayer() {
		PlayerOpal lclPlayerOpal = getPlayerMatchVOpal().getOpponentPlayerOpal();
		return lclPlayerOpal == null ? null : lclPlayerOpal.getUserFacing();
	}

	/** @return the Match object created from player_match_v through reference UNNAMED_INFERRED_KEY */

	@Override
	public Match getMatch() {
		MatchOpal lclMatchOpal = getPlayerMatchVOpal().getMatchOpal();
		return lclMatchOpal == null ? null : lclMatchOpal.getUserFacing();
	}

	/** @return the Performance object created from player_match_v through reference UNNAMED_INFERRED_KEY */

	@Override
	public Performance getPerformance() {
		PerformanceOpal lclPerformanceOpal = getPlayerMatchVOpal().getPerformanceOpal();
		return lclPerformanceOpal == null ? null : lclPerformanceOpal.getUserFacing();
	}

	/** @return the Performance object created from player_match_v through reference UNNAMED_INFERRED_KEY */

	@Override
	public Performance getOpponentPerformance() {
		PerformanceOpal lclPerformanceOpal = getPlayerMatchVOpal().getOpponentPerformanceOpal();
		return lclPerformanceOpal == null ? null : lclPerformanceOpal.getUserFacing();
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

}
