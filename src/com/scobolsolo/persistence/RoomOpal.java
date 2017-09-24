package com.scobolsolo.persistence;

import com.scobolsolo.application.Room;

@com.opal.StoreGeneratedPrimaryKey
public final class RoomOpal extends com.opal.UpdatableOpal<Room> {


	private RoomOpal() {
		super();
		setUserFacing(null);
	}

	public RoomOpal(com.opal.IdentityOpalFactory<Room, RoomOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void applyDefaults() {

		/* Initialize the back Collections to empty sets. */

		myControlRoomTournamentSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
				this,
				ourControlRoomTournamentOpalLoader,
				true
				);
		myStaffAssignmentSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
				this,
				ourStaffAssignmentOpalLoader,
				true
				);
		myBuzzerSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
				this,
				ourBuzzerOpalLoader,
				true
				);
		myMatchSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
				this,
				ourMatchOpalLoader,
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
		"Name",
		"ShortName",
		"Note",
		"TournamentCode",
		"Sequence",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.Integer.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.Integer.class,
	};

	/* package */ static final boolean[] ourFieldNullability = new boolean[] {
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
	};

	public static final RoomOpal NOT_YET_LOADED = new RoomOpal();

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

	public synchronized java.lang.String getName() {
		return (java.lang.String) getReadValueSet()[1];
	}

	public synchronized java.lang.String getShortName() {
		return (java.lang.String) getReadValueSet()[2];
	}

	public synchronized java.lang.String getNote() {
		return (java.lang.String) getReadValueSet()[3];
	}

	public synchronized java.lang.String getTournamentCode() {
		return (java.lang.String) getReadValueSet()[4];
	}

	public synchronized java.lang.Integer getSequenceAsObject() {
		return (java.lang.Integer) getReadValueSet()[5];
	}

	public synchronized RoomOpal setId(final java.lang.Integer argId) {
		tryMutate();
		if (argId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myId on " + this + " to null.");
		}
		getNewValues()[0] = argId;
		return this;
	}

	public RoomOpal setId(final int argId) {
		setId(java.lang.Integer.valueOf(argId));
		return this;
	}

	public synchronized RoomOpal setName(final java.lang.String argName) {
		tryMutate();
		if (argName == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myName on " + this + " to null.");
		}
		if (argName.length() > 256) {
			throw new com.opal.ArgumentTooLongException("Cannot set myName on " + this + " to \"" + argName + "\" because that field's maximum length is 256.", argName.length(), 256);
		}
		getNewValues()[1] = argName;
		return this;
	}

	public synchronized RoomOpal setShortName(final java.lang.String argShortName) {
		tryMutate();
		if (argShortName == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myShortName on " + this + " to null.");
		}
		if (argShortName.length() > 32) {
			throw new com.opal.ArgumentTooLongException("Cannot set myShortName on " + this + " to \"" + argShortName + "\" because that field's maximum length is 32.", argShortName.length(), 32);
		}
		getNewValues()[2] = argShortName;
		return this;
	}

	public synchronized RoomOpal setNote(final java.lang.String argNote) {
		tryMutate();
		getNewValues()[3] = argNote;
		return this;
	}

	public synchronized RoomOpal setTournamentCode(final java.lang.String argTournamentCode) {
		tryMutate();
		if (argTournamentCode == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myTournamentCode on " + this + " to null.");
		}
		if (argTournamentCode.length() > 32) {
			throw new com.opal.ArgumentTooLongException("Cannot set myTournamentCode on " + this + " to \"" + argTournamentCode + "\" because that field's maximum length is 32.", argTournamentCode.length(), 32);
		}
		getNewValues()[4] = argTournamentCode;
		return this;
	}

	public synchronized RoomOpal setSequence(final java.lang.Integer argSequence) {
		tryMutate();
		if (argSequence == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set mySequence on " + this + " to null.");
		}
		getNewValues()[5] = argSequence;
		return this;
	}

	public RoomOpal setSequence(final int argSequence) {
		setSequence(java.lang.Integer.valueOf(argSequence));
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
		getControlRoomTournamentOpalSet().clear();
		getStaffAssignmentOpalSet().clear();
		getBuzzerOpalSet().clear();
		getMatchOpalSet().clear();
		if (getTournamentOpal() != null) {
			getTournamentOpal().getRoomOpalSet().removeInternal(this);
		}
		return;
	}

	@Override
	protected void copyFieldsToInternal(com.opal.UpdatableOpal<Room> argTarget) {
		Object[] lclValues = getReadValueSet();
		Object[] lclTargetNewValues = argTarget.getNewValues();
		/* Field 0 (Id) is database generated. */
		/* Field 1 (Name) is part of a unique key. */
		/* Field 2 (ShortName) is part of a unique key. */
		lclTargetNewValues[3] = lclValues[3]; /* Note (immutable) */
		/* Field 4 (TournamentCode) is part of a unique key. */
		lclTargetNewValues[5] = lclValues[5]; /* Sequence (immutable) */

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
		argOutput.println("Name = " + getName());
		argOutput.println("ShortName = " + getShortName());
		argOutput.println("Note = " + getNote());
		argOutput.println("TournamentCode = " + getTournamentCode());
		argOutput.println("Sequence = " + getSequenceAsObject());
	}

	@Override
	public synchronized void output(final java.io.PrintWriter argOutput) {
		argOutput.println("Id = " + getIdAsObject());
		argOutput.println("Name = " + getName());
		argOutput.println("ShortName = " + getShortName());
		argOutput.println("Note = " + getNote());
		argOutput.println("TournamentCode = " + getTournamentCode());
		argOutput.println("Sequence = " + getSequenceAsObject());
	}

	private TournamentOpal myOldTournamentOpal;
	private TournamentOpal myNewTournamentOpal;

	protected TournamentOpal retrieveTournamentOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[4] == null)) {
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

	public synchronized RoomOpal setTournamentOpal(TournamentOpal argTournamentOpal) {
		tryMutate();
		TournamentOpal lclTournamentOpal = getTournamentOpal();
		if (lclTournamentOpal == argTournamentOpal) { return this; }
		if (lclTournamentOpal != null) {
			lclTournamentOpal.getRoomOpalSet().removeInternal(this);
		}
		myNewTournamentOpal = argTournamentOpal;
		if (argTournamentOpal != null) {
			argTournamentOpal.getRoomOpalSet().addInternal(this);
		}
		return this;
	}

	protected synchronized void setTournamentOpalInternal(TournamentOpal argTournamentOpal) {
		tryMutate();
		myNewTournamentOpal = argTournamentOpal;
	}

	private com.opal.types.OpalBackCollectionSet<TournamentOpal, RoomOpal> myControlRoomTournamentSet = null;

	private static final com.opal.types.OpalBackCollectionLoader<TournamentOpal, RoomOpal> ourControlRoomTournamentOpalLoader = 
			new com.opal.types.OpalBackCollectionLoader<>(
					OpalFactoryFactory.getInstance().getTournamentOpalFactory()::forControlRoomOpalCollection,
					OpalFactoryFactory.getInstance().getTournamentOpalFactory()::forControlRoomOpalCount,
					TournamentOpal::setControlRoomOpal,
					TournamentOpal::setControlRoomOpalInternal,
					TournamentOpal::getControlRoomOpal,
					com.scobolsolo.application.FactoryMap.getNoArgCtorSetCreator(),
					com.scobolsolo.application.FactoryMap.getCollectionArgSetCreator(),
					true
					);

	/* package */ synchronized com.opal.types.OpalBackCollectionSet<TournamentOpal, RoomOpal> getControlRoomTournamentOpalSet() {
		if (myControlRoomTournamentSet == null) {
			myControlRoomTournamentSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
					this,
					ourControlRoomTournamentOpalLoader,
					isNew()
					);
		}
		return myControlRoomTournamentSet;
	}

	private com.opal.types.OpalBackCollectionSet<StaffAssignmentOpal, RoomOpal> myStaffAssignmentSet = null;

	private static final com.opal.types.OpalBackCollectionLoader<StaffAssignmentOpal, RoomOpal> ourStaffAssignmentOpalLoader = 
			new com.opal.types.OpalBackCollectionLoader<>(
					OpalFactoryFactory.getInstance().getStaffAssignmentOpalFactory()::forRoomOpalCollection,
					OpalFactoryFactory.getInstance().getStaffAssignmentOpalFactory()::forRoomOpalCount,
					StaffAssignmentOpal::setRoomOpal,
					StaffAssignmentOpal::setRoomOpalInternal,
					StaffAssignmentOpal::getRoomOpal,
					com.scobolsolo.application.FactoryMap.getNoArgCtorSetCreator(),
					com.scobolsolo.application.FactoryMap.getCollectionArgSetCreator(),
					false
					);

	/* package */ synchronized com.opal.types.OpalBackCollectionSet<StaffAssignmentOpal, RoomOpal> getStaffAssignmentOpalSet() {
		if (myStaffAssignmentSet == null) {
			myStaffAssignmentSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
					this,
					ourStaffAssignmentOpalLoader,
					isNew()
					);
		}
		return myStaffAssignmentSet;
	}

	private com.opal.types.OpalBackCollectionSet<BuzzerOpal, RoomOpal> myBuzzerSet = null;

	private static final com.opal.types.OpalBackCollectionLoader<BuzzerOpal, RoomOpal> ourBuzzerOpalLoader = 
			new com.opal.types.OpalBackCollectionLoader<>(
					OpalFactoryFactory.getInstance().getBuzzerOpalFactory()::forRoomOpalCollection,
					OpalFactoryFactory.getInstance().getBuzzerOpalFactory()::forRoomOpalCount,
					BuzzerOpal::setRoomOpal,
					BuzzerOpal::setRoomOpalInternal,
					BuzzerOpal::getRoomOpal,
					com.scobolsolo.application.FactoryMap.getNoArgCtorSetCreator(),
					com.scobolsolo.application.FactoryMap.getCollectionArgSetCreator(),
					true
					);

	/* package */ synchronized com.opal.types.OpalBackCollectionSet<BuzzerOpal, RoomOpal> getBuzzerOpalSet() {
		if (myBuzzerSet == null) {
			myBuzzerSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
					this,
					ourBuzzerOpalLoader,
					isNew()
					);
		}
		return myBuzzerSet;
	}

	private com.opal.types.OpalBackCollectionSet<MatchOpal, RoomOpal> myMatchSet = null;

	private static final com.opal.types.OpalBackCollectionLoader<MatchOpal, RoomOpal> ourMatchOpalLoader = 
			new com.opal.types.OpalBackCollectionLoader<>(
					OpalFactoryFactory.getInstance().getMatchOpalFactory()::forRoomOpalCollection,
					OpalFactoryFactory.getInstance().getMatchOpalFactory()::forRoomOpalCount,
					MatchOpal::setRoomOpal,
					MatchOpal::setRoomOpalInternal,
					MatchOpal::getRoomOpal,
					com.scobolsolo.application.FactoryMap.getNoArgCtorSetCreator(),
					com.scobolsolo.application.FactoryMap.getCollectionArgSetCreator(),
					false
					);

	/* package */ synchronized com.opal.types.OpalBackCollectionSet<MatchOpal, RoomOpal> getMatchOpalSet() {
		if (myMatchSet == null) {
			myMatchSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
					this,
					ourMatchOpalLoader,
					isNew()
					);
		}
		return myMatchSet;
	}

	@Override
	public java.lang.String toString() {
		java.lang.StringBuilder lclSB = new java.lang.StringBuilder(64);
		lclSB.append("RoomOpal[");
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
