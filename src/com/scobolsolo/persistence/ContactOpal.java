package com.scobolsolo.persistence;

import java.io.PrintWriter;
import java.io.PrintStream;

import com.opal.*;

import com.scobolsolo.application.*;

@StoreGeneratedPrimaryKey
public final class ContactOpal extends com.opal.UpdatableOpal<Contact> {
	public static final java.lang.Boolean ourDefaultActive = java.lang.Boolean.TRUE;

	private ContactOpal() {
		super();
		setUserFacing(null);
	}

	public ContactOpal(OpalFactory<Contact, ContactOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void applyDefaults() {
		getNewValues()[7] = ourDefaultActive;
		return;
	}

	@Override
	protected void initializeReferences() {
		myOldAccountOpal = AccountOpal.NOT_YET_LOADED;
		return;
	}

	/* package */ static final String[] ourFieldNames = new String[] {
		"Id",
		"EmailAddress",
		"AdvancePhone",
		"DayOfPhone",
		"Note",
		"Name",
		"SortBy",
		"Active",
		"Address",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.Integer.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.Boolean.class,
		java.lang.String.class,
	};

	/* package */ static final boolean[] ourFieldNullability = new boolean[] {
		false,
		true,
		true,
		true,
		true,
		false,
		false,
		false,
		true,
	};

	/* package */ static final FieldValidator[] ourFieldValidators = new FieldValidator[] {
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
	};

	public static final ContactOpal NOT_YET_LOADED = new ContactOpal();

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

	public synchronized java.lang.String getEmailAddress() {
		return (java.lang.String) getReadValueSet()[1];
	}

	public synchronized java.lang.String getAdvancePhone() {
		return (java.lang.String) getReadValueSet()[2];
	}

	public synchronized java.lang.String getDayOfPhone() {
		return (java.lang.String) getReadValueSet()[3];
	}

	public synchronized java.lang.String getNote() {
		return (java.lang.String) getReadValueSet()[4];
	}

	public synchronized java.lang.String getName() {
		return (java.lang.String) getReadValueSet()[5];
	}

	public synchronized java.lang.String getSortBy() {
		return (java.lang.String) getReadValueSet()[6];
	}

	public synchronized java.lang.Boolean isActiveAsObject() {
		return (java.lang.Boolean) getReadValueSet()[7];
	}

	public synchronized java.lang.String getAddress() {
		return (java.lang.String) getReadValueSet()[8];
	}

	public synchronized ContactOpal setId(final java.lang.Integer argId) {
		tryMutate();
		if (argId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myId on " + this + " to null.");
		}
		getNewValues()[0] = argId;
		return this;
	}

	public ContactOpal setId(final int argId) {
		setId(java.lang.Integer.valueOf(argId));
		return this;
	}

	public synchronized ContactOpal setEmailAddress(final java.lang.String argEmailAddress) {
		tryMutate();
		if ((argEmailAddress != null) && (argEmailAddress.length() > 256)) {
			throw new com.opal.ArgumentTooLongException("Maximum length of myEmailAddress on " + this + " is 256.", argEmailAddress.length(), 256);
		}
		getNewValues()[1] = argEmailAddress;
		return this;
	}

	public synchronized ContactOpal setAdvancePhone(final java.lang.String argAdvancePhone) {
		tryMutate();
		if ((argAdvancePhone != null) && (argAdvancePhone.length() > 32)) {
			throw new com.opal.ArgumentTooLongException("Maximum length of myAdvancePhone on " + this + " is 32.", argAdvancePhone.length(), 32);
		}
		getNewValues()[2] = argAdvancePhone;
		return this;
	}

	public synchronized ContactOpal setDayOfPhone(final java.lang.String argDayOfPhone) {
		tryMutate();
		if ((argDayOfPhone != null) && (argDayOfPhone.length() > 32)) {
			throw new com.opal.ArgumentTooLongException("Maximum length of myDayOfPhone on " + this + " is 32.", argDayOfPhone.length(), 32);
		}
		getNewValues()[3] = argDayOfPhone;
		return this;
	}

	public synchronized ContactOpal setNote(final java.lang.String argNote) {
		tryMutate();
		getNewValues()[4] = argNote;
		return this;
	}

	public synchronized ContactOpal setName(final java.lang.String argName) {
		tryMutate();
		if (argName == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myName on " + this + " to null.");
		}
		if (argName.length() > 256) {
			throw new com.opal.ArgumentTooLongException("Maximum length of myName on " + this + " is 256.", argName.length(), 256);
		}
		getNewValues()[5] = argName;
		return this;
	}

	public synchronized ContactOpal setSortBy(final java.lang.String argSortBy) {
		tryMutate();
		if (argSortBy == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set mySortBy on " + this + " to null.");
		}
		if (argSortBy.length() > 256) {
			throw new com.opal.ArgumentTooLongException("Maximum length of mySortBy on " + this + " is 256.", argSortBy.length(), 256);
		}
		getNewValues()[6] = argSortBy;
		return this;
	}

	public synchronized ContactOpal setActive(final java.lang.Boolean argActive) {
		tryMutate();
		if (argActive == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myActive on " + this + " to null.");
		}
		getNewValues()[7] = argActive;
		return this;
	}

	public ContactOpal setActive(final boolean argActive) {
		setActive(argActive ? Boolean.TRUE : Boolean.FALSE);
		return this;
	}

	public synchronized ContactOpal setAddress(final java.lang.String argAddress) {
		tryMutate();
		getNewValues()[8] = argAddress;
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
		myNewAccountOpal = myOldAccountOpal;
		myNewTournamentDirectorTournamentOpalHashSet = null; /* Necessary if it has been rolled back */
		myTournamentDirectorTournamentOpalCachedOperations = null; /* Ditto */
		myNewPlayerOpalHashSet = null; /* Necessary if it has been rolled back */
		myPlayerOpalCachedOperations = null; /* Ditto */
		myNewMainSchoolRegistrationOpalHashSet = null; /* Necessary if it has been rolled back */
		myMainSchoolRegistrationOpalCachedOperations = null; /* Ditto */
		myNewStaffOpalHashSet = null; /* Necessary if it has been rolled back */
		myStaffOpalCachedOperations = null; /* Ditto */
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		/** This Opal has no references to other Opals that need to be copied. */
		myOldAccountOpal = myNewAccountOpal;
		if (needsToClearOldCollections()) {
			myOldTournamentDirectorTournamentOpalHashSet = null;
			} else {
			if (myNewTournamentDirectorTournamentOpalHashSet != null) {
				myOldTournamentDirectorTournamentOpalHashSet = myNewTournamentDirectorTournamentOpalHashSet;
				myNewTournamentDirectorTournamentOpalHashSet = null;
			} else {
				myTournamentDirectorTournamentOpalCachedOperations = null;
			}
		}
		if (needsToClearOldCollections()) {
			myOldPlayerOpalHashSet = null;
			} else {
			if (myNewPlayerOpalHashSet != null) {
				myOldPlayerOpalHashSet = myNewPlayerOpalHashSet;
				myNewPlayerOpalHashSet = null;
			} else {
				myPlayerOpalCachedOperations = null;
			}
		}
		if (needsToClearOldCollections()) {
			myOldMainSchoolRegistrationOpalHashSet = null;
			} else {
			if (myNewMainSchoolRegistrationOpalHashSet != null) {
				myOldMainSchoolRegistrationOpalHashSet = myNewMainSchoolRegistrationOpalHashSet;
				myNewMainSchoolRegistrationOpalHashSet = null;
			} else {
				myMainSchoolRegistrationOpalCachedOperations = null;
			}
		}
		if (needsToClearOldCollections()) {
			myOldStaffOpalHashSet = null;
			} else {
			if (myNewStaffOpalHashSet != null) {
				myOldStaffOpalHashSet = myNewStaffOpalHashSet;
				myNewStaffOpalHashSet = null;
			} else {
				myStaffOpalCachedOperations = null;
			}
		}
		setClearOldCollections(false);
		return;
	}

	@Override
	protected void unlinkInternal() {
		java.util.Iterator<?> lclI;
		if (myNewTournamentDirectorTournamentOpalHashSet != null || myTournamentDirectorTournamentOpalCachedOperations != null) {
			lclI = createTournamentDirectorTournamentOpalIterator();
			while (lclI.hasNext()) {
				((TournamentOpal) lclI.next()).setTournamentDirectorContactOpalInternal(null);
			}
		}
		if (myNewPlayerOpalHashSet != null || myPlayerOpalCachedOperations != null) {
			lclI = createPlayerOpalIterator();
			while (lclI.hasNext()) {
				((PlayerOpal) lclI.next()).setContactOpalInternal(null);
			}
		}
		if (myNewMainSchoolRegistrationOpalHashSet != null || myMainSchoolRegistrationOpalCachedOperations != null) {
			lclI = createMainSchoolRegistrationOpalIterator();
			while (lclI.hasNext()) {
				((SchoolRegistrationOpal) lclI.next()).setMainContactOpalInternal(null);
			}
		}
		if (myNewStaffOpalHashSet != null || myStaffOpalCachedOperations != null) {
			lclI = createStaffOpalIterator();
			while (lclI.hasNext()) {
				((StaffOpal) lclI.next()).setContactOpalInternal(null);
			}
		}
		if (getAccountOpal() != null) {
			getAccountOpal().setContactOpalInternal(null);
		}
		return;
	}

	@Override
	protected void copyFieldsToInternal(UpdatableOpal<Contact> argTarget) {
		Object[] lclValues = getReadValueSet();
		Object[] lclTargetNewValues = argTarget.getNewValues();
		/* Field 0 (Id) is database generated. */
		lclTargetNewValues[1] = lclValues[1]; /* EmailAddress (immutable) */
		lclTargetNewValues[2] = lclValues[2]; /* AdvancePhone (immutable) */
		lclTargetNewValues[3] = lclValues[3]; /* DayOfPhone (immutable) */
		lclTargetNewValues[4] = lclValues[4]; /* Note (immutable) */
		lclTargetNewValues[5] = lclValues[5]; /* Name (immutable) */
		lclTargetNewValues[6] = lclValues[6]; /* SortBy (immutable) */
		lclTargetNewValues[7] = lclValues[7]; /* Active (immutable) */
		lclTargetNewValues[8] = lclValues[8]; /* Address (immutable) */

		return;
	}

	@Override
	public synchronized void translateReferencesToFields() {
		return;
	}

	@Override
	public java.util.Set<TransactionAware> getRequiredPriorCommits() {
		return java.util.Collections.emptySet();
	}

	@Override
	public java.util.Set<TransactionAware> getRequiredSubsequentCommits() {
		return java.util.Collections.emptySet();
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
		argPW.println("EmailAddress = " + getEmailAddress());
		argPW.println("AdvancePhone = " + getAdvancePhone());
		argPW.println("DayOfPhone = " + getDayOfPhone());
		argPW.println("Note = " + getNote());
		argPW.println("Name = " + getName());
		argPW.println("SortBy = " + getSortBy());
		argPW.println("Active = " + isActiveAsObject());
		argPW.println("Address = " + getAddress());
	}

	@Override
	public synchronized void output(final PrintStream argPS) {
		argPS.println("Id = " + getIdAsObject());
		argPS.println("EmailAddress = " + getEmailAddress());
		argPS.println("AdvancePhone = " + getAdvancePhone());
		argPS.println("DayOfPhone = " + getDayOfPhone());
		argPS.println("Note = " + getNote());
		argPS.println("Name = " + getName());
		argPS.println("SortBy = " + getSortBy());
		argPS.println("Active = " + isActiveAsObject());
		argPS.println("Address = " + getAddress());
	}

	private AccountOpal myOldAccountOpal;
	private AccountOpal myNewAccountOpal;

	protected AccountOpal retrieveAccountOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[0] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getAccountOpalFactory().forId(getIdAsObject());
	}

