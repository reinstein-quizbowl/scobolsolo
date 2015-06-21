package com.scobolsolo.persistence.postgres;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.opal.*;
import com.scobolsolo.application.Tournament;
import com.scobolsolo.application.TournamentImpl;
import com.scobolsolo.persistence.TournamentOpal;
import com.scobolsolo.persistence.TournamentOpalFactory;

public class PostgresTournamentOpalFactory extends com.opal.AbstractDatabaseIdentityOpalFactory<Tournament, TournamentOpal> implements TournamentOpalFactory {
	private static final PostgresTournamentOpalFactory ourInstance = new PostgresTournamentOpalFactory();

	public static final PostgresTournamentOpalFactory getInstance() { return ourInstance; }

	protected PostgresTournamentOpalFactory() {
		super();
	}

	private static final String[] ourColumnNames = new String[] {
		"date", 
		"name", 
		"short_name", 
		"code", 
		"web_xml_role_code", 
		"tiebreaker_sudden_death", 
		"url", 
		"tournament_director_contact_id", 
		"player_message", 
		"staff_message", 
		"replacement_question_social_media_policy", 
		"school_message", 
		"control_room_room_id", 
		"championship_rules", 
		"championship_match_url", 
	};

	protected static String[] getStaticColumnNames() { return ourColumnNames; }

	@Override
	protected String[] getColumnNames() { return ourColumnNames; }

	private static final String[] ourPrimaryKeyWhereClauseColumns = new String[] {"code",};

	@Override
	protected String[] getFieldNames() { return TournamentOpal.getStaticFieldNames(); }

	@Override
	protected Class<?>[] getFieldTypes() { return TournamentOpal.getStaticFieldTypes(); }

	@Override
	protected boolean[] getFieldNullability() { return TournamentOpal.getStaticFieldNullability(); }

	@Override
	protected com.opal.FieldValidator[] getFieldValidators() { return TournamentOpal.getStaticFieldValidators(); }


	@Override
	protected javax.sql.DataSource getDataSource() {
		return PostgresOpalFactoryFactory.getSpecificInstance().getDataSource();
	}

	@Override
	protected TournamentOpal instantiate(Object[] argValues) {
		return new TournamentOpal(this, argValues);
	}

	@Override
	public TournamentOpal create() {
		TournamentOpal lclOpal;
		synchronized (lclOpal = instantiate((Object[]) null)) {
			assert lclOpal.getUserFacing() == null;
			lclOpal.setUserFacing(new TournamentImpl(lclOpal));
			lclOpal.newObject();
			newObject(lclOpal);
		}
		return lclOpal;
	}

	@Override
	protected void determineUserFacing(TournamentOpal argO, boolean argConcrete) {
		assert argO != null;
		assert argConcrete == false;
		assert argO.getUserFacing() == null;
		argO.setUserFacing(new TournamentImpl(argO));
	}

	protected void newObject(@SuppressWarnings("unused") TournamentOpal argOpal) {
		return;
	}

	@Override
	protected String getFullyQualifiedTableName() {
		return "tournament";
	}

	@Override
	protected void registerNewOpal(TournamentOpal argOpal) {
		registerOpal(argOpal, argOpal.getNewValues());
	}

	@Override
	protected void registerOldOpal(TournamentOpal argOpal) {
		registerOpal(argOpal, argOpal.getOldValues());
	}

	protected void registerOpal(TournamentOpal argOpal, Object[] argValues) {
		if (argValues == null) { throw new IllegalStateException(); }
		if (argValues.length != 15) { throw new IllegalStateException(); }
		OpalCache lclOC = getOpalCache();
		synchronized (lclOC) {
			lclOC.addOpal(new CodeOpalKey((java.lang.String) argValues[3]), argOpal, true);
			lclOC.addOpal(new NameOpalKey((java.lang.String) argValues[1]), argOpal, true);
			lclOC.addOpal(new ShortNameOpalKey((java.lang.String) argValues[2]), argOpal, true);
			lclOC.addOpal(new WebXmlRoleCodeOpalKey((java.lang.String) argValues[4]), argOpal, true);
		}
	}

