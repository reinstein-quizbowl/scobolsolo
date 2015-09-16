package com.scobolsolo.application;

import com.scobolsolo.persistence.CategoryOpal;
import com.scobolsolo.persistence.CategoryGroupOpal;

public class CategoryImpl extends com.opal.AbstractIdentityImpl<Category, CategoryOpal> implements Category {
	private final CategoryOpal myCategoryOpal;

	public CategoryImpl(CategoryOpal argCategoryOpal) {
		super();
		myCategoryOpal = org.apache.commons.lang3.Validate.notNull(argCategoryOpal);
	}

	protected CategoryOpal getCategoryOpal() {
		return myCategoryOpal;
	}

	@Override
	protected com.opal.IdentityOpal<? extends Category> getOpal() {
		return getCategoryOpal();
	}

	@Override
	protected com.opal.IdentityOpal<? extends Category> getBottomOpal() {
		return getCategoryOpal();
	}

	@Override
	public java.lang.String getCode() {
		return getCategoryOpal().getCode();
	}

	@Override
	public CategoryImpl setCode(java.lang.String argCode) {
		getCategoryOpal().setCode(argCode);
		return this;
	}

	@Override
	public java.lang.String getName() {
		return getCategoryOpal().getName();
	}

	@Override
	public CategoryImpl setName(java.lang.String argName) {
		getCategoryOpal().setName(argName);
		return this;
	}

	@Override
	public java.lang.String getShortName() {
		return getCategoryOpal().getShortName();
	}

	@Override
	public CategoryImpl setShortName(java.lang.String argShortName) {
		getCategoryOpal().setShortName(argShortName);
		return this;
	}

	@Override
	public java.lang.Integer getSequenceAsObject() {
		return getCategoryOpal().getSequenceAsObject();
	}

	@Override
	public CategoryImpl setSequence(java.lang.Integer argSequence) {
		getCategoryOpal().setSequence(argSequence);
		return this;
	}

	@Override
	public CategoryImpl setSequence(int argSequence) {
		getCategoryOpal().setSequence(argSequence);
		return this;
	}

	@Override
	public java.lang.String getCategoryGroupCode() {
		return getCategoryOpal().getCategoryGroupCode();
	}

	@Override
	public CategoryImpl setCategoryGroupCode(java.lang.String argCategoryGroupCode) {
		getCategoryOpal().setCategoryGroupCode(argCategoryGroupCode);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the CategoryGroup object created from category through reference category_category_group_code_fkey */

	@Override
	public CategoryGroup getCategoryGroup() {
		CategoryGroupOpal lclCategoryGroupOpal = getCategoryOpal().getCategoryGroupOpal();
		return lclCategoryGroupOpal == null ? null : lclCategoryGroupOpal.getUserFacing();
	}

	@Override
	public Category setCategoryGroup(CategoryGroup argCategoryGroup) {
		getCategoryOpal().setCategoryGroupOpal(argCategoryGroup == null ? null : ((CategoryGroupImpl) argCategoryGroup).getCategoryGroupOpal());
		return this;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public void addQuestion(Question argQuestion) {
		getCategoryOpal().addQuestionOpal(((QuestionImpl) argQuestion).getQuestionOpal());
	}

	@Override
	public void removeQuestion(Question argQuestion) {
		getCategoryOpal().removeQuestionOpal(((QuestionImpl) argQuestion).getQuestionOpal());
	}

	@Override
	public int getQuestionCount() {
		return getCategoryOpal().getQuestionOpalCount();
	}

	@Override
	public java.util.stream.Stream<Question> streamQuestion() {
		return getCategoryOpal().streamQuestionOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<Question> createQuestionIterator() {
		return new com.opal.OpalIterator<> (getCategoryOpal().createQuestionOpalIterator());
	}

	@Override
	public void clearQuestion() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addDiff(Diff argDiff) {
		getCategoryOpal().addDiffOpal(((DiffImpl) argDiff).getDiffOpal());
	}

	@Override
	public void removeDiff(Diff argDiff) {
		getCategoryOpal().removeDiffOpal(((DiffImpl) argDiff).getDiffOpal());
	}

	@Override
	public int getDiffCount() {
		return getCategoryOpal().getDiffOpalCount();
	}

	@Override
	public java.util.stream.Stream<Diff> streamDiff() {
		return getCategoryOpal().streamDiffOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<Diff> createDiffIterator() {
		return new com.opal.OpalIterator<> (getCategoryOpal().createDiffOpalIterator());
	}

	@Override
	public void clearDiff() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addCategoryUse(CategoryUse argCategoryUse) {
		getCategoryOpal().addCategoryUseOpal(((CategoryUseImpl) argCategoryUse).getCategoryUseOpal());
	}

	@Override
	public void removeCategoryUse(CategoryUse argCategoryUse) {
		getCategoryOpal().removeCategoryUseOpal(((CategoryUseImpl) argCategoryUse).getCategoryUseOpal());
	}

	@Override
	public int getCategoryUseCount() {
		return getCategoryOpal().getCategoryUseOpalCount();
	}

	@Override
	public java.util.stream.Stream<CategoryUse> streamCategoryUse() {
		return getCategoryOpal().streamCategoryUseOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<CategoryUse> createCategoryUseIterator() {
		return new com.opal.OpalIterator<> (getCategoryOpal().createCategoryUseOpalIterator());
	}

	@Override
	public void clearCategoryUse() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addPlacement(Placement argPlacement) {
		getCategoryOpal().addPlacementOpal(((PlacementImpl) argPlacement).getPlacementOpal());
	}

	@Override
	public void removePlacement(Placement argPlacement) {
		getCategoryOpal().removePlacementOpal(((PlacementImpl) argPlacement).getPlacementOpal());
	}

	@Override
	public int getPlacementCount() {
		return getCategoryOpal().getPlacementOpalCount();
	}

	@Override
	public java.util.stream.Stream<Placement> streamPlacement() {
		return getCategoryOpal().streamPlacementOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<Placement> createPlacementIterator() {
		return new com.opal.OpalIterator<> (getCategoryOpal().createPlacementOpalIterator());
	}

	@Override
	public void clearPlacement() {
		throw new UnsupportedOperationException();
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
	public Category copy() {
		return getCategoryOpal().copy().getUserFacing();
	}

}