	public synchronized AccountOpal getAccountOpal() {
		AccountOpal lclAccountOpal;
		boolean lclAccess = tryAccess();
		lclAccountOpal = lclAccess ? myNewAccountOpal : myOldAccountOpal;
		if (lclAccountOpal == AccountOpal.NOT_YET_LOADED) {
			lclAccountOpal = retrieveAccountOpal(getReadValueSet());
			if (lclAccess) {
				myNewAccountOpal = lclAccountOpal;
			} else {
				myOldAccountOpal = lclAccountOpal;
			}
		}
		return lclAccountOpal;
	}

	public synchronized ContactOpal setAccountOpal(AccountOpal argAccountOpal) {
		tryMutate();
		myNewAccountOpal = argAccountOpal;
		if (argAccountOpal != null) {
			argAccountOpal.setContactOpalInternal(this);
		}
		return this;
	}

	public synchronized void setAccountOpalInternal(AccountOpal argAccountOpal) {
		tryMutate();
		myNewAccountOpal = argAccountOpal;
	}

	private java.util.HashSet<TournamentOpal> myOldTournamentDirectorTournamentOpalHashSet = null;
	private java.util.HashSet<TournamentOpal> myNewTournamentDirectorTournamentOpalHashSet = null;
	private java.util.ArrayList<CachedOperation<TournamentOpal>> myTournamentDirectorTournamentOpalCachedOperations = null;

