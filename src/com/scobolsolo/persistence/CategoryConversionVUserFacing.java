package com.scobolsolo.persistence;


/**
 * represents a {@code CategoryConversionV} from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from {@code category_conversion_v}.  Do not modify this class directly; instead, alter the permanent storage on which it is based, the Opal configuration file for the project, and/or the {@link com.scobolsolo.application.CategoryConversionV}, and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various {@code forXXX} methods on the {@link com.scobolsolo.application.CategoryConversionVFactory} factory class.  To create new instances, use the {@code create()} method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link com.opal.TransactionContext}.</p>
 *
 * <p>This interface is not meant to be referenced in user code.  Only the {@link com.scobolsolo.application.CategoryConversionV} and the {@link com.scobolsolo.application.CategoryConversionVFactory} class should be referenced directly.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
public interface CategoryConversionVUserFacing extends com.opal.UserFacing {
	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the {@code TournamentCode}
	 *
	 * <p>The {@code TournamentCode} field is a direct mapping of the {@code tournament_code} field in {@code category_conversion_v}.</p>
	 *
	 * @return an object value of {@code TournamentCode} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.String getTournamentCode();

	/**
	 * object accessor for the {@code CategoryCode}
	 *
	 * <p>The {@code CategoryCode} field is a direct mapping of the {@code category_code} field in {@code category_conversion_v}.</p>
	 *
	 * @return an object value of {@code CategoryCode} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.String getCategoryCode();

	/**
	 * object accessor for the {@code ResponseTypeCode}
	 *
	 * <p>The {@code ResponseTypeCode} field is a direct mapping of the {@code response_type_code} field in {@code category_conversion_v}.</p>
	 *
	 * @return an object value of {@code ResponseTypeCode} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.String getResponseTypeCode();

	/**
	 * object accessor for the {@code ResponseTypeCount}
	 *
	 * <p>The {@code ResponseTypeCount} field is a direct mapping of the {@code response_type_count} field in {@code category_conversion_v}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getResponseTypeCount() method.</p>
	 *
	 * @return an object value of {@code ResponseTypeCount} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	public java.lang.Integer getResponseTypeCountAsObject();

	/**
	 * object accessor for the {@code ResponseTypeCount} with substitution for a null value
	 *
	 * <p>The {@code ResponseTypeCount} field is a direct mapping of the {@code response_type_count} database column in the table {@code category_conversion_v}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code ResponseTypeCount} is {@code null}.
	 * @return an object value of {@code ResponseTypeCount} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getResponseTypeCountAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getResponseTypeCountAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code ResponseTypeCount}
	 *
	 * <p>The {@code ResponseTypeCount} field is a direct mapping of the {@code response_type_count} database column in the table {@code category_conversion_v}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getResponseTypeCountAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code ResponseTypeCount} (of the current {@link com.opal.TransactionContext})
	 * @throws com.opal.NullValueException when the internal value is null
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
	 * @return the {@code com.scobolsolo.application.ResponseType}
	 * The returned {@code com.scobolsolo.application.ResponseType} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code response_type} that is referenced by {@code UNNAMED_INFERRED_KEY}.
	 *
	 */
	public com.scobolsolo.application.ResponseType getResponseType();
	/**
	 * @return the {@code com.scobolsolo.application.Tournament}
	 * The returned {@code com.scobolsolo.application.Tournament} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code tournament} that is referenced by {@code UNNAMED_INFERRED_KEY}.
	 *
	 */
	public com.scobolsolo.application.Tournament getTournament();
	/**
	 * @return the {@code com.scobolsolo.application.Category}
	 * The returned {@code com.scobolsolo.application.Category} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code category} that is referenced by {@code UNNAMED_INFERRED_KEY}.
	 *
	 */
	public com.scobolsolo.application.Category getCategory();
	public static class CategorySequenceComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.CategoryConversionV> {
		private static final CategorySequenceComparator ourInstance = new CategorySequenceComparator();
		public static final CategorySequenceComparator getInstance() { return ourInstance; }

		private CategorySequenceComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.CategoryConversionV argFirst, com.scobolsolo.application.CategoryConversionV argSecond) {
			return com.scobolsolo.application.Category.SequenceComparator.getInstance().compare(argFirst.getCategory(),  argSecond.getCategory());
		}
	}

}
