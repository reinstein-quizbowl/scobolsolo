package com.scobolsolo.application;

import org.apache.commons.lang3.Validate;

public final class PlayerDelegate {
	static Performance findPerformance(Player argP, Game argG) {
		if (argP == null || argG == null) {
			return null;
		}
		
		for (Performance lclP : argG.createPerformanceArray()) {
			if (lclP.getPlayer() == argP) {
				return lclP;
			}
		}
		
		return null;
	}
	
	static String getNameWithSchool(Player argP) {
		Validate.notNull(argP);
		
		return argP.getContact().getName() + " (" + argP.getSchoolRegistration().getSchool().getName() + ")";
	}
	
	static String getNameWithSchoolShortName(Player argP) {
		Validate.notNull(argP);
		
		return argP.getContact().getName() + " (" + argP.getSchoolRegistration().getSchool().getShortName() + ")";
	}
}
