package com.scobolsolo.persistence.postgres;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.opal.OpalCache;
import com.opal.OpalKey;
import com.opal.OpalUtility;
import com.opal.PersistenceException;

import com.scobolsolo.application.Packet;
import com.scobolsolo.persistence.PacketImpl;
import com.scobolsolo.persistence.PacketOpal;
import com.scobolsolo.persistence.PacketOpalFactory;

public class PostgresPacketOpalFactory extends com.opal.AbstractDatabaseIdentityOpalFactory<Packet, PacketOpal> implements PacketOpalFactory {
	private static final PostgresPacketOpalFactory ourInstance = new PostgresPacketOpalFactory();

	public static final PostgresPacketOpalFactory getInstance() { return ourInstance; }

	protected PostgresPacketOpalFactory() {
		super();
	}

	private static final String[] ourColumnNames = new String[] {
		"id", 
		"name", 
		"short_name", 
		"round_id", 
		"note", 
		"tournament_code", 
		"sequence", 
		"replacement_packet_id", 
		"questions_public", 
	};

	protected static String[] getStaticColumnNames() { return ourColumnNames; }

	@Override
	protected String[] getColumnNames() { return ourColumnNames; }

	private static final String[] ourPrimaryKeyWhereClauseColumns = new String[] {"id",};

	@Override
	protected String[] getFieldNames() { return PacketOpal.getStaticFieldNames(); }

	@Override
	protected Class<?>[] getFieldTypes() { return PacketOpal.getStaticFieldTypes(); }

	@Override
	protected boolean[] getFieldNullability() { return PacketOpal.getStaticFieldNullability(); }

	@Override
	protected com.opal.FieldValidator[] getFieldValidators() { return PacketOpal.getStaticFieldValidators(); }

	@Override
	protected javax.sql.DataSource getDataSource() {
		return PostgresOpalFactoryFactory.getSpecificInstance().getDataSource();
	}

	@Override
	protected PacketOpal instantiate(Object[] argValues) {
		return new PacketOpal(this, argValues);
	}

	@Override
	public PacketOpal create() {
		PacketOpal lclOpal;
		synchronized (lclOpal = instantiate((Object[]) null)) {
			assert lclOpal.getUserFacing() == null;
			lclOpal.setUserFacing(new PacketImpl(lclOpal));
			lclOpal.newObject();
			newObject(lclOpal);
		}
		return lclOpal;
	}

	@Override
	protected void determineUserFacing(PacketOpal argO, boolean argConcrete) {
		assert argO != null;
		assert argConcrete == false;
		assert argO.getUserFacing() == null;
		argO.setUserFacing(new PacketImpl(argO));
	}

	@Override
	public boolean hasGeneratedKeys() {
		return true;
	}

	@Override
	protected void processGeneratedKeys(java.sql.ResultSet argRS, PacketOpal argOpal) {
		try {
			argOpal.setId(argRS.getInt("id"));
		} catch (SQLException lclE) {
			throw new PersistenceException("Could not process generated keys.");
		}
	}

	protected void newObject(@SuppressWarnings("unused") PacketOpal argOpal) {
		return;
	}

	@Override
	protected String getFullyQualifiedTableName() {
		return "packet";
	}

	@Override
	protected void registerNewOpal(PacketOpal argOpal) {
		registerOpal(argOpal, argOpal.getNewValues());
	}

	@Override
	protected void registerOldOpal(PacketOpal argOpal) {
		registerOpal(argOpal, argOpal.getOldValues());
	}

	protected void registerOpal(PacketOpal argOpal, Object[] argValues) {
		if (argValues == null) { throw new IllegalStateException(); }
		if (argValues.length != 9) { throw new IllegalStateException(); }
		OpalCache<PacketOpal> lclOC = getCache();
		synchronized (lclOC) {
			lclOC.addOpal(new IdOpalKey((java.lang.Integer) argValues[0]), argOpal, true);
			lclOC.addOpal(new TournamentCodeNameOpalKey((java.lang.String) argValues[5], (java.lang.String) argValues[1]), argOpal, true);
			if (true && argValues[3] != null) {
				lclOC.addOpal(new RoundIdOpalKey((java.lang.Integer) argValues[3]), argOpal, true);
			}
			lclOC.addOpal(new TournamentCodeShortNameOpalKey((java.lang.String) argValues[5], (java.lang.String) argValues[2]), argOpal, true);
		}
	}

