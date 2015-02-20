package com.scobolsolo.application;

import com.scobolsolo.persistence.SchoolYearOpal;

public class SchoolYearImpl extends com.opal.AbstractIdentityImpl<SchoolYearOpal> implements SchoolYear {
	private final SchoolYearOpal mySchoolYearOpal;

	public SchoolYearImpl(SchoolYearOpal argSchoolYearOpal) {
		super();
		mySchoolYearOpal = org.apache.commons.lang3.Validate.notNull(argSchoolYearOpal);
	}

	protected SchoolYearOpal getSchoolYearOpal() {
		return mySchoolYearOpal;
	}

	@Override
	protected /* Opal<? extends UserFacing> */ SchoolYearOpal getBottomOpal() {
		return getSchoolYearOpal();
	}

	@Override
	protected /* Opal<? extends UserFacing> */ SchoolYearOpal[] getOpalArray() {
		return new /* Opal<?> */ SchoolYearOpal[] {
			getSchoolYearOpal(),
		};
	}

	@Override
	public int compareTo(SchoolYear argSecond) {
		return this.getSequenceAsObject().compareTo(argSecond.getSequenceAsObject());
	}

	@Override
	public java.lang.String getCode() {
		return getSchoolYearOpal().getCode();
	}

	@Override
	public void setCode(java.lang.String argCode) {
		getSchoolYearOpal().setCode(argCode);
		return;
	}

	@Override
	public java.lang.String getName() {
		return getSchoolYearOpal().getName();
	}

	@Override
	public void setName(java.lang.String argName) {
		getSchoolYearOpal().setName(argName);
		return;
	}

	@Override
	public java.lang.String getShortName() {
		return getSchoolYearOpal().getShortName();
	}

	@Override
	public void setShortName(java.lang.String argShortName) {
		getSchoolYearOpal().setShortName(argShortName);
		return;
	}

	@Override
	public java.lang.String getVeryShortName() {
		return getSchoolYearOpal().getVeryShortName();
	}

	@Override
	public void setVeryShortName(java.lang.String argVeryShortName) {
		getSchoolYearOpal().setVeryShortName(argVeryShortName);
		return;
	}

	@Override
	public java.lang.Integer getSequenceAsObject() {
		return getSchoolYearOpal().getSequenceAsObject();
	}

	@Override
	public void setSequence(java.lang.Integer argSequence) {
		getSchoolYearOpal().setSequence(argSequence);
		return;
	}

	@Override
	public void setSequence(int argSequence) {
		getSchoolYearOpal().setSequence(argSequence);
		return;
	}

	/* The following methods allow direct access to the user objects for which
	this object has foreign keys in the database. */

	/* The following methods allow access to the user objects that have foreign keys
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
	public SchoolYear copy() {
		return getSchoolYearOpal().copy().getUserFacing();
	}

}
