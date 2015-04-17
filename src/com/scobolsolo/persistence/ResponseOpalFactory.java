package com.scobolsolo.persistence;
import com.scobolsolo.application.Response;
import com.opal.PersistenceException;

public interface ResponseOpalFactory extends com.opal.OpalFactory<Response, ResponseOpal>, com.opal.OpalFactoryCreator<Response, ResponseOpal> {
	public java.util.HashSet<ResponseOpal> forPerformanceIdCollection(java.lang.Integer argPerformanceId) throws com.opal.PersistenceException;
	public java.util.HashSet<ResponseOpal> forPlacementIdCollection(java.lang.Integer argPlacementId) throws com.opal.PersistenceException;
	public java.util.HashSet<ResponseOpal> forReplacementForPlacementIdCollection(java.lang.Integer argReplacementForPlacementId) throws com.opal.PersistenceException;
	public ResponseOpal forPerformanceIdPlacementId(java.lang.Integer argPerformanceId, java.lang.Integer argPlacementId) throws PersistenceException;
	public ResponseOpal forId(java.lang.Integer argId) throws PersistenceException;
}
