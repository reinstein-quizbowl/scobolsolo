package com.scobolsolo.persistence.postgres;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.opal.*;
import com.scobolsolo.application.Round;
import com.scobolsolo.application.RoundImpl;
import com.scobolsolo.persistence.RoundOpal;
import com.scobolsolo.persistence.RoundOpalFactory;

public class PostgresRoundOpalFactory extends com.opal.AbstractDatabaseIdentityOpalFactory<Round, RoundOpal> implements RoundOpalFactory {
	private static final PostgresRoundOpalFactory ourInstance = new PostgresRoundOpalFactory();

	public static final PostgresRoundOpalFactory getInstance() { return ourInstance; }

	protected PostgresRoundOpalFactory() {
		super();
	}

	private static final String[] ourColumnNames = new String[] {
		"id", 
		"round_group_id", 
		"name", 
		"short_name", 
		"sequence", 
		"start_time", 
		"lunch_after", 
	};

	protected static String[] getStaticColumnNames() { return ourColumnNames; }

	@Override
	protected String[] getColumnNames() { return ourColumnNames; }

	private static final String[] ourPrimaryKeyWhereClauseColumns = new String[] {"id",};

	@Override
	protected String[] getFieldNames() { return RoundOpal.getStaticFieldNames(); }

	@Override
	protected Class<?>[] getFieldTypes() { return RoundOpal.getStaticFieldTypes(); }

	@Override
	protected boolean[] getFieldNullability() { return RoundOpal.getStaticFieldNullability(); }

	@Override
	protected com.opal.FieldValidator[] getFieldValidators() { return RoundOpal.getStaticFieldValidators(); }


	@Override
	protected javax.sql.DataSource getDataSource() {
		return PostgresOpalFactoryFactory.getSpecificInstance().getDataSource();
	}

	@Override
	protected RoundOpal instantiate(Object[] argValues) {
		return new RoundOpal(this, argValues);
	}

	@Override
	public RoundOpal create() {
		RoundOpal lclOpal;
		synchronized (lclOpal = instantiate((Object[]) null)) {
			assert lclOpal.getUserFacing() == null;
			lclOpal.setUserFacing(new RoundImpl(lclOpal));
			lclOpal.newObject();
			newObject(lclOpal);
		}
		return lclOpal;
	}

	@Override
	protected void determineUserFacing(RoundOpal argO, boolean argConcrete) {
		assert argO != null;
		assert argConcrete == false;
		assert argO.getUserFacing() == null;
		argO.setUserFacing(new RoundImpl(argO));
	}

	@Override
	public boolean hasGeneratedKeys() {
		return true;
	}

	@Override
	protected void processGeneratedKeys(java.sql.ResultSet argRS, RoundOpal argOpal) {
		try {
			argOpal.setId(argRS.getInt("id"));
		} catch (SQLException lclE) {
			throw new PersistenceException("Could not process generated keys.");
		}
	}

	protected void newObject(@SuppressWarnings("unused") RoundOpal argOpal) {
		return;
	}

	@Override
	protected String getFullyQualifiedTableName() {
		return "round";
	}

	@Override
	protected void registerNewOpal(RoundOpal argOpal) {
		registerOpal(argOpal, argOpal.getNewValues());
	}

	@Override
	protected void registerOldOpal(RoundOpal argOpal) {
		registerOpal(argOpal, argOpal.getOldValues());
	}

	protected void registerOpal(RoundOpal argOpal, Object[] argValues) {
		if (argValues == null) { throw new IllegalStateException(); }
		if (argValues.length != 7) { throw new IllegalStateException(); }
		OpalCache lclOC = getOpalCache();
		synchronized (lclOC) {
			lclOC.addOpal(new IdOpalKey((java.lang.Integer) argValues[0]), argOpal, true);
			if (true && argValues[1] != null) {
				lclOC.addOpal(new RoundGroupIdNameOpalKey((java.lang.Integer) argValues[1], (java.lang.String) argValues[2]), argOpal, true);
			}
			if (true && argValues[1] != null) {
				lclOC.addOpal(new RoundGroupIdShortNameOpalKey((java.lang.Integer) argValues[1], (java.lang.String) argValues[3]), argOpal, true);
			}
		}
	}

