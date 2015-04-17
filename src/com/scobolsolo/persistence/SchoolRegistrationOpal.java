package com.scobolsolo.persistence;

import java.io.PrintWriter;
import java.io.PrintStream;

import com.opal.*;

import com.scobolsolo.application.*;

@StoreGeneratedPrimaryKey
public final class SchoolRegistrationOpal extends com.opal.UpdatableOpal<SchoolRegistration> {
	public static final java.math.BigDecimal ourDefaultAmountOwed = java.math.BigDecimal.valueOf(0.0);
	public static final java.math.BigDecimal ourDefaultAmountPaid = java.math.BigDecimal.valueOf(0.0);

	private SchoolRegistrationOpal() {
		super();
		setUserFacing(null);
	}

	public SchoolRegistrationOpal(OpalFactory<SchoolRegistration, SchoolRegistrationOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void applyDefaults() {
		getNewValues()[3] = ourDefaultAmountOwed;
		getNewValues()[4] = ourDefaultAmountPaid;
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

	/* package */ static final FieldValidator[] ourFieldValidators = new FieldValidator[] {
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
	public FieldValidator[] getFieldValidators() { return ourFieldValidators; }

	@Override
	public boolean[] getFieldNullability() { return ourFieldNullability; }

	public static FieldValidator[] getStaticFieldValidators() { return ourFieldValidators; }


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

	public synchronized void setSchoolId(final java.lang.Integer argSchoolId) {
		tryMutate();
		if (argSchoolId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set mySchoolId on " + this + " to null.");
		}
		getNewValues()[1] = argSchoolId;
		return;
	}

	public void setSchoolId(final int argSchoolId) {
		setSchoolId(java.lang.Integer.valueOf(argSchoolId));
		return;
	}

	public synchronized void setMainContactId(final java.lang.Integer argMainContactId) {
		tryMutate();
		if (argMainContactId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myMainContactId on " + this + " to null.");
		}
		getNewValues()[2] = argMainContactId;
		return;
	}

	public void setMainContactId(final int argMainContactId) {
		setMainContactId(java.lang.Integer.valueOf(argMainContactId));
		return;
	}

	public synchronized void setAmountOwed(final java.math.BigDecimal argAmountOwed) {
		tryMutate();
		if (argAmountOwed == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myAmountOwed on " + this + " to null.");
		}
		getNewValues()[3] = argAmountOwed;
		return;
	}

	public synchronized void setAmountPaid(final java.math.BigDecimal argAmountPaid) {
		tryMutate();
		if (argAmountPaid == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myAmountPaid on " + this + " to null.");
		}
		getNewValues()[4] = argAmountPaid;
		return;
	}

	public synchronized void setNote(final java.lang.String argNote) {
		tryMutate();
		getNewValues()[5] = argNote;
		return;
	}

	public synchronized void setSpotsReserved(final java.lang.Integer argSpotsReserved) {
		tryMutate();
		if (argSpotsReserved == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set mySpotsReserved on " + this + " to null.");
		}
		getNewValues()[6] = argSpotsReserved;
		return;
	}

	public void setSpotsReserved(final int argSpotsReserved) {
		setSpotsReserved(java.lang.Integer.valueOf(argSpotsReserved));
		return;
	}

	public synchronized void setTournamentCode(final java.lang.String argTournamentCode) {
		tryMutate();
		if (argTournamentCode == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myTournamentCode on " + this + " to null.");
		}
		if (argTournamentCode.length() > 32) {
			throw new com.opal.ArgumentTooLongException("Maximum length of myTournamentCode on " + this + " is 32.", argTournamentCode.length(), 32);
		}
		getNewValues()[7] = argTournamentCode;
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
		myNewMainContactOpal = myOldMainContactOpal;
		myNewSchoolOpal = myOldSchoolOpal;
		myNewTournamentOpal = myOldTournamentOpal;
		myNewStandbyEntryOpalHashSet = null; /* Necessary if it has been rolled back */
		myStandbyEntryOpalCachedOperations = null; /* Ditto */
		myNewPlayerOpalHashSet = null; /* Necessary if it has been rolled back */
		myPlayerOpalCachedOperations = null; /* Ditto */
		myNewBuzzerOpalHashSet = null; /* Necessary if it has been rolled back */
		myBuzzerOpalCachedOperations = null; /* Ditto */
		myNewWaitlistEntryOpalHashSet = null; /* Necessary if it has been rolled back */
		myWaitlistEntryOpalCachedOperations = null; /* Ditto */
		myNewStaffOpalHashSet = null; /* Necessary if it has been rolled back */
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
			myOldStandbyEntryOpalHashSet = null;
			} else {
			if (myNewStandbyEntryOpalHashSet != null) {
				myOldStandbyEntryOpalHashSet = myNewStandbyEntryOpalHashSet;
				myNewStandbyEntryOpalHashSet = null;
			} else {
				myStandbyEntryOpalCachedOperations = null;
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
			myOldBuzzerOpalHashSet = null;
			} else {
			if (myNewBuzzerOpalHashSet != null) {
				myOldBuzzerOpalHashSet = myNewBuzzerOpalHashSet;
				myNewBuzzerOpalHashSet = null;
			} else {
				myBuzzerOpalCachedOperations = null;
			}
		}
		if (needsToClearOldCollections()) {
			myOldWaitlistEntryOpalHashSet = null;
			} else {
			if (myNewWaitlistEntryOpalHashSet != null) {
				myOldWaitlistEntryOpalHashSet = myNewWaitlistEntryOpalHashSet;
				myNewWaitlistEntryOpalHashSet = null;
			} else {
				myWaitlistEntryOpalCachedOperations = null;
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
		if (myNewStandbyEntryOpalHashSet != null || myStandbyEntryOpalCachedOperations != null) {
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
		if (myNewBuzzerOpalHashSet != null || myBuzzerOpalCachedOperations != null) {
			lclI = createBuzzerOpalIterator();
			while (lclI.hasNext()) {
				((BuzzerOpal) lclI.next()).setSchoolRegistrationOpalInternal(null);
			}
		}
		if (myNewWaitlistEntryOpalHashSet != null || myWaitlistEntryOpalCachedOperations != null) {
			lclI = createWaitlistEntryOpalIterator();
			while (lclI.hasNext()) {
				((WaitlistEntryOpal) lclI.next()).setSchoolRegistrationOpalInternal(null);
			}
		}
		if (myNewStaffOpalHashSet != null || myStaffOpalCachedOperations != null) {
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
	protected void copyFieldsToInternal(UpdatableOpal<SchoolRegistration> argTarget) {
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
		argPW.println("SchoolId = " + getSchoolIdAsObject());
		argPW.println("MainContactId = " + getMainContactIdAsObject());
		argPW.println("AmountOwed = " + getAmountOwed());
		argPW.println("AmountPaid = " + getAmountPaid());
		argPW.println("Note = " + getNote());
		argPW.println("SpotsReserved = " + getSpotsReservedAsObject());
		argPW.println("TournamentCode = " + getTournamentCode());
	}

	@Override
	public synchronized void output(final PrintStream argPS) {
		argPS.println("Id = " + getIdAsObject());
		argPS.println("SchoolId = " + getSchoolIdAsObject());
		argPS.println("MainContactId = " + getMainContactIdAsObject());
		argPS.println("AmountOwed = " + getAmountOwed());
		argPS.println("AmountPaid = " + getAmountPaid());
		argPS.println("Note = " + getNote());
		argPS.println("SpotsReserved = " + getSpotsReservedAsObject());
		argPS.println("TournamentCode = " + getTournamentCode());
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

	public synchronized void setMainContactOpal(ContactOpal argContactOpal) {
		tryMutate();
		ContactOpal lclContactOpal = getMainContactOpal();
		if (lclContactOpal == argContactOpal) { return; }
		if (lclContactOpal != null) {
			lclContactOpal.removeMainSchoolRegistrationOpalInternal(this);
		}
		myNewMainContactOpal = argContactOpal;
		if (argContactOpal != null) {
			argContactOpal.addMainSchoolRegistrationOpalInternal(this);
		}
		return;
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

	public synchronized void setSchoolOpal(SchoolOpal argSchoolOpal) {
		tryMutate();
		SchoolOpal lclSchoolOpal = getSchoolOpal();
		if (lclSchoolOpal == argSchoolOpal) { return; }
		if (lclSchoolOpal != null) {
			lclSchoolOpal.removeSchoolRegistrationOpalInternal(this);
		}
		myNewSchoolOpal = argSchoolOpal;
		if (argSchoolOpal != null) {
			argSchoolOpal.addSchoolRegistrationOpalInternal(this);
		}
		return;
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

	public synchronized void setTournamentOpal(TournamentOpal argTournamentOpal) {
		tryMutate();
		TournamentOpal lclTournamentOpal = getTournamentOpal();
		if (lclTournamentOpal == argTournamentOpal) { return; }
		if (lclTournamentOpal != null) {
			lclTournamentOpal.removeSchoolRegistrationOpalInternal(this);
		}
		myNewTournamentOpal = argTournamentOpal;
		if (argTournamentOpal != null) {
			argTournamentOpal.addSchoolRegistrationOpalInternal(this);
		}
		return;
	}

	protected synchronized void setTournamentOpalInternal(TournamentOpal argTournamentOpal) {
		tryMutate();
		myNewTournamentOpal = argTournamentOpal;
	}

	private java.util.HashSet<StandbyEntryOpal> myOldStandbyEntryOpalHashSet = null;
	private java.util.HashSet<StandbyEntryOpal> myNewStandbyEntryOpalHashSet = null;
	private java.util.ArrayList<CachedOperation<StandbyEntryOpal>> myStandbyEntryOpalCachedOperations = null;

	/* package */ java.util.HashSet<StandbyEntryOpal> getStandbyEntryOpalClass() {
		if (tryAccess()) {
			if (myNewStandbyEntryOpalHashSet == null) {
				if (myOldStandbyEntryOpalHashSet == null) {
					myOldStandbyEntryOpalHashSet = OpalFactoryFactory.getInstance().getStandbyEntryOpalFactory().forSchoolRegistrationIdCollection(getIdAsObject());
				}
				myNewStandbyEntryOpalHashSet = new java.util.HashSet<>(myOldStandbyEntryOpalHashSet);
				if (myStandbyEntryOpalCachedOperations != null) {
					OpalUtility.handleCachedOperations(myStandbyEntryOpalCachedOperations, myNewStandbyEntryOpalHashSet);
					myStandbyEntryOpalCachedOperations = null;
				}
			}
			return myNewStandbyEntryOpalHashSet;
		}
		if (myOldStandbyEntryOpalHashSet == null) {
			myOldStandbyEntryOpalHashSet = OpalFactoryFactory.getInstance().getStandbyEntryOpalFactory().forSchoolRegistrationIdCollection(getIdAsObject());
		}
		return myOldStandbyEntryOpalHashSet;
	}

	public synchronized void addStandbyEntryOpal(StandbyEntryOpal argStandbyEntryOpal) {
		tryMutate();
		argStandbyEntryOpal.setSchoolRegistrationOpal(this);
		return;
	}

	protected synchronized void addStandbyEntryOpalInternal(StandbyEntryOpal argStandbyEntryOpal) {
		tryMutate();
		if (myNewStandbyEntryOpalHashSet == null) {
			if (myOldStandbyEntryOpalHashSet == null) {
				if (myStandbyEntryOpalCachedOperations == null) { myStandbyEntryOpalCachedOperations = new java.util.ArrayList<>(); }
				myStandbyEntryOpalCachedOperations.add(new CachedOperation<>(CachedOperation.ADD, argStandbyEntryOpal));
			} else {
				myNewStandbyEntryOpalHashSet = new java.util.HashSet<>(myOldStandbyEntryOpalHashSet);
				myNewStandbyEntryOpalHashSet.add(argStandbyEntryOpal);
			}
		} else {
			myNewStandbyEntryOpalHashSet.add(argStandbyEntryOpal);
		}
		return;
	}

	public synchronized void removeStandbyEntryOpal(StandbyEntryOpal argStandbyEntryOpal) {
		tryMutate();
		argStandbyEntryOpal.setSchoolRegistrationOpal(null);
	}

	protected synchronized void removeStandbyEntryOpalInternal(StandbyEntryOpal argStandbyEntryOpal) {
		tryMutate();
		if (myNewStandbyEntryOpalHashSet == null) {
			if (myOldStandbyEntryOpalHashSet == null) {
				if (myStandbyEntryOpalCachedOperations == null) { myStandbyEntryOpalCachedOperations = new java.util.ArrayList<>(); }
				myStandbyEntryOpalCachedOperations.add(new CachedOperation<>(CachedOperation.REMOVE, argStandbyEntryOpal));
			} else {
				myNewStandbyEntryOpalHashSet = new java.util.HashSet<>(myOldStandbyEntryOpalHashSet);
				myNewStandbyEntryOpalHashSet.remove(argStandbyEntryOpal);
			}
		} else {
			myNewStandbyEntryOpalHashSet.remove(argStandbyEntryOpal);
		}
		return;
	}

	public synchronized int getStandbyEntryOpalCount() { return getStandbyEntryOpalClass().size(); }

	public synchronized java.util.Iterator<StandbyEntryOpal> createStandbyEntryOpalIterator() {
		return getStandbyEntryOpalClass().iterator();
	}

	public synchronized java.util.stream.Stream<StandbyEntryOpal> streamStandbyEntryOpal() {
		return getStandbyEntryOpalClass().stream();
	}

	public synchronized void clearStandbyEntryOpalInternal() { getStandbyEntryOpalClass().clear(); }

	private java.util.HashSet<PlayerOpal> myOldPlayerOpalHashSet = null;
	private java.util.HashSet<PlayerOpal> myNewPlayerOpalHashSet = null;
	private java.util.ArrayList<CachedOperation<PlayerOpal>> myPlayerOpalCachedOperations = null;

	/* package */ java.util.HashSet<PlayerOpal> getPlayerOpalClass() {
		if (tryAccess()) {
			if (myNewPlayerOpalHashSet == null) {
				if (myOldPlayerOpalHashSet == null) {
					myOldPlayerOpalHashSet = OpalFactoryFactory.getInstance().getPlayerOpalFactory().forSchoolRegistrationIdCollection(getIdAsObject());
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
			myOldPlayerOpalHashSet = OpalFactoryFactory.getInstance().getPlayerOpalFactory().forSchoolRegistrationIdCollection(getIdAsObject());
		}
		return myOldPlayerOpalHashSet;
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
		argPlayerOpal.setSchoolRegistrationOpal(null);
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

	private java.util.HashSet<BuzzerOpal> myOldBuzzerOpalHashSet = null;
	private java.util.HashSet<BuzzerOpal> myNewBuzzerOpalHashSet = null;
	private java.util.ArrayList<CachedOperation<BuzzerOpal>> myBuzzerOpalCachedOperations = null;

	/* package */ java.util.HashSet<BuzzerOpal> getBuzzerOpalClass() {
		if (tryAccess()) {
			if (myNewBuzzerOpalHashSet == null) {
				if (myOldBuzzerOpalHashSet == null) {
					myOldBuzzerOpalHashSet = OpalFactoryFactory.getInstance().getBuzzerOpalFactory().forSchoolRegistrationIdCollection(getIdAsObject());
				}
				myNewBuzzerOpalHashSet = new java.util.HashSet<>(myOldBuzzerOpalHashSet);
				if (myBuzzerOpalCachedOperations != null) {
					OpalUtility.handleCachedOperations(myBuzzerOpalCachedOperations, myNewBuzzerOpalHashSet);
					myBuzzerOpalCachedOperations = null;
				}
			}
			return myNewBuzzerOpalHashSet;
		}
		if (myOldBuzzerOpalHashSet == null) {
			myOldBuzzerOpalHashSet = OpalFactoryFactory.getInstance().getBuzzerOpalFactory().forSchoolRegistrationIdCollection(getIdAsObject());
		}
		return myOldBuzzerOpalHashSet;
	}

	public synchronized void addBuzzerOpal(BuzzerOpal argBuzzerOpal) {
		tryMutate();
		argBuzzerOpal.setSchoolRegistrationOpal(this);
		return;
	}

	protected synchronized void addBuzzerOpalInternal(BuzzerOpal argBuzzerOpal) {
		tryMutate();
		if (myNewBuzzerOpalHashSet == null) {
			if (myOldBuzzerOpalHashSet == null) {
				if (myBuzzerOpalCachedOperations == null) { myBuzzerOpalCachedOperations = new java.util.ArrayList<>(); }
				myBuzzerOpalCachedOperations.add(new CachedOperation<>(CachedOperation.ADD, argBuzzerOpal));
			} else {
				myNewBuzzerOpalHashSet = new java.util.HashSet<>(myOldBuzzerOpalHashSet);
				myNewBuzzerOpalHashSet.add(argBuzzerOpal);
			}
		} else {
			myNewBuzzerOpalHashSet.add(argBuzzerOpal);
		}
		return;
	}

	public synchronized void removeBuzzerOpal(BuzzerOpal argBuzzerOpal) {
		tryMutate();
		argBuzzerOpal.setSchoolRegistrationOpal(null);
	}

	protected synchronized void removeBuzzerOpalInternal(BuzzerOpal argBuzzerOpal) {
		tryMutate();
		if (myNewBuzzerOpalHashSet == null) {
			if (myOldBuzzerOpalHashSet == null) {
				if (myBuzzerOpalCachedOperations == null) { myBuzzerOpalCachedOperations = new java.util.ArrayList<>(); }
				myBuzzerOpalCachedOperations.add(new CachedOperation<>(CachedOperation.REMOVE, argBuzzerOpal));
			} else {
				myNewBuzzerOpalHashSet = new java.util.HashSet<>(myOldBuzzerOpalHashSet);
				myNewBuzzerOpalHashSet.remove(argBuzzerOpal);
			}
		} else {
			myNewBuzzerOpalHashSet.remove(argBuzzerOpal);
		}
		return;
	}

	public synchronized int getBuzzerOpalCount() { return getBuzzerOpalClass().size(); }

	public synchronized java.util.Iterator<BuzzerOpal> createBuzzerOpalIterator() {
		return getBuzzerOpalClass().iterator();
	}

	public synchronized java.util.stream.Stream<BuzzerOpal> streamBuzzerOpal() {
		return getBuzzerOpalClass().stream();
	}

	public synchronized void clearBuzzerOpalInternal() { getBuzzerOpalClass().clear(); }

	private java.util.HashSet<WaitlistEntryOpal> myOldWaitlistEntryOpalHashSet = null;
	private java.util.HashSet<WaitlistEntryOpal> myNewWaitlistEntryOpalHashSet = null;
	private java.util.ArrayList<CachedOperation<WaitlistEntryOpal>> myWaitlistEntryOpalCachedOperations = null;

	/* package */ java.util.HashSet<WaitlistEntryOpal> getWaitlistEntryOpalClass() {
		if (tryAccess()) {
			if (myNewWaitlistEntryOpalHashSet == null) {
				if (myOldWaitlistEntryOpalHashSet == null) {
					myOldWaitlistEntryOpalHashSet = OpalFactoryFactory.getInstance().getWaitlistEntryOpalFactory().forSchoolRegistrationIdCollection(getIdAsObject());
				}
				myNewWaitlistEntryOpalHashSet = new java.util.HashSet<>(myOldWaitlistEntryOpalHashSet);
				if (myWaitlistEntryOpalCachedOperations != null) {
					OpalUtility.handleCachedOperations(myWaitlistEntryOpalCachedOperations, myNewWaitlistEntryOpalHashSet);
					myWaitlistEntryOpalCachedOperations = null;
				}
			}
			return myNewWaitlistEntryOpalHashSet;
		}
		if (myOldWaitlistEntryOpalHashSet == null) {
			myOldWaitlistEntryOpalHashSet = OpalFactoryFactory.getInstance().getWaitlistEntryOpalFactory().forSchoolRegistrationIdCollection(getIdAsObject());
		}
		return myOldWaitlistEntryOpalHashSet;
	}

	public synchronized void addWaitlistEntryOpal(WaitlistEntryOpal argWaitlistEntryOpal) {
		tryMutate();
		argWaitlistEntryOpal.setSchoolRegistrationOpal(this);
		return;
	}

	protected synchronized void addWaitlistEntryOpalInternal(WaitlistEntryOpal argWaitlistEntryOpal) {
		tryMutate();
		if (myNewWaitlistEntryOpalHashSet == null) {
			if (myOldWaitlistEntryOpalHashSet == null) {
				if (myWaitlistEntryOpalCachedOperations == null) { myWaitlistEntryOpalCachedOperations = new java.util.ArrayList<>(); }
				myWaitlistEntryOpalCachedOperations.add(new CachedOperation<>(CachedOperation.ADD, argWaitlistEntryOpal));
			} else {
				myNewWaitlistEntryOpalHashSet = new java.util.HashSet<>(myOldWaitlistEntryOpalHashSet);
				myNewWaitlistEntryOpalHashSet.add(argWaitlistEntryOpal);
			}
		} else {
			myNewWaitlistEntryOpalHashSet.add(argWaitlistEntryOpal);
		}
		return;
	}

	public synchronized void removeWaitlistEntryOpal(WaitlistEntryOpal argWaitlistEntryOpal) {
		tryMutate();
		argWaitlistEntryOpal.setSchoolRegistrationOpal(null);
	}

	protected synchronized void removeWaitlistEntryOpalInternal(WaitlistEntryOpal argWaitlistEntryOpal) {
		tryMutate();
		if (myNewWaitlistEntryOpalHashSet == null) {
			if (myOldWaitlistEntryOpalHashSet == null) {
				if (myWaitlistEntryOpalCachedOperations == null) { myWaitlistEntryOpalCachedOperations = new java.util.ArrayList<>(); }
				myWaitlistEntryOpalCachedOperations.add(new CachedOperation<>(CachedOperation.REMOVE, argWaitlistEntryOpal));
			} else {
				myNewWaitlistEntryOpalHashSet = new java.util.HashSet<>(myOldWaitlistEntryOpalHashSet);
				myNewWaitlistEntryOpalHashSet.remove(argWaitlistEntryOpal);
			}
		} else {
			myNewWaitlistEntryOpalHashSet.remove(argWaitlistEntryOpal);
		}
		return;
	}

	public synchronized int getWaitlistEntryOpalCount() { return getWaitlistEntryOpalClass().size(); }

	public synchronized java.util.Iterator<WaitlistEntryOpal> createWaitlistEntryOpalIterator() {
		return getWaitlistEntryOpalClass().iterator();
	}

	public synchronized java.util.stream.Stream<WaitlistEntryOpal> streamWaitlistEntryOpal() {
		return getWaitlistEntryOpalClass().stream();
	}

	public synchronized void clearWaitlistEntryOpalInternal() { getWaitlistEntryOpalClass().clear(); }

	private java.util.HashSet<StaffOpal> myOldStaffOpalHashSet = null;
	private java.util.HashSet<StaffOpal> myNewStaffOpalHashSet = null;
	private java.util.ArrayList<CachedOperation<StaffOpal>> myStaffOpalCachedOperations = null;

	/* package */ java.util.HashSet<StaffOpal> getStaffOpalClass() {
		if (tryAccess()) {
			if (myNewStaffOpalHashSet == null) {
				if (myOldStaffOpalHashSet == null) {
					myOldStaffOpalHashSet = OpalFactoryFactory.getInstance().getStaffOpalFactory().forSchoolRegistrationIdCollection(getIdAsObject());
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
			myOldStaffOpalHashSet = OpalFactoryFactory.getInstance().getStaffOpalFactory().forSchoolRegistrationIdCollection(getIdAsObject());
		}
		return myOldStaffOpalHashSet;
	}

	public synchronized void addStaffOpal(StaffOpal argStaffOpal) {
		tryMutate();
		argStaffOpal.setSchoolRegistrationOpal(this);
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
		argStaffOpal.setSchoolRegistrationOpal(null);
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
