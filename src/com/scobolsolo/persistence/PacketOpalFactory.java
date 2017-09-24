package com.scobolsolo.persistence;
import com.scobolsolo.application.Packet;
import com.opal.PersistenceException;

public interface PacketOpalFactory extends com.opal.IdentityOpalFactory<Packet, PacketOpal>, com.opal.OpalFactoryCreator<Packet, PacketOpal> {

	public java.util.HashSet<PacketOpal> forReplacementPacketIdCollection(java.lang.Integer argReplacementPacketId) throws com.opal.PersistenceException;

	default public java.util.HashSet<PacketOpal> forReplacementPacketOpalCollection(PacketOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		java.lang.Integer lclId = argParent.getIdAsObject();
		if (lclId == null) { throw new IllegalStateException("Key value is null."); }
		return forReplacementPacketIdCollection(lclId);
	}

	default public int forReplacementPacketOpalCount(PacketOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		throw new com.siliconage.util.UnimplementedOperationException();
	}

	public java.util.HashSet<PacketOpal> forTournamentCodeCollection(java.lang.String argTournamentCode) throws com.opal.PersistenceException;

	default public java.util.HashSet<PacketOpal> forTournamentOpalCollection(TournamentOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		java.lang.String lclCode = argParent.getCode();
		if (lclCode == null) { throw new IllegalStateException("Key value is null."); }
		return forTournamentCodeCollection(lclCode);
	}

	default public int forTournamentOpalCount(TournamentOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		throw new com.siliconage.util.UnimplementedOperationException();
	}

	public PacketOpal forId(java.lang.Integer argId) throws PersistenceException;
	public PacketOpal forTournamentCodeName(java.lang.String argTournamentCode, java.lang.String argName) throws PersistenceException;
	public PacketOpal forRoundId(java.lang.Integer argRoundId) throws PersistenceException;
	public PacketOpal forTournamentCodeShortName(java.lang.String argTournamentCode, java.lang.String argShortName) throws PersistenceException;
}
