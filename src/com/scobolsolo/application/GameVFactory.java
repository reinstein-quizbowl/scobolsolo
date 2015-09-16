package com.scobolsolo.application;

import com.scobolsolo.persistence.GameVOpalFactory;
import com.scobolsolo.persistence.GameVOpal;
import com.scobolsolo.persistence.OpalFactoryFactory;

public class GameVFactory extends com.opal.AbstractFactory<GameV, GameVOpal> {
	/** This static variable holds the Singleton instance of the Factory for application
		objects of this type.  It is private, but can be accessed via the getInstance() method.
	*/

	private static final GameVFactory ourInstance = new GameVFactory(OpalFactoryFactory.getInstance().getGameVOpalFactory());

	public static GameVFactory getInstance() { return ourInstance; }

	public GameVOpalFactory getGameVOpalFactory() { return (GameVOpalFactory) getOpalFactory(); }

	protected GameVFactory(com.opal.OpalFactory<GameV, GameVOpal> argOpalFactory) {
		super(argOpalFactory);
	}

	@Override
	public Class<GameV> getUserFacingInterface() {
		return GameV.class;
	}

	@Override
	public GameV[] createArray(int argSize) {
		return new GameV[argSize];
	}

}
