package com.scobolsolo.persistence.postgres;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.opal.*;
import com.scobolsolo.application.WaitlistEntry;
import com.scobolsolo.application.WaitlistEntryImpl;
import com.scobolsolo.persistence.WaitlistEntryOpal;
import com.scobolsolo.persistence.WaitlistEntryOpalFactory;

public class PostgresWaitlistEntryOpalFactory extends com.opal.AbstractDatabaseIdentityOpalFactory<WaitlistEntry, WaitlistEntryOpal> implements WaitlistEntryOpalFactory {
	private static final PostgresWaitlistEntryOpalFactory ourInstance = new PostgresWaitlistEntryOpalFactory();

	public static final PostgresWaitlistEntryOpalFactory getInstance() { return ourInstance; }

	protected PostgresWaitlistEntryOpalFactory() {
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
	protected String[] getFieldNames() { return WaitlistEntryOpal.getStaticFieldNames(); }

	@Override
	protected Class<?>[] getFieldTypes() { return WaitlistEntryOpal.getStaticFieldTypes(); }

	@Override
	protected boolean[] getFieldNullability() { return WaitlistEntryOpal.getStaticFieldNullability(); }

	@Override
	protected com.opal.FieldValidator[] getFieldValidators() { return WaitlistEntryOpal.getStaticFieldValidators(); }


	@Override
	protected javax.sql.DataSource getDataSource() {
		return PostgresOpalFactoryFactory.getSpecificInstance().getDataSource();
	}

	@Override
	protected WaitlistEntryOpal instantiate(Object[] argValues) {
		return new WaitlistEntryOpal(this, argValues);
	}

	@Override
	public WaitlistEntryOpal create(WaitlistEntry argUF) {
		assert argUF != null;
		WaitlistEntryOpal lclOpal;
		synchronized (lclOpal = instantiate((Object[]) null/*, argUF */)) {
			assert lclOpal.getUserFacing() == null;
			lclOpal.setUserFacing(argUF);
			lclOpal.newObject();
			newObject(lclOpal);
		}
		return lclOpal;
	}

	@Override
	public WaitlistEntryOpal create() {
		WaitlistEntryOpal lclOpal;
		synchronized (lclOpal = instantiate((Object[]) null)) {
			assert lclOpal.getUserFacing() == null;
			lclOpal.setUserFacing(new WaitlistEntryImpl(lclOpal));
			lclOpal.newObject();
			newObject(lclOpal);
		}
		return lclOpal;
	}

	@Override
	protected void determineUserFacing(WaitlistEntryOpal argO, boolean argConcrete) {
		assert argO != null;
		assert argConcrete == false;
		assert argO.getUserFacing() == null;
		argO.setUserFacing(new WaitlistEntryImpl(argO));
	}

	@Override
	protected void afterInsert(TransactionParameter argTP, WaitlistEntryOpal argOpal) throws PersistenceException {
		assert argTP != null;
		assert argOpal != null;
		try {
			argOpal.setId(
				com.siliconage.database.DatabaseUtility.executeIntQuery(
					((DatabaseTransactionParameter) argTP).getConnection(),
					"SELECT last_value FROM waitlist_entry_id_seq AS id_value",
					null
				)
			);
			return;
		} catch (SQLException lclE) {
			throw new PersistenceException("Unable to retrieve last value for sequence column waitlist_entry_id_seq", lclE);
		}
	}

	protected void newObject(@SuppressWarnings("unused") WaitlistEntryOpal argOpal) {
		return;
	}

	@Override
	protected String getFullyQualifiedTableName() {
		return "waitlist_entry";
	}

	@Override
	protected void registerNewOpal(WaitlistEntryOpal argOpal) {
		registerOpal(argOpal, argOpal.getNewValues());
	}

	@Override
	protected void registerOldOpal(WaitlistEntryOpal argOpal) {
		registerOpal(argOpal, argOpal.getOldValues());
	}

	protected void registerOpal(WaitlistEntryOpal argOpal, Object[] argValues) {
		if (argValues == null) { throw new IllegalStateException(); }
		if (argValues.length != 5) { throw new IllegalStateException(); }
		OpalCache lclOC = getOpalCache();
		synchronized (lclOC) {
			lclOC.addOpal(new IdOpalKey((java.lang.Integer) argValues[0]), argOpal, true);
		}
	}

	@Override
	protected void unregisterOpal(WaitlistEntryOpal argOpal) {
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 5) { throw new IllegalStateException(); }
		OpalCache lclOC = getOpalCache();
		synchronized (lclOC) {
			lclOC.removeOpal(new IdOpalKey((java.lang.Integer) lclOldValues[0]));
		}
	}

	@Override
	public void updateKeys(WaitlistEntryOpal argOpal) {
		if (argOpal == null) { throw new IllegalArgumentException("argOpal is null"); }
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 5) { throw new IllegalStateException(); }
		Object[] lclNewValues = argOpal.getNewValues();
		if (lclNewValues == null) { throw new IllegalStateException(); }
		if (lclNewValues.length != 5) { throw new IllegalStateException(); }
		OpalCache lclOC = getOpalCache();
		synchronized (lclOC) {
			OpalKey<WaitlistEntryOpal> lclOldKey = null;
			OpalKey<WaitlistEntryOpal> lclNewKey = null;
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
	protected OpalKey<WaitlistEntryOpal> createOpalKeyForReloading(WaitlistEntryOpal argOpal) {
		Object[] lclValues = argOpal.getNewValues();
		return new IdOpalKey((java.lang.Integer) lclValues[0]);
	}

	@Override
	public com.siliconage.util.Fast3Set<WaitlistEntryOpal> forSchoolRegistrationIdCollection(java.lang.Integer argSchoolRegistrationId) /* throws PersistenceException */ {
		final Object[] lclParameters = new Object[] { argSchoolRegistrationId };
		final String[] lclFieldNames = new String[] { "school_registration_id" };
		com.siliconage.util.Fast3Set<WaitlistEntryOpal> lclCollection = new com.siliconage.util.Fast3Set<>();
		load(getFullyQualifiedTableName(), lclFieldNames, lclParameters, null, lclCollection);
		return lclCollection;
	}

	@Override
	public WaitlistEntryOpal forId(java.lang.Integer argId) throws PersistenceException {
		OpalKey<WaitlistEntryOpal> lclOpalKey = new IdOpalKey(argId);
		return forOpalKey(lclOpalKey);
	}

	@Override
	protected OpalKey<WaitlistEntryOpal> createOpalKeyForRow(ResultSet argRS) throws SQLException {
		return new IdOpalKey(
			OpalUtility.convertTo(java.lang.Integer.class, argRS.getObject("id"))
		);
	}

	/* package */ static class IdOpalKey extends com.opal.DatabaseOpalKey<WaitlistEntryOpal> {
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
	public WaitlistEntryOpal forUniqueString(String argUniqueString) {
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