	/* package */ java.util.HashSet<TournamentOpal> getTournamentDirectorTournamentOpalClass() {
		if (tryAccess()) {
			if (myNewTournamentDirectorTournamentOpalHashSet == null) {
				if (myOldTournamentDirectorTournamentOpalHashSet == null) {
					myOldTournamentDirectorTournamentOpalHashSet = OpalFactoryFactory.getInstance().getTournamentOpalFactory().forTournamentDirectorContactIdCollection(getIdAsObject());
				}
				myNewTournamentDirectorTournamentOpalHashSet = new java.util.HashSet<>(myOldTournamentDirectorTournamentOpalHashSet);
				if (myTournamentDirectorTournamentOpalCachedOperations != null) {
					OpalUtility.handleCachedOperations(myTournamentDirectorTournamentOpalCachedOperations, myNewTournamentDirectorTournamentOpalHashSet);
					myTournamentDirectorTournamentOpalCachedOperations = null;
				}
			}
			return myNewTournamentDirectorTournamentOpalHashSet;
		}
		if (myOldTournamentDirectorTournamentOpalHashSet == null) {
			myOldTournamentDirectorTournamentOpalHashSet = OpalFactoryFactory.getInstance().getTournamentOpalFactory().forTournamentDirectorContactIdCollection(getIdAsObject());
		}
		return myOldTournamentDirectorTournamentOpalHashSet;
	}

