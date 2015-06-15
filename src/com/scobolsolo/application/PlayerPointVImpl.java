package com.scobolsolo.application;

import com.scobolsolo.persistence.PlayerPointVOpal;
import com.scobolsolo.persistence.TournamentOpal;
import com.scobolsolo.persistence.PlayerOpal;

public class PlayerPointVImpl extends com.opal.AbstractImpl<PlayerPointV, PlayerPointVOpal> implements PlayerPointV {
	private final PlayerPointVOpal myPlayerPointVOpal;

	public PlayerPointVImpl(PlayerPointVOpal argPlayerPointVOpal) {
		super();
		myPlayerPointVOpal = org.apache.commons.lang3.Validate.notNull(argPlayerPointVOpal);
	}

	protected PlayerPointVOpal getPlayerPointVOpal() {
		return myPlayerPointVOpal;
	}

	@Override
	protected com.opal.EphemeralOpal<? extends PlayerPointV> getOpal() {
		return getPlayerPointVOpal();
	}

	@Override
	protected com.opal.EphemeralOpal<? extends PlayerPointV> getBottomOpal() {
		return getPlayerPointVOpal();
	}

	@Override
	public java.lang.String getTournamentCode() {
		return getPlayerPointVOpal().getTournamentCode();
	}

	@Override
	public java.lang.Integer getPlayerIdAsObject() {
		return getPlayerPointVOpal().getPlayerIdAsObject();
	}

	@Override
	public java.lang.Integer getPointsAsObject() {
		return getPlayerPointVOpal().getPointsAsObject();
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** Access to the Tournament object created from player_point_v through reference UNNAMED_INFERRED_KEY */

	@Override
	public Tournament getTournament() {
		TournamentOpal lclTournamentOpal = getPlayerPointVOpal().getTournamentOpal();
		return lclTournamentOpal == null ? null : lclTournamentOpal.getUserFacing();
	}

	/** Access to the Player object created from player_point_v through reference UNNAMED_INFERRED_KEY */

	@Override
	public Player getPlayer() {
		PlayerOpal lclPlayerOpal = getPlayerPointVOpal().getPlayerOpal();
		return lclPlayerOpal == null ? null : lclPlayerOpal.getUserFacing();
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public void unlink() {
		getPlayerPointVOpal().unlink();
	}

	@Override
	public void reload() {
		getPlayerPointVOpal().reload();
	}

}
