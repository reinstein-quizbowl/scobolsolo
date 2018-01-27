package com.scobolsolo.persistence.postgres;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.opal.OpalCache;
import com.opal.OpalKey;
import com.opal.OpalUtility;
import com.opal.PersistenceException;

import com.scobolsolo.application.PronunciationGuideSuppression;
import com.scobolsolo.persistence.PronunciationGuideSuppressionImpl;
import com.scobolsolo.persistence.PronunciationGuideSuppressionOpal;
import com.scobolsolo.persistence.PronunciationGuideSuppressionOpalFactory;

public class PostgresPronunciationGuideSuppressionOpalFactory extends com.opal.AbstractDatabaseIdentityOpalFactory<PronunciationGuideSuppression, PronunciationGuideSuppressionOpal> implements PronunciationGuideSuppressionOpalFactory {
	private static final PostgresPronunciationGuideSuppressionOpalFactory ourInstance = new PostgresPronunciationGuideSuppressionOpalFactory();

	public static final PostgresPronunciationGuideSuppressionOpalFactory getInstance() { return ourInstance; }

	protected PostgresPronunciationGuideSuppressionOpalFactory() {
		super();
	}

	private static final String[] ourColumnNames = new String[] {
		"id", 
		"account_id", 
		"category_code", 
	};

	protected static String[] getStaticColumnNames() { return ourColumnNames; }

	@Override
	protected String[] getColumnNames() { return ourColumnNames; }

	private static final String[] ourPrimaryKeyWhereClauseColumns = new String[] {"id",};

	@Override
	protected String[] getFieldNames() { return PronunciationGuideSuppressionOpal.getStaticFieldNames(); }

	@Override
	protected Class<?>[] getFieldTypes() { return PronunciationGuideSuppressionOpal.getStaticFieldTypes(); }

	@Override
	protected boolean[] getFieldNullability() { return PronunciationGuideSuppressionOpal.getStaticFieldNullability(); }

	@Override
	protected com.opal.FieldValidator[] getFieldValidators() { return PronunciationGuideSuppressionOpal.getStaticFieldValidators(); }

	@Override
	protected javax.sql.DataSource getDataSource() {
		return PostgresOpalFactoryFactory.getSpecificInstance().getDataSource();
	}

	@Override
	protected PronunciationGuideSuppressionOpal instantiate(Object[] argValues) {
		return new PronunciationGuideSuppressionOpal(this, argValues);
	}

	@Override
	public PronunciationGuideSuppressionOpal create() {
		PronunciationGuideSuppressionOpal lclOpal;
		synchronized (lclOpal = instantiate((Object[]) null)) {
			assert lclOpal.getUserFacing() == null;
			lclOpal.setUserFacing(new PronunciationGuideSuppressionImpl(lclOpal));
			lclOpal.newObject();
			newObject(lclOpal);
		}
		return lclOpal;
	}

	@Override
	protected void determineUserFacing(PronunciationGuideSuppressionOpal argO, boolean argConcrete) {
		assert argO != null;
		assert argConcrete == false;
		assert argO.getUserFacing() == null;
		argO.setUserFacing(new PronunciationGuideSuppressionImpl(argO));
	}

	@Override
	public boolean hasGeneratedKeys() {
		return true;
	}

	@Override
	protected void processGeneratedKeys(java.sql.ResultSet argRS, PronunciationGuideSuppressionOpal argOpal) {
		try {
			argOpal.setId(argRS.getInt("id"));
		} catch (SQLException lclE) {
			throw new PersistenceException("Could not process generated keys.");
		}
	}

	protected void newObject(@SuppressWarnings("unused") PronunciationGuideSuppressionOpal argOpal) {
		return;
	}

	@Override
	protected String getFullyQualifiedTableName() {
		return "pronunciation_guide_suppression";
	}

	@Override
	protected void registerNewOpal(PronunciationGuideSuppressionOpal argOpal) {
		registerOpal(argOpal, argOpal.getNewValues());
	}

	@Override
	protected void registerOldOpal(PronunciationGuideSuppressionOpal argOpal) {
		registerOpal(argOpal, argOpal.getOldValues());
	}

	protected void registerOpal(PronunciationGuideSuppressionOpal argOpal, Object[] argValues) {
		if (argValues == null) { throw new IllegalStateException(); }
		if (argValues.length != 3) { throw new IllegalStateException(); }
		OpalCache<PronunciationGuideSuppressionOpal> lclOC = getCache();
		synchronized (lclOC) {
			lclOC.addOpal(new AccountIdCategoryCodeOpalKey((java.lang.Integer) argValues[1], (java.lang.String) argValues[2]), argOpal, true);
			lclOC.addOpal(new IdOpalKey((java.lang.Integer) argValues[0]), argOpal, true);
		}
	}

