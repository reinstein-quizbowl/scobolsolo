package com.scobolsolo.application;

import com.opal.*;

/**
 * represents a <code>StaffAssignment</code> from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from the database table <code>staff_assignment</code>.  Do not modify this class directly; instead, alter the database table on which it is based and/or the Opal configuration file for the project and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various <code>forXXX</code> methods on the {@link StaffAssignmentFactory} factory class.  To create new instances, use the <code>create()</code> method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link TransactionContext}.</p>
 *
 * <p>This interface and the {@link StaffAssignmentFactory} class (the ones in the <code>com.scobolsolo.application</code> package) are the only two automatically generated files for the table that are intended to be referenced in user code. Other automatically generated files (namely those in the <code>com.scobolsolo.persistence</code> package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
public interface StaffAssignment extends IdentityUserFacing {
	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the Id
	 *
	 * <p>The Id field is a direct mapping of the <code>id</code> database column in the table <code>staff_assignment</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getId() method.</p>
	 *
	 * @return an object value of Id (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Integer getIdAsObject();
	/**
	 * primitive accessor for the Id
	 *
	 * <p>The Id field is a direct mapping of the <code>id</code> database column in the table <code>staff_assignment</code>.</p>
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
	 * object accessor for the RoomId
	 *
	 * <p>The RoomId field is a direct mapping of the <code>room_id</code> database column in the table <code>staff_assignment</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getRoomId() method.</p>
	 *
	 * @return an object value of RoomId (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Integer getRoomIdAsObject();
	/**
	 * primitive accessor for the RoomId
	 *
	 * <p>The RoomId field is a direct mapping of the <code>room_id</code> database column in the table <code>staff_assignment</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getRoomIdAsObject() method.</p>
	 *
	 * @return the primitive value of RoomId (of the current {@link TransactionContext})
	 */
	default public int getRoomId() {
		java.lang.Integer lclO = getRoomIdAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the RoomId to the value of <code>argRoomId</code>
	 *
	 * @param argRoomId the new value of RoomId.  May not be <code>null</code>.
	 * <p>The database column <code>room_id</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argRoomId is null
	 */
	@com.opal.annotation.NotNull
	public void setRoomId(java.lang.Integer argRoomId);

	/**
	 * sets the RoomId to the value of <code>argRoomId</code>
	 *
	 * @param argRoomId the new value of RoomId
	 */
	public void setRoomId(int argRoomId);

	/**
	 * object accessor for the Note
	 *
	 * <p>The Note field is a direct mapping of the <code>note</code> database column in the table <code>staff_assignment</code>.</p>
	 *
	 * @return an object value of Note (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.String getNote();
	/**
	 * object accessor for the Note with substitution for a null value
	 *
	 * <p>The Note field is a direct mapping of the <code>note</code> database column in the table <code>staff_assignment</code>.</p>
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
	 * object accessor for the StaffId
	 *
	 * <p>The StaffId field is a direct mapping of the <code>staff_id</code> database column in the table <code>staff_assignment</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getStaffId() method.</p>
	 *
	 * @return an object value of StaffId (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Integer getStaffIdAsObject();
	/**
	 * primitive accessor for the StaffId
	 *
	 * <p>The StaffId field is a direct mapping of the <code>staff_id</code> database column in the table <code>staff_assignment</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getStaffIdAsObject() method.</p>
	 *
	 * @return the primitive value of StaffId (of the current {@link TransactionContext})
	 */
	default public int getStaffId() {
		java.lang.Integer lclO = getStaffIdAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the StaffId to the value of <code>argStaffId</code>
	 *
	 * @param argStaffId the new value of StaffId.  May not be <code>null</code>.
	 * <p>The database column <code>staff_id</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argStaffId is null
	 */
	@com.opal.annotation.NotNull
	public void setStaffId(java.lang.Integer argStaffId);

	/**
	 * sets the StaffId to the value of <code>argStaffId</code>
	 *
	 * @param argStaffId the new value of StaffId
	 */
	public void setStaffId(int argStaffId);

	/**
	 * @return the <code>Staff</code>
	 * The returned <code>Staff</code> is the {@link UserFacing} object corresponding to the row in the <code>staff</code> that is referenced by the foreign key <code>staff_assignment_staff_id_fkey</code>.
	 *
	 */
	public Staff getStaff();
	public void setStaff(Staff argStaff);

	/**
	 * @return the <code>Room</code>
	 * The returned <code>Room</code> is the {@link UserFacing} object corresponding to the row in the <code>room</code> that is referenced by the foreign key <code>staffer_assignment_room_id_fkey</code>.
	 *
	 */
	public Room getRoom();
	public void setRoom(Room argRoom);

	public StaffAssignment copy();

	/** This is a Comparator that can be used to compare StaffAssignment objects based on their Id values. */

	public static class IdComparator extends com.siliconage.util.NullSafeComparator<StaffAssignment> {
		private static final IdComparator ourInstance = new IdComparator();
		public static final IdComparator getInstance() { return ourInstance; }

		private IdComparator() { super(); }

		@Override
		public int compareInternal(StaffAssignment argFirst, StaffAssignment argSecond) {
			return argFirst.getIdAsObject().compareTo(argSecond.getIdAsObject());
		}
	}

	public static class StaffNameComparator extends com.siliconage.util.NullSafeComparator<StaffAssignment> {
		private static final StaffNameComparator ourInstance = new StaffNameComparator();
		public static final StaffNameComparator getInstance() { return ourInstance; }

		private StaffNameComparator() { super(); }

		@Override
		public int compareInternal(StaffAssignment argFirst, StaffAssignment argSecond) {
			return com.scobolsolo.application.Staff.NameComparator.getInstance().compare(argFirst.getStaff(), argSecond.getStaff());
		}
	}

	public static class RoomSequenceComparator extends com.siliconage.util.NullSafeComparator<StaffAssignment> {
		private static final RoomSequenceComparator ourInstance = new RoomSequenceComparator();
		public static final RoomSequenceComparator getInstance() { return ourInstance; }

		private RoomSequenceComparator() { super(); }

		@Override
		public int compareInternal(StaffAssignment argFirst, StaffAssignment argSecond) {
			return com.scobolsolo.application.Room.SequenceComparator.getInstance().compare(argFirst.getRoom(), argSecond.getRoom());
		}
	}

}
