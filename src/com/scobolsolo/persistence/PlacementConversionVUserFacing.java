package com.scobolsolo.persistence;

import com.opal.*;

/**
 * represents a {@code PlacementConversionV} from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from {@code placement_conversion_v}.  Do not modify this class directly; instead, alter the permanent storage on which it is based, the Opal configuration file for the project, and/or the {@link com.scobolsolo.application.PlacementConversionV}, and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various {@code forXXX} methods on the {@link com.scobolsolo.application.PlacementConversionVFactory} factory class.  To create new instances, use the {@code create()} method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link com.opal.TransactionContext}.</p>
 *
 * <p>This interface is not meant to be referenced in user code.  Only the {@link com.scobolsolo.application.PlacementConversionV} and the {@link com.scobolsolo.application.PlacementConversionVFactory} class should be referenced directly.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
public interface PlacementConversionVUserFacing extends UserFacing {
	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the {@code TournamentCode}
	 *
	 * <p>The {@code TournamentCode} field is a direct mapping of the {@code tournament_code} field in {@code placement_conversion_v}.</p>
	 *
	 * @return an object value of {@code TournamentCode} (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.String getTournamentCode();

	/**
	 * object accessor for the {@code PlacementId}
	 *
	 * <p>The {@code PlacementId} field is a direct mapping of the {@code placement_id} field in {@code placement_conversion_v}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getPlacementId() method.</p>
	 *
	 * @return an object value of {@code PlacementId} (of the current {@link TransactionContext})  May be <code>null</code>.
	 */
	public java.lang.Integer getPlacementIdAsObject();

	/**
	 * object accessor for the {@code PlacementId} with substitution for a null value
	 *
	 * <p>The {@code PlacementId} field is a direct mapping of the {@code placement_id} database column in the table {@code placement_conversion_v}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code PlacementId} is {@code null}.
	 * @return an object value of {@code PlacementId} (of the current {@link TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getPlacementIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getPlacementIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code PlacementId}
	 *
	 * <p>The {@code PlacementId} field is a direct mapping of the {@code placement_id} database column in the table {@code placement_conversion_v}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getPlacementIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code PlacementId} (of the current {@link TransactionContext})
	 * @throws NullValueException when the internal value is null
	 */
	default public int getPlacementId() throws com.opal.NullValueException {
		java.lang.Integer lclO = getPlacementIdAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getPlacementId(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getPlacementIdAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getPlacementId(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getPlacementIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * object accessor for the {@code QuestionId}
	 *
	 * <p>The {@code QuestionId} field is a direct mapping of the {@code question_id} field in {@code placement_conversion_v}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getQuestionId() method.</p>
	 *
	 * @return an object value of {@code QuestionId} (of the current {@link TransactionContext})  May be <code>null</code>.
	 */
	public java.lang.Integer getQuestionIdAsObject();

	/**
	 * object accessor for the {@code QuestionId} with substitution for a null value
	 *
	 * <p>The {@code QuestionId} field is a direct mapping of the {@code question_id} database column in the table {@code placement_conversion_v}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code QuestionId} is {@code null}.
	 * @return an object value of {@code QuestionId} (of the current {@link TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getQuestionIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getQuestionIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code QuestionId}
	 *
	 * <p>The {@code QuestionId} field is a direct mapping of the {@code question_id} database column in the table {@code placement_conversion_v}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getQuestionIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code QuestionId} (of the current {@link TransactionContext})
	 * @throws NullValueException when the internal value is null
	 */
	default public int getQuestionId() throws com.opal.NullValueException {
		java.lang.Integer lclO = getQuestionIdAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getQuestionId(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getQuestionIdAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getQuestionId(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getQuestionIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * object accessor for the {@code ResponseTypeCode}
	 *
	 * <p>The {@code ResponseTypeCode} field is a direct mapping of the {@code response_type_code} field in {@code placement_conversion_v}.</p>
	 *
	 * @return an object value of {@code ResponseTypeCode} (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.String getResponseTypeCode();

	/**
	 * object accessor for the {@code ResponseTypeCount}
	 *
	 * <p>The {@code ResponseTypeCount} field is a direct mapping of the {@code response_type_count} field in {@code placement_conversion_v}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getResponseTypeCount() method.</p>
	 *
	 * @return an object value of {@code ResponseTypeCount} (of the current {@link TransactionContext})  May be <code>null</code>.
	 */
	public java.lang.Integer getResponseTypeCountAsObject();

	/**
	 * object accessor for the {@code ResponseTypeCount} with substitution for a null value
	 *
	 * <p>The {@code ResponseTypeCount} field is a direct mapping of the {@code response_type_count} database column in the table {@code placement_conversion_v}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code ResponseTypeCount} is {@code null}.
	 * @return an object value of {@code ResponseTypeCount} (of the current {@link TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getResponseTypeCountAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getResponseTypeCountAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code ResponseTypeCount}
	 *
	 * <p>The {@code ResponseTypeCount} field is a direct mapping of the {@code response_type_count} database column in the table {@code placement_conversion_v}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getResponseTypeCountAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code ResponseTypeCount} (of the current {@link TransactionContext})
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
	 * @return the {@code com.scobolsolo.application.ResponseType}
	 * The returned {@code com.scobolsolo.application.ResponseType} is the {@link UserFacing} object corresponding to the entry in {@code response_type} that is referenced by {@code UNNAMED_INFERRED_KEY}.
	 *
	 */
	public com.scobolsolo.application.ResponseType getResponseType();
	/**
	 * @return the {@code com.scobolsolo.application.Tournament}
	 * The returned {@code com.scobolsolo.application.Tournament} is the {@link UserFacing} object corresponding to the entry in {@code tournament} that is referenced by {@code UNNAMED_INFERRED_KEY}.
	 *
	 */
	public com.scobolsolo.application.Tournament getTournament();
	/**
	 * @return the {@code com.scobolsolo.application.Question}
	 * The returned {@code com.scobolsolo.application.Question} is the {@link UserFacing} object corresponding to the entry in {@code question} that is referenced by {@code UNNAMED_INFERRED_KEY}.
	 *
	 */
	public com.scobolsolo.application.Question getQuestion();
	/**
	 * @return the {@code com.scobolsolo.application.Placement}
	 * The returned {@code com.scobolsolo.application.Placement} is the {@link UserFacing} object corresponding to the entry in {@code placement} that is referenced by {@code UNNAMED_INFERRED_KEY}.
	 *
	 */
	public com.scobolsolo.application.Placement getPlacement();
	public static class PlacementComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.PlacementConversionV> {
		private static final PlacementComparator ourInstance = new PlacementComparator();
		public static final PlacementComparator getInstance() { return ourInstance; }

		private PlacementComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.PlacementConversionV argFirst, com.scobolsolo.application.PlacementConversionV argSecond) {
			return com.scobolsolo.application.Placement.StandardComparator.getInstance().compare(argFirst.getPlacement(),  argSecond.getPlacement());
		}
	}

}