	@Override
	protected void unregisterOpal(RoundOpal argOpal) {
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 7) { throw new IllegalStateException(); }
		OpalCache lclOC = getOpalCache();
		synchronized (lclOC) {
			lclOC.removeOpal(new IdOpalKey((java.lang.Integer) lclOldValues[0]));
			if (true && lclOldValues[1] != null) {
				lclOC.removeOpal(new RoundGroupIdNameOpalKey((java.lang.Integer) lclOldValues[1], (java.lang.String) lclOldValues[2]));
			}
			if (true && lclOldValues[1] != null) {
				lclOC.removeOpal(new RoundGroupIdShortNameOpalKey((java.lang.Integer) lclOldValues[1], (java.lang.String) lclOldValues[3]));
			}
		}
	}

	@Override
	public void updateKeys(RoundOpal argOpal) {
		org.apache.commons.lang3.Validate.notNull(argOpal);
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 7) { throw new IllegalStateException(); }
		Object[] lclNewValues = argOpal.getNewValues();
		if (lclNewValues == null) { throw new IllegalStateException(); }
		if (lclNewValues.length != 7) { throw new IllegalStateException(); }
		OpalCache lclOC = getOpalCache();
		synchronized (lclOC) {
			OpalKey<RoundOpal> lclOldKey = null;
			OpalKey<RoundOpal> lclNewKey = null;
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
			if (true && lclNewValues[1] != null) {
				if (!(lclNewValues[1].equals(lclOldValues[1]) && lclNewValues[2].equals(lclOldValues[2]))) {
					lclNewKey = new RoundGroupIdNameOpalKey((java.lang.Integer) lclNewValues[1], (java.lang.String) lclNewValues[2]);
					if (true && lclOldValues[1] != null) {
						lclOldKey = new RoundGroupIdNameOpalKey((java.lang.Integer) lclOldValues[1], (java.lang.String) lclOldValues[2]);
					}
				}
			} else {
				if (true && lclOldValues[1] != null) {
					lclOldKey = new RoundGroupIdNameOpalKey((java.lang.Integer) lclOldValues[1], (java.lang.String) lclOldValues[2]);
				}
			}
			if (lclOldKey != null) { lclOC.removeOpal(lclOldKey); lclOldKey = null; }
			if (lclNewKey != null) { lclOC.addOpal(lclNewKey, argOpal, true); lclNewKey = null; } /* true = SoftReference */
			if (true && lclNewValues[1] != null) {
				if (!(lclNewValues[1].equals(lclOldValues[1]) && lclNewValues[3].equals(lclOldValues[3]))) {
					lclNewKey = new RoundGroupIdShortNameOpalKey((java.lang.Integer) lclNewValues[1], (java.lang.String) lclNewValues[3]);
					if (true && lclOldValues[1] != null) {
						lclOldKey = new RoundGroupIdShortNameOpalKey((java.lang.Integer) lclOldValues[1], (java.lang.String) lclOldValues[3]);
					}
				}
			} else {
				if (true && lclOldValues[1] != null) {
					lclOldKey = new RoundGroupIdShortNameOpalKey((java.lang.Integer) lclOldValues[1], (java.lang.String) lclOldValues[3]);
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
	protected OpalKey<RoundOpal> createOpalKeyForReloading(RoundOpal argOpal) {
		Object[] lclValues = argOpal.getNewValues();
		return new IdOpalKey((java.lang.Integer) lclValues[0]);
	}

	@Override
	public java.util.HashSet<RoundOpal> forRoundGroupIdCollection(java.lang.Integer argRoundGroupId) /* throws PersistenceException */ {
		final Object[] lclParameters = new Object[] { argRoundGroupId };
		final String[] lclFieldNames = new String[] { "round_group_id" };
		java.util.HashSet<RoundOpal> lclCollection = new java.util.HashSet<>();
		load(getFullyQualifiedTableName(), lclFieldNames, lclParameters, null, lclCollection);
		return lclCollection;
	}

	@Override
	public RoundOpal forId(java.lang.Integer argId) throws PersistenceException {
		OpalKey<RoundOpal> lclOpalKey = new IdOpalKey(argId);
		return forOpalKey(lclOpalKey);
	}

	@Override
	public RoundOpal forRoundGroupIdName(java.lang.Integer argRoundGroupId, java.lang.String argName) throws PersistenceException {
		OpalKey<RoundOpal> lclOpalKey = new RoundGroupIdNameOpalKey(argRoundGroupId, argName);
		return forOpalKey(lclOpalKey);
	}

	@Override
	public RoundOpal forRoundGroupIdShortName(java.lang.Integer argRoundGroupId, java.lang.String argShortName) throws PersistenceException {
		OpalKey<RoundOpal> lclOpalKey = new RoundGroupIdShortNameOpalKey(argRoundGroupId, argShortName);
		return forOpalKey(lclOpalKey);
	}

	@Override
	protected OpalKey<RoundOpal> createOpalKeyForRow(ResultSet argRS) throws SQLException {
		return new IdOpalKey(
			OpalUtility.convertTo(java.lang.Integer.class, argRS.getObject("id"))
		);
	}

	/* package */ static class IdOpalKey extends com.opal.DatabaseOpalKey<RoundOpal> {
		private static final String[] ourKeyColumnNames = new String[] {"id", };

		public IdOpalKey(java.lang.Integer argId) {
			super(new Object[] {argId, });
		}

		@Override
		protected Object[] getParameters() { return getFields(); }

		@Override
		protected String[] getColumnNames() { return ourKeyColumnNames; }

	}

	/* package */ static class RoundGroupIdNameOpalKey extends com.opal.DatabaseOpalKey<RoundOpal> {
		private static final String[] ourKeyColumnNames = new String[] {"round_group_id", "name", };

		public RoundGroupIdNameOpalKey(java.lang.Integer argRoundGroupId, java.lang.String argName) {
			super(new Object[] {argRoundGroupId, argName, });
		}

		@Override
		protected Object[] getParameters() { return getFields(); }

		@Override
		protected String[] getColumnNames() { return ourKeyColumnNames; }

	}

	/* package */ static class RoundGroupIdShortNameOpalKey extends com.opal.DatabaseOpalKey<RoundOpal> {
		private static final String[] ourKeyColumnNames = new String[] {"round_group_id", "short_name", };

		public RoundGroupIdShortNameOpalKey(java.lang.Integer argRoundGroupId, java.lang.String argShortName) {
			super(new Object[] {argRoundGroupId, argShortName, });
		}

		@Override
		protected Object[] getParameters() { return getFields(); }

		@Override
		protected String[] getColumnNames() { return ourKeyColumnNames; }

	}

	@Override
	public RoundOpal forUniqueString(String argUniqueString) {
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
