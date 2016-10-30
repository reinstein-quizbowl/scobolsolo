package com.scobolsolo.persistence;
import com.scobolsolo.application.Response;
import com.opal.PersistenceException;

public interface ResponseOpalFactory extends com.opal.IdentityOpalFactory<Response, ResponseOpal>, com.opal.OpalFactoryCreator<Response, ResponseOpal> {

	public java.util.HashSet<ResponseOpal> forPerformanceIdCollection(java.lang.Integer argPerformanceId) throws com.opal.PersistenceException;
	public java.util.HashSet<ResponseOpal> forBasePlacementIdCollection(java.lang.Integer argBasePlacementId) throws com.opal.PersistenceException;
	public java.util.HashSet<ResponseOpal> forReplacementPlacementIdCollection(java.lang.Integer argReplacementPlacementId) throws com.opal.PersistenceException;
	public java.util.HashSet<ResponseOpal> forDiffIdCollection(java.lang.Integer argDiffId) throws com.opal.PersistenceException;
	public ResponseOpal forId(java.lang.Integer argId) throws PersistenceException;
}
