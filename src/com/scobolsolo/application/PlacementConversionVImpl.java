package com.scobolsolo.application;

import com.scobolsolo.persistence.PlacementConversionVOpal;
import com.scobolsolo.persistence.ResponseTypeOpal;
import com.scobolsolo.persistence.TournamentOpal;
import com.scobolsolo.persistence.QuestionOpal;
import com.scobolsolo.persistence.PlacementOpal;

public class PlacementConversionVImpl extends com.opal.AbstractImpl<PlacementConversionV, PlacementConversionVOpal> implements PlacementConversionV {

	private final PlacementConversionVOpal myPlacementConversionVOpal;

	public PlacementConversionVImpl(PlacementConversionVOpal argPlacementConversionVOpal) {
		super();
		myPlacementConversionVOpal = org.apache.commons.lang3.Validate.notNull(argPlacementConversionVOpal);
	}

	protected PlacementConversionVOpal getPlacementConversionVOpal() {
		return myPlacementConversionVOpal;
	}

	@Override
	protected com.opal.EphemeralOpal<? extends PlacementConversionV> getOpal() {
		return getPlacementConversionVOpal();
	}

	@Override
	protected com.opal.EphemeralOpal<? extends PlacementConversionV> getBottomOpal() {
		return getPlacementConversionVOpal();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getTournamentCode() {
		return getPlacementConversionVOpal().getTournamentCode();
	}

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getPlacementIdAsObject() {
		return getPlacementConversionVOpal().getPlacementIdAsObject();
	}

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getQuestionIdAsObject() {
		return getPlacementConversionVOpal().getQuestionIdAsObject();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getResponseTypeCode() {
		return getPlacementConversionVOpal().getResponseTypeCode();
	}

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getResponseTypeCountAsObject() {
		return getPlacementConversionVOpal().getResponseTypeCountAsObject();
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the ResponseType object created from placement_conversion_v through reference UNNAMED_INFERRED_KEY */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public ResponseType getResponseType() {
		ResponseTypeOpal lclResponseTypeOpal = getPlacementConversionVOpal().getResponseTypeOpal();
		return lclResponseTypeOpal == null ? null : lclResponseTypeOpal.getUserFacing();
	}

	/** @return the Tournament object created from placement_conversion_v through reference UNNAMED_INFERRED_KEY */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public Tournament getTournament() {
		TournamentOpal lclTournamentOpal = getPlacementConversionVOpal().getTournamentOpal();
		return lclTournamentOpal == null ? null : lclTournamentOpal.getUserFacing();
	}

	/** @return the Question object created from placement_conversion_v through reference UNNAMED_INFERRED_KEY */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public Question getQuestion() {
		QuestionOpal lclQuestionOpal = getPlacementConversionVOpal().getQuestionOpal();
		return lclQuestionOpal == null ? null : lclQuestionOpal.getUserFacing();
	}

	/** @return the Placement object created from placement_conversion_v through reference UNNAMED_INFERRED_KEY */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public Placement getPlacement() {
		PlacementOpal lclPlacementOpal = getPlacementConversionVOpal().getPlacementOpal();
		return lclPlacementOpal == null ? null : lclPlacementOpal.getUserFacing();
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

}
