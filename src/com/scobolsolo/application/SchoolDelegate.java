package com.scobolsolo.application;

import org.apache.commons.lang3.Validate;

public abstract class SchoolDelegate {
	static String getExplainedName(final School argS, final String argBase) {
		if (argS == null) {
			return null;
		}
		
		Validate.notNull(argBase);
		
		final String lclLocation = argS.getLocation();
		
		if (lclLocation == null) {
			return argBase;
		} else if (lclLocation.endsWith(", ")) {
			String lclCity = lclLocation.substring(0, lclLocation.indexOf(", "));
			String lclState = lclLocation.substring(lclLocation.indexOf(", ") + 2);
			if (argBase.contains(lclCity)) {
				return argBase + " (" + lclState + ')';
			} else {
				return argBase + " (" + lclLocation + ')';
			}
		} else {
			if (argBase.contains(lclLocation)) {
				return argBase;
			} else {
				return argBase + " (" + lclLocation + ')';
			}
		}
	}
	
	static String getExplainedName(final School argS) {
		if (argS == null) {
			return null;
		}
		
		return getExplainedName(argS, argS.getName());
	}
	
	static String getExplainedShortName(final School argS) {
		if (argS == null) {
			return null;
		}
		
		return getExplainedName(argS, argS.getShortName());
	}
	
	static String getExplainedVeryShortName(final School argS) {
		if (argS == null) {
			return null;
		}
		
		return getExplainedName(argS, argS.getVeryShortName());
	}
}
