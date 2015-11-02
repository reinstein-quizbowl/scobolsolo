package com.scobolsolo.application;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.Validate;

import com.siliconage.util.Fast3Set;
import com.siliconage.util.Tally;

import com.scobolsolo.persistence.GameUserFacing;

/**
 * This interface may be changed at will.
 *
 * <p>This interface and the {@link GameFactory} class are the only two automatically generated files for this type that are intended to be referenced in user code. Other automatically generated files package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */

public interface Game extends GameUserFacing {
	default Player getSingleKnownPlayer() {
		return ObjectUtils.firstNonNull(getIncomingWinningCardPlayer(), getIncomingLosingCardPlayer());
	}
	
	default Tally<Performance> getScores() {
		final Tally<Performance> lclTally = new Tally<>();
		for (Performance lclPerf : createPerformanceArray()) {
			for (Response lclR : lclPerf.createResponseArray()) {
				lclTally.tally(lclPerf, lclR.getResponseType().getPoints());
			}
		}
		
		return lclTally;
	}
	
	default Tally<Performance> getScoresThrough(final int argIndex, final boolean argOvertime) {
		final List<Placement> lclRegulation = getMatch().getRound().getPacket().getRegulationPlacements();
		final List<Placement> lclOvertime = argOvertime ? getMatch().getRound().getPacket().getOvertimePlacements() : Collections.emptyList();
		final Tally<Performance> lclTally = new Tally<>();
		for (Performance lclPerf : createPerformanceArray()) {
			for (Response lclR : lclPerf.createResponseArray()) {
				Placement lclPL = lclR.getPlacement();
				int lclRegulationIndex = lclRegulation.indexOf(lclPL);
				if (argOvertime || (lclRegulationIndex >= 0 && lclRegulationIndex <= argIndex)) {
					lclTally.tally(lclPerf, lclR.getResponseType().getPoints());
				} else {
					int lclOvertimeIndex = lclOvertime.indexOf(lclPL);
					if (lclOvertimeIndex >= 0 && lclOvertimeIndex <= argIndex) {
						lclTally.tally(lclPerf, lclR.getResponseType().getPoints());
					}
				}
			}
		}
		
		return lclTally;
	}
	
	default Tally<Performance> getScoresBefore(final int argIndex, final boolean argOvertime) {
		if (argIndex == 0 && argOvertime) {
			return getScoresThrough(Integer.MAX_VALUE, false);
		} else {
			return getScoresThrough(argIndex - 1, argOvertime);
		}
	}
	
	public static boolean isTied(Tally<Performance> argScores) {
		return getTieScore(argScores) != null;
	}
	
	default boolean isTied() {
		return getTieScore() != null;
	}
	
	default boolean isTiedAfter(int argIndex, boolean argOvertime) {
		return isTied(getScoresThrough(argIndex, argOvertime));
	}
	
	default Integer getTieScore() {
		return getTieScore(getScores());
	}
	
	public static Integer getTieScore(Tally<Performance> argScores) {
		final Set<Integer> lclSeenScores = new Fast3Set<>();
		for (Performance lclPerf : argScores.keyList()) {
			final int lclScore = argScores.get(lclPerf);
			if (lclSeenScores.contains(lclScore)) {
				return lclScore; // THINK: If there are multiple ties (in a game involving more than one player), this will return any of the arbitrary tied scores. What should it return?
			}
			lclSeenScores.add(lclScore);
		}
		return null;
	}
	
	default Performance determineWinner() {
		if (isTied()) {
			return null;
		}
		
		final Tally<Performance> lclScores = getScores();
		Performance lclBest = null;
		for (Performance lclPerf : lclScores.keyList()) {
			if (lclBest == null || lclScores.get(lclPerf) > lclScores.get(lclBest)) {
				lclBest = lclPerf;
			}
		}
		return lclBest; // may still be null, if there are no performances
	}
	
	default Performance determineLoser() {
		if (isTied()) {
			return null;
		}
		
		final Tally<Performance> lclScores = getScores();
		Performance lclWorst = null;
		for (Performance lclPerf : lclScores.keyList()) {
			if (lclWorst == null || lclScores.get(lclPerf) < lclScores.get(lclWorst)) {
				lclWorst = lclPerf;
			}
		}
		return lclWorst; // may still be null, if there are no performances
	}
	
	default String getScoreHTML() {
		final Integer lclTieScore = getTieScore();
		if (lclTieScore == null) { // i.e., not tied
			return determineWinner().getScore() + "&ndash;" + determineLoser().getScore();
		} else {
			return "tied at " + lclTieScore.intValue();
		}
	}
	
	default String getScoreHTMLWithWinner(final Function<Player, String> argPlayerExtractor) {
		Validate.notNull(argPlayerExtractor);
		
		final Integer lclTieScore = getTieScore();
		if (lclTieScore == null) { // i.e., not tied
			Performance lclW = determineWinner();
			return lclW.getScore() + "&ndash;" + determineLoser().getScore() + " in favor of " + argPlayerExtractor.apply(lclW.getPlayer());
		} else {
			return "tied at " + lclTieScore.intValue();
		}
	}
	
	default Performance findPerformance(final Player argPlayer) {
		Validate.notNull(argPlayer);
		
		return streamPerformance().filter(argPerf -> argPerf.getPlayer() == argPlayer).findAny().orElse(null);
	}
	
	default Performance findOrCreatePerformance(final Player argPlayer) {
		Validate.notNull(argPlayer);
		
		Performance lclP = findPerformance(argPlayer);
		if (lclP != null) {
			return lclP;
		}
		
		lclP = PerformanceFactory.getInstance().create().setPlayer(argPlayer);
		this.addPerformance(lclP);
		return lclP;
	}
	
	default int calculateTossupsHeard() {
		List<Integer> lclDistinctResponseCounts = streamPerformance()
			.map(Performance::getResponseCount)
			.distinct()
			.collect(Collectors.toList());
		
		if (lclDistinctResponseCounts.isEmpty()) {
			throw new IllegalStateException("No responses");
		} else if (lclDistinctResponseCounts.size() == 1) {
			return lclDistinctResponseCounts.iterator().next().intValue();
		} else {
			throw new IllegalStateException("Multiple response counts: " + lclDistinctResponseCounts);
		}
		
	}
}
