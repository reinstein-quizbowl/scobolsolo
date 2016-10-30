package com.scobolsolo.persistence;


public class CategoryConversionVImpl extends com.opal.AbstractImpl<com.scobolsolo.application.CategoryConversionV, com.scobolsolo.persistence.CategoryConversionVOpal> implements com.scobolsolo.application.CategoryConversionV {

	private final com.scobolsolo.persistence.CategoryConversionVOpal myCategoryConversionVOpal;

	public CategoryConversionVImpl(CategoryConversionVOpal argCategoryConversionVOpal) {
		super();
		myCategoryConversionVOpal = org.apache.commons.lang3.Validate.notNull(argCategoryConversionVOpal);
	}

	protected com.scobolsolo.persistence.CategoryConversionVOpal getCategoryConversionVOpal() {
		return myCategoryConversionVOpal;
	}

	@Override
	protected com.opal.EphemeralOpal<? extends com.scobolsolo.application.CategoryConversionV> getOpal() {
		return getCategoryConversionVOpal();
	}

	@Override
	protected com.opal.EphemeralOpal<? extends com.scobolsolo.application.CategoryConversionV> getBottomOpal() {
		return getCategoryConversionVOpal();
	}

	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getTournamentCode() {
		return getCategoryConversionVOpal().getTournamentCode();
	}

	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getCategoryCode() {
		return getCategoryConversionVOpal().getCategoryCode();
	}

	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getResponseTypeCode() {
		return getCategoryConversionVOpal().getResponseTypeCode();
	}

	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getResponseTypeCountAsObject() {
		return getCategoryConversionVOpal().getResponseTypeCountAsObject();
	}

	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Double getAverageBuzzDepthAsObject() {
		return getCategoryConversionVOpal().getAverageBuzzDepthAsObject();
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the Category object created from category_conversion_v through reference UNNAMED_REFERENCE_FK */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.application.Category getCategory() {
		CategoryOpal lclCategoryOpal = getCategoryConversionVOpal().getCategoryOpal();
		return lclCategoryOpal == null ? null : lclCategoryOpal.getUserFacing();
	}

	/** @return the ResponseType object created from category_conversion_v through reference UNNAMED_INFERRED_KEY */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.ResponseType getResponseType() {
		ResponseTypeOpal lclResponseTypeOpal = getCategoryConversionVOpal().getResponseTypeOpal();
		return lclResponseTypeOpal == null ? null : lclResponseTypeOpal.getUserFacing();
	}

	/** @return the Tournament object created from category_conversion_v through reference UNNAMED_INFERRED_KEY */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.Tournament getTournament() {
		TournamentOpal lclTournamentOpal = getCategoryConversionVOpal().getTournamentOpal();
		return lclTournamentOpal == null ? null : lclTournamentOpal.getUserFacing();
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

}
