package com.scobolsolo.persistence.postgres;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.opal.OpalCache;
import com.opal.OpalKey;
import com.opal.OpalUtility;
import com.opal.PersistenceException;

import com.scobolsolo.application.Phase;
import com.scobolsolo.application.PhaseImpl;
import com.scobolsolo.persistence.PhaseOpal;
import com.scobolsolo.persistence.PhaseOpalFactory;

public class PostgresPhaseOpalFactory extends com.opal.AbstractDatabaseIdentityOpalFactory<Phase, PhaseOpal> implements PhaseOpalFactory {
	private static final PostgresPhaseOpalFactory ourInstance = new PostgresPhaseOpalFactory();

	public static final PostgresPhaseOpalFactory getInstance() { return ourInstance; }

	protected PostgresPhaseOpalFactory() {
		super();
	}

	private static final String[] ourColumnNames = new String[] {
		"id", 
		"tournament_code", 
		"name", 
		"short_name", 
		"sequence", 
		"card_system", 
		"note", 
	};

	protected static String[] getStaticColumnNames() { return ourColumnNames; }

	@Override
	protected String[] getColumnNames() { return ourColumnNames; }

	private static final String[] ourPrimaryKeyWhereClauseColumns = new String[] {"id",};

	@Override
	protected String[] getFieldNames() { return PhaseOpal.getStaticFieldNames(); }

	@Override
	protected Class<?>[] getFieldTypes() { return PhaseOpal.getStaticFieldTypes(); }

	@Override
	protected boolean[] getFieldNullability() { return PhaseOpal.getStaticFieldNullability(); }

	@Override
	protected com.opal.FieldValidator[] getFieldValidators() { return PhaseOpal.getStaticFieldValidators(); }

	@Override
	protected javax.sql.DataSource getDataSource() {
		return PostgresOpalFactoryFactory.getSpecificInstance().getDataSource();
	}

	@Override
	protected PhaseOpal instantiate(Object[] argValues) {
		return new PhaseOpal(this, argValues);
	}

	@Override
	public PhaseOpal create() {
		PhaseOpal lclOpal;
		synchronized (lclOpal = instantiate((Object[]) null)) {
			assert lclOpal.getUserFacing() == null;
			lclOpal.setUserFacing(new PhaseImpl(lclOpal));
			lclOpal.newObject();
			newObject(lclOpal);
		}
		return lclOpal;
	}

	@Override
	protected void determineUserFacing(PhaseOpal argO, boolean argConcrete) {
		assert argO != null;
		assert argConcrete == false;
		assert argO.getUserFacing() == null;
		argO.setUserFacing(new PhaseImpl(argO));
	}

	@Override
	public boolean hasGeneratedKeys() {
		return true;
	}

	@Override
	protected void processGeneratedKeys(java.sql.ResultSet argRS, PhaseOpal argOpal) {
		try {
			argOpal.setId(argRS.getInt("id"));
		} catch (SQLException lclE) {
			throw new PersistenceException("Could not process generated keys.");
		}
	}

	protected void newObject(@SuppressWarnings("unused") PhaseOpal argOpal) {
		return;
	}

	@Override
	protected String getFullyQualifiedTableName() {
		return "phase";
	}

	@Override
	protected void registerNewOpal(PhaseOpal argOpal) {
		registerOpal(argOpal, argOpal.getNewValues());
	}

	@Override
	protected void registerOldOpal(PhaseOpal argOpal) {
		registerOpal(argOpal, argOpal.getOldValues());
	}

	protected void registerOpal(PhaseOpal argOpal, Object[] argValues) {
		if (argValues == null) { throw new IllegalStateException(); }
		if (argValues.length != 7) { throw new IllegalStateException(); }
		OpalCache<PhaseOpal> lclOC = getCache();
		synchronized (lclOC) {
			lclOC.addOpal(new IdOpalKey((java.lang.Integer) argValues[0]), argOpal, true);
			lclOC.addOpal(new TournamentCodeNameOpalKey((java.lang.String) argValues[1], (java.lang.String) argValues[2]), argOpal, true);
			lclOC.addOpal(new TournamentCodeShortNameOpalKey((java.lang.String) argValues[1], (java.lang.String) argValues[3]), argOpal, true);
		}
	}

