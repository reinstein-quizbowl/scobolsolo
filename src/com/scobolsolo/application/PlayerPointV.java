package com.scobolsolo.application;

import com.opal.*;

/**
 * represents a <code>PlayerPointV</code> from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from the database table <code>player_point_v</code>.  Do not modify this class directly; instead, alter the database table on which it is based and/or the Opal configuration file for the project and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various <code>forXXX</code> methods on the {@link PlayerPointVFactory} factory class.  To create new instances, use the <code>create()</code> method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link TransactionContext}.</p>
 *
 * <p>This interface and the {@link PlayerPointVFactory} class (the ones in the <code>com.scobolsolo.application</code> package) are the only two automatically generated files for the table that are intended to be referenced in user code. Other automatically generated files (namely those in the <code>com.scobolsolo.persistence</code> package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
public interface PlayerPointV extends UserFacing {
	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the TournamentCode
	 *
	 * <p>The TournamentCode field is a direct mapping of the <code>tournament_code</code> database column in the table <code>player_point_v</code>.</p>
	 *
	 * @return an object value of TournamentCode (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.String getTournamentCode();
	/**
	 * object accessor for the PlayerId
	 *
	 * <p>The PlayerId field is a direct mapping of the <code>player_id</code> database column in the table <code>player_point_v</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getPlayerId() method.</p>
	 *
	 * @return an object value of PlayerId (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.Integer getPlayerIdAsObject();
	/**
	 * object accessor for the PlayerId with substitution for a null value
	 *
	 * <p>The PlayerId field is a direct mapping of the <code>player_id</code> database column in the table <code>player_point_v</code>.</p>
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
	 * <p>The PlayerId field is a direct mapping of the <code>player_id</code> database column in the table <code>player_point_v</code>.</p>
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
	 * object accessor for the Points
	 *
	 * <p>The Points field is a direct mapping of the <code>points</code> database column in the table <code>player_point_v</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getPoints() method.</p>
	 *
	 * @return an object value of Points (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.Integer getPointsAsObject();
	/**
	 * object accessor for the Points with substitution for a null value
	 *
	 * <p>The Points field is a direct mapping of the <code>points</code> database column in the table <code>player_point_v</code>.</p>
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
	 * <p>The Points field is a direct mapping of the <code>points</code> database column in the table <code>player_point_v</code>.</p>
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
	public static class PointsPlayerNameComparator extends com.siliconage.util.NullSafeComparator<PlayerPointV> {
		private static final PointsPlayerNameComparator ourInstance = new PointsPlayerNameComparator();
		public static final PointsPlayerNameComparator getInstance() { return ourInstance; }

		private PointsPlayerNameComparator() { super(); }

		@Override
		public int compareInternal(PlayerPointV argFirst, PlayerPointV argSecond) {
			int lclResult = nullSafeCompare(argFirst.getPointsAsObject(), argSecond.getPointsAsObject());
			if (lclResult != 0) {
				return lclResult;
			}
			return com.scobolsolo.application.Player.NameComparator.getInstance().compare(argFirst.getPlayer(), argSecond.getPlayer());
		}
	}

}
