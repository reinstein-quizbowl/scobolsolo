package com.scobolsolo.application;

import com.scobolsolo.persistence.WaitlistEntryOpal;
import com.scobolsolo.persistence.SchoolRegistrationOpal;

public class WaitlistEntryImpl extends com.opal.AbstractIdentityImpl<WaitlistEntryOpal> implements WaitlistEntry {
	private final WaitlistEntryOpal myWaitlistEntryOpal;

	public WaitlistEntryImpl(WaitlistEntryOpal argWaitlistEntryOpal) {
		super();
		myWaitlistEntryOpal = org.apache.commons.lang3.Validate.notNull(argWaitlistEntryOpal);
	}

	protected WaitlistEntryOpal getWaitlistEntryOpal() {
		return myWaitlistEntryOpal;
	}

	@Override
	protected /* Opal<? extends UserFacing> */ WaitlistEntryOpal getBottomOpal() {
		return getWaitlistEntryOpal();
	}

	@Override
	protected /* Opal<? extends UserFacing> */ WaitlistEntryOpal[] getOpalArray() {
		return new /* Opal<?> */ WaitlistEntryOpal[] {
			getWaitlistEntryOpal(),
		};
	}

	@Override
	public int compareTo(WaitlistEntry argSecond) {
		return this.getSequenceAsObject().compareTo(argSecond.getSequenceAsObject());
	}

	@Override
	public java.lang.Integer getIdAsObject() {
		return getWaitlistEntryOpal().getIdAsObject();
	}

	@Override
	public void setId(java.lang.Integer argId) {
		getWaitlistEntryOpal().setId(argId);
		return;
	}

	@Override
	public void setId(int argId) {
		getWaitlistEntryOpal().setId(argId);
		return;
	}

	@Override
	public java.lang.Integer getSchoolRegistrationIdAsObject() {
		return getWaitlistEntryOpal().getSchoolRegistrationIdAsObject();
	}

	@Override
	public void setSchoolRegistrationId(java.lang.Integer argSchoolRegistrationId) {
		getWaitlistEntryOpal().setSchoolRegistrationId(argSchoolRegistrationId);
		return;
	}

	@Override
	public void setSchoolRegistrationId(int argSchoolRegistrationId) {
		getWaitlistEntryOpal().setSchoolRegistrationId(argSchoolRegistrationId);
		return;
	}

	@Override
	public java.lang.Integer getSequenceAsObject() {
		return getWaitlistEntryOpal().getSequenceAsObject();
	}

	@Override
	public void setSequence(java.lang.Integer argSequence) {
		getWaitlistEntryOpal().setSequence(argSequence);
		return;
	}

	@Override
	public void setSequence(int argSequence) {
		getWaitlistEntryOpal().setSequence(argSequence);
		return;
	}

	@Override
	public java.lang.Integer getPlayerCountAsObject() {
		return getWaitlistEntryOpal().getPlayerCountAsObject();
	}

	@Override
	public void setPlayerCount(java.lang.Integer argPlayerCount) {
		getWaitlistEntryOpal().setPlayerCount(argPlayerCount);
		return;
	}

	@Override
	public void setPlayerCount(int argPlayerCount) {
		getWaitlistEntryOpal().setPlayerCount(argPlayerCount);
		return;
	}

	@Override
	public java.lang.String getNote() {
		return getWaitlistEntryOpal().getNote();
	}

	@Override
	public void setNote(java.lang.String argNote) {
		getWaitlistEntryOpal().setNote(argNote);
		return;
	}

	/* The following methods allow direct access to the user objects for which
	this object has foreign keys in the database. */

	/** Access to the SchoolRegistration object created from the table waitlist_entry through foreign key waitlist_entry_school_registration_id_fkey */

	@Override
	public SchoolRegistration getSchoolRegistration() {
		SchoolRegistrationOpal lclSchoolRegistrationOpal = getWaitlistEntryOpal().getSchoolRegistrationOpal();
		return lclSchoolRegistrationOpal == null ? null : lclSchoolRegistrationOpal.getUserFacing();
	}

	@Override
	public void setSchoolRegistration(SchoolRegistration argSchoolRegistration) {
		getWaitlistEntryOpal().setSchoolRegistrationOpal(argSchoolRegistration == null ? null : ((SchoolRegistrationImpl) argSchoolRegistration).getSchoolRegistrationOpal());
		return;
	}

	/* The following methods allow access to the user objects that have foreign keys
	to this object. */

	@Override
	public void unlink() {
		getWaitlistEntryOpal().unlink();
	}

	@Override
	public void reload() {
		getWaitlistEntryOpal().reload();
	}

	@Override
	public WaitlistEntry copy() {
		return getWaitlistEntryOpal().copy().getUserFacing();
	}

}
