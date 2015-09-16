package com.scobolsolo.persistence;

import java.io.PrintWriter;
import java.io.PrintStream;

import com.opal.*;

import com.scobolsolo.application.*;

@StoreGeneratedPrimaryKey
public final class CardOpal extends com.opal.UpdatableOpal<Card> {

	private CardOpal() {
		super();
		setUserFacing(null);
	}

	public CardOpal(OpalFactory<Card, CardOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void initializeReferences() {
		myOldPhaseOpal = PhaseOpal.NOT_YET_LOADED;
		myOldInitialPlayerOpal = PlayerOpal.NOT_YET_LOADED;
		return;
	}

	/* package */ static final String[] ourFieldNames = new String[] {
		"Id",
		"Name",
		"ShortName",
		"Sequence",
		"FinalMessage",
		"PhaseId",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.Integer.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.Integer.class,
		java.lang.String.class,
		java.lang.Integer.class,
	};

	/* package */ static final boolean[] ourFieldNullability = new boolean[] {
		false,
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
	};

	public static final CardOpal NOT_YET_LOADED = new CardOpal();

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

	public synchronized java.lang.Integer getSequenceAsObject() {
		return (java.lang.Integer) getReadValueSet()[3];
	}

	public synchronized java.lang.String getFinalMessage() {
		return (java.lang.String) getReadValueSet()[4];
	}

	public synchronized java.lang.Integer getPhaseIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[5];
	}

	public synchronized CardOpal setId(final java.lang.Integer argId) {
		tryMutate();
		if (argId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myId on " + this + " to null.");
		}
		getNewValues()[0] = argId;
		return this;
	}

	public CardOpal setId(final int argId) {
		setId(java.lang.Integer.valueOf(argId));
		return this;
	}

