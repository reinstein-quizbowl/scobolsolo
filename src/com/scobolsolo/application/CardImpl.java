package com.scobolsolo.application;

import com.scobolsolo.persistence.CardOpal;
import com.scobolsolo.persistence.PhaseOpal;
import com.scobolsolo.persistence.PlayerOpal;

public class CardImpl extends com.opal.AbstractIdentityImpl<Card, CardOpal> implements Card {

	private final CardOpal myCardOpal;

	public CardImpl(CardOpal argCardOpal) {
		super();
		myCardOpal = org.apache.commons.lang3.Validate.notNull(argCardOpal);
	}

	protected CardOpal getCardOpal() {
		return myCardOpal;
	}

	@Override
	protected com.opal.IdentityOpal<? extends Card> getOpal() {
		return getCardOpal();
	}

	@Override
	protected com.opal.IdentityOpal<? extends Card> getBottomOpal() {
		return getCardOpal();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getIdAsObject() {
		return getCardOpal().getIdAsObject();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public CardImpl setId(java.lang.Integer argId) {
		getCardOpal().setId(argId);
		return this;
	}

	@Override
	public CardImpl setId(int argId) {
		getCardOpal().setId(argId);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public java.lang.String getName() {
		return getCardOpal().getName();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public CardImpl setName(java.lang.String argName) {
		getCardOpal().setName(argName);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getShortName() {
		return getCardOpal().getShortName();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public CardImpl setShortName(java.lang.String argShortName) {
		getCardOpal().setShortName(argShortName);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getSequenceAsObject() {
		return getCardOpal().getSequenceAsObject();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public CardImpl setSequence(java.lang.Integer argSequence) {
		getCardOpal().setSequence(argSequence);
		return this;
	}

	@Override
	public CardImpl setSequence(int argSequence) {
		getCardOpal().setSequence(argSequence);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public java.lang.String getFinalMessage() {
		return getCardOpal().getFinalMessage();
	}

	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public CardImpl setFinalMessage(java.lang.String argFinalMessage) {
		getCardOpal().setFinalMessage(argFinalMessage);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getPhaseIdAsObject() {
		return getCardOpal().getPhaseIdAsObject();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public CardImpl setPhaseId(java.lang.Integer argPhaseId) {
		getCardOpal().setPhaseId(argPhaseId);
		return this;
	}

	@Override
	public CardImpl setPhaseId(int argPhaseId) {
		getCardOpal().setPhaseId(argPhaseId);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getInitialPlayerIdAsObject() {
		return getCardOpal().getInitialPlayerIdAsObject();
	}

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public CardImpl setInitialPlayerId(java.lang.Integer argInitialPlayerId) {
		getCardOpal().setInitialPlayerId(argInitialPlayerId);
		return this;
	}

	@Override
	public CardImpl setInitialPlayerId(int argInitialPlayerId) {
		getCardOpal().setInitialPlayerId(argInitialPlayerId);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the Phase object created from card through reference card_phase_id_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public Phase getPhase() {
		PhaseOpal lclPhaseOpal = getCardOpal().getPhaseOpal();
		return lclPhaseOpal == null ? null : lclPhaseOpal.getUserFacing();
	}

	@Override
	public Card setPhase(Phase argPhase) {
		getCardOpal().setPhaseOpal(argPhase == null ? null : ((PhaseImpl) argPhase).getPhaseOpal());
		return this;
	}

	/** @return the Player object created from card through reference card_initial_player_id_fkey */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public Player getInitialPlayer() {
		PlayerOpal lclPlayerOpal = getCardOpal().getInitialPlayerOpal();
		return lclPlayerOpal == null ? null : lclPlayerOpal.getUserFacing();
	}

	@Override
	public Card setInitialPlayer(Player argPlayer) {
		getCardOpal().setInitialPlayerOpal(argPlayer == null ? null : ((PlayerImpl) argPlayer).getPlayerOpal());
		return this;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public com.scobolsolo.application.Card addLosingMatch(Match argMatch) {
		getCardOpal().addLosingMatchOpal(((MatchImpl) argMatch).getMatchOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Card removeLosingMatch(Match argMatch) {
		getCardOpal().removeLosingMatchOpal(((MatchImpl) argMatch).getMatchOpal());
		return this;
	}

	@Override
	public int getLosingMatchCount() {
		return getCardOpal().getLosingMatchOpalCount();
	}

	@Override
	public java.util.stream.Stream<Match> streamLosingMatch() {
		return getCardOpal().streamLosingMatchOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<Match> createLosingMatchIterator() {
		return new com.opal.OpalIterator<> (getCardOpal().createLosingMatchOpalIterator());
	}

	@Override
	public com.scobolsolo.application.Card addWinningMatch(Match argMatch) {
		getCardOpal().addWinningMatchOpal(((MatchImpl) argMatch).getMatchOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Card removeWinningMatch(Match argMatch) {
		getCardOpal().removeWinningMatchOpal(((MatchImpl) argMatch).getMatchOpal());
		return this;
	}

	@Override
	public int getWinningMatchCount() {
		return getCardOpal().getWinningMatchOpalCount();
	}

	@Override
	public java.util.stream.Stream<Match> streamWinningMatch() {
		return getCardOpal().streamWinningMatchOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<Match> createWinningMatchIterator() {
		return new com.opal.OpalIterator<> (getCardOpal().createWinningMatchOpalIterator());
	}

	@Override
	public void unlink() {
		getCardOpal().unlink();
	}

	@Override
	public void reload() {
		getCardOpal().reload();
	}

	@Override
	public Card copy() {
		return getCardOpal().copy().getUserFacing();
	}

}
