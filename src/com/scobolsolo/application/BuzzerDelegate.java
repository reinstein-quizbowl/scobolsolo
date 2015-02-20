package com.scobolsolo.application;

public abstract class BuzzerDelegate {
	static boolean hasMeaningfulName(final Buzzer argB) {
		if (argB == null || argB.getName() == null) {
			return false;
		}
		
		if (argB.getName().matches(argB.getSchoolRegistration().getSchool().getShortName() + " \\d+")) {
			return false;
		} else if (argB.getName().matches(argB.getSchoolRegistration().getSchool().getName() + " \\d+")) {
			return false;
		} else {
			return true;
		}
	}
}
