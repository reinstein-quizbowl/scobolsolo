package com.scobolsolo.persistence;
import com.scobolsolo.application.SchoolRegistration;
import com.opal.PersistenceException;

public interface SchoolRegistrationOpalFactory extends com.opal.IdentityOpalFactory<SchoolRegistration, SchoolRegistrationOpal>, com.opal.OpalFactoryCreator<SchoolRegistration, SchoolRegistrationOpal> {

	public java.util.HashSet<SchoolRegistrationOpal> forMainContactIdCollection(java.lang.Integer argMainContactId) throws com.opal.PersistenceException;

	default public java.util.HashSet<SchoolRegistrationOpal> forMainContactOpalCollection(ContactOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		java.lang.Integer lclId = argParent.getIdAsObject();
		if (lclId == null) { throw new IllegalStateException("Key value is null."); }
		return forMainContactIdCollection(lclId);
	}

	default public int forMainContactOpalCount(ContactOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		throw new com.siliconage.util.UnimplementedOperationException();
	}

	public java.util.HashSet<SchoolRegistrationOpal> forSchoolIdCollection(java.lang.Integer argSchoolId) throws com.opal.PersistenceException;

	default public java.util.HashSet<SchoolRegistrationOpal> forSchoolOpalCollection(SchoolOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		java.lang.Integer lclId = argParent.getIdAsObject();
		if (lclId == null) { throw new IllegalStateException("Key value is null."); }
		return forSchoolIdCollection(lclId);
	}

	default public int forSchoolOpalCount(SchoolOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		throw new com.siliconage.util.UnimplementedOperationException();
	}

	public java.util.HashSet<SchoolRegistrationOpal> forTournamentCodeCollection(java.lang.String argTournamentCode) throws com.opal.PersistenceException;

	default public java.util.HashSet<SchoolRegistrationOpal> forTournamentOpalCollection(TournamentOpal argParent) throws com.opal.PersistenceException {
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

	public SchoolRegistrationOpal forId(java.lang.Integer argId) throws PersistenceException;
}
