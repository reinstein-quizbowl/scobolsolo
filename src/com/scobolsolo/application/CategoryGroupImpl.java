package com.scobolsolo.application;

import com.scobolsolo.persistence.CategoryGroupOpal;

public class CategoryGroupImpl extends com.opal.AbstractIdentityImpl<CategoryGroup, CategoryGroupOpal> implements CategoryGroup {

	private final CategoryGroupOpal myCategoryGroupOpal;

	public CategoryGroupImpl(CategoryGroupOpal argCategoryGroupOpal) {
		super();
		myCategoryGroupOpal = org.apache.commons.lang3.Validate.notNull(argCategoryGroupOpal);
	}

	protected CategoryGroupOpal getCategoryGroupOpal() {
		return myCategoryGroupOpal;
	}

	@Override
	protected com.opal.IdentityOpal<? extends CategoryGroup> getOpal() {
		return getCategoryGroupOpal();
	}

	@Override
	protected com.opal.IdentityOpal<? extends CategoryGroup> getBottomOpal() {
		return getCategoryGroupOpal();
	}

	@Override
	public int compareTo(CategoryGroup argSecond) {
		return this.getSequenceAsObject().compareTo(argSecond.getSequenceAsObject());
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getCode() {
		return getCategoryGroupOpal().getCode();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public CategoryGroupImpl setCode(java.lang.String argCode) {
		getCategoryGroupOpal().setCode(argCode);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public java.lang.String getName() {
		return getCategoryGroupOpal().getName();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public CategoryGroupImpl setName(java.lang.String argName) {
		getCategoryGroupOpal().setName(argName);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getShortName() {
		return getCategoryGroupOpal().getShortName();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public CategoryGroupImpl setShortName(java.lang.String argShortName) {
		getCategoryGroupOpal().setShortName(argShortName);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getSequenceAsObject() {
		return getCategoryGroupOpal().getSequenceAsObject();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public CategoryGroupImpl setSequence(java.lang.Integer argSequence) {
		getCategoryGroupOpal().setSequence(argSequence);
		return this;
	}

	@Override
	public CategoryGroupImpl setSequence(int argSequence) {
		getCategoryGroupOpal().setSequence(argSequence);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public com.scobolsolo.application.CategoryGroup addCategory(Category argCategory) {
		getCategoryGroupOpal().addCategoryOpal(((CategoryImpl) argCategory).getCategoryOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.CategoryGroup removeCategory(Category argCategory) {
		getCategoryGroupOpal().removeCategoryOpal(((CategoryImpl) argCategory).getCategoryOpal());
		return this;
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
