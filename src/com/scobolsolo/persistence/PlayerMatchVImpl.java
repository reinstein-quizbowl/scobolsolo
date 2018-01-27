package com.scobolsolo.persistence;

public class PlayerMatchVImpl extends com.opal.AbstractImpl<com.scobolsolo.application.PlayerMatchV, com.scobolsolo.persistence.PlayerMatchVOpal> implements com.scobolsolo.application.PlayerMatchV {

	private final com.scobolsolo.persistence.PlayerMatchVOpal myPlayerMatchVOpal;

	public PlayerMatchVImpl(PlayerMatchVOpal argPlayerMatchVOpal) {
		super();
		myPlayerMatchVOpal = org.apache.commons.lang3.Validate.notNull(argPlayerMatchVOpal);
	}

	protected com.scobolsolo.persistence.PlayerMatchVOpal getPlayerMatchVOpal() {
		return myPlayerMatchVOpal;
	}

	@Override
	public com.scobolsolo.persistence.PlayerMatchVOpal getOpal() {
		return getPlayerMatchVOpal();
	}

	@Override
	public com.scobolsolo.persistence.PlayerMatchVOpal getBottomOpal() {
		return getPlayerMatchVOpal();
	}

	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getTournamentCode() {
		return getPlayerMatchVOpal().getTournamentCode();
	}

	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getPlayerIdAsObject() {
		return getPlayerMatchVOpal().getPlayerIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getSchoolRegistrationIdAsObject() {
		return getPlayerMatchVOpal().getSchoolRegistrationIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getPerformanceIdAsObject() {
		return getPlayerMatchVOpal().getPerformanceIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getOpponentPlayerIdAsObject() {
		return getPlayerMatchVOpal().getOpponentPlayerIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getOpponentPerformanceIdAsObject() {
		return getPlayerMatchVOpal().getOpponentPerformanceIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getMatchIdAsObject() {
		return getPlayerMatchVOpal().getMatchIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getGameIdAsObject() {
		return getPlayerMatchVOpal().getGameIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Long getScoreAsObject() {
		return getPlayerMatchVOpal().getScoreAsObject();
	}

	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getAverageCorrectBuzzDepthAsObject() {
		return getPlayerMatchVOpal().getAverageCorrectBuzzDepthAsObject();
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the Game object created from player_match_v through reference UNNAMED_INFERRED_KEY */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.application.Game getGame() {
		GameOpal lclGameOpal = getPlayerMatchVOpal().getGameOpal();
		return lclGameOpal == null ? null : lclGameOpal.getUserFacing();
	}

	/** @return the Tournament object created from player_match_v through reference UNNAMED_INFERRED_KEY */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.Tournament getTournament() {
		TournamentOpal lclTournamentOpal = getPlayerMatchVOpal().getTournamentOpal();
		return lclTournamentOpal == null ? null : lclTournamentOpal.getUserFacing();
	}

	/** @return the Player object created from player_match_v through reference UNNAMED_INFERRED_KEY */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.application.Player getPlayer() {
		PlayerOpal lclPlayerOpal = getPlayerMatchVOpal().getPlayerOpal();
		return lclPlayerOpal == null ? null : lclPlayerOpal.getUserFacing();
	}

	/** @return the Player object created from player_match_v through reference UNNAMED_INFERRED_KEY */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.application.Player getOpponentPlayer() {
		PlayerOpal lclPlayerOpal = getPlayerMatchVOpal().getOpponentPlayerOpal();
		return lclPlayerOpal == null ? null : lclPlayerOpal.getUserFacing();
	}

	/** @return the Match object created from player_match_v through reference UNNAMED_INFERRED_KEY */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.application.Match getMatch() {
		MatchOpal lclMatchOpal = getPlayerMatchVOpal().getMatchOpal();
		return lclMatchOpal == null ? null : lclMatchOpal.getUserFacing();
	}

	/** @return the SchoolRegistration object created from player_match_v through reference UNNAMED_INFERRED_KEY */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.application.SchoolRegistration getSchoolRegistration() {
		SchoolRegistrationOpal lclSchoolRegistrationOpal = getPlayerMatchVOpal().getSchoolRegistrationOpal();
		return lclSchoolRegistrationOpal == null ? null : lclSchoolRegistrationOpal.getUserFacing();
	}

	/** @return the Performance object created from player_match_v through reference UNNAMED_INFERRED_KEY */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.application.Performance getPerformance() {
		PerformanceOpal lclPerformanceOpal = getPlayerMatchVOpal().getPerformanceOpal();
		return lclPerformanceOpal == null ? null : lclPerformanceOpal.getUserFacing();
	}

	/** @return the Performance object created from player_match_v through reference UNNAMED_INFERRED_KEY */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.application.Performance getOpponentPerformance() {
		PerformanceOpal lclPerformanceOpal = getPlayerMatchVOpal().getOpponentPerformanceOpal();
		return lclPerformanceOpal == null ? null : lclPerformanceOpal.getUserFacing();
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

}
