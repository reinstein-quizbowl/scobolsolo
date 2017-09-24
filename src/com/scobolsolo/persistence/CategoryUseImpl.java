package com.scobolsolo.persistence;

public class CategoryUseImpl extends com.opal.AbstractIdentityImpl<com.scobolsolo.application.CategoryUse, com.scobolsolo.persistence.CategoryUseOpal> implements com.scobolsolo.application.CategoryUse {

	private final com.scobolsolo.persistence.CategoryUseOpal myCategoryUseOpal;

	public CategoryUseImpl(CategoryUseOpal argCategoryUseOpal) {
		super();
		myCategoryUseOpal = org.apache.commons.lang3.Validate.notNull(argCategoryUseOpal);
	}

	protected com.scobolsolo.persistence.CategoryUseOpal getCategoryUseOpal() {
		return myCategoryUseOpal;
	}

	@Override
	public com.scobolsolo.persistence.CategoryUseOpal getOpal() {
		return getCategoryUseOpal();
	}

	@Override
	public com.scobolsolo.persistence.CategoryUseOpal getBottomOpal() {
		return getCategoryUseOpal();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getCategoryCode() {
		return getCategoryUseOpal().getCategoryCode();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public com.scobolsolo.persistence.CategoryUseImpl setCategoryCode(java.lang.String argCategoryCode) {
		getCategoryUseOpal().setCategoryCode(argCategoryCode);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getTournamentCode() {
		return getCategoryUseOpal().getTournamentCode();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public com.scobolsolo.persistence.CategoryUseImpl setTournamentCode(java.lang.String argTournamentCode) {
		getCategoryUseOpal().setTournamentCode(argTournamentCode);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getNeedsAsObject() {
		return getCategoryUseOpal().getNeedsAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.persistence.CategoryUseImpl setNeeds(java.lang.Integer argNeeds) {
		getCategoryUseOpal().setNeeds(argNeeds);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.CategoryUseImpl setNeeds(int argNeeds) {
		getCategoryUseOpal().setNeeds(argNeeds);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the Category object created from category_use through reference category_use_category_code_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.Category getCategory() {
		CategoryOpal lclCategoryOpal = getCategoryUseOpal().getCategoryOpal();
		return lclCategoryOpal == null ? null : lclCategoryOpal.getUserFacing();
	}

	@Override
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.CategoryUse setCategory(com.scobolsolo.application.Category argCategory) {
		getCategoryUseOpal().setCategoryOpal(argCategory == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.Category, com.scobolsolo.persistence.CategoryOpal>) argCategory).getOpal());
		return this;
	}

	/** @return the Tournament object created from category_use through reference category_use_tournament_code_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.Tournament getTournament() {
		TournamentOpal lclTournamentOpal = getCategoryUseOpal().getTournamentOpal();
		return lclTournamentOpal == null ? null : lclTournamentOpal.getUserFacing();
	}

	@Override
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.CategoryUse setTournament(com.scobolsolo.application.Tournament argTournament) {
		getCategoryUseOpal().setTournamentOpal(argTournament == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.Tournament, com.scobolsolo.persistence.TournamentOpal>) argTournament).getOpal());
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
	public com.scobolsolo.application.CategoryUse copy() {
		return getCategoryUseOpal().copy().getUserFacing();
	}

}
