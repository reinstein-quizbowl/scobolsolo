package com.scobolsolo.persistence;

import com.opal.*;

/**
 * represents a {@code SchoolYear} from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from {@code school_year}.  Do not modify this class directly; instead, alter the permanent storage on which it is based, the Opal configuration file for the project, and/or the {@link com.scobolsolo.application.SchoolYear}, and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various {@code forXXX} methods on the {@link com.scobolsolo.application.SchoolYearFactory} factory class.  To create new instances, use the {@code create()} method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link com.opal.TransactionContext}.</p>
 *
 * <p>This interface is not meant to be referenced in user code.  Only the {@link com.scobolsolo.application.SchoolYear} and the {@link com.scobolsolo.application.SchoolYearFactory} class should be referenced directly.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
public interface SchoolYearUserFacing extends IdentityUserFacing, Comparable<com.scobolsolo.application.SchoolYear> {
	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the {@code Code}
	 *
	 * <p>The {@code Code} field is a direct mapping of the {@code code} field in {@code school_year}.</p>
	 *
	 * @return an object value of {@code Code} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.String getCode();

	/**
	 * sets the {@code Code} to the value of {@code argCode}
	 *
	 * @param argCode the new value of {@code Code}.  May not be <code>null</code>.
	 * <p>The database column {@code code} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argCode is null
	 * @throws ArgumentTooLongException if {@code argCode} is longer than 32 characters
	 * <p>The database column {@code code} is limited to 32 characters.</p>
	 *
	 */
	@com.opal.annotation.NotNull
	@com.opal.annotation.Length(maximum = 32L)
	public void setCode(java.lang.String argCode);

	/**
	 * object accessor for the {@code Name}
	 *
	 * <p>The {@code Name} field is a direct mapping of the {@code name} field in {@code school_year}.</p>
	 *
	 * @return an object value of {@code Name} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.String getName();

	/**
	 * sets the {@code Name} to the value of {@code argName}
	 *
	 * @param argName the new value of {@code Name}.  May not be <code>null</code>.
	 * <p>The database column {@code name} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argName is null
	 * @throws ArgumentTooLongException if {@code argName} is longer than 256 characters
	 * <p>The database column {@code name} is limited to 256 characters.</p>
	 *
	 */
	@com.opal.annotation.NotNull
	@com.opal.annotation.Length(maximum = 256L)
	public void setName(java.lang.String argName);

	/**
	 * object accessor for the {@code ShortName}
	 *
	 * <p>The {@code ShortName} field is a direct mapping of the {@code short_name} field in {@code school_year}.</p>
	 *
	 * @return an object value of {@code ShortName} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.String getShortName();

	/**
	 * sets the {@code ShortName} to the value of {@code argShortName}
	 *
	 * @param argShortName the new value of {@code ShortName}.  May not be <code>null</code>.
	 * <p>The database column {@code short_name} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argShortName is null
	 * @throws ArgumentTooLongException if {@code argShortName} is longer than 32 characters
	 * <p>The database column {@code short_name} is limited to 32 characters.</p>
	 *
	 */
	@com.opal.annotation.NotNull
	@com.opal.annotation.Length(maximum = 32L)
	public void setShortName(java.lang.String argShortName);

	/**
	 * object accessor for the {@code VeryShortName}
	 *
	 * <p>The {@code VeryShortName} field is a direct mapping of the {@code very_short_name} field in {@code school_year}.</p>
	 *
	 * @return an object value of {@code VeryShortName} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.String getVeryShortName();

	/**
	 * sets the {@code VeryShortName} to the value of {@code argVeryShortName}
	 *
	 * @param argVeryShortName the new value of {@code VeryShortName}.  May not be <code>null</code>.
	 * <p>The database column {@code very_short_name} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argVeryShortName is null
	 * @throws ArgumentTooLongException if {@code argVeryShortName} is longer than 12 characters
	 * <p>The database column {@code very_short_name} is limited to 12 characters.</p>
	 *
	 */
	@com.opal.annotation.NotNull
	@com.opal.annotation.Length(maximum = 12L)
	public void setVeryShortName(java.lang.String argVeryShortName);

	/**
	 * object accessor for the {@code Sequence}
	 *
	 * <p>The {@code Sequence} field is a direct mapping of the {@code sequence} field in {@code school_year}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getSequence() method.</p>
	 *
	 * @return an object value of {@code Sequence} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.Integer getSequenceAsObject();

	/**
	 * primitive accessor for the {@code Sequence}
	 *
	 * <p>The {@code Sequence} field is a direct mapping of the {@code sequence} field in {@code school_year}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getSequenceAsObject() method.</p>
	 *
	 * @return the primitive value of {@code Sequence} (of the current {@link com.opal.TransactionContext})
	 */
	default public int getSequence() {
		java.lang.Integer lclO = getSequenceAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the {@code Sequence} to the value of {@code argSequence}
	 *
	 * @param argSequence the new value of {@code Sequence}.  May not be <code>null</code>.
	 * <p>The database column {@code sequence} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argSequence is null
	 */
	@com.opal.annotation.NotNull
	public void setSequence(java.lang.Integer argSequence);

	/**
	 * sets the {@code Sequence} to the value of {@code argSequence}
	 *
	 * @param argSequence the new value of {@code Sequence}
	 */
	public void setSequence(int argSequence);

	public com.scobolsolo.application.SchoolYear copy();

	/** This is a Comparator that can be used to compare SchoolYear objects based on their {@code Code} values. */

	public static class CodeComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.SchoolYear> {
		private static final CodeComparator ourInstance = new CodeComparator();
		public static final CodeComparator getInstance() { return ourInstance; }

		private CodeComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.SchoolYear argFirst, com.scobolsolo.application.SchoolYear argSecond) {
			return argFirst.getCode().compareToIgnoreCase(argSecond.getCode());
		}
	}

	/** This is a Comparator that can be used to compare SchoolYear objects based on their {@code Name} values. */

	public static class NameComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.SchoolYear> {
		private static final NameComparator ourInstance = new NameComparator();
		public static final NameComparator getInstance() { return ourInstance; }

		private NameComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.SchoolYear argFirst, com.scobolsolo.application.SchoolYear argSecond) {
			return argFirst.getName().compareToIgnoreCase(argSecond.getName());
		}
	}

	/** This is a Comparator that can be used to compare SchoolYear objects based on their {@code ShortName} values. */

	public static class ShortNameComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.SchoolYear> {
		private static final ShortNameComparator ourInstance = new ShortNameComparator();
		public static final ShortNameComparator getInstance() { return ourInstance; }

		private ShortNameComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.SchoolYear argFirst, com.scobolsolo.application.SchoolYear argSecond) {
			return argFirst.getShortName().compareToIgnoreCase(argSecond.getShortName());
		}
	}

	/** This is a Comparator that can be used to compare SchoolYear objects based on their {@code VeryShortName} values. */

	public static class VeryShortNameComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.SchoolYear> {
		private static final VeryShortNameComparator ourInstance = new VeryShortNameComparator();
		public static final VeryShortNameComparator getInstance() { return ourInstance; }

		private VeryShortNameComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.SchoolYear argFirst, com.scobolsolo.application.SchoolYear argSecond) {
			return argFirst.getVeryShortName().compareToIgnoreCase(argSecond.getVeryShortName());
		}
	}

	/** This is a Comparator that can be used to compare SchoolYear objects based on their {@code Sequence} values. */

	public static class SequenceComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.SchoolYear> {
		private static final SequenceComparator ourInstance = new SequenceComparator();
		public static final SequenceComparator getInstance() { return ourInstance; }

		private SequenceComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.SchoolYear argFirst, com.scobolsolo.application.SchoolYear argSecond) {
			return argFirst.getSequenceAsObject().compareTo(argSecond.getSequenceAsObject());
		}
	}

}
