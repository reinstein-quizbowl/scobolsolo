package com.scobolsolo.application;

import com.opal.Opal;
import com.scobolsolo.persistence.StaffAssignmentOpal;
import com.scobolsolo.persistence.StaffOpal;
import com.scobolsolo.persistence.RoomOpal;

public class StaffAssignmentImpl extends com.opal.AbstractIdentityImpl<StaffAssignment, StaffAssignmentOpal> implements StaffAssignment {
	private final StaffAssignmentOpal myStaffAssignmentOpal;

	public StaffAssignmentImpl(StaffAssignmentOpal argStaffAssignmentOpal) {
		super();
		myStaffAssignmentOpal = org.apache.commons.lang3.Validate.notNull(argStaffAssignmentOpal);
	}

	protected StaffAssignmentOpal getStaffAssignmentOpal() {
		return myStaffAssignmentOpal;
	}

	@Override
	protected com.opal.IdentityOpal<? extends StaffAssignment> getBottomOpal() {
		return getStaffAssignmentOpal();
	}

	@Override
	protected Opal<? super StaffAssignment>[] getOpalArray() {
		return (Opal<? super StaffAssignment>[]) new Opal<?>[] {
			getStaffAssignmentOpal(),
		};
	}

	@Override
	public java.lang.Integer getIdAsObject() {
		return getStaffAssignmentOpal().getIdAsObject();
	}

	@Override
	public void setId(java.lang.Integer argId) {
		getStaffAssignmentOpal().setId(argId);
		return;
	}

	@Override
	public void setId(int argId) {
		getStaffAssignmentOpal().setId(argId);
		return;
	}

	@Override
	public java.lang.Integer getRoomIdAsObject() {
		return getStaffAssignmentOpal().getRoomIdAsObject();
	}

	@Override
	public void setRoomId(java.lang.Integer argRoomId) {
		getStaffAssignmentOpal().setRoomId(argRoomId);
		return;
	}

	@Override
	public void setRoomId(int argRoomId) {
		getStaffAssignmentOpal().setRoomId(argRoomId);
		return;
	}

	@Override
	public java.lang.String getNote() {
		return getStaffAssignmentOpal().getNote();
	}

	@Override
	public void setNote(java.lang.String argNote) {
		getStaffAssignmentOpal().setNote(argNote);
		return;
	}

	@Override
	public java.lang.Integer getStaffIdAsObject() {
		return getStaffAssignmentOpal().getStaffIdAsObject();
	}

	@Override
	public void setStaffId(java.lang.Integer argStaffId) {
		getStaffAssignmentOpal().setStaffId(argStaffId);
		return;
	}

	@Override
	public void setStaffId(int argStaffId) {
		getStaffAssignmentOpal().setStaffId(argStaffId);
		return;
	}

	/* The following methods allow direct access to the user objects for which
	this object has foreign keys in the database. */

	/** Access to the Staff object created from the table staff_assignment through foreign key staff_assignment_staff_id_fkey */

	@Override
	public Staff getStaff() {
		StaffOpal lclStaffOpal = getStaffAssignmentOpal().getStaffOpal();
		return lclStaffOpal == null ? null : lclStaffOpal.getUserFacing();
	}

	@Override
	public void setStaff(Staff argStaff) {
		getStaffAssignmentOpal().setStaffOpal(argStaff == null ? null : ((StaffImpl) argStaff).getStaffOpal());
		return;
	}

	/** Access to the Room object created from the table staff_assignment through foreign key staffer_assignment_room_id_fkey */

	@Override
	public Room getRoom() {
		RoomOpal lclRoomOpal = getStaffAssignmentOpal().getRoomOpal();
		return lclRoomOpal == null ? null : lclRoomOpal.getUserFacing();
	}

	@Override
	public void setRoom(Room argRoom) {
		getStaffAssignmentOpal().setRoomOpal(argRoom == null ? null : ((RoomImpl) argRoom).getRoomOpal());
		return;
	}

	/* The following methods allow access to the user objects that have foreign keys
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
	public StaffAssignment copy() {
		return getStaffAssignmentOpal().copy().getUserFacing();
	}

}
