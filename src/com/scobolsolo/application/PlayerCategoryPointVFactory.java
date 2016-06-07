package com.scobolsolo.application;

import com.scobolsolo.persistence.PlayerCategoryPointVOpalFactory;
import com.scobolsolo.persistence.PlayerCategoryPointVOpal;
import com.scobolsolo.persistence.OpalFactoryFactory;

public class PlayerCategoryPointVFactory extends com.opal.AbstractFactory<PlayerCategoryPointV, PlayerCategoryPointVOpal> {

	/** This static variable holds the Singleton instance of the Factory for application
		objects of this type.  It is private, but can be accessed via the getInstance() method.
	*/

	private static final PlayerCategoryPointVFactory ourInstance = new PlayerCategoryPointVFactory(OpalFactoryFactory.getInstance().getPlayerCategoryPointVOpalFactory());

	public static PlayerCategoryPointVFactory getInstance() { return ourInstance; }

	public PlayerCategoryPointVOpalFactory getPlayerCategoryPointVOpalFactory() { return (PlayerCategoryPointVOpalFactory) getOpalFactory(); }

	protected PlayerCategoryPointVFactory(com.opal.OpalFactory<PlayerCategoryPointV, PlayerCategoryPointVOpal> argOpalFactory) {
		super(argOpalFactory);
	}

	@Override
	public Class<PlayerCategoryPointV> getUserFacingInterface() {
		return PlayerCategoryPointV.class;
	}

	@Override
	public PlayerCategoryPointV[] createArray(int argSize) {
		return new PlayerCategoryPointV[argSize];
	}

}
