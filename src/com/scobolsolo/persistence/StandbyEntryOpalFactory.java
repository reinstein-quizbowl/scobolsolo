package com.scobolsolo.persistence;
import com.scobolsolo.application.StandbyEntry;
import com.opal.PersistenceException;

public interface StandbyEntryOpalFactory extends com.opal.IdentityOpalFactory<StandbyEntry, StandbyEntryOpal>, com.opal.OpalFactoryCreator<StandbyEntry, StandbyEntryOpal> {

	public java.util.HashSet<StandbyEntryOpal> forSchoolRegistrationIdCollection(java.lang.Integer argSchoolRegistrationId) throws com.opal.PersistenceException;

	default public java.util.HashSet<StandbyEntryOpal> forSchoolRegistrationOpalCollection(SchoolRegistrationOpal argParent) throws com.opal.PersistenceException {
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

	public StandbyEntryOpal forId(java.lang.Integer argId) throws PersistenceException;
}
