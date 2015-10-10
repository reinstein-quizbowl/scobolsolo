package com.scobolsolo.persistence;

import com.scobolsolo.application.GameV;

public final class GameVOpal extends com.opal.EphemeralOpal<GameV> {

	private GameVOpal() {
		super();
		setUserFacing(null);
	}

	public GameVOpal(com.opal.OpalFactory<GameV, GameVOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void initializeReferences() {
		myOldGameOpal = GameOpal.NOT_YET_LOADED;
		myOldTournamentOpal = TournamentOpal.NOT_YET_LOADED;
		myOldIncomingWinningCardPlayerOpal = PlayerOpal.NOT_YET_LOADED;
		myOldIncomingLosingCardPlayerOpal = PlayerOpal.NOT_YET_LOADED;
		myOldWinnerPlayerOpal = PlayerOpal.NOT_YET_LOADED;
		myOldLoserPlayerOpal = PlayerOpal.NOT_YET_LOADED;
		myOldModeratorStaffOpal = StaffOpal.NOT_YET_LOADED;
		myOldRoomOpal = RoomOpal.NOT_YET_LOADED;
		myOldWinnerPerformanceOpal = PerformanceOpal.NOT_YET_LOADED;
		myOldLoserPerformanceOpal = PerformanceOpal.NOT_YET_LOADED;
		myOldRoundOpal = RoundOpal.NOT_YET_LOADED;
		myOldWinningCardOpal = CardOpal.NOT_YET_LOADED;
		myOldLosingCardOpal = CardOpal.NOT_YET_LOADED;
		return;
	}

	/* package */ static final String[] ourFieldNames = new String[] {
		"TournamentCode",
		"GameId",
		"RoundId",
		"RoomId",
		"WinningCardId",
		"LosingCardId",
		"ModeratorStaffId",
		"TossupsHeard",
		"IncomingWinningCardPlayerId",
		"IncomingLosingCardPlayerId",
		"WinnerPlayerId",
		"LoserPlayerId",
		"WinnerPerformanceId",
		"LoserPerformanceId",
		"WinnerScore",
		"LoserScore",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.String.class,
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.lang.Integer.class,
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
		null,
		null,
		null,
		null,
		null,
		null,
	};

	public static final GameVOpal NOT_YET_LOADED = new GameVOpal();

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


	public java.lang.String getTournamentCode() {
		return (java.lang.String) getValues()[0];
	}

	public java.lang.Integer getGameIdAsObject() {
		return (java.lang.Integer) getValues()[1];
	}

	public java.lang.Integer getRoundIdAsObject() {
		return (java.lang.Integer) getValues()[2];
	}

	public java.lang.Integer getRoomIdAsObject() {
		return (java.lang.Integer) getValues()[3];
	}

	public java.lang.Integer getWinningCardIdAsObject() {
		return (java.lang.Integer) getValues()[4];
	}

	public java.lang.Integer getLosingCardIdAsObject() {
		return (java.lang.Integer) getValues()[5];
	}

	public java.lang.Integer getModeratorStaffIdAsObject() {
		return (java.lang.Integer) getValues()[6];
	}

	public java.lang.Integer getTossupsHeardAsObject() {
		return (java.lang.Integer) getValues()[7];
	}

	public java.lang.Integer getIncomingWinningCardPlayerIdAsObject() {
		return (java.lang.Integer) getValues()[8];
	}

	public java.lang.Integer getIncomingLosingCardPlayerIdAsObject() {
		return (java.lang.Integer) getValues()[9];
	}

	public java.lang.Integer getWinnerPlayerIdAsObject() {
		return (java.lang.Integer) getValues()[10];
	}

	public java.lang.Integer getLoserPlayerIdAsObject() {
		return (java.lang.Integer) getValues()[11];
	}

	public java.lang.Integer getWinnerPerformanceIdAsObject() {
		return (java.lang.Integer) getValues()[12];
	}

	public java.lang.Integer getLoserPerformanceIdAsObject() {
		return (java.lang.Integer) getValues()[13];
	}

	public java.lang.Integer getWinnerScoreAsObject() {
		return (java.lang.Integer) getValues()[14];
	}

	public java.lang.Integer getLoserScoreAsObject() {
		return (java.lang.Integer) getValues()[15];
	}

	@Override
	protected /* synchronized */ void copyOldValuesToNewInternal() {
		myNewGameOpal = myOldGameOpal;
		myNewTournamentOpal = myOldTournamentOpal;
		myNewIncomingWinningCardPlayerOpal = myOldIncomingWinningCardPlayerOpal;
		myNewIncomingLosingCardPlayerOpal = myOldIncomingLosingCardPlayerOpal;
		myNewWinnerPlayerOpal = myOldWinnerPlayerOpal;
		myNewLoserPlayerOpal = myOldLoserPlayerOpal;
		myNewModeratorStaffOpal = myOldModeratorStaffOpal;
		myNewRoomOpal = myOldRoomOpal;
		myNewWinnerPerformanceOpal = myOldWinnerPerformanceOpal;
		myNewLoserPerformanceOpal = myOldLoserPerformanceOpal;
		myNewRoundOpal = myOldRoundOpal;
		myNewWinningCardOpal = myOldWinningCardOpal;
		myNewLosingCardOpal = myOldLosingCardOpal;
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		myOldGameOpal = myNewGameOpal;
		myOldTournamentOpal = myNewTournamentOpal;
		myOldIncomingWinningCardPlayerOpal = myNewIncomingWinningCardPlayerOpal;
		myOldIncomingLosingCardPlayerOpal = myNewIncomingLosingCardPlayerOpal;
		myOldWinnerPlayerOpal = myNewWinnerPlayerOpal;
		myOldLoserPlayerOpal = myNewLoserPlayerOpal;
		myOldModeratorStaffOpal = myNewModeratorStaffOpal;
		myOldRoomOpal = myNewRoomOpal;
		myOldWinnerPerformanceOpal = myNewWinnerPerformanceOpal;
		myOldLoserPerformanceOpal = myNewLoserPerformanceOpal;
		myOldRoundOpal = myNewRoundOpal;
		myOldWinningCardOpal = myNewWinningCardOpal;
		myOldLosingCardOpal = myNewLosingCardOpal;

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
	public synchronized void output(final java.io.PrintStream argOutput) {
		argOutput.println("TournamentCode = " + getTournamentCode());
		argOutput.println("GameId = " + getGameIdAsObject());
		argOutput.println("RoundId = " + getRoundIdAsObject());
		argOutput.println("RoomId = " + getRoomIdAsObject());
		argOutput.println("WinningCardId = " + getWinningCardIdAsObject());
		argOutput.println("LosingCardId = " + getLosingCardIdAsObject());
		argOutput.println("ModeratorStaffId = " + getModeratorStaffIdAsObject());
		argOutput.println("TossupsHeard = " + getTossupsHeardAsObject());
		argOutput.println("IncomingWinningCardPlayerId = " + getIncomingWinningCardPlayerIdAsObject());
		argOutput.println("IncomingLosingCardPlayerId = " + getIncomingLosingCardPlayerIdAsObject());
		argOutput.println("WinnerPlayerId = " + getWinnerPlayerIdAsObject());
		argOutput.println("LoserPlayerId = " + getLoserPlayerIdAsObject());
		argOutput.println("WinnerPerformanceId = " + getWinnerPerformanceIdAsObject());
		argOutput.println("LoserPerformanceId = " + getLoserPerformanceIdAsObject());
		argOutput.println("WinnerScore = " + getWinnerScoreAsObject());
		argOutput.println("LoserScore = " + getLoserScoreAsObject());
	}

	@Override
	public synchronized void output(final java.io.PrintWriter argOutput) {
		argOutput.println("TournamentCode = " + getTournamentCode());
		argOutput.println("GameId = " + getGameIdAsObject());
		argOutput.println("RoundId = " + getRoundIdAsObject());
		argOutput.println("RoomId = " + getRoomIdAsObject());
		argOutput.println("WinningCardId = " + getWinningCardIdAsObject());
		argOutput.println("LosingCardId = " + getLosingCardIdAsObject());
		argOutput.println("ModeratorStaffId = " + getModeratorStaffIdAsObject());
		argOutput.println("TossupsHeard = " + getTossupsHeardAsObject());
		argOutput.println("IncomingWinningCardPlayerId = " + getIncomingWinningCardPlayerIdAsObject());
		argOutput.println("IncomingLosingCardPlayerId = " + getIncomingLosingCardPlayerIdAsObject());
		argOutput.println("WinnerPlayerId = " + getWinnerPlayerIdAsObject());
		argOutput.println("LoserPlayerId = " + getLoserPlayerIdAsObject());
		argOutput.println("WinnerPerformanceId = " + getWinnerPerformanceIdAsObject());
		argOutput.println("LoserPerformanceId = " + getLoserPerformanceIdAsObject());
		argOutput.println("WinnerScore = " + getWinnerScoreAsObject());
		argOutput.println("LoserScore = " + getLoserScoreAsObject());
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

	private PlayerOpal myOldIncomingWinningCardPlayerOpal;
	private PlayerOpal myNewIncomingWinningCardPlayerOpal;

	protected PlayerOpal retrieveIncomingWinningCardPlayerOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[8] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getPlayerOpalFactory().forId(getIncomingWinningCardPlayerIdAsObject());
	}

	public synchronized PlayerOpal getIncomingWinningCardPlayerOpal() {
		PlayerOpal lclPlayerOpal;
		boolean lclAccess = tryAccess();
		lclPlayerOpal = lclAccess ? myNewIncomingWinningCardPlayerOpal : myOldIncomingWinningCardPlayerOpal;
		if (lclPlayerOpal == PlayerOpal.NOT_YET_LOADED) {
			lclPlayerOpal = retrieveIncomingWinningCardPlayerOpal(getValues());
			if (lclAccess) {
				myNewIncomingWinningCardPlayerOpal = lclPlayerOpal;
			} else {
				myOldIncomingWinningCardPlayerOpal = lclPlayerOpal;
			}
		}
		return lclPlayerOpal;
	}

	private PlayerOpal myOldIncomingLosingCardPlayerOpal;
	private PlayerOpal myNewIncomingLosingCardPlayerOpal;

	protected PlayerOpal retrieveIncomingLosingCardPlayerOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[9] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getPlayerOpalFactory().forId(getIncomingLosingCardPlayerIdAsObject());
	}

	public synchronized PlayerOpal getIncomingLosingCardPlayerOpal() {
		PlayerOpal lclPlayerOpal;
		boolean lclAccess = tryAccess();
		lclPlayerOpal = lclAccess ? myNewIncomingLosingCardPlayerOpal : myOldIncomingLosingCardPlayerOpal;
		if (lclPlayerOpal == PlayerOpal.NOT_YET_LOADED) {
			lclPlayerOpal = retrieveIncomingLosingCardPlayerOpal(getValues());
			if (lclAccess) {
				myNewIncomingLosingCardPlayerOpal = lclPlayerOpal;
			} else {
				myOldIncomingLosingCardPlayerOpal = lclPlayerOpal;
			}
		}
		return lclPlayerOpal;
	}

	private PlayerOpal myOldWinnerPlayerOpal;
	private PlayerOpal myNewWinnerPlayerOpal;

	protected PlayerOpal retrieveWinnerPlayerOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[10] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getPlayerOpalFactory().forId(getWinnerPlayerIdAsObject());
	}

