package com.scobolsolo.application;

import com.scobolsolo.persistence.PlayerMatchVOpalFactory;
import com.scobolsolo.persistence.PlayerMatchVOpal;
import com.scobolsolo.persistence.OpalFactoryFactory;

public class PlayerMatchVFactory extends com.opal.AbstractFactory<PlayerMatchV, PlayerMatchVOpal> {
	/** This static variable holds the Singleton instance of the Factory for application
		objects of this type.  It is private, but can be accessed via the getInstance() method.
	*/

	private static final PlayerMatchVFactory ourInstance = new PlayerMatchVFactory(OpalFactoryFactory.getInstance().getPlayerMatchVOpalFactory());

	public static PlayerMatchVFactory getInstance() { return ourInstance; }

	public PlayerMatchVOpalFactory getPlayerMatchVOpalFactory() { return (PlayerMatchVOpalFactory) getOpalFactory(); }

	protected PlayerMatchVFactory(com.opal.OpalFactory<PlayerMatchV, PlayerMatchVOpal> argOpalFactory) {
		super(argOpalFactory);
	}

	@Override
	public Class<PlayerMatchV> getUserFacingInterface() {
		return PlayerMatchV.class;
	}

	@Override
	public PlayerMatchV[] createArray(int argSize) {
		return new PlayerMatchV[argSize];
	}

}
