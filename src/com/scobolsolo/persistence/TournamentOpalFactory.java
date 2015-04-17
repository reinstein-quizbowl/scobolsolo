package com.scobolsolo.persistence;
import com.scobolsolo.application.Tournament;
import com.opal.PersistenceException;

public interface TournamentOpalFactory extends com.opal.OpalFactory<Tournament, TournamentOpal>, com.opal.OpalFactoryCreator<Tournament, TournamentOpal> {
	public java.util.HashSet<TournamentOpal> forControlRoomRoomIdCollection(java.lang.Integer argControlRoomRoomId) throws com.opal.PersistenceException;
	public java.util.HashSet<TournamentOpal> forTournamentDirectorContactIdCollection(java.lang.Integer argTournamentDirectorContactId) throws com.opal.PersistenceException;
	public TournamentOpal forCode(java.lang.String argCode) throws PersistenceException;
	public TournamentOpal forName(java.lang.String argName) throws PersistenceException;
	public TournamentOpal forShortName(java.lang.String argShortName) throws PersistenceException;
	public TournamentOpal forWebXmlRoleCode(java.lang.String argWebXmlRoleCode) throws PersistenceException;
}
