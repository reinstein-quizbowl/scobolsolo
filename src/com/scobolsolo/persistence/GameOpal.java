package com.scobolsolo.persistence;

import com.scobolsolo.application.Game;

public final class GameOpal extends com.opal.UpdatableOpal<Game> {


	private GameOpal() {
		super();
		setUserFacing(null);
	}

	public GameOpal(com.opal.IdentityOpalFactory<Game, GameOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void applyDefaults() {

		/* Initialize the back Collections to empty sets. */

		myNewPerformanceOpalFast3Set = new com.siliconage.util.Fast3Set<>();

		return;
	}

	@Override
	protected void initializeReferences() {
		myOldMatchOpal = MatchOpal.NOT_YET_LOADED;
		myOldModeratorStaffOpal = StaffOpal.NOT_YET_LOADED;
		myOldOutgoingLosingCardPlayerOpal = PlayerOpal.NOT_YET_LOADED;
		myOldOutgoingWinningCardPlayerOpal = PlayerOpal.NOT_YET_LOADED;
		myOldIncomingLosingCardPlayerOpal = PlayerOpal.NOT_YET_LOADED;
		myOldIncomingWinningCardPlayerOpal = PlayerOpal.NOT_YET_LOADED;
		myOldScorekeeperStaffOpal = StaffOpal.NOT_YET_LOADED;
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
		"ScorekeeperStaffId",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.Integer.class,
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

	public static final GameOpal NOT_YET_LOADED = new GameOpal();

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

	public synchronized java.lang.Integer getScorekeeperStaffIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[7];
	}

	public synchronized GameOpal setId(final java.lang.Integer argId) {
		tryMutate();
		if (argId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myId on " + this + " to null.");
		}
		getNewValues()[0] = argId;
		return this;
	}

	public GameOpal setId(final int argId) {
		setId(java.lang.Integer.valueOf(argId));
		return this;
	}

	public synchronized GameOpal setTossupsHeard(final java.lang.Integer argTossupsHeard) {
		tryMutate();
		getNewValues()[1] = argTossupsHeard;
		return this;
	}

	public GameOpal setTossupsHeard(final int argTossupsHeard) {
		setTossupsHeard(java.lang.Integer.valueOf(argTossupsHeard));
		return this;
	}

	public synchronized GameOpal setIncomingWinningCardPlayerId(final java.lang.Integer argIncomingWinningCardPlayerId) {
		tryMutate();
		getNewValues()[2] = argIncomingWinningCardPlayerId;
		return this;
	}

	public GameOpal setIncomingWinningCardPlayerId(final int argIncomingWinningCardPlayerId) {
		setIncomingWinningCardPlayerId(java.lang.Integer.valueOf(argIncomingWinningCardPlayerId));
		return this;
	}

	public synchronized GameOpal setIncomingLosingCardPlayerId(final java.lang.Integer argIncomingLosingCardPlayerId) {
		tryMutate();
		getNewValues()[3] = argIncomingLosingCardPlayerId;
		return this;
	}

	public GameOpal setIncomingLosingCardPlayerId(final int argIncomingLosingCardPlayerId) {
		setIncomingLosingCardPlayerId(java.lang.Integer.valueOf(argIncomingLosingCardPlayerId));
		return this;
	}

	public synchronized GameOpal setOutgoingWinningCardPlayerId(final java.lang.Integer argOutgoingWinningCardPlayerId) {
		tryMutate();
		getNewValues()[4] = argOutgoingWinningCardPlayerId;
		return this;
	}

	public GameOpal setOutgoingWinningCardPlayerId(final int argOutgoingWinningCardPlayerId) {
		setOutgoingWinningCardPlayerId(java.lang.Integer.valueOf(argOutgoingWinningCardPlayerId));
		return this;
	}

	public synchronized GameOpal setOutgoingLosingCardPlayerId(final java.lang.Integer argOutgoingLosingCardPlayerId) {
		tryMutate();
		getNewValues()[5] = argOutgoingLosingCardPlayerId;
		return this;
	}

	public GameOpal setOutgoingLosingCardPlayerId(final int argOutgoingLosingCardPlayerId) {
		setOutgoingLosingCardPlayerId(java.lang.Integer.valueOf(argOutgoingLosingCardPlayerId));
		return this;
	}

	public synchronized GameOpal setModeratorStaffId(final java.lang.Integer argModeratorStaffId) {
		tryMutate();
		getNewValues()[6] = argModeratorStaffId;
		return this;
	}

	public GameOpal setModeratorStaffId(final int argModeratorStaffId) {
		setModeratorStaffId(java.lang.Integer.valueOf(argModeratorStaffId));
		return this;
	}

	public synchronized GameOpal setScorekeeperStaffId(final java.lang.Integer argScorekeeperStaffId) {
		tryMutate();
		getNewValues()[7] = argScorekeeperStaffId;
		return this;
	}

	public GameOpal setScorekeeperStaffId(final int argScorekeeperStaffId) {
		setScorekeeperStaffId(java.lang.Integer.valueOf(argScorekeeperStaffId));
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
		myNewMatchOpal = myOldMatchOpal;
		myNewModeratorStaffOpal = myOldModeratorStaffOpal;
		myNewOutgoingLosingCardPlayerOpal = myOldOutgoingLosingCardPlayerOpal;
		myNewOutgoingWinningCardPlayerOpal = myOldOutgoingWinningCardPlayerOpal;
		myNewIncomingLosingCardPlayerOpal = myOldIncomingLosingCardPlayerOpal;
		myNewIncomingWinningCardPlayerOpal = myOldIncomingWinningCardPlayerOpal;
		myNewScorekeeperStaffOpal = myOldScorekeeperStaffOpal;
		myNewPerformanceOpalFast3Set = null; /* Necessary if it has been rolled back */
		myPerformanceOpalCachedOperations = null; /* Ditto */
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		myOldMatchOpal = myNewMatchOpal;
		myOldModeratorStaffOpal = myNewModeratorStaffOpal;
		myOldOutgoingLosingCardPlayerOpal = myNewOutgoingLosingCardPlayerOpal;
		myOldOutgoingWinningCardPlayerOpal = myNewOutgoingWinningCardPlayerOpal;
		myOldIncomingLosingCardPlayerOpal = myNewIncomingLosingCardPlayerOpal;
		myOldIncomingWinningCardPlayerOpal = myNewIncomingWinningCardPlayerOpal;
		myOldScorekeeperStaffOpal = myNewScorekeeperStaffOpal;

		if (needsToClearOldCollections()) {
			myOldPerformanceOpalFast3Set = null;
		} else {
			if (myNewPerformanceOpalFast3Set != null) {
				if (myNewPerformanceOpalFast3Set.size() > 0) {
					myOldPerformanceOpalFast3Set = myNewPerformanceOpalFast3Set;
				} else {
					myOldPerformanceOpalFast3Set = java.util.Collections.emptySet();
				}
				myNewPerformanceOpalFast3Set = null;
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
		if (myNewPerformanceOpalFast3Set != null || myPerformanceOpalCachedOperations != null) {
			lclI = createPerformanceOpalIterator();
			while (lclI.hasNext()) {
				((PerformanceOpal) lclI.next()).setGameOpalInternal(null);
			}
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
		if (getIncomingLosingCardPlayerOpal() != null) {
			getIncomingLosingCardPlayerOpal().removeIncomingLosingCardGameOpalInternal(this);
		}
		if (getIncomingWinningCardPlayerOpal() != null) {
			getIncomingWinningCardPlayerOpal().removeIncomingWinningCardGameOpalInternal(this);
		}
		if (getScorekeeperStaffOpal() != null) {
			getScorekeeperStaffOpal().removeScorekeeperGameOpalInternal(this);
		}
		if (getMatchOpal() != null) {
			getMatchOpal().setGameOpalInternal(null);
		}
		return;
	}

	@Override
	protected void copyFieldsToInternal(com.opal.UpdatableOpal<Game> argTarget) {
		Object[] lclValues = getReadValueSet();
		Object[] lclTargetNewValues = argTarget.getNewValues();
		/* Field 0 (Id) is part of a unique key. */
		lclTargetNewValues[1] = lclValues[1]; /* TossupsHeard (immutable) */
		lclTargetNewValues[2] = lclValues[2]; /* IncomingWinningCardPlayerId (immutable) */
		lclTargetNewValues[3] = lclValues[3]; /* IncomingLosingCardPlayerId (immutable) */
		lclTargetNewValues[4] = lclValues[4]; /* OutgoingWinningCardPlayerId (immutable) */
		lclTargetNewValues[5] = lclValues[5]; /* OutgoingLosingCardPlayerId (immutable) */
		lclTargetNewValues[6] = lclValues[6]; /* ModeratorStaffId (immutable) */
		lclTargetNewValues[7] = lclValues[7]; /* ScorekeeperStaffId (immutable) */

		return;
	}

	@Override
	public synchronized void translateReferencesToFields() {
		if (myNewMatchOpal != MatchOpal.NOT_YET_LOADED) {
			setId(myNewMatchOpal == null ? null : myNewMatchOpal.getIdAsObject());
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
		if (myNewIncomingLosingCardPlayerOpal != PlayerOpal.NOT_YET_LOADED) {
			setIncomingLosingCardPlayerId(myNewIncomingLosingCardPlayerOpal == null ? null : myNewIncomingLosingCardPlayerOpal.getIdAsObject());
		}
		if (myNewIncomingWinningCardPlayerOpal != PlayerOpal.NOT_YET_LOADED) {
			setIncomingWinningCardPlayerId(myNewIncomingWinningCardPlayerOpal == null ? null : myNewIncomingWinningCardPlayerOpal.getIdAsObject());
		}
		if (myNewScorekeeperStaffOpal != StaffOpal.NOT_YET_LOADED) {
			setScorekeeperStaffId(myNewScorekeeperStaffOpal == null ? null : myNewScorekeeperStaffOpal.getIdAsObject());
		}
		return;
	}

	@Override
	public java.util.Set<com.opal.TransactionAware> getRequiredPriorCommits() {
		java.util.Set<com.opal.TransactionAware> lclTAs = null;
		com.opal.UpdatableOpal<?> lclUO;
		lclUO = myNewMatchOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		lclUO = myNewIncomingLosingCardPlayerOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		lclUO = myNewIncomingWinningCardPlayerOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		lclUO = myNewModeratorStaffOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		lclUO = myNewOutgoingLosingCardPlayerOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		lclUO = myNewOutgoingWinningCardPlayerOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		lclUO = myNewScorekeeperStaffOpal;
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
		com.opal.UpdatableOpal<?> lclUO;
		if ((lclUO = myOldMatchOpal) == MatchOpal.NOT_YET_LOADED) {
			lclUO = myOldMatchOpal = retrieveMatchOpal(getOldValues());
		}
		if (lclUO != null && lclUO.isDeleted()) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		if ((lclUO = myOldIncomingLosingCardPlayerOpal) == PlayerOpal.NOT_YET_LOADED) {
			lclUO = myOldIncomingLosingCardPlayerOpal = retrieveIncomingLosingCardPlayerOpal(getOldValues());
		}
		if (lclUO != null && lclUO.isDeleted()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		if ((lclUO = myOldIncomingWinningCardPlayerOpal) == PlayerOpal.NOT_YET_LOADED) {
			lclUO = myOldIncomingWinningCardPlayerOpal = retrieveIncomingWinningCardPlayerOpal(getOldValues());
		}
		if (lclUO != null && lclUO.isDeleted()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		if ((lclUO = myOldModeratorStaffOpal) == StaffOpal.NOT_YET_LOADED) {
			lclUO = myOldModeratorStaffOpal = retrieveModeratorStaffOpal(getOldValues());
		}
		if (lclUO != null && lclUO.isDeleted()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		if ((lclUO = myOldOutgoingLosingCardPlayerOpal) == PlayerOpal.NOT_YET_LOADED) {
			lclUO = myOldOutgoingLosingCardPlayerOpal = retrieveOutgoingLosingCardPlayerOpal(getOldValues());
		}
		if (lclUO != null && lclUO.isDeleted()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		if ((lclUO = myOldOutgoingWinningCardPlayerOpal) == PlayerOpal.NOT_YET_LOADED) {
			lclUO = myOldOutgoingWinningCardPlayerOpal = retrieveOutgoingWinningCardPlayerOpal(getOldValues());
		}
		if (lclUO != null && lclUO.isDeleted()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		if ((lclUO = myOldScorekeeperStaffOpal) == StaffOpal.NOT_YET_LOADED) {
			lclUO = myOldScorekeeperStaffOpal = retrieveScorekeeperStaffOpal(getOldValues());
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
	public synchronized void output(final java.io.PrintStream argOutput) {
		argOutput.println("Id = " + getIdAsObject());
		argOutput.println("TossupsHeard = " + getTossupsHeardAsObject());
		argOutput.println("IncomingWinningCardPlayerId = " + getIncomingWinningCardPlayerIdAsObject());
		argOutput.println("IncomingLosingCardPlayerId = " + getIncomingLosingCardPlayerIdAsObject());
		argOutput.println("OutgoingWinningCardPlayerId = " + getOutgoingWinningCardPlayerIdAsObject());
		argOutput.println("OutgoingLosingCardPlayerId = " + getOutgoingLosingCardPlayerIdAsObject());
		argOutput.println("ModeratorStaffId = " + getModeratorStaffIdAsObject());
		argOutput.println("ScorekeeperStaffId = " + getScorekeeperStaffIdAsObject());
	}

	@Override
	public synchronized void output(final java.io.PrintWriter argOutput) {
		argOutput.println("Id = " + getIdAsObject());
		argOutput.println("TossupsHeard = " + getTossupsHeardAsObject());
		argOutput.println("IncomingWinningCardPlayerId = " + getIncomingWinningCardPlayerIdAsObject());
		argOutput.println("IncomingLosingCardPlayerId = " + getIncomingLosingCardPlayerIdAsObject());
		argOutput.println("OutgoingWinningCardPlayerId = " + getOutgoingWinningCardPlayerIdAsObject());
		argOutput.println("OutgoingLosingCardPlayerId = " + getOutgoingLosingCardPlayerIdAsObject());
		argOutput.println("ModeratorStaffId = " + getModeratorStaffIdAsObject());
		argOutput.println("ScorekeeperStaffId = " + getScorekeeperStaffIdAsObject());
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

	public synchronized GameOpal setMatchOpal(MatchOpal argMatchOpal) {
		tryMutate();
		if (myNewMatchOpal != null && myNewMatchOpal != MatchOpal.NOT_YET_LOADED) {
			myNewMatchOpal.setGameOpalInternal(null);
		}
		myNewMatchOpal = argMatchOpal;
		if (argMatchOpal != null) {
			argMatchOpal.setGameOpalInternal(this);
		}
		return this;
	}

	protected synchronized void setMatchOpalInternal(MatchOpal argMatchOpal) {
		tryMutate();
		myNewMatchOpal = argMatchOpal;
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

	public synchronized GameOpal setModeratorStaffOpal(StaffOpal argStaffOpal) {
		tryMutate();
		StaffOpal lclStaffOpal = getModeratorStaffOpal();
		if (lclStaffOpal == argStaffOpal) { return this; }
		if (lclStaffOpal != null) {
			lclStaffOpal.removeModeratorGameOpalInternal(this);
		}
		myNewModeratorStaffOpal = argStaffOpal;
		if (argStaffOpal != null) {
			argStaffOpal.addModeratorGameOpalInternal(this);
		}
		return this;
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

	public synchronized GameOpal setOutgoingLosingCardPlayerOpal(PlayerOpal argPlayerOpal) {
		tryMutate();
		PlayerOpal lclPlayerOpal = getOutgoingLosingCardPlayerOpal();
		if (lclPlayerOpal == argPlayerOpal) { return this; }
		if (lclPlayerOpal != null) {
			lclPlayerOpal.removeOutgoingLosingCardGameOpalInternal(this);
		}
		myNewOutgoingLosingCardPlayerOpal = argPlayerOpal;
		if (argPlayerOpal != null) {
			argPlayerOpal.addOutgoingLosingCardGameOpalInternal(this);
		}
		return this;
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

	public synchronized GameOpal setOutgoingWinningCardPlayerOpal(PlayerOpal argPlayerOpal) {
		tryMutate();
		PlayerOpal lclPlayerOpal = getOutgoingWinningCardPlayerOpal();
		if (lclPlayerOpal == argPlayerOpal) { return this; }
		if (lclPlayerOpal != null) {
			lclPlayerOpal.removeOutgoingWinningCardGameOpalInternal(this);
		}
		myNewOutgoingWinningCardPlayerOpal = argPlayerOpal;
		if (argPlayerOpal != null) {
			argPlayerOpal.addOutgoingWinningCardGameOpalInternal(this);
		}
		return this;
	}

	protected synchronized void setOutgoingWinningCardPlayerOpalInternal(PlayerOpal argPlayerOpal) {
		tryMutate();
		myNewOutgoingWinningCardPlayerOpal = argPlayerOpal;
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

	public synchronized GameOpal setIncomingLosingCardPlayerOpal(PlayerOpal argPlayerOpal) {
		tryMutate();
		PlayerOpal lclPlayerOpal = getIncomingLosingCardPlayerOpal();
		if (lclPlayerOpal == argPlayerOpal) { return this; }
		if (lclPlayerOpal != null) {
			lclPlayerOpal.removeIncomingLosingCardGameOpalInternal(this);
		}
		myNewIncomingLosingCardPlayerOpal = argPlayerOpal;
		if (argPlayerOpal != null) {
			argPlayerOpal.addIncomingLosingCardGameOpalInternal(this);
		}
		return this;
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

	public synchronized GameOpal setIncomingWinningCardPlayerOpal(PlayerOpal argPlayerOpal) {
		tryMutate();
		PlayerOpal lclPlayerOpal = getIncomingWinningCardPlayerOpal();
		if (lclPlayerOpal == argPlayerOpal) { return this; }
		if (lclPlayerOpal != null) {
			lclPlayerOpal.removeIncomingWinningCardGameOpalInternal(this);
		}
		myNewIncomingWinningCardPlayerOpal = argPlayerOpal;
		if (argPlayerOpal != null) {
			argPlayerOpal.addIncomingWinningCardGameOpalInternal(this);
		}
		return this;
	}

	protected synchronized void setIncomingWinningCardPlayerOpalInternal(PlayerOpal argPlayerOpal) {
		tryMutate();
		myNewIncomingWinningCardPlayerOpal = argPlayerOpal;
	}

	private StaffOpal myOldScorekeeperStaffOpal;
	private StaffOpal myNewScorekeeperStaffOpal;

	protected StaffOpal retrieveScorekeeperStaffOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[7] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getStaffOpalFactory().forId(getScorekeeperStaffIdAsObject());
	}

	public synchronized StaffOpal getScorekeeperStaffOpal() {
		StaffOpal lclStaffOpal;
		boolean lclAccess = tryAccess();
		lclStaffOpal = lclAccess ? myNewScorekeeperStaffOpal : myOldScorekeeperStaffOpal;
		if (lclStaffOpal == StaffOpal.NOT_YET_LOADED) {
			lclStaffOpal = retrieveScorekeeperStaffOpal(getReadValueSet());
			if (lclAccess) {
				myNewScorekeeperStaffOpal = lclStaffOpal;
			} else {
				myOldScorekeeperStaffOpal = lclStaffOpal;
			}
		}
		return lclStaffOpal;
	}

	public synchronized GameOpal setScorekeeperStaffOpal(StaffOpal argStaffOpal) {
		tryMutate();
		StaffOpal lclStaffOpal = getScorekeeperStaffOpal();
		if (lclStaffOpal == argStaffOpal) { return this; }
		if (lclStaffOpal != null) {
			lclStaffOpal.removeScorekeeperGameOpalInternal(this);
		}
		myNewScorekeeperStaffOpal = argStaffOpal;
		if (argStaffOpal != null) {
			argStaffOpal.addScorekeeperGameOpalInternal(this);
		}
		return this;
	}

	protected synchronized void setScorekeeperStaffOpalInternal(StaffOpal argStaffOpal) {
		tryMutate();
		myNewScorekeeperStaffOpal = argStaffOpal;
	}

	private java.util.Set<PerformanceOpal> myOldPerformanceOpalFast3Set = null;
	private java.util.Set<PerformanceOpal> myNewPerformanceOpalFast3Set = null;
	private java.util.ArrayList<com.opal.CachedOperation<PerformanceOpal>> myPerformanceOpalCachedOperations = null;

	/* package */ java.util.Set<PerformanceOpal> getPerformanceOpalFast3Set() {
		if (tryAccess()) {
			if (myNewPerformanceOpalFast3Set == null) {
				if (myOldPerformanceOpalFast3Set == null) {
					if (isNew()) {
						myOldPerformanceOpalFast3Set = java.util.Collections.emptySet();
					} else {
						java.util.Set<PerformanceOpal> lclS;
						lclS = OpalFactoryFactory.getInstance().getPerformanceOpalFactory().forGameIdCollection(getIdAsObject());
						myOldPerformanceOpalFast3Set = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
					}
				}
				myNewPerformanceOpalFast3Set = new com.siliconage.util.Fast3Set<>(myOldPerformanceOpalFast3Set);
				if (myPerformanceOpalCachedOperations != null) {
					com.opal.OpalUtility.handleCachedOperations(myPerformanceOpalCachedOperations, myNewPerformanceOpalFast3Set);
					myPerformanceOpalCachedOperations = null;
				}
			}
			return myNewPerformanceOpalFast3Set;
		} else {
			if (myOldPerformanceOpalFast3Set == null) {
				java.util.Set<PerformanceOpal> lclS;
				lclS = OpalFactoryFactory.getInstance().getPerformanceOpalFactory().forGameIdCollection(getIdAsObject());
				myOldPerformanceOpalFast3Set = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
			}
			return myOldPerformanceOpalFast3Set;
		}
	}

	public synchronized void addPerformanceOpal(PerformanceOpal argPerformanceOpal) {
		tryMutate();
		argPerformanceOpal.setGameOpal(this);
		return;
	}

	protected synchronized void addPerformanceOpalInternal(PerformanceOpal argPerformanceOpal) {
		tryMutate();
		if (myNewPerformanceOpalFast3Set == null) {
			if (myOldPerformanceOpalFast3Set == null) {
				if (myPerformanceOpalCachedOperations == null) { myPerformanceOpalCachedOperations = new java.util.ArrayList<>(); }
				myPerformanceOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.ADD, argPerformanceOpal));
			} else {
				myNewPerformanceOpalFast3Set = new com.siliconage.util.Fast3Set<>(myOldPerformanceOpalFast3Set);
				myNewPerformanceOpalFast3Set.add(argPerformanceOpal);
			}
		} else {
			myNewPerformanceOpalFast3Set.add(argPerformanceOpal);
		}
		return;
	}

	public synchronized void removePerformanceOpal(PerformanceOpal argPerformanceOpal) {
		tryMutate();
		argPerformanceOpal.setGameOpal(null);
	}

	protected synchronized void removePerformanceOpalInternal(PerformanceOpal argPerformanceOpal) {
		tryMutate();
		if (myNewPerformanceOpalFast3Set == null) {
			if (myOldPerformanceOpalFast3Set == null) {
				if (myPerformanceOpalCachedOperations == null) { myPerformanceOpalCachedOperations = new java.util.ArrayList<>(); }
				myPerformanceOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.REMOVE, argPerformanceOpal));
			} else {
				myNewPerformanceOpalFast3Set = new com.siliconage.util.Fast3Set<>(myOldPerformanceOpalFast3Set);
				myNewPerformanceOpalFast3Set.remove(argPerformanceOpal);
			}
		} else {
			myNewPerformanceOpalFast3Set.remove(argPerformanceOpal);
		}
		return;
	}

	public synchronized int getPerformanceOpalCount() { return getPerformanceOpalFast3Set().size(); }

	public synchronized java.util.Iterator<PerformanceOpal> createPerformanceOpalIterator() {
		return getPerformanceOpalFast3Set().iterator();
	}

	public synchronized java.util.stream.Stream<PerformanceOpal> streamPerformanceOpal() {
		return getPerformanceOpalFast3Set().stream();
	}

	@Override
	public java.lang.String toString() {
		java.lang.StringBuilder lclSB = new java.lang.StringBuilder(64);
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
		if (myNewModeratorStaffOpal != StaffOpal.NOT_YET_LOADED) {
			setModeratorStaffOpal(retrieveModeratorStaffOpal(getNewValues()));
		}
		if (myNewOutgoingLosingCardPlayerOpal != PlayerOpal.NOT_YET_LOADED) {
			setOutgoingLosingCardPlayerOpal(retrieveOutgoingLosingCardPlayerOpal(getNewValues()));
		}
		if (myNewOutgoingWinningCardPlayerOpal != PlayerOpal.NOT_YET_LOADED) {
			setOutgoingWinningCardPlayerOpal(retrieveOutgoingWinningCardPlayerOpal(getNewValues()));
		}
		if (myNewIncomingLosingCardPlayerOpal != PlayerOpal.NOT_YET_LOADED) {
			setIncomingLosingCardPlayerOpal(retrieveIncomingLosingCardPlayerOpal(getNewValues()));
		}
		if (myNewIncomingWinningCardPlayerOpal != PlayerOpal.NOT_YET_LOADED) {
			setIncomingWinningCardPlayerOpal(retrieveIncomingWinningCardPlayerOpal(getNewValues()));
		}
		if (myNewScorekeeperStaffOpal != StaffOpal.NOT_YET_LOADED) {
			setScorekeeperStaffOpal(retrieveScorekeeperStaffOpal(getNewValues()));
		}
	}

	@Override
	protected void updateCollectionsAfterReload() {
		assert needsToClearOldCollections() == false;
		setClearOldCollections(true);
	}

}
