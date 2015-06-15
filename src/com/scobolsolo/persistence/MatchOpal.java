package com.scobolsolo.persistence;

import java.io.PrintWriter;
import java.io.PrintStream;

import com.opal.*;

import com.scobolsolo.application.*;

@StoreGeneratedPrimaryKey
public final class MatchOpal extends com.opal.UpdatableOpal<Match> {

	private MatchOpal() {
		super();
		setUserFacing(null);
	}

	public MatchOpal(OpalFactory<Match, MatchOpal> argOpalFactory, Object[] argValues) {
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

	/* package */ static final FieldValidator[] ourFieldValidators = new FieldValidator[] {
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
	public FieldValidator[] getFieldValidators() { return ourFieldValidators; }

	@Override
	public boolean[] getFieldNullability() { return ourFieldNullability; }

	public static FieldValidator[] getStaticFieldValidators() { return ourFieldValidators; }


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

	public synchronized void setRoundId(final java.lang.Integer argRoundId) {
		tryMutate();
		if (argRoundId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myRoundId on " + this + " to null.");
		}
		getNewValues()[1] = argRoundId;
		return;
	}

	public void setRoundId(final int argRoundId) {
		setRoundId(java.lang.Integer.valueOf(argRoundId));
		return;
	}

	public synchronized void setRoomId(final java.lang.Integer argRoomId) {
		tryMutate();
		if (argRoomId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myRoomId on " + this + " to null.");
		}
		getNewValues()[2] = argRoomId;
		return;
	}

	public void setRoomId(final int argRoomId) {
		setRoomId(java.lang.Integer.valueOf(argRoomId));
		return;
	}

	public synchronized void setWinningCardId(final java.lang.Integer argWinningCardId) {
		tryMutate();
		getNewValues()[3] = argWinningCardId;
		return;
	}

	public void setWinningCardId(final int argWinningCardId) {
		setWinningCardId(java.lang.Integer.valueOf(argWinningCardId));
		return;
	}

	public synchronized void setLosingCardId(final java.lang.Integer argLosingCardId) {
		tryMutate();
		getNewValues()[4] = argLosingCardId;
		return;
	}

	public void setLosingCardId(final int argLosingCardId) {
		setLosingCardId(java.lang.Integer.valueOf(argLosingCardId));
		return;
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
	protected void copyFieldsToInternal(UpdatableOpal<Match> argTarget) {
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
	public java.util.Set<TransactionAware> getRequiredPriorCommits() {
		java.util.Set<TransactionAware> lclTAs = null;
		UpdatableOpal<?> lclUO;
		lclUO = myNewWinningCardOpal;
		if ((lclUO != null) && lclUO.isNew()) {
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
		lclUO = myNewLosingCardOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		lclUO = myNewRoomOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		return (lclTAs != null) && (lclTAs.size() > 0) ? lclTAs : java.util.Collections.emptySet();
	}

	@Override
	public java.util.Set<TransactionAware> getRequiredSubsequentCommits() {
		java.util.Set<TransactionAware> lclTAs = null;
		UpdatableOpal<?> lclUO;
		lclUO = myOldWinningCardOpal;
		if ((lclUO != null) && lclUO.isDeleted()) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		lclUO = myOldRoundOpal;
		if ((lclUO != null) && lclUO.isDeleted()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		lclUO = myOldLosingCardOpal;
		if ((lclUO != null) && lclUO.isDeleted()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		lclUO = myOldRoomOpal;
		if ((lclUO != null) && lclUO.isDeleted()) {
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
		argPW.println("RoundId = " + getRoundIdAsObject());
		argPW.println("RoomId = " + getRoomIdAsObject());
		argPW.println("WinningCardId = " + getWinningCardIdAsObject());
		argPW.println("LosingCardId = " + getLosingCardIdAsObject());
	}

	@Override
	public synchronized void output(final PrintStream argPS) {
		argPS.println("Id = " + getIdAsObject());
		argPS.println("RoundId = " + getRoundIdAsObject());
		argPS.println("RoomId = " + getRoomIdAsObject());
		argPS.println("WinningCardId = " + getWinningCardIdAsObject());
		argPS.println("LosingCardId = " + getLosingCardIdAsObject());
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

	public synchronized void setLosingCardOpal(CardOpal argCardOpal) {
		tryMutate();
		CardOpal lclCardOpal = getLosingCardOpal();
		if (lclCardOpal == argCardOpal) { return; }
		if (lclCardOpal != null) {
			lclCardOpal.removeLosingMatchOpalInternal(this);
		}
		myNewLosingCardOpal = argCardOpal;
		if (argCardOpal != null) {
			argCardOpal.addLosingMatchOpalInternal(this);
		}
		return;
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

	public synchronized void setRoomOpal(RoomOpal argRoomOpal) {
		tryMutate();
		RoomOpal lclRoomOpal = getRoomOpal();
		if (lclRoomOpal == argRoomOpal) { return; }
		if (lclRoomOpal != null) {
			lclRoomOpal.removeMatchOpalInternal(this);
		}
		myNewRoomOpal = argRoomOpal;
		if (argRoomOpal != null) {
			argRoomOpal.addMatchOpalInternal(this);
		}
		return;
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

	public synchronized void setRoundOpal(RoundOpal argRoundOpal) {
		tryMutate();
		RoundOpal lclRoundOpal = getRoundOpal();
		if (lclRoundOpal == argRoundOpal) { return; }
		if (lclRoundOpal != null) {
			lclRoundOpal.removeMatchOpalInternal(this);
		}
		myNewRoundOpal = argRoundOpal;
		if (argRoundOpal != null) {
			argRoundOpal.addMatchOpalInternal(this);
		}
		return;
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

	public synchronized void setWinningCardOpal(CardOpal argCardOpal) {
		tryMutate();
		CardOpal lclCardOpal = getWinningCardOpal();
		if (lclCardOpal == argCardOpal) { return; }
		if (lclCardOpal != null) {
			lclCardOpal.removeWinningMatchOpalInternal(this);
		}
		myNewWinningCardOpal = argCardOpal;
		if (argCardOpal != null) {
			argCardOpal.addWinningMatchOpalInternal(this);
		}
		return;
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

	public synchronized void setGameOpal(GameOpal argGameOpal) {
		tryMutate();
		myNewGameOpal = argGameOpal;
		if (argGameOpal != null) {
			argGameOpal.setMatchOpalInternal(this);
		}
		return;
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
