package com.scobolsolo.application;

import com.scobolsolo.persistence.RoundUserFacing;

/**
 * This interface may be changed at will.
 *
 * <p>This interface and the {@link RoundFactory} class are the only two automatically generated files for this type that are intended to be referenced in user code. Other automatically generated files package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */

public interface Round extends RoundUserFacing {
	default String getNameWithStartTime() {
		if (getStartTime() == null) {
			return getName();
		} else {
			return getName() + " (" + getStartTime() + ")";
		}
	}
	
	default String getShortNameWithStartTime() {
		if (getStartTime() == null) {
			return getShortName();
		} else {
			return getShortName() + " (" + getStartTime() + ")";
		}
	}
	
	default boolean isBefore(final Round that) {
		return Round.StandardComparator.getInstance().compare(this, that) < 0;
	}
	
	default boolean isAfter(final Round that) {
		return Round.StandardComparator.getInstance().compare(this, that) > 0;
	}
}
