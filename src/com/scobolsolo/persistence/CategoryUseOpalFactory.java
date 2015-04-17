package com.scobolsolo.persistence;
import com.scobolsolo.application.CategoryUse;
import com.opal.PersistenceException;

public interface CategoryUseOpalFactory extends com.opal.OpalFactory<CategoryUse, CategoryUseOpal>, com.opal.OpalFactoryCreator<CategoryUse, CategoryUseOpal> {
	public java.util.HashSet<CategoryUseOpal> forCategoryCodeCollection(java.lang.String argCategoryCode) throws com.opal.PersistenceException;
	public java.util.HashSet<CategoryUseOpal> forTournamentCodeCollection(java.lang.String argTournamentCode) throws com.opal.PersistenceException;
	public CategoryUseOpal forCategoryCodeTournamentCode(java.lang.String argCategoryCode, java.lang.String argTournamentCode) throws PersistenceException;
}
