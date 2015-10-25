package com.scobolsolo.application;

import com.scobolsolo.persistence.StaffRoleOpal;

public class StaffRoleImpl extends com.opal.AbstractIdentityImpl<StaffRole, StaffRoleOpal> implements StaffRole {
	private final StaffRoleOpal myStaffRoleOpal;

	public StaffRoleImpl(StaffRoleOpal argStaffRoleOpal) {
		super();
		myStaffRoleOpal = org.apache.commons.lang3.Validate.notNull(argStaffRoleOpal);
	}

	protected StaffRoleOpal getStaffRoleOpal() {
		return myStaffRoleOpal;
	}

	@Override
	protected com.opal.IdentityOpal<? extends StaffRole> getOpal() {
		return getStaffRoleOpal();
	}

	@Override
	protected com.opal.IdentityOpal<? extends StaffRole> getBottomOpal() {
		return getStaffRoleOpal();
	}

	@Override
	public int compareTo(StaffRole argSecond) {
		return this.getSequenceAsObject().compareTo(argSecond.getSequenceAsObject());
	}

	@Override
	public java.lang.String getCode() {
		return getStaffRoleOpal().getCode();
	}

	@Override
	public StaffRoleImpl setCode(java.lang.String argCode) {
		getStaffRoleOpal().setCode(argCode);
		return this;
	}

	@Override
	public java.lang.String getName() {
		return getStaffRoleOpal().getName();
	}

	@Override
	public StaffRoleImpl setName(java.lang.String argName) {
		getStaffRoleOpal().setName(argName);
		return this;
	}

	@Override
	public java.lang.String getShortName() {
		return getStaffRoleOpal().getShortName();
	}

	@Override
	public StaffRoleImpl setShortName(java.lang.String argShortName) {
		getStaffRoleOpal().setShortName(argShortName);
		return this;
	}

	@Override
	public java.lang.String getVeryShortName() {
		return getStaffRoleOpal().getVeryShortName();
	}

	@Override
	public StaffRoleImpl setVeryShortName(java.lang.String argVeryShortName) {
		getStaffRoleOpal().setVeryShortName(argVeryShortName);
		return this;
	}

	@Override
	public java.lang.Integer getSequenceAsObject() {
		return getStaffRoleOpal().getSequenceAsObject();
	}

	@Override
	public StaffRoleImpl setSequence(java.lang.Integer argSequence) {
		getStaffRoleOpal().setSequence(argSequence);
		return this;
	}

	@Override
	public StaffRoleImpl setSequence(int argSequence) {
		getStaffRoleOpal().setSequence(argSequence);
		return this;
	}

	@Override
	public java.lang.Boolean isMayEnterAnyMatchAsObject() {
		return getStaffRoleOpal().isMayEnterAnyMatchAsObject();
	}

	@Override
	public StaffRoleImpl setMayEnterAnyMatch(java.lang.Boolean argMayEnterAnyMatch) {
		getStaffRoleOpal().setMayEnterAnyMatch(argMayEnterAnyMatch);
		return this;
	}

	@Override
	public StaffRoleImpl setMayEnterAnyMatch(boolean argMayEnterAnyMatch) {
		getStaffRoleOpal().setMayEnterAnyMatch(argMayEnterAnyMatch);
		return this;
	}

	@Override
	public java.lang.Boolean isMayEnterMatchesInAssignedRoomAsObject() {
		return getStaffRoleOpal().isMayEnterMatchesInAssignedRoomAsObject();
	}

	@Override
	public StaffRoleImpl setMayEnterMatchesInAssignedRoom(java.lang.Boolean argMayEnterMatchesInAssignedRoom) {
		getStaffRoleOpal().setMayEnterMatchesInAssignedRoom(argMayEnterMatchesInAssignedRoom);
		return this;
	}

	@Override
	public StaffRoleImpl setMayEnterMatchesInAssignedRoom(boolean argMayEnterMatchesInAssignedRoom) {
		getStaffRoleOpal().setMayEnterMatchesInAssignedRoom(argMayEnterMatchesInAssignedRoom);
		return this;
	}

	@Override
	public java.lang.Boolean isMayViewQuestionsAsObject() {
		return getStaffRoleOpal().isMayViewQuestionsAsObject();
	}

	@Override
	public StaffRoleImpl setMayViewQuestions(java.lang.Boolean argMayViewQuestions) {
		getStaffRoleOpal().setMayViewQuestions(argMayViewQuestions);
		return this;
	}

	@Override
	public StaffRoleImpl setMayViewQuestions(boolean argMayViewQuestions) {
		getStaffRoleOpal().setMayViewQuestions(argMayViewQuestions);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public void unlink() {
		getStaffRoleOpal().unlink();
	}

	@Override
	public void reload() {
		getStaffRoleOpal().reload();
	}

	@Override
	public StaffRole copy() {
		return getStaffRoleOpal().copy().getUserFacing();
	}

}
