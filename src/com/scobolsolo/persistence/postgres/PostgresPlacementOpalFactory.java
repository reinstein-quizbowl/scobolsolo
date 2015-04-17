package com.scobolsolo.persistence.postgres;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.opal.*;
import com.scobolsolo.application.Placement;
import com.scobolsolo.application.PlacementImpl;
import com.scobolsolo.persistence.PlacementOpal;
import com.scobolsolo.persistence.PlacementOpalFactory;

public class PostgresPlacementOpalFactory extends com.opal.AbstractDatabaseIdentityOpalFactory<Placement, PlacementOpal> implements PlacementOpalFactory {
	private static final PostgresPlacementOpalFactory ourInstance = new PostgresPlacementOpalFactory();

	public static final PostgresPlacementOpalFactory getInstance() { return ourInstance; }

	protected PostgresPlacementOpalFactory() {
		super();
	}

	private static final String[] ourColumnNames = new String[] {
		"id", 
		"question_id", 
		"packet_id", 
		"sequence", 
		"tiebreaker", 
		"scorecheck_after", 
	};

	protected static String[] getStaticColumnNames() { return ourColumnNames; }

	@Override
	protected String[] getColumnNames() { return ourColumnNames; }

	private static final String[] ourPrimaryKeyWhereClauseColumns = new String[] {"id",};

	@Override
	protected String[] getFieldNames() { return PlacementOpal.getStaticFieldNames(); }

	@Override
	protected Class<?>[] getFieldTypes() { return PlacementOpal.getStaticFieldTypes(); }

	@Override
	protected boolean[] getFieldNullability() { return PlacementOpal.getStaticFieldNullability(); }

	@Override
	protected com.opal.FieldValidator[] getFieldValidators() { return PlacementOpal.getStaticFieldValidators(); }


	@Override
	protected javax.sql.DataSource getDataSource() {
		return PostgresOpalFactoryFactory.getSpecificInstance().getDataSource();
	}

	@Override
	protected PlacementOpal instantiate(Object[] argValues) {
		return new PlacementOpal(this, argValues);
	}

	@Override
	public PlacementOpal create(Placement argUF) {
		assert argUF != null;
		PlacementOpal lclOpal;
		synchronized (lclOpal = instantiate((Object[]) null/*, argUF */)) {
			assert lclOpal.getUserFacing() == null;
			lclOpal.setUserFacing(argUF);
			lclOpal.newObject();
			newObject(lclOpal);
		}
		return lclOpal;
	}

	@Override
	public PlacementOpal create() {
		PlacementOpal lclOpal;
		synchronized (lclOpal = instantiate((Object[]) null)) {
			assert lclOpal.getUserFacing() == null;
			lclOpal.setUserFacing(new PlacementImpl(lclOpal));
			lclOpal.newObject();
			newObject(lclOpal);
		}
		return lclOpal;
	}

	@Override
	protected void determineUserFacing(PlacementOpal argO, boolean argConcrete) {
		assert argO != null;
		assert argConcrete == false;
		assert argO.getUserFacing() == null;
		argO.setUserFacing(new PlacementImpl(argO));
	}

	@Override
	protected void afterInsert(TransactionParameter argTP, PlacementOpal argOpal) throws PersistenceException {
		assert argTP != null;
		assert argOpal != null;
		try {
			argOpal.setId(
				com.siliconage.database.DatabaseUtility.executeIntQuery(
					((DatabaseTransactionParameter) argTP).getConnection(),
					"SELECT last_value FROM placement_id_seq AS id_value",
					null
				)
			);
			return;
		} catch (SQLException lclE) {
			throw new PersistenceException("Unable to retrieve last value for sequence column placement_id_seq", lclE);
		}
	}

	protected void newObject(@SuppressWarnings("unused") PlacementOpal argOpal) {
		return;
	}

	@Override
	protected String getFullyQualifiedTableName() {
		return "placement";
	}

	@Override
	protected void registerNewOpal(PlacementOpal argOpal) {
		registerOpal(argOpal, argOpal.getNewValues());
	}

	@Override
	protected void registerOldOpal(PlacementOpal argOpal) {
		registerOpal(argOpal, argOpal.getOldValues());
	}

	protected void registerOpal(PlacementOpal argOpal, Object[] argValues) {
		if (argValues == null) { throw new IllegalStateException(); }
		if (argValues.length != 6) { throw new IllegalStateException(); }
		OpalCache lclOC = getOpalCache();
		synchronized (lclOC) {
			lclOC.addOpal(new IdOpalKey((java.lang.Integer) argValues[0]), argOpal, true);
			lclOC.addOpal(new QuestionIdPacketIdOpalKey((java.lang.Integer) argValues[1], (java.lang.Integer) argValues[2]), argOpal, true);
		}
	}

