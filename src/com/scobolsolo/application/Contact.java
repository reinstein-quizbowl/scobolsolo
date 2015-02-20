package com.scobolsolo.application;

import com.opal.*;

/**
 * represents a <code>Contact</code> from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from the database table <code>contact</code>.  Do not modify this class directly; instead, alter the database table on which it is based and/or the Opal configuration file for the project and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various <code>forXXX</code> methods on the {@link ContactFactory} factory class.  To create new instances, use the <code>create()</code> method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link TransactionContext}.</p>
 *
 * <p>This interface and the {@link ContactFactory} class (the ones in the <code>com.scobolsolo.application</code> package) are the only two automatically generated files for the table that are intended to be referenced in user code. Other automatically generated files (namely those in the <code>com.scobolsolo.persistence</code> package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
public interface Contact extends IdentityUserFacing, Comparable<Contact> {
	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the Id
	 *
	 * <p>The Id field is a direct mapping of the <code>id</code> database column in the table <code>contact</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getId() method.</p>
	 *
	 * @return an object value of Id (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Integer getIdAsObject();
	/**
	 * primitive accessor for the Id
	 *
	 * <p>The Id field is a direct mapping of the <code>id</code> database column in the table <code>contact</code>.</p>
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
	 * object accessor for the EmailAddress
	 *
	 * <p>The EmailAddress field is a direct mapping of the <code>email_address</code> database column in the table <code>contact</code>.</p>
	 *
	 * @return an object value of EmailAddress (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.String getEmailAddress();
	/**
	 * object accessor for the EmailAddress with substitution for a null value
	 *
	 * <p>The EmailAddress field is a direct mapping of the <code>email_address</code> database column in the table <code>contact</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the EmailAddress is <code>null</code>.
	 * @return an object value of EmailAddress (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getEmailAddress(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getEmailAddress();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the EmailAddress to the value of <code>argEmailAddress</code>
	 *
	 * @param argEmailAddress the new value of EmailAddress.  May be <code>null</code>.
	 * @throws ArgumentTooLongException if <code>argEmailAddress</code> is longer than 256 characters
	 * <p>The database column <code>email_address</code> is limited to 256 characters.</p>
	 *
	 */
	@com.opal.annotation.Length(maximum = 256L)
	public void setEmailAddress(java.lang.String argEmailAddress);

	/**
	 * object accessor for the AdvancePhone
	 *
	 * <p>The AdvancePhone field is a direct mapping of the <code>advance_phone</code> database column in the table <code>contact</code>.</p>
	 *
	 * @return an object value of AdvancePhone (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.String getAdvancePhone();
	/**
	 * object accessor for the AdvancePhone with substitution for a null value
	 *
	 * <p>The AdvancePhone field is a direct mapping of the <code>advance_phone</code> database column in the table <code>contact</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the AdvancePhone is <code>null</code>.
	 * @return an object value of AdvancePhone (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getAdvancePhone(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getAdvancePhone();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the AdvancePhone to the value of <code>argAdvancePhone</code>
	 *
	 * @param argAdvancePhone the new value of AdvancePhone.  May be <code>null</code>.
	 * @throws ArgumentTooLongException if <code>argAdvancePhone</code> is longer than 32 characters
	 * <p>The database column <code>advance_phone</code> is limited to 32 characters.</p>
	 *
	 */
	@com.opal.annotation.Length(maximum = 32L)
	public void setAdvancePhone(java.lang.String argAdvancePhone);

	/**
	 * object accessor for the DayOfPhone
	 *
	 * <p>The DayOfPhone field is a direct mapping of the <code>day_of_phone</code> database column in the table <code>contact</code>.</p>
	 *
	 * @return an object value of DayOfPhone (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.String getDayOfPhone();
	/**
	 * object accessor for the DayOfPhone with substitution for a null value
	 *
	 * <p>The DayOfPhone field is a direct mapping of the <code>day_of_phone</code> database column in the table <code>contact</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the DayOfPhone is <code>null</code>.
	 * @return an object value of DayOfPhone (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getDayOfPhone(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getDayOfPhone();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the DayOfPhone to the value of <code>argDayOfPhone</code>
	 *
	 * @param argDayOfPhone the new value of DayOfPhone.  May be <code>null</code>.
	 * @throws ArgumentTooLongException if <code>argDayOfPhone</code> is longer than 32 characters
	 * <p>The database column <code>day_of_phone</code> is limited to 32 characters.</p>
	 *
	 */
	@com.opal.annotation.Length(maximum = 32L)
	public void setDayOfPhone(java.lang.String argDayOfPhone);

	/**
	 * object accessor for the Note
	 *
	 * <p>The Note field is a direct mapping of the <code>note</code> database column in the table <code>contact</code>.</p>
	 *
	 * @return an object value of Note (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.String getNote();
	/**
	 * object accessor for the Note with substitution for a null value
	 *
	 * <p>The Note field is a direct mapping of the <code>note</code> database column in the table <code>contact</code>.</p>
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
	 * object accessor for the Name
	 *
	 * <p>The Name field is a direct mapping of the <code>name</code> database column in the table <code>contact</code>.</p>
	 *
	 * @return an object value of Name (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.String getName();
	/**
	 * sets the Name to the value of <code>argName</code>
	 *
	 * @param argName the new value of Name.  May not be <code>null</code>.
	 * <p>The database column <code>name</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argName is null
	 * @throws ArgumentTooLongException if <code>argName</code> is longer than 256 characters
	 * <p>The database column <code>name</code> is limited to 256 characters.</p>
	 *
	 */
	@com.opal.annotation.NotNull
	@com.opal.annotation.Length(maximum = 256L)
	public void setName(java.lang.String argName);

	/**
	 * object accessor for the SortBy
	 *
	 * <p>The SortBy field is a direct mapping of the <code>sort_by</code> database column in the table <code>contact</code>.</p>
	 *
	 * @return an object value of SortBy (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.String getSortBy();
	/**
	 * sets the SortBy to the value of <code>argSortBy</code>
	 *
	 * @param argSortBy the new value of SortBy.  May not be <code>null</code>.
	 * <p>The database column <code>sort_by</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argSortBy is null
	 * @throws ArgumentTooLongException if <code>argSortBy</code> is longer than 256 characters
	 * <p>The database column <code>sort_by</code> is limited to 256 characters.</p>
	 *
	 */
	@com.opal.annotation.NotNull
	@com.opal.annotation.Length(maximum = 256L)
	public void setSortBy(java.lang.String argSortBy);

	/**
	 * object accessor for the Active
	 *
	 * <p>The Active field is a direct mapping of the <code>active</code> database column in the table <code>contact</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isActive() method.</p>
	 *
	 * @return an object value of Active (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Boolean isActiveAsObject();
	/**
	 * primitive accessor for the Active
	 *
	 * <p>The Active field is a direct mapping of the <code>active</code> database column in the table <code>contact</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the isActiveAsObject() method.</p>
	 *
	 * @return the primitive value of Active (of the current {@link TransactionContext})
	 */
	default public boolean isActive() {
		java.lang.Boolean lclO = isActiveAsObject();
		return lclO.booleanValue();
	}

	/**
	 * sets the Active to the value of <code>argActive</code>
	 *
	 * @param argActive the new value of Active.  May not be <code>null</code>.
	 * <p>The database column <code>active</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argActive is null
	 */
	@com.opal.annotation.NotNull
	public void setActive(java.lang.Boolean argActive);

	/**
	 * sets the Active to the value of <code>argActive</code>
	 *
	 * @param argActive the new value of Active
	 */
	public void setActive(boolean argActive);

	/**
	 * object accessor for the Address
	 *
	 * <p>The Address field is a direct mapping of the <code>address</code> database column in the table <code>contact</code>.</p>
	 *
	 * @return an object value of Address (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.String getAddress();
	/**
	 * object accessor for the Address with substitution for a null value
	 *
	 * <p>The Address field is a direct mapping of the <code>address</code> database column in the table <code>contact</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the Address is <code>null</code>.
	 * @return an object value of Address (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getAddress(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getAddress();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the Address to the value of <code>argAddress</code>
	 *
	 * @param argAddress the new value of Address.  May be <code>null</code>.
	 * @throws ArgumentTooLongException if <code>argAddress</code> is longer than 2147483647 characters
	 * <p>The database column <code>address</code> is limited to 2147483647 characters.</p>
	 *
	 */
	@com.opal.annotation.Length(maximum = 2147483647L)
	public void setAddress(java.lang.String argAddress);

	public Account getAccount();
	public void setAccount(Account argAccount);

	public int getTournamentDirectorTournamentCount();
	public java.util.Iterator<Tournament> createTournamentDirectorTournamentIterator();

	public java.util.stream.Stream<Tournament> streamTournamentDirectorTournament();

	public void addTournamentDirectorTournament(Tournament argTournament);
	public void removeTournamentDirectorTournament(Tournament argTournament);
	public void clearTournamentDirectorTournament();

	default public <T extends java.util.Collection<? super Tournament>> T acquireTournamentDirectorTournament(T argC) {
		org.apache.commons.lang3.Validate.notNull(argC);
		java.util.Iterator<Tournament> lclI = createTournamentDirectorTournamentIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public Tournament[] createTournamentDirectorTournamentArray() {
		int lclLength = getTournamentDirectorTournamentCount();
		Tournament[] lclA = new Tournament[lclLength];
		int lclIndex = 0;
		java.util.Iterator<Tournament> lclI = createTournamentDirectorTournamentIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public int getPlayerCount();
	public java.util.Iterator<Player> createPlayerIterator();

	public java.util.stream.Stream<Player> streamPlayer();

	public void addPlayer(Player argPlayer);
	public void removePlayer(Player argPlayer);
	public void clearPlayer();

	default public <T extends java.util.Collection<? super Player>> T acquirePlayer(T argC) {
		org.apache.commons.lang3.Validate.notNull(argC);
		java.util.Iterator<Player> lclI = createPlayerIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public Player[] createPlayerArray() {
		int lclLength = getPlayerCount();
		Player[] lclA = new Player[lclLength];
		int lclIndex = 0;
		java.util.Iterator<Player> lclI = createPlayerIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public int getMainSchoolRegistrationCount();
	public java.util.Iterator<SchoolRegistration> createMainSchoolRegistrationIterator();

	public java.util.stream.Stream<SchoolRegistration> streamMainSchoolRegistration();

	public void addMainSchoolRegistration(SchoolRegistration argSchoolRegistration);
	public void removeMainSchoolRegistration(SchoolRegistration argSchoolRegistration);
	public void clearMainSchoolRegistration();

	default public <T extends java.util.Collection<? super SchoolRegistration>> T acquireMainSchoolRegistration(T argC) {
		org.apache.commons.lang3.Validate.notNull(argC);
		java.util.Iterator<SchoolRegistration> lclI = createMainSchoolRegistrationIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public SchoolRegistration[] createMainSchoolRegistrationArray() {
		int lclLength = getMainSchoolRegistrationCount();
		SchoolRegistration[] lclA = new SchoolRegistration[lclLength];
		int lclIndex = 0;
		java.util.Iterator<SchoolRegistration> lclI = createMainSchoolRegistrationIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public int getStaffCount();
	public java.util.Iterator<Staff> createStaffIterator();

	public java.util.stream.Stream<Staff> streamStaff();

	public void addStaff(Staff argStaff);
	public void removeStaff(Staff argStaff);
	public void clearStaff();

	default public <T extends java.util.Collection<? super Staff>> T acquireStaff(T argC) {
		org.apache.commons.lang3.Validate.notNull(argC);
		java.util.Iterator<Staff> lclI = createStaffIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public Staff[] createStaffArray() {
		int lclLength = getStaffCount();
		Staff[] lclA = new Staff[lclLength];
		int lclIndex = 0;
		java.util.Iterator<Staff> lclI = createStaffIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public Contact copy();

	/** This is a Comparator that can be used to compare Contact objects based on their Id values. */

	public static class IdComparator extends com.siliconage.util.NullSafeComparator<Contact> {
		private static final IdComparator ourInstance = new IdComparator();
		public static final IdComparator getInstance() { return ourInstance; }

		private IdComparator() { super(); }

		@Override
		public int compareInternal(Contact argFirst, Contact argSecond) {
			return argFirst.getIdAsObject().compareTo(argSecond.getIdAsObject());
		}
	}

	/** This is a Comparator that can be used to compare Contact objects based on their Name values. */

	public static class NameComparator extends com.siliconage.util.NullSafeComparator<Contact> {
		private static final NameComparator ourInstance = new NameComparator();
		public static final NameComparator getInstance() { return ourInstance; }

		private NameComparator() { super(); }

		@Override
		public int compareInternal(Contact argFirst, Contact argSecond) {
			return argFirst.getName().compareToIgnoreCase(argSecond.getName());
		}
	}

	/** This is a Comparator that can be used to compare Contact objects based on their SortBy values. */

	public static class SortByComparator extends com.siliconage.util.NullSafeComparator<Contact> {
		private static final SortByComparator ourInstance = new SortByComparator();
		public static final SortByComparator getInstance() { return ourInstance; }

		private SortByComparator() { super(); }

		@Override
		public int compareInternal(Contact argFirst, Contact argSecond) {
			return argFirst.getSortBy().compareToIgnoreCase(argSecond.getSortBy());
		}
	}

	/** This is a Filter that will pass Contact objects if their Active value is <code>true</code>. */

	public static class ActiveFilter extends com.siliconage.util.Filter<Contact> {
		private static final ActiveFilter ourInstance = new ActiveFilter();
		public static final ActiveFilter getInstance() { return ourInstance; }

		private ActiveFilter() { super(); }

		@Override
		public boolean accept(Contact argObject) {
			if (argObject == null) {
				return false;
			} else {
				return Boolean.TRUE.equals(argObject.isActiveAsObject());
			}
		}
	}

}
