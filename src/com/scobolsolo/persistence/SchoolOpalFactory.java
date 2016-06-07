package com.scobolsolo.persistence;
import com.scobolsolo.application.School;
import com.opal.PersistenceException;

public interface SchoolOpalFactory extends com.opal.IdentityOpalFactory<School, SchoolOpal>, com.opal.OpalFactoryCreator<School, SchoolOpal> {

	public SchoolOpal forName(java.lang.String argName) throws PersistenceException;
	public SchoolOpal forId(java.lang.Integer argId) throws PersistenceException;
	public SchoolOpal forShortName(java.lang.String argShortName) throws PersistenceException;
	public SchoolOpal forVeryShortName(java.lang.String argVeryShortName) throws PersistenceException;
}
