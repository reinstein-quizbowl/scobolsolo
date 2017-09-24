package com.scobolsolo.persistence;

public class PlayerPointVImpl extends com.opal.AbstractImpl<com.scobolsolo.application.PlayerPointV, com.scobolsolo.persistence.PlayerPointVOpal> implements com.scobolsolo.application.PlayerPointV {

	private final com.scobolsolo.persistence.PlayerPointVOpal myPlayerPointVOpal;

	public PlayerPointVImpl(PlayerPointVOpal argPlayerPointVOpal) {
		super();
		myPlayerPointVOpal = org.apache.commons.lang3.Validate.notNull(argPlayerPointVOpal);
	}

	protected com.scobolsolo.persistence.PlayerPointVOpal getPlayerPointVOpal() {
		return myPlayerPointVOpal;
	}

	@Override
	public com.scobolsolo.persistence.PlayerPointVOpal getOpal() {
		return getPlayerPointVOpal();
	}

	@Override
	public com.scobolsolo.persistence.PlayerPointVOpal getBottomOpal() {
		return getPlayerPointVOpal();
	}

	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getTournamentCode() {
		return getPlayerPointVOpal().getTournamentCode();
	}

	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getPlayerIdAsObject() {
		return getPlayerPointVOpal().getPlayerIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = false)
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
	public com.scobolsolo.application.Tournament getTournament() {
		TournamentOpal lclTournamentOpal = getPlayerPointVOpal().getTournamentOpal();
		return lclTournamentOpal == null ? null : lclTournamentOpal.getUserFacing();
	}

	/** @return the Player object created from player_point_v through reference UNNAMED_INFERRED_KEY */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.application.Player getPlayer() {
		PlayerOpal lclPlayerOpal = getPlayerPointVOpal().getPlayerOpal();
		return lclPlayerOpal == null ? null : lclPlayerOpal.getUserFacing();
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

}
