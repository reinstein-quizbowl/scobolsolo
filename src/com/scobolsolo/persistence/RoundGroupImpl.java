package com.scobolsolo.persistence;

public class RoundGroupImpl extends com.opal.AbstractIdentityImpl<com.scobolsolo.application.RoundGroup, com.scobolsolo.persistence.RoundGroupOpal> implements com.scobolsolo.application.RoundGroup {

	private final com.scobolsolo.persistence.RoundGroupOpal myRoundGroupOpal;

	public RoundGroupImpl(RoundGroupOpal argRoundGroupOpal) {
		super();
		myRoundGroupOpal = org.apache.commons.lang3.Validate.notNull(argRoundGroupOpal);
	}

	protected com.scobolsolo.persistence.RoundGroupOpal getRoundGroupOpal() {
		return myRoundGroupOpal;
	}

	@Override
	public com.scobolsolo.persistence.RoundGroupOpal getOpal() {
		return getRoundGroupOpal();
	}

	@Override
	public com.scobolsolo.persistence.RoundGroupOpal getBottomOpal() {
		return getRoundGroupOpal();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getIdAsObject() {
		return getRoundGroupOpal().getIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.RoundGroupImpl setId(java.lang.Integer argId) {
		getRoundGroupOpal().setId(argId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.RoundGroupImpl setId(int argId) {
		getRoundGroupOpal().setId(argId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public java.lang.String getName() {
		return getRoundGroupOpal().getName();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public com.scobolsolo.persistence.RoundGroupImpl setName(java.lang.String argName) {
		getRoundGroupOpal().setName(argName);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getShortName() {
		return getRoundGroupOpal().getShortName();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public com.scobolsolo.persistence.RoundGroupImpl setShortName(java.lang.String argShortName) {
		getRoundGroupOpal().setShortName(argShortName);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getSequenceAsObject() {
		return getRoundGroupOpal().getSequenceAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.RoundGroupImpl setSequence(java.lang.Integer argSequence) {
		getRoundGroupOpal().setSequence(argSequence);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.RoundGroupImpl setSequence(int argSequence) {
		getRoundGroupOpal().setSequence(argSequence);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getPhaseIdAsObject() {
		return getRoundGroupOpal().getPhaseIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.RoundGroupImpl setPhaseId(java.lang.Integer argPhaseId) {
		getRoundGroupOpal().setPhaseId(argPhaseId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.RoundGroupImpl setPhaseId(int argPhaseId) {
		getRoundGroupOpal().setPhaseId(argPhaseId);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the Phase object created from round_group through reference round_group_phase_id_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.Phase getPhase() {
		PhaseOpal lclPhaseOpal = getRoundGroupOpal().getPhaseOpal();
		return lclPhaseOpal == null ? null : lclPhaseOpal.getUserFacing();
	}

	@Override
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.RoundGroup setPhase(com.scobolsolo.application.Phase argPhase) {
		getRoundGroupOpal().setPhaseOpal(argPhase == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.Phase, com.scobolsolo.persistence.PhaseOpal>) argPhase).getOpal());
		return this;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public java.util.Set<com.scobolsolo.application.Round> getRoundSet() {
		return new com.opal.UserFacingBackCollectionSet<>(getRoundGroupOpal().getRoundOpalSet());
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
	public com.scobolsolo.application.RoundGroup copy() {
		return getRoundGroupOpal().copy().getUserFacing();
	}

}
