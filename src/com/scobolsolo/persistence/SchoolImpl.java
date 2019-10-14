package com.scobolsolo.persistence;

public class SchoolImpl extends com.opal.AbstractIdentityImpl<com.scobolsolo.application.School, com.scobolsolo.persistence.SchoolOpal> implements com.scobolsolo.application.School {

	private final com.scobolsolo.persistence.SchoolOpal mySchoolOpal;

	public SchoolImpl(SchoolOpal argSchoolOpal) {
		super();
		mySchoolOpal = org.apache.commons.lang3.Validate.notNull(argSchoolOpal);
	}

	protected com.scobolsolo.persistence.SchoolOpal getSchoolOpal() {
		return mySchoolOpal;
	}

	@Override
	public com.scobolsolo.persistence.SchoolOpal getOpal() {
		return getSchoolOpal();
	}

	@Override
	public com.scobolsolo.persistence.SchoolOpal getBottomOpal() {
		return getSchoolOpal();
	}

	@Override
	public int compareTo(com.scobolsolo.application.School argSecond) {
		return this.getName().compareToIgnoreCase(argSecond.getName());
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getIdAsObject() {
		return getSchoolOpal().getIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.SchoolImpl setId(java.lang.Integer argId) {
		getSchoolOpal().setId(argId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.SchoolImpl setId(int argId) {
		getSchoolOpal().setId(argId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public java.lang.String getName() {
		return getSchoolOpal().getName();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public com.scobolsolo.persistence.SchoolImpl setName(java.lang.String argName) {
		getSchoolOpal().setName(argName);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getShortName() {
		return getSchoolOpal().getShortName();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public com.scobolsolo.persistence.SchoolImpl setShortName(java.lang.String argShortName) {
		getSchoolOpal().setShortName(argShortName);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 12L)
	@Override
	public java.lang.String getVeryShortName() {
		return getSchoolOpal().getVeryShortName();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 12L)
	@Override
	public com.scobolsolo.persistence.SchoolImpl setVeryShortName(java.lang.String argVeryShortName) {
		getSchoolOpal().setVeryShortName(argVeryShortName);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public java.lang.String getLocation() {
		return getSchoolOpal().getLocation();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public com.scobolsolo.persistence.SchoolImpl setLocation(java.lang.String argLocation) {
		getSchoolOpal().setLocation(argLocation);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public java.lang.String getNote() {
		return getSchoolOpal().getNote();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public com.scobolsolo.persistence.SchoolImpl setNote(java.lang.String argNote) {
		getSchoolOpal().setNote(argNote);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public java.util.Set<com.scobolsolo.application.SchoolRegistration> getSchoolRegistrationSet() {
		return new com.opal.UserFacingBackCollectionSet<>(getSchoolOpal().getSchoolRegistrationOpalSet());
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
	public com.scobolsolo.application.School copy() {
		return getSchoolOpal().copy().getUserFacing();
	}

}
