package com.scobolsolo.persistence;

import java.io.PrintWriter;
import java.io.PrintStream;

import com.opal.*;

import com.scobolsolo.application.*;

@StoreGeneratedPrimaryKey
public final class PerformanceOpal extends com.opal.UpdatableOpal<Performance> {

	private PerformanceOpal() {
		super();
		setUserFacing(null);
	}

	public PerformanceOpal(OpalFactory<Performance, PerformanceOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void initializeReferences() {
		myOldGameOpal = GameOpal.NOT_YET_LOADED;
		myOldPlayerOpal = PlayerOpal.NOT_YET_LOADED;
		return;
	}

	/* package */ static final String[] ourFieldNames = new String[] {
		"Id",
		"GameId",
		"PlayerId",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.lang.Integer.class,
	};

	/* package */ static final boolean[] ourFieldNullability = new boolean[] {
		false,
		false,
		false,
	};

	/* package */ static final FieldValidator[] ourFieldValidators = new FieldValidator[] {
		null,
		null,
		null,
	};

	public static final PerformanceOpal NOT_YET_LOADED = new PerformanceOpal();

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

	public synchronized java.lang.Integer getGameIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[1];
	}

	public synchronized java.lang.Integer getPlayerIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[2];
	}

	public synchronized PerformanceOpal setId(final java.lang.Integer argId) {
		tryMutate();
		if (argId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myId on " + this + " to null.");
		}
		getNewValues()[0] = argId;
		return this;
	}

	public PerformanceOpal setId(final int argId) {
		setId(java.lang.Integer.valueOf(argId));
		return this;
	}

	public synchronized PerformanceOpal setGameId(final java.lang.Integer argGameId) {
		tryMutate();
		if (argGameId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myGameId on " + this + " to null.");
		}
		getNewValues()[1] = argGameId;
		return this;
	}

	public PerformanceOpal setGameId(final int argGameId) {
		setGameId(java.lang.Integer.valueOf(argGameId));
		return this;
	}

	public synchronized PerformanceOpal setPlayerId(final java.lang.Integer argPlayerId) {
		tryMutate();
		if (argPlayerId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myPlayerId on " + this + " to null.");
		}
		getNewValues()[2] = argPlayerId;
		return this;
	}

	public PerformanceOpal setPlayerId(final int argPlayerId) {
		setPlayerId(java.lang.Integer.valueOf(argPlayerId));
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
		myNewGameOpal = myOldGameOpal;
		myNewPlayerOpal = myOldPlayerOpal;
		myNewResponseOpalHashSet = null; /* Necessary if it has been rolled back */
		myResponseOpalCachedOperations = null; /* Ditto */
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		myOldGameOpal = myNewGameOpal;
		myOldPlayerOpal = myNewPlayerOpal;

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
		setClearOldCollections(false);
		return;
	}

	@Override
	protected void unlinkInternal() {
		java.util.Iterator<?> lclI;
		if (myNewResponseOpalHashSet != null || myResponseOpalCachedOperations != null) {
			lclI = createResponseOpalIterator();
			while (lclI.hasNext()) {
				((ResponseOpal) lclI.next()).setPerformanceOpalInternal(null);
			}
		}
		if (getGameOpal() != null) {
			getGameOpal().removePerformanceOpalInternal(this);
		}
		if (getPlayerOpal() != null) {
			getPlayerOpal().removePerformanceOpalInternal(this);
		}
		return;
	}

	@Override
	protected void copyFieldsToInternal(UpdatableOpal<Performance> argTarget) {
		/* Field 0 (Id) is database generated. */
		/* Field 1 (GameId) is part of a unique key. */
		/* Field 2 (PlayerId) is part of a unique key. */

		return;
	}

	@Override
	public synchronized void translateReferencesToFields() {
		if (myNewGameOpal != GameOpal.NOT_YET_LOADED) {
			setGameId(myNewGameOpal == null ? null : myNewGameOpal.getIdAsObject());
		}
		if (myNewPlayerOpal != PlayerOpal.NOT_YET_LOADED) {
			setPlayerId(myNewPlayerOpal == null ? null : myNewPlayerOpal.getIdAsObject());
		}
		return;
	}

	@Override
	public java.util.Set<com.opal.TransactionAware> getRequiredPriorCommits() {
		java.util.Set<com.opal.TransactionAware> lclTAs = null;
		UpdatableOpal<?> lclUO;
		lclUO = myNewGameOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		lclUO = myNewPlayerOpal;
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
		if ((lclUO = myOldGameOpal) == GameOpal.NOT_YET_LOADED) {
			lclUO = myOldGameOpal = retrieveGameOpal(getOldValues());
		}
		if (lclUO != null && lclUO.isDeleted()) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		if ((lclUO = myOldPlayerOpal) == PlayerOpal.NOT_YET_LOADED) {
			lclUO = myOldPlayerOpal = retrievePlayerOpal(getOldValues());
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
		argPW.println("GameId = " + getGameIdAsObject());
		argPW.println("PlayerId = " + getPlayerIdAsObject());
	}

	@Override
	public synchronized void output(final PrintStream argPS) {
		argPS.println("Id = " + getIdAsObject());
		argPS.println("GameId = " + getGameIdAsObject());
		argPS.println("PlayerId = " + getPlayerIdAsObject());
	}

	private GameOpal myOldGameOpal;
	private GameOpal myNewGameOpal;

	protected GameOpal retrieveGameOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[1] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getGameOpalFactory().forId(getGameIdAsObject());
	}

	public synchronized GameOpal getGameOpal() {
		GameOpal lclGameOpal;
		boolean lclAccess = tryAccess();
		lclGameOpal = lclAccess ? myNewGameOpal : myOldGameOpal;
		if (lclGameOpal == GameOpal.NOT_YET_LOADED) {
			lclGameOpal = retrieveGameOpal(getReadValueSet());
			if (lclAccess) {
				myNewGameOpal = lclGameOpal;
			} else {
				myOldGameOpal = lclGameOpal;
			}
		}
		return lclGameOpal;
	}

	public synchronized PerformanceOpal setGameOpal(GameOpal argGameOpal) {
		tryMutate();
		GameOpal lclGameOpal = getGameOpal();
		if (lclGameOpal == argGameOpal) { return this; }
		if (lclGameOpal != null) {
			lclGameOpal.removePerformanceOpalInternal(this);
		}
		myNewGameOpal = argGameOpal;
		if (argGameOpal != null) {
			argGameOpal.addPerformanceOpalInternal(this);
		}
		return this;
	}

	protected synchronized void setGameOpalInternal(GameOpal argGameOpal) {
		tryMutate();
		myNewGameOpal = argGameOpal;
	}

	private PlayerOpal myOldPlayerOpal;
	private PlayerOpal myNewPlayerOpal;

	protected PlayerOpal retrievePlayerOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[2] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getPlayerOpalFactory().forId(getPlayerIdAsObject());
	}

	public synchronized PlayerOpal getPlayerOpal() {
		PlayerOpal lclPlayerOpal;
		boolean lclAccess = tryAccess();
		lclPlayerOpal = lclAccess ? myNewPlayerOpal : myOldPlayerOpal;
		if (lclPlayerOpal == PlayerOpal.NOT_YET_LOADED) {
			lclPlayerOpal = retrievePlayerOpal(getReadValueSet());
			if (lclAccess) {
				myNewPlayerOpal = lclPlayerOpal;
			} else {
				myOldPlayerOpal = lclPlayerOpal;
			}
		}
		return lclPlayerOpal;
	}

	public synchronized PerformanceOpal setPlayerOpal(PlayerOpal argPlayerOpal) {
		tryMutate();
		PlayerOpal lclPlayerOpal = getPlayerOpal();
		if (lclPlayerOpal == argPlayerOpal) { return this; }
		if (lclPlayerOpal != null) {
			lclPlayerOpal.removePerformanceOpalInternal(this);
		}
		myNewPlayerOpal = argPlayerOpal;
		if (argPlayerOpal != null) {
			argPlayerOpal.addPerformanceOpalInternal(this);
		}
		return this;
	}

	protected synchronized void setPlayerOpalInternal(PlayerOpal argPlayerOpal) {
		tryMutate();
		myNewPlayerOpal = argPlayerOpal;
	}

	private java.util.HashSet<ResponseOpal> myOldResponseOpalHashSet = null;
	private java.util.HashSet<ResponseOpal> myNewResponseOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<ResponseOpal>> myResponseOpalCachedOperations = null;

	/* package */ java.util.HashSet<ResponseOpal> getResponseOpalHashSet() {
		if (tryAccess()) {
			if (myNewResponseOpalHashSet == null) {
				if (myOldResponseOpalHashSet == null) {
					if (isNew()) {
						myOldResponseOpalHashSet = new java.util.HashSet<>();
					} else {
						myOldResponseOpalHashSet = OpalFactoryFactory.getInstance().getResponseOpalFactory().forPerformanceIdCollection(getIdAsObject());
					}
				}
				myNewResponseOpalHashSet = new java.util.HashSet<>(myOldResponseOpalHashSet);
				if (myResponseOpalCachedOperations != null) {
					OpalUtility.handleCachedOperations(myResponseOpalCachedOperations, myNewResponseOpalHashSet);
					myResponseOpalCachedOperations = null;
				}
			}
			return myNewResponseOpalHashSet;
		} else {
			if (myOldResponseOpalHashSet == null) {
				myOldResponseOpalHashSet = OpalFactoryFactory.getInstance().getResponseOpalFactory().forPerformanceIdCollection(getIdAsObject());
			}
			return myOldResponseOpalHashSet;
		}
	}

	public synchronized void addResponseOpal(ResponseOpal argResponseOpal) {
		tryMutate();
		argResponseOpal.setPerformanceOpal(this);
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
		argResponseOpal.setPerformanceOpal(null);
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

	public synchronized int getResponseOpalCount() { return getResponseOpalHashSet().size(); }

	public synchronized java.util.Iterator<ResponseOpal> createResponseOpalIterator() {
		return getResponseOpalHashSet().iterator();
	}

	public synchronized java.util.stream.Stream<ResponseOpal> streamResponseOpal() {
		return getResponseOpalHashSet().stream();
	}

	public synchronized void clearResponseOpalInternal() { getResponseOpalHashSet().clear(); }

	@Override
	public String toString() {
		StringBuilder lclSB =  new StringBuilder(64);
		lclSB.append("PerformanceOpal[");
		lclSB.append("myId=");
		lclSB.append(toStringField(0));
		lclSB.append(']');
		return lclSB.toString();
	}

	@Override
	protected void updateReferencesAfterReload() {
		if (myNewGameOpal != GameOpal.NOT_YET_LOADED) {
			setGameOpal(retrieveGameOpal(getNewValues()));
		}
		if (myNewPlayerOpal != PlayerOpal.NOT_YET_LOADED) {
			setPlayerOpal(retrievePlayerOpal(getNewValues()));
		}
	}

	@Override
	protected void updateCollectionsAfterReload() {
		assert needsToClearOldCollections() == false;
		setClearOldCollections(true);
	}

}
