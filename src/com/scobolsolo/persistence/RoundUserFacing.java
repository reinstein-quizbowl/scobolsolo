package com.scobolsolo.persistence;

import com.opal.*;

/**
 * represents a {@code Round} from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from {@code round}.  Do not modify this class directly; instead, alter the permanent storage on which it is based, the Opal configuration file for the project, and/or the {@link com.scobolsolo.application.Round}, and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various {@code forXXX} methods on the {@link com.scobolsolo.application.RoundFactory} factory class.  To create new instances, use the {@code create()} method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link com.opal.TransactionContext}.</p>
 *
 * <p>This interface is not meant to be referenced in user code.  Only the {@link com.scobolsolo.application.Round} and the {@link com.scobolsolo.application.RoundFactory} class should be referenced directly.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
public interface RoundUserFacing extends IdentityUserFacing, Comparable<com.scobolsolo.application.Round> {
	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the {@code Id}
	 *
	 * <p>The {@code Id} field is a direct mapping of the {@code id} field in {@code round}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getId() method.</p>
	 *
	 * @return an object value of {@code Id} (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.Integer getIdAsObject();

	/**
	 * primitive accessor for the {@code Id}
	 *
	 * <p>The {@code Id} field is a direct mapping of the {@code id} database column in the table {@code round}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getIdAsObject() method.</p>
	 *
	 * @return the primitive value of {@code Id} (of the current {@link TransactionContext})
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
	public com.scobolsolo.application.Round setId(java.lang.Integer argId);

	/**
	 * sets the {@code Id} to the value of {@code argId}
	 *
	 * @param argId the new value of {@code Id}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.Round setId(int argId);

	/**
	 * object accessor for the {@code RoundGroupId}
	 *
	 * <p>The {@code RoundGroupId} field is a direct mapping of the {@code round_group_id} field in {@code round}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getRoundGroupId() method.</p>
	 *
	 * @return an object value of {@code RoundGroupId} (of the current {@link TransactionContext})  May be <code>null</code>.
	 */
	public java.lang.Integer getRoundGroupIdAsObject();

	/**
	 * object accessor for the {@code RoundGroupId} with substitution for a null value
	 *
	 * <p>The {@code RoundGroupId} field is a direct mapping of the {@code round_group_id} database column in the table {@code round}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code RoundGroupId} is {@code null}.
	 * @return an object value of {@code RoundGroupId} (of the current {@link TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getRoundGroupIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getRoundGroupIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code RoundGroupId}
	 *
	 * <p>The {@code RoundGroupId} field is a direct mapping of the {@code round_group_id} database column in the table {@code round}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getRoundGroupIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code RoundGroupId} (of the current {@link TransactionContext})
	 * @throws NullValueException when the internal value is null
	 */
	default public int getRoundGroupId() throws com.opal.NullValueException {
		java.lang.Integer lclO = getRoundGroupIdAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getRoundGroupId(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getRoundGroupIdAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getRoundGroupId(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getRoundGroupIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * sets the {@code RoundGroupId} to the value of {@code argRoundGroupId}
	 *
	 * @param argRoundGroupId the new value of {@code RoundGroupId}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 */
	public com.scobolsolo.application.Round setRoundGroupId(java.lang.Integer argRoundGroupId);

	/**
	 * sets the {@code RoundGroupId} to the value of {@code argRoundGroupId}
	 *
	 * @param argRoundGroupId the new value of {@code RoundGroupId}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.Round setRoundGroupId(int argRoundGroupId);

	/**
	 * object accessor for the {@code Name}
	 *
	 * <p>The {@code Name} field is a direct mapping of the {@code name} field in {@code round}.</p>
	 *
	 * @return an object value of {@code Name} (of the current {@link TransactionContext})  Will not be <code>null</code>.
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
	public com.scobolsolo.application.Round setName(java.lang.String argName);

	/**
	 * object accessor for the {@code ShortName}
	 *
	 * <p>The {@code ShortName} field is a direct mapping of the {@code short_name} field in {@code round}.</p>
	 *
	 * @return an object value of {@code ShortName} (of the current {@link TransactionContext})  Will not be <code>null</code>.
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
	public com.scobolsolo.application.Round setShortName(java.lang.String argShortName);

	/**
	 * object accessor for the {@code Sequence}
	 *
	 * <p>The {@code Sequence} field is a direct mapping of the {@code sequence} field in {@code round}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getSequence() method.</p>
	 *
	 * @return an object value of {@code Sequence} (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.Integer getSequenceAsObject();

	/**
	 * primitive accessor for the {@code Sequence}
	 *
	 * <p>The {@code Sequence} field is a direct mapping of the {@code sequence} database column in the table {@code round}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getSequenceAsObject() method.</p>
	 *
	 * @return the primitive value of {@code Sequence} (of the current {@link TransactionContext})
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
	public com.scobolsolo.application.Round setSequence(java.lang.Integer argSequence);

	/**
	 * sets the {@code Sequence} to the value of {@code argSequence}
	 *
	 * @param argSequence the new value of {@code Sequence}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.Round setSequence(int argSequence);

	/**
	 * object accessor for the {@code StartTime}
	 *
	 * <p>The {@code StartTime} field is a direct mapping of the {@code start_time} field in {@code round}.</p>
	 *
	 * @return an object value of {@code StartTime} (of the current {@link TransactionContext})  May be <code>null</code>.
	 */
	public java.lang.String getStartTime();

	/**
	 * object accessor for the {@code StartTime} with substitution for a null value
	 *
	 * <p>The {@code StartTime} field is a direct mapping of the {@code start_time} database column in the table {@code round}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code StartTime} is {@code null}.
	 * @return an object value of {@code StartTime} (of the current {@link TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getStartTime(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getStartTime();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the {@code StartTime} to the value of {@code argStartTime}
	 *
	 * @param argStartTime the new value of {@code StartTime}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * @throws ArgumentTooLongException if {@code argStartTime} is longer than 16 characters
	 * <p>The database column {@code start_time} is limited to 16 characters.</p>
	 *
	 */
	@com.opal.annotation.Length(maximum = 16L)
	public com.scobolsolo.application.Round setStartTime(java.lang.String argStartTime);

	/**
	 * object accessor for the {@code LunchAfter}
	 *
	 * <p>The {@code LunchAfter} field is a direct mapping of the {@code lunch_after} field in {@code round}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isLunchAfter() method.</p>
	 *
	 * @return an object value of {@code LunchAfter} (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.Boolean isLunchAfterAsObject();

	/**
	 * primitive accessor for the {@code LunchAfter}
	 *
	 * <p>The {@code LunchAfter} field is a direct mapping of the {@code lunch_after} database column in the table {@code round}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the isLunchAfterAsObject() method.</p>
	 *
	 * @return the primitive value of {@code LunchAfter} (of the current {@link TransactionContext})
	 */
	default public boolean isLunchAfter() {
		java.lang.Boolean lclO = isLunchAfterAsObject();
		return lclO.booleanValue();
	}

	/**
	 * sets the {@code LunchAfter} to the value of {@code argLunchAfter}
	 *
	 * @param argLunchAfter the new value of {@code LunchAfter}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code lunch_after} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argLunchAfter is null
	 */
	@com.opal.annotation.NotNull
	public com.scobolsolo.application.Round setLunchAfter(java.lang.Boolean argLunchAfter);

	/**
	 * sets the {@code LunchAfter} to the value of {@code argLunchAfter}
	 *
	 * @param argLunchAfter the new value of {@code LunchAfter}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.Round setLunchAfter(boolean argLunchAfter);

	/**
	 * @return the {@code com.scobolsolo.application.RoundGroup}
	 * The returned {@code com.scobolsolo.application.RoundGroup} is the {@link UserFacing} object corresponding to the entry in {@code round_group} that is referenced by {@code round_round_group_id_fkey}.
	 *
	 */
	public com.scobolsolo.application.RoundGroup getRoundGroup();
	public com.scobolsolo.application.Round setRoundGroup(com.scobolsolo.application.RoundGroup argRoundGroup);

	public int getMatchCount();
	public java.util.Iterator<com.scobolsolo.application.Match> createMatchIterator();

	public java.util.stream.Stream<com.scobolsolo.application.Match> streamMatch();

	public void addMatch(com.scobolsolo.application.Match argMatch);
	public void removeMatch(com.scobolsolo.application.Match argMatch);
	public void clearMatch();

	default public <T extends java.util.Collection<? super com.scobolsolo.application.Match>> T acquireMatch(T argC) {
		if (argC == null) { throw new IllegalArgumentException("Target Collection is null."); }
		java.util.Iterator<com.scobolsolo.application.Match> lclI = createMatchIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public com.scobolsolo.application.Match[] createMatchArray() {
		int lclLength = getMatchCount();
		com.scobolsolo.application.Match[] lclA = new com.scobolsolo.application.Match[lclLength];
		int lclIndex = 0;
		java.util.Iterator<com.scobolsolo.application.Match> lclI = createMatchIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public int getPacketCount();
	public java.util.Iterator<com.scobolsolo.application.Packet> createPacketIterator();

	public java.util.stream.Stream<com.scobolsolo.application.Packet> streamPacket();

	public void addPacket(com.scobolsolo.application.Packet argPacket);
	public void removePacket(com.scobolsolo.application.Packet argPacket);
	public void clearPacket();

	default public <T extends java.util.Collection<? super com.scobolsolo.application.Packet>> T acquirePacket(T argC) {
		if (argC == null) { throw new IllegalArgumentException("Target Collection is null."); }
		java.util.Iterator<com.scobolsolo.application.Packet> lclI = createPacketIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public com.scobolsolo.application.Packet[] createPacketArray() {
		int lclLength = getPacketCount();
		com.scobolsolo.application.Packet[] lclA = new com.scobolsolo.application.Packet[lclLength];
		int lclIndex = 0;
		java.util.Iterator<com.scobolsolo.application.Packet> lclI = createPacketIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public com.scobolsolo.application.Round copy();

	/** This is a Comparator that can be used to compare Round objects based on their {@code Id} values. */

	public static class IdComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Round> {
		private static final IdComparator ourInstance = new IdComparator();
		public static final IdComparator getInstance() { return ourInstance; }

		private IdComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Round argFirst, com.scobolsolo.application.Round argSecond) {
			return argFirst.getIdAsObject().compareTo(argSecond.getIdAsObject());
		}
	}

	/** This is a Comparator that can be used to compare Round objects based on their {@code Name} values. */

	public static class NameComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Round> {
		private static final NameComparator ourInstance = new NameComparator();
		public static final NameComparator getInstance() { return ourInstance; }

		private NameComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Round argFirst, com.scobolsolo.application.Round argSecond) {
			return argFirst.getName().compareToIgnoreCase(argSecond.getName());
		}
	}

	/** This is a Comparator that can be used to compare Round objects based on their {@code ShortName} values. */

	public static class ShortNameComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Round> {
		private static final ShortNameComparator ourInstance = new ShortNameComparator();
		public static final ShortNameComparator getInstance() { return ourInstance; }

		private ShortNameComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Round argFirst, com.scobolsolo.application.Round argSecond) {
			return argFirst.getShortName().compareToIgnoreCase(argSecond.getShortName());
		}
	}

	/** This is a Comparator that can be used to compare Round objects based on their {@code Sequence} values. */

	public static class SequenceComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Round> {
		private static final SequenceComparator ourInstance = new SequenceComparator();
		public static final SequenceComparator getInstance() { return ourInstance; }

		private SequenceComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Round argFirst, com.scobolsolo.application.Round argSecond) {
			return argFirst.getSequenceAsObject().compareTo(argSecond.getSequenceAsObject());
		}
	}

	public static class StandardComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Round> {
		private static final StandardComparator ourInstance = new StandardComparator();
		public static final StandardComparator getInstance() { return ourInstance; }

		private StandardComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Round argFirst, com.scobolsolo.application.Round argSecond) {
			int lclResult = com.scobolsolo.application.RoundGroup.StandardComparator.getInstance().compare(argFirst.getRoundGroup(),  argSecond.getRoundGroup());
			if (lclResult != 0) {
				return lclResult;
			}
			return argFirst.getSequence() - argSecond.getSequence();
		}
	}

}
