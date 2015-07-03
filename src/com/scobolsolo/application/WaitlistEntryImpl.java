package com.scobolsolo.application;

import com.scobolsolo.persistence.WaitlistEntryOpal;
import com.scobolsolo.persistence.SchoolRegistrationOpal;

public class WaitlistEntryImpl extends com.opal.AbstractIdentityImpl<WaitlistEntry, WaitlistEntryOpal> implements WaitlistEntry {
	private final WaitlistEntryOpal myWaitlistEntryOpal;

	public WaitlistEntryImpl(WaitlistEntryOpal argWaitlistEntryOpal) {
		super();
		myWaitlistEntryOpal = org.apache.commons.lang3.Validate.notNull(argWaitlistEntryOpal);
	}

	protected WaitlistEntryOpal getWaitlistEntryOpal() {
		return myWaitlistEntryOpal;
	}

	@Override
	protected com.opal.IdentityOpal<? extends WaitlistEntry> getOpal() {
		return getWaitlistEntryOpal();
	}

	@Override
	protected com.opal.IdentityOpal<? extends WaitlistEntry> getBottomOpal() {
		return getWaitlistEntryOpal();
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
	public WaitlistEntryImpl setId(java.lang.Integer argId) {
		getWaitlistEntryOpal().setId(argId);
		return this;
	}

	@Override
	public WaitlistEntryImpl setId(int argId) {
		getWaitlistEntryOpal().setId(argId);
		return this;
	}

	@Override
	public java.lang.Integer getSchoolRegistrationIdAsObject() {
		return getWaitlistEntryOpal().getSchoolRegistrationIdAsObject();
	}

	@Override
	public WaitlistEntryImpl setSchoolRegistrationId(java.lang.Integer argSchoolRegistrationId) {
		getWaitlistEntryOpal().setSchoolRegistrationId(argSchoolRegistrationId);
		return this;
	}

	@Override
	public WaitlistEntryImpl setSchoolRegistrationId(int argSchoolRegistrationId) {
		getWaitlistEntryOpal().setSchoolRegistrationId(argSchoolRegistrationId);
		return this;
	}

	@Override
	public java.lang.Integer getSequenceAsObject() {
		return getWaitlistEntryOpal().getSequenceAsObject();
	}

	@Override
	public WaitlistEntryImpl setSequence(java.lang.Integer argSequence) {
		getWaitlistEntryOpal().setSequence(argSequence);
		return this;
	}

	@Override
	public WaitlistEntryImpl setSequence(int argSequence) {
		getWaitlistEntryOpal().setSequence(argSequence);
		return this;
	}

	@Override
	public java.lang.Integer getPlayerCountAsObject() {
		return getWaitlistEntryOpal().getPlayerCountAsObject();
	}

	@Override
	public WaitlistEntryImpl setPlayerCount(java.lang.Integer argPlayerCount) {
		getWaitlistEntryOpal().setPlayerCount(argPlayerCount);
		return this;
	}

	@Override
	public WaitlistEntryImpl setPlayerCount(int argPlayerCount) {
		getWaitlistEntryOpal().setPlayerCount(argPlayerCount);
		return this;
	}

	@Override
	public java.lang.String getNote() {
		return getWaitlistEntryOpal().getNote();
	}

	@Override
	public WaitlistEntryImpl setNote(java.lang.String argNote) {
		getWaitlistEntryOpal().setNote(argNote);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the SchoolRegistration object created from waitlist_entry through reference waitlist_entry_school_registration_id_fkey */

	@Override
	public SchoolRegistration getSchoolRegistration() {
		SchoolRegistrationOpal lclSchoolRegistrationOpal = getWaitlistEntryOpal().getSchoolRegistrationOpal();
		return lclSchoolRegistrationOpal == null ? null : lclSchoolRegistrationOpal.getUserFacing();
	}

	@Override
	public WaitlistEntry setSchoolRegistration(SchoolRegistration argSchoolRegistration) {
		getWaitlistEntryOpal().setSchoolRegistrationOpal(argSchoolRegistration == null ? null : ((SchoolRegistrationImpl) argSchoolRegistration).getSchoolRegistrationOpal());
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
	public WaitlistEntry copy() {
		return getWaitlistEntryOpal().copy().getUserFacing();
	}

}
