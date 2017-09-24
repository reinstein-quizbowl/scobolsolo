package com.scobolsolo.persistence;
import com.scobolsolo.application.StaffAssignment;
import com.opal.PersistenceException;

public interface StaffAssignmentOpalFactory extends com.opal.IdentityOpalFactory<StaffAssignment, StaffAssignmentOpal>, com.opal.OpalFactoryCreator<StaffAssignment, StaffAssignmentOpal> {

	public java.util.HashSet<StaffAssignmentOpal> forPhaseIdCollection(java.lang.Integer argPhaseId) throws com.opal.PersistenceException;

	default public java.util.HashSet<StaffAssignmentOpal> forPhaseOpalCollection(PhaseOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		java.lang.Integer lclId = argParent.getIdAsObject();
		if (lclId == null) { throw new IllegalStateException("Key value is null."); }
		return forPhaseIdCollection(lclId);
	}

	default public int forPhaseOpalCount(PhaseOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		throw new com.siliconage.util.UnimplementedOperationException();
	}

	public java.util.HashSet<StaffAssignmentOpal> forStaffIdCollection(java.lang.Integer argStaffId) throws com.opal.PersistenceException;

	default public java.util.HashSet<StaffAssignmentOpal> forStaffOpalCollection(StaffOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		java.lang.Integer lclId = argParent.getIdAsObject();
		if (lclId == null) { throw new IllegalStateException("Key value is null."); }
		return forStaffIdCollection(lclId);
	}

	default public int forStaffOpalCount(StaffOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		throw new com.siliconage.util.UnimplementedOperationException();
	}

	public java.util.HashSet<StaffAssignmentOpal> forStaffRoleCodeCollection(java.lang.String argStaffRoleCode) throws com.opal.PersistenceException;

	default public java.util.HashSet<StaffAssignmentOpal> forRoleOpalCollection(StaffRoleOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		java.lang.String lclCode = argParent.getCode();
		if (lclCode == null) { throw new IllegalStateException("Key value is null."); }
		return forStaffRoleCodeCollection(lclCode);
	}

	default public int forRoleOpalCount(StaffRoleOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		throw new com.siliconage.util.UnimplementedOperationException();
	}

	public java.util.HashSet<StaffAssignmentOpal> forRoomIdCollection(java.lang.Integer argRoomId) throws com.opal.PersistenceException;

	default public java.util.HashSet<StaffAssignmentOpal> forRoomOpalCollection(RoomOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		java.lang.Integer lclId = argParent.getIdAsObject();
		if (lclId == null) { throw new IllegalStateException("Key value is null."); }
		return forRoomIdCollection(lclId);
	}

	default public int forRoomOpalCount(RoomOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		throw new com.siliconage.util.UnimplementedOperationException();
	}

	public StaffAssignmentOpal forId(java.lang.Integer argId) throws PersistenceException;
}
