package com.scobolsolo.application;

import com.opal.*;

/**
 * represents a <code>Player</code> from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from the database table <code>player</code>.  Do not modify this class directly; instead, alter the database table on which it is based and/or the Opal configuration file for the project and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various <code>forXXX</code> methods on the {@link PlayerFactory} factory class.  To create new instances, use the <code>create()</code> method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link TransactionContext}.</p>
 *
 * <p>This interface and the {@link PlayerFactory} class (the ones in the <code>com.scobolsolo.application</code> package) are the only two automatically generated files for the table that are intended to be referenced in user code. Other automatically generated files (namely those in the <code>com.scobolsolo.persistence</code> package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
public interface Player extends IdentityUserFacing {
	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the Id
	 *
	 * <p>The Id field is a direct mapping of the <code>id</code> database column in the table <code>player</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getId() method.</p>
	 *
	 * @return an object value of Id (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Integer getIdAsObject();
	/**
	 * primitive accessor for the Id
	 *
	 * <p>The Id field is a direct mapping of the <code>id</code> database column in the table <code>player</code>.</p>
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
	 * object accessor for the ContactId
	 *
	 * <p>The ContactId field is a direct mapping of the <code>contact_id</code> database column in the table <code>player</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getContactId() method.</p>
	 *
	 * @return an object value of ContactId (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Integer getContactIdAsObject();
	/**
	 * primitive accessor for the ContactId
	 *
	 * <p>The ContactId field is a direct mapping of the <code>contact_id</code> database column in the table <code>player</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getContactIdAsObject() method.</p>
	 *
	 * @return the primitive value of ContactId (of the current {@link TransactionContext})
	 */
	default public int getContactId() {
		java.lang.Integer lclO = getContactIdAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the ContactId to the value of <code>argContactId</code>
	 *
	 * @param argContactId the new value of ContactId.  May not be <code>null</code>.
	 * <p>The database column <code>contact_id</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argContactId is null
	 */
	@com.opal.annotation.NotNull
	public void setContactId(java.lang.Integer argContactId);

	/**
	 * sets the ContactId to the value of <code>argContactId</code>
	 *
	 * @param argContactId the new value of ContactId
	 */
	public void setContactId(int argContactId);

	/**
	 * object accessor for the SchoolRegistrationId
	 *
	 * <p>The SchoolRegistrationId field is a direct mapping of the <code>school_registration_id</code> database column in the table <code>player</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getSchoolRegistrationId() method.</p>
	 *
	 * @return an object value of SchoolRegistrationId (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.Integer getSchoolRegistrationIdAsObject();
	/**
	 * object accessor for the SchoolRegistrationId with substitution for a null value
	 *
	 * <p>The SchoolRegistrationId field is a direct mapping of the <code>school_registration_id</code> database column in the table <code>player</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the SchoolRegistrationId is <code>null</code>.
	 * @return an object value of SchoolRegistrationId (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getSchoolRegistrationIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getSchoolRegistrationIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the SchoolRegistrationId
	 *
	 * <p>The SchoolRegistrationId field is a direct mapping of the <code>school_registration_id</code> database column in the table <code>player</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getSchoolRegistrationIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a <code>NULL</code> value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of SchoolRegistrationId (of the current {@link TransactionContext})
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
	 * sets the SchoolRegistrationId to the value of <code>argSchoolRegistrationId</code>
	 *
	 * @param argSchoolRegistrationId the new value of SchoolRegistrationId.  May be <code>null</code>.
	 */
	public void setSchoolRegistrationId(java.lang.Integer argSchoolRegistrationId);

	/**
	 * sets the SchoolRegistrationId to the value of <code>argSchoolRegistrationId</code>
	 *
	 * @param argSchoolRegistrationId the new value of SchoolRegistrationId
	 */
	public void setSchoolRegistrationId(int argSchoolRegistrationId);

	/**
	 * object accessor for the SchoolYearCode
	 *
	 * <p>The SchoolYearCode field is a direct mapping of the <code>school_year_code</code> database column in the table <code>player</code>.</p>
	 *
	 * @return an object value of SchoolYearCode (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.String getSchoolYearCode();
	/**
	 * object accessor for the SchoolYearCode with substitution for a null value
	 *
	 * <p>The SchoolYearCode field is a direct mapping of the <code>school_year_code</code> database column in the table <code>player</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the SchoolYearCode is <code>null</code>.
	 * @return an object value of SchoolYearCode (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getSchoolYearCode(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getSchoolYearCode();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the SchoolYearCode to the value of <code>argSchoolYearCode</code>
	 *
	 * @param argSchoolYearCode the new value of SchoolYearCode.  May be <code>null</code>.
	 * @throws ArgumentTooLongException if <code>argSchoolYearCode</code> is longer than 32 characters
	 * <p>The database column <code>school_year_code</code> is limited to 32 characters.</p>
	 *
	 */
	@com.opal.annotation.Length(maximum = 32L)
	public void setSchoolYearCode(java.lang.String argSchoolYearCode);

	/**
	 * object accessor for the RankWithinSchool
	 *
	 * <p>The RankWithinSchool field is a direct mapping of the <code>rank_within_school</code> database column in the table <code>player</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getRankWithinSchool() method.</p>
	 *
	 * @return an object value of RankWithinSchool (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.Integer getRankWithinSchoolAsObject();
	/**
	 * object accessor for the RankWithinSchool with substitution for a null value
	 *
	 * <p>The RankWithinSchool field is a direct mapping of the <code>rank_within_school</code> database column in the table <code>player</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the RankWithinSchool is <code>null</code>.
	 * @return an object value of RankWithinSchool (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getRankWithinSchoolAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getRankWithinSchoolAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the RankWithinSchool
	 *
	 * <p>The RankWithinSchool field is a direct mapping of the <code>rank_within_school</code> database column in the table <code>player</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getRankWithinSchoolAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a <code>NULL</code> value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of RankWithinSchool (of the current {@link TransactionContext})
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
	 * sets the RankWithinSchool to the value of <code>argRankWithinSchool</code>
	 *
	 * @param argRankWithinSchool the new value of RankWithinSchool.  May be <code>null</code>.
	 */
	public void setRankWithinSchool(java.lang.Integer argRankWithinSchool);

	/**
	 * sets the RankWithinSchool to the value of <code>argRankWithinSchool</code>
	 *
	 * @param argRankWithinSchool the new value of RankWithinSchool
	 */
	public void setRankWithinSchool(int argRankWithinSchool);

	/**
	 * object accessor for the Seed
	 *
	 * <p>The Seed field is a direct mapping of the <code>seed</code> database column in the table <code>player</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getSeed() method.</p>
	 *
	 * @return an object value of Seed (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.Integer getSeedAsObject();
	/**
	 * object accessor for the Seed with substitution for a null value
	 *
	 * <p>The Seed field is a direct mapping of the <code>seed</code> database column in the table <code>player</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the Seed is <code>null</code>.
	 * @return an object value of Seed (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getSeedAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getSeedAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the Seed
	 *
	 * <p>The Seed field is a direct mapping of the <code>seed</code> database column in the table <code>player</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getSeedAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a <code>NULL</code> value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of Seed (of the current {@link TransactionContext})
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
	 * sets the Seed to the value of <code>argSeed</code>
	 *
	 * @param argSeed the new value of Seed.  May be <code>null</code>.
	 */
	public void setSeed(java.lang.Integer argSeed);

	/**
	 * sets the Seed to the value of <code>argSeed</code>
	 *
	 * @param argSeed the new value of Seed
	 */
	public void setSeed(int argSeed);

	/**
	 * object accessor for the Note
	 *
	 * <p>The Note field is a direct mapping of the <code>note</code> database column in the table <code>player</code>.</p>
	 *
	 * @return an object value of Note (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.String getNote();
	/**
	 * object accessor for the Note with substitution for a null value
	 *
	 * <p>The Note field is a direct mapping of the <code>note</code> database column in the table <code>player</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the Note is <code>null</code>.
	 * @return an object value of Note (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getNote(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getNote();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the Note to the value of <code>argNote</code>
	 *
	 * @param argNote the new value of Note.  May be <code>null</code>.
	 * @throws ArgumentTooLongException if <code>argNote</code> is longer than 2147483647 characters
	 * <p>The database column <code>note</code> is limited to 2147483647 characters.</p>
	 *
	 */
	@com.opal.annotation.Length(maximum = 2147483647L)
	public void setNote(java.lang.String argNote);

	/**
	 * object accessor for the InitialCardId
	 *
	 * <p>The InitialCardId field is a direct mapping of the <code>initial_card_id</code> database column in the table <code>player</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getInitialCardId() method.</p>
	 *
	 * @return an object value of InitialCardId (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.Integer getInitialCardIdAsObject();
	/**
	 * object accessor for the InitialCardId with substitution for a null value
	 *
	 * <p>The InitialCardId field is a direct mapping of the <code>initial_card_id</code> database column in the table <code>player</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the InitialCardId is <code>null</code>.
	 * @return an object value of InitialCardId (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getInitialCardIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getInitialCardIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the InitialCardId
	 *
	 * <p>The InitialCardId field is a direct mapping of the <code>initial_card_id</code> database column in the table <code>player</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getInitialCardIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a <code>NULL</code> value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of InitialCardId (of the current {@link TransactionContext})
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
	 * sets the InitialCardId to the value of <code>argInitialCardId</code>
	 *
	 * @param argInitialCardId the new value of InitialCardId.  May be <code>null</code>.
	 */
	public void setInitialCardId(java.lang.Integer argInitialCardId);

	/**
	 * sets the InitialCardId to the value of <code>argInitialCardId</code>
	 *
	 * @param argInitialCardId the new value of InitialCardId
	 */
	public void setInitialCardId(int argInitialCardId);

	/**
	 * object accessor for the Exhibition
	 *
	 * <p>The Exhibition field is a direct mapping of the <code>exhibition</code> database column in the table <code>player</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isExhibition() method.</p>
	 *
	 * @return an object value of Exhibition (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Boolean isExhibitionAsObject();
	/**
	 * primitive accessor for the Exhibition
	 *
	 * <p>The Exhibition field is a direct mapping of the <code>exhibition</code> database column in the table <code>player</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the isExhibitionAsObject() method.</p>
	 *
	 * @return the primitive value of Exhibition (of the current {@link TransactionContext})
	 */
	default public boolean isExhibition() {
		java.lang.Boolean lclO = isExhibitionAsObject();
		return lclO.booleanValue();
	}

	/**
	 * sets the Exhibition to the value of <code>argExhibition</code>
	 *
	 * @param argExhibition the new value of Exhibition.  May not be <code>null</code>.
	 * <p>The database column <code>exhibition</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argExhibition is null
	 */
	@com.opal.annotation.NotNull
	public void setExhibition(java.lang.Boolean argExhibition);

	/**
	 * sets the Exhibition to the value of <code>argExhibition</code>
	 *
	 * @param argExhibition the new value of Exhibition
	 */
	public void setExhibition(boolean argExhibition);

	/**
	 * @return the <code>Contact</code>
	 * The returned <code>Contact</code> is the {@link UserFacing} object corresponding to the row in the <code>contact</code> that is referenced by the foreign key <code>player_contact_id_fkey</code>.
	 *
	 */
	public Contact getContact();
	public void setContact(Contact argContact);

	/**
	 * @return the <code>Card</code>
	 * The returned <code>Card</code> is the {@link UserFacing} object corresponding to the row in the <code>card</code> that is referenced by the foreign key <code>player_initial_card_id_fkey</code>.
	 *
	 */
	public Card getInitialCard();
	public void setInitialCard(Card argCard);

	/**
	 * @return the <code>SchoolRegistration</code>
	 * The returned <code>SchoolRegistration</code> is the {@link UserFacing} object corresponding to the row in the <code>school_registration</code> that is referenced by the foreign key <code>player_registration_id_fkey</code>.
	 *
	 */
	public SchoolRegistration getSchoolRegistration();
	public void setSchoolRegistration(SchoolRegistration argSchoolRegistration);

	/**
	 * @return the <code>SchoolYear</code>
	 * The returned <code>SchoolYear</code> is the {@link UserFacing} object corresponding to the row in the <code>school_year</code> that is referenced by the foreign key <code>player_school_year_code_fkey</code>.
	 *
	 */
	public SchoolYear getSchoolYear();
	public void setSchoolYear(SchoolYear argSchoolYear);

	public int getIncomingLosingCardGameCount();
	public java.util.Iterator<Game> createIncomingLosingCardGameIterator();

	public java.util.stream.Stream<Game> streamIncomingLosingCardGame();

	public void addIncomingLosingCardGame(Game argGame);
	public void removeIncomingLosingCardGame(Game argGame);
	public void clearIncomingLosingCardGame();

	default public <T extends java.util.Collection<? super Game>> T acquireIncomingLosingCardGame(T argC) {
		org.apache.commons.lang3.Validate.notNull(argC);
		java.util.Iterator<Game> lclI = createIncomingLosingCardGameIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public Game[] createIncomingLosingCardGameArray() {
		int lclLength = getIncomingLosingCardGameCount();
		Game[] lclA = new Game[lclLength];
		int lclIndex = 0;
		java.util.Iterator<Game> lclI = createIncomingLosingCardGameIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public int getIncomingWinningCardGameCount();
	public java.util.Iterator<Game> createIncomingWinningCardGameIterator();

	public java.util.stream.Stream<Game> streamIncomingWinningCardGame();

	public void addIncomingWinningCardGame(Game argGame);
	public void removeIncomingWinningCardGame(Game argGame);
	public void clearIncomingWinningCardGame();

	default public <T extends java.util.Collection<? super Game>> T acquireIncomingWinningCardGame(T argC) {
		org.apache.commons.lang3.Validate.notNull(argC);
		java.util.Iterator<Game> lclI = createIncomingWinningCardGameIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public Game[] createIncomingWinningCardGameArray() {
		int lclLength = getIncomingWinningCardGameCount();
		Game[] lclA = new Game[lclLength];
		int lclIndex = 0;
		java.util.Iterator<Game> lclI = createIncomingWinningCardGameIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public int getOutgoingLosingCardGameCount();
	public java.util.Iterator<Game> createOutgoingLosingCardGameIterator();

	public java.util.stream.Stream<Game> streamOutgoingLosingCardGame();

	public void addOutgoingLosingCardGame(Game argGame);
	public void removeOutgoingLosingCardGame(Game argGame);
	public void clearOutgoingLosingCardGame();

	default public <T extends java.util.Collection<? super Game>> T acquireOutgoingLosingCardGame(T argC) {
		org.apache.commons.lang3.Validate.notNull(argC);
		java.util.Iterator<Game> lclI = createOutgoingLosingCardGameIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public Game[] createOutgoingLosingCardGameArray() {
		int lclLength = getOutgoingLosingCardGameCount();
		Game[] lclA = new Game[lclLength];
		int lclIndex = 0;
		java.util.Iterator<Game> lclI = createOutgoingLosingCardGameIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public int getOutgoingWinningCardGameCount();
	public java.util.Iterator<Game> createOutgoingWinningCardGameIterator();

	public java.util.stream.Stream<Game> streamOutgoingWinningCardGame();

	public void addOutgoingWinningCardGame(Game argGame);
	public void removeOutgoingWinningCardGame(Game argGame);
	public void clearOutgoingWinningCardGame();

	default public <T extends java.util.Collection<? super Game>> T acquireOutgoingWinningCardGame(T argC) {
		org.apache.commons.lang3.Validate.notNull(argC);
		java.util.Iterator<Game> lclI = createOutgoingWinningCardGameIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public Game[] createOutgoingWinningCardGameArray() {
		int lclLength = getOutgoingWinningCardGameCount();
		Game[] lclA = new Game[lclLength];
		int lclIndex = 0;
		java.util.Iterator<Game> lclI = createOutgoingWinningCardGameIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

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

	public Player copy();

	default public com.scobolsolo.application.Performance findPerformance(com.scobolsolo.application.Game argA) {
		return com.scobolsolo.application.PlayerDelegate.findPerformance(this, argA);
	}

	default public String getNameWithSchool() {
		return com.scobolsolo.application.PlayerDelegate.getNameWithSchool(this);
	}

	default public String getNameWithSchoolShortName() {
		return com.scobolsolo.application.PlayerDelegate.getNameWithSchoolShortName(this);
	}

	/** This is a Comparator that can be used to compare Player objects based on their Id values. */

	public static class IdComparator extends com.siliconage.util.NullSafeComparator<Player> {
		private static final IdComparator ourInstance = new IdComparator();
		public static final IdComparator getInstance() { return ourInstance; }

		private IdComparator() { super(); }

		@Override
		public int compareInternal(Player argFirst, Player argSecond) {
			return argFirst.getIdAsObject().compareTo(argSecond.getIdAsObject());
		}
	}

	public static class NameComparator extends com.siliconage.util.NullSafeComparator<Player> {
		private static final NameComparator ourInstance = new NameComparator();
		public static final NameComparator getInstance() { return ourInstance; }

		private NameComparator() { super(); }

		@Override
		public int compareInternal(Player argFirst, Player argSecond) {
			return com.scobolsolo.application.Contact.SortByComparator.getInstance().compare(argFirst.getContact(), argSecond.getContact());
		}
	}

	public static class RankWithinSchoolComparator extends com.siliconage.util.NullSafeComparator<Player> {
		private static final RankWithinSchoolComparator ourInstance = new RankWithinSchoolComparator();
		public static final RankWithinSchoolComparator getInstance() { return ourInstance; }

		private RankWithinSchoolComparator() { super(); }

		@Override
		public int compareInternal(Player argFirst, Player argSecond) {
			int lclResult = nullSafeCompare(argFirst.getRankWithinSchoolAsObject(), argSecond.getRankWithinSchoolAsObject());
			if (lclResult != 0) {
				return lclResult;
			}
			return com.scobolsolo.application.Contact.SortByComparator.getInstance().compare(argFirst.getContact(), argSecond.getContact());
		}
	}

	public static class SeedComparator extends com.siliconage.util.NullSafeComparator<Player> {
		private static final SeedComparator ourInstance = new SeedComparator();
		public static final SeedComparator getInstance() { return ourInstance; }

		private SeedComparator() { super(); }

		@Override
		public int compareInternal(Player argFirst, Player argSecond) {
			int lclResult = nullSafeCompare(argFirst.getSeedAsObject(), argSecond.getSeedAsObject());
			if (lclResult != 0) {
				return lclResult;
			}
			return com.scobolsolo.application.Contact.SortByComparator.getInstance().compare(argFirst.getContact(), argSecond.getContact());
		}
	}

	public static class TournamentDateComparator extends com.siliconage.util.NullSafeComparator<Player> {
		private static final TournamentDateComparator ourInstance = new TournamentDateComparator();
		public static final TournamentDateComparator getInstance() { return ourInstance; }

		private TournamentDateComparator() { super(); }

		@Override
		public int compareInternal(Player argFirst, Player argSecond) {
			return com.scobolsolo.application.SchoolRegistration.TournamentDateComparator.getInstance().compare(argFirst.getSchoolRegistration(), argSecond.getSchoolRegistration());
		}
	}

	public static class SchoolNameComparator extends com.siliconage.util.NullSafeComparator<Player> {
		private static final SchoolNameComparator ourInstance = new SchoolNameComparator();
		public static final SchoolNameComparator getInstance() { return ourInstance; }

		private SchoolNameComparator() { super(); }

		@Override
		public int compareInternal(Player argFirst, Player argSecond) {
			return com.scobolsolo.application.SchoolRegistration.SchoolNameComparator.getInstance().compare(argFirst.getSchoolRegistration(), argSecond.getSchoolRegistration());
		}
	}

	public static class SchoolShortNameComparator extends com.siliconage.util.NullSafeComparator<Player> {
		private static final SchoolShortNameComparator ourInstance = new SchoolShortNameComparator();
		public static final SchoolShortNameComparator getInstance() { return ourInstance; }

		private SchoolShortNameComparator() { super(); }

		@Override
		public int compareInternal(Player argFirst, Player argSecond) {
			return com.scobolsolo.application.SchoolRegistration.SchoolNameComparator.getInstance().compare(argFirst.getSchoolRegistration(), argSecond.getSchoolRegistration());
		}
	}

}
