package com.scobolsolo.application;

import com.opal.*;

/**
 * represents a <code>PlayerMatchV</code> from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from the database table <code>player_match_v</code>.  Do not modify this class directly; instead, alter the database table on which it is based and/or the Opal configuration file for the project and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various <code>forXXX</code> methods on the {@link PlayerMatchVFactory} factory class.  To create new instances, use the <code>create()</code> method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link TransactionContext}.</p>
 *
 * <p>This interface and the {@link PlayerMatchVFactory} class (the ones in the <code>com.scobolsolo.application</code> package) are the only two automatically generated files for the table that are intended to be referenced in user code. Other automatically generated files (namely those in the <code>com.scobolsolo.persistence</code> package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
public interface PlayerMatchV extends UserFacing {
	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the TournamentCode
	 *
	 * <p>The TournamentCode field is a direct mapping of the <code>tournament_code</code> database column in the table <code>player_match_v</code>.</p>
	 *
	 * @return an object value of TournamentCode (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.String getTournamentCode();
	/**
	 * object accessor for the PlayerId
	 *
	 * <p>The PlayerId field is a direct mapping of the <code>player_id</code> database column in the table <code>player_match_v</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getPlayerId() method.</p>
	 *
	 * @return an object value of PlayerId (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.Integer getPlayerIdAsObject();
	/**
	 * object accessor for the PlayerId with substitution for a null value
	 *
	 * <p>The PlayerId field is a direct mapping of the <code>player_id</code> database column in the table <code>player_match_v</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the PlayerId is <code>null</code>.
	 * @return an object value of PlayerId (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getPlayerIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getPlayerIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the PlayerId
	 *
	 * <p>The PlayerId field is a direct mapping of the <code>player_id</code> database column in the table <code>player_match_v</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getPlayerIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a <code>NULL</code> value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of PlayerId (of the current {@link TransactionContext})
	 * @throws NullValueException when the internal value is null
	 */
	default public int getPlayerId() throws com.opal.NullValueException {
		java.lang.Integer lclO = getPlayerIdAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getPlayerId(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getPlayerIdAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getPlayerId(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getPlayerIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * object accessor for the PerformanceId
	 *
	 * <p>The PerformanceId field is a direct mapping of the <code>performance_id</code> database column in the table <code>player_match_v</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getPerformanceId() method.</p>
	 *
	 * @return an object value of PerformanceId (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.Integer getPerformanceIdAsObject();
	/**
	 * object accessor for the PerformanceId with substitution for a null value
	 *
	 * <p>The PerformanceId field is a direct mapping of the <code>performance_id</code> database column in the table <code>player_match_v</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the PerformanceId is <code>null</code>.
	 * @return an object value of PerformanceId (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getPerformanceIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getPerformanceIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the PerformanceId
	 *
	 * <p>The PerformanceId field is a direct mapping of the <code>performance_id</code> database column in the table <code>player_match_v</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getPerformanceIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a <code>NULL</code> value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of PerformanceId (of the current {@link TransactionContext})
	 * @throws NullValueException when the internal value is null
	 */
	default public int getPerformanceId() throws com.opal.NullValueException {
		java.lang.Integer lclO = getPerformanceIdAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getPerformanceId(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getPerformanceIdAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getPerformanceId(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getPerformanceIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * object accessor for the OpponentPlayerId
	 *
	 * <p>The OpponentPlayerId field is a direct mapping of the <code>opponent_player_id</code> database column in the table <code>player_match_v</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getOpponentPlayerId() method.</p>
	 *
	 * @return an object value of OpponentPlayerId (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.Integer getOpponentPlayerIdAsObject();
	/**
	 * object accessor for the OpponentPlayerId with substitution for a null value
	 *
	 * <p>The OpponentPlayerId field is a direct mapping of the <code>opponent_player_id</code> database column in the table <code>player_match_v</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the OpponentPlayerId is <code>null</code>.
	 * @return an object value of OpponentPlayerId (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getOpponentPlayerIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getOpponentPlayerIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the OpponentPlayerId
	 *
	 * <p>The OpponentPlayerId field is a direct mapping of the <code>opponent_player_id</code> database column in the table <code>player_match_v</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getOpponentPlayerIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a <code>NULL</code> value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of OpponentPlayerId (of the current {@link TransactionContext})
	 * @throws NullValueException when the internal value is null
	 */
	default public int getOpponentPlayerId() throws com.opal.NullValueException {
		java.lang.Integer lclO = getOpponentPlayerIdAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getOpponentPlayerId(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getOpponentPlayerIdAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getOpponentPlayerId(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getOpponentPlayerIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * object accessor for the OpponentPerformanceId
	 *
	 * <p>The OpponentPerformanceId field is a direct mapping of the <code>opponent_performance_id</code> database column in the table <code>player_match_v</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getOpponentPerformanceId() method.</p>
	 *
	 * @return an object value of OpponentPerformanceId (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.Integer getOpponentPerformanceIdAsObject();
	/**
	 * object accessor for the OpponentPerformanceId with substitution for a null value
	 *
	 * <p>The OpponentPerformanceId field is a direct mapping of the <code>opponent_performance_id</code> database column in the table <code>player_match_v</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the OpponentPerformanceId is <code>null</code>.
	 * @return an object value of OpponentPerformanceId (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getOpponentPerformanceIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getOpponentPerformanceIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the OpponentPerformanceId
	 *
	 * <p>The OpponentPerformanceId field is a direct mapping of the <code>opponent_performance_id</code> database column in the table <code>player_match_v</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getOpponentPerformanceIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a <code>NULL</code> value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of OpponentPerformanceId (of the current {@link TransactionContext})
	 * @throws NullValueException when the internal value is null
	 */
	default public int getOpponentPerformanceId() throws com.opal.NullValueException {
		java.lang.Integer lclO = getOpponentPerformanceIdAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getOpponentPerformanceId(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getOpponentPerformanceIdAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getOpponentPerformanceId(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getOpponentPerformanceIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * object accessor for the MatchId
	 *
	 * <p>The MatchId field is a direct mapping of the <code>match_id</code> database column in the table <code>player_match_v</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getMatchId() method.</p>
	 *
	 * @return an object value of MatchId (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.Integer getMatchIdAsObject();
	/**
	 * object accessor for the MatchId with substitution for a null value
	 *
	 * <p>The MatchId field is a direct mapping of the <code>match_id</code> database column in the table <code>player_match_v</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the MatchId is <code>null</code>.
	 * @return an object value of MatchId (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getMatchIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getMatchIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the MatchId
	 *
	 * <p>The MatchId field is a direct mapping of the <code>match_id</code> database column in the table <code>player_match_v</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getMatchIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a <code>NULL</code> value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of MatchId (of the current {@link TransactionContext})
	 * @throws NullValueException when the internal value is null
	 */
	default public int getMatchId() throws com.opal.NullValueException {
		java.lang.Integer lclO = getMatchIdAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getMatchId(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getMatchIdAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getMatchId(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getMatchIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * object accessor for the GameId
	 *
	 * <p>The GameId field is a direct mapping of the <code>game_id</code> database column in the table <code>player_match_v</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getGameId() method.</p>
	 *
	 * @return an object value of GameId (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.Integer getGameIdAsObject();
	/**
	 * object accessor for the GameId with substitution for a null value
	 *
	 * <p>The GameId field is a direct mapping of the <code>game_id</code> database column in the table <code>player_match_v</code>.</p>
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
	 * <p>The GameId field is a direct mapping of the <code>game_id</code> database column in the table <code>player_match_v</code>.</p>
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
	public Player getPlayer();
	/**
	 * @return the <code>Player</code>
	 * The returned <code>Player</code> is the {@link UserFacing} object corresponding to the row in the <code>player</code> that is referenced by the foreign key <code>UNNAMED_INFERRED_KEY</code>.
	 *
	 */
	public Player getOpponentPlayer();
	/**
	 * @return the <code>Match</code>
	 * The returned <code>Match</code> is the {@link UserFacing} object corresponding to the row in the <code>match</code> that is referenced by the foreign key <code>UNNAMED_INFERRED_KEY</code>.
	 *
	 */
	public Match getMatch();
	/**
	 * @return the <code>Performance</code>
	 * The returned <code>Performance</code> is the {@link UserFacing} object corresponding to the row in the <code>performance</code> that is referenced by the foreign key <code>UNNAMED_INFERRED_KEY</code>.
	 *
	 */
	public Performance getPerformance();
	/**
	 * @return the <code>Performance</code>
	 * The returned <code>Performance</code> is the {@link UserFacing} object corresponding to the row in the <code>performance</code> that is referenced by the foreign key <code>UNNAMED_INFERRED_KEY</code>.
	 *
	 */
	public Performance getOpponentPerformance();
	public static class RoundComparator extends com.siliconage.util.NullSafeComparator<PlayerMatchV> {
		private static final RoundComparator ourInstance = new RoundComparator();
		public static final RoundComparator getInstance() { return ourInstance; }

		private RoundComparator() { super(); }

		@Override
		public int compareInternal(PlayerMatchV argFirst, PlayerMatchV argSecond) {
			return com.scobolsolo.application.Match.RoundComparator.getInstance().compare(argFirst.getMatch(), argSecond.getMatch());
		}
	}

}
