package com.scobolsolo.matches;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

import org.apache.commons.lang3.Validate;

import com.opal.Handle;

import com.scobolsolo.application.Game;
import com.scobolsolo.application.Match;
import com.scobolsolo.application.Player;

public class GameEntryResult implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private final Handle<Game> myGameHandle;
	private boolean myError;
	private final List<String> myMessages;
	
	private Handle<Player> myWinnerPlayerHandle;
	private Handle<Match> myNextMatchForWinnerHandle;
	private Handle<Player> myLoserPlayerHandle;
	private Handle<Match> myNextMatchForLoserHandle;
	
	public GameEntryResult(final Game argGame) {
		myGameHandle = Handle.on(argGame);
		
		// Defaults
		myError = false;
		myMessages = new ArrayList<>();
	}
	
	public Game getGame() {
		return myGameHandle.pull();
	}
	
	public boolean hasError() {
		return myError;
	}
	
	public void setError() {
		myError = true; // Once this is set, you can't unset it.
	}
	
	public String determineHeader(final boolean argOtherErrors) {
		if (argOtherErrors) {
			return "The game could not be saved.";
		}
		
		final int lclMessagesCount = getMessages() == null ? 0 : getMessages().size();
		
		if (hasError()) {
			if (lclMessagesCount == 0) {
				return "The game could not be saved because an internal error occurred.";
			} else if (lclMessagesCount == 1) {
				return "The game could not be saved because of the following error: " + getMessages().get(0);
			} else {
				return "The game could not be saved because of the following errors:";
			}
		} else {
			if (lclMessagesCount == 0) {
				return "The game was saved.";
			} else if (lclMessagesCount == 1) {
				return "The game was saved, but you should take note of the following: " + getMessages().get(0);
			} else {
				return "The game was saved, but you should take note of the following:";
			}
		}
	}
	
	public List<String> getMessages() {
		return myMessages;
	}
	
	public void addMessage(final String argMessage) {
		getMessages().add(Validate.notNull(argMessage));
	}
	
	public void addError(final String argError) {
		addMessage(Validate.notNull(argError));
		setError();
	}
	
	public Player getWinnerPlayer() {
		return myWinnerPlayerHandle.pull();
	}
	
	public void setWinnerPlayer(final Player argW) {
		myWinnerPlayerHandle = Handle.on(argW);
	}
	
	public Match getNextMatchForWinner() {
		if (myNextMatchForWinnerHandle == null) {
			return null;
		} else {
			return myNextMatchForWinnerHandle.pull();
		}
	}
	
	public void setNextMatchForWinner(final Match argM) {
		myNextMatchForWinnerHandle = Handle.on(argM);
	}
	
	public Player getLoserPlayer() {
		return myLoserPlayerHandle.pull();
	}
	
	public void setLoserPlayer(final Player argL) {
		myLoserPlayerHandle = Handle.on(argL);
	}
	
	public Match getNextMatchForLoser() {
		if (myNextMatchForLoserHandle == null) {
			return null;
		} else {
			return myNextMatchForLoserHandle.pull();
		}
	}
	
	public void setNextMatchForLoser(final Match argM) {
		myNextMatchForLoserHandle = Handle.on(argM);
	}
}
