package com.scobolsolo.persistence.postgres;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.opal.OpalCache;
import com.opal.OpalKey;
import com.opal.OpalUtility;
import com.opal.PersistenceException;

import com.scobolsolo.application.SchoolRegistration;
import com.scobolsolo.application.SchoolRegistrationImpl;
import com.scobolsolo.persistence.SchoolRegistrationOpal;
import com.scobolsolo.persistence.SchoolRegistrationOpalFactory;

public class PostgresSchoolRegistrationOpalFactory extends com.opal.AbstractDatabaseIdentityOpalFactory<SchoolRegistration, SchoolRegistrationOpal> implements SchoolRegistrationOpalFactory {
	private static final PostgresSchoolRegistrationOpalFactory ourInstance = new PostgresSchoolRegistrationOpalFactory();

	public static final PostgresSchoolRegistrationOpalFactory getInstance() { return ourInstance; }

	protected PostgresSchoolRegistrationOpalFactory() {
		super();
	}

	private static final String[] ourColumnNames = new String[] {
		"id", 
		"school_id", 
		"main_contact_id", 
		"amount_owed", 
		"amount_paid", 
		"note", 
		"spots_reserved", 
		"tournament_code", 
	};

	protected static String[] getStaticColumnNames() { return ourColumnNames; }

	@Override
	protected String[] getColumnNames() { return ourColumnNames; }

	private static final String[] ourPrimaryKeyWhereClauseColumns = new String[] {"id",};

	@Override
	protected String[] getFieldNames() { return SchoolRegistrationOpal.getStaticFieldNames(); }

	@Override
	protected Class<?>[] getFieldTypes() { return SchoolRegistrationOpal.getStaticFieldTypes(); }

	@Override
	protected boolean[] getFieldNullability() { return SchoolRegistrationOpal.getStaticFieldNullability(); }

	@Override
	protected com.opal.FieldValidator[] getFieldValidators() { return SchoolRegistrationOpal.getStaticFieldValidators(); }

	@Override
	protected javax.sql.DataSource getDataSource() {
		return PostgresOpalFactoryFactory.getSpecificInstance().getDataSource();
	}

	@Override
	protected SchoolRegistrationOpal instantiate(Object[] argValues) {
		return new SchoolRegistrationOpal(this, argValues);
	}

	@Override
	public SchoolRegistrationOpal create() {
		SchoolRegistrationOpal lclOpal;
		synchronized (lclOpal = instantiate((Object[]) null)) {
			assert lclOpal.getUserFacing() == null;
			lclOpal.setUserFacing(new SchoolRegistrationImpl(lclOpal));
			lclOpal.newObject();
			newObject(lclOpal);
		}
		return lclOpal;
	}

	@Override
	protected void determineUserFacing(SchoolRegistrationOpal argO, boolean argConcrete) {
		assert argO != null;
		assert argConcrete == false;
		assert argO.getUserFacing() == null;
		argO.setUserFacing(new SchoolRegistrationImpl(argO));
	}

	@Override
	public boolean hasGeneratedKeys() {
		return true;
	}

	@Override
	protected void processGeneratedKeys(java.sql.ResultSet argRS, SchoolRegistrationOpal argOpal) {
		try {
			argOpal.setId(argRS.getInt("id"));
		} catch (SQLException lclE) {
			throw new PersistenceException("Could not process generated keys.");
		}
	}

	protected void newObject(@SuppressWarnings("unused") SchoolRegistrationOpal argOpal) {
		return;
	}

	@Override
	protected String getFullyQualifiedTableName() {
		return "school_registration";
	}

	@Override
	protected void registerNewOpal(SchoolRegistrationOpal argOpal) {
		registerOpal(argOpal, argOpal.getNewValues());
	}

	@Override
	protected void registerOldOpal(SchoolRegistrationOpal argOpal) {
		registerOpal(argOpal, argOpal.getOldValues());
	}

