package com.scobolsolo.persistence;
import com.scobolsolo.application.Message;
import com.opal.PersistenceException;

public interface MessageOpalFactory extends com.opal.IdentityOpalFactory<Message, MessageOpal>, com.opal.OpalFactoryCreator<Message, MessageOpal> {

	public java.util.HashSet<MessageOpal> forFromAccountIdCollection(java.lang.Integer argFromAccountId) throws com.opal.PersistenceException;
	public java.util.HashSet<MessageOpal> forToAccountIdCollection(java.lang.Integer argToAccountId) throws com.opal.PersistenceException;
	public MessageOpal forId(java.lang.Integer argId) throws PersistenceException;
}
