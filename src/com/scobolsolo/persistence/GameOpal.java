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

		myPerformanceSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
				this,
				ourPerformanceOpalLoader,
				true
				);

		return;
	}

	@Override
	protected void initializeReferences() {
		myOldMatchOpal = MatchOpal.NOT_YET_LOADED;
		myOldIncomingLosingCardPlayerOpal = PlayerOpal.NOT_YET_LOADED;
		myOldIncomingWinningCardPlayerOpal = PlayerOpal.NOT_YET_LOADED;
		myOldModeratorStaffOpal = StaffOpal.NOT_YET_LOADED;
		myOldOutgoingLosingCardPlayerOpal = PlayerOpal.NOT_YET_LOADED;
		myOldOutgoingWinningCardPlayerOpal = PlayerOpal.NOT_YET_LOADED;
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
		"StartTime",
		"EndTime",
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
		java.time.LocalDateTime.class,
		java.time.LocalDateTime.class,
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

	public synchronized java.time.LocalDateTime getStartTime() {
		return (java.time.LocalDateTime) getReadValueSet()[8];
	}

	public synchronized java.time.LocalDateTime getEndTime() {
		return (java.time.LocalDateTime) getReadValueSet()[9];
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

	public synchronized GameOpal setStartTime(final java.time.LocalDateTime argStartTime) {
		tryMutate();
		getNewValues()[8] = argStartTime;
		return this;
	}

	public synchronized GameOpal setEndTime(final java.time.LocalDateTime argEndTime) {
		tryMutate();
		getNewValues()[9] = argEndTime;
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
		myNewIncomingLosingCardPlayerOpal = myOldIncomingLosingCardPlayerOpal;
		myNewIncomingWinningCardPlayerOpal = myOldIncomingWinningCardPlayerOpal;
		myNewModeratorStaffOpal = myOldModeratorStaffOpal;
		myNewOutgoingLosingCardPlayerOpal = myOldOutgoingLosingCardPlayerOpal;
		myNewOutgoingWinningCardPlayerOpal = myOldOutgoingWinningCardPlayerOpal;
		myNewScorekeeperStaffOpal = myOldScorekeeperStaffOpal;
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
		myOldScorekeeperStaffOpal = myNewScorekeeperStaffOpal;

		return;
	}

	@Override
	protected void unlinkInternal() {
		getPerformanceOpalSet().clear();
		if (getMatchOpal() != null) {
			getMatchOpal().setGameOpalInternal(null);
		}
		if (getIncomingLosingCardPlayerOpal() != null) {
			getIncomingLosingCardPlayerOpal().getIncomingLosingCardGameOpalSet().removeInternal(this);
		}
		if (getIncomingWinningCardPlayerOpal() != null) {
			getIncomingWinningCardPlayerOpal().getIncomingWinningCardGameOpalSet().removeInternal(this);
		}
		if (getModeratorStaffOpal() != null) {
			getModeratorStaffOpal().getModeratorGameOpalSet().removeInternal(this);
		}
		if (getOutgoingLosingCardPlayerOpal() != null) {
			getOutgoingLosingCardPlayerOpal().getOutgoingLosingCardGameOpalSet().removeInternal(this);
		}
		if (getOutgoingWinningCardPlayerOpal() != null) {
			getOutgoingWinningCardPlayerOpal().getOutgoingWinningCardGameOpalSet().removeInternal(this);
		}
		if (getScorekeeperStaffOpal() != null) {
			getScorekeeperStaffOpal().getScorekeeperGameOpalSet().removeInternal(this);
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
		lclTargetNewValues[8] = lclValues[8]; /* StartTime (immutable) */
		lclTargetNewValues[9] = lclValues[9]; /* EndTime (immutable) */

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
		if (lclUO != null && (lclUO.exists() == false)) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		if ((lclUO = myOldIncomingLosingCardPlayerOpal) == PlayerOpal.NOT_YET_LOADED) {
			lclUO = myOldIncomingLosingCardPlayerOpal = retrieveIncomingLosingCardPlayerOpal(getOldValues());
		}
		if (lclUO != null && (lclUO.exists() == false)) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		if ((lclUO = myOldIncomingWinningCardPlayerOpal) == PlayerOpal.NOT_YET_LOADED) {
			lclUO = myOldIncomingWinningCardPlayerOpal = retrieveIncomingWinningCardPlayerOpal(getOldValues());
		}
		if (lclUO != null && (lclUO.exists() == false)) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		if ((lclUO = myOldModeratorStaffOpal) == StaffOpal.NOT_YET_LOADED) {
			lclUO = myOldModeratorStaffOpal = retrieveModeratorStaffOpal(getOldValues());
		}
		if (lclUO != null && (lclUO.exists() == false)) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		if ((lclUO = myOldOutgoingLosingCardPlayerOpal) == PlayerOpal.NOT_YET_LOADED) {
			lclUO = myOldOutgoingLosingCardPlayerOpal = retrieveOutgoingLosingCardPlayerOpal(getOldValues());
		}
		if (lclUO != null && (lclUO.exists() == false)) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		if ((lclUO = myOldOutgoingWinningCardPlayerOpal) == PlayerOpal.NOT_YET_LOADED) {
			lclUO = myOldOutgoingWinningCardPlayerOpal = retrieveOutgoingWinningCardPlayerOpal(getOldValues());
		}
		if (lclUO != null && (lclUO.exists() == false)) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		if ((lclUO = myOldScorekeeperStaffOpal) == StaffOpal.NOT_YET_LOADED) {
			lclUO = myOldScorekeeperStaffOpal = retrieveScorekeeperStaffOpal(getOldValues());
		}
		if (lclUO != null && (lclUO.exists() == false)) {
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
		argOutput.println("StartTime = " + getStartTime());
		argOutput.println("EndTime = " + getEndTime());
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
		argOutput.println("StartTime = " + getStartTime());
		argOutput.println("EndTime = " + getEndTime());
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
			lclPlayerOpal.getIncomingLosingCardGameOpalSet().removeInternal(this);
		}
		myNewIncomingLosingCardPlayerOpal = argPlayerOpal;
		if (argPlayerOpal != null) {
			argPlayerOpal.getIncomingLosingCardGameOpalSet().addInternal(this);
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
			lclPlayerOpal.getIncomingWinningCardGameOpalSet().removeInternal(this);
		}
		myNewIncomingWinningCardPlayerOpal = argPlayerOpal;
		if (argPlayerOpal != null) {
			argPlayerOpal.getIncomingWinningCardGameOpalSet().addInternal(this);
		}
		return this;
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

	public synchronized GameOpal setModeratorStaffOpal(StaffOpal argStaffOpal) {
		tryMutate();
		StaffOpal lclStaffOpal = getModeratorStaffOpal();
		if (lclStaffOpal == argStaffOpal) { return this; }
		if (lclStaffOpal != null) {
			lclStaffOpal.getModeratorGameOpalSet().removeInternal(this);
		}
		myNewModeratorStaffOpal = argStaffOpal;
		if (argStaffOpal != null) {
			argStaffOpal.getModeratorGameOpalSet().addInternal(this);
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
			lclPlayerOpal.getOutgoingLosingCardGameOpalSet().removeInternal(this);
		}
		myNewOutgoingLosingCardPlayerOpal = argPlayerOpal;
		if (argPlayerOpal != null) {
			argPlayerOpal.getOutgoingLosingCardGameOpalSet().addInternal(this);
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
			lclPlayerOpal.getOutgoingWinningCardGameOpalSet().removeInternal(this);
		}
		myNewOutgoingWinningCardPlayerOpal = argPlayerOpal;
		if (argPlayerOpal != null) {
			argPlayerOpal.getOutgoingWinningCardGameOpalSet().addInternal(this);
		}
		return this;
	}

	protected synchronized void setOutgoingWinningCardPlayerOpalInternal(PlayerOpal argPlayerOpal) {
		tryMutate();
		myNewOutgoingWinningCardPlayerOpal = argPlayerOpal;
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
			lclStaffOpal.getScorekeeperGameOpalSet().removeInternal(this);
		}
		myNewScorekeeperStaffOpal = argStaffOpal;
		if (argStaffOpal != null) {
			argStaffOpal.getScorekeeperGameOpalSet().addInternal(this);
		}
		return this;
	}

	protected synchronized void setScorekeeperStaffOpalInternal(StaffOpal argStaffOpal) {
		tryMutate();
		myNewScorekeeperStaffOpal = argStaffOpal;
	}

	private com.opal.types.OpalBackCollectionSet<PerformanceOpal, GameOpal> myPerformanceSet = null;

	private static final com.opal.types.OpalBackCollectionLoader<PerformanceOpal, GameOpal> ourPerformanceOpalLoader = 
			new com.opal.types.OpalBackCollectionLoader<>(
					OpalFactoryFactory.getInstance().getPerformanceOpalFactory()::forGameOpalCollection,
					OpalFactoryFactory.getInstance().getPerformanceOpalFactory()::forGameOpalCount,
					PerformanceOpal::setGameOpal,
					PerformanceOpal::setGameOpalInternal,
					PerformanceOpal::getGameOpal,
					com.scobolsolo.application.FactoryMap.getNoArgCtorSetCreator(),
					com.scobolsolo.application.FactoryMap.getCollectionArgSetCreator(),
					false
					);

	/* package */ synchronized com.opal.types.OpalBackCollectionSet<PerformanceOpal, GameOpal> getPerformanceOpalSet() {
		if (myPerformanceSet == null) {
			myPerformanceSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
					this,
					ourPerformanceOpalLoader,
					isNew()
					);
		}
		return myPerformanceSet;
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
