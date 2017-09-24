package com.scobolsolo.persistence;
import com.scobolsolo.application.Buzzer;
import com.opal.PersistenceException;

public interface BuzzerOpalFactory extends com.opal.IdentityOpalFactory<Buzzer, BuzzerOpal>, com.opal.OpalFactoryCreator<Buzzer, BuzzerOpal> {

	public java.util.HashSet<BuzzerOpal> forSchoolRegistrationIdCollection(java.lang.Integer argSchoolRegistrationId) throws com.opal.PersistenceException;

	default public java.util.HashSet<BuzzerOpal> forSchoolRegistrationOpalCollection(SchoolRegistrationOpal argParent) throws com.opal.PersistenceException {
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

	public java.util.HashSet<BuzzerOpal> forRoomIdCollection(java.lang.Integer argRoomId) throws com.opal.PersistenceException;

	default public java.util.HashSet<BuzzerOpal> forRoomOpalCollection(RoomOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		java.lang.Integer lclId = argParent.getIdAsObject();
		if (lclId == null) { throw new IllegalStateException("Key value is null."); }
		return forRoomIdCollection(lclId);
	}

	default public int forRoomOpalCount(RoomOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		throw new com.siliconage.util.UnimplementedOperationException();
	}

	public BuzzerOpal forId(java.lang.Integer argId) throws PersistenceException;
}
