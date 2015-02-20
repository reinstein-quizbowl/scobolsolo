package com.scobolsolo.application;

import com.scobolsolo.persistence.CardOpal;
import com.scobolsolo.persistence.PhaseOpal;
import com.scobolsolo.persistence.PlayerOpal;

public class CardImpl extends com.opal.AbstractIdentityImpl<CardOpal> implements Card {
	private final CardOpal myCardOpal;

	public CardImpl(CardOpal argCardOpal) {
		super();
		myCardOpal = org.apache.commons.lang3.Validate.notNull(argCardOpal);
	}

	protected CardOpal getCardOpal() {
		return myCardOpal;
	}

	@Override
	protected /* Opal<? extends UserFacing> */ CardOpal getBottomOpal() {
		return getCardOpal();
	}

	@Override
	protected /* Opal<? extends UserFacing> */ CardOpal[] getOpalArray() {
		return new /* Opal<?> */ CardOpal[] {
			getCardOpal(),
		};
	}

	@Override
	public int compareTo(Card argSecond) {
		return this.getSequenceAsObject().compareTo(argSecond.getSequenceAsObject());
	}

	@Override
	public java.lang.Integer getIdAsObject() {
		return getCardOpal().getIdAsObject();
	}

	@Override
	public void setId(java.lang.Integer argId) {
		getCardOpal().setId(argId);
		return;
	}

	@Override
	public void setId(int argId) {
		getCardOpal().setId(argId);
		return;
	}

	@Override
	public java.lang.String getName() {
		return getCardOpal().getName();
	}

	@Override
	public void setName(java.lang.String argName) {
		getCardOpal().setName(argName);
		return;
	}

	@Override
	public java.lang.String getShortName() {
		return getCardOpal().getShortName();
	}

	@Override
	public void setShortName(java.lang.String argShortName) {
		getCardOpal().setShortName(argShortName);
		return;
	}

	@Override
	public java.lang.Integer getSequenceAsObject() {
		return getCardOpal().getSequenceAsObject();
	}

	@Override
	public void setSequence(java.lang.Integer argSequence) {
		getCardOpal().setSequence(argSequence);
		return;
	}

	@Override
	public void setSequence(int argSequence) {
		getCardOpal().setSequence(argSequence);
		return;
	}

	@Override
	public java.lang.String getFinalMessage() {
		return getCardOpal().getFinalMessage();
	}

	@Override
	public void setFinalMessage(java.lang.String argFinalMessage) {
		getCardOpal().setFinalMessage(argFinalMessage);
		return;
	}

	@Override
	public java.lang.Integer getPhaseIdAsObject() {
		return getCardOpal().getPhaseIdAsObject();
	}

	@Override
	public void setPhaseId(java.lang.Integer argPhaseId) {
		getCardOpal().setPhaseId(argPhaseId);
		return;
	}

	@Override
	public void setPhaseId(int argPhaseId) {
		getCardOpal().setPhaseId(argPhaseId);
		return;
	}

	/* The following methods allow direct access to the user objects for which
	this object has foreign keys in the database. */

	/** Access to the Phase object created from the table card through foreign key card_phase_id_fkey */

	@Override
	public Phase getPhase() {
		PhaseOpal lclPhaseOpal = getCardOpal().getPhaseOpal();
		return lclPhaseOpal == null ? null : lclPhaseOpal.getUserFacing();
	}

	@Override
	public void setPhase(Phase argPhase) {
		getCardOpal().setPhaseOpal(argPhase == null ? null : ((PhaseImpl) argPhase).getPhaseOpal());
		return;
	}

	@Override
	public Player getInitialPlayer() {
		PlayerOpal lclO = getCardOpal().getInitialPlayerOpal();
		return lclO == null ? null : lclO.getUserFacing();
	}

	@Override
	public void setInitialPlayer(Player argPlayer) {
		getCardOpal().setInitialPlayerOpal(argPlayer == null ? null : ((PlayerImpl) argPlayer).getPlayerOpal());
		return;
	}

	/* The following methods allow access to the user objects that have foreign keys
	to this object. */

	@Override
	public void addLosingMatch(Match argMatch) {
		getCardOpal().addLosingMatchOpal(((MatchImpl) argMatch).getMatchOpal());
	}

	@Override
	public void removeLosingMatch(Match argMatch) {
		getCardOpal().removeLosingMatchOpal(((MatchImpl) argMatch).getMatchOpal());
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
	public void clearLosingMatch() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addWinningMatch(Match argMatch) {
		getCardOpal().addWinningMatchOpal(((MatchImpl) argMatch).getMatchOpal());
	}

	@Override
	public void removeWinningMatch(Match argMatch) {
		getCardOpal().removeWinningMatchOpal(((MatchImpl) argMatch).getMatchOpal());
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
	public void clearWinningMatch() {
		throw new UnsupportedOperationException();
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
