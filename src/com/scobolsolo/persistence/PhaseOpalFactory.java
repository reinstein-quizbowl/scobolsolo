package com.scobolsolo.persistence;
import com.scobolsolo.application.Phase;
import com.opal.PersistenceException;

public interface PhaseOpalFactory extends com.opal.IdentityOpalFactory<Phase, PhaseOpal>, com.opal.OpalFactoryCreator<Phase, PhaseOpal> {

	public java.util.HashSet<PhaseOpal> forTournamentCodeCollection(java.lang.String argTournamentCode) throws com.opal.PersistenceException;

	default public java.util.HashSet<PhaseOpal> forTournamentOpalCollection(TournamentOpal argParent) throws com.opal.PersistenceException {
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

	public PhaseOpal forId(java.lang.Integer argId) throws PersistenceException;
	public PhaseOpal forTournamentCodeName(java.lang.String argTournamentCode, java.lang.String argName) throws PersistenceException;
	public PhaseOpal forTournamentCodeShortName(java.lang.String argTournamentCode, java.lang.String argShortName) throws PersistenceException;
}