	protected void registerOpal(SchoolRegistrationOpal argOpal, Object[] argValues) {
		if (argValues == null) { throw new IllegalStateException(); }
		if (argValues.length != 8) { throw new IllegalStateException(); }
		OpalCache<SchoolRegistrationOpal> lclOC = getCache();
		synchronized (lclOC) {
			lclOC.addOpal(new IdOpalKey((java.lang.Integer) argValues[0]), argOpal, true);
		}
	}

	@Override
	protected void unregisterOpal(SchoolRegistrationOpal argOpal) {
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 8) { throw new IllegalStateException(); }
		OpalCache<SchoolRegistrationOpal> lclOC = getCache();
		synchronized (lclOC) {
			lclOC.removeOpal(new IdOpalKey((java.lang.Integer) lclOldValues[0]));
		}
	}

	@Override
	public void updateKeys(SchoolRegistrationOpal argOpal) {
		org.apache.commons.lang3.Validate.notNull(argOpal);
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 8) { throw new IllegalStateException(); }
		Object[] lclNewValues = argOpal.getNewValues();
		if (lclNewValues == null) { throw new IllegalStateException(); }
		if (lclNewValues.length != 8) { throw new IllegalStateException(); }
		OpalCache<SchoolRegistrationOpal> lclOC = getCache();
		synchronized (lclOC) {
			OpalKey<SchoolRegistrationOpal> lclOldKey = null;
			OpalKey<SchoolRegistrationOpal> lclNewKey = null;
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
	protected OpalKey<SchoolRegistrationOpal> createOpalKeyForReloading(SchoolRegistrationOpal argOpal) {
		Object[] lclValues = argOpal.getNewValues();
		return new IdOpalKey((java.lang.Integer) lclValues[0]);
	}

	@Override
	public java.util.HashSet<SchoolRegistrationOpal> forMainContactIdCollection(java.lang.Integer argMainContactId) /* throws PersistenceException */ {
		final Object[] lclParameters = new Object[] { argMainContactId };
		final String[] lclFieldNames = new String[] { "main_contact_id" };
		java.util.HashSet<SchoolRegistrationOpal> lclCollection = new java.util.HashSet<>();
		load(getFullyQualifiedTableName(), lclFieldNames, lclParameters, null, lclCollection);
		return lclCollection;
	}

	@Override
	public java.util.HashSet<SchoolRegistrationOpal> forSchoolIdCollection(java.lang.Integer argSchoolId) /* throws PersistenceException */ {
		final Object[] lclParameters = new Object[] { argSchoolId };
		final String[] lclFieldNames = new String[] { "school_id" };
		java.util.HashSet<SchoolRegistrationOpal> lclCollection = new java.util.HashSet<>();
		load(getFullyQualifiedTableName(), lclFieldNames, lclParameters, null, lclCollection);
		return lclCollection;
	}

	@Override
	public java.util.HashSet<SchoolRegistrationOpal> forTournamentCodeCollection(java.lang.String argTournamentCode) /* throws PersistenceException */ {
		final Object[] lclParameters = new Object[] { argTournamentCode };
		final String[] lclFieldNames = new String[] { "tournament_code" };
		java.util.HashSet<SchoolRegistrationOpal> lclCollection = new java.util.HashSet<>();
		load(getFullyQualifiedTableName(), lclFieldNames, lclParameters, null, lclCollection);
		return lclCollection;
	}

	@Override
	public SchoolRegistrationOpal forId(java.lang.Integer argId) throws PersistenceException {
		OpalKey<SchoolRegistrationOpal> lclOpalKey = new IdOpalKey(argId);
		return forOpalKey(lclOpalKey);
	}

	@Override
	protected OpalKey<SchoolRegistrationOpal> createOpalKeyForRow(ResultSet argRS) throws SQLException {
		return new IdOpalKey(
			OpalUtility.convertTo(java.lang.Integer.class, argRS.getObject("id"))
		);
	}

	/* package */ static class IdOpalKey extends com.opal.SingleValueDatabaseOpalKey<SchoolRegistrationOpal> {
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
	public SchoolRegistrationOpal forUniqueString(String argUniqueString) {
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
