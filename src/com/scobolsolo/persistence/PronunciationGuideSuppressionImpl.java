package com.scobolsolo.persistence;

public class PronunciationGuideSuppressionImpl extends com.opal.AbstractIdentityImpl<com.scobolsolo.application.PronunciationGuideSuppression, com.scobolsolo.persistence.PronunciationGuideSuppressionOpal> implements com.scobolsolo.application.PronunciationGuideSuppression {

	private final com.scobolsolo.persistence.PronunciationGuideSuppressionOpal myPronunciationGuideSuppressionOpal;

	public PronunciationGuideSuppressionImpl(PronunciationGuideSuppressionOpal argPronunciationGuideSuppressionOpal) {
		super();
		myPronunciationGuideSuppressionOpal = org.apache.commons.lang3.Validate.notNull(argPronunciationGuideSuppressionOpal);
	}

	protected com.scobolsolo.persistence.PronunciationGuideSuppressionOpal getPronunciationGuideSuppressionOpal() {
		return myPronunciationGuideSuppressionOpal;
	}

	@Override
	public com.scobolsolo.persistence.PronunciationGuideSuppressionOpal getOpal() {
		return getPronunciationGuideSuppressionOpal();
	}

	@Override
	public com.scobolsolo.persistence.PronunciationGuideSuppressionOpal getBottomOpal() {
		return getPronunciationGuideSuppressionOpal();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getIdAsObject() {
		return getPronunciationGuideSuppressionOpal().getIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.PronunciationGuideSuppressionImpl setId(java.lang.Integer argId) {
		getPronunciationGuideSuppressionOpal().setId(argId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.PronunciationGuideSuppressionImpl setId(int argId) {
		getPronunciationGuideSuppressionOpal().setId(argId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getAccountIdAsObject() {
		return getPronunciationGuideSuppressionOpal().getAccountIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.PronunciationGuideSuppressionImpl setAccountId(java.lang.Integer argAccountId) {
		getPronunciationGuideSuppressionOpal().setAccountId(argAccountId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.PronunciationGuideSuppressionImpl setAccountId(int argAccountId) {
		getPronunciationGuideSuppressionOpal().setAccountId(argAccountId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getCategoryCode() {
		return getPronunciationGuideSuppressionOpal().getCategoryCode();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public com.scobolsolo.persistence.PronunciationGuideSuppressionImpl setCategoryCode(java.lang.String argCategoryCode) {
		getPronunciationGuideSuppressionOpal().setCategoryCode(argCategoryCode);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the Account object created from pronunciation_guide_suppression through reference pronunciation_guide_suppression_account_id_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.Account getAccount() {
		AccountOpal lclAccountOpal = getPronunciationGuideSuppressionOpal().getAccountOpal();
		return lclAccountOpal == null ? null : lclAccountOpal.getUserFacing();
	}

	@Override
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.PronunciationGuideSuppression setAccount(com.scobolsolo.application.Account argAccount) {
		getPronunciationGuideSuppressionOpal().setAccountOpal(argAccount == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.Account, com.scobolsolo.persistence.AccountOpal>) argAccount).getOpal());
		return this;
	}

	/** @return the Category object created from pronunciation_guide_suppression through reference pronunciation_guide_suppression_category_code_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.Category getCategory() {
		CategoryOpal lclCategoryOpal = getPronunciationGuideSuppressionOpal().getCategoryOpal();
		return lclCategoryOpal == null ? null : lclCategoryOpal.getUserFacing();
	}

	@Override
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.PronunciationGuideSuppression setCategory(com.scobolsolo.application.Category argCategory) {
		getPronunciationGuideSuppressionOpal().setCategoryOpal(argCategory == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.Category, com.scobolsolo.persistence.CategoryOpal>) argCategory).getOpal());
		return this;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public void unlink() {
		getPronunciationGuideSuppressionOpal().unlink();
	}

	@Override
	public void reload() {
		getPronunciationGuideSuppressionOpal().reload();
	}

	@Override
	public com.scobolsolo.application.PronunciationGuideSuppression copy() {
		return getPronunciationGuideSuppressionOpal().copy().getUserFacing();
	}

}
