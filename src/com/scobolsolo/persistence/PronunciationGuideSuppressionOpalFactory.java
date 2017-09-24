package com.scobolsolo.persistence;
import com.scobolsolo.application.PronunciationGuideSuppression;
import com.opal.PersistenceException;

public interface PronunciationGuideSuppressionOpalFactory extends com.opal.IdentityOpalFactory<PronunciationGuideSuppression, PronunciationGuideSuppressionOpal>, com.opal.OpalFactoryCreator<PronunciationGuideSuppression, PronunciationGuideSuppressionOpal> {

	public java.util.HashSet<PronunciationGuideSuppressionOpal> forAccountIdCollection(java.lang.Integer argAccountId) throws com.opal.PersistenceException;

	default public java.util.HashSet<PronunciationGuideSuppressionOpal> forAccountOpalCollection(AccountOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		java.lang.Integer lclId = argParent.getIdAsObject();
		if (lclId == null) { throw new IllegalStateException("Key value is null."); }
		return forAccountIdCollection(lclId);
	}

	default public int forAccountOpalCount(AccountOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		throw new com.siliconage.util.UnimplementedOperationException();
	}

	public java.util.HashSet<PronunciationGuideSuppressionOpal> forCategoryCodeCollection(java.lang.String argCategoryCode) throws com.opal.PersistenceException;

	default public java.util.HashSet<PronunciationGuideSuppressionOpal> forCategoryOpalCollection(CategoryOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		java.lang.String lclCode = argParent.getCode();
		if (lclCode == null) { throw new IllegalStateException("Key value is null."); }
		return forCategoryCodeCollection(lclCode);
	}

	default public int forCategoryOpalCount(CategoryOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		throw new com.siliconage.util.UnimplementedOperationException();
	}

	public PronunciationGuideSuppressionOpal forAccountIdCategoryCode(java.lang.Integer argAccountId, java.lang.String argCategoryCode) throws PersistenceException;
	public PronunciationGuideSuppressionOpal forId(java.lang.Integer argId) throws PersistenceException;
}
