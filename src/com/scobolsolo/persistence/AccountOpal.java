package com.scobolsolo.persistence;

import java.io.PrintWriter;
import java.io.PrintStream;

import com.opal.*;

import com.scobolsolo.application.*;

public final class AccountOpal extends com.opal.UpdatableOpal<Account> {
	public static final java.lang.String ourDefaultPasswordHash = "$2a$16$XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
	public static final java.lang.Boolean ourDefaultAdministrator = java.lang.Boolean.FALSE;
	public static final java.lang.Boolean ourDefaultActive = java.lang.Boolean.TRUE;
	public static final java.lang.Boolean ourDefaultWriter = java.lang.Boolean.FALSE;

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
		getNewValues()[5] = ourDefaultWriter;
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
		"Writer",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.Integer.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.Boolean.class,
		java.lang.Boolean.class,
		java.lang.Boolean.class,
	};

	/* package */ static final boolean[] ourFieldNullability = new boolean[] {
		false,
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

	public synchronized java.lang.Boolean isWriterAsObject() {
		return (java.lang.Boolean) getReadValueSet()[5];
	}

	public synchronized AccountOpal setId(final java.lang.Integer argId) {
		tryMutate();
		if (argId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myId on " + this + " to null.");
		}
		getNewValues()[0] = argId;
		return this;
	}

	public AccountOpal setId(final int argId) {
		setId(java.lang.Integer.valueOf(argId));
		return this;
	}

	public synchronized AccountOpal setUsername(final java.lang.String argUsername) {
		tryMutate();
		if (argUsername == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myUsername on " + this + " to null.");
		}
		if (argUsername.length() > 64) {
			throw new com.opal.ArgumentTooLongException("Maximum length of myUsername on " + this + " is 64.", argUsername.length(), 64);
		}
		getNewValues()[1] = argUsername;
		return this;
	}

	public synchronized AccountOpal setPasswordHash(final java.lang.String argPasswordHash) {
		tryMutate();
		if (argPasswordHash == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myPasswordHash on " + this + " to null.");
		}
		if (argPasswordHash.length() > 60) {
			throw new com.opal.ArgumentTooLongException("Maximum length of myPasswordHash on " + this + " is 60.", argPasswordHash.length(), 60);
		}
		getNewValues()[2] = argPasswordHash;
		return this;
	}

	public synchronized AccountOpal setAdministrator(final java.lang.Boolean argAdministrator) {
		tryMutate();
		if (argAdministrator == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myAdministrator on " + this + " to null.");
		}
		getNewValues()[3] = argAdministrator;
		return this;
	}

	public AccountOpal setAdministrator(final boolean argAdministrator) {
		setAdministrator(argAdministrator ? Boolean.TRUE : Boolean.FALSE);
		return this;
	}

	public synchronized AccountOpal setActive(final java.lang.Boolean argActive) {
		tryMutate();
		if (argActive == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myActive on " + this + " to null.");
		}
		getNewValues()[4] = argActive;
		return this;
	}

	public AccountOpal setActive(final boolean argActive) {
		setActive(argActive ? Boolean.TRUE : Boolean.FALSE);
		return this;
	}

	public synchronized AccountOpal setWriter(final java.lang.Boolean argWriter) {
		tryMutate();
		if (argWriter == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myWriter on " + this + " to null.");
		}
		getNewValues()[5] = argWriter;
		return this;
	}

	public AccountOpal setWriter(final boolean argWriter) {
		setWriter(argWriter ? Boolean.TRUE : Boolean.FALSE);
		return this;
	}

	private boolean myClearOldCollections = false;

	protected boolean needsToClearOldCollections() {
		return myClearOldCollections;
	}

	protected final void setClearOldCollections(boolean argValue) {
		myClearOldCollections = argValue;
	}

	@Override
	protected /* synchronized */ void copyOldValuesToNewInternal() {
		myNewContactOpal = myOldContactOpal;
		myNewWriterQuestionOpalHashSet = null; /* Necessary if it has been rolled back */
		myWriterQuestionOpalCachedOperations = null; /* Ditto */
		myNewEditorDiffOpalHashSet = null; /* Necessary if it has been rolled back */
		myEditorDiffOpalCachedOperations = null; /* Ditto */
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		myOldContactOpal = myNewContactOpal;

		if (needsToClearOldCollections()) {
			myOldWriterQuestionOpalHashSet = null;
			} else {
			if (myNewWriterQuestionOpalHashSet != null) {
				myOldWriterQuestionOpalHashSet = myNewWriterQuestionOpalHashSet;
				myNewWriterQuestionOpalHashSet = null;
			} else {
				myWriterQuestionOpalCachedOperations = null;
			}
		}
		if (needsToClearOldCollections()) {
			myOldEditorDiffOpalHashSet = null;
			} else {
			if (myNewEditorDiffOpalHashSet != null) {
				myOldEditorDiffOpalHashSet = myNewEditorDiffOpalHashSet;
				myNewEditorDiffOpalHashSet = null;
			} else {
				myEditorDiffOpalCachedOperations = null;
			}
		}
		setClearOldCollections(false);
		return;
	}

	@Override
	protected void unlinkInternal() {
		java.util.Iterator<?> lclI;
		if (myNewWriterQuestionOpalHashSet != null || myWriterQuestionOpalCachedOperations != null) {
			lclI = createWriterQuestionOpalIterator();
			while (lclI.hasNext()) {
				((QuestionOpal) lclI.next()).setWriterOpalInternal(null);
			}
		}
		if (myNewEditorDiffOpalHashSet != null || myEditorDiffOpalCachedOperations != null) {
			lclI = createEditorDiffOpalIterator();
			while (lclI.hasNext()) {
				((DiffOpal) lclI.next()).setEditorOpalInternal(null);
			}
		}
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
		lclTargetNewValues[5] = lclValues[5]; /* Writer (immutable) */

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
	public java.util.Set<TransactionAware> getRequiredPriorCommits() {
		java.util.Set<TransactionAware> lclTAs = null;
		UpdatableOpal<?> lclUO;
		lclUO = myNewContactOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		return (lclTAs != null) && (lclTAs.size() > 0) ? lclTAs : java.util.Collections.emptySet();
	}

	@Override
	public java.util.Set<TransactionAware> getRequiredSubsequentCommits() {
		java.util.Set<TransactionAware> lclTAs = null;
		UpdatableOpal<?> lclUO;
		lclUO = myOldContactOpal;
		if ((lclUO != null) && lclUO.isDeleted()) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		return (lclTAs != null) && (lclTAs.size() > 0) ? lclTAs : java.util.Collections.emptySet();
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
		argPW.println("Writer = " + isWriterAsObject());
	}

	@Override
	public synchronized void output(final PrintStream argPS) {
		argPS.println("Id = " + getIdAsObject());
		argPS.println("Username = " + getUsername());
		argPS.println("PasswordHash = " + getPasswordHash());
		argPS.println("Administrator = " + isAdministratorAsObject());
		argPS.println("Active = " + isActiveAsObject());
		argPS.println("Writer = " + isWriterAsObject());
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

	public synchronized AccountOpal setContactOpal(ContactOpal argContactOpal) {
		tryMutate();
		if (myNewContactOpal != null && myNewContactOpal != ContactOpal.NOT_YET_LOADED) {
			myNewContactOpal.setAccountOpalInternal(null);
		}
		myNewContactOpal = argContactOpal;
		if (argContactOpal != null) {
			argContactOpal.setAccountOpalInternal(this);
		}
		return this;
	}

	protected synchronized void setContactOpalInternal(ContactOpal argContactOpal) {
		tryMutate();
		myNewContactOpal = argContactOpal;
	}

	private java.util.HashSet<QuestionOpal> myOldWriterQuestionOpalHashSet = null;
	private java.util.HashSet<QuestionOpal> myNewWriterQuestionOpalHashSet = null;
	private java.util.ArrayList<CachedOperation<QuestionOpal>> myWriterQuestionOpalCachedOperations = null;

	/* package */ java.util.HashSet<QuestionOpal> getWriterQuestionOpalClass() {
		if (tryAccess()) {
			if (myNewWriterQuestionOpalHashSet == null) {
				if (myOldWriterQuestionOpalHashSet == null) {
					myOldWriterQuestionOpalHashSet = OpalFactoryFactory.getInstance().getQuestionOpalFactory().forWriterAccountIdCollection(getIdAsObject());
				}
				myNewWriterQuestionOpalHashSet = new java.util.HashSet<>(myOldWriterQuestionOpalHashSet);
				if (myWriterQuestionOpalCachedOperations != null) {
					OpalUtility.handleCachedOperations(myWriterQuestionOpalCachedOperations, myNewWriterQuestionOpalHashSet);
					myWriterQuestionOpalCachedOperations = null;
				}
			}
			return myNewWriterQuestionOpalHashSet;
		}
		if (myOldWriterQuestionOpalHashSet == null) {
			myOldWriterQuestionOpalHashSet = OpalFactoryFactory.getInstance().getQuestionOpalFactory().forWriterAccountIdCollection(getIdAsObject());
		}
		return myOldWriterQuestionOpalHashSet;
	}

	public synchronized void addWriterQuestionOpal(QuestionOpal argQuestionOpal) {
		tryMutate();
		argQuestionOpal.setWriterOpal(this);
		return;
	}

	protected synchronized void addWriterQuestionOpalInternal(QuestionOpal argQuestionOpal) {
		tryMutate();
		if (myNewWriterQuestionOpalHashSet == null) {
			if (myOldWriterQuestionOpalHashSet == null) {
				if (myWriterQuestionOpalCachedOperations == null) { myWriterQuestionOpalCachedOperations = new java.util.ArrayList<>(); }
				myWriterQuestionOpalCachedOperations.add(new CachedOperation<>(CachedOperation.ADD, argQuestionOpal));
			} else {
				myNewWriterQuestionOpalHashSet = new java.util.HashSet<>(myOldWriterQuestionOpalHashSet);
				myNewWriterQuestionOpalHashSet.add(argQuestionOpal);
			}
		} else {
			myNewWriterQuestionOpalHashSet.add(argQuestionOpal);
		}
		return;
	}

	public synchronized void removeWriterQuestionOpal(QuestionOpal argQuestionOpal) {
		tryMutate();
		argQuestionOpal.setWriterOpal(null);
	}

	protected synchronized void removeWriterQuestionOpalInternal(QuestionOpal argQuestionOpal) {
		tryMutate();
		if (myNewWriterQuestionOpalHashSet == null) {
			if (myOldWriterQuestionOpalHashSet == null) {
				if (myWriterQuestionOpalCachedOperations == null) { myWriterQuestionOpalCachedOperations = new java.util.ArrayList<>(); }
				myWriterQuestionOpalCachedOperations.add(new CachedOperation<>(CachedOperation.REMOVE, argQuestionOpal));
			} else {
				myNewWriterQuestionOpalHashSet = new java.util.HashSet<>(myOldWriterQuestionOpalHashSet);
				myNewWriterQuestionOpalHashSet.remove(argQuestionOpal);
			}
		} else {
			myNewWriterQuestionOpalHashSet.remove(argQuestionOpal);
		}
		return;
	}

	public synchronized int getWriterQuestionOpalCount() { return getWriterQuestionOpalClass().size(); }

	public synchronized java.util.Iterator<QuestionOpal> createWriterQuestionOpalIterator() {
		return getWriterQuestionOpalClass().iterator();
	}

	public synchronized java.util.stream.Stream<QuestionOpal> streamWriterQuestionOpal() {
		return getWriterQuestionOpalClass().stream();
	}

	public synchronized void clearWriterQuestionOpalInternal() { getWriterQuestionOpalClass().clear(); }

	private java.util.HashSet<DiffOpal> myOldEditorDiffOpalHashSet = null;
	private java.util.HashSet<DiffOpal> myNewEditorDiffOpalHashSet = null;
	private java.util.ArrayList<CachedOperation<DiffOpal>> myEditorDiffOpalCachedOperations = null;

	/* package */ java.util.HashSet<DiffOpal> getEditorDiffOpalClass() {
		if (tryAccess()) {
			if (myNewEditorDiffOpalHashSet == null) {
				if (myOldEditorDiffOpalHashSet == null) {
					myOldEditorDiffOpalHashSet = OpalFactoryFactory.getInstance().getDiffOpalFactory().forEditorAccountIdCollection(getIdAsObject());
				}
				myNewEditorDiffOpalHashSet = new java.util.HashSet<>(myOldEditorDiffOpalHashSet);
				if (myEditorDiffOpalCachedOperations != null) {
					OpalUtility.handleCachedOperations(myEditorDiffOpalCachedOperations, myNewEditorDiffOpalHashSet);
					myEditorDiffOpalCachedOperations = null;
				}
			}
			return myNewEditorDiffOpalHashSet;
		}
		if (myOldEditorDiffOpalHashSet == null) {
			myOldEditorDiffOpalHashSet = OpalFactoryFactory.getInstance().getDiffOpalFactory().forEditorAccountIdCollection(getIdAsObject());
		}
		return myOldEditorDiffOpalHashSet;
	}

	public synchronized void addEditorDiffOpal(DiffOpal argDiffOpal) {
		tryMutate();
		argDiffOpal.setEditorOpal(this);
		return;
	}

	protected synchronized void addEditorDiffOpalInternal(DiffOpal argDiffOpal) {
		tryMutate();
		if (myNewEditorDiffOpalHashSet == null) {
			if (myOldEditorDiffOpalHashSet == null) {
				if (myEditorDiffOpalCachedOperations == null) { myEditorDiffOpalCachedOperations = new java.util.ArrayList<>(); }
				myEditorDiffOpalCachedOperations.add(new CachedOperation<>(CachedOperation.ADD, argDiffOpal));
			} else {
				myNewEditorDiffOpalHashSet = new java.util.HashSet<>(myOldEditorDiffOpalHashSet);
				myNewEditorDiffOpalHashSet.add(argDiffOpal);
			}
		} else {
			myNewEditorDiffOpalHashSet.add(argDiffOpal);
		}
		return;
	}

	public synchronized void removeEditorDiffOpal(DiffOpal argDiffOpal) {
		tryMutate();
		argDiffOpal.setEditorOpal(null);
	}

	protected synchronized void removeEditorDiffOpalInternal(DiffOpal argDiffOpal) {
		tryMutate();
		if (myNewEditorDiffOpalHashSet == null) {
			if (myOldEditorDiffOpalHashSet == null) {
				if (myEditorDiffOpalCachedOperations == null) { myEditorDiffOpalCachedOperations = new java.util.ArrayList<>(); }
				myEditorDiffOpalCachedOperations.add(new CachedOperation<>(CachedOperation.REMOVE, argDiffOpal));
			} else {
				myNewEditorDiffOpalHashSet = new java.util.HashSet<>(myOldEditorDiffOpalHashSet);
				myNewEditorDiffOpalHashSet.remove(argDiffOpal);
			}
		} else {
			myNewEditorDiffOpalHashSet.remove(argDiffOpal);
		}
		return;
	}

	public synchronized int getEditorDiffOpalCount() { return getEditorDiffOpalClass().size(); }

	public synchronized java.util.Iterator<DiffOpal> createEditorDiffOpalIterator() {
		return getEditorDiffOpalClass().iterator();
	}

	public synchronized java.util.stream.Stream<DiffOpal> streamEditorDiffOpal() {
		return getEditorDiffOpalClass().stream();
	}

	public synchronized void clearEditorDiffOpalInternal() { getEditorDiffOpalClass().clear(); }

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

	@Override
	protected void updateCollectionsAfterReload() {
		assert needsToClearOldCollections() == false;
		setClearOldCollections(true);
	}

}
