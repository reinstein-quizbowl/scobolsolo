package com.scobolsolo.persistence.postgres;


import com.scobolsolo.application.PlacementConversionV;
import com.scobolsolo.application.PlacementConversionVImpl;
import com.scobolsolo.persistence.PlacementConversionVOpal;
import com.scobolsolo.persistence.PlacementConversionVOpalFactory;

public class PostgresPlacementConversionVOpalFactory extends com.opal.AbstractDatabaseEphemeralOpalFactory<PlacementConversionV, PlacementConversionVOpal> implements PlacementConversionVOpalFactory {
	private static final PostgresPlacementConversionVOpalFactory ourInstance = new PostgresPlacementConversionVOpalFactory();

	public static final PostgresPlacementConversionVOpalFactory getInstance() { return ourInstance; }

	protected PostgresPlacementConversionVOpalFactory() {
		super();
	}

	private static final String[] ourColumnNames = new String[] {
		"tournament_code", 
		"placement_id", 
		"question_id", 
		"response_type_code", 
		"response_type_count", 
		"average_buzz_depth", 
	};

	protected static String[] getStaticColumnNames() { return ourColumnNames; }

	@Override
	protected String[] getColumnNames() { return ourColumnNames; }

	@Override
	protected String[] getFieldNames() { return PlacementConversionVOpal.getStaticFieldNames(); }

	@Override
	protected Class<?>[] getFieldTypes() { return PlacementConversionVOpal.getStaticFieldTypes(); }

	@Override
	protected boolean[] getFieldNullability() { return PlacementConversionVOpal.getStaticFieldNullability(); }

	@Override
	protected com.opal.FieldValidator[] getFieldValidators() { return PlacementConversionVOpal.getStaticFieldValidators(); }

	@Override
	protected javax.sql.DataSource getDataSource() {
		return PostgresOpalFactoryFactory.getSpecificInstance().getDataSource();
	}

	@Override
	protected PlacementConversionVOpal instantiate(Object[] argValues) {
		return new PlacementConversionVOpal(this, argValues);
	}

	@Override
	protected void determineUserFacing(PlacementConversionVOpal argO, boolean argConcrete) {
		assert argO != null;
		assert argConcrete == false;
		assert argO.getUserFacing() == null;
		argO.setUserFacing(new PlacementConversionVImpl(argO));
	}

	@Override
	protected String getFullyQualifiedTableName() {
		return "placement_conversion_v";
	}

}
