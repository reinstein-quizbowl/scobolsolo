package com.scobolsolo.application;

import com.scobolsolo.persistence.PlayerRecordVOpal;
import com.scobolsolo.persistence.TournamentOpal;
import com.scobolsolo.persistence.PlayerOpal;

public class PlayerRecordVImpl extends com.opal.AbstractImpl<PlayerRecordVOpal> implements PlayerRecordV {
	private final PlayerRecordVOpal myPlayerRecordVOpal;

	public PlayerRecordVImpl(PlayerRecordVOpal argPlayerRecordVOpal) {
		super();
		myPlayerRecordVOpal = org.apache.commons.lang3.Validate.notNull(argPlayerRecordVOpal);
	}

	protected PlayerRecordVOpal getPlayerRecordVOpal() {
		return myPlayerRecordVOpal;
	}

	@Override
	protected /* Opal<? extends UserFacing> */ PlayerRecordVOpal getBottomOpal() {
		return getPlayerRecordVOpal();
	}

	@Override
	protected /* Opal<? extends UserFacing> */ PlayerRecordVOpal[] getOpalArray() {
		return new /* Opal<?> */ PlayerRecordVOpal[] {
			getPlayerRecordVOpal(),
		};
	}

	@Override
	public java.lang.String getTournamentCode() {
		return getPlayerRecordVOpal().getTournamentCode();
	}

	@Override
	public java.lang.Integer getPlayerIdAsObject() {
		return getPlayerRecordVOpal().getPlayerIdAsObject();
	}

	@Override
	public java.lang.Long getWinCountAsObject() {
		return getPlayerRecordVOpal().getWinCountAsObject();
	}

	@Override
	public java.lang.Long getLossCountAsObject() {
		return getPlayerRecordVOpal().getLossCountAsObject();
	}

	@Override
	public java.lang.Integer getPointsAsObject() {
		return getPlayerRecordVOpal().getPointsAsObject();
	}

	@Override
	public java.lang.Integer getTossupsHeardAsObject() {
		return getPlayerRecordVOpal().getTossupsHeardAsObject();
	}

	/* The following methods allow direct access to the user objects for which
	this object has foreign keys in the database. */

	/** Access to the Tournament object created from the table player_record_v through foreign key UNNAMED_INFERRED_KEY */

	@Override
	public Tournament getTournament() {
		TournamentOpal lclTournamentOpal = getPlayerRecordVOpal().getTournamentOpal();
		return lclTournamentOpal == null ? null : lclTournamentOpal.getUserFacing();
	}

	/** Access to the Player object created from the table player_record_v through foreign key UNNAMED_INFERRED_KEY */

	@Override
	public Player getPlayer() {
		PlayerOpal lclPlayerOpal = getPlayerRecordVOpal().getPlayerOpal();
		return lclPlayerOpal == null ? null : lclPlayerOpal.getUserFacing();
	}

	/* The following methods allow access to the user objects that have foreign keys
	to this object. */

	@Override
	public void unlink() {
		getPlayerRecordVOpal().unlink();
	}

	@Override
	public void reload() {
		getPlayerRecordVOpal().reload();
	}

}
