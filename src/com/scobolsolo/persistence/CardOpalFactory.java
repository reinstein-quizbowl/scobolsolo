package com.scobolsolo.persistence;
import com.scobolsolo.application.Card;
import com.opal.PersistenceException;

public interface CardOpalFactory extends com.opal.IdentityOpalFactory<Card, CardOpal>, com.opal.OpalFactoryCreator<Card, CardOpal> {

	public java.util.HashSet<CardOpal> forPhaseIdCollection(java.lang.Integer argPhaseId) throws com.opal.PersistenceException;

	default public java.util.HashSet<CardOpal> forPhaseOpalCollection(PhaseOpal argParent) throws com.opal.PersistenceException {
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

	public CardOpal forNamePhaseId(java.lang.String argName, java.lang.Integer argPhaseId) throws PersistenceException;
	public CardOpal forShortNamePhaseId(java.lang.String argShortName, java.lang.Integer argPhaseId) throws PersistenceException;
	public CardOpal forId(java.lang.Integer argId) throws PersistenceException;
	public CardOpal forInitialPlayerId(java.lang.Integer argInitialPlayerId) throws PersistenceException;
}
