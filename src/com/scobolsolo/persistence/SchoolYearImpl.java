package com.scobolsolo.persistence;


public class SchoolYearImpl extends com.opal.AbstractIdentityImpl<com.scobolsolo.application.SchoolYear, com.scobolsolo.persistence.SchoolYearOpal> implements com.scobolsolo.application.SchoolYear {

	private final com.scobolsolo.persistence.SchoolYearOpal mySchoolYearOpal;

	public SchoolYearImpl(SchoolYearOpal argSchoolYearOpal) {
		super();
		mySchoolYearOpal = org.apache.commons.lang3.Validate.notNull(argSchoolYearOpal);
	}

	protected com.scobolsolo.persistence.SchoolYearOpal getSchoolYearOpal() {
		return mySchoolYearOpal;
	}

	@Override
	protected com.opal.IdentityOpal<? extends com.scobolsolo.application.SchoolYear> getOpal() {
		return getSchoolYearOpal();
	}

	@Override
	protected com.opal.IdentityOpal<? extends com.scobolsolo.application.SchoolYear> getBottomOpal() {
		return getSchoolYearOpal();
	}

	@Override
	public int compareTo(com.scobolsolo.application.SchoolYear argSecond) {
		return this.getSequenceAsObject().compareTo(argSecond.getSequenceAsObject());
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getCode() {
		return getSchoolYearOpal().getCode();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public com.scobolsolo.persistence.SchoolYearImpl setCode(java.lang.String argCode) {
		getSchoolYearOpal().setCode(argCode);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public java.lang.String getName() {
		return getSchoolYearOpal().getName();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public com.scobolsolo.persistence.SchoolYearImpl setName(java.lang.String argName) {
		getSchoolYearOpal().setName(argName);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getShortName() {
		return getSchoolYearOpal().getShortName();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public com.scobolsolo.persistence.SchoolYearImpl setShortName(java.lang.String argShortName) {
		getSchoolYearOpal().setShortName(argShortName);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 12L)
	@Override
	public java.lang.String getVeryShortName() {
		return getSchoolYearOpal().getVeryShortName();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 12L)
	@Override
	public com.scobolsolo.persistence.SchoolYearImpl setVeryShortName(java.lang.String argVeryShortName) {
		getSchoolYearOpal().setVeryShortName(argVeryShortName);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getSequenceAsObject() {
		return getSchoolYearOpal().getSequenceAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.SchoolYearImpl setSequence(java.lang.Integer argSequence) {
		getSchoolYearOpal().setSequence(argSequence);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.SchoolYearImpl setSequence(int argSequence) {
		getSchoolYearOpal().setSequence(argSequence);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public void unlink() {
		getSchoolYearOpal().unlink();
	}

	@Override
	public void reload() {
		getSchoolYearOpal().reload();
	}

	@Override
	public com.scobolsolo.application.SchoolYear copy() {
		return getSchoolYearOpal().copy().getUserFacing();
	}

}
