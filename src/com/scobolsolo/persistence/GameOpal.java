package com.scobolsolo.persistence;

import java.io.PrintWriter;
import java.io.PrintStream;

import com.opal.*;

import com.scobolsolo.application.*;

public final class GameOpal extends com.opal.UpdatableOpal<Game> {

	private GameOpal() {
		super();
		setUserFacing(null);
	}

	public GameOpal(OpalFactory<Game, GameOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void initializeReferences() {
		myOldMatchOpal = MatchOpal.NOT_YET_LOADED;
		myOldIncomingLosingCardPlayerOpal = PlayerOpal.NOT_YET_LOADED;
		myOldIncomingWinningCardPlayerOpal = PlayerOpal.NOT_YET_LOADED;
		myOldModeratorStaffOpal = StaffOpal.NOT_YET_LOADED;
		myOldOutgoingLosingCardPlayerOpal = PlayerOpal.NOT_YET_LOADED;
		myOldOutgoingWinningCardPlayerOpal = PlayerOpal.NOT_YET_LOADED;
		return;
	}

	/* package */ static final String[] ourFieldNames = new String[] {
		"Id",
		"TossupsHeard",
		"IncomingWinningCardPlayerId",
		"IncomingLosingCardPlayerId",
		"OutgoingWinningCardPlayerId",
		"OutgoingLosingCardPlayerId",
		"ModeratorStaffId",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.lang.Integer.class,
	};

	/* package */ static final boolean[] ourFieldNullability = new boolean[] {
		false,
		true,
		true,
		true,
		true,
		true,
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

	public static final GameOpal NOT_YET_LOADED = new GameOpal();

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

	public synchronized java.lang.Integer getTossupsHeardAsObject() {
		return (java.lang.Integer) getReadValueSet()[1];
	}

	public synchronized java.lang.Integer getIncomingWinningCardPlayerIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[2];
	}

	public synchronized java.lang.Integer getIncomingLosingCardPlayerIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[3];
	}

