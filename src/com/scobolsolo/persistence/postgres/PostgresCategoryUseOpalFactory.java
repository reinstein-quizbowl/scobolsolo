package com.scobolsolo.persistence.postgres;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.opal.*;
import com.scobolsolo.application.CategoryUse;
import com.scobolsolo.application.CategoryUseImpl;
import com.scobolsolo.persistence.CategoryUseOpal;
import com.scobolsolo.persistence.CategoryUseOpalFactory;

public class PostgresCategoryUseOpalFactory extends com.opal.AbstractDatabaseIdentityOpalFactory<CategoryUse, CategoryUseOpal> implements CategoryUseOpalFactory {
	private static final PostgresCategoryUseOpalFactory ourInstance = new PostgresCategoryUseOpalFactory();

	public static final PostgresCategoryUseOpalFactory getInstance() { return ourInstance; }

	protected PostgresCategoryUseOpalFactory() {
		super();
	}

	private static final String[] ourColumnNames = new String[] {
		"category_code", 
		"tournament_code", 
	};

	protected static String[] getStaticColumnNames() { return ourColumnNames; }

	@Override
	protected String[] getColumnNames() { return ourColumnNames; }

	private static final String[] ourPrimaryKeyWhereClauseColumns = new String[] {"category_code","tournament_code",};

	@Override
	protected String[] getFieldNames() { return CategoryUseOpal.getStaticFieldNames(); }

	@Override
	protected Class<?>[] getFieldTypes() { return CategoryUseOpal.getStaticFieldTypes(); }

	@Override
	protected boolean[] getFieldNullability() { return CategoryUseOpal.getStaticFieldNullability(); }

	@Override
	protected com.opal.FieldValidator[] getFieldValidators() { return CategoryUseOpal.getStaticFieldValidators(); }


	@Override
	protected javax.sql.DataSource getDataSource() {
		return PostgresOpalFactoryFactory.getSpecificInstance().getDataSource();
	}

	@Override
	protected CategoryUseOpal instantiate(Object[] argValues) {
		return new CategoryUseOpal(this, argValues);
	}

	@Override
	public CategoryUseOpal create(CategoryUse argUF) {
		assert argUF != null;
		CategoryUseOpal lclOpal;
		synchronized (lclOpal = instantiate((Object[]) null/*, argUF */)) {
			assert lclOpal.getUserFacing() == null;
			lclOpal.setUserFacing(argUF);
			lclOpal.newObject();
			newObject(lclOpal);
		}
		return lclOpal;
	}

	@Override
	public CategoryUseOpal create() {
		CategoryUseOpal lclOpal;
		synchronized (lclOpal = instantiate((Object[]) null)) {
			assert lclOpal.getUserFacing() == null;
			lclOpal.setUserFacing(new CategoryUseImpl(lclOpal));
			lclOpal.newObject();
			newObject(lclOpal);
		}
		return lclOpal;
	}

	@Override
	protected void determineUserFacing(CategoryUseOpal argO, boolean argConcrete) {
		assert argO != null;
		assert argConcrete == false;
		assert argO.getUserFacing() == null;
		argO.setUserFacing(new CategoryUseImpl(argO));
	}

	protected void newObject(@SuppressWarnings("unused") CategoryUseOpal argOpal) {
		return;
	}

	@Override
	protected String getFullyQualifiedTableName() {
		return "category_use";
	}

	@Override
	protected void registerNewOpal(CategoryUseOpal argOpal) {
		registerOpal(argOpal, argOpal.getNewValues());
	}

	@Override
	protected void registerOldOpal(CategoryUseOpal argOpal) {
		registerOpal(argOpal, argOpal.getOldValues());
	}

	protected void registerOpal(CategoryUseOpal argOpal, Object[] argValues) {
		if (argValues == null) { throw new IllegalStateException(); }
		if (argValues.length != 2) { throw new IllegalStateException(); }
		OpalCache lclOC = getOpalCache();
		synchronized (lclOC) {
			lclOC.addOpal(new CategoryCodeTournamentCodeOpalKey((java.lang.String) argValues[0], (java.lang.String) argValues[1]), argOpal, true);
		}
	}

