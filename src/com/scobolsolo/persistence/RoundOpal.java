package com.scobolsolo.persistence;

import com.scobolsolo.application.Round;

@com.opal.StoreGeneratedPrimaryKey
public final class RoundOpal extends com.opal.UpdatableOpal<Round> {

	public static final java.lang.Boolean ourDefaultLunchAfter = java.lang.Boolean.FALSE;

	private RoundOpal() {
		super();
		setUserFacing(null);
	}

	public RoundOpal(com.opal.IdentityOpalFactory<Round, RoundOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void applyDefaults() {
		/* Initialize fields with their default values. */
		getNewValues()[6] = ourDefaultLunchAfter;


		/* Initialize the back Collections to empty sets. */

		myNewMatchOpalHashSet = new java.util.HashSet<>();

		return;
	}

	@Override
	protected void initializeReferences() {
		myOldRoundGroupOpal = RoundGroupOpal.NOT_YET_LOADED;
		myOldPacketOpal = PacketOpal.NOT_YET_LOADED;
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
		"EarliestEntryAllowed",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.Integer.class,
		java.lang.String.class,
		java.lang.Boolean.class,
		java.time.LocalDateTime.class,
	};

	/* package */ static final boolean[] ourFieldNullability = new boolean[] {
		false,
		true,
		false,
		false,
		false,
		true,
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
	};

	public static final RoundOpal NOT_YET_LOADED = new RoundOpal();

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

	public synchronized java.time.LocalDateTime getEarliestEntryAllowed() {
		return (java.time.LocalDateTime) getReadValueSet()[7];
	}

	public synchronized RoundOpal setId(final java.lang.Integer argId) {
		tryMutate();
		if (argId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myId on " + this + " to null.");
		}
		getNewValues()[0] = argId;
		return this;
	}

	public RoundOpal setId(final int argId) {
		setId(java.lang.Integer.valueOf(argId));
		return this;
	}

	public synchronized RoundOpal setRoundGroupId(final java.lang.Integer argRoundGroupId) {
		tryMutate();
		getNewValues()[1] = argRoundGroupId;
		return this;
	}

	public RoundOpal setRoundGroupId(final int argRoundGroupId) {
		setRoundGroupId(java.lang.Integer.valueOf(argRoundGroupId));
		return this;
	}

	public synchronized RoundOpal setName(final java.lang.String argName) {
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

	public synchronized RoundOpal setShortName(final java.lang.String argShortName) {
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

	public synchronized RoundOpal setSequence(final java.lang.Integer argSequence) {
		tryMutate();
		if (argSequence == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set mySequence on " + this + " to null.");
		}
		getNewValues()[4] = argSequence;
		return this;
	}

	public RoundOpal setSequence(final int argSequence) {
		setSequence(java.lang.Integer.valueOf(argSequence));
		return this;
	}

	public synchronized RoundOpal setStartTime(final java.lang.String argStartTime) {
		tryMutate();
		if ((argStartTime != null) && (argStartTime.length() > 16)) {
			throw new com.opal.ArgumentTooLongException("Cannot set myStartTime on " + this + " to \"" + argStartTime + "\" because that field's maximum length is 16.", argStartTime.length(), 16);
		}
		getNewValues()[5] = argStartTime;
		return this;
	}

	public synchronized RoundOpal setLunchAfter(final java.lang.Boolean argLunchAfter) {
		tryMutate();
		if (argLunchAfter == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myLunchAfter on " + this + " to null.");
		}
		getNewValues()[6] = argLunchAfter;
		return this;
	}

	public RoundOpal setLunchAfter(final boolean argLunchAfter) {
		setLunchAfter(argLunchAfter ? Boolean.TRUE : Boolean.FALSE);
		return this;
	}

	public synchronized RoundOpal setEarliestEntryAllowed(final java.time.LocalDateTime argEarliestEntryAllowed) {
		tryMutate();
		getNewValues()[7] = argEarliestEntryAllowed;
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
		myNewRoundGroupOpal = myOldRoundGroupOpal;
		myNewPacketOpal = myOldPacketOpal;
		myNewMatchOpalHashSet = null; /* Necessary if it has been rolled back */
		myMatchOpalCachedOperations = null; /* Ditto */
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		myOldRoundGroupOpal = myNewRoundGroupOpal;

		myOldPacketOpal = myNewPacketOpal;
		if (needsToClearOldCollections()) {
			myOldMatchOpalHashSet = null;
		} else {
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
		if (myNewMatchOpalHashSet != null || myMatchOpalCachedOperations != null) {
			lclI = createMatchOpalIterator();
			while (lclI.hasNext()) {
				((MatchOpal) lclI.next()).setRoundOpalInternal(null);
			}
		}
		if (getPacketOpal() != null) {
			getPacketOpal().setRoundOpalInternal(null);
		}
		if (getRoundGroupOpal() != null) {
			getRoundGroupOpal().removeRoundOpalInternal(this);
		}
		return;
	}

	@Override
	protected void copyFieldsToInternal(com.opal.UpdatableOpal<Round> argTarget) {
		Object[] lclValues = getReadValueSet();
		Object[] lclTargetNewValues = argTarget.getNewValues();
		/* Field 0 (Id) is database generated. */
		/* Field 1 (RoundGroupId) is part of a unique key. */
		/* Field 2 (Name) is part of a unique key. */
		/* Field 3 (ShortName) is part of a unique key. */
		lclTargetNewValues[4] = lclValues[4]; /* Sequence (immutable) */
		lclTargetNewValues[5] = lclValues[5]; /* StartTime (immutable) */
		lclTargetNewValues[6] = lclValues[6]; /* LunchAfter (immutable) */
		lclTargetNewValues[7] = lclValues[7]; /* EarliestEntryAllowed (immutable) */

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
	public java.util.Set<com.opal.TransactionAware> getRequiredPriorCommits() {
		java.util.Set<com.opal.TransactionAware> lclTAs = null;
		com.opal.UpdatableOpal<?> lclUO;
		lclUO = myNewRoundGroupOpal;
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
		if ((lclUO = myOldRoundGroupOpal) == RoundGroupOpal.NOT_YET_LOADED) {
			lclUO = myOldRoundGroupOpal = retrieveRoundGroupOpal(getOldValues());
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
		argOutput.println("RoundGroupId = " + getRoundGroupIdAsObject());
		argOutput.println("Name = " + getName());
		argOutput.println("ShortName = " + getShortName());
		argOutput.println("Sequence = " + getSequenceAsObject());
		argOutput.println("StartTime = " + getStartTime());
		argOutput.println("LunchAfter = " + isLunchAfterAsObject());
		argOutput.println("EarliestEntryAllowed = " + getEarliestEntryAllowed());
	}

	@Override
	public synchronized void output(final java.io.PrintWriter argOutput) {
		argOutput.println("Id = " + getIdAsObject());
		argOutput.println("RoundGroupId = " + getRoundGroupIdAsObject());
		argOutput.println("Name = " + getName());
		argOutput.println("ShortName = " + getShortName());
		argOutput.println("Sequence = " + getSequenceAsObject());
		argOutput.println("StartTime = " + getStartTime());
		argOutput.println("LunchAfter = " + isLunchAfterAsObject());
		argOutput.println("EarliestEntryAllowed = " + getEarliestEntryAllowed());
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

	public synchronized RoundOpal setRoundGroupOpal(RoundGroupOpal argRoundGroupOpal) {
		tryMutate();
		RoundGroupOpal lclRoundGroupOpal = getRoundGroupOpal();
		if (lclRoundGroupOpal == argRoundGroupOpal) { return this; }
		if (lclRoundGroupOpal != null) {
			lclRoundGroupOpal.removeRoundOpalInternal(this);
		}
		myNewRoundGroupOpal = argRoundGroupOpal;
		if (argRoundGroupOpal != null) {
			argRoundGroupOpal.addRoundOpalInternal(this);
		}
		return this;
	}

	protected synchronized void setRoundGroupOpalInternal(RoundGroupOpal argRoundGroupOpal) {
		tryMutate();
		myNewRoundGroupOpal = argRoundGroupOpal;
	}

	private PacketOpal myOldPacketOpal;
	private PacketOpal myNewPacketOpal;

	protected PacketOpal retrievePacketOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[0] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getPacketOpalFactory().forRoundId(getIdAsObject());
	}

	public synchronized PacketOpal getPacketOpal() {
		PacketOpal lclPacketOpal;
		boolean lclAccess = tryAccess();
		lclPacketOpal = lclAccess ? myNewPacketOpal : myOldPacketOpal;
		if (lclPacketOpal == PacketOpal.NOT_YET_LOADED) {
			lclPacketOpal = retrievePacketOpal(getReadValueSet());
			if (lclAccess) {
				myNewPacketOpal = lclPacketOpal;
			} else {
				myOldPacketOpal = lclPacketOpal;
			}
		}
		return lclPacketOpal;
	}

	public synchronized RoundOpal setPacketOpal(PacketOpal argPacketOpal) {
		tryMutate();
		myNewPacketOpal = argPacketOpal;
		if (argPacketOpal != null) {
			argPacketOpal.setRoundOpalInternal(this);
		}
		return this;
	}

	public synchronized void setPacketOpalInternal(PacketOpal argPacketOpal) {
		tryMutate();
		myNewPacketOpal = argPacketOpal;
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
						lclS = OpalFactoryFactory.getInstance().getMatchOpalFactory().forRoundIdCollection(getIdAsObject());
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
				lclS = OpalFactoryFactory.getInstance().getMatchOpalFactory().forRoundIdCollection(getIdAsObject());
				myOldMatchOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
			}
			return myOldMatchOpalHashSet;
		}
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
		argMatchOpal.setRoundOpal(null);
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
