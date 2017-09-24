package com.scobolsolo.application;

import com.scobolsolo.persistence.QuestionStatusOpalFactory;
import com.scobolsolo.persistence.QuestionStatusOpal;
import com.scobolsolo.persistence.OpalFactoryFactory;

public class QuestionStatusFactory extends com.opal.AbstractIdentityFactory<QuestionStatus, QuestionStatusOpal> implements com.opal.FactoryCreator<QuestionStatus> {

	/** This static variable holds the Singleton instance of the Factory for application
		objects of this type.  It is private, but can be accessed via the getInstance() method.
	*/

	private static final QuestionStatusFactory ourInstance = new QuestionStatusFactory(OpalFactoryFactory.getInstance().getQuestionStatusOpalFactory());

	public static QuestionStatusFactory getInstance() { return ourInstance; }

	public QuestionStatusOpalFactory getQuestionStatusOpalFactory() { return (QuestionStatusOpalFactory) getOpalFactory(); }

	protected QuestionStatusFactory(com.opal.IdentityOpalFactory<QuestionStatus, QuestionStatusOpal> argOpalFactory) {
		super(argOpalFactory);
	}

	@Override
	public Class<QuestionStatus> getUserFacingInterface() {
		return QuestionStatus.class;
	}


	/* These Singleton objects are initialized on system start up to refer to unchanging objects
		from the database.
	*/

	public static final QuestionStatus ANSWER_CHOSEN() { return getInstance().forCode("ANSWER_CHOSEN"); }
	public static final QuestionStatus APPROVED() { return getInstance().forCode("APPROVED"); }
	public static final QuestionStatus DRAFTED() { return getInstance().forCode("DRAFTED"); }
	public static final QuestionStatus READY_FOR_REVIEW() { return getInstance().forCode("READY_FOR_REVIEW"); }

	@com.opal.annotation.RequiresActiveTransaction
	@Override
	public QuestionStatus create() {
		return getQuestionStatusOpalFactory().create().getUserFacing();
	}

	public QuestionStatus forName(java.lang.String argName) {
		QuestionStatusOpal lclQuestionStatusOpal = getQuestionStatusOpalFactory().forName(argName);
		return (lclQuestionStatusOpal == null) ? null : lclQuestionStatusOpal.getUserFacing();
	}

	public QuestionStatus forCode(java.lang.String argCode) {
		QuestionStatusOpal lclQuestionStatusOpal = getQuestionStatusOpalFactory().forCode(argCode);
		return (lclQuestionStatusOpal == null) ? null : lclQuestionStatusOpal.getUserFacing();
	}

	public QuestionStatus forShortName(java.lang.String argShortName) {
		QuestionStatusOpal lclQuestionStatusOpal = getQuestionStatusOpalFactory().forShortName(argShortName);
		return (lclQuestionStatusOpal == null) ? null : lclQuestionStatusOpal.getUserFacing();
	}

	@Override
	public QuestionStatus[] createArray(int argSize) {
		return new QuestionStatus[argSize];
	}

	public QuestionStatus fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		return fromHttpRequest(argRequest, "question_status_code");
	}

	public QuestionStatus fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argCode) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		String lclCodeString = argRequest.getParameter(argCode);
		if (org.apache.commons.lang3.StringUtils.isBlank(lclCodeString)) {
			return null;
		}
		java.lang.String lclCode = lclCodeString;
		return forCode(lclCode);
	}

	public <T extends java.util.Collection<? super QuestionStatus>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
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
			java.lang.String lclCode = lclValue;
			QuestionStatus lclResult = forCode(lclCode);
			org.apache.commons.lang3.Validate.notNull(lclResult, "'" + lclValue + "' is not a valid Code for any QuestionStatus");
			argCollection.add(lclResult);
		}
		return argCollection;
	}

	public <T extends java.util.Collection<? super QuestionStatus>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest) {
		return acquireFromHttpRequest(argCollection, argRequest, "question_status_code");
	}

	public java.util.Collection<QuestionStatus> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		return acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
	}

	public java.util.Collection<QuestionStatus> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return multipleFromHttpRequest(argRequest, "question_status_code");
	}

	public QuestionStatus[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		java.util.LinkedList<QuestionStatus> lclUs = acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
		return lclUs.toArray(createArray(lclUs.size()));
	}

	public QuestionStatus[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return arrayFromHttpRequest(argRequest, "question_status_code");
	}

	@Override
	public QuestionStatus forUniqueString(String argUniqueString) {
		if (argUniqueString == null) {
			return null;
		}
		QuestionStatusOpal lclOpal = getOpalFactory().forUniqueString(argUniqueString);
		return lclOpal != null ? lclOpal.getUserFacing() : null;
	}
}
