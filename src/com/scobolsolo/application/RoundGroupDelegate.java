package com.scobolsolo.application;

import java.util.Arrays;

public abstract class RoundGroupDelegate {
	static RoundGroup getNext(final RoundGroup argRG) {
		if (argRG == null) {
			return null;
		}
		
		final RoundGroup[] lclAll = argRG.getPhase().createRoundGroupArray();
		Arrays.sort(lclAll);
		
		boolean lclNextTime = false;
		for (final RoundGroup lclRG : lclAll) {
			if (lclNextTime) {
				return lclRG;
			} else if (lclRG == argRG) {
				lclNextTime = true;
			}
		}
		
		return null;
	}
}
