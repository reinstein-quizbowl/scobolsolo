package com.scobolsolo.application;

import com.scobolsolo.persistence.PlayerCategoryPointVOpal;
import com.scobolsolo.persistence.TournamentOpal;
import com.scobolsolo.persistence.PlayerOpal;
import com.scobolsolo.persistence.CategoryOpal;

public class PlayerCategoryPointVImpl extends com.opal.AbstractImpl<PlayerCategoryPointVOpal> implements PlayerCategoryPointV {
	private final PlayerCategoryPointVOpal myPlayerCategoryPointVOpal;

	public PlayerCategoryPointVImpl(PlayerCategoryPointVOpal argPlayerCategoryPointVOpal) {
		super();
		myPlayerCategoryPointVOpal = org.apache.commons.lang3.Validate.notNull(argPlayerCategoryPointVOpal);
	}

	protected PlayerCategoryPointVOpal getPlayerCategoryPointVOpal() {
		return myPlayerCategoryPointVOpal;
	}

	@Override
	protected /* Opal<? extends UserFacing> */ PlayerCategoryPointVOpal getBottomOpal() {
		return getPlayerCategoryPointVOpal();
	}

	@Override
	protected /* Opal<? extends UserFacing> */ PlayerCategoryPointVOpal[] getOpalArray() {
		return new /* Opal<?> */ PlayerCategoryPointVOpal[] {
			getPlayerCategoryPointVOpal(),
		};
	}

	@Override
	public java.lang.String getTournamentCode() {
		return getPlayerCategoryPointVOpal().getTournamentCode();
	}

	@Override
	public java.lang.Integer getPlayerIdAsObject() {
		return getPlayerCategoryPointVOpal().getPlayerIdAsObject();
	}

	@Override
	public java.lang.String getCategoryCode() {
		return getPlayerCategoryPointVOpal().getCategoryCode();
	}

	@Override
	public java.lang.Integer getTossupsHeardAsObject() {
		return getPlayerCategoryPointVOpal().getTossupsHeardAsObject();
	}

	@Override
	public java.lang.Integer getPointsAsObject() {
		return getPlayerCategoryPointVOpal().getPointsAsObject();
	}

	/* The following methods allow direct access to the user objects for which
	this object has foreign keys in the database. */

	/** Access to the Tournament object created from the table player_category_point_v through foreign key UNNAMED_INFERRED_KEY */

	@Override
	public Tournament getTournament() {
		TournamentOpal lclTournamentOpal = getPlayerCategoryPointVOpal().getTournamentOpal();
		return lclTournamentOpal == null ? null : lclTournamentOpal.getUserFacing();
	}

	/** Access to the Player object created from the table player_category_point_v through foreign key UNNAMED_INFERRED_KEY */

	@Override
	public Player getPlayer() {
		PlayerOpal lclPlayerOpal = getPlayerCategoryPointVOpal().getPlayerOpal();
		return lclPlayerOpal == null ? null : lclPlayerOpal.getUserFacing();
	}

	/** Access to the Category object created from the table player_category_point_v through foreign key UNNAMED_INFERRED_KEY */

	@Override
	public Category getCategory() {
		CategoryOpal lclCategoryOpal = getPlayerCategoryPointVOpal().getCategoryOpal();
		return lclCategoryOpal == null ? null : lclCategoryOpal.getUserFacing();
	}

	/* The following methods allow access to the user objects that have foreign keys
	to this object. */

	@Override
	public void unlink() {
		getPlayerCategoryPointVOpal().unlink();
	}

	@Override
	public void reload() {
		getPlayerCategoryPointVOpal().reload();
	}

}
