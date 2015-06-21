package com.scobolsolo.persistence.postgres;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.opal.*;
import com.scobolsolo.application.StandbyEntry;
import com.scobolsolo.application.StandbyEntryImpl;
import com.scobolsolo.persistence.StandbyEntryOpal;
import com.scobolsolo.persistence.StandbyEntryOpalFactory;

public class PostgresStandbyEntryOpalFactory extends com.opal.AbstractDatabaseIdentityOpalFactory<StandbyEntry, StandbyEntryOpal> implements StandbyEntryOpalFactory {
	private static final PostgresStandbyEntryOpalFactory ourInstance = new PostgresStandbyEntryOpalFactory();

	public static final PostgresStandbyEntryOpalFactory getInstance() { return ourInstance; }

	protected PostgresStandbyEntryOpalFactory() {
		super();
	}

	private static final String[] ourColumnNames = new String[] {
		"id", 
		"school_registration_id", 
		"sequence", 
		"player_count", 
		"note", 
	};

	protected static String[] getStaticColumnNames() { return ourColumnNames; }

	@Override
	protected String[] getColumnNames() { return ourColumnNames; }

	private static final String[] ourPrimaryKeyWhereClauseColumns = new String[] {"id",};

	@Override
	protected String[] getFieldNames() { return StandbyEntryOpal.getStaticFieldNames(); }

	@Override
	protected Class<?>[] getFieldTypes() { return StandbyEntryOpal.getStaticFieldTypes(); }

	@Override
	protected boolean[] getFieldNullability() { return StandbyEntryOpal.getStaticFieldNullability(); }

	@Override
	protected com.opal.FieldValidator[] getFieldValidators() { return StandbyEntryOpal.getStaticFieldValidators(); }


	@Override
	protected javax.sql.DataSource getDataSource() {
		return PostgresOpalFactoryFactory.getSpecificInstance().getDataSource();
	}

	@Override
	protected StandbyEntryOpal instantiate(Object[] argValues) {
		return new StandbyEntryOpal(this, argValues);
	}

	@Override
	public StandbyEntryOpal create() {
		StandbyEntryOpal lclOpal;
		synchronized (lclOpal = instantiate((Object[]) null)) {
			assert lclOpal.getUserFacing() == null;
			lclOpal.setUserFacing(new StandbyEntryImpl(lclOpal));
			lclOpal.newObject();
			newObject(lclOpal);
		}
		return lclOpal;
	}

	@Override
	protected void determineUserFacing(StandbyEntryOpal argO, boolean argConcrete) {
		assert argO != null;
		assert argConcrete == false;
		assert argO.getUserFacing() == null;
		argO.setUserFacing(new StandbyEntryImpl(argO));
	}

	@Override
	protected void afterInsert(TransactionParameter argTP, StandbyEntryOpal argOpal) throws PersistenceException {
		assert argTP != null;
		assert argOpal != null;
		try {
			argOpal.setId(
				com.siliconage.database.DatabaseUtility.executeIntQuery(
					((DatabaseTransactionParameter) argTP).getConnection(),
					"SELECT last_value FROM standby_entry_id_seq AS id_value",
					null
				)
			);
			return;
		} catch (SQLException lclE) {
			throw new PersistenceException("Unable to retrieve last value for sequence column standby_entry_id_seq", lclE);
		}
	}

	protected void newObject(@SuppressWarnings("unused") StandbyEntryOpal argOpal) {
		return;
	}

	@Override
	protected String getFullyQualifiedTableName() {
		return "standby_entry";
	}

	@Override
	protected void registerNewOpal(StandbyEntryOpal argOpal) {
		registerOpal(argOpal, argOpal.getNewValues());
	}

	@Override
	protected void registerOldOpal(StandbyEntryOpal argOpal) {
		registerOpal(argOpal, argOpal.getOldValues());
	}

	protected void registerOpal(StandbyEntryOpal argOpal, Object[] argValues) {
		if (argValues == null) { throw new IllegalStateException(); }
		if (argValues.length != 5) { throw new IllegalStateException(); }
		OpalCache lclOC = getOpalCache();
		synchronized (lclOC) {
			lclOC.addOpal(new IdOpalKey((java.lang.Integer) argValues[0]), argOpal, true);
		}
	}

	@Override
	protected void unregisterOpal(StandbyEntryOpal argOpal) {
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 5) { throw new IllegalStateException(); }
		OpalCache lclOC = getOpalCache();
		synchronized (lclOC) {
			lclOC.removeOpal(new IdOpalKey((java.lang.Integer) lclOldValues[0]));
		}
	}

	@Override
	public void updateKeys(StandbyEntryOpal argOpal) {
		org.apache.commons.lang3.Validate.notNull(argOpal);
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 5) { throw new IllegalStateException(); }
		Object[] lclNewValues = argOpal.getNewValues();
		if (lclNewValues == null) { throw new IllegalStateException(); }
		if (lclNewValues.length != 5) { throw new IllegalStateException(); }
		OpalCache lclOC = getOpalCache();
		synchronized (lclOC) {
			OpalKey<StandbyEntryOpal> lclOldKey = null;
			OpalKey<StandbyEntryOpal> lclNewKey = null;
			if (true) {
				if (!(lclNewValues[0].equals(lclOldValues[0]))) {
					lclNewKey = new IdOpalKey((java.lang.Integer) lclNewValues[0]);
					if (true) {
						lclOldKey = new IdOpalKey((java.lang.Integer) lclOldValues[0]);
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
	protected OpalKey<StandbyEntryOpal> createOpalKeyForReloading(StandbyEntryOpal argOpal) {
		Object[] lclValues = argOpal.getNewValues();
		return new IdOpalKey((java.lang.Integer) lclValues[0]);
	}

	@Override
	public java.util.HashSet<StandbyEntryOpal> forSchoolRegistrationIdCollection(java.lang.Integer argSchoolRegistrationId) /* throws PersistenceException */ {
		final Object[] lclParameters = new Object[] { argSchoolRegistrationId };
		final String[] lclFieldNames = new String[] { "school_registration_id" };
		java.util.HashSet<StandbyEntryOpal> lclCollection = new java.util.HashSet<>();
		load(getFullyQualifiedTableName(), lclFieldNames, lclParameters, null, lclCollection);
		return lclCollection;
	}

	@Override
	public StandbyEntryOpal forId(java.lang.Integer argId) throws PersistenceException {
		OpalKey<StandbyEntryOpal> lclOpalKey = new IdOpalKey(argId);
		return forOpalKey(lclOpalKey);
	}

	@Override
	protected OpalKey<StandbyEntryOpal> createOpalKeyForRow(ResultSet argRS) throws SQLException {
		return new IdOpalKey(
			OpalUtility.convertTo(java.lang.Integer.class, argRS.getObject("id"))
		);
	}

	/* package */ static class IdOpalKey extends com.opal.DatabaseOpalKey<StandbyEntryOpal> {
		private static final String[] ourKeyColumnNames = new String[] {"id", };

		public IdOpalKey(java.lang.Integer argId) {
			super(new Object[] {argId, });
		}

		@Override
		protected Object[] getParameters() { return getFields(); }

		@Override
		protected String[] getColumnNames() { return ourKeyColumnNames; }

	}

	@Override
	public StandbyEntryOpal forUniqueString(String argUniqueString) {
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
