package com.scobolsolo.persistence;
import com.scobolsolo.application.Packet;
import com.opal.PersistenceException;

public interface PacketOpalFactory extends com.opal.IdentityOpalFactory<Packet, PacketOpal>, com.opal.OpalFactoryCreator<Packet, PacketOpal> {

	public java.util.HashSet<PacketOpal> forReplacementPacketIdCollection(java.lang.Integer argReplacementPacketId) throws com.opal.PersistenceException;
	public java.util.HashSet<PacketOpal> forTournamentCodeCollection(java.lang.String argTournamentCode) throws com.opal.PersistenceException;
	public PacketOpal forId(java.lang.Integer argId) throws PersistenceException;
	public PacketOpal forTournamentCodeName(java.lang.String argTournamentCode, java.lang.String argName) throws PersistenceException;
	public PacketOpal forRoundId(java.lang.Integer argRoundId) throws PersistenceException;
	public PacketOpal forTournamentCodeShortName(java.lang.String argTournamentCode, java.lang.String argShortName) throws PersistenceException;
}
