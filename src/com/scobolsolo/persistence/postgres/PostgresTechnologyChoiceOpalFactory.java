package com.scobolsolo.persistence.postgres;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.opal.OpalCache;
import com.opal.OpalKey;
import com.opal.OpalUtility;
import com.opal.PersistenceException;

import com.scobolsolo.application.TechnologyChoice;
import com.scobolsolo.persistence.TechnologyChoiceImpl;
import com.scobolsolo.persistence.TechnologyChoiceOpal;
import com.scobolsolo.persistence.TechnologyChoiceOpalFactory;

public class PostgresTechnologyChoiceOpalFactory extends com.opal.AbstractDatabaseIdentityOpalFactory<TechnologyChoice, TechnologyChoiceOpal> implements TechnologyChoiceOpalFactory {
	private static final PostgresTechnologyChoiceOpalFactory ourInstance = new PostgresTechnologyChoiceOpalFactory();

	public static final PostgresTechnologyChoiceOpalFactory getInstance() { return ourInstance; }

	protected PostgresTechnologyChoiceOpalFactory() {
		super();
	}

	private static final String[] ourColumnNames = new String[] {
		"code", 
		"name", 
		"short_name", 
		"very_short_name", 
		"sequence", 
		"has_computer", 
	};

	protected static String[] getStaticColumnNames() { return ourColumnNames; }

	@Override
	protected String[] getColumnNames() { return ourColumnNames; }

	private static final String[] ourPrimaryKeyWhereClauseColumns = new String[] {"code",};

	@Override
	protected String[] getFieldNames() { return TechnologyChoiceOpal.getStaticFieldNames(); }

	@Override
	protected Class<?>[] getFieldTypes() { return TechnologyChoiceOpal.getStaticFieldTypes(); }

	@Override
	protected boolean[] getFieldNullability() { return TechnologyChoiceOpal.getStaticFieldNullability(); }

	@Override
	protected com.opal.FieldValidator[] getFieldValidators() { return TechnologyChoiceOpal.getStaticFieldValidators(); }

	@Override
	protected javax.sql.DataSource getDataSource() {
		return PostgresOpalFactoryFactory.getSpecificInstance().getDataSource();
	}

	@Override
	protected TechnologyChoiceOpal instantiate(Object[] argValues) {
		return new TechnologyChoiceOpal(this, argValues);
	}

	@Override
	public TechnologyChoiceOpal create() {
		TechnologyChoiceOpal lclOpal;
		synchronized (lclOpal = instantiate((Object[]) null)) {
			assert lclOpal.getUserFacing() == null;
			lclOpal.setUserFacing(new TechnologyChoiceImpl(lclOpal));
			lclOpal.newObject();
			newObject(lclOpal);
		}
		return lclOpal;
	}

	@Override
	protected void determineUserFacing(TechnologyChoiceOpal argO, boolean argConcrete) {
		assert argO != null;
		assert argConcrete == false;
		assert argO.getUserFacing() == null;
		argO.setUserFacing(new TechnologyChoiceImpl(argO));
	}

	protected void newObject(@SuppressWarnings("unused") TechnologyChoiceOpal argOpal) {
		return;
	}

	@Override
	protected String getFullyQualifiedTableName() {
		return "technology_choice";
	}

	@Override
	protected void registerNewOpal(TechnologyChoiceOpal argOpal) {
		registerOpal(argOpal, argOpal.getNewValues());
	}

	@Override
	protected void registerOldOpal(TechnologyChoiceOpal argOpal) {
		registerOpal(argOpal, argOpal.getOldValues());
	}

	protected void registerOpal(TechnologyChoiceOpal argOpal, Object[] argValues) {
		if (argValues == null) { throw new IllegalStateException(); }
		if (argValues.length != 6) { throw new IllegalStateException(); }
		OpalCache<TechnologyChoiceOpal> lclOC = getCache();
		synchronized (lclOC) {
			lclOC.addOpal(new NameOpalKey((java.lang.String) argValues[1]), argOpal, true);
			lclOC.addOpal(new CodeOpalKey((java.lang.String) argValues[0]), argOpal, true);
			lclOC.addOpal(new ShortNameOpalKey((java.lang.String) argValues[2]), argOpal, true);
			lclOC.addOpal(new VeryShortNameOpalKey((java.lang.String) argValues[3]), argOpal, true);
		}
	}

