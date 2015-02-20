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

	public synchronized void setEmailAddress(final java.lang.String argEmailAddress) {
		tryMutate();
		if ((argEmailAddress != null) && (argEmailAddress.length() > 256)) {
			throw new com.opal.ArgumentTooLongException("Maximum length of myEmailAddress on " + this + " is 256.", argEmailAddress.length(), 256);
		}
		getNewValues()[1] = argEmailAddress;
		return;
	}

	public synchronized void setAdvancePhone(final java.lang.String argAdvancePhone) {
		tryMutate();
		if ((argAdvancePhone != null) && (argAdvancePhone.length() > 32)) {
			throw new com.opal.ArgumentTooLongException("Maximum length of myAdvancePhone on " + this + " is 32.", argAdvancePhone.length(), 32);
		}
		getNewValues()[2] = argAdvancePhone;
		return;
	}

	public synchronized void setDayOfPhone(final java.lang.String argDayOfPhone) {
		tryMutate();
		if ((argDayOfPhone != null) && (argDayOfPhone.length() > 32)) {
			throw new com.opal.ArgumentTooLongException("Maximum length of myDayOfPhone on " + this + " is 32.", argDayOfPhone.length(), 32);
		}
		getNewValues()[3] = argDayOfPhone;
		return;
	}

	public synchronized void setNote(final java.lang.String argNote) {
		tryMutate();
		getNewValues()[4] = argNote;
		return;
	}

	public synchronized void setName(final java.lang.String argName) {
		tryMutate();
		if (argName == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myName on " + this + " to null.");
		}
		if (argName.length() > 256) {
			throw new com.opal.ArgumentTooLongException("Maximum length of myName on " + this + " is 256.", argName.length(), 256);
		}
		getNewValues()[5] = argName;
		return;
	}

	public synchronized void setSortBy(final java.lang.String argSortBy) {
		tryMutate();
		if (argSortBy == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set mySortBy on " + this + " to null.");
		}
		if (argSortBy.length() > 256) {
			throw new com.opal.ArgumentTooLongException("Maximum length of mySortBy on " + this + " is 256.", argSortBy.length(), 256);
		}
		getNewValues()[6] = argSortBy;
		return;
	}

	public synchronized void setActive(final java.lang.Boolean argActive) {
		tryMutate();
		if (argActive == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myActive on " + this + " to null.");
		}
		getNewValues()[7] = argActive;
		return;
	}

	public void setActive(final boolean argActive) {
		setActive(argActive ? Boolean.TRUE : Boolean.FALSE);
		return;
	}

	public synchronized void setAddress(final java.lang.String argAddress) {
		tryMutate();
		getNewValues()[8] = argAddress;
		return;
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
		myNewPlayerOpalFast3Set = null; /* Necessary if it has been rolled back */
		myPlayerOpalCachedOperations = null; /* Ditto */
		myNewMainSchoolRegistrationOpalFast3Set = null; /* Necessary if it has been rolled back */
		myMainSchoolRegistrationOpalCachedOperations = null; /* Ditto */
		myNewStaffOpalFast3Set = null; /* Necessary if it has been rolled back */
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
			myOldPlayerOpalFast3Set = null;
			} else {
			if (myNewPlayerOpalFast3Set != null) {
				myOldPlayerOpalFast3Set = myNewPlayerOpalFast3Set;
				myNewPlayerOpalFast3Set = null;
			} else {
				myPlayerOpalCachedOperations = null;
			}
		}
		if (needsToClearOldCollections()) {
			myOldMainSchoolRegistrationOpalFast3Set = null;
			} else {
			if (myNewMainSchoolRegistrationOpalFast3Set != null) {
				myOldMainSchoolRegistrationOpalFast3Set = myNewMainSchoolRegistrationOpalFast3Set;
				myNewMainSchoolRegistrationOpalFast3Set = null;
			} else {
				myMainSchoolRegistrationOpalCachedOperations = null;
			}
		}
		if (needsToClearOldCollections()) {
			myOldStaffOpalFast3Set = null;
			} else {
			if (myNewStaffOpalFast3Set != null) {
				myOldStaffOpalFast3Set = myNewStaffOpalFast3Set;
				myNewStaffOpalFast3Set = null;
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
		if (myNewPlayerOpalFast3Set != null || myPlayerOpalCachedOperations != null) {
			lclI = createPlayerOpalIterator();
			while (lclI.hasNext()) {
				((PlayerOpal) lclI.next()).setContactOpalInternal(null);
			}
		}
		if (myNewMainSchoolRegistrationOpalFast3Set != null || myMainSchoolRegistrationOpalCachedOperations != null) {
			lclI = createMainSchoolRegistrationOpalIterator();
			while (lclI.hasNext()) {
				((SchoolRegistrationOpal) lclI.next()).setMainContactOpalInternal(null);
			}
		}
		if (myNewStaffOpalFast3Set != null || myStaffOpalCachedOperations != null) {
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

	public synchronized void setAccountOpal(AccountOpal argAccountOpal) {
		tryMutate();
		myNewAccountOpal = argAccountOpal;
		if (argAccountOpal != null) {
			argAccountOpal.setContactOpalInternal(this);
		}
		return;
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

	private com.siliconage.util.Fast3Set<PlayerOpal> myOldPlayerOpalFast3Set = null;
	private com.siliconage.util.Fast3Set<PlayerOpal> myNewPlayerOpalFast3Set = null;
	private java.util.ArrayList<CachedOperation<PlayerOpal>> myPlayerOpalCachedOperations = null;

	/* package */ com.siliconage.util.Fast3Set<PlayerOpal> getPlayerOpalClass() {
		if (tryAccess()) {
			if (myNewPlayerOpalFast3Set == null) {
				if (myOldPlayerOpalFast3Set == null) {
					myOldPlayerOpalFast3Set = OpalFactoryFactory.getInstance().getPlayerOpalFactory().forContactIdCollection(getIdAsObject());
				}
				myNewPlayerOpalFast3Set = new com.siliconage.util.Fast3Set<>(myOldPlayerOpalFast3Set);
				if (myPlayerOpalCachedOperations != null) {
					OpalUtility.handleCachedOperations(myPlayerOpalCachedOperations, myNewPlayerOpalFast3Set);
					myPlayerOpalCachedOperations = null;
				}
			}
			return myNewPlayerOpalFast3Set;
		}
		if (myOldPlayerOpalFast3Set == null) {
			myOldPlayerOpalFast3Set = OpalFactoryFactory.getInstance().getPlayerOpalFactory().forContactIdCollection(getIdAsObject());
		}
		return myOldPlayerOpalFast3Set;
	}

	public synchronized void addPlayerOpal(PlayerOpal argPlayerOpal) {
		tryMutate();
		argPlayerOpal.setContactOpal(this);
		return;
	}

	protected synchronized void addPlayerOpalInternal(PlayerOpal argPlayerOpal) {
		tryMutate();
		if (myNewPlayerOpalFast3Set == null) {
			if (myOldPlayerOpalFast3Set == null) {
				if (myPlayerOpalCachedOperations == null) { myPlayerOpalCachedOperations = new java.util.ArrayList<>(); }
				myPlayerOpalCachedOperations.add(new CachedOperation<>(CachedOperation.ADD, argPlayerOpal));
			} else {
				myNewPlayerOpalFast3Set = new com.siliconage.util.Fast3Set<>(myOldPlayerOpalFast3Set);
				myNewPlayerOpalFast3Set.add(argPlayerOpal);
			}
		} else {
			myNewPlayerOpalFast3Set.add(argPlayerOpal);
		}
		return;
	}

	public synchronized void removePlayerOpal(PlayerOpal argPlayerOpal) {
		tryMutate();
		argPlayerOpal.setContactOpal(null);
	}

	protected synchronized void removePlayerOpalInternal(PlayerOpal argPlayerOpal) {
		tryMutate();
		if (myNewPlayerOpalFast3Set == null) {
			if (myOldPlayerOpalFast3Set == null) {
				if (myPlayerOpalCachedOperations == null) { myPlayerOpalCachedOperations = new java.util.ArrayList<>(); }
				myPlayerOpalCachedOperations.add(new CachedOperation<>(CachedOperation.REMOVE, argPlayerOpal));
			} else {
				myNewPlayerOpalFast3Set = new com.siliconage.util.Fast3Set<>(myOldPlayerOpalFast3Set);
				myNewPlayerOpalFast3Set.remove(argPlayerOpal);
			}
		} else {
			myNewPlayerOpalFast3Set.remove(argPlayerOpal);
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

	private com.siliconage.util.Fast3Set<SchoolRegistrationOpal> myOldMainSchoolRegistrationOpalFast3Set = null;
	private com.siliconage.util.Fast3Set<SchoolRegistrationOpal> myNewMainSchoolRegistrationOpalFast3Set = null;
	private java.util.ArrayList<CachedOperation<SchoolRegistrationOpal>> myMainSchoolRegistrationOpalCachedOperations = null;

	/* package */ com.siliconage.util.Fast3Set<SchoolRegistrationOpal> getMainSchoolRegistrationOpalClass() {
		if (tryAccess()) {
			if (myNewMainSchoolRegistrationOpalFast3Set == null) {
				if (myOldMainSchoolRegistrationOpalFast3Set == null) {
					myOldMainSchoolRegistrationOpalFast3Set = OpalFactoryFactory.getInstance().getSchoolRegistrationOpalFactory().forMainContactIdCollection(getIdAsObject());
				}
				myNewMainSchoolRegistrationOpalFast3Set = new com.siliconage.util.Fast3Set<>(myOldMainSchoolRegistrationOpalFast3Set);
				if (myMainSchoolRegistrationOpalCachedOperations != null) {
					OpalUtility.handleCachedOperations(myMainSchoolRegistrationOpalCachedOperations, myNewMainSchoolRegistrationOpalFast3Set);
					myMainSchoolRegistrationOpalCachedOperations = null;
				}
			}
			return myNewMainSchoolRegistrationOpalFast3Set;
		}
		if (myOldMainSchoolRegistrationOpalFast3Set == null) {
			myOldMainSchoolRegistrationOpalFast3Set = OpalFactoryFactory.getInstance().getSchoolRegistrationOpalFactory().forMainContactIdCollection(getIdAsObject());
		}
		return myOldMainSchoolRegistrationOpalFast3Set;
	}

	public synchronized void addMainSchoolRegistrationOpal(SchoolRegistrationOpal argSchoolRegistrationOpal) {
		tryMutate();
		argSchoolRegistrationOpal.setMainContactOpal(this);
		return;
	}

	protected synchronized void addMainSchoolRegistrationOpalInternal(SchoolRegistrationOpal argSchoolRegistrationOpal) {
		tryMutate();
		if (myNewMainSchoolRegistrationOpalFast3Set == null) {
			if (myOldMainSchoolRegistrationOpalFast3Set == null) {
				if (myMainSchoolRegistrationOpalCachedOperations == null) { myMainSchoolRegistrationOpalCachedOperations = new java.util.ArrayList<>(); }
				myMainSchoolRegistrationOpalCachedOperations.add(new CachedOperation<>(CachedOperation.ADD, argSchoolRegistrationOpal));
			} else {
				myNewMainSchoolRegistrationOpalFast3Set = new com.siliconage.util.Fast3Set<>(myOldMainSchoolRegistrationOpalFast3Set);
				myNewMainSchoolRegistrationOpalFast3Set.add(argSchoolRegistrationOpal);
			}
		} else {
			myNewMainSchoolRegistrationOpalFast3Set.add(argSchoolRegistrationOpal);
		}
		return;
	}

	public synchronized void removeMainSchoolRegistrationOpal(SchoolRegistrationOpal argSchoolRegistrationOpal) {
		tryMutate();
		argSchoolRegistrationOpal.setMainContactOpal(null);
	}

	protected synchronized void removeMainSchoolRegistrationOpalInternal(SchoolRegistrationOpal argSchoolRegistrationOpal) {
		tryMutate();
		if (myNewMainSchoolRegistrationOpalFast3Set == null) {
			if (myOldMainSchoolRegistrationOpalFast3Set == null) {
				if (myMainSchoolRegistrationOpalCachedOperations == null) { myMainSchoolRegistrationOpalCachedOperations = new java.util.ArrayList<>(); }
				myMainSchoolRegistrationOpalCachedOperations.add(new CachedOperation<>(CachedOperation.REMOVE, argSchoolRegistrationOpal));
			} else {
				myNewMainSchoolRegistrationOpalFast3Set = new com.siliconage.util.Fast3Set<>(myOldMainSchoolRegistrationOpalFast3Set);
				myNewMainSchoolRegistrationOpalFast3Set.remove(argSchoolRegistrationOpal);
			}
		} else {
			myNewMainSchoolRegistrationOpalFast3Set.remove(argSchoolRegistrationOpal);
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

	private com.siliconage.util.Fast3Set<StaffOpal> myOldStaffOpalFast3Set = null;
	private com.siliconage.util.Fast3Set<StaffOpal> myNewStaffOpalFast3Set = null;
	private java.util.ArrayList<CachedOperation<StaffOpal>> myStaffOpalCachedOperations = null;

	/* package */ com.siliconage.util.Fast3Set<StaffOpal> getStaffOpalClass() {
		if (tryAccess()) {
			if (myNewStaffOpalFast3Set == null) {
				if (myOldStaffOpalFast3Set == null) {
					myOldStaffOpalFast3Set = OpalFactoryFactory.getInstance().getStaffOpalFactory().forContactIdCollection(getIdAsObject());
				}
				myNewStaffOpalFast3Set = new com.siliconage.util.Fast3Set<>(myOldStaffOpalFast3Set);
				if (myStaffOpalCachedOperations != null) {
					OpalUtility.handleCachedOperations(myStaffOpalCachedOperations, myNewStaffOpalFast3Set);
					myStaffOpalCachedOperations = null;
				}
			}
			return myNewStaffOpalFast3Set;
		}
		if (myOldStaffOpalFast3Set == null) {
			myOldStaffOpalFast3Set = OpalFactoryFactory.getInstance().getStaffOpalFactory().forContactIdCollection(getIdAsObject());
		}
		return myOldStaffOpalFast3Set;
	}

	public synchronized void addStaffOpal(StaffOpal argStaffOpal) {
		tryMutate();
		argStaffOpal.setContactOpal(this);
		return;
	}

	protected synchronized void addStaffOpalInternal(StaffOpal argStaffOpal) {
		tryMutate();
		if (myNewStaffOpalFast3Set == null) {
			if (myOldStaffOpalFast3Set == null) {
				if (myStaffOpalCachedOperations == null) { myStaffOpalCachedOperations = new java.util.ArrayList<>(); }
				myStaffOpalCachedOperations.add(new CachedOperation<>(CachedOperation.ADD, argStaffOpal));
			} else {
				myNewStaffOpalFast3Set = new com.siliconage.util.Fast3Set<>(myOldStaffOpalFast3Set);
				myNewStaffOpalFast3Set.add(argStaffOpal);
			}
		} else {
			myNewStaffOpalFast3Set.add(argStaffOpal);
		}
		return;
	}

	public synchronized void removeStaffOpal(StaffOpal argStaffOpal) {
		tryMutate();
		argStaffOpal.setContactOpal(null);
	}

	protected synchronized void removeStaffOpalInternal(StaffOpal argStaffOpal) {
		tryMutate();
		if (myNewStaffOpalFast3Set == null) {
			if (myOldStaffOpalFast3Set == null) {
				if (myStaffOpalCachedOperations == null) { myStaffOpalCachedOperations = new java.util.ArrayList<>(); }
				myStaffOpalCachedOperations.add(new CachedOperation<>(CachedOperation.REMOVE, argStaffOpal));
			} else {
				myNewStaffOpalFast3Set = new com.siliconage.util.Fast3Set<>(myOldStaffOpalFast3Set);
				myNewStaffOpalFast3Set.remove(argStaffOpal);
			}
		} else {
			myNewStaffOpalFast3Set.remove(argStaffOpal);
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
