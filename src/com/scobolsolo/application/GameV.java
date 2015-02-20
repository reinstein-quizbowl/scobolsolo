package com.scobolsolo.application;

import com.opal.*;

/**
 * represents a <code>GameV</code> from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from the database table <code>game_v</code>.  Do not modify this class directly; instead, alter the database table on which it is based and/or the Opal configuration file for the project and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various <code>forXXX</code> methods on the {@link GameVFactory} factory class.  To create new instances, use the <code>create()</code> method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link TransactionContext}.</p>
 *
 * <p>This interface and the {@link GameVFactory} class (the ones in the <code>com.scobolsolo.application</code> package) are the only two automatically generated files for the table that are intended to be referenced in user code. Other automatically generated files (namely those in the <code>com.scobolsolo.persistence</code> package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
public interface GameV extends UserFacing {
	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the TournamentCode
	 *
	 * <p>The TournamentCode field is a direct mapping of the <code>tournament_code</code> database column in the table <code>game_v</code>.</p>
	 *
	 * @return an object value of TournamentCode (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.String getTournamentCode();
	/**
	 * object accessor for the GameId
	 *
	 * <p>The GameId field is a direct mapping of the <code>game_id</code> database column in the table <code>game_v</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getGameId() method.</p>
	 *
	 * @return an object value of GameId (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.Integer getGameIdAsObject();
	/**
	 * object accessor for the GameId with substitution for a null value
	 *
	 * <p>The GameId field is a direct mapping of the <code>game_id</code> database column in the table <code>game_v</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the GameId is <code>null</code>.
	 * @return an object value of GameId (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getGameIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getGameIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the GameId
	 *
	 * <p>The GameId field is a direct mapping of the <code>game_id</code> database column in the table <code>game_v</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getGameIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a <code>NULL</code> value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of GameId (of the current {@link TransactionContext})
	 * @throws NullValueException when the internal value is null
	 */
	default public int getGameId() throws com.opal.NullValueException {
		java.lang.Integer lclO = getGameIdAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getGameId(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getGameIdAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getGameId(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getGameIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * object accessor for the RoundId
	 *
	 * <p>The RoundId field is a direct mapping of the <code>round_id</code> database column in the table <code>game_v</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getRoundId() method.</p>
	 *
	 * @return an object value of RoundId (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.Integer getRoundIdAsObject();
	/**
	 * object accessor for the RoundId with substitution for a null value
	 *
	 * <p>The RoundId field is a direct mapping of the <code>round_id</code> database column in the table <code>game_v</code>.</p>
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
	 * <p>The RoundId field is a direct mapping of the <code>round_id</code> database column in the table <code>game_v</code>.</p>
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
	 * object accessor for the RoomId
	 *
	 * <p>The RoomId field is a direct mapping of the <code>room_id</code> database column in the table <code>game_v</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getRoomId() method.</p>
	 *
	 * @return an object value of RoomId (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.Integer getRoomIdAsObject();
	/**
	 * object accessor for the RoomId with substitution for a null value
	 *
	 * <p>The RoomId field is a direct mapping of the <code>room_id</code> database column in the table <code>game_v</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the RoomId is <code>null</code>.
	 * @return an object value of RoomId (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getRoomIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getRoomIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the RoomId
	 *
	 * <p>The RoomId field is a direct mapping of the <code>room_id</code> database column in the table <code>game_v</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getRoomIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a <code>NULL</code> value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of RoomId (of the current {@link TransactionContext})
	 * @throws NullValueException when the internal value is null
	 */
	default public int getRoomId() throws com.opal.NullValueException {
		java.lang.Integer lclO = getRoomIdAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getRoomId(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getRoomIdAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getRoomId(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getRoomIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * object accessor for the WinningCardId
	 *
	 * <p>The WinningCardId field is a direct mapping of the <code>winning_card_id</code> database column in the table <code>game_v</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getWinningCardId() method.</p>
	 *
	 * @return an object value of WinningCardId (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.Integer getWinningCardIdAsObject();
	/**
	 * object accessor for the WinningCardId with substitution for a null value
	 *
	 * <p>The WinningCardId field is a direct mapping of the <code>winning_card_id</code> database column in the table <code>game_v</code>.</p>
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
	 * <p>The WinningCardId field is a direct mapping of the <code>winning_card_id</code> database column in the table <code>game_v</code>.</p>
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
	 * object accessor for the LosingCardId
	 *
	 * <p>The LosingCardId field is a direct mapping of the <code>losing_card_id</code> database column in the table <code>game_v</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getLosingCardId() method.</p>
	 *
	 * @return an object value of LosingCardId (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.Integer getLosingCardIdAsObject();
	/**
	 * object accessor for the LosingCardId with substitution for a null value
	 *
	 * <p>The LosingCardId field is a direct mapping of the <code>losing_card_id</code> database column in the table <code>game_v</code>.</p>
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
	 * <p>The LosingCardId field is a direct mapping of the <code>losing_card_id</code> database column in the table <code>game_v</code>.</p>
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
	 * object accessor for the ModeratorStaffId
	 *
	 * <p>The ModeratorStaffId field is a direct mapping of the <code>moderator_staff_id</code> database column in the table <code>game_v</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getModeratorStaffId() method.</p>
	 *
	 * @return an object value of ModeratorStaffId (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.Integer getModeratorStaffIdAsObject();
	/**
	 * object accessor for the ModeratorStaffId with substitution for a null value
	 *
	 * <p>The ModeratorStaffId field is a direct mapping of the <code>moderator_staff_id</code> database column in the table <code>game_v</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the ModeratorStaffId is <code>null</code>.
	 * @return an object value of ModeratorStaffId (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getModeratorStaffIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getModeratorStaffIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the ModeratorStaffId
	 *
	 * <p>The ModeratorStaffId field is a direct mapping of the <code>moderator_staff_id</code> database column in the table <code>game_v</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getModeratorStaffIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a <code>NULL</code> value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of ModeratorStaffId (of the current {@link TransactionContext})
	 * @throws NullValueException when the internal value is null
	 */
	default public int getModeratorStaffId() throws com.opal.NullValueException {
		java.lang.Integer lclO = getModeratorStaffIdAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getModeratorStaffId(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getModeratorStaffIdAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getModeratorStaffId(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getModeratorStaffIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * object accessor for the TossupsHeard
	 *
	 * <p>The TossupsHeard field is a direct mapping of the <code>tossups_heard</code> database column in the table <code>game_v</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getTossupsHeard() method.</p>
	 *
	 * @return an object value of TossupsHeard (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.Integer getTossupsHeardAsObject();
	/**
	 * object accessor for the TossupsHeard with substitution for a null value
	 *
	 * <p>The TossupsHeard field is a direct mapping of the <code>tossups_heard</code> database column in the table <code>game_v</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the TossupsHeard is <code>null</code>.
	 * @return an object value of TossupsHeard (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getTossupsHeardAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getTossupsHeardAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the TossupsHeard
	 *
	 * <p>The TossupsHeard field is a direct mapping of the <code>tossups_heard</code> database column in the table <code>game_v</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getTossupsHeardAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a <code>NULL</code> value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of TossupsHeard (of the current {@link TransactionContext})
	 * @throws NullValueException when the internal value is null
	 */
	default public int getTossupsHeard() throws com.opal.NullValueException {
		java.lang.Integer lclO = getTossupsHeardAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getTossupsHeard(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getTossupsHeardAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getTossupsHeard(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getTossupsHeardAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * object accessor for the IncomingWinningCardPlayerId
	 *
	 * <p>The IncomingWinningCardPlayerId field is a direct mapping of the <code>incoming_winning_card_player_id</code> database column in the table <code>game_v</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getIncomingWinningCardPlayerId() method.</p>
	 *
	 * @return an object value of IncomingWinningCardPlayerId (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.Integer getIncomingWinningCardPlayerIdAsObject();
	/**
	 * object accessor for the IncomingWinningCardPlayerId with substitution for a null value
	 *
	 * <p>The IncomingWinningCardPlayerId field is a direct mapping of the <code>incoming_winning_card_player_id</code> database column in the table <code>game_v</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the IncomingWinningCardPlayerId is <code>null</code>.
	 * @return an object value of IncomingWinningCardPlayerId (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getIncomingWinningCardPlayerIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getIncomingWinningCardPlayerIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the IncomingWinningCardPlayerId
	 *
	 * <p>The IncomingWinningCardPlayerId field is a direct mapping of the <code>incoming_winning_card_player_id</code> database column in the table <code>game_v</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getIncomingWinningCardPlayerIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a <code>NULL</code> value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of IncomingWinningCardPlayerId (of the current {@link TransactionContext})
	 * @throws NullValueException when the internal value is null
	 */
	default public int getIncomingWinningCardPlayerId() throws com.opal.NullValueException {
		java.lang.Integer lclO = getIncomingWinningCardPlayerIdAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getIncomingWinningCardPlayerId(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getIncomingWinningCardPlayerIdAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getIncomingWinningCardPlayerId(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getIncomingWinningCardPlayerIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * object accessor for the IncomingLosingCardPlayerId
	 *
	 * <p>The IncomingLosingCardPlayerId field is a direct mapping of the <code>incoming_losing_card_player_id</code> database column in the table <code>game_v</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getIncomingLosingCardPlayerId() method.</p>
	 *
	 * @return an object value of IncomingLosingCardPlayerId (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.Integer getIncomingLosingCardPlayerIdAsObject();
	/**
	 * object accessor for the IncomingLosingCardPlayerId with substitution for a null value
	 *
	 * <p>The IncomingLosingCardPlayerId field is a direct mapping of the <code>incoming_losing_card_player_id</code> database column in the table <code>game_v</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the IncomingLosingCardPlayerId is <code>null</code>.
	 * @return an object value of IncomingLosingCardPlayerId (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getIncomingLosingCardPlayerIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getIncomingLosingCardPlayerIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the IncomingLosingCardPlayerId
	 *
	 * <p>The IncomingLosingCardPlayerId field is a direct mapping of the <code>incoming_losing_card_player_id</code> database column in the table <code>game_v</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getIncomingLosingCardPlayerIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a <code>NULL</code> value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of IncomingLosingCardPlayerId (of the current {@link TransactionContext})
	 * @throws NullValueException when the internal value is null
	 */
	default public int getIncomingLosingCardPlayerId() throws com.opal.NullValueException {
		java.lang.Integer lclO = getIncomingLosingCardPlayerIdAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getIncomingLosingCardPlayerId(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getIncomingLosingCardPlayerIdAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getIncomingLosingCardPlayerId(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getIncomingLosingCardPlayerIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * object accessor for the WinnerPlayerId
	 *
	 * <p>The WinnerPlayerId field is a direct mapping of the <code>winner_player_id</code> database column in the table <code>game_v</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getWinnerPlayerId() method.</p>
	 *
	 * @return an object value of WinnerPlayerId (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.Integer getWinnerPlayerIdAsObject();
	/**
	 * object accessor for the WinnerPlayerId with substitution for a null value
	 *
	 * <p>The WinnerPlayerId field is a direct mapping of the <code>winner_player_id</code> database column in the table <code>game_v</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the WinnerPlayerId is <code>null</code>.
	 * @return an object value of WinnerPlayerId (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getWinnerPlayerIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getWinnerPlayerIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the WinnerPlayerId
	 *
	 * <p>The WinnerPlayerId field is a direct mapping of the <code>winner_player_id</code> database column in the table <code>game_v</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getWinnerPlayerIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a <code>NULL</code> value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of WinnerPlayerId (of the current {@link TransactionContext})
	 * @throws NullValueException when the internal value is null
	 */
	default public int getWinnerPlayerId() throws com.opal.NullValueException {
		java.lang.Integer lclO = getWinnerPlayerIdAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getWinnerPlayerId(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getWinnerPlayerIdAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getWinnerPlayerId(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getWinnerPlayerIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * object accessor for the LoserPlayerId
	 *
	 * <p>The LoserPlayerId field is a direct mapping of the <code>loser_player_id</code> database column in the table <code>game_v</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getLoserPlayerId() method.</p>
	 *
	 * @return an object value of LoserPlayerId (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.Integer getLoserPlayerIdAsObject();
	/**
	 * object accessor for the LoserPlayerId with substitution for a null value
	 *
	 * <p>The LoserPlayerId field is a direct mapping of the <code>loser_player_id</code> database column in the table <code>game_v</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the LoserPlayerId is <code>null</code>.
	 * @return an object value of LoserPlayerId (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getLoserPlayerIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getLoserPlayerIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the LoserPlayerId
	 *
	 * <p>The LoserPlayerId field is a direct mapping of the <code>loser_player_id</code> database column in the table <code>game_v</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getLoserPlayerIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a <code>NULL</code> value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of LoserPlayerId (of the current {@link TransactionContext})
	 * @throws NullValueException when the internal value is null
	 */
	default public int getLoserPlayerId() throws com.opal.NullValueException {
		java.lang.Integer lclO = getLoserPlayerIdAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getLoserPlayerId(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getLoserPlayerIdAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getLoserPlayerId(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getLoserPlayerIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * object accessor for the WinnerPerformanceId
	 *
	 * <p>The WinnerPerformanceId field is a direct mapping of the <code>winner_performance_id</code> database column in the table <code>game_v</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getWinnerPerformanceId() method.</p>
	 *
	 * @return an object value of WinnerPerformanceId (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.Integer getWinnerPerformanceIdAsObject();
	/**
	 * object accessor for the WinnerPerformanceId with substitution for a null value
	 *
	 * <p>The WinnerPerformanceId field is a direct mapping of the <code>winner_performance_id</code> database column in the table <code>game_v</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the WinnerPerformanceId is <code>null</code>.
	 * @return an object value of WinnerPerformanceId (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getWinnerPerformanceIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getWinnerPerformanceIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the WinnerPerformanceId
	 *
	 * <p>The WinnerPerformanceId field is a direct mapping of the <code>winner_performance_id</code> database column in the table <code>game_v</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getWinnerPerformanceIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a <code>NULL</code> value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of WinnerPerformanceId (of the current {@link TransactionContext})
	 * @throws NullValueException when the internal value is null
	 */
	default public int getWinnerPerformanceId() throws com.opal.NullValueException {
		java.lang.Integer lclO = getWinnerPerformanceIdAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getWinnerPerformanceId(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getWinnerPerformanceIdAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getWinnerPerformanceId(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getWinnerPerformanceIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * object accessor for the LoserPerformanceId
	 *
	 * <p>The LoserPerformanceId field is a direct mapping of the <code>loser_performance_id</code> database column in the table <code>game_v</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getLoserPerformanceId() method.</p>
	 *
	 * @return an object value of LoserPerformanceId (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.Integer getLoserPerformanceIdAsObject();
	/**
	 * object accessor for the LoserPerformanceId with substitution for a null value
	 *
	 * <p>The LoserPerformanceId field is a direct mapping of the <code>loser_performance_id</code> database column in the table <code>game_v</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the LoserPerformanceId is <code>null</code>.
	 * @return an object value of LoserPerformanceId (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getLoserPerformanceIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getLoserPerformanceIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the LoserPerformanceId
	 *
	 * <p>The LoserPerformanceId field is a direct mapping of the <code>loser_performance_id</code> database column in the table <code>game_v</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getLoserPerformanceIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a <code>NULL</code> value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of LoserPerformanceId (of the current {@link TransactionContext})
	 * @throws NullValueException when the internal value is null
	 */
	default public int getLoserPerformanceId() throws com.opal.NullValueException {
		java.lang.Integer lclO = getLoserPerformanceIdAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getLoserPerformanceId(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getLoserPerformanceIdAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getLoserPerformanceId(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getLoserPerformanceIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * object accessor for the WinnerScore
	 *
	 * <p>The WinnerScore field is a direct mapping of the <code>winner_score</code> database column in the table <code>game_v</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getWinnerScore() method.</p>
	 *
	 * @return an object value of WinnerScore (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.Integer getWinnerScoreAsObject();
	/**
	 * object accessor for the WinnerScore with substitution for a null value
	 *
	 * <p>The WinnerScore field is a direct mapping of the <code>winner_score</code> database column in the table <code>game_v</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the WinnerScore is <code>null</code>.
	 * @return an object value of WinnerScore (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getWinnerScoreAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getWinnerScoreAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the WinnerScore
	 *
	 * <p>The WinnerScore field is a direct mapping of the <code>winner_score</code> database column in the table <code>game_v</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getWinnerScoreAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a <code>NULL</code> value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of WinnerScore (of the current {@link TransactionContext})
	 * @throws NullValueException when the internal value is null
	 */
	default public int getWinnerScore() throws com.opal.NullValueException {
		java.lang.Integer lclO = getWinnerScoreAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getWinnerScore(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getWinnerScoreAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getWinnerScore(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getWinnerScoreAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * object accessor for the LoserScore
	 *
	 * <p>The LoserScore field is a direct mapping of the <code>loser_score</code> database column in the table <code>game_v</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getLoserScore() method.</p>
	 *
	 * @return an object value of LoserScore (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.Integer getLoserScoreAsObject();
	/**
	 * object accessor for the LoserScore with substitution for a null value
	 *
	 * <p>The LoserScore field is a direct mapping of the <code>loser_score</code> database column in the table <code>game_v</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the LoserScore is <code>null</code>.
	 * @return an object value of LoserScore (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getLoserScoreAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getLoserScoreAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the LoserScore
	 *
	 * <p>The LoserScore field is a direct mapping of the <code>loser_score</code> database column in the table <code>game_v</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getLoserScoreAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a <code>NULL</code> value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of LoserScore (of the current {@link TransactionContext})
	 * @throws NullValueException when the internal value is null
	 */
	default public int getLoserScore() throws com.opal.NullValueException {
		java.lang.Integer lclO = getLoserScoreAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getLoserScore(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getLoserScoreAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getLoserScore(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getLoserScoreAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * @return the <code>Game</code>
	 * The returned <code>Game</code> is the {@link UserFacing} object corresponding to the row in the <code>game</code> that is referenced by the foreign key <code>UNNAMED_INFERRED_KEY</code>.
	 *
	 */
	public Game getGame();
	/**
	 * @return the <code>Tournament</code>
	 * The returned <code>Tournament</code> is the {@link UserFacing} object corresponding to the row in the <code>tournament</code> that is referenced by the foreign key <code>UNNAMED_INFERRED_KEY</code>.
	 *
	 */
	public Tournament getTournament();
	/**
	 * @return the <code>Player</code>
	 * The returned <code>Player</code> is the {@link UserFacing} object corresponding to the row in the <code>player</code> that is referenced by the foreign key <code>UNNAMED_INFERRED_KEY</code>.
	 *
	 */
	public Player getIncomingWinningCardPlayer();
	/**
	 * @return the <code>Player</code>
	 * The returned <code>Player</code> is the {@link UserFacing} object corresponding to the row in the <code>player</code> that is referenced by the foreign key <code>UNNAMED_INFERRED_KEY</code>.
	 *
	 */
	public Player getIncomingLosingCardPlayer();
	/**
	 * @return the <code>Player</code>
	 * The returned <code>Player</code> is the {@link UserFacing} object corresponding to the row in the <code>player</code> that is referenced by the foreign key <code>UNNAMED_INFERRED_KEY</code>.
	 *
	 */
	public Player getWinnerPlayer();
	/**
	 * @return the <code>Player</code>
	 * The returned <code>Player</code> is the {@link UserFacing} object corresponding to the row in the <code>player</code> that is referenced by the foreign key <code>UNNAMED_INFERRED_KEY</code>.
	 *
	 */
	public Player getLoserPlayer();
	/**
	 * @return the <code>Staff</code>
	 * The returned <code>Staff</code> is the {@link UserFacing} object corresponding to the row in the <code>staff</code> that is referenced by the foreign key <code>UNNAMED_INFERRED_KEY</code>.
	 *
	 */
	public Staff getModeratorStaff();
	/**
	 * @return the <code>Room</code>
	 * The returned <code>Room</code> is the {@link UserFacing} object corresponding to the row in the <code>room</code> that is referenced by the foreign key <code>UNNAMED_INFERRED_KEY</code>.
	 *
	 */
	public Room getRoom();
	/**
	 * @return the <code>Performance</code>
	 * The returned <code>Performance</code> is the {@link UserFacing} object corresponding to the row in the <code>performance</code> that is referenced by the foreign key <code>UNNAMED_INFERRED_KEY</code>.
	 *
	 */
	public Performance getWinnerPerformance();
	/**
	 * @return the <code>Performance</code>
	 * The returned <code>Performance</code> is the {@link UserFacing} object corresponding to the row in the <code>performance</code> that is referenced by the foreign key <code>UNNAMED_INFERRED_KEY</code>.
	 *
	 */
	public Performance getLoserPerformance();
	/**
	 * @return the <code>Round</code>
	 * The returned <code>Round</code> is the {@link UserFacing} object corresponding to the row in the <code>round</code> that is referenced by the foreign key <code>UNNAMED_INFERRED_KEY</code>.
	 *
	 */
	public Round getRound();
	/**
	 * @return the <code>Card</code>
	 * The returned <code>Card</code> is the {@link UserFacing} object corresponding to the row in the <code>card</code> that is referenced by the foreign key <code>UNNAMED_INFERRED_KEY</code>.
	 *
	 */
	public Card getWinningCard();
	/**
	 * @return the <code>Card</code>
	 * The returned <code>Card</code> is the {@link UserFacing} object corresponding to the row in the <code>card</code> that is referenced by the foreign key <code>UNNAMED_INFERRED_KEY</code>.
	 *
	 */
	public Card getLosingCard();
	public static class RoundComparator extends com.siliconage.util.NullSafeComparator<GameV> {
		private static final RoundComparator ourInstance = new RoundComparator();
		public static final RoundComparator getInstance() { return ourInstance; }

		private RoundComparator() { super(); }

		@Override
		public int compareInternal(GameV argFirst, GameV argSecond) {
			return com.scobolsolo.application.Round.StandardComparator.getInstance().compare(argFirst.getRound(), argSecond.getRound());
		}
	}

}
