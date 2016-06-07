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

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getIdAsObject() {
		return getRoundGroupOpal().getIdAsObject();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public RoundGroupImpl setId(java.lang.Integer argId) {
		getRoundGroupOpal().setId(argId);
		return this;
	}

	@Override
	public RoundGroupImpl setId(int argId) {
		getRoundGroupOpal().setId(argId);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public java.lang.String getName() {
		return getRoundGroupOpal().getName();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public RoundGroupImpl setName(java.lang.String argName) {
		getRoundGroupOpal().setName(argName);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getShortName() {
		return getRoundGroupOpal().getShortName();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public RoundGroupImpl setShortName(java.lang.String argShortName) {
		getRoundGroupOpal().setShortName(argShortName);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getSequenceAsObject() {
		return getRoundGroupOpal().getSequenceAsObject();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public RoundGroupImpl setSequence(java.lang.Integer argSequence) {
		getRoundGroupOpal().setSequence(argSequence);
		return this;
	}

	@Override
	public RoundGroupImpl setSequence(int argSequence) {
		getRoundGroupOpal().setSequence(argSequence);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getPhaseIdAsObject() {
		return getRoundGroupOpal().getPhaseIdAsObject();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public RoundGroupImpl setPhaseId(java.lang.Integer argPhaseId) {
		getRoundGroupOpal().setPhaseId(argPhaseId);
		return this;
	}

	@Override
	public RoundGroupImpl setPhaseId(int argPhaseId) {
		getRoundGroupOpal().setPhaseId(argPhaseId);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the Phase object created from round_group through reference round_group_phase_id_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public Phase getPhase() {
		PhaseOpal lclPhaseOpal = getRoundGroupOpal().getPhaseOpal();
		return lclPhaseOpal == null ? null : lclPhaseOpal.getUserFacing();
	}

	@Override
	public RoundGroup setPhase(Phase argPhase) {
		getRoundGroupOpal().setPhaseOpal(argPhase == null ? null : ((PhaseImpl) argPhase).getPhaseOpal());
		return this;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public com.scobolsolo.application.RoundGroup addRound(Round argRound) {
		getRoundGroupOpal().addRoundOpal(((RoundImpl) argRound).getRoundOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.RoundGroup removeRound(Round argRound) {
		getRoundGroupOpal().removeRoundOpal(((RoundImpl) argRound).getRoundOpal());
		return this;
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
