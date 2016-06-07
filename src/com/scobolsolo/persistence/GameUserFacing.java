package com.scobolsolo.persistence;


/**
 * represents a {@code Game} from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from {@code game}.  Do not modify this class directly; instead, alter the permanent storage on which it is based, the Opal configuration file for the project, and/or the {@link com.scobolsolo.application.Game}, and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various {@code forXXX} methods on the {@link com.scobolsolo.application.GameFactory} factory class.  To create new instances, use the {@code create()} method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link com.opal.TransactionContext}.</p>
 *
 * <p>This interface is not meant to be referenced in user code.  Only the {@link com.scobolsolo.application.Game} and the {@link com.scobolsolo.application.GameFactory} class should be referenced directly.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
public interface GameUserFacing extends com.opal.IdentityUserFacing {

	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the {@code Id}
	 *
	 * <p>The {@code Id} field is a direct mapping of the {@code id} field in {@code game}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getId() method.</p>
	 *
	 * @return an object value of {@code Id} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Nullability(nullable = false)
	public java.lang.Integer getIdAsObject();

	/**
	 * primitive accessor for the {@code Id}
	 *
	 * <p>The {@code Id} field is a direct mapping of the {@code id} database column in the table {@code game}.</p>
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
	@com.opal.annotation.Nullability(nullable = false)
	public com.scobolsolo.application.Game setId(java.lang.Integer argId);

	/**
	 * sets the {@code Id} to the value of {@code argId}
	 *
	 * @param argId the new value of {@code Id}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.Game setId(int argId);

	/**
	 * object accessor for the {@code TossupsHeard}
	 *
	 * <p>The {@code TossupsHeard} field is a direct mapping of the {@code tossups_heard} field in {@code game}.</p>
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
	 * <p>The {@code TossupsHeard} field is a direct mapping of the {@code tossups_heard} database column in the table {@code game}.</p>
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
	 * <p>The {@code TossupsHeard} field is a direct mapping of the {@code tossups_heard} database column in the table {@code game}.</p>
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
	 * sets the {@code TossupsHeard} to the value of {@code argTossupsHeard}
	 *
	 * @param argTossupsHeard the new value of {@code TossupsHeard}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public com.scobolsolo.application.Game setTossupsHeard(java.lang.Integer argTossupsHeard);

	/**
	 * sets the {@code TossupsHeard} to the value of {@code argTossupsHeard}
	 *
	 * @param argTossupsHeard the new value of {@code TossupsHeard}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.Game setTossupsHeard(int argTossupsHeard);

	/**
	 * object accessor for the {@code IncomingWinningCardPlayerId}
	 *
	 * <p>The {@code IncomingWinningCardPlayerId} field is a direct mapping of the {@code incoming_winning_card_player_id} field in {@code game}.</p>
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
	 * <p>The {@code IncomingWinningCardPlayerId} field is a direct mapping of the {@code incoming_winning_card_player_id} database column in the table {@code game}.</p>
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
	 * <p>The {@code IncomingWinningCardPlayerId} field is a direct mapping of the {@code incoming_winning_card_player_id} database column in the table {@code game}.</p>
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
	 * sets the {@code IncomingWinningCardPlayerId} to the value of {@code argIncomingWinningCardPlayerId}
	 *
	 * @param argIncomingWinningCardPlayerId the new value of {@code IncomingWinningCardPlayerId}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public com.scobolsolo.application.Game setIncomingWinningCardPlayerId(java.lang.Integer argIncomingWinningCardPlayerId);

	/**
	 * sets the {@code IncomingWinningCardPlayerId} to the value of {@code argIncomingWinningCardPlayerId}
	 *
	 * @param argIncomingWinningCardPlayerId the new value of {@code IncomingWinningCardPlayerId}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.Game setIncomingWinningCardPlayerId(int argIncomingWinningCardPlayerId);

	/**
	 * object accessor for the {@code IncomingLosingCardPlayerId}
	 *
	 * <p>The {@code IncomingLosingCardPlayerId} field is a direct mapping of the {@code incoming_losing_card_player_id} field in {@code game}.</p>
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
	 * <p>The {@code IncomingLosingCardPlayerId} field is a direct mapping of the {@code incoming_losing_card_player_id} database column in the table {@code game}.</p>
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
	 * <p>The {@code IncomingLosingCardPlayerId} field is a direct mapping of the {@code incoming_losing_card_player_id} database column in the table {@code game}.</p>
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
	 * sets the {@code IncomingLosingCardPlayerId} to the value of {@code argIncomingLosingCardPlayerId}
	 *
	 * @param argIncomingLosingCardPlayerId the new value of {@code IncomingLosingCardPlayerId}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public com.scobolsolo.application.Game setIncomingLosingCardPlayerId(java.lang.Integer argIncomingLosingCardPlayerId);

	/**
	 * sets the {@code IncomingLosingCardPlayerId} to the value of {@code argIncomingLosingCardPlayerId}
	 *
	 * @param argIncomingLosingCardPlayerId the new value of {@code IncomingLosingCardPlayerId}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.Game setIncomingLosingCardPlayerId(int argIncomingLosingCardPlayerId);

	/**
	 * object accessor for the {@code OutgoingWinningCardPlayerId}
	 *
	 * <p>The {@code OutgoingWinningCardPlayerId} field is a direct mapping of the {@code outgoing_winning_card_player_id} field in {@code game}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getOutgoingWinningCardPlayerId() method.</p>
	 *
	 * @return an object value of {@code OutgoingWinningCardPlayerId} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public java.lang.Integer getOutgoingWinningCardPlayerIdAsObject();

	/**
	 * object accessor for the {@code OutgoingWinningCardPlayerId} with substitution for a null value
	 *
	 * <p>The {@code OutgoingWinningCardPlayerId} field is a direct mapping of the {@code outgoing_winning_card_player_id} database column in the table {@code game}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code OutgoingWinningCardPlayerId} is {@code null}.
	 * @return an object value of {@code OutgoingWinningCardPlayerId} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getOutgoingWinningCardPlayerIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getOutgoingWinningCardPlayerIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code OutgoingWinningCardPlayerId}
	 *
	 * <p>The {@code OutgoingWinningCardPlayerId} field is a direct mapping of the {@code outgoing_winning_card_player_id} database column in the table {@code game}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getOutgoingWinningCardPlayerIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code OutgoingWinningCardPlayerId} (of the current {@link com.opal.TransactionContext})
	 * @throws com.opal.NullValueException when the internal value is null
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
	 * sets the {@code OutgoingWinningCardPlayerId} to the value of {@code argOutgoingWinningCardPlayerId}
	 *
	 * @param argOutgoingWinningCardPlayerId the new value of {@code OutgoingWinningCardPlayerId}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public com.scobolsolo.application.Game setOutgoingWinningCardPlayerId(java.lang.Integer argOutgoingWinningCardPlayerId);

	/**
	 * sets the {@code OutgoingWinningCardPlayerId} to the value of {@code argOutgoingWinningCardPlayerId}
	 *
	 * @param argOutgoingWinningCardPlayerId the new value of {@code OutgoingWinningCardPlayerId}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.Game setOutgoingWinningCardPlayerId(int argOutgoingWinningCardPlayerId);

	/**
	 * object accessor for the {@code OutgoingLosingCardPlayerId}
	 *
	 * <p>The {@code OutgoingLosingCardPlayerId} field is a direct mapping of the {@code outgoing_losing_card_player_id} field in {@code game}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getOutgoingLosingCardPlayerId() method.</p>
	 *
	 * @return an object value of {@code OutgoingLosingCardPlayerId} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public java.lang.Integer getOutgoingLosingCardPlayerIdAsObject();

	/**
	 * object accessor for the {@code OutgoingLosingCardPlayerId} with substitution for a null value
	 *
	 * <p>The {@code OutgoingLosingCardPlayerId} field is a direct mapping of the {@code outgoing_losing_card_player_id} database column in the table {@code game}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code OutgoingLosingCardPlayerId} is {@code null}.
	 * @return an object value of {@code OutgoingLosingCardPlayerId} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getOutgoingLosingCardPlayerIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getOutgoingLosingCardPlayerIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code OutgoingLosingCardPlayerId}
	 *
	 * <p>The {@code OutgoingLosingCardPlayerId} field is a direct mapping of the {@code outgoing_losing_card_player_id} database column in the table {@code game}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getOutgoingLosingCardPlayerIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code OutgoingLosingCardPlayerId} (of the current {@link com.opal.TransactionContext})
	 * @throws com.opal.NullValueException when the internal value is null
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
	 * sets the {@code OutgoingLosingCardPlayerId} to the value of {@code argOutgoingLosingCardPlayerId}
	 *
	 * @param argOutgoingLosingCardPlayerId the new value of {@code OutgoingLosingCardPlayerId}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public com.scobolsolo.application.Game setOutgoingLosingCardPlayerId(java.lang.Integer argOutgoingLosingCardPlayerId);

	/**
	 * sets the {@code OutgoingLosingCardPlayerId} to the value of {@code argOutgoingLosingCardPlayerId}
	 *
	 * @param argOutgoingLosingCardPlayerId the new value of {@code OutgoingLosingCardPlayerId}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.Game setOutgoingLosingCardPlayerId(int argOutgoingLosingCardPlayerId);

	/**
	 * object accessor for the {@code ModeratorStaffId}
	 *
	 * <p>The {@code ModeratorStaffId} field is a direct mapping of the {@code moderator_staff_id} field in {@code game}.</p>
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
	 * <p>The {@code ModeratorStaffId} field is a direct mapping of the {@code moderator_staff_id} database column in the table {@code game}.</p>
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
	 * <p>The {@code ModeratorStaffId} field is a direct mapping of the {@code moderator_staff_id} database column in the table {@code game}.</p>
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
	 * sets the {@code ModeratorStaffId} to the value of {@code argModeratorStaffId}
	 *
	 * @param argModeratorStaffId the new value of {@code ModeratorStaffId}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public com.scobolsolo.application.Game setModeratorStaffId(java.lang.Integer argModeratorStaffId);

	/**
	 * sets the {@code ModeratorStaffId} to the value of {@code argModeratorStaffId}
	 *
	 * @param argModeratorStaffId the new value of {@code ModeratorStaffId}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.Game setModeratorStaffId(int argModeratorStaffId);

	/**
	 * @return the {@code com.scobolsolo.application.Match}
	 * The returned {@code com.scobolsolo.application.Match} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code match} that is referenced by {@code game_id_fkey}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = false)
	public com.scobolsolo.application.Match getMatch();
	public com.scobolsolo.application.Game setMatch(com.scobolsolo.application.Match argMatch);

	/**
	 * @return the {@code com.scobolsolo.application.Staff}
	 * The returned {@code com.scobolsolo.application.Staff} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code staff} that is referenced by {@code game_moderator_staff_id_fkey}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public com.scobolsolo.application.Staff getModeratorStaff();
	public com.scobolsolo.application.Game setModeratorStaff(com.scobolsolo.application.Staff argModeratorStaff);

	/**
	 * @return the {@code com.scobolsolo.application.Player}
	 * The returned {@code com.scobolsolo.application.Player} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code player} that is referenced by {@code game_outgoing_losing_card_player_id_fkey}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public com.scobolsolo.application.Player getOutgoingLosingCardPlayer();
	public com.scobolsolo.application.Game setOutgoingLosingCardPlayer(com.scobolsolo.application.Player argOutgoingLosingCardPlayer);

	/**
	 * @return the {@code com.scobolsolo.application.Player}
	 * The returned {@code com.scobolsolo.application.Player} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code player} that is referenced by {@code game_outgoing_winning_card_player_id_fkey}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public com.scobolsolo.application.Player getOutgoingWinningCardPlayer();
	public com.scobolsolo.application.Game setOutgoingWinningCardPlayer(com.scobolsolo.application.Player argOutgoingWinningCardPlayer);

	/**
	 * @return the {@code com.scobolsolo.application.Player}
	 * The returned {@code com.scobolsolo.application.Player} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code player} that is referenced by {@code game_incoming_losing_card_player_id_fkey}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public com.scobolsolo.application.Player getIncomingLosingCardPlayer();
	public com.scobolsolo.application.Game setIncomingLosingCardPlayer(com.scobolsolo.application.Player argIncomingLosingCardPlayer);

	/**
	 * @return the {@code com.scobolsolo.application.Player}
	 * The returned {@code com.scobolsolo.application.Player} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code player} that is referenced by {@code game_incoming_winning_card_player_id_fkey}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public com.scobolsolo.application.Player getIncomingWinningCardPlayer();
	public com.scobolsolo.application.Game setIncomingWinningCardPlayer(com.scobolsolo.application.Player argIncomingWinningCardPlayer);

	public int getPerformanceCount();
	public java.util.Iterator<com.scobolsolo.application.Performance> createPerformanceIterator();

	public java.util.stream.Stream<com.scobolsolo.application.Performance> streamPerformance();

	public com.scobolsolo.application.Game addPerformance(com.scobolsolo.application.Performance argPerformance);
	public com.scobolsolo.application.Game removePerformance(com.scobolsolo.application.Performance argPerformance);
	default public <T extends java.util.Collection<? super com.scobolsolo.application.Performance>> T acquirePerformance(T argC) {
		org.apache.commons.lang3.Validate.notNull(argC, "Target Collection is null");
		java.util.Iterator<com.scobolsolo.application.Performance> lclI = createPerformanceIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public com.scobolsolo.application.Performance[] createPerformanceArray() {
		int lclLength = getPerformanceCount();
		com.scobolsolo.application.Performance[] lclA = new com.scobolsolo.application.Performance[lclLength];
		int lclIndex = 0;
		java.util.Iterator<com.scobolsolo.application.Performance> lclI = createPerformanceIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public com.scobolsolo.application.Game copy();

	/** This is a Comparator that can be used to compare Game objects based on their {@code Id} values. */

	public static class IdComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Game> {
		private static final IdComparator ourInstance = new IdComparator();
		public static final IdComparator getInstance() { return ourInstance; }

		private IdComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Game argFirst, com.scobolsolo.application.Game argSecond) {
			return argFirst.getIdAsObject().compareTo(argSecond.getIdAsObject());
		}
	}

}
