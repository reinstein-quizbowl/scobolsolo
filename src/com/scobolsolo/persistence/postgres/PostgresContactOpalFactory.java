package com.scobolsolo.persistence.postgres;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.opal.*;
import com.scobolsolo.application.Contact;
import com.scobolsolo.application.ContactImpl;
import com.scobolsolo.persistence.ContactOpal;
import com.scobolsolo.persistence.ContactOpalFactory;

public class PostgresContactOpalFactory extends com.opal.AbstractDatabaseIdentityOpalFactory<Contact, ContactOpal> implements ContactOpalFactory {
	private static final PostgresContactOpalFactory ourInstance = new PostgresContactOpalFactory();

	public static final PostgresContactOpalFactory getInstance() { return ourInstance; }

	protected PostgresContactOpalFactory() {
		super();
	}

	private static final String[] ourColumnNames = new String[] {
		"id", 
		"email_address", 
		"advance_phone", 
		"day_of_phone", 
		"note", 
		"name", 
		"sort_by", 
		"active", 
		"address", 
	};

	protected static String[] getStaticColumnNames() { return ourColumnNames; }

	@Override
	protected String[] getColumnNames() { return ourColumnNames; }

	private static final String[] ourPrimaryKeyWhereClauseColumns = new String[] {"id",};

	@Override
	protected String[] getFieldNames() { return ContactOpal.getStaticFieldNames(); }

	@Override
	protected Class<?>[] getFieldTypes() { return ContactOpal.getStaticFieldTypes(); }

	@Override
	protected boolean[] getFieldNullability() { return ContactOpal.getStaticFieldNullability(); }

	@Override
	protected com.opal.FieldValidator[] getFieldValidators() { return ContactOpal.getStaticFieldValidators(); }


	@Override
	protected javax.sql.DataSource getDataSource() {
		return PostgresOpalFactoryFactory.getSpecificInstance().getDataSource();
	}

	@Override
	protected ContactOpal instantiate(Object[] argValues) {
		return new ContactOpal(this, argValues);
	}

	@Override
	public ContactOpal create() {
		ContactOpal lclOpal;
		synchronized (lclOpal = instantiate((Object[]) null)) {
			assert lclOpal.getUserFacing() == null;
			lclOpal.setUserFacing(new ContactImpl(lclOpal));
			lclOpal.newObject();
			newObject(lclOpal);
		}
		return lclOpal;
	}

	@Override
	protected void determineUserFacing(ContactOpal argO, boolean argConcrete) {
		assert argO != null;
		assert argConcrete == false;
		assert argO.getUserFacing() == null;
		argO.setUserFacing(new ContactImpl(argO));
	}

	@Override
	protected void afterInsert(TransactionParameter argTP, ContactOpal argOpal) throws PersistenceException {
		assert argTP != null;
		assert argOpal != null;
		try {
			argOpal.setId(
				com.siliconage.database.DatabaseUtility.executeIntQuery(
					((DatabaseTransactionParameter) argTP).getConnection(),
					"SELECT last_value FROM contact_id_seq AS id_value",
					null
				)
			);
			return;
		} catch (SQLException lclE) {
			throw new PersistenceException("Unable to retrieve last value for sequence column contact_id_seq", lclE);
		}
	}

	protected void newObject(@SuppressWarnings("unused") ContactOpal argOpal) {
		return;
	}

	@Override
	protected String getFullyQualifiedTableName() {
		return "contact";
	}

	@Override
	protected void registerNewOpal(ContactOpal argOpal) {
		registerOpal(argOpal, argOpal.getNewValues());
	}

	@Override
	protected void registerOldOpal(ContactOpal argOpal) {
		registerOpal(argOpal, argOpal.getOldValues());
	}

	protected void registerOpal(ContactOpal argOpal, Object[] argValues) {
		if (argValues == null) { throw new IllegalStateException(); }
		if (argValues.length != 9) { throw new IllegalStateException(); }
		OpalCache lclOC = getOpalCache();
		synchronized (lclOC) {
			lclOC.addOpal(new IdOpalKey((java.lang.Integer) argValues[0]), argOpal, true);
		}
	}

	@Override
	protected void unregisterOpal(ContactOpal argOpal) {
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 9) { throw new IllegalStateException(); }
		OpalCache lclOC = getOpalCache();
		synchronized (lclOC) {
			lclOC.removeOpal(new IdOpalKey((java.lang.Integer) lclOldValues[0]));
		}
	}

	@Override
	public void updateKeys(ContactOpal argOpal) {
		org.apache.commons.lang3.Validate.notNull(argOpal);
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 9) { throw new IllegalStateException(); }
		Object[] lclNewValues = argOpal.getNewValues();
		if (lclNewValues == null) { throw new IllegalStateException(); }
		if (lclNewValues.length != 9) { throw new IllegalStateException(); }
		OpalCache lclOC = getOpalCache();
		synchronized (lclOC) {
			OpalKey<ContactOpal> lclOldKey = null;
			OpalKey<ContactOpal> lclNewKey = null;
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
	protected OpalKey<ContactOpal> createOpalKeyForReloading(ContactOpal argOpal) {
		Object[] lclValues = argOpal.getNewValues();
		return new IdOpalKey((java.lang.Integer) lclValues[0]);
	}

	@Override
	public ContactOpal forId(java.lang.Integer argId) throws PersistenceException {
		OpalKey<ContactOpal> lclOpalKey = new IdOpalKey(argId);
		return forOpalKey(lclOpalKey);
	}

	@Override
	protected OpalKey<ContactOpal> createOpalKeyForRow(ResultSet argRS) throws SQLException {
		return new IdOpalKey(
			OpalUtility.convertTo(java.lang.Integer.class, argRS.getObject("id"))
		);
	}

	/* package */ static class IdOpalKey extends com.opal.DatabaseOpalKey<ContactOpal> {
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
	public ContactOpal forUniqueString(String argUniqueString) {
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
