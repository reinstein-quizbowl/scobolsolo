package com.scobolsolo.application;

import com.opal.*;

/**
 * represents a <code>Staff</code> from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from the database table <code>staff</code>.  Do not modify this class directly; instead, alter the database table on which it is based and/or the Opal configuration file for the project and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various <code>forXXX</code> methods on the {@link StaffFactory} factory class.  To create new instances, use the <code>create()</code> method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link TransactionContext}.</p>
 *
 * <p>This interface and the {@link StaffFactory} class (the ones in the <code>com.scobolsolo.application</code> package) are the only two automatically generated files for the table that are intended to be referenced in user code. Other automatically generated files (namely those in the <code>com.scobolsolo.persistence</code> package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
public interface Staff extends IdentityUserFacing {
	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the Id
	 *
	 * <p>The Id field is a direct mapping of the <code>id</code> database column in the table <code>staff</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getId() method.</p>
	 *
	 * @return an object value of Id (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Integer getIdAsObject();
	/**
	 * primitive accessor for the Id
	 *
	 * <p>The Id field is a direct mapping of the <code>id</code> database column in the table <code>staff</code>.</p>
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
	 * <p>The ContactId field is a direct mapping of the <code>contact_id</code> database column in the table <code>staff</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getContactId() method.</p>
	 *
	 * @return an object value of ContactId (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Integer getContactIdAsObject();
	/**
	 * primitive accessor for the ContactId
	 *
	 * <p>The ContactId field is a direct mapping of the <code>contact_id</code> database column in the table <code>staff</code>.</p>
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
	 * object accessor for the TournamentCode
	 *
	 * <p>The TournamentCode field is a direct mapping of the <code>tournament_code</code> database column in the table <code>staff</code>.</p>
	 *
	 * @return an object value of TournamentCode (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.String getTournamentCode();
	/**
	 * sets the TournamentCode to the value of <code>argTournamentCode</code>
	 *
	 * @param argTournamentCode the new value of TournamentCode.  May not be <code>null</code>.
	 * <p>The database column <code>tournament_code</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argTournamentCode is null
	 * @throws ArgumentTooLongException if <code>argTournamentCode</code> is longer than 32 characters
	 * <p>The database column <code>tournament_code</code> is limited to 32 characters.</p>
	 *
	 */
	@com.opal.annotation.NotNull
	@com.opal.annotation.Length(maximum = 32L)
	public void setTournamentCode(java.lang.String argTournamentCode);

	/**
	 * object accessor for the SchoolRegistrationId
	 *
	 * <p>The SchoolRegistrationId field is a direct mapping of the <code>school_registration_id</code> database column in the table <code>staff</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getSchoolRegistrationId() method.</p>
	 *
	 * @return an object value of SchoolRegistrationId (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.Integer getSchoolRegistrationIdAsObject();
	/**
	 * object accessor for the SchoolRegistrationId with substitution for a null value
	 *
	 * <p>The SchoolRegistrationId field is a direct mapping of the <code>school_registration_id</code> database column in the table <code>staff</code>.</p>
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
	 * <p>The SchoolRegistrationId field is a direct mapping of the <code>school_registration_id</code> database column in the table <code>staff</code>.</p>
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
	 * object accessor for the Note
	 *
	 * <p>The Note field is a direct mapping of the <code>note</code> database column in the table <code>staff</code>.</p>
	 *
	 * @return an object value of Note (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.String getNote();
	/**
	 * object accessor for the Note with substitution for a null value
	 *
	 * <p>The Note field is a direct mapping of the <code>note</code> database column in the table <code>staff</code>.</p>
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
	 * object accessor for the BringingLaptop
	 *
	 * <p>The BringingLaptop field is a direct mapping of the <code>bringing_laptop</code> database column in the table <code>staff</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isBringingLaptop() method.</p>
	 *
	 * @return an object value of BringingLaptop (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Boolean isBringingLaptopAsObject();
	/**
	 * primitive accessor for the BringingLaptop
	 *
	 * <p>The BringingLaptop field is a direct mapping of the <code>bringing_laptop</code> database column in the table <code>staff</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the isBringingLaptopAsObject() method.</p>
	 *
	 * @return the primitive value of BringingLaptop (of the current {@link TransactionContext})
	 */
	default public boolean isBringingLaptop() {
		java.lang.Boolean lclO = isBringingLaptopAsObject();
		return lclO.booleanValue();
	}

	/**
	 * sets the BringingLaptop to the value of <code>argBringingLaptop</code>
	 *
	 * @param argBringingLaptop the new value of BringingLaptop.  May not be <code>null</code>.
	 * <p>The database column <code>bringing_laptop</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argBringingLaptop is null
	 */
	@com.opal.annotation.NotNull
	public void setBringingLaptop(java.lang.Boolean argBringingLaptop);

	/**
	 * sets the BringingLaptop to the value of <code>argBringingLaptop</code>
	 *
	 * @param argBringingLaptop the new value of BringingLaptop
	 */
	public void setBringingLaptop(boolean argBringingLaptop);

	/**
	 * @return the <code>Contact</code>
	 * The returned <code>Contact</code> is the {@link UserFacing} object corresponding to the row in the <code>contact</code> that is referenced by the foreign key <code>staff_contact_id_fkey</code>.
	 *
	 */
	public Contact getContact();
	public void setContact(Contact argContact);

	/**
	 * @return the <code>SchoolRegistration</code>
	 * The returned <code>SchoolRegistration</code> is the {@link UserFacing} object corresponding to the row in the <code>school_registration</code> that is referenced by the foreign key <code>staff_school_registration_id_fkey</code>.
	 *
	 */
	public SchoolRegistration getSchoolRegistration();
	public void setSchoolRegistration(SchoolRegistration argSchoolRegistration);

	/**
	 * @return the <code>Tournament</code>
	 * The returned <code>Tournament</code> is the {@link UserFacing} object corresponding to the row in the <code>tournament</code> that is referenced by the foreign key <code>staff_tournament_code_fkey</code>.
	 *
	 */
	public Tournament getTournament();
	public void setTournament(Tournament argTournament);

	public int getModeratorGameCount();
	public java.util.Iterator<Game> createModeratorGameIterator();

	public java.util.stream.Stream<Game> streamModeratorGame();

	public void addModeratorGame(Game argGame);
	public void removeModeratorGame(Game argGame);
	public void clearModeratorGame();

	default public <T extends java.util.Collection<? super Game>> T acquireModeratorGame(T argC) {
		org.apache.commons.lang3.Validate.notNull(argC);
		java.util.Iterator<Game> lclI = createModeratorGameIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public Game[] createModeratorGameArray() {
		int lclLength = getModeratorGameCount();
		Game[] lclA = new Game[lclLength];
		int lclIndex = 0;
		java.util.Iterator<Game> lclI = createModeratorGameIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public int getStaffAssignmentCount();
	public java.util.Iterator<StaffAssignment> createStaffAssignmentIterator();

	public java.util.stream.Stream<StaffAssignment> streamStaffAssignment();

	public void addStaffAssignment(StaffAssignment argStaffAssignment);
	public void removeStaffAssignment(StaffAssignment argStaffAssignment);
	public void clearStaffAssignment();

	default public <T extends java.util.Collection<? super StaffAssignment>> T acquireStaffAssignment(T argC) {
		org.apache.commons.lang3.Validate.notNull(argC);
		java.util.Iterator<StaffAssignment> lclI = createStaffAssignmentIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public StaffAssignment[] createStaffAssignmentArray() {
		int lclLength = getStaffAssignmentCount();
		StaffAssignment[] lclA = new StaffAssignment[lclLength];
		int lclIndex = 0;
		java.util.Iterator<StaffAssignment> lclI = createStaffAssignmentIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public Staff copy();

	/** This is a Comparator that can be used to compare Staff objects based on their Id values. */

	public static class IdComparator extends com.siliconage.util.NullSafeComparator<Staff> {
		private static final IdComparator ourInstance = new IdComparator();
		public static final IdComparator getInstance() { return ourInstance; }

		private IdComparator() { super(); }

		@Override
		public int compareInternal(Staff argFirst, Staff argSecond) {
			return argFirst.getIdAsObject().compareTo(argSecond.getIdAsObject());
		}
	}

	public static class NameComparator extends com.siliconage.util.NullSafeComparator<Staff> {
		private static final NameComparator ourInstance = new NameComparator();
		public static final NameComparator getInstance() { return ourInstance; }

		private NameComparator() { super(); }

		@Override
		public int compareInternal(Staff argFirst, Staff argSecond) {
			return com.scobolsolo.application.Contact.SortByComparator.getInstance().compare(argFirst.getContact(), argSecond.getContact());
		}
	}

	public static class SchoolNameThenStaffNameComparator extends com.siliconage.util.NullSafeComparator<Staff> {
		private static final SchoolNameThenStaffNameComparator ourInstance = new SchoolNameThenStaffNameComparator();
		public static final SchoolNameThenStaffNameComparator getInstance() { return ourInstance; }

		private SchoolNameThenStaffNameComparator() { super(); }

		@Override
		public int compareInternal(Staff argFirst, Staff argSecond) {
			int lclResult = com.scobolsolo.application.SchoolRegistration.SchoolNameComparator.getInstance().compare(argFirst.getSchoolRegistration(), argSecond.getSchoolRegistration());
			if (lclResult != 0) {
				return lclResult;
			}
			return com.scobolsolo.application.Contact.SortByComparator.getInstance().compare(argFirst.getContact(), argSecond.getContact());
		}
	}

	public static class TournamentDateComparator extends com.siliconage.util.NullSafeComparator<Staff> {
		private static final TournamentDateComparator ourInstance = new TournamentDateComparator();
		public static final TournamentDateComparator getInstance() { return ourInstance; }

		private TournamentDateComparator() { super(); }

		@Override
		public int compareInternal(Staff argFirst, Staff argSecond) {
			return com.scobolsolo.application.Tournament.DateComparator.getInstance().compare(argFirst.getTournament(), argSecond.getTournament());
		}
	}

}
