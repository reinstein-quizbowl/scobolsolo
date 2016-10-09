package com.scobolsolo.application;

import java.util.Comparator;
import java.util.OptionalDouble;

import com.scobolsolo.persistence.PlayerRecordVUserFacing;

/**
 * This interface may be changed at will.
 *
 * <p>This interface and the {@link PlayerRecordVFactory} class are the only two automatically generated files for this type that are intended to be referenced in user code. Other automatically generated files package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */

public interface PlayerRecordV extends PlayerRecordVUserFacing {
	public static final Comparator<PlayerRecordV> RECORD_THEN_PPTUH_COMPARATOR = Comparator.comparingDouble(PlayerRecordV::getWinningPercentage).thenComparingDouble(PlayerRecordV::getPPTUH).reversed();
	
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
	
	default OptionalDouble getAverageCorrectBuzzDepth() {
		double lclNumerator = 0.0d;
		int lclDenominator = 0;
		
		Double lclCorrectBuzzDepthWins = getAverageCorrectBuzzDepthInWinsAsObject();
		if (lclCorrectBuzzDepthWins != null) {
			lclNumerator += lclCorrectBuzzDepthWins.doubleValue() * getWinCount(0);
			lclDenominator += getWinCount(0);
		}
		
		Double lclCorrectBuzzDepthLosses = getAverageCorrectBuzzDepthInLossesAsObject();
		if (lclCorrectBuzzDepthLosses != null) {
			lclNumerator += lclCorrectBuzzDepthLosses.doubleValue() * getLossCount(0);
			lclDenominator += getLossCount(0);
		}
		
		if (lclDenominator > 0) {
			return OptionalDouble.of(lclNumerator / lclDenominator);
		} else {
			return OptionalDouble.empty();
		}
	}
}
