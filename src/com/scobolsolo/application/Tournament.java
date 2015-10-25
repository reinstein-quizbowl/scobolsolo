package com.scobolsolo.application;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.stream.Collectors;

import com.scobolsolo.persistence.TournamentUserFacing;

/**
 * This interface may be changed at will.
 *
 * <p>This interface and the {@link TournamentFactory} class are the only two automatically generated files for this type that are intended to be referenced in user code. Other automatically generated files package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */

public interface Tournament extends TournamentUserFacing {
	public static Tournament findNext() {
		return TournamentFactory.getInstance().streamAll()
			.filter(argT -> argT.getDate().isAfter(LocalDate.now()))
			.sorted()
			.findFirst().orElse(null);
	}
	
	default List<Player> getPlayers() {
		return streamSchoolRegistration().flatMap(SchoolRegistration::streamPlayer).collect(Collectors.toList());
	}
	
	default List<Phase> getPhases() {
		return streamPhase().sorted().collect(Collectors.toList());
	}
	
	default List<RoundGroup> getRoundGroups() {
		return streamPhase().flatMap(Phase::streamRoundGroup).sorted().collect(Collectors.toList());
	}
	
	default List<Round> getRounds() {
		return streamPhase().flatMap(Phase::streamRoundGroup).flatMap(RoundGroup::streamRound).sorted().collect(Collectors.toList());
	}
	
	default List<Staff> getStaff() {
		return streamStaff().sorted(Staff.NameComparator.getInstance()).collect(Collectors.toList());
	}
	
	default boolean hasValidSeeds() {
		final List<Player> lclPlayers = getPlayers();
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
	
	default boolean hasCardsAssigned() {
		int lclAssigned = 0;
		
		final List<Player> lclPlayers = getPlayers();
		
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
	
	default List<StandbyEntry> getStandbyEntries() {
		final List<StandbyEntry> lclSEs = new ArrayList<>();
		final List<StandbyEntry> lclNullSequenceSEs = new ArrayList<>();
		for (final SchoolRegistration lclSR : createSchoolRegistrationArray()) {
			for (final StandbyEntry lclSE : lclSR.createStandbyEntryArray()) {
				if (lclSE.getSequenceAsObject() == null) {
					lclNullSequenceSEs.add(lclSE);
				} else {
					lclSEs.add(lclSE);
				}
			}
		}
		
		lclSEs.sort(null);
		lclSEs.addAll(lclNullSequenceSEs);
		return lclSEs;
	}
	
	default List<WaitlistEntry> getWaitlistEntries() {
		final List<WaitlistEntry> lclWEs = new ArrayList<>();
		final List<WaitlistEntry> lclNullSequenceWEs = new ArrayList<>();
		for (final SchoolRegistration lclSR : createSchoolRegistrationArray()) {
			for (final WaitlistEntry lclWE : lclSR.createWaitlistEntryArray()) {
				if (lclWE.getSequenceAsObject() == null) {
					lclNullSequenceWEs.add(lclWE);
				} else {
					lclWEs.add(lclWE);
				}
			}
		}
		
		lclWEs.sort(null);
		lclWEs.addAll(lclNullSequenceWEs);
		return lclWEs;
	}
	
	default boolean hasPublicQuestions() {
		return streamPacket().filter(Packet::isQuestionsPublic).findAny().isPresent();
	}
	
	default Phase findFirstPhase() {
		return streamPhase().sorted().findFirst().orElse(null);
	}
}
