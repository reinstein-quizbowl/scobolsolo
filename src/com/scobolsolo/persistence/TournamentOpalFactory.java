package com.scobolsolo.persistence;
import com.scobolsolo.application.Tournament;
import com.opal.PersistenceException;

public interface TournamentOpalFactory extends com.opal.IdentityOpalFactory<Tournament, TournamentOpal>, com.opal.OpalFactoryCreator<Tournament, TournamentOpal> {

	public java.util.HashSet<TournamentOpal> forControlRoomRoomIdCollection(java.lang.Integer argControlRoomRoomId) throws com.opal.PersistenceException;

	default public java.util.HashSet<TournamentOpal> forControlRoomOpalCollection(RoomOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		java.lang.Integer lclId = argParent.getIdAsObject();
		if (lclId == null) { throw new IllegalStateException("Key value is null."); }
		return forControlRoomRoomIdCollection(lclId);
	}

	default public int forControlRoomOpalCount(RoomOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		throw new com.siliconage.util.UnimplementedOperationException();
	}

	public java.util.HashSet<TournamentOpal> forTournamentDirectorContactIdCollection(java.lang.Integer argTournamentDirectorContactId) throws com.opal.PersistenceException;

	default public java.util.HashSet<TournamentOpal> forTournamentDirectorContactOpalCollection(ContactOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		java.lang.Integer lclId = argParent.getIdAsObject();
		if (lclId == null) { throw new IllegalStateException("Key value is null."); }
		return forTournamentDirectorContactIdCollection(lclId);
	}

	default public int forTournamentDirectorContactOpalCount(ContactOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		throw new com.siliconage.util.UnimplementedOperationException();
	}

	public java.util.HashSet<TournamentOpal> forSiteSchoolIdCollection(java.lang.Integer argSiteSchoolId) throws com.opal.PersistenceException;

	default public java.util.HashSet<TournamentOpal> forSiteSchoolOpalCollection(SchoolOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		java.lang.Integer lclId = argParent.getIdAsObject();
		if (lclId == null) { throw new IllegalStateException("Key value is null."); }
		return forSiteSchoolIdCollection(lclId);
	}

	default public int forSiteSchoolOpalCount(SchoolOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		throw new com.siliconage.util.UnimplementedOperationException();
	}

	public TournamentOpal forCode(java.lang.String argCode) throws PersistenceException;
	public TournamentOpal forName(java.lang.String argName) throws PersistenceException;
	public TournamentOpal forShortName(java.lang.String argShortName) throws PersistenceException;
	public TournamentOpal forWebXmlRoleCode(java.lang.String argWebXmlRoleCode) throws PersistenceException;
}
