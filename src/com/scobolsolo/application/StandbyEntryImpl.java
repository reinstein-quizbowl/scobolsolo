package com.scobolsolo.application;

import com.scobolsolo.persistence.StandbyEntryOpal;
import com.scobolsolo.persistence.SchoolRegistrationOpal;

public class StandbyEntryImpl extends com.opal.AbstractIdentityImpl<StandbyEntry, StandbyEntryOpal> implements StandbyEntry {
	private final StandbyEntryOpal myStandbyEntryOpal;

	public StandbyEntryImpl(StandbyEntryOpal argStandbyEntryOpal) {
		super();
		myStandbyEntryOpal = org.apache.commons.lang3.Validate.notNull(argStandbyEntryOpal);
	}

	protected StandbyEntryOpal getStandbyEntryOpal() {
		return myStandbyEntryOpal;
	}

	@Override
	protected com.opal.IdentityOpal<? extends StandbyEntry> getOpal() {
		return getStandbyEntryOpal();
	}

	@Override
	protected com.opal.IdentityOpal<? extends StandbyEntry> getBottomOpal() {
		return getStandbyEntryOpal();
	}

	@Override
	public int compareTo(StandbyEntry argSecond) {
		return this.getSequenceAsObject().compareTo(argSecond.getSequenceAsObject());
	}

	@Override
	public java.lang.Integer getIdAsObject() {
		return getStandbyEntryOpal().getIdAsObject();
	}

	@Override
	public StandbyEntryImpl setId(java.lang.Integer argId) {
		getStandbyEntryOpal().setId(argId);
		return this;
	}

	@Override
	public StandbyEntryImpl setId(int argId) {
		getStandbyEntryOpal().setId(argId);
		return this;
	}

	@Override
	public java.lang.Integer getSchoolRegistrationIdAsObject() {
		return getStandbyEntryOpal().getSchoolRegistrationIdAsObject();
	}

	@Override
	public StandbyEntryImpl setSchoolRegistrationId(java.lang.Integer argSchoolRegistrationId) {
		getStandbyEntryOpal().setSchoolRegistrationId(argSchoolRegistrationId);
		return this;
	}

	@Override
	public StandbyEntryImpl setSchoolRegistrationId(int argSchoolRegistrationId) {
		getStandbyEntryOpal().setSchoolRegistrationId(argSchoolRegistrationId);
		return this;
	}

	@Override
	public java.lang.Integer getSequenceAsObject() {
		return getStandbyEntryOpal().getSequenceAsObject();
	}

	@Override
	public StandbyEntryImpl setSequence(java.lang.Integer argSequence) {
		getStandbyEntryOpal().setSequence(argSequence);
		return this;
	}

	@Override
	public StandbyEntryImpl setSequence(int argSequence) {
		getStandbyEntryOpal().setSequence(argSequence);
		return this;
	}

	@Override
	public java.lang.Integer getPlayerCountAsObject() {
		return getStandbyEntryOpal().getPlayerCountAsObject();
	}

	@Override
	public StandbyEntryImpl setPlayerCount(java.lang.Integer argPlayerCount) {
		getStandbyEntryOpal().setPlayerCount(argPlayerCount);
		return this;
	}

	@Override
	public StandbyEntryImpl setPlayerCount(int argPlayerCount) {
		getStandbyEntryOpal().setPlayerCount(argPlayerCount);
		return this;
	}

	@Override
	public java.lang.String getNote() {
		return getStandbyEntryOpal().getNote();
	}

	@Override
	public StandbyEntryImpl setNote(java.lang.String argNote) {
		getStandbyEntryOpal().setNote(argNote);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** Access to the SchoolRegistration object created from standby_entry through reference standby_entry_school_registration_id_fkey */

	@Override
	public SchoolRegistration getSchoolRegistration() {
		SchoolRegistrationOpal lclSchoolRegistrationOpal = getStandbyEntryOpal().getSchoolRegistrationOpal();
		return lclSchoolRegistrationOpal == null ? null : lclSchoolRegistrationOpal.getUserFacing();
	}

	@Override
	public StandbyEntry setSchoolRegistration(SchoolRegistration argSchoolRegistration) {
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
	public StandbyEntry copy() {
		return getStandbyEntryOpal().copy().getUserFacing();
	}

}
