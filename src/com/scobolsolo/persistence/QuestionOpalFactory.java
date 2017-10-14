package com.scobolsolo.persistence;
import com.scobolsolo.application.Question;
import com.opal.PersistenceException;

public interface QuestionOpalFactory extends com.opal.IdentityOpalFactory<Question, QuestionOpal>, com.opal.OpalFactoryCreator<Question, QuestionOpal> {

	public java.util.HashSet<QuestionOpal> forWriterAccountIdCollection(java.lang.Integer argWriterAccountId) throws com.opal.PersistenceException;

	default public java.util.HashSet<QuestionOpal> forWriterOpalCollection(AccountOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		java.lang.Integer lclId = argParent.getIdAsObject();
		if (lclId == null) { throw new IllegalStateException("Key value is null."); }
		return forWriterAccountIdCollection(lclId);
	}

	default public int forWriterOpalCount(AccountOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		throw new com.siliconage.util.UnimplementedOperationException();
	}

	public QuestionOpal forId(java.lang.Integer argId) throws PersistenceException;
}
