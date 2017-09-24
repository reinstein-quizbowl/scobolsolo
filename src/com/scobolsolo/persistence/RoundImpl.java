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
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getRoundGroupIdAsObject() {
		return getRoundOpal().getRoundGroupIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.persistence.RoundImpl setRoundGroupId(java.lang.Integer argRoundGroupId) {
		getRoundOpal().setRoundGroupId(argRoundGroupId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.RoundImpl setRoundGroupId(int argRoundGroupId) {
		getRoundOpal().setRoundGroupId(argRoundGroupId);
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

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the RoundGroup object created from round through reference round_round_group_id_fkey */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.application.RoundGroup getRoundGroup() {
		RoundGroupOpal lclRoundGroupOpal = getRoundOpal().getRoundGroupOpal();
		return lclRoundGroupOpal == null ? null : lclRoundGroupOpal.getUserFacing();
	}

	@Override
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.Round setRoundGroup(com.scobolsolo.application.RoundGroup argRoundGroup) {
		getRoundOpal().setRoundGroupOpal(argRoundGroup == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.RoundGroup, com.scobolsolo.persistence.RoundGroupOpal>) argRoundGroup).getOpal());
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
