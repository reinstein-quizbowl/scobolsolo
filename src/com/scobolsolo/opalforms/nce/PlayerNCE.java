package com.scobolsolo.opalforms.nce;

import com.siliconage.web.NameCodeExtractor;

import com.scobolsolo.application.Player;

public final class PlayerNCE extends NameCodeExtractor<Player> {
	private PlayerNCE() {
		super();
	}
	
	private static PlayerNCE ourInstance = new PlayerNCE();
	
	public static PlayerNCE getInstance() {
		return ourInstance;
	}
	
	@Override
	public String extractNameInternal(final Player argP) {
		return argP.getContact().getName();
	}
	
	@Override
	public String extractCodeInternal(final Player argP) {
		return argP.getUniqueString();
	}
}
