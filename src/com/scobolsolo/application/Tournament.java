package com.scobolsolo.application;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.stream.Collectors;

import org.apache.commons.lang3.Validate;

import com.opal.LocalDateCache;

import com.scobolsolo.persistence.TournamentUserFacing;

/**
 * This interface may be changed at will.
 *
 * <p>This interface and the {@link TournamentFactory} class are the only two automatically generated files for this type that are intended to be referenced in user code. Other automatically generated files package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */

public interface Tournament extends TournamentUserFacing {
	static final int DEFAULT_FIELD_CAP = 128;
	
	default List<Player> getPlayers() {
		return streamSchoolRegistration().flatMap(SchoolRegistration::streamPlayer).collect(Collectors.toList());
	}
	
	default int getPlayerCountIncludingUnnamedReservedSpots() {
		return streamSchoolRegistration().mapToInt(SchoolRegistration::getFullPlayerCount).sum();
	}
	
	default int getRealPlayerCount() {
		return (int) streamSchoolRegistration()
			.flatMap(SchoolRegistration::streamPlayer)
			.filter(it -> it.isExhibition() == false)
			.count();
	}
	
	default int getSchoolCount() {
		return (int) streamSchoolRegistration()
			.flatMap(SchoolRegistration::streamPlayer)
			.filter(it -> it.isExhibition() == false)
			.map(Player::getSchoolRegistration)
			.distinct().count();
	}
	
	default int getFieldCap() {
		if (getPhases().isEmpty()) {
			return DEFAULT_FIELD_CAP;
		}
		
		Phase lclFirstPhase = getPhases().get(0);
		if (lclFirstPhase != null && lclFirstPhase.getCardSet().isEmpty() == false) {
			return lclFirstPhase.getCardSet().size();
		} else {
			return DEFAULT_FIELD_CAP;
		}
	}
	
	default List<Phase> getPhases() {
		return streamPhase().sorted().collect(Collectors.toList());
	}
	
	default List<Round> getRounds() {
		return streamPhase().flatMap(Phase::streamRound).sorted().collect(Collectors.toList());
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
	
	default boolean hasAnyCardsAssigned() {
		return findFirstPhase().streamCard().anyMatch(Card::isAssigned);
	}
	
	default boolean hasAllCardsAssigned() {
		final int lclAssigned = (int) findFirstPhase().streamCard().filter(Card::isAssigned).count();
		final int lclPlayers = getPlayers().size();
		
		return lclAssigned == lclPlayers;
	}
	
	default List<StandbyEntry> getStandbyEntries() {
		final List<StandbyEntry> lclSEs = new ArrayList<>();
		final List<StandbyEntry> lclNullSequenceSEs = new ArrayList<>();
		for (final SchoolRegistration lclSR : getSchoolRegistrationSet()) {
			for (final StandbyEntry lclSE : lclSR.getStandbyEntrySet()) {
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
		for (final SchoolRegistration lclSR : getSchoolRegistrationSet()) {
			for (final WaitlistEntry lclWE : lclSR.getWaitlistEntrySet()) {
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
		return streamPacket().anyMatch(Packet::isQuestionsPublic);
	}
	
	default Phase findFirstPhase() {
		return streamPhase().min(Comparator.naturalOrder()).orElse(null);
	}
	
	default long getDaysInFuture() { // or negative if in past
		return ChronoUnit.DAYS.between(LocalDateCache.today(), getDate());
	}
	
	public static Tournament findNext() {
		LocalDate lclToday = LocalDateCache.today();
		
		return TournamentFactory.getInstance().getAll().stream()
			.filter(argT -> argT.getDate().isBefore(lclToday) == false)
			.sorted()
			.findFirst().orElse(null);
	}
}
