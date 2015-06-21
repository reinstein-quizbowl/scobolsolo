package com.scobolsolo.persistence.postgres;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.opal.*;
import com.scobolsolo.application.SchoolYear;
import com.scobolsolo.application.SchoolYearImpl;
import com.scobolsolo.persistence.SchoolYearOpal;
import com.scobolsolo.persistence.SchoolYearOpalFactory;

public class PostgresSchoolYearOpalFactory extends com.opal.AbstractDatabaseIdentityOpalFactory<SchoolYear, SchoolYearOpal> implements SchoolYearOpalFactory {
	private static final PostgresSchoolYearOpalFactory ourInstance = new PostgresSchoolYearOpalFactory();

	public static final PostgresSchoolYearOpalFactory getInstance() { return ourInstance; }

	protected PostgresSchoolYearOpalFactory() {
		super();
	}

	private static final String[] ourColumnNames = new String[] {
		"code", 
		"name", 
		"short_name", 
		"very_short_name", 
		"sequence", 
	};

	protected static String[] getStaticColumnNames() { return ourColumnNames; }

	@Override
	protected String[] getColumnNames() { return ourColumnNames; }

	private static final String[] ourPrimaryKeyWhereClauseColumns = new String[] {"code",};

	@Override
	protected String[] getFieldNames() { return SchoolYearOpal.getStaticFieldNames(); }

	@Override
	protected Class<?>[] getFieldTypes() { return SchoolYearOpal.getStaticFieldTypes(); }

	@Override
	protected boolean[] getFieldNullability() { return SchoolYearOpal.getStaticFieldNullability(); }

	@Override
	protected com.opal.FieldValidator[] getFieldValidators() { return SchoolYearOpal.getStaticFieldValidators(); }


	@Override
	protected javax.sql.DataSource getDataSource() {
		return PostgresOpalFactoryFactory.getSpecificInstance().getDataSource();
	}

	@Override
	protected SchoolYearOpal instantiate(Object[] argValues) {
		return new SchoolYearOpal(this, argValues);
	}

	@Override
	public SchoolYearOpal create() {
		SchoolYearOpal lclOpal;
		synchronized (lclOpal = instantiate((Object[]) null)) {
			assert lclOpal.getUserFacing() == null;
			lclOpal.setUserFacing(new SchoolYearImpl(lclOpal));
			lclOpal.newObject();
			newObject(lclOpal);
		}
		return lclOpal;
	}

	@Override
	protected void determineUserFacing(SchoolYearOpal argO, boolean argConcrete) {
		assert argO != null;
		assert argConcrete == false;
		assert argO.getUserFacing() == null;
		argO.setUserFacing(new SchoolYearImpl(argO));
	}

	protected void newObject(@SuppressWarnings("unused") SchoolYearOpal argOpal) {
		return;
	}

	@Override
	protected String getFullyQualifiedTableName() {
		return "school_year";
	}

	@Override
	protected void registerNewOpal(SchoolYearOpal argOpal) {
		registerOpal(argOpal, argOpal.getNewValues());
	}

	@Override
	protected void registerOldOpal(SchoolYearOpal argOpal) {
		registerOpal(argOpal, argOpal.getOldValues());
	}

	protected void registerOpal(SchoolYearOpal argOpal, Object[] argValues) {
		if (argValues == null) { throw new IllegalStateException(); }
		if (argValues.length != 5) { throw new IllegalStateException(); }
		OpalCache lclOC = getOpalCache();
		synchronized (lclOC) {
			lclOC.addOpal(new NameOpalKey((java.lang.String) argValues[1]), argOpal, true);
			lclOC.addOpal(new CodeOpalKey((java.lang.String) argValues[0]), argOpal, true);
			lclOC.addOpal(new ShortNameOpalKey((java.lang.String) argValues[2]), argOpal, true);
			lclOC.addOpal(new VeryShortNameOpalKey((java.lang.String) argValues[3]), argOpal, true);
		}
	}

