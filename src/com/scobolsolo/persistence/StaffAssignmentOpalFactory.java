package com.scobolsolo.persistence;
import com.scobolsolo.application.StaffAssignment;
import com.opal.PersistenceException;

public interface StaffAssignmentOpalFactory extends com.opal.OpalFactory<StaffAssignment, StaffAssignmentOpal>, com.opal.OpalFactoryCreator<StaffAssignment, StaffAssignmentOpal> {
	public com.siliconage.util.Fast3Set<StaffAssignmentOpal> forStaffIdCollection(java.lang.Integer argStaffId) throws com.opal.PersistenceException;
	public com.siliconage.util.Fast3Set<StaffAssignmentOpal> forRoomIdCollection(java.lang.Integer argRoomId) throws com.opal.PersistenceException;
	public StaffAssignmentOpal forId(java.lang.Integer argId) throws PersistenceException;
}
