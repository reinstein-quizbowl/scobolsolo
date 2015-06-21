package com.scobolsolo.persistence;

import com.opal.*;

/**
 * represents a {@code Staff} from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from {@code staff}.  Do not modify this class directly; instead, alter the permanent storage on which it is based, the Opal configuration file for the project, and/or the {@link com.scobolsolo.application.Staff}, and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various {@code forXXX} methods on the {@link com.scobolsolo.application.StaffFactory} factory class.  To create new instances, use the {@code create()} method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link com.opal.TransactionContext}.</p>
 *
 * <p>This interface is not meant to be referenced in user code.  Only the {@link com.scobolsolo.application.Staff} and the {@link com.scobolsolo.application.StaffFactory} class should be referenced directly.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
public interface StaffUserFacing extends IdentityUserFacing {
	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the {@code Id}
	 *
	 * <p>The {@code Id} field is a direct mapping of the {@code id} field in {@code staff}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getId() method.</p>
	 *
	 * @return an object value of {@code Id} (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.Integer getIdAsObject();

	/**
	 * primitive accessor for the {@code Id}
	 *
	 * <p>The {@code Id} field is a direct mapping of the {@code id} database column in the table {@code staff}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getIdAsObject() method.</p>
	 *
	 * @return the primitive value of {@code Id} (of the current {@link TransactionContext})
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
	 * object accessor for the {@code ContactId}
	 *
	 * <p>The {@code ContactId} field is a direct mapping of the {@code contact_id} field in {@code staff}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getContactId() method.</p>
	 *
	 * @return an object value of {@code ContactId} (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.Integer getContactIdAsObject();

	/**
	 * primitive accessor for the {@code ContactId}
	 *
	 * <p>The {@code ContactId} field is a direct mapping of the {@code contact_id} database column in the table {@code staff}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getContactIdAsObject() method.</p>
	 *
	 * @return the primitive value of {@code ContactId} (of the current {@link TransactionContext})
	 */
	default public int getContactId() {
		java.lang.Integer lclO = getContactIdAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the {@code ContactId} to the value of {@code argContactId}
	 *
	 * @param argContactId the new value of {@code ContactId}.  May not be <code>null</code>.
	 * <p>The database column {@code contact_id} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argContactId is null
	 */
	@com.opal.annotation.NotNull
	public void setContactId(java.lang.Integer argContactId);

	/**
	 * sets the {@code ContactId} to the value of {@code argContactId}
	 *
	 * @param argContactId the new value of {@code ContactId}
	 */
	public void setContactId(int argContactId);

	/**
	 * object accessor for the {@code TournamentCode}
	 *
	 * <p>The {@code TournamentCode} field is a direct mapping of the {@code tournament_code} field in {@code staff}.</p>
	 *
	 * @return an object value of {@code TournamentCode} (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.String getTournamentCode();

	/**
	 * sets the {@code TournamentCode} to the value of {@code argTournamentCode}
	 *
	 * @param argTournamentCode the new value of {@code TournamentCode}.  May not be <code>null</code>.
	 * <p>The database column {@code tournament_code} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argTournamentCode is null
	 * @throws ArgumentTooLongException if {@code argTournamentCode} is longer than 32 characters
	 * <p>The database column {@code tournament_code} is limited to 32 characters.</p>
	 *
	 */
	@com.opal.annotation.NotNull
	@com.opal.annotation.Length(maximum = 32L)
	public void setTournamentCode(java.lang.String argTournamentCode);

	/**
	 * object accessor for the {@code SchoolRegistrationId}
	 *
	 * <p>The {@code SchoolRegistrationId} field is a direct mapping of the {@code school_registration_id} field in {@code staff}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getSchoolRegistrationId() method.</p>
	 *
	 * @return an object value of {@code SchoolRegistrationId} (of the current {@link TransactionContext})  May be <code>null</code>.
	 */
	public java.lang.Integer getSchoolRegistrationIdAsObject();

	/**
	 * object accessor for the {@code SchoolRegistrationId} with substitution for a null value
	 *
	 * <p>The {@code SchoolRegistrationId} field is a direct mapping of the {@code school_registration_id} database column in the table {@code staff}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code SchoolRegistrationId} is {@code null}.
	 * @return an object value of {@code SchoolRegistrationId} (of the current {@link TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getSchoolRegistrationIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getSchoolRegistrationIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code SchoolRegistrationId}
	 *
	 * <p>The {@code SchoolRegistrationId} field is a direct mapping of the {@code school_registration_id} database column in the table {@code staff}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getSchoolRegistrationIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code SchoolRegistrationId} (of the current {@link TransactionContext})
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
	 */
	public void setSchoolRegistrationId(java.lang.Integer argSchoolRegistrationId);

	/**
	 * sets the {@code SchoolRegistrationId} to the value of {@code argSchoolRegistrationId}
	 *
	 * @param argSchoolRegistrationId the new value of {@code SchoolRegistrationId}
	 */
	public void setSchoolRegistrationId(int argSchoolRegistrationId);

	/**
	 * object accessor for the {@code Note}
	 *
	 * <p>The {@code Note} field is a direct mapping of the {@code note} field in {@code staff}.</p>
	 *
	 * @return an object value of {@code Note} (of the current {@link TransactionContext})  May be <code>null</code>.
	 */
	public java.lang.String getNote();

	/**
	 * object accessor for the {@code Note} with substitution for a null value
	 *
	 * <p>The {@code Note} field is a direct mapping of the {@code note} database column in the table {@code staff}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code Note} is {@code null}.
	 * @return an object value of {@code Note} (of the current {@link TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getNote(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getNote();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the {@code Note} to the value of {@code argNote}
	 *
	 * @param argNote the new value of {@code Note}.  May be <code>null</code>.
	 * @throws ArgumentTooLongException if {@code argNote} is longer than 2147483647 characters
	 * <p>The database column {@code note} is limited to 2147483647 characters.</p>
	 *
	 */
	@com.opal.annotation.Length(maximum = 2147483647L)
	public void setNote(java.lang.String argNote);

	/**
	 * object accessor for the {@code BringingLaptop}
	 *
	 * <p>The {@code BringingLaptop} field is a direct mapping of the {@code bringing_laptop} field in {@code staff}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isBringingLaptop() method.</p>
	 *
	 * @return an object value of {@code BringingLaptop} (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.Boolean isBringingLaptopAsObject();

	/**
	 * primitive accessor for the {@code BringingLaptop}
	 *
	 * <p>The {@code BringingLaptop} field is a direct mapping of the {@code bringing_laptop} database column in the table {@code staff}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the isBringingLaptopAsObject() method.</p>
	 *
	 * @return the primitive value of {@code BringingLaptop} (of the current {@link TransactionContext})
	 */
	default public boolean isBringingLaptop() {
		java.lang.Boolean lclO = isBringingLaptopAsObject();
		return lclO.booleanValue();
	}

	/**
	 * sets the {@code BringingLaptop} to the value of {@code argBringingLaptop}
	 *
	 * @param argBringingLaptop the new value of {@code BringingLaptop}.  May not be <code>null</code>.
	 * <p>The database column {@code bringing_laptop} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argBringingLaptop is null
	 */
	@com.opal.annotation.NotNull
	public void setBringingLaptop(java.lang.Boolean argBringingLaptop);

	/**
	 * sets the {@code BringingLaptop} to the value of {@code argBringingLaptop}
	 *
	 * @param argBringingLaptop the new value of {@code BringingLaptop}
	 */
	public void setBringingLaptop(boolean argBringingLaptop);

	/**
	 * @return the {@code com.scobolsolo.application.Contact}
	 * The returned {@code com.scobolsolo.application.Contact} is the {@link UserFacing} object corresponding to the entry in {@code contact} that is referenced by {@code staff_contact_id_fkey}.
	 *
	 */
	public com.scobolsolo.application.Contact getContact();
	public void setContact(com.scobolsolo.application.Contact argContact);

	/**
	 * @return the {@code com.scobolsolo.application.SchoolRegistration}
	 * The returned {@code com.scobolsolo.application.SchoolRegistration} is the {@link UserFacing} object corresponding to the entry in {@code school_registration} that is referenced by {@code staff_school_registration_id_fkey}.
	 *
	 */
	public com.scobolsolo.application.SchoolRegistration getSchoolRegistration();
	public void setSchoolRegistration(com.scobolsolo.application.SchoolRegistration argSchoolRegistration);

	/**
	 * @return the {@code com.scobolsolo.application.Tournament}
	 * The returned {@code com.scobolsolo.application.Tournament} is the {@link UserFacing} object corresponding to the entry in {@code tournament} that is referenced by {@code staff_tournament_code_fkey}.
	 *
	 */
	public com.scobolsolo.application.Tournament getTournament();
	public void setTournament(com.scobolsolo.application.Tournament argTournament);

	public int getModeratorGameCount();
	public java.util.Iterator<com.scobolsolo.application.Game> createModeratorGameIterator();

	public java.util.stream.Stream<com.scobolsolo.application.Game> streamModeratorGame();

	public void addModeratorGame(com.scobolsolo.application.Game argGame);
	public void removeModeratorGame(com.scobolsolo.application.Game argGame);
	public void clearModeratorGame();

	default public <T extends java.util.Collection<? super com.scobolsolo.application.Game>> T acquireModeratorGame(T argC) {
		if (argC == null) { throw new IllegalArgumentException("Target Collection is null."); }
		java.util.Iterator<com.scobolsolo.application.Game> lclI = createModeratorGameIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public com.scobolsolo.application.Game[] createModeratorGameArray() {
		int lclLength = getModeratorGameCount();
		com.scobolsolo.application.Game[] lclA = new com.scobolsolo.application.Game[lclLength];
		int lclIndex = 0;
		java.util.Iterator<com.scobolsolo.application.Game> lclI = createModeratorGameIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public int getStaffAssignmentCount();
	public java.util.Iterator<com.scobolsolo.application.StaffAssignment> createStaffAssignmentIterator();

	public java.util.stream.Stream<com.scobolsolo.application.StaffAssignment> streamStaffAssignment();

	public void addStaffAssignment(com.scobolsolo.application.StaffAssignment argStaffAssignment);
	public void removeStaffAssignment(com.scobolsolo.application.StaffAssignment argStaffAssignment);
	public void clearStaffAssignment();

	default public <T extends java.util.Collection<? super com.scobolsolo.application.StaffAssignment>> T acquireStaffAssignment(T argC) {
		if (argC == null) { throw new IllegalArgumentException("Target Collection is null."); }
		java.util.Iterator<com.scobolsolo.application.StaffAssignment> lclI = createStaffAssignmentIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public com.scobolsolo.application.StaffAssignment[] createStaffAssignmentArray() {
		int lclLength = getStaffAssignmentCount();
		com.scobolsolo.application.StaffAssignment[] lclA = new com.scobolsolo.application.StaffAssignment[lclLength];
		int lclIndex = 0;
		java.util.Iterator<com.scobolsolo.application.StaffAssignment> lclI = createStaffAssignmentIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public com.scobolsolo.application.Staff copy();

	/** This is a Comparator that can be used to compare Staff objects based on their {@code Id} values. */

	public static class IdComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Staff> {
		private static final IdComparator ourInstance = new IdComparator();
		public static final IdComparator getInstance() { return ourInstance; }

		private IdComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Staff argFirst, com.scobolsolo.application.Staff argSecond) {
			return argFirst.getIdAsObject().compareTo(argSecond.getIdAsObject());
		}
	}

	public static class NameComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Staff> {
		private static final NameComparator ourInstance = new NameComparator();
		public static final NameComparator getInstance() { return ourInstance; }

		private NameComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Staff argFirst, com.scobolsolo.application.Staff argSecond) {
			return com.scobolsolo.application.Contact.SortByComparator.getInstance().compare(argFirst.getContact(),  argSecond.getContact());
		}
	}

	public static class SchoolNameThenStaffNameComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Staff> {
		private static final SchoolNameThenStaffNameComparator ourInstance = new SchoolNameThenStaffNameComparator();
		public static final SchoolNameThenStaffNameComparator getInstance() { return ourInstance; }

		private SchoolNameThenStaffNameComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Staff argFirst, com.scobolsolo.application.Staff argSecond) {
			int lclResult = com.scobolsolo.application.SchoolRegistration.SchoolNameComparator.getInstance().compare(argFirst.getSchoolRegistration(),  argSecond.getSchoolRegistration());
			if (lclResult != 0) {
				return lclResult;
			}
			return com.scobolsolo.application.Contact.SortByComparator.getInstance().compare(argFirst.getContact(),  argSecond.getContact());
		}
	}

	public static class TournamentDateComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Staff> {
		private static final TournamentDateComparator ourInstance = new TournamentDateComparator();
		public static final TournamentDateComparator getInstance() { return ourInstance; }

		private TournamentDateComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Staff argFirst, com.scobolsolo.application.Staff argSecond) {
			return com.scobolsolo.application.Tournament.DateComparator.getInstance().compare(argFirst.getTournament(),  argSecond.getTournament());
		}
	}

}
