package com.scobolsolo.application;

import com.opal.*;

/**
 * represents a <code>Room</code> from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from the database table <code>room</code>.  Do not modify this class directly; instead, alter the database table on which it is based and/or the Opal configuration file for the project and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various <code>forXXX</code> methods on the {@link RoomFactory} factory class.  To create new instances, use the <code>create()</code> method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link TransactionContext}.</p>
 *
 * <p>This interface and the {@link RoomFactory} class (the ones in the <code>com.scobolsolo.application</code> package) are the only two automatically generated files for the table that are intended to be referenced in user code. Other automatically generated files (namely those in the <code>com.scobolsolo.persistence</code> package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
public interface Room extends IdentityUserFacing, Comparable<Room> {
	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the Id
	 *
	 * <p>The Id field is a direct mapping of the <code>id</code> database column in the table <code>room</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getId() method.</p>
	 *
	 * @return an object value of Id (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Integer getIdAsObject();
	/**
	 * primitive accessor for the Id
	 *
	 * <p>The Id field is a direct mapping of the <code>id</code> database column in the table <code>room</code>.</p>
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
	 * <p>The Name field is a direct mapping of the <code>name</code> database column in the table <code>room</code>.</p>
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
	 * <p>The ShortName field is a direct mapping of the <code>short_name</code> database column in the table <code>room</code>.</p>
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
	 * object accessor for the Note
	 *
	 * <p>The Note field is a direct mapping of the <code>note</code> database column in the table <code>room</code>.</p>
	 *
	 * @return an object value of Note (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.String getNote();
	/**
	 * object accessor for the Note with substitution for a null value
	 *
	 * <p>The Note field is a direct mapping of the <code>note</code> database column in the table <code>room</code>.</p>
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
	 * <p>The TournamentCode field is a direct mapping of the <code>tournament_code</code> database column in the table <code>room</code>.</p>
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
	 * <p>The Sequence field is a direct mapping of the <code>sequence</code> database column in the table <code>room</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getSequence() method.</p>
	 *
	 * @return an object value of Sequence (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Integer getSequenceAsObject();
	/**
	 * primitive accessor for the Sequence
	 *
	 * <p>The Sequence field is a direct mapping of the <code>sequence</code> database column in the table <code>room</code>.</p>
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
	 * object accessor for the GameRoom
	 *
	 * <p>The GameRoom field is a direct mapping of the <code>game_room</code> database column in the table <code>room</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isGameRoom() method.</p>
	 *
	 * @return an object value of GameRoom (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Boolean isGameRoomAsObject();
	/**
	 * primitive accessor for the GameRoom
	 *
	 * <p>The GameRoom field is a direct mapping of the <code>game_room</code> database column in the table <code>room</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the isGameRoomAsObject() method.</p>
	 *
	 * @return the primitive value of GameRoom (of the current {@link TransactionContext})
	 */
	default public boolean isGameRoom() {
		java.lang.Boolean lclO = isGameRoomAsObject();
		return lclO.booleanValue();
	}

	/**
	 * sets the GameRoom to the value of <code>argGameRoom</code>
	 *
	 * @param argGameRoom the new value of GameRoom.  May not be <code>null</code>.
	 * <p>The database column <code>game_room</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argGameRoom is null
	 */
	@com.opal.annotation.NotNull
	public void setGameRoom(java.lang.Boolean argGameRoom);

	/**
	 * sets the GameRoom to the value of <code>argGameRoom</code>
	 *
	 * @param argGameRoom the new value of GameRoom
	 */
	public void setGameRoom(boolean argGameRoom);

	/**
	 * @return the <code>Tournament</code>
	 * The returned <code>Tournament</code> is the {@link UserFacing} object corresponding to the row in the <code>tournament</code> that is referenced by the foreign key <code>room_tournament_code_fkey</code>.
	 *
	 */
	public Tournament getTournament();
	public void setTournament(Tournament argTournament);

	public int getControlRoomTournamentCount();
	public java.util.Iterator<Tournament> createControlRoomTournamentIterator();

	public java.util.stream.Stream<Tournament> streamControlRoomTournament();

	public void addControlRoomTournament(Tournament argTournament);
	public void removeControlRoomTournament(Tournament argTournament);
	public void clearControlRoomTournament();

	default public <T extends java.util.Collection<? super Tournament>> T acquireControlRoomTournament(T argC) {
		org.apache.commons.lang3.Validate.notNull(argC);
		java.util.Iterator<Tournament> lclI = createControlRoomTournamentIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public Tournament[] createControlRoomTournamentArray() {
		int lclLength = getControlRoomTournamentCount();
		Tournament[] lclA = new Tournament[lclLength];
		int lclIndex = 0;
		java.util.Iterator<Tournament> lclI = createControlRoomTournamentIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public int getStaffAssignmentCount();
	public java.util.Iterator<StaffAssignment> createStaffAssignmentIterator();

	public java.util.stream.Stream<StaffAssignment> streamStaffAssignment();

	public void addStaffAssignment(StaffAssignment argStaffAssignment);
	public void removeStaffAssignment(StaffAssignment argStaffAssignment);
	public void clearStaffAssignment();

	default public <T extends java.util.Collection<? super StaffAssignment>> T acquireStaffAssignment(T argC) {
		org.apache.commons.lang3.Validate.notNull(argC);
		java.util.Iterator<StaffAssignment> lclI = createStaffAssignmentIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public StaffAssignment[] createStaffAssignmentArray() {
		int lclLength = getStaffAssignmentCount();
		StaffAssignment[] lclA = new StaffAssignment[lclLength];
		int lclIndex = 0;
		java.util.Iterator<StaffAssignment> lclI = createStaffAssignmentIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public int getBuzzerCount();
	public java.util.Iterator<Buzzer> createBuzzerIterator();

	public java.util.stream.Stream<Buzzer> streamBuzzer();

	public void addBuzzer(Buzzer argBuzzer);
	public void removeBuzzer(Buzzer argBuzzer);
	public void clearBuzzer();

	default public <T extends java.util.Collection<? super Buzzer>> T acquireBuzzer(T argC) {
		org.apache.commons.lang3.Validate.notNull(argC);
		java.util.Iterator<Buzzer> lclI = createBuzzerIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public Buzzer[] createBuzzerArray() {
		int lclLength = getBuzzerCount();
		Buzzer[] lclA = new Buzzer[lclLength];
		int lclIndex = 0;
		java.util.Iterator<Buzzer> lclI = createBuzzerIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

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

	public Room copy();

	/** This is a Comparator that can be used to compare Room objects based on their Id values. */

	public static class IdComparator extends com.siliconage.util.NullSafeComparator<Room> {
		private static final IdComparator ourInstance = new IdComparator();
		public static final IdComparator getInstance() { return ourInstance; }

		private IdComparator() { super(); }

		@Override
		public int compareInternal(Room argFirst, Room argSecond) {
			return argFirst.getIdAsObject().compareTo(argSecond.getIdAsObject());
		}
	}

	/** This is a Comparator that can be used to compare Room objects based on their Name values. */

	public static class NameComparator extends com.siliconage.util.NullSafeComparator<Room> {
		private static final NameComparator ourInstance = new NameComparator();
		public static final NameComparator getInstance() { return ourInstance; }

		private NameComparator() { super(); }

		@Override
		public int compareInternal(Room argFirst, Room argSecond) {
			return argFirst.getName().compareToIgnoreCase(argSecond.getName());
		}
	}

	/** This is a Comparator that can be used to compare Room objects based on their ShortName values. */

	public static class ShortNameComparator extends com.siliconage.util.NullSafeComparator<Room> {
		private static final ShortNameComparator ourInstance = new ShortNameComparator();
		public static final ShortNameComparator getInstance() { return ourInstance; }

		private ShortNameComparator() { super(); }

		@Override
		public int compareInternal(Room argFirst, Room argSecond) {
			return argFirst.getShortName().compareToIgnoreCase(argSecond.getShortName());
		}
	}

	/** This is a Comparator that can be used to compare Room objects based on their Sequence values. */

	public static class SequenceComparator extends com.siliconage.util.NullSafeComparator<Room> {
		private static final SequenceComparator ourInstance = new SequenceComparator();
		public static final SequenceComparator getInstance() { return ourInstance; }

		private SequenceComparator() { super(); }

		@Override
		public int compareInternal(Room argFirst, Room argSecond) {
			return argFirst.getSequenceAsObject().compareTo(argSecond.getSequenceAsObject());
		}
	}

	/** This is a Filter that will pass Room objects if their GameRoom value is <code>true</code>. */

	public static class GameRoomFilter extends com.siliconage.util.Filter<Room> {
		private static final GameRoomFilter ourInstance = new GameRoomFilter();
		public static final GameRoomFilter getInstance() { return ourInstance; }

		private GameRoomFilter() { super(); }

		@Override
		public boolean accept(Room argObject) {
			if (argObject == null) {
				return false;
			} else {
				return Boolean.TRUE.equals(argObject.isGameRoomAsObject());
			}
		}
	}

}
