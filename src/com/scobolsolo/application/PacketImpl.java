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

	@Override
	public java.lang.Integer getIdAsObject() {
		return getPacketOpal().getIdAsObject();
	}

	@Override
	public void setId(java.lang.Integer argId) {
		getPacketOpal().setId(argId);
		return;
	}

	@Override
	public void setId(int argId) {
		getPacketOpal().setId(argId);
		return;
	}

	@Override
	public java.lang.String getName() {
		return getPacketOpal().getName();
	}

	@Override
	public void setName(java.lang.String argName) {
		getPacketOpal().setName(argName);
		return;
	}

	@Override
	public java.lang.String getShortName() {
		return getPacketOpal().getShortName();
	}

	@Override
	public void setShortName(java.lang.String argShortName) {
		getPacketOpal().setShortName(argShortName);
		return;
	}

	@Override
	public java.lang.Integer getRoundIdAsObject() {
		return getPacketOpal().getRoundIdAsObject();
	}

	@Override
	public void setRoundId(java.lang.Integer argRoundId) {
		getPacketOpal().setRoundId(argRoundId);
		return;
	}

	@Override
	public void setRoundId(int argRoundId) {
		getPacketOpal().setRoundId(argRoundId);
		return;
	}

	@Override
	public java.lang.String getNote() {
		return getPacketOpal().getNote();
	}

	@Override
	public void setNote(java.lang.String argNote) {
		getPacketOpal().setNote(argNote);
		return;
	}

	@Override
	public java.lang.String getTournamentCode() {
		return getPacketOpal().getTournamentCode();
	}

	@Override
	public void setTournamentCode(java.lang.String argTournamentCode) {
		getPacketOpal().setTournamentCode(argTournamentCode);
		return;
	}

	@Override
	public java.lang.Integer getSequenceAsObject() {
		return getPacketOpal().getSequenceAsObject();
	}

	@Override
	public void setSequence(java.lang.Integer argSequence) {
		getPacketOpal().setSequence(argSequence);
		return;
	}

	@Override
	public void setSequence(int argSequence) {
		getPacketOpal().setSequence(argSequence);
		return;
	}

	@Override
	public java.lang.Integer getReplacementPacketIdAsObject() {
		return getPacketOpal().getReplacementPacketIdAsObject();
	}

	@Override
	public void setReplacementPacketId(java.lang.Integer argReplacementPacketId) {
		getPacketOpal().setReplacementPacketId(argReplacementPacketId);
		return;
	}

	@Override
	public void setReplacementPacketId(int argReplacementPacketId) {
		getPacketOpal().setReplacementPacketId(argReplacementPacketId);
		return;
	}

	@Override
	public java.lang.Boolean isQuestionsPublicAsObject() {
		return getPacketOpal().isQuestionsPublicAsObject();
	}

	@Override
	public void setQuestionsPublic(java.lang.Boolean argQuestionsPublic) {
		getPacketOpal().setQuestionsPublic(argQuestionsPublic);
		return;
	}

	@Override
	public void setQuestionsPublic(boolean argQuestionsPublic) {
		getPacketOpal().setQuestionsPublic(argQuestionsPublic);
		return;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** Access to the Packet object created from packet through reference packet_replacement_packet_id_fkey */

	@Override
	public Packet getReplacementPacket() {
		PacketOpal lclPacketOpal = getPacketOpal().getReplacementPacketOpal();
		return lclPacketOpal == null ? null : lclPacketOpal.getUserFacing();
	}

	@Override
	public void setReplacementPacket(Packet argPacket) {
		getPacketOpal().setReplacementPacketOpal(argPacket == null ? null : ((PacketImpl) argPacket).getPacketOpal());
		return;
	}

	/** Access to the Round object created from packet through reference packet_round_id_fkey */

	@Override
	public Round getRound() {
		RoundOpal lclRoundOpal = getPacketOpal().getRoundOpal();
		return lclRoundOpal == null ? null : lclRoundOpal.getUserFacing();
	}

	@Override
	public void setRound(Round argRound) {
		getPacketOpal().setRoundOpal(argRound == null ? null : ((RoundImpl) argRound).getRoundOpal());
		return;
	}

	/** Access to the Tournament object created from packet through reference packet_tournament_code_fkey */

	@Override
	public Tournament getTournament() {
		TournamentOpal lclTournamentOpal = getPacketOpal().getTournamentOpal();
		return lclTournamentOpal == null ? null : lclTournamentOpal.getUserFacing();
	}

	@Override
	public void setTournament(Tournament argTournament) {
		getPacketOpal().setTournamentOpal(argTournament == null ? null : ((TournamentImpl) argTournament).getTournamentOpal());
		return;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public void addReplacementPacket(Packet argPacket) {
		getPacketOpal().addReplacementPacketOpal(((PacketImpl) argPacket).getPacketOpal());
	}

	@Override
	public void removeReplacementPacket(Packet argPacket) {
		getPacketOpal().removeReplacementPacketOpal(((PacketImpl) argPacket).getPacketOpal());
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
	public void clearReplacementPacket() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addPlacement(Placement argPlacement) {
		getPacketOpal().addPlacementOpal(((PlacementImpl) argPlacement).getPlacementOpal());
	}

	@Override
	public void removePlacement(Placement argPlacement) {
		getPacketOpal().removePlacementOpal(((PlacementImpl) argPlacement).getPlacementOpal());
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
	public void clearPlacement() {
		throw new UnsupportedOperationException();
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
