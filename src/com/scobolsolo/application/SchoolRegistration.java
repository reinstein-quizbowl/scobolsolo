package com.scobolsolo.application;

import com.opal.*;

/**
 * represents a <code>SchoolRegistration</code> from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from the database table <code>school_registration</code>.  Do not modify this class directly; instead, alter the database table on which it is based and/or the Opal configuration file for the project and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various <code>forXXX</code> methods on the {@link SchoolRegistrationFactory} factory class.  To create new instances, use the <code>create()</code> method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link TransactionContext}.</p>
 *
 * <p>This interface and the {@link SchoolRegistrationFactory} class (the ones in the <code>com.scobolsolo.application</code> package) are the only two automatically generated files for the table that are intended to be referenced in user code. Other automatically generated files (namely those in the <code>com.scobolsolo.persistence</code> package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
public interface SchoolRegistration extends IdentityUserFacing {
	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the Id
	 *
	 * <p>The Id field is a direct mapping of the <code>id</code> database column in the table <code>school_registration</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getId() method.</p>
	 *
	 * @return an object value of Id (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Integer getIdAsObject();
	/**
	 * primitive accessor for the Id
	 *
	 * <p>The Id field is a direct mapping of the <code>id</code> database column in the table <code>school_registration</code>.</p>
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
	 * object accessor for the SchoolId
	 *
	 * <p>The SchoolId field is a direct mapping of the <code>school_id</code> database column in the table <code>school_registration</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getSchoolId() method.</p>
	 *
	 * @return an object value of SchoolId (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Integer getSchoolIdAsObject();
	/**
	 * primitive accessor for the SchoolId
	 *
	 * <p>The SchoolId field is a direct mapping of the <code>school_id</code> database column in the table <code>school_registration</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getSchoolIdAsObject() method.</p>
	 *
	 * @return the primitive value of SchoolId (of the current {@link TransactionContext})
	 */
	default public int getSchoolId() {
		java.lang.Integer lclO = getSchoolIdAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the SchoolId to the value of <code>argSchoolId</code>
	 *
	 * @param argSchoolId the new value of SchoolId.  May not be <code>null</code>.
	 * <p>The database column <code>school_id</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argSchoolId is null
	 */
	@com.opal.annotation.NotNull
	public void setSchoolId(java.lang.Integer argSchoolId);

	/**
	 * sets the SchoolId to the value of <code>argSchoolId</code>
	 *
	 * @param argSchoolId the new value of SchoolId
	 */
	public void setSchoolId(int argSchoolId);

	/**
	 * object accessor for the MainContactId
	 *
	 * <p>The MainContactId field is a direct mapping of the <code>main_contact_id</code> database column in the table <code>school_registration</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getMainContactId() method.</p>
	 *
	 * @return an object value of MainContactId (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Integer getMainContactIdAsObject();
	/**
	 * primitive accessor for the MainContactId
	 *
	 * <p>The MainContactId field is a direct mapping of the <code>main_contact_id</code> database column in the table <code>school_registration</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getMainContactIdAsObject() method.</p>
	 *
	 * @return the primitive value of MainContactId (of the current {@link TransactionContext})
	 */
	default public int getMainContactId() {
		java.lang.Integer lclO = getMainContactIdAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the MainContactId to the value of <code>argMainContactId</code>
	 *
	 * @param argMainContactId the new value of MainContactId.  May not be <code>null</code>.
	 * <p>The database column <code>main_contact_id</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argMainContactId is null
	 */
	@com.opal.annotation.NotNull
	public void setMainContactId(java.lang.Integer argMainContactId);

	/**
	 * sets the MainContactId to the value of <code>argMainContactId</code>
	 *
	 * @param argMainContactId the new value of MainContactId
	 */
	public void setMainContactId(int argMainContactId);

	/**
	 * object accessor for the AmountOwed
	 *
	 * <p>The AmountOwed field is a direct mapping of the <code>amount_owed</code> database column in the table <code>school_registration</code>.</p>
	 *
	 * @return an object value of AmountOwed (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.math.BigDecimal getAmountOwed();
	/**
	 * sets the AmountOwed to the value of <code>argAmountOwed</code>
	 *
	 * @param argAmountOwed the new value of AmountOwed.  May not be <code>null</code>.
	 * <p>The database column <code>amount_owed</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argAmountOwed is null
	 */
	@com.opal.annotation.NotNull
	public void setAmountOwed(java.math.BigDecimal argAmountOwed);

	/**
	 * object accessor for the AmountPaid
	 *
	 * <p>The AmountPaid field is a direct mapping of the <code>amount_paid</code> database column in the table <code>school_registration</code>.</p>
	 *
	 * @return an object value of AmountPaid (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.math.BigDecimal getAmountPaid();
	/**
	 * sets the AmountPaid to the value of <code>argAmountPaid</code>
	 *
	 * @param argAmountPaid the new value of AmountPaid.  May not be <code>null</code>.
	 * <p>The database column <code>amount_paid</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argAmountPaid is null
	 */
	@com.opal.annotation.NotNull
	public void setAmountPaid(java.math.BigDecimal argAmountPaid);

	/**
	 * object accessor for the Note
	 *
	 * <p>The Note field is a direct mapping of the <code>note</code> database column in the table <code>school_registration</code>.</p>
	 *
	 * @return an object value of Note (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.String getNote();
	/**
	 * object accessor for the Note with substitution for a null value
	 *
	 * <p>The Note field is a direct mapping of the <code>note</code> database column in the table <code>school_registration</code>.</p>
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
	 * object accessor for the SpotsReserved
	 *
	 * <p>The SpotsReserved field is a direct mapping of the <code>spots_reserved</code> database column in the table <code>school_registration</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getSpotsReserved() method.</p>
	 *
	 * @return an object value of SpotsReserved (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Integer getSpotsReservedAsObject();
	/**
	 * primitive accessor for the SpotsReserved
	 *
	 * <p>The SpotsReserved field is a direct mapping of the <code>spots_reserved</code> database column in the table <code>school_registration</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getSpotsReservedAsObject() method.</p>
	 *
	 * @return the primitive value of SpotsReserved (of the current {@link TransactionContext})
	 */
	default public int getSpotsReserved() {
		java.lang.Integer lclO = getSpotsReservedAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the SpotsReserved to the value of <code>argSpotsReserved</code>
	 *
	 * @param argSpotsReserved the new value of SpotsReserved.  May not be <code>null</code>.
	 * <p>The database column <code>spots_reserved</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argSpotsReserved is null
	 */
	@com.opal.annotation.NotNull
	public void setSpotsReserved(java.lang.Integer argSpotsReserved);

	/**
	 * sets the SpotsReserved to the value of <code>argSpotsReserved</code>
	 *
	 * @param argSpotsReserved the new value of SpotsReserved
	 */
	public void setSpotsReserved(int argSpotsReserved);

	/**
	 * object accessor for the TournamentCode
	 *
	 * <p>The TournamentCode field is a direct mapping of the <code>tournament_code</code> database column in the table <code>school_registration</code>.</p>
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
	 * @return the <code>Contact</code>
	 * The returned <code>Contact</code> is the {@link UserFacing} object corresponding to the row in the <code>contact</code> that is referenced by the foreign key <code>registration_main_contact_id_fkey</code>.
	 *
	 */
	public Contact getMainContact();
	public void setMainContact(Contact argContact);

	/**
	 * @return the <code>School</code>
	 * The returned <code>School</code> is the {@link UserFacing} object corresponding to the row in the <code>school</code> that is referenced by the foreign key <code>registration_school_id_fkey</code>.
	 *
	 */
	public School getSchool();
	public void setSchool(School argSchool);

	/**
	 * @return the <code>Tournament</code>
	 * The returned <code>Tournament</code> is the {@link UserFacing} object corresponding to the row in the <code>tournament</code> that is referenced by the foreign key <code>school_registration_tournament_code_fkey</code>.
	 *
	 */
	public Tournament getTournament();
	public void setTournament(Tournament argTournament);

	public int getStandbyEntryCount();
	public java.util.Iterator<StandbyEntry> createStandbyEntryIterator();

	public java.util.stream.Stream<StandbyEntry> streamStandbyEntry();

	public void addStandbyEntry(StandbyEntry argStandbyEntry);
	public void removeStandbyEntry(StandbyEntry argStandbyEntry);
	public void clearStandbyEntry();

	default public <T extends java.util.Collection<? super StandbyEntry>> T acquireStandbyEntry(T argC) {
		org.apache.commons.lang3.Validate.notNull(argC);
		java.util.Iterator<StandbyEntry> lclI = createStandbyEntryIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public StandbyEntry[] createStandbyEntryArray() {
		int lclLength = getStandbyEntryCount();
		StandbyEntry[] lclA = new StandbyEntry[lclLength];
		int lclIndex = 0;
		java.util.Iterator<StandbyEntry> lclI = createStandbyEntryIterator();
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

	public int getBuzzerCount();
	public java.util.Iterator<Buzzer> createBuzzerIterator();

	public java.util.stream.Stream<Buzzer> streamBuzzer();

	public void addBuzzer(Buzzer argBuzzer);
	public void removeBuzzer(Buzzer argBuzzer);
	public void clearBuzzer();

	default public <T extends java.util.Collection<? super Buzzer>> T acquireBuzzer(T argC) {
		org.apache.commons.lang3.Validate.notNull(argC);
		java.util.Iterator<Buzzer> lclI = createBuzzerIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public Buzzer[] createBuzzerArray() {
		int lclLength = getBuzzerCount();
		Buzzer[] lclA = new Buzzer[lclLength];
		int lclIndex = 0;
		java.util.Iterator<Buzzer> lclI = createBuzzerIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public int getWaitlistEntryCount();
	public java.util.Iterator<WaitlistEntry> createWaitlistEntryIterator();

	public java.util.stream.Stream<WaitlistEntry> streamWaitlistEntry();

	public void addWaitlistEntry(WaitlistEntry argWaitlistEntry);
	public void removeWaitlistEntry(WaitlistEntry argWaitlistEntry);
	public void clearWaitlistEntry();

	default public <T extends java.util.Collection<? super WaitlistEntry>> T acquireWaitlistEntry(T argC) {
		org.apache.commons.lang3.Validate.notNull(argC);
		java.util.Iterator<WaitlistEntry> lclI = createWaitlistEntryIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public WaitlistEntry[] createWaitlistEntryArray() {
		int lclLength = getWaitlistEntryCount();
		WaitlistEntry[] lclA = new WaitlistEntry[lclLength];
		int lclIndex = 0;
		java.util.Iterator<WaitlistEntry> lclI = createWaitlistEntryIterator();
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

	public SchoolRegistration copy();

	default public int getFullPlayerCount() {
		return com.scobolsolo.application.SchoolRegistrationDelegate.getFullPlayerCount(this);
	}

	/** This is a Comparator that can be used to compare SchoolRegistration objects based on their Id values. */

	public static class IdComparator extends com.siliconage.util.NullSafeComparator<SchoolRegistration> {
		private static final IdComparator ourInstance = new IdComparator();
		public static final IdComparator getInstance() { return ourInstance; }

		private IdComparator() { super(); }

		@Override
		public int compareInternal(SchoolRegistration argFirst, SchoolRegistration argSecond) {
			return argFirst.getIdAsObject().compareTo(argSecond.getIdAsObject());
		}
	}

	public static class TournamentDateComparator extends com.siliconage.util.NullSafeComparator<SchoolRegistration> {
		private static final TournamentDateComparator ourInstance = new TournamentDateComparator();
		public static final TournamentDateComparator getInstance() { return ourInstance; }

		private TournamentDateComparator() { super(); }

		@Override
		public int compareInternal(SchoolRegistration argFirst, SchoolRegistration argSecond) {
			return com.scobolsolo.application.Tournament.DateComparator.getInstance().compare(argFirst.getTournament(), argSecond.getTournament());
		}
	}

	public static class SchoolNameComparator extends com.siliconage.util.NullSafeComparator<SchoolRegistration> {
		private static final SchoolNameComparator ourInstance = new SchoolNameComparator();
		public static final SchoolNameComparator getInstance() { return ourInstance; }

		private SchoolNameComparator() { super(); }

		@Override
		public int compareInternal(SchoolRegistration argFirst, SchoolRegistration argSecond) {
			return com.scobolsolo.application.School.NameComparator.getInstance().compare(argFirst.getSchool(), argSecond.getSchool());
		}
	}

	public static class SchoolShortNameComparator extends com.siliconage.util.NullSafeComparator<SchoolRegistration> {
		private static final SchoolShortNameComparator ourInstance = new SchoolShortNameComparator();
		public static final SchoolShortNameComparator getInstance() { return ourInstance; }

		private SchoolShortNameComparator() { super(); }

		@Override
		public int compareInternal(SchoolRegistration argFirst, SchoolRegistration argSecond) {
			return com.scobolsolo.application.School.ShortNameComparator.getInstance().compare(argFirst.getSchool(), argSecond.getSchool());
		}
	}

}
