package com.scobolsolo.persistence;
import com.scobolsolo.application.Room;
import com.opal.PersistenceException;

public interface RoomOpalFactory extends com.opal.IdentityOpalFactory<Room, RoomOpal>, com.opal.OpalFactoryCreator<Room, RoomOpal> {

	public java.util.HashSet<RoomOpal> forTournamentCodeCollection(java.lang.String argTournamentCode) throws com.opal.PersistenceException;

	default public java.util.HashSet<RoomOpal> forTournamentOpalCollection(TournamentOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		java.lang.String lclCode = argParent.getCode();
		if (lclCode == null) { throw new IllegalStateException("Key value is null."); }
		return forTournamentCodeCollection(lclCode);
	}

	default public int forTournamentOpalCount(TournamentOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		throw new com.siliconage.util.UnimplementedOperationException();
	}

	public RoomOpal forNameTournamentCode(java.lang.String argName, java.lang.String argTournamentCode) throws PersistenceException;
	public RoomOpal forShortNameTournamentCode(java.lang.String argShortName, java.lang.String argTournamentCode) throws PersistenceException;
	public RoomOpal forId(java.lang.Integer argId) throws PersistenceException;
}
