package com.scobolsolo.persistence;

import java.io.PrintWriter;
import java.io.PrintStream;

import com.opal.*;

import com.scobolsolo.application.*;

@StoreGeneratedPrimaryKey
public final class PlacementOpal extends com.opal.UpdatableOpal<Placement> {
	public static final java.lang.Boolean ourDefaultTiebreaker = java.lang.Boolean.FALSE;
	public static final java.lang.Boolean ourDefaultScorecheckAfter = java.lang.Boolean.FALSE;

	private PlacementOpal() {
		super();
		setUserFacing(null);
	}

	public PlacementOpal(OpalFactory<Placement, PlacementOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void applyDefaults() {
		getNewValues()[4] = ourDefaultTiebreaker;
		getNewValues()[5] = ourDefaultScorecheckAfter;
		return;
	}

	@Override
	protected void initializeReferences() {
		myOldPacketOpal = PacketOpal.NOT_YET_LOADED;
		myOldQuestionOpal = QuestionOpal.NOT_YET_LOADED;
		return;
	}

	/* package */ static final String[] ourFieldNames = new String[] {
		"Id",
		"QuestionId",
		"PacketId",
		"Sequence",
		"Tiebreaker",
		"ScorecheckAfter",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.lang.Boolean.class,
		java.lang.Boolean.class,
	};

	/* package */ static final boolean[] ourFieldNullability = new boolean[] {
		false,
		false,
		false,
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
	};

	public static final PlacementOpal NOT_YET_LOADED = new PlacementOpal();

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

	public synchronized java.lang.Integer getQuestionIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[1];
	}

