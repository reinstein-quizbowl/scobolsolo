package com.scobolsolo.persistence.postgres;


import com.scobolsolo.application.CategoryConversionV;
import com.scobolsolo.application.CategoryConversionVImpl;
import com.scobolsolo.persistence.CategoryConversionVOpal;
import com.scobolsolo.persistence.CategoryConversionVOpalFactory;

public class PostgresCategoryConversionVOpalFactory extends com.opal.AbstractDatabaseEphemeralOpalFactory<CategoryConversionV, CategoryConversionVOpal> implements CategoryConversionVOpalFactory {
	private static final PostgresCategoryConversionVOpalFactory ourInstance = new PostgresCategoryConversionVOpalFactory();

	public static final PostgresCategoryConversionVOpalFactory getInstance() { return ourInstance; }

	protected PostgresCategoryConversionVOpalFactory() {
		super();
	}

	private static final String[] ourColumnNames = new String[] {
		"tournament_code", 
		"category_code", 
		"response_type_code", 
		"response_type_count", 
		"average_buzz_depth", 
	};

	protected static String[] getStaticColumnNames() { return ourColumnNames; }

	@Override
	protected String[] getColumnNames() { return ourColumnNames; }

	@Override
	protected String[] getFieldNames() { return CategoryConversionVOpal.getStaticFieldNames(); }

	@Override
	protected Class<?>[] getFieldTypes() { return CategoryConversionVOpal.getStaticFieldTypes(); }

	@Override
	protected boolean[] getFieldNullability() { return CategoryConversionVOpal.getStaticFieldNullability(); }

	@Override
	protected com.opal.FieldValidator[] getFieldValidators() { return CategoryConversionVOpal.getStaticFieldValidators(); }

	@Override
	protected javax.sql.DataSource getDataSource() {
		return PostgresOpalFactoryFactory.getSpecificInstance().getDataSource();
	}

	@Override
	protected CategoryConversionVOpal instantiate(Object[] argValues) {
		return new CategoryConversionVOpal(this, argValues);
	}

	@Override
	protected void determineUserFacing(CategoryConversionVOpal argO, boolean argConcrete) {
		assert argO != null;
		assert argConcrete == false;
		assert argO.getUserFacing() == null;
		argO.setUserFacing(new CategoryConversionVImpl(argO));
	}

	@Override
	protected String getFullyQualifiedTableName() {
		return "category_conversion_v";
	}

}
