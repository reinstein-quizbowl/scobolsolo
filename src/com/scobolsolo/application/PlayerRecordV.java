package com.scobolsolo.application;

import com.opal.*;

/**
 * represents a <code>PlayerRecordV</code> from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from the database table <code>player_record_v</code>.  Do not modify this class directly; instead, alter the database table on which it is based and/or the Opal configuration file for the project and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various <code>forXXX</code> methods on the {@link PlayerRecordVFactory} factory class.  To create new instances, use the <code>create()</code> method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link TransactionContext}.</p>
 *
 * <p>This interface and the {@link PlayerRecordVFactory} class (the ones in the <code>com.scobolsolo.application</code> package) are the only two automatically generated files for the table that are intended to be referenced in user code. Other automatically generated files (namely those in the <code>com.scobolsolo.persistence</code> package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
public interface PlayerRecordV extends UserFacing {
	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the TournamentCode
	 *
	 * <p>The TournamentCode field is a direct mapping of the <code>tournament_code</code> database column in the table <code>player_record_v</code>.</p>
	 *
	 * @return an object value of TournamentCode (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.String getTournamentCode();
	/**
	 * object accessor for the PlayerId
	 *
	 * <p>The PlayerId field is a direct mapping of the <code>player_id</code> database column in the table <code>player_record_v</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getPlayerId() method.</p>
	 *
	 * @return an object value of PlayerId (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.Integer getPlayerIdAsObject();
	/**
	 * object accessor for the PlayerId with substitution for a null value
	 *
	 * <p>The PlayerId field is a direct mapping of the <code>player_id</code> database column in the table <code>player_record_v</code>.</p>
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
	 * <p>The PlayerId field is a direct mapping of the <code>player_id</code> database column in the table <code>player_record_v</code>.</p>
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
	 * object accessor for the WinCount
	 *
	 * <p>The WinCount field is a direct mapping of the <code>win_count</code> database column in the table <code>player_record_v</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getWinCount() method.</p>
	 *
	 * @return an object value of WinCount (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.Long getWinCountAsObject();
	/**
	 * object accessor for the WinCount with substitution for a null value
	 *
	 * <p>The WinCount field is a direct mapping of the <code>win_count</code> database column in the table <code>player_record_v</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the WinCount is <code>null</code>.
	 * @return an object value of WinCount (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getWinCountAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Long lclO = getWinCountAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the WinCount
	 *
	 * <p>The WinCount field is a direct mapping of the <code>win_count</code> database column in the table <code>player_record_v</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getWinCountAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a <code>NULL</code> value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of WinCount (of the current {@link TransactionContext})
	 * @throws NullValueException when the internal value is null
	 */
	default public long getWinCount() throws com.opal.NullValueException {
		java.lang.Long lclO = getWinCountAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.longValue();
	}

	default public long getWinCount(long argStringToSubstituteIfNull) {
		java.lang.Long lclO = getWinCountAsObject();
		return lclO != null ? lclO.longValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getWinCount(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Long lclO = getWinCountAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * object accessor for the LossCount
	 *
	 * <p>The LossCount field is a direct mapping of the <code>loss_count</code> database column in the table <code>player_record_v</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getLossCount() method.</p>
	 *
	 * @return an object value of LossCount (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.Long getLossCountAsObject();
	/**
	 * object accessor for the LossCount with substitution for a null value
	 *
	 * <p>The LossCount field is a direct mapping of the <code>loss_count</code> database column in the table <code>player_record_v</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the LossCount is <code>null</code>.
	 * @return an object value of LossCount (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getLossCountAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Long lclO = getLossCountAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the LossCount
	 *
	 * <p>The LossCount field is a direct mapping of the <code>loss_count</code> database column in the table <code>player_record_v</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getLossCountAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a <code>NULL</code> value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of LossCount (of the current {@link TransactionContext})
	 * @throws NullValueException when the internal value is null
	 */
	default public long getLossCount() throws com.opal.NullValueException {
		java.lang.Long lclO = getLossCountAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.longValue();
	}

	default public long getLossCount(long argStringToSubstituteIfNull) {
		java.lang.Long lclO = getLossCountAsObject();
		return lclO != null ? lclO.longValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getLossCount(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Long lclO = getLossCountAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * object accessor for the Points
	 *
	 * <p>The Points field is a direct mapping of the <code>points</code> database column in the table <code>player_record_v</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getPoints() method.</p>
	 *
	 * @return an object value of Points (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.Integer getPointsAsObject();
	/**
	 * object accessor for the Points with substitution for a null value
	 *
	 * <p>The Points field is a direct mapping of the <code>points</code> database column in the table <code>player_record_v</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the Points is <code>null</code>.
	 * @return an object value of Points (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getPointsAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getPointsAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the Points
	 *
	 * <p>The Points field is a direct mapping of the <code>points</code> database column in the table <code>player_record_v</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getPointsAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a <code>NULL</code> value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of Points (of the current {@link TransactionContext})
	 * @throws NullValueException when the internal value is null
	 */
	default public int getPoints() throws com.opal.NullValueException {
		java.lang.Integer lclO = getPointsAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getPoints(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getPointsAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getPoints(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getPointsAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * object accessor for the TossupsHeard
	 *
	 * <p>The TossupsHeard field is a direct mapping of the <code>tossups_heard</code> database column in the table <code>player_record_v</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getTossupsHeard() method.</p>
	 *
	 * @return an object value of TossupsHeard (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.Integer getTossupsHeardAsObject();
	/**
	 * object accessor for the TossupsHeard with substitution for a null value
	 *
	 * <p>The TossupsHeard field is a direct mapping of the <code>tossups_heard</code> database column in the table <code>player_record_v</code>.</p>
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
	 * <p>The TossupsHeard field is a direct mapping of the <code>tossups_heard</code> database column in the table <code>player_record_v</code>.</p>
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
	default public double getPPTUH() {
		return com.scobolsolo.application.PlayerRecordVDelegate.getPPTUH(this);
	}

	default public double getWinningPercentage() {
		return com.scobolsolo.application.PlayerRecordVDelegate.getWinningPercentage(this);
	}

	public static class PlayerComparator extends com.siliconage.util.NullSafeComparator<PlayerRecordV> {
		private static final PlayerComparator ourInstance = new PlayerComparator();
		public static final PlayerComparator getInstance() { return ourInstance; }

		private PlayerComparator() { super(); }

		@Override
		public int compareInternal(PlayerRecordV argFirst, PlayerRecordV argSecond) {
			return com.scobolsolo.application.Player.NameComparator.getInstance().compare(argFirst.getPlayer(), argSecond.getPlayer());
		}
	}

}
