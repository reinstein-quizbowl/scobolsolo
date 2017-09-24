package com.scobolsolo.persistence;
import com.scobolsolo.application.Performance;
import com.opal.PersistenceException;

public interface PerformanceOpalFactory extends com.opal.IdentityOpalFactory<Performance, PerformanceOpal>, com.opal.OpalFactoryCreator<Performance, PerformanceOpal> {

	public java.util.HashSet<PerformanceOpal> forGameIdCollection(java.lang.Integer argGameId) throws com.opal.PersistenceException;

	default public java.util.HashSet<PerformanceOpal> forGameOpalCollection(GameOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		java.lang.Integer lclId = argParent.getIdAsObject();
		if (lclId == null) { throw new IllegalStateException("Key value is null."); }
		return forGameIdCollection(lclId);
	}

	default public int forGameOpalCount(GameOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		throw new com.siliconage.util.UnimplementedOperationException();
	}

	public java.util.HashSet<PerformanceOpal> forPlayerIdCollection(java.lang.Integer argPlayerId) throws com.opal.PersistenceException;

	default public java.util.HashSet<PerformanceOpal> forPlayerOpalCollection(PlayerOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		java.lang.Integer lclId = argParent.getIdAsObject();
		if (lclId == null) { throw new IllegalStateException("Key value is null."); }
		return forPlayerIdCollection(lclId);
	}

	default public int forPlayerOpalCount(PlayerOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		throw new com.siliconage.util.UnimplementedOperationException();
	}

	public PerformanceOpal forGameIdPlayerId(java.lang.Integer argGameId, java.lang.Integer argPlayerId) throws PersistenceException;
	public PerformanceOpal forId(java.lang.Integer argId) throws PersistenceException;
}
