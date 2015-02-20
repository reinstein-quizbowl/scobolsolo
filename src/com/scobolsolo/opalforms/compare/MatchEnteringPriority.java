package com.scobolsolo.opalforms.compare;

import com.siliconage.util.NullSafeComparator;

import com.scobolsolo.application.Match;
import com.scobolsolo.application.Round;

public final class MatchEnteringPriority extends NullSafeComparator<Match> {
	private static final MatchEnteringPriority ourInstance = new MatchEnteringPriority();
	
	public static MatchEnteringPriority getInstance() {
		return ourInstance;
	}
	
	private MatchEnteringPriority() {
		super();
	}
	
	@Override
	protected int compareInternal(final Match argA, final Match argB) {
		final int lclI = argB.determineStatus().getPriority() - argA.determineStatus().getPriority();
		
		if (lclI != 0) {
			return lclI;
		}
		
		return Round.StandardComparator.getInstance().compare(argA.getRound(), argB.getRound());
	}
}
