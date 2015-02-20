package com.scobolsolo.application;

import com.opal.*;

/**
 * represents a <code>Game</code> from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from the database table <code>game</code>.  Do not modify this class directly; instead, alter the database table on which it is based and/or the Opal configuration file for the project and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various <code>forXXX</code> methods on the {@link GameFactory} factory class.  To create new instances, use the <code>create()</code> method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link TransactionContext}.</p>
 *
 * <p>This interface and the {@link GameFactory} class (the ones in the <code>com.scobolsolo.application</code> package) are the only two automatically generated files for the table that are intended to be referenced in user code. Other automatically generated files (namely those in the <code>com.scobolsolo.persistence</code> package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
public interface Game extends IdentityUserFacing {
	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the Id
	 *
	 * <p>The Id field is a direct mapping of the <code>id</code> database column in the table <code>game</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getId() method.</p>
	 *
	 * @return an object value of Id (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Integer getIdAsObject();
	/**
	 * primitive accessor for the Id
	 *
	 * <p>The Id field is a direct mapping of the <code>id</code> database column in the table <code>game</code>.</p>
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
	 * object accessor for the TossupsHeard
	 *
	 * <p>The TossupsHeard field is a direct mapping of the <code>tossups_heard</code> database column in the table <code>game</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getTossupsHeard() method.</p>
	 *
	 * @return an object value of TossupsHeard (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.Integer getTossupsHeardAsObject();
	/**
	 * object accessor for the TossupsHeard with substitution for a null value
	 *
	 * <p>The TossupsHeard field is a direct mapping of the <code>tossups_heard</code> database column in the table <code>game</code>.</p>
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
	 * <p>The TossupsHeard field is a direct mapping of the <code>tossups_heard</code> database column in the table <code>game</code>.</p>
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
	 * sets the TossupsHeard to the value of <code>argTossupsHeard</code>
	 *
	 * @param argTossupsHeard the new value of TossupsHeard.  May be <code>null</code>.
	 */
	public void setTossupsHeard(java.lang.Integer argTossupsHeard);

	/**
	 * sets the TossupsHeard to the value of <code>argTossupsHeard</code>
	 *
	 * @param argTossupsHeard the new value of TossupsHeard
	 */
	public void setTossupsHeard(int argTossupsHeard);

	/**
	 * object accessor for the IncomingWinningCardPlayerId
	 *
	 * <p>The IncomingWinningCardPlayerId field is a direct mapping of the <code>incoming_winning_card_player_id</code> database column in the table <code>game</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getIncomingWinningCardPlayerId() method.</p>
	 *
	 * @return an object value of IncomingWinningCardPlayerId (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.Integer getIncomingWinningCardPlayerIdAsObject();
	/**
	 * object accessor for the IncomingWinningCardPlayerId with substitution for a null value
	 *
	 * <p>The IncomingWinningCardPlayerId field is a direct mapping of the <code>incoming_winning_card_player_id</code> database column in the table <code>game</code>.</p>
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
	 * <p>The IncomingWinningCardPlayerId field is a direct mapping of the <code>incoming_winning_card_player_id</code> database column in the table <code>game</code>.</p>
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
	 * sets the IncomingWinningCardPlayerId to the value of <code>argIncomingWinningCardPlayerId</code>
	 *
	 * @param argIncomingWinningCardPlayerId the new value of IncomingWinningCardPlayerId.  May be <code>null</code>.
	 */
	public void setIncomingWinningCardPlayerId(java.lang.Integer argIncomingWinningCardPlayerId);

	/**
	 * sets the IncomingWinningCardPlayerId to the value of <code>argIncomingWinningCardPlayerId</code>
	 *
	 * @param argIncomingWinningCardPlayerId the new value of IncomingWinningCardPlayerId
	 */
	public void setIncomingWinningCardPlayerId(int argIncomingWinningCardPlayerId);

	/**
	 * object accessor for the IncomingLosingCardPlayerId
	 *
	 * <p>The IncomingLosingCardPlayerId field is a direct mapping of the <code>incoming_losing_card_player_id</code> database column in the table <code>game</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getIncomingLosingCardPlayerId() method.</p>
	 *
	 * @return an object value of IncomingLosingCardPlayerId (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.Integer getIncomingLosingCardPlayerIdAsObject();
	/**
	 * object accessor for the IncomingLosingCardPlayerId with substitution for a null value
	 *
	 * <p>The IncomingLosingCardPlayerId field is a direct mapping of the <code>incoming_losing_card_player_id</code> database column in the table <code>game</code>.</p>
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
	 * <p>The IncomingLosingCardPlayerId field is a direct mapping of the <code>incoming_losing_card_player_id</code> database column in the table <code>game</code>.</p>
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
	 * sets the IncomingLosingCardPlayerId to the value of <code>argIncomingLosingCardPlayerId</code>
	 *
	 * @param argIncomingLosingCardPlayerId the new value of IncomingLosingCardPlayerId.  May be <code>null</code>.
	 */
	public void setIncomingLosingCardPlayerId(java.lang.Integer argIncomingLosingCardPlayerId);

	/**
	 * sets the IncomingLosingCardPlayerId to the value of <code>argIncomingLosingCardPlayerId</code>
	 *
	 * @param argIncomingLosingCardPlayerId the new value of IncomingLosingCardPlayerId
	 */
	public void setIncomingLosingCardPlayerId(int argIncomingLosingCardPlayerId);

	/**
	 * object accessor for the OutgoingWinningCardPlayerId
	 *
	 * <p>The OutgoingWinningCardPlayerId field is a direct mapping of the <code>outgoing_winning_card_player_id</code> database column in the table <code>game</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getOutgoingWinningCardPlayerId() method.</p>
	 *
	 * @return an object value of OutgoingWinningCardPlayerId (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.Integer getOutgoingWinningCardPlayerIdAsObject();
	/**
	 * object accessor for the OutgoingWinningCardPlayerId with substitution for a null value
	 *
	 * <p>The OutgoingWinningCardPlayerId field is a direct mapping of the <code>outgoing_winning_card_player_id</code> database column in the table <code>game</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the OutgoingWinningCardPlayerId is <code>null</code>.
	 * @return an object value of OutgoingWinningCardPlayerId (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getOutgoingWinningCardPlayerIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getOutgoingWinningCardPlayerIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the OutgoingWinningCardPlayerId
	 *
	 * <p>The OutgoingWinningCardPlayerId field is a direct mapping of the <code>outgoing_winning_card_player_id</code> database column in the table <code>game</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getOutgoingWinningCardPlayerIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a <code>NULL</code> value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of OutgoingWinningCardPlayerId (of the current {@link TransactionContext})
	 * @throws NullValueException when the internal value is null
	 */
	default public int getOutgoingWinningCardPlayerId() throws com.opal.NullValueException {
		java.lang.Integer lclO = getOutgoingWinningCardPlayerIdAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getOutgoingWinningCardPlayerId(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getOutgoingWinningCardPlayerIdAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getOutgoingWinningCardPlayerId(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getOutgoingWinningCardPlayerIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * sets the OutgoingWinningCardPlayerId to the value of <code>argOutgoingWinningCardPlayerId</code>
	 *
	 * @param argOutgoingWinningCardPlayerId the new value of OutgoingWinningCardPlayerId.  May be <code>null</code>.
	 */
	public void setOutgoingWinningCardPlayerId(java.lang.Integer argOutgoingWinningCardPlayerId);

	/**
	 * sets the OutgoingWinningCardPlayerId to the value of <code>argOutgoingWinningCardPlayerId</code>
	 *
	 * @param argOutgoingWinningCardPlayerId the new value of OutgoingWinningCardPlayerId
	 */
	public void setOutgoingWinningCardPlayerId(int argOutgoingWinningCardPlayerId);

	/**
	 * object accessor for the OutgoingLosingCardPlayerId
	 *
	 * <p>The OutgoingLosingCardPlayerId field is a direct mapping of the <code>outgoing_losing_card_player_id</code> database column in the table <code>game</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getOutgoingLosingCardPlayerId() method.</p>
	 *
	 * @return an object value of OutgoingLosingCardPlayerId (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.Integer getOutgoingLosingCardPlayerIdAsObject();
	/**
	 * object accessor for the OutgoingLosingCardPlayerId with substitution for a null value
	 *
	 * <p>The OutgoingLosingCardPlayerId field is a direct mapping of the <code>outgoing_losing_card_player_id</code> database column in the table <code>game</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the OutgoingLosingCardPlayerId is <code>null</code>.
	 * @return an object value of OutgoingLosingCardPlayerId (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getOutgoingLosingCardPlayerIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getOutgoingLosingCardPlayerIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the OutgoingLosingCardPlayerId
	 *
	 * <p>The OutgoingLosingCardPlayerId field is a direct mapping of the <code>outgoing_losing_card_player_id</code> database column in the table <code>game</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getOutgoingLosingCardPlayerIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a <code>NULL</code> value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of OutgoingLosingCardPlayerId (of the current {@link TransactionContext})
	 * @throws NullValueException when the internal value is null
	 */
	default public int getOutgoingLosingCardPlayerId() throws com.opal.NullValueException {
		java.lang.Integer lclO = getOutgoingLosingCardPlayerIdAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getOutgoingLosingCardPlayerId(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getOutgoingLosingCardPlayerIdAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getOutgoingLosingCardPlayerId(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getOutgoingLosingCardPlayerIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * sets the OutgoingLosingCardPlayerId to the value of <code>argOutgoingLosingCardPlayerId</code>
	 *
	 * @param argOutgoingLosingCardPlayerId the new value of OutgoingLosingCardPlayerId.  May be <code>null</code>.
	 */
	public void setOutgoingLosingCardPlayerId(java.lang.Integer argOutgoingLosingCardPlayerId);

	/**
	 * sets the OutgoingLosingCardPlayerId to the value of <code>argOutgoingLosingCardPlayerId</code>
	 *
	 * @param argOutgoingLosingCardPlayerId the new value of OutgoingLosingCardPlayerId
	 */
	public void setOutgoingLosingCardPlayerId(int argOutgoingLosingCardPlayerId);

	/**
	 * object accessor for the ModeratorStaffId
	 *
	 * <p>The ModeratorStaffId field is a direct mapping of the <code>moderator_staff_id</code> database column in the table <code>game</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getModeratorStaffId() method.</p>
	 *
	 * @return an object value of ModeratorStaffId (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.Integer getModeratorStaffIdAsObject();
	/**
	 * object accessor for the ModeratorStaffId with substitution for a null value
	 *
	 * <p>The ModeratorStaffId field is a direct mapping of the <code>moderator_staff_id</code> database column in the table <code>game</code>.</p>
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
	 * <p>The ModeratorStaffId field is a direct mapping of the <code>moderator_staff_id</code> database column in the table <code>game</code>.</p>
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
	 * sets the ModeratorStaffId to the value of <code>argModeratorStaffId</code>
	 *
	 * @param argModeratorStaffId the new value of ModeratorStaffId.  May be <code>null</code>.
	 */
	public void setModeratorStaffId(java.lang.Integer argModeratorStaffId);

	/**
	 * sets the ModeratorStaffId to the value of <code>argModeratorStaffId</code>
	 *
	 * @param argModeratorStaffId the new value of ModeratorStaffId
	 */
	public void setModeratorStaffId(int argModeratorStaffId);

	/**
	 * @return the <code>Match</code>
	 * The returned <code>Match</code> is the {@link UserFacing} object corresponding to the row in the <code>match</code> that is referenced by the foreign key <code>game_id_fkey</code>.
	 *
	 */
	public Match getMatch();
	public void setMatch(Match argMatch);

	/**
	 * @return the <code>Player</code>
	 * The returned <code>Player</code> is the {@link UserFacing} object corresponding to the row in the <code>player</code> that is referenced by the foreign key <code>game_incoming_losing_card_player_id_fkey</code>.
	 *
	 */
	public Player getIncomingLosingCardPlayer();
	public void setIncomingLosingCardPlayer(Player argPlayer);

	/**
	 * @return the <code>Player</code>
	 * The returned <code>Player</code> is the {@link UserFacing} object corresponding to the row in the <code>player</code> that is referenced by the foreign key <code>game_incoming_winning_card_player_id_fkey</code>.
	 *
	 */
	public Player getIncomingWinningCardPlayer();
	public void setIncomingWinningCardPlayer(Player argPlayer);

	/**
	 * @return the <code>Staff</code>
	 * The returned <code>Staff</code> is the {@link UserFacing} object corresponding to the row in the <code>staff</code> that is referenced by the foreign key <code>game_moderator_staff_id_fkey</code>.
	 *
	 */
	public Staff getModeratorStaff();
	public void setModeratorStaff(Staff argStaff);

	/**
	 * @return the <code>Player</code>
	 * The returned <code>Player</code> is the {@link UserFacing} object corresponding to the row in the <code>player</code> that is referenced by the foreign key <code>game_outgoing_losing_card_player_id_fkey</code>.
	 *
	 */
	public Player getOutgoingLosingCardPlayer();
	public void setOutgoingLosingCardPlayer(Player argPlayer);

	/**
	 * @return the <code>Player</code>
	 * The returned <code>Player</code> is the {@link UserFacing} object corresponding to the row in the <code>player</code> that is referenced by the foreign key <code>game_outgoing_winning_card_player_id_fkey</code>.
	 *
	 */
	public Player getOutgoingWinningCardPlayer();
	public void setOutgoingWinningCardPlayer(Player argPlayer);

	public int getPerformanceCount();
	public java.util.Iterator<Performance> createPerformanceIterator();

	public java.util.stream.Stream<Performance> streamPerformance();

	public void addPerformance(Performance argPerformance);
	public void removePerformance(Performance argPerformance);
	public void clearPerformance();

	default public <T extends java.util.Collection<? super Performance>> T acquirePerformance(T argC) {
		org.apache.commons.lang3.Validate.notNull(argC);
		java.util.Iterator<Performance> lclI = createPerformanceIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public Performance[] createPerformanceArray() {
		int lclLength = getPerformanceCount();
		Performance[] lclA = new Performance[lclLength];
		int lclIndex = 0;
		java.util.Iterator<Performance> lclI = createPerformanceIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public Game copy();

	/** This is a Comparator that can be used to compare Game objects based on their Id values. */

	public static class IdComparator extends com.siliconage.util.NullSafeComparator<Game> {
		private static final IdComparator ourInstance = new IdComparator();
		public static final IdComparator getInstance() { return ourInstance; }

		private IdComparator() { super(); }

		@Override
		public int compareInternal(Game argFirst, Game argSecond) {
			return argFirst.getIdAsObject().compareTo(argSecond.getIdAsObject());
		}
	}

}
