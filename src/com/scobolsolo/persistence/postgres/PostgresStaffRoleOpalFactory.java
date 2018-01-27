package com.scobolsolo.persistence.postgres;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.opal.OpalCache;
import com.opal.OpalKey;
import com.opal.OpalUtility;
import com.opal.PersistenceException;

import com.scobolsolo.application.StaffRole;
import com.scobolsolo.persistence.StaffRoleImpl;
import com.scobolsolo.persistence.StaffRoleOpal;
import com.scobolsolo.persistence.StaffRoleOpalFactory;

public class PostgresStaffRoleOpalFactory extends com.opal.AbstractDatabaseIdentityOpalFactory<StaffRole, StaffRoleOpal> implements StaffRoleOpalFactory {
	private static final PostgresStaffRoleOpalFactory ourInstance = new PostgresStaffRoleOpalFactory();

	public static final PostgresStaffRoleOpalFactory getInstance() { return ourInstance; }

	protected PostgresStaffRoleOpalFactory() {
		super();
	}

	private static final String[] ourColumnNames = new String[] {
		"code", 
		"name", 
		"short_name", 
		"very_short_name", 
		"sequence", 
		"may_enter_any_match", 
		"may_enter_matches_in_assigned_room", 
		"may_view_questions", 
		"may_enter_matches_before_usually_permitted", 
	};

	protected static String[] getStaticColumnNames() { return ourColumnNames; }

	@Override
	protected String[] getColumnNames() { return ourColumnNames; }

	private static final String[] ourPrimaryKeyWhereClauseColumns = new String[] {"code",};

	@Override
	protected String[] getFieldNames() { return StaffRoleOpal.getStaticFieldNames(); }

	@Override
	protected Class<?>[] getFieldTypes() { return StaffRoleOpal.getStaticFieldTypes(); }

	@Override
	protected boolean[] getFieldNullability() { return StaffRoleOpal.getStaticFieldNullability(); }

	@Override
	protected com.opal.FieldValidator[] getFieldValidators() { return StaffRoleOpal.getStaticFieldValidators(); }

	@Override
	protected javax.sql.DataSource getDataSource() {
		return PostgresOpalFactoryFactory.getSpecificInstance().getDataSource();
	}

	@Override
	protected StaffRoleOpal instantiate(Object[] argValues) {
		return new StaffRoleOpal(this, argValues);
	}

	@Override
	public StaffRoleOpal create() {
		StaffRoleOpal lclOpal;
		synchronized (lclOpal = instantiate((Object[]) null)) {
			assert lclOpal.getUserFacing() == null;
			lclOpal.setUserFacing(new StaffRoleImpl(lclOpal));
			lclOpal.newObject();
			newObject(lclOpal);
		}
		return lclOpal;
	}

	@Override
	protected void determineUserFacing(StaffRoleOpal argO, boolean argConcrete) {
		assert argO != null;
		assert argConcrete == false;
		assert argO.getUserFacing() == null;
		argO.setUserFacing(new StaffRoleImpl(argO));
	}

	protected void newObject(@SuppressWarnings("unused") StaffRoleOpal argOpal) {
		return;
	}

	@Override
	protected String getFullyQualifiedTableName() {
		return "staff_role";
	}

	@Override
	protected void registerNewOpal(StaffRoleOpal argOpal) {
		registerOpal(argOpal, argOpal.getNewValues());
	}

	@Override
	protected void registerOldOpal(StaffRoleOpal argOpal) {
		registerOpal(argOpal, argOpal.getOldValues());
	}

	protected void registerOpal(StaffRoleOpal argOpal, Object[] argValues) {
		if (argValues == null) { throw new IllegalStateException(); }
		if (argValues.length != 9) { throw new IllegalStateException(); }
		OpalCache<StaffRoleOpal> lclOC = getCache();
		synchronized (lclOC) {
			lclOC.addOpal(new NameOpalKey((java.lang.String) argValues[1]), argOpal, true);
			lclOC.addOpal(new CodeOpalKey((java.lang.String) argValues[0]), argOpal, true);
			lclOC.addOpal(new ShortNameOpalKey((java.lang.String) argValues[2]), argOpal, true);
			lclOC.addOpal(new VeryShortNameOpalKey((java.lang.String) argValues[3]), argOpal, true);
		}
	}

