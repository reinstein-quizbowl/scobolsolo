package com.scobolsolo.application;

import com.scobolsolo.persistence.CategoryConversionVOpal;
import com.scobolsolo.persistence.ResponseTypeOpal;
import com.scobolsolo.persistence.TournamentOpal;
import com.scobolsolo.persistence.CategoryOpal;

public class CategoryConversionVImpl extends com.opal.AbstractImpl<CategoryConversionV, CategoryConversionVOpal> implements CategoryConversionV {
	private final CategoryConversionVOpal myCategoryConversionVOpal;

	public CategoryConversionVImpl(CategoryConversionVOpal argCategoryConversionVOpal) {
		super();
		myCategoryConversionVOpal = org.apache.commons.lang3.Validate.notNull(argCategoryConversionVOpal);
	}

	protected CategoryConversionVOpal getCategoryConversionVOpal() {
		return myCategoryConversionVOpal;
	}

	@Override
	protected com.opal.EphemeralOpal<? extends CategoryConversionV> getOpal() {
		return getCategoryConversionVOpal();
	}

	@Override
	protected com.opal.EphemeralOpal<? extends CategoryConversionV> getBottomOpal() {
		return getCategoryConversionVOpal();
	}

	@Override
	public java.lang.String getTournamentCode() {
		return getCategoryConversionVOpal().getTournamentCode();
	}

	@Override
	public java.lang.String getCategoryCode() {
		return getCategoryConversionVOpal().getCategoryCode();
	}

	@Override
	public java.lang.String getResponseTypeCode() {
		return getCategoryConversionVOpal().getResponseTypeCode();
	}

	@Override
	public java.lang.Integer getResponseTypeCountAsObject() {
		return getCategoryConversionVOpal().getResponseTypeCountAsObject();
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the ResponseType object created from category_conversion_v through reference UNNAMED_INFERRED_KEY */

	@Override
	public ResponseType getResponseType() {
		ResponseTypeOpal lclResponseTypeOpal = getCategoryConversionVOpal().getResponseTypeOpal();
		return lclResponseTypeOpal == null ? null : lclResponseTypeOpal.getUserFacing();
	}

	/** @return the Tournament object created from category_conversion_v through reference UNNAMED_INFERRED_KEY */

	@Override
	public Tournament getTournament() {
		TournamentOpal lclTournamentOpal = getCategoryConversionVOpal().getTournamentOpal();
		return lclTournamentOpal == null ? null : lclTournamentOpal.getUserFacing();
	}

	/** @return the Category object created from category_conversion_v through reference UNNAMED_INFERRED_KEY */

	@Override
	public Category getCategory() {
		CategoryOpal lclCategoryOpal = getCategoryConversionVOpal().getCategoryOpal();
		return lclCategoryOpal == null ? null : lclCategoryOpal.getUserFacing();
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public void unlink() {
		getCategoryConversionVOpal().unlink();
	}

	@Override
	public void reload() {
		getCategoryConversionVOpal().reload();
	}

}
