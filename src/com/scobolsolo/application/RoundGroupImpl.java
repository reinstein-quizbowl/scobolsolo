package com.scobolsolo.application;

import com.scobolsolo.persistence.RoundGroupOpal;
import com.scobolsolo.persistence.PhaseOpal;

public class RoundGroupImpl extends com.opal.AbstractIdentityImpl<RoundGroup, RoundGroupOpal> implements RoundGroup {
	private final RoundGroupOpal myRoundGroupOpal;

	public RoundGroupImpl(RoundGroupOpal argRoundGroupOpal) {
		super();
		myRoundGroupOpal = org.apache.commons.lang3.Validate.notNull(argRoundGroupOpal);
	}

	protected RoundGroupOpal getRoundGroupOpal() {
		return myRoundGroupOpal;
	}

	@Override
	protected com.opal.IdentityOpal<? extends RoundGroup> getOpal() {
		return getRoundGroupOpal();
	}

	@Override
	protected com.opal.IdentityOpal<? extends RoundGroup> getBottomOpal() {
		return getRoundGroupOpal();
	}

	@Override
	public java.lang.Integer getIdAsObject() {
		return getRoundGroupOpal().getIdAsObject();
	}

	@Override
	public void setId(java.lang.Integer argId) {
		getRoundGroupOpal().setId(argId);
		return;
	}

	@Override
	public void setId(int argId) {
		getRoundGroupOpal().setId(argId);
		return;
	}

	@Override
	public java.lang.String getName() {
		return getRoundGroupOpal().getName();
	}

	@Override
	public void setName(java.lang.String argName) {
		getRoundGroupOpal().setName(argName);
		return;
	}

	@Override
	public java.lang.String getShortName() {
		return getRoundGroupOpal().getShortName();
	}

	@Override
	public void setShortName(java.lang.String argShortName) {
		getRoundGroupOpal().setShortName(argShortName);
		return;
	}

	@Override
	public java.lang.Integer getSequenceAsObject() {
		return getRoundGroupOpal().getSequenceAsObject();
	}

	@Override
	public void setSequence(java.lang.Integer argSequence) {
		getRoundGroupOpal().setSequence(argSequence);
		return;
	}

	@Override
	public void setSequence(int argSequence) {
		getRoundGroupOpal().setSequence(argSequence);
		return;
	}

	@Override
	public java.lang.Integer getPhaseIdAsObject() {
		return getRoundGroupOpal().getPhaseIdAsObject();
	}

	@Override
	public void setPhaseId(java.lang.Integer argPhaseId) {
		getRoundGroupOpal().setPhaseId(argPhaseId);
		return;
	}

	@Override
	public void setPhaseId(int argPhaseId) {
		getRoundGroupOpal().setPhaseId(argPhaseId);
		return;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** Access to the Phase object created from round_group through reference round_group_phase_id_fkey */

	@Override
	public Phase getPhase() {
		PhaseOpal lclPhaseOpal = getRoundGroupOpal().getPhaseOpal();
		return lclPhaseOpal == null ? null : lclPhaseOpal.getUserFacing();
	}

	@Override
	public void setPhase(Phase argPhase) {
		getRoundGroupOpal().setPhaseOpal(argPhase == null ? null : ((PhaseImpl) argPhase).getPhaseOpal());
		return;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public void addRound(Round argRound) {
		getRoundGroupOpal().addRoundOpal(((RoundImpl) argRound).getRoundOpal());
	}

	@Override
	public void removeRound(Round argRound) {
		getRoundGroupOpal().removeRoundOpal(((RoundImpl) argRound).getRoundOpal());
	}

	@Override
	public int getRoundCount() {
		return getRoundGroupOpal().getRoundOpalCount();
	}

	@Override
	public java.util.stream.Stream<Round> streamRound() {
		return getRoundGroupOpal().streamRoundOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<Round> createRoundIterator() {
		return new com.opal.OpalIterator<> (getRoundGroupOpal().createRoundOpalIterator());
	}

	@Override
	public void clearRound() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void unlink() {
		getRoundGroupOpal().unlink();
	}

	@Override
	public void reload() {
		getRoundGroupOpal().reload();
	}

	@Override
	public RoundGroup copy() {
		return getRoundGroupOpal().copy().getUserFacing();
	}

}
