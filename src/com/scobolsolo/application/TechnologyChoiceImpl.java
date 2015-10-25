package com.scobolsolo.application;

import com.scobolsolo.persistence.TechnologyChoiceOpal;

public class TechnologyChoiceImpl extends com.opal.AbstractIdentityImpl<TechnologyChoice, TechnologyChoiceOpal> implements TechnologyChoice {
	private final TechnologyChoiceOpal myTechnologyChoiceOpal;

	public TechnologyChoiceImpl(TechnologyChoiceOpal argTechnologyChoiceOpal) {
		super();
		myTechnologyChoiceOpal = org.apache.commons.lang3.Validate.notNull(argTechnologyChoiceOpal);
	}

	protected TechnologyChoiceOpal getTechnologyChoiceOpal() {
		return myTechnologyChoiceOpal;
	}

	@Override
	protected com.opal.IdentityOpal<? extends TechnologyChoice> getOpal() {
		return getTechnologyChoiceOpal();
	}

	@Override
	protected com.opal.IdentityOpal<? extends TechnologyChoice> getBottomOpal() {
		return getTechnologyChoiceOpal();
	}

	@Override
	public int compareTo(TechnologyChoice argSecond) {
		return this.getSequenceAsObject().compareTo(argSecond.getSequenceAsObject());
	}

	@Override
	public java.lang.String getCode() {
		return getTechnologyChoiceOpal().getCode();
	}

	@Override
	public TechnologyChoiceImpl setCode(java.lang.String argCode) {
		getTechnologyChoiceOpal().setCode(argCode);
		return this;
	}

	@Override
	public java.lang.String getName() {
		return getTechnologyChoiceOpal().getName();
	}

	@Override
	public TechnologyChoiceImpl setName(java.lang.String argName) {
		getTechnologyChoiceOpal().setName(argName);
		return this;
	}

	@Override
	public java.lang.String getShortName() {
		return getTechnologyChoiceOpal().getShortName();
	}

	@Override
	public TechnologyChoiceImpl setShortName(java.lang.String argShortName) {
		getTechnologyChoiceOpal().setShortName(argShortName);
		return this;
	}

	@Override
	public java.lang.String getVeryShortName() {
		return getTechnologyChoiceOpal().getVeryShortName();
	}

	@Override
	public TechnologyChoiceImpl setVeryShortName(java.lang.String argVeryShortName) {
		getTechnologyChoiceOpal().setVeryShortName(argVeryShortName);
		return this;
	}

	@Override
	public java.lang.Integer getSequenceAsObject() {
		return getTechnologyChoiceOpal().getSequenceAsObject();
	}

	@Override
	public TechnologyChoiceImpl setSequence(java.lang.Integer argSequence) {
		getTechnologyChoiceOpal().setSequence(argSequence);
		return this;
	}

	@Override
	public TechnologyChoiceImpl setSequence(int argSequence) {
		getTechnologyChoiceOpal().setSequence(argSequence);
		return this;
	}

	@Override
	public java.lang.Boolean hasComputerAsObject() {
		return getTechnologyChoiceOpal().hasComputerAsObject();
	}

	@Override
	public TechnologyChoiceImpl setComputer(java.lang.Boolean argComputer) {
		getTechnologyChoiceOpal().setComputer(argComputer);
		return this;
	}

	@Override
	public TechnologyChoiceImpl setComputer(boolean argComputer) {
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
	public TechnologyChoice copy() {
		return getTechnologyChoiceOpal().copy().getUserFacing();
	}

}
