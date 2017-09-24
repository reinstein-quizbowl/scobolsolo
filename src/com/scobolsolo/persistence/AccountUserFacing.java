package com.scobolsolo.persistence;


/**
 * represents a {@code Account} from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from {@code account}.  Do not modify this class directly; instead, alter the permanent storage on which it is based, the Opal configuration file for the project, and/or the {@link com.scobolsolo.application.Account}, and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various {@code forXXX} methods on the {@link com.scobolsolo.application.AccountFactory} factory class.  To create new instances, use the {@code create()} method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link com.opal.TransactionContext}.</p>
 *
 * <p>This interface is not meant to be referenced in user code.  Only the {@link com.scobolsolo.application.Account} and the {@link com.scobolsolo.application.AccountFactory} class should be referenced directly.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
	@com.opal.annotation.Creatability(creatable = true)
	@com.opal.annotation.Updatability(updatable = true)
public interface AccountUserFacing extends com.opal.IdentityUserFacing {

	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the {@code Id}
	 *
	 * <p>The {@code Id} field is a direct mapping of the {@code id} field in {@code account}.</p>
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
	 * <p>The {@code Id} field is a direct mapping of the {@code id} database column in the table {@code account}.</p>
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
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Account setId(java.lang.Integer argId);

	/**
	 * sets the {@code Id} to the value of {@code argId}
	 *
	 * @param argId the new value of {@code Id}
	 * @return itself, so that mutators may be chained fluently
	 */
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Account setId(int argId);

	/**
	 * object accessor for the {@code Username}
	 *
	 * <p>The {@code Username} field is a direct mapping of the {@code username} field in {@code account}.</p>
	 *
	 * @return an object value of {@code Username} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 64L)
	public java.lang.String getUsername();

	/**
	 * sets the {@code Username} to the value of {@code argUsername}
	 *
	 * @param argUsername the new value of {@code Username}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code username} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argUsername is null
	 * @throws com.opal.ArgumentTooLongException if {@code argUsername} is longer than 64 characters
	 * <p>The database column {@code username} is limited to 64 characters.</p>
	 *
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 64L)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Account setUsername(java.lang.String argUsername);

	/**
	 * object accessor for the {@code PasswordHash}
	 *
	 * <p>The {@code PasswordHash} field is a direct mapping of the {@code password_hash} field in {@code account}.</p>
	 *
	 * @return an object value of {@code PasswordHash} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 60L)
	@com.opal.annotation.Default(value = "$2a$16$XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")
	public java.lang.String getPasswordHash();

	/**
	 * sets the {@code PasswordHash} to the value of {@code argPasswordHash}
	 *
	 * @param argPasswordHash the new value of {@code PasswordHash}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code password_hash} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argPasswordHash is null
	 * @throws com.opal.ArgumentTooLongException if {@code argPasswordHash} is longer than 60 characters
	 * <p>The database column {@code password_hash} is limited to 60 characters.</p>
	 *
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 60L)
	@com.opal.annotation.Default(value = "$2a$16$XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Account setPasswordHash(java.lang.String argPasswordHash);

	/**
	 * object accessor for the {@code Administrator}
	 *
	 * <p>The {@code Administrator} field is a direct mapping of the {@code administrator} field in {@code account}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isAdministrator() method.</p>
	 *
	 * @return an object value of {@code Administrator} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	public java.lang.Boolean isAdministratorAsObject();

	/**
	 * primitive accessor for the {@code Administrator}
	 *
	 * <p>The {@code Administrator} field is a direct mapping of the {@code administrator} database column in the table {@code account}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the isAdministratorAsObject() method.</p>
	 *
	 * @return the primitive value of {@code Administrator} (of the current {@link com.opal.TransactionContext})
	 */
	default public boolean isAdministrator() {
		java.lang.Boolean lclO = isAdministratorAsObject();
		return lclO.booleanValue();
	}

	/**
	 * sets the {@code Administrator} to the value of {@code argAdministrator}
	 *
	 * @param argAdministrator the new value of {@code Administrator}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code administrator} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argAdministrator is null
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Account setAdministrator(java.lang.Boolean argAdministrator);

	/**
	 * sets the {@code Administrator} to the value of {@code argAdministrator}
	 *
	 * @param argAdministrator the new value of {@code Administrator}
	 * @return itself, so that mutators may be chained fluently
	 */
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Account setAdministrator(boolean argAdministrator);

	/**
	 * object accessor for the {@code Active}
	 *
	 * <p>The {@code Active} field is a direct mapping of the {@code active} field in {@code account}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isActive() method.</p>
	 *
	 * @return an object value of {@code Active} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	public java.lang.Boolean isActiveAsObject();

	/**
	 * primitive accessor for the {@code Active}
	 *
	 * <p>The {@code Active} field is a direct mapping of the {@code active} database column in the table {@code account}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the isActiveAsObject() method.</p>
	 *
	 * @return the primitive value of {@code Active} (of the current {@link com.opal.TransactionContext})
	 */
	default public boolean isActive() {
		java.lang.Boolean lclO = isActiveAsObject();
		return lclO.booleanValue();
	}

	/**
	 * sets the {@code Active} to the value of {@code argActive}
	 *
	 * @param argActive the new value of {@code Active}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code active} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argActive is null
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Account setActive(java.lang.Boolean argActive);

	/**
	 * sets the {@code Active} to the value of {@code argActive}
	 *
	 * @param argActive the new value of {@code Active}
	 * @return itself, so that mutators may be chained fluently
	 */
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Account setActive(boolean argActive);

	/**
	 * object accessor for the {@code Writer}
	 *
	 * <p>The {@code Writer} field is a direct mapping of the {@code writer} field in {@code account}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isWriter() method.</p>
	 *
	 * @return an object value of {@code Writer} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	public java.lang.Boolean isWriterAsObject();

	/**
	 * primitive accessor for the {@code Writer}
	 *
	 * <p>The {@code Writer} field is a direct mapping of the {@code writer} database column in the table {@code account}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the isWriterAsObject() method.</p>
	 *
	 * @return the primitive value of {@code Writer} (of the current {@link com.opal.TransactionContext})
	 */
	default public boolean isWriter() {
		java.lang.Boolean lclO = isWriterAsObject();
		return lclO.booleanValue();
	}

	/**
	 * sets the {@code Writer} to the value of {@code argWriter}
	 *
	 * @param argWriter the new value of {@code Writer}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code writer} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argWriter is null
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Account setWriter(java.lang.Boolean argWriter);

	/**
	 * sets the {@code Writer} to the value of {@code argWriter}
	 *
	 * @param argWriter the new value of {@code Writer}
	 * @return itself, so that mutators may be chained fluently
	 */
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Account setWriter(boolean argWriter);

	/**
	 * object accessor for the {@code PasswordResetToken}
	 *
	 * <p>The {@code PasswordResetToken} field is a direct mapping of the {@code password_reset_token} field in {@code account}.</p>
	 *
	 * @return an object value of {@code PasswordResetToken} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 64L)
	public java.lang.String getPasswordResetToken();

	/**
	 * object accessor for the {@code PasswordResetToken} with substitution for a null value
	 *
	 * <p>The {@code PasswordResetToken} field is a direct mapping of the {@code password_reset_token} database column in the table {@code account}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code PasswordResetToken} is {@code null}.
	 * @return an object value of {@code PasswordResetToken} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getPasswordResetToken(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getPasswordResetToken();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the {@code PasswordResetToken} to the value of {@code argPasswordResetToken}
	 *
	 * @param argPasswordResetToken the new value of {@code PasswordResetToken}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * @throws com.opal.ArgumentTooLongException if {@code argPasswordResetToken} is longer than 64 characters
	 * <p>The database column {@code password_reset_token} is limited to 64 characters.</p>
	 *
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 64L)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Account setPasswordResetToken(java.lang.String argPasswordResetToken);

	/**
	 * object accessor for the {@code PasswordResetTokenExpiration}
	 *
	 * <p>The {@code PasswordResetTokenExpiration} field is a direct mapping of the {@code password_reset_token_expiration} field in {@code account}.</p>
	 *
	 * @return an object value of {@code PasswordResetTokenExpiration} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	public java.time.LocalDateTime getPasswordResetTokenExpiration();

	/**
	 * object accessor for the {@code PasswordResetTokenExpiration} with substitution for a null value
	 *
	 * <p>The {@code PasswordResetTokenExpiration} field is a direct mapping of the {@code password_reset_token_expiration} database column in the table {@code account}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code PasswordResetTokenExpiration} is {@code null}.
	 * @return an object value of {@code PasswordResetTokenExpiration} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getPasswordResetTokenExpiration(java.lang.String argStringToSubstituteIfNull) {
		java.time.LocalDateTime lclO = getPasswordResetTokenExpiration();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the {@code PasswordResetTokenExpiration} to the value of {@code argPasswordResetTokenExpiration}
	 *
	 * @param argPasswordResetTokenExpiration the new value of {@code PasswordResetTokenExpiration}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Account setPasswordResetTokenExpiration(java.time.LocalDateTime argPasswordResetTokenExpiration);

	/**
	 * object accessor for the {@code CanReceiveUnsolicitedMessages}
	 *
	 * <p>The {@code CanReceiveUnsolicitedMessages} field is a direct mapping of the {@code can_receive_unsolicited_messages} field in {@code account}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isCanReceiveUnsolicitedMessages() method.</p>
	 *
	 * @return an object value of {@code CanReceiveUnsolicitedMessages} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	public java.lang.Boolean isCanReceiveUnsolicitedMessagesAsObject();

	/**
	 * primitive accessor for the {@code CanReceiveUnsolicitedMessages}
	 *
	 * <p>The {@code CanReceiveUnsolicitedMessages} field is a direct mapping of the {@code can_receive_unsolicited_messages} database column in the table {@code account}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the isCanReceiveUnsolicitedMessagesAsObject() method.</p>
	 *
	 * @return the primitive value of {@code CanReceiveUnsolicitedMessages} (of the current {@link com.opal.TransactionContext})
	 */
	default public boolean isCanReceiveUnsolicitedMessages() {
		java.lang.Boolean lclO = isCanReceiveUnsolicitedMessagesAsObject();
		return lclO.booleanValue();
	}

	/**
	 * sets the {@code CanReceiveUnsolicitedMessages} to the value of {@code argCanReceiveUnsolicitedMessages}
	 *
	 * @param argCanReceiveUnsolicitedMessages the new value of {@code CanReceiveUnsolicitedMessages}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code can_receive_unsolicited_messages} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argCanReceiveUnsolicitedMessages is null
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Account setCanReceiveUnsolicitedMessages(java.lang.Boolean argCanReceiveUnsolicitedMessages);

	/**
	 * sets the {@code CanReceiveUnsolicitedMessages} to the value of {@code argCanReceiveUnsolicitedMessages}
	 *
	 * @param argCanReceiveUnsolicitedMessages the new value of {@code CanReceiveUnsolicitedMessages}
	 * @return itself, so that mutators may be chained fluently
	 */
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Account setCanReceiveUnsolicitedMessages(boolean argCanReceiveUnsolicitedMessages);

	/**
	 * @return the {@code com.scobolsolo.application.Contact}
	 * The returned {@code com.scobolsolo.application.Contact} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code contact} that is referenced by {@code account_id_fkey}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = false)
	public com.scobolsolo.application.Contact getContact();
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Account setContact(com.scobolsolo.application.Contact argContact);

	public java.util.Set<com.scobolsolo.application.PronunciationGuideSuppression> getPronunciationGuideSuppressionSet();

	default public java.util.stream.Stream<com.scobolsolo.application.PronunciationGuideSuppression> streamPronunciationGuideSuppression() {
		return getPronunciationGuideSuppressionSet().stream();
	}

	default public com.scobolsolo.application.PronunciationGuideSuppression[] createPronunciationGuideSuppressionArray() {
		java.util.Set<com.scobolsolo.application.PronunciationGuideSuppression> lclS = getPronunciationGuideSuppressionSet();
		return lclS.toArray(new com.scobolsolo.application.PronunciationGuideSuppression[lclS.size()]);
	}

	public java.util.Set<com.scobolsolo.application.Question> getWriterQuestionSet();

	default public java.util.stream.Stream<com.scobolsolo.application.Question> streamWriterQuestion() {
		return getWriterQuestionSet().stream();
	}

	default public com.scobolsolo.application.Question[] createWriterQuestionArray() {
		java.util.Set<com.scobolsolo.application.Question> lclS = getWriterQuestionSet();
		return lclS.toArray(new com.scobolsolo.application.Question[lclS.size()]);
	}

	public java.util.Set<com.scobolsolo.application.Diff> getEditorDiffSet();

	default public java.util.stream.Stream<com.scobolsolo.application.Diff> streamEditorDiff() {
		return getEditorDiffSet().stream();
	}

	default public com.scobolsolo.application.Diff[] createEditorDiffArray() {
		java.util.Set<com.scobolsolo.application.Diff> lclS = getEditorDiffSet();
		return lclS.toArray(new com.scobolsolo.application.Diff[lclS.size()]);
	}

	public java.util.Set<com.scobolsolo.application.Message> getFromMessageSet();

	default public java.util.stream.Stream<com.scobolsolo.application.Message> streamFromMessage() {
		return getFromMessageSet().stream();
	}

	default public com.scobolsolo.application.Message[] createFromMessageArray() {
		java.util.Set<com.scobolsolo.application.Message> lclS = getFromMessageSet();
		return lclS.toArray(new com.scobolsolo.application.Message[lclS.size()]);
	}

	public java.util.Set<com.scobolsolo.application.Message> getToMessageSet();

	default public java.util.stream.Stream<com.scobolsolo.application.Message> streamToMessage() {
		return getToMessageSet().stream();
	}

	default public com.scobolsolo.application.Message[] createToMessageArray() {
		java.util.Set<com.scobolsolo.application.Message> lclS = getToMessageSet();
		return lclS.toArray(new com.scobolsolo.application.Message[lclS.size()]);
	}

	public com.scobolsolo.application.Account copy();

	/** This is a Comparator that can be used to compare Account objects based on their {@code Id} values. */

	public static class IdComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Account> {
		private static final IdComparator ourInstance = new IdComparator();
		public static final IdComparator getInstance() { return ourInstance; }

		private IdComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Account argFirst, com.scobolsolo.application.Account argSecond) {
			return argFirst.getIdAsObject().compareTo(argSecond.getIdAsObject());
		}
	}

	public static class NameComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Account> {
		private static final NameComparator ourInstance = new NameComparator();
		public static final NameComparator getInstance() { return ourInstance; }

		private NameComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Account argFirst, com.scobolsolo.application.Account argSecond) {
			return com.scobolsolo.application.Contact.SortByComparator.getInstance().compare(argFirst.getContact(),  argSecond.getContact());
		}
	}

}
