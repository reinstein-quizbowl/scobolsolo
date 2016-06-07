package com.scobolsolo.application;

import com.scobolsolo.persistence.TechnologyChoiceOpalFactory;
import com.scobolsolo.persistence.TechnologyChoiceOpal;
import com.scobolsolo.persistence.OpalFactoryFactory;

public class TechnologyChoiceFactory extends com.opal.AbstractIdentityFactory<TechnologyChoice, TechnologyChoiceOpal> implements com.opal.FactoryCreator<TechnologyChoice> {

	/** This static variable holds the Singleton instance of the Factory for application
		objects of this type.  It is private, but can be accessed via the getInstance() method.
	*/

	private static final TechnologyChoiceFactory ourInstance = new TechnologyChoiceFactory(OpalFactoryFactory.getInstance().getTechnologyChoiceOpalFactory());

	public static TechnologyChoiceFactory getInstance() { return ourInstance; }

	public TechnologyChoiceOpalFactory getTechnologyChoiceOpalFactory() { return (TechnologyChoiceOpalFactory) getOpalFactory(); }

	protected TechnologyChoiceFactory(com.opal.IdentityOpalFactory<TechnologyChoice, TechnologyChoiceOpal> argOpalFactory) {
		super(argOpalFactory);
	}

	@Override
	public Class<TechnologyChoice> getUserFacingInterface() {
		return TechnologyChoice.class;
	}


	/* These Singleton objects are initialized on system start up to refer to unchanging objects
		from the database.
	*/

	public static final TechnologyChoice BRINGING_OWN() { return getInstance().forCode("BRINGING_OWN"); }
	public static final TechnologyChoice NEEDS_COMPUTER_PROVIDED() { return getInstance().forCode("NEEDS_COMPUTER_PROVIDED"); }
	public static final TechnologyChoice NO_COMPUTER() { return getInstance().forCode("NO_COMPUTER"); }
	public static final TechnologyChoice TBD() { return getInstance().forCode("TBD"); }

	@Override
	public TechnologyChoice create() {
		return getTechnologyChoiceOpalFactory().create().getUserFacing();
	}

	public TechnologyChoice forName(java.lang.String argName) {
		TechnologyChoiceOpal lclTechnologyChoiceOpal = getTechnologyChoiceOpalFactory().forName(argName);
		return (lclTechnologyChoiceOpal == null) ? null : lclTechnologyChoiceOpal.getUserFacing();
	}

	public TechnologyChoice forCode(java.lang.String argCode) {
		TechnologyChoiceOpal lclTechnologyChoiceOpal = getTechnologyChoiceOpalFactory().forCode(argCode);
		return (lclTechnologyChoiceOpal == null) ? null : lclTechnologyChoiceOpal.getUserFacing();
	}

	public TechnologyChoice forShortName(java.lang.String argShortName) {
		TechnologyChoiceOpal lclTechnologyChoiceOpal = getTechnologyChoiceOpalFactory().forShortName(argShortName);
		return (lclTechnologyChoiceOpal == null) ? null : lclTechnologyChoiceOpal.getUserFacing();
	}

	public TechnologyChoice forVeryShortName(java.lang.String argVeryShortName) {
		TechnologyChoiceOpal lclTechnologyChoiceOpal = getTechnologyChoiceOpalFactory().forVeryShortName(argVeryShortName);
		return (lclTechnologyChoiceOpal == null) ? null : lclTechnologyChoiceOpal.getUserFacing();
	}

	@Override
	public TechnologyChoice[] createArray(int argSize) {
		return new TechnologyChoice[argSize];
	}

	public TechnologyChoice fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		return fromHttpRequest(argRequest, "technology_choice_code");
	}

	public TechnologyChoice fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argCode) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		String lclCodeString = argRequest.getParameter(argCode);
		if (org.apache.commons.lang3.StringUtils.isBlank(lclCodeString)) {
			return null;
		}
		java.lang.String lclCode = lclCodeString;
		return forCode(lclCode);
	}

	public <T extends java.util.Collection<? super TechnologyChoice>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
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
			TechnologyChoice lclResult = forCode(lclCode);
			org.apache.commons.lang3.Validate.notNull(lclResult, "'" + lclValue + "' is not a valid Code for any TechnologyChoice");
			argCollection.add(lclResult);
		}
		return argCollection;
	}

	public <T extends java.util.Collection<? super TechnologyChoice>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest) {
		return acquireFromHttpRequest(argCollection, argRequest, "technology_choice_code");
	}

	public java.util.Collection<TechnologyChoice> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		return acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
	}

	public java.util.Collection<TechnologyChoice> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return multipleFromHttpRequest(argRequest, "technology_choice_code");
	}

	public TechnologyChoice[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		java.util.LinkedList<TechnologyChoice> lclUs = acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
		return lclUs.toArray(createArray(lclUs.size()));
	}

	public TechnologyChoice[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return arrayFromHttpRequest(argRequest, "technology_choice_code");
	}

	@Override
	public TechnologyChoice forUniqueString(String argUniqueString) {
		if (argUniqueString == null) {
			return null;
		}
		TechnologyChoiceOpal lclOpal = getOpalFactory().forUniqueString(argUniqueString);
		return lclOpal != null ? lclOpal.getUserFacing() : null;
	}
}
