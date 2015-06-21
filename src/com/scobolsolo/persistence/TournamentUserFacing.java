package com.scobolsolo.persistence;

import com.opal.*;

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
public interface TournamentUserFacing extends IdentityUserFacing, Comparable<com.scobolsolo.application.Tournament> {
	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the {@code Date}
	 *
	 * <p>The {@code Date} field is a direct mapping of the {@code date} field in {@code tournament}.</p>
	 *
	 * @return an object value of {@code Date} (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */
	public java.time.LocalDate getDate();

	/**
	 * sets the {@code Date} to the value of {@code argDate}
	 *
	 * @param argDate the new value of {@code Date}.  May not be <code>null</code>.
	 * <p>The database column {@code date} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argDate is null
	 */
	@com.opal.annotation.NotNull
	public void setDate(java.time.LocalDate argDate);

	/**
	 * object accessor for the {@code Name}
	 *
	 * <p>The {@code Name} field is a direct mapping of the {@code name} field in {@code tournament}.</p>
	 *
	 * @return an object value of {@code Name} (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.String getName();

	/**
	 * sets the {@code Name} to the value of {@code argName}
	 *
	 * @param argName the new value of {@code Name}.  May not be <code>null</code>.
	 * <p>The database column {@code name} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argName is null
	 * @throws ArgumentTooLongException if {@code argName} is longer than 256 characters
	 * <p>The database column {@code name} is limited to 256 characters.</p>
	 *
	 */
	@com.opal.annotation.NotNull
	@com.opal.annotation.Length(maximum = 256L)
	public void setName(java.lang.String argName);

	/**
	 * object accessor for the {@code ShortName}
	 *
	 * <p>The {@code ShortName} field is a direct mapping of the {@code short_name} field in {@code tournament}.</p>
	 *
	 * @return an object value of {@code ShortName} (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.String getShortName();

	/**
	 * sets the {@code ShortName} to the value of {@code argShortName}
	 *
	 * @param argShortName the new value of {@code ShortName}.  May not be <code>null</code>.
	 * <p>The database column {@code short_name} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argShortName is null
	 * @throws ArgumentTooLongException if {@code argShortName} is longer than 32 characters
	 * <p>The database column {@code short_name} is limited to 32 characters.</p>
	 *
	 */
	@com.opal.annotation.NotNull
	@com.opal.annotation.Length(maximum = 32L)
	public void setShortName(java.lang.String argShortName);

	/**
	 * object accessor for the {@code Code}
	 *
	 * <p>The {@code Code} field is a direct mapping of the {@code code} field in {@code tournament}.</p>
	 *
	 * @return an object value of {@code Code} (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.String getCode();

	/**
	 * sets the {@code Code} to the value of {@code argCode}
	 *
	 * @param argCode the new value of {@code Code}.  May not be <code>null</code>.
	 * <p>The database column {@code code} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argCode is null
	 * @throws ArgumentTooLongException if {@code argCode} is longer than 32 characters
	 * <p>The database column {@code code} is limited to 32 characters.</p>
	 *
	 */
	@com.opal.annotation.NotNull
	@com.opal.annotation.Length(maximum = 32L)
	public void setCode(java.lang.String argCode);

	/**
	 * object accessor for the {@code WebXmlRoleCode}
	 *
	 * <p>The {@code WebXmlRoleCode} field is a direct mapping of the {@code web_xml_role_code} field in {@code tournament}.</p>
	 *
	 * @return an object value of {@code WebXmlRoleCode} (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.String getWebXmlRoleCode();

	/**
	 * sets the {@code WebXmlRoleCode} to the value of {@code argWebXmlRoleCode}
	 *
	 * @param argWebXmlRoleCode the new value of {@code WebXmlRoleCode}.  May not be <code>null</code>.
	 * <p>The database column {@code web_xml_role_code} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argWebXmlRoleCode is null
	 * @throws ArgumentTooLongException if {@code argWebXmlRoleCode} is longer than 32 characters
	 * <p>The database column {@code web_xml_role_code} is limited to 32 characters.</p>
	 *
	 */
	@com.opal.annotation.NotNull
	@com.opal.annotation.Length(maximum = 32L)
	public void setWebXmlRoleCode(java.lang.String argWebXmlRoleCode);

	/**
	 * object accessor for the {@code TiebreakerSuddenDeath}
	 *
	 * <p>The {@code TiebreakerSuddenDeath} field is a direct mapping of the {@code tiebreaker_sudden_death} field in {@code tournament}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isTiebreakerSuddenDeath() method.</p>
	 *
	 * @return an object value of {@code TiebreakerSuddenDeath} (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.Boolean isTiebreakerSuddenDeathAsObject();

	/**
	 * primitive accessor for the {@code TiebreakerSuddenDeath}
	 *
	 * <p>The {@code TiebreakerSuddenDeath} field is a direct mapping of the {@code tiebreaker_sudden_death} database column in the table {@code tournament}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the isTiebreakerSuddenDeathAsObject() method.</p>
	 *
	 * @return the primitive value of {@code TiebreakerSuddenDeath} (of the current {@link TransactionContext})
	 */
	default public boolean isTiebreakerSuddenDeath() {
		java.lang.Boolean lclO = isTiebreakerSuddenDeathAsObject();
		return lclO.booleanValue();
	}

	/**
	 * sets the {@code TiebreakerSuddenDeath} to the value of {@code argTiebreakerSuddenDeath}
	 *
	 * @param argTiebreakerSuddenDeath the new value of {@code TiebreakerSuddenDeath}.  May not be <code>null</code>.
	 * <p>The database column {@code tiebreaker_sudden_death} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argTiebreakerSuddenDeath is null
	 */
	@com.opal.annotation.NotNull
	public void setTiebreakerSuddenDeath(java.lang.Boolean argTiebreakerSuddenDeath);

	/**
	 * sets the {@code TiebreakerSuddenDeath} to the value of {@code argTiebreakerSuddenDeath}
	 *
	 * @param argTiebreakerSuddenDeath the new value of {@code TiebreakerSuddenDeath}
	 */
	public void setTiebreakerSuddenDeath(boolean argTiebreakerSuddenDeath);

	/**
	 * object accessor for the {@code Url}
	 *
	 * <p>The {@code Url} field is a direct mapping of the {@code url} field in {@code tournament}.</p>
	 *
	 * @return an object value of {@code Url} (of the current {@link TransactionContext})  May be <code>null</code>.
	 */
	public java.lang.String getUrl();

	/**
	 * object accessor for the {@code Url} with substitution for a null value
	 *
	 * <p>The {@code Url} field is a direct mapping of the {@code url} database column in the table {@code tournament}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code Url} is {@code null}.
	 * @return an object value of {@code Url} (of the current {@link TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getUrl(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getUrl();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the {@code Url} to the value of {@code argUrl}
	 *
	 * @param argUrl the new value of {@code Url}.  May be <code>null</code>.
	 * @throws ArgumentTooLongException if {@code argUrl} is longer than 2147483647 characters
	 * <p>The database column {@code url} is limited to 2147483647 characters.</p>
	 *
	 */
	@com.opal.annotation.Length(maximum = 2147483647L)
	public void setUrl(java.lang.String argUrl);

	/**
	 * object accessor for the {@code TournamentDirectorContactId}
	 *
	 * <p>The {@code TournamentDirectorContactId} field is a direct mapping of the {@code tournament_director_contact_id} field in {@code tournament}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getTournamentDirectorContactId() method.</p>
	 *
	 * @return an object value of {@code TournamentDirectorContactId} (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.Integer getTournamentDirectorContactIdAsObject();

	/**
	 * primitive accessor for the {@code TournamentDirectorContactId}
	 *
	 * <p>The {@code TournamentDirectorContactId} field is a direct mapping of the {@code tournament_director_contact_id} database column in the table {@code tournament}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getTournamentDirectorContactIdAsObject() method.</p>
	 *
	 * @return the primitive value of {@code TournamentDirectorContactId} (of the current {@link TransactionContext})
	 */
	default public int getTournamentDirectorContactId() {
		java.lang.Integer lclO = getTournamentDirectorContactIdAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the {@code TournamentDirectorContactId} to the value of {@code argTournamentDirectorContactId}
	 *
	 * @param argTournamentDirectorContactId the new value of {@code TournamentDirectorContactId}.  May not be <code>null</code>.
	 * <p>The database column {@code tournament_director_contact_id} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argTournamentDirectorContactId is null
	 */
	@com.opal.annotation.NotNull
	public void setTournamentDirectorContactId(java.lang.Integer argTournamentDirectorContactId);

	/**
	 * sets the {@code TournamentDirectorContactId} to the value of {@code argTournamentDirectorContactId}
	 *
	 * @param argTournamentDirectorContactId the new value of {@code TournamentDirectorContactId}
	 */
	public void setTournamentDirectorContactId(int argTournamentDirectorContactId);

	/**
	 * object accessor for the {@code PlayerMessage}
	 *
	 * <p>The {@code PlayerMessage} field is a direct mapping of the {@code player_message} field in {@code tournament}.</p>
	 *
	 * @return an object value of {@code PlayerMessage} (of the current {@link TransactionContext})  May be <code>null</code>.
	 */
	public java.lang.String getPlayerMessage();

	/**
	 * object accessor for the {@code PlayerMessage} with substitution for a null value
	 *
	 * <p>The {@code PlayerMessage} field is a direct mapping of the {@code player_message} database column in the table {@code tournament}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code PlayerMessage} is {@code null}.
	 * @return an object value of {@code PlayerMessage} (of the current {@link TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getPlayerMessage(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getPlayerMessage();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the {@code PlayerMessage} to the value of {@code argPlayerMessage}
	 *
	 * @param argPlayerMessage the new value of {@code PlayerMessage}.  May be <code>null</code>.
	 * @throws ArgumentTooLongException if {@code argPlayerMessage} is longer than 2147483647 characters
	 * <p>The database column {@code player_message} is limited to 2147483647 characters.</p>
	 *
	 */
	@com.opal.annotation.Length(maximum = 2147483647L)
	public void setPlayerMessage(java.lang.String argPlayerMessage);

	/**
	 * object accessor for the {@code StaffMessage}
	 *
	 * <p>The {@code StaffMessage} field is a direct mapping of the {@code staff_message} field in {@code tournament}.</p>
	 *
	 * @return an object value of {@code StaffMessage} (of the current {@link TransactionContext})  May be <code>null</code>.
	 */
	public java.lang.String getStaffMessage();

	/**
	 * object accessor for the {@code StaffMessage} with substitution for a null value
	 *
	 * <p>The {@code StaffMessage} field is a direct mapping of the {@code staff_message} database column in the table {@code tournament}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code StaffMessage} is {@code null}.
	 * @return an object value of {@code StaffMessage} (of the current {@link TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getStaffMessage(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getStaffMessage();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the {@code StaffMessage} to the value of {@code argStaffMessage}
	 *
	 * @param argStaffMessage the new value of {@code StaffMessage}.  May be <code>null</code>.
	 * @throws ArgumentTooLongException if {@code argStaffMessage} is longer than 2147483647 characters
	 * <p>The database column {@code staff_message} is limited to 2147483647 characters.</p>
	 *
	 */
	@com.opal.annotation.Length(maximum = 2147483647L)
	public void setStaffMessage(java.lang.String argStaffMessage);

	/**
	 * object accessor for the {@code ReplacementQuestionSocialMediaPolicy}
	 *
	 * <p>The {@code ReplacementQuestionSocialMediaPolicy} field is a direct mapping of the {@code replacement_question_social_media_policy} field in {@code tournament}.</p>
	 *
	 * @return an object value of {@code ReplacementQuestionSocialMediaPolicy} (of the current {@link TransactionContext})  May be <code>null</code>.
	 */
	public java.lang.String getReplacementQuestionSocialMediaPolicy();

	/**
	 * object accessor for the {@code ReplacementQuestionSocialMediaPolicy} with substitution for a null value
	 *
	 * <p>The {@code ReplacementQuestionSocialMediaPolicy} field is a direct mapping of the {@code replacement_question_social_media_policy} database column in the table {@code tournament}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code ReplacementQuestionSocialMediaPolicy} is {@code null}.
	 * @return an object value of {@code ReplacementQuestionSocialMediaPolicy} (of the current {@link TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getReplacementQuestionSocialMediaPolicy(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getReplacementQuestionSocialMediaPolicy();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the {@code ReplacementQuestionSocialMediaPolicy} to the value of {@code argReplacementQuestionSocialMediaPolicy}
	 *
	 * @param argReplacementQuestionSocialMediaPolicy the new value of {@code ReplacementQuestionSocialMediaPolicy}.  May be <code>null</code>.
	 * @throws ArgumentTooLongException if {@code argReplacementQuestionSocialMediaPolicy} is longer than 2147483647 characters
	 * <p>The database column {@code replacement_question_social_media_policy} is limited to 2147483647 characters.</p>
	 *
	 */
	@com.opal.annotation.Length(maximum = 2147483647L)
	public void setReplacementQuestionSocialMediaPolicy(java.lang.String argReplacementQuestionSocialMediaPolicy);

	/**
	 * object accessor for the {@code SchoolMessage}
	 *
	 * <p>The {@code SchoolMessage} field is a direct mapping of the {@code school_message} field in {@code tournament}.</p>
	 *
	 * @return an object value of {@code SchoolMessage} (of the current {@link TransactionContext})  May be <code>null</code>.
	 */
	public java.lang.String getSchoolMessage();

	/**
	 * object accessor for the {@code SchoolMessage} with substitution for a null value
	 *
	 * <p>The {@code SchoolMessage} field is a direct mapping of the {@code school_message} database column in the table {@code tournament}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code SchoolMessage} is {@code null}.
	 * @return an object value of {@code SchoolMessage} (of the current {@link TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getSchoolMessage(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getSchoolMessage();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the {@code SchoolMessage} to the value of {@code argSchoolMessage}
	 *
	 * @param argSchoolMessage the new value of {@code SchoolMessage}.  May be <code>null</code>.
	 * @throws ArgumentTooLongException if {@code argSchoolMessage} is longer than 2147483647 characters
	 * <p>The database column {@code school_message} is limited to 2147483647 characters.</p>
	 *
	 */
	@com.opal.annotation.Length(maximum = 2147483647L)
	public void setSchoolMessage(java.lang.String argSchoolMessage);

	/**
	 * object accessor for the {@code ControlRoomRoomId}
	 *
	 * <p>The {@code ControlRoomRoomId} field is a direct mapping of the {@code control_room_room_id} field in {@code tournament}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getControlRoomRoomId() method.</p>
	 *
	 * @return an object value of {@code ControlRoomRoomId} (of the current {@link TransactionContext})  May be <code>null</code>.
	 */
	public java.lang.Integer getControlRoomRoomIdAsObject();

	/**
	 * object accessor for the {@code ControlRoomRoomId} with substitution for a null value
	 *
	 * <p>The {@code ControlRoomRoomId} field is a direct mapping of the {@code control_room_room_id} database column in the table {@code tournament}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code ControlRoomRoomId} is {@code null}.
	 * @return an object value of {@code ControlRoomRoomId} (of the current {@link TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
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
	 * @return the primitive value of {@code ControlRoomRoomId} (of the current {@link TransactionContext})
	 * @throws NullValueException when the internal value is null
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
	 */
	public void setControlRoomRoomId(java.lang.Integer argControlRoomRoomId);

	/**
	 * sets the {@code ControlRoomRoomId} to the value of {@code argControlRoomRoomId}
	 *
	 * @param argControlRoomRoomId the new value of {@code ControlRoomRoomId}
	 */
	public void setControlRoomRoomId(int argControlRoomRoomId);

	/**
	 * object accessor for the {@code ChampionshipRules}
	 *
	 * <p>The {@code ChampionshipRules} field is a direct mapping of the {@code championship_rules} field in {@code tournament}.</p>
	 *
	 * @return an object value of {@code ChampionshipRules} (of the current {@link TransactionContext})  May be <code>null</code>.
	 */
	public java.lang.String getChampionshipRules();

	/**
	 * object accessor for the {@code ChampionshipRules} with substitution for a null value
	 *
	 * <p>The {@code ChampionshipRules} field is a direct mapping of the {@code championship_rules} database column in the table {@code tournament}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code ChampionshipRules} is {@code null}.
	 * @return an object value of {@code ChampionshipRules} (of the current {@link TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getChampionshipRules(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getChampionshipRules();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the {@code ChampionshipRules} to the value of {@code argChampionshipRules}
	 *
	 * @param argChampionshipRules the new value of {@code ChampionshipRules}.  May be <code>null</code>.
	 * @throws ArgumentTooLongException if {@code argChampionshipRules} is longer than 2147483647 characters
	 * <p>The database column {@code championship_rules} is limited to 2147483647 characters.</p>
	 *
	 */
	@com.opal.annotation.Length(maximum = 2147483647L)
	public void setChampionshipRules(java.lang.String argChampionshipRules);

	/**
	 * object accessor for the {@code ChampionshipMatchUrl}
	 *
	 * <p>The {@code ChampionshipMatchUrl} field is a direct mapping of the {@code championship_match_url} field in {@code tournament}.</p>
	 *
	 * @return an object value of {@code ChampionshipMatchUrl} (of the current {@link TransactionContext})  May be <code>null</code>.
	 */
	public java.lang.String getChampionshipMatchUrl();

	/**
	 * object accessor for the {@code ChampionshipMatchUrl} with substitution for a null value
	 *
	 * <p>The {@code ChampionshipMatchUrl} field is a direct mapping of the {@code championship_match_url} database column in the table {@code tournament}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code ChampionshipMatchUrl} is {@code null}.
	 * @return an object value of {@code ChampionshipMatchUrl} (of the current {@link TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getChampionshipMatchUrl(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getChampionshipMatchUrl();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the {@code ChampionshipMatchUrl} to the value of {@code argChampionshipMatchUrl}
	 *
	 * @param argChampionshipMatchUrl the new value of {@code ChampionshipMatchUrl}.  May be <code>null</code>.
	 * @throws ArgumentTooLongException if {@code argChampionshipMatchUrl} is longer than 256 characters
	 * <p>The database column {@code championship_match_url} is limited to 256 characters.</p>
	 *
	 */
	@com.opal.annotation.Length(maximum = 256L)
	public void setChampionshipMatchUrl(java.lang.String argChampionshipMatchUrl);

	/**
	 * @return the {@code com.scobolsolo.application.Room}
	 * The returned {@code com.scobolsolo.application.Room} is the {@link UserFacing} object corresponding to the entry in {@code room} that is referenced by {@code tournament_control_room_room_id_fkey}.
	 *
	 */
	public com.scobolsolo.application.Room getControlRoom();
	public void setControlRoom(com.scobolsolo.application.Room argControlRoom);

	/**
	 * @return the {@code com.scobolsolo.application.Contact}
	 * The returned {@code com.scobolsolo.application.Contact} is the {@link UserFacing} object corresponding to the entry in {@code contact} that is referenced by {@code tournament_tournament_director_contact_id_fkey}.
	 *
	 */
	public com.scobolsolo.application.Contact getTournamentDirectorContact();
	public void setTournamentDirectorContact(com.scobolsolo.application.Contact argTournamentDirectorContact);

	public int getPhaseCount();
	public java.util.Iterator<com.scobolsolo.application.Phase> createPhaseIterator();

	public java.util.stream.Stream<com.scobolsolo.application.Phase> streamPhase();

	public void addPhase(com.scobolsolo.application.Phase argPhase);
	public void removePhase(com.scobolsolo.application.Phase argPhase);
	public void clearPhase();

	default public <T extends java.util.Collection<? super com.scobolsolo.application.Phase>> T acquirePhase(T argC) {
		if (argC == null) { throw new IllegalArgumentException("Target Collection is null."); }
		java.util.Iterator<com.scobolsolo.application.Phase> lclI = createPhaseIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public com.scobolsolo.application.Phase[] createPhaseArray() {
		int lclLength = getPhaseCount();
		com.scobolsolo.application.Phase[] lclA = new com.scobolsolo.application.Phase[lclLength];
		int lclIndex = 0;
		java.util.Iterator<com.scobolsolo.application.Phase> lclI = createPhaseIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public int getQuestionCount();
	public java.util.Iterator<com.scobolsolo.application.Question> createQuestionIterator();

	public java.util.stream.Stream<com.scobolsolo.application.Question> streamQuestion();

	public void addQuestion(com.scobolsolo.application.Question argQuestion);
	public void removeQuestion(com.scobolsolo.application.Question argQuestion);
	public void clearQuestion();

	default public <T extends java.util.Collection<? super com.scobolsolo.application.Question>> T acquireQuestion(T argC) {
		if (argC == null) { throw new IllegalArgumentException("Target Collection is null."); }
		java.util.Iterator<com.scobolsolo.application.Question> lclI = createQuestionIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public com.scobolsolo.application.Question[] createQuestionArray() {
		int lclLength = getQuestionCount();
		com.scobolsolo.application.Question[] lclA = new com.scobolsolo.application.Question[lclLength];
		int lclIndex = 0;
		java.util.Iterator<com.scobolsolo.application.Question> lclI = createQuestionIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public int getSchoolRegistrationCount();
	public java.util.Iterator<com.scobolsolo.application.SchoolRegistration> createSchoolRegistrationIterator();

	public java.util.stream.Stream<com.scobolsolo.application.SchoolRegistration> streamSchoolRegistration();

	public void addSchoolRegistration(com.scobolsolo.application.SchoolRegistration argSchoolRegistration);
	public void removeSchoolRegistration(com.scobolsolo.application.SchoolRegistration argSchoolRegistration);
	public void clearSchoolRegistration();

	default public <T extends java.util.Collection<? super com.scobolsolo.application.SchoolRegistration>> T acquireSchoolRegistration(T argC) {
		if (argC == null) { throw new IllegalArgumentException("Target Collection is null."); }
		java.util.Iterator<com.scobolsolo.application.SchoolRegistration> lclI = createSchoolRegistrationIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public com.scobolsolo.application.SchoolRegistration[] createSchoolRegistrationArray() {
		int lclLength = getSchoolRegistrationCount();
		com.scobolsolo.application.SchoolRegistration[] lclA = new com.scobolsolo.application.SchoolRegistration[lclLength];
		int lclIndex = 0;
		java.util.Iterator<com.scobolsolo.application.SchoolRegistration> lclI = createSchoolRegistrationIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public int getStaffCount();
	public java.util.Iterator<com.scobolsolo.application.Staff> createStaffIterator();

	public java.util.stream.Stream<com.scobolsolo.application.Staff> streamStaff();

	public void addStaff(com.scobolsolo.application.Staff argStaff);
	public void removeStaff(com.scobolsolo.application.Staff argStaff);
	public void clearStaff();

	default public <T extends java.util.Collection<? super com.scobolsolo.application.Staff>> T acquireStaff(T argC) {
		if (argC == null) { throw new IllegalArgumentException("Target Collection is null."); }
		java.util.Iterator<com.scobolsolo.application.Staff> lclI = createStaffIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public com.scobolsolo.application.Staff[] createStaffArray() {
		int lclLength = getStaffCount();
		com.scobolsolo.application.Staff[] lclA = new com.scobolsolo.application.Staff[lclLength];
		int lclIndex = 0;
		java.util.Iterator<com.scobolsolo.application.Staff> lclI = createStaffIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public int getCategoryUseCount();
	public java.util.Iterator<com.scobolsolo.application.CategoryUse> createCategoryUseIterator();

	public java.util.stream.Stream<com.scobolsolo.application.CategoryUse> streamCategoryUse();

	public void addCategoryUse(com.scobolsolo.application.CategoryUse argCategoryUse);
	public void removeCategoryUse(com.scobolsolo.application.CategoryUse argCategoryUse);
	public void clearCategoryUse();

	default public <T extends java.util.Collection<? super com.scobolsolo.application.CategoryUse>> T acquireCategoryUse(T argC) {
		if (argC == null) { throw new IllegalArgumentException("Target Collection is null."); }
		java.util.Iterator<com.scobolsolo.application.CategoryUse> lclI = createCategoryUseIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public com.scobolsolo.application.CategoryUse[] createCategoryUseArray() {
		int lclLength = getCategoryUseCount();
		com.scobolsolo.application.CategoryUse[] lclA = new com.scobolsolo.application.CategoryUse[lclLength];
		int lclIndex = 0;
		java.util.Iterator<com.scobolsolo.application.CategoryUse> lclI = createCategoryUseIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public int getPacketCount();
	public java.util.Iterator<com.scobolsolo.application.Packet> createPacketIterator();

	public java.util.stream.Stream<com.scobolsolo.application.Packet> streamPacket();

	public void addPacket(com.scobolsolo.application.Packet argPacket);
	public void removePacket(com.scobolsolo.application.Packet argPacket);
	public void clearPacket();

	default public <T extends java.util.Collection<? super com.scobolsolo.application.Packet>> T acquirePacket(T argC) {
		if (argC == null) { throw new IllegalArgumentException("Target Collection is null."); }
		java.util.Iterator<com.scobolsolo.application.Packet> lclI = createPacketIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public com.scobolsolo.application.Packet[] createPacketArray() {
		int lclLength = getPacketCount();
		com.scobolsolo.application.Packet[] lclA = new com.scobolsolo.application.Packet[lclLength];
		int lclIndex = 0;
		java.util.Iterator<com.scobolsolo.application.Packet> lclI = createPacketIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public int getRoomCount();
	public java.util.Iterator<com.scobolsolo.application.Room> createRoomIterator();

	public java.util.stream.Stream<com.scobolsolo.application.Room> streamRoom();

	public void addRoom(com.scobolsolo.application.Room argRoom);
	public void removeRoom(com.scobolsolo.application.Room argRoom);
	public void clearRoom();

	default public <T extends java.util.Collection<? super com.scobolsolo.application.Room>> T acquireRoom(T argC) {
		if (argC == null) { throw new IllegalArgumentException("Target Collection is null."); }
		java.util.Iterator<com.scobolsolo.application.Room> lclI = createRoomIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public com.scobolsolo.application.Room[] createRoomArray() {
		int lclLength = getRoomCount();
		com.scobolsolo.application.Room[] lclA = new com.scobolsolo.application.Room[lclLength];
		int lclIndex = 0;
		java.util.Iterator<com.scobolsolo.application.Room> lclI = createRoomIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
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
