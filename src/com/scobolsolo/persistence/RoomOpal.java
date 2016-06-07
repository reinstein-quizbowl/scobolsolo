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

		myNewControlRoomTournamentOpalHashSet = new java.util.HashSet<>();
		myNewStaffAssignmentOpalFast3Set = new com.siliconage.util.Fast3Set<>();
		myNewBuzzerOpalFast3Set = new com.siliconage.util.Fast3Set<>();
		myNewMatchOpalHashSet = new java.util.HashSet<>();

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
		myNewControlRoomTournamentOpalHashSet = null; /* Necessary if it has been rolled back */
		myControlRoomTournamentOpalCachedOperations = null; /* Ditto */
		myNewStaffAssignmentOpalFast3Set = null; /* Necessary if it has been rolled back */
		myStaffAssignmentOpalCachedOperations = null; /* Ditto */
		myNewBuzzerOpalFast3Set = null; /* Necessary if it has been rolled back */
		myBuzzerOpalCachedOperations = null; /* Ditto */
		myNewMatchOpalHashSet = null; /* Necessary if it has been rolled back */
		myMatchOpalCachedOperations = null; /* Ditto */
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		myOldTournamentOpal = myNewTournamentOpal;

		if (needsToClearOldCollections()) {
			myOldControlRoomTournamentOpalHashSet = null;
			myOldStaffAssignmentOpalFast3Set = null;
			myOldBuzzerOpalFast3Set = null;
			myOldMatchOpalHashSet = null;
		} else {
			if (myNewControlRoomTournamentOpalHashSet != null) {
				if (myNewControlRoomTournamentOpalHashSet.size() > 0) {
					myOldControlRoomTournamentOpalHashSet = myNewControlRoomTournamentOpalHashSet;
				} else {
					myOldControlRoomTournamentOpalHashSet = java.util.Collections.emptySet();
				}
				myNewControlRoomTournamentOpalHashSet = null;
			} else {
				myControlRoomTournamentOpalCachedOperations = null;
			}
			if (myNewStaffAssignmentOpalFast3Set != null) {
				if (myNewStaffAssignmentOpalFast3Set.size() > 0) {
					myOldStaffAssignmentOpalFast3Set = myNewStaffAssignmentOpalFast3Set;
				} else {
					myOldStaffAssignmentOpalFast3Set = java.util.Collections.emptySet();
				}
				myNewStaffAssignmentOpalFast3Set = null;
			} else {
				myStaffAssignmentOpalCachedOperations = null;
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
			if (myNewMatchOpalHashSet != null) {
				if (myNewMatchOpalHashSet.size() > 0) {
					myOldMatchOpalHashSet = myNewMatchOpalHashSet;
				} else {
					myOldMatchOpalHashSet = java.util.Collections.emptySet();
				}
				myNewMatchOpalHashSet = null;
			} else {
				myMatchOpalCachedOperations = null;
			}
		}
		setClearOldCollections(false);
		return;
	}

	@Override
	protected void unlinkInternal() {
		java.util.Iterator<?> lclI;
		if (myNewControlRoomTournamentOpalHashSet != null || myControlRoomTournamentOpalCachedOperations != null) {
			lclI = createControlRoomTournamentOpalIterator();
			while (lclI.hasNext()) {
				((TournamentOpal) lclI.next()).setControlRoomOpalInternal(null);
			}
		}
		if (myNewStaffAssignmentOpalFast3Set != null || myStaffAssignmentOpalCachedOperations != null) {
			lclI = createStaffAssignmentOpalIterator();
			while (lclI.hasNext()) {
				((StaffAssignmentOpal) lclI.next()).setRoomOpalInternal(null);
			}
		}
		if (myNewBuzzerOpalFast3Set != null || myBuzzerOpalCachedOperations != null) {
			lclI = createBuzzerOpalIterator();
			while (lclI.hasNext()) {
				((BuzzerOpal) lclI.next()).setRoomOpalInternal(null);
			}
		}
		if (myNewMatchOpalHashSet != null || myMatchOpalCachedOperations != null) {
			lclI = createMatchOpalIterator();
			while (lclI.hasNext()) {
				((MatchOpal) lclI.next()).setRoomOpalInternal(null);
			}
		}
		if (getTournamentOpal() != null) {
			getTournamentOpal().removeRoomOpalInternal(this);
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
		if (lclUO != null && lclUO.isDeleted()) {
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
			lclTournamentOpal.removeRoomOpalInternal(this);
		}
		myNewTournamentOpal = argTournamentOpal;
		if (argTournamentOpal != null) {
			argTournamentOpal.addRoomOpalInternal(this);
		}
		return this;
	}

	protected synchronized void setTournamentOpalInternal(TournamentOpal argTournamentOpal) {
		tryMutate();
		myNewTournamentOpal = argTournamentOpal;
	}

	private java.util.Set<TournamentOpal> myOldControlRoomTournamentOpalHashSet = null;
	private java.util.Set<TournamentOpal> myNewControlRoomTournamentOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<TournamentOpal>> myControlRoomTournamentOpalCachedOperations = null;

	/* package */ java.util.Set<TournamentOpal> getControlRoomTournamentOpalHashSet() {
		if (tryAccess()) {
			if (myNewControlRoomTournamentOpalHashSet == null) {
				if (myOldControlRoomTournamentOpalHashSet == null) {
					if (isNew()) {
						myOldControlRoomTournamentOpalHashSet = java.util.Collections.emptySet();
					} else {
						java.util.Set<TournamentOpal> lclS;
						lclS = OpalFactoryFactory.getInstance().getTournamentOpalFactory().forControlRoomRoomIdCollection(getIdAsObject());
						myOldControlRoomTournamentOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
					}
				}
				myNewControlRoomTournamentOpalHashSet = new java.util.HashSet<>(myOldControlRoomTournamentOpalHashSet);
				if (myControlRoomTournamentOpalCachedOperations != null) {
					com.opal.OpalUtility.handleCachedOperations(myControlRoomTournamentOpalCachedOperations, myNewControlRoomTournamentOpalHashSet);
					myControlRoomTournamentOpalCachedOperations = null;
				}
			}
			return myNewControlRoomTournamentOpalHashSet;
		} else {
			if (myOldControlRoomTournamentOpalHashSet == null) {
				java.util.Set<TournamentOpal> lclS;
				lclS = OpalFactoryFactory.getInstance().getTournamentOpalFactory().forControlRoomRoomIdCollection(getIdAsObject());
				myOldControlRoomTournamentOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
			}
			return myOldControlRoomTournamentOpalHashSet;
		}
	}

	public synchronized void addControlRoomTournamentOpal(TournamentOpal argTournamentOpal) {
		tryMutate();
		argTournamentOpal.setControlRoomOpal(this);
		return;
	}

	protected synchronized void addControlRoomTournamentOpalInternal(TournamentOpal argTournamentOpal) {
		tryMutate();
		if (myNewControlRoomTournamentOpalHashSet == null) {
			if (myOldControlRoomTournamentOpalHashSet == null) {
				if (myControlRoomTournamentOpalCachedOperations == null) { myControlRoomTournamentOpalCachedOperations = new java.util.ArrayList<>(); }
				myControlRoomTournamentOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.ADD, argTournamentOpal));
			} else {
				myNewControlRoomTournamentOpalHashSet = new java.util.HashSet<>(myOldControlRoomTournamentOpalHashSet);
				myNewControlRoomTournamentOpalHashSet.add(argTournamentOpal);
			}
		} else {
			myNewControlRoomTournamentOpalHashSet.add(argTournamentOpal);
		}
		return;
	}

	public synchronized void removeControlRoomTournamentOpal(TournamentOpal argTournamentOpal) {
		tryMutate();
		argTournamentOpal.setControlRoomOpal(null);
	}

	protected synchronized void removeControlRoomTournamentOpalInternal(TournamentOpal argTournamentOpal) {
		tryMutate();
		if (myNewControlRoomTournamentOpalHashSet == null) {
			if (myOldControlRoomTournamentOpalHashSet == null) {
				if (myControlRoomTournamentOpalCachedOperations == null) { myControlRoomTournamentOpalCachedOperations = new java.util.ArrayList<>(); }
				myControlRoomTournamentOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.REMOVE, argTournamentOpal));
			} else {
				myNewControlRoomTournamentOpalHashSet = new java.util.HashSet<>(myOldControlRoomTournamentOpalHashSet);
				myNewControlRoomTournamentOpalHashSet.remove(argTournamentOpal);
			}
		} else {
			myNewControlRoomTournamentOpalHashSet.remove(argTournamentOpal);
		}
		return;
	}

	public synchronized int getControlRoomTournamentOpalCount() { return getControlRoomTournamentOpalHashSet().size(); }

	public synchronized java.util.Iterator<TournamentOpal> createControlRoomTournamentOpalIterator() {
		return getControlRoomTournamentOpalHashSet().iterator();
	}

	public synchronized java.util.stream.Stream<TournamentOpal> streamControlRoomTournamentOpal() {
		return getControlRoomTournamentOpalHashSet().stream();
	}

	private java.util.Set<StaffAssignmentOpal> myOldStaffAssignmentOpalFast3Set = null;
	private java.util.Set<StaffAssignmentOpal> myNewStaffAssignmentOpalFast3Set = null;
	private java.util.ArrayList<com.opal.CachedOperation<StaffAssignmentOpal>> myStaffAssignmentOpalCachedOperations = null;

	/* package */ java.util.Set<StaffAssignmentOpal> getStaffAssignmentOpalFast3Set() {
		if (tryAccess()) {
			if (myNewStaffAssignmentOpalFast3Set == null) {
				if (myOldStaffAssignmentOpalFast3Set == null) {
					if (isNew()) {
						myOldStaffAssignmentOpalFast3Set = java.util.Collections.emptySet();
					} else {
						java.util.Set<StaffAssignmentOpal> lclS;
						lclS = OpalFactoryFactory.getInstance().getStaffAssignmentOpalFactory().forRoomIdCollection(getIdAsObject());
						myOldStaffAssignmentOpalFast3Set = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
					}
				}
				myNewStaffAssignmentOpalFast3Set = new com.siliconage.util.Fast3Set<>(myOldStaffAssignmentOpalFast3Set);
				if (myStaffAssignmentOpalCachedOperations != null) {
					com.opal.OpalUtility.handleCachedOperations(myStaffAssignmentOpalCachedOperations, myNewStaffAssignmentOpalFast3Set);
					myStaffAssignmentOpalCachedOperations = null;
				}
			}
			return myNewStaffAssignmentOpalFast3Set;
		} else {
			if (myOldStaffAssignmentOpalFast3Set == null) {
				java.util.Set<StaffAssignmentOpal> lclS;
				lclS = OpalFactoryFactory.getInstance().getStaffAssignmentOpalFactory().forRoomIdCollection(getIdAsObject());
				myOldStaffAssignmentOpalFast3Set = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
			}
			return myOldStaffAssignmentOpalFast3Set;
		}
	}

	public synchronized void addStaffAssignmentOpal(StaffAssignmentOpal argStaffAssignmentOpal) {
		tryMutate();
		argStaffAssignmentOpal.setRoomOpal(this);
		return;
	}

	protected synchronized void addStaffAssignmentOpalInternal(StaffAssignmentOpal argStaffAssignmentOpal) {
		tryMutate();
		if (myNewStaffAssignmentOpalFast3Set == null) {
			if (myOldStaffAssignmentOpalFast3Set == null) {
				if (myStaffAssignmentOpalCachedOperations == null) { myStaffAssignmentOpalCachedOperations = new java.util.ArrayList<>(); }
				myStaffAssignmentOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.ADD, argStaffAssignmentOpal));
			} else {
				myNewStaffAssignmentOpalFast3Set = new com.siliconage.util.Fast3Set<>(myOldStaffAssignmentOpalFast3Set);
				myNewStaffAssignmentOpalFast3Set.add(argStaffAssignmentOpal);
			}
		} else {
			myNewStaffAssignmentOpalFast3Set.add(argStaffAssignmentOpal);
		}
		return;
	}

	public synchronized void removeStaffAssignmentOpal(StaffAssignmentOpal argStaffAssignmentOpal) {
		tryMutate();
		argStaffAssignmentOpal.setRoomOpal(null);
	}

	protected synchronized void removeStaffAssignmentOpalInternal(StaffAssignmentOpal argStaffAssignmentOpal) {
		tryMutate();
		if (myNewStaffAssignmentOpalFast3Set == null) {
			if (myOldStaffAssignmentOpalFast3Set == null) {
				if (myStaffAssignmentOpalCachedOperations == null) { myStaffAssignmentOpalCachedOperations = new java.util.ArrayList<>(); }
				myStaffAssignmentOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.REMOVE, argStaffAssignmentOpal));
			} else {
				myNewStaffAssignmentOpalFast3Set = new com.siliconage.util.Fast3Set<>(myOldStaffAssignmentOpalFast3Set);
				myNewStaffAssignmentOpalFast3Set.remove(argStaffAssignmentOpal);
			}
		} else {
			myNewStaffAssignmentOpalFast3Set.remove(argStaffAssignmentOpal);
		}
		return;
	}

	public synchronized int getStaffAssignmentOpalCount() { return getStaffAssignmentOpalFast3Set().size(); }

	public synchronized java.util.Iterator<StaffAssignmentOpal> createStaffAssignmentOpalIterator() {
		return getStaffAssignmentOpalFast3Set().iterator();
	}

	public synchronized java.util.stream.Stream<StaffAssignmentOpal> streamStaffAssignmentOpal() {
		return getStaffAssignmentOpalFast3Set().stream();
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
						lclS = OpalFactoryFactory.getInstance().getBuzzerOpalFactory().forRoomIdCollection(getIdAsObject());
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
				lclS = OpalFactoryFactory.getInstance().getBuzzerOpalFactory().forRoomIdCollection(getIdAsObject());
				myOldBuzzerOpalFast3Set = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
			}
			return myOldBuzzerOpalFast3Set;
		}
	}

	public synchronized void addBuzzerOpal(BuzzerOpal argBuzzerOpal) {
		tryMutate();
		argBuzzerOpal.setRoomOpal(this);
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
		argBuzzerOpal.setRoomOpal(null);
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

	private java.util.Set<MatchOpal> myOldMatchOpalHashSet = null;
	private java.util.Set<MatchOpal> myNewMatchOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<MatchOpal>> myMatchOpalCachedOperations = null;

	/* package */ java.util.Set<MatchOpal> getMatchOpalHashSet() {
		if (tryAccess()) {
			if (myNewMatchOpalHashSet == null) {
				if (myOldMatchOpalHashSet == null) {
					if (isNew()) {
						myOldMatchOpalHashSet = java.util.Collections.emptySet();
					} else {
						java.util.Set<MatchOpal> lclS;
						lclS = OpalFactoryFactory.getInstance().getMatchOpalFactory().forRoomIdCollection(getIdAsObject());
						myOldMatchOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
					}
				}
				myNewMatchOpalHashSet = new java.util.HashSet<>(myOldMatchOpalHashSet);
				if (myMatchOpalCachedOperations != null) {
					com.opal.OpalUtility.handleCachedOperations(myMatchOpalCachedOperations, myNewMatchOpalHashSet);
					myMatchOpalCachedOperations = null;
				}
			}
			return myNewMatchOpalHashSet;
		} else {
			if (myOldMatchOpalHashSet == null) {
				java.util.Set<MatchOpal> lclS;
				lclS = OpalFactoryFactory.getInstance().getMatchOpalFactory().forRoomIdCollection(getIdAsObject());
				myOldMatchOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
			}
			return myOldMatchOpalHashSet;
		}
	}

	public synchronized void addMatchOpal(MatchOpal argMatchOpal) {
		tryMutate();
		argMatchOpal.setRoomOpal(this);
		return;
	}

	protected synchronized void addMatchOpalInternal(MatchOpal argMatchOpal) {
		tryMutate();
		if (myNewMatchOpalHashSet == null) {
			if (myOldMatchOpalHashSet == null) {
				if (myMatchOpalCachedOperations == null) { myMatchOpalCachedOperations = new java.util.ArrayList<>(); }
				myMatchOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.ADD, argMatchOpal));
			} else {
				myNewMatchOpalHashSet = new java.util.HashSet<>(myOldMatchOpalHashSet);
				myNewMatchOpalHashSet.add(argMatchOpal);
			}
		} else {
			myNewMatchOpalHashSet.add(argMatchOpal);
		}
		return;
	}

	public synchronized void removeMatchOpal(MatchOpal argMatchOpal) {
		tryMutate();
		argMatchOpal.setRoomOpal(null);
	}

	protected synchronized void removeMatchOpalInternal(MatchOpal argMatchOpal) {
		tryMutate();
		if (myNewMatchOpalHashSet == null) {
			if (myOldMatchOpalHashSet == null) {
				if (myMatchOpalCachedOperations == null) { myMatchOpalCachedOperations = new java.util.ArrayList<>(); }
				myMatchOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.REMOVE, argMatchOpal));
			} else {
				myNewMatchOpalHashSet = new java.util.HashSet<>(myOldMatchOpalHashSet);
				myNewMatchOpalHashSet.remove(argMatchOpal);
			}
		} else {
			myNewMatchOpalHashSet.remove(argMatchOpal);
		}
		return;
	}

	public synchronized int getMatchOpalCount() { return getMatchOpalHashSet().size(); }

	public synchronized java.util.Iterator<MatchOpal> createMatchOpalIterator() {
		return getMatchOpalHashSet().iterator();
	}

	public synchronized java.util.stream.Stream<MatchOpal> streamMatchOpal() {
		return getMatchOpalHashSet().stream();
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
