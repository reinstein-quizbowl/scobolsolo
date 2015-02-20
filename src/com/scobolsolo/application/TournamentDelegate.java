package com.scobolsolo.application;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.stream.Collectors;

import org.apache.commons.lang3.Validate;

public abstract class TournamentDelegate {
	static List<Player> getPlayers(final Tournament argT) {
		Validate.notNull(argT);
		
		return argT.streamSchoolRegistration().flatMap(SchoolRegistration::streamPlayer).collect(Collectors.toList());
	}
	
	static List<Phase> getPhases(final Tournament argT) {
		Validate.notNull(argT);
		
		return argT.streamPhase().sorted(Phase.SequenceComparator.getInstance()).collect(Collectors.toList());
	}
	
	static List<RoundGroup> getRoundGroups(final Tournament argT) {
		Validate.notNull(argT);
		
		return argT.streamPhase().flatMap(Phase::streamRoundGroup).sorted(RoundGroup.StandardComparator.getInstance()).collect(Collectors.toList());
	}
	
	static List<Round> getRounds(final Tournament argT) {
		Validate.notNull(argT);
		
		return argT.streamPhase().flatMap(Phase::streamRoundGroup).flatMap(RoundGroup::streamRound).sorted(Round.StandardComparator.getInstance()).collect(Collectors.toList());
	}
	
	static boolean hasValidSeeds(final Tournament argT) {
		final List<Player> lclPlayers = getPlayers(argT);
		final Set<Integer> lclSeedsUsed = new HashSet<>(lclPlayers.size());
		
		for (final Player lclP : lclPlayers) {
			final Integer lclSeed = lclP.getSeedAsObject();
			
			if (lclSeed == null) {
				return false;
			}
			
			if (lclSeedsUsed.contains(lclSeed)) {
				return false;
			}
			
			lclSeedsUsed.add(lclSeed);
		}
		
		if (lclSeedsUsed.size() == lclPlayers.size()) {
			return true;
		} else {
			return false;
		}
	}
	
	static boolean hasCardsAssigned(final Tournament argT) {
		int lclAssigned = 0;
		
		final List<Player> lclPlayers = getPlayers(argT);
		
		for (final Player lclP : lclPlayers) {
			if (lclP.getInitialCard() != null) {
				++lclAssigned;
			}
		}
		
		if (lclAssigned == lclPlayers.size()) {
			return true;
		} else if (lclAssigned == 0) {
			return false;
		} else {
			throw new IllegalStateException("Partially assigned cards: " + lclAssigned + " of " + lclPlayers.size());
		}
	}
	
	static List<StandbyEntry> getStandbyEntries(final Tournament argT) {
		Validate.notNull(argT);
		
		final List<StandbyEntry> lclSEs = new ArrayList<>();
		final List<StandbyEntry> lclNullSequenceSEs = new ArrayList<>();
		for (final SchoolRegistration lclSR : argT.createSchoolRegistrationArray()) {
			for (final StandbyEntry lclSE : lclSR.createStandbyEntryArray()) {
				if (lclSE.getSequenceAsObject() == null) {
					lclNullSequenceSEs.add(lclSE);
				} else {
					lclSEs.add(lclSE);
				}
			}
		}
		
		lclSEs.sort(StandbyEntry.SequenceComparator.getInstance());
		lclSEs.addAll(lclNullSequenceSEs);
		return lclSEs;
	}
	
	static List<WaitlistEntry> getWaitlistEntries(final Tournament argT) {
		Validate.notNull(argT);
		
		final List<WaitlistEntry> lclWEs = new ArrayList<>();
		final List<WaitlistEntry> lclNullSequenceWEs = new ArrayList<>();
		for (final SchoolRegistration lclSR : argT.createSchoolRegistrationArray()) {
			for (final WaitlistEntry lclWE : lclSR.createWaitlistEntryArray()) {
				if (lclWE.getSequenceAsObject() == null) {
					lclNullSequenceWEs.add(lclWE);
				} else {
					lclWEs.add(lclWE);
				}
			}
		}
		
		lclWEs.sort(WaitlistEntry.SequenceComparator.getInstance());
		lclWEs.addAll(lclNullSequenceWEs);
		return lclWEs;
	}
	
	static boolean hasPublicQuestions(final Tournament argT) {
		return argT != null && argT.streamPacket().filter(Packet::isQuestionsPublic).findAny().isPresent();
	}
	
	static Phase findFirstPhase(final Tournament argT) {
		Validate.notNull(argT);
		return argT.streamPhase().sorted(Phase.SequenceComparator.getInstance()).findFirst().orElse(null);
	}
}
