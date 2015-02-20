package com.scobolsolo.persistence;

import java.io.PrintWriter;
import java.io.PrintStream;

import com.opal.*;

import com.scobolsolo.application.*;

public final class AccountOpal extends com.opal.UpdatableOpal<Account> {
	public static final java.lang.String ourDefaultPasswordHash = "$2a$16$XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
	public static final java.lang.Boolean ourDefaultAdministrator = java.lang.Boolean.FALSE;
	public static final java.lang.Boolean ourDefaultActive = java.lang.Boolean.TRUE;

	private AccountOpal() {
		super();
		setUserFacing(null);
	}

	public AccountOpal(OpalFactory<Account, AccountOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void applyDefaults() {
		getNewValues()[2] = ourDefaultPasswordHash;
		getNewValues()[3] = ourDefaultAdministrator;
		getNewValues()[4] = ourDefaultActive;
		return;
	}

	@Override
	protected void initializeReferences() {
		myOldContactOpal = ContactOpal.NOT_YET_LOADED;
		return;
	}

	/* package */ static final String[] ourFieldNames = new String[] {
		"Id",
		"Username",
		"PasswordHash",
		"Administrator",
		"Active",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.Integer.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.Boolean.class,
		java.lang.Boolean.class,
	};

	/* package */ static final boolean[] ourFieldNullability = new boolean[] {
		false,
		false,
		false,
		false,
		false,
	};

	/* package */ static final FieldValidator[] ourFieldValidators = new FieldValidator[] {
		null,
		null,
		null,
		null,
		null,
	};

	public static final AccountOpal NOT_YET_LOADED = new AccountOpal();

	public static String[] getStaticFieldNames() { return ourFieldNames; }

	public static Class<?>[] getStaticFieldTypes() { return ourFieldTypes; }

	@Override
	public Class<?>[] getFieldTypes() { return ourFieldTypes; }

	public static boolean[] getStaticFieldNullability() { return ourFieldNullability; }

	@Override
	public FieldValidator[] getFieldValidators() { return ourFieldValidators; }

	@Override
	public boolean[] getFieldNullability() { return ourFieldNullability; }

	public static FieldValidator[] getStaticFieldValidators() { return ourFieldValidators; }


	public synchronized java.lang.Integer getIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[0];
	}

	public synchronized java.lang.String getUsername() {
		return (java.lang.String) getReadValueSet()[1];
	}

	public synchronized java.lang.String getPasswordHash() {
		return (java.lang.String) getReadValueSet()[2];
	}

	public synchronized java.lang.Boolean isAdministratorAsObject() {
		return (java.lang.Boolean) getReadValueSet()[3];
	}

	public synchronized java.lang.Boolean isActiveAsObject() {
		return (java.lang.Boolean) getReadValueSet()[4];
	}

	public synchronized void setId(final java.lang.Integer argId) {
		tryMutate();
		if (argId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myId on " + this + " to null.");
		}
		getNewValues()[0] = argId;
		return;
	}

	public void setId(final int argId) {
		setId(java.lang.Integer.valueOf(argId));
		return;
	}

	public synchronized void setUsername(final java.lang.String argUsername) {
		tryMutate();
		if (argUsername == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myUsername on " + this + " to null.");
		}
		if (argUsername.length() > 64) {
			throw new com.opal.ArgumentTooLongException("Maximum length of myUsername on " + this + " is 64.", argUsername.length(), 64);
		}
		getNewValues()[1] = argUsername;
		return;
	}

	public synchronized void setPasswordHash(final java.lang.String argPasswordHash) {
		tryMutate();
		if (argPasswordHash == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myPasswordHash on " + this + " to null.");
		}
		if (argPasswordHash.length() > 60) {
			throw new com.opal.ArgumentTooLongException("Maximum length of myPasswordHash on " + this + " is 60.", argPasswordHash.length(), 60);
		}
		getNewValues()[2] = argPasswordHash;
		return;
	}

	public synchronized void setAdministrator(final java.lang.Boolean argAdministrator) {
		tryMutate();
		if (argAdministrator == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myAdministrator on " + this + " to null.");
		}
		getNewValues()[3] = argAdministrator;
		return;
	}

	public void setAdministrator(final boolean argAdministrator) {
		setAdministrator(argAdministrator ? Boolean.TRUE : Boolean.FALSE);
		return;
	}

