package com.scobolsolo.persistence;

public class TechnologyChoiceImpl extends com.opal.AbstractIdentityImpl<com.scobolsolo.application.TechnologyChoice, com.scobolsolo.persistence.TechnologyChoiceOpal> implements com.scobolsolo.application.TechnologyChoice {

	private final com.scobolsolo.persistence.TechnologyChoiceOpal myTechnologyChoiceOpal;

	public TechnologyChoiceImpl(TechnologyChoiceOpal argTechnologyChoiceOpal) {
		super();
		myTechnologyChoiceOpal = org.apache.commons.lang3.Validate.notNull(argTechnologyChoiceOpal);
	}

	protected com.scobolsolo.persistence.TechnologyChoiceOpal getTechnologyChoiceOpal() {
		return myTechnologyChoiceOpal;
	}

	@Override
	public com.scobolsolo.persistence.TechnologyChoiceOpal getOpal() {
		return getTechnologyChoiceOpal();
	}

	@Override
	public com.scobolsolo.persistence.TechnologyChoiceOpal getBottomOpal() {
		return getTechnologyChoiceOpal();
	}

	@Override
	public int compareTo(com.scobolsolo.application.TechnologyChoice argSecond) {
		return this.getSequenceAsObject().compareTo(argSecond.getSequenceAsObject());
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getCode() {
		return getTechnologyChoiceOpal().getCode();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public com.scobolsolo.persistence.TechnologyChoiceImpl setCode(java.lang.String argCode) {
		getTechnologyChoiceOpal().setCode(argCode);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public java.lang.String getName() {
		return getTechnologyChoiceOpal().getName();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public com.scobolsolo.persistence.TechnologyChoiceImpl setName(java.lang.String argName) {
		getTechnologyChoiceOpal().setName(argName);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getShortName() {
		return getTechnologyChoiceOpal().getShortName();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public com.scobolsolo.persistence.TechnologyChoiceImpl setShortName(java.lang.String argShortName) {
		getTechnologyChoiceOpal().setShortName(argShortName);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 12L)
	@Override
	public java.lang.String getVeryShortName() {
		return getTechnologyChoiceOpal().getVeryShortName();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 12L)
	@Override
	public com.scobolsolo.persistence.TechnologyChoiceImpl setVeryShortName(java.lang.String argVeryShortName) {
		getTechnologyChoiceOpal().setVeryShortName(argVeryShortName);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getSequenceAsObject() {
		return getTechnologyChoiceOpal().getSequenceAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.TechnologyChoiceImpl setSequence(java.lang.Integer argSequence) {
		getTechnologyChoiceOpal().setSequence(argSequence);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.TechnologyChoiceImpl setSequence(int argSequence) {
		getTechnologyChoiceOpal().setSequence(argSequence);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	@Override
	public java.lang.Boolean hasComputerAsObject() {
		return getTechnologyChoiceOpal().hasComputerAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	@Override
	public com.scobolsolo.persistence.TechnologyChoiceImpl setComputer(java.lang.Boolean argComputer) {
		getTechnologyChoiceOpal().setComputer(argComputer);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.TechnologyChoiceImpl setComputer(boolean argComputer) {
		getTechnologyChoiceOpal().setComputer(argComputer);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public void unlink() {
		getTechnologyChoiceOpal().unlink();
	}

	@Override
	public void reload() {
		getTechnologyChoiceOpal().reload();
	}

	@Override
	public com.scobolsolo.application.TechnologyChoice copy() {
		return getTechnologyChoiceOpal().copy().getUserFacing();
	}

}
