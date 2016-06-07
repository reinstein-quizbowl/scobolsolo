package com.scobolsolo.application;

import com.scobolsolo.persistence.PlayerRecordVOpalFactory;
import com.scobolsolo.persistence.PlayerRecordVOpal;
import com.scobolsolo.persistence.OpalFactoryFactory;

public class PlayerRecordVFactory extends com.opal.AbstractFactory<PlayerRecordV, PlayerRecordVOpal> {

	/** This static variable holds the Singleton instance of the Factory for application
		objects of this type.  It is private, but can be accessed via the getInstance() method.
	*/

	private static final PlayerRecordVFactory ourInstance = new PlayerRecordVFactory(OpalFactoryFactory.getInstance().getPlayerRecordVOpalFactory());

	public static PlayerRecordVFactory getInstance() { return ourInstance; }

	public PlayerRecordVOpalFactory getPlayerRecordVOpalFactory() { return (PlayerRecordVOpalFactory) getOpalFactory(); }

	protected PlayerRecordVFactory(com.opal.OpalFactory<PlayerRecordV, PlayerRecordVOpal> argOpalFactory) {
		super(argOpalFactory);
	}

	@Override
	public Class<PlayerRecordV> getUserFacingInterface() {
		return PlayerRecordV.class;
	}

	@Override
	public PlayerRecordV[] createArray(int argSize) {
		return new PlayerRecordV[argSize];
	}

}
