package com.scobolsolo.persistence;
import com.scobolsolo.application.TechnologyChoice;
import com.opal.PersistenceException;

public interface TechnologyChoiceOpalFactory extends com.opal.IdentityOpalFactory<TechnologyChoice, TechnologyChoiceOpal>, com.opal.OpalFactoryCreator<TechnologyChoice, TechnologyChoiceOpal> {

	public TechnologyChoiceOpal forName(java.lang.String argName) throws PersistenceException;
	public TechnologyChoiceOpal forCode(java.lang.String argCode) throws PersistenceException;
	public TechnologyChoiceOpal forShortName(java.lang.String argShortName) throws PersistenceException;
	public TechnologyChoiceOpal forVeryShortName(java.lang.String argVeryShortName) throws PersistenceException;
}
