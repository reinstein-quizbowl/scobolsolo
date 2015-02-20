package com.scobolsolo.persistence.postgres;

import com.scobolsolo.application.PlayerMatchV;
import com.scobolsolo.application.PlayerMatchVImpl;
import com.scobolsolo.persistence.PlayerMatchVOpal;
import com.scobolsolo.persistence.PlayerMatchVOpalFactory;

public class PostgresPlayerMatchVOpalFactory extends com.opal.AbstractDatabaseEphemeralOpalFactory<PlayerMatchV, PlayerMatchVOpal> implements PlayerMatchVOpalFactory {
	private static final PostgresPlayerMatchVOpalFactory ourInstance = new PostgresPlayerMatchVOpalFactory();

	public static final PostgresPlayerMatchVOpalFactory getInstance() { return ourInstance; }

	protected PostgresPlayerMatchVOpalFactory() {
		super();
	}

	private static final String[] ourColumnNames = new String[] {
		"tournament_code", 
		"player_id", 
		"performance_id", 
		"opponent_player_id", 
		"opponent_performance_id", 
		"match_id", 
		"game_id", 
	};

	protected static String[] getStaticColumnNames() { return ourColumnNames; }

	@Override
	protected String[] getColumnNames() { return ourColumnNames; }

	@Override
	protected String[] getFieldNames() { return PlayerMatchVOpal.getStaticFieldNames(); }

	@Override
	protected Class<?>[] getFieldTypes() { return PlayerMatchVOpal.getStaticFieldTypes(); }

	@Override
	protected boolean[] getFieldNullability() { return PlayerMatchVOpal.getStaticFieldNullability(); }

	@Override
	protected com.opal.FieldValidator[] getFieldValidators() { return PlayerMatchVOpal.getStaticFieldValidators(); }


	@Override
	protected javax.sql.DataSource getDataSource() {
		return PostgresOpalFactoryFactory.getSpecificInstance().getDataSource();
	}

	@Override
	protected PlayerMatchVOpal instantiate(Object[] argValues) {
		return new PlayerMatchVOpal(this, argValues);
	}

	@Override
	protected void determineUserFacing(PlayerMatchVOpal argO, boolean argConcrete) {
		assert argO != null;
		assert argConcrete == false;
		assert argO.getUserFacing() == null;
		argO.setUserFacing(new PlayerMatchVImpl(argO));
	}

	@Override
	protected String getFullyQualifiedTableName() {
		return "player_match_v";
	}

}
