package com.scobolsolo.application;

public abstract class PlayerCategoryPointVDelegate {
	static double getPPTUH(final PlayerCategoryPointV argPCPV) {
		if (argPCPV == null) {
			return 0.0d;
		}
		
		if (argPCPV.getTossupsHeard(0) == 0) {
			return 0.0d;
		}
		
		return 1.0d * argPCPV.getPoints(0) / argPCPV.getTossupsHeard(0);
	}
}
