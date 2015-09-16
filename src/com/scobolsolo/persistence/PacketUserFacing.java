package com.scobolsolo.persistence;

import com.opal.*;

/**
 * represents a {@code Packet} from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from {@code packet}.  Do not modify this class directly; instead, alter the permanent storage on which it is based, the Opal configuration file for the project, and/or the {@link com.scobolsolo.application.Packet}, and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various {@code forXXX} methods on the {@link com.scobolsolo.application.PacketFactory} factory class.  To create new instances, use the {@code create()} method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link com.opal.TransactionContext}.</p>
 *
 * <p>This interface is not meant to be referenced in user code.  Only the {@link com.scobolsolo.application.Packet} and the {@link com.scobolsolo.application.PacketFactory} class should be referenced directly.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
public interface PacketUserFacing extends IdentityUserFacing {
	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the {@code Id}
	 *
	 * <p>The {@code Id} field is a direct mapping of the {@code id} field in {@code packet}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getId() method.</p>
	 *
	 * @return an object value of {@code Id} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.Integer getIdAsObject();

	/**
	 * primitive accessor for the {@code Id}
	 *
	 * <p>The {@code Id} field is a direct mapping of the {@code id} database column in the table {@code packet}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getIdAsObject() method.</p>
	 *
	 * @return the primitive value of {@code Id} (of the current {@link com.opal.TransactionContext})
	 */
	default public int getId() {
		java.lang.Integer lclO = getIdAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the {@code Id} to the value of {@code argId}
	 *
	 * @param argId the new value of {@code Id}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code id} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argId is null
	 */
	@com.opal.annotation.NotNull
	public com.scobolsolo.application.Packet setId(java.lang.Integer argId);

	/**
	 * sets the {@code Id} to the value of {@code argId}
	 *
	 * @param argId the new value of {@code Id}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.Packet setId(int argId);

	/**
	 * object accessor for the {@code Name}
	 *
	 * <p>The {@code Name} field is a direct mapping of the {@code name} field in {@code packet}.</p>
	 *
	 * @return an object value of {@code Name} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.String getName();

	/**
	 * sets the {@code Name} to the value of {@code argName}
	 *
	 * @param argName the new value of {@code Name}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code name} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argName is null
	 * @throws ArgumentTooLongException if {@code argName} is longer than 256 characters
	 * <p>The database column {@code name} is limited to 256 characters.</p>
	 *
	 */
	@com.opal.annotation.NotNull
	@com.opal.annotation.Length(maximum = 256L)
	public com.scobolsolo.application.Packet setName(java.lang.String argName);

	/**
	 * object accessor for the {@code ShortName}
	 *
	 * <p>The {@code ShortName} field is a direct mapping of the {@code short_name} field in {@code packet}.</p>
	 *
	 * @return an object value of {@code ShortName} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.String getShortName();

	/**
	 * sets the {@code ShortName} to the value of {@code argShortName}
	 *
	 * @param argShortName the new value of {@code ShortName}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code short_name} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argShortName is null
	 * @throws ArgumentTooLongException if {@code argShortName} is longer than 32 characters
	 * <p>The database column {@code short_name} is limited to 32 characters.</p>
	 *
	 */
	@com.opal.annotation.NotNull
	@com.opal.annotation.Length(maximum = 32L)
	public com.scobolsolo.application.Packet setShortName(java.lang.String argShortName);

	/**
	 * object accessor for the {@code RoundId}
	 *
	 * <p>The {@code RoundId} field is a direct mapping of the {@code round_id} field in {@code packet}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getRoundId() method.</p>
	 *
	 * @return an object value of {@code RoundId} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	public java.lang.Integer getRoundIdAsObject();

	/**
	 * object accessor for the {@code RoundId} with substitution for a null value
	 *
	 * <p>The {@code RoundId} field is a direct mapping of the {@code round_id} database column in the table {@code packet}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code RoundId} is {@code null}.
	 * @return an object value of {@code RoundId} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getRoundIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getRoundIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code RoundId}
	 *
	 * <p>The {@code RoundId} field is a direct mapping of the {@code round_id} database column in the table {@code packet}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getRoundIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code RoundId} (of the current {@link com.opal.TransactionContext})
	 * @throws NullValueException when the internal value is null
	 */
	default public int getRoundId() throws com.opal.NullValueException {
		java.lang.Integer lclO = getRoundIdAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getRoundId(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getRoundIdAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getRoundId(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getRoundIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * sets the {@code RoundId} to the value of {@code argRoundId}
	 *
	 * @param argRoundId the new value of {@code RoundId}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 */
	public com.scobolsolo.application.Packet setRoundId(java.lang.Integer argRoundId);

	/**
	 * sets the {@code RoundId} to the value of {@code argRoundId}
	 *
	 * @param argRoundId the new value of {@code RoundId}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.Packet setRoundId(int argRoundId);

	/**
	 * object accessor for the {@code Note}
	 *
	 * <p>The {@code Note} field is a direct mapping of the {@code note} field in {@code packet}.</p>
	 *
	 * @return an object value of {@code Note} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	public java.lang.String getNote();

	/**
	 * object accessor for the {@code Note} with substitution for a null value
	 *
	 * <p>The {@code Note} field is a direct mapping of the {@code note} database column in the table {@code packet}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code Note} is {@code null}.
	 * @return an object value of {@code Note} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getNote(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getNote();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the {@code Note} to the value of {@code argNote}
	 *
	 * @param argNote the new value of {@code Note}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * @throws ArgumentTooLongException if {@code argNote} is longer than 2147483647 characters
	 * <p>The database column {@code note} is limited to 2147483647 characters.</p>
	 *
	 */
	@com.opal.annotation.Length(maximum = 2147483647L)
	public com.scobolsolo.application.Packet setNote(java.lang.String argNote);

	/**
	 * object accessor for the {@code TournamentCode}
	 *
	 * <p>The {@code TournamentCode} field is a direct mapping of the {@code tournament_code} field in {@code packet}.</p>
	 *
	 * @return an object value of {@code TournamentCode} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.String getTournamentCode();

	/**
	 * sets the {@code TournamentCode} to the value of {@code argTournamentCode}
	 *
	 * @param argTournamentCode the new value of {@code TournamentCode}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code tournament_code} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argTournamentCode is null
	 * @throws ArgumentTooLongException if {@code argTournamentCode} is longer than 32 characters
	 * <p>The database column {@code tournament_code} is limited to 32 characters.</p>
	 *
	 */
	@com.opal.annotation.NotNull
	@com.opal.annotation.Length(maximum = 32L)
	public com.scobolsolo.application.Packet setTournamentCode(java.lang.String argTournamentCode);

	/**
	 * object accessor for the {@code Sequence}
	 *
	 * <p>The {@code Sequence} field is a direct mapping of the {@code sequence} field in {@code packet}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getSequence() method.</p>
	 *
	 * @return an object value of {@code Sequence} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.Integer getSequenceAsObject();

	/**
	 * primitive accessor for the {@code Sequence}
	 *
	 * <p>The {@code Sequence} field is a direct mapping of the {@code sequence} database column in the table {@code packet}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getSequenceAsObject() method.</p>
	 *
	 * @return the primitive value of {@code Sequence} (of the current {@link com.opal.TransactionContext})
	 */
	default public int getSequence() {
		java.lang.Integer lclO = getSequenceAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the {@code Sequence} to the value of {@code argSequence}
	 *
	 * @param argSequence the new value of {@code Sequence}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code sequence} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argSequence is null
	 */
	@com.opal.annotation.NotNull
	public com.scobolsolo.application.Packet setSequence(java.lang.Integer argSequence);

	/**
	 * sets the {@code Sequence} to the value of {@code argSequence}
	 *
	 * @param argSequence the new value of {@code Sequence}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.Packet setSequence(int argSequence);

	/**
	 * object accessor for the {@code ReplacementPacketId}
	 *
	 * <p>The {@code ReplacementPacketId} field is a direct mapping of the {@code replacement_packet_id} field in {@code packet}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getReplacementPacketId() method.</p>
	 *
	 * @return an object value of {@code ReplacementPacketId} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	public java.lang.Integer getReplacementPacketIdAsObject();

	/**
	 * object accessor for the {@code ReplacementPacketId} with substitution for a null value
	 *
	 * <p>The {@code ReplacementPacketId} field is a direct mapping of the {@code replacement_packet_id} database column in the table {@code packet}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code ReplacementPacketId} is {@code null}.
	 * @return an object value of {@code ReplacementPacketId} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getReplacementPacketIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getReplacementPacketIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code ReplacementPacketId}
	 *
	 * <p>The {@code ReplacementPacketId} field is a direct mapping of the {@code replacement_packet_id} database column in the table {@code packet}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getReplacementPacketIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code ReplacementPacketId} (of the current {@link com.opal.TransactionContext})
	 * @throws NullValueException when the internal value is null
	 */
	default public int getReplacementPacketId() throws com.opal.NullValueException {
		java.lang.Integer lclO = getReplacementPacketIdAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getReplacementPacketId(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getReplacementPacketIdAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getReplacementPacketId(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getReplacementPacketIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * sets the {@code ReplacementPacketId} to the value of {@code argReplacementPacketId}
	 *
	 * @param argReplacementPacketId the new value of {@code ReplacementPacketId}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 */
	public com.scobolsolo.application.Packet setReplacementPacketId(java.lang.Integer argReplacementPacketId);

	/**
	 * sets the {@code ReplacementPacketId} to the value of {@code argReplacementPacketId}
	 *
	 * @param argReplacementPacketId the new value of {@code ReplacementPacketId}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.Packet setReplacementPacketId(int argReplacementPacketId);

	/**
	 * object accessor for the {@code QuestionsPublic}
	 *
	 * <p>The {@code QuestionsPublic} field is a direct mapping of the {@code questions_public} field in {@code packet}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isQuestionsPublic() method.</p>
	 *
	 * @return an object value of {@code QuestionsPublic} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.Boolean isQuestionsPublicAsObject();

	/**
	 * primitive accessor for the {@code QuestionsPublic}
	 *
	 * <p>The {@code QuestionsPublic} field is a direct mapping of the {@code questions_public} database column in the table {@code packet}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the isQuestionsPublicAsObject() method.</p>
	 *
	 * @return the primitive value of {@code QuestionsPublic} (of the current {@link com.opal.TransactionContext})
	 */
	default public boolean isQuestionsPublic() {
		java.lang.Boolean lclO = isQuestionsPublicAsObject();
		return lclO.booleanValue();
	}

	/**
	 * sets the {@code QuestionsPublic} to the value of {@code argQuestionsPublic}
	 *
	 * @param argQuestionsPublic the new value of {@code QuestionsPublic}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code questions_public} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argQuestionsPublic is null
	 */
	@com.opal.annotation.NotNull
	public com.scobolsolo.application.Packet setQuestionsPublic(java.lang.Boolean argQuestionsPublic);

	/**
	 * sets the {@code QuestionsPublic} to the value of {@code argQuestionsPublic}
	 *
	 * @param argQuestionsPublic the new value of {@code QuestionsPublic}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.Packet setQuestionsPublic(boolean argQuestionsPublic);

	/**
	 * @return the {@code com.scobolsolo.application.Packet}
	 * The returned {@code com.scobolsolo.application.Packet} is the {@link UserFacing} object corresponding to the entry in {@code packet} that is referenced by {@code packet_replacement_packet_id_fkey}.
	 *
	 */
	public com.scobolsolo.application.Packet getReplacementPacket();
	public com.scobolsolo.application.Packet setReplacementPacket(com.scobolsolo.application.Packet argReplacementPacket);

	/**
	 * @return the {@code com.scobolsolo.application.Round}
	 * The returned {@code com.scobolsolo.application.Round} is the {@link UserFacing} object corresponding to the entry in {@code round} that is referenced by {@code packet_round_id_fkey}.
	 *
	 */
	public com.scobolsolo.application.Round getRound();
	public com.scobolsolo.application.Packet setRound(com.scobolsolo.application.Round argRound);

	/**
	 * @return the {@code com.scobolsolo.application.Tournament}
	 * The returned {@code com.scobolsolo.application.Tournament} is the {@link UserFacing} object corresponding to the entry in {@code tournament} that is referenced by {@code packet_tournament_code_fkey}.
	 *
	 */
	public com.scobolsolo.application.Tournament getTournament();
	public com.scobolsolo.application.Packet setTournament(com.scobolsolo.application.Tournament argTournament);

	public int getReplacementPacketCount();
	public java.util.Iterator<com.scobolsolo.application.Packet> createReplacementPacketIterator();

	public java.util.stream.Stream<com.scobolsolo.application.Packet> streamReplacementPacket();

	public void addReplacementPacket(com.scobolsolo.application.Packet argPacket);
	public void removeReplacementPacket(com.scobolsolo.application.Packet argPacket);
	public void clearReplacementPacket();

	default public <T extends java.util.Collection<? super com.scobolsolo.application.Packet>> T acquireReplacementPacket(T argC) {
		if (argC == null) { throw new IllegalArgumentException("Target Collection is null."); }
		java.util.Iterator<com.scobolsolo.application.Packet> lclI = createReplacementPacketIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public com.scobolsolo.application.Packet[] createReplacementPacketArray() {
		int lclLength = getReplacementPacketCount();
		com.scobolsolo.application.Packet[] lclA = new com.scobolsolo.application.Packet[lclLength];
		int lclIndex = 0;
		java.util.Iterator<com.scobolsolo.application.Packet> lclI = createReplacementPacketIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public int getPlacementCount();
	public java.util.Iterator<com.scobolsolo.application.Placement> createPlacementIterator();

	public java.util.stream.Stream<com.scobolsolo.application.Placement> streamPlacement();

	public void addPlacement(com.scobolsolo.application.Placement argPlacement);
	public void removePlacement(com.scobolsolo.application.Placement argPlacement);
	public void clearPlacement();

	default public <T extends java.util.Collection<? super com.scobolsolo.application.Placement>> T acquirePlacement(T argC) {
		if (argC == null) { throw new IllegalArgumentException("Target Collection is null."); }
		java.util.Iterator<com.scobolsolo.application.Placement> lclI = createPlacementIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public com.scobolsolo.application.Placement[] createPlacementArray() {
		int lclLength = getPlacementCount();
		com.scobolsolo.application.Placement[] lclA = new com.scobolsolo.application.Placement[lclLength];
		int lclIndex = 0;
		java.util.Iterator<com.scobolsolo.application.Placement> lclI = createPlacementIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public com.scobolsolo.application.Packet copy();

	/** This is a Comparator that can be used to compare Packet objects based on their {@code Id} values. */

	public static class IdComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Packet> {
		private static final IdComparator ourInstance = new IdComparator();
		public static final IdComparator getInstance() { return ourInstance; }

		private IdComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Packet argFirst, com.scobolsolo.application.Packet argSecond) {
			return argFirst.getIdAsObject().compareTo(argSecond.getIdAsObject());
		}
	}

	/** This is a Comparator that can be used to compare Packet objects based on their {@code Name} values. */

	public static class NameComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Packet> {
		private static final NameComparator ourInstance = new NameComparator();
		public static final NameComparator getInstance() { return ourInstance; }

		private NameComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Packet argFirst, com.scobolsolo.application.Packet argSecond) {
			return argFirst.getName().compareToIgnoreCase(argSecond.getName());
		}
	}

	/** This is a Comparator that can be used to compare Packet objects based on their {@code ShortName} values. */

	public static class ShortNameComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Packet> {
		private static final ShortNameComparator ourInstance = new ShortNameComparator();
		public static final ShortNameComparator getInstance() { return ourInstance; }

		private ShortNameComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Packet argFirst, com.scobolsolo.application.Packet argSecond) {
			return argFirst.getShortName().compareToIgnoreCase(argSecond.getShortName());
		}
	}

	/** This is a Comparator that can be used to compare Packet objects based on their {@code Sequence} values. */

	public static class SequenceComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Packet> {
		private static final SequenceComparator ourInstance = new SequenceComparator();
		public static final SequenceComparator getInstance() { return ourInstance; }

		private SequenceComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Packet argFirst, com.scobolsolo.application.Packet argSecond) {
			return argFirst.getSequenceAsObject().compareTo(argSecond.getSequenceAsObject());
		}
	}

}
