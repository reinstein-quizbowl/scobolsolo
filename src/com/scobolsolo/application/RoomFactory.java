package com.scobolsolo.application;

import com.opal.*;
import com.scobolsolo.persistence.RoomOpalFactory;
import com.scobolsolo.persistence.RoomOpal;
import com.scobolsolo.persistence.OpalFactoryFactory;

public class RoomFactory extends com.opal.AbstractFactory<Room, RoomOpal> implements com.opal.FactoryCreator<Room>, com.opal.IdentityFactory<Room> {
	/** This static variable holds the Singleton instance of the Factory for application
		objects of this type.  It is private, but can be accessed via the getInstance() method.
	*/

	private static final RoomFactory ourInstance = new RoomFactory(OpalFactoryFactory.getInstance().getRoomOpalFactory());

	public static RoomFactory getInstance() { return ourInstance; }

	public RoomOpalFactory getRoomOpalFactory() { return (RoomOpalFactory) getOpalFactory(); }

	protected RoomFactory(OpalFactory<Room, RoomOpal> argOpalFactory) {
		super(argOpalFactory);
	}

	@Override
	public Class<Room> getUserFacingInterface() {
		return Room.class;
	}

	@Override
	public Room create() {
		return getRoomOpalFactory().create().getUserFacing();
	}

	public Room forNameTournamentCode(java.lang.String argName, java.lang.String argTournamentCode) {
		RoomOpal lclRoomOpal = getRoomOpalFactory().forNameTournamentCode(argName, argTournamentCode);
		return (lclRoomOpal == null) ? null : lclRoomOpal.getUserFacing();
	}

	public Room forShortNameTournamentCode(java.lang.String argShortName, java.lang.String argTournamentCode) {
		RoomOpal lclRoomOpal = getRoomOpalFactory().forShortNameTournamentCode(argShortName, argTournamentCode);
		return (lclRoomOpal == null) ? null : lclRoomOpal.getUserFacing();
	}

	public Room forId(java.lang.Integer argId) {
		RoomOpal lclRoomOpal = getRoomOpalFactory().forId(argId);
		return (lclRoomOpal == null) ? null : lclRoomOpal.getUserFacing();
	}

	@Override
	public Room[] createArray(int argSize) {
		return new Room[argSize];
	}

	public Room fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		return fromHttpRequest(argRequest, "room_id");
	}

	public Room fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argId) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		String lclIdString = argRequest.getParameter(argId);
		if (org.apache.commons.lang3.StringUtils.isBlank(lclIdString)) {
			return null;
		}
		java.lang.Integer lclId = java.lang.Integer.valueOf(lclIdString);
		return forId(lclId);
	}

	public <T extends java.util.Collection<? super Room>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
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
			Room lclResult = forId(lclId);
			org.apache.commons.lang3.Validate.notNull(lclResult, "'" + lclValue + "' is not a valid Id for any Room");
			argCollection.add(lclResult);
		}
		return argCollection;
	}

	public <T extends java.util.Collection<? super Room>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest) {
		return acquireFromHttpRequest(argCollection, argRequest, "room_id");
	}

	public java.util.Collection<Room> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		return acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
	}

	public java.util.Collection<Room> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return multipleFromHttpRequest(argRequest, "room_id");
	}

	public Room[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		java.util.LinkedList<Room> lclUs = acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
		return lclUs.toArray(createArray(lclUs.size()));
	}

	public Room[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return arrayFromHttpRequest(argRequest, "room_id");
	}

	@Override
	public Room forUniqueString(String argUniqueString) {
		if (argUniqueString == null) {
			return null;
		}
		RoomOpal lclOpal = getOpalFactory().forUniqueString(argUniqueString);
		return lclOpal != null ? lclOpal.getUserFacing() : null;
	}
}
