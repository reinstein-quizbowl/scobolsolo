package com.scobolsolo.persistence;
import com.scobolsolo.application.Response;
import com.opal.PersistenceException;

public interface ResponseOpalFactory extends com.opal.IdentityOpalFactory<Response, ResponseOpal>, com.opal.OpalFactoryCreator<Response, ResponseOpal> {

	public java.util.HashSet<ResponseOpal> forBasePlacementIdCollection(java.lang.Integer argBasePlacementId) throws com.opal.PersistenceException;

	default public java.util.HashSet<ResponseOpal> forBasePlacementOpalCollection(PlacementOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		java.lang.Integer lclId = argParent.getIdAsObject();
		if (lclId == null) { throw new IllegalStateException("Key value is null."); }
		return forBasePlacementIdCollection(lclId);
	}

	default public int forBasePlacementOpalCount(PlacementOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		throw new com.siliconage.util.UnimplementedOperationException();
	}

	public java.util.HashSet<ResponseOpal> forDiffIdCollection(java.lang.Integer argDiffId) throws com.opal.PersistenceException;

	default public java.util.HashSet<ResponseOpal> forDiffOpalCollection(DiffOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		java.lang.Integer lclId = argParent.getIdAsObject();
		if (lclId == null) { throw new IllegalStateException("Key value is null."); }
		return forDiffIdCollection(lclId);
	}

	default public int forDiffOpalCount(DiffOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		throw new com.siliconage.util.UnimplementedOperationException();
	}

	public java.util.HashSet<ResponseOpal> forPerformanceIdCollection(java.lang.Integer argPerformanceId) throws com.opal.PersistenceException;

	default public java.util.HashSet<ResponseOpal> forPerformanceOpalCollection(PerformanceOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		java.lang.Integer lclId = argParent.getIdAsObject();
		if (lclId == null) { throw new IllegalStateException("Key value is null."); }
		return forPerformanceIdCollection(lclId);
	}

	default public int forPerformanceOpalCount(PerformanceOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		throw new com.siliconage.util.UnimplementedOperationException();
	}

	public java.util.HashSet<ResponseOpal> forReplacementPlacementIdCollection(java.lang.Integer argReplacementPlacementId) throws com.opal.PersistenceException;

	default public java.util.HashSet<ResponseOpal> forReplacementPlacementOpalCollection(PlacementOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		java.lang.Integer lclId = argParent.getIdAsObject();
		if (lclId == null) { throw new IllegalStateException("Key value is null."); }
		return forReplacementPlacementIdCollection(lclId);
	}

	default public int forReplacementPlacementOpalCount(PlacementOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		throw new com.siliconage.util.UnimplementedOperationException();
	}

	public ResponseOpal forId(java.lang.Integer argId) throws PersistenceException;
}
