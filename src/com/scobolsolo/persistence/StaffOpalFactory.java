package com.scobolsolo.persistence;
import com.scobolsolo.application.Staff;
import com.opal.PersistenceException;

public interface StaffOpalFactory extends com.opal.IdentityOpalFactory<Staff, StaffOpal>, com.opal.OpalFactoryCreator<Staff, StaffOpal> {

	public java.util.HashSet<StaffOpal> forContactIdCollection(java.lang.Integer argContactId) throws com.opal.PersistenceException;

	default public java.util.HashSet<StaffOpal> forContactOpalCollection(ContactOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		java.lang.Integer lclId = argParent.getIdAsObject();
		if (lclId == null) { throw new IllegalStateException("Key value is null."); }
		return forContactIdCollection(lclId);
	}

	default public int forContactOpalCount(ContactOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		throw new com.siliconage.util.UnimplementedOperationException();
	}

	public java.util.HashSet<StaffOpal> forSchoolRegistrationIdCollection(java.lang.Integer argSchoolRegistrationId) throws com.opal.PersistenceException;

	default public java.util.HashSet<StaffOpal> forSchoolRegistrationOpalCollection(SchoolRegistrationOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		java.lang.Integer lclId = argParent.getIdAsObject();
		if (lclId == null) { throw new IllegalStateException("Key value is null."); }
		return forSchoolRegistrationIdCollection(lclId);
	}

	default public int forSchoolRegistrationOpalCount(SchoolRegistrationOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		throw new com.siliconage.util.UnimplementedOperationException();
	}

	public java.util.HashSet<StaffOpal> forTournamentCodeCollection(java.lang.String argTournamentCode) throws com.opal.PersistenceException;

	default public java.util.HashSet<StaffOpal> forTournamentOpalCollection(TournamentOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		java.lang.String lclCode = argParent.getCode();
		if (lclCode == null) { throw new IllegalStateException("Key value is null."); }
		return forTournamentCodeCollection(lclCode);
	}

	default public int forTournamentOpalCount(TournamentOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		throw new com.siliconage.util.UnimplementedOperationException();
	}

	public StaffOpal forId(java.lang.Integer argId) throws PersistenceException;
}