	public synchronized java.lang.Integer getPacketIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[2];
	}

	public synchronized java.lang.Integer getSequenceAsObject() {
		return (java.lang.Integer) getReadValueSet()[3];
	}

	public synchronized java.lang.Boolean isTiebreakerAsObject() {
		return (java.lang.Boolean) getReadValueSet()[4];
	}

	public synchronized java.lang.Boolean isScorecheckAfterAsObject() {
		return (java.lang.Boolean) getReadValueSet()[5];
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

	public synchronized void setQuestionId(final java.lang.Integer argQuestionId) {
		tryMutate();
		if (argQuestionId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myQuestionId on " + this + " to null.");
		}
		getNewValues()[1] = argQuestionId;
		return;
	}

	public void setQuestionId(final int argQuestionId) {
		setQuestionId(java.lang.Integer.valueOf(argQuestionId));
		return;
	}

	public synchronized void setPacketId(final java.lang.Integer argPacketId) {
		tryMutate();
		if (argPacketId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myPacketId on " + this + " to null.");
		}
		getNewValues()[2] = argPacketId;
		return;
	}

	public void setPacketId(final int argPacketId) {
		setPacketId(java.lang.Integer.valueOf(argPacketId));
		return;
	}

	public synchronized void setSequence(final java.lang.Integer argSequence) {
		tryMutate();
		if (argSequence == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set mySequence on " + this + " to null.");
		}
		getNewValues()[3] = argSequence;
		return;
	}

	public void setSequence(final int argSequence) {
		setSequence(java.lang.Integer.valueOf(argSequence));
		return;
	}

	public synchronized void setTiebreaker(final java.lang.Boolean argTiebreaker) {
		tryMutate();
		if (argTiebreaker == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myTiebreaker on " + this + " to null.");
		}
		getNewValues()[4] = argTiebreaker;
		return;
	}

	public void setTiebreaker(final boolean argTiebreaker) {
		setTiebreaker(argTiebreaker ? Boolean.TRUE : Boolean.FALSE);
		return;
	}

	public synchronized void setScorecheckAfter(final java.lang.Boolean argScorecheckAfter) {
		tryMutate();
		if (argScorecheckAfter == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myScorecheckAfter on " + this + " to null.");
		}
		getNewValues()[5] = argScorecheckAfter;
		return;
	}

	public void setScorecheckAfter(final boolean argScorecheckAfter) {
		setScorecheckAfter(argScorecheckAfter ? Boolean.TRUE : Boolean.FALSE);
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
		myNewPacketOpal = myOldPacketOpal;
		myNewQuestionOpal = myOldQuestionOpal;
		myNewResponseOpalHashSet = null; /* Necessary if it has been rolled back */
		myResponseOpalCachedOperations = null; /* Ditto */
		myNewReplacementForResponseOpalHashSet = null; /* Necessary if it has been rolled back */
		myReplacementForResponseOpalCachedOperations = null; /* Ditto */
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		myOldPacketOpal = myNewPacketOpal;
		myOldQuestionOpal = myNewQuestionOpal;

		if (needsToClearOldCollections()) {
			myOldResponseOpalHashSet = null;
			} else {
			if (myNewResponseOpalHashSet != null) {
				myOldResponseOpalHashSet = myNewResponseOpalHashSet;
				myNewResponseOpalHashSet = null;
			} else {
				myResponseOpalCachedOperations = null;
			}
		}
		if (needsToClearOldCollections()) {
			myOldReplacementForResponseOpalHashSet = null;
			} else {
			if (myNewReplacementForResponseOpalHashSet != null) {
				myOldReplacementForResponseOpalHashSet = myNewReplacementForResponseOpalHashSet;
				myNewReplacementForResponseOpalHashSet = null;
			} else {
				myReplacementForResponseOpalCachedOperations = null;
			}
		}
		setClearOldCollections(false);
		return;
	}

	@Override
	protected void unlinkInternal() {
		java.util.Iterator<?> lclI;
		if (myNewResponseOpalHashSet != null || myResponseOpalCachedOperations != null) {
			lclI = createResponseOpalIterator();
			while (lclI.hasNext()) {
				((ResponseOpal) lclI.next()).setPlacementOpalInternal(null);
			}
		}
		if (myNewReplacementForResponseOpalHashSet != null || myReplacementForResponseOpalCachedOperations != null) {
			lclI = createReplacementForResponseOpalIterator();
			while (lclI.hasNext()) {
				((ResponseOpal) lclI.next()).setReplacementForPlacementOpalInternal(null);
			}
		}
		if (getPacketOpal() != null) {
			getPacketOpal().removePlacementOpalInternal(this);
		}
		if (getQuestionOpal() != null) {
			getQuestionOpal().removePlacementOpalInternal(this);
		}
		return;
	}

	@Override
	protected void copyFieldsToInternal(UpdatableOpal<Placement> argTarget) {
		Object[] lclValues = getReadValueSet();
		Object[] lclTargetNewValues = argTarget.getNewValues();
		/* Field 0 (Id) is database generated. */
		/* Field 1 (QuestionId) is part of a unique key. */
		/* Field 2 (PacketId) is part of a unique key. */
		lclTargetNewValues[3] = lclValues[3]; /* Sequence (immutable) */
		lclTargetNewValues[4] = lclValues[4]; /* Tiebreaker (immutable) */
		lclTargetNewValues[5] = lclValues[5]; /* ScorecheckAfter (immutable) */

		return;
	}

	@Override
	public synchronized void translateReferencesToFields() {
		if (myNewPacketOpal != PacketOpal.NOT_YET_LOADED) {
			setPacketId(myNewPacketOpal == null ? null : myNewPacketOpal.getIdAsObject());
		}
		if (myNewQuestionOpal != QuestionOpal.NOT_YET_LOADED) {
			setQuestionId(myNewQuestionOpal == null ? null : myNewQuestionOpal.getIdAsObject());
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
		argPW.println("QuestionId = " + getQuestionIdAsObject());
		argPW.println("PacketId = " + getPacketIdAsObject());
		argPW.println("Sequence = " + getSequenceAsObject());
		argPW.println("Tiebreaker = " + isTiebreakerAsObject());
		argPW.println("ScorecheckAfter = " + isScorecheckAfterAsObject());
	}

	@Override
	public synchronized void output(final PrintStream argPS) {
		argPS.println("Id = " + getIdAsObject());
		argPS.println("QuestionId = " + getQuestionIdAsObject());
		argPS.println("PacketId = " + getPacketIdAsObject());
		argPS.println("Sequence = " + getSequenceAsObject());
		argPS.println("Tiebreaker = " + isTiebreakerAsObject());
		argPS.println("ScorecheckAfter = " + isScorecheckAfterAsObject());
	}

	private PacketOpal myOldPacketOpal;
	private PacketOpal myNewPacketOpal;

	protected PacketOpal retrievePacketOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[2] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getPacketOpalFactory().forId(getPacketIdAsObject());
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

	public synchronized void setPacketOpal(PacketOpal argPacketOpal) {
		tryMutate();
		PacketOpal lclPacketOpal = getPacketOpal();
		if (lclPacketOpal == argPacketOpal) { return; }
		if (lclPacketOpal != null) {
			lclPacketOpal.removePlacementOpalInternal(this);
		}
		myNewPacketOpal = argPacketOpal;
		if (argPacketOpal != null) {
			argPacketOpal.addPlacementOpalInternal(this);
		}
		return;
	}

	protected synchronized void setPacketOpalInternal(PacketOpal argPacketOpal) {
		tryMutate();
		myNewPacketOpal = argPacketOpal;
	}

	private QuestionOpal myOldQuestionOpal;
	private QuestionOpal myNewQuestionOpal;

	protected QuestionOpal retrieveQuestionOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[1] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getQuestionOpalFactory().forId(getQuestionIdAsObject());
	}

	public synchronized QuestionOpal getQuestionOpal() {
		QuestionOpal lclQuestionOpal;
		boolean lclAccess = tryAccess();
		lclQuestionOpal = lclAccess ? myNewQuestionOpal : myOldQuestionOpal;
		if (lclQuestionOpal == QuestionOpal.NOT_YET_LOADED) {
			lclQuestionOpal = retrieveQuestionOpal(getReadValueSet());
			if (lclAccess) {
				myNewQuestionOpal = lclQuestionOpal;
			} else {
				myOldQuestionOpal = lclQuestionOpal;
			}
		}
		return lclQuestionOpal;
	}

	public synchronized void setQuestionOpal(QuestionOpal argQuestionOpal) {
		tryMutate();
		QuestionOpal lclQuestionOpal = getQuestionOpal();
		if (lclQuestionOpal == argQuestionOpal) { return; }
		if (lclQuestionOpal != null) {
			lclQuestionOpal.removePlacementOpalInternal(this);
		}
		myNewQuestionOpal = argQuestionOpal;
		if (argQuestionOpal != null) {
			argQuestionOpal.addPlacementOpalInternal(this);
		}
		return;
	}

	protected synchronized void setQuestionOpalInternal(QuestionOpal argQuestionOpal) {
		tryMutate();
		myNewQuestionOpal = argQuestionOpal;
	}

	private java.util.HashSet<ResponseOpal> myOldResponseOpalHashSet = null;
	private java.util.HashSet<ResponseOpal> myNewResponseOpalHashSet = null;
	private java.util.ArrayList<CachedOperation<ResponseOpal>> myResponseOpalCachedOperations = null;

	/* package */ java.util.HashSet<ResponseOpal> getResponseOpalClass() {
		if (tryAccess()) {
			if (myNewResponseOpalHashSet == null) {
				if (myOldResponseOpalHashSet == null) {
					myOldResponseOpalHashSet = OpalFactoryFactory.getInstance().getResponseOpalFactory().forPlacementIdCollection(getIdAsObject());
				}
				myNewResponseOpalHashSet = new java.util.HashSet<>(myOldResponseOpalHashSet);
				if (myResponseOpalCachedOperations != null) {
					OpalUtility.handleCachedOperations(myResponseOpalCachedOperations, myNewResponseOpalHashSet);
					myResponseOpalCachedOperations = null;
				}
			}
			return myNewResponseOpalHashSet;
		}
		if (myOldResponseOpalHashSet == null) {
			myOldResponseOpalHashSet = OpalFactoryFactory.getInstance().getResponseOpalFactory().forPlacementIdCollection(getIdAsObject());
		}
		return myOldResponseOpalHashSet;
	}

	public synchronized void addResponseOpal(ResponseOpal argResponseOpal) {
		tryMutate();
		argResponseOpal.setPlacementOpal(this);
		return;
	}

	protected synchronized void addResponseOpalInternal(ResponseOpal argResponseOpal) {
		tryMutate();
		if (myNewResponseOpalHashSet == null) {
			if (myOldResponseOpalHashSet == null) {
				if (myResponseOpalCachedOperations == null) { myResponseOpalCachedOperations = new java.util.ArrayList<>(); }
				myResponseOpalCachedOperations.add(new CachedOperation<>(CachedOperation.ADD, argResponseOpal));
			} else {
				myNewResponseOpalHashSet = new java.util.HashSet<>(myOldResponseOpalHashSet);
				myNewResponseOpalHashSet.add(argResponseOpal);
			}
		} else {
			myNewResponseOpalHashSet.add(argResponseOpal);
		}
		return;
	}

	public synchronized void removeResponseOpal(ResponseOpal argResponseOpal) {
		tryMutate();
		argResponseOpal.setPlacementOpal(null);
	}

	protected synchronized void removeResponseOpalInternal(ResponseOpal argResponseOpal) {
		tryMutate();
		if (myNewResponseOpalHashSet == null) {
			if (myOldResponseOpalHashSet == null) {
				if (myResponseOpalCachedOperations == null) { myResponseOpalCachedOperations = new java.util.ArrayList<>(); }
				myResponseOpalCachedOperations.add(new CachedOperation<>(CachedOperation.REMOVE, argResponseOpal));
			} else {
				myNewResponseOpalHashSet = new java.util.HashSet<>(myOldResponseOpalHashSet);
				myNewResponseOpalHashSet.remove(argResponseOpal);
			}
		} else {
			myNewResponseOpalHashSet.remove(argResponseOpal);
		}
		return;
	}

	public synchronized int getResponseOpalCount() { return getResponseOpalClass().size(); }

	public synchronized java.util.Iterator<ResponseOpal> createResponseOpalIterator() {
		return getResponseOpalClass().iterator();
	}

	public synchronized java.util.stream.Stream<ResponseOpal> streamResponseOpal() {
		return getResponseOpalClass().stream();
	}

	public synchronized void clearResponseOpalInternal() { getResponseOpalClass().clear(); }

	private java.util.HashSet<ResponseOpal> myOldReplacementForResponseOpalHashSet = null;
	private java.util.HashSet<ResponseOpal> myNewReplacementForResponseOpalHashSet = null;
	private java.util.ArrayList<CachedOperation<ResponseOpal>> myReplacementForResponseOpalCachedOperations = null;

	/* package */ java.util.HashSet<ResponseOpal> getReplacementForResponseOpalClass() {
		if (tryAccess()) {
			if (myNewReplacementForResponseOpalHashSet == null) {
				if (myOldReplacementForResponseOpalHashSet == null) {
					myOldReplacementForResponseOpalHashSet = OpalFactoryFactory.getInstance().getResponseOpalFactory().forReplacementForPlacementIdCollection(getIdAsObject());
				}
				myNewReplacementForResponseOpalHashSet = new java.util.HashSet<>(myOldReplacementForResponseOpalHashSet);
				if (myReplacementForResponseOpalCachedOperations != null) {
					OpalUtility.handleCachedOperations(myReplacementForResponseOpalCachedOperations, myNewReplacementForResponseOpalHashSet);
					myReplacementForResponseOpalCachedOperations = null;
				}
			}
			return myNewReplacementForResponseOpalHashSet;
		}
		if (myOldReplacementForResponseOpalHashSet == null) {
			myOldReplacementForResponseOpalHashSet = OpalFactoryFactory.getInstance().getResponseOpalFactory().forReplacementForPlacementIdCollection(getIdAsObject());
		}
		return myOldReplacementForResponseOpalHashSet;
	}

	public synchronized void addReplacementForResponseOpal(ResponseOpal argResponseOpal) {
		tryMutate();
		argResponseOpal.setReplacementForPlacementOpal(this);
		return;
	}

	protected synchronized void addReplacementForResponseOpalInternal(ResponseOpal argResponseOpal) {
		tryMutate();
		if (myNewReplacementForResponseOpalHashSet == null) {
			if (myOldReplacementForResponseOpalHashSet == null) {
				if (myReplacementForResponseOpalCachedOperations == null) { myReplacementForResponseOpalCachedOperations = new java.util.ArrayList<>(); }
				myReplacementForResponseOpalCachedOperations.add(new CachedOperation<>(CachedOperation.ADD, argResponseOpal));
			} else {
				myNewReplacementForResponseOpalHashSet = new java.util.HashSet<>(myOldReplacementForResponseOpalHashSet);
				myNewReplacementForResponseOpalHashSet.add(argResponseOpal);
			}
		} else {
			myNewReplacementForResponseOpalHashSet.add(argResponseOpal);
		}
		return;
	}

	public synchronized void removeReplacementForResponseOpal(ResponseOpal argResponseOpal) {
		tryMutate();
		argResponseOpal.setReplacementForPlacementOpal(null);
	}

	protected synchronized void removeReplacementForResponseOpalInternal(ResponseOpal argResponseOpal) {
		tryMutate();
		if (myNewReplacementForResponseOpalHashSet == null) {
			if (myOldReplacementForResponseOpalHashSet == null) {
				if (myReplacementForResponseOpalCachedOperations == null) { myReplacementForResponseOpalCachedOperations = new java.util.ArrayList<>(); }
				myReplacementForResponseOpalCachedOperations.add(new CachedOperation<>(CachedOperation.REMOVE, argResponseOpal));
			} else {
				myNewReplacementForResponseOpalHashSet = new java.util.HashSet<>(myOldReplacementForResponseOpalHashSet);
				myNewReplacementForResponseOpalHashSet.remove(argResponseOpal);
			}
		} else {
			myNewReplacementForResponseOpalHashSet.remove(argResponseOpal);
		}
		return;
	}

	public synchronized int getReplacementForResponseOpalCount() { return getReplacementForResponseOpalClass().size(); }

	public synchronized java.util.Iterator<ResponseOpal> createReplacementForResponseOpalIterator() {
		return getReplacementForResponseOpalClass().iterator();
	}

	public synchronized java.util.stream.Stream<ResponseOpal> streamReplacementForResponseOpal() {
		return getReplacementForResponseOpalClass().stream();
	}

	public synchronized void clearReplacementForResponseOpalInternal() { getReplacementForResponseOpalClass().clear(); }

	@Override
	public String toString() {
		StringBuilder lclSB =  new StringBuilder(64);
		lclSB.append("PlacementOpal[");
		lclSB.append("myId=");
		lclSB.append(toStringField(0));
		lclSB.append(']');
		return lclSB.toString();
	}

	@Override
	protected void updateReferencesAfterReload() {
		if (myNewPacketOpal != PacketOpal.NOT_YET_LOADED) {
			setPacketOpal(retrievePacketOpal(getNewValues()));
		}
		if (myNewQuestionOpal != QuestionOpal.NOT_YET_LOADED) {
			setQuestionOpal(retrieveQuestionOpal(getNewValues()));
		}
	}

	@Override
	protected void updateCollectionsAfterReload() {
		assert needsToClearOldCollections() == false;
		setClearOldCollections(true);
	}

}
