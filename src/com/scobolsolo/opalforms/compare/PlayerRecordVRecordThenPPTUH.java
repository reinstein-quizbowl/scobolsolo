package com.scobolsolo.opalforms.compare;

import com.siliconage.util.NullSafeComparator;

import com.scobolsolo.application.Player;
import com.scobolsolo.application.PlayerRecordV;

public final class PlayerRecordVRecordThenPPTUH extends NullSafeComparator<PlayerRecordV> {
	private static final PlayerRecordVRecordThenPPTUH ourInstance = new PlayerRecordVRecordThenPPTUH();
	
	private static final double WP_EPSILON = 0.005d;
	private static final double PPTUH_EPSILON = 0.0005d;
	
	public static PlayerRecordVRecordThenPPTUH getInstance() {
		return ourInstance;
	}
	
	private PlayerRecordVRecordThenPPTUH() {
		super();
	}
	
	@Override
	protected int compareInternal(final PlayerRecordV argA, final PlayerRecordV argB) {
		final double lclWinningPercentageDifference = argA.getWinningPercentage() - argB.getWinningPercentage();
		
		if (Math.abs(lclWinningPercentageDifference) > WP_EPSILON) {
			if (lclWinningPercentageDifference > 0.0d) {
				return -1;
			} else if (lclWinningPercentageDifference < 0.0d) {
				return 1;
			} else {
				throw new IllegalStateException();
			}
		}
		
		
		final double lclPPTUHDifference = argA.getPPTUH() - argB.getPPTUH();
		
		if (Math.abs(lclPPTUHDifference) > PPTUH_EPSILON) {
			if (lclPPTUHDifference > 0.0d) {
				return -1;
			} else if (lclPPTUHDifference < 0.0d) {
				return 1;
			} else {
				throw new IllegalStateException();
			}
		}
		
		return Player.NameComparator.getInstance().compare(argA.getPlayer(), argB.getPlayer());
	}
}
