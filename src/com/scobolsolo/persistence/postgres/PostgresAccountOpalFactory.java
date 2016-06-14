package com.scobolsolo.persistence.postgres;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.opal.OpalCache;
import com.opal.OpalKey;
import com.opal.OpalUtility;
import com.opal.PersistenceException;

import com.scobolsolo.application.Account;
import com.scobolsolo.application.AccountImpl;
import com.scobolsolo.persistence.AccountOpal;
import com.scobolsolo.persistence.AccountOpalFactory;

public class PostgresAccountOpalFactory extends com.opal.AbstractDatabaseIdentityOpalFactory<Account, AccountOpal> implements AccountOpalFactory {
	private static final PostgresAccountOpalFactory ourInstance = new PostgresAccountOpalFactory();

	public static final PostgresAccountOpalFactory getInstance() { return ourInstance; }

	protected PostgresAccountOpalFactory() {
		super();
	}

	private static final String[] ourColumnNames = new String[] {
		"id", 
		"username", 
		"password_hash", 
		"administrator", 
		"active", 
		"writer", 
		"password_reset_token", 
		"password_reset_token_expiration", 
		"can_receive_unsolicited_messages", 
	};

	protected static String[] getStaticColumnNames() { return ourColumnNames; }

	@Override
	protected String[] getColumnNames() { return ourColumnNames; }

	private static final String[] ourPrimaryKeyWhereClauseColumns = new String[] {"id",};

	@Override
	protected String[] getFieldNames() { return AccountOpal.getStaticFieldNames(); }

	@Override
	protected Class<?>[] getFieldTypes() { return AccountOpal.getStaticFieldTypes(); }

	@Override
	protected boolean[] getFieldNullability() { return AccountOpal.getStaticFieldNullability(); }

	@Override
	protected com.opal.FieldValidator[] getFieldValidators() { return AccountOpal.getStaticFieldValidators(); }

	@Override
	protected javax.sql.DataSource getDataSource() {
		return PostgresOpalFactoryFactory.getSpecificInstance().getDataSource();
	}

	@Override
	protected AccountOpal instantiate(Object[] argValues) {
		return new AccountOpal(this, argValues);
	}

	@Override
	public AccountOpal create() {
		AccountOpal lclOpal;
		synchronized (lclOpal = instantiate((Object[]) null)) {
			assert lclOpal.getUserFacing() == null;
			lclOpal.setUserFacing(new AccountImpl(lclOpal));
			lclOpal.newObject();
			newObject(lclOpal);
		}
		return lclOpal;
	}

	@Override
	protected void determineUserFacing(AccountOpal argO, boolean argConcrete) {
		assert argO != null;
		assert argConcrete == false;
		assert argO.getUserFacing() == null;
		argO.setUserFacing(new AccountImpl(argO));
	}

	protected void newObject(@SuppressWarnings("unused") AccountOpal argOpal) {
		return;
	}

	@Override
	protected String getFullyQualifiedTableName() {
		return "account";
	}

	@Override
	protected void registerNewOpal(AccountOpal argOpal) {
		registerOpal(argOpal, argOpal.getNewValues());
	}

	@Override
	protected void registerOldOpal(AccountOpal argOpal) {
		registerOpal(argOpal, argOpal.getOldValues());
	}

	protected void registerOpal(AccountOpal argOpal, Object[] argValues) {
		if (argValues == null) { throw new IllegalStateException(); }
		if (argValues.length != 9) { throw new IllegalStateException(); }
		OpalCache<AccountOpal> lclOC = getCache();
		synchronized (lclOC) {
			lclOC.addOpal(new IdOpalKey((java.lang.Integer) argValues[0]), argOpal, true);
			lclOC.addOpal(new UsernameOpalKey((java.lang.String) argValues[1]), argOpal, true);
		}
	}

	@Override
	protected void unregisterOpal(AccountOpal argOpal) {
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 9) { throw new IllegalStateException(); }
		OpalCache<AccountOpal> lclOC = getCache();
		synchronized (lclOC) {
			lclOC.removeOpal(new IdOpalKey((java.lang.Integer) lclOldValues[0]));
			lclOC.removeOpal(new UsernameOpalKey((java.lang.String) lclOldValues[1]));
		}
	}

	@Override
	public void updateKeys(AccountOpal argOpal) {
		org.apache.commons.lang3.Validate.notNull(argOpal);
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 9) { throw new IllegalStateException(); }
		Object[] lclNewValues = argOpal.getNewValues();
		if (lclNewValues == null) { throw new IllegalStateException(); }
		if (lclNewValues.length != 9) { throw new IllegalStateException(); }
		OpalCache<AccountOpal> lclOC = getCache();
		synchronized (lclOC) {
			OpalKey<AccountOpal> lclOldKey = null;
			OpalKey<AccountOpal> lclNewKey = null;
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
				if (!(lclNewValues[1].equals(lclOldValues[1]))) {
					lclNewKey = new UsernameOpalKey((java.lang.String) lclNewValues[1]);
					if (true) {
						lclOldKey = new UsernameOpalKey((java.lang.String) lclOldValues[1]);
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
	protected OpalKey<AccountOpal> createOpalKeyForReloading(AccountOpal argOpal) {
		Object[] lclValues = argOpal.getNewValues();
		return new IdOpalKey((java.lang.Integer) lclValues[0]);
	}

	@Override
	public AccountOpal forId(java.lang.Integer argId) throws PersistenceException {
		OpalKey<AccountOpal> lclOpalKey = new IdOpalKey(argId);
		return forOpalKey(lclOpalKey);
	}

	@Override
	public AccountOpal forUsername(java.lang.String argUsername) throws PersistenceException {
		OpalKey<AccountOpal> lclOpalKey = new UsernameOpalKey(argUsername);
		return forOpalKey(lclOpalKey);
	}

	@Override
	protected OpalKey<AccountOpal> createOpalKeyForRow(ResultSet argRS) throws SQLException {
		return new IdOpalKey(
			OpalUtility.convertTo(java.lang.Integer.class, argRS.getObject("id"))
		);
	}

	/* package */ static class IdOpalKey extends com.opal.SingleValueDatabaseOpalKey<AccountOpal> {
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

	/* package */ static class UsernameOpalKey extends com.opal.SingleValueDatabaseOpalKey<AccountOpal> {
		private static final String[] ourKeyColumnNames = new String[] {"username", };

		public UsernameOpalKey(java.lang.String argUsername) {
			super(argUsername);
		}

		@Override
		public Object[] getParameters() {
			return new Object[] { getKeyValue(), };
		}

		@Override
		public String[] getColumnNames() { return ourKeyColumnNames; }

	}

	@Override
	public AccountOpal forUniqueString(String argUniqueString) {
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
