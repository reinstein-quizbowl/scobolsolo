package com.scobolsolo.application;

import com.scobolsolo.persistence.PlacementConversionVOpalFactory;
import com.scobolsolo.persistence.PlacementConversionVOpal;
import com.scobolsolo.persistence.OpalFactoryFactory;

public class PlacementConversionVFactory extends com.opal.AbstractFactory<PlacementConversionV, PlacementConversionVOpal> {
	/** This static variable holds the Singleton instance of the Factory for application
		objects of this type.  It is private, but can be accessed via the getInstance() method.
	*/

	private static final PlacementConversionVFactory ourInstance = new PlacementConversionVFactory(OpalFactoryFactory.getInstance().getPlacementConversionVOpalFactory());

	public static PlacementConversionVFactory getInstance() { return ourInstance; }

	public PlacementConversionVOpalFactory getPlacementConversionVOpalFactory() { return (PlacementConversionVOpalFactory) getOpalFactory(); }

	protected PlacementConversionVFactory(com.opal.OpalFactory<PlacementConversionV, PlacementConversionVOpal> argOpalFactory) {
		super(argOpalFactory);
	}

	@Override
	public Class<PlacementConversionV> getUserFacingInterface() {
		return PlacementConversionV.class;
	}

	@Override
	public PlacementConversionV[] createArray(int argSize) {
		return new PlacementConversionV[argSize];
	}

}
