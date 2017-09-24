package com.scobolsolo.persistence;
import com.scobolsolo.application.Game;
import com.opal.PersistenceException;

public interface GameOpalFactory extends com.opal.IdentityOpalFactory<Game, GameOpal>, com.opal.OpalFactoryCreator<Game, GameOpal> {

	public java.util.HashSet<GameOpal> forIncomingLosingCardPlayerIdCollection(java.lang.Integer argIncomingLosingCardPlayerId) throws com.opal.PersistenceException;

	default public java.util.HashSet<GameOpal> forIncomingLosingCardPlayerOpalCollection(PlayerOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		java.lang.Integer lclId = argParent.getIdAsObject();
		if (lclId == null) { throw new IllegalStateException("Key value is null."); }
		return forIncomingLosingCardPlayerIdCollection(lclId);
	}

	default public int forIncomingLosingCardPlayerOpalCount(PlayerOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		throw new com.siliconage.util.UnimplementedOperationException();
	}

	public java.util.HashSet<GameOpal> forIncomingWinningCardPlayerIdCollection(java.lang.Integer argIncomingWinningCardPlayerId) throws com.opal.PersistenceException;

	default public java.util.HashSet<GameOpal> forIncomingWinningCardPlayerOpalCollection(PlayerOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		java.lang.Integer lclId = argParent.getIdAsObject();
		if (lclId == null) { throw new IllegalStateException("Key value is null."); }
		return forIncomingWinningCardPlayerIdCollection(lclId);
	}

	default public int forIncomingWinningCardPlayerOpalCount(PlayerOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		throw new com.siliconage.util.UnimplementedOperationException();
	}

	public java.util.HashSet<GameOpal> forModeratorStaffIdCollection(java.lang.Integer argModeratorStaffId) throws com.opal.PersistenceException;

	default public java.util.HashSet<GameOpal> forModeratorStaffOpalCollection(StaffOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		java.lang.Integer lclId = argParent.getIdAsObject();
		if (lclId == null) { throw new IllegalStateException("Key value is null."); }
		return forModeratorStaffIdCollection(lclId);
	}

	default public int forModeratorStaffOpalCount(StaffOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		throw new com.siliconage.util.UnimplementedOperationException();
	}

	public java.util.HashSet<GameOpal> forOutgoingLosingCardPlayerIdCollection(java.lang.Integer argOutgoingLosingCardPlayerId) throws com.opal.PersistenceException;

	default public java.util.HashSet<GameOpal> forOutgoingLosingCardPlayerOpalCollection(PlayerOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		java.lang.Integer lclId = argParent.getIdAsObject();
		if (lclId == null) { throw new IllegalStateException("Key value is null."); }
		return forOutgoingLosingCardPlayerIdCollection(lclId);
	}

	default public int forOutgoingLosingCardPlayerOpalCount(PlayerOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		throw new com.siliconage.util.UnimplementedOperationException();
	}

	public java.util.HashSet<GameOpal> forOutgoingWinningCardPlayerIdCollection(java.lang.Integer argOutgoingWinningCardPlayerId) throws com.opal.PersistenceException;

	default public java.util.HashSet<GameOpal> forOutgoingWinningCardPlayerOpalCollection(PlayerOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		java.lang.Integer lclId = argParent.getIdAsObject();
		if (lclId == null) { throw new IllegalStateException("Key value is null."); }
		return forOutgoingWinningCardPlayerIdCollection(lclId);
	}

	default public int forOutgoingWinningCardPlayerOpalCount(PlayerOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		throw new com.siliconage.util.UnimplementedOperationException();
	}

	public java.util.HashSet<GameOpal> forScorekeeperStaffIdCollection(java.lang.Integer argScorekeeperStaffId) throws com.opal.PersistenceException;

	default public java.util.HashSet<GameOpal> forScorekeeperStaffOpalCollection(StaffOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		java.lang.Integer lclId = argParent.getIdAsObject();
		if (lclId == null) { throw new IllegalStateException("Key value is null."); }
		return forScorekeeperStaffIdCollection(lclId);
	}

	default public int forScorekeeperStaffOpalCount(StaffOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		throw new com.siliconage.util.UnimplementedOperationException();
	}

	public GameOpal forId(java.lang.Integer argId) throws PersistenceException;
}
