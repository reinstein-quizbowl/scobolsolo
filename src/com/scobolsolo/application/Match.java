package com.scobolsolo.application;

import com.opal.*;

/**
 * represents a <code>Match</code> from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from the database table <code>match</code>.  Do not modify this class directly; instead, alter the database table on which it is based and/or the Opal configuration file for the project and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various <code>forXXX</code> methods on the {@link MatchFactory} factory class.  To create new instances, use the <code>create()</code> method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link TransactionContext}.</p>
 *
 * <p>This interface and the {@link MatchFactory} class (the ones in the <code>com.scobolsolo.application</code> package) are the only two automatically generated files for the table that are intended to be referenced in user code. Other automatically generated files (namely those in the <code>com.scobolsolo.persistence</code> package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
public interface Match extends IdentityUserFacing {
	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the Id
	 *
	 * <p>The Id field is a direct mapping of the <code>id</code> database column in the table <code>match</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getId() method.</p>
	 *
	 * @return an object value of Id (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Integer getIdAsObject();
	/**
	 * primitive accessor for the Id
	 *
	 * <p>The Id field is a direct mapping of the <code>id</code> database column in the table <code>match</code>.</p>
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
	 * object accessor for the RoundId
	 *
	 * <p>The RoundId field is a direct mapping of the <code>round_id</code> database column in the table <code>match</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getRoundId() method.</p>
	 *
	 * @return an object value of RoundId (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Integer getRoundIdAsObject();
	/**
	 * primitive accessor for the RoundId
	 *
	 * <p>The RoundId field is a direct mapping of the <code>round_id</code> database column in the table <code>match</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getRoundIdAsObject() method.</p>
	 *
	 * @return the primitive value of RoundId (of the current {@link TransactionContext})
	 */
	default public int getRoundId() {
		java.lang.Integer lclO = getRoundIdAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the RoundId to the value of <code>argRoundId</code>
	 *
	 * @param argRoundId the new value of RoundId.  May not be <code>null</code>.
	 * <p>The database column <code>round_id</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argRoundId is null
	 */
	@com.opal.annotation.NotNull
	public void setRoundId(java.lang.Integer argRoundId);

	/**
	 * sets the RoundId to the value of <code>argRoundId</code>
	 *
	 * @param argRoundId the new value of RoundId
	 */
	public void setRoundId(int argRoundId);

	/**
	 * object accessor for the RoomId
	 *
	 * <p>The RoomId field is a direct mapping of the <code>room_id</code> database column in the table <code>match</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getRoomId() method.</p>
	 *
	 * @return an object value of RoomId (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Integer getRoomIdAsObject();
	/**
	 * primitive accessor for the RoomId
	 *
	 * <p>The RoomId field is a direct mapping of the <code>room_id</code> database column in the table <code>match</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getRoomIdAsObject() method.</p>
	 *
	 * @return the primitive value of RoomId (of the current {@link TransactionContext})
	 */
	default public int getRoomId() {
		java.lang.Integer lclO = getRoomIdAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the RoomId to the value of <code>argRoomId</code>
	 *
	 * @param argRoomId the new value of RoomId.  May not be <code>null</code>.
	 * <p>The database column <code>room_id</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argRoomId is null
	 */
	@com.opal.annotation.NotNull
	public void setRoomId(java.lang.Integer argRoomId);

	/**
	 * sets the RoomId to the value of <code>argRoomId</code>
	 *
	 * @param argRoomId the new value of RoomId
	 */
	public void setRoomId(int argRoomId);

	/**
	 * object accessor for the WinningCardId
	 *
	 * <p>The WinningCardId field is a direct mapping of the <code>winning_card_id</code> database column in the table <code>match</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getWinningCardId() method.</p>
	 *
	 * @return an object value of WinningCardId (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.Integer getWinningCardIdAsObject();
	/**
	 * object accessor for the WinningCardId with substitution for a null value
	 *
	 * <p>The WinningCardId field is a direct mapping of the <code>winning_card_id</code> database column in the table <code>match</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the WinningCardId is <code>null</code>.
	 * @return an object value of WinningCardId (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getWinningCardIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getWinningCardIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the WinningCardId
	 *
	 * <p>The WinningCardId field is a direct mapping of the <code>winning_card_id</code> database column in the table <code>match</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getWinningCardIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a <code>NULL</code> value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of WinningCardId (of the current {@link TransactionContext})
	 * @throws NullValueException when the internal value is null
	 */
	default public int getWinningCardId() throws com.opal.NullValueException {
		java.lang.Integer lclO = getWinningCardIdAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getWinningCardId(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getWinningCardIdAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getWinningCardId(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getWinningCardIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * sets the WinningCardId to the value of <code>argWinningCardId</code>
	 *
	 * @param argWinningCardId the new value of WinningCardId.  May be <code>null</code>.
	 */
	public void setWinningCardId(java.lang.Integer argWinningCardId);

	/**
	 * sets the WinningCardId to the value of <code>argWinningCardId</code>
	 *
	 * @param argWinningCardId the new value of WinningCardId
	 */
	public void setWinningCardId(int argWinningCardId);

	/**
	 * object accessor for the LosingCardId
	 *
	 * <p>The LosingCardId field is a direct mapping of the <code>losing_card_id</code> database column in the table <code>match</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getLosingCardId() method.</p>
	 *
	 * @return an object value of LosingCardId (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.Integer getLosingCardIdAsObject();
	/**
	 * object accessor for the LosingCardId with substitution for a null value
	 *
	 * <p>The LosingCardId field is a direct mapping of the <code>losing_card_id</code> database column in the table <code>match</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the LosingCardId is <code>null</code>.
	 * @return an object value of LosingCardId (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getLosingCardIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getLosingCardIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the LosingCardId
	 *
	 * <p>The LosingCardId field is a direct mapping of the <code>losing_card_id</code> database column in the table <code>match</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getLosingCardIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a <code>NULL</code> value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of LosingCardId (of the current {@link TransactionContext})
	 * @throws NullValueException when the internal value is null
	 */
	default public int getLosingCardId() throws com.opal.NullValueException {
		java.lang.Integer lclO = getLosingCardIdAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getLosingCardId(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getLosingCardIdAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getLosingCardId(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getLosingCardIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * sets the LosingCardId to the value of <code>argLosingCardId</code>
	 *
	 * @param argLosingCardId the new value of LosingCardId.  May be <code>null</code>.
	 */
	public void setLosingCardId(java.lang.Integer argLosingCardId);

	/**
	 * sets the LosingCardId to the value of <code>argLosingCardId</code>
	 *
	 * @param argLosingCardId the new value of LosingCardId
	 */
	public void setLosingCardId(int argLosingCardId);

	/**
	 * @return the <code>Card</code>
	 * The returned <code>Card</code> is the {@link UserFacing} object corresponding to the row in the <code>card</code> that is referenced by the foreign key <code>match_losing_card_id_fkey</code>.
	 *
	 */
	public Card getLosingCard();
	public void setLosingCard(Card argCard);

	/**
	 * @return the <code>Room</code>
	 * The returned <code>Room</code> is the {@link UserFacing} object corresponding to the row in the <code>room</code> that is referenced by the foreign key <code>match_room_id_fkey</code>.
	 *
	 */
	public Room getRoom();
	public void setRoom(Room argRoom);

	/**
	 * @return the <code>Round</code>
	 * The returned <code>Round</code> is the {@link UserFacing} object corresponding to the row in the <code>round</code> that is referenced by the foreign key <code>match_round_id_fkey</code>.
	 *
	 */
	public Round getRound();
	public void setRound(Round argRound);

	/**
	 * @return the <code>Card</code>
	 * The returned <code>Card</code> is the {@link UserFacing} object corresponding to the row in the <code>card</code> that is referenced by the foreign key <code>match_winning_card_id_fkey</code>.
	 *
	 */
	public Card getWinningCard();
	public void setWinningCard(Card argCard);

	public Game getGame();
	public void setGame(Game argGame);

	public Match copy();

	default public com.scobolsolo.application.Staff determineLikelyModerator() {
		return com.scobolsolo.application.MatchDelegate.determineLikelyModerator(this);
	}

	default public com.scobolsolo.matches.MatchStatus determineStatus() {
		return com.scobolsolo.application.MatchDelegate.determineStatus(this);
	}

	default public boolean isDual() {
		return com.scobolsolo.application.MatchDelegate.isDual(this);
	}

	/** This is a Comparator that can be used to compare Match objects based on their Id values. */

	public static class IdComparator extends com.siliconage.util.NullSafeComparator<Match> {
		private static final IdComparator ourInstance = new IdComparator();
		public static final IdComparator getInstance() { return ourInstance; }

		private IdComparator() { super(); }

		@Override
		public int compareInternal(Match argFirst, Match argSecond) {
			return argFirst.getIdAsObject().compareTo(argSecond.getIdAsObject());
		}
	}

	public static class RoundComparator extends com.siliconage.util.NullSafeComparator<Match> {
		private static final RoundComparator ourInstance = new RoundComparator();
		public static final RoundComparator getInstance() { return ourInstance; }

		private RoundComparator() { super(); }

		@Override
		public int compareInternal(Match argFirst, Match argSecond) {
			return com.scobolsolo.application.Round.StandardComparator.getInstance().compare(argFirst.getRound(), argSecond.getRound());
		}
	}

}
