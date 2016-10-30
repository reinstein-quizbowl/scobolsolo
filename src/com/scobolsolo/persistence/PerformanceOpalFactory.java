package com.scobolsolo.persistence;
import com.scobolsolo.application.Performance;
import com.opal.PersistenceException;

public interface PerformanceOpalFactory extends com.opal.IdentityOpalFactory<Performance, PerformanceOpal>, com.opal.OpalFactoryCreator<Performance, PerformanceOpal> {

	public java.util.HashSet<PerformanceOpal> forGameIdCollection(java.lang.Integer argGameId) throws com.opal.PersistenceException;
	public java.util.HashSet<PerformanceOpal> forPlayerIdCollection(java.lang.Integer argPlayerId) throws com.opal.PersistenceException;
	public PerformanceOpal forGameIdPlayerId(java.lang.Integer argGameId, java.lang.Integer argPlayerId) throws PersistenceException;
	public PerformanceOpal forId(java.lang.Integer argId) throws PersistenceException;
}
