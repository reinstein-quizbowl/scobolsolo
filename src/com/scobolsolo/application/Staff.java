package com.scobolsolo.application;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.stream.Collectors;

import com.scobolsolo.persistence.StaffUserFacing;

/**
 * This interface may be changed at will.
 *
 * <p>This interface and the {@link StaffFactory} class are the only two automatically generated files for this type that are intended to be referenced in user code. Other automatically generated files package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */

public interface Staff extends StaffUserFacing {
	default List<Match> findMatches() {
		if (getContact().getAccount() == null) {
			return Collections.emptyList();
		}
		
		Set<Match> lclMatchesSet = new HashSet<>(); // So that we don't duplicate
		
		lclMatchesSet.addAll(
			this.streamModeratorGame().map(Game::getMatch).collect(Collectors.toList())
		);
		
		for (StaffAssignment lclSA : this.getStaffAssignmentSet()) {
			Room lclR = lclSA.getRoom();
			lclMatchesSet.addAll(
				lclR.streamMatch()
					.filter(argM -> argM.getPhase() == lclSA.getPhase())
					.collect(Collectors.toList())
			);
		}
		
		lclMatchesSet.removeIf(argM -> !getContact().getAccount().mayEnter(argM));
		
		List<Match> lclMatches = new ArrayList<>(lclMatchesSet);
		lclMatches.sort(null);
		return lclMatches;
	}
	
	default String getName() {
		return getContact().getName();
	}
}
