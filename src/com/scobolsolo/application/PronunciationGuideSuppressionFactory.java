package com.scobolsolo.application;

import com.scobolsolo.persistence.PronunciationGuideSuppressionOpalFactory;
import com.scobolsolo.persistence.PronunciationGuideSuppressionOpal;
import com.scobolsolo.persistence.OpalFactoryFactory;

public class PronunciationGuideSuppressionFactory extends com.opal.AbstractIdentityFactory<PronunciationGuideSuppression, PronunciationGuideSuppressionOpal> implements com.opal.FactoryCreator<PronunciationGuideSuppression> {

	/** This static variable holds the Singleton instance of the Factory for application
		objects of this type.  It is private, but can be accessed via the getInstance() method.
	*/

	private static final PronunciationGuideSuppressionFactory ourInstance = new PronunciationGuideSuppressionFactory(OpalFactoryFactory.getInstance().getPronunciationGuideSuppressionOpalFactory());

	public static PronunciationGuideSuppressionFactory getInstance() { return ourInstance; }

	public PronunciationGuideSuppressionOpalFactory getPronunciationGuideSuppressionOpalFactory() { return (PronunciationGuideSuppressionOpalFactory) getOpalFactory(); }

	protected PronunciationGuideSuppressionFactory(com.opal.IdentityOpalFactory<PronunciationGuideSuppression, PronunciationGuideSuppressionOpal> argOpalFactory) {
		super(argOpalFactory);
	}

	@Override
	public Class<PronunciationGuideSuppression> getUserFacingInterface() {
		return PronunciationGuideSuppression.class;
	}

	@Override
	public PronunciationGuideSuppression create() {
		return getPronunciationGuideSuppressionOpalFactory().create().getUserFacing();
	}

	public PronunciationGuideSuppression forAccountIdCategoryCode(java.lang.Integer argAccountId, java.lang.String argCategoryCode) {
		PronunciationGuideSuppressionOpal lclPronunciationGuideSuppressionOpal = getPronunciationGuideSuppressionOpalFactory().forAccountIdCategoryCode(argAccountId, argCategoryCode);
		return (lclPronunciationGuideSuppressionOpal == null) ? null : lclPronunciationGuideSuppressionOpal.getUserFacing();
	}

	public PronunciationGuideSuppression forId(java.lang.Integer argId) {
		PronunciationGuideSuppressionOpal lclPronunciationGuideSuppressionOpal = getPronunciationGuideSuppressionOpalFactory().forId(argId);
		return (lclPronunciationGuideSuppressionOpal == null) ? null : lclPronunciationGuideSuppressionOpal.getUserFacing();
	}

	@Override
	public PronunciationGuideSuppression[] createArray(int argSize) {
		return new PronunciationGuideSuppression[argSize];
	}

	public PronunciationGuideSuppression fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		return fromHttpRequest(argRequest, "pronunciation_guide_suppression_id");
	}

	public PronunciationGuideSuppression fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argId) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		String lclIdString = argRequest.getParameter(argId);
		if (org.apache.commons.lang3.StringUtils.isBlank(lclIdString)) {
			return null;
		}
		java.lang.Integer lclId = java.lang.Integer.valueOf(lclIdString);
		return forId(lclId);
	}

	public <T extends java.util.Collection<? super PronunciationGuideSuppression>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		org.apache.commons.lang3.Validate.notNull(argCollection);
		org.apache.commons.lang3.Validate.notNull(argRequest);
		org.apache.commons.lang3.Validate.notEmpty(argParameterName);
		String[] lclValues = argRequest.getParameterValues(argParameterName);
		if (lclValues == null || lclValues.length == 0) {
			return argCollection;
		}
		for (String lclValueUntrimmed : lclValues) {
			String lclValue = org.apache.commons.lang3.StringUtils.trimToNull(lclValueUntrimmed);
			if (lclValue == null) {
				continue;
			}
			java.lang.Integer lclId = java.lang.Integer.valueOf(lclValue);
			PronunciationGuideSuppression lclResult = forId(lclId);
			org.apache.commons.lang3.Validate.notNull(lclResult, "'" + lclValue + "' is not a valid Id for any PronunciationGuideSuppression");
			argCollection.add(lclResult);
		}
		return argCollection;
	}

	public <T extends java.util.Collection<? super PronunciationGuideSuppression>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest) {
		return acquireFromHttpRequest(argCollection, argRequest, "pronunciation_guide_suppression_id");
	}

	public java.util.Collection<PronunciationGuideSuppression> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		return acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
	}

	public java.util.Collection<PronunciationGuideSuppression> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return multipleFromHttpRequest(argRequest, "pronunciation_guide_suppression_id");
	}

	public PronunciationGuideSuppression[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		java.util.LinkedList<PronunciationGuideSuppression> lclUs = acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
		return lclUs.toArray(createArray(lclUs.size()));
	}

	public PronunciationGuideSuppression[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return arrayFromHttpRequest(argRequest, "pronunciation_guide_suppression_id");
	}

	@Override
	public PronunciationGuideSuppression forUniqueString(String argUniqueString) {
		if (argUniqueString == null) {
			return null;
		}
		PronunciationGuideSuppressionOpal lclOpal = getOpalFactory().forUniqueString(argUniqueString);
		return lclOpal != null ? lclOpal.getUserFacing() : null;
	}
}
