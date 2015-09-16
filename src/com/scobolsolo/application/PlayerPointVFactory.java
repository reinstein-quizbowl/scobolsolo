package com.scobolsolo.application;

import com.scobolsolo.persistence.PlayerPointVOpalFactory;
import com.scobolsolo.persistence.PlayerPointVOpal;
import com.scobolsolo.persistence.OpalFactoryFactory;

public class PlayerPointVFactory extends com.opal.AbstractFactory<PlayerPointV, PlayerPointVOpal> {
	/** This static variable holds the Singleton instance of the Factory for application
		objects of this type.  It is private, but can be accessed via the getInstance() method.
	*/

	private static final PlayerPointVFactory ourInstance = new PlayerPointVFactory(OpalFactoryFactory.getInstance().getPlayerPointVOpalFactory());

	public static PlayerPointVFactory getInstance() { return ourInstance; }

	public PlayerPointVOpalFactory getPlayerPointVOpalFactory() { return (PlayerPointVOpalFactory) getOpalFactory(); }

	protected PlayerPointVFactory(com.opal.OpalFactory<PlayerPointV, PlayerPointVOpal> argOpalFactory) {
		super(argOpalFactory);
	}

	@Override
	public Class<PlayerPointV> getUserFacingInterface() {
		return PlayerPointV.class;
	}

	@Override
	public PlayerPointV[] createArray(int argSize) {
		return new PlayerPointV[argSize];
	}

}
