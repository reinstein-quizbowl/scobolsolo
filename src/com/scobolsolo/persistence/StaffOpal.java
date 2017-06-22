package com.scobolsolo.persistence;

import com.scobolsolo.application.Staff;

@com.opal.StoreGeneratedPrimaryKey
public final class StaffOpal extends com.opal.UpdatableOpal<Staff> {

	public static final java.lang.String ourDefaultTechnologyChoiceCode = "TBD";

	private StaffOpal() {
		super();
		setUserFacing(null);
	}

	public StaffOpal(com.opal.IdentityOpalFactory<Staff, StaffOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void applyDefaults() {
		/* Initialize fields with their default values. */
		getNewValues()[5] = ourDefaultTechnologyChoiceCode;


		/* Initialize the back Collections to empty sets. */

		myNewModeratorGameOpalHashSet = new java.util.HashSet<>();
		myNewScorekeeperGameOpalHashSet = new java.util.HashSet<>();
		myNewStaffAssignmentOpalHashSet = new java.util.HashSet<>();

		return;
	}

	@Override
	protected void initializeReferences() {
		myOldContactOpal = ContactOpal.NOT_YET_LOADED;
		myOldSchoolRegistrationOpal = SchoolRegistrationOpal.NOT_YET_LOADED;
		myOldTechnologyChoiceOpal = TechnologyChoiceOpal.NOT_YET_LOADED;
		myOldTournamentOpal = TournamentOpal.NOT_YET_LOADED;
		return;
	}

	/* package */ static final String[] ourFieldNames = new String[] {
		"Id",
		"ContactId",
		"TournamentCode",
		"SchoolRegistrationId",
		"Note",
		"TechnologyChoiceCode",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.lang.String.class,
		java.lang.Integer.class,
		java.lang.String.class,
		java.lang.String.class,
	};

	/* package */ static final boolean[] ourFieldNullability = new boolean[] {
		false,
		false,
		false,
		true,
		true,
		false,
	};

	/* package */ static final com.opal.FieldValidator[] ourFieldValidators = new com.opal.FieldValidator[] {
		null,
		null,
		null,
		null,
		null,
		null,
	};

	public static final StaffOpal NOT_YET_LOADED = new StaffOpal();

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

	public synchronized java.lang.Integer getContactIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[1];
	}

	public synchronized java.lang.String getTournamentCode() {
		return (java.lang.String) getReadValueSet()[2];
	}

