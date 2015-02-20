package com.scobolsolo.application;

public abstract class SchoolRegistrationDelegate {
	static int getFullPlayerCount(final SchoolRegistration argSR) {
		if (argSR == null) {
			return 0;
		}
		
		return argSR.getPlayerCount() + argSR.getSpotsReserved();
	}
}
