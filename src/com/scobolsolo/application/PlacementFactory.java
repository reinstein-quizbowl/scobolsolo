package com.scobolsolo.application;

import com.scobolsolo.persistence.PlacementOpalFactory;
import com.scobolsolo.persistence.PlacementOpal;
import com.scobolsolo.persistence.OpalFactoryFactory;

public class PlacementFactory extends com.opal.AbstractFactory<Placement, PlacementOpal> implements com.opal.FactoryCreator<Placement>, com.opal.IdentityFactory<Placement> {
	/** This static variable holds the Singleton instance of the Factory for application
		objects of this type.  It is private, but can be accessed via the getInstance() method.
	*/

	private static final PlacementFactory ourInstance = new PlacementFactory(OpalFactoryFactory.getInstance().getPlacementOpalFactory());

	public static PlacementFactory getInstance() { return ourInstance; }

	public PlacementOpalFactory getPlacementOpalFactory() { return (PlacementOpalFactory) getOpalFactory(); }

	protected PlacementFactory(com.opal.OpalFactory<Placement, PlacementOpal> argOpalFactory) {
		super(argOpalFactory);
	}

	@Override
	public Class<Placement> getUserFacingInterface() {
		return Placement.class;
	}

	@Override
	public Placement create() {
		return getPlacementOpalFactory().create().getUserFacing();
	}

	public Placement forId(java.lang.Integer argId) {
		PlacementOpal lclPlacementOpal = getPlacementOpalFactory().forId(argId);
		return (lclPlacementOpal == null) ? null : lclPlacementOpal.getUserFacing();
	}

	public Placement forQuestionIdPacketId(java.lang.Integer argQuestionId, java.lang.Integer argPacketId) {
		PlacementOpal lclPlacementOpal = getPlacementOpalFactory().forQuestionIdPacketId(argQuestionId, argPacketId);
		return (lclPlacementOpal == null) ? null : lclPlacementOpal.getUserFacing();
	}

	@Override
	public Placement[] createArray(int argSize) {
		return new Placement[argSize];
	}

	public Placement fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		return fromHttpRequest(argRequest, "placement_id");
	}

	public Placement fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argId) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		String lclIdString = argRequest.getParameter(argId);
		if (org.apache.commons.lang3.StringUtils.isBlank(lclIdString)) {
			return null;
		}
		java.lang.Integer lclId = java.lang.Integer.valueOf(lclIdString);
		return forId(lclId);
	}

	public <T extends java.util.Collection<? super Placement>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
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
			Placement lclResult = forId(lclId);
			org.apache.commons.lang3.Validate.notNull(lclResult, "'" + lclValue + "' is not a valid Id for any Placement");
			argCollection.add(lclResult);
		}
		return argCollection;
	}

	public <T extends java.util.Collection<? super Placement>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest) {
		return acquireFromHttpRequest(argCollection, argRequest, "placement_id");
	}

	public java.util.Collection<Placement> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		return acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
	}

	public java.util.Collection<Placement> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return multipleFromHttpRequest(argRequest, "placement_id");
	}

	public Placement[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		java.util.LinkedList<Placement> lclUs = acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
		return lclUs.toArray(createArray(lclUs.size()));
	}

	public Placement[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return arrayFromHttpRequest(argRequest, "placement_id");
	}

	@Override
	public Placement forUniqueString(String argUniqueString) {
		if (argUniqueString == null) {
			return null;
		}
		PlacementOpal lclOpal = getOpalFactory().forUniqueString(argUniqueString);
		return lclOpal != null ? lclOpal.getUserFacing() : null;
	}
}
