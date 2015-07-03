package com.scobolsolo.persistence;

import com.opal.*;

/**
 * represents a {@code Player} from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from {@code player}.  Do not modify this class directly; instead, alter the permanent storage on which it is based, the Opal configuration file for the project, and/or the {@link com.scobolsolo.application.Player}, and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various {@code forXXX} methods on the {@link com.scobolsolo.application.PlayerFactory} factory class.  To create new instances, use the {@code create()} method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link com.opal.TransactionContext}.</p>
 *
 * <p>This interface is not meant to be referenced in user code.  Only the {@link com.scobolsolo.application.Player} and the {@link com.scobolsolo.application.PlayerFactory} class should be referenced directly.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
public interface PlayerUserFacing extends IdentityUserFacing {
	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the {@code Id}
	 *
	 * <p>The {@code Id} field is a direct mapping of the {@code id} field in {@code player}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getId() method.</p>
	 *
	 * @return an object value of {@code Id} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.Integer getIdAsObject();

	/**
	 * primitive accessor for the {@code Id}
	 *
	 * <p>The {@code Id} field is a direct mapping of the {@code id} database column in the table {@code player}.</p>
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
	 * @throws IllegalNullArgumentException if argId is null
	 */
	@com.opal.annotation.NotNull
	public com.scobolsolo.application.Player setId(java.lang.Integer argId);

	/**
	 * sets the {@code Id} to the value of {@code argId}
	 *
	 * @param argId the new value of {@code Id}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.Player setId(int argId);

	/**
	 * object accessor for the {@code ContactId}
	 *
	 * <p>The {@code ContactId} field is a direct mapping of the {@code contact_id} field in {@code player}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getContactId() method.</p>
	 *
	 * @return an object value of {@code ContactId} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.Integer getContactIdAsObject();

	/**
	 * primitive accessor for the {@code ContactId}
	 *
	 * <p>The {@code ContactId} field is a direct mapping of the {@code contact_id} database column in the table {@code player}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getContactIdAsObject() method.</p>
	 *
	 * @return the primitive value of {@code ContactId} (of the current {@link com.opal.TransactionContext})
	 */
	default public int getContactId() {
		java.lang.Integer lclO = getContactIdAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the {@code ContactId} to the value of {@code argContactId}
	 *
	 * @param argContactId the new value of {@code ContactId}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code contact_id} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argContactId is null
	 */
	@com.opal.annotation.NotNull
	public com.scobolsolo.application.Player setContactId(java.lang.Integer argContactId);

	/**
	 * sets the {@code ContactId} to the value of {@code argContactId}
	 *
	 * @param argContactId the new value of {@code ContactId}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.Player setContactId(int argContactId);

	/**
	 * object accessor for the {@code SchoolRegistrationId}
	 *
	 * <p>The {@code SchoolRegistrationId} field is a direct mapping of the {@code school_registration_id} field in {@code player}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getSchoolRegistrationId() method.</p>
	 *
	 * @return an object value of {@code SchoolRegistrationId} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	public java.lang.Integer getSchoolRegistrationIdAsObject();

	/**
	 * object accessor for the {@code SchoolRegistrationId} with substitution for a null value
	 *
	 * <p>The {@code SchoolRegistrationId} field is a direct mapping of the {@code school_registration_id} database column in the table {@code player}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code SchoolRegistrationId} is {@code null}.
	 * @return an object value of {@code SchoolRegistrationId} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getSchoolRegistrationIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getSchoolRegistrationIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code SchoolRegistrationId}
	 *
	 * <p>The {@code SchoolRegistrationId} field is a direct mapping of the {@code school_registration_id} database column in the table {@code player}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getSchoolRegistrationIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code SchoolRegistrationId} (of the current {@link com.opal.TransactionContext})
	 * @throws NullValueException when the internal value is null
	 */
	default public int getSchoolRegistrationId() throws com.opal.NullValueException {
		java.lang.Integer lclO = getSchoolRegistrationIdAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getSchoolRegistrationId(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getSchoolRegistrationIdAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getSchoolRegistrationId(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getSchoolRegistrationIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * sets the {@code SchoolRegistrationId} to the value of {@code argSchoolRegistrationId}
	 *
	 * @param argSchoolRegistrationId the new value of {@code SchoolRegistrationId}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 */
	public com.scobolsolo.application.Player setSchoolRegistrationId(java.lang.Integer argSchoolRegistrationId);

	/**
	 * sets the {@code SchoolRegistrationId} to the value of {@code argSchoolRegistrationId}
	 *
	 * @param argSchoolRegistrationId the new value of {@code SchoolRegistrationId}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.Player setSchoolRegistrationId(int argSchoolRegistrationId);

	/**
	 * object accessor for the {@code SchoolYearCode}
	 *
	 * <p>The {@code SchoolYearCode} field is a direct mapping of the {@code school_year_code} field in {@code player}.</p>
	 *
	 * @return an object value of {@code SchoolYearCode} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	public java.lang.String getSchoolYearCode();

	/**
	 * object accessor for the {@code SchoolYearCode} with substitution for a null value
	 *
	 * <p>The {@code SchoolYearCode} field is a direct mapping of the {@code school_year_code} database column in the table {@code player}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code SchoolYearCode} is {@code null}.
	 * @return an object value of {@code SchoolYearCode} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getSchoolYearCode(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getSchoolYearCode();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the {@code SchoolYearCode} to the value of {@code argSchoolYearCode}
	 *
	 * @param argSchoolYearCode the new value of {@code SchoolYearCode}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * @throws ArgumentTooLongException if {@code argSchoolYearCode} is longer than 32 characters
	 * <p>The database column {@code school_year_code} is limited to 32 characters.</p>
	 *
	 */
	@com.opal.annotation.Length(maximum = 32L)
	public com.scobolsolo.application.Player setSchoolYearCode(java.lang.String argSchoolYearCode);

	/**
	 * object accessor for the {@code RankWithinSchool}
	 *
	 * <p>The {@code RankWithinSchool} field is a direct mapping of the {@code rank_within_school} field in {@code player}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getRankWithinSchool() method.</p>
	 *
	 * @return an object value of {@code RankWithinSchool} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	public java.lang.Integer getRankWithinSchoolAsObject();

	/**
	 * object accessor for the {@code RankWithinSchool} with substitution for a null value
	 *
	 * <p>The {@code RankWithinSchool} field is a direct mapping of the {@code rank_within_school} database column in the table {@code player}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code RankWithinSchool} is {@code null}.
	 * @return an object value of {@code RankWithinSchool} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getRankWithinSchoolAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getRankWithinSchoolAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code RankWithinSchool}
	 *
	 * <p>The {@code RankWithinSchool} field is a direct mapping of the {@code rank_within_school} database column in the table {@code player}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getRankWithinSchoolAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code RankWithinSchool} (of the current {@link com.opal.TransactionContext})
	 * @throws NullValueException when the internal value is null
	 */
	default public int getRankWithinSchool() throws com.opal.NullValueException {
		java.lang.Integer lclO = getRankWithinSchoolAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getRankWithinSchool(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getRankWithinSchoolAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getRankWithinSchool(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getRankWithinSchoolAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * sets the {@code RankWithinSchool} to the value of {@code argRankWithinSchool}
	 *
	 * @param argRankWithinSchool the new value of {@code RankWithinSchool}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 */
	public com.scobolsolo.application.Player setRankWithinSchool(java.lang.Integer argRankWithinSchool);

	/**
	 * sets the {@code RankWithinSchool} to the value of {@code argRankWithinSchool}
	 *
	 * @param argRankWithinSchool the new value of {@code RankWithinSchool}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.Player setRankWithinSchool(int argRankWithinSchool);

	/**
	 * object accessor for the {@code Seed}
	 *
	 * <p>The {@code Seed} field is a direct mapping of the {@code seed} field in {@code player}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getSeed() method.</p>
	 *
	 * @return an object value of {@code Seed} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	public java.lang.Integer getSeedAsObject();

	/**
	 * object accessor for the {@code Seed} with substitution for a null value
	 *
	 * <p>The {@code Seed} field is a direct mapping of the {@code seed} database column in the table {@code player}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code Seed} is {@code null}.
	 * @return an object value of {@code Seed} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getSeedAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getSeedAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code Seed}
	 *
	 * <p>The {@code Seed} field is a direct mapping of the {@code seed} database column in the table {@code player}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getSeedAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code Seed} (of the current {@link com.opal.TransactionContext})
	 * @throws NullValueException when the internal value is null
	 */
	default public int getSeed() throws com.opal.NullValueException {
		java.lang.Integer lclO = getSeedAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getSeed(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getSeedAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getSeed(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getSeedAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * sets the {@code Seed} to the value of {@code argSeed}
	 *
	 * @param argSeed the new value of {@code Seed}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 */
	public com.scobolsolo.application.Player setSeed(java.lang.Integer argSeed);

	/**
	 * sets the {@code Seed} to the value of {@code argSeed}
	 *
	 * @param argSeed the new value of {@code Seed}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.Player setSeed(int argSeed);

	/**
	 * object accessor for the {@code Note}
	 *
	 * <p>The {@code Note} field is a direct mapping of the {@code note} field in {@code player}.</p>
	 *
	 * @return an object value of {@code Note} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	public java.lang.String getNote();

	/**
	 * object accessor for the {@code Note} with substitution for a null value
	 *
	 * <p>The {@code Note} field is a direct mapping of the {@code note} database column in the table {@code player}.</p>
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
	 * @throws ArgumentTooLongException if {@code argNote} is longer than 2147483647 characters
	 * <p>The database column {@code note} is limited to 2147483647 characters.</p>
	 *
	 */
	@com.opal.annotation.Length(maximum = 2147483647L)
	public com.scobolsolo.application.Player setNote(java.lang.String argNote);

	/**
	 * object accessor for the {@code InitialCardId}
	 *
	 * <p>The {@code InitialCardId} field is a direct mapping of the {@code initial_card_id} field in {@code player}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getInitialCardId() method.</p>
	 *
	 * @return an object value of {@code InitialCardId} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	public java.lang.Integer getInitialCardIdAsObject();

	/**
	 * object accessor for the {@code InitialCardId} with substitution for a null value
	 *
	 * <p>The {@code InitialCardId} field is a direct mapping of the {@code initial_card_id} database column in the table {@code player}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code InitialCardId} is {@code null}.
	 * @return an object value of {@code InitialCardId} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getInitialCardIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getInitialCardIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code InitialCardId}
	 *
	 * <p>The {@code InitialCardId} field is a direct mapping of the {@code initial_card_id} database column in the table {@code player}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getInitialCardIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code InitialCardId} (of the current {@link com.opal.TransactionContext})
	 * @throws NullValueException when the internal value is null
	 */
	default public int getInitialCardId() throws com.opal.NullValueException {
		java.lang.Integer lclO = getInitialCardIdAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getInitialCardId(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getInitialCardIdAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getInitialCardId(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getInitialCardIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * sets the {@code InitialCardId} to the value of {@code argInitialCardId}
	 *
	 * @param argInitialCardId the new value of {@code InitialCardId}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 */
	public com.scobolsolo.application.Player setInitialCardId(java.lang.Integer argInitialCardId);

	/**
	 * sets the {@code InitialCardId} to the value of {@code argInitialCardId}
	 *
	 * @param argInitialCardId the new value of {@code InitialCardId}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.Player setInitialCardId(int argInitialCardId);

	/**
	 * object accessor for the {@code Exhibition}
	 *
	 * <p>The {@code Exhibition} field is a direct mapping of the {@code exhibition} field in {@code player}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isExhibition() method.</p>
	 *
	 * @return an object value of {@code Exhibition} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.Boolean isExhibitionAsObject();

	/**
	 * primitive accessor for the {@code Exhibition}
	 *
	 * <p>The {@code Exhibition} field is a direct mapping of the {@code exhibition} database column in the table {@code player}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the isExhibitionAsObject() method.</p>
	 *
	 * @return the primitive value of {@code Exhibition} (of the current {@link com.opal.TransactionContext})
	 */
	default public boolean isExhibition() {
		java.lang.Boolean lclO = isExhibitionAsObject();
		return lclO.booleanValue();
	}

	/**
	 * sets the {@code Exhibition} to the value of {@code argExhibition}
	 *
	 * @param argExhibition the new value of {@code Exhibition}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code exhibition} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argExhibition is null
	 */
	@com.opal.annotation.NotNull
	public com.scobolsolo.application.Player setExhibition(java.lang.Boolean argExhibition);

	/**
	 * sets the {@code Exhibition} to the value of {@code argExhibition}
	 *
	 * @param argExhibition the new value of {@code Exhibition}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.Player setExhibition(boolean argExhibition);

	/**
	 * @return the {@code com.scobolsolo.application.Contact}
	 * The returned {@code com.scobolsolo.application.Contact} is the {@link UserFacing} object corresponding to the entry in {@code contact} that is referenced by {@code player_contact_id_fkey}.
	 *
	 */
	public com.scobolsolo.application.Contact getContact();
	public com.scobolsolo.application.Player setContact(com.scobolsolo.application.Contact argContact);

	/**
	 * @return the {@code com.scobolsolo.application.Card}
	 * The returned {@code com.scobolsolo.application.Card} is the {@link UserFacing} object corresponding to the entry in {@code card} that is referenced by {@code player_initial_card_id_fkey}.
	 *
	 */
	public com.scobolsolo.application.Card getInitialCard();
	public com.scobolsolo.application.Player setInitialCard(com.scobolsolo.application.Card argInitialCard);

	/**
	 * @return the {@code com.scobolsolo.application.SchoolRegistration}
	 * The returned {@code com.scobolsolo.application.SchoolRegistration} is the {@link UserFacing} object corresponding to the entry in {@code school_registration} that is referenced by {@code player_registration_id_fkey}.
	 *
	 */
	public com.scobolsolo.application.SchoolRegistration getSchoolRegistration();
	public com.scobolsolo.application.Player setSchoolRegistration(com.scobolsolo.application.SchoolRegistration argSchoolRegistration);

	/**
	 * @return the {@code com.scobolsolo.application.SchoolYear}
	 * The returned {@code com.scobolsolo.application.SchoolYear} is the {@link UserFacing} object corresponding to the entry in {@code school_year} that is referenced by {@code player_school_year_code_fkey}.
	 *
	 */
	public com.scobolsolo.application.SchoolYear getSchoolYear();
	public com.scobolsolo.application.Player setSchoolYear(com.scobolsolo.application.SchoolYear argSchoolYear);

	public int getIncomingLosingCardGameCount();
	public java.util.Iterator<com.scobolsolo.application.Game> createIncomingLosingCardGameIterator();

	public java.util.stream.Stream<com.scobolsolo.application.Game> streamIncomingLosingCardGame();

	public void addIncomingLosingCardGame(com.scobolsolo.application.Game argGame);
	public void removeIncomingLosingCardGame(com.scobolsolo.application.Game argGame);
	public void clearIncomingLosingCardGame();

	default public <T extends java.util.Collection<? super com.scobolsolo.application.Game>> T acquireIncomingLosingCardGame(T argC) {
		if (argC == null) { throw new IllegalArgumentException("Target Collection is null."); }
		java.util.Iterator<com.scobolsolo.application.Game> lclI = createIncomingLosingCardGameIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public com.scobolsolo.application.Game[] createIncomingLosingCardGameArray() {
		int lclLength = getIncomingLosingCardGameCount();
		com.scobolsolo.application.Game[] lclA = new com.scobolsolo.application.Game[lclLength];
		int lclIndex = 0;
		java.util.Iterator<com.scobolsolo.application.Game> lclI = createIncomingLosingCardGameIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public int getIncomingWinningCardGameCount();
	public java.util.Iterator<com.scobolsolo.application.Game> createIncomingWinningCardGameIterator();

	public java.util.stream.Stream<com.scobolsolo.application.Game> streamIncomingWinningCardGame();

	public void addIncomingWinningCardGame(com.scobolsolo.application.Game argGame);
	public void removeIncomingWinningCardGame(com.scobolsolo.application.Game argGame);
	public void clearIncomingWinningCardGame();

	default public <T extends java.util.Collection<? super com.scobolsolo.application.Game>> T acquireIncomingWinningCardGame(T argC) {
		if (argC == null) { throw new IllegalArgumentException("Target Collection is null."); }
		java.util.Iterator<com.scobolsolo.application.Game> lclI = createIncomingWinningCardGameIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public com.scobolsolo.application.Game[] createIncomingWinningCardGameArray() {
		int lclLength = getIncomingWinningCardGameCount();
		com.scobolsolo.application.Game[] lclA = new com.scobolsolo.application.Game[lclLength];
		int lclIndex = 0;
		java.util.Iterator<com.scobolsolo.application.Game> lclI = createIncomingWinningCardGameIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public int getOutgoingLosingCardGameCount();
	public java.util.Iterator<com.scobolsolo.application.Game> createOutgoingLosingCardGameIterator();

	public java.util.stream.Stream<com.scobolsolo.application.Game> streamOutgoingLosingCardGame();

	public void addOutgoingLosingCardGame(com.scobolsolo.application.Game argGame);
	public void removeOutgoingLosingCardGame(com.scobolsolo.application.Game argGame);
	public void clearOutgoingLosingCardGame();

	default public <T extends java.util.Collection<? super com.scobolsolo.application.Game>> T acquireOutgoingLosingCardGame(T argC) {
		if (argC == null) { throw new IllegalArgumentException("Target Collection is null."); }
		java.util.Iterator<com.scobolsolo.application.Game> lclI = createOutgoingLosingCardGameIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public com.scobolsolo.application.Game[] createOutgoingLosingCardGameArray() {
		int lclLength = getOutgoingLosingCardGameCount();
		com.scobolsolo.application.Game[] lclA = new com.scobolsolo.application.Game[lclLength];
		int lclIndex = 0;
		java.util.Iterator<com.scobolsolo.application.Game> lclI = createOutgoingLosingCardGameIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public int getOutgoingWinningCardGameCount();
	public java.util.Iterator<com.scobolsolo.application.Game> createOutgoingWinningCardGameIterator();

	public java.util.stream.Stream<com.scobolsolo.application.Game> streamOutgoingWinningCardGame();

	public void addOutgoingWinningCardGame(com.scobolsolo.application.Game argGame);
	public void removeOutgoingWinningCardGame(com.scobolsolo.application.Game argGame);
	public void clearOutgoingWinningCardGame();

	default public <T extends java.util.Collection<? super com.scobolsolo.application.Game>> T acquireOutgoingWinningCardGame(T argC) {
		if (argC == null) { throw new IllegalArgumentException("Target Collection is null."); }
		java.util.Iterator<com.scobolsolo.application.Game> lclI = createOutgoingWinningCardGameIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public com.scobolsolo.application.Game[] createOutgoingWinningCardGameArray() {
		int lclLength = getOutgoingWinningCardGameCount();
		com.scobolsolo.application.Game[] lclA = new com.scobolsolo.application.Game[lclLength];
		int lclIndex = 0;
		java.util.Iterator<com.scobolsolo.application.Game> lclI = createOutgoingWinningCardGameIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public int getPerformanceCount();
	public java.util.Iterator<com.scobolsolo.application.Performance> createPerformanceIterator();

	public java.util.stream.Stream<com.scobolsolo.application.Performance> streamPerformance();

	public void addPerformance(com.scobolsolo.application.Performance argPerformance);
	public void removePerformance(com.scobolsolo.application.Performance argPerformance);
	public void clearPerformance();

	default public <T extends java.util.Collection<? super com.scobolsolo.application.Performance>> T acquirePerformance(T argC) {
		if (argC == null) { throw new IllegalArgumentException("Target Collection is null."); }
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

	public com.scobolsolo.application.Player copy();

	/** This is a Comparator that can be used to compare Player objects based on their {@code Id} values. */

	public static class IdComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Player> {
		private static final IdComparator ourInstance = new IdComparator();
		public static final IdComparator getInstance() { return ourInstance; }

		private IdComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Player argFirst, com.scobolsolo.application.Player argSecond) {
			return argFirst.getIdAsObject().compareTo(argSecond.getIdAsObject());
		}
	}

	public static class NameComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Player> {
		private static final NameComparator ourInstance = new NameComparator();
		public static final NameComparator getInstance() { return ourInstance; }

		private NameComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Player argFirst, com.scobolsolo.application.Player argSecond) {
			return com.scobolsolo.application.Contact.SortByComparator.getInstance().compare(argFirst.getContact(),  argSecond.getContact());
		}
	}

	public static class RankWithinSchoolComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Player> {
		private static final RankWithinSchoolComparator ourInstance = new RankWithinSchoolComparator();
		public static final RankWithinSchoolComparator getInstance() { return ourInstance; }

		private RankWithinSchoolComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Player argFirst, com.scobolsolo.application.Player argSecond) {
			int lclResult = nullSafeCompare(argFirst.getRankWithinSchoolAsObject(), argSecond.getRankWithinSchoolAsObject());
			if (lclResult != 0) {
				return lclResult;
			}
			return com.scobolsolo.application.Contact.SortByComparator.getInstance().compare(argFirst.getContact(),  argSecond.getContact());
		}
	}

	public static class SeedComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Player> {
		private static final SeedComparator ourInstance = new SeedComparator();
		public static final SeedComparator getInstance() { return ourInstance; }

		private SeedComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Player argFirst, com.scobolsolo.application.Player argSecond) {
			int lclResult = nullSafeCompare(argFirst.getSeedAsObject(), argSecond.getSeedAsObject());
			if (lclResult != 0) {
				return lclResult;
			}
			return com.scobolsolo.application.Contact.SortByComparator.getInstance().compare(argFirst.getContact(),  argSecond.getContact());
		}
	}

	public static class TournamentDateComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Player> {
		private static final TournamentDateComparator ourInstance = new TournamentDateComparator();
		public static final TournamentDateComparator getInstance() { return ourInstance; }

		private TournamentDateComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Player argFirst, com.scobolsolo.application.Player argSecond) {
			return com.scobolsolo.application.SchoolRegistration.TournamentDateComparator.getInstance().compare(argFirst.getSchoolRegistration(),  argSecond.getSchoolRegistration());
		}
	}

	public static class SchoolNameComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Player> {
		private static final SchoolNameComparator ourInstance = new SchoolNameComparator();
		public static final SchoolNameComparator getInstance() { return ourInstance; }

		private SchoolNameComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Player argFirst, com.scobolsolo.application.Player argSecond) {
			return com.scobolsolo.application.SchoolRegistration.SchoolNameComparator.getInstance().compare(argFirst.getSchoolRegistration(),  argSecond.getSchoolRegistration());
		}
	}

	public static class SchoolShortNameComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Player> {
		private static final SchoolShortNameComparator ourInstance = new SchoolShortNameComparator();
		public static final SchoolShortNameComparator getInstance() { return ourInstance; }

		private SchoolShortNameComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Player argFirst, com.scobolsolo.application.Player argSecond) {
			return com.scobolsolo.application.SchoolRegistration.SchoolNameComparator.getInstance().compare(argFirst.getSchoolRegistration(),  argSecond.getSchoolRegistration());
		}
	}

}