	public synchronized void addTournamentDirectorTournamentOpal(TournamentOpal argTournamentOpal) {
		tryMutate();
		argTournamentOpal.setTournamentDirectorContactOpal(this);
		return;
	}

	protected synchronized void addTournamentDirectorTournamentOpalInternal(TournamentOpal argTournamentOpal) {
		tryMutate();
		if (myNewTournamentDirectorTournamentOpalHashSet == null) {
			if (myOldTournamentDirectorTournamentOpalHashSet == null) {
				if (myTournamentDirectorTournamentOpalCachedOperations == null) { myTournamentDirectorTournamentOpalCachedOperations = new java.util.ArrayList<>(); }
				myTournamentDirectorTournamentOpalCachedOperations.add(new CachedOperation<>(CachedOperation.ADD, argTournamentOpal));
			} else {
				myNewTournamentDirectorTournamentOpalHashSet = new java.util.HashSet<>(myOldTournamentDirectorTournamentOpalHashSet);
				myNewTournamentDirectorTournamentOpalHashSet.add(argTournamentOpal);
			}
		} else {
			myNewTournamentDirectorTournamentOpalHashSet.add(argTournamentOpal);
		}
		return;
	}

	public synchronized void removeTournamentDirectorTournamentOpal(TournamentOpal argTournamentOpal) {
		tryMutate();
		argTournamentOpal.setTournamentDirectorContactOpal(null);
	}

	protected synchronized void removeTournamentDirectorTournamentOpalInternal(TournamentOpal argTournamentOpal) {
		tryMutate();
		if (myNewTournamentDirectorTournamentOpalHashSet == null) {
			if (myOldTournamentDirectorTournamentOpalHashSet == null) {
				if (myTournamentDirectorTournamentOpalCachedOperations == null) { myTournamentDirectorTournamentOpalCachedOperations = new java.util.ArrayList<>(); }
				myTournamentDirectorTournamentOpalCachedOperations.add(new CachedOperation<>(CachedOperation.REMOVE, argTournamentOpal));
			} else {
				myNewTournamentDirectorTournamentOpalHashSet = new java.util.HashSet<>(myOldTournamentDirectorTournamentOpalHashSet);
				myNewTournamentDirectorTournamentOpalHashSet.remove(argTournamentOpal);
			}
		} else {
			myNewTournamentDirectorTournamentOpalHashSet.remove(argTournamentOpal);
		}
		return;
	}

	public synchronized int getTournamentDirectorTournamentOpalCount() { return getTournamentDirectorTournamentOpalClass().size(); }

