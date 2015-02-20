package com.scobolsolo.application;

import com.opal.*;

/**
 * represents a <code>StandbyEntry</code> from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from the database table <code>standby_entry</code>.  Do not modify this class directly; instead, alter the database table on which it is based and/or the Opal configuration file for the project and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various <code>forXXX</code> methods on the {@link StandbyEntryFactory} factory class.  To create new instances, use the <code>create()</code> method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link TransactionContext}.</p>
 *
 * <p>This interface and the {@link StandbyEntryFactory} class (the ones in the <code>com.scobolsolo.application</code> package) are the only two automatically generated files for the table that are intended to be referenced in user code. Other automatically generated files (namely those in the <code>com.scobolsolo.persistence</code> package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
public interface StandbyEntry extends IdentityUserFacing, Comparable<StandbyEntry> {
	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the Id
	 *
	 * <p>The Id field is a direct mapping of the <code>id</code> database column in the table <code>standby_entry</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getId() method.</p>
	 *
	 * @return an object value of Id (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Integer getIdAsObject();
	/**
	 * primitive accessor for the Id
	 *
	 * <p>The Id field is a direct mapping of the <code>id</code> database column in the table <code>standby_entry</code>.</p>
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
	 * object accessor for the SchoolRegistrationId
	 *
	 * <p>The SchoolRegistrationId field is a direct mapping of the <code>school_registration_id</code> database column in the table <code>standby_entry</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getSchoolRegistrationId() method.</p>
	 *
	 * @return an object value of SchoolRegistrationId (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Integer getSchoolRegistrationIdAsObject();
	/**
	 * primitive accessor for the SchoolRegistrationId
	 *
	 * <p>The SchoolRegistrationId field is a direct mapping of the <code>school_registration_id</code> database column in the table <code>standby_entry</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getSchoolRegistrationIdAsObject() method.</p>
	 *
	 * @return the primitive value of SchoolRegistrationId (of the current {@link TransactionContext})
	 */
	default public int getSchoolRegistrationId() {
		java.lang.Integer lclO = getSchoolRegistrationIdAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the SchoolRegistrationId to the value of <code>argSchoolRegistrationId</code>
	 *
	 * @param argSchoolRegistrationId the new value of SchoolRegistrationId.  May not be <code>null</code>.
	 * <p>The database column <code>school_registration_id</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argSchoolRegistrationId is null
	 */
	@com.opal.annotation.NotNull
	public void setSchoolRegistrationId(java.lang.Integer argSchoolRegistrationId);

	/**
	 * sets the SchoolRegistrationId to the value of <code>argSchoolRegistrationId</code>
	 *
	 * @param argSchoolRegistrationId the new value of SchoolRegistrationId
	 */
	public void setSchoolRegistrationId(int argSchoolRegistrationId);

	/**
	 * object accessor for the Sequence
	 *
	 * <p>The Sequence field is a direct mapping of the <code>sequence</code> database column in the table <code>standby_entry</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getSequence() method.</p>
	 *
	 * @return an object value of Sequence (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Integer getSequenceAsObject();
	/**
	 * primitive accessor for the Sequence
	 *
	 * <p>The Sequence field is a direct mapping of the <code>sequence</code> database column in the table <code>standby_entry</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getSequenceAsObject() method.</p>
	 *
	 * @return the primitive value of Sequence (of the current {@link TransactionContext})
	 */
	default public int getSequence() {
		java.lang.Integer lclO = getSequenceAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the Sequence to the value of <code>argSequence</code>
	 *
	 * @param argSequence the new value of Sequence.  May not be <code>null</code>.
	 * <p>The database column <code>sequence</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argSequence is null
	 */
	@com.opal.annotation.NotNull
	public void setSequence(java.lang.Integer argSequence);

	/**
	 * sets the Sequence to the value of <code>argSequence</code>
	 *
	 * @param argSequence the new value of Sequence
	 */
	public void setSequence(int argSequence);

	/**
	 * object accessor for the PlayerCount
	 *
	 * <p>The PlayerCount field is a direct mapping of the <code>player_count</code> database column in the table <code>standby_entry</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getPlayerCount() method.</p>
	 *
	 * @return an object value of PlayerCount (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Integer getPlayerCountAsObject();
	/**
	 * primitive accessor for the PlayerCount
	 *
	 * <p>The PlayerCount field is a direct mapping of the <code>player_count</code> database column in the table <code>standby_entry</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getPlayerCountAsObject() method.</p>
	 *
	 * @return the primitive value of PlayerCount (of the current {@link TransactionContext})
	 */
	default public int getPlayerCount() {
		java.lang.Integer lclO = getPlayerCountAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the PlayerCount to the value of <code>argPlayerCount</code>
	 *
	 * @param argPlayerCount the new value of PlayerCount.  May not be <code>null</code>.
	 * <p>The database column <code>player_count</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argPlayerCount is null
	 */
	@com.opal.annotation.NotNull
	public void setPlayerCount(java.lang.Integer argPlayerCount);

	/**
	 * sets the PlayerCount to the value of <code>argPlayerCount</code>
	 *
	 * @param argPlayerCount the new value of PlayerCount
	 */
	public void setPlayerCount(int argPlayerCount);

	/**
	 * object accessor for the Note
	 *
	 * <p>The Note field is a direct mapping of the <code>note</code> database column in the table <code>standby_entry</code>.</p>
	 *
	 * @return an object value of Note (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.String getNote();
	/**
	 * object accessor for the Note with substitution for a null value
	 *
	 * <p>The Note field is a direct mapping of the <code>note</code> database column in the table <code>standby_entry</code>.</p>
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
	 * @return the <code>SchoolRegistration</code>
	 * The returned <code>SchoolRegistration</code> is the {@link UserFacing} object corresponding to the row in the <code>school_registration</code> that is referenced by the foreign key <code>standby_entry_school_registration_id_fkey</code>.
	 *
	 */
	public SchoolRegistration getSchoolRegistration();
	public void setSchoolRegistration(SchoolRegistration argSchoolRegistration);

	public StandbyEntry copy();

	/** This is a Comparator that can be used to compare StandbyEntry objects based on their Id values. */

	public static class IdComparator extends com.siliconage.util.NullSafeComparator<StandbyEntry> {
		private static final IdComparator ourInstance = new IdComparator();
		public static final IdComparator getInstance() { return ourInstance; }

		private IdComparator() { super(); }

		@Override
		public int compareInternal(StandbyEntry argFirst, StandbyEntry argSecond) {
			return argFirst.getIdAsObject().compareTo(argSecond.getIdAsObject());
		}
	}

	/** This is a Comparator that can be used to compare StandbyEntry objects based on their Sequence values. */

	public static class SequenceComparator extends com.siliconage.util.NullSafeComparator<StandbyEntry> {
		private static final SequenceComparator ourInstance = new SequenceComparator();
		public static final SequenceComparator getInstance() { return ourInstance; }

		private SequenceComparator() { super(); }

		@Override
		public int compareInternal(StandbyEntry argFirst, StandbyEntry argSecond) {
			return argFirst.getSequenceAsObject().compareTo(argSecond.getSequenceAsObject());
		}
	}

}
