package com.scobolsolo.persistence;

public class PlacementConversionVImpl extends com.opal.AbstractImpl<com.scobolsolo.application.PlacementConversionV, com.scobolsolo.persistence.PlacementConversionVOpal> implements com.scobolsolo.application.PlacementConversionV {

	private final com.scobolsolo.persistence.PlacementConversionVOpal myPlacementConversionVOpal;

	public PlacementConversionVImpl(PlacementConversionVOpal argPlacementConversionVOpal) {
		super();
		myPlacementConversionVOpal = org.apache.commons.lang3.Validate.notNull(argPlacementConversionVOpal);
	}

	protected com.scobolsolo.persistence.PlacementConversionVOpal getPlacementConversionVOpal() {
		return myPlacementConversionVOpal;
	}

	@Override
	public com.scobolsolo.persistence.PlacementConversionVOpal getOpal() {
		return getPlacementConversionVOpal();
	}

	@Override
	public com.scobolsolo.persistence.PlacementConversionVOpal getBottomOpal() {
		return getPlacementConversionVOpal();
	}

	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getTournamentCode() {
		return getPlacementConversionVOpal().getTournamentCode();
	}

	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getPlacementIdAsObject() {
		return getPlacementConversionVOpal().getPlacementIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getQuestionIdAsObject() {
		return getPlacementConversionVOpal().getQuestionIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getResponseTypeCode() {
		return getPlacementConversionVOpal().getResponseTypeCode();
	}

	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getResponseTypeCountAsObject() {
		return getPlacementConversionVOpal().getResponseTypeCountAsObject();
	}

	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Double getAverageBuzzDepthAsObject() {
		return getPlacementConversionVOpal().getAverageBuzzDepthAsObject();
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the ResponseType object created from placement_conversion_v through reference UNNAMED_INFERRED_KEY */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.ResponseType getResponseType() {
		ResponseTypeOpal lclResponseTypeOpal = getPlacementConversionVOpal().getResponseTypeOpal();
		return lclResponseTypeOpal == null ? null : lclResponseTypeOpal.getUserFacing();
	}

	/** @return the Tournament object created from placement_conversion_v through reference UNNAMED_INFERRED_KEY */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.Tournament getTournament() {
		TournamentOpal lclTournamentOpal = getPlacementConversionVOpal().getTournamentOpal();
		return lclTournamentOpal == null ? null : lclTournamentOpal.getUserFacing();
	}

	/** @return the Question object created from placement_conversion_v through reference UNNAMED_INFERRED_KEY */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.application.Question getQuestion() {
		QuestionOpal lclQuestionOpal = getPlacementConversionVOpal().getQuestionOpal();
		return lclQuestionOpal == null ? null : lclQuestionOpal.getUserFacing();
	}

	/** @return the Placement object created from placement_conversion_v through reference UNNAMED_INFERRED_KEY */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.application.Placement getPlacement() {
		PlacementOpal lclPlacementOpal = getPlacementConversionVOpal().getPlacementOpal();
		return lclPlacementOpal == null ? null : lclPlacementOpal.getUserFacing();
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

}
