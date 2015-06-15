package com.scobolsolo.application;

import org.apache.commons.lang3.Validate;

import com.scobolsolo.persistence.SchoolUserFacing;

/**
 * This interface may be changed at will.
 *
 * <p>This interface and the {@link SchoolFactory} class are the only two automatically generated files for this type that are intended to be referenced in user code. Other automatically generated files package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */

public interface School extends SchoolUserFacing {
	default String getExplainedName(final String argBase) {
		Validate.notNull(argBase);
		
		final String lclLocation = getLocation();
		
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
	
	default String getExplainedName() {
		return getExplainedName(getName());
	}
	
	default String getExplainedShortName() {
		return getExplainedName(getShortName());
	}
	
	default String getExplainedVeryShortName() {
		return getExplainedName(getVeryShortName());
	}
}
