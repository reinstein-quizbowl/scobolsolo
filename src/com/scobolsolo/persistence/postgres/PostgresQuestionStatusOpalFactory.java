package com.scobolsolo.persistence.postgres;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.opal.OpalCache;
import com.opal.OpalKey;
import com.opal.OpalUtility;
import com.opal.PersistenceException;

import com.scobolsolo.application.QuestionStatus;
import com.scobolsolo.persistence.QuestionStatusImpl;
import com.scobolsolo.persistence.QuestionStatusOpal;
import com.scobolsolo.persistence.QuestionStatusOpalFactory;

public class PostgresQuestionStatusOpalFactory extends com.opal.AbstractDatabaseIdentityOpalFactory<QuestionStatus, QuestionStatusOpal> implements QuestionStatusOpalFactory {
	private static final PostgresQuestionStatusOpalFactory ourInstance = new PostgresQuestionStatusOpalFactory();

	public static final PostgresQuestionStatusOpalFactory getInstance() { return ourInstance; }

	protected PostgresQuestionStatusOpalFactory() {
		super();
	}

	private static final String[] ourColumnNames = new String[] {
		"code", 
		"name", 
		"short_name", 
		"sequence", 
	};

	protected static String[] getStaticColumnNames() { return ourColumnNames; }

	@Override
	protected String[] getColumnNames() { return ourColumnNames; }

	private static final String[] ourPrimaryKeyWhereClauseColumns = new String[] {"code",};

	@Override
	protected String[] getFieldNames() { return QuestionStatusOpal.getStaticFieldNames(); }

	@Override
	protected Class<?>[] getFieldTypes() { return QuestionStatusOpal.getStaticFieldTypes(); }

	@Override
	protected boolean[] getFieldNullability() { return QuestionStatusOpal.getStaticFieldNullability(); }

	@Override
	protected com.opal.FieldValidator[] getFieldValidators() { return QuestionStatusOpal.getStaticFieldValidators(); }

	@Override
	protected javax.sql.DataSource getDataSource() {
		return PostgresOpalFactoryFactory.getSpecificInstance().getDataSource();
	}

	@Override
	protected QuestionStatusOpal instantiate(Object[] argValues) {
		return new QuestionStatusOpal(this, argValues);
	}

	@Override
	public QuestionStatusOpal create() {
		QuestionStatusOpal lclOpal;
		synchronized (lclOpal = instantiate((Object[]) null)) {
			assert lclOpal.getUserFacing() == null;
			lclOpal.setUserFacing(new QuestionStatusImpl(lclOpal));
			lclOpal.newObject();
			newObject(lclOpal);
		}
		return lclOpal;
	}

	@Override
	protected void determineUserFacing(QuestionStatusOpal argO, boolean argConcrete) {
		assert argO != null;
		assert argConcrete == false;
		assert argO.getUserFacing() == null;
		argO.setUserFacing(new QuestionStatusImpl(argO));
	}

	protected void newObject(@SuppressWarnings("unused") QuestionStatusOpal argOpal) {
		return;
	}

	@Override
	protected String getFullyQualifiedTableName() {
		return "question_status";
	}

	@Override
	protected void registerNewOpal(QuestionStatusOpal argOpal) {
		registerOpal(argOpal, argOpal.getNewValues());
	}

	@Override
	protected void registerOldOpal(QuestionStatusOpal argOpal) {
		registerOpal(argOpal, argOpal.getOldValues());
	}

	protected void registerOpal(QuestionStatusOpal argOpal, Object[] argValues) {
		if (argValues == null) { throw new IllegalStateException(); }
		if (argValues.length != 4) { throw new IllegalStateException(); }
		OpalCache<QuestionStatusOpal> lclOC = getCache();
		synchronized (lclOC) {
			lclOC.addOpal(new NameOpalKey((java.lang.String) argValues[1]), argOpal, true);
			lclOC.addOpal(new CodeOpalKey((java.lang.String) argValues[0]), argOpal, true);
			lclOC.addOpal(new ShortNameOpalKey((java.lang.String) argValues[2]), argOpal, true);
		}
	}

