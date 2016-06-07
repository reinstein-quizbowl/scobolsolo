package com.scobolsolo.persistence;

import com.scobolsolo.application.SchoolRegistration;

@com.opal.StoreGeneratedPrimaryKey
public final class SchoolRegistrationOpal extends com.opal.UpdatableOpal<SchoolRegistration> {

	public static final java.math.BigDecimal ourDefaultAmountOwed = java.math.BigDecimal.valueOf(0.0);
	public static final java.math.BigDecimal ourDefaultAmountPaid = java.math.BigDecimal.valueOf(0.0);

	private SchoolRegistrationOpal() {
		super();
		setUserFacing(null);
	}

	public SchoolRegistrationOpal(com.opal.IdentityOpalFactory<SchoolRegistration, SchoolRegistrationOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void applyDefaults() {
		/* Initialize fields with their default values. */
		getNewValues()[3] = ourDefaultAmountOwed;
		getNewValues()[4] = ourDefaultAmountPaid;


		/* Initialize the back Collections to empty sets. */

		myNewStandbyEntryOpalFast3Set = new com.siliconage.util.Fast3Set<>();
		myNewPlayerOpalHashSet = new java.util.HashSet<>();
		myNewBuzzerOpalFast3Set = new com.siliconage.util.Fast3Set<>();
		myNewWaitlistEntryOpalFast3Set = new com.siliconage.util.Fast3Set<>();
		myNewStaffOpalFast3Set = new com.siliconage.util.Fast3Set<>();

		return;
	}

	@Override
	protected void initializeReferences() {
		myOldMainContactOpal = ContactOpal.NOT_YET_LOADED;
		myOldSchoolOpal = SchoolOpal.NOT_YET_LOADED;
		myOldTournamentOpal = TournamentOpal.NOT_YET_LOADED;
		return;
	}

	/* package */ static final String[] ourFieldNames = new String[] {
		"Id",
		"SchoolId",
		"MainContactId",
		"AmountOwed",
		"AmountPaid",
		"Note",
		"SpotsReserved",
		"TournamentCode",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.math.BigDecimal.class,
		java.math.BigDecimal.class,
		java.lang.String.class,
		java.lang.Integer.class,
		java.lang.String.class,
	};

	/* package */ static final boolean[] ourFieldNullability = new boolean[] {
		false,
		false,
		false,
		false,
		false,
		true,
		false,
		false,
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
	};

	public static final SchoolRegistrationOpal NOT_YET_LOADED = new SchoolRegistrationOpal();

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

	public synchronized java.lang.Integer getSchoolIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[1];
	}

