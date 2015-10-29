package com.scobolsolo.persistence;
import com.scobolsolo.application.Card;
import com.opal.PersistenceException;

public interface CardOpalFactory extends com.opal.OpalFactory<Card, CardOpal>, com.opal.OpalFactoryCreator<Card, CardOpal> {
	public java.util.HashSet<CardOpal> forPhaseIdCollection(java.lang.Integer argPhaseId) throws com.opal.PersistenceException;
	public CardOpal forNamePhaseId(java.lang.String argName, java.lang.Integer argPhaseId) throws PersistenceException;
	public CardOpal forShortNamePhaseId(java.lang.String argShortName, java.lang.Integer argPhaseId) throws PersistenceException;
	public CardOpal forId(java.lang.Integer argId) throws PersistenceException;
	public CardOpal forInitialPlayerId(java.lang.Integer argInitialPlayerId) throws PersistenceException;
}