	@Override
	protected void unregisterOpal(TournamentOpal argOpal) {
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 15) { throw new IllegalStateException(); }
		OpalCache lclOC = getOpalCache();
		synchronized (lclOC) {
			lclOC.removeOpal(new CodeOpalKey((java.lang.String) lclOldValues[3]));
			lclOC.removeOpal(new NameOpalKey((java.lang.String) lclOldValues[1]));
			lclOC.removeOpal(new ShortNameOpalKey((java.lang.String) lclOldValues[2]));
			lclOC.removeOpal(new WebXmlRoleCodeOpalKey((java.lang.String) lclOldValues[4]));
		}
	}

	@Override
	public void updateKeys(TournamentOpal argOpal) {
		org.apache.commons.lang3.Validate.notNull(argOpal);
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 15) { throw new IllegalStateException(); }
		Object[] lclNewValues = argOpal.getNewValues();
		if (lclNewValues == null) { throw new IllegalStateException(); }
		if (lclNewValues.length != 15) { throw new IllegalStateException(); }
		OpalCache lclOC = getOpalCache();
		synchronized (lclOC) {
			OpalKey<TournamentOpal> lclOldKey = null;
			OpalKey<TournamentOpal> lclNewKey = null;
			if (true) {
				if (!(lclNewValues[3].equals(lclOldValues[3]))) {
					lclNewKey = new CodeOpalKey((java.lang.String) lclNewValues[3]);
					if (true) {
						lclOldKey = new CodeOpalKey((java.lang.String) lclOldValues[3]);
					}
				}
			}
			if (lclOldKey != null) { lclOC.removeOpal(lclOldKey); lclOldKey = null; }
			if (lclNewKey != null) { lclOC.addOpal(lclNewKey, argOpal, true); lclNewKey = null; } /* true = SoftReference */
			if (true) {
				if (!(lclNewValues[1].equals(lclOldValues[1]))) {
					lclNewKey = new NameOpalKey((java.lang.String) lclNewValues[1]);
					if (true) {
						lclOldKey = new NameOpalKey((java.lang.String) lclOldValues[1]);
					}
				}
			}
			if (lclOldKey != null) { lclOC.removeOpal(lclOldKey); lclOldKey = null; }
			if (lclNewKey != null) { lclOC.addOpal(lclNewKey, argOpal, true); lclNewKey = null; } /* true = SoftReference */
			if (true) {
				if (!(lclNewValues[2].equals(lclOldValues[2]))) {
					lclNewKey = new ShortNameOpalKey((java.lang.String) lclNewValues[2]);
					if (true) {
						lclOldKey = new ShortNameOpalKey((java.lang.String) lclOldValues[2]);
					}
				}
			}
			if (lclOldKey != null) { lclOC.removeOpal(lclOldKey); lclOldKey = null; }
			if (lclNewKey != null) { lclOC.addOpal(lclNewKey, argOpal, true); lclNewKey = null; } /* true = SoftReference */
			if (true) {
				if (!(lclNewValues[4].equals(lclOldValues[4]))) {
					lclNewKey = new WebXmlRoleCodeOpalKey((java.lang.String) lclNewValues[4]);
					if (true) {
						lclOldKey = new WebXmlRoleCodeOpalKey((java.lang.String) lclOldValues[4]);
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
	protected OpalKey<TournamentOpal> createOpalKeyForReloading(TournamentOpal argOpal) {
		Object[] lclValues = argOpal.getNewValues();
		return new CodeOpalKey((java.lang.String) lclValues[3]);
	}

	@Override
	public java.util.HashSet<TournamentOpal> forControlRoomRoomIdCollection(java.lang.Integer argControlRoomRoomId) /* throws PersistenceException */ {
		final Object[] lclParameters = new Object[] { argControlRoomRoomId };
		final String[] lclFieldNames = new String[] { "control_room_room_id" };
		java.util.HashSet<TournamentOpal> lclCollection = new java.util.HashSet<>();
		load(getFullyQualifiedTableName(), lclFieldNames, lclParameters, null, lclCollection);
		return lclCollection;
	}

	@Override
	public java.util.HashSet<TournamentOpal> forTournamentDirectorContactIdCollection(java.lang.Integer argTournamentDirectorContactId) /* throws PersistenceException */ {
		final Object[] lclParameters = new Object[] { argTournamentDirectorContactId };
		final String[] lclFieldNames = new String[] { "tournament_director_contact_id" };
		java.util.HashSet<TournamentOpal> lclCollection = new java.util.HashSet<>();
		load(getFullyQualifiedTableName(), lclFieldNames, lclParameters, null, lclCollection);
		return lclCollection;
	}

	@Override
	public TournamentOpal forCode(java.lang.String argCode) throws PersistenceException {
		OpalKey<TournamentOpal> lclOpalKey = new CodeOpalKey(argCode);
		return forOpalKey(lclOpalKey);
	}

	@Override
	public TournamentOpal forName(java.lang.String argName) throws PersistenceException {
		OpalKey<TournamentOpal> lclOpalKey = new NameOpalKey(argName);
		return forOpalKey(lclOpalKey);
	}

	@Override
	public TournamentOpal forShortName(java.lang.String argShortName) throws PersistenceException {
		OpalKey<TournamentOpal> lclOpalKey = new ShortNameOpalKey(argShortName);
		return forOpalKey(lclOpalKey);
	}

	@Override
	public TournamentOpal forWebXmlRoleCode(java.lang.String argWebXmlRoleCode) throws PersistenceException {
		OpalKey<TournamentOpal> lclOpalKey = new WebXmlRoleCodeOpalKey(argWebXmlRoleCode);
		return forOpalKey(lclOpalKey);
	}

	@Override
	protected OpalKey<TournamentOpal> createOpalKeyForRow(ResultSet argRS) throws SQLException {
		return new CodeOpalKey(
			OpalUtility.convertTo(java.lang.String.class, argRS.getObject("code"))
		);
	}

	/* package */ static class CodeOpalKey extends com.opal.DatabaseOpalKey<TournamentOpal> {
		private static final String[] ourKeyColumnNames = new String[] {"code", };

		public CodeOpalKey(java.lang.String argCode) {
			super(new Object[] {argCode, });
		}

		@Override
		protected Object[] getParameters() { return getFields(); }

		@Override
		protected String[] getColumnNames() { return ourKeyColumnNames; }

	}

	/* package */ static class NameOpalKey extends com.opal.DatabaseOpalKey<TournamentOpal> {
		private static final String[] ourKeyColumnNames = new String[] {"name", };

		public NameOpalKey(java.lang.String argName) {
			super(new Object[] {argName, });
		}

		@Override
		protected Object[] getParameters() { return getFields(); }

		@Override
		protected String[] getColumnNames() { return ourKeyColumnNames; }

	}

	/* package */ static class ShortNameOpalKey extends com.opal.DatabaseOpalKey<TournamentOpal> {
		private static final String[] ourKeyColumnNames = new String[] {"short_name", };

		public ShortNameOpalKey(java.lang.String argShortName) {
			super(new Object[] {argShortName, });
		}

		@Override
		protected Object[] getParameters() { return getFields(); }

		@Override
		protected String[] getColumnNames() { return ourKeyColumnNames; }

	}

	/* package */ static class WebXmlRoleCodeOpalKey extends com.opal.DatabaseOpalKey<TournamentOpal> {
		private static final String[] ourKeyColumnNames = new String[] {"web_xml_role_code", };

		public WebXmlRoleCodeOpalKey(java.lang.String argWebXmlRoleCode) {
			super(new Object[] {argWebXmlRoleCode, });
		}

		@Override
		protected Object[] getParameters() { return getFields(); }

		@Override
		protected String[] getColumnNames() { return ourKeyColumnNames; }

	}

	@Override
	public TournamentOpal forUniqueString(String argUniqueString) {
		if (argUniqueString == null || "".equals(argUniqueString)) {
			return null;
		}
		String[] lclArgs = argUniqueString.split("\\|");
		assert lclArgs.length == 1;
		return forOpalKey(
			new CodeOpalKey(
				lclArgs[0]
			)
		);
	}

}
