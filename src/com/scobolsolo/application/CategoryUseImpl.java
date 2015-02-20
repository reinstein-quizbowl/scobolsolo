package com.scobolsolo.application;

import com.scobolsolo.persistence.CategoryUseOpal;
import com.scobolsolo.persistence.CategoryOpal;
import com.scobolsolo.persistence.TournamentOpal;

public class CategoryUseImpl extends com.opal.AbstractIdentityImpl<CategoryUseOpal> implements CategoryUse {
	private final CategoryUseOpal myCategoryUseOpal;

	public CategoryUseImpl(CategoryUseOpal argCategoryUseOpal) {
		super();
		myCategoryUseOpal = org.apache.commons.lang3.Validate.notNull(argCategoryUseOpal);
	}

	protected CategoryUseOpal getCategoryUseOpal() {
		return myCategoryUseOpal;
	}

	@Override
	protected /* Opal<? extends UserFacing> */ CategoryUseOpal getBottomOpal() {
		return getCategoryUseOpal();
	}

	@Override
	protected /* Opal<? extends UserFacing> */ CategoryUseOpal[] getOpalArray() {
		return new /* Opal<?> */ CategoryUseOpal[] {
			getCategoryUseOpal(),
		};
	}

	@Override
	public java.lang.String getCategoryCode() {
		return getCategoryUseOpal().getCategoryCode();
	}

	@Override
	public void setCategoryCode(java.lang.String argCategoryCode) {
		getCategoryUseOpal().setCategoryCode(argCategoryCode);
		return;
	}

	@Override
	public java.lang.String getTournamentCode() {
		return getCategoryUseOpal().getTournamentCode();
	}

	@Override
	public void setTournamentCode(java.lang.String argTournamentCode) {
		getCategoryUseOpal().setTournamentCode(argTournamentCode);
		return;
	}

	/* The following methods allow direct access to the user objects for which
	this object has foreign keys in the database. */

	/** Access to the Category object created from the table category_use through foreign key category_use_category_code_fkey */

	@Override
	public Category getCategory() {
		CategoryOpal lclCategoryOpal = getCategoryUseOpal().getCategoryOpal();
		return lclCategoryOpal == null ? null : lclCategoryOpal.getUserFacing();
	}

	@Override
	public void setCategory(Category argCategory) {
		getCategoryUseOpal().setCategoryOpal(argCategory == null ? null : ((CategoryImpl) argCategory).getCategoryOpal());
		return;
	}

	/** Access to the Tournament object created from the table category_use through foreign key category_use_tournament_code_fkey */

	@Override
	public Tournament getTournament() {
		TournamentOpal lclTournamentOpal = getCategoryUseOpal().getTournamentOpal();
		return lclTournamentOpal == null ? null : lclTournamentOpal.getUserFacing();
	}

	@Override
	public void setTournament(Tournament argTournament) {
		getCategoryUseOpal().setTournamentOpal(argTournament == null ? null : ((TournamentImpl) argTournament).getTournamentOpal());
		return;
	}

	/* The following methods allow access to the user objects that have foreign keys
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
