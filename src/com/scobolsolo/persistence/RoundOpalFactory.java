package com.scobolsolo.persistence;
import com.scobolsolo.application.Round;
import com.opal.PersistenceException;

public interface RoundOpalFactory extends com.opal.IdentityOpalFactory<Round, RoundOpal>, com.opal.OpalFactoryCreator<Round, RoundOpal> {

	public java.util.HashSet<RoundOpal> forRoundGroupIdCollection(java.lang.Integer argRoundGroupId) throws com.opal.PersistenceException;

	default public java.util.HashSet<RoundOpal> forRoundGroupOpalCollection(RoundGroupOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		java.lang.Integer lclId = argParent.getIdAsObject();
		if (lclId == null) { throw new IllegalStateException("Key value is null."); }
		return forRoundGroupIdCollection(lclId);
	}

	default public int forRoundGroupOpalCount(RoundGroupOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		throw new com.siliconage.util.UnimplementedOperationException();
	}

	public RoundOpal forId(java.lang.Integer argId) throws PersistenceException;
	public RoundOpal forRoundGroupIdName(java.lang.Integer argRoundGroupId, java.lang.String argName) throws PersistenceException;
	public RoundOpal forRoundGroupIdShortName(java.lang.Integer argRoundGroupId, java.lang.String argShortName) throws PersistenceException;
}
