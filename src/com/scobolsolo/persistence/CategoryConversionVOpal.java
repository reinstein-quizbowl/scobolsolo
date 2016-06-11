package com.scobolsolo.persistence;

import com.scobolsolo.application.CategoryConversionV;

public final class CategoryConversionVOpal extends com.opal.EphemeralOpal<CategoryConversionV> {


	private CategoryConversionVOpal() {
		super();
		setUserFacing(null);
	}

	public CategoryConversionVOpal(com.opal.OpalFactory<CategoryConversionV, CategoryConversionVOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void initializeReferences() {
		myOldCategoryOpal = CategoryOpal.NOT_YET_LOADED;
		myOldResponseTypeOpal = ResponseTypeOpal.NOT_YET_LOADED;
		myOldTournamentOpal = TournamentOpal.NOT_YET_LOADED;
		return;
	}

	/* package */ static final String[] ourFieldNames = new String[] {
		"TournamentCode",
		"CategoryCode",
		"ResponseTypeCode",
		"ResponseTypeCount",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.String.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.Integer.class,
	};

	/* package */ static final boolean[] ourFieldNullability = new boolean[] {
		false,
		false,
		false,
		true,
	};

	/* package */ static final com.opal.FieldValidator[] ourFieldValidators = new com.opal.FieldValidator[] {
		null,
		null,
		null,
		null,
	};

	public static final CategoryConversionVOpal NOT_YET_LOADED = new CategoryConversionVOpal();

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

	public java.lang.String getCategoryCode() {
		return (java.lang.String) getValues()[1];
	}

	public java.lang.String getResponseTypeCode() {
		return (java.lang.String) getValues()[2];
	}

	public java.lang.Integer getResponseTypeCountAsObject() {
		return (java.lang.Integer) getValues()[3];
	}

	@Override
	protected /* synchronized */ void copyOldValuesToNewInternal() {
		myNewCategoryOpal = myOldCategoryOpal;
		myNewResponseTypeOpal = myOldResponseTypeOpal;
		myNewTournamentOpal = myOldTournamentOpal;
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		myOldCategoryOpal = myNewCategoryOpal;
		myOldResponseTypeOpal = myNewResponseTypeOpal;
		myOldTournamentOpal = myNewTournamentOpal;

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
		argOutput.println("CategoryCode = " + getCategoryCode());
		argOutput.println("ResponseTypeCode = " + getResponseTypeCode());
		argOutput.println("ResponseTypeCount = " + getResponseTypeCountAsObject());
	}

	@Override
	public synchronized void output(final java.io.PrintWriter argOutput) {
		argOutput.println("TournamentCode = " + getTournamentCode());
		argOutput.println("CategoryCode = " + getCategoryCode());
		argOutput.println("ResponseTypeCode = " + getResponseTypeCode());
		argOutput.println("ResponseTypeCount = " + getResponseTypeCountAsObject());
	}

	private CategoryOpal myOldCategoryOpal;
	private CategoryOpal myNewCategoryOpal;

	protected CategoryOpal retrieveCategoryOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[1] == null)) {
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

	private ResponseTypeOpal myOldResponseTypeOpal;
	private ResponseTypeOpal myNewResponseTypeOpal;

	protected ResponseTypeOpal retrieveResponseTypeOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[2] == null)) {
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

}
