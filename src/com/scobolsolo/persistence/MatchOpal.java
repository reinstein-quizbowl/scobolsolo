package com.scobolsolo.persistence;

import com.scobolsolo.application.*;

@com.opal.StoreGeneratedPrimaryKey
public final class MatchOpal extends com.opal.UpdatableOpal<Match> {

	private MatchOpal() {
		super();
		setUserFacing(null);
	}

	public MatchOpal(com.opal.OpalFactory<Match, MatchOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void initializeReferences() {
		myOldLosingCardOpal = CardOpal.NOT_YET_LOADED;
		myOldRoomOpal = RoomOpal.NOT_YET_LOADED;
		myOldRoundOpal = RoundOpal.NOT_YET_LOADED;
		myOldWinningCardOpal = CardOpal.NOT_YET_LOADED;
		myOldGameOpal = GameOpal.NOT_YET_LOADED;
		return;
	}

	/* package */ static final String[] ourFieldNames = new String[] {
		"Id",
		"RoundId",
		"RoomId",
		"WinningCardId",
		"LosingCardId",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.lang.Integer.class,
	};

	/* package */ static final boolean[] ourFieldNullability = new boolean[] {
		false,
		false,
		false,
		true,
		true,
	};

	/* package */ static final com.opal.FieldValidator[] ourFieldValidators = new com.opal.FieldValidator[] {
		null,
		null,
		null,
		null,
		null,
	};

	public static final MatchOpal NOT_YET_LOADED = new MatchOpal();

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

	public synchronized java.lang.Integer getRoundIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[1];
	}

