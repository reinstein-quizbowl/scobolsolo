package com.scobolsolo.persistence.postgres;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.opal.*;
import com.scobolsolo.application.Performance;
import com.scobolsolo.application.PerformanceImpl;
import com.scobolsolo.persistence.PerformanceOpal;
import com.scobolsolo.persistence.PerformanceOpalFactory;

public class PostgresPerformanceOpalFactory extends com.opal.AbstractDatabaseIdentityOpalFactory<Performance, PerformanceOpal> implements PerformanceOpalFactory {
	private static final PostgresPerformanceOpalFactory ourInstance = new PostgresPerformanceOpalFactory();

	public static final PostgresPerformanceOpalFactory getInstance() { return ourInstance; }

	protected PostgresPerformanceOpalFactory() {
		super();
	}

	private static final String[] ourColumnNames = new String[] {
		"id", 
		"game_id", 
		"player_id", 
	};

	protected static String[] getStaticColumnNames() { return ourColumnNames; }

	@Override
	protected String[] getColumnNames() { return ourColumnNames; }

	private static final String[] ourPrimaryKeyWhereClauseColumns = new String[] {"id",};

	@Override
	protected String[] getFieldNames() { return PerformanceOpal.getStaticFieldNames(); }

	@Override
	protected Class<?>[] getFieldTypes() { return PerformanceOpal.getStaticFieldTypes(); }

	@Override
	protected boolean[] getFieldNullability() { return PerformanceOpal.getStaticFieldNullability(); }

	@Override
	protected com.opal.FieldValidator[] getFieldValidators() { return PerformanceOpal.getStaticFieldValidators(); }


	@Override
	protected javax.sql.DataSource getDataSource() {
		return PostgresOpalFactoryFactory.getSpecificInstance().getDataSource();
	}

	@Override
	protected PerformanceOpal instantiate(Object[] argValues) {
		return new PerformanceOpal(this, argValues);
	}

	@Override
	public PerformanceOpal create() {
		PerformanceOpal lclOpal;
		synchronized (lclOpal = instantiate((Object[]) null)) {
			assert lclOpal.getUserFacing() == null;
			lclOpal.setUserFacing(new PerformanceImpl(lclOpal));
			lclOpal.newObject();
			newObject(lclOpal);
		}
		return lclOpal;
	}

	@Override
	protected void determineUserFacing(PerformanceOpal argO, boolean argConcrete) {
		assert argO != null;
		assert argConcrete == false;
		assert argO.getUserFacing() == null;
		argO.setUserFacing(new PerformanceImpl(argO));
	}

	@Override
	public boolean hasGeneratedKeys() {
		return true;
	}

	@Override
	protected void processGeneratedKeys(java.sql.ResultSet argRS, PerformanceOpal argOpal) {
		try {
			argOpal.setId(argRS.getInt("id"));
		} catch (SQLException lclE) {
			throw new PersistenceException("Could not process generated keys.");
		}
	}

	protected void newObject(@SuppressWarnings("unused") PerformanceOpal argOpal) {
		return;
	}

	@Override
	protected String getFullyQualifiedTableName() {
		return "performance";
	}

	@Override
	protected void registerNewOpal(PerformanceOpal argOpal) {
		registerOpal(argOpal, argOpal.getNewValues());
	}

	@Override
	protected void registerOldOpal(PerformanceOpal argOpal) {
		registerOpal(argOpal, argOpal.getOldValues());
	}

	protected void registerOpal(PerformanceOpal argOpal, Object[] argValues) {
		if (argValues == null) { throw new IllegalStateException(); }
		if (argValues.length != 3) { throw new IllegalStateException(); }
		OpalCache lclOC = getOpalCache();
		synchronized (lclOC) {
			lclOC.addOpal(new GameIdPlayerIdOpalKey((java.lang.Integer) argValues[1], (java.lang.Integer) argValues[2]), argOpal, true);
			lclOC.addOpal(new IdOpalKey((java.lang.Integer) argValues[0]), argOpal, true);
		}
	}

