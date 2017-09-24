package com.scobolsolo.persistence;

public class MatchImpl extends com.opal.AbstractIdentityImpl<com.scobolsolo.application.Match, com.scobolsolo.persistence.MatchOpal> implements com.scobolsolo.application.Match {

	private final com.scobolsolo.persistence.MatchOpal myMatchOpal;

	public MatchImpl(MatchOpal argMatchOpal) {
		super();
		myMatchOpal = org.apache.commons.lang3.Validate.notNull(argMatchOpal);
	}

	protected com.scobolsolo.persistence.MatchOpal getMatchOpal() {
		return myMatchOpal;
	}

	@Override
	public com.scobolsolo.persistence.MatchOpal getOpal() {
		return getMatchOpal();
	}

	@Override
	public com.scobolsolo.persistence.MatchOpal getBottomOpal() {
		return getMatchOpal();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getIdAsObject() {
		return getMatchOpal().getIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.MatchImpl setId(java.lang.Integer argId) {
		getMatchOpal().setId(argId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.MatchImpl setId(int argId) {
		getMatchOpal().setId(argId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getRoundIdAsObject() {
		return getMatchOpal().getRoundIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.MatchImpl setRoundId(java.lang.Integer argRoundId) {
		getMatchOpal().setRoundId(argRoundId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.MatchImpl setRoundId(int argRoundId) {
		getMatchOpal().setRoundId(argRoundId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getRoomIdAsObject() {
		return getMatchOpal().getRoomIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.MatchImpl setRoomId(java.lang.Integer argRoomId) {
		getMatchOpal().setRoomId(argRoomId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.MatchImpl setRoomId(int argRoomId) {
		getMatchOpal().setRoomId(argRoomId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getWinningCardIdAsObject() {
		return getMatchOpal().getWinningCardIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.persistence.MatchImpl setWinningCardId(java.lang.Integer argWinningCardId) {
		getMatchOpal().setWinningCardId(argWinningCardId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.MatchImpl setWinningCardId(int argWinningCardId) {
		getMatchOpal().setWinningCardId(argWinningCardId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getLosingCardIdAsObject() {
		return getMatchOpal().getLosingCardIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.persistence.MatchImpl setLosingCardId(java.lang.Integer argLosingCardId) {
		getMatchOpal().setLosingCardId(argLosingCardId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.MatchImpl setLosingCardId(int argLosingCardId) {
		getMatchOpal().setLosingCardId(argLosingCardId);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the Card object created from match through reference match_losing_card_id_fkey */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.application.Card getLosingCard() {
		CardOpal lclCardOpal = getMatchOpal().getLosingCardOpal();
		return lclCardOpal == null ? null : lclCardOpal.getUserFacing();
	}

	@Override
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.Match setLosingCard(com.scobolsolo.application.Card argCard) {
		getMatchOpal().setLosingCardOpal(argCard == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.Card, com.scobolsolo.persistence.CardOpal>) argCard).getOpal());
		return this;
	}

	/** @return the Room object created from match through reference match_room_id_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.Room getRoom() {
		RoomOpal lclRoomOpal = getMatchOpal().getRoomOpal();
		return lclRoomOpal == null ? null : lclRoomOpal.getUserFacing();
	}

	@Override
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.Match setRoom(com.scobolsolo.application.Room argRoom) {
		getMatchOpal().setRoomOpal(argRoom == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.Room, com.scobolsolo.persistence.RoomOpal>) argRoom).getOpal());
		return this;
	}

	/** @return the Round object created from match through reference match_round_id_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.Round getRound() {
		RoundOpal lclRoundOpal = getMatchOpal().getRoundOpal();
		return lclRoundOpal == null ? null : lclRoundOpal.getUserFacing();
	}

	@Override
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.Match setRound(com.scobolsolo.application.Round argRound) {
		getMatchOpal().setRoundOpal(argRound == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.Round, com.scobolsolo.persistence.RoundOpal>) argRound).getOpal());
		return this;
	}

	/** @return the Card object created from match through reference match_winning_card_id_fkey */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.application.Card getWinningCard() {
		CardOpal lclCardOpal = getMatchOpal().getWinningCardOpal();
		return lclCardOpal == null ? null : lclCardOpal.getUserFacing();
	}

	@Override
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.Match setWinningCard(com.scobolsolo.application.Card argCard) {
		getMatchOpal().setWinningCardOpal(argCard == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.Card, com.scobolsolo.persistence.CardOpal>) argCard).getOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Game getGame() {
		GameOpal lclO = getMatchOpal().getGameOpal();
		return lclO == null ? null : lclO.getUserFacing();
	}

	@Override
	public com.scobolsolo.application.Match setGame(com.scobolsolo.application.Game argGame) {
		getMatchOpal().setGameOpal(argGame == null ? null : ((GameImpl) argGame).getGameOpal());
		return this;
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
	public com.scobolsolo.application.Match copy() {
		return getMatchOpal().copy().getUserFacing();
	}

}
