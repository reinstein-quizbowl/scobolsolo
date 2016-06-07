package com.scobolsolo.persistence.postgres;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.opal.OpalCache;
import com.opal.OpalKey;
import com.opal.OpalUtility;
import com.opal.PersistenceException;

import com.scobolsolo.application.Card;
import com.scobolsolo.application.CardImpl;
import com.scobolsolo.persistence.CardOpal;
import com.scobolsolo.persistence.CardOpalFactory;

public class PostgresCardOpalFactory extends com.opal.AbstractDatabaseIdentityOpalFactory<Card, CardOpal> implements CardOpalFactory {
	private static final PostgresCardOpalFactory ourInstance = new PostgresCardOpalFactory();

	public static final PostgresCardOpalFactory getInstance() { return ourInstance; }

	protected PostgresCardOpalFactory() {
		super();
	}

	private static final String[] ourColumnNames = new String[] {
		"id", 
		"name", 
		"short_name", 
		"sequence", 
		"final_message", 
		"phase_id", 
		"initial_player_id", 
	};

	protected static String[] getStaticColumnNames() { return ourColumnNames; }

	@Override
	protected String[] getColumnNames() { return ourColumnNames; }

	private static final String[] ourPrimaryKeyWhereClauseColumns = new String[] {"id",};

	@Override
	protected String[] getFieldNames() { return CardOpal.getStaticFieldNames(); }

	@Override
	protected Class<?>[] getFieldTypes() { return CardOpal.getStaticFieldTypes(); }

	@Override
	protected boolean[] getFieldNullability() { return CardOpal.getStaticFieldNullability(); }

	@Override
	protected com.opal.FieldValidator[] getFieldValidators() { return CardOpal.getStaticFieldValidators(); }

	@Override
	protected javax.sql.DataSource getDataSource() {
		return PostgresOpalFactoryFactory.getSpecificInstance().getDataSource();
	}

	@Override
	protected CardOpal instantiate(Object[] argValues) {
		return new CardOpal(this, argValues);
	}

	@Override
	public CardOpal create() {
		CardOpal lclOpal;
		synchronized (lclOpal = instantiate((Object[]) null)) {
			assert lclOpal.getUserFacing() == null;
			lclOpal.setUserFacing(new CardImpl(lclOpal));
			lclOpal.newObject();
			newObject(lclOpal);
		}
		return lclOpal;
	}

	@Override
	protected void determineUserFacing(CardOpal argO, boolean argConcrete) {
		assert argO != null;
		assert argConcrete == false;
		assert argO.getUserFacing() == null;
		argO.setUserFacing(new CardImpl(argO));
	}

	@Override
	public boolean hasGeneratedKeys() {
		return true;
	}

	@Override
	protected void processGeneratedKeys(java.sql.ResultSet argRS, CardOpal argOpal) {
		try {
			argOpal.setId(argRS.getInt("id"));
		} catch (SQLException lclE) {
			throw new PersistenceException("Could not process generated keys.");
		}
	}

	protected void newObject(@SuppressWarnings("unused") CardOpal argOpal) {
		return;
	}

	@Override
	protected String getFullyQualifiedTableName() {
		return "card";
	}

	@Override
	protected void registerNewOpal(CardOpal argOpal) {
		registerOpal(argOpal, argOpal.getNewValues());
	}

	@Override
	protected void registerOldOpal(CardOpal argOpal) {
		registerOpal(argOpal, argOpal.getOldValues());
	}

