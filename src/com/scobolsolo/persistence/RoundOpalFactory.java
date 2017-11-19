package com.scobolsolo.persistence;
import com.scobolsolo.application.Round;
import com.opal.PersistenceException;

public interface RoundOpalFactory extends com.opal.IdentityOpalFactory<Round, RoundOpal>, com.opal.OpalFactoryCreator<Round, RoundOpal> {

	public java.util.HashSet<RoundOpal> forPhaseIdCollection(java.lang.Integer argPhaseId) throws com.opal.PersistenceException;

	default public java.util.HashSet<RoundOpal> forPhaseOpalCollection(PhaseOpal argParent) throws com.opal.PersistenceException {
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

	public RoundOpal forId(java.lang.Integer argId) throws PersistenceException;
}
