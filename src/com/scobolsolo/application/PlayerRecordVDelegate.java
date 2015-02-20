package com.scobolsolo.application;

public abstract class PlayerRecordVDelegate {
	static double getWinningPercentage(final PlayerRecordV argPRV) {
		if (argPRV == null) {
			return 0.0d;
		}
		
		final int lclW = (int) argPRV.getWinCount(0);
		final int lclL = (int) argPRV.getLossCount(0);
		
		if (lclW + lclL == 0) {
			return 0.0d;
		}
		
		return 1.0d * lclW / (lclW + lclL);
	}
	
	static double getPPTUH(final PlayerRecordV argPRV) {
		if (argPRV == null) {
			return 0.0d;
		}
		
		if (argPRV.getTossupsHeard(0) == 0) {
			return 0.0d;
		}
		
		return 1.0d * argPRV.getPoints(0) / argPRV.getTossupsHeard(0);
	}
}
