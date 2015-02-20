package com.scobolsolo.persistence;
import com.scobolsolo.application.Player;
import com.opal.PersistenceException;

public interface PlayerOpalFactory extends com.opal.OpalFactory<Player, PlayerOpal>, com.opal.OpalFactoryCreator<Player, PlayerOpal> {
	public com.siliconage.util.Fast3Set<PlayerOpal> forContactIdCollection(java.lang.Integer argContactId) throws com.opal.PersistenceException;
	public java.util.HashSet<PlayerOpal> forSchoolRegistrationIdCollection(java.lang.Integer argSchoolRegistrationId) throws com.opal.PersistenceException;
	public PlayerOpal forInitialCardId(java.lang.Integer argInitialCardId) throws PersistenceException;
	public PlayerOpal forId(java.lang.Integer argId) throws PersistenceException;
}
