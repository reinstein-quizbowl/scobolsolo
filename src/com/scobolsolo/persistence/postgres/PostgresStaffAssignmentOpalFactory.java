package com.scobolsolo.persistence.postgres;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.opal.*;
import com.scobolsolo.application.StaffAssignment;
import com.scobolsolo.application.StaffAssignmentImpl;
import com.scobolsolo.persistence.StaffAssignmentOpal;
import com.scobolsolo.persistence.StaffAssignmentOpalFactory;

public class PostgresStaffAssignmentOpalFactory extends com.opal.AbstractDatabaseIdentityOpalFactory<StaffAssignment, StaffAssignmentOpal> implements StaffAssignmentOpalFactory {
	private static final PostgresStaffAssignmentOpalFactory ourInstance = new PostgresStaffAssignmentOpalFactory();

	public static final PostgresStaffAssignmentOpalFactory getInstance() { return ourInstance; }

	protected PostgresStaffAssignmentOpalFactory() {
		super();
	}

	private static final String[] ourColumnNames = new String[] {
		"id", 
		"room_id", 
		"note", 
		"staff_id", 
	};

	protected static String[] getStaticColumnNames() { return ourColumnNames; }

	@Override
	protected String[] getColumnNames() { return ourColumnNames; }

	private static final String[] ourPrimaryKeyWhereClauseColumns = new String[] {"id",};

	@Override
	protected String[] getFieldNames() { return StaffAssignmentOpal.getStaticFieldNames(); }

	@Override
	protected Class<?>[] getFieldTypes() { return StaffAssignmentOpal.getStaticFieldTypes(); }

	@Override
	protected boolean[] getFieldNullability() { return StaffAssignmentOpal.getStaticFieldNullability(); }

	@Override
	protected com.opal.FieldValidator[] getFieldValidators() { return StaffAssignmentOpal.getStaticFieldValidators(); }


	@Override
	protected javax.sql.DataSource getDataSource() {
		return PostgresOpalFactoryFactory.getSpecificInstance().getDataSource();
	}

	@Override
	protected StaffAssignmentOpal instantiate(Object[] argValues) {
		return new StaffAssignmentOpal(this, argValues);
	}

	@Override
	public StaffAssignmentOpal create(StaffAssignment argUF) {
		assert argUF != null;
		StaffAssignmentOpal lclOpal;
		synchronized (lclOpal = instantiate((Object[]) null/*, argUF */)) {
			assert lclOpal.getUserFacing() == null;
			lclOpal.setUserFacing(argUF);
			lclOpal.newObject();
			newObject(lclOpal);
		}
		return lclOpal;
	}

	@Override
	public StaffAssignmentOpal create() {
		StaffAssignmentOpal lclOpal;
		synchronized (lclOpal = instantiate((Object[]) null)) {
			assert lclOpal.getUserFacing() == null;
			lclOpal.setUserFacing(new StaffAssignmentImpl(lclOpal));
			lclOpal.newObject();
			newObject(lclOpal);
		}
		return lclOpal;
	}

	@Override
	protected void determineUserFacing(StaffAssignmentOpal argO, boolean argConcrete) {
		assert argO != null;
		assert argConcrete == false;
		assert argO.getUserFacing() == null;
		argO.setUserFacing(new StaffAssignmentImpl(argO));
	}

	@Override
	protected void afterInsert(TransactionParameter argTP, StaffAssignmentOpal argOpal) throws PersistenceException {
		assert argTP != null;
		assert argOpal != null;
		try {
			argOpal.setId(
				com.siliconage.database.DatabaseUtility.executeIntQuery(
					((DatabaseTransactionParameter) argTP).getConnection(),
					"SELECT last_value FROM staffer_assignment_id_seq AS id_value",
					null
				)
			);
			return;
		} catch (SQLException lclE) {
			throw new PersistenceException("Unable to retrieve last value for sequence column staffer_assignment_id_seq", lclE);
		}
	}

