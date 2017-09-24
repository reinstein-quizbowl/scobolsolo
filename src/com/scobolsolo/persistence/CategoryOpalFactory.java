package com.scobolsolo.persistence;
import com.scobolsolo.application.Category;
import com.opal.PersistenceException;

public interface CategoryOpalFactory extends com.opal.IdentityOpalFactory<Category, CategoryOpal>, com.opal.OpalFactoryCreator<Category, CategoryOpal> {

	public java.util.HashSet<CategoryOpal> forCategoryGroupCodeCollection(java.lang.String argCategoryGroupCode) throws com.opal.PersistenceException;

	default public java.util.HashSet<CategoryOpal> forCategoryGroupOpalCollection(CategoryGroupOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		java.lang.String lclCode = argParent.getCode();
		if (lclCode == null) { throw new IllegalStateException("Key value is null."); }
		return forCategoryGroupCodeCollection(lclCode);
	}

	default public int forCategoryGroupOpalCount(CategoryGroupOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		throw new com.siliconage.util.UnimplementedOperationException();
	}

	public CategoryOpal forName(java.lang.String argName) throws PersistenceException;
	public CategoryOpal forCode(java.lang.String argCode) throws PersistenceException;
	public CategoryOpal forShortName(java.lang.String argShortName) throws PersistenceException;
}
