package com.scobolsolo.persistence.postgres;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.opal.*;
import com.scobolsolo.application.Match;
import com.scobolsolo.application.MatchImpl;
import com.scobolsolo.persistence.MatchOpal;
import com.scobolsolo.persistence.MatchOpalFactory;

public class PostgresMatchOpalFactory extends com.opal.AbstractDatabaseIdentityOpalFactory<Match, MatchOpal> implements MatchOpalFactory {
	private static final PostgresMatchOpalFactory ourInstance = new PostgresMatchOpalFactory();

	public static final PostgresMatchOpalFactory getInstance() { return ourInstance; }

	protected PostgresMatchOpalFactory() {
		super();
	}

	private static final String[] ourColumnNames = new String[] {
		"id", 
		"round_id", 
		"room_id", 
		"winning_card_id", 
		"losing_card_id", 
	};

	protected static String[] getStaticColumnNames() { return ourColumnNames; }

	@Override
	protected String[] getColumnNames() { return ourColumnNames; }

	private static final String[] ourPrimaryKeyWhereClauseColumns = new String[] {"id",};

	@Override
	protected String[] getFieldNames() { return MatchOpal.getStaticFieldNames(); }

	@Override
	protected Class<?>[] getFieldTypes() { return MatchOpal.getStaticFieldTypes(); }

	@Override
	protected boolean[] getFieldNullability() { return MatchOpal.getStaticFieldNullability(); }

	@Override
	protected com.opal.FieldValidator[] getFieldValidators() { return MatchOpal.getStaticFieldValidators(); }


	@Override
	protected javax.sql.DataSource getDataSource() {
		return PostgresOpalFactoryFactory.getSpecificInstance().getDataSource();
	}

	@Override
	protected MatchOpal instantiate(Object[] argValues) {
		return new MatchOpal(this, argValues);
	}

	@Override
	public MatchOpal create() {
		MatchOpal lclOpal;
		synchronized (lclOpal = instantiate((Object[]) null)) {
			assert lclOpal.getUserFacing() == null;
			lclOpal.setUserFacing(new MatchImpl(lclOpal));
			lclOpal.newObject();
			newObject(lclOpal);
		}
		return lclOpal;
	}

	@Override
	protected void determineUserFacing(MatchOpal argO, boolean argConcrete) {
		assert argO != null;
		assert argConcrete == false;
		assert argO.getUserFacing() == null;
		argO.setUserFacing(new MatchImpl(argO));
	}

	@Override
	public boolean hasGeneratedKeys() {
		return true;
	}

	@Override
	protected void processGeneratedKeys(java.sql.ResultSet argRS, MatchOpal argOpal) {
		try {
			argOpal.setId(argRS.getInt("id"));
		} catch (SQLException lclE) {
			throw new PersistenceException("Could not process generated keys.");
		}
	}

	protected void newObject(@SuppressWarnings("unused") MatchOpal argOpal) {
		return;
	}

	@Override
	protected String getFullyQualifiedTableName() {
		return "match";
	}

	@Override
	protected void registerNewOpal(MatchOpal argOpal) {
		registerOpal(argOpal, argOpal.getNewValues());
	}

	@Override
	protected void registerOldOpal(MatchOpal argOpal) {
		registerOpal(argOpal, argOpal.getOldValues());
	}

	protected void registerOpal(MatchOpal argOpal, Object[] argValues) {
		if (argValues == null) { throw new IllegalStateException(); }
		if (argValues.length != 5) { throw new IllegalStateException(); }
		OpalCache lclOC = getOpalCache();
		synchronized (lclOC) {
			lclOC.addOpal(new IdOpalKey((java.lang.Integer) argValues[0]), argOpal, true);
			if (true && argValues[4] != null) {
				lclOC.addOpal(new RoundIdLosingCardIdOpalKey((java.lang.Integer) argValues[1], (java.lang.Integer) argValues[4]), argOpal, true);
			}
			lclOC.addOpal(new RoundIdRoomIdOpalKey((java.lang.Integer) argValues[1], (java.lang.Integer) argValues[2]), argOpal, true);
			if (true && argValues[3] != null) {
				lclOC.addOpal(new RoundIdWinningCardIdOpalKey((java.lang.Integer) argValues[1], (java.lang.Integer) argValues[3]), argOpal, true);
			}
		}
	}

