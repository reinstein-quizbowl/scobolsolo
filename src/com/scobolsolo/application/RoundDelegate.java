package com.scobolsolo.application;

import org.apache.commons.lang3.Validate;

public abstract class RoundDelegate {
	static String getNameWithStartTime(final Round argR) {
		Validate.notNull(argR);
		
		if (argR.getStartTime() == null) {
			return argR.getName();
		} else {
			return argR.getName() + " (" + argR.getStartTime() + ")";
		}
	}
	
	static String getShortNameWithStartTime(final Round argR) {
		Validate.notNull(argR);
		
		if (argR.getStartTime() == null) {
			return argR.getShortName();
		} else {
			return argR.getShortName() + " (" + argR.getStartTime() + ")";
		}
	}
	
	static boolean isBefore(final Round argA, final Round argB) {
		return Round.StandardComparator.getInstance().compare(argA, argB) < 0;
	}
	
	static boolean isAfter(final Round argA, final Round argB) {
		return Round.StandardComparator.getInstance().compare(argA, argB) > 0;
	}
}
