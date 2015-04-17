package com.scobolsolo.persistence;
import com.scobolsolo.application.WaitlistEntry;
import com.opal.PersistenceException;

public interface WaitlistEntryOpalFactory extends com.opal.OpalFactory<WaitlistEntry, WaitlistEntryOpal>, com.opal.OpalFactoryCreator<WaitlistEntry, WaitlistEntryOpal> {
	public java.util.HashSet<WaitlistEntryOpal> forSchoolRegistrationIdCollection(java.lang.Integer argSchoolRegistrationId) throws com.opal.PersistenceException;
	public WaitlistEntryOpal forId(java.lang.Integer argId) throws PersistenceException;
}
