package com.scobolsolo.persistence;

import java.io.PrintWriter;
import java.io.PrintStream;

import com.opal.*;

import com.scobolsolo.application.*;

public final class PlayerMatchVOpal extends com.opal.EphemeralOpal<PlayerMatchV> {

	private PlayerMatchVOpal() {
		super();
		setUserFacing(null);
	}

	public PlayerMatchVOpal(OpalFactory<PlayerMatchV, PlayerMatchVOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void initializeReferences() {
		myOldGameOpal = GameOpal.NOT_YET_LOADED;
		myOldTournamentOpal = TournamentOpal.NOT_YET_LOADED;
		myOldPlayerOpal = PlayerOpal.NOT_YET_LOADED;
		myOldOpponentPlayerOpal = PlayerOpal.NOT_YET_LOADED;
		myOldMatchOpal = MatchOpal.NOT_YET_LOADED;
		myOldPerformanceOpal = PerformanceOpal.NOT_YET_LOADED;
		myOldOpponentPerformanceOpal = PerformanceOpal.NOT_YET_LOADED;
		return;
	}

	/* package */ static final String[] ourFieldNames = new String[] {
		"TournamentCode",
		"PlayerId",
		"PerformanceId",
		"OpponentPlayerId",
		"OpponentPerformanceId",
		"MatchId",
		"GameId",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.String.class,
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

	public static final PlayerMatchVOpal NOT_YET_LOADED = new PlayerMatchVOpal();

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


	public java.lang.String getTournamentCode() {
		return (java.lang.String) getValues()[0];
	}

	public java.lang.Integer getPlayerIdAsObject() {
		return (java.lang.Integer) getValues()[1];
	}

	public java.lang.Integer getPerformanceIdAsObject() {
		return (java.lang.Integer) getValues()[2];
	}

	public java.lang.Integer getOpponentPlayerIdAsObject() {
		return (java.lang.Integer) getValues()[3];
	}

	public java.lang.Integer getOpponentPerformanceIdAsObject() {
		return (java.lang.Integer) getValues()[4];
	}

	public java.lang.Integer getMatchIdAsObject() {
		return (java.lang.Integer) getValues()[5];
	}

	public java.lang.Integer getGameIdAsObject() {
		return (java.lang.Integer) getValues()[6];
	}

	@Override
	protected /* synchronized */ void copyOldValuesToNewInternal() {
		myNewGameOpal = myOldGameOpal;
		myNewTournamentOpal = myOldTournamentOpal;
		myNewPlayerOpal = myOldPlayerOpal;
		myNewOpponentPlayerOpal = myOldOpponentPlayerOpal;
		myNewMatchOpal = myOldMatchOpal;
		myNewPerformanceOpal = myOldPerformanceOpal;
		myNewOpponentPerformanceOpal = myOldOpponentPerformanceOpal;
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		myOldGameOpal = myNewGameOpal;
		myOldTournamentOpal = myNewTournamentOpal;
		myOldPlayerOpal = myNewPlayerOpal;
		myOldOpponentPlayerOpal = myNewOpponentPlayerOpal;
		myOldMatchOpal = myNewMatchOpal;
		myOldPerformanceOpal = myNewPerformanceOpal;
		myOldOpponentPerformanceOpal = myNewOpponentPerformanceOpal;

		return;
	}

	@Override
	public synchronized void translateReferencesToFields() {
		return;
	}

	private static int getFieldCountInternal() { return ourFieldNames.length; }

	@Override
	protected int getFieldCount() { return getFieldCountInternal(); }

	@Override
	protected String[] getFieldNames() { return ourFieldNames; }

	@Override
	public synchronized void output(final PrintWriter argPW) {
		argPW.println("TournamentCode = " + getTournamentCode());
		argPW.println("PlayerId = " + getPlayerIdAsObject());
		argPW.println("PerformanceId = " + getPerformanceIdAsObject());
		argPW.println("OpponentPlayerId = " + getOpponentPlayerIdAsObject());
		argPW.println("OpponentPerformanceId = " + getOpponentPerformanceIdAsObject());
		argPW.println("MatchId = " + getMatchIdAsObject());
		argPW.println("GameId = " + getGameIdAsObject());
	}

	@Override
	public synchronized void output(final PrintStream argPS) {
		argPS.println("TournamentCode = " + getTournamentCode());
		argPS.println("PlayerId = " + getPlayerIdAsObject());
		argPS.println("PerformanceId = " + getPerformanceIdAsObject());
		argPS.println("OpponentPlayerId = " + getOpponentPlayerIdAsObject());
		argPS.println("OpponentPerformanceId = " + getOpponentPerformanceIdAsObject());
		argPS.println("MatchId = " + getMatchIdAsObject());
		argPS.println("GameId = " + getGameIdAsObject());
	}

	private GameOpal myOldGameOpal;
	private GameOpal myNewGameOpal;

	protected GameOpal retrieveGameOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[6] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getGameOpalFactory().forId(getGameIdAsObject());
	}

	public synchronized GameOpal getGameOpal() {
		GameOpal lclGameOpal;
		boolean lclAccess = tryAccess();
		lclGameOpal = lclAccess ? myNewGameOpal : myOldGameOpal;
		if (lclGameOpal == GameOpal.NOT_YET_LOADED) {
			lclGameOpal = retrieveGameOpal(getValues());
			if (lclAccess) {
				myNewGameOpal = lclGameOpal;
			} else {
				myOldGameOpal = lclGameOpal;
			}
		}
		return lclGameOpal;
	}

	private TournamentOpal myOldTournamentOpal;
	private TournamentOpal myNewTournamentOpal;

	protected TournamentOpal retrieveTournamentOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[0] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getTournamentOpalFactory().forCode(getTournamentCode());
	}

