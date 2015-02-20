package com.scobolsolo.application;

import com.opal.*;

/**
 * represents a <code>Round</code> from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from the database table <code>round</code>.  Do not modify this class directly; instead, alter the database table on which it is based and/or the Opal configuration file for the project and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various <code>forXXX</code> methods on the {@link RoundFactory} factory class.  To create new instances, use the <code>create()</code> method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link TransactionContext}.</p>
 *
 * <p>This interface and the {@link RoundFactory} class (the ones in the <code>com.scobolsolo.application</code> package) are the only two automatically generated files for the table that are intended to be referenced in user code. Other automatically generated files (namely those in the <code>com.scobolsolo.persistence</code> package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
public interface Round extends IdentityUserFacing, Comparable<Round> {
	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the Id
	 *
	 * <p>The Id field is a direct mapping of the <code>id</code> database column in the table <code>round</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getId() method.</p>
	 *
	 * @return an object value of Id (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Integer getIdAsObject();
	/**
	 * primitive accessor for the Id
	 *
	 * <p>The Id field is a direct mapping of the <code>id</code> database column in the table <code>round</code>.</p>
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
	 * object accessor for the RoundGroupId
	 *
	 * <p>The RoundGroupId field is a direct mapping of the <code>round_group_id</code> database column in the table <code>round</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getRoundGroupId() method.</p>
	 *
	 * @return an object value of RoundGroupId (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.Integer getRoundGroupIdAsObject();
	/**
	 * object accessor for the RoundGroupId with substitution for a null value
	 *
	 * <p>The RoundGroupId field is a direct mapping of the <code>round_group_id</code> database column in the table <code>round</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the RoundGroupId is <code>null</code>.
	 * @return an object value of RoundGroupId (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getRoundGroupIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getRoundGroupIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the RoundGroupId
	 *
	 * <p>The RoundGroupId field is a direct mapping of the <code>round_group_id</code> database column in the table <code>round</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getRoundGroupIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a <code>NULL</code> value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of RoundGroupId (of the current {@link TransactionContext})
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
	 * sets the RoundGroupId to the value of <code>argRoundGroupId</code>
	 *
	 * @param argRoundGroupId the new value of RoundGroupId.  May be <code>null</code>.
	 */
	public void setRoundGroupId(java.lang.Integer argRoundGroupId);

	/**
	 * sets the RoundGroupId to the value of <code>argRoundGroupId</code>
	 *
	 * @param argRoundGroupId the new value of RoundGroupId
	 */
	public void setRoundGroupId(int argRoundGroupId);

	/**
	 * object accessor for the Name
	 *
	 * <p>The Name field is a direct mapping of the <code>name</code> database column in the table <code>round</code>.</p>
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
	 * <p>The ShortName field is a direct mapping of the <code>short_name</code> database column in the table <code>round</code>.</p>
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
	 * object accessor for the Sequence
	 *
	 * <p>The Sequence field is a direct mapping of the <code>sequence</code> database column in the table <code>round</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getSequence() method.</p>
	 *
	 * @return an object value of Sequence (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Integer getSequenceAsObject();
	/**
	 * primitive accessor for the Sequence
	 *
	 * <p>The Sequence field is a direct mapping of the <code>sequence</code> database column in the table <code>round</code>.</p>
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
	 * object accessor for the StartTime
	 *
	 * <p>The StartTime field is a direct mapping of the <code>start_time</code> database column in the table <code>round</code>.</p>
	 *
	 * @return an object value of StartTime (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.String getStartTime();
	/**
	 * object accessor for the StartTime with substitution for a null value
	 *
	 * <p>The StartTime field is a direct mapping of the <code>start_time</code> database column in the table <code>round</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the StartTime is <code>null</code>.
	 * @return an object value of StartTime (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getStartTime(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getStartTime();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the StartTime to the value of <code>argStartTime</code>
	 *
	 * @param argStartTime the new value of StartTime.  May be <code>null</code>.
	 * @throws ArgumentTooLongException if <code>argStartTime</code> is longer than 16 characters
	 * <p>The database column <code>start_time</code> is limited to 16 characters.</p>
	 *
	 */
	@com.opal.annotation.Length(maximum = 16L)
	public void setStartTime(java.lang.String argStartTime);

	/**
	 * object accessor for the LunchAfter
	 *
	 * <p>The LunchAfter field is a direct mapping of the <code>lunch_after</code> database column in the table <code>round</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isLunchAfter() method.</p>
	 *
	 * @return an object value of LunchAfter (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Boolean isLunchAfterAsObject();
	/**
	 * primitive accessor for the LunchAfter
	 *
	 * <p>The LunchAfter field is a direct mapping of the <code>lunch_after</code> database column in the table <code>round</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the isLunchAfterAsObject() method.</p>
	 *
	 * @return the primitive value of LunchAfter (of the current {@link TransactionContext})
	 */
	default public boolean isLunchAfter() {
		java.lang.Boolean lclO = isLunchAfterAsObject();
		return lclO.booleanValue();
	}

	/**
	 * sets the LunchAfter to the value of <code>argLunchAfter</code>
	 *
	 * @param argLunchAfter the new value of LunchAfter.  May not be <code>null</code>.
	 * <p>The database column <code>lunch_after</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argLunchAfter is null
	 */
	@com.opal.annotation.NotNull
	public void setLunchAfter(java.lang.Boolean argLunchAfter);

	/**
	 * sets the LunchAfter to the value of <code>argLunchAfter</code>
	 *
	 * @param argLunchAfter the new value of LunchAfter
	 */
	public void setLunchAfter(boolean argLunchAfter);

	/**
	 * @return the <code>RoundGroup</code>
	 * The returned <code>RoundGroup</code> is the {@link UserFacing} object corresponding to the row in the <code>round_group</code> that is referenced by the foreign key <code>round_round_group_id_fkey</code>.
	 *
	 */
	public RoundGroup getRoundGroup();
	public void setRoundGroup(RoundGroup argRoundGroup);

	public int getMatchCount();
	public java.util.Iterator<Match> createMatchIterator();

	public java.util.stream.Stream<Match> streamMatch();

	public void addMatch(Match argMatch);
	public void removeMatch(Match argMatch);
	public void clearMatch();

	default public <T extends java.util.Collection<? super Match>> T acquireMatch(T argC) {
		org.apache.commons.lang3.Validate.notNull(argC);
		java.util.Iterator<Match> lclI = createMatchIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public Match[] createMatchArray() {
		int lclLength = getMatchCount();
		Match[] lclA = new Match[lclLength];
		int lclIndex = 0;
		java.util.Iterator<Match> lclI = createMatchIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public int getPacketCount();
	public java.util.Iterator<Packet> createPacketIterator();

	public java.util.stream.Stream<Packet> streamPacket();

	public void addPacket(Packet argPacket);
	public void removePacket(Packet argPacket);
	public void clearPacket();

	default public <T extends java.util.Collection<? super Packet>> T acquirePacket(T argC) {
		org.apache.commons.lang3.Validate.notNull(argC);
		java.util.Iterator<Packet> lclI = createPacketIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public Packet[] createPacketArray() {
		int lclLength = getPacketCount();
		Packet[] lclA = new Packet[lclLength];
		int lclIndex = 0;
		java.util.Iterator<Packet> lclI = createPacketIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public Round copy();

	default public String getNameWithStartTime() {
		return com.scobolsolo.application.RoundDelegate.getNameWithStartTime(this);
	}

	default public String getShortNameWithStartTime() {
		return com.scobolsolo.application.RoundDelegate.getShortNameWithStartTime(this);
	}

	default public boolean isAfter(com.scobolsolo.application.Round argA) {
		return com.scobolsolo.application.RoundDelegate.isAfter(this, argA);
	}

	default public boolean isBefore(com.scobolsolo.application.Round argA) {
		return com.scobolsolo.application.RoundDelegate.isBefore(this, argA);
	}

	/** This is a Comparator that can be used to compare Round objects based on their Id values. */

	public static class IdComparator extends com.siliconage.util.NullSafeComparator<Round> {
		private static final IdComparator ourInstance = new IdComparator();
		public static final IdComparator getInstance() { return ourInstance; }

		private IdComparator() { super(); }

		@Override
		public int compareInternal(Round argFirst, Round argSecond) {
			return argFirst.getIdAsObject().compareTo(argSecond.getIdAsObject());
		}
	}

	/** This is a Comparator that can be used to compare Round objects based on their Name values. */

	public static class NameComparator extends com.siliconage.util.NullSafeComparator<Round> {
		private static final NameComparator ourInstance = new NameComparator();
		public static final NameComparator getInstance() { return ourInstance; }

		private NameComparator() { super(); }

		@Override
		public int compareInternal(Round argFirst, Round argSecond) {
			return argFirst.getName().compareToIgnoreCase(argSecond.getName());
		}
	}

	/** This is a Comparator that can be used to compare Round objects based on their ShortName values. */

	public static class ShortNameComparator extends com.siliconage.util.NullSafeComparator<Round> {
		private static final ShortNameComparator ourInstance = new ShortNameComparator();
		public static final ShortNameComparator getInstance() { return ourInstance; }

		private ShortNameComparator() { super(); }

		@Override
		public int compareInternal(Round argFirst, Round argSecond) {
			return argFirst.getShortName().compareToIgnoreCase(argSecond.getShortName());
		}
	}

	/** This is a Comparator that can be used to compare Round objects based on their Sequence values. */

	public static class SequenceComparator extends com.siliconage.util.NullSafeComparator<Round> {
		private static final SequenceComparator ourInstance = new SequenceComparator();
		public static final SequenceComparator getInstance() { return ourInstance; }

		private SequenceComparator() { super(); }

		@Override
		public int compareInternal(Round argFirst, Round argSecond) {
			return argFirst.getSequenceAsObject().compareTo(argSecond.getSequenceAsObject());
		}
	}

	public static class StandardComparator extends com.siliconage.util.NullSafeComparator<Round> {
		private static final StandardComparator ourInstance = new StandardComparator();
		public static final StandardComparator getInstance() { return ourInstance; }

		private StandardComparator() { super(); }

		@Override
		public int compareInternal(Round argFirst, Round argSecond) {
			int lclResult = com.scobolsolo.application.RoundGroup.StandardComparator.getInstance().compare(argFirst.getRoundGroup(), argSecond.getRoundGroup());
			if (lclResult != 0) {
				return lclResult;
			}
			return argFirst.getSequenceAsObject().compareTo(argSecond.getSequenceAsObject());
		}
	}

}
