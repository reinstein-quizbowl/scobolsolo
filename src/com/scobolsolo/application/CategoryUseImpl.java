package com.scobolsolo.application;

import com.scobolsolo.persistence.CategoryUseOpal;
import com.scobolsolo.persistence.CategoryOpal;
import com.scobolsolo.persistence.TournamentOpal;

public class CategoryUseImpl extends com.opal.AbstractIdentityImpl<CategoryUse, CategoryUseOpal> implements CategoryUse {
	private final CategoryUseOpal myCategoryUseOpal;

	public CategoryUseImpl(CategoryUseOpal argCategoryUseOpal) {
		super();
		myCategoryUseOpal = org.apache.commons.lang3.Validate.notNull(argCategoryUseOpal);
	}

	protected CategoryUseOpal getCategoryUseOpal() {
		return myCategoryUseOpal;
	}

	@Override
	protected com.opal.IdentityOpal<? extends CategoryUse> getOpal() {
		return getCategoryUseOpal();
	}

	@Override
	protected com.opal.IdentityOpal<? extends CategoryUse> getBottomOpal() {
		return getCategoryUseOpal();
	}

	@Override
	public java.lang.String getCategoryCode() {
		return getCategoryUseOpal().getCategoryCode();
	}

	@Override
	public CategoryUseImpl setCategoryCode(java.lang.String argCategoryCode) {
		getCategoryUseOpal().setCategoryCode(argCategoryCode);
		return this;
	}

	@Override
	public java.lang.String getTournamentCode() {
		return getCategoryUseOpal().getTournamentCode();
	}

	@Override
	public CategoryUseImpl setTournamentCode(java.lang.String argTournamentCode) {
		getCategoryUseOpal().setTournamentCode(argTournamentCode);
		return this;
	}

	@Override
	public java.lang.Integer getNeedsAsObject() {
		return getCategoryUseOpal().getNeedsAsObject();
	}

	@Override
	public CategoryUseImpl setNeeds(java.lang.Integer argNeeds) {
		getCategoryUseOpal().setNeeds(argNeeds);
		return this;
	}

	@Override
	public CategoryUseImpl setNeeds(int argNeeds) {
		getCategoryUseOpal().setNeeds(argNeeds);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the Category object created from category_use through reference category_use_category_code_fkey */

	@Override
	public Category getCategory() {
		CategoryOpal lclCategoryOpal = getCategoryUseOpal().getCategoryOpal();
		return lclCategoryOpal == null ? null : lclCategoryOpal.getUserFacing();
	}

	@Override
	public CategoryUse setCategory(Category argCategory) {
		getCategoryUseOpal().setCategoryOpal(argCategory == null ? null : ((CategoryImpl) argCategory).getCategoryOpal());
		return this;
	}

	/** @return the Tournament object created from category_use through reference category_use_tournament_code_fkey */

	@Override
	public Tournament getTournament() {
		TournamentOpal lclTournamentOpal = getCategoryUseOpal().getTournamentOpal();
		return lclTournamentOpal == null ? null : lclTournamentOpal.getUserFacing();
	}

	@Override
	public CategoryUse setTournament(Tournament argTournament) {
		getCategoryUseOpal().setTournamentOpal(argTournament == null ? null : ((TournamentImpl) argTournament).getTournamentOpal());
		return this;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public void unlink() {
		getCategoryUseOpal().unlink();
	}

	@Override
	public void reload() {
		getCategoryUseOpal().reload();
	}

	@Override
	public CategoryUse copy() {
		return getCategoryUseOpal().copy().getUserFacing();
	}

}
