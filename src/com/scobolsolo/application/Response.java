package com.scobolsolo.application;

import java.util.Comparator;

import org.apache.commons.lang3.ObjectUtils;

import com.scobolsolo.persistence.ResponseUserFacing;

/**
 * This interface may be changed at will.
 *
 * <p>This interface and the {@link ResponseFactory} class are the only two automatically generated files for this type that are intended to be referenced in user code. Other automatically generated files package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */

public interface Response extends ResponseUserFacing {
	public static final Comparator<Response> BASE_PLACEMENT_COMPARATOR = Comparator.comparing(Response::getBasePlacement);
	public static final Comparator<Response> ACTUAL_PLACEMENT_COMPARATOR = Comparator.comparing(Response::getActualPlacement);
	
	default public Placement getActualPlacement() {
		return ObjectUtils.firstNonNull(getReplacementPlacement(), getBasePlacement());
	}
}