	@Override
	protected void unregisterOpal(CategoryUseOpal argOpal) {
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 2) { throw new IllegalStateException(); }
		OpalCache lclOC = getOpalCache();
		synchronized (lclOC) {
			lclOC.removeOpal(new CategoryCodeTournamentCodeOpalKey((java.lang.String) lclOldValues[0], (java.lang.String) lclOldValues[1]));
		}
	}

	@Override
	public void updateKeys(CategoryUseOpal argOpal) {
		if (argOpal == null) { throw new IllegalArgumentException("argOpal is null"); }
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 2) { throw new IllegalStateException(); }
		Object[] lclNewValues = argOpal.getNewValues();
		if (lclNewValues == null) { throw new IllegalStateException(); }
		if (lclNewValues.length != 2) { throw new IllegalStateException(); }
		OpalCache lclOC = getOpalCache();
		synchronized (lclOC) {
			OpalKey<CategoryUseOpal> lclOldKey = null;
			OpalKey<CategoryUseOpal> lclNewKey = null;
			if (true) {
				if (!(lclNewValues[0].equals(lclOldValues[0]) && lclNewValues[1].equals(lclOldValues[1]))) {
					lclNewKey = new CategoryCodeTournamentCodeOpalKey((java.lang.String) lclNewValues[0], (java.lang.String) lclNewValues[1]);
					if (true) {
						lclOldKey = new CategoryCodeTournamentCodeOpalKey((java.lang.String) lclOldValues[0], (java.lang.String) lclOldValues[1]);
					}
				}
			}
			if (lclOldKey != null) { lclOC.removeOpal(lclOldKey); lclOldKey = null; }
			if (lclNewKey != null) { lclOC.addOpal(lclNewKey, argOpal, true); lclNewKey = null; } /* true = SoftReference */
		}
		return;
	}

	@Override
	protected String[] getPrimaryKeyWhereClauseColumns() {
		return ourPrimaryKeyWhereClauseColumns;
	}

	@Override
	protected OpalKey<CategoryUseOpal> createOpalKeyForReloading(CategoryUseOpal argOpal) {
		Object[] lclValues = argOpal.getNewValues();
		return new CategoryCodeTournamentCodeOpalKey((java.lang.String) lclValues[0], (java.lang.String) lclValues[1]);
	}

	@Override
	public com.siliconage.util.Fast3Set<CategoryUseOpal> forCategoryCodeCollection(java.lang.String argCategoryCode) /* throws PersistenceException */ {
		final Object[] lclParameters = new Object[] { argCategoryCode };
		final String[] lclFieldNames = new String[] { "category_code" };
		com.siliconage.util.Fast3Set<CategoryUseOpal> lclCollection = new com.siliconage.util.Fast3Set<>();
		load(getFullyQualifiedTableName(), lclFieldNames, lclParameters, null, lclCollection);
		return lclCollection;
	}

	@Override
	public java.util.HashSet<CategoryUseOpal> forTournamentCodeCollection(java.lang.String argTournamentCode) /* throws PersistenceException */ {
		final Object[] lclParameters = new Object[] { argTournamentCode };
		final String[] lclFieldNames = new String[] { "tournament_code" };
		java.util.HashSet<CategoryUseOpal> lclCollection = new java.util.HashSet<>();
		load(getFullyQualifiedTableName(), lclFieldNames, lclParameters, null, lclCollection);
		return lclCollection;
	}

	@Override
	public CategoryUseOpal forCategoryCodeTournamentCode(java.lang.String argCategoryCode, java.lang.String argTournamentCode) throws PersistenceException {
		OpalKey<CategoryUseOpal> lclOpalKey = new CategoryCodeTournamentCodeOpalKey(argCategoryCode, argTournamentCode);
		return forOpalKey(lclOpalKey);
	}

	@Override
	protected OpalKey<CategoryUseOpal> createOpalKeyForRow(ResultSet argRS) throws SQLException {
		return new CategoryCodeTournamentCodeOpalKey(
			OpalUtility.convertTo(java.lang.String.class, argRS.getObject("category_code")),
			OpalUtility.convertTo(java.lang.String.class, argRS.getObject("tournament_code"))
		);
	}

	/* package */ static class CategoryCodeTournamentCodeOpalKey extends com.opal.DatabaseOpalKey<CategoryUseOpal> {
		private static final String[] ourKeyColumnNames = new String[] {"category_code", "tournament_code", };

		public CategoryCodeTournamentCodeOpalKey(java.lang.String argCategoryCode, java.lang.String argTournamentCode) {
			super(new Object[] {argCategoryCode, argTournamentCode, });
		}

		@Override
		protected Object[] getParameters() { return getFields(); }

		@Override
		protected String[] getColumnNames() { return ourKeyColumnNames; }

	}

	@Override
	public CategoryUseOpal forUniqueString(String argUniqueString) {
		if (argUniqueString == null || "".equals(argUniqueString)) {
			return null;
		}
		String[] lclArgs = argUniqueString.split("\\|");
		assert lclArgs.length == 2;
		return forOpalKey(
			new CategoryCodeTournamentCodeOpalKey(
				lclArgs[0],
				lclArgs[1]
			)
		);
	}

}
