package com.scobolsolo.persistence;


/**
 * represents a {@code Contact} from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from {@code contact}.  Do not modify this class directly; instead, alter the permanent storage on which it is based, the Opal configuration file for the project, and/or the {@link com.scobolsolo.application.Contact}, and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various {@code forXXX} methods on the {@link com.scobolsolo.application.ContactFactory} factory class.  To create new instances, use the {@code create()} method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link com.opal.TransactionContext}.</p>
 *
 * <p>This interface is not meant to be referenced in user code.  Only the {@link com.scobolsolo.application.Contact} and the {@link com.scobolsolo.application.ContactFactory} class should be referenced directly.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
	@com.opal.annotation.Creatability(creatable = true)
	@com.opal.annotation.Updatability(updatable = true)
public interface ContactUserFacing extends com.opal.IdentityUserFacing, Comparable<com.scobolsolo.application.Contact> {

	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the {@code Id}
	 *
	 * <p>The {@code Id} field is a direct mapping of the {@code id} field in {@code contact}.</p>
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
	 * <p>The {@code Id} field is a direct mapping of the {@code id} database column in the table {@code contact}.</p>
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
	public com.scobolsolo.application.Contact setId(java.lang.Integer argId);

	/**
	 * sets the {@code Id} to the value of {@code argId}
	 *
	 * @param argId the new value of {@code Id}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.Contact setId(int argId);

	/**
	 * object accessor for the {@code EmailAddress}
	 *
	 * <p>The {@code EmailAddress} field is a direct mapping of the {@code email_address} field in {@code contact}.</p>
	 *
	 * @return an object value of {@code EmailAddress} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 256L)
	public java.lang.String getEmailAddress();

	/**
	 * object accessor for the {@code EmailAddress} with substitution for a null value
	 *
	 * <p>The {@code EmailAddress} field is a direct mapping of the {@code email_address} database column in the table {@code contact}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code EmailAddress} is {@code null}.
	 * @return an object value of {@code EmailAddress} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getEmailAddress(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getEmailAddress();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the {@code EmailAddress} to the value of {@code argEmailAddress}
	 *
	 * @param argEmailAddress the new value of {@code EmailAddress}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * @throws com.opal.ArgumentTooLongException if {@code argEmailAddress} is longer than 256 characters
	 * <p>The database column {@code email_address} is limited to 256 characters.</p>
	 *
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 256L)
	public com.scobolsolo.application.Contact setEmailAddress(java.lang.String argEmailAddress);

	/**
	 * object accessor for the {@code AdvancePhone}
	 *
	 * <p>The {@code AdvancePhone} field is a direct mapping of the {@code advance_phone} field in {@code contact}.</p>
	 *
	 * @return an object value of {@code AdvancePhone} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 32L)
	public java.lang.String getAdvancePhone();

	/**
	 * object accessor for the {@code AdvancePhone} with substitution for a null value
	 *
	 * <p>The {@code AdvancePhone} field is a direct mapping of the {@code advance_phone} database column in the table {@code contact}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code AdvancePhone} is {@code null}.
	 * @return an object value of {@code AdvancePhone} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getAdvancePhone(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getAdvancePhone();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the {@code AdvancePhone} to the value of {@code argAdvancePhone}
	 *
	 * @param argAdvancePhone the new value of {@code AdvancePhone}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * @throws com.opal.ArgumentTooLongException if {@code argAdvancePhone} is longer than 32 characters
	 * <p>The database column {@code advance_phone} is limited to 32 characters.</p>
	 *
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 32L)
	public com.scobolsolo.application.Contact setAdvancePhone(java.lang.String argAdvancePhone);

	/**
	 * object accessor for the {@code DayOfPhone}
	 *
	 * <p>The {@code DayOfPhone} field is a direct mapping of the {@code day_of_phone} field in {@code contact}.</p>
	 *
	 * @return an object value of {@code DayOfPhone} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 32L)
	public java.lang.String getDayOfPhone();

	/**
	 * object accessor for the {@code DayOfPhone} with substitution for a null value
	 *
	 * <p>The {@code DayOfPhone} field is a direct mapping of the {@code day_of_phone} database column in the table {@code contact}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code DayOfPhone} is {@code null}.
	 * @return an object value of {@code DayOfPhone} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getDayOfPhone(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getDayOfPhone();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the {@code DayOfPhone} to the value of {@code argDayOfPhone}
	 *
	 * @param argDayOfPhone the new value of {@code DayOfPhone}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * @throws com.opal.ArgumentTooLongException if {@code argDayOfPhone} is longer than 32 characters
	 * <p>The database column {@code day_of_phone} is limited to 32 characters.</p>
	 *
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 32L)
	public com.scobolsolo.application.Contact setDayOfPhone(java.lang.String argDayOfPhone);

	/**
	 * object accessor for the {@code Note}
	 *
	 * <p>The {@code Note} field is a direct mapping of the {@code note} field in {@code contact}.</p>
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
	 * <p>The {@code Note} field is a direct mapping of the {@code note} database column in the table {@code contact}.</p>
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
	public com.scobolsolo.application.Contact setNote(java.lang.String argNote);

	/**
	 * object accessor for the {@code Name}
	 *
	 * <p>The {@code Name} field is a direct mapping of the {@code name} field in {@code contact}.</p>
	 *
	 * @return an object value of {@code Name} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	public java.lang.String getName();

	/**
	 * sets the {@code Name} to the value of {@code argName}
	 *
	 * @param argName the new value of {@code Name}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code name} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argName is null
	 * @throws com.opal.ArgumentTooLongException if {@code argName} is longer than 256 characters
	 * <p>The database column {@code name} is limited to 256 characters.</p>
	 *
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	public com.scobolsolo.application.Contact setName(java.lang.String argName);

	/**
	 * object accessor for the {@code SortBy}
	 *
	 * <p>The {@code SortBy} field is a direct mapping of the {@code sort_by} field in {@code contact}.</p>
	 *
	 * @return an object value of {@code SortBy} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	public java.lang.String getSortBy();

	/**
	 * sets the {@code SortBy} to the value of {@code argSortBy}
	 *
	 * @param argSortBy the new value of {@code SortBy}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code sort_by} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argSortBy is null
	 * @throws com.opal.ArgumentTooLongException if {@code argSortBy} is longer than 256 characters
	 * <p>The database column {@code sort_by} is limited to 256 characters.</p>
	 *
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	public com.scobolsolo.application.Contact setSortBy(java.lang.String argSortBy);

	/**
	 * object accessor for the {@code Active}
	 *
	 * <p>The {@code Active} field is a direct mapping of the {@code active} field in {@code contact}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isActive() method.</p>
	 *
	 * @return an object value of {@code Active} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	public java.lang.Boolean isActiveAsObject();

	default public java.lang.Boolean isInactiveAsObject() {
		Boolean lclB = isActiveAsObject();
		return lclB.booleanValue() ? Boolean.FALSE : Boolean.TRUE;
	}

	/**
	 * primitive accessor for the {@code Active}
	 *
	 * <p>The {@code Active} field is a direct mapping of the {@code active} database column in the table {@code contact}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the isActiveAsObject() method.</p>
	 *
	 * @return the primitive value of {@code Active} (of the current {@link com.opal.TransactionContext})
	 */
	default public boolean isActive() {
		java.lang.Boolean lclO = isActiveAsObject();
		return lclO.booleanValue();
	}

	default public java.lang.Boolean isInactive() {
		return !isActive();
	}

	/**
	 * sets the {@code Active} to the value of {@code argActive}
	 *
	 * @param argActive the new value of {@code Active}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code active} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argActive is null
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	public com.scobolsolo.application.Contact setActive(java.lang.Boolean argActive);

	/**
	 * sets the {@code Active} to the value of {@code argActive}
	 *
	 * @param argActive the new value of {@code Active}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.Contact setActive(boolean argActive);

	/**
	 * object accessor for the {@code Address}
	 *
	 * <p>The {@code Address} field is a direct mapping of the {@code address} field in {@code contact}.</p>
	 *
	 * @return an object value of {@code Address} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	public java.lang.String getAddress();

	/**
	 * object accessor for the {@code Address} with substitution for a null value
	 *
	 * <p>The {@code Address} field is a direct mapping of the {@code address} database column in the table {@code contact}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code Address} is {@code null}.
	 * @return an object value of {@code Address} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getAddress(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getAddress();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the {@code Address} to the value of {@code argAddress}
	 *
	 * @param argAddress the new value of {@code Address}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * @throws com.opal.ArgumentTooLongException if {@code argAddress} is longer than 2147483647 characters
	 * <p>The database column {@code address} is limited to 2147483647 characters.</p>
	 *
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	public com.scobolsolo.application.Contact setAddress(java.lang.String argAddress);

	@com.opal.annotation.Nullability(nullable = false)
	public com.scobolsolo.application.Account getAccount();
	public com.scobolsolo.application.Contact setAccount(com.scobolsolo.application.Account argAccount);

	public int getTournamentDirectorTournamentCount();
	public java.util.Iterator<com.scobolsolo.application.Tournament> createTournamentDirectorTournamentIterator();

	public java.util.stream.Stream<com.scobolsolo.application.Tournament> streamTournamentDirectorTournament();

	public com.scobolsolo.application.Contact addTournamentDirectorTournament(com.scobolsolo.application.Tournament argTournament);
	public com.scobolsolo.application.Contact removeTournamentDirectorTournament(com.scobolsolo.application.Tournament argTournament);
	default public <T extends java.util.Collection<? super com.scobolsolo.application.Tournament>> T acquireTournamentDirectorTournament(T argC) {
		org.apache.commons.lang3.Validate.notNull(argC, "Target Collection is null");
		java.util.Iterator<com.scobolsolo.application.Tournament> lclI = createTournamentDirectorTournamentIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public com.scobolsolo.application.Tournament[] createTournamentDirectorTournamentArray() {
		int lclLength = getTournamentDirectorTournamentCount();
		com.scobolsolo.application.Tournament[] lclA = new com.scobolsolo.application.Tournament[lclLength];
		int lclIndex = 0;
		java.util.Iterator<com.scobolsolo.application.Tournament> lclI = createTournamentDirectorTournamentIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public int getPlayerCount();
	public java.util.Iterator<com.scobolsolo.application.Player> createPlayerIterator();

	public java.util.stream.Stream<com.scobolsolo.application.Player> streamPlayer();

	public com.scobolsolo.application.Contact addPlayer(com.scobolsolo.application.Player argPlayer);
	public com.scobolsolo.application.Contact removePlayer(com.scobolsolo.application.Player argPlayer);
	default public <T extends java.util.Collection<? super com.scobolsolo.application.Player>> T acquirePlayer(T argC) {
		org.apache.commons.lang3.Validate.notNull(argC, "Target Collection is null");
		java.util.Iterator<com.scobolsolo.application.Player> lclI = createPlayerIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public com.scobolsolo.application.Player[] createPlayerArray() {
		int lclLength = getPlayerCount();
		com.scobolsolo.application.Player[] lclA = new com.scobolsolo.application.Player[lclLength];
		int lclIndex = 0;
		java.util.Iterator<com.scobolsolo.application.Player> lclI = createPlayerIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public int getMainSchoolRegistrationCount();
	public java.util.Iterator<com.scobolsolo.application.SchoolRegistration> createMainSchoolRegistrationIterator();

	public java.util.stream.Stream<com.scobolsolo.application.SchoolRegistration> streamMainSchoolRegistration();

	public com.scobolsolo.application.Contact addMainSchoolRegistration(com.scobolsolo.application.SchoolRegistration argSchoolRegistration);
	public com.scobolsolo.application.Contact removeMainSchoolRegistration(com.scobolsolo.application.SchoolRegistration argSchoolRegistration);
	default public <T extends java.util.Collection<? super com.scobolsolo.application.SchoolRegistration>> T acquireMainSchoolRegistration(T argC) {
		org.apache.commons.lang3.Validate.notNull(argC, "Target Collection is null");
		java.util.Iterator<com.scobolsolo.application.SchoolRegistration> lclI = createMainSchoolRegistrationIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public com.scobolsolo.application.SchoolRegistration[] createMainSchoolRegistrationArray() {
		int lclLength = getMainSchoolRegistrationCount();
		com.scobolsolo.application.SchoolRegistration[] lclA = new com.scobolsolo.application.SchoolRegistration[lclLength];
		int lclIndex = 0;
		java.util.Iterator<com.scobolsolo.application.SchoolRegistration> lclI = createMainSchoolRegistrationIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public int getStaffCount();
	public java.util.Iterator<com.scobolsolo.application.Staff> createStaffIterator();

	public java.util.stream.Stream<com.scobolsolo.application.Staff> streamStaff();

	public com.scobolsolo.application.Contact addStaff(com.scobolsolo.application.Staff argStaff);
	public com.scobolsolo.application.Contact removeStaff(com.scobolsolo.application.Staff argStaff);
	default public <T extends java.util.Collection<? super com.scobolsolo.application.Staff>> T acquireStaff(T argC) {
		org.apache.commons.lang3.Validate.notNull(argC, "Target Collection is null");
		java.util.Iterator<com.scobolsolo.application.Staff> lclI = createStaffIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public com.scobolsolo.application.Staff[] createStaffArray() {
		int lclLength = getStaffCount();
		com.scobolsolo.application.Staff[] lclA = new com.scobolsolo.application.Staff[lclLength];
		int lclIndex = 0;
		java.util.Iterator<com.scobolsolo.application.Staff> lclI = createStaffIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public com.scobolsolo.application.Contact copy();

	/** This is a Comparator that can be used to compare Contact objects based on their {@code Id} values. */

	public static class IdComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Contact> {
		private static final IdComparator ourInstance = new IdComparator();
		public static final IdComparator getInstance() { return ourInstance; }

		private IdComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Contact argFirst, com.scobolsolo.application.Contact argSecond) {
			return argFirst.getIdAsObject().compareTo(argSecond.getIdAsObject());
		}
	}

	/** This is a Comparator that can be used to compare Contact objects based on their {@code Name} values. */

	public static class NameComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Contact> {
		private static final NameComparator ourInstance = new NameComparator();
		public static final NameComparator getInstance() { return ourInstance; }

		private NameComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Contact argFirst, com.scobolsolo.application.Contact argSecond) {
			return argFirst.getName().compareToIgnoreCase(argSecond.getName());
		}
	}

	/** This is a Comparator that can be used to compare Contact objects based on their {@code SortBy} values. */

	public static class SortByComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Contact> {
		private static final SortByComparator ourInstance = new SortByComparator();
		public static final SortByComparator getInstance() { return ourInstance; }

		private SortByComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Contact argFirst, com.scobolsolo.application.Contact argSecond) {
			return argFirst.getSortBy().compareToIgnoreCase(argSecond.getSortBy());
		}
	}

}
