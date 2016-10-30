package com.scobolsolo.persistence;


/**
 * represents a {@code Message} from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from {@code message}.  Do not modify this class directly; instead, alter the permanent storage on which it is based, the Opal configuration file for the project, and/or the {@link com.scobolsolo.application.Message}, and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various {@code forXXX} methods on the {@link com.scobolsolo.application.MessageFactory} factory class.  To create new instances, use the {@code create()} method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link com.opal.TransactionContext}.</p>
 *
 * <p>This interface is not meant to be referenced in user code.  Only the {@link com.scobolsolo.application.Message} and the {@link com.scobolsolo.application.MessageFactory} class should be referenced directly.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
	@com.opal.annotation.Creatability(creatable = true)
	@com.opal.annotation.Updatability(updatable = true)
public interface MessageUserFacing extends com.opal.IdentityUserFacing, Comparable<com.scobolsolo.application.Message> {

	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the {@code Id}
	 *
	 * <p>The {@code Id} field is a direct mapping of the {@code id} field in {@code message}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getId() method.</p>
	 *
	 * @return an object value of {@code Id} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	public java.lang.Integer getIdAsObject();

	/**
	 * primitive accessor for the {@code Id}
	 *
	 * <p>The {@code Id} field is a direct mapping of the {@code id} database column in the table {@code message}.</p>
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
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	public com.scobolsolo.application.Message setId(java.lang.Integer argId);

	/**
	 * sets the {@code Id} to the value of {@code argId}
	 *
	 * @param argId the new value of {@code Id}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.Message setId(int argId);

	/**
	 * object accessor for the {@code FromAccountId}
	 *
	 * <p>The {@code FromAccountId} field is a direct mapping of the {@code from_account_id} field in {@code message}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getFromAccountId() method.</p>
	 *
	 * @return an object value of {@code FromAccountId} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	public java.lang.Integer getFromAccountIdAsObject();

	/**
	 * primitive accessor for the {@code FromAccountId}
	 *
	 * <p>The {@code FromAccountId} field is a direct mapping of the {@code from_account_id} database column in the table {@code message}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getFromAccountIdAsObject() method.</p>
	 *
	 * @return the primitive value of {@code FromAccountId} (of the current {@link com.opal.TransactionContext})
	 */
	default public int getFromAccountId() {
		java.lang.Integer lclO = getFromAccountIdAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the {@code FromAccountId} to the value of {@code argFromAccountId}
	 *
	 * @param argFromAccountId the new value of {@code FromAccountId}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code from_account_id} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argFromAccountId is null
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	public com.scobolsolo.application.Message setFromAccountId(java.lang.Integer argFromAccountId);

	/**
	 * sets the {@code FromAccountId} to the value of {@code argFromAccountId}
	 *
	 * @param argFromAccountId the new value of {@code FromAccountId}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.Message setFromAccountId(int argFromAccountId);

	/**
	 * object accessor for the {@code ToAccountId}
	 *
	 * <p>The {@code ToAccountId} field is a direct mapping of the {@code to_account_id} field in {@code message}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getToAccountId() method.</p>
	 *
	 * @return an object value of {@code ToAccountId} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	public java.lang.Integer getToAccountIdAsObject();

	/**
	 * primitive accessor for the {@code ToAccountId}
	 *
	 * <p>The {@code ToAccountId} field is a direct mapping of the {@code to_account_id} database column in the table {@code message}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getToAccountIdAsObject() method.</p>
	 *
	 * @return the primitive value of {@code ToAccountId} (of the current {@link com.opal.TransactionContext})
	 */
	default public int getToAccountId() {
		java.lang.Integer lclO = getToAccountIdAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the {@code ToAccountId} to the value of {@code argToAccountId}
	 *
	 * @param argToAccountId the new value of {@code ToAccountId}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code to_account_id} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argToAccountId is null
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	public com.scobolsolo.application.Message setToAccountId(java.lang.Integer argToAccountId);

	/**
	 * sets the {@code ToAccountId} to the value of {@code argToAccountId}
	 *
	 * @param argToAccountId the new value of {@code ToAccountId}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.Message setToAccountId(int argToAccountId);

	/**
	 * object accessor for the {@code Text}
	 *
	 * <p>The {@code Text} field is a direct mapping of the {@code text} field in {@code message}.</p>
	 *
	 * @return an object value of {@code Text} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 2147483647L)
	public java.lang.String getText();

	/**
	 * sets the {@code Text} to the value of {@code argText}
	 *
	 * @param argText the new value of {@code Text}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code text} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argText is null
	 * @throws com.opal.ArgumentTooLongException if {@code argText} is longer than 2147483647 characters
	 * <p>The database column {@code text} is limited to 2147483647 characters.</p>
	 *
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 2147483647L)
	public com.scobolsolo.application.Message setText(java.lang.String argText);

	/**
	 * object accessor for the {@code SentTimestamp}
	 *
	 * <p>The {@code SentTimestamp} field is a direct mapping of the {@code sent_timestamp} field in {@code message}.</p>
	 *
	 * @return an object value of {@code SentTimestamp} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.CurrentDateTimeDefault
	public java.time.LocalDateTime getSentTimestamp();

	/**
	 * sets the {@code SentTimestamp} to the value of {@code argSentTimestamp}
	 *
	 * @param argSentTimestamp the new value of {@code SentTimestamp}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code sent_timestamp} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argSentTimestamp is null
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.CurrentDateTimeDefault
	public com.scobolsolo.application.Message setSentTimestamp(java.time.LocalDateTime argSentTimestamp);

	/**
	 * object accessor for the {@code AcknowledgedTimestamp}
	 *
	 * <p>The {@code AcknowledgedTimestamp} field is a direct mapping of the {@code acknowledged_timestamp} field in {@code message}.</p>
	 *
	 * @return an object value of {@code AcknowledgedTimestamp} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	public java.time.LocalDateTime getAcknowledgedTimestamp();

	/**
	 * object accessor for the {@code AcknowledgedTimestamp} with substitution for a null value
	 *
	 * <p>The {@code AcknowledgedTimestamp} field is a direct mapping of the {@code acknowledged_timestamp} database column in the table {@code message}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code AcknowledgedTimestamp} is {@code null}.
	 * @return an object value of {@code AcknowledgedTimestamp} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getAcknowledgedTimestamp(java.lang.String argStringToSubstituteIfNull) {
		java.time.LocalDateTime lclO = getAcknowledgedTimestamp();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the {@code AcknowledgedTimestamp} to the value of {@code argAcknowledgedTimestamp}
	 *
	 * @param argAcknowledgedTimestamp the new value of {@code AcknowledgedTimestamp}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	public com.scobolsolo.application.Message setAcknowledgedTimestamp(java.time.LocalDateTime argAcknowledgedTimestamp);

	/**
	 * object accessor for the {@code Archived}
	 *
	 * <p>The {@code Archived} field is a direct mapping of the {@code archived} field in {@code message}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isArchived() method.</p>
	 *
	 * @return an object value of {@code Archived} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	public java.lang.Boolean isArchivedAsObject();

	/**
	 * primitive accessor for the {@code Archived}
	 *
	 * <p>The {@code Archived} field is a direct mapping of the {@code archived} database column in the table {@code message}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the isArchivedAsObject() method.</p>
	 *
	 * @return the primitive value of {@code Archived} (of the current {@link com.opal.TransactionContext})
	 */
	default public boolean isArchived() {
		java.lang.Boolean lclO = isArchivedAsObject();
		return lclO.booleanValue();
	}

	/**
	 * sets the {@code Archived} to the value of {@code argArchived}
	 *
	 * @param argArchived the new value of {@code Archived}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code archived} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argArchived is null
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	public com.scobolsolo.application.Message setArchived(java.lang.Boolean argArchived);

	/**
	 * sets the {@code Archived} to the value of {@code argArchived}
	 *
	 * @param argArchived the new value of {@code Archived}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.Message setArchived(boolean argArchived);

	/**
	 * @return the {@code com.scobolsolo.application.Account}
	 * The returned {@code com.scobolsolo.application.Account} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code account} that is referenced by {@code message_from_account_id_fkey}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = false)
	public com.scobolsolo.application.Account getFromAccount();
	public com.scobolsolo.application.Message setFromAccount(com.scobolsolo.application.Account argFromAccount);

	/**
	 * @return the {@code com.scobolsolo.application.Account}
	 * The returned {@code com.scobolsolo.application.Account} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code account} that is referenced by {@code message_to_account_id_fkey}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = false)
	public com.scobolsolo.application.Account getToAccount();
	public com.scobolsolo.application.Message setToAccount(com.scobolsolo.application.Account argToAccount);

	public com.scobolsolo.application.Message copy();

	/** This is a Comparator that can be used to compare Message objects based on their {@code Id} values. */

	public static class IdComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Message> {
		private static final IdComparator ourInstance = new IdComparator();
		public static final IdComparator getInstance() { return ourInstance; }

		private IdComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Message argFirst, com.scobolsolo.application.Message argSecond) {
			return argFirst.getIdAsObject().compareTo(argSecond.getIdAsObject());
		}
	}

}
