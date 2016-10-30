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
	protected com.opal.IdentityOpal<? extends com.scobolsolo.application.Category> getOpal() {
		return getCategoryOpal();
	}

	@Override
	protected com.opal.IdentityOpal<? extends com.scobolsolo.application.Category> getBottomOpal() {
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
	public com.scobolsolo.application.Category setCategoryGroup(com.scobolsolo.application.CategoryGroup argCategoryGroup) {
		getCategoryOpal().setCategoryGroupOpal(argCategoryGroup == null ? null : ((CategoryGroupImpl) argCategoryGroup).getCategoryGroupOpal());
		return this;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public com.scobolsolo.application.Category addPronunciationGuideSuppression(com.scobolsolo.application.PronunciationGuideSuppression argPronunciationGuideSuppression) {
		getCategoryOpal().addPronunciationGuideSuppressionOpal(((PronunciationGuideSuppressionImpl) argPronunciationGuideSuppression).getPronunciationGuideSuppressionOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Category removePronunciationGuideSuppression(com.scobolsolo.application.PronunciationGuideSuppression argPronunciationGuideSuppression) {
		getCategoryOpal().removePronunciationGuideSuppressionOpal(((PronunciationGuideSuppressionImpl) argPronunciationGuideSuppression).getPronunciationGuideSuppressionOpal());
		return this;
	}

	@Override
	public int getPronunciationGuideSuppressionCount() {
		return getCategoryOpal().getPronunciationGuideSuppressionOpalCount();
	}

	@Override
	public java.util.stream.Stream<com.scobolsolo.application.PronunciationGuideSuppression> streamPronunciationGuideSuppression() {
		return getCategoryOpal().streamPronunciationGuideSuppressionOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<com.scobolsolo.application.PronunciationGuideSuppression> createPronunciationGuideSuppressionIterator() {
		return new com.opal.OpalIterator<> (getCategoryOpal().createPronunciationGuideSuppressionOpalIterator());
	}

	@Override
	public com.scobolsolo.application.Category addQuestion(com.scobolsolo.application.Question argQuestion) {
		getCategoryOpal().addQuestionOpal(((QuestionImpl) argQuestion).getQuestionOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Category removeQuestion(com.scobolsolo.application.Question argQuestion) {
		getCategoryOpal().removeQuestionOpal(((QuestionImpl) argQuestion).getQuestionOpal());
		return this;
	}

	@Override
	public int getQuestionCount() {
		return getCategoryOpal().getQuestionOpalCount();
	}

	@Override
	public java.util.stream.Stream<com.scobolsolo.application.Question> streamQuestion() {
		return getCategoryOpal().streamQuestionOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<com.scobolsolo.application.Question> createQuestionIterator() {
		return new com.opal.OpalIterator<> (getCategoryOpal().createQuestionOpalIterator());
	}

	@Override
	public com.scobolsolo.application.Category addDiff(com.scobolsolo.application.Diff argDiff) {
		getCategoryOpal().addDiffOpal(((DiffImpl) argDiff).getDiffOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Category removeDiff(com.scobolsolo.application.Diff argDiff) {
		getCategoryOpal().removeDiffOpal(((DiffImpl) argDiff).getDiffOpal());
		return this;
	}

	@Override
	public int getDiffCount() {
		return getCategoryOpal().getDiffOpalCount();
	}

	@Override
	public java.util.stream.Stream<com.scobolsolo.application.Diff> streamDiff() {
		return getCategoryOpal().streamDiffOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<com.scobolsolo.application.Diff> createDiffIterator() {
		return new com.opal.OpalIterator<> (getCategoryOpal().createDiffOpalIterator());
	}

	@Override
	public com.scobolsolo.application.Category addCategoryUse(com.scobolsolo.application.CategoryUse argCategoryUse) {
		getCategoryOpal().addCategoryUseOpal(((CategoryUseImpl) argCategoryUse).getCategoryUseOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Category removeCategoryUse(com.scobolsolo.application.CategoryUse argCategoryUse) {
		getCategoryOpal().removeCategoryUseOpal(((CategoryUseImpl) argCategoryUse).getCategoryUseOpal());
		return this;
	}

	@Override
	public int getCategoryUseCount() {
		return getCategoryOpal().getCategoryUseOpalCount();
	}

	@Override
	public java.util.stream.Stream<com.scobolsolo.application.CategoryUse> streamCategoryUse() {
		return getCategoryOpal().streamCategoryUseOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<com.scobolsolo.application.CategoryUse> createCategoryUseIterator() {
		return new com.opal.OpalIterator<> (getCategoryOpal().createCategoryUseOpalIterator());
	}

	@Override
	public com.scobolsolo.application.Category addPlacement(com.scobolsolo.application.Placement argPlacement) {
		getCategoryOpal().addPlacementOpal(((PlacementImpl) argPlacement).getPlacementOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Category removePlacement(com.scobolsolo.application.Placement argPlacement) {
		getCategoryOpal().removePlacementOpal(((PlacementImpl) argPlacement).getPlacementOpal());
		return this;
	}

	@Override
	public int getPlacementCount() {
		return getCategoryOpal().getPlacementOpalCount();
	}

	@Override
	public java.util.stream.Stream<com.scobolsolo.application.Placement> streamPlacement() {
		return getCategoryOpal().streamPlacementOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<com.scobolsolo.application.Placement> createPlacementIterator() {
		return new com.opal.OpalIterator<> (getCategoryOpal().createPlacementOpalIterator());
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
