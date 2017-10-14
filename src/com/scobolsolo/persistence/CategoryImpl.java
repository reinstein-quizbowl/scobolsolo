package com.scobolsolo.persistence;

public class CategoryImpl extends com.opal.AbstractIdentityImpl<com.scobolsolo.application.Category, com.scobolsolo.persistence.CategoryOpal> implements com.scobolsolo.application.Category {

	private final com.scobolsolo.persistence.CategoryOpal myCategoryOpal;

	public CategoryImpl(CategoryOpal argCategoryOpal) {
		super();
		myCategoryOpal = org.apache.commons.lang3.Validate.notNull(argCategoryOpal);
	}

	protected com.scobolsolo.persistence.CategoryOpal getCategoryOpal() {
		return myCategoryOpal;
	}

	@Override
	public com.scobolsolo.persistence.CategoryOpal getOpal() {
		return getCategoryOpal();
	}

	@Override
	public com.scobolsolo.persistence.CategoryOpal getBottomOpal() {
		return getCategoryOpal();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getCode() {
		return getCategoryOpal().getCode();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public com.scobolsolo.persistence.CategoryImpl setCode(java.lang.String argCode) {
		getCategoryOpal().setCode(argCode);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public java.lang.String getName() {
		return getCategoryOpal().getName();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public com.scobolsolo.persistence.CategoryImpl setName(java.lang.String argName) {
		getCategoryOpal().setName(argName);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getShortName() {
		return getCategoryOpal().getShortName();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public com.scobolsolo.persistence.CategoryImpl setShortName(java.lang.String argShortName) {
		getCategoryOpal().setShortName(argShortName);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getSequenceAsObject() {
		return getCategoryOpal().getSequenceAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.CategoryImpl setSequence(java.lang.Integer argSequence) {
		getCategoryOpal().setSequence(argSequence);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.CategoryImpl setSequence(int argSequence) {
		getCategoryOpal().setSequence(argSequence);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getCategoryGroupCode() {
		return getCategoryOpal().getCategoryGroupCode();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public com.scobolsolo.persistence.CategoryImpl setCategoryGroupCode(java.lang.String argCategoryGroupCode) {
		getCategoryOpal().setCategoryGroupCode(argCategoryGroupCode);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	@Override
	public java.lang.Boolean isAllowPronunciationGuideSuppressionAsObject() {
		return getCategoryOpal().isAllowPronunciationGuideSuppressionAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	@Override
	public com.scobolsolo.persistence.CategoryImpl setAllowPronunciationGuideSuppression(java.lang.Boolean argAllowPronunciationGuideSuppression) {
		getCategoryOpal().setAllowPronunciationGuideSuppression(argAllowPronunciationGuideSuppression);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.CategoryImpl setAllowPronunciationGuideSuppression(boolean argAllowPronunciationGuideSuppression) {
		getCategoryOpal().setAllowPronunciationGuideSuppression(argAllowPronunciationGuideSuppression);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the CategoryGroup object created from category through reference category_category_group_code_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.CategoryGroup getCategoryGroup() {
		CategoryGroupOpal lclCategoryGroupOpal = getCategoryOpal().getCategoryGroupOpal();
		return lclCategoryGroupOpal == null ? null : lclCategoryGroupOpal.getUserFacing();
	}

	@Override
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.Category setCategoryGroup(com.scobolsolo.application.CategoryGroup argCategoryGroup) {
		getCategoryOpal().setCategoryGroupOpal(argCategoryGroup == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.CategoryGroup, com.scobolsolo.persistence.CategoryGroupOpal>) argCategoryGroup).getOpal());
		return this;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public java.util.Set<com.scobolsolo.application.PronunciationGuideSuppression> getPronunciationGuideSuppressionSet() {
		return new com.opal.UserFacingBackCollectionSet<>(getCategoryOpal().getPronunciationGuideSuppressionOpalSet());
	}

	@Override
	public java.util.Set<com.scobolsolo.application.Diff> getDiffSet() {
		return new com.opal.UserFacingBackCollectionSet<>(getCategoryOpal().getDiffOpalSet());
	}

	@Override
	public java.util.Set<com.scobolsolo.application.CategoryUse> getCategoryUseSet() {
		return new com.opal.UserFacingBackCollectionSet<>(getCategoryOpal().getCategoryUseOpalSet());
	}

	@Override
	public java.util.Set<com.scobolsolo.application.Placement> getPlacementSet() {
		return new com.opal.UserFacingBackCollectionSet<>(getCategoryOpal().getPlacementOpalSet());
	}

	@Override
	public void unlink() {
		getCategoryOpal().unlink();
	}

	@Override
	public void reload() {
		getCategoryOpal().reload();
	}

	@Override
	public com.scobolsolo.application.Category copy() {
		return getCategoryOpal().copy().getUserFacing();
	}

}
