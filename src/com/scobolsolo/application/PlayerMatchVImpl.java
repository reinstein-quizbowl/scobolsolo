package com.scobolsolo.application;

import com.opal.Opal;
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
	protected com.opal.EphemeralOpal<? extends PlayerMatchV> getBottomOpal() {
		return getPlayerMatchVOpal();
	}

	@Override
	protected Opal<? super PlayerMatchV>[] getOpalArray() {
		return (Opal<? super PlayerMatchV>[]) new Opal<?>[] {
			getPlayerMatchVOpal(),
		};
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

	/* The following methods allow direct access to the user objects for which
	this object has foreign keys in the database. */

	/** Access to the Game object created from the table player_match_v through foreign key UNNAMED_INFERRED_KEY */

	@Override
	public Game getGame() {
		GameOpal lclGameOpal = getPlayerMatchVOpal().getGameOpal();
		return lclGameOpal == null ? null : lclGameOpal.getUserFacing();
	}

	/** Access to the Tournament object created from the table player_match_v through foreign key UNNAMED_INFERRED_KEY */

	@Override
	public Tournament getTournament() {
		TournamentOpal lclTournamentOpal = getPlayerMatchVOpal().getTournamentOpal();
		return lclTournamentOpal == null ? null : lclTournamentOpal.getUserFacing();
	}

	/** Access to the Player object created from the table player_match_v through foreign key UNNAMED_INFERRED_KEY */

	@Override
	public Player getPlayer() {
		PlayerOpal lclPlayerOpal = getPlayerMatchVOpal().getPlayerOpal();
		return lclPlayerOpal == null ? null : lclPlayerOpal.getUserFacing();
	}

	/** Access to the Player object created from the table player_match_v through foreign key UNNAMED_INFERRED_KEY */

	@Override
	public Player getOpponentPlayer() {
		PlayerOpal lclPlayerOpal = getPlayerMatchVOpal().getOpponentPlayerOpal();
		return lclPlayerOpal == null ? null : lclPlayerOpal.getUserFacing();
	}

	/** Access to the Match object created from the table player_match_v through foreign key UNNAMED_INFERRED_KEY */

	@Override
	public Match getMatch() {
		MatchOpal lclMatchOpal = getPlayerMatchVOpal().getMatchOpal();
		return lclMatchOpal == null ? null : lclMatchOpal.getUserFacing();
	}

	/** Access to the Performance object created from the table player_match_v through foreign key UNNAMED_INFERRED_KEY */

	@Override
	public Performance getPerformance() {
		PerformanceOpal lclPerformanceOpal = getPlayerMatchVOpal().getPerformanceOpal();
		return lclPerformanceOpal == null ? null : lclPerformanceOpal.getUserFacing();
	}

	/** Access to the Performance object created from the table player_match_v through foreign key UNNAMED_INFERRED_KEY */

	@Override
	public Performance getOpponentPerformance() {
		PerformanceOpal lclPerformanceOpal = getPlayerMatchVOpal().getOpponentPerformanceOpal();
		return lclPerformanceOpal == null ? null : lclPerformanceOpal.getUserFacing();
	}

	/* The following methods allow access to the user objects that have foreign keys
	to this object. */

	@Override
	public void unlink() {
		getPlayerMatchVOpal().unlink();
	}

	@Override
	public void reload() {
		getPlayerMatchVOpal().reload();
	}

}
