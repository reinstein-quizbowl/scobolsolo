package com.scobolsolo.application;

import com.opal.*;

/**
 * represents a <code>Packet</code> from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from the database table <code>packet</code>.  Do not modify this class directly; instead, alter the database table on which it is based and/or the Opal configuration file for the project and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various <code>forXXX</code> methods on the {@link PacketFactory} factory class.  To create new instances, use the <code>create()</code> method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link TransactionContext}.</p>
 *
 * <p>This interface and the {@link PacketFactory} class (the ones in the <code>com.scobolsolo.application</code> package) are the only two automatically generated files for the table that are intended to be referenced in user code. Other automatically generated files (namely those in the <code>com.scobolsolo.persistence</code> package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
public interface Packet extends IdentityUserFacing {
	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the Id
	 *
	 * <p>The Id field is a direct mapping of the <code>id</code> database column in the table <code>packet</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getId() method.</p>
	 *
	 * @return an object value of Id (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Integer getIdAsObject();
	/**
	 * primitive accessor for the Id
	 *
	 * <p>The Id field is a direct mapping of the <code>id</code> database column in the table <code>packet</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getIdAsObject() method.</p>
	 *
	 * @return the primitive value of Id (of the current {@link TransactionContext})
	 */
	default public int getId() {
		java.lang.Integer lclO = getIdAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the Id to the value of <code>argId</code>
	 *
	 * @param argId the new value of Id.  May not be <code>null</code>.
	 * <p>The database column <code>id</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argId is null
	 */
	@com.opal.annotation.NotNull
	public void setId(java.lang.Integer argId);

	/**
	 * sets the Id to the value of <code>argId</code>
	 *
	 * @param argId the new value of Id
	 */
	public void setId(int argId);

	/**
	 * object accessor for the Name
	 *
	 * <p>The Name field is a direct mapping of the <code>name</code> database column in the table <code>packet</code>.</p>
	 *
	 * @return an object value of Name (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.String getName();
	/**
	 * sets the Name to the value of <code>argName</code>
	 *
	 * @param argName the new value of Name.  May not be <code>null</code>.
	 * <p>The database column <code>name</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argName is null
	 * @throws ArgumentTooLongException if <code>argName</code> is longer than 256 characters
	 * <p>The database column <code>name</code> is limited to 256 characters.</p>
	 *
	 */
	@com.opal.annotation.NotNull
	@com.opal.annotation.Length(maximum = 256L)
	public void setName(java.lang.String argName);

	/**
	 * object accessor for the ShortName
	 *
	 * <p>The ShortName field is a direct mapping of the <code>short_name</code> database column in the table <code>packet</code>.</p>
	 *
	 * @return an object value of ShortName (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.String getShortName();
	/**
	 * sets the ShortName to the value of <code>argShortName</code>
	 *
	 * @param argShortName the new value of ShortName.  May not be <code>null</code>.
	 * <p>The database column <code>short_name</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argShortName is null
	 * @throws ArgumentTooLongException if <code>argShortName</code> is longer than 32 characters
	 * <p>The database column <code>short_name</code> is limited to 32 characters.</p>
	 *
	 */
	@com.opal.annotation.NotNull
	@com.opal.annotation.Length(maximum = 32L)
	public void setShortName(java.lang.String argShortName);

	/**
	 * object accessor for the RoundId
	 *
	 * <p>The RoundId field is a direct mapping of the <code>round_id</code> database column in the table <code>packet</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getRoundId() method.</p>
	 *
	 * @return an object value of RoundId (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.Integer getRoundIdAsObject();
	/**
	 * object accessor for the RoundId with substitution for a null value
	 *
	 * <p>The RoundId field is a direct mapping of the <code>round_id</code> database column in the table <code>packet</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the RoundId is <code>null</code>.
	 * @return an object value of RoundId (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getRoundIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getRoundIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the RoundId
	 *
	 * <p>The RoundId field is a direct mapping of the <code>round_id</code> database column in the table <code>packet</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getRoundIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a <code>NULL</code> value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of RoundId (of the current {@link TransactionContext})
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
	 * sets the RoundId to the value of <code>argRoundId</code>
	 *
	 * @param argRoundId the new value of RoundId.  May be <code>null</code>.
	 */
	public void setRoundId(java.lang.Integer argRoundId);

	/**
	 * sets the RoundId to the value of <code>argRoundId</code>
	 *
	 * @param argRoundId the new value of RoundId
	 */
	public void setRoundId(int argRoundId);

	/**
	 * object accessor for the Note
	 *
	 * <p>The Note field is a direct mapping of the <code>note</code> database column in the table <code>packet</code>.</p>
	 *
	 * @return an object value of Note (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.String getNote();
	/**
	 * object accessor for the Note with substitution for a null value
	 *
	 * <p>The Note field is a direct mapping of the <code>note</code> database column in the table <code>packet</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the Note is <code>null</code>.
	 * @return an object value of Note (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getNote(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getNote();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the Note to the value of <code>argNote</code>
	 *
	 * @param argNote the new value of Note.  May be <code>null</code>.
	 * @throws ArgumentTooLongException if <code>argNote</code> is longer than 2147483647 characters
	 * <p>The database column <code>note</code> is limited to 2147483647 characters.</p>
	 *
	 */
	@com.opal.annotation.Length(maximum = 2147483647L)
	public void setNote(java.lang.String argNote);

	/**
	 * object accessor for the TournamentCode
	 *
	 * <p>The TournamentCode field is a direct mapping of the <code>tournament_code</code> database column in the table <code>packet</code>.</p>
	 *
	 * @return an object value of TournamentCode (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.String getTournamentCode();
	/**
	 * sets the TournamentCode to the value of <code>argTournamentCode</code>
	 *
	 * @param argTournamentCode the new value of TournamentCode.  May not be <code>null</code>.
	 * <p>The database column <code>tournament_code</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argTournamentCode is null
	 * @throws ArgumentTooLongException if <code>argTournamentCode</code> is longer than 32 characters
	 * <p>The database column <code>tournament_code</code> is limited to 32 characters.</p>
	 *
	 */
	@com.opal.annotation.NotNull
	@com.opal.annotation.Length(maximum = 32L)
	public void setTournamentCode(java.lang.String argTournamentCode);

	/**
	 * object accessor for the Sequence
	 *
	 * <p>The Sequence field is a direct mapping of the <code>sequence</code> database column in the table <code>packet</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getSequence() method.</p>
	 *
	 * @return an object value of Sequence (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Integer getSequenceAsObject();
	/**
	 * primitive accessor for the Sequence
	 *
	 * <p>The Sequence field is a direct mapping of the <code>sequence</code> database column in the table <code>packet</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getSequenceAsObject() method.</p>
	 *
	 * @return the primitive value of Sequence (of the current {@link TransactionContext})
	 */
	default public int getSequence() {
		java.lang.Integer lclO = getSequenceAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the Sequence to the value of <code>argSequence</code>
	 *
	 * @param argSequence the new value of Sequence.  May not be <code>null</code>.
	 * <p>The database column <code>sequence</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argSequence is null
	 */
	@com.opal.annotation.NotNull
	public void setSequence(java.lang.Integer argSequence);

	/**
	 * sets the Sequence to the value of <code>argSequence</code>
	 *
	 * @param argSequence the new value of Sequence
	 */
	public void setSequence(int argSequence);

	/**
	 * object accessor for the ReplacementPacketId
	 *
	 * <p>The ReplacementPacketId field is a direct mapping of the <code>replacement_packet_id</code> database column in the table <code>packet</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getReplacementPacketId() method.</p>
	 *
	 * @return an object value of ReplacementPacketId (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.Integer getReplacementPacketIdAsObject();
	/**
	 * object accessor for the ReplacementPacketId with substitution for a null value
	 *
	 * <p>The ReplacementPacketId field is a direct mapping of the <code>replacement_packet_id</code> database column in the table <code>packet</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the ReplacementPacketId is <code>null</code>.
	 * @return an object value of ReplacementPacketId (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getReplacementPacketIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getReplacementPacketIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the ReplacementPacketId
	 *
	 * <p>The ReplacementPacketId field is a direct mapping of the <code>replacement_packet_id</code> database column in the table <code>packet</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getReplacementPacketIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a <code>NULL</code> value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of ReplacementPacketId (of the current {@link TransactionContext})
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
	 * sets the ReplacementPacketId to the value of <code>argReplacementPacketId</code>
	 *
	 * @param argReplacementPacketId the new value of ReplacementPacketId.  May be <code>null</code>.
	 */
	public void setReplacementPacketId(java.lang.Integer argReplacementPacketId);

	/**
	 * sets the ReplacementPacketId to the value of <code>argReplacementPacketId</code>
	 *
	 * @param argReplacementPacketId the new value of ReplacementPacketId
	 */
	public void setReplacementPacketId(int argReplacementPacketId);

	/**
	 * object accessor for the QuestionsPublic
	 *
	 * <p>The QuestionsPublic field is a direct mapping of the <code>questions_public</code> database column in the table <code>packet</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isQuestionsPublic() method.</p>
	 *
	 * @return an object value of QuestionsPublic (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Boolean isQuestionsPublicAsObject();
	/**
	 * primitive accessor for the QuestionsPublic
	 *
	 * <p>The QuestionsPublic field is a direct mapping of the <code>questions_public</code> database column in the table <code>packet</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the isQuestionsPublicAsObject() method.</p>
	 *
	 * @return the primitive value of QuestionsPublic (of the current {@link TransactionContext})
	 */
	default public boolean isQuestionsPublic() {
		java.lang.Boolean lclO = isQuestionsPublicAsObject();
		return lclO.booleanValue();
	}

	/**
	 * sets the QuestionsPublic to the value of <code>argQuestionsPublic</code>
	 *
	 * @param argQuestionsPublic the new value of QuestionsPublic.  May not be <code>null</code>.
	 * <p>The database column <code>questions_public</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argQuestionsPublic is null
	 */
	@com.opal.annotation.NotNull
	public void setQuestionsPublic(java.lang.Boolean argQuestionsPublic);

	/**
	 * sets the QuestionsPublic to the value of <code>argQuestionsPublic</code>
	 *
	 * @param argQuestionsPublic the new value of QuestionsPublic
	 */
	public void setQuestionsPublic(boolean argQuestionsPublic);

	/**
	 * @return the <code>Packet</code>
	 * The returned <code>Packet</code> is the {@link UserFacing} object corresponding to the row in the <code>packet</code> that is referenced by the foreign key <code>packet_replacement_packet_id_fkey</code>.
	 *
	 */
	public Packet getReplacementPacket();
	public void setReplacementPacket(Packet argPacket);

	/**
	 * @return the <code>Round</code>
	 * The returned <code>Round</code> is the {@link UserFacing} object corresponding to the row in the <code>round</code> that is referenced by the foreign key <code>packet_round_id_fkey</code>.
	 *
	 */
	public Round getRound();
	public void setRound(Round argRound);

	/**
	 * @return the <code>Tournament</code>
	 * The returned <code>Tournament</code> is the {@link UserFacing} object corresponding to the row in the <code>tournament</code> that is referenced by the foreign key <code>packet_tournament_code_fkey</code>.
	 *
	 */
	public Tournament getTournament();
	public void setTournament(Tournament argTournament);

	public int getReplacementPacketCount();
	public java.util.Iterator<Packet> createReplacementPacketIterator();

	public java.util.stream.Stream<Packet> streamReplacementPacket();

	public void addReplacementPacket(Packet argPacket);
	public void removeReplacementPacket(Packet argPacket);
	public void clearReplacementPacket();

	default public <T extends java.util.Collection<? super Packet>> T acquireReplacementPacket(T argC) {
		org.apache.commons.lang3.Validate.notNull(argC);
		java.util.Iterator<Packet> lclI = createReplacementPacketIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public Packet[] createReplacementPacketArray() {
		int lclLength = getReplacementPacketCount();
		Packet[] lclA = new Packet[lclLength];
		int lclIndex = 0;
		java.util.Iterator<Packet> lclI = createReplacementPacketIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public int getPlacementCount();
	public java.util.Iterator<Placement> createPlacementIterator();

	public java.util.stream.Stream<Placement> streamPlacement();

	public void addPlacement(Placement argPlacement);
	public void removePlacement(Placement argPlacement);
	public void clearPlacement();

	default public <T extends java.util.Collection<? super Placement>> T acquirePlacement(T argC) {
		org.apache.commons.lang3.Validate.notNull(argC);
		java.util.Iterator<Placement> lclI = createPlacementIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public Placement[] createPlacementArray() {
		int lclLength = getPlacementCount();
		Placement[] lclA = new Placement[lclLength];
		int lclIndex = 0;
		java.util.Iterator<Placement> lclI = createPlacementIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public Packet copy();

	/** This is a Comparator that can be used to compare Packet objects based on their Id values. */

	public static class IdComparator extends com.siliconage.util.NullSafeComparator<Packet> {
		private static final IdComparator ourInstance = new IdComparator();
		public static final IdComparator getInstance() { return ourInstance; }

		private IdComparator() { super(); }

		@Override
		public int compareInternal(Packet argFirst, Packet argSecond) {
			return argFirst.getIdAsObject().compareTo(argSecond.getIdAsObject());
		}
	}

	/** This is a Comparator that can be used to compare Packet objects based on their Name values. */

	public static class NameComparator extends com.siliconage.util.NullSafeComparator<Packet> {
		private static final NameComparator ourInstance = new NameComparator();
		public static final NameComparator getInstance() { return ourInstance; }

		private NameComparator() { super(); }

		@Override
		public int compareInternal(Packet argFirst, Packet argSecond) {
			return argFirst.getName().compareToIgnoreCase(argSecond.getName());
		}
	}

	/** This is a Comparator that can be used to compare Packet objects based on their ShortName values. */

	public static class ShortNameComparator extends com.siliconage.util.NullSafeComparator<Packet> {
		private static final ShortNameComparator ourInstance = new ShortNameComparator();
		public static final ShortNameComparator getInstance() { return ourInstance; }

		private ShortNameComparator() { super(); }

		@Override
		public int compareInternal(Packet argFirst, Packet argSecond) {
			return argFirst.getShortName().compareToIgnoreCase(argSecond.getShortName());
		}
	}

	/** This is a Comparator that can be used to compare Packet objects based on their Sequence values. */

	public static class SequenceComparator extends com.siliconage.util.NullSafeComparator<Packet> {
		private static final SequenceComparator ourInstance = new SequenceComparator();
		public static final SequenceComparator getInstance() { return ourInstance; }

		private SequenceComparator() { super(); }

		@Override
		public int compareInternal(Packet argFirst, Packet argSecond) {
			return argFirst.getSequenceAsObject().compareTo(argSecond.getSequenceAsObject());
		}
	}

	public static class StandardComparator extends com.siliconage.util.NullSafeComparator<Packet> {
		private static final StandardComparator ourInstance = new StandardComparator();
		public static final StandardComparator getInstance() { return ourInstance; }

		private StandardComparator() { super(); }

		@Override
		public int compareInternal(Packet argFirst, Packet argSecond) {
			int lclResult = com.scobolsolo.application.Round.StandardComparator.getInstance().compare(argFirst.getRound(), argSecond.getRound());
			if (lclResult != 0) {
				return lclResult;
			}
			return argFirst.getSequenceAsObject().compareTo(argSecond.getSequenceAsObject());
		}
	}

}
