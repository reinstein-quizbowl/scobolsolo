package com.scobolsolo.persistence;
import com.scobolsolo.application.Game;
import com.opal.PersistenceException;

public interface GameOpalFactory extends com.opal.OpalFactory<Game, GameOpal>, com.opal.OpalFactoryCreator<Game, GameOpal> {
	public java.util.HashSet<GameOpal> forIncomingLosingCardPlayerIdCollection(java.lang.Integer argIncomingLosingCardPlayerId) throws com.opal.PersistenceException;
	public java.util.HashSet<GameOpal> forIncomingWinningCardPlayerIdCollection(java.lang.Integer argIncomingWinningCardPlayerId) throws com.opal.PersistenceException;
	public java.util.HashSet<GameOpal> forModeratorStaffIdCollection(java.lang.Integer argModeratorStaffId) throws com.opal.PersistenceException;
	public java.util.HashSet<GameOpal> forOutgoingLosingCardPlayerIdCollection(java.lang.Integer argOutgoingLosingCardPlayerId) throws com.opal.PersistenceException;
	public java.util.HashSet<GameOpal> forOutgoingWinningCardPlayerIdCollection(java.lang.Integer argOutgoingWinningCardPlayerId) throws com.opal.PersistenceException;
	public GameOpal forId(java.lang.Integer argId) throws PersistenceException;
}
