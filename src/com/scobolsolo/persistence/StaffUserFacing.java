package com.scobolsolo.persistence;


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
	@com.opal.annotation.Creatability(creatable = true)
	@com.opal.annotation.Updatability(updatable = true)
public interface StaffUserFacing extends com.opal.IdentityUserFacing {

	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the {@code Id}
	 *
	 * <p>The {@code Id} field is a direct mapping of the {@code id} field in {@code staff}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getId() method.</p>
	 *
	 * @return an object value of {@code Id} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	public java.lang.Integer getIdAsObject();

	/**
	 * primitive accessor for the {@code Id}
	 *
	 * <p>The {@code Id} field is a direct mapping of the {@code id} database column in the table {@code staff}.</p>
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
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code id} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argId is null
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Staff setId(java.lang.Integer argId);

	/**
	 * sets the {@code Id} to the value of {@code argId}
	 *
	 * @param argId the new value of {@code Id}
	 * @return itself, so that mutators may be chained fluently
	 */
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Staff setId(int argId);

	/**
	 * object accessor for the {@code ContactId}
	 *
	 * <p>The {@code ContactId} field is a direct mapping of the {@code contact_id} field in {@code staff}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getContactId() method.</p>
	 *
	 * @return an object value of {@code ContactId} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	public java.lang.Integer getContactIdAsObject();

	/**
	 * primitive accessor for the {@code ContactId}
	 *
	 * <p>The {@code ContactId} field is a direct mapping of the {@code contact_id} database column in the table {@code staff}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getContactIdAsObject() method.</p>
	 *
	 * @return the primitive value of {@code ContactId} (of the current {@link com.opal.TransactionContext})
	 */
	default public int getContactId() {
		java.lang.Integer lclO = getContactIdAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the {@code ContactId} to the value of {@code argContactId}
	 *
	 * @param argContactId the new value of {@code ContactId}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code contact_id} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argContactId is null
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Staff setContactId(java.lang.Integer argContactId);

	/**
	 * sets the {@code ContactId} to the value of {@code argContactId}
	 *
	 * @param argContactId the new value of {@code ContactId}
	 * @return itself, so that mutators may be chained fluently
	 */
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Staff setContactId(int argContactId);

	/**
	 * object accessor for the {@code TournamentCode}
	 *
	 * <p>The {@code TournamentCode} field is a direct mapping of the {@code tournament_code} field in {@code staff}.</p>
	 *
	 * @return an object value of {@code TournamentCode} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	public java.lang.String getTournamentCode();

	/**
	 * sets the {@code TournamentCode} to the value of {@code argTournamentCode}
	 *
	 * @param argTournamentCode the new value of {@code TournamentCode}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code tournament_code} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argTournamentCode is null
	 * @throws com.opal.ArgumentTooLongException if {@code argTournamentCode} is longer than 32 characters
	 * <p>The database column {@code tournament_code} is limited to 32 characters.</p>
	 *
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Staff setTournamentCode(java.lang.String argTournamentCode);

	/**
	 * object accessor for the {@code SchoolRegistrationId}
	 *
	 * <p>The {@code SchoolRegistrationId} field is a direct mapping of the {@code school_registration_id} field in {@code staff}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getSchoolRegistrationId() method.</p>
	 *
	 * @return an object value of {@code SchoolRegistrationId} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	public java.lang.Integer getSchoolRegistrationIdAsObject();

	/**
	 * object accessor for the {@code SchoolRegistrationId} with substitution for a null value
	 *
	 * <p>The {@code SchoolRegistrationId} field is a direct mapping of the {@code school_registration_id} database column in the table {@code staff}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code SchoolRegistrationId} is {@code null}.
	 * @return an object value of {@code SchoolRegistrationId} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
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
	 * @return the primitive value of {@code SchoolRegistrationId} (of the current {@link com.opal.TransactionContext})
	 * @throws com.opal.NullValueException when the internal value is null
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
	 * @return itself, so that mutator calls can be chained fluently
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Staff setSchoolRegistrationId(java.lang.Integer argSchoolRegistrationId);

	/**
	 * sets the {@code SchoolRegistrationId} to the value of {@code argSchoolRegistrationId}
	 *
	 * @param argSchoolRegistrationId the new value of {@code SchoolRegistrationId}
	 * @return itself, so that mutators may be chained fluently
	 */
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Staff setSchoolRegistrationId(int argSchoolRegistrationId);

