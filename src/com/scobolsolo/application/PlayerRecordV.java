package com.scobolsolo.application;

import java.util.Comparator;

import com.siliconage.util.NullSafeComparator;

import com.scobolsolo.persistence.PlayerRecordVUserFacing;

/**
 * This interface may be changed at will.
 *
 * <p>This interface and the {@link PlayerRecordVFactory} class are the only two automatically generated files for this type that are intended to be referenced in user code. Other automatically generated files package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */

public interface PlayerRecordV extends PlayerRecordVUserFacing {
	public static final Comparator<PlayerRecordV> RECORD_THEN_PPTUH_COMPARATOR = Comparator.comparingDouble(PlayerRecordV::getWinningPercentage).thenComparingDouble(PlayerRecordV::getPPTUH);
	
	default double getWinningPercentage() {
		final int lclW = (int) getWinCount(0);
		final int lclL = (int) getLossCount(0);
		
		if (lclW + lclL == 0) {
			return 0.0d;
		}
		
		return 1.0d * lclW / (lclW + lclL);
	}
	
	default double getPPTUH() {
		if (getTossupsHeard(0) == 0) {
			return 0.0d;
		}
		
		return 1.0d * getPoints(0) / getTossupsHeard(0);
	}
}
