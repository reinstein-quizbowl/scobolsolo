package com.scobolsolo.persistence;
import com.scobolsolo.application.Match;
import com.opal.PersistenceException;

public interface MatchOpalFactory extends com.opal.IdentityOpalFactory<Match, MatchOpal>, com.opal.OpalFactoryCreator<Match, MatchOpal> {

	public java.util.HashSet<MatchOpal> forLosingCardIdCollection(java.lang.Integer argLosingCardId) throws com.opal.PersistenceException;

	default public java.util.HashSet<MatchOpal> forLosingCardOpalCollection(CardOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		java.lang.Integer lclId = argParent.getIdAsObject();
		if (lclId == null) { throw new IllegalStateException("Key value is null."); }
		return forLosingCardIdCollection(lclId);
	}

	default public int forLosingCardOpalCount(CardOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		throw new com.siliconage.util.UnimplementedOperationException();
	}

	public java.util.HashSet<MatchOpal> forRoomIdCollection(java.lang.Integer argRoomId) throws com.opal.PersistenceException;

	default public java.util.HashSet<MatchOpal> forRoomOpalCollection(RoomOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		java.lang.Integer lclId = argParent.getIdAsObject();
		if (lclId == null) { throw new IllegalStateException("Key value is null."); }
		return forRoomIdCollection(lclId);
	}

	default public int forRoomOpalCount(RoomOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		throw new com.siliconage.util.UnimplementedOperationException();
	}

	public java.util.HashSet<MatchOpal> forRoundIdCollection(java.lang.Integer argRoundId) throws com.opal.PersistenceException;

	default public java.util.HashSet<MatchOpal> forRoundOpalCollection(RoundOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		java.lang.Integer lclId = argParent.getIdAsObject();
		if (lclId == null) { throw new IllegalStateException("Key value is null."); }
		return forRoundIdCollection(lclId);
	}

	default public int forRoundOpalCount(RoundOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		throw new com.siliconage.util.UnimplementedOperationException();
	}

	public java.util.HashSet<MatchOpal> forWinningCardIdCollection(java.lang.Integer argWinningCardId) throws com.opal.PersistenceException;

	default public java.util.HashSet<MatchOpal> forWinningCardOpalCollection(CardOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		java.lang.Integer lclId = argParent.getIdAsObject();
		if (lclId == null) { throw new IllegalStateException("Key value is null."); }
		return forWinningCardIdCollection(lclId);
	}

	default public int forWinningCardOpalCount(CardOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		throw new com.siliconage.util.UnimplementedOperationException();
	}

	public MatchOpal forId(java.lang.Integer argId) throws PersistenceException;
	public MatchOpal forRoundIdLosingCardId(java.lang.Integer argRoundId, java.lang.Integer argLosingCardId) throws PersistenceException;
	public MatchOpal forRoundIdWinningCardId(java.lang.Integer argRoundId, java.lang.Integer argWinningCardId) throws PersistenceException;
}
