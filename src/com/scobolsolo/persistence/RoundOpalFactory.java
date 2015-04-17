package com.scobolsolo.persistence;
import com.scobolsolo.application.Round;
import com.opal.PersistenceException;

public interface RoundOpalFactory extends com.opal.OpalFactory<Round, RoundOpal>, com.opal.OpalFactoryCreator<Round, RoundOpal> {
	public java.util.HashSet<RoundOpal> forRoundGroupIdCollection(java.lang.Integer argRoundGroupId) throws com.opal.PersistenceException;
	public RoundOpal forId(java.lang.Integer argId) throws PersistenceException;
	public RoundOpal forRoundGroupIdName(java.lang.Integer argRoundGroupId, java.lang.String argName) throws PersistenceException;
	public RoundOpal forRoundGroupIdShortName(java.lang.Integer argRoundGroupId, java.lang.String argShortName) throws PersistenceException;
}