	@Override
	protected void unregisterOpal(MatchOpal argOpal) {
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 5) { throw new IllegalStateException(); }
		OpalCache lclOC = getOpalCache();
		synchronized (lclOC) {
			lclOC.removeOpal(new IdOpalKey((java.lang.Integer) lclOldValues[0]));
			if (true && lclOldValues[4] != null) {
				lclOC.removeOpal(new RoundIdLosingCardIdOpalKey((java.lang.Integer) lclOldValues[1], (java.lang.Integer) lclOldValues[4]));
			}
			lclOC.removeOpal(new RoundIdRoomIdOpalKey((java.lang.Integer) lclOldValues[1], (java.lang.Integer) lclOldValues[2]));
			if (true && lclOldValues[3] != null) {
				lclOC.removeOpal(new RoundIdWinningCardIdOpalKey((java.lang.Integer) lclOldValues[1], (java.lang.Integer) lclOldValues[3]));
			}
		}
	}

	@Override
	public void updateKeys(MatchOpal argOpal) {
		org.apache.commons.lang3.Validate.notNull(argOpal);
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 5) { throw new IllegalStateException(); }
		Object[] lclNewValues = argOpal.getNewValues();
		if (lclNewValues == null) { throw new IllegalStateException(); }
		if (lclNewValues.length != 5) { throw new IllegalStateException(); }
		OpalCache lclOC = getOpalCache();
		synchronized (lclOC) {
			OpalKey<MatchOpal> lclOldKey = null;
			OpalKey<MatchOpal> lclNewKey = null;
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
			if (true && lclNewValues[4] != null) {
				if (!(lclNewValues[1].equals(lclOldValues[1]) && lclNewValues[4].equals(lclOldValues[4]))) {
					lclNewKey = new RoundIdLosingCardIdOpalKey((java.lang.Integer) lclNewValues[1], (java.lang.Integer) lclNewValues[4]);
					if (true && lclOldValues[4] != null) {
						lclOldKey = new RoundIdLosingCardIdOpalKey((java.lang.Integer) lclOldValues[1], (java.lang.Integer) lclOldValues[4]);
					}
				}
			} else {
				if (true && lclOldValues[4] != null) {
					lclOldKey = new RoundIdLosingCardIdOpalKey((java.lang.Integer) lclOldValues[1], (java.lang.Integer) lclOldValues[4]);
				}
			}
			if (lclOldKey != null) { lclOC.removeOpal(lclOldKey); lclOldKey = null; }
			if (lclNewKey != null) { lclOC.addOpal(lclNewKey, argOpal, true); lclNewKey = null; } /* true = SoftReference */
			if (true) {
				if (!(lclNewValues[1].equals(lclOldValues[1]) && lclNewValues[2].equals(lclOldValues[2]))) {
					lclNewKey = new RoundIdRoomIdOpalKey((java.lang.Integer) lclNewValues[1], (java.lang.Integer) lclNewValues[2]);
					if (true) {
						lclOldKey = new RoundIdRoomIdOpalKey((java.lang.Integer) lclOldValues[1], (java.lang.Integer) lclOldValues[2]);
					}
				}
			}
			if (lclOldKey != null) { lclOC.removeOpal(lclOldKey); lclOldKey = null; }
			if (lclNewKey != null) { lclOC.addOpal(lclNewKey, argOpal, true); lclNewKey = null; } /* true = SoftReference */
			if (true && lclNewValues[3] != null) {
				if (!(lclNewValues[1].equals(lclOldValues[1]) && lclNewValues[3].equals(lclOldValues[3]))) {
					lclNewKey = new RoundIdWinningCardIdOpalKey((java.lang.Integer) lclNewValues[1], (java.lang.Integer) lclNewValues[3]);
					if (true && lclOldValues[3] != null) {
						lclOldKey = new RoundIdWinningCardIdOpalKey((java.lang.Integer) lclOldValues[1], (java.lang.Integer) lclOldValues[3]);
					}
				}
			} else {
				if (true && lclOldValues[3] != null) {
					lclOldKey = new RoundIdWinningCardIdOpalKey((java.lang.Integer) lclOldValues[1], (java.lang.Integer) lclOldValues[3]);
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
	protected OpalKey<MatchOpal> createOpalKeyForReloading(MatchOpal argOpal) {
		Object[] lclValues = argOpal.getNewValues();
		return new IdOpalKey((java.lang.Integer) lclValues[0]);
	}

	@Override
	public java.util.HashSet<MatchOpal> forLosingCardIdCollection(java.lang.Integer argLosingCardId) /* throws PersistenceException */ {
		final Object[] lclParameters = new Object[] { argLosingCardId };
		final String[] lclFieldNames = new String[] { "losing_card_id" };
		java.util.HashSet<MatchOpal> lclCollection = new java.util.HashSet<>();
		load(getFullyQualifiedTableName(), lclFieldNames, lclParameters, null, lclCollection);
		return lclCollection;
	}

	@Override
	public java.util.HashSet<MatchOpal> forRoomIdCollection(java.lang.Integer argRoomId) /* throws PersistenceException */ {
		final Object[] lclParameters = new Object[] { argRoomId };
		final String[] lclFieldNames = new String[] { "room_id" };
		java.util.HashSet<MatchOpal> lclCollection = new java.util.HashSet<>();
		load(getFullyQualifiedTableName(), lclFieldNames, lclParameters, null, lclCollection);
		return lclCollection;
	}

	@Override
	public java.util.HashSet<MatchOpal> forRoundIdCollection(java.lang.Integer argRoundId) /* throws PersistenceException */ {
		final Object[] lclParameters = new Object[] { argRoundId };
		final String[] lclFieldNames = new String[] { "round_id" };
		java.util.HashSet<MatchOpal> lclCollection = new java.util.HashSet<>();
		load(getFullyQualifiedTableName(), lclFieldNames, lclParameters, null, lclCollection);
		return lclCollection;
	}

	@Override
	public java.util.HashSet<MatchOpal> forWinningCardIdCollection(java.lang.Integer argWinningCardId) /* throws PersistenceException */ {
		final Object[] lclParameters = new Object[] { argWinningCardId };
		final String[] lclFieldNames = new String[] { "winning_card_id" };
		java.util.HashSet<MatchOpal> lclCollection = new java.util.HashSet<>();
		load(getFullyQualifiedTableName(), lclFieldNames, lclParameters, null, lclCollection);
		return lclCollection;
	}

	@Override
	public MatchOpal forId(java.lang.Integer argId) throws PersistenceException {
		OpalKey<MatchOpal> lclOpalKey = new IdOpalKey(argId);
		return forOpalKey(lclOpalKey);
	}

	@Override
	public MatchOpal forRoundIdLosingCardId(java.lang.Integer argRoundId, java.lang.Integer argLosingCardId) throws PersistenceException {
		OpalKey<MatchOpal> lclOpalKey = new RoundIdLosingCardIdOpalKey(argRoundId, argLosingCardId);
		return forOpalKey(lclOpalKey);
	}

	@Override
	public MatchOpal forRoundIdRoomId(java.lang.Integer argRoundId, java.lang.Integer argRoomId) throws PersistenceException {
		OpalKey<MatchOpal> lclOpalKey = new RoundIdRoomIdOpalKey(argRoundId, argRoomId);
		return forOpalKey(lclOpalKey);
	}

	@Override
	public MatchOpal forRoundIdWinningCardId(java.lang.Integer argRoundId, java.lang.Integer argWinningCardId) throws PersistenceException {
		OpalKey<MatchOpal> lclOpalKey = new RoundIdWinningCardIdOpalKey(argRoundId, argWinningCardId);
		return forOpalKey(lclOpalKey);
	}

	@Override
	protected OpalKey<MatchOpal> createOpalKeyForRow(ResultSet argRS) throws SQLException {
		return new IdOpalKey(
			OpalUtility.convertTo(java.lang.Integer.class, argRS.getObject("id"))
		);
	}

	/* package */ static class IdOpalKey extends com.opal.DatabaseOpalKey<MatchOpal> {
		private static final String[] ourKeyColumnNames = new String[] {"id", };

		public IdOpalKey(java.lang.Integer argId) {
			super(new Object[] {argId, });
		}

		@Override
		protected Object[] getParameters() { return getFields(); }

		@Override
		protected String[] getColumnNames() { return ourKeyColumnNames; }

	}

	/* package */ static class RoundIdLosingCardIdOpalKey extends com.opal.DatabaseOpalKey<MatchOpal> {
		private static final String[] ourKeyColumnNames = new String[] {"round_id", "losing_card_id", };

		public RoundIdLosingCardIdOpalKey(java.lang.Integer argRoundId, java.lang.Integer argLosingCardId) {
			super(new Object[] {argRoundId, argLosingCardId, });
		}

		@Override
		protected Object[] getParameters() { return getFields(); }

		@Override
		protected String[] getColumnNames() { return ourKeyColumnNames; }

	}

	/* package */ static class RoundIdRoomIdOpalKey extends com.opal.DatabaseOpalKey<MatchOpal> {
		private static final String[] ourKeyColumnNames = new String[] {"round_id", "room_id", };

		public RoundIdRoomIdOpalKey(java.lang.Integer argRoundId, java.lang.Integer argRoomId) {
			super(new Object[] {argRoundId, argRoomId, });
		}

		@Override
		protected Object[] getParameters() { return getFields(); }

		@Override
		protected String[] getColumnNames() { return ourKeyColumnNames; }

	}

	/* package */ static class RoundIdWinningCardIdOpalKey extends com.opal.DatabaseOpalKey<MatchOpal> {
		private static final String[] ourKeyColumnNames = new String[] {"round_id", "winning_card_id", };

		public RoundIdWinningCardIdOpalKey(java.lang.Integer argRoundId, java.lang.Integer argWinningCardId) {
			super(new Object[] {argRoundId, argWinningCardId, });
		}

		@Override
		protected Object[] getParameters() { return getFields(); }

		@Override
		protected String[] getColumnNames() { return ourKeyColumnNames; }

	}

	@Override
	public MatchOpal forUniqueString(String argUniqueString) {
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
