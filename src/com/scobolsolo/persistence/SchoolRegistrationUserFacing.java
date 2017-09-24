package com.scobolsolo.persistence;


/**
 * represents a {@code SchoolRegistration} from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from {@code school_registration}.  Do not modify this class directly; instead, alter the permanent storage on which it is based, the Opal configuration file for the project, and/or the {@link com.scobolsolo.application.SchoolRegistration}, and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various {@code forXXX} methods on the {@link com.scobolsolo.application.SchoolRegistrationFactory} factory class.  To create new instances, use the {@code create()} method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link com.opal.TransactionContext}.</p>
 *
 * <p>This interface is not meant to be referenced in user code.  Only the {@link com.scobolsolo.application.SchoolRegistration} and the {@link com.scobolsolo.application.SchoolRegistrationFactory} class should be referenced directly.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
	@com.opal.annotation.Creatability(creatable = true)
	@com.opal.annotation.Updatability(updatable = true)
public interface SchoolRegistrationUserFacing extends com.opal.IdentityUserFacing {

	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the {@code Id}
	 *
	 * <p>The {@code Id} field is a direct mapping of the {@code id} field in {@code school_registration}.</p>
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
	 * <p>The {@code Id} field is a direct mapping of the {@code id} database column in the table {@code school_registration}.</p>
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
	public com.scobolsolo.application.SchoolRegistration setId(java.lang.Integer argId);

	/**
	 * sets the {@code Id} to the value of {@code argId}
	 *
	 * @param argId the new value of {@code Id}
	 * @return itself, so that mutators may be chained fluently
	 */
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.SchoolRegistration setId(int argId);

	/**
	 * object accessor for the {@code SchoolId}
	 *
	 * <p>The {@code SchoolId} field is a direct mapping of the {@code school_id} field in {@code school_registration}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getSchoolId() method.</p>
	 *
	 * @return an object value of {@code SchoolId} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	public java.lang.Integer getSchoolIdAsObject();

	/**
	 * primitive accessor for the {@code SchoolId}
	 *
	 * <p>The {@code SchoolId} field is a direct mapping of the {@code school_id} database column in the table {@code school_registration}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getSchoolIdAsObject() method.</p>
	 *
	 * @return the primitive value of {@code SchoolId} (of the current {@link com.opal.TransactionContext})
	 */
	default public int getSchoolId() {
		java.lang.Integer lclO = getSchoolIdAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the {@code SchoolId} to the value of {@code argSchoolId}
	 *
	 * @param argSchoolId the new value of {@code SchoolId}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code school_id} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argSchoolId is null
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.SchoolRegistration setSchoolId(java.lang.Integer argSchoolId);

	/**
	 * sets the {@code SchoolId} to the value of {@code argSchoolId}
	 *
	 * @param argSchoolId the new value of {@code SchoolId}
	 * @return itself, so that mutators may be chained fluently
	 */
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.SchoolRegistration setSchoolId(int argSchoolId);

	/**
	 * object accessor for the {@code MainContactId}
	 *
	 * <p>The {@code MainContactId} field is a direct mapping of the {@code main_contact_id} field in {@code school_registration}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getMainContactId() method.</p>
	 *
	 * @return an object value of {@code MainContactId} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	public java.lang.Integer getMainContactIdAsObject();

	/**
	 * primitive accessor for the {@code MainContactId}
	 *
	 * <p>The {@code MainContactId} field is a direct mapping of the {@code main_contact_id} database column in the table {@code school_registration}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getMainContactIdAsObject() method.</p>
	 *
	 * @return the primitive value of {@code MainContactId} (of the current {@link com.opal.TransactionContext})
	 */
	default public int getMainContactId() {
		java.lang.Integer lclO = getMainContactIdAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the {@code MainContactId} to the value of {@code argMainContactId}
	 *
	 * @param argMainContactId the new value of {@code MainContactId}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code main_contact_id} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argMainContactId is null
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.SchoolRegistration setMainContactId(java.lang.Integer argMainContactId);

	/**
	 * sets the {@code MainContactId} to the value of {@code argMainContactId}
	 *
	 * @param argMainContactId the new value of {@code MainContactId}
	 * @return itself, so that mutators may be chained fluently
	 */
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.SchoolRegistration setMainContactId(int argMainContactId);

	/**
	 * object accessor for the {@code AmountOwed}
	 *
	 * <p>The {@code AmountOwed} field is a direct mapping of the {@code amount_owed} field in {@code school_registration}.</p>
	 *
	 * @return an object value of {@code AmountOwed} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "0.0")
	public java.math.BigDecimal getAmountOwed();

	/**
	 * sets the {@code AmountOwed} to the value of {@code argAmountOwed}
	 *
	 * @param argAmountOwed the new value of {@code AmountOwed}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code amount_owed} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argAmountOwed is null
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "0.0")
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.SchoolRegistration setAmountOwed(java.math.BigDecimal argAmountOwed);

	/**
	 * object accessor for the {@code AmountPaid}
	 *
	 * <p>The {@code AmountPaid} field is a direct mapping of the {@code amount_paid} field in {@code school_registration}.</p>
	 *
	 * @return an object value of {@code AmountPaid} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "0.0")
	public java.math.BigDecimal getAmountPaid();

	/**
	 * sets the {@code AmountPaid} to the value of {@code argAmountPaid}
	 *
	 * @param argAmountPaid the new value of {@code AmountPaid}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code amount_paid} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argAmountPaid is null
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "0.0")
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.SchoolRegistration setAmountPaid(java.math.BigDecimal argAmountPaid);

	/**
	 * object accessor for the {@code Note}
	 *
	 * <p>The {@code Note} field is a direct mapping of the {@code note} field in {@code school_registration}.</p>
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
	 * <p>The {@code Note} field is a direct mapping of the {@code note} database column in the table {@code school_registration}.</p>
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
	public com.scobolsolo.application.SchoolRegistration setNote(java.lang.String argNote);

	/**
	 * object accessor for the {@code SpotsReserved}
	 *
	 * <p>The {@code SpotsReserved} field is a direct mapping of the {@code spots_reserved} field in {@code school_registration}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getSpotsReserved() method.</p>
	 *
	 * @return an object value of {@code SpotsReserved} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	public java.lang.Integer getSpotsReservedAsObject();

	/**
	 * primitive accessor for the {@code SpotsReserved}
	 *
	 * <p>The {@code SpotsReserved} field is a direct mapping of the {@code spots_reserved} database column in the table {@code school_registration}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getSpotsReservedAsObject() method.</p>
	 *
	 * @return the primitive value of {@code SpotsReserved} (of the current {@link com.opal.TransactionContext})
	 */
	default public int getSpotsReserved() {
		java.lang.Integer lclO = getSpotsReservedAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the {@code SpotsReserved} to the value of {@code argSpotsReserved}
	 *
	 * @param argSpotsReserved the new value of {@code SpotsReserved}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code spots_reserved} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argSpotsReserved is null
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.SchoolRegistration setSpotsReserved(java.lang.Integer argSpotsReserved);

	/**
	 * sets the {@code SpotsReserved} to the value of {@code argSpotsReserved}
	 *
	 * @param argSpotsReserved the new value of {@code SpotsReserved}
	 * @return itself, so that mutators may be chained fluently
	 */
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.SchoolRegistration setSpotsReserved(int argSpotsReserved);

	/**
	 * object accessor for the {@code TournamentCode}
	 *
	 * <p>The {@code TournamentCode} field is a direct mapping of the {@code tournament_code} field in {@code school_registration}.</p>
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
	public com.scobolsolo.application.SchoolRegistration setTournamentCode(java.lang.String argTournamentCode);

	/**
	 * @return the {@code com.scobolsolo.application.Contact}
	 * The returned {@code com.scobolsolo.application.Contact} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code contact} that is referenced by {@code registration_main_contact_id_fkey}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = false)
	public com.scobolsolo.application.Contact getMainContact();
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.SchoolRegistration setMainContact(com.scobolsolo.application.Contact argMainContact);

	/**
	 * @return the {@code com.scobolsolo.application.School}
	 * The returned {@code com.scobolsolo.application.School} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code school} that is referenced by {@code registration_school_id_fkey}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = false)
	public com.scobolsolo.application.School getSchool();
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.SchoolRegistration setSchool(com.scobolsolo.application.School argSchool);

	/**
	 * @return the {@code com.scobolsolo.application.Tournament}
	 * The returned {@code com.scobolsolo.application.Tournament} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code tournament} that is referenced by {@code school_registration_tournament_code_fkey}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = false)
	public com.scobolsolo.application.Tournament getTournament();
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.SchoolRegistration setTournament(com.scobolsolo.application.Tournament argTournament);

	public java.util.Set<com.scobolsolo.application.StandbyEntry> getStandbyEntrySet();

	default public java.util.stream.Stream<com.scobolsolo.application.StandbyEntry> streamStandbyEntry() {
		return getStandbyEntrySet().stream();
	}

	default public com.scobolsolo.application.StandbyEntry[] createStandbyEntryArray() {
		java.util.Set<com.scobolsolo.application.StandbyEntry> lclS = getStandbyEntrySet();
		return lclS.toArray(new com.scobolsolo.application.StandbyEntry[lclS.size()]);
	}

	public java.util.Set<com.scobolsolo.application.Player> getPlayerSet();

	default public java.util.stream.Stream<com.scobolsolo.application.Player> streamPlayer() {
		return getPlayerSet().stream();
	}

	default public com.scobolsolo.application.Player[] createPlayerArray() {
		java.util.Set<com.scobolsolo.application.Player> lclS = getPlayerSet();
		return lclS.toArray(new com.scobolsolo.application.Player[lclS.size()]);
	}

	public java.util.Set<com.scobolsolo.application.Buzzer> getBuzzerSet();

	default public java.util.stream.Stream<com.scobolsolo.application.Buzzer> streamBuzzer() {
		return getBuzzerSet().stream();
	}

	default public com.scobolsolo.application.Buzzer[] createBuzzerArray() {
		java.util.Set<com.scobolsolo.application.Buzzer> lclS = getBuzzerSet();
		return lclS.toArray(new com.scobolsolo.application.Buzzer[lclS.size()]);
	}

	public java.util.Set<com.scobolsolo.application.WaitlistEntry> getWaitlistEntrySet();

	default public java.util.stream.Stream<com.scobolsolo.application.WaitlistEntry> streamWaitlistEntry() {
		return getWaitlistEntrySet().stream();
	}

	default public com.scobolsolo.application.WaitlistEntry[] createWaitlistEntryArray() {
		java.util.Set<com.scobolsolo.application.WaitlistEntry> lclS = getWaitlistEntrySet();
		return lclS.toArray(new com.scobolsolo.application.WaitlistEntry[lclS.size()]);
	}

	public java.util.Set<com.scobolsolo.application.Staff> getStaffSet();

	default public java.util.stream.Stream<com.scobolsolo.application.Staff> streamStaff() {
		return getStaffSet().stream();
	}

	default public com.scobolsolo.application.Staff[] createStaffArray() {
		java.util.Set<com.scobolsolo.application.Staff> lclS = getStaffSet();
		return lclS.toArray(new com.scobolsolo.application.Staff[lclS.size()]);
	}

	public com.scobolsolo.application.SchoolRegistration copy();

	/** This is a Comparator that can be used to compare SchoolRegistration objects based on their {@code Id} values. */

	public static class IdComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.SchoolRegistration> {
		private static final IdComparator ourInstance = new IdComparator();
		public static final IdComparator getInstance() { return ourInstance; }

		private IdComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.SchoolRegistration argFirst, com.scobolsolo.application.SchoolRegistration argSecond) {
			return argFirst.getIdAsObject().compareTo(argSecond.getIdAsObject());
		}
	}

	public static class TournamentDateComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.SchoolRegistration> {
		private static final TournamentDateComparator ourInstance = new TournamentDateComparator();
		public static final TournamentDateComparator getInstance() { return ourInstance; }

		private TournamentDateComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.SchoolRegistration argFirst, com.scobolsolo.application.SchoolRegistration argSecond) {
			return com.scobolsolo.application.Tournament.DateComparator.getInstance().compare(argFirst.getTournament(),  argSecond.getTournament());
		}
	}

	public static class SchoolNameComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.SchoolRegistration> {
		private static final SchoolNameComparator ourInstance = new SchoolNameComparator();
		public static final SchoolNameComparator getInstance() { return ourInstance; }

		private SchoolNameComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.SchoolRegistration argFirst, com.scobolsolo.application.SchoolRegistration argSecond) {
			return com.scobolsolo.application.School.NameComparator.getInstance().compare(argFirst.getSchool(),  argSecond.getSchool());
		}
	}

	public static class SchoolShortNameComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.SchoolRegistration> {
		private static final SchoolShortNameComparator ourInstance = new SchoolShortNameComparator();
		public static final SchoolShortNameComparator getInstance() { return ourInstance; }

		private SchoolShortNameComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.SchoolRegistration argFirst, com.scobolsolo.application.SchoolRegistration argSecond) {
			return com.scobolsolo.application.School.ShortNameComparator.getInstance().compare(argFirst.getSchool(),  argSecond.getSchool());
		}
	}

}