	@Override
	protected void unregisterOpal(PhaseOpal argOpal) {
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 7) { throw new IllegalStateException(); }
		OpalCache<PhaseOpal> lclOC = getCache();
		synchronized (lclOC) {
			lclOC.removeOpal(new IdOpalKey((java.lang.Integer) lclOldValues[0]));
			lclOC.removeOpal(new TournamentCodeNameOpalKey((java.lang.String) lclOldValues[1], (java.lang.String) lclOldValues[2]));
			lclOC.removeOpal(new TournamentCodeShortNameOpalKey((java.lang.String) lclOldValues[1], (java.lang.String) lclOldValues[3]));
		}
	}

	@Override
	public void updateKeys(PhaseOpal argOpal) {
		org.apache.commons.lang3.Validate.notNull(argOpal);
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 7) { throw new IllegalStateException(); }
		Object[] lclNewValues = argOpal.getNewValues();
		if (lclNewValues == null) { throw new IllegalStateException(); }
		if (lclNewValues.length != 7) { throw new IllegalStateException(); }
		OpalCache<PhaseOpal> lclOC = getCache();
		synchronized (lclOC) {
			OpalKey<PhaseOpal> lclOldKey = null;
			OpalKey<PhaseOpal> lclNewKey = null;
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
			if (true) {
				if (!(lclNewValues[1].equals(lclOldValues[1]) && lclNewValues[2].equals(lclOldValues[2]))) {
					lclNewKey = new TournamentCodeNameOpalKey((java.lang.String) lclNewValues[1], (java.lang.String) lclNewValues[2]);
					if (true) {
						lclOldKey = new TournamentCodeNameOpalKey((java.lang.String) lclOldValues[1], (java.lang.String) lclOldValues[2]);
					}
				}
			}
			if (lclOldKey != null) { lclOC.removeOpal(lclOldKey); lclOldKey = null; }
			if (lclNewKey != null) { lclOC.addOpal(lclNewKey, argOpal, true); lclNewKey = null; } /* true = SoftReference */
			if (true) {
				if (!(lclNewValues[1].equals(lclOldValues[1]) && lclNewValues[3].equals(lclOldValues[3]))) {
					lclNewKey = new TournamentCodeShortNameOpalKey((java.lang.String) lclNewValues[1], (java.lang.String) lclNewValues[3]);
					if (true) {
						lclOldKey = new TournamentCodeShortNameOpalKey((java.lang.String) lclOldValues[1], (java.lang.String) lclOldValues[3]);
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
	protected OpalKey<PhaseOpal> createOpalKeyForReloading(PhaseOpal argOpal) {
		Object[] lclValues = argOpal.getNewValues();
		return new IdOpalKey((java.lang.Integer) lclValues[0]);
	}

	@Override
	public com.siliconage.util.Fast3Set<PhaseOpal> forTournamentCodeCollection(java.lang.String argTournamentCode) /* throws PersistenceException */ {
		final Object[] lclParameters = new Object[] { argTournamentCode };
		final String[] lclFieldNames = new String[] { "tournament_code" };
		com.siliconage.util.Fast3Set<PhaseOpal> lclCollection = new com.siliconage.util.Fast3Set<>();
		load(getFullyQualifiedTableName(), lclFieldNames, lclParameters, null, lclCollection);
		return lclCollection;
	}

	@Override
	public PhaseOpal forId(java.lang.Integer argId) throws PersistenceException {
		OpalKey<PhaseOpal> lclOpalKey = new IdOpalKey(argId);
		return forOpalKey(lclOpalKey);
	}

	@Override
	public PhaseOpal forTournamentCodeName(java.lang.String argTournamentCode, java.lang.String argName) throws PersistenceException {
		OpalKey<PhaseOpal> lclOpalKey = new TournamentCodeNameOpalKey(argTournamentCode, argName);
		return forOpalKey(lclOpalKey);
	}

	@Override
	public PhaseOpal forTournamentCodeShortName(java.lang.String argTournamentCode, java.lang.String argShortName) throws PersistenceException {
		OpalKey<PhaseOpal> lclOpalKey = new TournamentCodeShortNameOpalKey(argTournamentCode, argShortName);
		return forOpalKey(lclOpalKey);
	}

	@Override
	protected OpalKey<PhaseOpal> createOpalKeyForRow(ResultSet argRS) throws SQLException {
		return new IdOpalKey(
			OpalUtility.convertTo(java.lang.Integer.class, argRS.getObject("id"))
		);
	}

	/* package */ static class IdOpalKey extends com.opal.SingleValueDatabaseOpalKey<PhaseOpal> {
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

	/* package */ static class TournamentCodeNameOpalKey extends com.opal.MultipleValueDatabaseOpalKey<PhaseOpal> {
		private static final String[] ourKeyColumnNames = new String[] {"tournament_code", "name", };

		public TournamentCodeNameOpalKey(java.lang.String argTournamentCode, java.lang.String argName) {
			super(new Object[] {argTournamentCode, argName, });
		}

		@Override
		public Object[] getParameters() {
			return getFields();
		}

		@Override
		public String[] getColumnNames() { return ourKeyColumnNames; }

	}

	/* package */ static class TournamentCodeShortNameOpalKey extends com.opal.MultipleValueDatabaseOpalKey<PhaseOpal> {
		private static final String[] ourKeyColumnNames = new String[] {"tournament_code", "short_name", };

		public TournamentCodeShortNameOpalKey(java.lang.String argTournamentCode, java.lang.String argShortName) {
			super(new Object[] {argTournamentCode, argShortName, });
		}

		@Override
		public Object[] getParameters() {
			return getFields();
		}

		@Override
		public String[] getColumnNames() { return ourKeyColumnNames; }

	}

	@Override
	public PhaseOpal forUniqueString(String argUniqueString) {
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
