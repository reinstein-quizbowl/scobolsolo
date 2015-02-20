package com.scobolsolo.opalforms.compare;

import com.siliconage.util.NullSafeComparator;

import com.scobolsolo.application.Card;
import com.scobolsolo.application.Player;

public final class CardInitialPlayerSchoolName extends NullSafeComparator<Card> {
	private static final CardInitialPlayerSchoolName ourInstance = new CardInitialPlayerSchoolName();
	
	public static CardInitialPlayerSchoolName getInstance() {
		return ourInstance;
	}
	
	private CardInitialPlayerSchoolName() {
		super();
	}
	
	@Override
	protected int compareInternal(final Card argA, final Card argB) {
		if (argA.getInitialPlayer() == null && argB.getInitialPlayer() == null) {
			return argA.getSequence() - argB.getSequence();
		} else if (argA.getInitialPlayer() == null) {
			return -1;
		} else if (argB.getInitialPlayer() == null) {
			return 1;
		} else {
			final int lclSchoolComparison = Player.SchoolNameComparator.getInstance().compare(argA.getInitialPlayer(), argB.getInitialPlayer());
			
			if (lclSchoolComparison != 0) {
				return lclSchoolComparison;
			} else {
				return Player.NameComparator.getInstance().compare(argA.getInitialPlayer(), argB.getInitialPlayer());
			}
		}
	}
}