	/**
	 * object accessor for the {@code Note}
	 *
	 * <p>The {@code Note} field is a direct mapping of the {@code note} field in {@code staff}.</p>
	 *
	 * @return an object value of {@code Note} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	public java.lang.String getNote();

	/**
	 * object accessor for the {@code Note} with substitution for a null value
	 *
	 * <p>The {@code Note} field is a direct mapping of the {@code note} database column in the table {@code staff}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code Note} is {@code null}.
	 * @return an object value of {@code Note} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getNote(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getNote();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the {@code Note} to the value of {@code argNote}
	 *
	 * @param argNote the new value of {@code Note}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * @throws com.opal.ArgumentTooLongException if {@code argNote} is longer than 2147483647 characters
	 * <p>The database column {@code note} is limited to 2147483647 characters.</p>
	 *
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Staff setNote(java.lang.String argNote);

	/**
	 * @return the {@code com.scobolsolo.application.Contact}
	 * The returned {@code com.scobolsolo.application.Contact} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code contact} that is referenced by {@code staff_contact_id_fkey}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = false)
	public com.scobolsolo.application.Contact getContact();
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Staff setContact(com.scobolsolo.application.Contact argContact);

	/**
	 * @return the {@code com.scobolsolo.application.SchoolRegistration}
	 * The returned {@code com.scobolsolo.application.SchoolRegistration} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code school_registration} that is referenced by {@code staff_school_registration_id_fkey}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public com.scobolsolo.application.SchoolRegistration getSchoolRegistration();
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Staff setSchoolRegistration(com.scobolsolo.application.SchoolRegistration argSchoolRegistration);

	/**
	 * @return the {@code com.scobolsolo.application.Tournament}
	 * The returned {@code com.scobolsolo.application.Tournament} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code tournament} that is referenced by {@code staff_tournament_code_fkey}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = false)
	public com.scobolsolo.application.Tournament getTournament();
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Staff setTournament(com.scobolsolo.application.Tournament argTournament);

	public java.util.Set<com.scobolsolo.application.Game> getModeratorGameSet();

	default public java.util.stream.Stream<com.scobolsolo.application.Game> streamModeratorGame() {
		return getModeratorGameSet().stream();
	}

	default public com.scobolsolo.application.Game[] createModeratorGameArray() {
		java.util.Set<com.scobolsolo.application.Game> lclS = getModeratorGameSet();
		return lclS.toArray(new com.scobolsolo.application.Game[lclS.size()]);
	}

	public java.util.Set<com.scobolsolo.application.Game> getScorekeeperGameSet();

	default public java.util.stream.Stream<com.scobolsolo.application.Game> streamScorekeeperGame() {
		return getScorekeeperGameSet().stream();
	}

	default public com.scobolsolo.application.Game[] createScorekeeperGameArray() {
		java.util.Set<com.scobolsolo.application.Game> lclS = getScorekeeperGameSet();
		return lclS.toArray(new com.scobolsolo.application.Game[lclS.size()]);
	}

	public java.util.Set<com.scobolsolo.application.StaffAssignment> getStaffAssignmentSet();

	default public java.util.stream.Stream<com.scobolsolo.application.StaffAssignment> streamStaffAssignment() {
		return getStaffAssignmentSet().stream();
	}

	default public com.scobolsolo.application.StaffAssignment[] createStaffAssignmentArray() {
		java.util.Set<com.scobolsolo.application.StaffAssignment> lclS = getStaffAssignmentSet();
		return lclS.toArray(new com.scobolsolo.application.StaffAssignment[lclS.size()]);
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