	@Override
	protected void unregisterOpal(PlacementOpal argOpal) {
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 6) { throw new IllegalStateException(); }
		OpalCache lclOC = getOpalCache();
		synchronized (lclOC) {
			lclOC.removeOpal(new IdOpalKey((java.lang.Integer) lclOldValues[0]));
			lclOC.removeOpal(new QuestionIdPacketIdOpalKey((java.lang.Integer) lclOldValues[1], (java.lang.Integer) lclOldValues[2]));
		}
	}

	@Override
	public void updateKeys(PlacementOpal argOpal) {
		org.apache.commons.lang3.Validate.notNull(argOpal);
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 6) { throw new IllegalStateException(); }
		Object[] lclNewValues = argOpal.getNewValues();
		if (lclNewValues == null) { throw new IllegalStateException(); }
		if (lclNewValues.length != 6) { throw new IllegalStateException(); }
		OpalCache lclOC = getOpalCache();
		synchronized (lclOC) {
			OpalKey<PlacementOpal> lclOldKey = null;
			OpalKey<PlacementOpal> lclNewKey = null;
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
					lclNewKey = new QuestionIdPacketIdOpalKey((java.lang.Integer) lclNewValues[1], (java.lang.Integer) lclNewValues[2]);
					if (true) {
						lclOldKey = new QuestionIdPacketIdOpalKey((java.lang.Integer) lclOldValues[1], (java.lang.Integer) lclOldValues[2]);
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
	protected OpalKey<PlacementOpal> createOpalKeyForReloading(PlacementOpal argOpal) {
		Object[] lclValues = argOpal.getNewValues();
		return new IdOpalKey((java.lang.Integer) lclValues[0]);
	}

	@Override
	public java.util.HashSet<PlacementOpal> forPacketIdCollection(java.lang.Integer argPacketId) /* throws PersistenceException */ {
		final Object[] lclParameters = new Object[] { argPacketId };
		final String[] lclFieldNames = new String[] { "packet_id" };
		java.util.HashSet<PlacementOpal> lclCollection = new java.util.HashSet<>();
		load(getFullyQualifiedTableName(), lclFieldNames, lclParameters, null, lclCollection);
		return lclCollection;
	}

	@Override
	public java.util.HashSet<PlacementOpal> forQuestionIdCollection(java.lang.Integer argQuestionId) /* throws PersistenceException */ {
		final Object[] lclParameters = new Object[] { argQuestionId };
		final String[] lclFieldNames = new String[] { "question_id" };
		java.util.HashSet<PlacementOpal> lclCollection = new java.util.HashSet<>();
		load(getFullyQualifiedTableName(), lclFieldNames, lclParameters, null, lclCollection);
		return lclCollection;
	}

	@Override
	public PlacementOpal forId(java.lang.Integer argId) throws PersistenceException {
		OpalKey<PlacementOpal> lclOpalKey = new IdOpalKey(argId);
		return forOpalKey(lclOpalKey);
	}

	@Override
	public PlacementOpal forQuestionIdPacketId(java.lang.Integer argQuestionId, java.lang.Integer argPacketId) throws PersistenceException {
		OpalKey<PlacementOpal> lclOpalKey = new QuestionIdPacketIdOpalKey(argQuestionId, argPacketId);
		return forOpalKey(lclOpalKey);
	}

	@Override
	protected OpalKey<PlacementOpal> createOpalKeyForRow(ResultSet argRS) throws SQLException {
		return new IdOpalKey(
			OpalUtility.convertTo(java.lang.Integer.class, argRS.getObject("id"))
		);
	}

	/* package */ static class IdOpalKey extends com.opal.DatabaseOpalKey<PlacementOpal> {
		private static final String[] ourKeyColumnNames = new String[] {"id", };

		public IdOpalKey(java.lang.Integer argId) {
			super(new Object[] {argId, });
		}

		@Override
		protected Object[] getParameters() { return getFields(); }

		@Override
		protected String[] getColumnNames() { return ourKeyColumnNames; }

	}

	/* package */ static class QuestionIdPacketIdOpalKey extends com.opal.DatabaseOpalKey<PlacementOpal> {
		private static final String[] ourKeyColumnNames = new String[] {"question_id", "packet_id", };

		public QuestionIdPacketIdOpalKey(java.lang.Integer argQuestionId, java.lang.Integer argPacketId) {
			super(new Object[] {argQuestionId, argPacketId, });
		}

		@Override
		protected Object[] getParameters() { return getFields(); }

		@Override
		protected String[] getColumnNames() { return ourKeyColumnNames; }

	}

	@Override
	public PlacementOpal forUniqueString(String argUniqueString) {
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
