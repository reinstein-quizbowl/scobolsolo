package com.scobolsolo.application;

import java.util.Comparator;
import java.util.Arrays;

import com.scobolsolo.persistence.RoundGroupUserFacing;

/**
 * This interface may be changed at will.
 *
 * <p>This interface and the {@link RoundGroupFactory} class are the only two automatically generated files for this type that are intended to be referenced in user code. Other automatically generated files package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */

public interface RoundGroup extends RoundGroupUserFacing, Comparable<RoundGroup> {
	@Override
	default int compareTo(RoundGroup that) {
		return Comparator.comparing(RoundGroup::getPhase).thenComparingInt(RoundGroup::getSequence).compare(this, that);
	}
	
	default RoundGroup getNext() {
		final RoundGroup[] lclAll = getPhase().createRoundGroupArray();
		Arrays.sort(lclAll);
		
		boolean lclNextTime = false;
		for (final RoundGroup lclRG : lclAll) {
			if (lclNextTime) {
				return lclRG;
			} else if (lclRG == this) {
				lclNextTime = true;
			}
		}
		
		return null;
	}
}
