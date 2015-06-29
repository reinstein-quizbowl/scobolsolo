package com.scobolsolo.persistence;

import java.io.PrintWriter;
import java.io.PrintStream;

import com.opal.*;

import com.scobolsolo.application.*;

@StoreGeneratedPrimaryKey
public final class RoomOpal extends com.opal.UpdatableOpal<Room> {
	public static final java.lang.Boolean ourDefaultGameRoom = java.lang.Boolean.TRUE;

	private RoomOpal() {
		super();
		setUserFacing(null);
	}

	public RoomOpal(OpalFactory<Room, RoomOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void applyDefaults() {
		getNewValues()[6] = ourDefaultGameRoom;
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
		"GameRoom",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.Integer.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.Integer.class,
		java.lang.Boolean.class,
	};

	/* package */ static final boolean[] ourFieldNullability = new boolean[] {
		false,
		false,
		false,
		true,
		false,
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
	};

	public static final RoomOpal NOT_YET_LOADED = new RoomOpal();

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

	public synchronized java.lang.Boolean isGameRoomAsObject() {
		return (java.lang.Boolean) getReadValueSet()[6];
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
			throw new com.opal.ArgumentTooLongException("Maximum length of myName on " + this + " is 256.", argName.length(), 256);
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
			throw new com.opal.ArgumentTooLongException("Maximum length of myShortName on " + this + " is 32.", argShortName.length(), 32);
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
			throw new com.opal.ArgumentTooLongException("Maximum length of myTournamentCode on " + this + " is 32.", argTournamentCode.length(), 32);
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

	public synchronized RoomOpal setGameRoom(final java.lang.Boolean argGameRoom) {
		tryMutate();
		if (argGameRoom == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myGameRoom on " + this + " to null.");
		}
		getNewValues()[6] = argGameRoom;
		return this;
	}

	public RoomOpal setGameRoom(final boolean argGameRoom) {
		setGameRoom(argGameRoom ? Boolean.TRUE : Boolean.FALSE);
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
		myNewStaffAssignmentOpalHashSet = null; /* Necessary if it has been rolled back */
		myStaffAssignmentOpalCachedOperations = null; /* Ditto */
		myNewBuzzerOpalHashSet = null; /* Necessary if it has been rolled back */
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
			} else {
			if (myNewControlRoomTournamentOpalHashSet != null) {
				myOldControlRoomTournamentOpalHashSet = myNewControlRoomTournamentOpalHashSet;
				myNewControlRoomTournamentOpalHashSet = null;
			} else {
				myControlRoomTournamentOpalCachedOperations = null;
			}
		}
		if (needsToClearOldCollections()) {
			myOldStaffAssignmentOpalHashSet = null;
			} else {
			if (myNewStaffAssignmentOpalHashSet != null) {
				myOldStaffAssignmentOpalHashSet = myNewStaffAssignmentOpalHashSet;
				myNewStaffAssignmentOpalHashSet = null;
			} else {
				myStaffAssignmentOpalCachedOperations = null;
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
			myOldMatchOpalHashSet = null;
			} else {
			if (myNewMatchOpalHashSet != null) {
				myOldMatchOpalHashSet = myNewMatchOpalHashSet;
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
		if (myNewStaffAssignmentOpalHashSet != null || myStaffAssignmentOpalCachedOperations != null) {
			lclI = createStaffAssignmentOpalIterator();
			while (lclI.hasNext()) {
				((StaffAssignmentOpal) lclI.next()).setRoomOpalInternal(null);
			}
		}
		if (myNewBuzzerOpalHashSet != null || myBuzzerOpalCachedOperations != null) {
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
	protected void copyFieldsToInternal(UpdatableOpal<Room> argTarget) {
		Object[] lclValues = getReadValueSet();
		Object[] lclTargetNewValues = argTarget.getNewValues();
		/* Field 0 (Id) is database generated. */
		/* Field 1 (Name) is part of a unique key. */
		/* Field 2 (ShortName) is part of a unique key. */
		lclTargetNewValues[3] = lclValues[3]; /* Note (immutable) */
		/* Field 4 (TournamentCode) is part of a unique key. */
		lclTargetNewValues[5] = lclValues[5]; /* Sequence (immutable) */
		lclTargetNewValues[6] = lclValues[6]; /* GameRoom (immutable) */

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
		UpdatableOpal<?> lclUO;
		lclUO = myNewTournamentOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		return (lclTAs != null) && (lclTAs.size() > 0) ? lclTAs : java.util.Collections.emptySet();
	}

	@Override
	public java.util.Set<com.opal.TransactionAware> getRequiredSubsequentCommits() {
		java.util.Set<com.opal.TransactionAware> lclTAs = null;
		UpdatableOpal<?> lclUO;
		lclUO = myOldTournamentOpal;
		if ((lclUO != null) && lclUO.isDeleted()) {
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
	public synchronized void output(final PrintWriter argPW) {
		argPW.println("Id = " + getIdAsObject());
		argPW.println("Name = " + getName());
		argPW.println("ShortName = " + getShortName());
		argPW.println("Note = " + getNote());
		argPW.println("TournamentCode = " + getTournamentCode());
		argPW.println("Sequence = " + getSequenceAsObject());
		argPW.println("GameRoom = " + isGameRoomAsObject());
	}

	@Override
	public synchronized void output(final PrintStream argPS) {
		argPS.println("Id = " + getIdAsObject());
		argPS.println("Name = " + getName());
		argPS.println("ShortName = " + getShortName());
		argPS.println("Note = " + getNote());
		argPS.println("TournamentCode = " + getTournamentCode());
		argPS.println("Sequence = " + getSequenceAsObject());
		argPS.println("GameRoom = " + isGameRoomAsObject());
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

	private java.util.HashSet<TournamentOpal> myOldControlRoomTournamentOpalHashSet = null;
	private java.util.HashSet<TournamentOpal> myNewControlRoomTournamentOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<TournamentOpal>> myControlRoomTournamentOpalCachedOperations = null;

	/* package */ java.util.HashSet<TournamentOpal> getControlRoomTournamentOpalHashSet() {
		if (tryAccess()) {
			if (myNewControlRoomTournamentOpalHashSet == null) {
				if (myOldControlRoomTournamentOpalHashSet == null) {
					if (isNew()) {
						myOldControlRoomTournamentOpalHashSet = new java.util.HashSet<>();
					} else {
						myOldControlRoomTournamentOpalHashSet = OpalFactoryFactory.getInstance().getTournamentOpalFactory().forControlRoomRoomIdCollection(getIdAsObject());
					}
				}
				myNewControlRoomTournamentOpalHashSet = new java.util.HashSet<>(myOldControlRoomTournamentOpalHashSet);
				if (myControlRoomTournamentOpalCachedOperations != null) {
					OpalUtility.handleCachedOperations(myControlRoomTournamentOpalCachedOperations, myNewControlRoomTournamentOpalHashSet);
					myControlRoomTournamentOpalCachedOperations = null;
				}
			}
			return myNewControlRoomTournamentOpalHashSet;
		} else {
			if (myOldControlRoomTournamentOpalHashSet == null) {
				myOldControlRoomTournamentOpalHashSet = OpalFactoryFactory.getInstance().getTournamentOpalFactory().forControlRoomRoomIdCollection(getIdAsObject());
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
				myControlRoomTournamentOpalCachedOperations.add(new CachedOperation<>(CachedOperation.ADD, argTournamentOpal));
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
				myControlRoomTournamentOpalCachedOperations.add(new CachedOperation<>(CachedOperation.REMOVE, argTournamentOpal));
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

	public synchronized void clearControlRoomTournamentOpalInternal() { getControlRoomTournamentOpalHashSet().clear(); }

	private java.util.HashSet<StaffAssignmentOpal> myOldStaffAssignmentOpalHashSet = null;
	private java.util.HashSet<StaffAssignmentOpal> myNewStaffAssignmentOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<StaffAssignmentOpal>> myStaffAssignmentOpalCachedOperations = null;

	/* package */ java.util.HashSet<StaffAssignmentOpal> getStaffAssignmentOpalHashSet() {
		if (tryAccess()) {
			if (myNewStaffAssignmentOpalHashSet == null) {
				if (myOldStaffAssignmentOpalHashSet == null) {
					if (isNew()) {
						myOldStaffAssignmentOpalHashSet = new java.util.HashSet<>();
					} else {
						myOldStaffAssignmentOpalHashSet = OpalFactoryFactory.getInstance().getStaffAssignmentOpalFactory().forRoomIdCollection(getIdAsObject());
					}
				}
				myNewStaffAssignmentOpalHashSet = new java.util.HashSet<>(myOldStaffAssignmentOpalHashSet);
				if (myStaffAssignmentOpalCachedOperations != null) {
					OpalUtility.handleCachedOperations(myStaffAssignmentOpalCachedOperations, myNewStaffAssignmentOpalHashSet);
					myStaffAssignmentOpalCachedOperations = null;
				}
			}
			return myNewStaffAssignmentOpalHashSet;
		} else {
			if (myOldStaffAssignmentOpalHashSet == null) {
				myOldStaffAssignmentOpalHashSet = OpalFactoryFactory.getInstance().getStaffAssignmentOpalFactory().forRoomIdCollection(getIdAsObject());
			}
			return myOldStaffAssignmentOpalHashSet;
		}
	}

	public synchronized void addStaffAssignmentOpal(StaffAssignmentOpal argStaffAssignmentOpal) {
		tryMutate();
		argStaffAssignmentOpal.setRoomOpal(this);
		return;
	}

	protected synchronized void addStaffAssignmentOpalInternal(StaffAssignmentOpal argStaffAssignmentOpal) {
		tryMutate();
		if (myNewStaffAssignmentOpalHashSet == null) {
			if (myOldStaffAssignmentOpalHashSet == null) {
				if (myStaffAssignmentOpalCachedOperations == null) { myStaffAssignmentOpalCachedOperations = new java.util.ArrayList<>(); }
				myStaffAssignmentOpalCachedOperations.add(new CachedOperation<>(CachedOperation.ADD, argStaffAssignmentOpal));
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
		argStaffAssignmentOpal.setRoomOpal(null);
	}

	protected synchronized void removeStaffAssignmentOpalInternal(StaffAssignmentOpal argStaffAssignmentOpal) {
		tryMutate();
		if (myNewStaffAssignmentOpalHashSet == null) {
			if (myOldStaffAssignmentOpalHashSet == null) {
				if (myStaffAssignmentOpalCachedOperations == null) { myStaffAssignmentOpalCachedOperations = new java.util.ArrayList<>(); }
				myStaffAssignmentOpalCachedOperations.add(new CachedOperation<>(CachedOperation.REMOVE, argStaffAssignmentOpal));
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

	public synchronized void clearStaffAssignmentOpalInternal() { getStaffAssignmentOpalHashSet().clear(); }

	private java.util.HashSet<BuzzerOpal> myOldBuzzerOpalHashSet = null;
	private java.util.HashSet<BuzzerOpal> myNewBuzzerOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<BuzzerOpal>> myBuzzerOpalCachedOperations = null;

	/* package */ java.util.HashSet<BuzzerOpal> getBuzzerOpalHashSet() {
		if (tryAccess()) {
			if (myNewBuzzerOpalHashSet == null) {
				if (myOldBuzzerOpalHashSet == null) {
					if (isNew()) {
						myOldBuzzerOpalHashSet = new java.util.HashSet<>();
					} else {
						myOldBuzzerOpalHashSet = OpalFactoryFactory.getInstance().getBuzzerOpalFactory().forRoomIdCollection(getIdAsObject());
					}
				}
				myNewBuzzerOpalHashSet = new java.util.HashSet<>(myOldBuzzerOpalHashSet);
				if (myBuzzerOpalCachedOperations != null) {
					OpalUtility.handleCachedOperations(myBuzzerOpalCachedOperations, myNewBuzzerOpalHashSet);
					myBuzzerOpalCachedOperations = null;
				}
			}
			return myNewBuzzerOpalHashSet;
		} else {
			if (myOldBuzzerOpalHashSet == null) {
				myOldBuzzerOpalHashSet = OpalFactoryFactory.getInstance().getBuzzerOpalFactory().forRoomIdCollection(getIdAsObject());
			}
			return myOldBuzzerOpalHashSet;
		}
	}

	public synchronized void addBuzzerOpal(BuzzerOpal argBuzzerOpal) {
		tryMutate();
		argBuzzerOpal.setRoomOpal(this);
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
		argBuzzerOpal.setRoomOpal(null);
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

	public synchronized int getBuzzerOpalCount() { return getBuzzerOpalHashSet().size(); }

	public synchronized java.util.Iterator<BuzzerOpal> createBuzzerOpalIterator() {
		return getBuzzerOpalHashSet().iterator();
	}

	public synchronized java.util.stream.Stream<BuzzerOpal> streamBuzzerOpal() {
		return getBuzzerOpalHashSet().stream();
	}

	public synchronized void clearBuzzerOpalInternal() { getBuzzerOpalHashSet().clear(); }

	private java.util.HashSet<MatchOpal> myOldMatchOpalHashSet = null;
	private java.util.HashSet<MatchOpal> myNewMatchOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<MatchOpal>> myMatchOpalCachedOperations = null;

	/* package */ java.util.HashSet<MatchOpal> getMatchOpalHashSet() {
		if (tryAccess()) {
			if (myNewMatchOpalHashSet == null) {
				if (myOldMatchOpalHashSet == null) {
					if (isNew()) {
						myOldMatchOpalHashSet = new java.util.HashSet<>();
					} else {
						myOldMatchOpalHashSet = OpalFactoryFactory.getInstance().getMatchOpalFactory().forRoomIdCollection(getIdAsObject());
					}
				}
				myNewMatchOpalHashSet = new java.util.HashSet<>(myOldMatchOpalHashSet);
				if (myMatchOpalCachedOperations != null) {
					OpalUtility.handleCachedOperations(myMatchOpalCachedOperations, myNewMatchOpalHashSet);
					myMatchOpalCachedOperations = null;
				}
			}
			return myNewMatchOpalHashSet;
		} else {
			if (myOldMatchOpalHashSet == null) {
				myOldMatchOpalHashSet = OpalFactoryFactory.getInstance().getMatchOpalFactory().forRoomIdCollection(getIdAsObject());
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
				myMatchOpalCachedOperations.add(new CachedOperation<>(CachedOperation.ADD, argMatchOpal));
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
				myMatchOpalCachedOperations.add(new CachedOperation<>(CachedOperation.REMOVE, argMatchOpal));
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

	public synchronized void clearMatchOpalInternal() { getMatchOpalHashSet().clear(); }

	@Override
	public String toString() {
		StringBuilder lclSB =  new StringBuilder(64);
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
