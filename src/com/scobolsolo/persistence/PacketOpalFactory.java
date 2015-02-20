package com.scobolsolo.persistence;
import com.scobolsolo.application.Packet;
import com.opal.PersistenceException;

public interface PacketOpalFactory extends com.opal.OpalFactory<Packet, PacketOpal>, com.opal.OpalFactoryCreator<Packet, PacketOpal> {
	public java.util.HashSet<PacketOpal> forReplacementPacketIdCollection(java.lang.Integer argReplacementPacketId) throws com.opal.PersistenceException;
	public com.siliconage.util.Fast3Set<PacketOpal> forRoundIdCollection(java.lang.Integer argRoundId) throws com.opal.PersistenceException;
	public java.util.HashSet<PacketOpal> forTournamentCodeCollection(java.lang.String argTournamentCode) throws com.opal.PersistenceException;
	public PacketOpal forId(java.lang.Integer argId) throws PersistenceException;
	public PacketOpal forTournamentCodeName(java.lang.String argTournamentCode, java.lang.String argName) throws PersistenceException;
	public PacketOpal forTournamentCodeShortName(java.lang.String argTournamentCode, java.lang.String argShortName) throws PersistenceException;
}
