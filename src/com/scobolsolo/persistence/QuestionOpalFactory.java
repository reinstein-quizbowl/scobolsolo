package com.scobolsolo.persistence;
import com.scobolsolo.application.Question;
import com.opal.PersistenceException;

public interface QuestionOpalFactory extends com.opal.IdentityOpalFactory<Question, QuestionOpal>, com.opal.OpalFactoryCreator<Question, QuestionOpal> {

	public java.util.HashSet<QuestionOpal> forCategoryCodeCollection(java.lang.String argCategoryCode) throws com.opal.PersistenceException;
	public java.util.HashSet<QuestionOpal> forWriterAccountIdCollection(java.lang.Integer argWriterAccountId) throws com.opal.PersistenceException;
	public java.util.HashSet<QuestionOpal> forQuestionStatusCodeCollection(java.lang.String argQuestionStatusCode) throws com.opal.PersistenceException;
	public QuestionOpal forId(java.lang.Integer argId) throws PersistenceException;
}
