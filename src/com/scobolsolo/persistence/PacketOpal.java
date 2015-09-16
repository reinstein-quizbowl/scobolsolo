package com.scobolsolo.persistence;

import java.io.PrintWriter;
import java.io.PrintStream;

import com.opal.*;

import com.scobolsolo.application.*;

@StoreGeneratedPrimaryKey
public final class PacketOpal extends com.opal.UpdatableOpal<Packet> {
	public static final java.lang.Integer ourDefaultSequence = java.lang.Integer.valueOf(0);
	public static final java.lang.Boolean ourDefaultQuestionsPublic = java.lang.Boolean.FALSE;

	private PacketOpal() {
		super();
		setUserFacing(null);
	}

	public PacketOpal(OpalFactory<Packet, PacketOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void applyDefaults() {
		getNewValues()[6] = ourDefaultSequence;
		getNewValues()[8] = ourDefaultQuestionsPublic;
		return;
	}

	@Override
	protected void initializeReferences() {
		myOldReplacementPacketOpal = PacketOpal.NOT_YET_LOADED;
		myOldRoundOpal = RoundOpal.NOT_YET_LOADED;
		myOldTournamentOpal = TournamentOpal.NOT_YET_LOADED;
		return;
	}

	/* package */ static final String[] ourFieldNames = new String[] {
		"Id",
		"Name",
		"ShortName",
		"RoundId",
		"Note",
		"TournamentCode",
		"Sequence",
		"ReplacementPacketId",
		"QuestionsPublic",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.Integer.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.Integer.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.lang.Boolean.class,
	};

	/* package */ static final boolean[] ourFieldNullability = new boolean[] {
		false,
		false,
		false,
		true,
		true,
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
		null,
		null,
	};

	public static final PacketOpal NOT_YET_LOADED = new PacketOpal();

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

	public synchronized java.lang.Integer getRoundIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[3];
	}

	public synchronized java.lang.String getNote() {
		return (java.lang.String) getReadValueSet()[4];
	}

	public synchronized java.lang.String getTournamentCode() {
		return (java.lang.String) getReadValueSet()[5];
	}

	public synchronized java.lang.Integer getSequenceAsObject() {
		return (java.lang.Integer) getReadValueSet()[6];
	}

