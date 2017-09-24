package com.scobolsolo.persistence;
import com.scobolsolo.application.Diff;
import com.opal.PersistenceException;

public interface DiffOpalFactory extends com.opal.IdentityOpalFactory<Diff, DiffOpal>, com.opal.OpalFactoryCreator<Diff, DiffOpal> {

	public java.util.HashSet<DiffOpal> forCategoryCodeCollection(java.lang.String argCategoryCode) throws com.opal.PersistenceException;

	default public java.util.HashSet<DiffOpal> forCategoryOpalCollection(CategoryOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		java.lang.String lclCode = argParent.getCode();
		if (lclCode == null) { throw new IllegalStateException("Key value is null."); }
		return forCategoryCodeCollection(lclCode);
	}

	default public int forCategoryOpalCount(CategoryOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		throw new com.siliconage.util.UnimplementedOperationException();
	}

	public java.util.HashSet<DiffOpal> forEditorAccountIdCollection(java.lang.Integer argEditorAccountId) throws com.opal.PersistenceException;

	default public java.util.HashSet<DiffOpal> forEditorOpalCollection(AccountOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		java.lang.Integer lclId = argParent.getIdAsObject();
		if (lclId == null) { throw new IllegalStateException("Key value is null."); }
		return forEditorAccountIdCollection(lclId);
	}

	default public int forEditorOpalCount(AccountOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		throw new com.siliconage.util.UnimplementedOperationException();
	}

	public java.util.HashSet<DiffOpal> forQuestionIdCollection(java.lang.Integer argQuestionId) throws com.opal.PersistenceException;

	default public java.util.HashSet<DiffOpal> forQuestionOpalCollection(QuestionOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		java.lang.Integer lclId = argParent.getIdAsObject();
		if (lclId == null) { throw new IllegalStateException("Key value is null."); }
		return forQuestionIdCollection(lclId);
	}

	default public int forQuestionOpalCount(QuestionOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		throw new com.siliconage.util.UnimplementedOperationException();
	}

	public java.util.HashSet<DiffOpal> forQuestionStatusCodeCollection(java.lang.String argQuestionStatusCode) throws com.opal.PersistenceException;

	default public java.util.HashSet<DiffOpal> forStatusOpalCollection(QuestionStatusOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		java.lang.String lclCode = argParent.getCode();
		if (lclCode == null) { throw new IllegalStateException("Key value is null."); }
		return forQuestionStatusCodeCollection(lclCode);
	}

	default public int forStatusOpalCount(QuestionStatusOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		throw new com.siliconage.util.UnimplementedOperationException();
	}

	public DiffOpal forId(java.lang.Integer argId) throws PersistenceException;
}
