package com.scobolsolo.application;

import com.scobolsolo.persistence.PacketOpal;
import com.scobolsolo.persistence.RoundOpal;
import com.scobolsolo.persistence.TournamentOpal;

public class PacketImpl extends com.opal.AbstractIdentityImpl<Packet, PacketOpal> implements Packet {

	private final PacketOpal myPacketOpal;

	public PacketImpl(PacketOpal argPacketOpal) {
		super();
		myPacketOpal = org.apache.commons.lang3.Validate.notNull(argPacketOpal);
	}

	protected PacketOpal getPacketOpal() {
		return myPacketOpal;
	}

	@Override
	protected com.opal.IdentityOpal<? extends Packet> getOpal() {
		return getPacketOpal();
	}

	@Override
	protected com.opal.IdentityOpal<? extends Packet> getBottomOpal() {
		return getPacketOpal();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getIdAsObject() {
		return getPacketOpal().getIdAsObject();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public PacketImpl setId(java.lang.Integer argId) {
		getPacketOpal().setId(argId);
		return this;
	}

	@Override
	public PacketImpl setId(int argId) {
		getPacketOpal().setId(argId);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public java.lang.String getName() {
		return getPacketOpal().getName();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public PacketImpl setName(java.lang.String argName) {
		getPacketOpal().setName(argName);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getShortName() {
		return getPacketOpal().getShortName();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public PacketImpl setShortName(java.lang.String argShortName) {
		getPacketOpal().setShortName(argShortName);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getRoundIdAsObject() {
		return getPacketOpal().getRoundIdAsObject();
	}

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public PacketImpl setRoundId(java.lang.Integer argRoundId) {
		getPacketOpal().setRoundId(argRoundId);
		return this;
	}

	@Override
	public PacketImpl setRoundId(int argRoundId) {
		getPacketOpal().setRoundId(argRoundId);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public java.lang.String getNote() {
		return getPacketOpal().getNote();
	}

	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public PacketImpl setNote(java.lang.String argNote) {
		getPacketOpal().setNote(argNote);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getTournamentCode() {
		return getPacketOpal().getTournamentCode();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public PacketImpl setTournamentCode(java.lang.String argTournamentCode) {
		getPacketOpal().setTournamentCode(argTournamentCode);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "0")
	@Override
	public java.lang.Integer getSequenceAsObject() {
		return getPacketOpal().getSequenceAsObject();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "0")
	@Override
	public PacketImpl setSequence(java.lang.Integer argSequence) {
		getPacketOpal().setSequence(argSequence);
		return this;
	}

	@Override
	public PacketImpl setSequence(int argSequence) {
		getPacketOpal().setSequence(argSequence);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getReplacementPacketIdAsObject() {
		return getPacketOpal().getReplacementPacketIdAsObject();
	}

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public PacketImpl setReplacementPacketId(java.lang.Integer argReplacementPacketId) {
		getPacketOpal().setReplacementPacketId(argReplacementPacketId);
		return this;
	}

	@Override
	public PacketImpl setReplacementPacketId(int argReplacementPacketId) {
		getPacketOpal().setReplacementPacketId(argReplacementPacketId);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@Override
	public java.lang.Boolean isQuestionsPublicAsObject() {
		return getPacketOpal().isQuestionsPublicAsObject();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@Override
	public PacketImpl setQuestionsPublic(java.lang.Boolean argQuestionsPublic) {
		getPacketOpal().setQuestionsPublic(argQuestionsPublic);
		return this;
	}

	@Override
	public PacketImpl setQuestionsPublic(boolean argQuestionsPublic) {
		getPacketOpal().setQuestionsPublic(argQuestionsPublic);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the Packet object created from packet through reference packet_replacement_packet_id_fkey */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public Packet getReplacementPacket() {
		PacketOpal lclPacketOpal = getPacketOpal().getReplacementPacketOpal();
		return lclPacketOpal == null ? null : lclPacketOpal.getUserFacing();
	}

	@Override
	public Packet setReplacementPacket(Packet argPacket) {
		getPacketOpal().setReplacementPacketOpal(argPacket == null ? null : ((PacketImpl) argPacket).getPacketOpal());
		return this;
	}

	/** @return the Round object created from packet through reference packet_round_id_fkey */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public Round getRound() {
		RoundOpal lclRoundOpal = getPacketOpal().getRoundOpal();
		return lclRoundOpal == null ? null : lclRoundOpal.getUserFacing();
	}

	@Override
	public Packet setRound(Round argRound) {
		getPacketOpal().setRoundOpal(argRound == null ? null : ((RoundImpl) argRound).getRoundOpal());
		return this;
	}

	/** @return the Tournament object created from packet through reference packet_tournament_code_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public Tournament getTournament() {
		TournamentOpal lclTournamentOpal = getPacketOpal().getTournamentOpal();
		return lclTournamentOpal == null ? null : lclTournamentOpal.getUserFacing();
	}

	@Override
	public Packet setTournament(Tournament argTournament) {
		getPacketOpal().setTournamentOpal(argTournament == null ? null : ((TournamentImpl) argTournament).getTournamentOpal());
		return this;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public com.scobolsolo.application.Packet addReplacementPacket(Packet argPacket) {
		getPacketOpal().addReplacementPacketOpal(((PacketImpl) argPacket).getPacketOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Packet removeReplacementPacket(Packet argPacket) {
		getPacketOpal().removeReplacementPacketOpal(((PacketImpl) argPacket).getPacketOpal());
		return this;
	}

	@Override
	public int getReplacementPacketCount() {
		return getPacketOpal().getReplacementPacketOpalCount();
	}

	@Override
	public java.util.stream.Stream<Packet> streamReplacementPacket() {
		return getPacketOpal().streamReplacementPacketOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<Packet> createReplacementPacketIterator() {
		return new com.opal.OpalIterator<> (getPacketOpal().createReplacementPacketOpalIterator());
	}

	@Override
	public com.scobolsolo.application.Packet addPlacement(Placement argPlacement) {
		getPacketOpal().addPlacementOpal(((PlacementImpl) argPlacement).getPlacementOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Packet removePlacement(Placement argPlacement) {
		getPacketOpal().removePlacementOpal(((PlacementImpl) argPlacement).getPlacementOpal());
		return this;
	}

	@Override
	public int getPlacementCount() {
		return getPacketOpal().getPlacementOpalCount();
	}

	@Override
	public java.util.stream.Stream<Placement> streamPlacement() {
		return getPacketOpal().streamPlacementOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<Placement> createPlacementIterator() {
		return new com.opal.OpalIterator<> (getPacketOpal().createPlacementOpalIterator());
	}

	@Override
	public void unlink() {
		getPacketOpal().unlink();
	}

	@Override
	public void reload() {
		getPacketOpal().reload();
	}

	@Override
	public Packet copy() {
		return getPacketOpal().copy().getUserFacing();
	}

}
