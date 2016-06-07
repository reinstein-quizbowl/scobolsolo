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

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getTournamentCode() {
		return getPlayerPointVOpal().getTournamentCode();
	}

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getPlayerIdAsObject() {
		return getPlayerPointVOpal().getPlayerIdAsObject();
	}

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getPointsAsObject() {
		return getPlayerPointVOpal().getPointsAsObject();
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the Tournament object created from player_point_v through reference UNNAMED_INFERRED_KEY */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public Tournament getTournament() {
		TournamentOpal lclTournamentOpal = getPlayerPointVOpal().getTournamentOpal();
		return lclTournamentOpal == null ? null : lclTournamentOpal.getUserFacing();
	}

	/** @return the Player object created from player_point_v through reference UNNAMED_INFERRED_KEY */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public Player getPlayer() {
		PlayerOpal lclPlayerOpal = getPlayerPointVOpal().getPlayerOpal();
		return lclPlayerOpal == null ? null : lclPlayerOpal.getUserFacing();
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

}