	public synchronized void setActive(final java.lang.Boolean argActive) {
		tryMutate();
		if (argActive == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myActive on " + this + " to null.");
		}
		getNewValues()[4] = argActive;
		return;
	}

	public void setActive(final boolean argActive) {
		setActive(argActive ? Boolean.TRUE : Boolean.FALSE);
		return;
	}

	@Override
	protected /* synchronized */ void copyOldValuesToNewInternal() {
		myNewContactOpal = myOldContactOpal;
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		myOldContactOpal = myNewContactOpal;

		return;
	}

	@Override
	protected void unlinkInternal() {
		if (getContactOpal() != null) {
			getContactOpal().setAccountOpalInternal(null);
		}
		return;
	}

	@Override
	protected void copyFieldsToInternal(UpdatableOpal<Account> argTarget) {
		Object[] lclValues = getReadValueSet();
		Object[] lclTargetNewValues = argTarget.getNewValues();
		/* Field 0 (Id) is part of a unique key. */
		/* Field 1 (Username) is part of a unique key. */
		lclTargetNewValues[2] = lclValues[2]; /* PasswordHash (immutable) */
		lclTargetNewValues[3] = lclValues[3]; /* Administrator (immutable) */
		lclTargetNewValues[4] = lclValues[4]; /* Active (immutable) */

		return;
	}

	@Override
	public synchronized void translateReferencesToFields() {
		if (myNewContactOpal != ContactOpal.NOT_YET_LOADED) {
			setId(myNewContactOpal == null ? null : myNewContactOpal.getIdAsObject());
		}
		return;
	}

	@Override
	public Object[] getPrimaryKeyWhereClauseValues() {
		return new Object[] {getOldValues()[0], };
	}

	private static int getFieldCountInternal() { return ourFieldNames.length; }

	@Override
	protected int getFieldCount() { return getFieldCountInternal(); }

	@Override
	protected String[] getFieldNames() { return ourFieldNames; }

	@Override
	public synchronized void output(final PrintWriter argPW) {
		argPW.println("Id = " + getIdAsObject());
		argPW.println("Username = " + getUsername());
		argPW.println("PasswordHash = " + getPasswordHash());
		argPW.println("Administrator = " + isAdministratorAsObject());
		argPW.println("Active = " + isActiveAsObject());
	}

	@Override
	public synchronized void output(final PrintStream argPS) {
		argPS.println("Id = " + getIdAsObject());
		argPS.println("Username = " + getUsername());
		argPS.println("PasswordHash = " + getPasswordHash());
		argPS.println("Administrator = " + isAdministratorAsObject());
		argPS.println("Active = " + isActiveAsObject());
	}

	private ContactOpal myOldContactOpal;
	private ContactOpal myNewContactOpal;

	protected ContactOpal retrieveContactOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[0] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getContactOpalFactory().forId(getIdAsObject());
	}

	public synchronized ContactOpal getContactOpal() {
		ContactOpal lclContactOpal;
		boolean lclAccess = tryAccess();
		lclContactOpal = lclAccess ? myNewContactOpal : myOldContactOpal;
		if (lclContactOpal == ContactOpal.NOT_YET_LOADED) {
			lclContactOpal = retrieveContactOpal(getReadValueSet());
			if (lclAccess) {
				myNewContactOpal = lclContactOpal;
			} else {
				myOldContactOpal = lclContactOpal;
			}
		}
		return lclContactOpal;
	}

	public synchronized void setContactOpal(ContactOpal argContactOpal) {
		tryMutate();
		if (myNewContactOpal != null && myNewContactOpal != ContactOpal.NOT_YET_LOADED) {
			myNewContactOpal.setAccountOpalInternal(null);
		}
		myNewContactOpal = argContactOpal;
		if (argContactOpal != null) {
			argContactOpal.setAccountOpalInternal(this);
		}
		return;
	}

	protected synchronized void setContactOpalInternal(ContactOpal argContactOpal) {
		tryMutate();
		myNewContactOpal = argContactOpal;
	}

	@Override
	public String toString() {
		StringBuilder lclSB =  new StringBuilder(64);
		lclSB.append("AccountOpal[");
		lclSB.append("myId=");
		lclSB.append(toStringField(0));
		lclSB.append(']');
		return lclSB.toString();
	}

	@Override
	protected void updateReferencesAfterReload() {
		if (myNewContactOpal != ContactOpal.NOT_YET_LOADED) {
			setContactOpal(retrieveContactOpal(getNewValues()));
		}
	}

}
