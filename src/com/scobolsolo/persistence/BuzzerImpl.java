package com.scobolsolo.persistence;

public class BuzzerImpl extends com.opal.AbstractIdentityImpl<com.scobolsolo.application.Buzzer, com.scobolsolo.persistence.BuzzerOpal> implements com.scobolsolo.application.Buzzer {

	private final com.scobolsolo.persistence.BuzzerOpal myBuzzerOpal;

	public BuzzerImpl(BuzzerOpal argBuzzerOpal) {
		super();
		myBuzzerOpal = org.apache.commons.lang3.Validate.notNull(argBuzzerOpal);
	}

	protected com.scobolsolo.persistence.BuzzerOpal getBuzzerOpal() {
		return myBuzzerOpal;
	}

	@Override
	public com.scobolsolo.persistence.BuzzerOpal getOpal() {
		return getBuzzerOpal();
	}

	@Override
	public com.scobolsolo.persistence.BuzzerOpal getBottomOpal() {
		return getBuzzerOpal();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getIdAsObject() {
		return getBuzzerOpal().getIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.BuzzerImpl setId(java.lang.Integer argId) {
		getBuzzerOpal().setId(argId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.BuzzerImpl setId(int argId) {
		getBuzzerOpal().setId(argId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getSchoolRegistrationIdAsObject() {
		return getBuzzerOpal().getSchoolRegistrationIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.BuzzerImpl setSchoolRegistrationId(java.lang.Integer argSchoolRegistrationId) {
		getBuzzerOpal().setSchoolRegistrationId(argSchoolRegistrationId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.BuzzerImpl setSchoolRegistrationId(int argSchoolRegistrationId) {
		getBuzzerOpal().setSchoolRegistrationId(argSchoolRegistrationId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getRoomIdAsObject() {
		return getBuzzerOpal().getRoomIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.persistence.BuzzerImpl setRoomId(java.lang.Integer argRoomId) {
		getBuzzerOpal().setRoomId(argRoomId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.BuzzerImpl setRoomId(int argRoomId) {
		getBuzzerOpal().setRoomId(argRoomId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public java.lang.String getName() {
		return getBuzzerOpal().getName();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public com.scobolsolo.persistence.BuzzerImpl setName(java.lang.String argName) {
		getBuzzerOpal().setName(argName);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the SchoolRegistration object created from buzzer through reference buzzer_registration_id_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.SchoolRegistration getSchoolRegistration() {
		SchoolRegistrationOpal lclSchoolRegistrationOpal = getBuzzerOpal().getSchoolRegistrationOpal();
		return lclSchoolRegistrationOpal == null ? null : lclSchoolRegistrationOpal.getUserFacing();
	}

	@Override
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.Buzzer setSchoolRegistration(com.scobolsolo.application.SchoolRegistration argSchoolRegistration) {
		getBuzzerOpal().setSchoolRegistrationOpal(argSchoolRegistration == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.SchoolRegistration, com.scobolsolo.persistence.SchoolRegistrationOpal>) argSchoolRegistration).getOpal());
		return this;
	}

	/** @return the Room object created from buzzer through reference buzzer_room_id_fkey */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.application.Room getRoom() {
		RoomOpal lclRoomOpal = getBuzzerOpal().getRoomOpal();
		return lclRoomOpal == null ? null : lclRoomOpal.getUserFacing();
	}

	@Override
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.Buzzer setRoom(com.scobolsolo.application.Room argRoom) {
		getBuzzerOpal().setRoomOpal(argRoom == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.Room, com.scobolsolo.persistence.RoomOpal>) argRoom).getOpal());
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
	public com.scobolsolo.application.Buzzer copy() {
		return getBuzzerOpal().copy().getUserFacing();
	}

}
