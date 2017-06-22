package com.scobolsolo.persistence;
import com.scobolsolo.application.StaffAssignment;
import com.opal.PersistenceException;

public interface StaffAssignmentOpalFactory extends com.opal.IdentityOpalFactory<StaffAssignment, StaffAssignmentOpal>, com.opal.OpalFactoryCreator<StaffAssignment, StaffAssignmentOpal> {

	public java.util.HashSet<StaffAssignmentOpal> forPhaseIdCollection(java.lang.Integer argPhaseId) throws com.opal.PersistenceException;
	public java.util.HashSet<StaffAssignmentOpal> forStaffIdCollection(java.lang.Integer argStaffId) throws com.opal.PersistenceException;
	public java.util.HashSet<StaffAssignmentOpal> forStaffRoleCodeCollection(java.lang.String argStaffRoleCode) throws com.opal.PersistenceException;
	public java.util.HashSet<StaffAssignmentOpal> forRoomIdCollection(java.lang.Integer argRoomId) throws com.opal.PersistenceException;
	public StaffAssignmentOpal forId(java.lang.Integer argId) throws PersistenceException;
}
