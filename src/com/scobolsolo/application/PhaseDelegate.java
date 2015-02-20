package com.scobolsolo.application;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.Validate;

public abstract class PhaseDelegate {
	static List<Round> getRounds(final Phase argP) {
		Validate.notNull(argP);
		
		return argP.streamRoundGroup().flatMap(RoundGroup::streamRound).sorted(Round.StandardComparator.getInstance()).collect(Collectors.toList());
	}
	
	static List<Card> getCards(final Phase argP) {
		Validate.notNull(argP);
		
		return argP.streamCard().sorted(Card.StandardComparator.getInstance()).collect(Collectors.toList());
	}
}