	@Override
	protected void unregisterOpal(PerformanceOpal argOpal) {
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 3) { throw new IllegalStateException(); }
		OpalCache lclOC = getOpalCache();
		synchronized (lclOC) {
			lclOC.removeOpal(new GameIdPlayerIdOpalKey((java.lang.Integer) lclOldValues[1], (java.lang.Integer) lclOldValues[2]));
			lclOC.removeOpal(new IdOpalKey((java.lang.Integer) lclOldValues[0]));
		}
	}

	@Override
	public void updateKeys(PerformanceOpal argOpal) {
		org.apache.commons.lang3.Validate.notNull(argOpal);
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 3) { throw new IllegalStateException(); }
		Object[] lclNewValues = argOpal.getNewValues();
		if (lclNewValues == null) { throw new IllegalStateException(); }
		if (lclNewValues.length != 3) { throw new IllegalStateException(); }
		OpalCache lclOC = getOpalCache();
		synchronized (lclOC) {
			OpalKey<PerformanceOpal> lclOldKey = null;
			OpalKey<PerformanceOpal> lclNewKey = null;
			if (true) {
				if (!(lclNewValues[1].equals(lclOldValues[1]) && lclNewValues[2].equals(lclOldValues[2]))) {
					lclNewKey = new GameIdPlayerIdOpalKey((java.lang.Integer) lclNewValues[1], (java.lang.Integer) lclNewValues[2]);
					if (true) {
						lclOldKey = new GameIdPlayerIdOpalKey((java.lang.Integer) lclOldValues[1], (java.lang.Integer) lclOldValues[2]);
					}
				}
			}
			if (lclOldKey != null) { lclOC.removeOpal(lclOldKey); lclOldKey = null; }
			if (lclNewKey != null) { lclOC.addOpal(lclNewKey, argOpal, true); lclNewKey = null; } /* true = SoftReference */
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
	protected OpalKey<PerformanceOpal> createOpalKeyForReloading(PerformanceOpal argOpal) {
		Object[] lclValues = argOpal.getNewValues();
		return new IdOpalKey((java.lang.Integer) lclValues[0]);
	}

	@Override
	public java.util.HashSet<PerformanceOpal> forGameIdCollection(java.lang.Integer argGameId) /* throws PersistenceException */ {
		final Object[] lclParameters = new Object[] { argGameId };
		final String[] lclFieldNames = new String[] { "game_id" };
		java.util.HashSet<PerformanceOpal> lclCollection = new java.util.HashSet<>();
		load(getFullyQualifiedTableName(), lclFieldNames, lclParameters, null, lclCollection);
		return lclCollection;
	}

	@Override
	public java.util.HashSet<PerformanceOpal> forPlayerIdCollection(java.lang.Integer argPlayerId) /* throws PersistenceException */ {
		final Object[] lclParameters = new Object[] { argPlayerId };
		final String[] lclFieldNames = new String[] { "player_id" };
		java.util.HashSet<PerformanceOpal> lclCollection = new java.util.HashSet<>();
		load(getFullyQualifiedTableName(), lclFieldNames, lclParameters, null, lclCollection);
		return lclCollection;
	}

	@Override
	public PerformanceOpal forGameIdPlayerId(java.lang.Integer argGameId, java.lang.Integer argPlayerId) throws PersistenceException {
		OpalKey<PerformanceOpal> lclOpalKey = new GameIdPlayerIdOpalKey(argGameId, argPlayerId);
		return forOpalKey(lclOpalKey);
	}

	@Override
	public PerformanceOpal forId(java.lang.Integer argId) throws PersistenceException {
		OpalKey<PerformanceOpal> lclOpalKey = new IdOpalKey(argId);
		return forOpalKey(lclOpalKey);
	}

	@Override
	protected OpalKey<PerformanceOpal> createOpalKeyForRow(ResultSet argRS) throws SQLException {
		return new IdOpalKey(
			OpalUtility.convertTo(java.lang.Integer.class, argRS.getObject("id"))
		);
	}

	/* package */ static class GameIdPlayerIdOpalKey extends com.opal.DatabaseOpalKey<PerformanceOpal> {
		private static final String[] ourKeyColumnNames = new String[] {"game_id", "player_id", };

		public GameIdPlayerIdOpalKey(java.lang.Integer argGameId, java.lang.Integer argPlayerId) {
			super(new Object[] {argGameId, argPlayerId, });
		}

		@Override
		protected Object[] getParameters() { return getFields(); }

		@Override
		protected String[] getColumnNames() { return ourKeyColumnNames; }

	}

	/* package */ static class IdOpalKey extends com.opal.DatabaseOpalKey<PerformanceOpal> {
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
	public PerformanceOpal forUniqueString(String argUniqueString) {
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
