package com.scobolsolo.persistence;

import java.io.PrintWriter;
import java.io.PrintStream;

import com.opal.*;

import com.scobolsolo.application.*;

@StoreGeneratedPrimaryKey
public final class PhaseOpal extends com.opal.UpdatableOpal<Phase> {

	private PhaseOpal() {
		super();
		setUserFacing(null);
	}

	public PhaseOpal(OpalFactory<Phase, PhaseOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
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

	/* package */ static final FieldValidator[] ourFieldValidators = new FieldValidator[] {
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
	public FieldValidator[] getFieldValidators() { return ourFieldValidators; }

	@Override
	public boolean[] getFieldNullability() { return ourFieldNullability; }

	public static FieldValidator[] getStaticFieldValidators() { return ourFieldValidators; }


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

	public synchronized void setTournamentCode(final java.lang.String argTournamentCode) {
		tryMutate();
		if (argTournamentCode == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myTournamentCode on " + this + " to null.");
		}
		if (argTournamentCode.length() > 32) {
			throw new com.opal.ArgumentTooLongException("Maximum length of myTournamentCode on " + this + " is 32.", argTournamentCode.length(), 32);
		}
		getNewValues()[1] = argTournamentCode;
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

	public synchronized void setCardSystem(final java.lang.Boolean argCardSystem) {
		tryMutate();
		if (argCardSystem == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myCardSystem on " + this + " to null.");
		}
		getNewValues()[5] = argCardSystem;
		return;
	}

	public void setCardSystem(final boolean argCardSystem) {
		setCardSystem(argCardSystem ? Boolean.TRUE : Boolean.FALSE);
		return;
	}

	public synchronized void setNote(final java.lang.String argNote) {
		tryMutate();
		getNewValues()[6] = argNote;
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
		myNewTournamentOpal = myOldTournamentOpal;
		myNewRoundGroupOpalHashSet = null; /* Necessary if it has been rolled back */
		myRoundGroupOpalCachedOperations = null; /* Ditto */
		myNewCardOpalHashSet = null; /* Necessary if it has been rolled back */
		myCardOpalCachedOperations = null; /* Ditto */
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		myOldTournamentOpal = myNewTournamentOpal;

		if (needsToClearOldCollections()) {
			myOldRoundGroupOpalHashSet = null;
			} else {
			if (myNewRoundGroupOpalHashSet != null) {
				myOldRoundGroupOpalHashSet = myNewRoundGroupOpalHashSet;
				myNewRoundGroupOpalHashSet = null;
			} else {
				myRoundGroupOpalCachedOperations = null;
			}
		}
		if (needsToClearOldCollections()) {
			myOldCardOpalHashSet = null;
			} else {
			if (myNewCardOpalHashSet != null) {
				myOldCardOpalHashSet = myNewCardOpalHashSet;
				myNewCardOpalHashSet = null;
			} else {
				myCardOpalCachedOperations = null;
			}
		}
		setClearOldCollections(false);
		return;
	}

	@Override
	protected void unlinkInternal() {
		java.util.Iterator<?> lclI;
		if (myNewRoundGroupOpalHashSet != null || myRoundGroupOpalCachedOperations != null) {
			lclI = createRoundGroupOpalIterator();
			while (lclI.hasNext()) {
				((RoundGroupOpal) lclI.next()).setPhaseOpalInternal(null);
			}
		}
		if (myNewCardOpalHashSet != null || myCardOpalCachedOperations != null) {
			lclI = createCardOpalIterator();
			while (lclI.hasNext()) {
				((CardOpal) lclI.next()).setPhaseOpalInternal(null);
			}
		}
		if (getTournamentOpal() != null) {
			getTournamentOpal().removePhaseOpalInternal(this);
		}
		return;
	}

	@Override
	protected void copyFieldsToInternal(UpdatableOpal<Phase> argTarget) {
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
		argPW.println("TournamentCode = " + getTournamentCode());
		argPW.println("Name = " + getName());
		argPW.println("ShortName = " + getShortName());
		argPW.println("Sequence = " + getSequenceAsObject());
		argPW.println("CardSystem = " + isCardSystemAsObject());
		argPW.println("Note = " + getNote());
	}

	@Override
	public synchronized void output(final PrintStream argPS) {
		argPS.println("Id = " + getIdAsObject());
		argPS.println("TournamentCode = " + getTournamentCode());
		argPS.println("Name = " + getName());
		argPS.println("ShortName = " + getShortName());
		argPS.println("Sequence = " + getSequenceAsObject());
		argPS.println("CardSystem = " + isCardSystemAsObject());
		argPS.println("Note = " + getNote());
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

	public synchronized void setTournamentOpal(TournamentOpal argTournamentOpal) {
		tryMutate();
		TournamentOpal lclTournamentOpal = getTournamentOpal();
		if (lclTournamentOpal == argTournamentOpal) { return; }
		if (lclTournamentOpal != null) {
			lclTournamentOpal.removePhaseOpalInternal(this);
		}
		myNewTournamentOpal = argTournamentOpal;
		if (argTournamentOpal != null) {
			argTournamentOpal.addPhaseOpalInternal(this);
		}
		return;
	}

	protected synchronized void setTournamentOpalInternal(TournamentOpal argTournamentOpal) {
		tryMutate();
		myNewTournamentOpal = argTournamentOpal;
	}

	private java.util.HashSet<RoundGroupOpal> myOldRoundGroupOpalHashSet = null;
	private java.util.HashSet<RoundGroupOpal> myNewRoundGroupOpalHashSet = null;
	private java.util.ArrayList<CachedOperation<RoundGroupOpal>> myRoundGroupOpalCachedOperations = null;

	/* package */ java.util.HashSet<RoundGroupOpal> getRoundGroupOpalClass() {
		if (tryAccess()) {
			if (myNewRoundGroupOpalHashSet == null) {
				if (myOldRoundGroupOpalHashSet == null) {
					myOldRoundGroupOpalHashSet = OpalFactoryFactory.getInstance().getRoundGroupOpalFactory().forPhaseIdCollection(getIdAsObject());
				}
				myNewRoundGroupOpalHashSet = new java.util.HashSet<>(myOldRoundGroupOpalHashSet);
				if (myRoundGroupOpalCachedOperations != null) {
					OpalUtility.handleCachedOperations(myRoundGroupOpalCachedOperations, myNewRoundGroupOpalHashSet);
					myRoundGroupOpalCachedOperations = null;
				}
			}
			return myNewRoundGroupOpalHashSet;
		}
		if (myOldRoundGroupOpalHashSet == null) {
			myOldRoundGroupOpalHashSet = OpalFactoryFactory.getInstance().getRoundGroupOpalFactory().forPhaseIdCollection(getIdAsObject());
		}
		return myOldRoundGroupOpalHashSet;
	}

	public synchronized void addRoundGroupOpal(RoundGroupOpal argRoundGroupOpal) {
		tryMutate();
		argRoundGroupOpal.setPhaseOpal(this);
		return;
	}

	protected synchronized void addRoundGroupOpalInternal(RoundGroupOpal argRoundGroupOpal) {
		tryMutate();
		if (myNewRoundGroupOpalHashSet == null) {
			if (myOldRoundGroupOpalHashSet == null) {
				if (myRoundGroupOpalCachedOperations == null) { myRoundGroupOpalCachedOperations = new java.util.ArrayList<>(); }
				myRoundGroupOpalCachedOperations.add(new CachedOperation<>(CachedOperation.ADD, argRoundGroupOpal));
			} else {
				myNewRoundGroupOpalHashSet = new java.util.HashSet<>(myOldRoundGroupOpalHashSet);
				myNewRoundGroupOpalHashSet.add(argRoundGroupOpal);
			}
		} else {
			myNewRoundGroupOpalHashSet.add(argRoundGroupOpal);
		}
		return;
	}

	public synchronized void removeRoundGroupOpal(RoundGroupOpal argRoundGroupOpal) {
		tryMutate();
		argRoundGroupOpal.setPhaseOpal(null);
	}

	protected synchronized void removeRoundGroupOpalInternal(RoundGroupOpal argRoundGroupOpal) {
		tryMutate();
		if (myNewRoundGroupOpalHashSet == null) {
			if (myOldRoundGroupOpalHashSet == null) {
				if (myRoundGroupOpalCachedOperations == null) { myRoundGroupOpalCachedOperations = new java.util.ArrayList<>(); }
				myRoundGroupOpalCachedOperations.add(new CachedOperation<>(CachedOperation.REMOVE, argRoundGroupOpal));
			} else {
				myNewRoundGroupOpalHashSet = new java.util.HashSet<>(myOldRoundGroupOpalHashSet);
				myNewRoundGroupOpalHashSet.remove(argRoundGroupOpal);
			}
		} else {
			myNewRoundGroupOpalHashSet.remove(argRoundGroupOpal);
		}
		return;
	}

	public synchronized int getRoundGroupOpalCount() { return getRoundGroupOpalClass().size(); }

	public synchronized java.util.Iterator<RoundGroupOpal> createRoundGroupOpalIterator() {
		return getRoundGroupOpalClass().iterator();
	}

	public synchronized java.util.stream.Stream<RoundGroupOpal> streamRoundGroupOpal() {
		return getRoundGroupOpalClass().stream();
	}

	public synchronized void clearRoundGroupOpalInternal() { getRoundGroupOpalClass().clear(); }

	private java.util.HashSet<CardOpal> myOldCardOpalHashSet = null;
	private java.util.HashSet<CardOpal> myNewCardOpalHashSet = null;
	private java.util.ArrayList<CachedOperation<CardOpal>> myCardOpalCachedOperations = null;

	/* package */ java.util.HashSet<CardOpal> getCardOpalClass() {
		if (tryAccess()) {
			if (myNewCardOpalHashSet == null) {
				if (myOldCardOpalHashSet == null) {
					myOldCardOpalHashSet = OpalFactoryFactory.getInstance().getCardOpalFactory().forPhaseIdCollection(getIdAsObject());
				}
				myNewCardOpalHashSet = new java.util.HashSet<>(myOldCardOpalHashSet);
				if (myCardOpalCachedOperations != null) {
					OpalUtility.handleCachedOperations(myCardOpalCachedOperations, myNewCardOpalHashSet);
					myCardOpalCachedOperations = null;
				}
			}
			return myNewCardOpalHashSet;
		}
		if (myOldCardOpalHashSet == null) {
			myOldCardOpalHashSet = OpalFactoryFactory.getInstance().getCardOpalFactory().forPhaseIdCollection(getIdAsObject());
		}
		return myOldCardOpalHashSet;
	}

	public synchronized void addCardOpal(CardOpal argCardOpal) {
		tryMutate();
		argCardOpal.setPhaseOpal(this);
		return;
	}

	protected synchronized void addCardOpalInternal(CardOpal argCardOpal) {
		tryMutate();
		if (myNewCardOpalHashSet == null) {
			if (myOldCardOpalHashSet == null) {
				if (myCardOpalCachedOperations == null) { myCardOpalCachedOperations = new java.util.ArrayList<>(); }
				myCardOpalCachedOperations.add(new CachedOperation<>(CachedOperation.ADD, argCardOpal));
			} else {
				myNewCardOpalHashSet = new java.util.HashSet<>(myOldCardOpalHashSet);
				myNewCardOpalHashSet.add(argCardOpal);
			}
		} else {
			myNewCardOpalHashSet.add(argCardOpal);
		}
		return;
	}

	public synchronized void removeCardOpal(CardOpal argCardOpal) {
		tryMutate();
		argCardOpal.setPhaseOpal(null);
	}

	protected synchronized void removeCardOpalInternal(CardOpal argCardOpal) {
		tryMutate();
		if (myNewCardOpalHashSet == null) {
			if (myOldCardOpalHashSet == null) {
				if (myCardOpalCachedOperations == null) { myCardOpalCachedOperations = new java.util.ArrayList<>(); }
				myCardOpalCachedOperations.add(new CachedOperation<>(CachedOperation.REMOVE, argCardOpal));
			} else {
				myNewCardOpalHashSet = new java.util.HashSet<>(myOldCardOpalHashSet);
				myNewCardOpalHashSet.remove(argCardOpal);
			}
		} else {
			myNewCardOpalHashSet.remove(argCardOpal);
		}
		return;
	}

	public synchronized int getCardOpalCount() { return getCardOpalClass().size(); }

	public synchronized java.util.Iterator<CardOpal> createCardOpalIterator() {
		return getCardOpalClass().iterator();
	}

	public synchronized java.util.stream.Stream<CardOpal> streamCardOpal() {
		return getCardOpalClass().stream();
	}

	public synchronized void clearCardOpalInternal() { getCardOpalClass().clear(); }

	@Override
	public String toString() {
		StringBuilder lclSB =  new StringBuilder(64);
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
