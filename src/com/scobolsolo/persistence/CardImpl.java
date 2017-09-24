package com.scobolsolo.persistence;

public class CardImpl extends com.opal.AbstractIdentityImpl<com.scobolsolo.application.Card, com.scobolsolo.persistence.CardOpal> implements com.scobolsolo.application.Card {

	private final com.scobolsolo.persistence.CardOpal myCardOpal;

	public CardImpl(CardOpal argCardOpal) {
		super();
		myCardOpal = org.apache.commons.lang3.Validate.notNull(argCardOpal);
	}

	protected com.scobolsolo.persistence.CardOpal getCardOpal() {
		return myCardOpal;
	}

	@Override
	public com.scobolsolo.persistence.CardOpal getOpal() {
		return getCardOpal();
	}

	@Override
	public com.scobolsolo.persistence.CardOpal getBottomOpal() {
		return getCardOpal();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getIdAsObject() {
		return getCardOpal().getIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.CardImpl setId(java.lang.Integer argId) {
		getCardOpal().setId(argId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.CardImpl setId(int argId) {
		getCardOpal().setId(argId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public java.lang.String getName() {
		return getCardOpal().getName();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public com.scobolsolo.persistence.CardImpl setName(java.lang.String argName) {
		getCardOpal().setName(argName);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getShortName() {
		return getCardOpal().getShortName();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public com.scobolsolo.persistence.CardImpl setShortName(java.lang.String argShortName) {
		getCardOpal().setShortName(argShortName);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getSequenceAsObject() {
		return getCardOpal().getSequenceAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.CardImpl setSequence(java.lang.Integer argSequence) {
		getCardOpal().setSequence(argSequence);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.CardImpl setSequence(int argSequence) {
		getCardOpal().setSequence(argSequence);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public java.lang.String getFinalMessage() {
		return getCardOpal().getFinalMessage();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public com.scobolsolo.persistence.CardImpl setFinalMessage(java.lang.String argFinalMessage) {
		getCardOpal().setFinalMessage(argFinalMessage);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getPhaseIdAsObject() {
		return getCardOpal().getPhaseIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.CardImpl setPhaseId(java.lang.Integer argPhaseId) {
		getCardOpal().setPhaseId(argPhaseId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.CardImpl setPhaseId(int argPhaseId) {
		getCardOpal().setPhaseId(argPhaseId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getInitialPlayerIdAsObject() {
		return getCardOpal().getInitialPlayerIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.persistence.CardImpl setInitialPlayerId(java.lang.Integer argInitialPlayerId) {
		getCardOpal().setInitialPlayerId(argInitialPlayerId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.CardImpl setInitialPlayerId(int argInitialPlayerId) {
		getCardOpal().setInitialPlayerId(argInitialPlayerId);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the Player object created from card through reference card_initial_player_id_fkey */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.application.Player getInitialPlayer() {
		PlayerOpal lclPlayerOpal = getCardOpal().getInitialPlayerOpal();
		return lclPlayerOpal == null ? null : lclPlayerOpal.getUserFacing();
	}

	@Override
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.Card setInitialPlayer(com.scobolsolo.application.Player argPlayer) {
		getCardOpal().setInitialPlayerOpal(argPlayer == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.Player, com.scobolsolo.persistence.PlayerOpal>) argPlayer).getOpal());
		return this;
	}

	/** @return the Phase object created from card through reference card_phase_id_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.Phase getPhase() {
		PhaseOpal lclPhaseOpal = getCardOpal().getPhaseOpal();
		return lclPhaseOpal == null ? null : lclPhaseOpal.getUserFacing();
	}

	@Override
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.Card setPhase(com.scobolsolo.application.Phase argPhase) {
		getCardOpal().setPhaseOpal(argPhase == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.Phase, com.scobolsolo.persistence.PhaseOpal>) argPhase).getOpal());
		return this;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public java.util.Set<com.scobolsolo.application.Match> getLosingMatchSet() {
		return new com.opal.UserFacingBackCollectionSet<>(getCardOpal().getLosingMatchOpalSet());
	}

	@Override
	public java.util.Set<com.scobolsolo.application.Match> getWinningMatchSet() {
		return new com.opal.UserFacingBackCollectionSet<>(getCardOpal().getWinningMatchOpalSet());
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
	public com.scobolsolo.application.Card copy() {
		return getCardOpal().copy().getUserFacing();
	}

}
