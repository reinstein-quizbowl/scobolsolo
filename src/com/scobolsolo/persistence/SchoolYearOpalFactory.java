package com.scobolsolo.persistence;
import com.scobolsolo.application.SchoolYear;
import com.opal.PersistenceException;

public interface SchoolYearOpalFactory extends com.opal.OpalFactory<SchoolYear, SchoolYearOpal>, com.opal.OpalFactoryCreator<SchoolYear, SchoolYearOpal> {
	public SchoolYearOpal forName(java.lang.String argName) throws PersistenceException;
	public SchoolYearOpal forCode(java.lang.String argCode) throws PersistenceException;
	public SchoolYearOpal forShortName(java.lang.String argShortName) throws PersistenceException;
	public SchoolYearOpal forVeryShortName(java.lang.String argVeryShortName) throws PersistenceException;
}
