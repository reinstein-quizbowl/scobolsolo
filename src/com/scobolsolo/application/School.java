package com.scobolsolo.application;

import com.opal.*;

/**
 * represents a <code>School</code> from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from the database table <code>school</code>.  Do not modify this class directly; instead, alter the database table on which it is based and/or the Opal configuration file for the project and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various <code>forXXX</code> methods on the {@link SchoolFactory} factory class.  To create new instances, use the <code>create()</code> method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link TransactionContext}.</p>
 *
 * <p>This interface and the {@link SchoolFactory} class (the ones in the <code>com.scobolsolo.application</code> package) are the only two automatically generated files for the table that are intended to be referenced in user code. Other automatically generated files (namely those in the <code>com.scobolsolo.persistence</code> package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
public interface School extends IdentityUserFacing, Comparable<School> {
	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the Id
	 *
	 * <p>The Id field is a direct mapping of the <code>id</code> database column in the table <code>school</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getId() method.</p>
	 *
	 * @return an object value of Id (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Integer getIdAsObject();
	/**
	 * primitive accessor for the Id
	 *
	 * <p>The Id field is a direct mapping of the <code>id</code> database column in the table <code>school</code>.</p>
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
	 * object accessor for the Name
	 *
	 * <p>The Name field is a direct mapping of the <code>name</code> database column in the table <code>school</code>.</p>
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
	 * object accessor for the ShortName
	 *
	 * <p>The ShortName field is a direct mapping of the <code>short_name</code> database column in the table <code>school</code>.</p>
	 *
	 * @return an object value of ShortName (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.String getShortName();
	/**
	 * sets the ShortName to the value of <code>argShortName</code>
	 *
	 * @param argShortName the new value of ShortName.  May not be <code>null</code>.
	 * <p>The database column <code>short_name</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argShortName is null
	 * @throws ArgumentTooLongException if <code>argShortName</code> is longer than 32 characters
	 * <p>The database column <code>short_name</code> is limited to 32 characters.</p>
	 *
	 */
	@com.opal.annotation.NotNull
	@com.opal.annotation.Length(maximum = 32L)
	public void setShortName(java.lang.String argShortName);

	/**
	 * object accessor for the VeryShortName
	 *
	 * <p>The VeryShortName field is a direct mapping of the <code>very_short_name</code> database column in the table <code>school</code>.</p>
	 *
	 * @return an object value of VeryShortName (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.String getVeryShortName();
	/**
	 * sets the VeryShortName to the value of <code>argVeryShortName</code>
	 *
	 * @param argVeryShortName the new value of VeryShortName.  May not be <code>null</code>.
	 * <p>The database column <code>very_short_name</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argVeryShortName is null
	 * @throws ArgumentTooLongException if <code>argVeryShortName</code> is longer than 12 characters
	 * <p>The database column <code>very_short_name</code> is limited to 12 characters.</p>
	 *
	 */
	@com.opal.annotation.NotNull
	@com.opal.annotation.Length(maximum = 12L)
	public void setVeryShortName(java.lang.String argVeryShortName);

	/**
	 * object accessor for the Location
	 *
	 * <p>The Location field is a direct mapping of the <code>location</code> database column in the table <code>school</code>.</p>
	 *
	 * @return an object value of Location (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.String getLocation();
	/**
	 * object accessor for the Location with substitution for a null value
	 *
	 * <p>The Location field is a direct mapping of the <code>location</code> database column in the table <code>school</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the Location is <code>null</code>.
	 * @return an object value of Location (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getLocation(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getLocation();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the Location to the value of <code>argLocation</code>
	 *
	 * @param argLocation the new value of Location.  May be <code>null</code>.
	 * @throws ArgumentTooLongException if <code>argLocation</code> is longer than 256 characters
	 * <p>The database column <code>location</code> is limited to 256 characters.</p>
	 *
	 */
	@com.opal.annotation.Length(maximum = 256L)
	public void setLocation(java.lang.String argLocation);

	/**
	 * object accessor for the Note
	 *
	 * <p>The Note field is a direct mapping of the <code>note</code> database column in the table <code>school</code>.</p>
	 *
	 * @return an object value of Note (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.String getNote();
	/**
	 * object accessor for the Note with substitution for a null value
	 *
	 * <p>The Note field is a direct mapping of the <code>note</code> database column in the table <code>school</code>.</p>
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

	public int getSchoolRegistrationCount();
	public java.util.Iterator<SchoolRegistration> createSchoolRegistrationIterator();

	public java.util.stream.Stream<SchoolRegistration> streamSchoolRegistration();

	public void addSchoolRegistration(SchoolRegistration argSchoolRegistration);
	public void removeSchoolRegistration(SchoolRegistration argSchoolRegistration);
	public void clearSchoolRegistration();

	default public <T extends java.util.Collection<? super SchoolRegistration>> T acquireSchoolRegistration(T argC) {
		org.apache.commons.lang3.Validate.notNull(argC);
		java.util.Iterator<SchoolRegistration> lclI = createSchoolRegistrationIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public SchoolRegistration[] createSchoolRegistrationArray() {
		int lclLength = getSchoolRegistrationCount();
		SchoolRegistration[] lclA = new SchoolRegistration[lclLength];
		int lclIndex = 0;
		java.util.Iterator<SchoolRegistration> lclI = createSchoolRegistrationIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public School copy();

	default public String getExplainedName() {
		return com.scobolsolo.application.SchoolDelegate.getExplainedName(this);
	}

	default public String getExplainedName(String argA) {
		return com.scobolsolo.application.SchoolDelegate.getExplainedName(this, argA);
	}

	default public String getExplainedShortName() {
		return com.scobolsolo.application.SchoolDelegate.getExplainedShortName(this);
	}

	default public String getExplainedVeryShortName() {
		return com.scobolsolo.application.SchoolDelegate.getExplainedVeryShortName(this);
	}

	/** This is a Comparator that can be used to compare School objects based on their Id values. */

	public static class IdComparator extends com.siliconage.util.NullSafeComparator<School> {
		private static final IdComparator ourInstance = new IdComparator();
		public static final IdComparator getInstance() { return ourInstance; }

		private IdComparator() { super(); }

		@Override
		public int compareInternal(School argFirst, School argSecond) {
			return argFirst.getIdAsObject().compareTo(argSecond.getIdAsObject());
		}
	}

	/** This is a Comparator that can be used to compare School objects based on their Name values. */

	public static class NameComparator extends com.siliconage.util.NullSafeComparator<School> {
		private static final NameComparator ourInstance = new NameComparator();
		public static final NameComparator getInstance() { return ourInstance; }

		private NameComparator() { super(); }

		@Override
		public int compareInternal(School argFirst, School argSecond) {
			return argFirst.getName().compareToIgnoreCase(argSecond.getName());
		}
	}

	/** This is a Comparator that can be used to compare School objects based on their ShortName values. */

	public static class ShortNameComparator extends com.siliconage.util.NullSafeComparator<School> {
		private static final ShortNameComparator ourInstance = new ShortNameComparator();
		public static final ShortNameComparator getInstance() { return ourInstance; }

		private ShortNameComparator() { super(); }

		@Override
		public int compareInternal(School argFirst, School argSecond) {
			return argFirst.getShortName().compareToIgnoreCase(argSecond.getShortName());
		}
	}

	/** This is a Comparator that can be used to compare School objects based on their VeryShortName values. */

	public static class VeryShortNameComparator extends com.siliconage.util.NullSafeComparator<School> {
		private static final VeryShortNameComparator ourInstance = new VeryShortNameComparator();
		public static final VeryShortNameComparator getInstance() { return ourInstance; }

		private VeryShortNameComparator() { super(); }

		@Override
		public int compareInternal(School argFirst, School argSecond) {
			return argFirst.getVeryShortName().compareToIgnoreCase(argSecond.getVeryShortName());
		}
	}

}
