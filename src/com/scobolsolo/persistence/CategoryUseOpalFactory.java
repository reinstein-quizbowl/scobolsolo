package com.scobolsolo.persistence;
import com.scobolsolo.application.CategoryUse;
import com.opal.PersistenceException;

public interface CategoryUseOpalFactory extends com.opal.IdentityOpalFactory<CategoryUse, CategoryUseOpal>, com.opal.OpalFactoryCreator<CategoryUse, CategoryUseOpal> {

	public java.util.HashSet<CategoryUseOpal> forCategoryCodeCollection(java.lang.String argCategoryCode) throws com.opal.PersistenceException;

	default public java.util.HashSet<CategoryUseOpal> forCategoryOpalCollection(CategoryOpal argParent) throws com.opal.PersistenceException {
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

	public java.util.HashSet<CategoryUseOpal> forTournamentCodeCollection(java.lang.String argTournamentCode) throws com.opal.PersistenceException;

	default public java.util.HashSet<CategoryUseOpal> forTournamentOpalCollection(TournamentOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		java.lang.String lclCode = argParent.getCode();
		if (lclCode == null) { throw new IllegalStateException("Key value is null."); }
		return forTournamentCodeCollection(lclCode);
	}

	default public int forTournamentOpalCount(TournamentOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		throw new com.siliconage.util.UnimplementedOperationException();
	}

	public CategoryUseOpal forCategoryCodeTournamentCode(java.lang.String argCategoryCode, java.lang.String argTournamentCode) throws PersistenceException;
}
