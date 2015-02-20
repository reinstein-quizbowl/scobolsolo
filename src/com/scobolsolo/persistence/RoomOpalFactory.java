package com.scobolsolo.persistence;
import com.scobolsolo.application.Room;
import com.opal.PersistenceException;

public interface RoomOpalFactory extends com.opal.OpalFactory<Room, RoomOpal>, com.opal.OpalFactoryCreator<Room, RoomOpal> {
	public java.util.HashSet<RoomOpal> forTournamentCodeCollection(java.lang.String argTournamentCode) throws com.opal.PersistenceException;
	public RoomOpal forNameTournamentCode(java.lang.String argName, java.lang.String argTournamentCode) throws PersistenceException;
	public RoomOpal forShortNameTournamentCode(java.lang.String argShortName, java.lang.String argTournamentCode) throws PersistenceException;
	public RoomOpal forId(java.lang.Integer argId) throws PersistenceException;
}
