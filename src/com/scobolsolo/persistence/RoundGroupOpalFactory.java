package com.scobolsolo.persistence;
import com.scobolsolo.application.RoundGroup;
import com.opal.PersistenceException;

public interface RoundGroupOpalFactory extends com.opal.IdentityOpalFactory<RoundGroup, RoundGroupOpal>, com.opal.OpalFactoryCreator<RoundGroup, RoundGroupOpal> {

	public java.util.HashSet<RoundGroupOpal> forPhaseIdCollection(java.lang.Integer argPhaseId) throws com.opal.PersistenceException;

	default public java.util.HashSet<RoundGroupOpal> forPhaseOpalCollection(PhaseOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		java.lang.Integer lclId = argParent.getIdAsObject();
		if (lclId == null) { throw new IllegalStateException("Key value is null."); }
		return forPhaseIdCollection(lclId);
	}

	default public int forPhaseOpalCount(PhaseOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		throw new com.siliconage.util.UnimplementedOperationException();
	}

	public RoundGroupOpal forId(java.lang.Integer argId) throws PersistenceException;
}
