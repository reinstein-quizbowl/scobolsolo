package com.scobolsolo.persistence;


/**
 * represents a {@code GameV} from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from {@code game_v}.  Do not modify this class directly; instead, alter the permanent storage on which it is based, the Opal configuration file for the project, and/or the {@link com.scobolsolo.application.GameV}, and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various {@code forXXX} methods on the {@link com.scobolsolo.application.GameVFactory} factory class.  To create new instances, use the {@code create()} method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link com.opal.TransactionContext}.</p>
 *
 * <p>This interface is not meant to be referenced in user code.  Only the {@link com.scobolsolo.application.GameV} and the {@link com.scobolsolo.application.GameVFactory} class should be referenced directly.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
public interface GameVUserFacing extends com.opal.UserFacing {

	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the {@code TournamentCode}
	 *
	 * <p>The {@code TournamentCode} field is a direct mapping of the {@code tournament_code} field in {@code game_v}.</p>
	 *
	 * @return an object value of {@code TournamentCode} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	public java.lang.String getTournamentCode();

	/**
	 * object accessor for the {@code GameId}
	 *
	 * <p>The {@code GameId} field is a direct mapping of the {@code game_id} field in {@code game_v}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getGameId() method.</p>
	 *
	 * @return an object value of {@code GameId} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public java.lang.Integer getGameIdAsObject();

	/**
	 * object accessor for the {@code GameId} with substitution for a null value
	 *
	 * <p>The {@code GameId} field is a direct mapping of the {@code game_id} database column in the table {@code game_v}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code GameId} is {@code null}.
	 * @return an object value of {@code GameId} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getGameIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getGameIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code GameId}
	 *
	 * <p>The {@code GameId} field is a direct mapping of the {@code game_id} database column in the table {@code game_v}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getGameIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code GameId} (of the current {@link com.opal.TransactionContext})
	 * @throws com.opal.NullValueException when the internal value is null
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
	 * object accessor for the {@code RoundId}
	 *
	 * <p>The {@code RoundId} field is a direct mapping of the {@code round_id} field in {@code game_v}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getRoundId() method.</p>
	 *
	 * @return an object value of {@code RoundId} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public java.lang.Integer getRoundIdAsObject();

	/**
	 * object accessor for the {@code RoundId} with substitution for a null value
	 *
	 * <p>The {@code RoundId} field is a direct mapping of the {@code round_id} database column in the table {@code game_v}.</p>
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
	 * <p>The {@code RoundId} field is a direct mapping of the {@code round_id} database column in the table {@code game_v}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getRoundIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code RoundId} (of the current {@link com.opal.TransactionContext})
	 * @throws com.opal.NullValueException when the internal value is null
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
	 * object accessor for the {@code RoomId}
	 *
	 * <p>The {@code RoomId} field is a direct mapping of the {@code room_id} field in {@code game_v}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getRoomId() method.</p>
	 *
	 * @return an object value of {@code RoomId} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public java.lang.Integer getRoomIdAsObject();

	/**
	 * object accessor for the {@code RoomId} with substitution for a null value
	 *
	 * <p>The {@code RoomId} field is a direct mapping of the {@code room_id} database column in the table {@code game_v}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code RoomId} is {@code null}.
	 * @return an object value of {@code RoomId} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getRoomIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getRoomIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code RoomId}
	 *
	 * <p>The {@code RoomId} field is a direct mapping of the {@code room_id} database column in the table {@code game_v}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getRoomIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code RoomId} (of the current {@link com.opal.TransactionContext})
	 * @throws com.opal.NullValueException when the internal value is null
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
	 * object accessor for the {@code WinningCardId}
	 *
	 * <p>The {@code WinningCardId} field is a direct mapping of the {@code winning_card_id} field in {@code game_v}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getWinningCardId() method.</p>
	 *
	 * @return an object value of {@code WinningCardId} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public java.lang.Integer getWinningCardIdAsObject();

	/**
	 * object accessor for the {@code WinningCardId} with substitution for a null value
	 *
	 * <p>The {@code WinningCardId} field is a direct mapping of the {@code winning_card_id} database column in the table {@code game_v}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code WinningCardId} is {@code null}.
	 * @return an object value of {@code WinningCardId} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getWinningCardIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getWinningCardIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code WinningCardId}
	 *
	 * <p>The {@code WinningCardId} field is a direct mapping of the {@code winning_card_id} database column in the table {@code game_v}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getWinningCardIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code WinningCardId} (of the current {@link com.opal.TransactionContext})
	 * @throws com.opal.NullValueException when the internal value is null
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
	 * object accessor for the {@code LosingCardId}
	 *
	 * <p>The {@code LosingCardId} field is a direct mapping of the {@code losing_card_id} field in {@code game_v}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getLosingCardId() method.</p>
	 *
	 * @return an object value of {@code LosingCardId} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public java.lang.Integer getLosingCardIdAsObject();

	/**
	 * object accessor for the {@code LosingCardId} with substitution for a null value
	 *
	 * <p>The {@code LosingCardId} field is a direct mapping of the {@code losing_card_id} database column in the table {@code game_v}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code LosingCardId} is {@code null}.
	 * @return an object value of {@code LosingCardId} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getLosingCardIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getLosingCardIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code LosingCardId}
	 *
	 * <p>The {@code LosingCardId} field is a direct mapping of the {@code losing_card_id} database column in the table {@code game_v}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getLosingCardIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code LosingCardId} (of the current {@link com.opal.TransactionContext})
	 * @throws com.opal.NullValueException when the internal value is null
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
	 * object accessor for the {@code ModeratorStaffId}
	 *
	 * <p>The {@code ModeratorStaffId} field is a direct mapping of the {@code moderator_staff_id} field in {@code game_v}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getModeratorStaffId() method.</p>
	 *
	 * @return an object value of {@code ModeratorStaffId} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public java.lang.Integer getModeratorStaffIdAsObject();

	/**
	 * object accessor for the {@code ModeratorStaffId} with substitution for a null value
	 *
	 * <p>The {@code ModeratorStaffId} field is a direct mapping of the {@code moderator_staff_id} database column in the table {@code game_v}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code ModeratorStaffId} is {@code null}.
	 * @return an object value of {@code ModeratorStaffId} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getModeratorStaffIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getModeratorStaffIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code ModeratorStaffId}
	 *
	 * <p>The {@code ModeratorStaffId} field is a direct mapping of the {@code moderator_staff_id} database column in the table {@code game_v}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getModeratorStaffIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code ModeratorStaffId} (of the current {@link com.opal.TransactionContext})
	 * @throws com.opal.NullValueException when the internal value is null
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
	 * object accessor for the {@code ScorekeeperStaffId}
	 *
	 * <p>The {@code ScorekeeperStaffId} field is a direct mapping of the {@code scorekeeper_staff_id} field in {@code game_v}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getScorekeeperStaffId() method.</p>
	 *
	 * @return an object value of {@code ScorekeeperStaffId} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public java.lang.Integer getScorekeeperStaffIdAsObject();

	/**
	 * object accessor for the {@code ScorekeeperStaffId} with substitution for a null value
	 *
	 * <p>The {@code ScorekeeperStaffId} field is a direct mapping of the {@code scorekeeper_staff_id} database column in the table {@code game_v}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code ScorekeeperStaffId} is {@code null}.
	 * @return an object value of {@code ScorekeeperStaffId} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getScorekeeperStaffIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getScorekeeperStaffIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code ScorekeeperStaffId}
	 *
	 * <p>The {@code ScorekeeperStaffId} field is a direct mapping of the {@code scorekeeper_staff_id} database column in the table {@code game_v}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getScorekeeperStaffIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code ScorekeeperStaffId} (of the current {@link com.opal.TransactionContext})
	 * @throws com.opal.NullValueException when the internal value is null
	 */
	default public int getScorekeeperStaffId() throws com.opal.NullValueException {
		java.lang.Integer lclO = getScorekeeperStaffIdAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getScorekeeperStaffId(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getScorekeeperStaffIdAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getScorekeeperStaffId(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getScorekeeperStaffIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * object accessor for the {@code TossupsHeard}
	 *
	 * <p>The {@code TossupsHeard} field is a direct mapping of the {@code tossups_heard} field in {@code game_v}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getTossupsHeard() method.</p>
	 *
	 * @return an object value of {@code TossupsHeard} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public java.lang.Integer getTossupsHeardAsObject();

	/**
	 * object accessor for the {@code TossupsHeard} with substitution for a null value
	 *
	 * <p>The {@code TossupsHeard} field is a direct mapping of the {@code tossups_heard} database column in the table {@code game_v}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code TossupsHeard} is {@code null}.
	 * @return an object value of {@code TossupsHeard} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getTossupsHeardAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getTossupsHeardAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code TossupsHeard}
	 *
	 * <p>The {@code TossupsHeard} field is a direct mapping of the {@code tossups_heard} database column in the table {@code game_v}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getTossupsHeardAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code TossupsHeard} (of the current {@link com.opal.TransactionContext})
	 * @throws com.opal.NullValueException when the internal value is null
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
	 * object accessor for the {@code IncomingWinningCardPlayerId}
	 *
	 * <p>The {@code IncomingWinningCardPlayerId} field is a direct mapping of the {@code incoming_winning_card_player_id} field in {@code game_v}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getIncomingWinningCardPlayerId() method.</p>
	 *
	 * @return an object value of {@code IncomingWinningCardPlayerId} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public java.lang.Integer getIncomingWinningCardPlayerIdAsObject();

	/**
	 * object accessor for the {@code IncomingWinningCardPlayerId} with substitution for a null value
	 *
	 * <p>The {@code IncomingWinningCardPlayerId} field is a direct mapping of the {@code incoming_winning_card_player_id} database column in the table {@code game_v}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code IncomingWinningCardPlayerId} is {@code null}.
	 * @return an object value of {@code IncomingWinningCardPlayerId} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getIncomingWinningCardPlayerIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getIncomingWinningCardPlayerIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code IncomingWinningCardPlayerId}
	 *
	 * <p>The {@code IncomingWinningCardPlayerId} field is a direct mapping of the {@code incoming_winning_card_player_id} database column in the table {@code game_v}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getIncomingWinningCardPlayerIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code IncomingWinningCardPlayerId} (of the current {@link com.opal.TransactionContext})
	 * @throws com.opal.NullValueException when the internal value is null
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
	 * object accessor for the {@code IncomingLosingCardPlayerId}
	 *
	 * <p>The {@code IncomingLosingCardPlayerId} field is a direct mapping of the {@code incoming_losing_card_player_id} field in {@code game_v}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getIncomingLosingCardPlayerId() method.</p>
	 *
	 * @return an object value of {@code IncomingLosingCardPlayerId} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public java.lang.Integer getIncomingLosingCardPlayerIdAsObject();

	/**
	 * object accessor for the {@code IncomingLosingCardPlayerId} with substitution for a null value
	 *
	 * <p>The {@code IncomingLosingCardPlayerId} field is a direct mapping of the {@code incoming_losing_card_player_id} database column in the table {@code game_v}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code IncomingLosingCardPlayerId} is {@code null}.
	 * @return an object value of {@code IncomingLosingCardPlayerId} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getIncomingLosingCardPlayerIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getIncomingLosingCardPlayerIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code IncomingLosingCardPlayerId}
	 *
	 * <p>The {@code IncomingLosingCardPlayerId} field is a direct mapping of the {@code incoming_losing_card_player_id} database column in the table {@code game_v}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getIncomingLosingCardPlayerIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code IncomingLosingCardPlayerId} (of the current {@link com.opal.TransactionContext})
	 * @throws com.opal.NullValueException when the internal value is null
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
	 * object accessor for the {@code WinnerPlayerId}
	 *
	 * <p>The {@code WinnerPlayerId} field is a direct mapping of the {@code winner_player_id} field in {@code game_v}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getWinnerPlayerId() method.</p>
	 *
	 * @return an object value of {@code WinnerPlayerId} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public java.lang.Integer getWinnerPlayerIdAsObject();

	/**
	 * object accessor for the {@code WinnerPlayerId} with substitution for a null value
	 *
	 * <p>The {@code WinnerPlayerId} field is a direct mapping of the {@code winner_player_id} database column in the table {@code game_v}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code WinnerPlayerId} is {@code null}.
	 * @return an object value of {@code WinnerPlayerId} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getWinnerPlayerIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getWinnerPlayerIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code WinnerPlayerId}
	 *
	 * <p>The {@code WinnerPlayerId} field is a direct mapping of the {@code winner_player_id} database column in the table {@code game_v}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getWinnerPlayerIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code WinnerPlayerId} (of the current {@link com.opal.TransactionContext})
	 * @throws com.opal.NullValueException when the internal value is null
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
	 * object accessor for the {@code LoserPlayerId}
	 *
	 * <p>The {@code LoserPlayerId} field is a direct mapping of the {@code loser_player_id} field in {@code game_v}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getLoserPlayerId() method.</p>
	 *
	 * @return an object value of {@code LoserPlayerId} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public java.lang.Integer getLoserPlayerIdAsObject();

	/**
	 * object accessor for the {@code LoserPlayerId} with substitution for a null value
	 *
	 * <p>The {@code LoserPlayerId} field is a direct mapping of the {@code loser_player_id} database column in the table {@code game_v}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code LoserPlayerId} is {@code null}.
	 * @return an object value of {@code LoserPlayerId} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getLoserPlayerIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getLoserPlayerIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code LoserPlayerId}
	 *
	 * <p>The {@code LoserPlayerId} field is a direct mapping of the {@code loser_player_id} database column in the table {@code game_v}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getLoserPlayerIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code LoserPlayerId} (of the current {@link com.opal.TransactionContext})
	 * @throws com.opal.NullValueException when the internal value is null
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
	 * object accessor for the {@code WinnerPerformanceId}
	 *
	 * <p>The {@code WinnerPerformanceId} field is a direct mapping of the {@code winner_performance_id} field in {@code game_v}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getWinnerPerformanceId() method.</p>
	 *
	 * @return an object value of {@code WinnerPerformanceId} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public java.lang.Integer getWinnerPerformanceIdAsObject();

	/**
	 * object accessor for the {@code WinnerPerformanceId} with substitution for a null value
	 *
	 * <p>The {@code WinnerPerformanceId} field is a direct mapping of the {@code winner_performance_id} database column in the table {@code game_v}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code WinnerPerformanceId} is {@code null}.
	 * @return an object value of {@code WinnerPerformanceId} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getWinnerPerformanceIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getWinnerPerformanceIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code WinnerPerformanceId}
	 *
	 * <p>The {@code WinnerPerformanceId} field is a direct mapping of the {@code winner_performance_id} database column in the table {@code game_v}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getWinnerPerformanceIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code WinnerPerformanceId} (of the current {@link com.opal.TransactionContext})
	 * @throws com.opal.NullValueException when the internal value is null
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
	 * object accessor for the {@code LoserPerformanceId}
	 *
	 * <p>The {@code LoserPerformanceId} field is a direct mapping of the {@code loser_performance_id} field in {@code game_v}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getLoserPerformanceId() method.</p>
	 *
	 * @return an object value of {@code LoserPerformanceId} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public java.lang.Integer getLoserPerformanceIdAsObject();

	/**
	 * object accessor for the {@code LoserPerformanceId} with substitution for a null value
	 *
	 * <p>The {@code LoserPerformanceId} field is a direct mapping of the {@code loser_performance_id} database column in the table {@code game_v}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code LoserPerformanceId} is {@code null}.
	 * @return an object value of {@code LoserPerformanceId} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getLoserPerformanceIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getLoserPerformanceIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code LoserPerformanceId}
	 *
	 * <p>The {@code LoserPerformanceId} field is a direct mapping of the {@code loser_performance_id} database column in the table {@code game_v}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getLoserPerformanceIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code LoserPerformanceId} (of the current {@link com.opal.TransactionContext})
	 * @throws com.opal.NullValueException when the internal value is null
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
	 * object accessor for the {@code WinnerScore}
	 *
	 * <p>The {@code WinnerScore} field is a direct mapping of the {@code winner_score} field in {@code game_v}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getWinnerScore() method.</p>
	 *
	 * @return an object value of {@code WinnerScore} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public java.lang.Integer getWinnerScoreAsObject();

	/**
	 * object accessor for the {@code WinnerScore} with substitution for a null value
	 *
	 * <p>The {@code WinnerScore} field is a direct mapping of the {@code winner_score} database column in the table {@code game_v}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code WinnerScore} is {@code null}.
	 * @return an object value of {@code WinnerScore} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getWinnerScoreAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getWinnerScoreAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code WinnerScore}
	 *
	 * <p>The {@code WinnerScore} field is a direct mapping of the {@code winner_score} database column in the table {@code game_v}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getWinnerScoreAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code WinnerScore} (of the current {@link com.opal.TransactionContext})
	 * @throws com.opal.NullValueException when the internal value is null
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
	 * object accessor for the {@code LoserScore}
	 *
	 * <p>The {@code LoserScore} field is a direct mapping of the {@code loser_score} field in {@code game_v}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getLoserScore() method.</p>
	 *
	 * @return an object value of {@code LoserScore} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public java.lang.Integer getLoserScoreAsObject();

	/**
	 * object accessor for the {@code LoserScore} with substitution for a null value
	 *
	 * <p>The {@code LoserScore} field is a direct mapping of the {@code loser_score} database column in the table {@code game_v}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code LoserScore} is {@code null}.
	 * @return an object value of {@code LoserScore} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getLoserScoreAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getLoserScoreAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code LoserScore}
	 *
	 * <p>The {@code LoserScore} field is a direct mapping of the {@code loser_score} database column in the table {@code game_v}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getLoserScoreAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code LoserScore} (of the current {@link com.opal.TransactionContext})
	 * @throws com.opal.NullValueException when the internal value is null
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
	 * @return the {@code com.scobolsolo.application.Game}
	 * The returned {@code com.scobolsolo.application.Game} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code game} that is referenced by {@code UNNAMED_INFERRED_KEY}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public com.scobolsolo.application.Game getGame();
	/**
	 * @return the {@code com.scobolsolo.application.Tournament}
	 * The returned {@code com.scobolsolo.application.Tournament} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code tournament} that is referenced by {@code UNNAMED_INFERRED_KEY}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = false)
	public com.scobolsolo.application.Tournament getTournament();
	/**
	 * @return the {@code com.scobolsolo.application.Player}
	 * The returned {@code com.scobolsolo.application.Player} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code player} that is referenced by {@code UNNAMED_INFERRED_KEY}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public com.scobolsolo.application.Player getIncomingWinningCardPlayer();
	/**
	 * @return the {@code com.scobolsolo.application.Player}
	 * The returned {@code com.scobolsolo.application.Player} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code player} that is referenced by {@code UNNAMED_INFERRED_KEY}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public com.scobolsolo.application.Player getIncomingLosingCardPlayer();
	/**
	 * @return the {@code com.scobolsolo.application.Player}
	 * The returned {@code com.scobolsolo.application.Player} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code player} that is referenced by {@code UNNAMED_INFERRED_KEY}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public com.scobolsolo.application.Player getWinnerPlayer();
	/**
	 * @return the {@code com.scobolsolo.application.Player}
	 * The returned {@code com.scobolsolo.application.Player} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code player} that is referenced by {@code UNNAMED_INFERRED_KEY}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public com.scobolsolo.application.Player getLoserPlayer();
	/**
	 * @return the {@code com.scobolsolo.application.Staff}
	 * The returned {@code com.scobolsolo.application.Staff} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code staff} that is referenced by {@code UNNAMED_INFERRED_KEY}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public com.scobolsolo.application.Staff getModeratorStaff();
	/**
	 * @return the {@code com.scobolsolo.application.Staff}
	 * The returned {@code com.scobolsolo.application.Staff} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code staff} that is referenced by {@code UNNAMED_INFERRED_KEY}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public com.scobolsolo.application.Staff getScorekeeperStaff();
	/**
	 * @return the {@code com.scobolsolo.application.Room}
	 * The returned {@code com.scobolsolo.application.Room} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code room} that is referenced by {@code UNNAMED_INFERRED_KEY}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public com.scobolsolo.application.Room getRoom();
	/**
	 * @return the {@code com.scobolsolo.application.Performance}
	 * The returned {@code com.scobolsolo.application.Performance} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code performance} that is referenced by {@code UNNAMED_INFERRED_KEY}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public com.scobolsolo.application.Performance getWinnerPerformance();
	/**
	 * @return the {@code com.scobolsolo.application.Performance}
	 * The returned {@code com.scobolsolo.application.Performance} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code performance} that is referenced by {@code UNNAMED_INFERRED_KEY}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public com.scobolsolo.application.Performance getLoserPerformance();
	/**
	 * @return the {@code com.scobolsolo.application.Round}
	 * The returned {@code com.scobolsolo.application.Round} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code round} that is referenced by {@code UNNAMED_INFERRED_KEY}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public com.scobolsolo.application.Round getRound();
	/**
	 * @return the {@code com.scobolsolo.application.Card}
	 * The returned {@code com.scobolsolo.application.Card} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code card} that is referenced by {@code UNNAMED_INFERRED_KEY}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public com.scobolsolo.application.Card getWinningCard();
	/**
	 * @return the {@code com.scobolsolo.application.Card}
	 * The returned {@code com.scobolsolo.application.Card} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code card} that is referenced by {@code UNNAMED_INFERRED_KEY}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public com.scobolsolo.application.Card getLosingCard();
}