	public synchronized PlayerOpal getWinnerPlayerOpal() {
		PlayerOpal lclPlayerOpal;
		boolean lclAccess = tryAccess();
		lclPlayerOpal = lclAccess ? myNewWinnerPlayerOpal : myOldWinnerPlayerOpal;
		if (lclPlayerOpal == PlayerOpal.NOT_YET_LOADED) {
			lclPlayerOpal = retrieveWinnerPlayerOpal(getValues());
			if (lclAccess) {
				myNewWinnerPlayerOpal = lclPlayerOpal;
			} else {
				myOldWinnerPlayerOpal = lclPlayerOpal;
			}
		}
		return lclPlayerOpal;
	}

	private PlayerOpal myOldLoserPlayerOpal;
	private PlayerOpal myNewLoserPlayerOpal;

	protected PlayerOpal retrieveLoserPlayerOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[11] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getPlayerOpalFactory().forId(getLoserPlayerIdAsObject());
	}

	public synchronized PlayerOpal getLoserPlayerOpal() {
		PlayerOpal lclPlayerOpal;
		boolean lclAccess = tryAccess();
		lclPlayerOpal = lclAccess ? myNewLoserPlayerOpal : myOldLoserPlayerOpal;
		if (lclPlayerOpal == PlayerOpal.NOT_YET_LOADED) {
			lclPlayerOpal = retrieveLoserPlayerOpal(getValues());
			if (lclAccess) {
				myNewLoserPlayerOpal = lclPlayerOpal;
			} else {
				myOldLoserPlayerOpal = lclPlayerOpal;
			}
		}
		return lclPlayerOpal;
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
			lclStaffOpal = retrieveModeratorStaffOpal(getValues());
			if (lclAccess) {
				myNewModeratorStaffOpal = lclStaffOpal;
			} else {
				myOldModeratorStaffOpal = lclStaffOpal;
			}
		}
		return lclStaffOpal;
	}

	private RoomOpal myOldRoomOpal;
	private RoomOpal myNewRoomOpal;

	protected RoomOpal retrieveRoomOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[3] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getRoomOpalFactory().forId(getRoomIdAsObject());
	}

	public synchronized RoomOpal getRoomOpal() {
		RoomOpal lclRoomOpal;
		boolean lclAccess = tryAccess();
		lclRoomOpal = lclAccess ? myNewRoomOpal : myOldRoomOpal;
		if (lclRoomOpal == RoomOpal.NOT_YET_LOADED) {
			lclRoomOpal = retrieveRoomOpal(getValues());
			if (lclAccess) {
				myNewRoomOpal = lclRoomOpal;
			} else {
				myOldRoomOpal = lclRoomOpal;
			}
		}
		return lclRoomOpal;
	}

	private PerformanceOpal myOldWinnerPerformanceOpal;
	private PerformanceOpal myNewWinnerPerformanceOpal;

	protected PerformanceOpal retrieveWinnerPerformanceOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[12] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getPerformanceOpalFactory().forId(getWinnerPerformanceIdAsObject());
	}

	public synchronized PerformanceOpal getWinnerPerformanceOpal() {
		PerformanceOpal lclPerformanceOpal;
		boolean lclAccess = tryAccess();
		lclPerformanceOpal = lclAccess ? myNewWinnerPerformanceOpal : myOldWinnerPerformanceOpal;
		if (lclPerformanceOpal == PerformanceOpal.NOT_YET_LOADED) {
			lclPerformanceOpal = retrieveWinnerPerformanceOpal(getValues());
			if (lclAccess) {
				myNewWinnerPerformanceOpal = lclPerformanceOpal;
			} else {
				myOldWinnerPerformanceOpal = lclPerformanceOpal;
			}
		}
		return lclPerformanceOpal;
	}

	private PerformanceOpal myOldLoserPerformanceOpal;
	private PerformanceOpal myNewLoserPerformanceOpal;

	protected PerformanceOpal retrieveLoserPerformanceOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[13] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getPerformanceOpalFactory().forId(getLoserPerformanceIdAsObject());
	}

	public synchronized PerformanceOpal getLoserPerformanceOpal() {
		PerformanceOpal lclPerformanceOpal;
		boolean lclAccess = tryAccess();
		lclPerformanceOpal = lclAccess ? myNewLoserPerformanceOpal : myOldLoserPerformanceOpal;
		if (lclPerformanceOpal == PerformanceOpal.NOT_YET_LOADED) {
			lclPerformanceOpal = retrieveLoserPerformanceOpal(getValues());
			if (lclAccess) {
				myNewLoserPerformanceOpal = lclPerformanceOpal;
			} else {
				myOldLoserPerformanceOpal = lclPerformanceOpal;
			}
		}
		return lclPerformanceOpal;
	}

	private RoundOpal myOldRoundOpal;
	private RoundOpal myNewRoundOpal;

	protected RoundOpal retrieveRoundOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[2] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getRoundOpalFactory().forId(getRoundIdAsObject());
	}

	public synchronized RoundOpal getRoundOpal() {
		RoundOpal lclRoundOpal;
		boolean lclAccess = tryAccess();
		lclRoundOpal = lclAccess ? myNewRoundOpal : myOldRoundOpal;
		if (lclRoundOpal == RoundOpal.NOT_YET_LOADED) {
			lclRoundOpal = retrieveRoundOpal(getValues());
			if (lclAccess) {
				myNewRoundOpal = lclRoundOpal;
			} else {
				myOldRoundOpal = lclRoundOpal;
			}
		}
		return lclRoundOpal;
	}

	private CardOpal myOldWinningCardOpal;
	private CardOpal myNewWinningCardOpal;

	protected CardOpal retrieveWinningCardOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[4] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getCardOpalFactory().forId(getWinningCardIdAsObject());
	}

	public synchronized CardOpal getWinningCardOpal() {
		CardOpal lclCardOpal;
		boolean lclAccess = tryAccess();
		lclCardOpal = lclAccess ? myNewWinningCardOpal : myOldWinningCardOpal;
		if (lclCardOpal == CardOpal.NOT_YET_LOADED) {
			lclCardOpal = retrieveWinningCardOpal(getValues());
			if (lclAccess) {
				myNewWinningCardOpal = lclCardOpal;
			} else {
				myOldWinningCardOpal = lclCardOpal;
			}
		}
		return lclCardOpal;
	}

	private CardOpal myOldLosingCardOpal;
	private CardOpal myNewLosingCardOpal;

	protected CardOpal retrieveLosingCardOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[5] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getCardOpalFactory().forId(getLosingCardIdAsObject());
	}

	public synchronized CardOpal getLosingCardOpal() {
		CardOpal lclCardOpal;
		boolean lclAccess = tryAccess();
		lclCardOpal = lclAccess ? myNewLosingCardOpal : myOldLosingCardOpal;
		if (lclCardOpal == CardOpal.NOT_YET_LOADED) {
			lclCardOpal = retrieveLosingCardOpal(getValues());
			if (lclAccess) {
				myNewLosingCardOpal = lclCardOpal;
			} else {
				myOldLosingCardOpal = lclCardOpal;
			}
		}
		return lclCardOpal;
	}

}