	@Override
	protected void unregisterOpal(QuestionStatusOpal argOpal) {
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 4) { throw new IllegalStateException(); }
		OpalCache<QuestionStatusOpal> lclOC = getCache();
		synchronized (lclOC) {
			lclOC.removeOpal(new NameOpalKey((java.lang.String) lclOldValues[1]));
			lclOC.removeOpal(new CodeOpalKey((java.lang.String) lclOldValues[0]));
			lclOC.removeOpal(new ShortNameOpalKey((java.lang.String) lclOldValues[2]));
		}
	}

	@Override
	public void updateKeys(QuestionStatusOpal argOpal) {
		org.apache.commons.lang3.Validate.notNull(argOpal);
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 4) { throw new IllegalStateException(); }
		Object[] lclNewValues = argOpal.getNewValues();
		if (lclNewValues == null) { throw new IllegalStateException(); }
		if (lclNewValues.length != 4) { throw new IllegalStateException(); }
		OpalCache<QuestionStatusOpal> lclOC = getCache();
		synchronized (lclOC) {
			OpalKey<QuestionStatusOpal> lclOldKey = null;
			OpalKey<QuestionStatusOpal> lclNewKey = null;
				if (!(lclNewValues[1].equals(lclOldValues[1]))) {
					lclNewKey = new NameOpalKey((java.lang.String) lclNewValues[1]);
						lclOldKey = new NameOpalKey((java.lang.String) lclOldValues[1]);
				}
			if (lclOldKey != null) { lclOC.removeOpal(lclOldKey); lclOldKey = null; }
			if (lclNewKey != null) { lclOC.addOpal(lclNewKey, argOpal, true); lclNewKey = null; } /* true = SoftReference */
				if (!(lclNewValues[0].equals(lclOldValues[0]))) {
					lclNewKey = new CodeOpalKey((java.lang.String) lclNewValues[0]);
						lclOldKey = new CodeOpalKey((java.lang.String) lclOldValues[0]);
				}
			if (lclOldKey != null) { lclOC.removeOpal(lclOldKey); lclOldKey = null; }
			if (lclNewKey != null) { lclOC.addOpal(lclNewKey, argOpal, true); lclNewKey = null; } /* true = SoftReference */
				if (!(lclNewValues[2].equals(lclOldValues[2]))) {
					lclNewKey = new ShortNameOpalKey((java.lang.String) lclNewValues[2]);
						lclOldKey = new ShortNameOpalKey((java.lang.String) lclOldValues[2]);
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
	protected OpalKey<QuestionStatusOpal> createOpalKeyForReloading(QuestionStatusOpal argOpal) {
		Object[] lclValues = argOpal.getNewValues();
		return new CodeOpalKey((java.lang.String) lclValues[0]);
	}

	@Override
	public QuestionStatusOpal forName(java.lang.String argName) throws PersistenceException {
		OpalKey<QuestionStatusOpal> lclOpalKey = new NameOpalKey(argName);
		return forOpalKey(lclOpalKey);
	}

	@Override
	public QuestionStatusOpal forCode(java.lang.String argCode) throws PersistenceException {
		OpalKey<QuestionStatusOpal> lclOpalKey = new CodeOpalKey(argCode);
		return forOpalKey(lclOpalKey);
	}

	@Override
	public QuestionStatusOpal forShortName(java.lang.String argShortName) throws PersistenceException {
		OpalKey<QuestionStatusOpal> lclOpalKey = new ShortNameOpalKey(argShortName);
		return forOpalKey(lclOpalKey);
	}

	@Override
	protected OpalKey<QuestionStatusOpal> createOpalKeyForRow(ResultSet argRS) throws SQLException {
		return new CodeOpalKey(
			OpalUtility.convertTo(java.lang.String.class, argRS.getObject("code"))
		);
	}

	/* package */ static class NameOpalKey extends com.opal.SingleValueDatabaseOpalKey<QuestionStatusOpal> {
		private static final String[] ourKeyColumnNames = new String[] {"name", };

		public NameOpalKey(java.lang.String argName) {
			super(argName);
		}

		@Override
		public Object[] getParameters() {
			return new Object[] { getKeyValue(), };
		}

		@Override
		public String[] getColumnNames() { return ourKeyColumnNames; }

	}

	/* package */ static class CodeOpalKey extends com.opal.SingleValueDatabaseOpalKey<QuestionStatusOpal> {
		private static final String[] ourKeyColumnNames = new String[] {"code", };

		public CodeOpalKey(java.lang.String argCode) {
			super(argCode);
		}

		@Override
		public Object[] getParameters() {
			return new Object[] { getKeyValue(), };
		}

		@Override
		public String[] getColumnNames() { return ourKeyColumnNames; }

	}

	/* package */ static class ShortNameOpalKey extends com.opal.SingleValueDatabaseOpalKey<QuestionStatusOpal> {
		private static final String[] ourKeyColumnNames = new String[] {"short_name", };

		public ShortNameOpalKey(java.lang.String argShortName) {
			super(argShortName);
		}

		@Override
		public Object[] getParameters() {
			return new Object[] { getKeyValue(), };
		}

		@Override
		public String[] getColumnNames() { return ourKeyColumnNames; }

	}

	@Override
	public QuestionStatusOpal forUniqueString(String argUniqueString) {
		if (argUniqueString == null || "".equals(argUniqueString)) {
			return null;
		}
		String[] lclArgs = argUniqueString.split("\\|");
		assert lclArgs.length == 1;
		return forOpalKey(
			new CodeOpalKey(
				lclArgs[0]
			)
		);
	}

}
