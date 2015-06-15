package com.scobolsolo.application;

import java.util.List;
import java.util.stream.Collectors;

import com.scobolsolo.persistence.PhaseUserFacing;

/**
 * This interface may be changed at will.
 *
 * <p>This interface and the {@link PhaseFactory} class are the only two automatically generated files for this type that are intended to be referenced in user code. Other automatically generated files package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */

public interface Phase extends PhaseUserFacing {
	default List<Round> getRounds() {
		return streamRoundGroup().flatMap(RoundGroup::streamRound).sorted(Round.StandardComparator.getInstance()).collect(Collectors.toList());
	}
	
	default List<Card> getCards() {
		return streamCard().sorted(Card.StandardComparator.getInstance()).collect(Collectors.toList());
	}
}
