package com.scobolsolo.persistence.postgres;


import com.scobolsolo.application.PlayerRecordV;
import com.scobolsolo.application.PlayerRecordVImpl;
import com.scobolsolo.persistence.PlayerRecordVOpal;
import com.scobolsolo.persistence.PlayerRecordVOpalFactory;

public class PostgresPlayerRecordVOpalFactory extends com.opal.AbstractDatabaseEphemeralOpalFactory<PlayerRecordV, PlayerRecordVOpal> implements PlayerRecordVOpalFactory {
	private static final PostgresPlayerRecordVOpalFactory ourInstance = new PostgresPlayerRecordVOpalFactory();

	public static final PostgresPlayerRecordVOpalFactory getInstance() { return ourInstance; }

	protected PostgresPlayerRecordVOpalFactory() {
		super();
	}

	private static final String[] ourColumnNames = new String[] {
		"tournament_code", 
		"player_id", 
		"win_count", 
		"loss_count", 
		"points", 
		"tossups_heard", 
	};

	protected static String[] getStaticColumnNames() { return ourColumnNames; }

	@Override
	protected String[] getColumnNames() { return ourColumnNames; }

	@Override
	protected String[] getFieldNames() { return PlayerRecordVOpal.getStaticFieldNames(); }

	@Override
	protected Class<?>[] getFieldTypes() { return PlayerRecordVOpal.getStaticFieldTypes(); }

	@Override
	protected boolean[] getFieldNullability() { return PlayerRecordVOpal.getStaticFieldNullability(); }

	@Override
	protected com.opal.FieldValidator[] getFieldValidators() { return PlayerRecordVOpal.getStaticFieldValidators(); }

	@Override
	protected javax.sql.DataSource getDataSource() {
		return PostgresOpalFactoryFactory.getSpecificInstance().getDataSource();
	}

	@Override
	protected PlayerRecordVOpal instantiate(Object[] argValues) {
		return new PlayerRecordVOpal(this, argValues);
	}

	@Override
	protected void determineUserFacing(PlayerRecordVOpal argO, boolean argConcrete) {
		assert argO != null;
		assert argConcrete == false;
		assert argO.getUserFacing() == null;
		argO.setUserFacing(new PlayerRecordVImpl(argO));
	}

	@Override
	protected String getFullyQualifiedTableName() {
		return "player_record_v";
	}

}
