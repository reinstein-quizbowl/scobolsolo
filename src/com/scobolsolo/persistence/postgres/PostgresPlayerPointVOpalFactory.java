package com.scobolsolo.persistence.postgres;

import com.scobolsolo.application.PlayerPointV;
import com.scobolsolo.application.PlayerPointVImpl;
import com.scobolsolo.persistence.PlayerPointVOpal;
import com.scobolsolo.persistence.PlayerPointVOpalFactory;

public class PostgresPlayerPointVOpalFactory extends com.opal.AbstractDatabaseEphemeralOpalFactory<PlayerPointV, PlayerPointVOpal> implements PlayerPointVOpalFactory {
	private static final PostgresPlayerPointVOpalFactory ourInstance = new PostgresPlayerPointVOpalFactory();

	public static final PostgresPlayerPointVOpalFactory getInstance() { return ourInstance; }

	protected PostgresPlayerPointVOpalFactory() {
		super();
	}

	private static final String[] ourColumnNames = new String[] {
		"tournament_code", 
		"player_id", 
		"points", 
	};

	protected static String[] getStaticColumnNames() { return ourColumnNames; }

	@Override
	protected String[] getColumnNames() { return ourColumnNames; }

	@Override
	protected String[] getFieldNames() { return PlayerPointVOpal.getStaticFieldNames(); }

	@Override
	protected Class<?>[] getFieldTypes() { return PlayerPointVOpal.getStaticFieldTypes(); }

	@Override
	protected boolean[] getFieldNullability() { return PlayerPointVOpal.getStaticFieldNullability(); }

	@Override
	protected com.opal.FieldValidator[] getFieldValidators() { return PlayerPointVOpal.getStaticFieldValidators(); }


	@Override
	protected javax.sql.DataSource getDataSource() {
		return PostgresOpalFactoryFactory.getSpecificInstance().getDataSource();
	}

	@Override
	protected PlayerPointVOpal instantiate(Object[] argValues) {
		return new PlayerPointVOpal(this, argValues);
	}

	@Override
	protected void determineUserFacing(PlayerPointVOpal argO, boolean argConcrete) {
		assert argO != null;
		assert argConcrete == false;
		assert argO.getUserFacing() == null;
		argO.setUserFacing(new PlayerPointVImpl(argO));
	}

	@Override
	protected String getFullyQualifiedTableName() {
		return "player_point_v";
	}

}
