package com.scobolsolo.persistence.postgres;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.opal.OpalCache;
import com.opal.OpalKey;
import com.opal.OpalUtility;
import com.opal.PersistenceException;

import com.scobolsolo.application.Game;
import com.scobolsolo.persistence.GameImpl;
import com.scobolsolo.persistence.GameOpal;
import com.scobolsolo.persistence.GameOpalFactory;

public class PostgresGameOpalFactory extends com.opal.AbstractDatabaseIdentityOpalFactory<Game, GameOpal> implements GameOpalFactory {
	private static final PostgresGameOpalFactory ourInstance = new PostgresGameOpalFactory();

	public static final PostgresGameOpalFactory getInstance() { return ourInstance; }

	protected PostgresGameOpalFactory() {
		super();
	}

	private static final String[] ourColumnNames = new String[] {
		"id", 
		"tossups_heard", 
		"incoming_winning_card_player_id", 
		"incoming_losing_card_player_id", 
		"outgoing_winning_card_player_id", 
		"outgoing_losing_card_player_id", 
		"moderator_staff_id", 
		"scorekeeper_staff_id", 
	};

	protected static String[] getStaticColumnNames() { return ourColumnNames; }

	@Override
	protected String[] getColumnNames() { return ourColumnNames; }

	private static final String[] ourPrimaryKeyWhereClauseColumns = new String[] {"id",};

	@Override
	protected String[] getFieldNames() { return GameOpal.getStaticFieldNames(); }

	@Override
	protected Class<?>[] getFieldTypes() { return GameOpal.getStaticFieldTypes(); }

	@Override
	protected boolean[] getFieldNullability() { return GameOpal.getStaticFieldNullability(); }

	@Override
	protected com.opal.FieldValidator[] getFieldValidators() { return GameOpal.getStaticFieldValidators(); }

	@Override
	protected javax.sql.DataSource getDataSource() {
		return PostgresOpalFactoryFactory.getSpecificInstance().getDataSource();
	}

	@Override
	protected GameOpal instantiate(Object[] argValues) {
		return new GameOpal(this, argValues);
	}

	@Override
	public GameOpal create() {
		GameOpal lclOpal;
		synchronized (lclOpal = instantiate((Object[]) null)) {
			assert lclOpal.getUserFacing() == null;
			lclOpal.setUserFacing(new GameImpl(lclOpal));
			lclOpal.newObject();
			newObject(lclOpal);
		}
		return lclOpal;
	}

	@Override
	protected void determineUserFacing(GameOpal argO, boolean argConcrete) {
		assert argO != null;
		assert argConcrete == false;
		assert argO.getUserFacing() == null;
		argO.setUserFacing(new GameImpl(argO));
	}

	protected void newObject(@SuppressWarnings("unused") GameOpal argOpal) {
		return;
	}

	@Override
	protected String getFullyQualifiedTableName() {
		return "game";
	}

	@Override
	protected void registerNewOpal(GameOpal argOpal) {
		registerOpal(argOpal, argOpal.getNewValues());
	}

	@Override
	protected void registerOldOpal(GameOpal argOpal) {
		registerOpal(argOpal, argOpal.getOldValues());
	}

	protected void registerOpal(GameOpal argOpal, Object[] argValues) {
		if (argValues == null) { throw new IllegalStateException(); }
		if (argValues.length != 8) { throw new IllegalStateException(); }
		OpalCache<GameOpal> lclOC = getCache();
		synchronized (lclOC) {
			lclOC.addOpal(new IdOpalKey((java.lang.Integer) argValues[0]), argOpal, true);
		}
	}

