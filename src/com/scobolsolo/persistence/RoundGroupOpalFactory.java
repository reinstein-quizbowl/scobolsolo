package com.scobolsolo.persistence;
import com.scobolsolo.application.RoundGroup;
import com.opal.PersistenceException;

public interface RoundGroupOpalFactory extends com.opal.OpalFactory<RoundGroup, RoundGroupOpal>, com.opal.OpalFactoryCreator<RoundGroup, RoundGroupOpal> {
	public java.util.HashSet<RoundGroupOpal> forPhaseIdCollection(java.lang.Integer argPhaseId) throws com.opal.PersistenceException;
	public RoundGroupOpal forId(java.lang.Integer argId) throws PersistenceException;
}