	public synchronized java.util.Iterator<TournamentOpal> createTournamentDirectorTournamentOpalIterator() {
		return getTournamentDirectorTournamentOpalClass().iterator();
	}

	public synchronized java.util.stream.Stream<TournamentOpal> streamTournamentDirectorTournamentOpal() {
		return getTournamentDirectorTournamentOpalClass().stream();
	}

	public synchronized void clearTournamentDirectorTournamentOpalInternal() { getTournamentDirectorTournamentOpalClass().clear(); }

	private java.util.HashSet<PlayerOpal> myOldPlayerOpalHashSet = null;
	private java.util.HashSet<PlayerOpal> myNewPlayerOpalHashSet = null;
	private java.util.ArrayList<CachedOperation<PlayerOpal>> myPlayerOpalCachedOperations = null;

	/* package */ java.util.HashSet<PlayerOpal> getPlayerOpalClass() {
		if (tryAccess()) {
			if (myNewPlayerOpalHashSet == null) {
				if (myOldPlayerOpalHashSet == null) {
					myOldPlayerOpalHashSet = OpalFactoryFactory.getInstance().getPlayerOpalFactory().forContactIdCollection(getIdAsObject());
				}
				myNewPlayerOpalHashSet = new java.util.HashSet<>(myOldPlayerOpalHashSet);
				if (myPlayerOpalCachedOperations != null) {
					OpalUtility.handleCachedOperations(myPlayerOpalCachedOperations, myNewPlayerOpalHashSet);
					myPlayerOpalCachedOperations = null;
				}
			}
			return myNewPlayerOpalHashSet;
		}
		if (myOldPlayerOpalHashSet == null) {
			myOldPlayerOpalHashSet = OpalFactoryFactory.getInstance().getPlayerOpalFactory().forContactIdCollection(getIdAsObject());
		}
		return myOldPlayerOpalHashSet;
	}

	public synchronized void addPlayerOpal(PlayerOpal argPlayerOpal) {
		tryMutate();
		argPlayerOpal.setContactOpal(this);
		return;
	}

	protected synchronized void addPlayerOpalInternal(PlayerOpal argPlayerOpal) {
		tryMutate();
		if (myNewPlayerOpalHashSet == null) {
			if (myOldPlayerOpalHashSet == null) {
				if (myPlayerOpalCachedOperations == null) { myPlayerOpalCachedOperations = new java.util.ArrayList<>(); }
				myPlayerOpalCachedOperations.add(new CachedOperation<>(CachedOperation.ADD, argPlayerOpal));
			} else {
				myNewPlayerOpalHashSet = new java.util.HashSet<>(myOldPlayerOpalHashSet);
				myNewPlayerOpalHashSet.add(argPlayerOpal);
			}
		} else {
			myNewPlayerOpalHashSet.add(argPlayerOpal);
		}
		return;
	}

	public synchronized void removePlayerOpal(PlayerOpal argPlayerOpal) {
		tryMutate();
		argPlayerOpal.setContactOpal(null);
	}

	protected synchronized void removePlayerOpalInternal(PlayerOpal argPlayerOpal) {
		tryMutate();
		if (myNewPlayerOpalHashSet == null) {
			if (myOldPlayerOpalHashSet == null) {
				if (myPlayerOpalCachedOperations == null) { myPlayerOpalCachedOperations = new java.util.ArrayList<>(); }
				myPlayerOpalCachedOperations.add(new CachedOperation<>(CachedOperation.REMOVE, argPlayerOpal));
			} else {
				myNewPlayerOpalHashSet = new java.util.HashSet<>(myOldPlayerOpalHashSet);
				myNewPlayerOpalHashSet.remove(argPlayerOpal);
			}
		} else {
			myNewPlayerOpalHashSet.remove(argPlayerOpal);
		}
		return;
	}

	public synchronized int getPlayerOpalCount() { return getPlayerOpalClass().size(); }

	public synchronized java.util.Iterator<PlayerOpal> createPlayerOpalIterator() {
		return getPlayerOpalClass().iterator();
	}

	public synchronized java.util.stream.Stream<PlayerOpal> streamPlayerOpal() {
		return getPlayerOpalClass().stream();
	}

	public synchronized void clearPlayerOpalInternal() { getPlayerOpalClass().clear(); }

