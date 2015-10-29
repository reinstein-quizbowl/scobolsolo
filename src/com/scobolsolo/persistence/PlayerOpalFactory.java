package com.scobolsolo.persistence;
import com.scobolsolo.application.Player;
import com.opal.PersistenceException;

public interface PlayerOpalFactory extends com.opal.OpalFactory<Player, PlayerOpal>, com.opal.OpalFactoryCreator<Player, PlayerOpal> {
	public java.util.HashSet<PlayerOpal> forContactIdCollection(java.lang.Integer argContactId) throws com.opal.PersistenceException;
	public java.util.HashSet<PlayerOpal> forSchoolRegistrationIdCollection(java.lang.Integer argSchoolRegistrationId) throws com.opal.PersistenceException;
	public PlayerOpal forId(java.lang.Integer argId) throws PersistenceException;
}