	protected void registerOpal(CardOpal argOpal, Object[] argValues) {
		if (argValues == null) { throw new IllegalStateException(); }
		if (argValues.length != 7) { throw new IllegalStateException(); }
		OpalCache<CardOpal> lclOC = getCache();
		synchronized (lclOC) {
			lclOC.addOpal(new NamePhaseIdOpalKey((java.lang.String) argValues[1], (java.lang.Integer) argValues[5]), argOpal, true);
			lclOC.addOpal(new ShortNamePhaseIdOpalKey((java.lang.String) argValues[2], (java.lang.Integer) argValues[5]), argOpal, true);
			lclOC.addOpal(new IdOpalKey((java.lang.Integer) argValues[0]), argOpal, true);
			if (true && argValues[6] != null) {
				lclOC.addOpal(new InitialPlayerIdOpalKey((java.lang.Integer) argValues[6]), argOpal, true);
			}
		}
	}

	@Override
	protected void unregisterOpal(CardOpal argOpal) {
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 7) { throw new IllegalStateException(); }
		OpalCache<CardOpal> lclOC = getCache();
		synchronized (lclOC) {
			lclOC.removeOpal(new NamePhaseIdOpalKey((java.lang.String) lclOldValues[1], (java.lang.Integer) lclOldValues[5]));
			lclOC.removeOpal(new ShortNamePhaseIdOpalKey((java.lang.String) lclOldValues[2], (java.lang.Integer) lclOldValues[5]));
			lclOC.removeOpal(new IdOpalKey((java.lang.Integer) lclOldValues[0]));
			if (true && lclOldValues[6] != null) {
				lclOC.removeOpal(new InitialPlayerIdOpalKey((java.lang.Integer) lclOldValues[6]));
			}
		}
	}

	@Override
	public void updateKeys(CardOpal argOpal) {
		org.apache.commons.lang3.Validate.notNull(argOpal);
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 7) { throw new IllegalStateException(); }
		Object[] lclNewValues = argOpal.getNewValues();
		if (lclNewValues == null) { throw new IllegalStateException(); }
		if (lclNewValues.length != 7) { throw new IllegalStateException(); }
		OpalCache<CardOpal> lclOC = getCache();
		synchronized (lclOC) {
			OpalKey<CardOpal> lclOldKey = null;
			OpalKey<CardOpal> lclNewKey = null;
			if (true) {
				if (!(lclNewValues[1].equals(lclOldValues[1]) && lclNewValues[5].equals(lclOldValues[5]))) {
					lclNewKey = new NamePhaseIdOpalKey((java.lang.String) lclNewValues[1], (java.lang.Integer) lclNewValues[5]);
					if (true) {
						lclOldKey = new NamePhaseIdOpalKey((java.lang.String) lclOldValues[1], (java.lang.Integer) lclOldValues[5]);
					}
				}
			}
			if (lclOldKey != null) { lclOC.removeOpal(lclOldKey); lclOldKey = null; }
			if (lclNewKey != null) { lclOC.addOpal(lclNewKey, argOpal, true); lclNewKey = null; } /* true = SoftReference */
			if (true) {
				if (!(lclNewValues[2].equals(lclOldValues[2]) && lclNewValues[5].equals(lclOldValues[5]))) {
					lclNewKey = new ShortNamePhaseIdOpalKey((java.lang.String) lclNewValues[2], (java.lang.Integer) lclNewValues[5]);
					if (true) {
						lclOldKey = new ShortNamePhaseIdOpalKey((java.lang.String) lclOldValues[2], (java.lang.Integer) lclOldValues[5]);
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
			if (true && lclNewValues[6] != null) {
				if (!(lclNewValues[6].equals(lclOldValues[6]))) {
					lclNewKey = new InitialPlayerIdOpalKey((java.lang.Integer) lclNewValues[6]);
					if (true && lclOldValues[6] != null) {
						lclOldKey = new InitialPlayerIdOpalKey((java.lang.Integer) lclOldValues[6]);
					}
				}
			} else {
				if (true && lclOldValues[6] != null) {
					lclOldKey = new InitialPlayerIdOpalKey((java.lang.Integer) lclOldValues[6]);
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
	protected OpalKey<CardOpal> createOpalKeyForReloading(CardOpal argOpal) {
		Object[] lclValues = argOpal.getNewValues();
		return new IdOpalKey((java.lang.Integer) lclValues[0]);
	}

	@Override
	public java.util.HashSet<CardOpal> forPhaseIdCollection(java.lang.Integer argPhaseId) /* throws PersistenceException */ {
		final Object[] lclParameters = new Object[] { argPhaseId };
		final String[] lclFieldNames = new String[] { "phase_id" };
		java.util.HashSet<CardOpal> lclCollection = new java.util.HashSet<>();
		load(getFullyQualifiedTableName(), lclFieldNames, lclParameters, null, lclCollection);
		return lclCollection;
	}

	@Override
	public CardOpal forNamePhaseId(java.lang.String argName, java.lang.Integer argPhaseId) throws PersistenceException {
		OpalKey<CardOpal> lclOpalKey = new NamePhaseIdOpalKey(argName, argPhaseId);
		return forOpalKey(lclOpalKey);
	}

	@Override
	public CardOpal forShortNamePhaseId(java.lang.String argShortName, java.lang.Integer argPhaseId) throws PersistenceException {
		OpalKey<CardOpal> lclOpalKey = new ShortNamePhaseIdOpalKey(argShortName, argPhaseId);
		return forOpalKey(lclOpalKey);
	}

	@Override
	public CardOpal forId(java.lang.Integer argId) throws PersistenceException {
		OpalKey<CardOpal> lclOpalKey = new IdOpalKey(argId);
		return forOpalKey(lclOpalKey);
	}

	@Override
	public CardOpal forInitialPlayerId(java.lang.Integer argInitialPlayerId) throws PersistenceException {
		OpalKey<CardOpal> lclOpalKey = new InitialPlayerIdOpalKey(argInitialPlayerId);
		return forOpalKey(lclOpalKey);
	}

	@Override
	protected OpalKey<CardOpal> createOpalKeyForRow(ResultSet argRS) throws SQLException {
		return new IdOpalKey(
			OpalUtility.convertTo(java.lang.Integer.class, argRS.getObject("id"))
		);
	}

	/* package */ static class NamePhaseIdOpalKey extends com.opal.MultipleValueDatabaseOpalKey<CardOpal> {
		private static final String[] ourKeyColumnNames = new String[] {"name", "phase_id", };

		public NamePhaseIdOpalKey(java.lang.String argName, java.lang.Integer argPhaseId) {
			super(new Object[] {argName, argPhaseId, });
		}

		@Override
		public Object[] getParameters() {
			return getFields();
		}

		@Override
		public String[] getColumnNames() { return ourKeyColumnNames; }

	}

	/* package */ static class ShortNamePhaseIdOpalKey extends com.opal.MultipleValueDatabaseOpalKey<CardOpal> {
		private static final String[] ourKeyColumnNames = new String[] {"short_name", "phase_id", };

		public ShortNamePhaseIdOpalKey(java.lang.String argShortName, java.lang.Integer argPhaseId) {
			super(new Object[] {argShortName, argPhaseId, });
		}

		@Override
		public Object[] getParameters() {
			return getFields();
		}

		@Override
		public String[] getColumnNames() { return ourKeyColumnNames; }

	}

	/* package */ static class IdOpalKey extends com.opal.SingleValueDatabaseOpalKey<CardOpal> {
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

	/* package */ static class InitialPlayerIdOpalKey extends com.opal.SingleValueDatabaseOpalKey<CardOpal> {
		private static final String[] ourKeyColumnNames = new String[] {"initial_player_id", };

		public InitialPlayerIdOpalKey(java.lang.Integer argInitialPlayerId) {
			super(argInitialPlayerId);
		}

		@Override
		public Object[] getParameters() {
			return new Object[] { getKeyValue(), };
		}

		@Override
		public String[] getColumnNames() { return ourKeyColumnNames; }

	}

	@Override
	public CardOpal forUniqueString(String argUniqueString) {
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
