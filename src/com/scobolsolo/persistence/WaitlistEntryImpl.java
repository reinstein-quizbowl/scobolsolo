package com.scobolsolo.persistence;

public class WaitlistEntryImpl extends com.opal.AbstractIdentityImpl<com.scobolsolo.application.WaitlistEntry, com.scobolsolo.persistence.WaitlistEntryOpal> implements com.scobolsolo.application.WaitlistEntry {

	private final com.scobolsolo.persistence.WaitlistEntryOpal myWaitlistEntryOpal;

	public WaitlistEntryImpl(WaitlistEntryOpal argWaitlistEntryOpal) {
		super();
		myWaitlistEntryOpal = org.apache.commons.lang3.Validate.notNull(argWaitlistEntryOpal);
	}

	protected com.scobolsolo.persistence.WaitlistEntryOpal getWaitlistEntryOpal() {
		return myWaitlistEntryOpal;
	}

	@Override
	public com.scobolsolo.persistence.WaitlistEntryOpal getOpal() {
		return getWaitlistEntryOpal();
	}

	@Override
	public com.scobolsolo.persistence.WaitlistEntryOpal getBottomOpal() {
		return getWaitlistEntryOpal();
	}

	@Override
	public int compareTo(com.scobolsolo.application.WaitlistEntry argSecond) {
		return this.getSequenceAsObject().compareTo(argSecond.getSequenceAsObject());
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getIdAsObject() {
		return getWaitlistEntryOpal().getIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.WaitlistEntryImpl setId(java.lang.Integer argId) {
		getWaitlistEntryOpal().setId(argId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.WaitlistEntryImpl setId(int argId) {
		getWaitlistEntryOpal().setId(argId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getSchoolRegistrationIdAsObject() {
		return getWaitlistEntryOpal().getSchoolRegistrationIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.WaitlistEntryImpl setSchoolRegistrationId(java.lang.Integer argSchoolRegistrationId) {
		getWaitlistEntryOpal().setSchoolRegistrationId(argSchoolRegistrationId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.WaitlistEntryImpl setSchoolRegistrationId(int argSchoolRegistrationId) {
		getWaitlistEntryOpal().setSchoolRegistrationId(argSchoolRegistrationId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getSequenceAsObject() {
		return getWaitlistEntryOpal().getSequenceAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.WaitlistEntryImpl setSequence(java.lang.Integer argSequence) {
		getWaitlistEntryOpal().setSequence(argSequence);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.WaitlistEntryImpl setSequence(int argSequence) {
		getWaitlistEntryOpal().setSequence(argSequence);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "1")
	@Override
	public java.lang.Integer getPlayerCountAsObject() {
		return getWaitlistEntryOpal().getPlayerCountAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "1")
	@Override
	public com.scobolsolo.persistence.WaitlistEntryImpl setPlayerCount(java.lang.Integer argPlayerCount) {
		getWaitlistEntryOpal().setPlayerCount(argPlayerCount);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.WaitlistEntryImpl setPlayerCount(int argPlayerCount) {
		getWaitlistEntryOpal().setPlayerCount(argPlayerCount);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public java.lang.String getNote() {
		return getWaitlistEntryOpal().getNote();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public com.scobolsolo.persistence.WaitlistEntryImpl setNote(java.lang.String argNote) {
		getWaitlistEntryOpal().setNote(argNote);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the SchoolRegistration object created from waitlist_entry through reference waitlist_entry_school_registration_id_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.SchoolRegistration getSchoolRegistration() {
		SchoolRegistrationOpal lclSchoolRegistrationOpal = getWaitlistEntryOpal().getSchoolRegistrationOpal();
		return lclSchoolRegistrationOpal == null ? null : lclSchoolRegistrationOpal.getUserFacing();
	}

	@Override
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.WaitlistEntry setSchoolRegistration(com.scobolsolo.application.SchoolRegistration argSchoolRegistration) {
		getWaitlistEntryOpal().setSchoolRegistrationOpal(argSchoolRegistration == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.SchoolRegistration, com.scobolsolo.persistence.SchoolRegistrationOpal>) argSchoolRegistration).getOpal());
		return this;
	}

	/* The following methods allow access to the user objects that have references
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
	public com.scobolsolo.application.WaitlistEntry copy() {
		return getWaitlistEntryOpal().copy().getUserFacing();
	}

}
