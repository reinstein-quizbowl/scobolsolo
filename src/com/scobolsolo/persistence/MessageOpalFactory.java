package com.scobolsolo.persistence;
import com.scobolsolo.application.Message;
import com.opal.PersistenceException;

public interface MessageOpalFactory extends com.opal.IdentityOpalFactory<Message, MessageOpal>, com.opal.OpalFactoryCreator<Message, MessageOpal> {

	public com.siliconage.util.Fast3Set<MessageOpal> forFromAccountIdCollection(java.lang.Integer argFromAccountId) throws com.opal.PersistenceException;
	public com.siliconage.util.Fast3Set<MessageOpal> forToAccountIdCollection(java.lang.Integer argToAccountId) throws com.opal.PersistenceException;
	public MessageOpal forId(java.lang.Integer argId) throws PersistenceException;
}
