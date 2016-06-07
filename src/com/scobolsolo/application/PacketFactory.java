package com.scobolsolo.application;

import com.scobolsolo.persistence.PacketOpalFactory;
import com.scobolsolo.persistence.PacketOpal;
import com.scobolsolo.persistence.OpalFactoryFactory;

public class PacketFactory extends com.opal.AbstractIdentityFactory<Packet, PacketOpal> implements com.opal.FactoryCreator<Packet> {

	/** This static variable holds the Singleton instance of the Factory for application
		objects of this type.  It is private, but can be accessed via the getInstance() method.
	*/

	private static final PacketFactory ourInstance = new PacketFactory(OpalFactoryFactory.getInstance().getPacketOpalFactory());

	public static PacketFactory getInstance() { return ourInstance; }

	public PacketOpalFactory getPacketOpalFactory() { return (PacketOpalFactory) getOpalFactory(); }

	protected PacketFactory(com.opal.IdentityOpalFactory<Packet, PacketOpal> argOpalFactory) {
		super(argOpalFactory);
	}

	@Override
	public Class<Packet> getUserFacingInterface() {
		return Packet.class;
	}

	@Override
	public Packet create() {
		return getPacketOpalFactory().create().getUserFacing();
	}

	public Packet forId(java.lang.Integer argId) {
		PacketOpal lclPacketOpal = getPacketOpalFactory().forId(argId);
		return (lclPacketOpal == null) ? null : lclPacketOpal.getUserFacing();
	}

	public Packet forTournamentCodeName(java.lang.String argTournamentCode, java.lang.String argName) {
		PacketOpal lclPacketOpal = getPacketOpalFactory().forTournamentCodeName(argTournamentCode, argName);
		return (lclPacketOpal == null) ? null : lclPacketOpal.getUserFacing();
	}

	public Packet forRoundId(java.lang.Integer argRoundId) {
		PacketOpal lclPacketOpal = getPacketOpalFactory().forRoundId(argRoundId);
		return (lclPacketOpal == null) ? null : lclPacketOpal.getUserFacing();
	}

	public Packet forTournamentCodeShortName(java.lang.String argTournamentCode, java.lang.String argShortName) {
		PacketOpal lclPacketOpal = getPacketOpalFactory().forTournamentCodeShortName(argTournamentCode, argShortName);
		return (lclPacketOpal == null) ? null : lclPacketOpal.getUserFacing();
	}

	@Override
	public Packet[] createArray(int argSize) {
		return new Packet[argSize];
	}

	public Packet fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		return fromHttpRequest(argRequest, "packet_id");
	}

	public Packet fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argId) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		String lclIdString = argRequest.getParameter(argId);
		if (org.apache.commons.lang3.StringUtils.isBlank(lclIdString)) {
			return null;
		}
		java.lang.Integer lclId = java.lang.Integer.valueOf(lclIdString);
		return forId(lclId);
	}

	public <T extends java.util.Collection<? super Packet>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
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
			Packet lclResult = forId(lclId);
			org.apache.commons.lang3.Validate.notNull(lclResult, "'" + lclValue + "' is not a valid Id for any Packet");
			argCollection.add(lclResult);
		}
		return argCollection;
	}

	public <T extends java.util.Collection<? super Packet>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest) {
		return acquireFromHttpRequest(argCollection, argRequest, "packet_id");
	}

	public java.util.Collection<Packet> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		return acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
	}

	public java.util.Collection<Packet> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return multipleFromHttpRequest(argRequest, "packet_id");
	}

	public Packet[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		java.util.LinkedList<Packet> lclUs = acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
		return lclUs.toArray(createArray(lclUs.size()));
	}

	public Packet[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return arrayFromHttpRequest(argRequest, "packet_id");
	}

	@Override
	public Packet forUniqueString(String argUniqueString) {
		if (argUniqueString == null) {
			return null;
		}
		PacketOpal lclOpal = getOpalFactory().forUniqueString(argUniqueString);
		return lclOpal != null ? lclOpal.getUserFacing() : null;
	}
}
