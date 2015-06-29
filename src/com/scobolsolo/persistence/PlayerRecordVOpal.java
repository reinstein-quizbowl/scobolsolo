package com.scobolsolo.persistence;

import java.io.PrintWriter;
import java.io.PrintStream;

import com.opal.*;

import com.scobolsolo.application.*;

public final class PlayerRecordVOpal extends com.opal.EphemeralOpal<PlayerRecordV> {

	private PlayerRecordVOpal() {
		super();
		setUserFacing(null);
	}

	public PlayerRecordVOpal(OpalFactory<PlayerRecordV, PlayerRecordVOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void initializeReferences() {
		myOldTournamentOpal = TournamentOpal.NOT_YET_LOADED;
		myOldPlayerOpal = PlayerOpal.NOT_YET_LOADED;
		return;
	}

	/* package */ static final String[] ourFieldNames = new String[] {
		"TournamentCode",
		"PlayerId",
		"WinCount",
		"LossCount",
		"Points",
		"TossupsHeard",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.String.class,
		java.lang.Integer.class,
		java.lang.Long.class,
		java.lang.Long.class,
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
	};

	/* package */ static final FieldValidator[] ourFieldValidators = new FieldValidator[] {
		null,
		null,
		null,
		null,
		null,
		null,
	};

	public static final PlayerRecordVOpal NOT_YET_LOADED = new PlayerRecordVOpal();

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

	public java.lang.Long getWinCountAsObject() {
		return (java.lang.Long) getValues()[2];
	}

	public java.lang.Long getLossCountAsObject() {
		return (java.lang.Long) getValues()[3];
	}

	public java.lang.Integer getPointsAsObject() {
		return (java.lang.Integer) getValues()[4];
	}

	public java.lang.Integer getTossupsHeardAsObject() {
		return (java.lang.Integer) getValues()[5];
	}

	@Override
	protected /* synchronized */ void copyOldValuesToNewInternal() {
		myNewTournamentOpal = myOldTournamentOpal;
		myNewPlayerOpal = myOldPlayerOpal;
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		myOldTournamentOpal = myNewTournamentOpal;
		myOldPlayerOpal = myNewPlayerOpal;

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
		argPW.println("WinCount = " + getWinCountAsObject());
		argPW.println("LossCount = " + getLossCountAsObject());
		argPW.println("Points = " + getPointsAsObject());
		argPW.println("TossupsHeard = " + getTossupsHeardAsObject());
	}

	@Override
	public synchronized void output(final PrintStream argPS) {
		argPS.println("TournamentCode = " + getTournamentCode());
		argPS.println("PlayerId = " + getPlayerIdAsObject());
		argPS.println("WinCount = " + getWinCountAsObject());
		argPS.println("LossCount = " + getLossCountAsObject());
		argPS.println("Points = " + getPointsAsObject());
		argPS.println("TossupsHeard = " + getTossupsHeardAsObject());
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

}