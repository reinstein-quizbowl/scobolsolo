package com.scobolsolo.persistence;
import com.scobolsolo.application.PronunciationGuideSuppression;
import com.opal.PersistenceException;

public interface PronunciationGuideSuppressionOpalFactory extends com.opal.IdentityOpalFactory<PronunciationGuideSuppression, PronunciationGuideSuppressionOpal>, com.opal.OpalFactoryCreator<PronunciationGuideSuppression, PronunciationGuideSuppressionOpal> {

	public java.util.HashSet<PronunciationGuideSuppressionOpal> forAccountIdCollection(java.lang.Integer argAccountId) throws com.opal.PersistenceException;
	public java.util.HashSet<PronunciationGuideSuppressionOpal> forCategoryCodeCollection(java.lang.String argCategoryCode) throws com.opal.PersistenceException;
	public PronunciationGuideSuppressionOpal forAccountIdCategoryCode(java.lang.Integer argAccountId, java.lang.String argCategoryCode) throws PersistenceException;
	public PronunciationGuideSuppressionOpal forId(java.lang.Integer argId) throws PersistenceException;
}