	public synchronized java.lang.Integer getRoomIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[2];
	}

	public synchronized java.lang.Integer getWinningCardIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[3];
	}

	public synchronized java.lang.Integer getLosingCardIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[4];
	}

	public synchronized MatchOpal setId(final java.lang.Integer argId) {
		tryMutate();
		if (argId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myId on " + this + " to null.");
		}
		getNewValues()[0] = argId;
		return this;
	}

	public MatchOpal setId(final int argId) {
		setId(java.lang.Integer.valueOf(argId));
		return this;
	}

	public synchronized MatchOpal setRoundId(final java.lang.Integer argRoundId) {
		tryMutate();
		if (argRoundId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myRoundId on " + this + " to null.");
		}
		getNewValues()[1] = argRoundId;
		return this;
	}

	public MatchOpal setRoundId(final int argRoundId) {
		setRoundId(java.lang.Integer.valueOf(argRoundId));
		return this;
	}

	public synchronized MatchOpal setRoomId(final java.lang.Integer argRoomId) {
		tryMutate();
		if (argRoomId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myRoomId on " + this + " to null.");
		}
		getNewValues()[2] = argRoomId;
		return this;
	}

	public MatchOpal setRoomId(final int argRoomId) {
		setRoomId(java.lang.Integer.valueOf(argRoomId));
		return this;
	}

	public synchronized MatchOpal setWinningCardId(final java.lang.Integer argWinningCardId) {
		tryMutate();
		getNewValues()[3] = argWinningCardId;
		return this;
	}

	public MatchOpal setWinningCardId(final int argWinningCardId) {
		setWinningCardId(java.lang.Integer.valueOf(argWinningCardId));
		return this;
	}

	public synchronized MatchOpal setLosingCardId(final java.lang.Integer argLosingCardId) {
		tryMutate();
		getNewValues()[4] = argLosingCardId;
		return this;
	}

	public MatchOpal setLosingCardId(final int argLosingCardId) {
		setLosingCardId(java.lang.Integer.valueOf(argLosingCardId));
		return this;
	}

	@Override
	protected /* synchronized */ void copyOldValuesToNewInternal() {
		myNewLosingCardOpal = myOldLosingCardOpal;
		myNewRoomOpal = myOldRoomOpal;
		myNewRoundOpal = myOldRoundOpal;
		myNewWinningCardOpal = myOldWinningCardOpal;
		myNewGameOpal = myOldGameOpal;
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		myOldLosingCardOpal = myNewLosingCardOpal;
		myOldRoomOpal = myNewRoomOpal;
		myOldRoundOpal = myNewRoundOpal;
		myOldWinningCardOpal = myNewWinningCardOpal;

		myOldGameOpal = myNewGameOpal;
		return;
	}

	@Override
	protected void unlinkInternal() {
		if (getGameOpal() != null) {
			getGameOpal().setMatchOpalInternal(null);
		}
		if (getLosingCardOpal() != null) {
			getLosingCardOpal().removeLosingMatchOpalInternal(this);
		}
		if (getRoomOpal() != null) {
			getRoomOpal().removeMatchOpalInternal(this);
		}
		if (getRoundOpal() != null) {
			getRoundOpal().removeMatchOpalInternal(this);
		}
		if (getWinningCardOpal() != null) {
			getWinningCardOpal().removeWinningMatchOpalInternal(this);
		}
		return;
	}

	@Override
	protected void copyFieldsToInternal(com.opal.UpdatableOpal<Match> argTarget) {
		/* Field 0 (Id) is database generated. */
		/* Field 1 (RoundId) is part of a unique key. */
		/* Field 2 (RoomId) is part of a unique key. */
		/* Field 3 (WinningCardId) is part of a unique key. */
		/* Field 4 (LosingCardId) is part of a unique key. */

		return;
	}

	@Override
	public synchronized void translateReferencesToFields() {
		if (myNewLosingCardOpal != CardOpal.NOT_YET_LOADED) {
			setLosingCardId(myNewLosingCardOpal == null ? null : myNewLosingCardOpal.getIdAsObject());
		}
		if (myNewRoomOpal != RoomOpal.NOT_YET_LOADED) {
			setRoomId(myNewRoomOpal == null ? null : myNewRoomOpal.getIdAsObject());
		}
		if (myNewRoundOpal != RoundOpal.NOT_YET_LOADED) {
			setRoundId(myNewRoundOpal == null ? null : myNewRoundOpal.getIdAsObject());
		}
		if (myNewWinningCardOpal != CardOpal.NOT_YET_LOADED) {
			setWinningCardId(myNewWinningCardOpal == null ? null : myNewWinningCardOpal.getIdAsObject());
		}
		return;
	}

	@Override
	public java.util.Set<com.opal.TransactionAware> getRequiredPriorCommits() {
		java.util.Set<com.opal.TransactionAware> lclTAs = null;
		com.opal.UpdatableOpal<?> lclUO;
		lclUO = myNewLosingCardOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		lclUO = myNewRoomOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		lclUO = myNewRoundOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		lclUO = myNewWinningCardOpal;
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
		if ((lclUO = myOldLosingCardOpal) == CardOpal.NOT_YET_LOADED) {
			lclUO = myOldLosingCardOpal = retrieveLosingCardOpal(getOldValues());
		}
		if (lclUO != null && lclUO.isDeleted()) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		if ((lclUO = myOldRoomOpal) == RoomOpal.NOT_YET_LOADED) {
			lclUO = myOldRoomOpal = retrieveRoomOpal(getOldValues());
		}
		if (lclUO != null && lclUO.isDeleted()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
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
		if ((lclUO = myOldWinningCardOpal) == CardOpal.NOT_YET_LOADED) {
			lclUO = myOldWinningCardOpal = retrieveWinningCardOpal(getOldValues());
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
		argOutput.println("RoundId = " + getRoundIdAsObject());
		argOutput.println("RoomId = " + getRoomIdAsObject());
		argOutput.println("WinningCardId = " + getWinningCardIdAsObject());
		argOutput.println("LosingCardId = " + getLosingCardIdAsObject());
	}

	@Override
	public synchronized void output(final java.io.PrintWriter argOutput) {
		argOutput.println("Id = " + getIdAsObject());
		argOutput.println("RoundId = " + getRoundIdAsObject());
		argOutput.println("RoomId = " + getRoomIdAsObject());
		argOutput.println("WinningCardId = " + getWinningCardIdAsObject());
		argOutput.println("LosingCardId = " + getLosingCardIdAsObject());
	}

	private CardOpal myOldLosingCardOpal;
	private CardOpal myNewLosingCardOpal;

	protected CardOpal retrieveLosingCardOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[4] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getCardOpalFactory().forId(getLosingCardIdAsObject());
	}

	public synchronized CardOpal getLosingCardOpal() {
		CardOpal lclCardOpal;
		boolean lclAccess = tryAccess();
		lclCardOpal = lclAccess ? myNewLosingCardOpal : myOldLosingCardOpal;
		if (lclCardOpal == CardOpal.NOT_YET_LOADED) {
			lclCardOpal = retrieveLosingCardOpal(getReadValueSet());
			if (lclAccess) {
				myNewLosingCardOpal = lclCardOpal;
			} else {
				myOldLosingCardOpal = lclCardOpal;
			}
		}
		return lclCardOpal;
	}

	public synchronized MatchOpal setLosingCardOpal(CardOpal argCardOpal) {
		tryMutate();
		CardOpal lclCardOpal = getLosingCardOpal();
		if (lclCardOpal == argCardOpal) { return this; }
		if (lclCardOpal != null) {
			lclCardOpal.removeLosingMatchOpalInternal(this);
		}
		myNewLosingCardOpal = argCardOpal;
		if (argCardOpal != null) {
			argCardOpal.addLosingMatchOpalInternal(this);
		}
		return this;
	}

	protected synchronized void setLosingCardOpalInternal(CardOpal argCardOpal) {
		tryMutate();
		myNewLosingCardOpal = argCardOpal;
	}

	private RoomOpal myOldRoomOpal;
	private RoomOpal myNewRoomOpal;

	protected RoomOpal retrieveRoomOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[2] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getRoomOpalFactory().forId(getRoomIdAsObject());
	}

	public synchronized RoomOpal getRoomOpal() {
		RoomOpal lclRoomOpal;
		boolean lclAccess = tryAccess();
		lclRoomOpal = lclAccess ? myNewRoomOpal : myOldRoomOpal;
		if (lclRoomOpal == RoomOpal.NOT_YET_LOADED) {
			lclRoomOpal = retrieveRoomOpal(getReadValueSet());
			if (lclAccess) {
				myNewRoomOpal = lclRoomOpal;
			} else {
				myOldRoomOpal = lclRoomOpal;
			}
		}
		return lclRoomOpal;
	}

	public synchronized MatchOpal setRoomOpal(RoomOpal argRoomOpal) {
		tryMutate();
		RoomOpal lclRoomOpal = getRoomOpal();
		if (lclRoomOpal == argRoomOpal) { return this; }
		if (lclRoomOpal != null) {
			lclRoomOpal.removeMatchOpalInternal(this);
		}
		myNewRoomOpal = argRoomOpal;
		if (argRoomOpal != null) {
			argRoomOpal.addMatchOpalInternal(this);
		}
		return this;
	}

	protected synchronized void setRoomOpalInternal(RoomOpal argRoomOpal) {
		tryMutate();
		myNewRoomOpal = argRoomOpal;
	}

	private RoundOpal myOldRoundOpal;
	private RoundOpal myNewRoundOpal;

	protected RoundOpal retrieveRoundOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[1] == null)) {
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

	public synchronized MatchOpal setRoundOpal(RoundOpal argRoundOpal) {
		tryMutate();
		RoundOpal lclRoundOpal = getRoundOpal();
		if (lclRoundOpal == argRoundOpal) { return this; }
		if (lclRoundOpal != null) {
			lclRoundOpal.removeMatchOpalInternal(this);
		}
		myNewRoundOpal = argRoundOpal;
		if (argRoundOpal != null) {
			argRoundOpal.addMatchOpalInternal(this);
		}
		return this;
	}

	protected synchronized void setRoundOpalInternal(RoundOpal argRoundOpal) {
		tryMutate();
		myNewRoundOpal = argRoundOpal;
	}

	private CardOpal myOldWinningCardOpal;
	private CardOpal myNewWinningCardOpal;

	protected CardOpal retrieveWinningCardOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[3] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getCardOpalFactory().forId(getWinningCardIdAsObject());
	}

	public synchronized CardOpal getWinningCardOpal() {
		CardOpal lclCardOpal;
		boolean lclAccess = tryAccess();
		lclCardOpal = lclAccess ? myNewWinningCardOpal : myOldWinningCardOpal;
		if (lclCardOpal == CardOpal.NOT_YET_LOADED) {
			lclCardOpal = retrieveWinningCardOpal(getReadValueSet());
			if (lclAccess) {
				myNewWinningCardOpal = lclCardOpal;
			} else {
				myOldWinningCardOpal = lclCardOpal;
			}
		}
		return lclCardOpal;
	}

	public synchronized MatchOpal setWinningCardOpal(CardOpal argCardOpal) {
		tryMutate();
		CardOpal lclCardOpal = getWinningCardOpal();
		if (lclCardOpal == argCardOpal) { return this; }
		if (lclCardOpal != null) {
			lclCardOpal.removeWinningMatchOpalInternal(this);
		}
		myNewWinningCardOpal = argCardOpal;
		if (argCardOpal != null) {
			argCardOpal.addWinningMatchOpalInternal(this);
		}
		return this;
	}

	protected synchronized void setWinningCardOpalInternal(CardOpal argCardOpal) {
		tryMutate();
		myNewWinningCardOpal = argCardOpal;
	}

	private GameOpal myOldGameOpal;
	private GameOpal myNewGameOpal;

	protected GameOpal retrieveGameOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[0] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getGameOpalFactory().forId(getIdAsObject());
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

	public synchronized MatchOpal setGameOpal(GameOpal argGameOpal) {
		tryMutate();
		myNewGameOpal = argGameOpal;
		if (argGameOpal != null) {
			argGameOpal.setMatchOpalInternal(this);
		}
		return this;
	}

	public synchronized void setGameOpalInternal(GameOpal argGameOpal) {
		tryMutate();
		myNewGameOpal = argGameOpal;
	}

	@Override
	public String toString() {
		StringBuilder lclSB =  new StringBuilder(64);
		lclSB.append("MatchOpal[");
		lclSB.append("myId=");
		lclSB.append(toStringField(0));
		lclSB.append(']');
		return lclSB.toString();
	}

	@Override
	protected void updateReferencesAfterReload() {
		if (myNewLosingCardOpal != CardOpal.NOT_YET_LOADED) {
			setLosingCardOpal(retrieveLosingCardOpal(getNewValues()));
		}
		if (myNewRoomOpal != RoomOpal.NOT_YET_LOADED) {
			setRoomOpal(retrieveRoomOpal(getNewValues()));
		}
		if (myNewRoundOpal != RoundOpal.NOT_YET_LOADED) {
			setRoundOpal(retrieveRoundOpal(getNewValues()));
		}
		if (myNewWinningCardOpal != CardOpal.NOT_YET_LOADED) {
			setWinningCardOpal(retrieveWinningCardOpal(getNewValues()));
		}
	}

}
