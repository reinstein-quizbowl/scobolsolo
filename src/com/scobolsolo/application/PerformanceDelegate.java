package com.scobolsolo.application;

public abstract class PerformanceDelegate {
	static Response findResponse(final Performance argPerformance, final Placement argPlacement) {
		if (argPerformance == null || argPlacement == null) {
			return null;
		}
		
		return argPerformance.streamResponse().filter(argR -> argR.getPlacement() == argPlacement).findAny().orElse(null);
	}
}