	@Override
	protected void unregisterOpal(PacketOpal argOpal) {
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 9) { throw new IllegalStateException(); }
		OpalCache<PacketOpal> lclOC = getCache();
		synchronized (lclOC) {
			lclOC.removeOpal(new IdOpalKey((java.lang.Integer) lclOldValues[0]));
			lclOC.removeOpal(new TournamentCodeNameOpalKey((java.lang.String) lclOldValues[5], (java.lang.String) lclOldValues[1]));
			if (true && lclOldValues[3] != null) {
				lclOC.removeOpal(new RoundIdOpalKey((java.lang.Integer) lclOldValues[3]));
			}
			lclOC.removeOpal(new TournamentCodeShortNameOpalKey((java.lang.String) lclOldValues[5], (java.lang.String) lclOldValues[2]));
		}
	}

	@Override
	public void updateKeys(PacketOpal argOpal) {
		org.apache.commons.lang3.Validate.notNull(argOpal);
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 9) { throw new IllegalStateException(); }
		Object[] lclNewValues = argOpal.getNewValues();
		if (lclNewValues == null) { throw new IllegalStateException(); }
		if (lclNewValues.length != 9) { throw new IllegalStateException(); }
		OpalCache<PacketOpal> lclOC = getCache();
		synchronized (lclOC) {
			OpalKey<PacketOpal> lclOldKey = null;
			OpalKey<PacketOpal> lclNewKey = null;
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
				if (!(lclNewValues[5].equals(lclOldValues[5]) && lclNewValues[1].equals(lclOldValues[1]))) {
					lclNewKey = new TournamentCodeNameOpalKey((java.lang.String) lclNewValues[5], (java.lang.String) lclNewValues[1]);
					if (true) {
						lclOldKey = new TournamentCodeNameOpalKey((java.lang.String) lclOldValues[5], (java.lang.String) lclOldValues[1]);
					}
				}
			}
			if (lclOldKey != null) { lclOC.removeOpal(lclOldKey); lclOldKey = null; }
			if (lclNewKey != null) { lclOC.addOpal(lclNewKey, argOpal, true); lclNewKey = null; } /* true = SoftReference */
			if (true && lclNewValues[3] != null) {
				if (!(lclNewValues[3].equals(lclOldValues[3]))) {
					lclNewKey = new RoundIdOpalKey((java.lang.Integer) lclNewValues[3]);
					if (true && lclOldValues[3] != null) {
						lclOldKey = new RoundIdOpalKey((java.lang.Integer) lclOldValues[3]);
					}
				}
			} else {
				if (true && lclOldValues[3] != null) {
					lclOldKey = new RoundIdOpalKey((java.lang.Integer) lclOldValues[3]);
				}
			}
			if (lclOldKey != null) { lclOC.removeOpal(lclOldKey); lclOldKey = null; }
			if (lclNewKey != null) { lclOC.addOpal(lclNewKey, argOpal, true); lclNewKey = null; } /* true = SoftReference */
			if (true) {
				if (!(lclNewValues[5].equals(lclOldValues[5]) && lclNewValues[2].equals(lclOldValues[2]))) {
					lclNewKey = new TournamentCodeShortNameOpalKey((java.lang.String) lclNewValues[5], (java.lang.String) lclNewValues[2]);
					if (true) {
						lclOldKey = new TournamentCodeShortNameOpalKey((java.lang.String) lclOldValues[5], (java.lang.String) lclOldValues[2]);
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
	protected OpalKey<PacketOpal> createOpalKeyForReloading(PacketOpal argOpal) {
		Object[] lclValues = argOpal.getNewValues();
		return new IdOpalKey((java.lang.Integer) lclValues[0]);
	}

	@Override
	public java.util.HashSet<PacketOpal> forReplacementPacketIdCollection(java.lang.Integer argReplacementPacketId) /* throws PersistenceException */ {
		final Object[] lclParameters = new Object[] { argReplacementPacketId };
		final String[] lclFieldNames = new String[] { "replacement_packet_id" };
		java.util.HashSet<PacketOpal> lclCollection = new java.util.HashSet<>();
		load(getFullyQualifiedTableName(), lclFieldNames, lclParameters, null, lclCollection);
		return lclCollection;
	}

	@Override
	public java.util.HashSet<PacketOpal> forTournamentCodeCollection(java.lang.String argTournamentCode) /* throws PersistenceException */ {
		final Object[] lclParameters = new Object[] { argTournamentCode };
		final String[] lclFieldNames = new String[] { "tournament_code" };
		java.util.HashSet<PacketOpal> lclCollection = new java.util.HashSet<>();
		load(getFullyQualifiedTableName(), lclFieldNames, lclParameters, null, lclCollection);
		return lclCollection;
	}

	@Override
	public PacketOpal forId(java.lang.Integer argId) throws PersistenceException {
		OpalKey<PacketOpal> lclOpalKey = new IdOpalKey(argId);
		return forOpalKey(lclOpalKey);
	}

	@Override
	public PacketOpal forTournamentCodeName(java.lang.String argTournamentCode, java.lang.String argName) throws PersistenceException {
		OpalKey<PacketOpal> lclOpalKey = new TournamentCodeNameOpalKey(argTournamentCode, argName);
		return forOpalKey(lclOpalKey);
	}

	@Override
	public PacketOpal forRoundId(java.lang.Integer argRoundId) throws PersistenceException {
		OpalKey<PacketOpal> lclOpalKey = new RoundIdOpalKey(argRoundId);
		return forOpalKey(lclOpalKey);
	}

	@Override
	public PacketOpal forTournamentCodeShortName(java.lang.String argTournamentCode, java.lang.String argShortName) throws PersistenceException {
		OpalKey<PacketOpal> lclOpalKey = new TournamentCodeShortNameOpalKey(argTournamentCode, argShortName);
		return forOpalKey(lclOpalKey);
	}

	@Override
	protected OpalKey<PacketOpal> createOpalKeyForRow(ResultSet argRS) throws SQLException {
		return new IdOpalKey(
			OpalUtility.convertTo(java.lang.Integer.class, argRS.getObject("id"))
		);
	}

	/* package */ static class IdOpalKey extends com.opal.SingleValueDatabaseOpalKey<PacketOpal> {
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

	/* package */ static class TournamentCodeNameOpalKey extends com.opal.MultipleValueDatabaseOpalKey<PacketOpal> {
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

	/* package */ static class RoundIdOpalKey extends com.opal.SingleValueDatabaseOpalKey<PacketOpal> {
		private static final String[] ourKeyColumnNames = new String[] {"round_id", };

		public RoundIdOpalKey(java.lang.Integer argRoundId) {
			super(argRoundId);
		}

		@Override
		public Object[] getParameters() {
			return new Object[] { getKeyValue(), };
		}

		@Override
		public String[] getColumnNames() { return ourKeyColumnNames; }

	}

	/* package */ static class TournamentCodeShortNameOpalKey extends com.opal.MultipleValueDatabaseOpalKey<PacketOpal> {
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
	public PacketOpal forUniqueString(String argUniqueString) {
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
