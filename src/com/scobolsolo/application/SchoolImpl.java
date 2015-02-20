package com.scobolsolo.application;

import com.scobolsolo.persistence.SchoolOpal;

public class SchoolImpl extends com.opal.AbstractIdentityImpl<SchoolOpal> implements School {
	private final SchoolOpal mySchoolOpal;

	public SchoolImpl(SchoolOpal argSchoolOpal) {
		super();
		mySchoolOpal = org.apache.commons.lang3.Validate.notNull(argSchoolOpal);
	}

	protected SchoolOpal getSchoolOpal() {
		return mySchoolOpal;
	}

	@Override
	protected /* Opal<? extends UserFacing> */ SchoolOpal getBottomOpal() {
		return getSchoolOpal();
	}

	@Override
	protected /* Opal<? extends UserFacing> */ SchoolOpal[] getOpalArray() {
		return new /* Opal<?> */ SchoolOpal[] {
			getSchoolOpal(),
		};
	}

	@Override
	public int compareTo(School argSecond) {
		return this.getName().compareTo(argSecond.getName());
	}

	@Override
	public java.lang.Integer getIdAsObject() {
		return getSchoolOpal().getIdAsObject();
	}

	@Override
	public void setId(java.lang.Integer argId) {
		getSchoolOpal().setId(argId);
		return;
	}

	@Override
	public void setId(int argId) {
		getSchoolOpal().setId(argId);
		return;
	}

	@Override
	public java.lang.String getName() {
		return getSchoolOpal().getName();
	}

	@Override
	public void setName(java.lang.String argName) {
		getSchoolOpal().setName(argName);
		return;
	}

	@Override
	public java.lang.String getShortName() {
		return getSchoolOpal().getShortName();
	}

	@Override
	public void setShortName(java.lang.String argShortName) {
		getSchoolOpal().setShortName(argShortName);
		return;
	}

	@Override
	public java.lang.String getVeryShortName() {
		return getSchoolOpal().getVeryShortName();
	}

	@Override
	public void setVeryShortName(java.lang.String argVeryShortName) {
		getSchoolOpal().setVeryShortName(argVeryShortName);
		return;
	}

	@Override
	public java.lang.String getLocation() {
		return getSchoolOpal().getLocation();
	}

	@Override
	public void setLocation(java.lang.String argLocation) {
		getSchoolOpal().setLocation(argLocation);
		return;
	}

	@Override
	public java.lang.String getNote() {
		return getSchoolOpal().getNote();
	}

	@Override
	public void setNote(java.lang.String argNote) {
		getSchoolOpal().setNote(argNote);
		return;
	}

	/* The following methods allow direct access to the user objects for which
	this object has foreign keys in the database. */

	/* The following methods allow access to the user objects that have foreign keys
	to this object. */

	@Override
	public void addSchoolRegistration(SchoolRegistration argSchoolRegistration) {
		getSchoolOpal().addSchoolRegistrationOpal(((SchoolRegistrationImpl) argSchoolRegistration).getSchoolRegistrationOpal());
	}

	@Override
	public void removeSchoolRegistration(SchoolRegistration argSchoolRegistration) {
		getSchoolOpal().removeSchoolRegistrationOpal(((SchoolRegistrationImpl) argSchoolRegistration).getSchoolRegistrationOpal());
	}

	@Override
	public int getSchoolRegistrationCount() {
		return getSchoolOpal().getSchoolRegistrationOpalCount();
	}

	@Override
	public java.util.stream.Stream<SchoolRegistration> streamSchoolRegistration() {
		return getSchoolOpal().streamSchoolRegistrationOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<SchoolRegistration> createSchoolRegistrationIterator() {
		return new com.opal.OpalIterator<> (getSchoolOpal().createSchoolRegistrationOpalIterator());
	}

	@Override
	public void clearSchoolRegistration() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void unlink() {
		getSchoolOpal().unlink();
	}

	@Override
	public void reload() {
		getSchoolOpal().reload();
	}

	@Override
	public School copy() {
		return getSchoolOpal().copy().getUserFacing();
	}

}
