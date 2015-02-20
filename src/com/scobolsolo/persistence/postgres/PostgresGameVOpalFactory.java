package com.scobolsolo.persistence.postgres;

import com.scobolsolo.application.GameV;
import com.scobolsolo.application.GameVImpl;
import com.scobolsolo.persistence.GameVOpal;
import com.scobolsolo.persistence.GameVOpalFactory;

public class PostgresGameVOpalFactory extends com.opal.AbstractDatabaseEphemeralOpalFactory<GameV, GameVOpal> implements GameVOpalFactory {
	private static final PostgresGameVOpalFactory ourInstance = new PostgresGameVOpalFactory();

	public static final PostgresGameVOpalFactory getInstance() { return ourInstance; }

	protected PostgresGameVOpalFactory() {
		super();
	}

	private static final String[] ourColumnNames = new String[] {
		"tournament_code", 
		"game_id", 
		"round_id", 
		"room_id", 
		"winning_card_id", 
		"losing_card_id", 
		"moderator_staff_id", 
		"tossups_heard", 
		"incoming_winning_card_player_id", 
		"incoming_losing_card_player_id", 
		"winner_player_id", 
		"loser_player_id", 
		"winner_performance_id", 
		"loser_performance_id", 
		"winner_score", 
		"loser_score", 
	};

	protected static String[] getStaticColumnNames() { return ourColumnNames; }

	@Override
	protected String[] getColumnNames() { return ourColumnNames; }

	@Override
	protected String[] getFieldNames() { return GameVOpal.getStaticFieldNames(); }

	@Override
	protected Class<?>[] getFieldTypes() { return GameVOpal.getStaticFieldTypes(); }

	@Override
	protected boolean[] getFieldNullability() { return GameVOpal.getStaticFieldNullability(); }

	@Override
	protected com.opal.FieldValidator[] getFieldValidators() { return GameVOpal.getStaticFieldValidators(); }


	@Override
	protected javax.sql.DataSource getDataSource() {
		return PostgresOpalFactoryFactory.getSpecificInstance().getDataSource();
	}

	@Override
	protected GameVOpal instantiate(Object[] argValues) {
		return new GameVOpal(this, argValues);
	}

	@Override
	protected void determineUserFacing(GameVOpal argO, boolean argConcrete) {
		assert argO != null;
		assert argConcrete == false;
		assert argO.getUserFacing() == null;
		argO.setUserFacing(new GameVImpl(argO));
	}

	@Override
	protected String getFullyQualifiedTableName() {
		return "game_v";
	}

}
