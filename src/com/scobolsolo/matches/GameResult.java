package com.scobolsolo.matches;

import java.util.Collections;
import java.util.Collection;
import java.util.Set;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

import org.apache.commons.collections4.map.Flat3Map;
import org.apache.commons.lang3.Validate;
import org.apache.commons.lang3.mutable.MutableInt;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.Multimaps;
import com.google.common.collect.Multimap;
import com.google.common.collect.HashMultimap;

import com.siliconage.util.Fast3Set;
import com.siliconage.util.Tally;

import com.scobolsolo.application.*;

public class GameResult {
	private static final LoadingCache<Game, GameResult> myCache = CacheBuilder.newBuilder()
																			  .softValues()
																			  .build(
																				new CacheLoader<Game, GameResult>() {
																					@Override
																					public GameResult load(final Game argGame) {
																						Validate.notNull(argGame);
																						if (argGame.getMatch().isDual()) {
																							return new DualGameResult(argGame);
																						} else {
																							return new GameResult(argGame);
																						}
																					}
																				}
																			);
	
	private final Game myGame;
	
	private final Set<Player> myPlayers;
	private final Map<Player, Integer> myScores;
	private final Map<Player, Tally<ResponseType>> myResponseCounts;
	private final Map<Player, Integer> myOrderOfFinish;
	private final Multimap<Integer, Player> myPlayersByRank;
	
	public static GameResult get(final Game argGame) {
		Validate.notNull(argGame);
		try {
			return myCache.get(argGame);
		} catch (Exception lclE) {
			return null;
		}
	}
	
	public static void uncache(final Game argGame) {
		Validate.notNull(argGame);
		
		try {
			myCache.invalidate(argGame);
			myCache.get(argGame);
		} catch (Exception lclE) {
			// swallow it
		}
	}
	
	protected static LoadingCache<Game, GameResult> getCache() {
		return myCache;
	}
	
	protected GameResult(final Game argGame) {
		Validate.notNull(argGame);
		myGame = argGame;
		
		if (!argGame.getMatch().determineStatus().hasResults()) {
			throw new IllegalArgumentException("This game has no results.");
		}
		
		final int lclSize = argGame.getPerformanceCount();
		
		myPlayers = new Fast3Set<>();
		myScores = new Flat3Map<>();
		myResponseCounts = new Flat3Map<>();
		
		for (final Performance lclP : argGame.createPerformanceArray()) {
			final Player lclPlayer = lclP.getPlayer();
			myPlayers.add(lclPlayer);
			
			final Tally<ResponseType> lclTally = new Tally<>();
			
			final MutableInt lclScore = new MutableInt(0);
			for (final Response lclR : lclP.createResponseArray()) {
				lclScore.add(lclR.getResponseType().getPoints());
				lclTally.tally(lclR.getResponseType());
			}
			
			myScores.put(lclPlayer, lclScore.toInteger());
			myResponseCounts.put(lclPlayer, lclTally);
		}
		
		myOrderOfFinish = new Flat3Map<>();
		myPlayersByRank = HashMultimap.create(lclSize, 1);
		
		final List<Integer> lclScores = new ArrayList<>(myScores.values());
		lclScores.sort(null);
		Collections.reverse(lclScores);
		int lclRank = 1;
		for (final Integer lclScore : lclScores) {
			final List<Player> lclPlayersWithScore = new ArrayList<>(1);
			for (final Map.Entry<Player, Integer> lclEntry : myScores.entrySet()) {
				final Player lclP = lclEntry.getKey();
				final int lclPlayerScore = lclEntry.getValue().intValue();
				
				if (lclPlayerScore == lclScore.intValue()) {
					lclPlayersWithScore.add(lclP);
				}
			}
			
			for (final Player lclP : lclPlayersWithScore) {
				myOrderOfFinish.put(lclP, lclRank);
			}
			
			myPlayersByRank.putAll(lclRank, lclPlayersWithScore);
			
			lclRank += lclPlayersWithScore.size();
		}
	}
	
	public Game getGame() {
		return myGame;
	}
	
	public Set<Player> getPlayers() {
		return Collections.unmodifiableSet(myPlayers);
	}
	
	public int getPlayerCount() {
		return getPlayers().size();
	}
	
	public Map<Player, Integer> getOrderOfFinish() {
		return Collections.unmodifiableMap(myOrderOfFinish);
	}
	
	public Integer getFinish(final Player argP) {
		Validate.notNull(argP);
		
		if (getPlayers().contains(argP)) {
			return getOrderOfFinish().get(argP);
		} else {
			throw new IllegalArgumentException(argP.getContact().getName() + " is not in this game");
		}
	}
	
	public Multimap<Integer, Player> getPlayersByRank() {
		return Multimaps.unmodifiableMultimap(myPlayersByRank);
	}
	
	public Collection<Player> getPlayersRanked(final Integer argRank) {
		return Collections.unmodifiableCollection(getPlayersByRank().get(argRank)); // may be null
	}
	
	public Map<Player, Integer> getScores() {
		return myScores;
	}
	
	public Integer getScore(final Player argP) {
		Validate.notNull(argP);
		
		if (getPlayers().contains(argP)) {
			return getScores().get(argP);
		} else {
			throw new IllegalArgumentException(argP.getContact().getName() + " is not in this game");
		}
	}
	
	public Map<Player, Tally<ResponseType>> getResponseCounts() {
		return Collections.unmodifiableMap(myResponseCounts);
	}
	
	public Tally<ResponseType> getResponseCounts(final Player argP) {
		Validate.notNull(argP);
		
		if (getPlayers().contains(argP)) {
			return getResponseCounts().get(argP);
		} else {
			throw new IllegalArgumentException(argP.getContact().getName() + " is not in this game");
		}
	}
	
	public int getResponseCount(final Player argP, final ResponseType argRT) {
		Validate.notNull(argP);
		Validate.notNull(argRT);
		
		return getResponseCounts(argP).get(argRT);
	}
}