	@Override
	protected void unregisterOpal(TechnologyChoiceOpal argOpal) {
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 6) { throw new IllegalStateException(); }
		OpalCache<TechnologyChoiceOpal> lclOC = getCache();
		synchronized (lclOC) {
			lclOC.removeOpal(new NameOpalKey((java.lang.String) lclOldValues[1]));
			lclOC.removeOpal(new CodeOpalKey((java.lang.String) lclOldValues[0]));
			lclOC.removeOpal(new ShortNameOpalKey((java.lang.String) lclOldValues[2]));
			lclOC.removeOpal(new VeryShortNameOpalKey((java.lang.String) lclOldValues[3]));
		}
	}

	@Override
	public void updateKeys(TechnologyChoiceOpal argOpal) {
		org.apache.commons.lang3.Validate.notNull(argOpal);
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 6) { throw new IllegalStateException(); }
		Object[] lclNewValues = argOpal.getNewValues();
		if (lclNewValues == null) { throw new IllegalStateException(); }
		if (lclNewValues.length != 6) { throw new IllegalStateException(); }
		OpalCache<TechnologyChoiceOpal> lclOC = getCache();
		synchronized (lclOC) {
			OpalKey<TechnologyChoiceOpal> lclOldKey = null;
			OpalKey<TechnologyChoiceOpal> lclNewKey = null;
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
	protected OpalKey<TechnologyChoiceOpal> createOpalKeyForReloading(TechnologyChoiceOpal argOpal) {
		Object[] lclValues = argOpal.getNewValues();
		return new CodeOpalKey((java.lang.String) lclValues[0]);
	}

	@Override
	public TechnologyChoiceOpal forName(java.lang.String argName) throws PersistenceException {
		OpalKey<TechnologyChoiceOpal> lclOpalKey = new NameOpalKey(argName);
		return forOpalKey(lclOpalKey);
	}

	@Override
	public TechnologyChoiceOpal forCode(java.lang.String argCode) throws PersistenceException {
		OpalKey<TechnologyChoiceOpal> lclOpalKey = new CodeOpalKey(argCode);
		return forOpalKey(lclOpalKey);
	}

	@Override
	public TechnologyChoiceOpal forShortName(java.lang.String argShortName) throws PersistenceException {
		OpalKey<TechnologyChoiceOpal> lclOpalKey = new ShortNameOpalKey(argShortName);
		return forOpalKey(lclOpalKey);
	}

	@Override
	public TechnologyChoiceOpal forVeryShortName(java.lang.String argVeryShortName) throws PersistenceException {
		OpalKey<TechnologyChoiceOpal> lclOpalKey = new VeryShortNameOpalKey(argVeryShortName);
		return forOpalKey(lclOpalKey);
	}

	@Override
	protected OpalKey<TechnologyChoiceOpal> createOpalKeyForRow(ResultSet argRS) throws SQLException {
		return new CodeOpalKey(
			OpalUtility.convertTo(java.lang.String.class, argRS.getObject("code"))
		);
	}

	/* package */ static class NameOpalKey extends com.opal.SingleValueDatabaseOpalKey<TechnologyChoiceOpal> {
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

	/* package */ static class CodeOpalKey extends com.opal.SingleValueDatabaseOpalKey<TechnologyChoiceOpal> {
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

	/* package */ static class ShortNameOpalKey extends com.opal.SingleValueDatabaseOpalKey<TechnologyChoiceOpal> {
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

	/* package */ static class VeryShortNameOpalKey extends com.opal.SingleValueDatabaseOpalKey<TechnologyChoiceOpal> {
		private static final String[] ourKeyColumnNames = new String[] {"very_short_name", };

		public VeryShortNameOpalKey(java.lang.String argVeryShortName) {
			super(argVeryShortName);
		}

		@Override
		public Object[] getParameters() {
			return new Object[] { getKeyValue(), };
		}

		@Override
		public String[] getColumnNames() { return ourKeyColumnNames; }

	}

	@Override
	public TechnologyChoiceOpal forUniqueString(String argUniqueString) {
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
