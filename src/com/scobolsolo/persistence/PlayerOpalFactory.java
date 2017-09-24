package com.scobolsolo.persistence;
import com.scobolsolo.application.Player;
import com.opal.PersistenceException;

public interface PlayerOpalFactory extends com.opal.IdentityOpalFactory<Player, PlayerOpal>, com.opal.OpalFactoryCreator<Player, PlayerOpal> {

	public java.util.HashSet<PlayerOpal> forContactIdCollection(java.lang.Integer argContactId) throws com.opal.PersistenceException;

	default public java.util.HashSet<PlayerOpal> forContactOpalCollection(ContactOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		java.lang.Integer lclId = argParent.getIdAsObject();
		if (lclId == null) { throw new IllegalStateException("Key value is null."); }
		return forContactIdCollection(lclId);
	}

	default public int forContactOpalCount(ContactOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		throw new com.siliconage.util.UnimplementedOperationException();
	}

	public java.util.HashSet<PlayerOpal> forSchoolRegistrationIdCollection(java.lang.Integer argSchoolRegistrationId) throws com.opal.PersistenceException;

	default public java.util.HashSet<PlayerOpal> forSchoolRegistrationOpalCollection(SchoolRegistrationOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		java.lang.Integer lclId = argParent.getIdAsObject();
		if (lclId == null) { throw new IllegalStateException("Key value is null."); }
		return forSchoolRegistrationIdCollection(lclId);
	}

	default public int forSchoolRegistrationOpalCount(SchoolRegistrationOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		throw new com.siliconage.util.UnimplementedOperationException();
	}

	public PlayerOpal forId(java.lang.Integer argId) throws PersistenceException;
}
