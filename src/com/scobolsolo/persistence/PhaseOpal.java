package com.scobolsolo.persistence;

import com.scobolsolo.application.Phase;

@com.opal.StoreGeneratedPrimaryKey
public final class PhaseOpal extends com.opal.UpdatableOpal<Phase> {


	private PhaseOpal() {
		super();
		setUserFacing(null);
	}

	public PhaseOpal(com.opal.IdentityOpalFactory<Phase, PhaseOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void applyDefaults() {

		/* Initialize the back Collections to empty sets. */

		myStaffAssignmentSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
				this,
				ourStaffAssignmentOpalLoader,
				true
				);
		myRoundGroupSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
				this,
				ourRoundGroupOpalLoader,
				true
				);
		myCardSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
				this,
				ourCardOpalLoader,
				true
				);

		return;
	}

	@Override
	protected void initializeReferences() {
		myOldTournamentOpal = TournamentOpal.NOT_YET_LOADED;
		return;
	}

	/* package */ static final String[] ourFieldNames = new String[] {
		"Id",
		"TournamentCode",
		"Name",
		"ShortName",
		"Sequence",
		"CardSystem",
		"Note",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.Integer.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.Integer.class,
		java.lang.Boolean.class,
		java.lang.String.class,
	};

	/* package */ static final boolean[] ourFieldNullability = new boolean[] {
		false,
		false,
		false,
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
	};

	public static final PhaseOpal NOT_YET_LOADED = new PhaseOpal();

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

	public synchronized java.lang.String getTournamentCode() {
		return (java.lang.String) getReadValueSet()[1];
	}

	public synchronized java.lang.String getName() {
		return (java.lang.String) getReadValueSet()[2];
	}

	public synchronized java.lang.String getShortName() {
		return (java.lang.String) getReadValueSet()[3];
	}

	public synchronized java.lang.Integer getSequenceAsObject() {
		return (java.lang.Integer) getReadValueSet()[4];
	}

	public synchronized java.lang.Boolean isCardSystemAsObject() {
		return (java.lang.Boolean) getReadValueSet()[5];
	}

	public synchronized java.lang.String getNote() {
		return (java.lang.String) getReadValueSet()[6];
	}

	public synchronized PhaseOpal setId(final java.lang.Integer argId) {
		tryMutate();
		if (argId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myId on " + this + " to null.");
		}
		getNewValues()[0] = argId;
		return this;
	}

	public PhaseOpal setId(final int argId) {
		setId(java.lang.Integer.valueOf(argId));
		return this;
	}

	public synchronized PhaseOpal setTournamentCode(final java.lang.String argTournamentCode) {
		tryMutate();
		if (argTournamentCode == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myTournamentCode on " + this + " to null.");
		}
		if (argTournamentCode.length() > 32) {
			throw new com.opal.ArgumentTooLongException("Cannot set myTournamentCode on " + this + " to \"" + argTournamentCode + "\" because that field's maximum length is 32.", argTournamentCode.length(), 32);
		}
		getNewValues()[1] = argTournamentCode;
		return this;
	}

	public synchronized PhaseOpal setName(final java.lang.String argName) {
		tryMutate();
		if (argName == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myName on " + this + " to null.");
		}
		if (argName.length() > 256) {
			throw new com.opal.ArgumentTooLongException("Cannot set myName on " + this + " to \"" + argName + "\" because that field's maximum length is 256.", argName.length(), 256);
		}
		getNewValues()[2] = argName;
		return this;
	}

	public synchronized PhaseOpal setShortName(final java.lang.String argShortName) {
		tryMutate();
		if (argShortName == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myShortName on " + this + " to null.");
		}
		if (argShortName.length() > 32) {
			throw new com.opal.ArgumentTooLongException("Cannot set myShortName on " + this + " to \"" + argShortName + "\" because that field's maximum length is 32.", argShortName.length(), 32);
		}
		getNewValues()[3] = argShortName;
		return this;
	}

	public synchronized PhaseOpal setSequence(final java.lang.Integer argSequence) {
		tryMutate();
		if (argSequence == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set mySequence on " + this + " to null.");
		}
		getNewValues()[4] = argSequence;
		return this;
	}

	public PhaseOpal setSequence(final int argSequence) {
		setSequence(java.lang.Integer.valueOf(argSequence));
		return this;
	}

	public synchronized PhaseOpal setCardSystem(final java.lang.Boolean argCardSystem) {
		tryMutate();
		if (argCardSystem == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myCardSystem on " + this + " to null.");
		}
		getNewValues()[5] = argCardSystem;
		return this;
	}

	public PhaseOpal setCardSystem(final boolean argCardSystem) {
		setCardSystem(argCardSystem ? Boolean.TRUE : Boolean.FALSE);
		return this;
	}

	public synchronized PhaseOpal setNote(final java.lang.String argNote) {
		tryMutate();
		getNewValues()[6] = argNote;
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
		myNewTournamentOpal = myOldTournamentOpal;
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		myOldTournamentOpal = myNewTournamentOpal;

		return;
	}

	@Override
	protected void unlinkInternal() {
		getStaffAssignmentOpalSet().clear();
		getRoundGroupOpalSet().clear();
		getCardOpalSet().clear();
		if (getTournamentOpal() != null) {
			getTournamentOpal().getPhaseOpalSet().removeInternal(this);
		}
		return;
	}

	@Override
	protected void copyFieldsToInternal(com.opal.UpdatableOpal<Phase> argTarget) {
		Object[] lclValues = getReadValueSet();
		Object[] lclTargetNewValues = argTarget.getNewValues();
		/* Field 0 (Id) is database generated. */
		/* Field 1 (TournamentCode) is part of a unique key. */
		/* Field 2 (Name) is part of a unique key. */
		/* Field 3 (ShortName) is part of a unique key. */
		lclTargetNewValues[4] = lclValues[4]; /* Sequence (immutable) */
		lclTargetNewValues[5] = lclValues[5]; /* CardSystem (immutable) */
		lclTargetNewValues[6] = lclValues[6]; /* Note (immutable) */

		return;
	}

	@Override
	public synchronized void translateReferencesToFields() {
		if (myNewTournamentOpal != TournamentOpal.NOT_YET_LOADED) {
			setTournamentCode(myNewTournamentOpal == null ? null : myNewTournamentOpal.getCode());
		}
		return;
	}

	@Override
	public java.util.Set<com.opal.TransactionAware> getRequiredPriorCommits() {
		java.util.Set<com.opal.TransactionAware> lclTAs = null;
		com.opal.UpdatableOpal<?> lclUO;
		lclUO = myNewTournamentOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
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
		if ((lclUO = myOldTournamentOpal) == TournamentOpal.NOT_YET_LOADED) {
			lclUO = myOldTournamentOpal = retrieveTournamentOpal(getOldValues());
		}
		if (lclUO != null && (lclUO.exists() == false)) {
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
	public synchronized void output(final java.io.PrintStream argOutput) {
		argOutput.println("Id = " + getIdAsObject());
		argOutput.println("TournamentCode = " + getTournamentCode());
		argOutput.println("Name = " + getName());
		argOutput.println("ShortName = " + getShortName());
		argOutput.println("Sequence = " + getSequenceAsObject());
		argOutput.println("CardSystem = " + isCardSystemAsObject());
		argOutput.println("Note = " + getNote());
	}

	@Override
	public synchronized void output(final java.io.PrintWriter argOutput) {
		argOutput.println("Id = " + getIdAsObject());
		argOutput.println("TournamentCode = " + getTournamentCode());
		argOutput.println("Name = " + getName());
		argOutput.println("ShortName = " + getShortName());
		argOutput.println("Sequence = " + getSequenceAsObject());
		argOutput.println("CardSystem = " + isCardSystemAsObject());
		argOutput.println("Note = " + getNote());
	}

	private TournamentOpal myOldTournamentOpal;
	private TournamentOpal myNewTournamentOpal;

	protected TournamentOpal retrieveTournamentOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[1] == null)) {
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

	public synchronized PhaseOpal setTournamentOpal(TournamentOpal argTournamentOpal) {
		tryMutate();
		TournamentOpal lclTournamentOpal = getTournamentOpal();
		if (lclTournamentOpal == argTournamentOpal) { return this; }
		if (lclTournamentOpal != null) {
			lclTournamentOpal.getPhaseOpalSet().removeInternal(this);
		}
		myNewTournamentOpal = argTournamentOpal;
		if (argTournamentOpal != null) {
			argTournamentOpal.getPhaseOpalSet().addInternal(this);
		}
		return this;
	}

	protected synchronized void setTournamentOpalInternal(TournamentOpal argTournamentOpal) {
		tryMutate();
		myNewTournamentOpal = argTournamentOpal;
	}

	private com.opal.types.OpalBackCollectionSet<StaffAssignmentOpal, PhaseOpal> myStaffAssignmentSet = null;

	private static final com.opal.types.OpalBackCollectionLoader<StaffAssignmentOpal, PhaseOpal> ourStaffAssignmentOpalLoader = 
			new com.opal.types.OpalBackCollectionLoader<>(
					OpalFactoryFactory.getInstance().getStaffAssignmentOpalFactory()::forPhaseOpalCollection,
					OpalFactoryFactory.getInstance().getStaffAssignmentOpalFactory()::forPhaseOpalCount,
					StaffAssignmentOpal::setPhaseOpal,
					StaffAssignmentOpal::setPhaseOpalInternal,
					StaffAssignmentOpal::getPhaseOpal,
					com.scobolsolo.application.FactoryMap.getNoArgCtorSetCreator(),
					com.scobolsolo.application.FactoryMap.getCollectionArgSetCreator(),
					false
					);

	/* package */ synchronized com.opal.types.OpalBackCollectionSet<StaffAssignmentOpal, PhaseOpal> getStaffAssignmentOpalSet() {
		if (myStaffAssignmentSet == null) {
			myStaffAssignmentSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
					this,
					ourStaffAssignmentOpalLoader,
					isNew()
					);
		}
		return myStaffAssignmentSet;
	}

	private com.opal.types.OpalBackCollectionSet<RoundGroupOpal, PhaseOpal> myRoundGroupSet = null;

	private static final com.opal.types.OpalBackCollectionLoader<RoundGroupOpal, PhaseOpal> ourRoundGroupOpalLoader = 
			new com.opal.types.OpalBackCollectionLoader<>(
					OpalFactoryFactory.getInstance().getRoundGroupOpalFactory()::forPhaseOpalCollection,
					OpalFactoryFactory.getInstance().getRoundGroupOpalFactory()::forPhaseOpalCount,
					RoundGroupOpal::setPhaseOpal,
					RoundGroupOpal::setPhaseOpalInternal,
					RoundGroupOpal::getPhaseOpal,
					com.scobolsolo.application.FactoryMap.getNoArgCtorSetCreator(),
					com.scobolsolo.application.FactoryMap.getCollectionArgSetCreator(),
					false
					);

	/* package */ synchronized com.opal.types.OpalBackCollectionSet<RoundGroupOpal, PhaseOpal> getRoundGroupOpalSet() {
		if (myRoundGroupSet == null) {
			myRoundGroupSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
					this,
					ourRoundGroupOpalLoader,
					isNew()
					);
		}
		return myRoundGroupSet;
	}

	private com.opal.types.OpalBackCollectionSet<CardOpal, PhaseOpal> myCardSet = null;

	private static final com.opal.types.OpalBackCollectionLoader<CardOpal, PhaseOpal> ourCardOpalLoader = 
			new com.opal.types.OpalBackCollectionLoader<>(
					OpalFactoryFactory.getInstance().getCardOpalFactory()::forPhaseOpalCollection,
					OpalFactoryFactory.getInstance().getCardOpalFactory()::forPhaseOpalCount,
					CardOpal::setPhaseOpal,
					CardOpal::setPhaseOpalInternal,
					CardOpal::getPhaseOpal,
					com.scobolsolo.application.FactoryMap.getNoArgCtorSetCreator(),
					com.scobolsolo.application.FactoryMap.getCollectionArgSetCreator(),
					false
					);

	/* package */ synchronized com.opal.types.OpalBackCollectionSet<CardOpal, PhaseOpal> getCardOpalSet() {
		if (myCardSet == null) {
			myCardSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
					this,
					ourCardOpalLoader,
					isNew()
					);
		}
		return myCardSet;
	}

	@Override
	public java.lang.String toString() {
		java.lang.StringBuilder lclSB = new java.lang.StringBuilder(64);
		lclSB.append("PhaseOpal[");
		lclSB.append("myId=");
		lclSB.append(toStringField(0));
		lclSB.append(']');
		return lclSB.toString();
	}

	@Override
	protected void updateReferencesAfterReload() {
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
