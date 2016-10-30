package com.scobolsolo.persistence;


public class StandbyEntryImpl extends com.opal.AbstractIdentityImpl<com.scobolsolo.application.StandbyEntry, com.scobolsolo.persistence.StandbyEntryOpal> implements com.scobolsolo.application.StandbyEntry {

	private final com.scobolsolo.persistence.StandbyEntryOpal myStandbyEntryOpal;

	public StandbyEntryImpl(StandbyEntryOpal argStandbyEntryOpal) {
		super();
		myStandbyEntryOpal = org.apache.commons.lang3.Validate.notNull(argStandbyEntryOpal);
	}

	protected com.scobolsolo.persistence.StandbyEntryOpal getStandbyEntryOpal() {
		return myStandbyEntryOpal;
	}

	@Override
	protected com.opal.IdentityOpal<? extends com.scobolsolo.application.StandbyEntry> getOpal() {
		return getStandbyEntryOpal();
	}

	@Override
	protected com.opal.IdentityOpal<? extends com.scobolsolo.application.StandbyEntry> getBottomOpal() {
		return getStandbyEntryOpal();
	}

	@Override
	public int compareTo(com.scobolsolo.application.StandbyEntry argSecond) {
		return this.getSequenceAsObject().compareTo(argSecond.getSequenceAsObject());
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getIdAsObject() {
		return getStandbyEntryOpal().getIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.StandbyEntryImpl setId(java.lang.Integer argId) {
		getStandbyEntryOpal().setId(argId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.StandbyEntryImpl setId(int argId) {
		getStandbyEntryOpal().setId(argId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getSchoolRegistrationIdAsObject() {
		return getStandbyEntryOpal().getSchoolRegistrationIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.StandbyEntryImpl setSchoolRegistrationId(java.lang.Integer argSchoolRegistrationId) {
		getStandbyEntryOpal().setSchoolRegistrationId(argSchoolRegistrationId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.StandbyEntryImpl setSchoolRegistrationId(int argSchoolRegistrationId) {
		getStandbyEntryOpal().setSchoolRegistrationId(argSchoolRegistrationId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getSequenceAsObject() {
		return getStandbyEntryOpal().getSequenceAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.StandbyEntryImpl setSequence(java.lang.Integer argSequence) {
		getStandbyEntryOpal().setSequence(argSequence);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.StandbyEntryImpl setSequence(int argSequence) {
		getStandbyEntryOpal().setSequence(argSequence);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "1")
	@Override
	public java.lang.Integer getPlayerCountAsObject() {
		return getStandbyEntryOpal().getPlayerCountAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "1")
	@Override
	public com.scobolsolo.persistence.StandbyEntryImpl setPlayerCount(java.lang.Integer argPlayerCount) {
		getStandbyEntryOpal().setPlayerCount(argPlayerCount);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.StandbyEntryImpl setPlayerCount(int argPlayerCount) {
		getStandbyEntryOpal().setPlayerCount(argPlayerCount);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public java.lang.String getNote() {
		return getStandbyEntryOpal().getNote();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public com.scobolsolo.persistence.StandbyEntryImpl setNote(java.lang.String argNote) {
		getStandbyEntryOpal().setNote(argNote);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the SchoolRegistration object created from standby_entry through reference standby_entry_school_registration_id_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.SchoolRegistration getSchoolRegistration() {
		SchoolRegistrationOpal lclSchoolRegistrationOpal = getStandbyEntryOpal().getSchoolRegistrationOpal();
		return lclSchoolRegistrationOpal == null ? null : lclSchoolRegistrationOpal.getUserFacing();
	}

	@Override
	public com.scobolsolo.application.StandbyEntry setSchoolRegistration(com.scobolsolo.application.SchoolRegistration argSchoolRegistration) {
		getStandbyEntryOpal().setSchoolRegistrationOpal(argSchoolRegistration == null ? null : ((SchoolRegistrationImpl) argSchoolRegistration).getSchoolRegistrationOpal());
		return this;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public void unlink() {
		getStandbyEntryOpal().unlink();
	}

	@Override
	public void reload() {
		getStandbyEntryOpal().reload();
	}

	@Override
	public com.scobolsolo.application.StandbyEntry copy() {
		return getStandbyEntryOpal().copy().getUserFacing();
	}

}