	@Override
	protected void unregisterOpal(StaffRoleOpal argOpal) {
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 9) { throw new IllegalStateException(); }
		OpalCache<StaffRoleOpal> lclOC = getCache();
		synchronized (lclOC) {
			lclOC.removeOpal(new NameOpalKey((java.lang.String) lclOldValues[1]));
			lclOC.removeOpal(new CodeOpalKey((java.lang.String) lclOldValues[0]));
			lclOC.removeOpal(new ShortNameOpalKey((java.lang.String) lclOldValues[2]));
			lclOC.removeOpal(new VeryShortNameOpalKey((java.lang.String) lclOldValues[3]));
		}
	}

	@Override
	public void updateKeys(StaffRoleOpal argOpal) {
		org.apache.commons.lang3.Validate.notNull(argOpal);
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 9) { throw new IllegalStateException(); }
		Object[] lclNewValues = argOpal.getNewValues();
		if (lclNewValues == null) { throw new IllegalStateException(); }
		if (lclNewValues.length != 9) { throw new IllegalStateException(); }
		OpalCache<StaffRoleOpal> lclOC = getCache();
		synchronized (lclOC) {
			OpalKey<StaffRoleOpal> lclOldKey = null;
			OpalKey<StaffRoleOpal> lclNewKey = null;
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
				if (!(lclNewValues[3].equals(lclOldValues[3]))) {
					lclNewKey = new VeryShortNameOpalKey((java.lang.String) lclNewValues[3]);
						lclOldKey = new VeryShortNameOpalKey((java.lang.String) lclOldValues[3]);
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
	protected OpalKey<StaffRoleOpal> createOpalKeyForReloading(StaffRoleOpal argOpal) {
		Object[] lclValues = argOpal.getNewValues();
		return new CodeOpalKey((java.lang.String) lclValues[0]);
	}

	@Override
	public StaffRoleOpal forName(java.lang.String argName) throws PersistenceException {
		OpalKey<StaffRoleOpal> lclOpalKey = new NameOpalKey(argName);
		return forOpalKey(lclOpalKey);
	}

	@Override
	public StaffRoleOpal forCode(java.lang.String argCode) throws PersistenceException {
		OpalKey<StaffRoleOpal> lclOpalKey = new CodeOpalKey(argCode);
		return forOpalKey(lclOpalKey);
	}

	@Override
	public StaffRoleOpal forShortName(java.lang.String argShortName) throws PersistenceException {
		OpalKey<StaffRoleOpal> lclOpalKey = new ShortNameOpalKey(argShortName);
		return forOpalKey(lclOpalKey);
	}

	@Override
	public StaffRoleOpal forVeryShortName(java.lang.String argVeryShortName) throws PersistenceException {
		OpalKey<StaffRoleOpal> lclOpalKey = new VeryShortNameOpalKey(argVeryShortName);
		return forOpalKey(lclOpalKey);
	}

	@Override
	protected OpalKey<StaffRoleOpal> createOpalKeyForRow(ResultSet argRS) throws SQLException {
		return new CodeOpalKey(
			OpalUtility.convertTo(java.lang.String.class, argRS.getObject("code"))
		);
	}

	/* package */ static class NameOpalKey extends com.opal.SingleValueDatabaseOpalKey<StaffRoleOpal> {
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

	/* package */ static class CodeOpalKey extends com.opal.SingleValueDatabaseOpalKey<StaffRoleOpal> {
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

	/* package */ static class ShortNameOpalKey extends com.opal.SingleValueDatabaseOpalKey<StaffRoleOpal> {
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

	/* package */ static class VeryShortNameOpalKey extends com.opal.SingleValueDatabaseOpalKey<StaffRoleOpal> {
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
	public StaffRoleOpal forUniqueString(String argUniqueString) {
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