	private java.util.HashSet<SchoolRegistrationOpal> myOldMainSchoolRegistrationOpalHashSet = null;
	private java.util.HashSet<SchoolRegistrationOpal> myNewMainSchoolRegistrationOpalHashSet = null;
	private java.util.ArrayList<CachedOperation<SchoolRegistrationOpal>> myMainSchoolRegistrationOpalCachedOperations = null;

	/* package */ java.util.HashSet<SchoolRegistrationOpal> getMainSchoolRegistrationOpalClass() {
		if (tryAccess()) {
			if (myNewMainSchoolRegistrationOpalHashSet == null) {
				if (myOldMainSchoolRegistrationOpalHashSet == null) {
					myOldMainSchoolRegistrationOpalHashSet = OpalFactoryFactory.getInstance().getSchoolRegistrationOpalFactory().forMainContactIdCollection(getIdAsObject());
				}
				myNewMainSchoolRegistrationOpalHashSet = new java.util.HashSet<>(myOldMainSchoolRegistrationOpalHashSet);
				if (myMainSchoolRegistrationOpalCachedOperations != null) {
					OpalUtility.handleCachedOperations(myMainSchoolRegistrationOpalCachedOperations, myNewMainSchoolRegistrationOpalHashSet);
					myMainSchoolRegistrationOpalCachedOperations = null;
				}
			}
			return myNewMainSchoolRegistrationOpalHashSet;
		}
		if (myOldMainSchoolRegistrationOpalHashSet == null) {
			myOldMainSchoolRegistrationOpalHashSet = OpalFactoryFactory.getInstance().getSchoolRegistrationOpalFactory().forMainContactIdCollection(getIdAsObject());
		}
		return myOldMainSchoolRegistrationOpalHashSet;
	}

	public synchronized void addMainSchoolRegistrationOpal(SchoolRegistrationOpal argSchoolRegistrationOpal) {
		tryMutate();
		argSchoolRegistrationOpal.setMainContactOpal(this);
		return;
	}

	protected synchronized void addMainSchoolRegistrationOpalInternal(SchoolRegistrationOpal argSchoolRegistrationOpal) {
		tryMutate();
		if (myNewMainSchoolRegistrationOpalHashSet == null) {
			if (myOldMainSchoolRegistrationOpalHashSet == null) {
				if (myMainSchoolRegistrationOpalCachedOperations == null) { myMainSchoolRegistrationOpalCachedOperations = new java.util.ArrayList<>(); }
				myMainSchoolRegistrationOpalCachedOperations.add(new CachedOperation<>(CachedOperation.ADD, argSchoolRegistrationOpal));
			} else {
				myNewMainSchoolRegistrationOpalHashSet = new java.util.HashSet<>(myOldMainSchoolRegistrationOpalHashSet);
				myNewMainSchoolRegistrationOpalHashSet.add(argSchoolRegistrationOpal);
			}
		} else {
			myNewMainSchoolRegistrationOpalHashSet.add(argSchoolRegistrationOpal);
		}
		return;
	}

	public synchronized void removeMainSchoolRegistrationOpal(SchoolRegistrationOpal argSchoolRegistrationOpal) {
		tryMutate();
		argSchoolRegistrationOpal.setMainContactOpal(null);
	}

	protected synchronized void removeMainSchoolRegistrationOpalInternal(SchoolRegistrationOpal argSchoolRegistrationOpal) {
		tryMutate();
		if (myNewMainSchoolRegistrationOpalHashSet == null) {
			if (myOldMainSchoolRegistrationOpalHashSet == null) {
				if (myMainSchoolRegistrationOpalCachedOperations == null) { myMainSchoolRegistrationOpalCachedOperations = new java.util.ArrayList<>(); }
				myMainSchoolRegistrationOpalCachedOperations.add(new CachedOperation<>(CachedOperation.REMOVE, argSchoolRegistrationOpal));
			} else {
				myNewMainSchoolRegistrationOpalHashSet = new java.util.HashSet<>(myOldMainSchoolRegistrationOpalHashSet);
				myNewMainSchoolRegistrationOpalHashSet.remove(argSchoolRegistrationOpal);
			}
		} else {
			myNewMainSchoolRegistrationOpalHashSet.remove(argSchoolRegistrationOpal);
		}
		return;
	}

	public synchronized int getMainSchoolRegistrationOpalCount() { return getMainSchoolRegistrationOpalClass().size(); }

	public synchronized java.util.Iterator<SchoolRegistrationOpal> createMainSchoolRegistrationOpalIterator() {
		return getMainSchoolRegistrationOpalClass().iterator();
	}

