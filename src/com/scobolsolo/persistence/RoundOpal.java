package com.scobolsolo.persistence;

import java.io.PrintWriter;
import java.io.PrintStream;

import com.opal.*;

import com.scobolsolo.application.*;

@StoreGeneratedPrimaryKey
public final class RoundOpal extends com.opal.UpdatableOpal<Round> {
	public static final java.lang.Boolean ourDefaultLunchAfter = java.lang.Boolean.FALSE;

	private RoundOpal() {
		super();
		setUserFacing(null);
	}

	public RoundOpal(OpalFactory<Round, RoundOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void applyDefaults() {
		getNewValues()[6] = ourDefaultLunchAfter;
		return;
	}

	@Override
	protected void initializeReferences() {
		myOldRoundGroupOpal = RoundGroupOpal.NOT_YET_LOADED;
		return;
	}

	/* package */ static final String[] ourFieldNames = new String[] {
		"Id",
		"RoundGroupId",
		"Name",
		"ShortName",
		"Sequence",
		"StartTime",
		"LunchAfter",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.Integer.class,
		java.lang.String.class,
		java.lang.Boolean.class,
	};

	/* package */ static final boolean[] ourFieldNullability = new boolean[] {
		false,
		true,
		false,
		false,
		false,
		true,
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

	public static final RoundOpal NOT_YET_LOADED = new RoundOpal();

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

	public synchronized java.lang.Integer getRoundGroupIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[1];
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

	public synchronized java.lang.String getStartTime() {
		return (java.lang.String) getReadValueSet()[5];
	}

	public synchronized java.lang.Boolean isLunchAfterAsObject() {
		return (java.lang.Boolean) getReadValueSet()[6];
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

	public synchronized void setRoundGroupId(final java.lang.Integer argRoundGroupId) {
		tryMutate();
		getNewValues()[1] = argRoundGroupId;
		return;
	}

	public void setRoundGroupId(final int argRoundGroupId) {
		setRoundGroupId(java.lang.Integer.valueOf(argRoundGroupId));
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
		getNewValues()[2] = argName;
		return;
	}

	public synchronized void setShortName(final java.lang.String argShortName) {
		tryMutate();
		if (argShortName == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myShortName on " + this + " to null.");
		}
		if (argShortName.length() > 32) {
			throw new com.opal.ArgumentTooLongException("Maximum length of myShortName on " + this + " is 32.", argShortName.length(), 32);
		}
		getNewValues()[3] = argShortName;
		return;
	}

	public synchronized void setSequence(final java.lang.Integer argSequence) {
		tryMutate();
		if (argSequence == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set mySequence on " + this + " to null.");
		}
		getNewValues()[4] = argSequence;
		return;
	}

	public void setSequence(final int argSequence) {
		setSequence(java.lang.Integer.valueOf(argSequence));
		return;
	}

	public synchronized void setStartTime(final java.lang.String argStartTime) {
		tryMutate();
		if ((argStartTime != null) && (argStartTime.length() > 16)) {
			throw new com.opal.ArgumentTooLongException("Maximum length of myStartTime on " + this + " is 16.", argStartTime.length(), 16);
		}
		getNewValues()[5] = argStartTime;
		return;
	}

	public synchronized void setLunchAfter(final java.lang.Boolean argLunchAfter) {
		tryMutate();
		if (argLunchAfter == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myLunchAfter on " + this + " to null.");
		}
		getNewValues()[6] = argLunchAfter;
		return;
	}

	public void setLunchAfter(final boolean argLunchAfter) {
		setLunchAfter(argLunchAfter ? Boolean.TRUE : Boolean.FALSE);
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
		myNewRoundGroupOpal = myOldRoundGroupOpal;
		myNewMatchOpalHashSet = null; /* Necessary if it has been rolled back */
		myMatchOpalCachedOperations = null; /* Ditto */
		myNewPacketOpalHashSet = null; /* Necessary if it has been rolled back */
		myPacketOpalCachedOperations = null; /* Ditto */
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		myOldRoundGroupOpal = myNewRoundGroupOpal;

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
		if (needsToClearOldCollections()) {
			myOldPacketOpalHashSet = null;
			} else {
			if (myNewPacketOpalHashSet != null) {
				myOldPacketOpalHashSet = myNewPacketOpalHashSet;
				myNewPacketOpalHashSet = null;
			} else {
				myPacketOpalCachedOperations = null;
			}
		}
		setClearOldCollections(false);
		return;
	}

	@Override
	protected void unlinkInternal() {
		java.util.Iterator<?> lclI;
		if (myNewMatchOpalHashSet != null || myMatchOpalCachedOperations != null) {
			lclI = createMatchOpalIterator();
			while (lclI.hasNext()) {
				((MatchOpal) lclI.next()).setRoundOpalInternal(null);
			}
		}
		if (myNewPacketOpalHashSet != null || myPacketOpalCachedOperations != null) {
			lclI = createPacketOpalIterator();
			while (lclI.hasNext()) {
				((PacketOpal) lclI.next()).setRoundOpalInternal(null);
			}
		}
		if (getRoundGroupOpal() != null) {
			getRoundGroupOpal().removeRoundOpalInternal(this);
		}
		return;
	}

	@Override
	protected void copyFieldsToInternal(UpdatableOpal<Round> argTarget) {
		Object[] lclValues = getReadValueSet();
		Object[] lclTargetNewValues = argTarget.getNewValues();
		/* Field 0 (Id) is database generated. */
		/* Field 1 (RoundGroupId) is part of a unique key. */
		/* Field 2 (Name) is part of a unique key. */
		/* Field 3 (ShortName) is part of a unique key. */
		lclTargetNewValues[4] = lclValues[4]; /* Sequence (immutable) */
		lclTargetNewValues[5] = lclValues[5]; /* StartTime (immutable) */
		lclTargetNewValues[6] = lclValues[6]; /* LunchAfter (immutable) */

		return;
	}

	@Override
	public synchronized void translateReferencesToFields() {
		if (myNewRoundGroupOpal != RoundGroupOpal.NOT_YET_LOADED) {
			setRoundGroupId(myNewRoundGroupOpal == null ? null : myNewRoundGroupOpal.getIdAsObject());
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
		argPW.println("RoundGroupId = " + getRoundGroupIdAsObject());
		argPW.println("Name = " + getName());
		argPW.println("ShortName = " + getShortName());
		argPW.println("Sequence = " + getSequenceAsObject());
		argPW.println("StartTime = " + getStartTime());
		argPW.println("LunchAfter = " + isLunchAfterAsObject());
	}

	@Override
	public synchronized void output(final PrintStream argPS) {
		argPS.println("Id = " + getIdAsObject());
		argPS.println("RoundGroupId = " + getRoundGroupIdAsObject());
		argPS.println("Name = " + getName());
		argPS.println("ShortName = " + getShortName());
		argPS.println("Sequence = " + getSequenceAsObject());
		argPS.println("StartTime = " + getStartTime());
		argPS.println("LunchAfter = " + isLunchAfterAsObject());
	}

	private RoundGroupOpal myOldRoundGroupOpal;
	private RoundGroupOpal myNewRoundGroupOpal;

	protected RoundGroupOpal retrieveRoundGroupOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[1] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getRoundGroupOpalFactory().forId(getRoundGroupIdAsObject());
	}

	public synchronized RoundGroupOpal getRoundGroupOpal() {
		RoundGroupOpal lclRoundGroupOpal;
		boolean lclAccess = tryAccess();
		lclRoundGroupOpal = lclAccess ? myNewRoundGroupOpal : myOldRoundGroupOpal;
		if (lclRoundGroupOpal == RoundGroupOpal.NOT_YET_LOADED) {
			lclRoundGroupOpal = retrieveRoundGroupOpal(getReadValueSet());
			if (lclAccess) {
				myNewRoundGroupOpal = lclRoundGroupOpal;
			} else {
				myOldRoundGroupOpal = lclRoundGroupOpal;
			}
		}
		return lclRoundGroupOpal;
	}

	public synchronized void setRoundGroupOpal(RoundGroupOpal argRoundGroupOpal) {
		tryMutate();
		RoundGroupOpal lclRoundGroupOpal = getRoundGroupOpal();
		if (lclRoundGroupOpal == argRoundGroupOpal) { return; }
		if (lclRoundGroupOpal != null) {
			lclRoundGroupOpal.removeRoundOpalInternal(this);
		}
		myNewRoundGroupOpal = argRoundGroupOpal;
		if (argRoundGroupOpal != null) {
			argRoundGroupOpal.addRoundOpalInternal(this);
		}
		return;
	}

	protected synchronized void setRoundGroupOpalInternal(RoundGroupOpal argRoundGroupOpal) {
		tryMutate();
		myNewRoundGroupOpal = argRoundGroupOpal;
	}

	private java.util.HashSet<MatchOpal> myOldMatchOpalHashSet = null;
	private java.util.HashSet<MatchOpal> myNewMatchOpalHashSet = null;
	private java.util.ArrayList<CachedOperation<MatchOpal>> myMatchOpalCachedOperations = null;

	/* package */ java.util.HashSet<MatchOpal> getMatchOpalClass() {
		if (tryAccess()) {
			if (myNewMatchOpalHashSet == null) {
				if (myOldMatchOpalHashSet == null) {
					myOldMatchOpalHashSet = OpalFactoryFactory.getInstance().getMatchOpalFactory().forRoundIdCollection(getIdAsObject());
				}
				myNewMatchOpalHashSet = new java.util.HashSet<>(myOldMatchOpalHashSet);
				if (myMatchOpalCachedOperations != null) {
					OpalUtility.handleCachedOperations(myMatchOpalCachedOperations, myNewMatchOpalHashSet);
					myMatchOpalCachedOperations = null;
				}
			}
			return myNewMatchOpalHashSet;
		}
		if (myOldMatchOpalHashSet == null) {
			myOldMatchOpalHashSet = OpalFactoryFactory.getInstance().getMatchOpalFactory().forRoundIdCollection(getIdAsObject());
		}
		return myOldMatchOpalHashSet;
	}

	public synchronized void addMatchOpal(MatchOpal argMatchOpal) {
		tryMutate();
		argMatchOpal.setRoundOpal(this);
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
		argMatchOpal.setRoundOpal(null);
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

	public synchronized int getMatchOpalCount() { return getMatchOpalClass().size(); }

	public synchronized java.util.Iterator<MatchOpal> createMatchOpalIterator() {
		return getMatchOpalClass().iterator();
	}

	public synchronized java.util.stream.Stream<MatchOpal> streamMatchOpal() {
		return getMatchOpalClass().stream();
	}

	public synchronized void clearMatchOpalInternal() { getMatchOpalClass().clear(); }

	private java.util.HashSet<PacketOpal> myOldPacketOpalHashSet = null;
	private java.util.HashSet<PacketOpal> myNewPacketOpalHashSet = null;
	private java.util.ArrayList<CachedOperation<PacketOpal>> myPacketOpalCachedOperations = null;

	/* package */ java.util.HashSet<PacketOpal> getPacketOpalClass() {
		if (tryAccess()) {
			if (myNewPacketOpalHashSet == null) {
				if (myOldPacketOpalHashSet == null) {
					myOldPacketOpalHashSet = OpalFactoryFactory.getInstance().getPacketOpalFactory().forRoundIdCollection(getIdAsObject());
				}
				myNewPacketOpalHashSet = new java.util.HashSet<>(myOldPacketOpalHashSet);
				if (myPacketOpalCachedOperations != null) {
					OpalUtility.handleCachedOperations(myPacketOpalCachedOperations, myNewPacketOpalHashSet);
					myPacketOpalCachedOperations = null;
				}
			}
			return myNewPacketOpalHashSet;
		}
		if (myOldPacketOpalHashSet == null) {
			myOldPacketOpalHashSet = OpalFactoryFactory.getInstance().getPacketOpalFactory().forRoundIdCollection(getIdAsObject());
		}
		return myOldPacketOpalHashSet;
	}

	public synchronized void addPacketOpal(PacketOpal argPacketOpal) {
		tryMutate();
		argPacketOpal.setRoundOpal(this);
		return;
	}

	protected synchronized void addPacketOpalInternal(PacketOpal argPacketOpal) {
		tryMutate();
		if (myNewPacketOpalHashSet == null) {
			if (myOldPacketOpalHashSet == null) {
				if (myPacketOpalCachedOperations == null) { myPacketOpalCachedOperations = new java.util.ArrayList<>(); }
				myPacketOpalCachedOperations.add(new CachedOperation<>(CachedOperation.ADD, argPacketOpal));
			} else {
				myNewPacketOpalHashSet = new java.util.HashSet<>(myOldPacketOpalHashSet);
				myNewPacketOpalHashSet.add(argPacketOpal);
			}
		} else {
			myNewPacketOpalHashSet.add(argPacketOpal);
		}
		return;
	}

	public synchronized void removePacketOpal(PacketOpal argPacketOpal) {
		tryMutate();
		argPacketOpal.setRoundOpal(null);
	}

	protected synchronized void removePacketOpalInternal(PacketOpal argPacketOpal) {
		tryMutate();
		if (myNewPacketOpalHashSet == null) {
			if (myOldPacketOpalHashSet == null) {
				if (myPacketOpalCachedOperations == null) { myPacketOpalCachedOperations = new java.util.ArrayList<>(); }
				myPacketOpalCachedOperations.add(new CachedOperation<>(CachedOperation.REMOVE, argPacketOpal));
			} else {
				myNewPacketOpalHashSet = new java.util.HashSet<>(myOldPacketOpalHashSet);
				myNewPacketOpalHashSet.remove(argPacketOpal);
			}
		} else {
			myNewPacketOpalHashSet.remove(argPacketOpal);
		}
		return;
	}

	public synchronized int getPacketOpalCount() { return getPacketOpalClass().size(); }

	public synchronized java.util.Iterator<PacketOpal> createPacketOpalIterator() {
		return getPacketOpalClass().iterator();
	}

	public synchronized java.util.stream.Stream<PacketOpal> streamPacketOpal() {
		return getPacketOpalClass().stream();
	}

	public synchronized void clearPacketOpalInternal() { getPacketOpalClass().clear(); }

	@Override
	public String toString() {
		StringBuilder lclSB =  new StringBuilder(64);
		lclSB.append("RoundOpal[");
		lclSB.append("myId=");
		lclSB.append(toStringField(0));
		lclSB.append(']');
		return lclSB.toString();
	}

	@Override
	protected void updateReferencesAfterReload() {
		if (myNewRoundGroupOpal != RoundGroupOpal.NOT_YET_LOADED) {
			setRoundGroupOpal(retrieveRoundGroupOpal(getNewValues()));
		}
	}

	@Override
	protected void updateCollectionsAfterReload() {
		assert needsToClearOldCollections() == false;
		setClearOldCollections(true);
	}

}
