package com.scobolsolo.persistence;
import com.scobolsolo.application.StandbyEntry;
import com.opal.PersistenceException;

public interface StandbyEntryOpalFactory extends com.opal.IdentityOpalFactory<StandbyEntry, StandbyEntryOpal>, com.opal.OpalFactoryCreator<StandbyEntry, StandbyEntryOpal> {

	public java.util.HashSet<StandbyEntryOpal> forSchoolRegistrationIdCollection(java.lang.Integer argSchoolRegistrationId) throws com.opal.PersistenceException;
	public StandbyEntryOpal forId(java.lang.Integer argId) throws PersistenceException;
}
