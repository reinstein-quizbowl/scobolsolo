package com.scobolsolo.persistence;


/**
 * represents a {@code Tournament} from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from {@code tournament}.  Do not modify this class directly; instead, alter the permanent storage on which it is based, the Opal configuration file for the project, and/or the {@link com.scobolsolo.application.Tournament}, and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various {@code forXXX} methods on the {@link com.scobolsolo.application.TournamentFactory} factory class.  To create new instances, use the {@code create()} method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link com.opal.TransactionContext}.</p>
 *
 * <p>This interface is not meant to be referenced in user code.  Only the {@link com.scobolsolo.application.Tournament} and the {@link com.scobolsolo.application.TournamentFactory} class should be referenced directly.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
	@com.opal.annotation.Creatability(creatable = true)
	@com.opal.annotation.Updatability(updatable = true)
public interface TournamentUserFacing extends com.opal.IdentityUserFacing, Comparable<com.scobolsolo.application.Tournament> {

	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the {@code Date}
	 *
	 * <p>The {@code Date} field is a direct mapping of the {@code date} field in {@code tournament}.</p>
	 *
	 * @return an object value of {@code Date} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	public java.time.LocalDate getDate();

	/**
	 * sets the {@code Date} to the value of {@code argDate}
	 *
	 * @param argDate the new value of {@code Date}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code date} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argDate is null
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Tournament setDate(java.time.LocalDate argDate);

	/**
	 * object accessor for the {@code Name}
	 *
	 * <p>The {@code Name} field is a direct mapping of the {@code name} field in {@code tournament}.</p>
	 *
	 * @return an object value of {@code Name} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
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
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Tournament setName(java.lang.String argName);

	/**
	 * object accessor for the {@code ShortName}
	 *
	 * <p>The {@code ShortName} field is a direct mapping of the {@code short_name} field in {@code tournament}.</p>
	 *
	 * @return an object value of {@code ShortName} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
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
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Tournament setShortName(java.lang.String argShortName);

	/**
	 * object accessor for the {@code Code}
	 *
	 * <p>The {@code Code} field is a direct mapping of the {@code code} field in {@code tournament}.</p>
	 *
	 * @return an object value of {@code Code} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
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
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Tournament setCode(java.lang.String argCode);

	/**
	 * object accessor for the {@code WebXmlRoleCode}
	 *
	 * <p>The {@code WebXmlRoleCode} field is a direct mapping of the {@code web_xml_role_code} field in {@code tournament}.</p>
	 *
	 * @return an object value of {@code WebXmlRoleCode} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	public java.lang.String getWebXmlRoleCode();

	/**
	 * sets the {@code WebXmlRoleCode} to the value of {@code argWebXmlRoleCode}
	 *
	 * @param argWebXmlRoleCode the new value of {@code WebXmlRoleCode}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code web_xml_role_code} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argWebXmlRoleCode is null
	 * @throws com.opal.ArgumentTooLongException if {@code argWebXmlRoleCode} is longer than 32 characters
	 * <p>The database column {@code web_xml_role_code} is limited to 32 characters.</p>
	 *
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Tournament setWebXmlRoleCode(java.lang.String argWebXmlRoleCode);

	/**
	 * object accessor for the {@code TiebreakerSuddenDeath}
	 *
	 * <p>The {@code TiebreakerSuddenDeath} field is a direct mapping of the {@code tiebreaker_sudden_death} field in {@code tournament}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isTiebreakerSuddenDeath() method.</p>
	 *
	 * @return an object value of {@code TiebreakerSuddenDeath} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	public java.lang.Boolean isTiebreakerSuddenDeathAsObject();

	/**
	 * primitive accessor for the {@code TiebreakerSuddenDeath}
	 *
	 * <p>The {@code TiebreakerSuddenDeath} field is a direct mapping of the {@code tiebreaker_sudden_death} database column in the table {@code tournament}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the isTiebreakerSuddenDeathAsObject() method.</p>
	 *
	 * @return the primitive value of {@code TiebreakerSuddenDeath} (of the current {@link com.opal.TransactionContext})
	 */
	default public boolean isTiebreakerSuddenDeath() {
		java.lang.Boolean lclO = isTiebreakerSuddenDeathAsObject();
		return lclO.booleanValue();
	}

	/**
	 * sets the {@code TiebreakerSuddenDeath} to the value of {@code argTiebreakerSuddenDeath}
	 *
	 * @param argTiebreakerSuddenDeath the new value of {@code TiebreakerSuddenDeath}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code tiebreaker_sudden_death} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argTiebreakerSuddenDeath is null
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Tournament setTiebreakerSuddenDeath(java.lang.Boolean argTiebreakerSuddenDeath);

	/**
	 * sets the {@code TiebreakerSuddenDeath} to the value of {@code argTiebreakerSuddenDeath}
	 *
	 * @param argTiebreakerSuddenDeath the new value of {@code TiebreakerSuddenDeath}
	 * @return itself, so that mutators may be chained fluently
	 */
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Tournament setTiebreakerSuddenDeath(boolean argTiebreakerSuddenDeath);

	/**
	 * object accessor for the {@code Url}
	 *
	 * <p>The {@code Url} field is a direct mapping of the {@code url} field in {@code tournament}.</p>
	 *
	 * @return an object value of {@code Url} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	public java.lang.String getUrl();

	/**
	 * object accessor for the {@code Url} with substitution for a null value
	 *
	 * <p>The {@code Url} field is a direct mapping of the {@code url} database column in the table {@code tournament}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code Url} is {@code null}.
	 * @return an object value of {@code Url} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getUrl(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getUrl();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the {@code Url} to the value of {@code argUrl}
	 *
	 * @param argUrl the new value of {@code Url}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * @throws com.opal.ArgumentTooLongException if {@code argUrl} is longer than 2147483647 characters
	 * <p>The database column {@code url} is limited to 2147483647 characters.</p>
	 *
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Tournament setUrl(java.lang.String argUrl);

	/**
	 * object accessor for the {@code TournamentDirectorContactId}
	 *
	 * <p>The {@code TournamentDirectorContactId} field is a direct mapping of the {@code tournament_director_contact_id} field in {@code tournament}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getTournamentDirectorContactId() method.</p>
	 *
	 * @return an object value of {@code TournamentDirectorContactId} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	public java.lang.Integer getTournamentDirectorContactIdAsObject();

	/**
	 * primitive accessor for the {@code TournamentDirectorContactId}
	 *
	 * <p>The {@code TournamentDirectorContactId} field is a direct mapping of the {@code tournament_director_contact_id} database column in the table {@code tournament}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getTournamentDirectorContactIdAsObject() method.</p>
	 *
	 * @return the primitive value of {@code TournamentDirectorContactId} (of the current {@link com.opal.TransactionContext})
	 */
	default public int getTournamentDirectorContactId() {
		java.lang.Integer lclO = getTournamentDirectorContactIdAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the {@code TournamentDirectorContactId} to the value of {@code argTournamentDirectorContactId}
	 *
	 * @param argTournamentDirectorContactId the new value of {@code TournamentDirectorContactId}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code tournament_director_contact_id} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argTournamentDirectorContactId is null
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Tournament setTournamentDirectorContactId(java.lang.Integer argTournamentDirectorContactId);

	/**
	 * sets the {@code TournamentDirectorContactId} to the value of {@code argTournamentDirectorContactId}
	 *
	 * @param argTournamentDirectorContactId the new value of {@code TournamentDirectorContactId}
	 * @return itself, so that mutators may be chained fluently
	 */
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Tournament setTournamentDirectorContactId(int argTournamentDirectorContactId);

	/**
	 * object accessor for the {@code PlayerMessage}
	 *
	 * <p>The {@code PlayerMessage} field is a direct mapping of the {@code player_message} field in {@code tournament}.</p>
	 *
	 * @return an object value of {@code PlayerMessage} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	public java.lang.String getPlayerMessage();

	/**
	 * object accessor for the {@code PlayerMessage} with substitution for a null value
	 *
	 * <p>The {@code PlayerMessage} field is a direct mapping of the {@code player_message} database column in the table {@code tournament}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code PlayerMessage} is {@code null}.
	 * @return an object value of {@code PlayerMessage} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getPlayerMessage(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getPlayerMessage();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the {@code PlayerMessage} to the value of {@code argPlayerMessage}
	 *
	 * @param argPlayerMessage the new value of {@code PlayerMessage}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * @throws com.opal.ArgumentTooLongException if {@code argPlayerMessage} is longer than 2147483647 characters
	 * <p>The database column {@code player_message} is limited to 2147483647 characters.</p>
	 *
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Tournament setPlayerMessage(java.lang.String argPlayerMessage);

	/**
	 * object accessor for the {@code StaffMessage}
	 *
	 * <p>The {@code StaffMessage} field is a direct mapping of the {@code staff_message} field in {@code tournament}.</p>
	 *
	 * @return an object value of {@code StaffMessage} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	public java.lang.String getStaffMessage();

	/**
	 * object accessor for the {@code StaffMessage} with substitution for a null value
	 *
	 * <p>The {@code StaffMessage} field is a direct mapping of the {@code staff_message} database column in the table {@code tournament}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code StaffMessage} is {@code null}.
	 * @return an object value of {@code StaffMessage} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getStaffMessage(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getStaffMessage();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the {@code StaffMessage} to the value of {@code argStaffMessage}
	 *
	 * @param argStaffMessage the new value of {@code StaffMessage}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * @throws com.opal.ArgumentTooLongException if {@code argStaffMessage} is longer than 2147483647 characters
	 * <p>The database column {@code staff_message} is limited to 2147483647 characters.</p>
	 *
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Tournament setStaffMessage(java.lang.String argStaffMessage);

	/**
	 * object accessor for the {@code ReplacementQuestionSocialMediaPolicy}
	 *
	 * <p>The {@code ReplacementQuestionSocialMediaPolicy} field is a direct mapping of the {@code replacement_question_social_media_policy} field in {@code tournament}.</p>
	 *
	 * @return an object value of {@code ReplacementQuestionSocialMediaPolicy} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	public java.lang.String getReplacementQuestionSocialMediaPolicy();

	/**
	 * object accessor for the {@code ReplacementQuestionSocialMediaPolicy} with substitution for a null value
	 *
	 * <p>The {@code ReplacementQuestionSocialMediaPolicy} field is a direct mapping of the {@code replacement_question_social_media_policy} database column in the table {@code tournament}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code ReplacementQuestionSocialMediaPolicy} is {@code null}.
	 * @return an object value of {@code ReplacementQuestionSocialMediaPolicy} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getReplacementQuestionSocialMediaPolicy(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getReplacementQuestionSocialMediaPolicy();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the {@code ReplacementQuestionSocialMediaPolicy} to the value of {@code argReplacementQuestionSocialMediaPolicy}
	 *
	 * @param argReplacementQuestionSocialMediaPolicy the new value of {@code ReplacementQuestionSocialMediaPolicy}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * @throws com.opal.ArgumentTooLongException if {@code argReplacementQuestionSocialMediaPolicy} is longer than 2147483647 characters
	 * <p>The database column {@code replacement_question_social_media_policy} is limited to 2147483647 characters.</p>
	 *
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Tournament setReplacementQuestionSocialMediaPolicy(java.lang.String argReplacementQuestionSocialMediaPolicy);

	/**
	 * object accessor for the {@code SchoolMessage}
	 *
	 * <p>The {@code SchoolMessage} field is a direct mapping of the {@code school_message} field in {@code tournament}.</p>
	 *
	 * @return an object value of {@code SchoolMessage} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	public java.lang.String getSchoolMessage();

	/**
	 * object accessor for the {@code SchoolMessage} with substitution for a null value
	 *
	 * <p>The {@code SchoolMessage} field is a direct mapping of the {@code school_message} database column in the table {@code tournament}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code SchoolMessage} is {@code null}.
	 * @return an object value of {@code SchoolMessage} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getSchoolMessage(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getSchoolMessage();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the {@code SchoolMessage} to the value of {@code argSchoolMessage}
	 *
	 * @param argSchoolMessage the new value of {@code SchoolMessage}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * @throws com.opal.ArgumentTooLongException if {@code argSchoolMessage} is longer than 2147483647 characters
	 * <p>The database column {@code school_message} is limited to 2147483647 characters.</p>
	 *
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Tournament setSchoolMessage(java.lang.String argSchoolMessage);

	/**
	 * object accessor for the {@code ControlRoomRoomId}
	 *
	 * <p>The {@code ControlRoomRoomId} field is a direct mapping of the {@code control_room_room_id} field in {@code tournament}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getControlRoomRoomId() method.</p>
	 *
	 * @return an object value of {@code ControlRoomRoomId} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	public java.lang.Integer getControlRoomRoomIdAsObject();

	/**
	 * object accessor for the {@code ControlRoomRoomId} with substitution for a null value
	 *
	 * <p>The {@code ControlRoomRoomId} field is a direct mapping of the {@code control_room_room_id} database column in the table {@code tournament}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code ControlRoomRoomId} is {@code null}.
	 * @return an object value of {@code ControlRoomRoomId} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getControlRoomRoomIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getControlRoomRoomIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code ControlRoomRoomId}
	 *
	 * <p>The {@code ControlRoomRoomId} field is a direct mapping of the {@code control_room_room_id} database column in the table {@code tournament}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getControlRoomRoomIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code ControlRoomRoomId} (of the current {@link com.opal.TransactionContext})
	 * @throws com.opal.NullValueException when the internal value is null
	 */
	default public int getControlRoomRoomId() throws com.opal.NullValueException {
		java.lang.Integer lclO = getControlRoomRoomIdAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getControlRoomRoomId(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getControlRoomRoomIdAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getControlRoomRoomId(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getControlRoomRoomIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * sets the {@code ControlRoomRoomId} to the value of {@code argControlRoomRoomId}
	 *
	 * @param argControlRoomRoomId the new value of {@code ControlRoomRoomId}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Tournament setControlRoomRoomId(java.lang.Integer argControlRoomRoomId);

	/**
	 * sets the {@code ControlRoomRoomId} to the value of {@code argControlRoomRoomId}
	 *
	 * @param argControlRoomRoomId the new value of {@code ControlRoomRoomId}
	 * @return itself, so that mutators may be chained fluently
	 */
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Tournament setControlRoomRoomId(int argControlRoomRoomId);

	/**
	 * object accessor for the {@code ChampionshipRules}
	 *
	 * <p>The {@code ChampionshipRules} field is a direct mapping of the {@code championship_rules} field in {@code tournament}.</p>
	 *
	 * @return an object value of {@code ChampionshipRules} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	public java.lang.String getChampionshipRules();

	/**
	 * object accessor for the {@code ChampionshipRules} with substitution for a null value
	 *
	 * <p>The {@code ChampionshipRules} field is a direct mapping of the {@code championship_rules} database column in the table {@code tournament}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code ChampionshipRules} is {@code null}.
	 * @return an object value of {@code ChampionshipRules} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getChampionshipRules(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getChampionshipRules();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the {@code ChampionshipRules} to the value of {@code argChampionshipRules}
	 *
	 * @param argChampionshipRules the new value of {@code ChampionshipRules}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * @throws com.opal.ArgumentTooLongException if {@code argChampionshipRules} is longer than 2147483647 characters
	 * <p>The database column {@code championship_rules} is limited to 2147483647 characters.</p>
	 *
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Tournament setChampionshipRules(java.lang.String argChampionshipRules);

	/**
	 * object accessor for the {@code ChampionshipMatchUrl}
	 *
	 * <p>The {@code ChampionshipMatchUrl} field is a direct mapping of the {@code championship_match_url} field in {@code tournament}.</p>
	 *
	 * @return an object value of {@code ChampionshipMatchUrl} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 256L)
	public java.lang.String getChampionshipMatchUrl();

	/**
	 * object accessor for the {@code ChampionshipMatchUrl} with substitution for a null value
	 *
	 * <p>The {@code ChampionshipMatchUrl} field is a direct mapping of the {@code championship_match_url} database column in the table {@code tournament}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code ChampionshipMatchUrl} is {@code null}.
	 * @return an object value of {@code ChampionshipMatchUrl} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getChampionshipMatchUrl(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getChampionshipMatchUrl();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the {@code ChampionshipMatchUrl} to the value of {@code argChampionshipMatchUrl}
	 *
	 * @param argChampionshipMatchUrl the new value of {@code ChampionshipMatchUrl}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * @throws com.opal.ArgumentTooLongException if {@code argChampionshipMatchUrl} is longer than 256 characters
	 * <p>The database column {@code championship_match_url} is limited to 256 characters.</p>
	 *
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 256L)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Tournament setChampionshipMatchUrl(java.lang.String argChampionshipMatchUrl);

	/**
	 * object accessor for the {@code QuestionsComplete}
	 *
	 * <p>The {@code QuestionsComplete} field is a direct mapping of the {@code questions_complete} field in {@code tournament}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isQuestionsComplete() method.</p>
	 *
	 * @return an object value of {@code QuestionsComplete} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	public java.lang.Boolean isQuestionsCompleteAsObject();

	/**
	 * primitive accessor for the {@code QuestionsComplete}
	 *
	 * <p>The {@code QuestionsComplete} field is a direct mapping of the {@code questions_complete} database column in the table {@code tournament}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the isQuestionsCompleteAsObject() method.</p>
	 *
	 * @return the primitive value of {@code QuestionsComplete} (of the current {@link com.opal.TransactionContext})
	 */
	default public boolean isQuestionsComplete() {
		java.lang.Boolean lclO = isQuestionsCompleteAsObject();
		return lclO.booleanValue();
	}

	/**
	 * sets the {@code QuestionsComplete} to the value of {@code argQuestionsComplete}
	 *
	 * @param argQuestionsComplete the new value of {@code QuestionsComplete}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code questions_complete} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argQuestionsComplete is null
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Tournament setQuestionsComplete(java.lang.Boolean argQuestionsComplete);

	/**
	 * sets the {@code QuestionsComplete} to the value of {@code argQuestionsComplete}
	 *
	 * @param argQuestionsComplete the new value of {@code QuestionsComplete}
	 * @return itself, so that mutators may be chained fluently
	 */
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Tournament setQuestionsComplete(boolean argQuestionsComplete);

	/**
	 * object accessor for the {@code QuestionDownloadUrl}
	 *
	 * <p>The {@code QuestionDownloadUrl} field is a direct mapping of the {@code question_download_url} field in {@code tournament}.</p>
	 *
	 * @return an object value of {@code QuestionDownloadUrl} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	public java.lang.String getQuestionDownloadUrl();

	/**
	 * object accessor for the {@code QuestionDownloadUrl} with substitution for a null value
	 *
	 * <p>The {@code QuestionDownloadUrl} field is a direct mapping of the {@code question_download_url} database column in the table {@code tournament}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code QuestionDownloadUrl} is {@code null}.
	 * @return an object value of {@code QuestionDownloadUrl} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getQuestionDownloadUrl(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getQuestionDownloadUrl();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the {@code QuestionDownloadUrl} to the value of {@code argQuestionDownloadUrl}
	 *
	 * @param argQuestionDownloadUrl the new value of {@code QuestionDownloadUrl}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * @throws com.opal.ArgumentTooLongException if {@code argQuestionDownloadUrl} is longer than 2147483647 characters
	 * <p>The database column {@code question_download_url} is limited to 2147483647 characters.</p>
	 *
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Tournament setQuestionDownloadUrl(java.lang.String argQuestionDownloadUrl);

	/**
	 * object accessor for the {@code OnlineStats}
	 *
	 * <p>The {@code OnlineStats} field is a direct mapping of the {@code online_stats} field in {@code tournament}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isOnlineStats() method.</p>
	 *
	 * @return an object value of {@code OnlineStats} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	public java.lang.Boolean isOnlineStatsAsObject();

	/**
	 * primitive accessor for the {@code OnlineStats}
	 *
	 * <p>The {@code OnlineStats} field is a direct mapping of the {@code online_stats} database column in the table {@code tournament}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the isOnlineStatsAsObject() method.</p>
	 *
	 * @return the primitive value of {@code OnlineStats} (of the current {@link com.opal.TransactionContext})
	 */
	default public boolean isOnlineStats() {
		java.lang.Boolean lclO = isOnlineStatsAsObject();
		return lclO.booleanValue();
	}

	/**
	 * sets the {@code OnlineStats} to the value of {@code argOnlineStats}
	 *
	 * @param argOnlineStats the new value of {@code OnlineStats}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code online_stats} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argOnlineStats is null
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Tournament setOnlineStats(java.lang.Boolean argOnlineStats);

	/**
	 * sets the {@code OnlineStats} to the value of {@code argOnlineStats}
	 *
	 * @param argOnlineStats the new value of {@code OnlineStats}
	 * @return itself, so that mutators may be chained fluently
	 */
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Tournament setOnlineStats(boolean argOnlineStats);

	/**
	 * object accessor for the {@code SiteSchoolId}
	 *
	 * <p>The {@code SiteSchoolId} field is a direct mapping of the {@code site_school_id} field in {@code tournament}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getSiteSchoolId() method.</p>
	 *
	 * @return an object value of {@code SiteSchoolId} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	public java.lang.Integer getSiteSchoolIdAsObject();

	/**
	 * primitive accessor for the {@code SiteSchoolId}
	 *
	 * <p>The {@code SiteSchoolId} field is a direct mapping of the {@code site_school_id} database column in the table {@code tournament}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getSiteSchoolIdAsObject() method.</p>
	 *
	 * @return the primitive value of {@code SiteSchoolId} (of the current {@link com.opal.TransactionContext})
	 */
	default public int getSiteSchoolId() {
		java.lang.Integer lclO = getSiteSchoolIdAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the {@code SiteSchoolId} to the value of {@code argSiteSchoolId}
	 *
	 * @param argSiteSchoolId the new value of {@code SiteSchoolId}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code site_school_id} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argSiteSchoolId is null
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Tournament setSiteSchoolId(java.lang.Integer argSiteSchoolId);

	/**
	 * sets the {@code SiteSchoolId} to the value of {@code argSiteSchoolId}
	 *
	 * @param argSiteSchoolId the new value of {@code SiteSchoolId}
	 * @return itself, so that mutators may be chained fluently
	 */
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Tournament setSiteSchoolId(int argSiteSchoolId);

	/**
	 * object accessor for the {@code RegistrationOpen}
	 *
	 * <p>The {@code RegistrationOpen} field is a direct mapping of the {@code registration_open} field in {@code tournament}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isRegistrationOpen() method.</p>
	 *
	 * @return an object value of {@code RegistrationOpen} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	public java.lang.Boolean isRegistrationOpenAsObject();

	/**
	 * primitive accessor for the {@code RegistrationOpen}
	 *
	 * <p>The {@code RegistrationOpen} field is a direct mapping of the {@code registration_open} database column in the table {@code tournament}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the isRegistrationOpenAsObject() method.</p>
	 *
	 * @return the primitive value of {@code RegistrationOpen} (of the current {@link com.opal.TransactionContext})
	 */
	default public boolean isRegistrationOpen() {
		java.lang.Boolean lclO = isRegistrationOpenAsObject();
		return lclO.booleanValue();
	}

	/**
	 * sets the {@code RegistrationOpen} to the value of {@code argRegistrationOpen}
	 *
	 * @param argRegistrationOpen the new value of {@code RegistrationOpen}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code registration_open} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argRegistrationOpen is null
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Tournament setRegistrationOpen(java.lang.Boolean argRegistrationOpen);

	/**
	 * sets the {@code RegistrationOpen} to the value of {@code argRegistrationOpen}
	 *
	 * @param argRegistrationOpen the new value of {@code RegistrationOpen}
	 * @return itself, so that mutators may be chained fluently
	 */
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Tournament setRegistrationOpen(boolean argRegistrationOpen);

	/**
	 * @return the {@code com.scobolsolo.application.Room}
	 * The returned {@code com.scobolsolo.application.Room} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code room} that is referenced by {@code tournament_control_room_room_id_fkey}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public com.scobolsolo.application.Room getControlRoom();
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Tournament setControlRoom(com.scobolsolo.application.Room argControlRoom);

	/**
	 * @return the {@code com.scobolsolo.application.Contact}
	 * The returned {@code com.scobolsolo.application.Contact} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code contact} that is referenced by {@code tournament_tournament_director_contact_id_fkey}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = false)
	public com.scobolsolo.application.Contact getTournamentDirectorContact();
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Tournament setTournamentDirectorContact(com.scobolsolo.application.Contact argTournamentDirectorContact);

	/**
	 * @return the {@code com.scobolsolo.application.School}
	 * The returned {@code com.scobolsolo.application.School} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code school} that is referenced by {@code tournament_site_school_id_fkey}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = false)
	public com.scobolsolo.application.School getSiteSchool();
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Tournament setSiteSchool(com.scobolsolo.application.School argSiteSchool);

	public java.util.Set<com.scobolsolo.application.Phase> getPhaseSet();

	default public java.util.stream.Stream<com.scobolsolo.application.Phase> streamPhase() {
		return getPhaseSet().stream();
	}

	default public com.scobolsolo.application.Phase[] createPhaseArray() {
		java.util.Set<com.scobolsolo.application.Phase> lclS = getPhaseSet();
		return lclS.toArray(new com.scobolsolo.application.Phase[lclS.size()]);
	}

	public java.util.Set<com.scobolsolo.application.SchoolRegistration> getSchoolRegistrationSet();

	default public java.util.stream.Stream<com.scobolsolo.application.SchoolRegistration> streamSchoolRegistration() {
		return getSchoolRegistrationSet().stream();
	}

	default public com.scobolsolo.application.SchoolRegistration[] createSchoolRegistrationArray() {
		java.util.Set<com.scobolsolo.application.SchoolRegistration> lclS = getSchoolRegistrationSet();
		return lclS.toArray(new com.scobolsolo.application.SchoolRegistration[lclS.size()]);
	}

	public java.util.Set<com.scobolsolo.application.Staff> getStaffSet();

	default public java.util.stream.Stream<com.scobolsolo.application.Staff> streamStaff() {
		return getStaffSet().stream();
	}

	default public com.scobolsolo.application.Staff[] createStaffArray() {
		java.util.Set<com.scobolsolo.application.Staff> lclS = getStaffSet();
		return lclS.toArray(new com.scobolsolo.application.Staff[lclS.size()]);
	}

	public java.util.Set<com.scobolsolo.application.CategoryUse> getCategoryUseSet();

	default public java.util.stream.Stream<com.scobolsolo.application.CategoryUse> streamCategoryUse() {
		return getCategoryUseSet().stream();
	}

	default public com.scobolsolo.application.CategoryUse[] createCategoryUseArray() {
		java.util.Set<com.scobolsolo.application.CategoryUse> lclS = getCategoryUseSet();
		return lclS.toArray(new com.scobolsolo.application.CategoryUse[lclS.size()]);
	}

	public java.util.Set<com.scobolsolo.application.Packet> getPacketSet();

	default public java.util.stream.Stream<com.scobolsolo.application.Packet> streamPacket() {
		return getPacketSet().stream();
	}

	default public com.scobolsolo.application.Packet[] createPacketArray() {
		java.util.Set<com.scobolsolo.application.Packet> lclS = getPacketSet();
		return lclS.toArray(new com.scobolsolo.application.Packet[lclS.size()]);
	}

	public java.util.Set<com.scobolsolo.application.Room> getRoomSet();

	default public java.util.stream.Stream<com.scobolsolo.application.Room> streamRoom() {
		return getRoomSet().stream();
	}

	default public com.scobolsolo.application.Room[] createRoomArray() {
		java.util.Set<com.scobolsolo.application.Room> lclS = getRoomSet();
		return lclS.toArray(new com.scobolsolo.application.Room[lclS.size()]);
	}

	public com.scobolsolo.application.Tournament copy();

	/** This is a Comparator that can be used to compare Tournament objects based on their {@code Date} values. */

	public static class DateComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Tournament> {
		private static final DateComparator ourInstance = new DateComparator();
		public static final DateComparator getInstance() { return ourInstance; }

		private DateComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Tournament argFirst, com.scobolsolo.application.Tournament argSecond) {
			return argFirst.getDate().compareTo(argSecond.getDate());
		}
	}

	/** This is a Comparator that can be used to compare Tournament objects based on their {@code Name} values. */

	public static class NameComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Tournament> {
		private static final NameComparator ourInstance = new NameComparator();
		public static final NameComparator getInstance() { return ourInstance; }

		private NameComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Tournament argFirst, com.scobolsolo.application.Tournament argSecond) {
			return argFirst.getName().compareToIgnoreCase(argSecond.getName());
		}
	}

	/** This is a Comparator that can be used to compare Tournament objects based on their {@code ShortName} values. */

	public static class ShortNameComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Tournament> {
		private static final ShortNameComparator ourInstance = new ShortNameComparator();
		public static final ShortNameComparator getInstance() { return ourInstance; }

		private ShortNameComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Tournament argFirst, com.scobolsolo.application.Tournament argSecond) {
			return argFirst.getShortName().compareToIgnoreCase(argSecond.getShortName());
		}
	}

	/** This is a Comparator that can be used to compare Tournament objects based on their {@code Code} values. */

	public static class CodeComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Tournament> {
		private static final CodeComparator ourInstance = new CodeComparator();
		public static final CodeComparator getInstance() { return ourInstance; }

		private CodeComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Tournament argFirst, com.scobolsolo.application.Tournament argSecond) {
			return argFirst.getCode().compareToIgnoreCase(argSecond.getCode());
		}
	}

}