	public synchronized java.lang.Integer getOutgoingWinningCardPlayerIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[4];
	}

	public synchronized java.lang.Integer getOutgoingLosingCardPlayerIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[5];
	}

	public synchronized java.lang.Integer getModeratorStaffIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[6];
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

	public synchronized void setTossupsHeard(final java.lang.Integer argTossupsHeard) {
		tryMutate();
		getNewValues()[1] = argTossupsHeard;
		return;
	}

	public void setTossupsHeard(final int argTossupsHeard) {
		setTossupsHeard(java.lang.Integer.valueOf(argTossupsHeard));
		return;
	}

	public synchronized void setIncomingWinningCardPlayerId(final java.lang.Integer argIncomingWinningCardPlayerId) {
		tryMutate();
		getNewValues()[2] = argIncomingWinningCardPlayerId;
		return;
	}

	public void setIncomingWinningCardPlayerId(final int argIncomingWinningCardPlayerId) {
		setIncomingWinningCardPlayerId(java.lang.Integer.valueOf(argIncomingWinningCardPlayerId));
		return;
	}

	public synchronized void setIncomingLosingCardPlayerId(final java.lang.Integer argIncomingLosingCardPlayerId) {
		tryMutate();
		getNewValues()[3] = argIncomingLosingCardPlayerId;
		return;
	}

	public void setIncomingLosingCardPlayerId(final int argIncomingLosingCardPlayerId) {
		setIncomingLosingCardPlayerId(java.lang.Integer.valueOf(argIncomingLosingCardPlayerId));
		return;
	}

	public synchronized void setOutgoingWinningCardPlayerId(final java.lang.Integer argOutgoingWinningCardPlayerId) {
		tryMutate();
		getNewValues()[4] = argOutgoingWinningCardPlayerId;
		return;
	}

	public void setOutgoingWinningCardPlayerId(final int argOutgoingWinningCardPlayerId) {
		setOutgoingWinningCardPlayerId(java.lang.Integer.valueOf(argOutgoingWinningCardPlayerId));
		return;
	}

	public synchronized void setOutgoingLosingCardPlayerId(final java.lang.Integer argOutgoingLosingCardPlayerId) {
		tryMutate();
		getNewValues()[5] = argOutgoingLosingCardPlayerId;
		return;
	}

	public void setOutgoingLosingCardPlayerId(final int argOutgoingLosingCardPlayerId) {
		setOutgoingLosingCardPlayerId(java.lang.Integer.valueOf(argOutgoingLosingCardPlayerId));
		return;
	}

	public synchronized void setModeratorStaffId(final java.lang.Integer argModeratorStaffId) {
		tryMutate();
		getNewValues()[6] = argModeratorStaffId;
		return;
	}

	public void setModeratorStaffId(final int argModeratorStaffId) {
		setModeratorStaffId(java.lang.Integer.valueOf(argModeratorStaffId));
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
		myNewMatchOpal = myOldMatchOpal;
		myNewIncomingLosingCardPlayerOpal = myOldIncomingLosingCardPlayerOpal;
		myNewIncomingWinningCardPlayerOpal = myOldIncomingWinningCardPlayerOpal;
		myNewModeratorStaffOpal = myOldModeratorStaffOpal;
		myNewOutgoingLosingCardPlayerOpal = myOldOutgoingLosingCardPlayerOpal;
		myNewOutgoingWinningCardPlayerOpal = myOldOutgoingWinningCardPlayerOpal;
		myNewPerformanceOpalHashSet = null; /* Necessary if it has been rolled back */
		myPerformanceOpalCachedOperations = null; /* Ditto */
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		myOldMatchOpal = myNewMatchOpal;
		myOldIncomingLosingCardPlayerOpal = myNewIncomingLosingCardPlayerOpal;
		myOldIncomingWinningCardPlayerOpal = myNewIncomingWinningCardPlayerOpal;
		myOldModeratorStaffOpal = myNewModeratorStaffOpal;
		myOldOutgoingLosingCardPlayerOpal = myNewOutgoingLosingCardPlayerOpal;
		myOldOutgoingWinningCardPlayerOpal = myNewOutgoingWinningCardPlayerOpal;

		if (needsToClearOldCollections()) {
			myOldPerformanceOpalHashSet = null;
			} else {
			if (myNewPerformanceOpalHashSet != null) {
				myOldPerformanceOpalHashSet = myNewPerformanceOpalHashSet;
				myNewPerformanceOpalHashSet = null;
			} else {
				myPerformanceOpalCachedOperations = null;
			}
		}
		setClearOldCollections(false);
		return;
	}

	@Override
	protected void unlinkInternal() {
		java.util.Iterator<?> lclI;
		if (myNewPerformanceOpalHashSet != null || myPerformanceOpalCachedOperations != null) {
			lclI = createPerformanceOpalIterator();
			while (lclI.hasNext()) {
				((PerformanceOpal) lclI.next()).setGameOpalInternal(null);
			}
		}
		if (getIncomingLosingCardPlayerOpal() != null) {
			getIncomingLosingCardPlayerOpal().removeIncomingLosingCardGameOpalInternal(this);
		}
		if (getIncomingWinningCardPlayerOpal() != null) {
			getIncomingWinningCardPlayerOpal().removeIncomingWinningCardGameOpalInternal(this);
		}
		if (getModeratorStaffOpal() != null) {
			getModeratorStaffOpal().removeModeratorGameOpalInternal(this);
		}
		if (getOutgoingLosingCardPlayerOpal() != null) {
			getOutgoingLosingCardPlayerOpal().removeOutgoingLosingCardGameOpalInternal(this);
		}
		if (getOutgoingWinningCardPlayerOpal() != null) {
			getOutgoingWinningCardPlayerOpal().removeOutgoingWinningCardGameOpalInternal(this);
		}
		if (getMatchOpal() != null) {
			getMatchOpal().setGameOpalInternal(null);
		}
		return;
	}

	@Override
	protected void copyFieldsToInternal(UpdatableOpal<Game> argTarget) {
		Object[] lclValues = getReadValueSet();
		Object[] lclTargetNewValues = argTarget.getNewValues();
		/* Field 0 (Id) is part of a unique key. */
		lclTargetNewValues[1] = lclValues[1]; /* TossupsHeard (immutable) */
		lclTargetNewValues[2] = lclValues[2]; /* IncomingWinningCardPlayerId (immutable) */
		lclTargetNewValues[3] = lclValues[3]; /* IncomingLosingCardPlayerId (immutable) */
		lclTargetNewValues[4] = lclValues[4]; /* OutgoingWinningCardPlayerId (immutable) */
		lclTargetNewValues[5] = lclValues[5]; /* OutgoingLosingCardPlayerId (immutable) */
		lclTargetNewValues[6] = lclValues[6]; /* ModeratorStaffId (immutable) */

		return;
	}

	@Override
	public synchronized void translateReferencesToFields() {
		if (myNewMatchOpal != MatchOpal.NOT_YET_LOADED) {
			setId(myNewMatchOpal == null ? null : myNewMatchOpal.getIdAsObject());
		}
		if (myNewIncomingLosingCardPlayerOpal != PlayerOpal.NOT_YET_LOADED) {
			setIncomingLosingCardPlayerId(myNewIncomingLosingCardPlayerOpal == null ? null : myNewIncomingLosingCardPlayerOpal.getIdAsObject());
		}
		if (myNewIncomingWinningCardPlayerOpal != PlayerOpal.NOT_YET_LOADED) {
			setIncomingWinningCardPlayerId(myNewIncomingWinningCardPlayerOpal == null ? null : myNewIncomingWinningCardPlayerOpal.getIdAsObject());
		}
		if (myNewModeratorStaffOpal != StaffOpal.NOT_YET_LOADED) {
			setModeratorStaffId(myNewModeratorStaffOpal == null ? null : myNewModeratorStaffOpal.getIdAsObject());
		}
		if (myNewOutgoingLosingCardPlayerOpal != PlayerOpal.NOT_YET_LOADED) {
			setOutgoingLosingCardPlayerId(myNewOutgoingLosingCardPlayerOpal == null ? null : myNewOutgoingLosingCardPlayerOpal.getIdAsObject());
		}
		if (myNewOutgoingWinningCardPlayerOpal != PlayerOpal.NOT_YET_LOADED) {
			setOutgoingWinningCardPlayerId(myNewOutgoingWinningCardPlayerOpal == null ? null : myNewOutgoingWinningCardPlayerOpal.getIdAsObject());
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
		argPW.println("TossupsHeard = " + getTossupsHeardAsObject());
		argPW.println("IncomingWinningCardPlayerId = " + getIncomingWinningCardPlayerIdAsObject());
		argPW.println("IncomingLosingCardPlayerId = " + getIncomingLosingCardPlayerIdAsObject());
		argPW.println("OutgoingWinningCardPlayerId = " + getOutgoingWinningCardPlayerIdAsObject());
		argPW.println("OutgoingLosingCardPlayerId = " + getOutgoingLosingCardPlayerIdAsObject());
		argPW.println("ModeratorStaffId = " + getModeratorStaffIdAsObject());
	}

	@Override
	public synchronized void output(final PrintStream argPS) {
		argPS.println("Id = " + getIdAsObject());
		argPS.println("TossupsHeard = " + getTossupsHeardAsObject());
		argPS.println("IncomingWinningCardPlayerId = " + getIncomingWinningCardPlayerIdAsObject());
		argPS.println("IncomingLosingCardPlayerId = " + getIncomingLosingCardPlayerIdAsObject());
		argPS.println("OutgoingWinningCardPlayerId = " + getOutgoingWinningCardPlayerIdAsObject());
		argPS.println("OutgoingLosingCardPlayerId = " + getOutgoingLosingCardPlayerIdAsObject());
		argPS.println("ModeratorStaffId = " + getModeratorStaffIdAsObject());
	}

	private MatchOpal myOldMatchOpal;
	private MatchOpal myNewMatchOpal;

	protected MatchOpal retrieveMatchOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[0] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getMatchOpalFactory().forId(getIdAsObject());
	}

	public synchronized MatchOpal getMatchOpal() {
		MatchOpal lclMatchOpal;
		boolean lclAccess = tryAccess();
		lclMatchOpal = lclAccess ? myNewMatchOpal : myOldMatchOpal;
		if (lclMatchOpal == MatchOpal.NOT_YET_LOADED) {
			lclMatchOpal = retrieveMatchOpal(getReadValueSet());
			if (lclAccess) {
				myNewMatchOpal = lclMatchOpal;
			} else {
				myOldMatchOpal = lclMatchOpal;
			}
		}
		return lclMatchOpal;
	}

	public synchronized void setMatchOpal(MatchOpal argMatchOpal) {
		tryMutate();
		if (myNewMatchOpal != null && myNewMatchOpal != MatchOpal.NOT_YET_LOADED) {
			myNewMatchOpal.setGameOpalInternal(null);
		}
		myNewMatchOpal = argMatchOpal;
		if (argMatchOpal != null) {
			argMatchOpal.setGameOpalInternal(this);
		}
		return;
	}

	protected synchronized void setMatchOpalInternal(MatchOpal argMatchOpal) {
		tryMutate();
		myNewMatchOpal = argMatchOpal;
	}

	private PlayerOpal myOldIncomingLosingCardPlayerOpal;
	private PlayerOpal myNewIncomingLosingCardPlayerOpal;

	protected PlayerOpal retrieveIncomingLosingCardPlayerOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[3] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getPlayerOpalFactory().forId(getIncomingLosingCardPlayerIdAsObject());
	}

	public synchronized PlayerOpal getIncomingLosingCardPlayerOpal() {
		PlayerOpal lclPlayerOpal;
		boolean lclAccess = tryAccess();
		lclPlayerOpal = lclAccess ? myNewIncomingLosingCardPlayerOpal : myOldIncomingLosingCardPlayerOpal;
		if (lclPlayerOpal == PlayerOpal.NOT_YET_LOADED) {
			lclPlayerOpal = retrieveIncomingLosingCardPlayerOpal(getReadValueSet());
			if (lclAccess) {
				myNewIncomingLosingCardPlayerOpal = lclPlayerOpal;
			} else {
				myOldIncomingLosingCardPlayerOpal = lclPlayerOpal;
			}
		}
		return lclPlayerOpal;
	}

	public synchronized void setIncomingLosingCardPlayerOpal(PlayerOpal argPlayerOpal) {
		tryMutate();
		PlayerOpal lclPlayerOpal = getIncomingLosingCardPlayerOpal();
		if (lclPlayerOpal == argPlayerOpal) { return; }
		if (lclPlayerOpal != null) {
			lclPlayerOpal.removeIncomingLosingCardGameOpalInternal(this);
		}
		myNewIncomingLosingCardPlayerOpal = argPlayerOpal;
		if (argPlayerOpal != null) {
			argPlayerOpal.addIncomingLosingCardGameOpalInternal(this);
		}
		return;
	}

	protected synchronized void setIncomingLosingCardPlayerOpalInternal(PlayerOpal argPlayerOpal) {
		tryMutate();
		myNewIncomingLosingCardPlayerOpal = argPlayerOpal;
	}

	private PlayerOpal myOldIncomingWinningCardPlayerOpal;
	private PlayerOpal myNewIncomingWinningCardPlayerOpal;

	protected PlayerOpal retrieveIncomingWinningCardPlayerOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[2] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getPlayerOpalFactory().forId(getIncomingWinningCardPlayerIdAsObject());
	}

	public synchronized PlayerOpal getIncomingWinningCardPlayerOpal() {
		PlayerOpal lclPlayerOpal;
		boolean lclAccess = tryAccess();
		lclPlayerOpal = lclAccess ? myNewIncomingWinningCardPlayerOpal : myOldIncomingWinningCardPlayerOpal;
		if (lclPlayerOpal == PlayerOpal.NOT_YET_LOADED) {
			lclPlayerOpal = retrieveIncomingWinningCardPlayerOpal(getReadValueSet());
			if (lclAccess) {
				myNewIncomingWinningCardPlayerOpal = lclPlayerOpal;
			} else {
				myOldIncomingWinningCardPlayerOpal = lclPlayerOpal;
			}
		}
		return lclPlayerOpal;
	}

	public synchronized void setIncomingWinningCardPlayerOpal(PlayerOpal argPlayerOpal) {
		tryMutate();
		PlayerOpal lclPlayerOpal = getIncomingWinningCardPlayerOpal();
		if (lclPlayerOpal == argPlayerOpal) { return; }
		if (lclPlayerOpal != null) {
			lclPlayerOpal.removeIncomingWinningCardGameOpalInternal(this);
		}
		myNewIncomingWinningCardPlayerOpal = argPlayerOpal;
		if (argPlayerOpal != null) {
			argPlayerOpal.addIncomingWinningCardGameOpalInternal(this);
		}
		return;
	}

	protected synchronized void setIncomingWinningCardPlayerOpalInternal(PlayerOpal argPlayerOpal) {
		tryMutate();
		myNewIncomingWinningCardPlayerOpal = argPlayerOpal;
	}

	private StaffOpal myOldModeratorStaffOpal;
	private StaffOpal myNewModeratorStaffOpal;

	protected StaffOpal retrieveModeratorStaffOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[6] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getStaffOpalFactory().forId(getModeratorStaffIdAsObject());
	}

	public synchronized StaffOpal getModeratorStaffOpal() {
		StaffOpal lclStaffOpal;
		boolean lclAccess = tryAccess();
		lclStaffOpal = lclAccess ? myNewModeratorStaffOpal : myOldModeratorStaffOpal;
		if (lclStaffOpal == StaffOpal.NOT_YET_LOADED) {
			lclStaffOpal = retrieveModeratorStaffOpal(getReadValueSet());
			if (lclAccess) {
				myNewModeratorStaffOpal = lclStaffOpal;
			} else {
				myOldModeratorStaffOpal = lclStaffOpal;
			}
		}
		return lclStaffOpal;
	}

	public synchronized void setModeratorStaffOpal(StaffOpal argStaffOpal) {
		tryMutate();
		StaffOpal lclStaffOpal = getModeratorStaffOpal();
		if (lclStaffOpal == argStaffOpal) { return; }
		if (lclStaffOpal != null) {
			lclStaffOpal.removeModeratorGameOpalInternal(this);
		}
		myNewModeratorStaffOpal = argStaffOpal;
		if (argStaffOpal != null) {
			argStaffOpal.addModeratorGameOpalInternal(this);
		}
		return;
	}

	protected synchronized void setModeratorStaffOpalInternal(StaffOpal argStaffOpal) {
		tryMutate();
		myNewModeratorStaffOpal = argStaffOpal;
	}

	private PlayerOpal myOldOutgoingLosingCardPlayerOpal;
	private PlayerOpal myNewOutgoingLosingCardPlayerOpal;

	protected PlayerOpal retrieveOutgoingLosingCardPlayerOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[5] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getPlayerOpalFactory().forId(getOutgoingLosingCardPlayerIdAsObject());
	}

	public synchronized PlayerOpal getOutgoingLosingCardPlayerOpal() {
		PlayerOpal lclPlayerOpal;
		boolean lclAccess = tryAccess();
		lclPlayerOpal = lclAccess ? myNewOutgoingLosingCardPlayerOpal : myOldOutgoingLosingCardPlayerOpal;
		if (lclPlayerOpal == PlayerOpal.NOT_YET_LOADED) {
			lclPlayerOpal = retrieveOutgoingLosingCardPlayerOpal(getReadValueSet());
			if (lclAccess) {
				myNewOutgoingLosingCardPlayerOpal = lclPlayerOpal;
			} else {
				myOldOutgoingLosingCardPlayerOpal = lclPlayerOpal;
			}
		}
		return lclPlayerOpal;
	}

	public synchronized void setOutgoingLosingCardPlayerOpal(PlayerOpal argPlayerOpal) {
		tryMutate();
		PlayerOpal lclPlayerOpal = getOutgoingLosingCardPlayerOpal();
		if (lclPlayerOpal == argPlayerOpal) { return; }
		if (lclPlayerOpal != null) {
			lclPlayerOpal.removeOutgoingLosingCardGameOpalInternal(this);
		}
		myNewOutgoingLosingCardPlayerOpal = argPlayerOpal;
		if (argPlayerOpal != null) {
			argPlayerOpal.addOutgoingLosingCardGameOpalInternal(this);
		}
		return;
	}

	protected synchronized void setOutgoingLosingCardPlayerOpalInternal(PlayerOpal argPlayerOpal) {
		tryMutate();
		myNewOutgoingLosingCardPlayerOpal = argPlayerOpal;
	}

	private PlayerOpal myOldOutgoingWinningCardPlayerOpal;
	private PlayerOpal myNewOutgoingWinningCardPlayerOpal;

	protected PlayerOpal retrieveOutgoingWinningCardPlayerOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[4] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getPlayerOpalFactory().forId(getOutgoingWinningCardPlayerIdAsObject());
	}

	public synchronized PlayerOpal getOutgoingWinningCardPlayerOpal() {
		PlayerOpal lclPlayerOpal;
		boolean lclAccess = tryAccess();
		lclPlayerOpal = lclAccess ? myNewOutgoingWinningCardPlayerOpal : myOldOutgoingWinningCardPlayerOpal;
		if (lclPlayerOpal == PlayerOpal.NOT_YET_LOADED) {
			lclPlayerOpal = retrieveOutgoingWinningCardPlayerOpal(getReadValueSet());
			if (lclAccess) {
				myNewOutgoingWinningCardPlayerOpal = lclPlayerOpal;
			} else {
				myOldOutgoingWinningCardPlayerOpal = lclPlayerOpal;
			}
		}
		return lclPlayerOpal;
	}

	public synchronized void setOutgoingWinningCardPlayerOpal(PlayerOpal argPlayerOpal) {
		tryMutate();
		PlayerOpal lclPlayerOpal = getOutgoingWinningCardPlayerOpal();
		if (lclPlayerOpal == argPlayerOpal) { return; }
		if (lclPlayerOpal != null) {
			lclPlayerOpal.removeOutgoingWinningCardGameOpalInternal(this);
		}
		myNewOutgoingWinningCardPlayerOpal = argPlayerOpal;
		if (argPlayerOpal != null) {
			argPlayerOpal.addOutgoingWinningCardGameOpalInternal(this);
		}
		return;
	}

	protected synchronized void setOutgoingWinningCardPlayerOpalInternal(PlayerOpal argPlayerOpal) {
		tryMutate();
		myNewOutgoingWinningCardPlayerOpal = argPlayerOpal;
	}

	private java.util.HashSet<PerformanceOpal> myOldPerformanceOpalHashSet = null;
	private java.util.HashSet<PerformanceOpal> myNewPerformanceOpalHashSet = null;
	private java.util.ArrayList<CachedOperation<PerformanceOpal>> myPerformanceOpalCachedOperations = null;

	/* package */ java.util.HashSet<PerformanceOpal> getPerformanceOpalClass() {
		if (tryAccess()) {
			if (myNewPerformanceOpalHashSet == null) {
				if (myOldPerformanceOpalHashSet == null) {
					myOldPerformanceOpalHashSet = OpalFactoryFactory.getInstance().getPerformanceOpalFactory().forGameIdCollection(getIdAsObject());
				}
				myNewPerformanceOpalHashSet = new java.util.HashSet<>(myOldPerformanceOpalHashSet);
				if (myPerformanceOpalCachedOperations != null) {
					OpalUtility.handleCachedOperations(myPerformanceOpalCachedOperations, myNewPerformanceOpalHashSet);
					myPerformanceOpalCachedOperations = null;
				}
			}
			return myNewPerformanceOpalHashSet;
		}
		if (myOldPerformanceOpalHashSet == null) {
			myOldPerformanceOpalHashSet = OpalFactoryFactory.getInstance().getPerformanceOpalFactory().forGameIdCollection(getIdAsObject());
		}
		return myOldPerformanceOpalHashSet;
	}

	public synchronized void addPerformanceOpal(PerformanceOpal argPerformanceOpal) {
		tryMutate();
		argPerformanceOpal.setGameOpal(this);
		return;
	}

	protected synchronized void addPerformanceOpalInternal(PerformanceOpal argPerformanceOpal) {
		tryMutate();
		if (myNewPerformanceOpalHashSet == null) {
			if (myOldPerformanceOpalHashSet == null) {
				if (myPerformanceOpalCachedOperations == null) { myPerformanceOpalCachedOperations = new java.util.ArrayList<>(); }
				myPerformanceOpalCachedOperations.add(new CachedOperation<>(CachedOperation.ADD, argPerformanceOpal));
			} else {
				myNewPerformanceOpalHashSet = new java.util.HashSet<>(myOldPerformanceOpalHashSet);
				myNewPerformanceOpalHashSet.add(argPerformanceOpal);
			}
		} else {
			myNewPerformanceOpalHashSet.add(argPerformanceOpal);
		}
		return;
	}

	public synchronized void removePerformanceOpal(PerformanceOpal argPerformanceOpal) {
		tryMutate();
		argPerformanceOpal.setGameOpal(null);
	}

	protected synchronized void removePerformanceOpalInternal(PerformanceOpal argPerformanceOpal) {
		tryMutate();
		if (myNewPerformanceOpalHashSet == null) {
			if (myOldPerformanceOpalHashSet == null) {
				if (myPerformanceOpalCachedOperations == null) { myPerformanceOpalCachedOperations = new java.util.ArrayList<>(); }
				myPerformanceOpalCachedOperations.add(new CachedOperation<>(CachedOperation.REMOVE, argPerformanceOpal));
			} else {
				myNewPerformanceOpalHashSet = new java.util.HashSet<>(myOldPerformanceOpalHashSet);
				myNewPerformanceOpalHashSet.remove(argPerformanceOpal);
			}
		} else {
			myNewPerformanceOpalHashSet.remove(argPerformanceOpal);
		}
		return;
	}

	public synchronized int getPerformanceOpalCount() { return getPerformanceOpalClass().size(); }

	public synchronized java.util.Iterator<PerformanceOpal> createPerformanceOpalIterator() {
		return getPerformanceOpalClass().iterator();
	}

	public synchronized java.util.stream.Stream<PerformanceOpal> streamPerformanceOpal() {
		return getPerformanceOpalClass().stream();
	}

	public synchronized void clearPerformanceOpalInternal() { getPerformanceOpalClass().clear(); }

	@Override
	public String toString() {
		StringBuilder lclSB =  new StringBuilder(64);
		lclSB.append("GameOpal[");
		lclSB.append("myId=");
		lclSB.append(toStringField(0));
		lclSB.append(']');
		return lclSB.toString();
	}

	@Override
	protected void updateReferencesAfterReload() {
		if (myNewMatchOpal != MatchOpal.NOT_YET_LOADED) {
			setMatchOpal(retrieveMatchOpal(getNewValues()));
		}
		if (myNewIncomingLosingCardPlayerOpal != PlayerOpal.NOT_YET_LOADED) {
			setIncomingLosingCardPlayerOpal(retrieveIncomingLosingCardPlayerOpal(getNewValues()));
		}
		if (myNewIncomingWinningCardPlayerOpal != PlayerOpal.NOT_YET_LOADED) {
			setIncomingWinningCardPlayerOpal(retrieveIncomingWinningCardPlayerOpal(getNewValues()));
		}
		if (myNewModeratorStaffOpal != StaffOpal.NOT_YET_LOADED) {
			setModeratorStaffOpal(retrieveModeratorStaffOpal(getNewValues()));
		}
		if (myNewOutgoingLosingCardPlayerOpal != PlayerOpal.NOT_YET_LOADED) {
			setOutgoingLosingCardPlayerOpal(retrieveOutgoingLosingCardPlayerOpal(getNewValues()));
		}
		if (myNewOutgoingWinningCardPlayerOpal != PlayerOpal.NOT_YET_LOADED) {
			setOutgoingWinningCardPlayerOpal(retrieveOutgoingWinningCardPlayerOpal(getNewValues()));
		}
	}

	@Override
	protected void updateCollectionsAfterReload() {
		assert needsToClearOldCollections() == false;
		setClearOldCollections(true);
	}

}