	@Override
	protected void unregisterOpal(GameOpal argOpal) {
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 8) { throw new IllegalStateException(); }
		OpalCache<GameOpal> lclOC = getCache();
		synchronized (lclOC) {
			lclOC.removeOpal(new IdOpalKey((java.lang.Integer) lclOldValues[0]));
		}
	}

	@Override
	public void updateKeys(GameOpal argOpal) {
		org.apache.commons.lang3.Validate.notNull(argOpal);
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 8) { throw new IllegalStateException(); }
		Object[] lclNewValues = argOpal.getNewValues();
		if (lclNewValues == null) { throw new IllegalStateException(); }
		if (lclNewValues.length != 8) { throw new IllegalStateException(); }
		OpalCache<GameOpal> lclOC = getCache();
		synchronized (lclOC) {
			OpalKey<GameOpal> lclOldKey = null;
			OpalKey<GameOpal> lclNewKey = null;
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
	protected OpalKey<GameOpal> createOpalKeyForReloading(GameOpal argOpal) {
		Object[] lclValues = argOpal.getNewValues();
		return new IdOpalKey((java.lang.Integer) lclValues[0]);
	}

	@Override
	public java.util.HashSet<GameOpal> forModeratorStaffIdCollection(java.lang.Integer argModeratorStaffId) /* throws PersistenceException */ {
		final Object[] lclParameters = new Object[] { argModeratorStaffId };
		final String[] lclFieldNames = new String[] { "moderator_staff_id" };
		java.util.HashSet<GameOpal> lclCollection = new java.util.HashSet<>();
		load(getFullyQualifiedTableName(), lclFieldNames, lclParameters, null, lclCollection);
		return lclCollection;
	}

	@Override
	public java.util.HashSet<GameOpal> forOutgoingLosingCardPlayerIdCollection(java.lang.Integer argOutgoingLosingCardPlayerId) /* throws PersistenceException */ {
		final Object[] lclParameters = new Object[] { argOutgoingLosingCardPlayerId };
		final String[] lclFieldNames = new String[] { "outgoing_losing_card_player_id" };
		java.util.HashSet<GameOpal> lclCollection = new java.util.HashSet<>();
		load(getFullyQualifiedTableName(), lclFieldNames, lclParameters, null, lclCollection);
		return lclCollection;
	}

	@Override
	public java.util.HashSet<GameOpal> forOutgoingWinningCardPlayerIdCollection(java.lang.Integer argOutgoingWinningCardPlayerId) /* throws PersistenceException */ {
		final Object[] lclParameters = new Object[] { argOutgoingWinningCardPlayerId };
		final String[] lclFieldNames = new String[] { "outgoing_winning_card_player_id" };
		java.util.HashSet<GameOpal> lclCollection = new java.util.HashSet<>();
		load(getFullyQualifiedTableName(), lclFieldNames, lclParameters, null, lclCollection);
		return lclCollection;
	}

	@Override
	public java.util.HashSet<GameOpal> forIncomingLosingCardPlayerIdCollection(java.lang.Integer argIncomingLosingCardPlayerId) /* throws PersistenceException */ {
		final Object[] lclParameters = new Object[] { argIncomingLosingCardPlayerId };
		final String[] lclFieldNames = new String[] { "incoming_losing_card_player_id" };
		java.util.HashSet<GameOpal> lclCollection = new java.util.HashSet<>();
		load(getFullyQualifiedTableName(), lclFieldNames, lclParameters, null, lclCollection);
		return lclCollection;
	}

	@Override
	public java.util.HashSet<GameOpal> forIncomingWinningCardPlayerIdCollection(java.lang.Integer argIncomingWinningCardPlayerId) /* throws PersistenceException */ {
		final Object[] lclParameters = new Object[] { argIncomingWinningCardPlayerId };
		final String[] lclFieldNames = new String[] { "incoming_winning_card_player_id" };
		java.util.HashSet<GameOpal> lclCollection = new java.util.HashSet<>();
		load(getFullyQualifiedTableName(), lclFieldNames, lclParameters, null, lclCollection);
		return lclCollection;
	}

	@Override
	public java.util.HashSet<GameOpal> forScorekeeperStaffIdCollection(java.lang.Integer argScorekeeperStaffId) /* throws PersistenceException */ {
		final Object[] lclParameters = new Object[] { argScorekeeperStaffId };
		final String[] lclFieldNames = new String[] { "scorekeeper_staff_id" };
		java.util.HashSet<GameOpal> lclCollection = new java.util.HashSet<>();
		load(getFullyQualifiedTableName(), lclFieldNames, lclParameters, null, lclCollection);
		return lclCollection;
	}

	@Override
	public GameOpal forId(java.lang.Integer argId) throws PersistenceException {
		OpalKey<GameOpal> lclOpalKey = new IdOpalKey(argId);
		return forOpalKey(lclOpalKey);
	}

	@Override
	protected OpalKey<GameOpal> createOpalKeyForRow(ResultSet argRS) throws SQLException {
		return new IdOpalKey(
			OpalUtility.convertTo(java.lang.Integer.class, argRS.getObject("id"))
		);
	}

	/* package */ static class IdOpalKey extends com.opal.SingleValueDatabaseOpalKey<GameOpal> {
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
	public GameOpal forUniqueString(String argUniqueString) {
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
