package com.scobolsolo.persistence;


/**
 * represents a {@code Match} from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from {@code match}.  Do not modify this class directly; instead, alter the permanent storage on which it is based, the Opal configuration file for the project, and/or the {@link com.scobolsolo.application.Match}, and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various {@code forXXX} methods on the {@link com.scobolsolo.application.MatchFactory} factory class.  To create new instances, use the {@code create()} method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link com.opal.TransactionContext}.</p>
 *
 * <p>This interface is not meant to be referenced in user code.  Only the {@link com.scobolsolo.application.Match} and the {@link com.scobolsolo.application.MatchFactory} class should be referenced directly.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
public interface MatchUserFacing extends com.opal.IdentityUserFacing {
	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the {@code Id}
	 *
	 * <p>The {@code Id} field is a direct mapping of the {@code id} field in {@code match}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getId() method.</p>
	 *
	 * @return an object value of {@code Id} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.Integer getIdAsObject();

	/**
	 * primitive accessor for the {@code Id}
	 *
	 * <p>The {@code Id} field is a direct mapping of the {@code id} database column in the table {@code match}.</p>
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
	 * @throws com.opal.IllegalNullArgumentException if argId is null
	 */
	@com.opal.annotation.NotNull
	public com.scobolsolo.application.Match setId(java.lang.Integer argId);

	/**
	 * sets the {@code Id} to the value of {@code argId}
	 *
	 * @param argId the new value of {@code Id}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.Match setId(int argId);

	/**
	 * object accessor for the {@code RoundId}
	 *
	 * <p>The {@code RoundId} field is a direct mapping of the {@code round_id} field in {@code match}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getRoundId() method.</p>
	 *
	 * @return an object value of {@code RoundId} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.Integer getRoundIdAsObject();

	/**
	 * primitive accessor for the {@code RoundId}
	 *
	 * <p>The {@code RoundId} field is a direct mapping of the {@code round_id} database column in the table {@code match}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getRoundIdAsObject() method.</p>
	 *
	 * @return the primitive value of {@code RoundId} (of the current {@link com.opal.TransactionContext})
	 */
	default public int getRoundId() {
		java.lang.Integer lclO = getRoundIdAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the {@code RoundId} to the value of {@code argRoundId}
	 *
	 * @param argRoundId the new value of {@code RoundId}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code round_id} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argRoundId is null
	 */
	@com.opal.annotation.NotNull
	public com.scobolsolo.application.Match setRoundId(java.lang.Integer argRoundId);

	/**
	 * sets the {@code RoundId} to the value of {@code argRoundId}
	 *
	 * @param argRoundId the new value of {@code RoundId}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.Match setRoundId(int argRoundId);

	/**
	 * object accessor for the {@code RoomId}
	 *
	 * <p>The {@code RoomId} field is a direct mapping of the {@code room_id} field in {@code match}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getRoomId() method.</p>
	 *
	 * @return an object value of {@code RoomId} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.Integer getRoomIdAsObject();

	/**
	 * primitive accessor for the {@code RoomId}
	 *
	 * <p>The {@code RoomId} field is a direct mapping of the {@code room_id} database column in the table {@code match}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getRoomIdAsObject() method.</p>
	 *
	 * @return the primitive value of {@code RoomId} (of the current {@link com.opal.TransactionContext})
	 */
	default public int getRoomId() {
		java.lang.Integer lclO = getRoomIdAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the {@code RoomId} to the value of {@code argRoomId}
	 *
	 * @param argRoomId the new value of {@code RoomId}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code room_id} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argRoomId is null
	 */
	@com.opal.annotation.NotNull
	public com.scobolsolo.application.Match setRoomId(java.lang.Integer argRoomId);

	/**
	 * sets the {@code RoomId} to the value of {@code argRoomId}
	 *
	 * @param argRoomId the new value of {@code RoomId}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.Match setRoomId(int argRoomId);

	/**
	 * object accessor for the {@code WinningCardId}
	 *
	 * <p>The {@code WinningCardId} field is a direct mapping of the {@code winning_card_id} field in {@code match}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getWinningCardId() method.</p>
	 *
	 * @return an object value of {@code WinningCardId} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	public java.lang.Integer getWinningCardIdAsObject();

	/**
	 * object accessor for the {@code WinningCardId} with substitution for a null value
	 *
	 * <p>The {@code WinningCardId} field is a direct mapping of the {@code winning_card_id} database column in the table {@code match}.</p>
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
	 * <p>The {@code WinningCardId} field is a direct mapping of the {@code winning_card_id} database column in the table {@code match}.</p>
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
	 * sets the {@code WinningCardId} to the value of {@code argWinningCardId}
	 *
	 * @param argWinningCardId the new value of {@code WinningCardId}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 */
	public com.scobolsolo.application.Match setWinningCardId(java.lang.Integer argWinningCardId);

	/**
	 * sets the {@code WinningCardId} to the value of {@code argWinningCardId}
	 *
	 * @param argWinningCardId the new value of {@code WinningCardId}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.Match setWinningCardId(int argWinningCardId);

	/**
	 * object accessor for the {@code LosingCardId}
	 *
	 * <p>The {@code LosingCardId} field is a direct mapping of the {@code losing_card_id} field in {@code match}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getLosingCardId() method.</p>
	 *
	 * @return an object value of {@code LosingCardId} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	public java.lang.Integer getLosingCardIdAsObject();

	/**
	 * object accessor for the {@code LosingCardId} with substitution for a null value
	 *
	 * <p>The {@code LosingCardId} field is a direct mapping of the {@code losing_card_id} database column in the table {@code match}.</p>
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
	 * <p>The {@code LosingCardId} field is a direct mapping of the {@code losing_card_id} database column in the table {@code match}.</p>
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
	 * sets the {@code LosingCardId} to the value of {@code argLosingCardId}
	 *
	 * @param argLosingCardId the new value of {@code LosingCardId}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 */
	public com.scobolsolo.application.Match setLosingCardId(java.lang.Integer argLosingCardId);

	/**
	 * sets the {@code LosingCardId} to the value of {@code argLosingCardId}
	 *
	 * @param argLosingCardId the new value of {@code LosingCardId}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.Match setLosingCardId(int argLosingCardId);

	/**
	 * @return the {@code com.scobolsolo.application.Card}
	 * The returned {@code com.scobolsolo.application.Card} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code card} that is referenced by {@code match_losing_card_id_fkey}.
	 *
	 */
	public com.scobolsolo.application.Card getLosingCard();
	public com.scobolsolo.application.Match setLosingCard(com.scobolsolo.application.Card argLosingCard);

	/**
	 * @return the {@code com.scobolsolo.application.Room}
	 * The returned {@code com.scobolsolo.application.Room} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code room} that is referenced by {@code match_room_id_fkey}.
	 *
	 */
	public com.scobolsolo.application.Room getRoom();
	public com.scobolsolo.application.Match setRoom(com.scobolsolo.application.Room argRoom);

	/**
	 * @return the {@code com.scobolsolo.application.Round}
	 * The returned {@code com.scobolsolo.application.Round} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code round} that is referenced by {@code match_round_id_fkey}.
	 *
	 */
	public com.scobolsolo.application.Round getRound();
	public com.scobolsolo.application.Match setRound(com.scobolsolo.application.Round argRound);

	/**
	 * @return the {@code com.scobolsolo.application.Card}
	 * The returned {@code com.scobolsolo.application.Card} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code card} that is referenced by {@code match_winning_card_id_fkey}.
	 *
	 */
	public com.scobolsolo.application.Card getWinningCard();
	public com.scobolsolo.application.Match setWinningCard(com.scobolsolo.application.Card argWinningCard);

	public com.scobolsolo.application.Game getGame();
	public com.scobolsolo.application.Match setGame(com.scobolsolo.application.Game argGame);

	public com.scobolsolo.application.Match copy();

	/** This is a Comparator that can be used to compare Match objects based on their {@code Id} values. */

	public static class IdComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Match> {
		private static final IdComparator ourInstance = new IdComparator();
		public static final IdComparator getInstance() { return ourInstance; }

		private IdComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Match argFirst, com.scobolsolo.application.Match argSecond) {
			return argFirst.getIdAsObject().compareTo(argSecond.getIdAsObject());
		}
	}

}
