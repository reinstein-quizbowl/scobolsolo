package com.scobolsolo.persistence;
import com.scobolsolo.application.Contact;
import com.opal.PersistenceException;

public interface ContactOpalFactory extends com.opal.OpalFactory<Contact, ContactOpal>, com.opal.OpalFactoryCreator<Contact, ContactOpal> {
	public ContactOpal forId(java.lang.Integer argId) throws PersistenceException;
}