	public synchronized java.lang.Integer getReplacementPacketIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[7];
	}

	public synchronized java.lang.Boolean isQuestionsPublicAsObject() {
		return (java.lang.Boolean) getReadValueSet()[8];
	}

	public synchronized PacketOpal setId(final java.lang.Integer argId) {
		tryMutate();
		if (argId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myId on " + this + " to null.");
		}
		getNewValues()[0] = argId;
		return this;
	}

	public PacketOpal setId(final int argId) {
		setId(java.lang.Integer.valueOf(argId));
		return this;
	}

	public synchronized PacketOpal setName(final java.lang.String argName) {
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

	public synchronized PacketOpal setShortName(final java.lang.String argShortName) {
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

	public synchronized PacketOpal setRoundId(final java.lang.Integer argRoundId) {
		tryMutate();
		getNewValues()[3] = argRoundId;
		return this;
	}

	public PacketOpal setRoundId(final int argRoundId) {
		setRoundId(java.lang.Integer.valueOf(argRoundId));
		return this;
	}

	public synchronized PacketOpal setNote(final java.lang.String argNote) {
		tryMutate();
		getNewValues()[4] = argNote;
		return this;
	}

	public synchronized PacketOpal setTournamentCode(final java.lang.String argTournamentCode) {
		tryMutate();
		if (argTournamentCode == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myTournamentCode on " + this + " to null.");
		}
		if (argTournamentCode.length() > 32) {
			throw new com.opal.ArgumentTooLongException("Maximum length of myTournamentCode on " + this + " is 32.", argTournamentCode.length(), 32);
		}
		getNewValues()[5] = argTournamentCode;
		return this;
	}

	public synchronized PacketOpal setSequence(final java.lang.Integer argSequence) {
		tryMutate();
		if (argSequence == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set mySequence on " + this + " to null.");
		}
		getNewValues()[6] = argSequence;
		return this;
	}

	public PacketOpal setSequence(final int argSequence) {
		setSequence(java.lang.Integer.valueOf(argSequence));
		return this;
	}

	public synchronized PacketOpal setReplacementPacketId(final java.lang.Integer argReplacementPacketId) {
		tryMutate();
		getNewValues()[7] = argReplacementPacketId;
		return this;
	}

	public PacketOpal setReplacementPacketId(final int argReplacementPacketId) {
		setReplacementPacketId(java.lang.Integer.valueOf(argReplacementPacketId));
		return this;
	}

	public synchronized PacketOpal setQuestionsPublic(final java.lang.Boolean argQuestionsPublic) {
		tryMutate();
		if (argQuestionsPublic == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myQuestionsPublic on " + this + " to null.");
		}
		getNewValues()[8] = argQuestionsPublic;
		return this;
	}

	public PacketOpal setQuestionsPublic(final boolean argQuestionsPublic) {
		setQuestionsPublic(argQuestionsPublic ? Boolean.TRUE : Boolean.FALSE);
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
		myNewReplacementPacketOpal = myOldReplacementPacketOpal;
		myNewRoundOpal = myOldRoundOpal;
		myNewTournamentOpal = myOldTournamentOpal;
		myNewReplacementPacketOpalHashSet = null; /* Necessary if it has been rolled back */
		myReplacementPacketOpalCachedOperations = null; /* Ditto */
		myNewPlacementOpalHashSet = null; /* Necessary if it has been rolled back */
		myPlacementOpalCachedOperations = null; /* Ditto */
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		myOldReplacementPacketOpal = myNewReplacementPacketOpal;
		myOldRoundOpal = myNewRoundOpal;
		myOldTournamentOpal = myNewTournamentOpal;

		if (needsToClearOldCollections()) {
			myOldReplacementPacketOpalHashSet = null;
			} else {
			if (myNewReplacementPacketOpalHashSet != null) {
				myOldReplacementPacketOpalHashSet = myNewReplacementPacketOpalHashSet;
				myNewReplacementPacketOpalHashSet = null;
			} else {
				myReplacementPacketOpalCachedOperations = null;
			}
		}
		if (needsToClearOldCollections()) {
			myOldPlacementOpalHashSet = null;
			} else {
			if (myNewPlacementOpalHashSet != null) {
				myOldPlacementOpalHashSet = myNewPlacementOpalHashSet;
				myNewPlacementOpalHashSet = null;
			} else {
				myPlacementOpalCachedOperations = null;
			}
		}
		setClearOldCollections(false);
		return;
	}

	@Override
	protected void unlinkInternal() {
		java.util.Iterator<?> lclI;
		if (myNewReplacementPacketOpalHashSet != null || myReplacementPacketOpalCachedOperations != null) {
			lclI = createReplacementPacketOpalIterator();
			while (lclI.hasNext()) {
				((PacketOpal) lclI.next()).setReplacementPacketOpalInternal(null);
			}
		}
		if (myNewPlacementOpalHashSet != null || myPlacementOpalCachedOperations != null) {
			lclI = createPlacementOpalIterator();
			while (lclI.hasNext()) {
				((PlacementOpal) lclI.next()).setPacketOpalInternal(null);
			}
		}
		if (getReplacementPacketOpal() != null) {
			getReplacementPacketOpal().removeReplacementPacketOpalInternal(this);
		}
		if (getTournamentOpal() != null) {
			getTournamentOpal().removePacketOpalInternal(this);
		}
		if (getRoundOpal() != null) {
			getRoundOpal().setPacketOpalInternal(null);
		}
		return;
	}

	@Override
	protected void copyFieldsToInternal(UpdatableOpal<Packet> argTarget) {
		Object[] lclValues = getReadValueSet();
		Object[] lclTargetNewValues = argTarget.getNewValues();
		/* Field 0 (Id) is database generated. */
		/* Field 1 (Name) is part of a unique key. */
		/* Field 2 (ShortName) is part of a unique key. */
		/* Field 3 (RoundId) is part of a unique key. */
		lclTargetNewValues[4] = lclValues[4]; /* Note (immutable) */
		/* Field 5 (TournamentCode) is part of a unique key. */
		lclTargetNewValues[6] = lclValues[6]; /* Sequence (immutable) */
		lclTargetNewValues[7] = lclValues[7]; /* ReplacementPacketId (immutable) */
		lclTargetNewValues[8] = lclValues[8]; /* QuestionsPublic (immutable) */

		return;
	}

	@Override
	public synchronized void translateReferencesToFields() {
		if (myNewReplacementPacketOpal != PacketOpal.NOT_YET_LOADED) {
			setReplacementPacketId(myNewReplacementPacketOpal == null ? null : myNewReplacementPacketOpal.getIdAsObject());
		}
		if (myNewRoundOpal != RoundOpal.NOT_YET_LOADED) {
			setRoundId(myNewRoundOpal == null ? null : myNewRoundOpal.getIdAsObject());
		}
		if (myNewTournamentOpal != TournamentOpal.NOT_YET_LOADED) {
			setTournamentCode(myNewTournamentOpal == null ? null : myNewTournamentOpal.getCode());
		}
		return;
	}

	@Override
	public java.util.Set<com.opal.TransactionAware> getRequiredPriorCommits() {
		java.util.Set<com.opal.TransactionAware> lclTAs = null;
		UpdatableOpal<?> lclUO;
		lclUO = myNewReplacementPacketOpal;
		if ((lclUO != null) && (lclUO != this) && lclUO.isNew()) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		lclUO = myNewRoundOpal;
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
		UpdatableOpal<?> lclUO;
		if ((lclUO = myOldReplacementPacketOpal) == PacketOpal.NOT_YET_LOADED) {
			lclUO = myOldReplacementPacketOpal = retrieveReplacementPacketOpal(getOldValues());
		}
		if (lclUO != null && (lclUO != this) && lclUO.isDeleted()) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		if ((lclUO = myOldRoundOpal) == RoundOpal.NOT_YET_LOADED) {
			lclUO = myOldRoundOpal = retrieveRoundOpal(getOldValues());
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
	public synchronized void output(final PrintWriter argPW) {
		argPW.println("Id = " + getIdAsObject());
		argPW.println("Name = " + getName());
		argPW.println("ShortName = " + getShortName());
		argPW.println("RoundId = " + getRoundIdAsObject());
		argPW.println("Note = " + getNote());
		argPW.println("TournamentCode = " + getTournamentCode());
		argPW.println("Sequence = " + getSequenceAsObject());
		argPW.println("ReplacementPacketId = " + getReplacementPacketIdAsObject());
		argPW.println("QuestionsPublic = " + isQuestionsPublicAsObject());
	}

	@Override
	public synchronized void output(final PrintStream argPS) {
		argPS.println("Id = " + getIdAsObject());
		argPS.println("Name = " + getName());
		argPS.println("ShortName = " + getShortName());
		argPS.println("RoundId = " + getRoundIdAsObject());
		argPS.println("Note = " + getNote());
		argPS.println("TournamentCode = " + getTournamentCode());
		argPS.println("Sequence = " + getSequenceAsObject());
		argPS.println("ReplacementPacketId = " + getReplacementPacketIdAsObject());
		argPS.println("QuestionsPublic = " + isQuestionsPublicAsObject());
	}

	private PacketOpal myOldReplacementPacketOpal;
	private PacketOpal myNewReplacementPacketOpal;

	protected PacketOpal retrieveReplacementPacketOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[7] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getPacketOpalFactory().forId(getReplacementPacketIdAsObject());
	}

	public synchronized PacketOpal getReplacementPacketOpal() {
		PacketOpal lclPacketOpal;
		boolean lclAccess = tryAccess();
		lclPacketOpal = lclAccess ? myNewReplacementPacketOpal : myOldReplacementPacketOpal;
		if (lclPacketOpal == PacketOpal.NOT_YET_LOADED) {
			lclPacketOpal = retrieveReplacementPacketOpal(getReadValueSet());
			if (lclAccess) {
				myNewReplacementPacketOpal = lclPacketOpal;
			} else {
				myOldReplacementPacketOpal = lclPacketOpal;
			}
		}
		return lclPacketOpal;
	}

	public synchronized PacketOpal setReplacementPacketOpal(PacketOpal argPacketOpal) {
		tryMutate();
		PacketOpal lclPacketOpal = getReplacementPacketOpal();
		if (lclPacketOpal == argPacketOpal) { return this; }
		if (lclPacketOpal != null) {
			lclPacketOpal.removeReplacementPacketOpalInternal(this);
		}
		myNewReplacementPacketOpal = argPacketOpal;
		if (argPacketOpal != null) {
			argPacketOpal.addReplacementPacketOpalInternal(this);
		}
		return this;
	}

	protected synchronized void setReplacementPacketOpalInternal(PacketOpal argPacketOpal) {
		tryMutate();
		myNewReplacementPacketOpal = argPacketOpal;
	}

	private RoundOpal myOldRoundOpal;
	private RoundOpal myNewRoundOpal;

	protected RoundOpal retrieveRoundOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[3] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getRoundOpalFactory().forId(getRoundIdAsObject());
	}

	public synchronized RoundOpal getRoundOpal() {
		RoundOpal lclRoundOpal;
		boolean lclAccess = tryAccess();
		lclRoundOpal = lclAccess ? myNewRoundOpal : myOldRoundOpal;
		if (lclRoundOpal == RoundOpal.NOT_YET_LOADED) {
			lclRoundOpal = retrieveRoundOpal(getReadValueSet());
			if (lclAccess) {
				myNewRoundOpal = lclRoundOpal;
			} else {
				myOldRoundOpal = lclRoundOpal;
			}
		}
		return lclRoundOpal;
	}

	public synchronized PacketOpal setRoundOpal(RoundOpal argRoundOpal) {
		tryMutate();
		if (myNewRoundOpal != null && myNewRoundOpal != RoundOpal.NOT_YET_LOADED) {
			myNewRoundOpal.setPacketOpalInternal(null);
		}
		myNewRoundOpal = argRoundOpal;
		if (argRoundOpal != null) {
			argRoundOpal.setPacketOpalInternal(this);
		}
		return this;
	}

	protected synchronized void setRoundOpalInternal(RoundOpal argRoundOpal) {
		tryMutate();
		myNewRoundOpal = argRoundOpal;
	}

	private TournamentOpal myOldTournamentOpal;
	private TournamentOpal myNewTournamentOpal;

	protected TournamentOpal retrieveTournamentOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[5] == null)) {
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

	public synchronized PacketOpal setTournamentOpal(TournamentOpal argTournamentOpal) {
		tryMutate();
		TournamentOpal lclTournamentOpal = getTournamentOpal();
		if (lclTournamentOpal == argTournamentOpal) { return this; }
		if (lclTournamentOpal != null) {
			lclTournamentOpal.removePacketOpalInternal(this);
		}
		myNewTournamentOpal = argTournamentOpal;
		if (argTournamentOpal != null) {
			argTournamentOpal.addPacketOpalInternal(this);
		}
		return this;
	}

	protected synchronized void setTournamentOpalInternal(TournamentOpal argTournamentOpal) {
		tryMutate();
		myNewTournamentOpal = argTournamentOpal;
	}

	private java.util.HashSet<PacketOpal> myOldReplacementPacketOpalHashSet = null;
	private java.util.HashSet<PacketOpal> myNewReplacementPacketOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<PacketOpal>> myReplacementPacketOpalCachedOperations = null;

	/* package */ java.util.HashSet<PacketOpal> getReplacementPacketOpalHashSet() {
		if (tryAccess()) {
			if (myNewReplacementPacketOpalHashSet == null) {
				if (myOldReplacementPacketOpalHashSet == null) {
					if (isNew()) {
						myOldReplacementPacketOpalHashSet = new java.util.HashSet<>();
					} else {
						myOldReplacementPacketOpalHashSet = OpalFactoryFactory.getInstance().getPacketOpalFactory().forReplacementPacketIdCollection(getIdAsObject());
					}
				}
				myNewReplacementPacketOpalHashSet = new java.util.HashSet<>(myOldReplacementPacketOpalHashSet);
				if (myReplacementPacketOpalCachedOperations != null) {
					OpalUtility.handleCachedOperations(myReplacementPacketOpalCachedOperations, myNewReplacementPacketOpalHashSet);
					myReplacementPacketOpalCachedOperations = null;
				}
			}
			return myNewReplacementPacketOpalHashSet;
		} else {
			if (myOldReplacementPacketOpalHashSet == null) {
				myOldReplacementPacketOpalHashSet = OpalFactoryFactory.getInstance().getPacketOpalFactory().forReplacementPacketIdCollection(getIdAsObject());
			}
			return myOldReplacementPacketOpalHashSet;
		}
	}

	public synchronized void addReplacementPacketOpal(PacketOpal argPacketOpal) {
		tryMutate();
		argPacketOpal.setReplacementPacketOpal(this);
		return;
	}

	protected synchronized void addReplacementPacketOpalInternal(PacketOpal argPacketOpal) {
		tryMutate();
		if (myNewReplacementPacketOpalHashSet == null) {
			if (myOldReplacementPacketOpalHashSet == null) {
				if (myReplacementPacketOpalCachedOperations == null) { myReplacementPacketOpalCachedOperations = new java.util.ArrayList<>(); }
				myReplacementPacketOpalCachedOperations.add(new CachedOperation<>(CachedOperation.ADD, argPacketOpal));
			} else {
				myNewReplacementPacketOpalHashSet = new java.util.HashSet<>(myOldReplacementPacketOpalHashSet);
				myNewReplacementPacketOpalHashSet.add(argPacketOpal);
			}
		} else {
			myNewReplacementPacketOpalHashSet.add(argPacketOpal);
		}
		return;
	}

	public synchronized void removeReplacementPacketOpal(PacketOpal argPacketOpal) {
		tryMutate();
		argPacketOpal.setReplacementPacketOpal(null);
	}

	protected synchronized void removeReplacementPacketOpalInternal(PacketOpal argPacketOpal) {
		tryMutate();
		if (myNewReplacementPacketOpalHashSet == null) {
			if (myOldReplacementPacketOpalHashSet == null) {
				if (myReplacementPacketOpalCachedOperations == null) { myReplacementPacketOpalCachedOperations = new java.util.ArrayList<>(); }
				myReplacementPacketOpalCachedOperations.add(new CachedOperation<>(CachedOperation.REMOVE, argPacketOpal));
			} else {
				myNewReplacementPacketOpalHashSet = new java.util.HashSet<>(myOldReplacementPacketOpalHashSet);
				myNewReplacementPacketOpalHashSet.remove(argPacketOpal);
			}
		} else {
			myNewReplacementPacketOpalHashSet.remove(argPacketOpal);
		}
		return;
	}

	public synchronized int getReplacementPacketOpalCount() { return getReplacementPacketOpalHashSet().size(); }

	public synchronized java.util.Iterator<PacketOpal> createReplacementPacketOpalIterator() {
		return getReplacementPacketOpalHashSet().iterator();
	}

	public synchronized java.util.stream.Stream<PacketOpal> streamReplacementPacketOpal() {
		return getReplacementPacketOpalHashSet().stream();
	}

	public synchronized void clearReplacementPacketOpalInternal() { getReplacementPacketOpalHashSet().clear(); }

	private java.util.HashSet<PlacementOpal> myOldPlacementOpalHashSet = null;
	private java.util.HashSet<PlacementOpal> myNewPlacementOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<PlacementOpal>> myPlacementOpalCachedOperations = null;

	/* package */ java.util.HashSet<PlacementOpal> getPlacementOpalHashSet() {
		if (tryAccess()) {
			if (myNewPlacementOpalHashSet == null) {
				if (myOldPlacementOpalHashSet == null) {
					if (isNew()) {
						myOldPlacementOpalHashSet = new java.util.HashSet<>();
					} else {
						myOldPlacementOpalHashSet = OpalFactoryFactory.getInstance().getPlacementOpalFactory().forPacketIdCollection(getIdAsObject());
					}
				}
				myNewPlacementOpalHashSet = new java.util.HashSet<>(myOldPlacementOpalHashSet);
				if (myPlacementOpalCachedOperations != null) {
					OpalUtility.handleCachedOperations(myPlacementOpalCachedOperations, myNewPlacementOpalHashSet);
					myPlacementOpalCachedOperations = null;
				}
			}
			return myNewPlacementOpalHashSet;
		} else {
			if (myOldPlacementOpalHashSet == null) {
				myOldPlacementOpalHashSet = OpalFactoryFactory.getInstance().getPlacementOpalFactory().forPacketIdCollection(getIdAsObject());
			}
			return myOldPlacementOpalHashSet;
		}
	}

	public synchronized void addPlacementOpal(PlacementOpal argPlacementOpal) {
		tryMutate();
		argPlacementOpal.setPacketOpal(this);
		return;
	}

	protected synchronized void addPlacementOpalInternal(PlacementOpal argPlacementOpal) {
		tryMutate();
		if (myNewPlacementOpalHashSet == null) {
			if (myOldPlacementOpalHashSet == null) {
				if (myPlacementOpalCachedOperations == null) { myPlacementOpalCachedOperations = new java.util.ArrayList<>(); }
				myPlacementOpalCachedOperations.add(new CachedOperation<>(CachedOperation.ADD, argPlacementOpal));
			} else {
				myNewPlacementOpalHashSet = new java.util.HashSet<>(myOldPlacementOpalHashSet);
				myNewPlacementOpalHashSet.add(argPlacementOpal);
			}
		} else {
			myNewPlacementOpalHashSet.add(argPlacementOpal);
		}
		return;
	}

	public synchronized void removePlacementOpal(PlacementOpal argPlacementOpal) {
		tryMutate();
		argPlacementOpal.setPacketOpal(null);
	}

	protected synchronized void removePlacementOpalInternal(PlacementOpal argPlacementOpal) {
		tryMutate();
		if (myNewPlacementOpalHashSet == null) {
			if (myOldPlacementOpalHashSet == null) {
				if (myPlacementOpalCachedOperations == null) { myPlacementOpalCachedOperations = new java.util.ArrayList<>(); }
				myPlacementOpalCachedOperations.add(new CachedOperation<>(CachedOperation.REMOVE, argPlacementOpal));
			} else {
				myNewPlacementOpalHashSet = new java.util.HashSet<>(myOldPlacementOpalHashSet);
				myNewPlacementOpalHashSet.remove(argPlacementOpal);
			}
		} else {
			myNewPlacementOpalHashSet.remove(argPlacementOpal);
		}
		return;
	}

	public synchronized int getPlacementOpalCount() { return getPlacementOpalHashSet().size(); }

	public synchronized java.util.Iterator<PlacementOpal> createPlacementOpalIterator() {
		return getPlacementOpalHashSet().iterator();
	}

	public synchronized java.util.stream.Stream<PlacementOpal> streamPlacementOpal() {
		return getPlacementOpalHashSet().stream();
	}

	public synchronized void clearPlacementOpalInternal() { getPlacementOpalHashSet().clear(); }

	@Override
	public String toString() {
		StringBuilder lclSB =  new StringBuilder(64);
		lclSB.append("PacketOpal[");
		lclSB.append("myId=");
		lclSB.append(toStringField(0));
		lclSB.append(']');
		return lclSB.toString();
	}

	@Override
	protected void updateReferencesAfterReload() {
		if (myNewReplacementPacketOpal != PacketOpal.NOT_YET_LOADED) {
			setReplacementPacketOpal(retrieveReplacementPacketOpal(getNewValues()));
		}
		if (myNewRoundOpal != RoundOpal.NOT_YET_LOADED) {
			setRoundOpal(retrieveRoundOpal(getNewValues()));
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
