package com.scobolsolo.application;

import com.opal.Opal;
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
	protected com.opal.IdentityOpal<? extends Buzzer> getBottomOpal() {
		return getBuzzerOpal();
	}

	@Override
	protected Opal<? super Buzzer>[] getOpalArray() {
		return (Opal<? super Buzzer>[]) new Opal<?>[] {
			getBuzzerOpal(),
		};
	}

	@Override
	public java.lang.Integer getIdAsObject() {
		return getBuzzerOpal().getIdAsObject();
	}

	@Override
	public void setId(java.lang.Integer argId) {
		getBuzzerOpal().setId(argId);
		return;
	}

	@Override
	public void setId(int argId) {
		getBuzzerOpal().setId(argId);
		return;
	}

	@Override
	public java.lang.Integer getSchoolRegistrationIdAsObject() {
		return getBuzzerOpal().getSchoolRegistrationIdAsObject();
	}

	@Override
	public void setSchoolRegistrationId(java.lang.Integer argSchoolRegistrationId) {
		getBuzzerOpal().setSchoolRegistrationId(argSchoolRegistrationId);
		return;
	}

	@Override
	public void setSchoolRegistrationId(int argSchoolRegistrationId) {
		getBuzzerOpal().setSchoolRegistrationId(argSchoolRegistrationId);
		return;
	}

	@Override
	public java.lang.Integer getRoomIdAsObject() {
		return getBuzzerOpal().getRoomIdAsObject();
	}

	@Override
	public void setRoomId(java.lang.Integer argRoomId) {
		getBuzzerOpal().setRoomId(argRoomId);
		return;
	}

	@Override
	public void setRoomId(int argRoomId) {
		getBuzzerOpal().setRoomId(argRoomId);
		return;
	}

	@Override
	public java.lang.String getName() {
		return getBuzzerOpal().getName();
	}

	@Override
	public void setName(java.lang.String argName) {
		getBuzzerOpal().setName(argName);
		return;
	}

	/* The following methods allow direct access to the user objects for which
	this object has foreign keys in the database. */

	/** Access to the SchoolRegistration object created from the table buzzer through foreign key buzzer_registration_id_fkey */

	@Override
	public SchoolRegistration getSchoolRegistration() {
		SchoolRegistrationOpal lclSchoolRegistrationOpal = getBuzzerOpal().getSchoolRegistrationOpal();
		return lclSchoolRegistrationOpal == null ? null : lclSchoolRegistrationOpal.getUserFacing();
	}

	@Override
	public void setSchoolRegistration(SchoolRegistration argSchoolRegistration) {
		getBuzzerOpal().setSchoolRegistrationOpal(argSchoolRegistration == null ? null : ((SchoolRegistrationImpl) argSchoolRegistration).getSchoolRegistrationOpal());
		return;
	}

	/** Access to the Room object created from the table buzzer through foreign key buzzer_room_id_fkey */

	@Override
	public Room getRoom() {
		RoomOpal lclRoomOpal = getBuzzerOpal().getRoomOpal();
		return lclRoomOpal == null ? null : lclRoomOpal.getUserFacing();
	}

	@Override
	public void setRoom(Room argRoom) {
		getBuzzerOpal().setRoomOpal(argRoom == null ? null : ((RoomImpl) argRoom).getRoomOpal());
		return;
	}

	/* The following methods allow access to the user objects that have foreign keys
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
