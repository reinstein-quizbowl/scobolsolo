package com.scobolsolo.application;

import com.scobolsolo.persistence.PronunciationGuideSuppressionOpal;
import com.scobolsolo.persistence.AccountOpal;
import com.scobolsolo.persistence.CategoryOpal;

public class PronunciationGuideSuppressionImpl extends com.opal.AbstractIdentityImpl<PronunciationGuideSuppression, PronunciationGuideSuppressionOpal> implements PronunciationGuideSuppression {

	private final PronunciationGuideSuppressionOpal myPronunciationGuideSuppressionOpal;

	public PronunciationGuideSuppressionImpl(PronunciationGuideSuppressionOpal argPronunciationGuideSuppressionOpal) {
		super();
		myPronunciationGuideSuppressionOpal = org.apache.commons.lang3.Validate.notNull(argPronunciationGuideSuppressionOpal);
	}

	protected PronunciationGuideSuppressionOpal getPronunciationGuideSuppressionOpal() {
		return myPronunciationGuideSuppressionOpal;
	}

	@Override
	protected com.opal.IdentityOpal<? extends PronunciationGuideSuppression> getOpal() {
		return getPronunciationGuideSuppressionOpal();
	}

	@Override
	protected com.opal.IdentityOpal<? extends PronunciationGuideSuppression> getBottomOpal() {
		return getPronunciationGuideSuppressionOpal();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getIdAsObject() {
		return getPronunciationGuideSuppressionOpal().getIdAsObject();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public PronunciationGuideSuppressionImpl setId(java.lang.Integer argId) {
		getPronunciationGuideSuppressionOpal().setId(argId);
		return this;
	}

	@Override
	public PronunciationGuideSuppressionImpl setId(int argId) {
		getPronunciationGuideSuppressionOpal().setId(argId);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getAccountIdAsObject() {
		return getPronunciationGuideSuppressionOpal().getAccountIdAsObject();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public PronunciationGuideSuppressionImpl setAccountId(java.lang.Integer argAccountId) {
		getPronunciationGuideSuppressionOpal().setAccountId(argAccountId);
		return this;
	}

	@Override
	public PronunciationGuideSuppressionImpl setAccountId(int argAccountId) {
		getPronunciationGuideSuppressionOpal().setAccountId(argAccountId);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getCategoryCode() {
		return getPronunciationGuideSuppressionOpal().getCategoryCode();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public PronunciationGuideSuppressionImpl setCategoryCode(java.lang.String argCategoryCode) {
		getPronunciationGuideSuppressionOpal().setCategoryCode(argCategoryCode);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the Account object created from pronunciation_guide_suppression through reference pronunciation_guide_suppression_account_id_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public Account getAccount() {
		AccountOpal lclAccountOpal = getPronunciationGuideSuppressionOpal().getAccountOpal();
		return lclAccountOpal == null ? null : lclAccountOpal.getUserFacing();
	}

	@Override
	public PronunciationGuideSuppression setAccount(Account argAccount) {
		getPronunciationGuideSuppressionOpal().setAccountOpal(argAccount == null ? null : ((AccountImpl) argAccount).getAccountOpal());
		return this;
	}

	/** @return the Category object created from pronunciation_guide_suppression through reference pronunciation_guide_suppression_category_code_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public Category getCategory() {
		CategoryOpal lclCategoryOpal = getPronunciationGuideSuppressionOpal().getCategoryOpal();
		return lclCategoryOpal == null ? null : lclCategoryOpal.getUserFacing();
	}

	@Override
	public PronunciationGuideSuppression setCategory(Category argCategory) {
		getPronunciationGuideSuppressionOpal().setCategoryOpal(argCategory == null ? null : ((CategoryImpl) argCategory).getCategoryOpal());
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
	public PronunciationGuideSuppression copy() {
		return getPronunciationGuideSuppressionOpal().copy().getUserFacing();
	}

}
