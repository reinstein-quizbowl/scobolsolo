package com.scobolsolo.persistence;


public class StaffAssignmentImpl extends com.opal.AbstractIdentityImpl<com.scobolsolo.application.StaffAssignment, com.scobolsolo.persistence.StaffAssignmentOpal> implements com.scobolsolo.application.StaffAssignment {

	private final com.scobolsolo.persistence.StaffAssignmentOpal myStaffAssignmentOpal;

	public StaffAssignmentImpl(StaffAssignmentOpal argStaffAssignmentOpal) {
		super();
		myStaffAssignmentOpal = org.apache.commons.lang3.Validate.notNull(argStaffAssignmentOpal);
	}

	protected com.scobolsolo.persistence.StaffAssignmentOpal getStaffAssignmentOpal() {
		return myStaffAssignmentOpal;
	}

	@Override
	protected com.opal.IdentityOpal<? extends com.scobolsolo.application.StaffAssignment> getOpal() {
		return getStaffAssignmentOpal();
	}

	@Override
	protected com.opal.IdentityOpal<? extends com.scobolsolo.application.StaffAssignment> getBottomOpal() {
		return getStaffAssignmentOpal();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getIdAsObject() {
		return getStaffAssignmentOpal().getIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.StaffAssignmentImpl setId(java.lang.Integer argId) {
		getStaffAssignmentOpal().setId(argId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.StaffAssignmentImpl setId(int argId) {
		getStaffAssignmentOpal().setId(argId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getRoomIdAsObject() {
		return getStaffAssignmentOpal().getRoomIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.StaffAssignmentImpl setRoomId(java.lang.Integer argRoomId) {
		getStaffAssignmentOpal().setRoomId(argRoomId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.StaffAssignmentImpl setRoomId(int argRoomId) {
		getStaffAssignmentOpal().setRoomId(argRoomId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public java.lang.String getNote() {
		return getStaffAssignmentOpal().getNote();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public com.scobolsolo.persistence.StaffAssignmentImpl setNote(java.lang.String argNote) {
		getStaffAssignmentOpal().setNote(argNote);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getStaffIdAsObject() {
		return getStaffAssignmentOpal().getStaffIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.StaffAssignmentImpl setStaffId(java.lang.Integer argStaffId) {
		getStaffAssignmentOpal().setStaffId(argStaffId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.StaffAssignmentImpl setStaffId(int argStaffId) {
		getStaffAssignmentOpal().setStaffId(argStaffId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getPhaseIdAsObject() {
		return getStaffAssignmentOpal().getPhaseIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.StaffAssignmentImpl setPhaseId(java.lang.Integer argPhaseId) {
		getStaffAssignmentOpal().setPhaseId(argPhaseId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.StaffAssignmentImpl setPhaseId(int argPhaseId) {
		getStaffAssignmentOpal().setPhaseId(argPhaseId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getStaffRoleCode() {
		return getStaffAssignmentOpal().getStaffRoleCode();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public com.scobolsolo.persistence.StaffAssignmentImpl setStaffRoleCode(java.lang.String argStaffRoleCode) {
		getStaffAssignmentOpal().setStaffRoleCode(argStaffRoleCode);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the Staff object created from staff_assignment through reference staff_assignment_staff_id_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.Staff getStaff() {
		StaffOpal lclStaffOpal = getStaffAssignmentOpal().getStaffOpal();
		return lclStaffOpal == null ? null : lclStaffOpal.getUserFacing();
	}

	@Override
	public com.scobolsolo.application.StaffAssignment setStaff(com.scobolsolo.application.Staff argStaff) {
		getStaffAssignmentOpal().setStaffOpal(argStaff == null ? null : ((StaffImpl) argStaff).getStaffOpal());
		return this;
	}

	/** @return the Room object created from staff_assignment through reference staffer_assignment_room_id_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.Room getRoom() {
		RoomOpal lclRoomOpal = getStaffAssignmentOpal().getRoomOpal();
		return lclRoomOpal == null ? null : lclRoomOpal.getUserFacing();
	}

	@Override
	public com.scobolsolo.application.StaffAssignment setRoom(com.scobolsolo.application.Room argRoom) {
		getStaffAssignmentOpal().setRoomOpal(argRoom == null ? null : ((RoomImpl) argRoom).getRoomOpal());
		return this;
	}

	/** @return the Phase object created from staff_assignment through reference staff_assignment_phase_id_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.Phase getPhase() {
		PhaseOpal lclPhaseOpal = getStaffAssignmentOpal().getPhaseOpal();
		return lclPhaseOpal == null ? null : lclPhaseOpal.getUserFacing();
	}

	@Override
	public com.scobolsolo.application.StaffAssignment setPhase(com.scobolsolo.application.Phase argPhase) {
		getStaffAssignmentOpal().setPhaseOpal(argPhase == null ? null : ((PhaseImpl) argPhase).getPhaseOpal());
		return this;
	}

	/** @return the StaffRole object created from staff_assignment through reference staff_assignment_staff_role_code_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.StaffRole getRole() {
		StaffRoleOpal lclStaffRoleOpal = getStaffAssignmentOpal().getRoleOpal();
		return lclStaffRoleOpal == null ? null : lclStaffRoleOpal.getUserFacing();
	}

	@Override
	public com.scobolsolo.application.StaffAssignment setRole(com.scobolsolo.application.StaffRole argStaffRole) {
		getStaffAssignmentOpal().setRoleOpal(argStaffRole == null ? null : ((StaffRoleImpl) argStaffRole).getStaffRoleOpal());
		return this;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public void unlink() {
		getStaffAssignmentOpal().unlink();
	}

	@Override
	public void reload() {
		getStaffAssignmentOpal().reload();
	}

	@Override
	public com.scobolsolo.application.StaffAssignment copy() {
		return getStaffAssignmentOpal().copy().getUserFacing();
	}

}
