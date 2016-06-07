package com.scobolsolo.persistence;
import com.scobolsolo.application.Match;
import com.opal.PersistenceException;

public interface MatchOpalFactory extends com.opal.IdentityOpalFactory<Match, MatchOpal>, com.opal.OpalFactoryCreator<Match, MatchOpal> {

	public java.util.HashSet<MatchOpal> forLosingCardIdCollection(java.lang.Integer argLosingCardId) throws com.opal.PersistenceException;
	public java.util.HashSet<MatchOpal> forRoomIdCollection(java.lang.Integer argRoomId) throws com.opal.PersistenceException;
	public java.util.HashSet<MatchOpal> forRoundIdCollection(java.lang.Integer argRoundId) throws com.opal.PersistenceException;
	public java.util.HashSet<MatchOpal> forWinningCardIdCollection(java.lang.Integer argWinningCardId) throws com.opal.PersistenceException;
	public MatchOpal forId(java.lang.Integer argId) throws PersistenceException;
	public MatchOpal forRoundIdLosingCardId(java.lang.Integer argRoundId, java.lang.Integer argLosingCardId) throws PersistenceException;
	public MatchOpal forRoundIdWinningCardId(java.lang.Integer argRoundId, java.lang.Integer argWinningCardId) throws PersistenceException;
}
