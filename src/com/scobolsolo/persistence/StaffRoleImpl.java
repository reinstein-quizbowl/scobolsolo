package com.scobolsolo.persistence;


public class StaffRoleImpl extends com.opal.AbstractIdentityImpl<com.scobolsolo.application.StaffRole, com.scobolsolo.persistence.StaffRoleOpal> implements com.scobolsolo.application.StaffRole {

	private final com.scobolsolo.persistence.StaffRoleOpal myStaffRoleOpal;

	public StaffRoleImpl(StaffRoleOpal argStaffRoleOpal) {
		super();
		myStaffRoleOpal = org.apache.commons.lang3.Validate.notNull(argStaffRoleOpal);
	}

	protected com.scobolsolo.persistence.StaffRoleOpal getStaffRoleOpal() {
		return myStaffRoleOpal;
	}

	@Override
	protected com.opal.IdentityOpal<? extends com.scobolsolo.application.StaffRole> getOpal() {
		return getStaffRoleOpal();
	}

	@Override
	protected com.opal.IdentityOpal<? extends com.scobolsolo.application.StaffRole> getBottomOpal() {
		return getStaffRoleOpal();
	}

	@Override
	public int compareTo(com.scobolsolo.application.StaffRole argSecond) {
		return this.getSequenceAsObject().compareTo(argSecond.getSequenceAsObject());
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getCode() {
		return getStaffRoleOpal().getCode();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public com.scobolsolo.persistence.StaffRoleImpl setCode(java.lang.String argCode) {
		getStaffRoleOpal().setCode(argCode);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public java.lang.String getName() {
		return getStaffRoleOpal().getName();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public com.scobolsolo.persistence.StaffRoleImpl setName(java.lang.String argName) {
		getStaffRoleOpal().setName(argName);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getShortName() {
		return getStaffRoleOpal().getShortName();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public com.scobolsolo.persistence.StaffRoleImpl setShortName(java.lang.String argShortName) {
		getStaffRoleOpal().setShortName(argShortName);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 12L)
	@Override
	public java.lang.String getVeryShortName() {
		return getStaffRoleOpal().getVeryShortName();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 12L)
	@Override
	public com.scobolsolo.persistence.StaffRoleImpl setVeryShortName(java.lang.String argVeryShortName) {
		getStaffRoleOpal().setVeryShortName(argVeryShortName);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getSequenceAsObject() {
		return getStaffRoleOpal().getSequenceAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.StaffRoleImpl setSequence(java.lang.Integer argSequence) {
		getStaffRoleOpal().setSequence(argSequence);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.StaffRoleImpl setSequence(int argSequence) {
		getStaffRoleOpal().setSequence(argSequence);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@Override
	public java.lang.Boolean isMayEnterAnyMatchAsObject() {
		return getStaffRoleOpal().isMayEnterAnyMatchAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@Override
	public com.scobolsolo.persistence.StaffRoleImpl setMayEnterAnyMatch(java.lang.Boolean argMayEnterAnyMatch) {
		getStaffRoleOpal().setMayEnterAnyMatch(argMayEnterAnyMatch);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.StaffRoleImpl setMayEnterAnyMatch(boolean argMayEnterAnyMatch) {
		getStaffRoleOpal().setMayEnterAnyMatch(argMayEnterAnyMatch);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	@Override
	public java.lang.Boolean isMayEnterMatchesInAssignedRoomAsObject() {
		return getStaffRoleOpal().isMayEnterMatchesInAssignedRoomAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	@Override
	public com.scobolsolo.persistence.StaffRoleImpl setMayEnterMatchesInAssignedRoom(java.lang.Boolean argMayEnterMatchesInAssignedRoom) {
		getStaffRoleOpal().setMayEnterMatchesInAssignedRoom(argMayEnterMatchesInAssignedRoom);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.StaffRoleImpl setMayEnterMatchesInAssignedRoom(boolean argMayEnterMatchesInAssignedRoom) {
		getStaffRoleOpal().setMayEnterMatchesInAssignedRoom(argMayEnterMatchesInAssignedRoom);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@Override
	public java.lang.Boolean isMayViewQuestionsAsObject() {
		return getStaffRoleOpal().isMayViewQuestionsAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@Override
	public com.scobolsolo.persistence.StaffRoleImpl setMayViewQuestions(java.lang.Boolean argMayViewQuestions) {
		getStaffRoleOpal().setMayViewQuestions(argMayViewQuestions);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.StaffRoleImpl setMayViewQuestions(boolean argMayViewQuestions) {
		getStaffRoleOpal().setMayViewQuestions(argMayViewQuestions);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@Override
	public java.lang.Boolean isMayEnterMatchesBeforeUsuallyPermittedAsObject() {
		return getStaffRoleOpal().isMayEnterMatchesBeforeUsuallyPermittedAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@Override
	public com.scobolsolo.persistence.StaffRoleImpl setMayEnterMatchesBeforeUsuallyPermitted(java.lang.Boolean argMayEnterMatchesBeforeUsuallyPermitted) {
		getStaffRoleOpal().setMayEnterMatchesBeforeUsuallyPermitted(argMayEnterMatchesBeforeUsuallyPermitted);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.StaffRoleImpl setMayEnterMatchesBeforeUsuallyPermitted(boolean argMayEnterMatchesBeforeUsuallyPermitted) {
		getStaffRoleOpal().setMayEnterMatchesBeforeUsuallyPermitted(argMayEnterMatchesBeforeUsuallyPermitted);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public com.scobolsolo.application.StaffRole addStaffAssignment(com.scobolsolo.application.StaffAssignment argStaffAssignment) {
		getStaffRoleOpal().addStaffAssignmentOpal(((StaffAssignmentImpl) argStaffAssignment).getStaffAssignmentOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.StaffRole removeStaffAssignment(com.scobolsolo.application.StaffAssignment argStaffAssignment) {
		getStaffRoleOpal().removeStaffAssignmentOpal(((StaffAssignmentImpl) argStaffAssignment).getStaffAssignmentOpal());
		return this;
	}

	@Override
	public int getStaffAssignmentCount() {
		return getStaffRoleOpal().getStaffAssignmentOpalCount();
	}

	@Override
	public java.util.stream.Stream<com.scobolsolo.application.StaffAssignment> streamStaffAssignment() {
		return getStaffRoleOpal().streamStaffAssignmentOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<com.scobolsolo.application.StaffAssignment> createStaffAssignmentIterator() {
		return new com.opal.OpalIterator<> (getStaffRoleOpal().createStaffAssignmentOpalIterator());
	}

	@Override
	public void unlink() {
		getStaffRoleOpal().unlink();
	}

	@Override
	public void reload() {
		getStaffRoleOpal().reload();
	}

	@Override
	public com.scobolsolo.application.StaffRole copy() {
		return getStaffRoleOpal().copy().getUserFacing();
	}

}
