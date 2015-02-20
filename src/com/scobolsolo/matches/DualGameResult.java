package com.scobolsolo.matches;

import java.util.Collection;

import com.scobolsolo.application.Game;
import com.scobolsolo.application.Player;

public class DualGameResult extends GameResult {
	private final Player myWinner;
	private final Player myLoser;
	
	protected DualGameResult(final Game argGame) {
		super(argGame);
		
		if (getPlayerCount() != 2) {
			throw new IllegalArgumentException("Not a dual match!");
		}
		
		myWinner = determineWinner();
		myLoser = determineLoser();
	}
	
	public Player getWinner() {
		return myWinner;
	}
	
	public Player getLoser() {
		return myLoser;
	}
	
	public String getScore() {
		return String.valueOf(getScore(getWinner())) + '-' + String.valueOf(getScore(getLoser()));
	}
	
	protected Player determineWinner() {
		final Collection<Player> lclWinnerCollection = getPlayersRanked(1);
		if (lclWinnerCollection.size() == 1) { // No ties!
			return lclWinnerCollection.iterator().next();
		} else {
			return null;
		}
	}
	
	protected Player determineLoser() {
		final Collection<Player> lclLoserCollection = getPlayersRanked(2);
		if (lclLoserCollection.size() == 1) { // No ties!
			return lclLoserCollection.iterator().next();
		} else {
			return null;
		}
	}
}
