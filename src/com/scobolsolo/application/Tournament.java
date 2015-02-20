package com.scobolsolo.application;

import com.opal.*;

/**
 * represents a <code>Tournament</code> from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from the database table <code>tournament</code>.  Do not modify this class directly; instead, alter the database table on which it is based and/or the Opal configuration file for the project and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various <code>forXXX</code> methods on the {@link TournamentFactory} factory class.  To create new instances, use the <code>create()</code> method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link TransactionContext}.</p>
 *
 * <p>This interface and the {@link TournamentFactory} class (the ones in the <code>com.scobolsolo.application</code> package) are the only two automatically generated files for the table that are intended to be referenced in user code. Other automatically generated files (namely those in the <code>com.scobolsolo.persistence</code> package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
public interface Tournament extends IdentityUserFacing, Comparable<Tournament> {
	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the Date
	 *
	 * <p>The Date field is a direct mapping of the <code>date</code> database column in the table <code>tournament</code>.</p>
	 *
	 * @return an object value of Date (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.time.LocalDate getDate();
	/**
	 * sets the Date to the value of <code>argDate</code>
	 *
	 * @param argDate the new value of Date.  May not be <code>null</code>.
	 * <p>The database column <code>date</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argDate is null
	 */
	@com.opal.annotation.NotNull
	public void setDate(java.time.LocalDate argDate);

	/**
	 * object accessor for the Name
	 *
	 * <p>The Name field is a direct mapping of the <code>name</code> database column in the table <code>tournament</code>.</p>
	 *
	 * @return an object value of Name (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.String getName();
	/**
	 * sets the Name to the value of <code>argName</code>
	 *
	 * @param argName the new value of Name.  May not be <code>null</code>.
	 * <p>The database column <code>name</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argName is null
	 * @throws ArgumentTooLongException if <code>argName</code> is longer than 256 characters
	 * <p>The database column <code>name</code> is limited to 256 characters.</p>
	 *
	 */
	@com.opal.annotation.NotNull
	@com.opal.annotation.Length(maximum = 256L)
	public void setName(java.lang.String argName);

	/**
	 * object accessor for the ShortName
	 *
	 * <p>The ShortName field is a direct mapping of the <code>short_name</code> database column in the table <code>tournament</code>.</p>
	 *
	 * @return an object value of ShortName (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.String getShortName();
	/**
	 * sets the ShortName to the value of <code>argShortName</code>
	 *
	 * @param argShortName the new value of ShortName.  May not be <code>null</code>.
	 * <p>The database column <code>short_name</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argShortName is null
	 * @throws ArgumentTooLongException if <code>argShortName</code> is longer than 32 characters
	 * <p>The database column <code>short_name</code> is limited to 32 characters.</p>
	 *
	 */
	@com.opal.annotation.NotNull
	@com.opal.annotation.Length(maximum = 32L)
	public void setShortName(java.lang.String argShortName);

	/**
	 * object accessor for the Code
	 *
	 * <p>The Code field is a direct mapping of the <code>code</code> database column in the table <code>tournament</code>.</p>
	 *
	 * @return an object value of Code (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.String getCode();
	/**
	 * sets the Code to the value of <code>argCode</code>
	 *
	 * @param argCode the new value of Code.  May not be <code>null</code>.
	 * <p>The database column <code>code</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argCode is null
	 * @throws ArgumentTooLongException if <code>argCode</code> is longer than 32 characters
	 * <p>The database column <code>code</code> is limited to 32 characters.</p>
	 *
	 */
	@com.opal.annotation.NotNull
	@com.opal.annotation.Length(maximum = 32L)
	public void setCode(java.lang.String argCode);

	/**
	 * object accessor for the WebXmlRoleCode
	 *
	 * <p>The WebXmlRoleCode field is a direct mapping of the <code>web_xml_role_code</code> database column in the table <code>tournament</code>.</p>
	 *
	 * @return an object value of WebXmlRoleCode (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.String getWebXmlRoleCode();
	/**
	 * sets the WebXmlRoleCode to the value of <code>argWebXmlRoleCode</code>
	 *
	 * @param argWebXmlRoleCode the new value of WebXmlRoleCode.  May not be <code>null</code>.
	 * <p>The database column <code>web_xml_role_code</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argWebXmlRoleCode is null
	 * @throws ArgumentTooLongException if <code>argWebXmlRoleCode</code> is longer than 32 characters
	 * <p>The database column <code>web_xml_role_code</code> is limited to 32 characters.</p>
	 *
	 */
	@com.opal.annotation.NotNull
	@com.opal.annotation.Length(maximum = 32L)
	public void setWebXmlRoleCode(java.lang.String argWebXmlRoleCode);

	/**
	 * object accessor for the TiebreakerSuddenDeath
	 *
	 * <p>The TiebreakerSuddenDeath field is a direct mapping of the <code>tiebreaker_sudden_death</code> database column in the table <code>tournament</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isTiebreakerSuddenDeath() method.</p>
	 *
	 * @return an object value of TiebreakerSuddenDeath (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Boolean isTiebreakerSuddenDeathAsObject();
	/**
	 * primitive accessor for the TiebreakerSuddenDeath
	 *
	 * <p>The TiebreakerSuddenDeath field is a direct mapping of the <code>tiebreaker_sudden_death</code> database column in the table <code>tournament</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the isTiebreakerSuddenDeathAsObject() method.</p>
	 *
	 * @return the primitive value of TiebreakerSuddenDeath (of the current {@link TransactionContext})
	 */
	default public boolean isTiebreakerSuddenDeath() {
		java.lang.Boolean lclO = isTiebreakerSuddenDeathAsObject();
		return lclO.booleanValue();
	}

	/**
	 * sets the TiebreakerSuddenDeath to the value of <code>argTiebreakerSuddenDeath</code>
	 *
	 * @param argTiebreakerSuddenDeath the new value of TiebreakerSuddenDeath.  May not be <code>null</code>.
	 * <p>The database column <code>tiebreaker_sudden_death</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argTiebreakerSuddenDeath is null
	 */
	@com.opal.annotation.NotNull
	public void setTiebreakerSuddenDeath(java.lang.Boolean argTiebreakerSuddenDeath);

	/**
	 * sets the TiebreakerSuddenDeath to the value of <code>argTiebreakerSuddenDeath</code>
	 *
	 * @param argTiebreakerSuddenDeath the new value of TiebreakerSuddenDeath
	 */
	public void setTiebreakerSuddenDeath(boolean argTiebreakerSuddenDeath);

	/**
	 * object accessor for the Url
	 *
	 * <p>The Url field is a direct mapping of the <code>url</code> database column in the table <code>tournament</code>.</p>
	 *
	 * @return an object value of Url (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.String getUrl();
	/**
	 * object accessor for the Url with substitution for a null value
	 *
	 * <p>The Url field is a direct mapping of the <code>url</code> database column in the table <code>tournament</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the Url is <code>null</code>.
	 * @return an object value of Url (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getUrl(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getUrl();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the Url to the value of <code>argUrl</code>
	 *
	 * @param argUrl the new value of Url.  May be <code>null</code>.
	 * @throws ArgumentTooLongException if <code>argUrl</code> is longer than 2147483647 characters
	 * <p>The database column <code>url</code> is limited to 2147483647 characters.</p>
	 *
	 */
	@com.opal.annotation.Length(maximum = 2147483647L)
	public void setUrl(java.lang.String argUrl);

	/**
	 * object accessor for the TournamentDirectorContactId
	 *
	 * <p>The TournamentDirectorContactId field is a direct mapping of the <code>tournament_director_contact_id</code> database column in the table <code>tournament</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getTournamentDirectorContactId() method.</p>
	 *
	 * @return an object value of TournamentDirectorContactId (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Integer getTournamentDirectorContactIdAsObject();
	/**
	 * primitive accessor for the TournamentDirectorContactId
	 *
	 * <p>The TournamentDirectorContactId field is a direct mapping of the <code>tournament_director_contact_id</code> database column in the table <code>tournament</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getTournamentDirectorContactIdAsObject() method.</p>
	 *
	 * @return the primitive value of TournamentDirectorContactId (of the current {@link TransactionContext})
	 */
	default public int getTournamentDirectorContactId() {
		java.lang.Integer lclO = getTournamentDirectorContactIdAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the TournamentDirectorContactId to the value of <code>argTournamentDirectorContactId</code>
	 *
	 * @param argTournamentDirectorContactId the new value of TournamentDirectorContactId.  May not be <code>null</code>.
	 * <p>The database column <code>tournament_director_contact_id</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argTournamentDirectorContactId is null
	 */
	@com.opal.annotation.NotNull
	public void setTournamentDirectorContactId(java.lang.Integer argTournamentDirectorContactId);

	/**
	 * sets the TournamentDirectorContactId to the value of <code>argTournamentDirectorContactId</code>
	 *
	 * @param argTournamentDirectorContactId the new value of TournamentDirectorContactId
	 */
	public void setTournamentDirectorContactId(int argTournamentDirectorContactId);

	/**
	 * object accessor for the PlayerMessage
	 *
	 * <p>The PlayerMessage field is a direct mapping of the <code>player_message</code> database column in the table <code>tournament</code>.</p>
	 *
	 * @return an object value of PlayerMessage (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.String getPlayerMessage();
	/**
	 * object accessor for the PlayerMessage with substitution for a null value
	 *
	 * <p>The PlayerMessage field is a direct mapping of the <code>player_message</code> database column in the table <code>tournament</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the PlayerMessage is <code>null</code>.
	 * @return an object value of PlayerMessage (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getPlayerMessage(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getPlayerMessage();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the PlayerMessage to the value of <code>argPlayerMessage</code>
	 *
	 * @param argPlayerMessage the new value of PlayerMessage.  May be <code>null</code>.
	 * @throws ArgumentTooLongException if <code>argPlayerMessage</code> is longer than 2147483647 characters
	 * <p>The database column <code>player_message</code> is limited to 2147483647 characters.</p>
	 *
	 */
	@com.opal.annotation.Length(maximum = 2147483647L)
	public void setPlayerMessage(java.lang.String argPlayerMessage);

	/**
	 * object accessor for the StaffMessage
	 *
	 * <p>The StaffMessage field is a direct mapping of the <code>staff_message</code> database column in the table <code>tournament</code>.</p>
	 *
	 * @return an object value of StaffMessage (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.String getStaffMessage();
	/**
	 * object accessor for the StaffMessage with substitution for a null value
	 *
	 * <p>The StaffMessage field is a direct mapping of the <code>staff_message</code> database column in the table <code>tournament</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the StaffMessage is <code>null</code>.
	 * @return an object value of StaffMessage (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getStaffMessage(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getStaffMessage();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the StaffMessage to the value of <code>argStaffMessage</code>
	 *
	 * @param argStaffMessage the new value of StaffMessage.  May be <code>null</code>.
	 * @throws ArgumentTooLongException if <code>argStaffMessage</code> is longer than 2147483647 characters
	 * <p>The database column <code>staff_message</code> is limited to 2147483647 characters.</p>
	 *
	 */
	@com.opal.annotation.Length(maximum = 2147483647L)
	public void setStaffMessage(java.lang.String argStaffMessage);

	/**
	 * object accessor for the ReplacementQuestionSocialMediaPolicy
	 *
	 * <p>The ReplacementQuestionSocialMediaPolicy field is a direct mapping of the <code>replacement_question_social_media_policy</code> database column in the table <code>tournament</code>.</p>
	 *
	 * @return an object value of ReplacementQuestionSocialMediaPolicy (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.String getReplacementQuestionSocialMediaPolicy();
	/**
	 * object accessor for the ReplacementQuestionSocialMediaPolicy with substitution for a null value
	 *
	 * <p>The ReplacementQuestionSocialMediaPolicy field is a direct mapping of the <code>replacement_question_social_media_policy</code> database column in the table <code>tournament</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the ReplacementQuestionSocialMediaPolicy is <code>null</code>.
	 * @return an object value of ReplacementQuestionSocialMediaPolicy (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getReplacementQuestionSocialMediaPolicy(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getReplacementQuestionSocialMediaPolicy();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the ReplacementQuestionSocialMediaPolicy to the value of <code>argReplacementQuestionSocialMediaPolicy</code>
	 *
	 * @param argReplacementQuestionSocialMediaPolicy the new value of ReplacementQuestionSocialMediaPolicy.  May be <code>null</code>.
	 * @throws ArgumentTooLongException if <code>argReplacementQuestionSocialMediaPolicy</code> is longer than 2147483647 characters
	 * <p>The database column <code>replacement_question_social_media_policy</code> is limited to 2147483647 characters.</p>
	 *
	 */
	@com.opal.annotation.Length(maximum = 2147483647L)
	public void setReplacementQuestionSocialMediaPolicy(java.lang.String argReplacementQuestionSocialMediaPolicy);

	/**
	 * object accessor for the SchoolMessage
	 *
	 * <p>The SchoolMessage field is a direct mapping of the <code>school_message</code> database column in the table <code>tournament</code>.</p>
	 *
	 * @return an object value of SchoolMessage (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.String getSchoolMessage();
	/**
	 * object accessor for the SchoolMessage with substitution for a null value
	 *
	 * <p>The SchoolMessage field is a direct mapping of the <code>school_message</code> database column in the table <code>tournament</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the SchoolMessage is <code>null</code>.
	 * @return an object value of SchoolMessage (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getSchoolMessage(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getSchoolMessage();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the SchoolMessage to the value of <code>argSchoolMessage</code>
	 *
	 * @param argSchoolMessage the new value of SchoolMessage.  May be <code>null</code>.
	 * @throws ArgumentTooLongException if <code>argSchoolMessage</code> is longer than 2147483647 characters
	 * <p>The database column <code>school_message</code> is limited to 2147483647 characters.</p>
	 *
	 */
	@com.opal.annotation.Length(maximum = 2147483647L)
	public void setSchoolMessage(java.lang.String argSchoolMessage);

	/**
	 * object accessor for the ControlRoomRoomId
	 *
	 * <p>The ControlRoomRoomId field is a direct mapping of the <code>control_room_room_id</code> database column in the table <code>tournament</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getControlRoomRoomId() method.</p>
	 *
	 * @return an object value of ControlRoomRoomId (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.Integer getControlRoomRoomIdAsObject();
	/**
	 * object accessor for the ControlRoomRoomId with substitution for a null value
	 *
	 * <p>The ControlRoomRoomId field is a direct mapping of the <code>control_room_room_id</code> database column in the table <code>tournament</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the ControlRoomRoomId is <code>null</code>.
	 * @return an object value of ControlRoomRoomId (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getControlRoomRoomIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getControlRoomRoomIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the ControlRoomRoomId
	 *
	 * <p>The ControlRoomRoomId field is a direct mapping of the <code>control_room_room_id</code> database column in the table <code>tournament</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getControlRoomRoomIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a <code>NULL</code> value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of ControlRoomRoomId (of the current {@link TransactionContext})
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
	 * sets the ControlRoomRoomId to the value of <code>argControlRoomRoomId</code>
	 *
	 * @param argControlRoomRoomId the new value of ControlRoomRoomId.  May be <code>null</code>.
	 */
	public void setControlRoomRoomId(java.lang.Integer argControlRoomRoomId);

	/**
	 * sets the ControlRoomRoomId to the value of <code>argControlRoomRoomId</code>
	 *
	 * @param argControlRoomRoomId the new value of ControlRoomRoomId
	 */
	public void setControlRoomRoomId(int argControlRoomRoomId);

	/**
	 * object accessor for the ChampionshipRules
	 *
	 * <p>The ChampionshipRules field is a direct mapping of the <code>championship_rules</code> database column in the table <code>tournament</code>.</p>
	 *
	 * @return an object value of ChampionshipRules (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.String getChampionshipRules();
	/**
	 * object accessor for the ChampionshipRules with substitution for a null value
	 *
	 * <p>The ChampionshipRules field is a direct mapping of the <code>championship_rules</code> database column in the table <code>tournament</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the ChampionshipRules is <code>null</code>.
	 * @return an object value of ChampionshipRules (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getChampionshipRules(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getChampionshipRules();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the ChampionshipRules to the value of <code>argChampionshipRules</code>
	 *
	 * @param argChampionshipRules the new value of ChampionshipRules.  May be <code>null</code>.
	 * @throws ArgumentTooLongException if <code>argChampionshipRules</code> is longer than 2147483647 characters
	 * <p>The database column <code>championship_rules</code> is limited to 2147483647 characters.</p>
	 *
	 */
	@com.opal.annotation.Length(maximum = 2147483647L)
	public void setChampionshipRules(java.lang.String argChampionshipRules);

	/**
	 * object accessor for the ChampionshipMatchUrl
	 *
	 * <p>The ChampionshipMatchUrl field is a direct mapping of the <code>championship_match_url</code> database column in the table <code>tournament</code>.</p>
	 *
	 * @return an object value of ChampionshipMatchUrl (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.String getChampionshipMatchUrl();
	/**
	 * object accessor for the ChampionshipMatchUrl with substitution for a null value
	 *
	 * <p>The ChampionshipMatchUrl field is a direct mapping of the <code>championship_match_url</code> database column in the table <code>tournament</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the ChampionshipMatchUrl is <code>null</code>.
	 * @return an object value of ChampionshipMatchUrl (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getChampionshipMatchUrl(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getChampionshipMatchUrl();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the ChampionshipMatchUrl to the value of <code>argChampionshipMatchUrl</code>
	 *
	 * @param argChampionshipMatchUrl the new value of ChampionshipMatchUrl.  May be <code>null</code>.
	 * @throws ArgumentTooLongException if <code>argChampionshipMatchUrl</code> is longer than 256 characters
	 * <p>The database column <code>championship_match_url</code> is limited to 256 characters.</p>
	 *
	 */
	@com.opal.annotation.Length(maximum = 256L)
	public void setChampionshipMatchUrl(java.lang.String argChampionshipMatchUrl);

	/**
	 * @return the <code>Room</code>
	 * The returned <code>Room</code> is the {@link UserFacing} object corresponding to the row in the <code>room</code> that is referenced by the foreign key <code>tournament_control_room_room_id_fkey</code>.
	 *
	 */
	public Room getControlRoom();
	public void setControlRoom(Room argRoom);

	/**
	 * @return the <code>Contact</code>
	 * The returned <code>Contact</code> is the {@link UserFacing} object corresponding to the row in the <code>contact</code> that is referenced by the foreign key <code>tournament_tournament_director_contact_id_fkey</code>.
	 *
	 */
	public Contact getTournamentDirectorContact();
	public void setTournamentDirectorContact(Contact argContact);

	public int getPhaseCount();
	public java.util.Iterator<Phase> createPhaseIterator();

	public java.util.stream.Stream<Phase> streamPhase();

	public void addPhase(Phase argPhase);
	public void removePhase(Phase argPhase);
	public void clearPhase();

	default public <T extends java.util.Collection<? super Phase>> T acquirePhase(T argC) {
		org.apache.commons.lang3.Validate.notNull(argC);
		java.util.Iterator<Phase> lclI = createPhaseIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public Phase[] createPhaseArray() {
		int lclLength = getPhaseCount();
		Phase[] lclA = new Phase[lclLength];
		int lclIndex = 0;
		java.util.Iterator<Phase> lclI = createPhaseIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public int getQuestionCount();
	public java.util.Iterator<Question> createQuestionIterator();

	public java.util.stream.Stream<Question> streamQuestion();

	public void addQuestion(Question argQuestion);
	public void removeQuestion(Question argQuestion);
	public void clearQuestion();

	default public <T extends java.util.Collection<? super Question>> T acquireQuestion(T argC) {
		org.apache.commons.lang3.Validate.notNull(argC);
		java.util.Iterator<Question> lclI = createQuestionIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public Question[] createQuestionArray() {
		int lclLength = getQuestionCount();
		Question[] lclA = new Question[lclLength];
		int lclIndex = 0;
		java.util.Iterator<Question> lclI = createQuestionIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public int getSchoolRegistrationCount();
	public java.util.Iterator<SchoolRegistration> createSchoolRegistrationIterator();

	public java.util.stream.Stream<SchoolRegistration> streamSchoolRegistration();

	public void addSchoolRegistration(SchoolRegistration argSchoolRegistration);
	public void removeSchoolRegistration(SchoolRegistration argSchoolRegistration);
	public void clearSchoolRegistration();

	default public <T extends java.util.Collection<? super SchoolRegistration>> T acquireSchoolRegistration(T argC) {
		org.apache.commons.lang3.Validate.notNull(argC);
		java.util.Iterator<SchoolRegistration> lclI = createSchoolRegistrationIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public SchoolRegistration[] createSchoolRegistrationArray() {
		int lclLength = getSchoolRegistrationCount();
		SchoolRegistration[] lclA = new SchoolRegistration[lclLength];
		int lclIndex = 0;
		java.util.Iterator<SchoolRegistration> lclI = createSchoolRegistrationIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public int getStaffCount();
	public java.util.Iterator<Staff> createStaffIterator();

	public java.util.stream.Stream<Staff> streamStaff();

	public void addStaff(Staff argStaff);
	public void removeStaff(Staff argStaff);
	public void clearStaff();

	default public <T extends java.util.Collection<? super Staff>> T acquireStaff(T argC) {
		org.apache.commons.lang3.Validate.notNull(argC);
		java.util.Iterator<Staff> lclI = createStaffIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public Staff[] createStaffArray() {
		int lclLength = getStaffCount();
		Staff[] lclA = new Staff[lclLength];
		int lclIndex = 0;
		java.util.Iterator<Staff> lclI = createStaffIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public int getCategoryUseCount();
	public java.util.Iterator<CategoryUse> createCategoryUseIterator();

	public java.util.stream.Stream<CategoryUse> streamCategoryUse();

	public void addCategoryUse(CategoryUse argCategoryUse);
	public void removeCategoryUse(CategoryUse argCategoryUse);
	public void clearCategoryUse();

	default public <T extends java.util.Collection<? super CategoryUse>> T acquireCategoryUse(T argC) {
		org.apache.commons.lang3.Validate.notNull(argC);
		java.util.Iterator<CategoryUse> lclI = createCategoryUseIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public CategoryUse[] createCategoryUseArray() {
		int lclLength = getCategoryUseCount();
		CategoryUse[] lclA = new CategoryUse[lclLength];
		int lclIndex = 0;
		java.util.Iterator<CategoryUse> lclI = createCategoryUseIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public int getPacketCount();
	public java.util.Iterator<Packet> createPacketIterator();

	public java.util.stream.Stream<Packet> streamPacket();

	public void addPacket(Packet argPacket);
	public void removePacket(Packet argPacket);
	public void clearPacket();

	default public <T extends java.util.Collection<? super Packet>> T acquirePacket(T argC) {
		org.apache.commons.lang3.Validate.notNull(argC);
		java.util.Iterator<Packet> lclI = createPacketIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public Packet[] createPacketArray() {
		int lclLength = getPacketCount();
		Packet[] lclA = new Packet[lclLength];
		int lclIndex = 0;
		java.util.Iterator<Packet> lclI = createPacketIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public int getRoomCount();
	public java.util.Iterator<Room> createRoomIterator();

	public java.util.stream.Stream<Room> streamRoom();

	public void addRoom(Room argRoom);
	public void removeRoom(Room argRoom);
	public void clearRoom();

	default public <T extends java.util.Collection<? super Room>> T acquireRoom(T argC) {
		org.apache.commons.lang3.Validate.notNull(argC);
		java.util.Iterator<Room> lclI = createRoomIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public Room[] createRoomArray() {
		int lclLength = getRoomCount();
		Room[] lclA = new Room[lclLength];
		int lclIndex = 0;
		java.util.Iterator<Room> lclI = createRoomIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public Tournament copy();

	default public com.scobolsolo.application.Phase findFirstPhase() {
		return com.scobolsolo.application.TournamentDelegate.findFirstPhase(this);
	}

	default public java.util.List<com.scobolsolo.application.Phase> getPhases() {
		return com.scobolsolo.application.TournamentDelegate.getPhases(this);
	}

	default public java.util.List<com.scobolsolo.application.Player> getPlayers() {
		return com.scobolsolo.application.TournamentDelegate.getPlayers(this);
	}

	default public java.util.List<com.scobolsolo.application.RoundGroup> getRoundGroups() {
		return com.scobolsolo.application.TournamentDelegate.getRoundGroups(this);
	}

	default public java.util.List<com.scobolsolo.application.Round> getRounds() {
		return com.scobolsolo.application.TournamentDelegate.getRounds(this);
	}

	default public java.util.List<com.scobolsolo.application.StandbyEntry> getStandbyEntries() {
		return com.scobolsolo.application.TournamentDelegate.getStandbyEntries(this);
	}

	default public java.util.List<com.scobolsolo.application.WaitlistEntry> getWaitlistEntries() {
		return com.scobolsolo.application.TournamentDelegate.getWaitlistEntries(this);
	}

	default public boolean hasCardsAssigned() {
		return com.scobolsolo.application.TournamentDelegate.hasCardsAssigned(this);
	}

	default public boolean hasPublicQuestions() {
		return com.scobolsolo.application.TournamentDelegate.hasPublicQuestions(this);
	}

	default public boolean hasValidSeeds() {
		return com.scobolsolo.application.TournamentDelegate.hasValidSeeds(this);
	}

	/** This is a Comparator that can be used to compare Tournament objects based on their Date values. */

	public static class DateComparator extends com.siliconage.util.NullSafeComparator<Tournament> {
		private static final DateComparator ourInstance = new DateComparator();
		public static final DateComparator getInstance() { return ourInstance; }

		private DateComparator() { super(); }

		@Override
		public int compareInternal(Tournament argFirst, Tournament argSecond) {
			return argFirst.getDate().compareTo(argSecond.getDate());
		}
	}

	/** This is a Comparator that can be used to compare Tournament objects based on their Name values. */

	public static class NameComparator extends com.siliconage.util.NullSafeComparator<Tournament> {
		private static final NameComparator ourInstance = new NameComparator();
		public static final NameComparator getInstance() { return ourInstance; }

		private NameComparator() { super(); }

		@Override
		public int compareInternal(Tournament argFirst, Tournament argSecond) {
			return argFirst.getName().compareToIgnoreCase(argSecond.getName());
		}
	}

	/** This is a Comparator that can be used to compare Tournament objects based on their ShortName values. */

	public static class ShortNameComparator extends com.siliconage.util.NullSafeComparator<Tournament> {
		private static final ShortNameComparator ourInstance = new ShortNameComparator();
		public static final ShortNameComparator getInstance() { return ourInstance; }

		private ShortNameComparator() { super(); }

		@Override
		public int compareInternal(Tournament argFirst, Tournament argSecond) {
			return argFirst.getShortName().compareToIgnoreCase(argSecond.getShortName());
		}
	}

	/** This is a Comparator that can be used to compare Tournament objects based on their Code values. */

	public static class CodeComparator extends com.siliconage.util.NullSafeComparator<Tournament> {
		private static final CodeComparator ourInstance = new CodeComparator();
		public static final CodeComparator getInstance() { return ourInstance; }

		private CodeComparator() { super(); }

		@Override
		public int compareInternal(Tournament argFirst, Tournament argSecond) {
			return argFirst.getCode().compareToIgnoreCase(argSecond.getCode());
		}
	}

}
