package com.scobolsolo.application;

import com.opal.*;
import com.scobolsolo.persistence.DiffOpalFactory;
import com.scobolsolo.persistence.DiffOpal;
import com.scobolsolo.persistence.OpalFactoryFactory;

public class DiffFactory extends com.opal.AbstractFactory<Diff, DiffOpal> implements com.opal.FactoryCreator<Diff>, com.opal.IdentityFactory<Diff> {
	/** This static variable holds the Singleton instance of the Factory for application
		objects of this type.  It is private, but can be accessed via the getInstance() method.
	*/

	private static final DiffFactory ourInstance = new DiffFactory(OpalFactoryFactory.getInstance().getDiffOpalFactory());

	public static DiffFactory getInstance() { return ourInstance; }

	public DiffOpalFactory getDiffOpalFactory() { return (DiffOpalFactory) getOpalFactory(); }

	protected DiffFactory(OpalFactory<Diff, DiffOpal> argOpalFactory) {
		super(argOpalFactory);
	}

	@Override
	public Class<Diff> getUserFacingInterface() {
		return Diff.class;
	}

	@Override
	public Diff create() {
		return getDiffOpalFactory().create().getUserFacing();
	}

	public Diff forId(java.lang.Integer argId) {
		DiffOpal lclDiffOpal = getDiffOpalFactory().forId(argId);
		return (lclDiffOpal == null) ? null : lclDiffOpal.getUserFacing();
	}

	@Override
	public Diff[] createArray(int argSize) {
		return new Diff[argSize];
	}

	public Diff fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		return fromHttpRequest(argRequest, "diff_id");
	}

	public Diff fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argId) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		String lclIdString = argRequest.getParameter(argId);
		if (lclIdString == null || lclIdString.equals("")) {
			return null;
		}
		java.lang.Integer lclId = java.lang.Integer.valueOf(lclIdString);
		return forId(lclId);
	}

	public <T extends java.util.Collection<? super Diff>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
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
			Diff lclResult = forId(lclId);
			org.apache.commons.lang3.Validate.notNull(lclResult, "'" + lclValue + "' is not a valid Id for any Diff");
			argCollection.add(lclResult);
		}
		return argCollection;
	}

	public <T extends java.util.Collection<? super Diff>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest) {
		return acquireFromHttpRequest(argCollection, argRequest, "diff_id");
	}

	public java.util.Collection<Diff> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		return acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
	}

	public java.util.Collection<Diff> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return multipleFromHttpRequest(argRequest, "diff_id");
	}

	public Diff[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		java.util.LinkedList<Diff> lclUs = acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
		return lclUs.toArray(createArray(lclUs.size()));
	}

	public Diff[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return arrayFromHttpRequest(argRequest, "diff_id");
	}

	@Override
	public Diff forUniqueString(String argUniqueString) {
		if (argUniqueString == null) {
			return null;
		}
		DiffOpal lclOpal = getOpalFactory().forUniqueString(argUniqueString);
		return lclOpal != null ? lclOpal.getUserFacing() : null;
	}
}
