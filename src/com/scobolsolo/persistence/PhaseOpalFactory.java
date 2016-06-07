package com.scobolsolo.persistence;
import com.scobolsolo.application.Phase;
import com.opal.PersistenceException;

public interface PhaseOpalFactory extends com.opal.IdentityOpalFactory<Phase, PhaseOpal>, com.opal.OpalFactoryCreator<Phase, PhaseOpal> {

	public com.siliconage.util.Fast3Set<PhaseOpal> forTournamentCodeCollection(java.lang.String argTournamentCode) throws com.opal.PersistenceException;
	public PhaseOpal forId(java.lang.Integer argId) throws PersistenceException;
	public PhaseOpal forTournamentCodeName(java.lang.String argTournamentCode, java.lang.String argName) throws PersistenceException;
	public PhaseOpal forTournamentCodeShortName(java.lang.String argTournamentCode, java.lang.String argShortName) throws PersistenceException;
}
