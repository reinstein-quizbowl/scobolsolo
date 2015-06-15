package com.scobolsolo.persistence;

import com.opal.*;

/**
 * represents a {@code Buzzer} from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from {@code buzzer}.  Do not modify this class directly; instead, alter the permanent storage on which it is based, the Opal configuration file for the project, and/or the {@link com.scobolsolo.application.Buzzer}, and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various {@code forXXX} methods on the {@link com.scobolsolo.application.BuzzerFactory} factory class.  To create new instances, use the {@code create()} method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link com.opal.TransactionContext}.</p>
 *
 * <p>This interface is not meant to be referenced in user code.  Only the {@link com.scobolsolo.application.Buzzer} and the {@link com.scobolsolo.application.BuzzerFactory} class should be referenced directly.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
public interface BuzzerUserFacing extends IdentityUserFacing {
	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the {@code Id}
	 *
	 * <p>The {@code Id} field is a direct mapping of the {@code id} field in {@code buzzer}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getId() method.</p>
	 *
	 * @return an object value of {@code Id} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.Integer getIdAsObject();

	/**
	 * primitive accessor for the {@code Id}
	 *
	 * <p>The {@code Id} field is a direct mapping of the {@code id} field in {@code buzzer}.</p>
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
	 * <p>The database column {@code id} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argId is null
	 */
	@com.opal.annotation.NotNull
	public void setId(java.lang.Integer argId);

	/**
	 * sets the {@code Id} to the value of {@code argId}
	 *
	 * @param argId the new value of {@code Id}
	 */
	public void setId(int argId);

	/**
	 * object accessor for the {@code SchoolRegistrationId}
	 *
	 * <p>The {@code SchoolRegistrationId} field is a direct mapping of the {@code school_registration_id} field in {@code buzzer}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getSchoolRegistrationId() method.</p>
	 *
	 * @return an object value of {@code SchoolRegistrationId} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.Integer getSchoolRegistrationIdAsObject();

	/**
	 * primitive accessor for the {@code SchoolRegistrationId}
	 *
	 * <p>The {@code SchoolRegistrationId} field is a direct mapping of the {@code school_registration_id} field in {@code buzzer}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getSchoolRegistrationIdAsObject() method.</p>
	 *
	 * @return the primitive value of {@code SchoolRegistrationId} (of the current {@link com.opal.TransactionContext})
	 */
	default public int getSchoolRegistrationId() {
		java.lang.Integer lclO = getSchoolRegistrationIdAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the {@code SchoolRegistrationId} to the value of {@code argSchoolRegistrationId}
	 *
	 * @param argSchoolRegistrationId the new value of {@code SchoolRegistrationId}.  May not be <code>null</code>.
	 * <p>The database column {@code school_registration_id} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argSchoolRegistrationId is null
	 */
	@com.opal.annotation.NotNull
	public void setSchoolRegistrationId(java.lang.Integer argSchoolRegistrationId);

	/**
	 * sets the {@code SchoolRegistrationId} to the value of {@code argSchoolRegistrationId}
	 *
	 * @param argSchoolRegistrationId the new value of {@code SchoolRegistrationId}
	 */
	public void setSchoolRegistrationId(int argSchoolRegistrationId);

	/**
	 * object accessor for the {@code RoomId}
	 *
	 * <p>The {@code RoomId} field is a direct mapping of the {@code room_id} field in {@code buzzer}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getRoomId() method.</p>
	 *
	 * @return an object value of {@code RoomId} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	public java.lang.Integer getRoomIdAsObject();

	/**
	 * object accessor for the {@code RoomId} with substitution for a null value
	 *
	 * <p>The {@code RoomId} field is a direct mapping of the {@code room_id} field in {@code buzzer}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code RoomId} is {@code null}.
	 * @return an object value of {@code RoomId} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getRoomIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getRoomIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code RoomId}
	 *
	 * <p>The {@code RoomId} field is a direct mapping of the {@code room_id} field in {@code buzzer}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getRoomIdAsObject() method.</p>
	 *
	 * <p>The underlying permanent storage allows a {@code NULL} value for this field; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code RoomId} (of the current {@link com.opal.TransactionContext})
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
	 * sets the {@code RoomId} to the value of {@code argRoomId}
	 *
	 * @param argRoomId the new value of {@code RoomId}.  May be <code>null</code>.
	 */
	public void setRoomId(java.lang.Integer argRoomId);

	/**
	 * sets the {@code RoomId} to the value of {@code argRoomId}
	 *
	 * @param argRoomId the new value of {@code RoomId}
	 */
	public void setRoomId(int argRoomId);

	/**
	 * object accessor for the {@code Name}
	 *
	 * <p>The {@code Name} field is a direct mapping of the {@code name} field in {@code buzzer}.</p>
	 *
	 * @return an object value of {@code Name} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	public java.lang.String getName();

	/**
	 * object accessor for the {@code Name} with substitution for a null value
	 *
	 * <p>The {@code Name} field is a direct mapping of the {@code name} field in {@code buzzer}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code Name} is {@code null}.
	 * @return an object value of {@code Name} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getName(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getName();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the {@code Name} to the value of {@code argName}
	 *
	 * @param argName the new value of {@code Name}.  May be <code>null</code>.
	 * @throws ArgumentTooLongException if {@code argName} is longer than 256 characters
	 * <p>The database column {@code name} is limited to 256 characters.</p>
	 *
	 */
	@com.opal.annotation.Length(maximum = 256L)
	public void setName(java.lang.String argName);

	/**
	 * @return the {@code com.scobolsolo.application.SchoolRegistration}
	 * The returned {@code com.scobolsolo.application.SchoolRegistration} is the {@link UserFacing} object corresponding to the entry in {@code school_registration} that is referenced by {@code buzzer_registration_id_fkey}.
	 *
	 */
	public com.scobolsolo.application.SchoolRegistration getSchoolRegistration();
	public void setSchoolRegistration(com.scobolsolo.application.SchoolRegistration argSchoolRegistration);

	/**
	 * @return the {@code com.scobolsolo.application.Room}
	 * The returned {@code com.scobolsolo.application.Room} is the {@link UserFacing} object corresponding to the entry in {@code room} that is referenced by {@code buzzer_room_id_fkey}.
	 *
	 */
	public com.scobolsolo.application.Room getRoom();
	public void setRoom(com.scobolsolo.application.Room argRoom);

	public com.scobolsolo.application.Buzzer copy();

	/** This is a Comparator that can be used to compare Buzzer objects based on their {@code Id} values. */

	public static class IdComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Buzzer> {
		private static final IdComparator ourInstance = new IdComparator();
		public static final IdComparator getInstance() { return ourInstance; }

		private IdComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Buzzer argFirst, com.scobolsolo.application.Buzzer argSecond) {
			return argFirst.getIdAsObject().compareTo(argSecond.getIdAsObject());
		}
	}

	/** This is a Comparator that can be used to compare Buzzer objects based on their {@code Name} values. */

	public static class NameComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Buzzer> {
		private static final NameComparator ourInstance = new NameComparator();
		public static final NameComparator getInstance() { return ourInstance; }

		private NameComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Buzzer argFirst, com.scobolsolo.application.Buzzer argSecond) {
			return nullSafeCompareIgnoreCase(argFirst.getName(), argSecond.getName());
		}
	}

}
