package com.scobolsolo.application;

import com.opal.Opal;
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
	protected com.opal.IdentityOpal<? extends Category> getBottomOpal() {
		return getCategoryOpal();
	}

	@Override
	protected Opal<? super Category>[] getOpalArray() {
		return (Opal<? super Category>[]) new Opal<?>[] {
			getCategoryOpal(),
		};
	}

	@Override
	public int compareTo(Category argSecond) {
		return this.getSequenceAsObject().compareTo(argSecond.getSequenceAsObject());
	}

	@Override
	public java.lang.String getCode() {
		return getCategoryOpal().getCode();
	}

	@Override
	public void setCode(java.lang.String argCode) {
		getCategoryOpal().setCode(argCode);
		return;
	}

	@Override
	public java.lang.String getName() {
		return getCategoryOpal().getName();
	}

	@Override
	public void setName(java.lang.String argName) {
		getCategoryOpal().setName(argName);
		return;
	}

	@Override
	public java.lang.String getShortName() {
		return getCategoryOpal().getShortName();
	}

	@Override
	public void setShortName(java.lang.String argShortName) {
		getCategoryOpal().setShortName(argShortName);
		return;
	}

	@Override
	public java.lang.Integer getSequenceAsObject() {
		return getCategoryOpal().getSequenceAsObject();
	}

	@Override
	public void setSequence(java.lang.Integer argSequence) {
		getCategoryOpal().setSequence(argSequence);
		return;
	}

	@Override
	public void setSequence(int argSequence) {
		getCategoryOpal().setSequence(argSequence);
		return;
	}

	@Override
	public java.lang.String getCategoryGroupCode() {
		return getCategoryOpal().getCategoryGroupCode();
	}

	@Override
	public void setCategoryGroupCode(java.lang.String argCategoryGroupCode) {
		getCategoryOpal().setCategoryGroupCode(argCategoryGroupCode);
		return;
	}

	/* The following methods allow direct access to the user objects for which
	this object has foreign keys in the database. */

	/** Access to the CategoryGroup object created from the table category through foreign key category_category_group_code_fkey */

	@Override
	public CategoryGroup getCategoryGroup() {
		CategoryGroupOpal lclCategoryGroupOpal = getCategoryOpal().getCategoryGroupOpal();
		return lclCategoryGroupOpal == null ? null : lclCategoryGroupOpal.getUserFacing();
	}

	@Override
	public void setCategoryGroup(CategoryGroup argCategoryGroup) {
		getCategoryOpal().setCategoryGroupOpal(argCategoryGroup == null ? null : ((CategoryGroupImpl) argCategoryGroup).getCategoryGroupOpal());
		return;
	}

	/* The following methods allow access to the user objects that have foreign keys
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
