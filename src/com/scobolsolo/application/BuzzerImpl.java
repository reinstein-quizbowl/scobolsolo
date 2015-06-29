package com.scobolsolo.application;

import com.scobolsolo.persistence.BuzzerOpal;
import com.scobolsolo.persistence.SchoolRegistrationOpal;
import com.scobolsolo.persistence.RoomOpal;

public class BuzzerImpl extends com.opal.AbstractIdentityImpl<Buzzer, BuzzerOpal> implements Buzzer {
	private final BuzzerOpal myBuzzerOpal;

	public BuzzerImpl(BuzzerOpal argBuzzerOpal) {
		super();
		myBuzzerOpal = org.apache.commons.lang3.Validate.notNull(argBuzzerOpal);
	}

	protected BuzzerOpal getBuzzerOpal() {
		return myBuzzerOpal;
	}

	@Override
	protected com.opal.IdentityOpal<? extends Buzzer> getOpal() {
		return getBuzzerOpal();
	}

	@Override
	protected com.opal.IdentityOpal<? extends Buzzer> getBottomOpal() {
		return getBuzzerOpal();
	}

	@Override
	public java.lang.Integer getIdAsObject() {
		return getBuzzerOpal().getIdAsObject();
	}

	@Override
	public BuzzerImpl setId(java.lang.Integer argId) {
		getBuzzerOpal().setId(argId);
		return this;
	}

	@Override
	public BuzzerImpl setId(int argId) {
		getBuzzerOpal().setId(argId);
		return this;
	}

	@Override
	public java.lang.Integer getSchoolRegistrationIdAsObject() {
		return getBuzzerOpal().getSchoolRegistrationIdAsObject();
	}

	@Override
	public BuzzerImpl setSchoolRegistrationId(java.lang.Integer argSchoolRegistrationId) {
		getBuzzerOpal().setSchoolRegistrationId(argSchoolRegistrationId);
		return this;
	}

	@Override
	public BuzzerImpl setSchoolRegistrationId(int argSchoolRegistrationId) {
		getBuzzerOpal().setSchoolRegistrationId(argSchoolRegistrationId);
		return this;
	}

	@Override
	public java.lang.Integer getRoomIdAsObject() {
		return getBuzzerOpal().getRoomIdAsObject();
	}

	@Override
	public BuzzerImpl setRoomId(java.lang.Integer argRoomId) {
		getBuzzerOpal().setRoomId(argRoomId);
		return this;
	}

	@Override
	public BuzzerImpl setRoomId(int argRoomId) {
		getBuzzerOpal().setRoomId(argRoomId);
		return this;
	}

	@Override
	public java.lang.String getName() {
		return getBuzzerOpal().getName();
	}

	@Override
	public BuzzerImpl setName(java.lang.String argName) {
		getBuzzerOpal().setName(argName);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** Access to the SchoolRegistration object created from buzzer through reference buzzer_registration_id_fkey */

	@Override
	public SchoolRegistration getSchoolRegistration() {
		SchoolRegistrationOpal lclSchoolRegistrationOpal = getBuzzerOpal().getSchoolRegistrationOpal();
		return lclSchoolRegistrationOpal == null ? null : lclSchoolRegistrationOpal.getUserFacing();
	}

	@Override
	public Buzzer setSchoolRegistration(SchoolRegistration argSchoolRegistration) {
		getBuzzerOpal().setSchoolRegistrationOpal(argSchoolRegistration == null ? null : ((SchoolRegistrationImpl) argSchoolRegistration).getSchoolRegistrationOpal());
		return this;
	}

	/** Access to the Room object created from buzzer through reference buzzer_room_id_fkey */

	@Override
	public Room getRoom() {
		RoomOpal lclRoomOpal = getBuzzerOpal().getRoomOpal();
		return lclRoomOpal == null ? null : lclRoomOpal.getUserFacing();
	}

	@Override
	public Buzzer setRoom(Room argRoom) {
		getBuzzerOpal().setRoomOpal(argRoom == null ? null : ((RoomImpl) argRoom).getRoomOpal());
		return this;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public void unlink() {
		getBuzzerOpal().unlink();
	}

	@Override
	public void reload() {
		getBuzzerOpal().reload();
	}

	@Override
	public Buzzer copy() {
		return getBuzzerOpal().copy().getUserFacing();
	}

}