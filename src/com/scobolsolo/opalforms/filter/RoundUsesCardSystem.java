package com.scobolsolo.opalforms.filter;

import com.siliconage.util.Filter;

import com.scobolsolo.application.Round;

public final class RoundUsesCardSystem extends Filter<Round> {
	private static final RoundUsesCardSystem ourInstance = new RoundUsesCardSystem();
	
	public static RoundUsesCardSystem getInstance() {
		return ourInstance;
	}
	
	private RoundUsesCardSystem() {
		super();
	}
	
	@Override
	public boolean accept(final Round argR) {
		return argR != null && argR.getRoundGroup().getPhase().isCardSystem();
	}
}
