package com.scobolsolo.persistence;

import com.scobolsolo.application.PlacementConversionV;

public final class PlacementConversionVOpal extends com.opal.EphemeralOpal<PlacementConversionV> {


	private PlacementConversionVOpal() {
		super();
		setUserFacing(null);
	}

	public PlacementConversionVOpal(com.opal.OpalFactory<PlacementConversionV, PlacementConversionVOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void initializeReferences() {
		myOldResponseTypeOpal = ResponseTypeOpal.NOT_YET_LOADED;
		myOldTournamentOpal = TournamentOpal.NOT_YET_LOADED;
		myOldQuestionOpal = QuestionOpal.NOT_YET_LOADED;
		myOldPlacementOpal = PlacementOpal.NOT_YET_LOADED;
		return;
	}

	/* package */ static final String[] ourFieldNames = new String[] {
		"TournamentCode",
		"PlacementId",
		"QuestionId",
		"ResponseTypeCode",
		"ResponseTypeCount",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.String.class,
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.lang.String.class,
		java.lang.Integer.class,
	};

	/* package */ static final boolean[] ourFieldNullability = new boolean[] {
		false,
		true,
		true,
		false,
		true,
	};

	/* package */ static final com.opal.FieldValidator[] ourFieldValidators = new com.opal.FieldValidator[] {
		null,
		null,
		null,
		null,
		null,
	};

	public static final PlacementConversionVOpal NOT_YET_LOADED = new PlacementConversionVOpal();

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

	public java.lang.Integer getPlacementIdAsObject() {
		return (java.lang.Integer) getValues()[1];
	}

	public java.lang.Integer getQuestionIdAsObject() {
		return (java.lang.Integer) getValues()[2];
	}

	public java.lang.String getResponseTypeCode() {
		return (java.lang.String) getValues()[3];
	}

	public java.lang.Integer getResponseTypeCountAsObject() {
		return (java.lang.Integer) getValues()[4];
	}

	@Override
	protected /* synchronized */ void copyOldValuesToNewInternal() {
		myNewResponseTypeOpal = myOldResponseTypeOpal;
		myNewTournamentOpal = myOldTournamentOpal;
		myNewQuestionOpal = myOldQuestionOpal;
		myNewPlacementOpal = myOldPlacementOpal;
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		myOldResponseTypeOpal = myNewResponseTypeOpal;
		myOldTournamentOpal = myNewTournamentOpal;
		myOldQuestionOpal = myNewQuestionOpal;
		myOldPlacementOpal = myNewPlacementOpal;

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
		argOutput.println("PlacementId = " + getPlacementIdAsObject());
		argOutput.println("QuestionId = " + getQuestionIdAsObject());
		argOutput.println("ResponseTypeCode = " + getResponseTypeCode());
		argOutput.println("ResponseTypeCount = " + getResponseTypeCountAsObject());
	}

	@Override
	public synchronized void output(final java.io.PrintWriter argOutput) {
		argOutput.println("TournamentCode = " + getTournamentCode());
		argOutput.println("PlacementId = " + getPlacementIdAsObject());
		argOutput.println("QuestionId = " + getQuestionIdAsObject());
		argOutput.println("ResponseTypeCode = " + getResponseTypeCode());
		argOutput.println("ResponseTypeCount = " + getResponseTypeCountAsObject());
	}

	private ResponseTypeOpal myOldResponseTypeOpal;
	private ResponseTypeOpal myNewResponseTypeOpal;

	protected ResponseTypeOpal retrieveResponseTypeOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[3] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getResponseTypeOpalFactory().forCode(getResponseTypeCode());
	}

	public synchronized ResponseTypeOpal getResponseTypeOpal() {
		ResponseTypeOpal lclResponseTypeOpal;
		boolean lclAccess = tryAccess();
		lclResponseTypeOpal = lclAccess ? myNewResponseTypeOpal : myOldResponseTypeOpal;
		if (lclResponseTypeOpal == ResponseTypeOpal.NOT_YET_LOADED) {
			lclResponseTypeOpal = retrieveResponseTypeOpal(getValues());
			if (lclAccess) {
				myNewResponseTypeOpal = lclResponseTypeOpal;
			} else {
				myOldResponseTypeOpal = lclResponseTypeOpal;
			}
		}
		return lclResponseTypeOpal;
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

	private QuestionOpal myOldQuestionOpal;
	private QuestionOpal myNewQuestionOpal;

	protected QuestionOpal retrieveQuestionOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[2] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getQuestionOpalFactory().forId(getQuestionIdAsObject());
	}

	public synchronized QuestionOpal getQuestionOpal() {
		QuestionOpal lclQuestionOpal;
		boolean lclAccess = tryAccess();
		lclQuestionOpal = lclAccess ? myNewQuestionOpal : myOldQuestionOpal;
		if (lclQuestionOpal == QuestionOpal.NOT_YET_LOADED) {
			lclQuestionOpal = retrieveQuestionOpal(getValues());
			if (lclAccess) {
				myNewQuestionOpal = lclQuestionOpal;
			} else {
				myOldQuestionOpal = lclQuestionOpal;
			}
		}
		return lclQuestionOpal;
	}

	private PlacementOpal myOldPlacementOpal;
	private PlacementOpal myNewPlacementOpal;

	protected PlacementOpal retrievePlacementOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[1] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getPlacementOpalFactory().forId(getPlacementIdAsObject());
	}

	public synchronized PlacementOpal getPlacementOpal() {
		PlacementOpal lclPlacementOpal;
		boolean lclAccess = tryAccess();
		lclPlacementOpal = lclAccess ? myNewPlacementOpal : myOldPlacementOpal;
		if (lclPlacementOpal == PlacementOpal.NOT_YET_LOADED) {
			lclPlacementOpal = retrievePlacementOpal(getValues());
			if (lclAccess) {
				myNewPlacementOpal = lclPlacementOpal;
			} else {
				myOldPlacementOpal = lclPlacementOpal;
			}
		}
		return lclPlacementOpal;
	}

}
