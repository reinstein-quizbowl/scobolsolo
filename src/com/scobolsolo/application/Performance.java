package com.scobolsolo.application;

import org.apache.commons.lang3.Validate;

import com.scobolsolo.persistence.PerformanceUserFacing;

/**
 * This interface may be changed at will.
 *
 * <p>This interface and the {@link PerformanceFactory} class are the only two automatically generated files for this type that are intended to be referenced in user code. Other automatically generated files package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */

public interface Performance extends PerformanceUserFacing {
	default Response findResponseForBasePlacement(final Placement argPlacement) {
		Validate.notNull(argPlacement);
		
		return streamResponse().filter(argR -> argR.getActualPlacement() == argPlacement).findAny().orElse(null);
	}
	
	default Response findOrCreateResponse(final Placement argBasePlacement, final Placement argReplacementPlacement) {
		Validate.notNull(argBasePlacement);
		// argReplacementPlacement may be null
		
		Response lclR = findResponseForBasePlacement(argBasePlacement);
		if (lclR == null) {
			lclR = ResponseFactory.getInstance().create()
				.setBasePlacement(argBasePlacement)
				.setReplacementPlacement(argReplacementPlacement);
			this.addResponse(lclR);
			return lclR;
		} else {
			lclR.setReplacementPlacement(argReplacementPlacement); // which may not be a change
			return lclR;
		}
	}
	
	default int getScore() {
		return streamResponse().map(Response::getResponseType).mapToInt(ResponseType::getPoints).sum();
	}
}
