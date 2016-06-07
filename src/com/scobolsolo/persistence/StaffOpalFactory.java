package com.scobolsolo.persistence;
import com.scobolsolo.application.Staff;
import com.opal.PersistenceException;

public interface StaffOpalFactory extends com.opal.IdentityOpalFactory<Staff, StaffOpal>, com.opal.OpalFactoryCreator<Staff, StaffOpal> {

	public com.siliconage.util.Fast3Set<StaffOpal> forContactIdCollection(java.lang.Integer argContactId) throws com.opal.PersistenceException;
	public com.siliconage.util.Fast3Set<StaffOpal> forSchoolRegistrationIdCollection(java.lang.Integer argSchoolRegistrationId) throws com.opal.PersistenceException;
	public java.util.HashSet<StaffOpal> forTournamentCodeCollection(java.lang.String argTournamentCode) throws com.opal.PersistenceException;
	public StaffOpal forId(java.lang.Integer argId) throws PersistenceException;
}