	public synchronized CardOpal setName(final java.lang.String argName) {
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

	public synchronized CardOpal setShortName(final java.lang.String argShortName) {
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

	public synchronized CardOpal setSequence(final java.lang.Integer argSequence) {
		tryMutate();
		if (argSequence == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set mySequence on " + this + " to null.");
		}
		getNewValues()[3] = argSequence;
		return this;
	}

	public CardOpal setSequence(final int argSequence) {
		setSequence(java.lang.Integer.valueOf(argSequence));
		return this;
	}

	public synchronized CardOpal setFinalMessage(final java.lang.String argFinalMessage) {
		tryMutate();
		getNewValues()[4] = argFinalMessage;
		return this;
	}

	public synchronized CardOpal setPhaseId(final java.lang.Integer argPhaseId) {
		tryMutate();
		if (argPhaseId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myPhaseId on " + this + " to null.");
		}
		getNewValues()[5] = argPhaseId;
		return this;
	}

	public CardOpal setPhaseId(final int argPhaseId) {
		setPhaseId(java.lang.Integer.valueOf(argPhaseId));
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
		myNewPhaseOpal = myOldPhaseOpal;
		myNewInitialPlayerOpal = myOldInitialPlayerOpal;
		myNewLosingMatchOpalHashSet = null; /* Necessary if it has been rolled back */
		myLosingMatchOpalCachedOperations = null; /* Ditto */
		myNewWinningMatchOpalHashSet = null; /* Necessary if it has been rolled back */
		myWinningMatchOpalCachedOperations = null; /* Ditto */
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		myOldPhaseOpal = myNewPhaseOpal;

		myOldInitialPlayerOpal = myNewInitialPlayerOpal;
		if (needsToClearOldCollections()) {
			myOldLosingMatchOpalHashSet = null;
			} else {
			if (myNewLosingMatchOpalHashSet != null) {
				myOldLosingMatchOpalHashSet = myNewLosingMatchOpalHashSet;
				myNewLosingMatchOpalHashSet = null;
			} else {
				myLosingMatchOpalCachedOperations = null;
			}
		}
		if (needsToClearOldCollections()) {
			myOldWinningMatchOpalHashSet = null;
			} else {
			if (myNewWinningMatchOpalHashSet != null) {
				myOldWinningMatchOpalHashSet = myNewWinningMatchOpalHashSet;
				myNewWinningMatchOpalHashSet = null;
			} else {
				myWinningMatchOpalCachedOperations = null;
			}
		}
		setClearOldCollections(false);
		return;
	}

	@Override
	protected void unlinkInternal() {
		java.util.Iterator<?> lclI;
		if (myNewLosingMatchOpalHashSet != null || myLosingMatchOpalCachedOperations != null) {
			lclI = createLosingMatchOpalIterator();
			while (lclI.hasNext()) {
				((MatchOpal) lclI.next()).setLosingCardOpalInternal(null);
			}
		}
		if (myNewWinningMatchOpalHashSet != null || myWinningMatchOpalCachedOperations != null) {
			lclI = createWinningMatchOpalIterator();
			while (lclI.hasNext()) {
				((MatchOpal) lclI.next()).setWinningCardOpalInternal(null);
			}
		}
		if (getInitialPlayerOpal() != null) {
			getInitialPlayerOpal().setInitialCardOpalInternal(null);
		}
		if (getPhaseOpal() != null) {
			getPhaseOpal().removeCardOpalInternal(this);
		}
		return;
	}

	@Override
	protected void copyFieldsToInternal(UpdatableOpal<Card> argTarget) {
		Object[] lclValues = getReadValueSet();
		Object[] lclTargetNewValues = argTarget.getNewValues();
		/* Field 0 (Id) is database generated. */
		/* Field 1 (Name) is part of a unique key. */
		/* Field 2 (ShortName) is part of a unique key. */
		lclTargetNewValues[3] = lclValues[3]; /* Sequence (immutable) */
		lclTargetNewValues[4] = lclValues[4]; /* FinalMessage (immutable) */
		/* Field 5 (PhaseId) is part of a unique key. */

		return;
	}

	@Override
	public synchronized void translateReferencesToFields() {
		if (myNewPhaseOpal != PhaseOpal.NOT_YET_LOADED) {
			setPhaseId(myNewPhaseOpal == null ? null : myNewPhaseOpal.getIdAsObject());
		}
		return;
	}

	@Override
	public java.util.Set<com.opal.TransactionAware> getRequiredPriorCommits() {
		java.util.Set<com.opal.TransactionAware> lclTAs = null;
		UpdatableOpal<?> lclUO;
		lclUO = myNewPhaseOpal;
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
		UpdatableOpal<?> lclUO;
		if ((lclUO = myOldPhaseOpal) == PhaseOpal.NOT_YET_LOADED) {
			lclUO = myOldPhaseOpal = retrievePhaseOpal(getOldValues());
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
	public synchronized void output(final PrintWriter argPW) {
		argPW.println("Id = " + getIdAsObject());
		argPW.println("Name = " + getName());
		argPW.println("ShortName = " + getShortName());
		argPW.println("Sequence = " + getSequenceAsObject());
		argPW.println("FinalMessage = " + getFinalMessage());
		argPW.println("PhaseId = " + getPhaseIdAsObject());
	}

	@Override
	public synchronized void output(final PrintStream argPS) {
		argPS.println("Id = " + getIdAsObject());
		argPS.println("Name = " + getName());
		argPS.println("ShortName = " + getShortName());
		argPS.println("Sequence = " + getSequenceAsObject());
		argPS.println("FinalMessage = " + getFinalMessage());
		argPS.println("PhaseId = " + getPhaseIdAsObject());
	}

	private PhaseOpal myOldPhaseOpal;
	private PhaseOpal myNewPhaseOpal;

	protected PhaseOpal retrievePhaseOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[5] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getPhaseOpalFactory().forId(getPhaseIdAsObject());
	}

	public synchronized PhaseOpal getPhaseOpal() {
		PhaseOpal lclPhaseOpal;
		boolean lclAccess = tryAccess();
		lclPhaseOpal = lclAccess ? myNewPhaseOpal : myOldPhaseOpal;
		if (lclPhaseOpal == PhaseOpal.NOT_YET_LOADED) {
			lclPhaseOpal = retrievePhaseOpal(getReadValueSet());
			if (lclAccess) {
				myNewPhaseOpal = lclPhaseOpal;
			} else {
				myOldPhaseOpal = lclPhaseOpal;
			}
		}
		return lclPhaseOpal;
	}

	public synchronized CardOpal setPhaseOpal(PhaseOpal argPhaseOpal) {
		tryMutate();
		PhaseOpal lclPhaseOpal = getPhaseOpal();
		if (lclPhaseOpal == argPhaseOpal) { return this; }
		if (lclPhaseOpal != null) {
			lclPhaseOpal.removeCardOpalInternal(this);
		}
		myNewPhaseOpal = argPhaseOpal;
		if (argPhaseOpal != null) {
			argPhaseOpal.addCardOpalInternal(this);
		}
		return this;
	}

	protected synchronized void setPhaseOpalInternal(PhaseOpal argPhaseOpal) {
		tryMutate();
		myNewPhaseOpal = argPhaseOpal;
	}

	private PlayerOpal myOldInitialPlayerOpal;
	private PlayerOpal myNewInitialPlayerOpal;

	protected PlayerOpal retrieveInitialPlayerOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[0] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getPlayerOpalFactory().forInitialCardId(getIdAsObject());
	}

	public synchronized PlayerOpal getInitialPlayerOpal() {
		PlayerOpal lclPlayerOpal;
		boolean lclAccess = tryAccess();
		lclPlayerOpal = lclAccess ? myNewInitialPlayerOpal : myOldInitialPlayerOpal;
		if (lclPlayerOpal == PlayerOpal.NOT_YET_LOADED) {
			lclPlayerOpal = retrieveInitialPlayerOpal(getReadValueSet());
			if (lclAccess) {
				myNewInitialPlayerOpal = lclPlayerOpal;
			} else {
				myOldInitialPlayerOpal = lclPlayerOpal;
			}
		}
		return lclPlayerOpal;
	}

	public synchronized CardOpal setInitialPlayerOpal(PlayerOpal argPlayerOpal) {
		tryMutate();
		myNewInitialPlayerOpal = argPlayerOpal;
		if (argPlayerOpal != null) {
			argPlayerOpal.setInitialCardOpalInternal(this);
		}
		return this;
	}

	public synchronized void setInitialPlayerOpalInternal(PlayerOpal argPlayerOpal) {
		tryMutate();
		myNewInitialPlayerOpal = argPlayerOpal;
	}

	private java.util.HashSet<MatchOpal> myOldLosingMatchOpalHashSet = null;
	private java.util.HashSet<MatchOpal> myNewLosingMatchOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<MatchOpal>> myLosingMatchOpalCachedOperations = null;

	/* package */ java.util.HashSet<MatchOpal> getLosingMatchOpalHashSet() {
		if (tryAccess()) {
			if (myNewLosingMatchOpalHashSet == null) {
				if (myOldLosingMatchOpalHashSet == null) {
					if (isNew()) {
						myOldLosingMatchOpalHashSet = new java.util.HashSet<>();
					} else {
						myOldLosingMatchOpalHashSet = OpalFactoryFactory.getInstance().getMatchOpalFactory().forLosingCardIdCollection(getIdAsObject());
					}
				}
				myNewLosingMatchOpalHashSet = new java.util.HashSet<>(myOldLosingMatchOpalHashSet);
				if (myLosingMatchOpalCachedOperations != null) {
					OpalUtility.handleCachedOperations(myLosingMatchOpalCachedOperations, myNewLosingMatchOpalHashSet);
					myLosingMatchOpalCachedOperations = null;
				}
			}
			return myNewLosingMatchOpalHashSet;
		} else {
			if (myOldLosingMatchOpalHashSet == null) {
				myOldLosingMatchOpalHashSet = OpalFactoryFactory.getInstance().getMatchOpalFactory().forLosingCardIdCollection(getIdAsObject());
			}
			return myOldLosingMatchOpalHashSet;
		}
	}

	public synchronized void addLosingMatchOpal(MatchOpal argMatchOpal) {
		tryMutate();
		argMatchOpal.setLosingCardOpal(this);
		return;
	}

	protected synchronized void addLosingMatchOpalInternal(MatchOpal argMatchOpal) {
		tryMutate();
		if (myNewLosingMatchOpalHashSet == null) {
			if (myOldLosingMatchOpalHashSet == null) {
				if (myLosingMatchOpalCachedOperations == null) { myLosingMatchOpalCachedOperations = new java.util.ArrayList<>(); }
				myLosingMatchOpalCachedOperations.add(new CachedOperation<>(CachedOperation.ADD, argMatchOpal));
			} else {
				myNewLosingMatchOpalHashSet = new java.util.HashSet<>(myOldLosingMatchOpalHashSet);
				myNewLosingMatchOpalHashSet.add(argMatchOpal);
			}
		} else {
			myNewLosingMatchOpalHashSet.add(argMatchOpal);
		}
		return;
	}

	public synchronized void removeLosingMatchOpal(MatchOpal argMatchOpal) {
		tryMutate();
		argMatchOpal.setLosingCardOpal(null);
	}

	protected synchronized void removeLosingMatchOpalInternal(MatchOpal argMatchOpal) {
		tryMutate();
		if (myNewLosingMatchOpalHashSet == null) {
			if (myOldLosingMatchOpalHashSet == null) {
				if (myLosingMatchOpalCachedOperations == null) { myLosingMatchOpalCachedOperations = new java.util.ArrayList<>(); }
				myLosingMatchOpalCachedOperations.add(new CachedOperation<>(CachedOperation.REMOVE, argMatchOpal));
			} else {
				myNewLosingMatchOpalHashSet = new java.util.HashSet<>(myOldLosingMatchOpalHashSet);
				myNewLosingMatchOpalHashSet.remove(argMatchOpal);
			}
		} else {
			myNewLosingMatchOpalHashSet.remove(argMatchOpal);
		}
		return;
	}

	public synchronized int getLosingMatchOpalCount() { return getLosingMatchOpalHashSet().size(); }

	public synchronized java.util.Iterator<MatchOpal> createLosingMatchOpalIterator() {
		return getLosingMatchOpalHashSet().iterator();
	}

	public synchronized java.util.stream.Stream<MatchOpal> streamLosingMatchOpal() {
		return getLosingMatchOpalHashSet().stream();
	}

	public synchronized void clearLosingMatchOpalInternal() { getLosingMatchOpalHashSet().clear(); }

	private java.util.HashSet<MatchOpal> myOldWinningMatchOpalHashSet = null;
	private java.util.HashSet<MatchOpal> myNewWinningMatchOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<MatchOpal>> myWinningMatchOpalCachedOperations = null;

	/* package */ java.util.HashSet<MatchOpal> getWinningMatchOpalHashSet() {
		if (tryAccess()) {
			if (myNewWinningMatchOpalHashSet == null) {
				if (myOldWinningMatchOpalHashSet == null) {
					if (isNew()) {
						myOldWinningMatchOpalHashSet = new java.util.HashSet<>();
					} else {
						myOldWinningMatchOpalHashSet = OpalFactoryFactory.getInstance().getMatchOpalFactory().forWinningCardIdCollection(getIdAsObject());
					}
				}
				myNewWinningMatchOpalHashSet = new java.util.HashSet<>(myOldWinningMatchOpalHashSet);
				if (myWinningMatchOpalCachedOperations != null) {
					OpalUtility.handleCachedOperations(myWinningMatchOpalCachedOperations, myNewWinningMatchOpalHashSet);
					myWinningMatchOpalCachedOperations = null;
				}
			}
			return myNewWinningMatchOpalHashSet;
		} else {
			if (myOldWinningMatchOpalHashSet == null) {
				myOldWinningMatchOpalHashSet = OpalFactoryFactory.getInstance().getMatchOpalFactory().forWinningCardIdCollection(getIdAsObject());
			}
			return myOldWinningMatchOpalHashSet;
		}
	}

	public synchronized void addWinningMatchOpal(MatchOpal argMatchOpal) {
		tryMutate();
		argMatchOpal.setWinningCardOpal(this);
		return;
	}

	protected synchronized void addWinningMatchOpalInternal(MatchOpal argMatchOpal) {
		tryMutate();
		if (myNewWinningMatchOpalHashSet == null) {
			if (myOldWinningMatchOpalHashSet == null) {
				if (myWinningMatchOpalCachedOperations == null) { myWinningMatchOpalCachedOperations = new java.util.ArrayList<>(); }
				myWinningMatchOpalCachedOperations.add(new CachedOperation<>(CachedOperation.ADD, argMatchOpal));
			} else {
				myNewWinningMatchOpalHashSet = new java.util.HashSet<>(myOldWinningMatchOpalHashSet);
				myNewWinningMatchOpalHashSet.add(argMatchOpal);
			}
		} else {
			myNewWinningMatchOpalHashSet.add(argMatchOpal);
		}
		return;
	}

	public synchronized void removeWinningMatchOpal(MatchOpal argMatchOpal) {
		tryMutate();
		argMatchOpal.setWinningCardOpal(null);
	}

	protected synchronized void removeWinningMatchOpalInternal(MatchOpal argMatchOpal) {
		tryMutate();
		if (myNewWinningMatchOpalHashSet == null) {
			if (myOldWinningMatchOpalHashSet == null) {
				if (myWinningMatchOpalCachedOperations == null) { myWinningMatchOpalCachedOperations = new java.util.ArrayList<>(); }
				myWinningMatchOpalCachedOperations.add(new CachedOperation<>(CachedOperation.REMOVE, argMatchOpal));
			} else {
				myNewWinningMatchOpalHashSet = new java.util.HashSet<>(myOldWinningMatchOpalHashSet);
				myNewWinningMatchOpalHashSet.remove(argMatchOpal);
			}
		} else {
			myNewWinningMatchOpalHashSet.remove(argMatchOpal);
		}
		return;
	}

	public synchronized int getWinningMatchOpalCount() { return getWinningMatchOpalHashSet().size(); }

	public synchronized java.util.Iterator<MatchOpal> createWinningMatchOpalIterator() {
		return getWinningMatchOpalHashSet().iterator();
	}

	public synchronized java.util.stream.Stream<MatchOpal> streamWinningMatchOpal() {
		return getWinningMatchOpalHashSet().stream();
	}

	public synchronized void clearWinningMatchOpalInternal() { getWinningMatchOpalHashSet().clear(); }

	@Override
	public String toString() {
		StringBuilder lclSB =  new StringBuilder(64);
		lclSB.append("CardOpal[");
		lclSB.append("myId=");
		lclSB.append(toStringField(0));
		lclSB.append(']');
		return lclSB.toString();
	}

	@Override
	protected void updateReferencesAfterReload() {
		if (myNewPhaseOpal != PhaseOpal.NOT_YET_LOADED) {
			setPhaseOpal(retrievePhaseOpal(getNewValues()));
		}
	}

	@Override
	protected void updateCollectionsAfterReload() {
		assert needsToClearOldCollections() == false;
		setClearOldCollections(true);
	}

}
