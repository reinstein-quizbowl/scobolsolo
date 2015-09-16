package com.scobolsolo.persistence;

import com.scobolsolo.application.*;

public final class PlayerCategoryPointVOpal extends com.opal.EphemeralOpal<PlayerCategoryPointV> {

	private PlayerCategoryPointVOpal() {
		super();
		setUserFacing(null);
	}

	public PlayerCategoryPointVOpal(com.opal.OpalFactory<PlayerCategoryPointV, PlayerCategoryPointVOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void initializeReferences() {
		myOldTournamentOpal = TournamentOpal.NOT_YET_LOADED;
		myOldPlayerOpal = PlayerOpal.NOT_YET_LOADED;
		myOldCategoryOpal = CategoryOpal.NOT_YET_LOADED;
		return;
	}

	/* package */ static final String[] ourFieldNames = new String[] {
		"TournamentCode",
		"PlayerId",
		"CategoryCode",
		"TossupsHeard",
		"Points",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.String.class,
		java.lang.Integer.class,
		java.lang.String.class,
		java.lang.Integer.class,
		java.lang.Integer.class,
	};

	/* package */ static final boolean[] ourFieldNullability = new boolean[] {
		false,
		true,
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

	public static final PlayerCategoryPointVOpal NOT_YET_LOADED = new PlayerCategoryPointVOpal();

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

	public java.lang.Integer getPlayerIdAsObject() {
		return (java.lang.Integer) getValues()[1];
	}

	public java.lang.String getCategoryCode() {
		return (java.lang.String) getValues()[2];
	}

	public java.lang.Integer getTossupsHeardAsObject() {
		return (java.lang.Integer) getValues()[3];
	}

	public java.lang.Integer getPointsAsObject() {
		return (java.lang.Integer) getValues()[4];
	}

	@Override
	protected /* synchronized */ void copyOldValuesToNewInternal() {
		myNewTournamentOpal = myOldTournamentOpal;
		myNewPlayerOpal = myOldPlayerOpal;
		myNewCategoryOpal = myOldCategoryOpal;
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		myOldTournamentOpal = myNewTournamentOpal;
		myOldPlayerOpal = myNewPlayerOpal;
		myOldCategoryOpal = myNewCategoryOpal;

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
		argOutput.println("PlayerId = " + getPlayerIdAsObject());
		argOutput.println("CategoryCode = " + getCategoryCode());
		argOutput.println("TossupsHeard = " + getTossupsHeardAsObject());
		argOutput.println("Points = " + getPointsAsObject());
	}

	@Override
	public synchronized void output(final java.io.PrintWriter argOutput) {
		argOutput.println("TournamentCode = " + getTournamentCode());
		argOutput.println("PlayerId = " + getPlayerIdAsObject());
		argOutput.println("CategoryCode = " + getCategoryCode());
		argOutput.println("TossupsHeard = " + getTossupsHeardAsObject());
		argOutput.println("Points = " + getPointsAsObject());
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

	private CategoryOpal myOldCategoryOpal;
	private CategoryOpal myNewCategoryOpal;

	protected CategoryOpal retrieveCategoryOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[2] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getCategoryOpalFactory().forCode(getCategoryCode());
	}

	public synchronized CategoryOpal getCategoryOpal() {
		CategoryOpal lclCategoryOpal;
		boolean lclAccess = tryAccess();
		lclCategoryOpal = lclAccess ? myNewCategoryOpal : myOldCategoryOpal;
		if (lclCategoryOpal == CategoryOpal.NOT_YET_LOADED) {
			lclCategoryOpal = retrieveCategoryOpal(getValues());
			if (lclAccess) {
				myNewCategoryOpal = lclCategoryOpal;
			} else {
				myOldCategoryOpal = lclCategoryOpal;
			}
		}
		return lclCategoryOpal;
	}

}