	@Override
	protected void unregisterOpal(PronunciationGuideSuppressionOpal argOpal) {
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 3) { throw new IllegalStateException(); }
		OpalCache<PronunciationGuideSuppressionOpal> lclOC = getCache();
		synchronized (lclOC) {
			lclOC.removeOpal(new AccountIdCategoryCodeOpalKey((java.lang.Integer) lclOldValues[1], (java.lang.String) lclOldValues[2]));
			lclOC.removeOpal(new IdOpalKey((java.lang.Integer) lclOldValues[0]));
		}
	}

	@Override
	public void updateKeys(PronunciationGuideSuppressionOpal argOpal) {
		org.apache.commons.lang3.Validate.notNull(argOpal);
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 3) { throw new IllegalStateException(); }
		Object[] lclNewValues = argOpal.getNewValues();
		if (lclNewValues == null) { throw new IllegalStateException(); }
		if (lclNewValues.length != 3) { throw new IllegalStateException(); }
		OpalCache<PronunciationGuideSuppressionOpal> lclOC = getCache();
		synchronized (lclOC) {
			OpalKey<PronunciationGuideSuppressionOpal> lclOldKey = null;
			OpalKey<PronunciationGuideSuppressionOpal> lclNewKey = null;
				if (!(lclNewValues[1].equals(lclOldValues[1]) && lclNewValues[2].equals(lclOldValues[2]))) {
					lclNewKey = new AccountIdCategoryCodeOpalKey((java.lang.Integer) lclNewValues[1], (java.lang.String) lclNewValues[2]);
						lclOldKey = new AccountIdCategoryCodeOpalKey((java.lang.Integer) lclOldValues[1], (java.lang.String) lclOldValues[2]);
				}
			if (lclOldKey != null) { lclOC.removeOpal(lclOldKey); lclOldKey = null; }
			if (lclNewKey != null) { lclOC.addOpal(lclNewKey, argOpal, true); lclNewKey = null; } /* true = SoftReference */
				if (!(lclNewValues[0].equals(lclOldValues[0]))) {
					lclNewKey = new IdOpalKey((java.lang.Integer) lclNewValues[0]);
						lclOldKey = new IdOpalKey((java.lang.Integer) lclOldValues[0]);
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
	protected OpalKey<PronunciationGuideSuppressionOpal> createOpalKeyForReloading(PronunciationGuideSuppressionOpal argOpal) {
		Object[] lclValues = argOpal.getNewValues();
		return new IdOpalKey((java.lang.Integer) lclValues[0]);
	}

	@Override
	public java.util.HashSet<PronunciationGuideSuppressionOpal> forAccountIdCollection(java.lang.Integer argAccountId) /* throws PersistenceException */ {
		final Object[] lclParameters = new Object[] { argAccountId };
		final String[] lclFieldNames = new String[] { "account_id" };
		java.util.HashSet<PronunciationGuideSuppressionOpal> lclCollection = new java.util.HashSet<>();
		load(getFullyQualifiedTableName(), lclFieldNames, lclParameters, null, lclCollection);
		return lclCollection;
	}

	@Override
	public java.util.HashSet<PronunciationGuideSuppressionOpal> forCategoryCodeCollection(java.lang.String argCategoryCode) /* throws PersistenceException */ {
		final Object[] lclParameters = new Object[] { argCategoryCode };
		final String[] lclFieldNames = new String[] { "category_code" };
		java.util.HashSet<PronunciationGuideSuppressionOpal> lclCollection = new java.util.HashSet<>();
		load(getFullyQualifiedTableName(), lclFieldNames, lclParameters, null, lclCollection);
		return lclCollection;
	}

	@Override
	public PronunciationGuideSuppressionOpal forAccountIdCategoryCode(java.lang.Integer argAccountId, java.lang.String argCategoryCode) throws PersistenceException {
		OpalKey<PronunciationGuideSuppressionOpal> lclOpalKey = new AccountIdCategoryCodeOpalKey(argAccountId, argCategoryCode);
		return forOpalKey(lclOpalKey);
	}

	@Override
	public PronunciationGuideSuppressionOpal forId(java.lang.Integer argId) throws PersistenceException {
		OpalKey<PronunciationGuideSuppressionOpal> lclOpalKey = new IdOpalKey(argId);
		return forOpalKey(lclOpalKey);
	}

	@Override
	protected OpalKey<PronunciationGuideSuppressionOpal> createOpalKeyForRow(ResultSet argRS) throws SQLException {
		return new IdOpalKey(
			OpalUtility.convertTo(java.lang.Integer.class, argRS.getObject("id"))
		);
	}

	/* package */ static class AccountIdCategoryCodeOpalKey extends com.opal.MultipleValueDatabaseOpalKey<PronunciationGuideSuppressionOpal> {
		private static final String[] ourKeyColumnNames = new String[] {"account_id", "category_code", };

		public AccountIdCategoryCodeOpalKey(java.lang.Integer argAccountId, java.lang.String argCategoryCode) {
			super(new Object[] {argAccountId, argCategoryCode, });
		}

		@Override
		public Object[] getParameters() {
			return getFields();
		}

		@Override
		public String[] getColumnNames() { return ourKeyColumnNames; }

	}

	/* package */ static class IdOpalKey extends com.opal.SingleValueDatabaseOpalKey<PronunciationGuideSuppressionOpal> {
		private static final String[] ourKeyColumnNames = new String[] {"id", };

		public IdOpalKey(java.lang.Integer argId) {
			super(argId);
		}

		@Override
		public Object[] getParameters() {
			return new Object[] { getKeyValue(), };
		}

		@Override
		public String[] getColumnNames() { return ourKeyColumnNames; }

	}

	@Override
	public PronunciationGuideSuppressionOpal forUniqueString(String argUniqueString) {
		if (argUniqueString == null || "".equals(argUniqueString)) {
			return null;
		}
		String[] lclArgs = argUniqueString.split("\\|");
		assert lclArgs.length == 1;
		return forOpalKey(
			new IdOpalKey(
				java.lang.Integer.valueOf(lclArgs[0])
			)
		);
	}

}
