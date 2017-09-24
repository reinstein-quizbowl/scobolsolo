package com.scobolsolo.persistence;
import com.scobolsolo.application.Message;
import com.opal.PersistenceException;

public interface MessageOpalFactory extends com.opal.IdentityOpalFactory<Message, MessageOpal>, com.opal.OpalFactoryCreator<Message, MessageOpal> {

	public java.util.HashSet<MessageOpal> forFromAccountIdCollection(java.lang.Integer argFromAccountId) throws com.opal.PersistenceException;

	default public java.util.HashSet<MessageOpal> forFromAccountOpalCollection(AccountOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		java.lang.Integer lclId = argParent.getIdAsObject();
		if (lclId == null) { throw new IllegalStateException("Key value is null."); }
		return forFromAccountIdCollection(lclId);
	}

	default public int forFromAccountOpalCount(AccountOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		throw new com.siliconage.util.UnimplementedOperationException();
	}

	public java.util.HashSet<MessageOpal> forToAccountIdCollection(java.lang.Integer argToAccountId) throws com.opal.PersistenceException;

	default public java.util.HashSet<MessageOpal> forToAccountOpalCollection(AccountOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		java.lang.Integer lclId = argParent.getIdAsObject();
		if (lclId == null) { throw new IllegalStateException("Key value is null."); }
		return forToAccountIdCollection(lclId);
	}

	default public int forToAccountOpalCount(AccountOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		throw new com.siliconage.util.UnimplementedOperationException();
	}

	public MessageOpal forId(java.lang.Integer argId) throws PersistenceException;
}
