package com.scobolsolo.persistence;

public class RoundImpl extends com.opal.AbstractIdentityImpl<com.scobolsolo.application.Round, com.scobolsolo.persistence.RoundOpal> implements com.scobolsolo.application.Round {

	private final com.scobolsolo.persistence.RoundOpal myRoundOpal;

	public RoundImpl(RoundOpal argRoundOpal) {
		super();
		myRoundOpal = org.apache.commons.lang3.Validate.notNull(argRoundOpal);
	}

	protected com.scobolsolo.persistence.RoundOpal getRoundOpal() {
		return myRoundOpal;
	}

	@Override
	public com.scobolsolo.persistence.RoundOpal getOpal() {
		return getRoundOpal();
	}

	@Override
	public com.scobolsolo.persistence.RoundOpal getBottomOpal() {
		return getRoundOpal();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getIdAsObject() {
		return getRoundOpal().getIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.RoundImpl setId(java.lang.Integer argId) {
		getRoundOpal().setId(argId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.RoundImpl setId(int argId) {
		getRoundOpal().setId(argId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public java.lang.String getName() {
		return getRoundOpal().getName();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public com.scobolsolo.persistence.RoundImpl setName(java.lang.String argName) {
		getRoundOpal().setName(argName);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getShortName() {
		return getRoundOpal().getShortName();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public com.scobolsolo.persistence.RoundImpl setShortName(java.lang.String argShortName) {
		getRoundOpal().setShortName(argShortName);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getSequenceAsObject() {
		return getRoundOpal().getSequenceAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.RoundImpl setSequence(java.lang.Integer argSequence) {
		getRoundOpal().setSequence(argSequence);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.RoundImpl setSequence(int argSequence) {
		getRoundOpal().setSequence(argSequence);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 16L)
	@Override
	public java.lang.String getStartTime() {
		return getRoundOpal().getStartTime();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 16L)
	@Override
	public com.scobolsolo.persistence.RoundImpl setStartTime(java.lang.String argStartTime) {
		getRoundOpal().setStartTime(argStartTime);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@Override
	public java.lang.Boolean isLunchAfterAsObject() {
		return getRoundOpal().isLunchAfterAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@Override
	public com.scobolsolo.persistence.RoundImpl setLunchAfter(java.lang.Boolean argLunchAfter) {
		getRoundOpal().setLunchAfter(argLunchAfter);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.RoundImpl setLunchAfter(boolean argLunchAfter) {
		getRoundOpal().setLunchAfter(argLunchAfter);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.time.LocalDateTime getEarliestEntryAllowed() {
		return getRoundOpal().getEarliestEntryAllowed();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.persistence.RoundImpl setEarliestEntryAllowed(java.time.LocalDateTime argEarliestEntryAllowed) {
		getRoundOpal().setEarliestEntryAllowed(argEarliestEntryAllowed);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getPhaseIdAsObject() {
		return getRoundOpal().getPhaseIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.RoundImpl setPhaseId(java.lang.Integer argPhaseId) {
		getRoundOpal().setPhaseId(argPhaseId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.RoundImpl setPhaseId(int argPhaseId) {
		getRoundOpal().setPhaseId(argPhaseId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public java.lang.String getGameStartMessageHtml() {
		return getRoundOpal().getGameStartMessageHtml();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public com.scobolsolo.persistence.RoundImpl setGameStartMessageHtml(java.lang.String argGameStartMessageHtml) {
		getRoundOpal().setGameStartMessageHtml(argGameStartMessageHtml);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public java.lang.String getGameEndMessageHtml() {
		return getRoundOpal().getGameEndMessageHtml();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public com.scobolsolo.persistence.RoundImpl setGameEndMessageHtml(java.lang.String argGameEndMessageHtml) {
		getRoundOpal().setGameEndMessageHtml(argGameEndMessageHtml);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the Phase object created from round through reference round_phase_id_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.Phase getPhase() {
		PhaseOpal lclPhaseOpal = getRoundOpal().getPhaseOpal();
		return lclPhaseOpal == null ? null : lclPhaseOpal.getUserFacing();
	}

	@Override
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.Round setPhase(com.scobolsolo.application.Phase argPhase) {
		getRoundOpal().setPhaseOpal(argPhase == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.Phase, com.scobolsolo.persistence.PhaseOpal>) argPhase).getOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Packet getPacket() {
		PacketOpal lclO = getRoundOpal().getPacketOpal();
		return lclO == null ? null : lclO.getUserFacing();
	}

	@Override
	public com.scobolsolo.application.Round setPacket(com.scobolsolo.application.Packet argPacket) {
		getRoundOpal().setPacketOpal(argPacket == null ? null : ((PacketImpl) argPacket).getPacketOpal());
		return this;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public java.util.Set<com.scobolsolo.application.Match> getMatchSet() {
		return new com.opal.UserFacingBackCollectionSet<>(getRoundOpal().getMatchOpalSet());
	}

	@Override
	public void unlink() {
		getRoundOpal().unlink();
	}

	@Override
	public void reload() {
		getRoundOpal().reload();
	}

	@Override
	public com.scobolsolo.application.Round copy() {
		return getRoundOpal().copy().getUserFacing();
	}

}