	protected void newObject(@SuppressWarnings("unused") StaffAssignmentOpal argOpal) {
		return;
	}

	@Override
	protected String getFullyQualifiedTableName() {
		return "staff_assignment";
	}

	@Override
	protected void registerNewOpal(StaffAssignmentOpal argOpal) {
		registerOpal(argOpal, argOpal.getNewValues());
	}

	@Override
	protected void registerOldOpal(StaffAssignmentOpal argOpal) {
		registerOpal(argOpal, argOpal.getOldValues());
	}

	protected void registerOpal(StaffAssignmentOpal argOpal, Object[] argValues) {
		if (argValues == null) { throw new IllegalStateException(); }
		if (argValues.length != 4) { throw new IllegalStateException(); }
		OpalCache lclOC = getOpalCache();
		synchronized (lclOC) {
			lclOC.addOpal(new IdOpalKey((java.lang.Integer) argValues[0]), argOpal, true);
		}
	}

	@Override
	protected void unregisterOpal(StaffAssignmentOpal argOpal) {
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 4) { throw new IllegalStateException(); }
		OpalCache lclOC = getOpalCache();
		synchronized (lclOC) {
			lclOC.removeOpal(new IdOpalKey((java.lang.Integer) lclOldValues[0]));
		}
	}

	@Override
	public void updateKeys(StaffAssignmentOpal argOpal) {
		org.apache.commons.lang3.Validate.notNull(argOpal);
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 4) { throw new IllegalStateException(); }
		Object[] lclNewValues = argOpal.getNewValues();
		if (lclNewValues == null) { throw new IllegalStateException(); }
		if (lclNewValues.length != 4) { throw new IllegalStateException(); }
		OpalCache lclOC = getOpalCache();
		synchronized (lclOC) {
			OpalKey<StaffAssignmentOpal> lclOldKey = null;
			OpalKey<StaffAssignmentOpal> lclNewKey = null;
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
	protected OpalKey<StaffAssignmentOpal> createOpalKeyForReloading(StaffAssignmentOpal argOpal) {
		Object[] lclValues = argOpal.getNewValues();
		return new IdOpalKey((java.lang.Integer) lclValues[0]);
	}

	@Override
	public java.util.HashSet<StaffAssignmentOpal> forStaffIdCollection(java.lang.Integer argStaffId) /* throws PersistenceException */ {
		final Object[] lclParameters = new Object[] { argStaffId };
		final String[] lclFieldNames = new String[] { "staff_id" };
		java.util.HashSet<StaffAssignmentOpal> lclCollection = new java.util.HashSet<>();
		load(getFullyQualifiedTableName(), lclFieldNames, lclParameters, null, lclCollection);
		return lclCollection;
	}

	@Override
	public java.util.HashSet<StaffAssignmentOpal> forRoomIdCollection(java.lang.Integer argRoomId) /* throws PersistenceException */ {
		final Object[] lclParameters = new Object[] { argRoomId };
		final String[] lclFieldNames = new String[] { "room_id" };
		java.util.HashSet<StaffAssignmentOpal> lclCollection = new java.util.HashSet<>();
		load(getFullyQualifiedTableName(), lclFieldNames, lclParameters, null, lclCollection);
		return lclCollection;
	}

	@Override
	public StaffAssignmentOpal forId(java.lang.Integer argId) throws PersistenceException {
		OpalKey<StaffAssignmentOpal> lclOpalKey = new IdOpalKey(argId);
		return forOpalKey(lclOpalKey);
	}

	@Override
	protected OpalKey<StaffAssignmentOpal> createOpalKeyForRow(ResultSet argRS) throws SQLException {
		return new IdOpalKey(
			OpalUtility.convertTo(java.lang.Integer.class, argRS.getObject("id"))
		);
	}

	/* package */ static class IdOpalKey extends com.opal.DatabaseOpalKey<StaffAssignmentOpal> {
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
	public StaffAssignmentOpal forUniqueString(String argUniqueString) {
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
