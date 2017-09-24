package com.scobolsolo.persistence;

public class PacketImpl extends com.opal.AbstractIdentityImpl<com.scobolsolo.application.Packet, com.scobolsolo.persistence.PacketOpal> implements com.scobolsolo.application.Packet {

	private final com.scobolsolo.persistence.PacketOpal myPacketOpal;

	public PacketImpl(PacketOpal argPacketOpal) {
		super();
		myPacketOpal = org.apache.commons.lang3.Validate.notNull(argPacketOpal);
	}

	protected com.scobolsolo.persistence.PacketOpal getPacketOpal() {
		return myPacketOpal;
	}

	@Override
	public com.scobolsolo.persistence.PacketOpal getOpal() {
		return getPacketOpal();
	}

	@Override
	public com.scobolsolo.persistence.PacketOpal getBottomOpal() {
		return getPacketOpal();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getIdAsObject() {
		return getPacketOpal().getIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.PacketImpl setId(java.lang.Integer argId) {
		getPacketOpal().setId(argId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.PacketImpl setId(int argId) {
		getPacketOpal().setId(argId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public java.lang.String getName() {
		return getPacketOpal().getName();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public com.scobolsolo.persistence.PacketImpl setName(java.lang.String argName) {
		getPacketOpal().setName(argName);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getShortName() {
		return getPacketOpal().getShortName();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public com.scobolsolo.persistence.PacketImpl setShortName(java.lang.String argShortName) {
		getPacketOpal().setShortName(argShortName);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getRoundIdAsObject() {
		return getPacketOpal().getRoundIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.persistence.PacketImpl setRoundId(java.lang.Integer argRoundId) {
		getPacketOpal().setRoundId(argRoundId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.PacketImpl setRoundId(int argRoundId) {
		getPacketOpal().setRoundId(argRoundId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public java.lang.String getNote() {
		return getPacketOpal().getNote();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public com.scobolsolo.persistence.PacketImpl setNote(java.lang.String argNote) {
		getPacketOpal().setNote(argNote);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getTournamentCode() {
		return getPacketOpal().getTournamentCode();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public com.scobolsolo.persistence.PacketImpl setTournamentCode(java.lang.String argTournamentCode) {
		getPacketOpal().setTournamentCode(argTournamentCode);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "0")
	@Override
	public java.lang.Integer getSequenceAsObject() {
		return getPacketOpal().getSequenceAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "0")
	@Override
	public com.scobolsolo.persistence.PacketImpl setSequence(java.lang.Integer argSequence) {
		getPacketOpal().setSequence(argSequence);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.PacketImpl setSequence(int argSequence) {
		getPacketOpal().setSequence(argSequence);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getReplacementPacketIdAsObject() {
		return getPacketOpal().getReplacementPacketIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.persistence.PacketImpl setReplacementPacketId(java.lang.Integer argReplacementPacketId) {
		getPacketOpal().setReplacementPacketId(argReplacementPacketId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.PacketImpl setReplacementPacketId(int argReplacementPacketId) {
		getPacketOpal().setReplacementPacketId(argReplacementPacketId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@Override
	public java.lang.Boolean isQuestionsPublicAsObject() {
		return getPacketOpal().isQuestionsPublicAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@Override
	public com.scobolsolo.persistence.PacketImpl setQuestionsPublic(java.lang.Boolean argQuestionsPublic) {
		getPacketOpal().setQuestionsPublic(argQuestionsPublic);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.PacketImpl setQuestionsPublic(boolean argQuestionsPublic) {
		getPacketOpal().setQuestionsPublic(argQuestionsPublic);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the Packet object created from packet through reference packet_replacement_packet_id_fkey */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.application.Packet getReplacementPacket() {
		PacketOpal lclPacketOpal = getPacketOpal().getReplacementPacketOpal();
		return lclPacketOpal == null ? null : lclPacketOpal.getUserFacing();
	}

	@Override
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.Packet setReplacementPacket(com.scobolsolo.application.Packet argPacket) {
		getPacketOpal().setReplacementPacketOpal(argPacket == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.Packet, com.scobolsolo.persistence.PacketOpal>) argPacket).getOpal());
		return this;
	}

	/** @return the Round object created from packet through reference packet_round_id_fkey */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.application.Round getRound() {
		RoundOpal lclRoundOpal = getPacketOpal().getRoundOpal();
		return lclRoundOpal == null ? null : lclRoundOpal.getUserFacing();
	}

	@Override
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.Packet setRound(com.scobolsolo.application.Round argRound) {
		getPacketOpal().setRoundOpal(argRound == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.Round, com.scobolsolo.persistence.RoundOpal>) argRound).getOpal());
		return this;
	}

	/** @return the Tournament object created from packet through reference packet_tournament_code_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.Tournament getTournament() {
		TournamentOpal lclTournamentOpal = getPacketOpal().getTournamentOpal();
		return lclTournamentOpal == null ? null : lclTournamentOpal.getUserFacing();
	}

	@Override
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.Packet setTournament(com.scobolsolo.application.Tournament argTournament) {
		getPacketOpal().setTournamentOpal(argTournament == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.Tournament, com.scobolsolo.persistence.TournamentOpal>) argTournament).getOpal());
		return this;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public java.util.Set<com.scobolsolo.application.Packet> getReplacementPacketSet() {
		return new com.opal.UserFacingBackCollectionSet<>(getPacketOpal().getReplacementPacketOpalSet());
	}

	@Override
	public java.util.Set<com.scobolsolo.application.Placement> getPlacementSet() {
		return new com.opal.UserFacingBackCollectionSet<>(getPacketOpal().getPlacementOpalSet());
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
	public com.scobolsolo.application.Packet copy() {
		return getPacketOpal().copy().getUserFacing();
	}

}