	@Override
	protected void unregisterOpal(SchoolYearOpal argOpal) {
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 5) { throw new IllegalStateException(); }
		OpalCache lclOC = getOpalCache();
		synchronized (lclOC) {
			lclOC.removeOpal(new NameOpalKey((java.lang.String) lclOldValues[1]));
			lclOC.removeOpal(new CodeOpalKey((java.lang.String) lclOldValues[0]));
			lclOC.removeOpal(new ShortNameOpalKey((java.lang.String) lclOldValues[2]));
			lclOC.removeOpal(new VeryShortNameOpalKey((java.lang.String) lclOldValues[3]));
		}
	}

	@Override
	public void updateKeys(SchoolYearOpal argOpal) {
		org.apache.commons.lang3.Validate.notNull(argOpal);
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 5) { throw new IllegalStateException(); }
		Object[] lclNewValues = argOpal.getNewValues();
		if (lclNewValues == null) { throw new IllegalStateException(); }
		if (lclNewValues.length != 5) { throw new IllegalStateException(); }
		OpalCache lclOC = getOpalCache();
		synchronized (lclOC) {
			OpalKey<SchoolYearOpal> lclOldKey = null;
			OpalKey<SchoolYearOpal> lclNewKey = null;
			if (true) {
				if (!(lclNewValues[1].equals(lclOldValues[1]))) {
					lclNewKey = new NameOpalKey((java.lang.String) lclNewValues[1]);
					if (true) {
						lclOldKey = new NameOpalKey((java.lang.String) lclOldValues[1]);
					}
				}
			}
			if (lclOldKey != null) { lclOC.removeOpal(lclOldKey); lclOldKey = null; }
			if (lclNewKey != null) { lclOC.addOpal(lclNewKey, argOpal, true); lclNewKey = null; } /* true = SoftReference */
			if (true) {
				if (!(lclNewValues[0].equals(lclOldValues[0]))) {
					lclNewKey = new CodeOpalKey((java.lang.String) lclNewValues[0]);
					if (true) {
						lclOldKey = new CodeOpalKey((java.lang.String) lclOldValues[0]);
					}
				}
			}
			if (lclOldKey != null) { lclOC.removeOpal(lclOldKey); lclOldKey = null; }
			if (lclNewKey != null) { lclOC.addOpal(lclNewKey, argOpal, true); lclNewKey = null; } /* true = SoftReference */
			if (true) {
				if (!(lclNewValues[2].equals(lclOldValues[2]))) {
					lclNewKey = new ShortNameOpalKey((java.lang.String) lclNewValues[2]);
					if (true) {
						lclOldKey = new ShortNameOpalKey((java.lang.String) lclOldValues[2]);
					}
				}
			}
			if (lclOldKey != null) { lclOC.removeOpal(lclOldKey); lclOldKey = null; }
			if (lclNewKey != null) { lclOC.addOpal(lclNewKey, argOpal, true); lclNewKey = null; } /* true = SoftReference */
			if (true) {
				if (!(lclNewValues[3].equals(lclOldValues[3]))) {
					lclNewKey = new VeryShortNameOpalKey((java.lang.String) lclNewValues[3]);
					if (true) {
						lclOldKey = new VeryShortNameOpalKey((java.lang.String) lclOldValues[3]);
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
	protected OpalKey<SchoolYearOpal> createOpalKeyForReloading(SchoolYearOpal argOpal) {
		Object[] lclValues = argOpal.getNewValues();
		return new CodeOpalKey((java.lang.String) lclValues[0]);
	}

	@Override
	public SchoolYearOpal forName(java.lang.String argName) throws PersistenceException {
		OpalKey<SchoolYearOpal> lclOpalKey = new NameOpalKey(argName);
		return forOpalKey(lclOpalKey);
	}

	@Override
	public SchoolYearOpal forCode(java.lang.String argCode) throws PersistenceException {
		OpalKey<SchoolYearOpal> lclOpalKey = new CodeOpalKey(argCode);
		return forOpalKey(lclOpalKey);
	}

	@Override
	public SchoolYearOpal forShortName(java.lang.String argShortName) throws PersistenceException {
		OpalKey<SchoolYearOpal> lclOpalKey = new ShortNameOpalKey(argShortName);
		return forOpalKey(lclOpalKey);
	}

	@Override
	public SchoolYearOpal forVeryShortName(java.lang.String argVeryShortName) throws PersistenceException {
		OpalKey<SchoolYearOpal> lclOpalKey = new VeryShortNameOpalKey(argVeryShortName);
		return forOpalKey(lclOpalKey);
	}

	@Override
	protected OpalKey<SchoolYearOpal> createOpalKeyForRow(ResultSet argRS) throws SQLException {
		return new CodeOpalKey(
			OpalUtility.convertTo(java.lang.String.class, argRS.getObject("code"))
		);
	}

	/* package */ static class NameOpalKey extends com.opal.DatabaseOpalKey<SchoolYearOpal> {
		private static final String[] ourKeyColumnNames = new String[] {"name", };

		public NameOpalKey(java.lang.String argName) {
			super(new Object[] {argName, });
		}

		@Override
		protected Object[] getParameters() { return getFields(); }

		@Override
		protected String[] getColumnNames() { return ourKeyColumnNames; }

	}

	/* package */ static class CodeOpalKey extends com.opal.DatabaseOpalKey<SchoolYearOpal> {
		private static final String[] ourKeyColumnNames = new String[] {"code", };

		public CodeOpalKey(java.lang.String argCode) {
			super(new Object[] {argCode, });
		}

		@Override
		protected Object[] getParameters() { return getFields(); }

		@Override
		protected String[] getColumnNames() { return ourKeyColumnNames; }

	}

	/* package */ static class ShortNameOpalKey extends com.opal.DatabaseOpalKey<SchoolYearOpal> {
		private static final String[] ourKeyColumnNames = new String[] {"short_name", };

		public ShortNameOpalKey(java.lang.String argShortName) {
			super(new Object[] {argShortName, });
		}

		@Override
		protected Object[] getParameters() { return getFields(); }

		@Override
		protected String[] getColumnNames() { return ourKeyColumnNames; }

	}

	/* package */ static class VeryShortNameOpalKey extends com.opal.DatabaseOpalKey<SchoolYearOpal> {
		private static final String[] ourKeyColumnNames = new String[] {"very_short_name", };

		public VeryShortNameOpalKey(java.lang.String argVeryShortName) {
			super(new Object[] {argVeryShortName, });
		}

		@Override
		protected Object[] getParameters() { return getFields(); }

		@Override
		protected String[] getColumnNames() { return ourKeyColumnNames; }

	}

	@Override
	public SchoolYearOpal forUniqueString(String argUniqueString) {
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
