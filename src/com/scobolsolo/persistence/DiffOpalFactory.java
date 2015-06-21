package com.scobolsolo.persistence;
import com.scobolsolo.application.Diff;
import com.opal.PersistenceException;

public interface DiffOpalFactory extends com.opal.OpalFactory<Diff, DiffOpal>, com.opal.OpalFactoryCreator<Diff, DiffOpal> {
	public java.util.HashSet<DiffOpal> forEditorAccountIdCollection(java.lang.Integer argEditorAccountId) throws com.opal.PersistenceException;
	public java.util.HashSet<DiffOpal> forQuestionIdCollection(java.lang.Integer argQuestionId) throws com.opal.PersistenceException;
	public DiffOpal forId(java.lang.Integer argId) throws PersistenceException;
}
