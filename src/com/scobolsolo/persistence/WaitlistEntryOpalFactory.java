package com.scobolsolo.persistence;
import com.scobolsolo.application.WaitlistEntry;
import com.opal.PersistenceException;

public interface WaitlistEntryOpalFactory extends com.opal.IdentityOpalFactory<WaitlistEntry, WaitlistEntryOpal>, com.opal.OpalFactoryCreator<WaitlistEntry, WaitlistEntryOpal> {

	public java.util.HashSet<WaitlistEntryOpal> forSchoolRegistrationIdCollection(java.lang.Integer argSchoolRegistrationId) throws com.opal.PersistenceException;

	default public java.util.HashSet<WaitlistEntryOpal> forSchoolRegistrationOpalCollection(SchoolRegistrationOpal argParent) throws com.opal.PersistenceException {
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

	public WaitlistEntryOpal forId(java.lang.Integer argId) throws PersistenceException;
}
