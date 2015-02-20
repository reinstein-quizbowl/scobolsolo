package com.scobolsolo.application;

import com.opal.*;

/**
 * represents a <code>ResponseType</code> from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from the database table <code>response_type</code>.  Do not modify this class directly; instead, alter the database table on which it is based and/or the Opal configuration file for the project and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various <code>forXXX</code> methods on the {@link ResponseTypeFactory} factory class.  To create new instances, use the <code>create()</code> method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link TransactionContext}.</p>
 *
 * <p>This interface and the {@link ResponseTypeFactory} class (the ones in the <code>com.scobolsolo.application</code> package) are the only two automatically generated files for the table that are intended to be referenced in user code. Other automatically generated files (namely those in the <code>com.scobolsolo.persistence</code> package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
public interface ResponseType extends IdentityUserFacing, Comparable<ResponseType> {
	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the Code
	 *
	 * <p>The Code field is a direct mapping of the <code>code</code> database column in the table <code>response_type</code>.</p>
	 *
	 * @return an object value of Code (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.String getCode();
	/**
	 * sets the Code to the value of <code>argCode</code>
	 *
	 * @param argCode the new value of Code.  May not be <code>null</code>.
	 * <p>The database column <code>code</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argCode is null
	 * @throws ArgumentTooLongException if <code>argCode</code> is longer than 32 characters
	 * <p>The database column <code>code</code> is limited to 32 characters.</p>
	 *
	 */
	@com.opal.annotation.NotNull
	@com.opal.annotation.Length(maximum = 32L)
	public void setCode(java.lang.String argCode);

	/**
	 * object accessor for the Name
	 *
	 * <p>The Name field is a direct mapping of the <code>name</code> database column in the table <code>response_type</code>.</p>
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
	 * <p>The ShortName field is a direct mapping of the <code>short_name</code> database column in the table <code>response_type</code>.</p>
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
	 * object accessor for the Sequence
	 *
	 * <p>The Sequence field is a direct mapping of the <code>sequence</code> database column in the table <code>response_type</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getSequence() method.</p>
	 *
	 * @return an object value of Sequence (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Integer getSequenceAsObject();
	/**
	 * primitive accessor for the Sequence
	 *
	 * <p>The Sequence field is a direct mapping of the <code>sequence</code> database column in the table <code>response_type</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getSequenceAsObject() method.</p>
	 *
	 * @return the primitive value of Sequence (of the current {@link TransactionContext})
	 */
	default public int getSequence() {
		java.lang.Integer lclO = getSequenceAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the Sequence to the value of <code>argSequence</code>
	 *
	 * @param argSequence the new value of Sequence.  May not be <code>null</code>.
	 * <p>The database column <code>sequence</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argSequence is null
	 */
	@com.opal.annotation.NotNull
	public void setSequence(java.lang.Integer argSequence);

	/**
	 * sets the Sequence to the value of <code>argSequence</code>
	 *
	 * @param argSequence the new value of Sequence
	 */
	public void setSequence(int argSequence);

	/**
	 * object accessor for the Points
	 *
	 * <p>The Points field is a direct mapping of the <code>points</code> database column in the table <code>response_type</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getPoints() method.</p>
	 *
	 * @return an object value of Points (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Integer getPointsAsObject();
	/**
	 * primitive accessor for the Points
	 *
	 * <p>The Points field is a direct mapping of the <code>points</code> database column in the table <code>response_type</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getPointsAsObject() method.</p>
	 *
	 * @return the primitive value of Points (of the current {@link TransactionContext})
	 */
	default public int getPoints() {
		java.lang.Integer lclO = getPointsAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the Points to the value of <code>argPoints</code>
	 *
	 * @param argPoints the new value of Points.  May not be <code>null</code>.
	 * <p>The database column <code>points</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argPoints is null
	 */
	@com.opal.annotation.NotNull
	public void setPoints(java.lang.Integer argPoints);

	/**
	 * sets the Points to the value of <code>argPoints</code>
	 *
	 * @param argPoints the new value of Points
	 */
	public void setPoints(int argPoints);

	/**
	 * object accessor for the BootstrapButtonClass
	 *
	 * <p>The BootstrapButtonClass field is a direct mapping of the <code>bootstrap_button_class</code> database column in the table <code>response_type</code>.</p>
	 *
	 * @return an object value of BootstrapButtonClass (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.String getBootstrapButtonClass();
	/**
	 * sets the BootstrapButtonClass to the value of <code>argBootstrapButtonClass</code>
	 *
	 * @param argBootstrapButtonClass the new value of BootstrapButtonClass.  May not be <code>null</code>.
	 * <p>The database column <code>bootstrap_button_class</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argBootstrapButtonClass is null
	 * @throws ArgumentTooLongException if <code>argBootstrapButtonClass</code> is longer than 64 characters
	 * <p>The database column <code>bootstrap_button_class</code> is limited to 64 characters.</p>
	 *
	 */
	@com.opal.annotation.NotNull
	@com.opal.annotation.Length(maximum = 64L)
	public void setBootstrapButtonClass(java.lang.String argBootstrapButtonClass);

	/**
	 * object accessor for the Default
	 *
	 * <p>The Default field is a direct mapping of the <code>is_default</code> database column in the table <code>response_type</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isDefault() method.</p>
	 *
	 * @return an object value of Default (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Boolean isDefaultAsObject();
	/**
	 * primitive accessor for the Default
	 *
	 * <p>The Default field is a direct mapping of the <code>is_default</code> database column in the table <code>response_type</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the isDefaultAsObject() method.</p>
	 *
	 * @return the primitive value of Default (of the current {@link TransactionContext})
	 */
	default public boolean isDefault() {
		java.lang.Boolean lclO = isDefaultAsObject();
		return lclO.booleanValue();
	}

	/**
	 * sets the Default to the value of <code>argDefault</code>
	 *
	 * @param argDefault the new value of Default.  May not be <code>null</code>.
	 * <p>The database column <code>is_default</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argDefault is null
	 */
	@com.opal.annotation.NotNull
	public void setDefault(java.lang.Boolean argDefault);

	/**
	 * sets the Default to the value of <code>argDefault</code>
	 *
	 * @param argDefault the new value of Default
	 */
	public void setDefault(boolean argDefault);

	/**
	 * object accessor for the MultipleAllowedForSamePlacement
	 *
	 * <p>The MultipleAllowedForSamePlacement field is a direct mapping of the <code>multiple_allowed_for_same_placement</code> database column in the table <code>response_type</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isMultipleAllowedForSamePlacement() method.</p>
	 *
	 * @return an object value of MultipleAllowedForSamePlacement (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Boolean isMultipleAllowedForSamePlacementAsObject();
	/**
	 * primitive accessor for the MultipleAllowedForSamePlacement
	 *
	 * <p>The MultipleAllowedForSamePlacement field is a direct mapping of the <code>multiple_allowed_for_same_placement</code> database column in the table <code>response_type</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the isMultipleAllowedForSamePlacementAsObject() method.</p>
	 *
	 * @return the primitive value of MultipleAllowedForSamePlacement (of the current {@link TransactionContext})
	 */
	default public boolean isMultipleAllowedForSamePlacement() {
		java.lang.Boolean lclO = isMultipleAllowedForSamePlacementAsObject();
		return lclO.booleanValue();
	}

	/**
	 * sets the MultipleAllowedForSamePlacement to the value of <code>argMultipleAllowedForSamePlacement</code>
	 *
	 * @param argMultipleAllowedForSamePlacement the new value of MultipleAllowedForSamePlacement.  May not be <code>null</code>.
	 * <p>The database column <code>multiple_allowed_for_same_placement</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argMultipleAllowedForSamePlacement is null
	 */
	@com.opal.annotation.NotNull
	public void setMultipleAllowedForSamePlacement(java.lang.Boolean argMultipleAllowedForSamePlacement);

	/**
	 * sets the MultipleAllowedForSamePlacement to the value of <code>argMultipleAllowedForSamePlacement</code>
	 *
	 * @param argMultipleAllowedForSamePlacement the new value of MultipleAllowedForSamePlacement
	 */
	public void setMultipleAllowedForSamePlacement(boolean argMultipleAllowedForSamePlacement);

	/**
	 * object accessor for the Attempt
	 *
	 * <p>The Attempt field is a direct mapping of the <code>is_attempt</code> database column in the table <code>response_type</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isAttempt() method.</p>
	 *
	 * @return an object value of Attempt (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Boolean isAttemptAsObject();
	/**
	 * primitive accessor for the Attempt
	 *
	 * <p>The Attempt field is a direct mapping of the <code>is_attempt</code> database column in the table <code>response_type</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the isAttemptAsObject() method.</p>
	 *
	 * @return the primitive value of Attempt (of the current {@link TransactionContext})
	 */
	default public boolean isAttempt() {
		java.lang.Boolean lclO = isAttemptAsObject();
		return lclO.booleanValue();
	}

	/**
	 * sets the Attempt to the value of <code>argAttempt</code>
	 *
	 * @param argAttempt the new value of Attempt.  May not be <code>null</code>.
	 * <p>The database column <code>is_attempt</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argAttempt is null
	 */
	@com.opal.annotation.NotNull
	public void setAttempt(java.lang.Boolean argAttempt);

	/**
	 * sets the Attempt to the value of <code>argAttempt</code>
	 *
	 * @param argAttempt the new value of Attempt
	 */
	public void setAttempt(boolean argAttempt);

	public ResponseType copy();

	/** This is a Comparator that can be used to compare ResponseType objects based on their Code values. */

	public static class CodeComparator extends com.siliconage.util.NullSafeComparator<ResponseType> {
		private static final CodeComparator ourInstance = new CodeComparator();
		public static final CodeComparator getInstance() { return ourInstance; }

		private CodeComparator() { super(); }

		@Override
		public int compareInternal(ResponseType argFirst, ResponseType argSecond) {
			return argFirst.getCode().compareToIgnoreCase(argSecond.getCode());
		}
	}

	/** This is a Comparator that can be used to compare ResponseType objects based on their Name values. */

	public static class NameComparator extends com.siliconage.util.NullSafeComparator<ResponseType> {
		private static final NameComparator ourInstance = new NameComparator();
		public static final NameComparator getInstance() { return ourInstance; }

		private NameComparator() { super(); }

		@Override
		public int compareInternal(ResponseType argFirst, ResponseType argSecond) {
			return argFirst.getName().compareToIgnoreCase(argSecond.getName());
		}
	}

	/** This is a Comparator that can be used to compare ResponseType objects based on their ShortName values. */

	public static class ShortNameComparator extends com.siliconage.util.NullSafeComparator<ResponseType> {
		private static final ShortNameComparator ourInstance = new ShortNameComparator();
		public static final ShortNameComparator getInstance() { return ourInstance; }

		private ShortNameComparator() { super(); }

		@Override
		public int compareInternal(ResponseType argFirst, ResponseType argSecond) {
			return argFirst.getShortName().compareToIgnoreCase(argSecond.getShortName());
		}
	}

	/** This is a Comparator that can be used to compare ResponseType objects based on their Sequence values. */

	public static class SequenceComparator extends com.siliconage.util.NullSafeComparator<ResponseType> {
		private static final SequenceComparator ourInstance = new SequenceComparator();
		public static final SequenceComparator getInstance() { return ourInstance; }

		private SequenceComparator() { super(); }

		@Override
		public int compareInternal(ResponseType argFirst, ResponseType argSecond) {
			return argFirst.getSequenceAsObject().compareTo(argSecond.getSequenceAsObject());
		}
	}

}
