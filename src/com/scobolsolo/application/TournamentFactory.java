package com.scobolsolo.application;

import com.opal.*;
import com.scobolsolo.persistence.TournamentOpalFactory;
import com.scobolsolo.persistence.TournamentOpal;
import com.scobolsolo.persistence.OpalFactoryFactory;

public class TournamentFactory extends com.opal.AbstractFactory<Tournament, TournamentOpal> implements com.opal.FactoryCreator<Tournament>, com.opal.IdentityFactory<Tournament> {
	/** This static variable holds the Singleton instance of the Factory for application
		objects of this type.  It is private, but can be accessed via the getInstance() method.
	*/

	private static final TournamentFactory ourInstance = new TournamentFactory(OpalFactoryFactory.getInstance().getTournamentOpalFactory());

	public static TournamentFactory getInstance() { return ourInstance; }

	public TournamentOpalFactory getTournamentOpalFactory() { return (TournamentOpalFactory) getOpalFactory(); }

	protected TournamentFactory(OpalFactory<Tournament, TournamentOpal> argOpalFactory) {
		super(argOpalFactory);
	}

	@Override
	public Class<Tournament> getUserFacingInterface() {
		return Tournament.class;
	}


	/* These Singleton objects are initialized on system start up to refer to unchanging objects
		from the database.
	*/

	public static final Tournament _2001() { return getInstance().forCode("2001"); }
	public static final Tournament _2002() { return getInstance().forCode("2002"); }
	public static final Tournament _2003() { return getInstance().forCode("2003"); }
	public static final Tournament _2004() { return getInstance().forCode("2004"); }
	public static final Tournament _2005() { return getInstance().forCode("2005"); }
	public static final Tournament _2006() { return getInstance().forCode("2006"); }
	public static final Tournament _2007() { return getInstance().forCode("2007"); }
	public static final Tournament _2008() { return getInstance().forCode("2008"); }
	public static final Tournament _2009() { return getInstance().forCode("2009"); }
	public static final Tournament _2010() { return getInstance().forCode("2010"); }
	public static final Tournament _2011() { return getInstance().forCode("2011"); }
	public static final Tournament _2012() { return getInstance().forCode("2012"); }
	public static final Tournament _2013() { return getInstance().forCode("2013"); }
	public static final Tournament _2014() { return getInstance().forCode("2014"); }
	public static final Tournament _2015() { return getInstance().forCode("2015"); }

	@Override
	public Tournament create() {
		return getTournamentOpalFactory().create().getUserFacing();
	}

	public Tournament forCode(java.lang.String argCode) {
		TournamentOpal lclTournamentOpal = getTournamentOpalFactory().forCode(argCode);
		return (lclTournamentOpal == null) ? null : lclTournamentOpal.getUserFacing();
	}

	public Tournament forName(java.lang.String argName) {
		TournamentOpal lclTournamentOpal = getTournamentOpalFactory().forName(argName);
		return (lclTournamentOpal == null) ? null : lclTournamentOpal.getUserFacing();
	}

	public Tournament forShortName(java.lang.String argShortName) {
		TournamentOpal lclTournamentOpal = getTournamentOpalFactory().forShortName(argShortName);
		return (lclTournamentOpal == null) ? null : lclTournamentOpal.getUserFacing();
	}

	public Tournament forWebXmlRoleCode(java.lang.String argWebXmlRoleCode) {
		TournamentOpal lclTournamentOpal = getTournamentOpalFactory().forWebXmlRoleCode(argWebXmlRoleCode);
		return (lclTournamentOpal == null) ? null : lclTournamentOpal.getUserFacing();
	}

	@Override
	public Tournament[] createArray(int argSize) {
		return new Tournament[argSize];
	}

	public Tournament fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		return fromHttpRequest(argRequest, "tournament_code");
	}

	public Tournament fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argCode) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		String lclCodeString = argRequest.getParameter(argCode);
		if (lclCodeString == null || lclCodeString.equals("")) {
			return null;
		}
		java.lang.String lclCode = lclCodeString;
		return forCode(lclCode);
	}

	public <T extends java.util.Collection<? super Tournament>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
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
			Tournament lclResult = forCode(lclCode);
			org.apache.commons.lang3.Validate.notNull(lclResult, "'" + lclValue + "' is not a valid Code for any Tournament");
			argCollection.add(lclResult);
		}
		return argCollection;
	}

	public <T extends java.util.Collection<? super Tournament>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest) {
		return acquireFromHttpRequest(argCollection, argRequest, "tournament_code");
	}

	public java.util.Collection<Tournament> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		return acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
	}

	public java.util.Collection<Tournament> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return multipleFromHttpRequest(argRequest, "tournament_code");
	}

	public Tournament[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		java.util.LinkedList<Tournament> lclUs = acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
		return lclUs.toArray(createArray(lclUs.size()));
	}

	public Tournament[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return arrayFromHttpRequest(argRequest, "tournament_code");
	}

	@Override
	public Tournament forUniqueString(String argUniqueString) {
		if (argUniqueString == null) {
			return null;
		}
		TournamentOpal lclOpal = getOpalFactory().forUniqueString(argUniqueString);
		return lclOpal != null ? lclOpal.getUserFacing() : null;
	}
}
