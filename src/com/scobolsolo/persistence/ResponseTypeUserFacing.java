package com.scobolsolo.persistence;


/**
 * represents a {@code ResponseType} from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from {@code response_type}.  Do not modify this class directly; instead, alter the permanent storage on which it is based, the Opal configuration file for the project, and/or the {@link com.scobolsolo.application.ResponseType}, and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various {@code forXXX} methods on the {@link com.scobolsolo.application.ResponseTypeFactory} factory class.  To create new instances, use the {@code create()} method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link com.opal.TransactionContext}.</p>
 *
 * <p>This interface is not meant to be referenced in user code.  Only the {@link com.scobolsolo.application.ResponseType} and the {@link com.scobolsolo.application.ResponseTypeFactory} class should be referenced directly.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
public interface ResponseTypeUserFacing extends com.opal.IdentityUserFacing, Comparable<com.scobolsolo.application.ResponseType> {

	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the {@code Code}
	 *
	 * <p>The {@code Code} field is a direct mapping of the {@code code} field in {@code response_type}.</p>
	 *
	 * @return an object value of {@code Code} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	public java.lang.String getCode();

	/**
	 * sets the {@code Code} to the value of {@code argCode}
	 *
	 * @param argCode the new value of {@code Code}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code code} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argCode is null
	 * @throws com.opal.ArgumentTooLongException if {@code argCode} is longer than 32 characters
	 * <p>The database column {@code code} is limited to 32 characters.</p>
	 *
	 */
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	public com.scobolsolo.application.ResponseType setCode(java.lang.String argCode);

	/**
	 * object accessor for the {@code Name}
	 *
	 * <p>The {@code Name} field is a direct mapping of the {@code name} field in {@code response_type}.</p>
	 *
	 * @return an object value of {@code Name} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	public java.lang.String getName();

	/**
	 * sets the {@code Name} to the value of {@code argName}
	 *
	 * @param argName the new value of {@code Name}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code name} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argName is null
	 * @throws com.opal.ArgumentTooLongException if {@code argName} is longer than 256 characters
	 * <p>The database column {@code name} is limited to 256 characters.</p>
	 *
	 */
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	public com.scobolsolo.application.ResponseType setName(java.lang.String argName);

	/**
	 * object accessor for the {@code ShortName}
	 *
	 * <p>The {@code ShortName} field is a direct mapping of the {@code short_name} field in {@code response_type}.</p>
	 *
	 * @return an object value of {@code ShortName} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	public java.lang.String getShortName();

	/**
	 * sets the {@code ShortName} to the value of {@code argShortName}
	 *
	 * @param argShortName the new value of {@code ShortName}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code short_name} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argShortName is null
	 * @throws com.opal.ArgumentTooLongException if {@code argShortName} is longer than 32 characters
	 * <p>The database column {@code short_name} is limited to 32 characters.</p>
	 *
	 */
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	public com.scobolsolo.application.ResponseType setShortName(java.lang.String argShortName);

	/**
	 * object accessor for the {@code Sequence}
	 *
	 * <p>The {@code Sequence} field is a direct mapping of the {@code sequence} field in {@code response_type}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getSequence() method.</p>
	 *
	 * @return an object value of {@code Sequence} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Nullability(nullable = false)
	public java.lang.Integer getSequenceAsObject();

	/**
	 * primitive accessor for the {@code Sequence}
	 *
	 * <p>The {@code Sequence} field is a direct mapping of the {@code sequence} database column in the table {@code response_type}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getSequenceAsObject() method.</p>
	 *
	 * @return the primitive value of {@code Sequence} (of the current {@link com.opal.TransactionContext})
	 */
	default public int getSequence() {
		java.lang.Integer lclO = getSequenceAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the {@code Sequence} to the value of {@code argSequence}
	 *
	 * @param argSequence the new value of {@code Sequence}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code sequence} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argSequence is null
	 */
	@com.opal.annotation.Nullability(nullable = false)
	public com.scobolsolo.application.ResponseType setSequence(java.lang.Integer argSequence);

	/**
	 * sets the {@code Sequence} to the value of {@code argSequence}
	 *
	 * @param argSequence the new value of {@code Sequence}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.ResponseType setSequence(int argSequence);

	/**
	 * object accessor for the {@code Points}
	 *
	 * <p>The {@code Points} field is a direct mapping of the {@code points} field in {@code response_type}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getPoints() method.</p>
	 *
	 * @return an object value of {@code Points} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Nullability(nullable = false)
	public java.lang.Integer getPointsAsObject();

	/**
	 * primitive accessor for the {@code Points}
	 *
	 * <p>The {@code Points} field is a direct mapping of the {@code points} database column in the table {@code response_type}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getPointsAsObject() method.</p>
	 *
	 * @return the primitive value of {@code Points} (of the current {@link com.opal.TransactionContext})
	 */
	default public int getPoints() {
		java.lang.Integer lclO = getPointsAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the {@code Points} to the value of {@code argPoints}
	 *
	 * @param argPoints the new value of {@code Points}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code points} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argPoints is null
	 */
	@com.opal.annotation.Nullability(nullable = false)
	public com.scobolsolo.application.ResponseType setPoints(java.lang.Integer argPoints);

	/**
	 * sets the {@code Points} to the value of {@code argPoints}
	 *
	 * @param argPoints the new value of {@code Points}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.ResponseType setPoints(int argPoints);

	/**
	 * object accessor for the {@code Default}
	 *
	 * <p>The {@code Default} field is a direct mapping of the {@code is_default} field in {@code response_type}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isDefault() method.</p>
	 *
	 * @return an object value of {@code Default} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	public java.lang.Boolean isDefaultAsObject();

	/**
	 * primitive accessor for the {@code Default}
	 *
	 * <p>The {@code Default} field is a direct mapping of the {@code is_default} database column in the table {@code response_type}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the isDefaultAsObject() method.</p>
	 *
	 * @return the primitive value of {@code Default} (of the current {@link com.opal.TransactionContext})
	 */
	default public boolean isDefault() {
		java.lang.Boolean lclO = isDefaultAsObject();
		return lclO.booleanValue();
	}

	/**
	 * sets the {@code Default} to the value of {@code argDefault}
	 *
	 * @param argDefault the new value of {@code Default}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code is_default} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argDefault is null
	 */
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	public com.scobolsolo.application.ResponseType setDefault(java.lang.Boolean argDefault);

	/**
	 * sets the {@code Default} to the value of {@code argDefault}
	 *
	 * @param argDefault the new value of {@code Default}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.ResponseType setDefault(boolean argDefault);

	/**
	 * object accessor for the {@code MultipleAllowedForSamePlacement}
	 *
	 * <p>The {@code MultipleAllowedForSamePlacement} field is a direct mapping of the {@code multiple_allowed_for_same_placement} field in {@code response_type}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isMultipleAllowedForSamePlacement() method.</p>
	 *
	 * @return an object value of {@code MultipleAllowedForSamePlacement} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	public java.lang.Boolean isMultipleAllowedForSamePlacementAsObject();

	/**
	 * primitive accessor for the {@code MultipleAllowedForSamePlacement}
	 *
	 * <p>The {@code MultipleAllowedForSamePlacement} field is a direct mapping of the {@code multiple_allowed_for_same_placement} database column in the table {@code response_type}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the isMultipleAllowedForSamePlacementAsObject() method.</p>
	 *
	 * @return the primitive value of {@code MultipleAllowedForSamePlacement} (of the current {@link com.opal.TransactionContext})
	 */
	default public boolean isMultipleAllowedForSamePlacement() {
		java.lang.Boolean lclO = isMultipleAllowedForSamePlacementAsObject();
		return lclO.booleanValue();
	}

	/**
	 * sets the {@code MultipleAllowedForSamePlacement} to the value of {@code argMultipleAllowedForSamePlacement}
	 *
	 * @param argMultipleAllowedForSamePlacement the new value of {@code MultipleAllowedForSamePlacement}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code multiple_allowed_for_same_placement} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argMultipleAllowedForSamePlacement is null
	 */
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	public com.scobolsolo.application.ResponseType setMultipleAllowedForSamePlacement(java.lang.Boolean argMultipleAllowedForSamePlacement);

	/**
	 * sets the {@code MultipleAllowedForSamePlacement} to the value of {@code argMultipleAllowedForSamePlacement}
	 *
	 * @param argMultipleAllowedForSamePlacement the new value of {@code MultipleAllowedForSamePlacement}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.ResponseType setMultipleAllowedForSamePlacement(boolean argMultipleAllowedForSamePlacement);

	/**
	 * object accessor for the {@code Attempt}
	 *
	 * <p>The {@code Attempt} field is a direct mapping of the {@code is_attempt} field in {@code response_type}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isAttempt() method.</p>
	 *
	 * @return an object value of {@code Attempt} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	public java.lang.Boolean isAttemptAsObject();

	/**
	 * primitive accessor for the {@code Attempt}
	 *
	 * <p>The {@code Attempt} field is a direct mapping of the {@code is_attempt} database column in the table {@code response_type}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the isAttemptAsObject() method.</p>
	 *
	 * @return the primitive value of {@code Attempt} (of the current {@link com.opal.TransactionContext})
	 */
	default public boolean isAttempt() {
		java.lang.Boolean lclO = isAttemptAsObject();
		return lclO.booleanValue();
	}

	/**
	 * sets the {@code Attempt} to the value of {@code argAttempt}
	 *
	 * @param argAttempt the new value of {@code Attempt}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code is_attempt} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argAttempt is null
	 */
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	public com.scobolsolo.application.ResponseType setAttempt(java.lang.Boolean argAttempt);

	/**
	 * sets the {@code Attempt} to the value of {@code argAttempt}
	 *
	 * @param argAttempt the new value of {@code Attempt}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.ResponseType setAttempt(boolean argAttempt);

	/**
	 * object accessor for the {@code FurtherAttemptsToSameQuestionInMatch}
	 *
	 * <p>The {@code FurtherAttemptsToSameQuestionInMatch} field is a direct mapping of the {@code allows_further_attempts_to_same_question_in_match} field in {@code response_type}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the allowsFurtherAttemptsToSameQuestionInMatch() method.</p>
	 *
	 * @return an object value of {@code FurtherAttemptsToSameQuestionInMatch} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	public java.lang.Boolean allowsFurtherAttemptsToSameQuestionInMatchAsObject();

	/**
	 * primitive accessor for the {@code FurtherAttemptsToSameQuestionInMatch}
	 *
	 * <p>The {@code FurtherAttemptsToSameQuestionInMatch} field is a direct mapping of the {@code allows_further_attempts_to_same_question_in_match} database column in the table {@code response_type}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the allowsFurtherAttemptsToSameQuestionInMatchAsObject() method.</p>
	 *
	 * @return the primitive value of {@code FurtherAttemptsToSameQuestionInMatch} (of the current {@link com.opal.TransactionContext})
	 */
	default public boolean allowsFurtherAttemptsToSameQuestionInMatch() {
		java.lang.Boolean lclO = allowsFurtherAttemptsToSameQuestionInMatchAsObject();
		return lclO.booleanValue();
	}

	/**
	 * sets the {@code FurtherAttemptsToSameQuestionInMatch} to the value of {@code argFurtherAttemptsToSameQuestionInMatch}
	 *
	 * @param argFurtherAttemptsToSameQuestionInMatch the new value of {@code FurtherAttemptsToSameQuestionInMatch}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code allows_further_attempts_to_same_question_in_match} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argFurtherAttemptsToSameQuestionInMatch is null
	 */
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	public com.scobolsolo.application.ResponseType setFurtherAttemptsToSameQuestionInMatch(java.lang.Boolean argFurtherAttemptsToSameQuestionInMatch);

	/**
	 * sets the {@code FurtherAttemptsToSameQuestionInMatch} to the value of {@code argFurtherAttemptsToSameQuestionInMatch}
	 *
	 * @param argFurtherAttemptsToSameQuestionInMatch the new value of {@code FurtherAttemptsToSameQuestionInMatch}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.ResponseType setFurtherAttemptsToSameQuestionInMatch(boolean argFurtherAttemptsToSameQuestionInMatch);

	/**
	 * object accessor for the {@code ShowForNonExhibitionPlayers}
	 *
	 * <p>The {@code ShowForNonExhibitionPlayers} field is a direct mapping of the {@code show_for_non_exhibition_players} field in {@code response_type}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isShowForNonExhibitionPlayers() method.</p>
	 *
	 * @return an object value of {@code ShowForNonExhibitionPlayers} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	public java.lang.Boolean isShowForNonExhibitionPlayersAsObject();

	/**
	 * primitive accessor for the {@code ShowForNonExhibitionPlayers}
	 *
	 * <p>The {@code ShowForNonExhibitionPlayers} field is a direct mapping of the {@code show_for_non_exhibition_players} database column in the table {@code response_type}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the isShowForNonExhibitionPlayersAsObject() method.</p>
	 *
	 * @return the primitive value of {@code ShowForNonExhibitionPlayers} (of the current {@link com.opal.TransactionContext})
	 */
	default public boolean isShowForNonExhibitionPlayers() {
		java.lang.Boolean lclO = isShowForNonExhibitionPlayersAsObject();
		return lclO.booleanValue();
	}

	/**
	 * sets the {@code ShowForNonExhibitionPlayers} to the value of {@code argShowForNonExhibitionPlayers}
	 *
	 * @param argShowForNonExhibitionPlayers the new value of {@code ShowForNonExhibitionPlayers}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code show_for_non_exhibition_players} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argShowForNonExhibitionPlayers is null
	 */
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	public com.scobolsolo.application.ResponseType setShowForNonExhibitionPlayers(java.lang.Boolean argShowForNonExhibitionPlayers);

	/**
	 * sets the {@code ShowForNonExhibitionPlayers} to the value of {@code argShowForNonExhibitionPlayers}
	 *
	 * @param argShowForNonExhibitionPlayers the new value of {@code ShowForNonExhibitionPlayers}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.ResponseType setShowForNonExhibitionPlayers(boolean argShowForNonExhibitionPlayers);

	/**
	 * object accessor for the {@code ShowForExhibitionPlayers}
	 *
	 * <p>The {@code ShowForExhibitionPlayers} field is a direct mapping of the {@code show_for_exhibition_players} field in {@code response_type}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isShowForExhibitionPlayers() method.</p>
	 *
	 * @return an object value of {@code ShowForExhibitionPlayers} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	public java.lang.Boolean isShowForExhibitionPlayersAsObject();

	/**
	 * primitive accessor for the {@code ShowForExhibitionPlayers}
	 *
	 * <p>The {@code ShowForExhibitionPlayers} field is a direct mapping of the {@code show_for_exhibition_players} database column in the table {@code response_type}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the isShowForExhibitionPlayersAsObject() method.</p>
	 *
	 * @return the primitive value of {@code ShowForExhibitionPlayers} (of the current {@link com.opal.TransactionContext})
	 */
	default public boolean isShowForExhibitionPlayers() {
		java.lang.Boolean lclO = isShowForExhibitionPlayersAsObject();
		return lclO.booleanValue();
	}

	/**
	 * sets the {@code ShowForExhibitionPlayers} to the value of {@code argShowForExhibitionPlayers}
	 *
	 * @param argShowForExhibitionPlayers the new value of {@code ShowForExhibitionPlayers}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code show_for_exhibition_players} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argShowForExhibitionPlayers is null
	 */
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	public com.scobolsolo.application.ResponseType setShowForExhibitionPlayers(java.lang.Boolean argShowForExhibitionPlayers);

	/**
	 * sets the {@code ShowForExhibitionPlayers} to the value of {@code argShowForExhibitionPlayers}
	 *
	 * @param argShowForExhibitionPlayers the new value of {@code ShowForExhibitionPlayers}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.ResponseType setShowForExhibitionPlayers(boolean argShowForExhibitionPlayers);

	/**
	 * object accessor for the {@code ShowInReports}
	 *
	 * <p>The {@code ShowInReports} field is a direct mapping of the {@code show_in_reports} field in {@code response_type}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isShowInReports() method.</p>
	 *
	 * @return an object value of {@code ShowInReports} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	public java.lang.Boolean isShowInReportsAsObject();

	/**
	 * primitive accessor for the {@code ShowInReports}
	 *
	 * <p>The {@code ShowInReports} field is a direct mapping of the {@code show_in_reports} database column in the table {@code response_type}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the isShowInReportsAsObject() method.</p>
	 *
	 * @return the primitive value of {@code ShowInReports} (of the current {@link com.opal.TransactionContext})
	 */
	default public boolean isShowInReports() {
		java.lang.Boolean lclO = isShowInReportsAsObject();
		return lclO.booleanValue();
	}

	/**
	 * sets the {@code ShowInReports} to the value of {@code argShowInReports}
	 *
	 * @param argShowInReports the new value of {@code ShowInReports}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code show_in_reports} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argShowInReports is null
	 */
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	public com.scobolsolo.application.ResponseType setShowInReports(java.lang.Boolean argShowInReports);

	/**
	 * sets the {@code ShowInReports} to the value of {@code argShowInReports}
	 *
	 * @param argShowInReports the new value of {@code ShowInReports}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.ResponseType setShowInReports(boolean argShowInReports);

	public com.scobolsolo.application.ResponseType copy();

	/** This is a Comparator that can be used to compare ResponseType objects based on their {@code Code} values. */

	public static class CodeComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.ResponseType> {
		private static final CodeComparator ourInstance = new CodeComparator();
		public static final CodeComparator getInstance() { return ourInstance; }

		private CodeComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.ResponseType argFirst, com.scobolsolo.application.ResponseType argSecond) {
			return argFirst.getCode().compareToIgnoreCase(argSecond.getCode());
		}
	}

	/** This is a Comparator that can be used to compare ResponseType objects based on their {@code Name} values. */

	public static class NameComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.ResponseType> {
		private static final NameComparator ourInstance = new NameComparator();
		public static final NameComparator getInstance() { return ourInstance; }

		private NameComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.ResponseType argFirst, com.scobolsolo.application.ResponseType argSecond) {
			return argFirst.getName().compareToIgnoreCase(argSecond.getName());
		}
	}

	/** This is a Comparator that can be used to compare ResponseType objects based on their {@code ShortName} values. */

	public static class ShortNameComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.ResponseType> {
		private static final ShortNameComparator ourInstance = new ShortNameComparator();
		public static final ShortNameComparator getInstance() { return ourInstance; }

		private ShortNameComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.ResponseType argFirst, com.scobolsolo.application.ResponseType argSecond) {
			return argFirst.getShortName().compareToIgnoreCase(argSecond.getShortName());
		}
	}

	/** This is a Comparator that can be used to compare ResponseType objects based on their {@code Sequence} values. */

	public static class SequenceComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.ResponseType> {
		private static final SequenceComparator ourInstance = new SequenceComparator();
		public static final SequenceComparator getInstance() { return ourInstance; }

		private SequenceComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.ResponseType argFirst, com.scobolsolo.application.ResponseType argSecond) {
			return argFirst.getSequenceAsObject().compareTo(argSecond.getSequenceAsObject());
		}
	}

}