	public synchronized TournamentOpal getTournamentOpal() {
		TournamentOpal lclTournamentOpal;
		boolean lclAccess = tryAccess();
		lclTournamentOpal = lclAccess ? myNewTournamentOpal : myOldTournamentOpal;
		if (lclTournamentOpal == TournamentOpal.NOT_YET_LOADED) {
			lclTournamentOpal = retrieveTournamentOpal(getValues());
			if (lclAccess) {
				myNewTournamentOpal = lclTournamentOpal;
			} else {
				myOldTournamentOpal = lclTournamentOpal;
			}
		}
		return lclTournamentOpal;
	}

	private PlayerOpal myOldPlayerOpal;
	private PlayerOpal myNewPlayerOpal;

	protected PlayerOpal retrievePlayerOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[1] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getPlayerOpalFactory().forId(getPlayerIdAsObject());
	}

	public synchronized PlayerOpal getPlayerOpal() {
		PlayerOpal lclPlayerOpal;
		boolean lclAccess = tryAccess();
		lclPlayerOpal = lclAccess ? myNewPlayerOpal : myOldPlayerOpal;
		if (lclPlayerOpal == PlayerOpal.NOT_YET_LOADED) {
			lclPlayerOpal = retrievePlayerOpal(getValues());
			if (lclAccess) {
				myNewPlayerOpal = lclPlayerOpal;
			} else {
				myOldPlayerOpal = lclPlayerOpal;
			}
		}
		return lclPlayerOpal;
	}

	private PlayerOpal myOldOpponentPlayerOpal;
	private PlayerOpal myNewOpponentPlayerOpal;

	protected PlayerOpal retrieveOpponentPlayerOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[3] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getPlayerOpalFactory().forId(getOpponentPlayerIdAsObject());
	}

	public synchronized PlayerOpal getOpponentPlayerOpal() {
		PlayerOpal lclPlayerOpal;
		boolean lclAccess = tryAccess();
		lclPlayerOpal = lclAccess ? myNewOpponentPlayerOpal : myOldOpponentPlayerOpal;
		if (lclPlayerOpal == PlayerOpal.NOT_YET_LOADED) {
			lclPlayerOpal = retrieveOpponentPlayerOpal(getValues());
			if (lclAccess) {
				myNewOpponentPlayerOpal = lclPlayerOpal;
			} else {
				myOldOpponentPlayerOpal = lclPlayerOpal;
			}
		}
		return lclPlayerOpal;
	}

	private MatchOpal myOldMatchOpal;
	private MatchOpal myNewMatchOpal;

	protected MatchOpal retrieveMatchOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[5] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getMatchOpalFactory().forId(getMatchIdAsObject());
	}

	public synchronized MatchOpal getMatchOpal() {
		MatchOpal lclMatchOpal;
		boolean lclAccess = tryAccess();
		lclMatchOpal = lclAccess ? myNewMatchOpal : myOldMatchOpal;
		if (lclMatchOpal == MatchOpal.NOT_YET_LOADED) {
			lclMatchOpal = retrieveMatchOpal(getValues());
			if (lclAccess) {
				myNewMatchOpal = lclMatchOpal;
			} else {
				myOldMatchOpal = lclMatchOpal;
			}
		}
		return lclMatchOpal;
	}

	private PerformanceOpal myOldPerformanceOpal;
	private PerformanceOpal myNewPerformanceOpal;

	protected PerformanceOpal retrievePerformanceOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[2] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getPerformanceOpalFactory().forId(getPerformanceIdAsObject());
	}

	public synchronized PerformanceOpal getPerformanceOpal() {
		PerformanceOpal lclPerformanceOpal;
		boolean lclAccess = tryAccess();
		lclPerformanceOpal = lclAccess ? myNewPerformanceOpal : myOldPerformanceOpal;
		if (lclPerformanceOpal == PerformanceOpal.NOT_YET_LOADED) {
			lclPerformanceOpal = retrievePerformanceOpal(getValues());
			if (lclAccess) {
				myNewPerformanceOpal = lclPerformanceOpal;
			} else {
				myOldPerformanceOpal = lclPerformanceOpal;
			}
		}
		return lclPerformanceOpal;
	}

	private PerformanceOpal myOldOpponentPerformanceOpal;
	private PerformanceOpal myNewOpponentPerformanceOpal;

	protected PerformanceOpal retrieveOpponentPerformanceOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[4] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getPerformanceOpalFactory().forId(getOpponentPerformanceIdAsObject());
	}

	public synchronized PerformanceOpal getOpponentPerformanceOpal() {
		PerformanceOpal lclPerformanceOpal;
		boolean lclAccess = tryAccess();
		lclPerformanceOpal = lclAccess ? myNewOpponentPerformanceOpal : myOldOpponentPerformanceOpal;
		if (lclPerformanceOpal == PerformanceOpal.NOT_YET_LOADED) {
			lclPerformanceOpal = retrieveOpponentPerformanceOpal(getValues());
			if (lclAccess) {
				myNewOpponentPerformanceOpal = lclPerformanceOpal;
			} else {
				myOldOpponentPerformanceOpal = lclPerformanceOpal;
			}
		}
		return lclPerformanceOpal;
	}

}