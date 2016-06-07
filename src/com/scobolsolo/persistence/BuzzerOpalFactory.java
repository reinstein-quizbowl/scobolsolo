package com.scobolsolo.persistence;
import com.scobolsolo.application.Buzzer;
import com.opal.PersistenceException;

public interface BuzzerOpalFactory extends com.opal.IdentityOpalFactory<Buzzer, BuzzerOpal>, com.opal.OpalFactoryCreator<Buzzer, BuzzerOpal> {

	public com.siliconage.util.Fast3Set<BuzzerOpal> forSchoolRegistrationIdCollection(java.lang.Integer argSchoolRegistrationId) throws com.opal.PersistenceException;
	public com.siliconage.util.Fast3Set<BuzzerOpal> forRoomIdCollection(java.lang.Integer argRoomId) throws com.opal.PersistenceException;
	public BuzzerOpal forId(java.lang.Integer argId) throws PersistenceException;
}
