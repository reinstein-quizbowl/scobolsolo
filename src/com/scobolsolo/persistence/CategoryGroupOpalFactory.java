package com.scobolsolo.persistence;
import com.scobolsolo.application.CategoryGroup;
import com.opal.PersistenceException;

public interface CategoryGroupOpalFactory extends com.opal.IdentityOpalFactory<CategoryGroup, CategoryGroupOpal>, com.opal.OpalFactoryCreator<CategoryGroup, CategoryGroupOpal> {

	public CategoryGroupOpal forName(java.lang.String argName) throws PersistenceException;
	public CategoryGroupOpal forCode(java.lang.String argCode) throws PersistenceException;
	public CategoryGroupOpal forShortName(java.lang.String argShortName) throws PersistenceException;
}
