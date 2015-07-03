package com.scobolsolo.application;

import com.scobolsolo.persistence.RoundOpal;
import com.scobolsolo.persistence.RoundGroupOpal;

public class RoundImpl extends com.opal.AbstractIdentityImpl<Round, RoundOpal> implements Round {
	private final RoundOpal myRoundOpal;

	public RoundImpl(RoundOpal argRoundOpal) {
		super();
		myRoundOpal = org.apache.commons.lang3.Validate.notNull(argRoundOpal);
	}

	protected RoundOpal getRoundOpal() {
		return myRoundOpal;
	}

	@Override
	protected com.opal.IdentityOpal<? extends Round> getOpal() {
		return getRoundOpal();
	}

	@Override
	protected com.opal.IdentityOpal<? extends Round> getBottomOpal() {
		return getRoundOpal();
	}

	@Override
	public int compareTo(Round argSecond) {
		return this.getSequenceAsObject().compareTo(argSecond.getSequenceAsObject());
	}

	@Override
	public java.lang.Integer getIdAsObject() {
		return getRoundOpal().getIdAsObject();
	}

	@Override
	public RoundImpl setId(java.lang.Integer argId) {
		getRoundOpal().setId(argId);
		return this;
	}

	@Override
	public RoundImpl setId(int argId) {
		getRoundOpal().setId(argId);
		return this;
	}

	@Override
	public java.lang.Integer getRoundGroupIdAsObject() {
		return getRoundOpal().getRoundGroupIdAsObject();
	}

	@Override
	public RoundImpl setRoundGroupId(java.lang.Integer argRoundGroupId) {
		getRoundOpal().setRoundGroupId(argRoundGroupId);
		return this;
	}

	@Override
	public RoundImpl setRoundGroupId(int argRoundGroupId) {
		getRoundOpal().setRoundGroupId(argRoundGroupId);
		return this;
	}

	@Override
	public java.lang.String getName() {
		return getRoundOpal().getName();
	}

	@Override
	public RoundImpl setName(java.lang.String argName) {
		getRoundOpal().setName(argName);
		return this;
	}

	@Override
	public java.lang.String getShortName() {
		return getRoundOpal().getShortName();
	}

	@Override
	public RoundImpl setShortName(java.lang.String argShortName) {
		getRoundOpal().setShortName(argShortName);
		return this;
	}

	@Override
	public java.lang.Integer getSequenceAsObject() {
		return getRoundOpal().getSequenceAsObject();
	}

	@Override
	public RoundImpl setSequence(java.lang.Integer argSequence) {
		getRoundOpal().setSequence(argSequence);
		return this;
	}

	@Override
	public RoundImpl setSequence(int argSequence) {
		getRoundOpal().setSequence(argSequence);
		return this;
	}

	@Override
	public java.lang.String getStartTime() {
		return getRoundOpal().getStartTime();
	}

	@Override
	public RoundImpl setStartTime(java.lang.String argStartTime) {
		getRoundOpal().setStartTime(argStartTime);
		return this;
	}

	@Override
	public java.lang.Boolean isLunchAfterAsObject() {
		return getRoundOpal().isLunchAfterAsObject();
	}

	@Override
	public RoundImpl setLunchAfter(java.lang.Boolean argLunchAfter) {
		getRoundOpal().setLunchAfter(argLunchAfter);
		return this;
	}

	@Override
	public RoundImpl setLunchAfter(boolean argLunchAfter) {
		getRoundOpal().setLunchAfter(argLunchAfter);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the RoundGroup object created from round through reference round_round_group_id_fkey */

	@Override
	public RoundGroup getRoundGroup() {
		RoundGroupOpal lclRoundGroupOpal = getRoundOpal().getRoundGroupOpal();
		return lclRoundGroupOpal == null ? null : lclRoundGroupOpal.getUserFacing();
	}

	@Override
	public Round setRoundGroup(RoundGroup argRoundGroup) {
		getRoundOpal().setRoundGroupOpal(argRoundGroup == null ? null : ((RoundGroupImpl) argRoundGroup).getRoundGroupOpal());
		return this;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public void addMatch(Match argMatch) {
		getRoundOpal().addMatchOpal(((MatchImpl) argMatch).getMatchOpal());
	}

	@Override
	public void removeMatch(Match argMatch) {
		getRoundOpal().removeMatchOpal(((MatchImpl) argMatch).getMatchOpal());
	}

	@Override
	public int getMatchCount() {
		return getRoundOpal().getMatchOpalCount();
	}

	@Override
	public java.util.stream.Stream<Match> streamMatch() {
		return getRoundOpal().streamMatchOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<Match> createMatchIterator() {
		return new com.opal.OpalIterator<> (getRoundOpal().createMatchOpalIterator());
	}

	@Override
	public void clearMatch() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addPacket(Packet argPacket) {
		getRoundOpal().addPacketOpal(((PacketImpl) argPacket).getPacketOpal());
	}

	@Override
	public void removePacket(Packet argPacket) {
		getRoundOpal().removePacketOpal(((PacketImpl) argPacket).getPacketOpal());
	}

	@Override
	public int getPacketCount() {
		return getRoundOpal().getPacketOpalCount();
	}

	@Override
	public java.util.stream.Stream<Packet> streamPacket() {
		return getRoundOpal().streamPacketOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<Packet> createPacketIterator() {
		return new com.opal.OpalIterator<> (getRoundOpal().createPacketOpalIterator());
	}

	@Override
	public void clearPacket() {
		throw new UnsupportedOperationException();
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
	public Round copy() {
		return getRoundOpal().copy().getUserFacing();
	}

}
