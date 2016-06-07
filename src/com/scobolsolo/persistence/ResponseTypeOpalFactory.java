package com.scobolsolo.persistence;
import com.scobolsolo.application.ResponseType;
import com.opal.PersistenceException;

public interface ResponseTypeOpalFactory extends com.opal.IdentityOpalFactory<ResponseType, ResponseTypeOpal>, com.opal.OpalFactoryCreator<ResponseType, ResponseTypeOpal> {

	public ResponseTypeOpal forName(java.lang.String argName) throws PersistenceException;
	public ResponseTypeOpal forCode(java.lang.String argCode) throws PersistenceException;
	public ResponseTypeOpal forShortName(java.lang.String argShortName) throws PersistenceException;
}
