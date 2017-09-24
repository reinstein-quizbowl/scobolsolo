package com.scobolsolo.persistence;

public class CategoryGroupImpl extends com.opal.AbstractIdentityImpl<com.scobolsolo.application.CategoryGroup, com.scobolsolo.persistence.CategoryGroupOpal> implements com.scobolsolo.application.CategoryGroup {

	private final com.scobolsolo.persistence.CategoryGroupOpal myCategoryGroupOpal;

	public CategoryGroupImpl(CategoryGroupOpal argCategoryGroupOpal) {
		super();
		myCategoryGroupOpal = org.apache.commons.lang3.Validate.notNull(argCategoryGroupOpal);
	}

	protected com.scobolsolo.persistence.CategoryGroupOpal getCategoryGroupOpal() {
		return myCategoryGroupOpal;
	}

	@Override
	public com.scobolsolo.persistence.CategoryGroupOpal getOpal() {
		return getCategoryGroupOpal();
	}

	@Override
	public com.scobolsolo.persistence.CategoryGroupOpal getBottomOpal() {
		return getCategoryGroupOpal();
	}

	@Override
	public int compareTo(com.scobolsolo.application.CategoryGroup argSecond) {
		return this.getSequenceAsObject().compareTo(argSecond.getSequenceAsObject());
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getCode() {
		return getCategoryGroupOpal().getCode();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public com.scobolsolo.persistence.CategoryGroupImpl setCode(java.lang.String argCode) {
		getCategoryGroupOpal().setCode(argCode);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public java.lang.String getName() {
		return getCategoryGroupOpal().getName();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public com.scobolsolo.persistence.CategoryGroupImpl setName(java.lang.String argName) {
		getCategoryGroupOpal().setName(argName);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getShortName() {
		return getCategoryGroupOpal().getShortName();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public com.scobolsolo.persistence.CategoryGroupImpl setShortName(java.lang.String argShortName) {
		getCategoryGroupOpal().setShortName(argShortName);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getSequenceAsObject() {
		return getCategoryGroupOpal().getSequenceAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.CategoryGroupImpl setSequence(java.lang.Integer argSequence) {
		getCategoryGroupOpal().setSequence(argSequence);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.CategoryGroupImpl setSequence(int argSequence) {
		getCategoryGroupOpal().setSequence(argSequence);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public java.util.Set<com.scobolsolo.application.Category> getCategorySet() {
		return new com.opal.UserFacingBackCollectionSet<>(getCategoryGroupOpal().getCategoryOpalSet());
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
	public com.scobolsolo.application.CategoryGroup copy() {
		return getCategoryGroupOpal().copy().getUserFacing();
	}

}