	public synchronized java.lang.Integer getMainContactIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[2];
	}

	public synchronized java.math.BigDecimal getAmountOwed() {
		return (java.math.BigDecimal) getReadValueSet()[3];
	}

	public synchronized java.math.BigDecimal getAmountPaid() {
		return (java.math.BigDecimal) getReadValueSet()[4];
	}

	public synchronized java.lang.String getNote() {
		return (java.lang.String) getReadValueSet()[5];
	}

	public synchronized java.lang.Integer getSpotsReservedAsObject() {
		return (java.lang.Integer) getReadValueSet()[6];
	}

	public synchronized java.lang.String getTournamentCode() {
		return (java.lang.String) getReadValueSet()[7];
	}

	public synchronized SchoolRegistrationOpal setId(final java.lang.Integer argId) {
		tryMutate();
		if (argId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myId on " + this + " to null.");
		}
		getNewValues()[0] = argId;
		return this;
	}

	public SchoolRegistrationOpal setId(final int argId) {
		setId(java.lang.Integer.valueOf(argId));
		return this;
	}

	public synchronized SchoolRegistrationOpal setSchoolId(final java.lang.Integer argSchoolId) {
		tryMutate();
		if (argSchoolId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set mySchoolId on " + this + " to null.");
		}
		getNewValues()[1] = argSchoolId;
		return this;
	}

	public SchoolRegistrationOpal setSchoolId(final int argSchoolId) {
		setSchoolId(java.lang.Integer.valueOf(argSchoolId));
		return this;
	}

	public synchronized SchoolRegistrationOpal setMainContactId(final java.lang.Integer argMainContactId) {
		tryMutate();
		if (argMainContactId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myMainContactId on " + this + " to null.");
		}
		getNewValues()[2] = argMainContactId;
		return this;
	}

	public SchoolRegistrationOpal setMainContactId(final int argMainContactId) {
		setMainContactId(java.lang.Integer.valueOf(argMainContactId));
		return this;
	}

	public synchronized SchoolRegistrationOpal setAmountOwed(final java.math.BigDecimal argAmountOwed) {
		tryMutate();
		if (argAmountOwed == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myAmountOwed on " + this + " to null.");
		}
		getNewValues()[3] = argAmountOwed;
		return this;
	}

	public synchronized SchoolRegistrationOpal setAmountPaid(final java.math.BigDecimal argAmountPaid) {
		tryMutate();
		if (argAmountPaid == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myAmountPaid on " + this + " to null.");
		}
		getNewValues()[4] = argAmountPaid;
		return this;
	}

	public synchronized SchoolRegistrationOpal setNote(final java.lang.String argNote) {
		tryMutate();
		getNewValues()[5] = argNote;
		return this;
	}

	public synchronized SchoolRegistrationOpal setSpotsReserved(final java.lang.Integer argSpotsReserved) {
		tryMutate();
		if (argSpotsReserved == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set mySpotsReserved on " + this + " to null.");
		}
		getNewValues()[6] = argSpotsReserved;
		return this;
	}

	public SchoolRegistrationOpal setSpotsReserved(final int argSpotsReserved) {
		setSpotsReserved(java.lang.Integer.valueOf(argSpotsReserved));
		return this;
	}

	public synchronized SchoolRegistrationOpal setTournamentCode(final java.lang.String argTournamentCode) {
		tryMutate();
		if (argTournamentCode == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myTournamentCode on " + this + " to null.");
		}
		if (argTournamentCode.length() > 32) {
			throw new com.opal.ArgumentTooLongException("Cannot set myTournamentCode on " + this + " to \"" + argTournamentCode + "\" because that field's maximum length is 32.", argTournamentCode.length(), 32);
		}
		getNewValues()[7] = argTournamentCode;
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
		myNewMainContactOpal = myOldMainContactOpal;
		myNewSchoolOpal = myOldSchoolOpal;
		myNewTournamentOpal = myOldTournamentOpal;
		myNewStandbyEntryOpalFast3Set = null; /* Necessary if it has been rolled back */
		myStandbyEntryOpalCachedOperations = null; /* Ditto */
		myNewPlayerOpalHashSet = null; /* Necessary if it has been rolled back */
		myPlayerOpalCachedOperations = null; /* Ditto */
		myNewBuzzerOpalFast3Set = null; /* Necessary if it has been rolled back */
		myBuzzerOpalCachedOperations = null; /* Ditto */
		myNewWaitlistEntryOpalFast3Set = null; /* Necessary if it has been rolled back */
		myWaitlistEntryOpalCachedOperations = null; /* Ditto */
		myNewStaffOpalFast3Set = null; /* Necessary if it has been rolled back */
		myStaffOpalCachedOperations = null; /* Ditto */
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		myOldMainContactOpal = myNewMainContactOpal;
		myOldSchoolOpal = myNewSchoolOpal;
		myOldTournamentOpal = myNewTournamentOpal;

		if (needsToClearOldCollections()) {
			myOldStandbyEntryOpalFast3Set = null;
			myOldPlayerOpalHashSet = null;
			myOldBuzzerOpalFast3Set = null;
			myOldWaitlistEntryOpalFast3Set = null;
			myOldStaffOpalFast3Set = null;
		} else {
			if (myNewStandbyEntryOpalFast3Set != null) {
				if (myNewStandbyEntryOpalFast3Set.size() > 0) {
					myOldStandbyEntryOpalFast3Set = myNewStandbyEntryOpalFast3Set;
				} else {
					myOldStandbyEntryOpalFast3Set = java.util.Collections.emptySet();
				}
				myNewStandbyEntryOpalFast3Set = null;
			} else {
				myStandbyEntryOpalCachedOperations = null;
			}
			if (myNewPlayerOpalHashSet != null) {
				if (myNewPlayerOpalHashSet.size() > 0) {
					myOldPlayerOpalHashSet = myNewPlayerOpalHashSet;
				} else {
					myOldPlayerOpalHashSet = java.util.Collections.emptySet();
				}
				myNewPlayerOpalHashSet = null;
			} else {
				myPlayerOpalCachedOperations = null;
			}
			if (myNewBuzzerOpalFast3Set != null) {
				if (myNewBuzzerOpalFast3Set.size() > 0) {
					myOldBuzzerOpalFast3Set = myNewBuzzerOpalFast3Set;
				} else {
					myOldBuzzerOpalFast3Set = java.util.Collections.emptySet();
				}
				myNewBuzzerOpalFast3Set = null;
			} else {
				myBuzzerOpalCachedOperations = null;
			}
			if (myNewWaitlistEntryOpalFast3Set != null) {
				if (myNewWaitlistEntryOpalFast3Set.size() > 0) {
					myOldWaitlistEntryOpalFast3Set = myNewWaitlistEntryOpalFast3Set;
				} else {
					myOldWaitlistEntryOpalFast3Set = java.util.Collections.emptySet();
				}
				myNewWaitlistEntryOpalFast3Set = null;
			} else {
				myWaitlistEntryOpalCachedOperations = null;
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
		if (myNewStandbyEntryOpalFast3Set != null || myStandbyEntryOpalCachedOperations != null) {
			lclI = createStandbyEntryOpalIterator();
			while (lclI.hasNext()) {
				((StandbyEntryOpal) lclI.next()).setSchoolRegistrationOpalInternal(null);
			}
		}
		if (myNewPlayerOpalHashSet != null || myPlayerOpalCachedOperations != null) {
			lclI = createPlayerOpalIterator();
			while (lclI.hasNext()) {
				((PlayerOpal) lclI.next()).setSchoolRegistrationOpalInternal(null);
			}
		}
		if (myNewBuzzerOpalFast3Set != null || myBuzzerOpalCachedOperations != null) {
			lclI = createBuzzerOpalIterator();
			while (lclI.hasNext()) {
				((BuzzerOpal) lclI.next()).setSchoolRegistrationOpalInternal(null);
			}
		}
		if (myNewWaitlistEntryOpalFast3Set != null || myWaitlistEntryOpalCachedOperations != null) {
			lclI = createWaitlistEntryOpalIterator();
			while (lclI.hasNext()) {
				((WaitlistEntryOpal) lclI.next()).setSchoolRegistrationOpalInternal(null);
			}
		}
		if (myNewStaffOpalFast3Set != null || myStaffOpalCachedOperations != null) {
			lclI = createStaffOpalIterator();
			while (lclI.hasNext()) {
				((StaffOpal) lclI.next()).setSchoolRegistrationOpalInternal(null);
			}
		}
		if (getMainContactOpal() != null) {
			getMainContactOpal().removeMainSchoolRegistrationOpalInternal(this);
		}
		if (getSchoolOpal() != null) {
			getSchoolOpal().removeSchoolRegistrationOpalInternal(this);
		}
		if (getTournamentOpal() != null) {
			getTournamentOpal().removeSchoolRegistrationOpalInternal(this);
		}
		return;
	}

	@Override
	protected void copyFieldsToInternal(com.opal.UpdatableOpal<SchoolRegistration> argTarget) {
		Object[] lclValues = getReadValueSet();
		Object[] lclTargetNewValues = argTarget.getNewValues();
		/* Field 0 (Id) is database generated. */
		lclTargetNewValues[1] = lclValues[1]; /* SchoolId (immutable) */
		lclTargetNewValues[2] = lclValues[2]; /* MainContactId (immutable) */
		lclTargetNewValues[3] = lclValues[3]; /* AmountOwed (immutable) */
		lclTargetNewValues[4] = lclValues[4]; /* AmountPaid (immutable) */
		lclTargetNewValues[5] = lclValues[5]; /* Note (immutable) */
		lclTargetNewValues[6] = lclValues[6]; /* SpotsReserved (immutable) */
		lclTargetNewValues[7] = lclValues[7]; /* TournamentCode (immutable) */

		return;
	}

	@Override
	public synchronized void translateReferencesToFields() {
		if (myNewMainContactOpal != ContactOpal.NOT_YET_LOADED) {
			setMainContactId(myNewMainContactOpal == null ? null : myNewMainContactOpal.getIdAsObject());
		}
		if (myNewSchoolOpal != SchoolOpal.NOT_YET_LOADED) {
			setSchoolId(myNewSchoolOpal == null ? null : myNewSchoolOpal.getIdAsObject());
		}
		if (myNewTournamentOpal != TournamentOpal.NOT_YET_LOADED) {
			setTournamentCode(myNewTournamentOpal == null ? null : myNewTournamentOpal.getCode());
		}
		return;
	}

	@Override
	public java.util.Set<com.opal.TransactionAware> getRequiredPriorCommits() {
		java.util.Set<com.opal.TransactionAware> lclTAs = null;
		com.opal.UpdatableOpal<?> lclUO;
		lclUO = myNewMainContactOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		lclUO = myNewSchoolOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		lclUO = myNewTournamentOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		return (lclTAs != null) && (lclTAs.size() > 0) ? lclTAs : java.util.Collections.emptySet();
	}

	@Override
	public java.util.Set<com.opal.TransactionAware> getRequiredSubsequentCommits() {
		if (isNew()) {
			return java.util.Collections.emptySet();
		}
		java.util.Set<com.opal.TransactionAware> lclTAs = null;
		com.opal.UpdatableOpal<?> lclUO;
		if ((lclUO = myOldMainContactOpal) == ContactOpal.NOT_YET_LOADED) {
			lclUO = myOldMainContactOpal = retrieveMainContactOpal(getOldValues());
		}
		if (lclUO != null && lclUO.isDeleted()) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		if ((lclUO = myOldSchoolOpal) == SchoolOpal.NOT_YET_LOADED) {
			lclUO = myOldSchoolOpal = retrieveSchoolOpal(getOldValues());
		}
		if (lclUO != null && lclUO.isDeleted()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		if ((lclUO = myOldTournamentOpal) == TournamentOpal.NOT_YET_LOADED) {
			lclUO = myOldTournamentOpal = retrieveTournamentOpal(getOldValues());
		}
		if (lclUO != null && lclUO.isDeleted()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
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
	public synchronized void output(final java.io.PrintStream argOutput) {
		argOutput.println("Id = " + getIdAsObject());
		argOutput.println("SchoolId = " + getSchoolIdAsObject());
		argOutput.println("MainContactId = " + getMainContactIdAsObject());
		argOutput.println("AmountOwed = " + getAmountOwed());
		argOutput.println("AmountPaid = " + getAmountPaid());
		argOutput.println("Note = " + getNote());
		argOutput.println("SpotsReserved = " + getSpotsReservedAsObject());
		argOutput.println("TournamentCode = " + getTournamentCode());
	}

	@Override
	public synchronized void output(final java.io.PrintWriter argOutput) {
		argOutput.println("Id = " + getIdAsObject());
		argOutput.println("SchoolId = " + getSchoolIdAsObject());
		argOutput.println("MainContactId = " + getMainContactIdAsObject());
		argOutput.println("AmountOwed = " + getAmountOwed());
		argOutput.println("AmountPaid = " + getAmountPaid());
		argOutput.println("Note = " + getNote());
		argOutput.println("SpotsReserved = " + getSpotsReservedAsObject());
		argOutput.println("TournamentCode = " + getTournamentCode());
	}

	private ContactOpal myOldMainContactOpal;
	private ContactOpal myNewMainContactOpal;

	protected ContactOpal retrieveMainContactOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[2] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getContactOpalFactory().forId(getMainContactIdAsObject());
	}

	public synchronized ContactOpal getMainContactOpal() {
		ContactOpal lclContactOpal;
		boolean lclAccess = tryAccess();
		lclContactOpal = lclAccess ? myNewMainContactOpal : myOldMainContactOpal;
		if (lclContactOpal == ContactOpal.NOT_YET_LOADED) {
			lclContactOpal = retrieveMainContactOpal(getReadValueSet());
			if (lclAccess) {
				myNewMainContactOpal = lclContactOpal;
			} else {
				myOldMainContactOpal = lclContactOpal;
			}
		}
		return lclContactOpal;
	}

	public synchronized SchoolRegistrationOpal setMainContactOpal(ContactOpal argContactOpal) {
		tryMutate();
		ContactOpal lclContactOpal = getMainContactOpal();
		if (lclContactOpal == argContactOpal) { return this; }
		if (lclContactOpal != null) {
			lclContactOpal.removeMainSchoolRegistrationOpalInternal(this);
		}
		myNewMainContactOpal = argContactOpal;
		if (argContactOpal != null) {
			argContactOpal.addMainSchoolRegistrationOpalInternal(this);
		}
		return this;
	}

	protected synchronized void setMainContactOpalInternal(ContactOpal argContactOpal) {
		tryMutate();
		myNewMainContactOpal = argContactOpal;
	}

	private SchoolOpal myOldSchoolOpal;
	private SchoolOpal myNewSchoolOpal;

	protected SchoolOpal retrieveSchoolOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[1] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getSchoolOpalFactory().forId(getSchoolIdAsObject());
	}

	public synchronized SchoolOpal getSchoolOpal() {
		SchoolOpal lclSchoolOpal;
		boolean lclAccess = tryAccess();
		lclSchoolOpal = lclAccess ? myNewSchoolOpal : myOldSchoolOpal;
		if (lclSchoolOpal == SchoolOpal.NOT_YET_LOADED) {
			lclSchoolOpal = retrieveSchoolOpal(getReadValueSet());
			if (lclAccess) {
				myNewSchoolOpal = lclSchoolOpal;
			} else {
				myOldSchoolOpal = lclSchoolOpal;
			}
		}
		return lclSchoolOpal;
	}

	public synchronized SchoolRegistrationOpal setSchoolOpal(SchoolOpal argSchoolOpal) {
		tryMutate();
		SchoolOpal lclSchoolOpal = getSchoolOpal();
		if (lclSchoolOpal == argSchoolOpal) { return this; }
		if (lclSchoolOpal != null) {
			lclSchoolOpal.removeSchoolRegistrationOpalInternal(this);
		}
		myNewSchoolOpal = argSchoolOpal;
		if (argSchoolOpal != null) {
			argSchoolOpal.addSchoolRegistrationOpalInternal(this);
		}
		return this;
	}

	protected synchronized void setSchoolOpalInternal(SchoolOpal argSchoolOpal) {
		tryMutate();
		myNewSchoolOpal = argSchoolOpal;
	}

	private TournamentOpal myOldTournamentOpal;
	private TournamentOpal myNewTournamentOpal;

	protected TournamentOpal retrieveTournamentOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[7] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getTournamentOpalFactory().forCode(getTournamentCode());
	}

	public synchronized TournamentOpal getTournamentOpal() {
		TournamentOpal lclTournamentOpal;
		boolean lclAccess = tryAccess();
		lclTournamentOpal = lclAccess ? myNewTournamentOpal : myOldTournamentOpal;
		if (lclTournamentOpal == TournamentOpal.NOT_YET_LOADED) {
			lclTournamentOpal = retrieveTournamentOpal(getReadValueSet());
			if (lclAccess) {
				myNewTournamentOpal = lclTournamentOpal;
			} else {
				myOldTournamentOpal = lclTournamentOpal;
			}
		}
		return lclTournamentOpal;
	}

	public synchronized SchoolRegistrationOpal setTournamentOpal(TournamentOpal argTournamentOpal) {
		tryMutate();
		TournamentOpal lclTournamentOpal = getTournamentOpal();
		if (lclTournamentOpal == argTournamentOpal) { return this; }
		if (lclTournamentOpal != null) {
			lclTournamentOpal.removeSchoolRegistrationOpalInternal(this);
		}
		myNewTournamentOpal = argTournamentOpal;
		if (argTournamentOpal != null) {
			argTournamentOpal.addSchoolRegistrationOpalInternal(this);
		}
		return this;
	}

	protected synchronized void setTournamentOpalInternal(TournamentOpal argTournamentOpal) {
		tryMutate();
		myNewTournamentOpal = argTournamentOpal;
	}

	private java.util.Set<StandbyEntryOpal> myOldStandbyEntryOpalFast3Set = null;
	private java.util.Set<StandbyEntryOpal> myNewStandbyEntryOpalFast3Set = null;
	private java.util.ArrayList<com.opal.CachedOperation<StandbyEntryOpal>> myStandbyEntryOpalCachedOperations = null;

	/* package */ java.util.Set<StandbyEntryOpal> getStandbyEntryOpalFast3Set() {
		if (tryAccess()) {
			if (myNewStandbyEntryOpalFast3Set == null) {
				if (myOldStandbyEntryOpalFast3Set == null) {
					if (isNew()) {
						myOldStandbyEntryOpalFast3Set = java.util.Collections.emptySet();
					} else {
						java.util.Set<StandbyEntryOpal> lclS;
						lclS = OpalFactoryFactory.getInstance().getStandbyEntryOpalFactory().forSchoolRegistrationIdCollection(getIdAsObject());
						myOldStandbyEntryOpalFast3Set = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
					}
				}
				myNewStandbyEntryOpalFast3Set = new com.siliconage.util.Fast3Set<>(myOldStandbyEntryOpalFast3Set);
				if (myStandbyEntryOpalCachedOperations != null) {
					com.opal.OpalUtility.handleCachedOperations(myStandbyEntryOpalCachedOperations, myNewStandbyEntryOpalFast3Set);
					myStandbyEntryOpalCachedOperations = null;
				}
			}
			return myNewStandbyEntryOpalFast3Set;
		} else {
			if (myOldStandbyEntryOpalFast3Set == null) {
				java.util.Set<StandbyEntryOpal> lclS;
				lclS = OpalFactoryFactory.getInstance().getStandbyEntryOpalFactory().forSchoolRegistrationIdCollection(getIdAsObject());
				myOldStandbyEntryOpalFast3Set = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
			}
			return myOldStandbyEntryOpalFast3Set;
		}
	}

	public synchronized void addStandbyEntryOpal(StandbyEntryOpal argStandbyEntryOpal) {
		tryMutate();
		argStandbyEntryOpal.setSchoolRegistrationOpal(this);
		return;
	}

	protected synchronized void addStandbyEntryOpalInternal(StandbyEntryOpal argStandbyEntryOpal) {
		tryMutate();
		if (myNewStandbyEntryOpalFast3Set == null) {
			if (myOldStandbyEntryOpalFast3Set == null) {
				if (myStandbyEntryOpalCachedOperations == null) { myStandbyEntryOpalCachedOperations = new java.util.ArrayList<>(); }
				myStandbyEntryOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.ADD, argStandbyEntryOpal));
			} else {
				myNewStandbyEntryOpalFast3Set = new com.siliconage.util.Fast3Set<>(myOldStandbyEntryOpalFast3Set);
				myNewStandbyEntryOpalFast3Set.add(argStandbyEntryOpal);
			}
		} else {
			myNewStandbyEntryOpalFast3Set.add(argStandbyEntryOpal);
		}
		return;
	}

	public synchronized void removeStandbyEntryOpal(StandbyEntryOpal argStandbyEntryOpal) {
		tryMutate();
		argStandbyEntryOpal.setSchoolRegistrationOpal(null);
	}

	protected synchronized void removeStandbyEntryOpalInternal(StandbyEntryOpal argStandbyEntryOpal) {
		tryMutate();
		if (myNewStandbyEntryOpalFast3Set == null) {
			if (myOldStandbyEntryOpalFast3Set == null) {
				if (myStandbyEntryOpalCachedOperations == null) { myStandbyEntryOpalCachedOperations = new java.util.ArrayList<>(); }
				myStandbyEntryOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.REMOVE, argStandbyEntryOpal));
			} else {
				myNewStandbyEntryOpalFast3Set = new com.siliconage.util.Fast3Set<>(myOldStandbyEntryOpalFast3Set);
				myNewStandbyEntryOpalFast3Set.remove(argStandbyEntryOpal);
			}
		} else {
			myNewStandbyEntryOpalFast3Set.remove(argStandbyEntryOpal);
		}
		return;
	}

	public synchronized int getStandbyEntryOpalCount() { return getStandbyEntryOpalFast3Set().size(); }

	public synchronized java.util.Iterator<StandbyEntryOpal> createStandbyEntryOpalIterator() {
		return getStandbyEntryOpalFast3Set().iterator();
	}

	public synchronized java.util.stream.Stream<StandbyEntryOpal> streamStandbyEntryOpal() {
		return getStandbyEntryOpalFast3Set().stream();
	}

	private java.util.Set<PlayerOpal> myOldPlayerOpalHashSet = null;
	private java.util.Set<PlayerOpal> myNewPlayerOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<PlayerOpal>> myPlayerOpalCachedOperations = null;

	/* package */ java.util.Set<PlayerOpal> getPlayerOpalHashSet() {
		if (tryAccess()) {
			if (myNewPlayerOpalHashSet == null) {
				if (myOldPlayerOpalHashSet == null) {
					if (isNew()) {
						myOldPlayerOpalHashSet = java.util.Collections.emptySet();
					} else {
						java.util.Set<PlayerOpal> lclS;
						lclS = OpalFactoryFactory.getInstance().getPlayerOpalFactory().forSchoolRegistrationIdCollection(getIdAsObject());
						myOldPlayerOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
					}
				}
				myNewPlayerOpalHashSet = new java.util.HashSet<>(myOldPlayerOpalHashSet);
				if (myPlayerOpalCachedOperations != null) {
					com.opal.OpalUtility.handleCachedOperations(myPlayerOpalCachedOperations, myNewPlayerOpalHashSet);
					myPlayerOpalCachedOperations = null;
				}
			}
			return myNewPlayerOpalHashSet;
		} else {
			if (myOldPlayerOpalHashSet == null) {
				java.util.Set<PlayerOpal> lclS;
				lclS = OpalFactoryFactory.getInstance().getPlayerOpalFactory().forSchoolRegistrationIdCollection(getIdAsObject());
				myOldPlayerOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
			}
			return myOldPlayerOpalHashSet;
		}
	}

	public synchronized void addPlayerOpal(PlayerOpal argPlayerOpal) {
		tryMutate();
		argPlayerOpal.setSchoolRegistrationOpal(this);
		return;
	}

	protected synchronized void addPlayerOpalInternal(PlayerOpal argPlayerOpal) {
		tryMutate();
		if (myNewPlayerOpalHashSet == null) {
			if (myOldPlayerOpalHashSet == null) {
				if (myPlayerOpalCachedOperations == null) { myPlayerOpalCachedOperations = new java.util.ArrayList<>(); }
				myPlayerOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.ADD, argPlayerOpal));
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
		argPlayerOpal.setSchoolRegistrationOpal(null);
	}

	protected synchronized void removePlayerOpalInternal(PlayerOpal argPlayerOpal) {
		tryMutate();
		if (myNewPlayerOpalHashSet == null) {
			if (myOldPlayerOpalHashSet == null) {
				if (myPlayerOpalCachedOperations == null) { myPlayerOpalCachedOperations = new java.util.ArrayList<>(); }
				myPlayerOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.REMOVE, argPlayerOpal));
			} else {
				myNewPlayerOpalHashSet = new java.util.HashSet<>(myOldPlayerOpalHashSet);
				myNewPlayerOpalHashSet.remove(argPlayerOpal);
			}
		} else {
			myNewPlayerOpalHashSet.remove(argPlayerOpal);
		}
		return;
	}

	public synchronized int getPlayerOpalCount() { return getPlayerOpalHashSet().size(); }

	public synchronized java.util.Iterator<PlayerOpal> createPlayerOpalIterator() {
		return getPlayerOpalHashSet().iterator();
	}

	public synchronized java.util.stream.Stream<PlayerOpal> streamPlayerOpal() {
		return getPlayerOpalHashSet().stream();
	}

	private java.util.Set<BuzzerOpal> myOldBuzzerOpalFast3Set = null;
	private java.util.Set<BuzzerOpal> myNewBuzzerOpalFast3Set = null;
	private java.util.ArrayList<com.opal.CachedOperation<BuzzerOpal>> myBuzzerOpalCachedOperations = null;

	/* package */ java.util.Set<BuzzerOpal> getBuzzerOpalFast3Set() {
		if (tryAccess()) {
			if (myNewBuzzerOpalFast3Set == null) {
				if (myOldBuzzerOpalFast3Set == null) {
					if (isNew()) {
						myOldBuzzerOpalFast3Set = java.util.Collections.emptySet();
					} else {
						java.util.Set<BuzzerOpal> lclS;
						lclS = OpalFactoryFactory.getInstance().getBuzzerOpalFactory().forSchoolRegistrationIdCollection(getIdAsObject());
						myOldBuzzerOpalFast3Set = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
					}
				}
				myNewBuzzerOpalFast3Set = new com.siliconage.util.Fast3Set<>(myOldBuzzerOpalFast3Set);
				if (myBuzzerOpalCachedOperations != null) {
					com.opal.OpalUtility.handleCachedOperations(myBuzzerOpalCachedOperations, myNewBuzzerOpalFast3Set);
					myBuzzerOpalCachedOperations = null;
				}
			}
			return myNewBuzzerOpalFast3Set;
		} else {
			if (myOldBuzzerOpalFast3Set == null) {
				java.util.Set<BuzzerOpal> lclS;
				lclS = OpalFactoryFactory.getInstance().getBuzzerOpalFactory().forSchoolRegistrationIdCollection(getIdAsObject());
				myOldBuzzerOpalFast3Set = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
			}
			return myOldBuzzerOpalFast3Set;
		}
	}

	public synchronized void addBuzzerOpal(BuzzerOpal argBuzzerOpal) {
		tryMutate();
		argBuzzerOpal.setSchoolRegistrationOpal(this);
		return;
	}

	protected synchronized void addBuzzerOpalInternal(BuzzerOpal argBuzzerOpal) {
		tryMutate();
		if (myNewBuzzerOpalFast3Set == null) {
			if (myOldBuzzerOpalFast3Set == null) {
				if (myBuzzerOpalCachedOperations == null) { myBuzzerOpalCachedOperations = new java.util.ArrayList<>(); }
				myBuzzerOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.ADD, argBuzzerOpal));
			} else {
				myNewBuzzerOpalFast3Set = new com.siliconage.util.Fast3Set<>(myOldBuzzerOpalFast3Set);
				myNewBuzzerOpalFast3Set.add(argBuzzerOpal);
			}
		} else {
			myNewBuzzerOpalFast3Set.add(argBuzzerOpal);
		}
		return;
	}

	public synchronized void removeBuzzerOpal(BuzzerOpal argBuzzerOpal) {
		tryMutate();
		argBuzzerOpal.setSchoolRegistrationOpal(null);
	}

	protected synchronized void removeBuzzerOpalInternal(BuzzerOpal argBuzzerOpal) {
		tryMutate();
		if (myNewBuzzerOpalFast3Set == null) {
			if (myOldBuzzerOpalFast3Set == null) {
				if (myBuzzerOpalCachedOperations == null) { myBuzzerOpalCachedOperations = new java.util.ArrayList<>(); }
				myBuzzerOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.REMOVE, argBuzzerOpal));
			} else {
				myNewBuzzerOpalFast3Set = new com.siliconage.util.Fast3Set<>(myOldBuzzerOpalFast3Set);
				myNewBuzzerOpalFast3Set.remove(argBuzzerOpal);
			}
		} else {
			myNewBuzzerOpalFast3Set.remove(argBuzzerOpal);
		}
		return;
	}

	public synchronized int getBuzzerOpalCount() { return getBuzzerOpalFast3Set().size(); }

	public synchronized java.util.Iterator<BuzzerOpal> createBuzzerOpalIterator() {
		return getBuzzerOpalFast3Set().iterator();
	}

	public synchronized java.util.stream.Stream<BuzzerOpal> streamBuzzerOpal() {
		return getBuzzerOpalFast3Set().stream();
	}

	private java.util.Set<WaitlistEntryOpal> myOldWaitlistEntryOpalFast3Set = null;
	private java.util.Set<WaitlistEntryOpal> myNewWaitlistEntryOpalFast3Set = null;
	private java.util.ArrayList<com.opal.CachedOperation<WaitlistEntryOpal>> myWaitlistEntryOpalCachedOperations = null;

	/* package */ java.util.Set<WaitlistEntryOpal> getWaitlistEntryOpalFast3Set() {
		if (tryAccess()) {
			if (myNewWaitlistEntryOpalFast3Set == null) {
				if (myOldWaitlistEntryOpalFast3Set == null) {
					if (isNew()) {
						myOldWaitlistEntryOpalFast3Set = java.util.Collections.emptySet();
					} else {
						java.util.Set<WaitlistEntryOpal> lclS;
						lclS = OpalFactoryFactory.getInstance().getWaitlistEntryOpalFactory().forSchoolRegistrationIdCollection(getIdAsObject());
						myOldWaitlistEntryOpalFast3Set = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
					}
				}
				myNewWaitlistEntryOpalFast3Set = new com.siliconage.util.Fast3Set<>(myOldWaitlistEntryOpalFast3Set);
				if (myWaitlistEntryOpalCachedOperations != null) {
					com.opal.OpalUtility.handleCachedOperations(myWaitlistEntryOpalCachedOperations, myNewWaitlistEntryOpalFast3Set);
					myWaitlistEntryOpalCachedOperations = null;
				}
			}
			return myNewWaitlistEntryOpalFast3Set;
		} else {
			if (myOldWaitlistEntryOpalFast3Set == null) {
				java.util.Set<WaitlistEntryOpal> lclS;
				lclS = OpalFactoryFactory.getInstance().getWaitlistEntryOpalFactory().forSchoolRegistrationIdCollection(getIdAsObject());
				myOldWaitlistEntryOpalFast3Set = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
			}
			return myOldWaitlistEntryOpalFast3Set;
		}
	}

	public synchronized void addWaitlistEntryOpal(WaitlistEntryOpal argWaitlistEntryOpal) {
		tryMutate();
		argWaitlistEntryOpal.setSchoolRegistrationOpal(this);
		return;
	}

	protected synchronized void addWaitlistEntryOpalInternal(WaitlistEntryOpal argWaitlistEntryOpal) {
		tryMutate();
		if (myNewWaitlistEntryOpalFast3Set == null) {
			if (myOldWaitlistEntryOpalFast3Set == null) {
				if (myWaitlistEntryOpalCachedOperations == null) { myWaitlistEntryOpalCachedOperations = new java.util.ArrayList<>(); }
				myWaitlistEntryOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.ADD, argWaitlistEntryOpal));
			} else {
				myNewWaitlistEntryOpalFast3Set = new com.siliconage.util.Fast3Set<>(myOldWaitlistEntryOpalFast3Set);
				myNewWaitlistEntryOpalFast3Set.add(argWaitlistEntryOpal);
			}
		} else {
			myNewWaitlistEntryOpalFast3Set.add(argWaitlistEntryOpal);
		}
		return;
	}

	public synchronized void removeWaitlistEntryOpal(WaitlistEntryOpal argWaitlistEntryOpal) {
		tryMutate();
		argWaitlistEntryOpal.setSchoolRegistrationOpal(null);
	}

	protected synchronized void removeWaitlistEntryOpalInternal(WaitlistEntryOpal argWaitlistEntryOpal) {
		tryMutate();
		if (myNewWaitlistEntryOpalFast3Set == null) {
			if (myOldWaitlistEntryOpalFast3Set == null) {
				if (myWaitlistEntryOpalCachedOperations == null) { myWaitlistEntryOpalCachedOperations = new java.util.ArrayList<>(); }
				myWaitlistEntryOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.REMOVE, argWaitlistEntryOpal));
			} else {
				myNewWaitlistEntryOpalFast3Set = new com.siliconage.util.Fast3Set<>(myOldWaitlistEntryOpalFast3Set);
				myNewWaitlistEntryOpalFast3Set.remove(argWaitlistEntryOpal);
			}
		} else {
			myNewWaitlistEntryOpalFast3Set.remove(argWaitlistEntryOpal);
		}
		return;
	}

	public synchronized int getWaitlistEntryOpalCount() { return getWaitlistEntryOpalFast3Set().size(); }

	public synchronized java.util.Iterator<WaitlistEntryOpal> createWaitlistEntryOpalIterator() {
		return getWaitlistEntryOpalFast3Set().iterator();
	}

	public synchronized java.util.stream.Stream<WaitlistEntryOpal> streamWaitlistEntryOpal() {
		return getWaitlistEntryOpalFast3Set().stream();
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
						lclS = OpalFactoryFactory.getInstance().getStaffOpalFactory().forSchoolRegistrationIdCollection(getIdAsObject());
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
				lclS = OpalFactoryFactory.getInstance().getStaffOpalFactory().forSchoolRegistrationIdCollection(getIdAsObject());
				myOldStaffOpalFast3Set = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
			}
			return myOldStaffOpalFast3Set;
		}
	}

	public synchronized void addStaffOpal(StaffOpal argStaffOpal) {
		tryMutate();
		argStaffOpal.setSchoolRegistrationOpal(this);
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
		argStaffOpal.setSchoolRegistrationOpal(null);
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
		lclSB.append("SchoolRegistrationOpal[");
		lclSB.append("myId=");
		lclSB.append(toStringField(0));
		lclSB.append(']');
		return lclSB.toString();
	}

	@Override
	protected void updateReferencesAfterReload() {
		if (myNewMainContactOpal != ContactOpal.NOT_YET_LOADED) {
			setMainContactOpal(retrieveMainContactOpal(getNewValues()));
		}
		if (myNewSchoolOpal != SchoolOpal.NOT_YET_LOADED) {
			setSchoolOpal(retrieveSchoolOpal(getNewValues()));
		}
		if (myNewTournamentOpal != TournamentOpal.NOT_YET_LOADED) {
			setTournamentOpal(retrieveTournamentOpal(getNewValues()));
		}
	}

	@Override
	protected void updateCollectionsAfterReload() {
		assert needsToClearOldCollections() == false;
		setClearOldCollections(true);
	}

}
