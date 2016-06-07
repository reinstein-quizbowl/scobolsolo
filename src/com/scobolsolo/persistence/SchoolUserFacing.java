package com.scobolsolo.persistence;


/**
 * represents a {@code School} from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from {@code school}.  Do not modify this class directly; instead, alter the permanent storage on which it is based, the Opal configuration file for the project, and/or the {@link com.scobolsolo.application.School}, and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various {@code forXXX} methods on the {@link com.scobolsolo.application.SchoolFactory} factory class.  To create new instances, use the {@code create()} method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link com.opal.TransactionContext}.</p>
 *
 * <p>This interface is not meant to be referenced in user code.  Only the {@link com.scobolsolo.application.School} and the {@link com.scobolsolo.application.SchoolFactory} class should be referenced directly.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
public interface SchoolUserFacing extends com.opal.IdentityUserFacing, Comparable<com.scobolsolo.application.School> {

	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the {@code Id}
	 *
	 * <p>The {@code Id} field is a direct mapping of the {@code id} field in {@code school}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getId() method.</p>
	 *
	 * @return an object value of {@code Id} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Nullability(nullable = false)
	public java.lang.Integer getIdAsObject();

	/**
	 * primitive accessor for the {@code Id}
	 *
	 * <p>The {@code Id} field is a direct mapping of the {@code id} database column in the table {@code school}.</p>
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
	@com.opal.annotation.Nullability(nullable = false)
	public com.scobolsolo.application.School setId(java.lang.Integer argId);

	/**
	 * sets the {@code Id} to the value of {@code argId}
	 *
	 * @param argId the new value of {@code Id}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.School setId(int argId);

	/**
	 * object accessor for the {@code Name}
	 *
	 * <p>The {@code Name} field is a direct mapping of the {@code name} field in {@code school}.</p>
	 *
	 * @return an object value of {@code Name} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
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
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	public com.scobolsolo.application.School setName(java.lang.String argName);

	/**
	 * object accessor for the {@code ShortName}
	 *
	 * <p>The {@code ShortName} field is a direct mapping of the {@code short_name} field in {@code school}.</p>
	 *
	 * @return an object value of {@code ShortName} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	public java.lang.String getShortName();

	/**
	 * sets the {@code ShortName} to the value of {@code argShortName}
	 *
	 * @param argShortName the new value of {@code ShortName}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code short_name} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argShortName is null
	 * @throws com.opal.ArgumentTooLongException if {@code argShortName} is longer than 32 characters
	 * <p>The database column {@code short_name} is limited to 32 characters.</p>
	 *
	 */
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	public com.scobolsolo.application.School setShortName(java.lang.String argShortName);

	/**
	 * object accessor for the {@code VeryShortName}
	 *
	 * <p>The {@code VeryShortName} field is a direct mapping of the {@code very_short_name} field in {@code school}.</p>
	 *
	 * @return an object value of {@code VeryShortName} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 12L)
	public java.lang.String getVeryShortName();

	/**
	 * sets the {@code VeryShortName} to the value of {@code argVeryShortName}
	 *
	 * @param argVeryShortName the new value of {@code VeryShortName}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code very_short_name} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argVeryShortName is null
	 * @throws com.opal.ArgumentTooLongException if {@code argVeryShortName} is longer than 12 characters
	 * <p>The database column {@code very_short_name} is limited to 12 characters.</p>
	 *
	 */
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 12L)
	public com.scobolsolo.application.School setVeryShortName(java.lang.String argVeryShortName);

	/**
	 * object accessor for the {@code Location}
	 *
	 * <p>The {@code Location} field is a direct mapping of the {@code location} field in {@code school}.</p>
	 *
	 * @return an object value of {@code Location} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 256L)
	public java.lang.String getLocation();

	/**
	 * object accessor for the {@code Location} with substitution for a null value
	 *
	 * <p>The {@code Location} field is a direct mapping of the {@code location} database column in the table {@code school}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code Location} is {@code null}.
	 * @return an object value of {@code Location} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getLocation(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getLocation();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the {@code Location} to the value of {@code argLocation}
	 *
	 * @param argLocation the new value of {@code Location}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * @throws com.opal.ArgumentTooLongException if {@code argLocation} is longer than 256 characters
	 * <p>The database column {@code location} is limited to 256 characters.</p>
	 *
	 */
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 256L)
	public com.scobolsolo.application.School setLocation(java.lang.String argLocation);

	/**
	 * object accessor for the {@code Note}
	 *
	 * <p>The {@code Note} field is a direct mapping of the {@code note} field in {@code school}.</p>
	 *
	 * @return an object value of {@code Note} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	public java.lang.String getNote();

	/**
	 * object accessor for the {@code Note} with substitution for a null value
	 *
	 * <p>The {@code Note} field is a direct mapping of the {@code note} database column in the table {@code school}.</p>
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
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	public com.scobolsolo.application.School setNote(java.lang.String argNote);

	public int getSchoolRegistrationCount();
	public java.util.Iterator<com.scobolsolo.application.SchoolRegistration> createSchoolRegistrationIterator();

	public java.util.stream.Stream<com.scobolsolo.application.SchoolRegistration> streamSchoolRegistration();

	public com.scobolsolo.application.School addSchoolRegistration(com.scobolsolo.application.SchoolRegistration argSchoolRegistration);
	public com.scobolsolo.application.School removeSchoolRegistration(com.scobolsolo.application.SchoolRegistration argSchoolRegistration);
	default public <T extends java.util.Collection<? super com.scobolsolo.application.SchoolRegistration>> T acquireSchoolRegistration(T argC) {
		org.apache.commons.lang3.Validate.notNull(argC, "Target Collection is null");
		java.util.Iterator<com.scobolsolo.application.SchoolRegistration> lclI = createSchoolRegistrationIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public com.scobolsolo.application.SchoolRegistration[] createSchoolRegistrationArray() {
		int lclLength = getSchoolRegistrationCount();
		com.scobolsolo.application.SchoolRegistration[] lclA = new com.scobolsolo.application.SchoolRegistration[lclLength];
		int lclIndex = 0;
		java.util.Iterator<com.scobolsolo.application.SchoolRegistration> lclI = createSchoolRegistrationIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public com.scobolsolo.application.School copy();

	/** This is a Comparator that can be used to compare School objects based on their {@code Id} values. */

	public static class IdComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.School> {
		private static final IdComparator ourInstance = new IdComparator();
		public static final IdComparator getInstance() { return ourInstance; }

		private IdComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.School argFirst, com.scobolsolo.application.School argSecond) {
			return argFirst.getIdAsObject().compareTo(argSecond.getIdAsObject());
		}
	}

	/** This is a Comparator that can be used to compare School objects based on their {@code Name} values. */

	public static class NameComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.School> {
		private static final NameComparator ourInstance = new NameComparator();
		public static final NameComparator getInstance() { return ourInstance; }

		private NameComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.School argFirst, com.scobolsolo.application.School argSecond) {
			return argFirst.getName().compareToIgnoreCase(argSecond.getName());
		}
	}

	/** This is a Comparator that can be used to compare School objects based on their {@code ShortName} values. */

	public static class ShortNameComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.School> {
		private static final ShortNameComparator ourInstance = new ShortNameComparator();
		public static final ShortNameComparator getInstance() { return ourInstance; }

		private ShortNameComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.School argFirst, com.scobolsolo.application.School argSecond) {
			return argFirst.getShortName().compareToIgnoreCase(argSecond.getShortName());
		}
	}

	/** This is a Comparator that can be used to compare School objects based on their {@code VeryShortName} values. */

	public static class VeryShortNameComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.School> {
		private static final VeryShortNameComparator ourInstance = new VeryShortNameComparator();
		public static final VeryShortNameComparator getInstance() { return ourInstance; }

		private VeryShortNameComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.School argFirst, com.scobolsolo.application.School argSecond) {
			return argFirst.getVeryShortName().compareToIgnoreCase(argSecond.getVeryShortName());
		}
	}

}
