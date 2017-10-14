package com.scobolsolo.persistence;


/**
 * represents a {@code Diff} from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from {@code diff}.  Do not modify this class directly; instead, alter the permanent storage on which it is based, the Opal configuration file for the project, and/or the {@link com.scobolsolo.application.Diff}, and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various {@code forXXX} methods on the {@link com.scobolsolo.application.DiffFactory} factory class.  To create new instances, use the {@code create()} method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link com.opal.TransactionContext}.</p>
 *
 * <p>This interface is not meant to be referenced in user code.  Only the {@link com.scobolsolo.application.Diff} and the {@link com.scobolsolo.application.DiffFactory} class should be referenced directly.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
	@com.opal.annotation.Creatability(creatable = true)
	@com.opal.annotation.Updatability(updatable = true)
public interface DiffUserFacing extends com.opal.IdentityUserFacing {

	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the {@code Id}
	 *
	 * <p>The {@code Id} field is a direct mapping of the {@code id} field in {@code diff}.</p>
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
	 * <p>The {@code Id} field is a direct mapping of the {@code id} database column in the table {@code diff}.</p>
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
	public com.scobolsolo.application.Diff setId(java.lang.Integer argId);

	/**
	 * sets the {@code Id} to the value of {@code argId}
	 *
	 * @param argId the new value of {@code Id}
	 * @return itself, so that mutators may be chained fluently
	 */
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Diff setId(int argId);

	/**
	 * object accessor for the {@code EditorAccountId}
	 *
	 * <p>The {@code EditorAccountId} field is a direct mapping of the {@code editor_account_id} field in {@code diff}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getEditorAccountId() method.</p>
	 *
	 * @return an object value of {@code EditorAccountId} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	public java.lang.Integer getEditorAccountIdAsObject();

	/**
	 * primitive accessor for the {@code EditorAccountId}
	 *
	 * <p>The {@code EditorAccountId} field is a direct mapping of the {@code editor_account_id} database column in the table {@code diff}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getEditorAccountIdAsObject() method.</p>
	 *
	 * @return the primitive value of {@code EditorAccountId} (of the current {@link com.opal.TransactionContext})
	 */
	default public int getEditorAccountId() {
		java.lang.Integer lclO = getEditorAccountIdAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the {@code EditorAccountId} to the value of {@code argEditorAccountId}
	 *
	 * @param argEditorAccountId the new value of {@code EditorAccountId}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code editor_account_id} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argEditorAccountId is null
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Diff setEditorAccountId(java.lang.Integer argEditorAccountId);

	/**
	 * sets the {@code EditorAccountId} to the value of {@code argEditorAccountId}
	 *
	 * @param argEditorAccountId the new value of {@code EditorAccountId}
	 * @return itself, so that mutators may be chained fluently
	 */
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Diff setEditorAccountId(int argEditorAccountId);

	/**
	 * object accessor for the {@code Text}
	 *
	 * <p>The {@code Text} field is a direct mapping of the {@code text} field in {@code diff}.</p>
	 *
	 * @return an object value of {@code Text} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	public java.lang.String getText();

	/**
	 * object accessor for the {@code Text} with substitution for a null value
	 *
	 * <p>The {@code Text} field is a direct mapping of the {@code text} database column in the table {@code diff}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code Text} is {@code null}.
	 * @return an object value of {@code Text} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getText(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getText();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the {@code Text} to the value of {@code argText}
	 *
	 * @param argText the new value of {@code Text}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * @throws com.opal.ArgumentTooLongException if {@code argText} is longer than 2147483647 characters
	 * <p>The database column {@code text} is limited to 2147483647 characters.</p>
	 *
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Diff setText(java.lang.String argText);

	/**
	 * object accessor for the {@code Answer}
	 *
	 * <p>The {@code Answer} field is a direct mapping of the {@code answer} field in {@code diff}.</p>
	 *
	 * @return an object value of {@code Answer} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	public java.lang.String getAnswer();

	/**
	 * object accessor for the {@code Answer} with substitution for a null value
	 *
	 * <p>The {@code Answer} field is a direct mapping of the {@code answer} database column in the table {@code diff}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code Answer} is {@code null}.
	 * @return an object value of {@code Answer} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getAnswer(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getAnswer();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the {@code Answer} to the value of {@code argAnswer}
	 *
	 * @param argAnswer the new value of {@code Answer}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * @throws com.opal.ArgumentTooLongException if {@code argAnswer} is longer than 2147483647 characters
	 * <p>The database column {@code answer} is limited to 2147483647 characters.</p>
	 *
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Diff setAnswer(java.lang.String argAnswer);

	/**
	 * object accessor for the {@code Note}
	 *
	 * <p>The {@code Note} field is a direct mapping of the {@code note} field in {@code diff}.</p>
	 *
	 * @return an object value of {@code Note} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	public java.lang.String getNote();

	/**
	 * object accessor for the {@code Note} with substitution for a null value
	 *
	 * <p>The {@code Note} field is a direct mapping of the {@code note} database column in the table {@code diff}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code Note} is {@code null}.
	 * @return an object value of {@code Note} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getNote(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getNote();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the {@code Note} to the value of {@code argNote}
	 *
	 * @param argNote the new value of {@code Note}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * @throws com.opal.ArgumentTooLongException if {@code argNote} is longer than 2147483647 characters
	 * <p>The database column {@code note} is limited to 2147483647 characters.</p>
	 *
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Diff setNote(java.lang.String argNote);

	/**
	 * object accessor for the {@code Remark}
	 *
	 * <p>The {@code Remark} field is a direct mapping of the {@code remark} field in {@code diff}.</p>
	 *
	 * @return an object value of {@code Remark} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	public java.lang.String getRemark();

	/**
	 * object accessor for the {@code Remark} with substitution for a null value
	 *
	 * <p>The {@code Remark} field is a direct mapping of the {@code remark} database column in the table {@code diff}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code Remark} is {@code null}.
	 * @return an object value of {@code Remark} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getRemark(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getRemark();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the {@code Remark} to the value of {@code argRemark}
	 *
	 * @param argRemark the new value of {@code Remark}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * @throws com.opal.ArgumentTooLongException if {@code argRemark} is longer than 2147483647 characters
	 * <p>The database column {@code remark} is limited to 2147483647 characters.</p>
	 *
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Diff setRemark(java.lang.String argRemark);

	/**
	 * object accessor for the {@code EditDistance}
	 *
	 * <p>The {@code EditDistance} field is a direct mapping of the {@code edit_distance} field in {@code diff}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getEditDistance() method.</p>
	 *
	 * @return an object value of {@code EditDistance} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	public java.lang.Integer getEditDistanceAsObject();

	/**
	 * primitive accessor for the {@code EditDistance}
	 *
	 * <p>The {@code EditDistance} field is a direct mapping of the {@code edit_distance} database column in the table {@code diff}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getEditDistanceAsObject() method.</p>
	 *
	 * @return the primitive value of {@code EditDistance} (of the current {@link com.opal.TransactionContext})
	 */
	default public int getEditDistance() {
		java.lang.Integer lclO = getEditDistanceAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the {@code EditDistance} to the value of {@code argEditDistance}
	 *
	 * @param argEditDistance the new value of {@code EditDistance}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code edit_distance} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argEditDistance is null
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Diff setEditDistance(java.lang.Integer argEditDistance);

	/**
	 * sets the {@code EditDistance} to the value of {@code argEditDistance}
	 *
	 * @param argEditDistance the new value of {@code EditDistance}
	 * @return itself, so that mutators may be chained fluently
	 */
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Diff setEditDistance(int argEditDistance);

	/**
	 * object accessor for the {@code Timestamp}
	 *
	 * <p>The {@code Timestamp} field is a direct mapping of the {@code timestamp} field in {@code diff}.</p>
	 *
	 * @return an object value of {@code Timestamp} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.CurrentDateTimeDefault
	public java.time.LocalDateTime getTimestamp();

	/**
	 * object accessor for the {@code Timestamp} with substitution for a null value
	 *
	 * <p>The {@code Timestamp} field is a direct mapping of the {@code timestamp} database column in the table {@code diff}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code Timestamp} is {@code null}.
	 * @return an object value of {@code Timestamp} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getTimestamp(java.lang.String argStringToSubstituteIfNull) {
		java.time.LocalDateTime lclO = getTimestamp();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the {@code Timestamp} to the value of {@code argTimestamp}
	 *
	 * @param argTimestamp the new value of {@code Timestamp}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.CurrentDateTimeDefault
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Diff setTimestamp(java.time.LocalDateTime argTimestamp);

	/**
	 * object accessor for the {@code QuestionId}
	 *
	 * <p>The {@code QuestionId} field is a direct mapping of the {@code question_id} field in {@code diff}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getQuestionId() method.</p>
	 *
	 * @return an object value of {@code QuestionId} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	public java.lang.Integer getQuestionIdAsObject();

	/**
	 * primitive accessor for the {@code QuestionId}
	 *
	 * <p>The {@code QuestionId} field is a direct mapping of the {@code question_id} database column in the table {@code diff}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getQuestionIdAsObject() method.</p>
	 *
	 * @return the primitive value of {@code QuestionId} (of the current {@link com.opal.TransactionContext})
	 */
	default public int getQuestionId() {
		java.lang.Integer lclO = getQuestionIdAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the {@code QuestionId} to the value of {@code argQuestionId}
	 *
	 * @param argQuestionId the new value of {@code QuestionId}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code question_id} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argQuestionId is null
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Diff setQuestionId(java.lang.Integer argQuestionId);

	/**
	 * sets the {@code QuestionId} to the value of {@code argQuestionId}
	 *
	 * @param argQuestionId the new value of {@code QuestionId}
	 * @return itself, so that mutators may be chained fluently
	 */
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Diff setQuestionId(int argQuestionId);

	/**
	 * object accessor for the {@code RevisionNumber}
	 *
	 * <p>The {@code RevisionNumber} field is a direct mapping of the {@code revision_number} field in {@code diff}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getRevisionNumber() method.</p>
	 *
	 * @return an object value of {@code RevisionNumber} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	public java.lang.Integer getRevisionNumberAsObject();

	/**
	 * primitive accessor for the {@code RevisionNumber}
	 *
	 * <p>The {@code RevisionNumber} field is a direct mapping of the {@code revision_number} database column in the table {@code diff}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getRevisionNumberAsObject() method.</p>
	 *
	 * @return the primitive value of {@code RevisionNumber} (of the current {@link com.opal.TransactionContext})
	 */
	default public int getRevisionNumber() {
		java.lang.Integer lclO = getRevisionNumberAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the {@code RevisionNumber} to the value of {@code argRevisionNumber}
	 *
	 * @param argRevisionNumber the new value of {@code RevisionNumber}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code revision_number} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argRevisionNumber is null
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Diff setRevisionNumber(java.lang.Integer argRevisionNumber);

	/**
	 * sets the {@code RevisionNumber} to the value of {@code argRevisionNumber}
	 *
	 * @param argRevisionNumber the new value of {@code RevisionNumber}
	 * @return itself, so that mutators may be chained fluently
	 */
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Diff setRevisionNumber(int argRevisionNumber);

	/**
	 * object accessor for the {@code QuestionStatusCode}
	 *
	 * <p>The {@code QuestionStatusCode} field is a direct mapping of the {@code question_status_code} field in {@code diff}.</p>
	 *
	 * @return an object value of {@code QuestionStatusCode} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	public java.lang.String getQuestionStatusCode();

	/**
	 * sets the {@code QuestionStatusCode} to the value of {@code argQuestionStatusCode}
	 *
	 * @param argQuestionStatusCode the new value of {@code QuestionStatusCode}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code question_status_code} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argQuestionStatusCode is null
	 * @throws com.opal.ArgumentTooLongException if {@code argQuestionStatusCode} is longer than 32 characters
	 * <p>The database column {@code question_status_code} is limited to 32 characters.</p>
	 *
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Diff setQuestionStatusCode(java.lang.String argQuestionStatusCode);

	/**
	 * object accessor for the {@code CategoryCode}
	 *
	 * <p>The {@code CategoryCode} field is a direct mapping of the {@code category_code} field in {@code diff}.</p>
	 *
	 * @return an object value of {@code CategoryCode} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	public java.lang.String getCategoryCode();

	/**
	 * sets the {@code CategoryCode} to the value of {@code argCategoryCode}
	 *
	 * @param argCategoryCode the new value of {@code CategoryCode}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code category_code} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argCategoryCode is null
	 * @throws com.opal.ArgumentTooLongException if {@code argCategoryCode} is longer than 32 characters
	 * <p>The database column {@code category_code} is limited to 32 characters.</p>
	 *
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Diff setCategoryCode(java.lang.String argCategoryCode);

	/**
	 * object accessor for the {@code TextLength}
	 *
	 * <p>The {@code TextLength} field is a direct mapping of the {@code text_length} field in {@code diff}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getTextLength() method.</p>
	 *
	 * @return an object value of {@code TextLength} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	public java.lang.Integer getTextLengthAsObject();

	/**
	 * primitive accessor for the {@code TextLength}
	 *
	 * <p>The {@code TextLength} field is a direct mapping of the {@code text_length} database column in the table {@code diff}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getTextLengthAsObject() method.</p>
	 *
	 * @return the primitive value of {@code TextLength} (of the current {@link com.opal.TransactionContext})
	 */
	default public int getTextLength() {
		java.lang.Integer lclO = getTextLengthAsObject();
		return lclO.intValue();
	}

	/**
	 * @return the {@code com.scobolsolo.application.Category}
	 * The returned {@code com.scobolsolo.application.Category} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code category} that is referenced by {@code diff_category_code_fkey}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = false)
	public com.scobolsolo.application.Category getCategory();
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Diff setCategory(com.scobolsolo.application.Category argCategory);

	/**
	 * @return the {@code com.scobolsolo.application.Account}
	 * The returned {@code com.scobolsolo.application.Account} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code account} that is referenced by {@code diff_editor_account_id_fkey}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = false)
	public com.scobolsolo.application.Account getEditor();
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Diff setEditor(com.scobolsolo.application.Account argEditor);

	/**
	 * @return the {@code com.scobolsolo.application.Question}
	 * The returned {@code com.scobolsolo.application.Question} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code question} that is referenced by {@code diff_question_id_fkey}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = false)
	public com.scobolsolo.application.Question getQuestion();
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Diff setQuestion(com.scobolsolo.application.Question argQuestion);

	/**
	 * @return the {@code com.scobolsolo.application.QuestionStatus}
	 * The returned {@code com.scobolsolo.application.QuestionStatus} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code question_status} that is referenced by {@code diff_question_status_code_fkey}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = false)
	public com.scobolsolo.application.QuestionStatus getStatus();
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Diff setStatus(com.scobolsolo.application.QuestionStatus argStatus);

	public java.util.Set<com.scobolsolo.application.Response> getResponseSet();

	default public java.util.stream.Stream<com.scobolsolo.application.Response> streamResponse() {
		return getResponseSet().stream();
	}

	default public com.scobolsolo.application.Response[] createResponseArray() {
		java.util.Set<com.scobolsolo.application.Response> lclS = getResponseSet();
		return lclS.toArray(new com.scobolsolo.application.Response[lclS.size()]);
	}

	public com.scobolsolo.application.Diff copy();

	/** This is a Comparator that can be used to compare Diff objects based on their {@code Id} values. */

	public static class IdComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Diff> {
		private static final IdComparator ourInstance = new IdComparator();
		public static final IdComparator getInstance() { return ourInstance; }

		private IdComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Diff argFirst, com.scobolsolo.application.Diff argSecond) {
			return argFirst.getIdAsObject().compareTo(argSecond.getIdAsObject());
		}
	}

	/** This is a Comparator that can be used to compare Diff objects based on their {@code RevisionNumber} values. */

	public static class RevisionNumberComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Diff> {
		private static final RevisionNumberComparator ourInstance = new RevisionNumberComparator();
		public static final RevisionNumberComparator getInstance() { return ourInstance; }

		private RevisionNumberComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Diff argFirst, com.scobolsolo.application.Diff argSecond) {
			return argFirst.getRevisionNumberAsObject().compareTo(argSecond.getRevisionNumberAsObject());
		}
	}

}
