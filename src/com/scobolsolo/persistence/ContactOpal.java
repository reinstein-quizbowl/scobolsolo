package com.scobolsolo.persistence;

import com.scobolsolo.application.Contact;

@com.opal.StoreGeneratedPrimaryKey
public final class ContactOpal extends com.opal.UpdatableOpal<Contact> {

	public static final java.lang.Boolean ourDefaultActive = java.lang.Boolean.TRUE;

	private ContactOpal() {
		super();
		setUserFacing(null);
	}

	public ContactOpal(com.opal.IdentityOpalFactory<Contact, ContactOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void applyDefaults() {
		/* Initialize fields with their default values. */
		getNewValues()[7] = ourDefaultActive;


		/* Initialize the back Collections to empty sets. */

		myNewTournamentDirectorTournamentOpalHashSet = new java.util.HashSet<>();
		myNewPlayerOpalFast3Set = new com.siliconage.util.Fast3Set<>();
		myNewMainSchoolRegistrationOpalHashSet = new java.util.HashSet<>();
		myNewStaffOpalFast3Set = new com.siliconage.util.Fast3Set<>();

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

	/* package */ static final com.opal.FieldValidator[] ourFieldValidators = new com.opal.FieldValidator[] {
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
	public com.opal.FieldValidator[] getFieldValidators() { return ourFieldValidators; }

	@Override
	public boolean[] getFieldNullability() { return ourFieldNullability; }

	public static com.opal.FieldValidator[] getStaticFieldValidators() { return ourFieldValidators; }


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
			throw new com.opal.ArgumentTooLongException("Cannot set myEmailAddress on " + this + " to \"" + argEmailAddress + "\" because that field's maximum length is 256.", argEmailAddress.length(), 256);
		}
		getNewValues()[1] = argEmailAddress;
		return this;
	}

	public synchronized ContactOpal setAdvancePhone(final java.lang.String argAdvancePhone) {
		tryMutate();
		if ((argAdvancePhone != null) && (argAdvancePhone.length() > 32)) {
			throw new com.opal.ArgumentTooLongException("Cannot set myAdvancePhone on " + this + " to \"" + argAdvancePhone + "\" because that field's maximum length is 32.", argAdvancePhone.length(), 32);
		}
		getNewValues()[2] = argAdvancePhone;
		return this;
	}

	public synchronized ContactOpal setDayOfPhone(final java.lang.String argDayOfPhone) {
		tryMutate();
		if ((argDayOfPhone != null) && (argDayOfPhone.length() > 32)) {
			throw new com.opal.ArgumentTooLongException("Cannot set myDayOfPhone on " + this + " to \"" + argDayOfPhone + "\" because that field's maximum length is 32.", argDayOfPhone.length(), 32);
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
			throw new com.opal.ArgumentTooLongException("Cannot set myName on " + this + " to \"" + argName + "\" because that field's maximum length is 256.", argName.length(), 256);
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
			throw new com.opal.ArgumentTooLongException("Cannot set mySortBy on " + this + " to \"" + argSortBy + "\" because that field's maximum length is 256.", argSortBy.length(), 256);
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
		myNewPlayerOpalFast3Set = null; /* Necessary if it has been rolled back */
		myPlayerOpalCachedOperations = null; /* Ditto */
		myNewMainSchoolRegistrationOpalHashSet = null; /* Necessary if it has been rolled back */
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
			myOldPlayerOpalFast3Set = null;
			myOldMainSchoolRegistrationOpalHashSet = null;
			myOldStaffOpalFast3Set = null;
		} else {
			if (myNewTournamentDirectorTournamentOpalHashSet != null) {
				if (myNewTournamentDirectorTournamentOpalHashSet.size() > 0) {
					myOldTournamentDirectorTournamentOpalHashSet = myNewTournamentDirectorTournamentOpalHashSet;
				} else {
					myOldTournamentDirectorTournamentOpalHashSet = java.util.Collections.emptySet();
				}
				myNewTournamentDirectorTournamentOpalHashSet = null;
			} else {
				myTournamentDirectorTournamentOpalCachedOperations = null;
			}
			if (myNewPlayerOpalFast3Set != null) {
				if (myNewPlayerOpalFast3Set.size() > 0) {
					myOldPlayerOpalFast3Set = myNewPlayerOpalFast3Set;
				} else {
					myOldPlayerOpalFast3Set = java.util.Collections.emptySet();
				}
				myNewPlayerOpalFast3Set = null;
			} else {
				myPlayerOpalCachedOperations = null;
			}
			if (myNewMainSchoolRegistrationOpalHashSet != null) {
				if (myNewMainSchoolRegistrationOpalHashSet.size() > 0) {
					myOldMainSchoolRegistrationOpalHashSet = myNewMainSchoolRegistrationOpalHashSet;
				} else {
					myOldMainSchoolRegistrationOpalHashSet = java.util.Collections.emptySet();
				}
				myNewMainSchoolRegistrationOpalHashSet = null;
			} else {
				myMainSchoolRegistrationOpalCachedOperations = null;
			}
			if (myNewStaffOpalFast3Set != null) {
				if (myNewStaffOpalFast3Set.size() > 0) {
					myOldStaffOpalFast3Set = myNewStaffOpalFast3Set;
				} else {
					myOldStaffOpalFast3Set = java.util.Collections.emptySet();
				}
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
		if (myNewMainSchoolRegistrationOpalHashSet != null || myMainSchoolRegistrationOpalCachedOperations != null) {
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
	protected void copyFieldsToInternal(com.opal.UpdatableOpal<Contact> argTarget) {
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
	public java.util.Set<com.opal.TransactionAware> getRequiredPriorCommits() {
		return java.util.Collections.emptySet();
	}

	@Override
	public java.util.Set<com.opal.TransactionAware> getRequiredSubsequentCommits() {
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
	public synchronized void output(final java.io.PrintStream argOutput) {
		argOutput.println("Id = " + getIdAsObject());
		argOutput.println("EmailAddress = " + getEmailAddress());
		argOutput.println("AdvancePhone = " + getAdvancePhone());
		argOutput.println("DayOfPhone = " + getDayOfPhone());
		argOutput.println("Note = " + getNote());
		argOutput.println("Name = " + getName());
		argOutput.println("SortBy = " + getSortBy());
		argOutput.println("Active = " + isActiveAsObject());
		argOutput.println("Address = " + getAddress());
	}

	@Override
	public synchronized void output(final java.io.PrintWriter argOutput) {
		argOutput.println("Id = " + getIdAsObject());
		argOutput.println("EmailAddress = " + getEmailAddress());
		argOutput.println("AdvancePhone = " + getAdvancePhone());
		argOutput.println("DayOfPhone = " + getDayOfPhone());
		argOutput.println("Note = " + getNote());
		argOutput.println("Name = " + getName());
		argOutput.println("SortBy = " + getSortBy());
		argOutput.println("Active = " + isActiveAsObject());
		argOutput.println("Address = " + getAddress());
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

	private java.util.Set<TournamentOpal> myOldTournamentDirectorTournamentOpalHashSet = null;
	private java.util.Set<TournamentOpal> myNewTournamentDirectorTournamentOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<TournamentOpal>> myTournamentDirectorTournamentOpalCachedOperations = null;

	/* package */ java.util.Set<TournamentOpal> getTournamentDirectorTournamentOpalHashSet() {
		if (tryAccess()) {
			if (myNewTournamentDirectorTournamentOpalHashSet == null) {
				if (myOldTournamentDirectorTournamentOpalHashSet == null) {
					if (isNew()) {
						myOldTournamentDirectorTournamentOpalHashSet = java.util.Collections.emptySet();
					} else {
						java.util.Set<TournamentOpal> lclS;
						lclS = OpalFactoryFactory.getInstance().getTournamentOpalFactory().forTournamentDirectorContactIdCollection(getIdAsObject());
						myOldTournamentDirectorTournamentOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
					}
				}
				myNewTournamentDirectorTournamentOpalHashSet = new java.util.HashSet<>(myOldTournamentDirectorTournamentOpalHashSet);
				if (myTournamentDirectorTournamentOpalCachedOperations != null) {
					com.opal.OpalUtility.handleCachedOperations(myTournamentDirectorTournamentOpalCachedOperations, myNewTournamentDirectorTournamentOpalHashSet);
					myTournamentDirectorTournamentOpalCachedOperations = null;
				}
			}
			return myNewTournamentDirectorTournamentOpalHashSet;
		} else {
			if (myOldTournamentDirectorTournamentOpalHashSet == null) {
				java.util.Set<TournamentOpal> lclS;
				lclS = OpalFactoryFactory.getInstance().getTournamentOpalFactory().forTournamentDirectorContactIdCollection(getIdAsObject());
				myOldTournamentDirectorTournamentOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
			}
			return myOldTournamentDirectorTournamentOpalHashSet;
		}
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
				myTournamentDirectorTournamentOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.ADD, argTournamentOpal));
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
				myTournamentDirectorTournamentOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.REMOVE, argTournamentOpal));
			} else {
				myNewTournamentDirectorTournamentOpalHashSet = new java.util.HashSet<>(myOldTournamentDirectorTournamentOpalHashSet);
				myNewTournamentDirectorTournamentOpalHashSet.remove(argTournamentOpal);
			}
		} else {
			myNewTournamentDirectorTournamentOpalHashSet.remove(argTournamentOpal);
		}
		return;
	}

	public synchronized int getTournamentDirectorTournamentOpalCount() { return getTournamentDirectorTournamentOpalHashSet().size(); }

	public synchronized java.util.Iterator<TournamentOpal> createTournamentDirectorTournamentOpalIterator() {
		return getTournamentDirectorTournamentOpalHashSet().iterator();
	}

	public synchronized java.util.stream.Stream<TournamentOpal> streamTournamentDirectorTournamentOpal() {
		return getTournamentDirectorTournamentOpalHashSet().stream();
	}

	private java.util.Set<PlayerOpal> myOldPlayerOpalFast3Set = null;
	private java.util.Set<PlayerOpal> myNewPlayerOpalFast3Set = null;
	private java.util.ArrayList<com.opal.CachedOperation<PlayerOpal>> myPlayerOpalCachedOperations = null;

	/* package */ java.util.Set<PlayerOpal> getPlayerOpalFast3Set() {
		if (tryAccess()) {
			if (myNewPlayerOpalFast3Set == null) {
				if (myOldPlayerOpalFast3Set == null) {
					if (isNew()) {
						myOldPlayerOpalFast3Set = java.util.Collections.emptySet();
					} else {
						java.util.Set<PlayerOpal> lclS;
						lclS = OpalFactoryFactory.getInstance().getPlayerOpalFactory().forContactIdCollection(getIdAsObject());
						myOldPlayerOpalFast3Set = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
					}
				}
				myNewPlayerOpalFast3Set = new com.siliconage.util.Fast3Set<>(myOldPlayerOpalFast3Set);
				if (myPlayerOpalCachedOperations != null) {
					com.opal.OpalUtility.handleCachedOperations(myPlayerOpalCachedOperations, myNewPlayerOpalFast3Set);
					myPlayerOpalCachedOperations = null;
				}
			}
			return myNewPlayerOpalFast3Set;
		} else {
			if (myOldPlayerOpalFast3Set == null) {
				java.util.Set<PlayerOpal> lclS;
				lclS = OpalFactoryFactory.getInstance().getPlayerOpalFactory().forContactIdCollection(getIdAsObject());
				myOldPlayerOpalFast3Set = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
			}
			return myOldPlayerOpalFast3Set;
		}
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
				myPlayerOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.ADD, argPlayerOpal));
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
				myPlayerOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.REMOVE, argPlayerOpal));
			} else {
				myNewPlayerOpalFast3Set = new com.siliconage.util.Fast3Set<>(myOldPlayerOpalFast3Set);
				myNewPlayerOpalFast3Set.remove(argPlayerOpal);
			}
		} else {
			myNewPlayerOpalFast3Set.remove(argPlayerOpal);
		}
		return;
	}

	public synchronized int getPlayerOpalCount() { return getPlayerOpalFast3Set().size(); }

	public synchronized java.util.Iterator<PlayerOpal> createPlayerOpalIterator() {
		return getPlayerOpalFast3Set().iterator();
	}

	public synchronized java.util.stream.Stream<PlayerOpal> streamPlayerOpal() {
		return getPlayerOpalFast3Set().stream();
	}

	private java.util.Set<SchoolRegistrationOpal> myOldMainSchoolRegistrationOpalHashSet = null;
	private java.util.Set<SchoolRegistrationOpal> myNewMainSchoolRegistrationOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<SchoolRegistrationOpal>> myMainSchoolRegistrationOpalCachedOperations = null;

	/* package */ java.util.Set<SchoolRegistrationOpal> getMainSchoolRegistrationOpalHashSet() {
		if (tryAccess()) {
			if (myNewMainSchoolRegistrationOpalHashSet == null) {
				if (myOldMainSchoolRegistrationOpalHashSet == null) {
					if (isNew()) {
						myOldMainSchoolRegistrationOpalHashSet = java.util.Collections.emptySet();
					} else {
						java.util.Set<SchoolRegistrationOpal> lclS;
						lclS = OpalFactoryFactory.getInstance().getSchoolRegistrationOpalFactory().forMainContactIdCollection(getIdAsObject());
						myOldMainSchoolRegistrationOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
					}
				}
				myNewMainSchoolRegistrationOpalHashSet = new java.util.HashSet<>(myOldMainSchoolRegistrationOpalHashSet);
				if (myMainSchoolRegistrationOpalCachedOperations != null) {
					com.opal.OpalUtility.handleCachedOperations(myMainSchoolRegistrationOpalCachedOperations, myNewMainSchoolRegistrationOpalHashSet);
					myMainSchoolRegistrationOpalCachedOperations = null;
				}
			}
			return myNewMainSchoolRegistrationOpalHashSet;
		} else {
			if (myOldMainSchoolRegistrationOpalHashSet == null) {
				java.util.Set<SchoolRegistrationOpal> lclS;
				lclS = OpalFactoryFactory.getInstance().getSchoolRegistrationOpalFactory().forMainContactIdCollection(getIdAsObject());
				myOldMainSchoolRegistrationOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
			}
			return myOldMainSchoolRegistrationOpalHashSet;
		}
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
				myMainSchoolRegistrationOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.ADD, argSchoolRegistrationOpal));
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
				myMainSchoolRegistrationOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.REMOVE, argSchoolRegistrationOpal));
			} else {
				myNewMainSchoolRegistrationOpalHashSet = new java.util.HashSet<>(myOldMainSchoolRegistrationOpalHashSet);
				myNewMainSchoolRegistrationOpalHashSet.remove(argSchoolRegistrationOpal);
			}
		} else {
			myNewMainSchoolRegistrationOpalHashSet.remove(argSchoolRegistrationOpal);
		}
		return;
	}

	public synchronized int getMainSchoolRegistrationOpalCount() { return getMainSchoolRegistrationOpalHashSet().size(); }

	public synchronized java.util.Iterator<SchoolRegistrationOpal> createMainSchoolRegistrationOpalIterator() {
		return getMainSchoolRegistrationOpalHashSet().iterator();
	}

	public synchronized java.util.stream.Stream<SchoolRegistrationOpal> streamMainSchoolRegistrationOpal() {
		return getMainSchoolRegistrationOpalHashSet().stream();
	}

	private java.util.Set<StaffOpal> myOldStaffOpalFast3Set = null;
	private java.util.Set<StaffOpal> myNewStaffOpalFast3Set = null;
	private java.util.ArrayList<com.opal.CachedOperation<StaffOpal>> myStaffOpalCachedOperations = null;

	/* package */ java.util.Set<StaffOpal> getStaffOpalFast3Set() {
		if (tryAccess()) {
			if (myNewStaffOpalFast3Set == null) {
				if (myOldStaffOpalFast3Set == null) {
					if (isNew()) {
						myOldStaffOpalFast3Set = java.util.Collections.emptySet();
					} else {
						java.util.Set<StaffOpal> lclS;
						lclS = OpalFactoryFactory.getInstance().getStaffOpalFactory().forContactIdCollection(getIdAsObject());
						myOldStaffOpalFast3Set = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
					}
				}
				myNewStaffOpalFast3Set = new com.siliconage.util.Fast3Set<>(myOldStaffOpalFast3Set);
				if (myStaffOpalCachedOperations != null) {
					com.opal.OpalUtility.handleCachedOperations(myStaffOpalCachedOperations, myNewStaffOpalFast3Set);
					myStaffOpalCachedOperations = null;
				}
			}
			return myNewStaffOpalFast3Set;
		} else {
			if (myOldStaffOpalFast3Set == null) {
				java.util.Set<StaffOpal> lclS;
				lclS = OpalFactoryFactory.getInstance().getStaffOpalFactory().forContactIdCollection(getIdAsObject());
				myOldStaffOpalFast3Set = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
			}
			return myOldStaffOpalFast3Set;
		}
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
				myStaffOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.ADD, argStaffOpal));
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
				myStaffOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.REMOVE, argStaffOpal));
			} else {
				myNewStaffOpalFast3Set = new com.siliconage.util.Fast3Set<>(myOldStaffOpalFast3Set);
				myNewStaffOpalFast3Set.remove(argStaffOpal);
			}
		} else {
			myNewStaffOpalFast3Set.remove(argStaffOpal);
		}
		return;
	}

	public synchronized int getStaffOpalCount() { return getStaffOpalFast3Set().size(); }

	public synchronized java.util.Iterator<StaffOpal> createStaffOpalIterator() {
		return getStaffOpalFast3Set().iterator();
	}

	public synchronized java.util.stream.Stream<StaffOpal> streamStaffOpal() {
		return getStaffOpalFast3Set().stream();
	}

	@Override
	public java.lang.String toString() {
		java.lang.StringBuilder lclSB = new java.lang.StringBuilder(64);
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
