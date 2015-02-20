package com.scobolsolo.opalforms.compare;

import com.siliconage.util.NullSafeComparator;

import com.scobolsolo.application.Player;
import com.scobolsolo.application.PlayerCategoryPointV;

public final class PlayerCategoryPointVPPTUH extends NullSafeComparator<PlayerCategoryPointV> {
	private static final PlayerCategoryPointVPPTUH ourInstance = new PlayerCategoryPointVPPTUH();
	
	private static final double EPSILON = 0.0005d;
	
	public static PlayerCategoryPointVPPTUH getInstance() {
		return ourInstance;
	}
	
	private PlayerCategoryPointVPPTUH() {
		super();
	}
	
	@Override
	protected int compareInternal(final PlayerCategoryPointV argA, final PlayerCategoryPointV argB) {
		final double lclPPTUHDifference = argA.getPPTUH() - argB.getPPTUH();
		
		if (Math.abs(lclPPTUHDifference) > EPSILON) {
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
