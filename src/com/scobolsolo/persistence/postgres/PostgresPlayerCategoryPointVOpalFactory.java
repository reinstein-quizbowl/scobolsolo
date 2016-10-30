package com.scobolsolo.persistence.postgres;


import com.scobolsolo.application.PlayerCategoryPointV;
import com.scobolsolo.persistence.PlayerCategoryPointVImpl;
import com.scobolsolo.persistence.PlayerCategoryPointVOpal;
import com.scobolsolo.persistence.PlayerCategoryPointVOpalFactory;

public class PostgresPlayerCategoryPointVOpalFactory extends com.opal.AbstractDatabaseEphemeralOpalFactory<PlayerCategoryPointV, PlayerCategoryPointVOpal> implements PlayerCategoryPointVOpalFactory {
	private static final PostgresPlayerCategoryPointVOpalFactory ourInstance = new PostgresPlayerCategoryPointVOpalFactory();

	public static final PostgresPlayerCategoryPointVOpalFactory getInstance() { return ourInstance; }

	protected PostgresPlayerCategoryPointVOpalFactory() {
		super();
	}

	private static final String[] ourColumnNames = new String[] {
		"tournament_code", 
		"player_id", 
		"category_code", 
		"tossups_heard", 
		"points", 
		"average_correct_buzz_depth", 
	};

	protected static String[] getStaticColumnNames() { return ourColumnNames; }

	@Override
	protected String[] getColumnNames() { return ourColumnNames; }

	@Override
	protected String[] getFieldNames() { return PlayerCategoryPointVOpal.getStaticFieldNames(); }

	@Override
	protected Class<?>[] getFieldTypes() { return PlayerCategoryPointVOpal.getStaticFieldTypes(); }

	@Override
	protected boolean[] getFieldNullability() { return PlayerCategoryPointVOpal.getStaticFieldNullability(); }

	@Override
	protected com.opal.FieldValidator[] getFieldValidators() { return PlayerCategoryPointVOpal.getStaticFieldValidators(); }

	@Override
	protected javax.sql.DataSource getDataSource() {
		return PostgresOpalFactoryFactory.getSpecificInstance().getDataSource();
	}

	@Override
	protected PlayerCategoryPointVOpal instantiate(Object[] argValues) {
		return new PlayerCategoryPointVOpal(this, argValues);
	}

	@Override
	protected void determineUserFacing(PlayerCategoryPointVOpal argO, boolean argConcrete) {
		assert argO != null;
		assert argConcrete == false;
		assert argO.getUserFacing() == null;
		argO.setUserFacing(new PlayerCategoryPointVImpl(argO));
	}

	@Override
	protected String getFullyQualifiedTableName() {
		return "player_category_point_v";
	}

}
