package com.scobolsolo.persistence;


public class PlayerCategoryPointVImpl extends com.opal.AbstractImpl<com.scobolsolo.application.PlayerCategoryPointV, com.scobolsolo.persistence.PlayerCategoryPointVOpal> implements com.scobolsolo.application.PlayerCategoryPointV {

	private final com.scobolsolo.persistence.PlayerCategoryPointVOpal myPlayerCategoryPointVOpal;

	public PlayerCategoryPointVImpl(PlayerCategoryPointVOpal argPlayerCategoryPointVOpal) {
		super();
		myPlayerCategoryPointVOpal = org.apache.commons.lang3.Validate.notNull(argPlayerCategoryPointVOpal);
	}

	protected com.scobolsolo.persistence.PlayerCategoryPointVOpal getPlayerCategoryPointVOpal() {
		return myPlayerCategoryPointVOpal;
	}

	@Override
	protected com.opal.EphemeralOpal<? extends com.scobolsolo.application.PlayerCategoryPointV> getOpal() {
		return getPlayerCategoryPointVOpal();
	}

	@Override
	protected com.opal.EphemeralOpal<? extends com.scobolsolo.application.PlayerCategoryPointV> getBottomOpal() {
		return getPlayerCategoryPointVOpal();
	}

	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getTournamentCode() {
		return getPlayerCategoryPointVOpal().getTournamentCode();
	}

	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getPlayerIdAsObject() {
		return getPlayerCategoryPointVOpal().getPlayerIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getCategoryCode() {
		return getPlayerCategoryPointVOpal().getCategoryCode();
	}

	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getTossupsHeardAsObject() {
		return getPlayerCategoryPointVOpal().getTossupsHeardAsObject();
	}

	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getPointsAsObject() {
		return getPlayerCategoryPointVOpal().getPointsAsObject();
	}

	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Double getAverageCorrectBuzzDepthAsObject() {
		return getPlayerCategoryPointVOpal().getAverageCorrectBuzzDepthAsObject();
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the Tournament object created from player_category_point_v through reference UNNAMED_INFERRED_KEY */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.Tournament getTournament() {
		TournamentOpal lclTournamentOpal = getPlayerCategoryPointVOpal().getTournamentOpal();
		return lclTournamentOpal == null ? null : lclTournamentOpal.getUserFacing();
	}

	/** @return the Player object created from player_category_point_v through reference UNNAMED_INFERRED_KEY */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.application.Player getPlayer() {
		PlayerOpal lclPlayerOpal = getPlayerCategoryPointVOpal().getPlayerOpal();
		return lclPlayerOpal == null ? null : lclPlayerOpal.getUserFacing();
	}

	/** @return the Category object created from player_category_point_v through reference UNNAMED_INFERRED_KEY */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.Category getCategory() {
		CategoryOpal lclCategoryOpal = getPlayerCategoryPointVOpal().getCategoryOpal();
		return lclCategoryOpal == null ? null : lclCategoryOpal.getUserFacing();
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

}
