package com.scobolsolo.persistence;
import com.scobolsolo.application.SchoolRegistration;
import com.opal.PersistenceException;

public interface SchoolRegistrationOpalFactory extends com.opal.OpalFactory<SchoolRegistration, SchoolRegistrationOpal>, com.opal.OpalFactoryCreator<SchoolRegistration, SchoolRegistrationOpal> {
	public java.util.HashSet<SchoolRegistrationOpal> forMainContactIdCollection(java.lang.Integer argMainContactId) throws com.opal.PersistenceException;
	public java.util.HashSet<SchoolRegistrationOpal> forSchoolIdCollection(java.lang.Integer argSchoolId) throws com.opal.PersistenceException;
	public java.util.HashSet<SchoolRegistrationOpal> forTournamentCodeCollection(java.lang.String argTournamentCode) throws com.opal.PersistenceException;
	public SchoolRegistrationOpal forId(java.lang.Integer argId) throws PersistenceException;
}
