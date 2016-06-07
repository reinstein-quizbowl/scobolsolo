package com.scobolsolo.application;

import com.scobolsolo.persistence.CategoryConversionVOpalFactory;
import com.scobolsolo.persistence.CategoryConversionVOpal;
import com.scobolsolo.persistence.OpalFactoryFactory;

public class CategoryConversionVFactory extends com.opal.AbstractFactory<CategoryConversionV, CategoryConversionVOpal> {

	/** This static variable holds the Singleton instance of the Factory for application
		objects of this type.  It is private, but can be accessed via the getInstance() method.
	*/

	private static final CategoryConversionVFactory ourInstance = new CategoryConversionVFactory(OpalFactoryFactory.getInstance().getCategoryConversionVOpalFactory());

	public static CategoryConversionVFactory getInstance() { return ourInstance; }

	public CategoryConversionVOpalFactory getCategoryConversionVOpalFactory() { return (CategoryConversionVOpalFactory) getOpalFactory(); }

	protected CategoryConversionVFactory(com.opal.OpalFactory<CategoryConversionV, CategoryConversionVOpal> argOpalFactory) {
		super(argOpalFactory);
	}

	@Override
	public Class<CategoryConversionV> getUserFacingInterface() {
		return CategoryConversionV.class;
	}

	@Override
	public CategoryConversionV[] createArray(int argSize) {
		return new CategoryConversionV[argSize];
	}

}
