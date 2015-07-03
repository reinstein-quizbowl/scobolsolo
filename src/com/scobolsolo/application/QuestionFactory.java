package com.scobolsolo.application;

import com.opal.*;
import com.scobolsolo.persistence.QuestionOpalFactory;
import com.scobolsolo.persistence.QuestionOpal;
import com.scobolsolo.persistence.OpalFactoryFactory;

public class QuestionFactory extends com.opal.AbstractFactory<Question, QuestionOpal> implements com.opal.FactoryCreator<Question>, com.opal.IdentityFactory<Question> {
	/** This static variable holds the Singleton instance of the Factory for application
		objects of this type.  It is private, but can be accessed via the getInstance() method.
	*/

	private static final QuestionFactory ourInstance = new QuestionFactory(OpalFactoryFactory.getInstance().getQuestionOpalFactory());

	public static QuestionFactory getInstance() { return ourInstance; }

	public QuestionOpalFactory getQuestionOpalFactory() { return (QuestionOpalFactory) getOpalFactory(); }

	protected QuestionFactory(OpalFactory<Question, QuestionOpal> argOpalFactory) {
		super(argOpalFactory);
	}

	@Override
	public Class<Question> getUserFacingInterface() {
		return Question.class;
	}

	@Override
	public Question create() {
		return getQuestionOpalFactory().create().getUserFacing();
	}

	public Question forId(java.lang.Integer argId) {
		QuestionOpal lclQuestionOpal = getQuestionOpalFactory().forId(argId);
		return (lclQuestionOpal == null) ? null : lclQuestionOpal.getUserFacing();
	}

	@Override
	public Question[] createArray(int argSize) {
		return new Question[argSize];
	}

	public Question fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		return fromHttpRequest(argRequest, "question_id");
	}

	public Question fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argId) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		String lclIdString = argRequest.getParameter(argId);
		if (org.apache.commons.lang3.StringUtils.isBlank(lclIdString)) {
			return null;
		}
		java.lang.Integer lclId = java.lang.Integer.valueOf(lclIdString);
		return forId(lclId);
	}

	public <T extends java.util.Collection<? super Question>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
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
			Question lclResult = forId(lclId);
			org.apache.commons.lang3.Validate.notNull(lclResult, "'" + lclValue + "' is not a valid Id for any Question");
			argCollection.add(lclResult);
		}
		return argCollection;
	}

	public <T extends java.util.Collection<? super Question>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest) {
		return acquireFromHttpRequest(argCollection, argRequest, "question_id");
	}

	public java.util.Collection<Question> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		return acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
	}

	public java.util.Collection<Question> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return multipleFromHttpRequest(argRequest, "question_id");
	}

	public Question[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		java.util.LinkedList<Question> lclUs = acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
		return lclUs.toArray(createArray(lclUs.size()));
	}

	public Question[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return arrayFromHttpRequest(argRequest, "question_id");
	}

	@Override
	public Question forUniqueString(String argUniqueString) {
		if (argUniqueString == null) {
			return null;
		}
		QuestionOpal lclOpal = getOpalFactory().forUniqueString(argUniqueString);
		return lclOpal != null ? lclOpal.getUserFacing() : null;
	}
}