	public synchronized java.util.stream.Stream<SchoolRegistrationOpal> streamMainSchoolRegistrationOpal() {
		return getMainSchoolRegistrationOpalClass().stream();
	}

	public synchronized void clearMainSchoolRegistrationOpalInternal() { getMainSchoolRegistrationOpalClass().clear(); }

	private java.util.HashSet<StaffOpal> myOldStaffOpalHashSet = null;
	private java.util.HashSet<StaffOpal> myNewStaffOpalHashSet = null;
	private java.util.ArrayList<CachedOperation<StaffOpal>> myStaffOpalCachedOperations = null;

	/* package */ java.util.HashSet<StaffOpal> getStaffOpalClass() {
		if (tryAccess()) {
			if (myNewStaffOpalHashSet == null) {
				if (myOldStaffOpalHashSet == null) {
					myOldStaffOpalHashSet = OpalFactoryFactory.getInstance().getStaffOpalFactory().forContactIdCollection(getIdAsObject());
				}
				myNewStaffOpalHashSet = new java.util.HashSet<>(myOldStaffOpalHashSet);
				if (myStaffOpalCachedOperations != null) {
					OpalUtility.handleCachedOperations(myStaffOpalCachedOperations, myNewStaffOpalHashSet);
					myStaffOpalCachedOperations = null;
				}
			}
			return myNewStaffOpalHashSet;
		}
		if (myOldStaffOpalHashSet == null) {
			myOldStaffOpalHashSet = OpalFactoryFactory.getInstance().getStaffOpalFactory().forContactIdCollection(getIdAsObject());
		}
		return myOldStaffOpalHashSet;
	}

	public synchronized void addStaffOpal(StaffOpal argStaffOpal) {
		tryMutate();
		argStaffOpal.setContactOpal(this);
		return;
	}

	protected synchronized void addStaffOpalInternal(StaffOpal argStaffOpal) {
		tryMutate();
		if (myNewStaffOpalHashSet == null) {
			if (myOldStaffOpalHashSet == null) {
				if (myStaffOpalCachedOperations == null) { myStaffOpalCachedOperations = new java.util.ArrayList<>(); }
				myStaffOpalCachedOperations.add(new CachedOperation<>(CachedOperation.ADD, argStaffOpal));
			} else {
				myNewStaffOpalHashSet = new java.util.HashSet<>(myOldStaffOpalHashSet);
				myNewStaffOpalHashSet.add(argStaffOpal);
			}
		} else {
			myNewStaffOpalHashSet.add(argStaffOpal);
		}
		return;
	}

	public synchronized void removeStaffOpal(StaffOpal argStaffOpal) {
		tryMutate();
		argStaffOpal.setContactOpal(null);
	}

	protected synchronized void removeStaffOpalInternal(StaffOpal argStaffOpal) {
		tryMutate();
		if (myNewStaffOpalHashSet == null) {
			if (myOldStaffOpalHashSet == null) {
				if (myStaffOpalCachedOperations == null) { myStaffOpalCachedOperations = new java.util.ArrayList<>(); }
				myStaffOpalCachedOperations.add(new CachedOperation<>(CachedOperation.REMOVE, argStaffOpal));
			} else {
				myNewStaffOpalHashSet = new java.util.HashSet<>(myOldStaffOpalHashSet);
				myNewStaffOpalHashSet.remove(argStaffOpal);
			}
		} else {
			myNewStaffOpalHashSet.remove(argStaffOpal);
		}
		return;
	}

	public synchronized int getStaffOpalCount() { return getStaffOpalClass().size(); }

	public synchronized java.util.Iterator<StaffOpal> createStaffOpalIterator() {
		return getStaffOpalClass().iterator();
	}

	public synchronized java.util.stream.Stream<StaffOpal> streamStaffOpal() {
		return getStaffOpalClass().stream();
	}

	public synchronized void clearStaffOpalInternal() { getStaffOpalClass().clear(); }

	@Override
	public String toString() {
		StringBuilder lclSB =  new StringBuilder(64);
		lclSB.append("ContactOpal[");
		lclSB.append("myId=");
		lclSB.append(toStringField(0));
		lclSB.append(']');
		return lclSB.toString();
	}

	@Override
	protected void updateCollectionsAfterReload() {
		assert needsToClearOldCollections() == false;
		setClearOldCollections(true);
	}

}
