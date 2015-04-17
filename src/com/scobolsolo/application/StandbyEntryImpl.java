package com.scobolsolo.application;

import com.opal.Opal;
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
	protected com.opal.IdentityOpal<? extends StandbyEntry> getBottomOpal() {
		return getStandbyEntryOpal();
	}

	@Override
	protected Opal<? super StandbyEntry>[] getOpalArray() {
		return (Opal<? super StandbyEntry>[]) new Opal<?>[] {
			getStandbyEntryOpal(),
		};
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
	public void setId(java.lang.Integer argId) {
		getStandbyEntryOpal().setId(argId);
		return;
	}

	@Override
	public void setId(int argId) {
		getStandbyEntryOpal().setId(argId);
		return;
	}

	@Override
	public java.lang.Integer getSchoolRegistrationIdAsObject() {
		return getStandbyEntryOpal().getSchoolRegistrationIdAsObject();
	}

	@Override
	public void setSchoolRegistrationId(java.lang.Integer argSchoolRegistrationId) {
		getStandbyEntryOpal().setSchoolRegistrationId(argSchoolRegistrationId);
		return;
	}

	@Override
	public void setSchoolRegistrationId(int argSchoolRegistrationId) {
		getStandbyEntryOpal().setSchoolRegistrationId(argSchoolRegistrationId);
		return;
	}

	@Override
	public java.lang.Integer getSequenceAsObject() {
		return getStandbyEntryOpal().getSequenceAsObject();
	}

	@Override
	public void setSequence(java.lang.Integer argSequence) {
		getStandbyEntryOpal().setSequence(argSequence);
		return;
	}

	@Override
	public void setSequence(int argSequence) {
		getStandbyEntryOpal().setSequence(argSequence);
		return;
	}

	@Override
	public java.lang.Integer getPlayerCountAsObject() {
		return getStandbyEntryOpal().getPlayerCountAsObject();
	}

	@Override
	public void setPlayerCount(java.lang.Integer argPlayerCount) {
		getStandbyEntryOpal().setPlayerCount(argPlayerCount);
		return;
	}

	@Override
	public void setPlayerCount(int argPlayerCount) {
		getStandbyEntryOpal().setPlayerCount(argPlayerCount);
		return;
	}

	@Override
	public java.lang.String getNote() {
		return getStandbyEntryOpal().getNote();
	}

	@Override
	public void setNote(java.lang.String argNote) {
		getStandbyEntryOpal().setNote(argNote);
		return;
	}

	/* The following methods allow direct access to the user objects for which
	this object has foreign keys in the database. */

	/** Access to the SchoolRegistration object created from the table standby_entry through foreign key standby_entry_school_registration_id_fkey */

	@Override
	public SchoolRegistration getSchoolRegistration() {
		SchoolRegistrationOpal lclSchoolRegistrationOpal = getStandbyEntryOpal().getSchoolRegistrationOpal();
		return lclSchoolRegistrationOpal == null ? null : lclSchoolRegistrationOpal.getUserFacing();
	}

	@Override
	public void setSchoolRegistration(SchoolRegistration argSchoolRegistration) {
		getStandbyEntryOpal().setSchoolRegistrationOpal(argSchoolRegistration == null ? null : ((SchoolRegistrationImpl) argSchoolRegistration).getSchoolRegistrationOpal());
		return;
	}

	/* The following methods allow access to the user objects that have foreign keys
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