	public synchronized java.lang.Integer getSchoolRegistrationIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[3];
	}

	public synchronized java.lang.String getNote() {
		return (java.lang.String) getReadValueSet()[4];
	}

	public synchronized java.lang.String getTechnologyChoiceCode() {
		return (java.lang.String) getReadValueSet()[5];
	}

	public synchronized StaffOpal setId(final java.lang.Integer argId) {
		tryMutate();
		if (argId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myId on " + this + " to null.");
		}
		getNewValues()[0] = argId;
		return this;
	}

	public StaffOpal setId(final int argId) {
		setId(java.lang.Integer.valueOf(argId));
		return this;
	}

	public synchronized StaffOpal setContactId(final java.lang.Integer argContactId) {
		tryMutate();
		if (argContactId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myContactId on " + this + " to null.");
		}
		getNewValues()[1] = argContactId;
		return this;
	}

	public StaffOpal setContactId(final int argContactId) {
		setContactId(java.lang.Integer.valueOf(argContactId));
		return this;
	}

	public synchronized StaffOpal setTournamentCode(final java.lang.String argTournamentCode) {
		tryMutate();
		if (argTournamentCode == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myTournamentCode on " + this + " to null.");
		}
		if (argTournamentCode.length() > 32) {
			throw new com.opal.ArgumentTooLongException("Cannot set myTournamentCode on " + this + " to \"" + argTournamentCode + "\" because that field's maximum length is 32.", argTournamentCode.length(), 32);
		}
		getNewValues()[2] = argTournamentCode;
		return this;
	}

	public synchronized StaffOpal setSchoolRegistrationId(final java.lang.Integer argSchoolRegistrationId) {
		tryMutate();
		getNewValues()[3] = argSchoolRegistrationId;
		return this;
	}

	public StaffOpal setSchoolRegistrationId(final int argSchoolRegistrationId) {
		setSchoolRegistrationId(java.lang.Integer.valueOf(argSchoolRegistrationId));
		return this;
	}

	public synchronized StaffOpal setNote(final java.lang.String argNote) {
		tryMutate();
		getNewValues()[4] = argNote;
		return this;
	}

	public synchronized StaffOpal setTechnologyChoiceCode(final java.lang.String argTechnologyChoiceCode) {
		tryMutate();
		if (argTechnologyChoiceCode == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myTechnologyChoiceCode on " + this + " to null.");
		}
		if (argTechnologyChoiceCode.length() > 32) {
			throw new com.opal.ArgumentTooLongException("Cannot set myTechnologyChoiceCode on " + this + " to \"" + argTechnologyChoiceCode + "\" because that field's maximum length is 32.", argTechnologyChoiceCode.length(), 32);
		}
		getNewValues()[5] = argTechnologyChoiceCode;
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
		myNewSchoolRegistrationOpal = myOldSchoolRegistrationOpal;
		myNewTechnologyChoiceOpal = myOldTechnologyChoiceOpal;
		myNewTournamentOpal = myOldTournamentOpal;
		myNewModeratorGameOpalHashSet = null; /* Necessary if it has been rolled back */
		myModeratorGameOpalCachedOperations = null; /* Ditto */
		myNewScorekeeperGameOpalHashSet = null; /* Necessary if it has been rolled back */
		myScorekeeperGameOpalCachedOperations = null; /* Ditto */
		myNewStaffAssignmentOpalHashSet = null; /* Necessary if it has been rolled back */
		myStaffAssignmentOpalCachedOperations = null; /* Ditto */
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		myOldContactOpal = myNewContactOpal;
		myOldSchoolRegistrationOpal = myNewSchoolRegistrationOpal;
		myOldTechnologyChoiceOpal = myNewTechnologyChoiceOpal;
		myOldTournamentOpal = myNewTournamentOpal;

		if (needsToClearOldCollections()) {
			myOldModeratorGameOpalHashSet = null;
			myOldScorekeeperGameOpalHashSet = null;
			myOldStaffAssignmentOpalHashSet = null;
		} else {
			if (myNewModeratorGameOpalHashSet != null) {
				if (myNewModeratorGameOpalHashSet.size() > 0) {
					myOldModeratorGameOpalHashSet = myNewModeratorGameOpalHashSet;
				} else {
					myOldModeratorGameOpalHashSet = java.util.Collections.emptySet();
				}
				myNewModeratorGameOpalHashSet = null;
			} else {
				myModeratorGameOpalCachedOperations = null;
			}
			if (myNewScorekeeperGameOpalHashSet != null) {
				if (myNewScorekeeperGameOpalHashSet.size() > 0) {
					myOldScorekeeperGameOpalHashSet = myNewScorekeeperGameOpalHashSet;
				} else {
					myOldScorekeeperGameOpalHashSet = java.util.Collections.emptySet();
				}
				myNewScorekeeperGameOpalHashSet = null;
			} else {
				myScorekeeperGameOpalCachedOperations = null;
			}
			if (myNewStaffAssignmentOpalHashSet != null) {
				if (myNewStaffAssignmentOpalHashSet.size() > 0) {
					myOldStaffAssignmentOpalHashSet = myNewStaffAssignmentOpalHashSet;
				} else {
					myOldStaffAssignmentOpalHashSet = java.util.Collections.emptySet();
				}
				myNewStaffAssignmentOpalHashSet = null;
			} else {
				myStaffAssignmentOpalCachedOperations = null;
			}
		}
		setClearOldCollections(false);
		return;
	}

	@Override
	protected void unlinkInternal() {
		java.util.Iterator<?> lclI;
		if (myNewModeratorGameOpalHashSet != null || myModeratorGameOpalCachedOperations != null) {
			lclI = createModeratorGameOpalIterator();
			while (lclI.hasNext()) {
				((GameOpal) lclI.next()).setModeratorStaffOpalInternal(null);
			}
		}
		if (myNewScorekeeperGameOpalHashSet != null || myScorekeeperGameOpalCachedOperations != null) {
			lclI = createScorekeeperGameOpalIterator();
			while (lclI.hasNext()) {
				((GameOpal) lclI.next()).setScorekeeperStaffOpalInternal(null);
			}
		}
		if (myNewStaffAssignmentOpalHashSet != null || myStaffAssignmentOpalCachedOperations != null) {
			lclI = createStaffAssignmentOpalIterator();
			while (lclI.hasNext()) {
				((StaffAssignmentOpal) lclI.next()).setStaffOpalInternal(null);
			}
		}
		if (getContactOpal() != null) {
			getContactOpal().removeStaffOpalInternal(this);
		}
		if (getSchoolRegistrationOpal() != null) {
			getSchoolRegistrationOpal().removeStaffOpalInternal(this);
		}
		if (getTournamentOpal() != null) {
			getTournamentOpal().removeStaffOpalInternal(this);
		}
		return;
	}

	@Override
	protected void copyFieldsToInternal(com.opal.UpdatableOpal<Staff> argTarget) {
		Object[] lclValues = getReadValueSet();
		Object[] lclTargetNewValues = argTarget.getNewValues();
		/* Field 0 (Id) is database generated. */
		lclTargetNewValues[1] = lclValues[1]; /* ContactId (immutable) */
		lclTargetNewValues[2] = lclValues[2]; /* TournamentCode (immutable) */
		lclTargetNewValues[3] = lclValues[3]; /* SchoolRegistrationId (immutable) */
		lclTargetNewValues[4] = lclValues[4]; /* Note (immutable) */
		lclTargetNewValues[5] = lclValues[5]; /* TechnologyChoiceCode (immutable) */

		return;
	}

	@Override
	public synchronized void translateReferencesToFields() {
		if (myNewContactOpal != ContactOpal.NOT_YET_LOADED) {
			setContactId(myNewContactOpal == null ? null : myNewContactOpal.getIdAsObject());
		}
		if (myNewSchoolRegistrationOpal != SchoolRegistrationOpal.NOT_YET_LOADED) {
			setSchoolRegistrationId(myNewSchoolRegistrationOpal == null ? null : myNewSchoolRegistrationOpal.getIdAsObject());
		}
		if (myNewTechnologyChoiceOpal != TechnologyChoiceOpal.NOT_YET_LOADED) {
			setTechnologyChoiceCode(myNewTechnologyChoiceOpal == null ? null : myNewTechnologyChoiceOpal.getCode());
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
		lclUO = myNewContactOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		lclUO = myNewSchoolRegistrationOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		lclUO = myNewTechnologyChoiceOpal;
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
		if ((lclUO = myOldContactOpal) == ContactOpal.NOT_YET_LOADED) {
			lclUO = myOldContactOpal = retrieveContactOpal(getOldValues());
		}
		if (lclUO != null && lclUO.isDeleted()) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		if ((lclUO = myOldSchoolRegistrationOpal) == SchoolRegistrationOpal.NOT_YET_LOADED) {
			lclUO = myOldSchoolRegistrationOpal = retrieveSchoolRegistrationOpal(getOldValues());
		}
		if (lclUO != null && lclUO.isDeleted()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		if ((lclUO = myOldTechnologyChoiceOpal) == TechnologyChoiceOpal.NOT_YET_LOADED) {
			lclUO = myOldTechnologyChoiceOpal = retrieveTechnologyChoiceOpal(getOldValues());
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
		argOutput.println("ContactId = " + getContactIdAsObject());
		argOutput.println("TournamentCode = " + getTournamentCode());
		argOutput.println("SchoolRegistrationId = " + getSchoolRegistrationIdAsObject());
		argOutput.println("Note = " + getNote());
		argOutput.println("TechnologyChoiceCode = " + getTechnologyChoiceCode());
	}

	@Override
	public synchronized void output(final java.io.PrintWriter argOutput) {
		argOutput.println("Id = " + getIdAsObject());
		argOutput.println("ContactId = " + getContactIdAsObject());
		argOutput.println("TournamentCode = " + getTournamentCode());
		argOutput.println("SchoolRegistrationId = " + getSchoolRegistrationIdAsObject());
		argOutput.println("Note = " + getNote());
		argOutput.println("TechnologyChoiceCode = " + getTechnologyChoiceCode());
	}

	private ContactOpal myOldContactOpal;
	private ContactOpal myNewContactOpal;

	protected ContactOpal retrieveContactOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[1] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getContactOpalFactory().forId(getContactIdAsObject());
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

	public synchronized StaffOpal setContactOpal(ContactOpal argContactOpal) {
		tryMutate();
		ContactOpal lclContactOpal = getContactOpal();
		if (lclContactOpal == argContactOpal) { return this; }
		if (lclContactOpal != null) {
			lclContactOpal.removeStaffOpalInternal(this);
		}
		myNewContactOpal = argContactOpal;
		if (argContactOpal != null) {
			argContactOpal.addStaffOpalInternal(this);
		}
		return this;
	}

	protected synchronized void setContactOpalInternal(ContactOpal argContactOpal) {
		tryMutate();
		myNewContactOpal = argContactOpal;
	}

	private SchoolRegistrationOpal myOldSchoolRegistrationOpal;
	private SchoolRegistrationOpal myNewSchoolRegistrationOpal;

	protected SchoolRegistrationOpal retrieveSchoolRegistrationOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[3] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getSchoolRegistrationOpalFactory().forId(getSchoolRegistrationIdAsObject());
	}

	public synchronized SchoolRegistrationOpal getSchoolRegistrationOpal() {
		SchoolRegistrationOpal lclSchoolRegistrationOpal;
		boolean lclAccess = tryAccess();
		lclSchoolRegistrationOpal = lclAccess ? myNewSchoolRegistrationOpal : myOldSchoolRegistrationOpal;
		if (lclSchoolRegistrationOpal == SchoolRegistrationOpal.NOT_YET_LOADED) {
			lclSchoolRegistrationOpal = retrieveSchoolRegistrationOpal(getReadValueSet());
			if (lclAccess) {
				myNewSchoolRegistrationOpal = lclSchoolRegistrationOpal;
			} else {
				myOldSchoolRegistrationOpal = lclSchoolRegistrationOpal;
			}
		}
		return lclSchoolRegistrationOpal;
	}

	public synchronized StaffOpal setSchoolRegistrationOpal(SchoolRegistrationOpal argSchoolRegistrationOpal) {
		tryMutate();
		SchoolRegistrationOpal lclSchoolRegistrationOpal = getSchoolRegistrationOpal();
		if (lclSchoolRegistrationOpal == argSchoolRegistrationOpal) { return this; }
		if (lclSchoolRegistrationOpal != null) {
			lclSchoolRegistrationOpal.removeStaffOpalInternal(this);
		}
		myNewSchoolRegistrationOpal = argSchoolRegistrationOpal;
		if (argSchoolRegistrationOpal != null) {
			argSchoolRegistrationOpal.addStaffOpalInternal(this);
		}
		return this;
	}

	protected synchronized void setSchoolRegistrationOpalInternal(SchoolRegistrationOpal argSchoolRegistrationOpal) {
		tryMutate();
		myNewSchoolRegistrationOpal = argSchoolRegistrationOpal;
	}

	private TechnologyChoiceOpal myOldTechnologyChoiceOpal;
	private TechnologyChoiceOpal myNewTechnologyChoiceOpal;

	protected TechnologyChoiceOpal retrieveTechnologyChoiceOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[5] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getTechnologyChoiceOpalFactory().forCode(getTechnologyChoiceCode());
	}

	public synchronized TechnologyChoiceOpal getTechnologyChoiceOpal() {
		TechnologyChoiceOpal lclTechnologyChoiceOpal;
		boolean lclAccess = tryAccess();
		lclTechnologyChoiceOpal = lclAccess ? myNewTechnologyChoiceOpal : myOldTechnologyChoiceOpal;
		if (lclTechnologyChoiceOpal == TechnologyChoiceOpal.NOT_YET_LOADED) {
			lclTechnologyChoiceOpal = retrieveTechnologyChoiceOpal(getReadValueSet());
			if (lclAccess) {
				myNewTechnologyChoiceOpal = lclTechnologyChoiceOpal;
			} else {
				myOldTechnologyChoiceOpal = lclTechnologyChoiceOpal;
			}
		}
		return lclTechnologyChoiceOpal;
	}

	public synchronized StaffOpal setTechnologyChoiceOpal(TechnologyChoiceOpal argTechnologyChoiceOpal) {
		tryMutate();
		myNewTechnologyChoiceOpal = argTechnologyChoiceOpal;
		return this;
	}

	private TournamentOpal myOldTournamentOpal;
	private TournamentOpal myNewTournamentOpal;

	protected TournamentOpal retrieveTournamentOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[2] == null)) {
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

	public synchronized StaffOpal setTournamentOpal(TournamentOpal argTournamentOpal) {
		tryMutate();
		TournamentOpal lclTournamentOpal = getTournamentOpal();
		if (lclTournamentOpal == argTournamentOpal) { return this; }
		if (lclTournamentOpal != null) {
			lclTournamentOpal.removeStaffOpalInternal(this);
		}
		myNewTournamentOpal = argTournamentOpal;
		if (argTournamentOpal != null) {
			argTournamentOpal.addStaffOpalInternal(this);
		}
		return this;
	}

	protected synchronized void setTournamentOpalInternal(TournamentOpal argTournamentOpal) {
		tryMutate();
		myNewTournamentOpal = argTournamentOpal;
	}

	private java.util.Set<GameOpal> myOldModeratorGameOpalHashSet = null;
	private java.util.Set<GameOpal> myNewModeratorGameOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<GameOpal>> myModeratorGameOpalCachedOperations = null;

	/* package */ java.util.Set<GameOpal> getModeratorGameOpalHashSet() {
		if (tryAccess()) {
			if (myNewModeratorGameOpalHashSet == null) {
				if (myOldModeratorGameOpalHashSet == null) {
					if (isNew()) {
						myOldModeratorGameOpalHashSet = java.util.Collections.emptySet();
					} else {
						java.util.Set<GameOpal> lclS;
						lclS = OpalFactoryFactory.getInstance().getGameOpalFactory().forModeratorStaffIdCollection(getIdAsObject());
						myOldModeratorGameOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
					}
				}
				myNewModeratorGameOpalHashSet = new java.util.HashSet<>(myOldModeratorGameOpalHashSet);
				if (myModeratorGameOpalCachedOperations != null) {
					com.opal.OpalUtility.handleCachedOperations(myModeratorGameOpalCachedOperations, myNewModeratorGameOpalHashSet);
					myModeratorGameOpalCachedOperations = null;
				}
			}
			return myNewModeratorGameOpalHashSet;
		} else {
			if (myOldModeratorGameOpalHashSet == null) {
				java.util.Set<GameOpal> lclS;
				lclS = OpalFactoryFactory.getInstance().getGameOpalFactory().forModeratorStaffIdCollection(getIdAsObject());
				myOldModeratorGameOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
			}
			return myOldModeratorGameOpalHashSet;
		}
	}

	public synchronized void addModeratorGameOpal(GameOpal argGameOpal) {
		tryMutate();
		argGameOpal.setModeratorStaffOpal(this);
		return;
	}

	protected synchronized void addModeratorGameOpalInternal(GameOpal argGameOpal) {
		tryMutate();
		if (myNewModeratorGameOpalHashSet == null) {
			if (myOldModeratorGameOpalHashSet == null) {
				if (myModeratorGameOpalCachedOperations == null) { myModeratorGameOpalCachedOperations = new java.util.ArrayList<>(); }
				myModeratorGameOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.ADD, argGameOpal));
			} else {
				myNewModeratorGameOpalHashSet = new java.util.HashSet<>(myOldModeratorGameOpalHashSet);
				myNewModeratorGameOpalHashSet.add(argGameOpal);
			}
		} else {
			myNewModeratorGameOpalHashSet.add(argGameOpal);
		}
		return;
	}

	public synchronized void removeModeratorGameOpal(GameOpal argGameOpal) {
		tryMutate();
		argGameOpal.setModeratorStaffOpal(null);
	}

	protected synchronized void removeModeratorGameOpalInternal(GameOpal argGameOpal) {
		tryMutate();
		if (myNewModeratorGameOpalHashSet == null) {
			if (myOldModeratorGameOpalHashSet == null) {
				if (myModeratorGameOpalCachedOperations == null) { myModeratorGameOpalCachedOperations = new java.util.ArrayList<>(); }
				myModeratorGameOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.REMOVE, argGameOpal));
			} else {
				myNewModeratorGameOpalHashSet = new java.util.HashSet<>(myOldModeratorGameOpalHashSet);
				myNewModeratorGameOpalHashSet.remove(argGameOpal);
			}
		} else {
			myNewModeratorGameOpalHashSet.remove(argGameOpal);
		}
		return;
	}

	public synchronized int getModeratorGameOpalCount() { return getModeratorGameOpalHashSet().size(); }

	public synchronized java.util.Iterator<GameOpal> createModeratorGameOpalIterator() {
		return getModeratorGameOpalHashSet().iterator();
	}

	public synchronized java.util.stream.Stream<GameOpal> streamModeratorGameOpal() {
		return getModeratorGameOpalHashSet().stream();
	}

	private java.util.Set<GameOpal> myOldScorekeeperGameOpalHashSet = null;
	private java.util.Set<GameOpal> myNewScorekeeperGameOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<GameOpal>> myScorekeeperGameOpalCachedOperations = null;

	/* package */ java.util.Set<GameOpal> getScorekeeperGameOpalHashSet() {
		if (tryAccess()) {
			if (myNewScorekeeperGameOpalHashSet == null) {
				if (myOldScorekeeperGameOpalHashSet == null) {
					if (isNew()) {
						myOldScorekeeperGameOpalHashSet = java.util.Collections.emptySet();
					} else {
						java.util.Set<GameOpal> lclS;
						lclS = OpalFactoryFactory.getInstance().getGameOpalFactory().forScorekeeperStaffIdCollection(getIdAsObject());
						myOldScorekeeperGameOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
					}
				}
				myNewScorekeeperGameOpalHashSet = new java.util.HashSet<>(myOldScorekeeperGameOpalHashSet);
				if (myScorekeeperGameOpalCachedOperations != null) {
					com.opal.OpalUtility.handleCachedOperations(myScorekeeperGameOpalCachedOperations, myNewScorekeeperGameOpalHashSet);
					myScorekeeperGameOpalCachedOperations = null;
				}
			}
			return myNewScorekeeperGameOpalHashSet;
		} else {
			if (myOldScorekeeperGameOpalHashSet == null) {
				java.util.Set<GameOpal> lclS;
				lclS = OpalFactoryFactory.getInstance().getGameOpalFactory().forScorekeeperStaffIdCollection(getIdAsObject());
				myOldScorekeeperGameOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
			}
			return myOldScorekeeperGameOpalHashSet;
		}
	}

	public synchronized void addScorekeeperGameOpal(GameOpal argGameOpal) {
		tryMutate();
		argGameOpal.setScorekeeperStaffOpal(this);
		return;
	}

	protected synchronized void addScorekeeperGameOpalInternal(GameOpal argGameOpal) {
		tryMutate();
		if (myNewScorekeeperGameOpalHashSet == null) {
			if (myOldScorekeeperGameOpalHashSet == null) {
				if (myScorekeeperGameOpalCachedOperations == null) { myScorekeeperGameOpalCachedOperations = new java.util.ArrayList<>(); }
				myScorekeeperGameOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.ADD, argGameOpal));
			} else {
				myNewScorekeeperGameOpalHashSet = new java.util.HashSet<>(myOldScorekeeperGameOpalHashSet);
				myNewScorekeeperGameOpalHashSet.add(argGameOpal);
			}
		} else {
			myNewScorekeeperGameOpalHashSet.add(argGameOpal);
		}
		return;
	}

	public synchronized void removeScorekeeperGameOpal(GameOpal argGameOpal) {
		tryMutate();
		argGameOpal.setScorekeeperStaffOpal(null);
	}

	protected synchronized void removeScorekeeperGameOpalInternal(GameOpal argGameOpal) {
		tryMutate();
		if (myNewScorekeeperGameOpalHashSet == null) {
			if (myOldScorekeeperGameOpalHashSet == null) {
				if (myScorekeeperGameOpalCachedOperations == null) { myScorekeeperGameOpalCachedOperations = new java.util.ArrayList<>(); }
				myScorekeeperGameOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.REMOVE, argGameOpal));
			} else {
				myNewScorekeeperGameOpalHashSet = new java.util.HashSet<>(myOldScorekeeperGameOpalHashSet);
				myNewScorekeeperGameOpalHashSet.remove(argGameOpal);
			}
		} else {
			myNewScorekeeperGameOpalHashSet.remove(argGameOpal);
		}
		return;
	}

	public synchronized int getScorekeeperGameOpalCount() { return getScorekeeperGameOpalHashSet().size(); }

	public synchronized java.util.Iterator<GameOpal> createScorekeeperGameOpalIterator() {
		return getScorekeeperGameOpalHashSet().iterator();
	}

	public synchronized java.util.stream.Stream<GameOpal> streamScorekeeperGameOpal() {
		return getScorekeeperGameOpalHashSet().stream();
	}

	private java.util.Set<StaffAssignmentOpal> myOldStaffAssignmentOpalHashSet = null;
	private java.util.Set<StaffAssignmentOpal> myNewStaffAssignmentOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<StaffAssignmentOpal>> myStaffAssignmentOpalCachedOperations = null;

	/* package */ java.util.Set<StaffAssignmentOpal> getStaffAssignmentOpalHashSet() {
		if (tryAccess()) {
			if (myNewStaffAssignmentOpalHashSet == null) {
				if (myOldStaffAssignmentOpalHashSet == null) {
					if (isNew()) {
						myOldStaffAssignmentOpalHashSet = java.util.Collections.emptySet();
					} else {
						java.util.Set<StaffAssignmentOpal> lclS;
						lclS = OpalFactoryFactory.getInstance().getStaffAssignmentOpalFactory().forStaffIdCollection(getIdAsObject());
						myOldStaffAssignmentOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
					}
				}
				myNewStaffAssignmentOpalHashSet = new java.util.HashSet<>(myOldStaffAssignmentOpalHashSet);
				if (myStaffAssignmentOpalCachedOperations != null) {
					com.opal.OpalUtility.handleCachedOperations(myStaffAssignmentOpalCachedOperations, myNewStaffAssignmentOpalHashSet);
					myStaffAssignmentOpalCachedOperations = null;
				}
			}
			return myNewStaffAssignmentOpalHashSet;
		} else {
			if (myOldStaffAssignmentOpalHashSet == null) {
				java.util.Set<StaffAssignmentOpal> lclS;
				lclS = OpalFactoryFactory.getInstance().getStaffAssignmentOpalFactory().forStaffIdCollection(getIdAsObject());
				myOldStaffAssignmentOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
			}
			return myOldStaffAssignmentOpalHashSet;
		}
	}

	public synchronized void addStaffAssignmentOpal(StaffAssignmentOpal argStaffAssignmentOpal) {
		tryMutate();
		argStaffAssignmentOpal.setStaffOpal(this);
		return;
	}

	protected synchronized void addStaffAssignmentOpalInternal(StaffAssignmentOpal argStaffAssignmentOpal) {
		tryMutate();
		if (myNewStaffAssignmentOpalHashSet == null) {
			if (myOldStaffAssignmentOpalHashSet == null) {
				if (myStaffAssignmentOpalCachedOperations == null) { myStaffAssignmentOpalCachedOperations = new java.util.ArrayList<>(); }
				myStaffAssignmentOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.ADD, argStaffAssignmentOpal));
			} else {
				myNewStaffAssignmentOpalHashSet = new java.util.HashSet<>(myOldStaffAssignmentOpalHashSet);
				myNewStaffAssignmentOpalHashSet.add(argStaffAssignmentOpal);
			}
		} else {
			myNewStaffAssignmentOpalHashSet.add(argStaffAssignmentOpal);
		}
		return;
	}

	public synchronized void removeStaffAssignmentOpal(StaffAssignmentOpal argStaffAssignmentOpal) {
		tryMutate();
		argStaffAssignmentOpal.setStaffOpal(null);
	}

	protected synchronized void removeStaffAssignmentOpalInternal(StaffAssignmentOpal argStaffAssignmentOpal) {
		tryMutate();
		if (myNewStaffAssignmentOpalHashSet == null) {
			if (myOldStaffAssignmentOpalHashSet == null) {
				if (myStaffAssignmentOpalCachedOperations == null) { myStaffAssignmentOpalCachedOperations = new java.util.ArrayList<>(); }
				myStaffAssignmentOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.REMOVE, argStaffAssignmentOpal));
			} else {
				myNewStaffAssignmentOpalHashSet = new java.util.HashSet<>(myOldStaffAssignmentOpalHashSet);
				myNewStaffAssignmentOpalHashSet.remove(argStaffAssignmentOpal);
			}
		} else {
			myNewStaffAssignmentOpalHashSet.remove(argStaffAssignmentOpal);
		}
		return;
	}

	public synchronized int getStaffAssignmentOpalCount() { return getStaffAssignmentOpalHashSet().size(); }

	public synchronized java.util.Iterator<StaffAssignmentOpal> createStaffAssignmentOpalIterator() {
		return getStaffAssignmentOpalHashSet().iterator();
	}

	public synchronized java.util.stream.Stream<StaffAssignmentOpal> streamStaffAssignmentOpal() {
		return getStaffAssignmentOpalHashSet().stream();
	}

	@Override
	public java.lang.String toString() {
		java.lang.StringBuilder lclSB = new java.lang.StringBuilder(64);
		lclSB.append("StaffOpal[");
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
		if (myNewSchoolRegistrationOpal != SchoolRegistrationOpal.NOT_YET_LOADED) {
			setSchoolRegistrationOpal(retrieveSchoolRegistrationOpal(getNewValues()));
		}
		if (myNewTechnologyChoiceOpal != TechnologyChoiceOpal.NOT_YET_LOADED) {
			setTechnologyChoiceOpal(retrieveTechnologyChoiceOpal(getNewValues()));
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
