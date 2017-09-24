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

		myModeratorGameSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
				this,
				ourModeratorGameOpalLoader,
				true
				);
		myScorekeeperGameSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
				this,
				ourScorekeeperGameOpalLoader,
				true
				);
		myStaffAssignmentSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
				this,
				ourStaffAssignmentOpalLoader,
				true
				);

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
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		myOldContactOpal = myNewContactOpal;
		myOldSchoolRegistrationOpal = myNewSchoolRegistrationOpal;
		myOldTechnologyChoiceOpal = myNewTechnologyChoiceOpal;
		myOldTournamentOpal = myNewTournamentOpal;

		return;
	}

	@Override
	protected void unlinkInternal() {
		getModeratorGameOpalSet().clear();
		getScorekeeperGameOpalSet().clear();
		getStaffAssignmentOpalSet().clear();
		if (getContactOpal() != null) {
			getContactOpal().getStaffOpalSet().removeInternal(this);
		}
		if (getSchoolRegistrationOpal() != null) {
			getSchoolRegistrationOpal().getStaffOpalSet().removeInternal(this);
		}
		if (getTournamentOpal() != null) {
			getTournamentOpal().getStaffOpalSet().removeInternal(this);
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
		if (lclUO != null && (lclUO.exists() == false)) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		if ((lclUO = myOldSchoolRegistrationOpal) == SchoolRegistrationOpal.NOT_YET_LOADED) {
			lclUO = myOldSchoolRegistrationOpal = retrieveSchoolRegistrationOpal(getOldValues());
		}
		if (lclUO != null && (lclUO.exists() == false)) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		if ((lclUO = myOldTechnologyChoiceOpal) == TechnologyChoiceOpal.NOT_YET_LOADED) {
			lclUO = myOldTechnologyChoiceOpal = retrieveTechnologyChoiceOpal(getOldValues());
		}
		if (lclUO != null && (lclUO.exists() == false)) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		if ((lclUO = myOldTournamentOpal) == TournamentOpal.NOT_YET_LOADED) {
			lclUO = myOldTournamentOpal = retrieveTournamentOpal(getOldValues());
		}
		if (lclUO != null && (lclUO.exists() == false)) {
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
			lclContactOpal.getStaffOpalSet().removeInternal(this);
		}
		myNewContactOpal = argContactOpal;
		if (argContactOpal != null) {
			argContactOpal.getStaffOpalSet().addInternal(this);
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
			lclSchoolRegistrationOpal.getStaffOpalSet().removeInternal(this);
		}
		myNewSchoolRegistrationOpal = argSchoolRegistrationOpal;
		if (argSchoolRegistrationOpal != null) {
			argSchoolRegistrationOpal.getStaffOpalSet().addInternal(this);
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
			lclTournamentOpal.getStaffOpalSet().removeInternal(this);
		}
		myNewTournamentOpal = argTournamentOpal;
		if (argTournamentOpal != null) {
			argTournamentOpal.getStaffOpalSet().addInternal(this);
		}
		return this;
	}

	protected synchronized void setTournamentOpalInternal(TournamentOpal argTournamentOpal) {
		tryMutate();
		myNewTournamentOpal = argTournamentOpal;
	}

	private com.opal.types.OpalBackCollectionSet<GameOpal, StaffOpal> myModeratorGameSet = null;

	private static final com.opal.types.OpalBackCollectionLoader<GameOpal, StaffOpal> ourModeratorGameOpalLoader = 
			new com.opal.types.OpalBackCollectionLoader<>(
					OpalFactoryFactory.getInstance().getGameOpalFactory()::forModeratorStaffOpalCollection,
					OpalFactoryFactory.getInstance().getGameOpalFactory()::forModeratorStaffOpalCount,
					GameOpal::setModeratorStaffOpal,
					GameOpal::setModeratorStaffOpalInternal,
					GameOpal::getModeratorStaffOpal,
					com.scobolsolo.application.FactoryMap.getNoArgCtorSetCreator(),
					com.scobolsolo.application.FactoryMap.getCollectionArgSetCreator(),
					true
					);

	/* package */ synchronized com.opal.types.OpalBackCollectionSet<GameOpal, StaffOpal> getModeratorGameOpalSet() {
		if (myModeratorGameSet == null) {
			myModeratorGameSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
					this,
					ourModeratorGameOpalLoader,
					isNew()
					);
		}
		return myModeratorGameSet;
	}

	private com.opal.types.OpalBackCollectionSet<GameOpal, StaffOpal> myScorekeeperGameSet = null;

	private static final com.opal.types.OpalBackCollectionLoader<GameOpal, StaffOpal> ourScorekeeperGameOpalLoader = 
			new com.opal.types.OpalBackCollectionLoader<>(
					OpalFactoryFactory.getInstance().getGameOpalFactory()::forScorekeeperStaffOpalCollection,
					OpalFactoryFactory.getInstance().getGameOpalFactory()::forScorekeeperStaffOpalCount,
					GameOpal::setScorekeeperStaffOpal,
					GameOpal::setScorekeeperStaffOpalInternal,
					GameOpal::getScorekeeperStaffOpal,
					com.scobolsolo.application.FactoryMap.getNoArgCtorSetCreator(),
					com.scobolsolo.application.FactoryMap.getCollectionArgSetCreator(),
					true
					);

	/* package */ synchronized com.opal.types.OpalBackCollectionSet<GameOpal, StaffOpal> getScorekeeperGameOpalSet() {
		if (myScorekeeperGameSet == null) {
			myScorekeeperGameSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
					this,
					ourScorekeeperGameOpalLoader,
					isNew()
					);
		}
		return myScorekeeperGameSet;
	}

	private com.opal.types.OpalBackCollectionSet<StaffAssignmentOpal, StaffOpal> myStaffAssignmentSet = null;

	private static final com.opal.types.OpalBackCollectionLoader<StaffAssignmentOpal, StaffOpal> ourStaffAssignmentOpalLoader = 
			new com.opal.types.OpalBackCollectionLoader<>(
					OpalFactoryFactory.getInstance().getStaffAssignmentOpalFactory()::forStaffOpalCollection,
					OpalFactoryFactory.getInstance().getStaffAssignmentOpalFactory()::forStaffOpalCount,
					StaffAssignmentOpal::setStaffOpal,
					StaffAssignmentOpal::setStaffOpalInternal,
					StaffAssignmentOpal::getStaffOpal,
					com.scobolsolo.application.FactoryMap.getNoArgCtorSetCreator(),
					com.scobolsolo.application.FactoryMap.getCollectionArgSetCreator(),
					false
					);

	/* package */ synchronized com.opal.types.OpalBackCollectionSet<StaffAssignmentOpal, StaffOpal> getStaffAssignmentOpalSet() {
		if (myStaffAssignmentSet == null) {
			myStaffAssignmentSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
					this,
					ourStaffAssignmentOpalLoader,
					isNew()
					);
		}
		return myStaffAssignmentSet;
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
