package com.scobolsolo.application;

import com.opal.*;

/**
 * represents a <code>Buzzer</code> from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from the database table <code>buzzer</code>.  Do not modify this class directly; instead, alter the database table on which it is based and/or the Opal configuration file for the project and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various <code>forXXX</code> methods on the {@link BuzzerFactory} factory class.  To create new instances, use the <code>create()</code> method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link TransactionContext}.</p>
 *
 * <p>This interface and the {@link BuzzerFactory} class (the ones in the <code>com.scobolsolo.application</code> package) are the only two automatically generated files for the table that are intended to be referenced in user code. Other automatically generated files (namely those in the <code>com.scobolsolo.persistence</code> package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
public interface Buzzer extends IdentityUserFacing {
	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the Id
	 *
	 * <p>The Id field is a direct mapping of the <code>id</code> database column in the table <code>buzzer</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getId() method.</p>
	 *
	 * @return an object value of Id (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Integer getIdAsObject();
	/**
	 * primitive accessor for the Id
	 *
	 * <p>The Id field is a direct mapping of the <code>id</code> database column in the table <code>buzzer</code>.</p>
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
	 * <p>The SchoolRegistrationId field is a direct mapping of the <code>school_registration_id</code> database column in the table <code>buzzer</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getSchoolRegistrationId() method.</p>
	 *
	 * @return an object value of SchoolRegistrationId (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Integer getSchoolRegistrationIdAsObject();
	/**
	 * primitive accessor for the SchoolRegistrationId
	 *
	 * <p>The SchoolRegistrationId field is a direct mapping of the <code>school_registration_id</code> database column in the table <code>buzzer</code>.</p>
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
	 * object accessor for the RoomId
	 *
	 * <p>The RoomId field is a direct mapping of the <code>room_id</code> database column in the table <code>buzzer</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getRoomId() method.</p>
	 *
	 * @return an object value of RoomId (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.Integer getRoomIdAsObject();
	/**
	 * object accessor for the RoomId with substitution for a null value
	 *
	 * <p>The RoomId field is a direct mapping of the <code>room_id</code> database column in the table <code>buzzer</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the RoomId is <code>null</code>.
	 * @return an object value of RoomId (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getRoomIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getRoomIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the RoomId
	 *
	 * <p>The RoomId field is a direct mapping of the <code>room_id</code> database column in the table <code>buzzer</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getRoomIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a <code>NULL</code> value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of RoomId (of the current {@link TransactionContext})
	 * @throws NullValueException when the internal value is null
	 */
	default public int getRoomId() throws com.opal.NullValueException {
		java.lang.Integer lclO = getRoomIdAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getRoomId(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getRoomIdAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getRoomId(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getRoomIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * sets the RoomId to the value of <code>argRoomId</code>
	 *
	 * @param argRoomId the new value of RoomId.  May be <code>null</code>.
	 */
	public void setRoomId(java.lang.Integer argRoomId);

	/**
	 * sets the RoomId to the value of <code>argRoomId</code>
	 *
	 * @param argRoomId the new value of RoomId
	 */
	public void setRoomId(int argRoomId);

	/**
	 * object accessor for the Name
	 *
	 * <p>The Name field is a direct mapping of the <code>name</code> database column in the table <code>buzzer</code>.</p>
	 *
	 * @return an object value of Name (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.String getName();
	/**
	 * object accessor for the Name with substitution for a null value
	 *
	 * <p>The Name field is a direct mapping of the <code>name</code> database column in the table <code>buzzer</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the Name is <code>null</code>.
	 * @return an object value of Name (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getName(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getName();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the Name to the value of <code>argName</code>
	 *
	 * @param argName the new value of Name.  May be <code>null</code>.
	 * @throws ArgumentTooLongException if <code>argName</code> is longer than 256 characters
	 * <p>The database column <code>name</code> is limited to 256 characters.</p>
	 *
	 */
	@com.opal.annotation.Length(maximum = 256L)
	public void setName(java.lang.String argName);

	/**
	 * @return the <code>SchoolRegistration</code>
	 * The returned <code>SchoolRegistration</code> is the {@link UserFacing} object corresponding to the row in the <code>school_registration</code> that is referenced by the foreign key <code>buzzer_registration_id_fkey</code>.
	 *
	 */
	public SchoolRegistration getSchoolRegistration();
	public void setSchoolRegistration(SchoolRegistration argSchoolRegistration);

	/**
	 * @return the <code>Room</code>
	 * The returned <code>Room</code> is the {@link UserFacing} object corresponding to the row in the <code>room</code> that is referenced by the foreign key <code>buzzer_room_id_fkey</code>.
	 *
	 */
	public Room getRoom();
	public void setRoom(Room argRoom);

	public Buzzer copy();

	default public boolean hasMeaningfulName() {
		return com.scobolsolo.application.BuzzerDelegate.hasMeaningfulName(this);
	}

	/** This is a Comparator that can be used to compare Buzzer objects based on their Id values. */

	public static class IdComparator extends com.siliconage.util.NullSafeComparator<Buzzer> {
		private static final IdComparator ourInstance = new IdComparator();
		public static final IdComparator getInstance() { return ourInstance; }

		private IdComparator() { super(); }

		@Override
		public int compareInternal(Buzzer argFirst, Buzzer argSecond) {
			return argFirst.getIdAsObject().compareTo(argSecond.getIdAsObject());
		}
	}

	/** This is a Comparator that can be used to compare Buzzer objects based on their Name values. */

	public static class NameComparator extends com.siliconage.util.NullSafeComparator<Buzzer> {
		private static final NameComparator ourInstance = new NameComparator();
		public static final NameComparator getInstance() { return ourInstance; }

		private NameComparator() { super(); }

		@Override
		public int compareInternal(Buzzer argFirst, Buzzer argSecond) {
			return nullSafeCompareIgnoreCase(argFirst.getName(), argSecond.getName());
		}
	}

}
