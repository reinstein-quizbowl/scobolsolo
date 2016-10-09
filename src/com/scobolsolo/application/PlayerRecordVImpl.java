package com.scobolsolo.application;

import com.scobolsolo.persistence.PlayerRecordVOpal;
import com.scobolsolo.persistence.TournamentOpal;
import com.scobolsolo.persistence.PlayerOpal;

public class PlayerRecordVImpl extends com.opal.AbstractImpl<PlayerRecordV, PlayerRecordVOpal> implements PlayerRecordV {

	private final PlayerRecordVOpal myPlayerRecordVOpal;

	public PlayerRecordVImpl(PlayerRecordVOpal argPlayerRecordVOpal) {
		super();
		myPlayerRecordVOpal = org.apache.commons.lang3.Validate.notNull(argPlayerRecordVOpal);
	}

	protected PlayerRecordVOpal getPlayerRecordVOpal() {
		return myPlayerRecordVOpal;
	}

	@Override
	protected com.opal.EphemeralOpal<? extends PlayerRecordV> getOpal() {
		return getPlayerRecordVOpal();
	}

	@Override
	protected com.opal.EphemeralOpal<? extends PlayerRecordV> getBottomOpal() {
		return getPlayerRecordVOpal();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getTournamentCode() {
		return getPlayerRecordVOpal().getTournamentCode();
	}

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getPlayerIdAsObject() {
		return getPlayerRecordVOpal().getPlayerIdAsObject();
	}

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Long getWinCountAsObject() {
		return getPlayerRecordVOpal().getWinCountAsObject();
	}

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Long getLossCountAsObject() {
		return getPlayerRecordVOpal().getLossCountAsObject();
	}

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getPointsAsObject() {
		return getPlayerRecordVOpal().getPointsAsObject();
	}

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getTossupsHeardAsObject() {
		return getPlayerRecordVOpal().getTossupsHeardAsObject();
	}

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Double getAverageCorrectBuzzDepthInWinsAsObject() {
		return getPlayerRecordVOpal().getAverageCorrectBuzzDepthInWinsAsObject();
	}

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Double getAverageCorrectBuzzDepthInLossesAsObject() {
		return getPlayerRecordVOpal().getAverageCorrectBuzzDepthInLossesAsObject();
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the Tournament object created from player_record_v through reference UNNAMED_INFERRED_KEY */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public Tournament getTournament() {
		TournamentOpal lclTournamentOpal = getPlayerRecordVOpal().getTournamentOpal();
		return lclTournamentOpal == null ? null : lclTournamentOpal.getUserFacing();
	}

	/** @return the Player object created from player_record_v through reference UNNAMED_INFERRED_KEY */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public Player getPlayer() {
		PlayerOpal lclPlayerOpal = getPlayerRecordVOpal().getPlayerOpal();
		return lclPlayerOpal == null ? null : lclPlayerOpal.getUserFacing();
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

}
