package com.scobolsolo.application;

import com.scobolsolo.persistence.MatchOpal;
import com.scobolsolo.persistence.CardOpal;
import com.scobolsolo.persistence.RoomOpal;
import com.scobolsolo.persistence.RoundOpal;
import com.scobolsolo.persistence.GameOpal;

public class MatchImpl extends com.opal.AbstractIdentityImpl<Match, MatchOpal> implements Match {
	private final MatchOpal myMatchOpal;

	public MatchImpl(MatchOpal argMatchOpal) {
		super();
		myMatchOpal = org.apache.commons.lang3.Validate.notNull(argMatchOpal);
	}

	protected MatchOpal getMatchOpal() {
		return myMatchOpal;
	}

	@Override
	protected com.opal.IdentityOpal<? extends Match> getOpal() {
		return getMatchOpal();
	}

	@Override
	protected com.opal.IdentityOpal<? extends Match> getBottomOpal() {
		return getMatchOpal();
	}

	@Override
	public java.lang.Integer getIdAsObject() {
		return getMatchOpal().getIdAsObject();
	}

	@Override
	public void setId(java.lang.Integer argId) {
		getMatchOpal().setId(argId);
		return;
	}

	@Override
	public void setId(int argId) {
		getMatchOpal().setId(argId);
		return;
	}

	@Override
	public java.lang.Integer getRoundIdAsObject() {
		return getMatchOpal().getRoundIdAsObject();
	}

	@Override
	public void setRoundId(java.lang.Integer argRoundId) {
		getMatchOpal().setRoundId(argRoundId);
		return;
	}

	@Override
	public void setRoundId(int argRoundId) {
		getMatchOpal().setRoundId(argRoundId);
		return;
	}

	@Override
	public java.lang.Integer getRoomIdAsObject() {
		return getMatchOpal().getRoomIdAsObject();
	}

	@Override
	public void setRoomId(java.lang.Integer argRoomId) {
		getMatchOpal().setRoomId(argRoomId);
		return;
	}

	@Override
	public void setRoomId(int argRoomId) {
		getMatchOpal().setRoomId(argRoomId);
		return;
	}

	@Override
	public java.lang.Integer getWinningCardIdAsObject() {
		return getMatchOpal().getWinningCardIdAsObject();
	}

	@Override
	public void setWinningCardId(java.lang.Integer argWinningCardId) {
		getMatchOpal().setWinningCardId(argWinningCardId);
		return;
	}

	@Override
	public void setWinningCardId(int argWinningCardId) {
		getMatchOpal().setWinningCardId(argWinningCardId);
		return;
	}

	@Override
	public java.lang.Integer getLosingCardIdAsObject() {
		return getMatchOpal().getLosingCardIdAsObject();
	}

	@Override
	public void setLosingCardId(java.lang.Integer argLosingCardId) {
		getMatchOpal().setLosingCardId(argLosingCardId);
		return;
	}

	@Override
	public void setLosingCardId(int argLosingCardId) {
		getMatchOpal().setLosingCardId(argLosingCardId);
		return;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** Access to the Card object created from match through reference match_losing_card_id_fkey */

	@Override
	public Card getLosingCard() {
		CardOpal lclCardOpal = getMatchOpal().getLosingCardOpal();
		return lclCardOpal == null ? null : lclCardOpal.getUserFacing();
	}

	@Override
	public void setLosingCard(Card argCard) {
		getMatchOpal().setLosingCardOpal(argCard == null ? null : ((CardImpl) argCard).getCardOpal());
		return;
	}

	/** Access to the Room object created from match through reference match_room_id_fkey */

	@Override
	public Room getRoom() {
		RoomOpal lclRoomOpal = getMatchOpal().getRoomOpal();
		return lclRoomOpal == null ? null : lclRoomOpal.getUserFacing();
	}

	@Override
	public void setRoom(Room argRoom) {
		getMatchOpal().setRoomOpal(argRoom == null ? null : ((RoomImpl) argRoom).getRoomOpal());
		return;
	}

	/** Access to the Round object created from match through reference match_round_id_fkey */

	@Override
	public Round getRound() {
		RoundOpal lclRoundOpal = getMatchOpal().getRoundOpal();
		return lclRoundOpal == null ? null : lclRoundOpal.getUserFacing();
	}

	@Override
	public void setRound(Round argRound) {
		getMatchOpal().setRoundOpal(argRound == null ? null : ((RoundImpl) argRound).getRoundOpal());
		return;
	}

	/** Access to the Card object created from match through reference match_winning_card_id_fkey */

	@Override
	public Card getWinningCard() {
		CardOpal lclCardOpal = getMatchOpal().getWinningCardOpal();
		return lclCardOpal == null ? null : lclCardOpal.getUserFacing();
	}

	@Override
	public void setWinningCard(Card argCard) {
		getMatchOpal().setWinningCardOpal(argCard == null ? null : ((CardImpl) argCard).getCardOpal());
		return;
	}

	@Override
	public Game getGame() {
		GameOpal lclO = getMatchOpal().getGameOpal();
		return lclO == null ? null : lclO.getUserFacing();
	}

	@Override
	public void setGame(Game argGame) {
		getMatchOpal().setGameOpal(argGame == null ? null : ((GameImpl) argGame).getGameOpal());
		return;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public void unlink() {
		getMatchOpal().unlink();
	}

	@Override
	public void reload() {
		getMatchOpal().reload();
	}

	@Override
	public Match copy() {
		return getMatchOpal().copy().getUserFacing();
	}

}
