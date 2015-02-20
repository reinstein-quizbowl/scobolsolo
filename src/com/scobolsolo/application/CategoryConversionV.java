package com.scobolsolo.application;

import com.opal.*;

/**
 * represents a <code>CategoryConversionV</code> from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from the database table <code>category_conversion_v</code>.  Do not modify this class directly; instead, alter the database table on which it is based and/or the Opal configuration file for the project and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various <code>forXXX</code> methods on the {@link CategoryConversionVFactory} factory class.  To create new instances, use the <code>create()</code> method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link TransactionContext}.</p>
 *
 * <p>This interface and the {@link CategoryConversionVFactory} class (the ones in the <code>com.scobolsolo.application</code> package) are the only two automatically generated files for the table that are intended to be referenced in user code. Other automatically generated files (namely those in the <code>com.scobolsolo.persistence</code> package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
public interface CategoryConversionV extends UserFacing {
	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the TournamentCode
	 *
	 * <p>The TournamentCode field is a direct mapping of the <code>tournament_code</code> database column in the table <code>category_conversion_v</code>.</p>
	 *
	 * @return an object value of TournamentCode (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.String getTournamentCode();
	/**
	 * object accessor for the CategoryCode
	 *
	 * <p>The CategoryCode field is a direct mapping of the <code>category_code</code> database column in the table <code>category_conversion_v</code>.</p>
	 *
	 * @return an object value of CategoryCode (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.String getCategoryCode();
	/**
	 * object accessor for the ResponseTypeCode
	 *
	 * <p>The ResponseTypeCode field is a direct mapping of the <code>response_type_code</code> database column in the table <code>category_conversion_v</code>.</p>
	 *
	 * @return an object value of ResponseTypeCode (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.String getResponseTypeCode();
	/**
	 * object accessor for the ResponseTypeCount
	 *
	 * <p>The ResponseTypeCount field is a direct mapping of the <code>response_type_count</code> database column in the table <code>category_conversion_v</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getResponseTypeCount() method.</p>
	 *
	 * @return an object value of ResponseTypeCount (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.Integer getResponseTypeCountAsObject();
	/**
	 * object accessor for the ResponseTypeCount with substitution for a null value
	 *
	 * <p>The ResponseTypeCount field is a direct mapping of the <code>response_type_count</code> database column in the table <code>category_conversion_v</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the ResponseTypeCount is <code>null</code>.
	 * @return an object value of ResponseTypeCount (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getResponseTypeCountAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getResponseTypeCountAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the ResponseTypeCount
	 *
	 * <p>The ResponseTypeCount field is a direct mapping of the <code>response_type_count</code> database column in the table <code>category_conversion_v</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getResponseTypeCountAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a <code>NULL</code> value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of ResponseTypeCount (of the current {@link TransactionContext})
	 * @throws NullValueException when the internal value is null
	 */
	default public int getResponseTypeCount() throws com.opal.NullValueException {
		java.lang.Integer lclO = getResponseTypeCountAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getResponseTypeCount(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getResponseTypeCountAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getResponseTypeCount(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getResponseTypeCountAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * @return the <code>ResponseType</code>
	 * The returned <code>ResponseType</code> is the {@link UserFacing} object corresponding to the row in the <code>response_type</code> that is referenced by the foreign key <code>UNNAMED_INFERRED_KEY</code>.
	 *
	 */
	public ResponseType getResponseType();
	/**
	 * @return the <code>Tournament</code>
	 * The returned <code>Tournament</code> is the {@link UserFacing} object corresponding to the row in the <code>tournament</code> that is referenced by the foreign key <code>UNNAMED_INFERRED_KEY</code>.
	 *
	 */
	public Tournament getTournament();
	/**
	 * @return the <code>Category</code>
	 * The returned <code>Category</code> is the {@link UserFacing} object corresponding to the row in the <code>category</code> that is referenced by the foreign key <code>UNNAMED_INFERRED_KEY</code>.
	 *
	 */
	public Category getCategory();
	public static class CategorySequenceComparator extends com.siliconage.util.NullSafeComparator<CategoryConversionV> {
		private static final CategorySequenceComparator ourInstance = new CategorySequenceComparator();
		public static final CategorySequenceComparator getInstance() { return ourInstance; }

		private CategorySequenceComparator() { super(); }

		@Override
		public int compareInternal(CategoryConversionV argFirst, CategoryConversionV argSecond) {
			return com.scobolsolo.application.Category.SequenceComparator.getInstance().compare(argFirst.getCategory(), argSecond.getCategory());
		}
	}

}
