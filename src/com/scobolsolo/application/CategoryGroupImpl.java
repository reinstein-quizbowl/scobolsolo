package com.scobolsolo.application;

import com.scobolsolo.persistence.CategoryGroupOpal;

public class CategoryGroupImpl extends com.opal.AbstractIdentityImpl<CategoryGroupOpal> implements CategoryGroup {
	private final CategoryGroupOpal myCategoryGroupOpal;

	public CategoryGroupImpl(CategoryGroupOpal argCategoryGroupOpal) {
		super();
		myCategoryGroupOpal = org.apache.commons.lang3.Validate.notNull(argCategoryGroupOpal);
	}

	protected CategoryGroupOpal getCategoryGroupOpal() {
		return myCategoryGroupOpal;
	}

	@Override
	protected /* Opal<? extends UserFacing> */ CategoryGroupOpal getBottomOpal() {
		return getCategoryGroupOpal();
	}

	@Override
	protected /* Opal<? extends UserFacing> */ CategoryGroupOpal[] getOpalArray() {
		return new /* Opal<?> */ CategoryGroupOpal[] {
			getCategoryGroupOpal(),
		};
	}

	@Override
	public int compareTo(CategoryGroup argSecond) {
		return this.getSequenceAsObject().compareTo(argSecond.getSequenceAsObject());
	}

	@Override
	public java.lang.String getCode() {
		return getCategoryGroupOpal().getCode();
	}

	@Override
	public void setCode(java.lang.String argCode) {
		getCategoryGroupOpal().setCode(argCode);
		return;
	}

	@Override
	public java.lang.String getName() {
		return getCategoryGroupOpal().getName();
	}

	@Override
	public void setName(java.lang.String argName) {
		getCategoryGroupOpal().setName(argName);
		return;
	}

	@Override
	public java.lang.String getShortName() {
		return getCategoryGroupOpal().getShortName();
	}

	@Override
	public void setShortName(java.lang.String argShortName) {
		getCategoryGroupOpal().setShortName(argShortName);
		return;
	}

	@Override
	public java.lang.Integer getSequenceAsObject() {
		return getCategoryGroupOpal().getSequenceAsObject();
	}

	@Override
	public void setSequence(java.lang.Integer argSequence) {
		getCategoryGroupOpal().setSequence(argSequence);
		return;
	}

	@Override
	public void setSequence(int argSequence) {
		getCategoryGroupOpal().setSequence(argSequence);
		return;
	}

	/* The following methods allow direct access to the user objects for which
	this object has foreign keys in the database. */

	/* The following methods allow access to the user objects that have foreign keys
	to this object. */

	@Override
	public void addCategory(Category argCategory) {
		getCategoryGroupOpal().addCategoryOpal(((CategoryImpl) argCategory).getCategoryOpal());
	}

	@Override
	public void removeCategory(Category argCategory) {
		getCategoryGroupOpal().removeCategoryOpal(((CategoryImpl) argCategory).getCategoryOpal());
	}

	@Override
	public int getCategoryCount() {
		return getCategoryGroupOpal().getCategoryOpalCount();
	}

	@Override
	public java.util.stream.Stream<Category> streamCategory() {
		return getCategoryGroupOpal().streamCategoryOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<Category> createCategoryIterator() {
		return new com.opal.OpalIterator<> (getCategoryGroupOpal().createCategoryOpalIterator());
	}

	@Override
	public void clearCategory() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void unlink() {
		getCategoryGroupOpal().unlink();
	}

	@Override
	public void reload() {
		getCategoryGroupOpal().reload();
	}

	@Override
	public CategoryGroup copy() {
		return getCategoryGroupOpal().copy().getUserFacing();
	}

}
