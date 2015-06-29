package com.scobolsolo.persistence;

import com.opal.*;

/**
 * represents a {@code Response} from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from {@code response}.  Do not modify this class directly; instead, alter the permanent storage on which it is based, the Opal configuration file for the project, and/or the {@link com.scobolsolo.application.Response}, and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various {@code forXXX} methods on the {@link com.scobolsolo.application.ResponseFactory} factory class.  To create new instances, use the {@code create()} method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link com.opal.TransactionContext}.</p>
 *
 * <p>This interface is not meant to be referenced in user code.  Only the {@link com.scobolsolo.application.Response} and the {@link com.scobolsolo.application.ResponseFactory} class should be referenced directly.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
public interface ResponseUserFacing extends IdentityUserFacing {
	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the {@code Id}
	 *
	 * <p>The {@code Id} field is a direct mapping of the {@code id} field in {@code response}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getId() method.</p>
	 *
	 * @return an object value of {@code Id} (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.Integer getIdAsObject();

	/**
	 * primitive accessor for the {@code Id}
	 *
	 * <p>The {@code Id} field is a direct mapping of the {@code id} database column in the table {@code response}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getIdAsObject() method.</p>
	 *
	 * @return the primitive value of {@code Id} (of the current {@link TransactionContext})
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
	 * @throws IllegalNullArgumentException if argId is null
	 */
	@com.opal.annotation.NotNull
	public com.scobolsolo.application.Response setId(java.lang.Integer argId);

	/**
	 * sets the {@code Id} to the value of {@code argId}
	 *
	 * @param argId the new value of {@code Id}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.Response setId(int argId);

	/**
	 * object accessor for the {@code PerformanceId}
	 *
	 * <p>The {@code PerformanceId} field is a direct mapping of the {@code performance_id} field in {@code response}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getPerformanceId() method.</p>
	 *
	 * @return an object value of {@code PerformanceId} (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.Integer getPerformanceIdAsObject();

	/**
	 * primitive accessor for the {@code PerformanceId}
	 *
	 * <p>The {@code PerformanceId} field is a direct mapping of the {@code performance_id} database column in the table {@code response}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getPerformanceIdAsObject() method.</p>
	 *
	 * @return the primitive value of {@code PerformanceId} (of the current {@link TransactionContext})
	 */
	default public int getPerformanceId() {
		java.lang.Integer lclO = getPerformanceIdAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the {@code PerformanceId} to the value of {@code argPerformanceId}
	 *
	 * @param argPerformanceId the new value of {@code PerformanceId}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code performance_id} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argPerformanceId is null
	 */
	@com.opal.annotation.NotNull
	public com.scobolsolo.application.Response setPerformanceId(java.lang.Integer argPerformanceId);

	/**
	 * sets the {@code PerformanceId} to the value of {@code argPerformanceId}
	 *
	 * @param argPerformanceId the new value of {@code PerformanceId}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.Response setPerformanceId(int argPerformanceId);

	/**
	 * object accessor for the {@code PlacementId}
	 *
	 * <p>The {@code PlacementId} field is a direct mapping of the {@code placement_id} field in {@code response}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getPlacementId() method.</p>
	 *
	 * @return an object value of {@code PlacementId} (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.Integer getPlacementIdAsObject();

	/**
	 * primitive accessor for the {@code PlacementId}
	 *
	 * <p>The {@code PlacementId} field is a direct mapping of the {@code placement_id} database column in the table {@code response}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getPlacementIdAsObject() method.</p>
	 *
	 * @return the primitive value of {@code PlacementId} (of the current {@link TransactionContext})
	 */
	default public int getPlacementId() {
		java.lang.Integer lclO = getPlacementIdAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the {@code PlacementId} to the value of {@code argPlacementId}
	 *
	 * @param argPlacementId the new value of {@code PlacementId}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code placement_id} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argPlacementId is null
	 */
	@com.opal.annotation.NotNull
	public com.scobolsolo.application.Response setPlacementId(java.lang.Integer argPlacementId);

	/**
	 * sets the {@code PlacementId} to the value of {@code argPlacementId}
	 *
	 * @param argPlacementId the new value of {@code PlacementId}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.Response setPlacementId(int argPlacementId);

	/**
	 * object accessor for the {@code ResponseTypeCode}
	 *
	 * <p>The {@code ResponseTypeCode} field is a direct mapping of the {@code response_type_code} field in {@code response}.</p>
	 *
	 * @return an object value of {@code ResponseTypeCode} (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.String getResponseTypeCode();

	/**
	 * sets the {@code ResponseTypeCode} to the value of {@code argResponseTypeCode}
	 *
	 * @param argResponseTypeCode the new value of {@code ResponseTypeCode}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code response_type_code} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argResponseTypeCode is null
	 * @throws ArgumentTooLongException if {@code argResponseTypeCode} is longer than 32 characters
	 * <p>The database column {@code response_type_code} is limited to 32 characters.</p>
	 *
	 */
	@com.opal.annotation.NotNull
	@com.opal.annotation.Length(maximum = 32L)
	public com.scobolsolo.application.Response setResponseTypeCode(java.lang.String argResponseTypeCode);

	/**
	 * object accessor for the {@code ReplacementForPlacementId}
	 *
	 * <p>The {@code ReplacementForPlacementId} field is a direct mapping of the {@code replacement_for_placement_id} field in {@code response}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getReplacementForPlacementId() method.</p>
	 *
	 * @return an object value of {@code ReplacementForPlacementId} (of the current {@link TransactionContext})  May be <code>null</code>.
	 */
	public java.lang.Integer getReplacementForPlacementIdAsObject();

	/**
	 * object accessor for the {@code ReplacementForPlacementId} with substitution for a null value
	 *
	 * <p>The {@code ReplacementForPlacementId} field is a direct mapping of the {@code replacement_for_placement_id} database column in the table {@code response}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code ReplacementForPlacementId} is {@code null}.
	 * @return an object value of {@code ReplacementForPlacementId} (of the current {@link TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getReplacementForPlacementIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getReplacementForPlacementIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code ReplacementForPlacementId}
	 *
	 * <p>The {@code ReplacementForPlacementId} field is a direct mapping of the {@code replacement_for_placement_id} database column in the table {@code response}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getReplacementForPlacementIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code ReplacementForPlacementId} (of the current {@link TransactionContext})
	 * @throws NullValueException when the internal value is null
	 */
	default public int getReplacementForPlacementId() throws com.opal.NullValueException {
		java.lang.Integer lclO = getReplacementForPlacementIdAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getReplacementForPlacementId(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getReplacementForPlacementIdAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getReplacementForPlacementId(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getReplacementForPlacementIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * sets the {@code ReplacementForPlacementId} to the value of {@code argReplacementForPlacementId}
	 *
	 * @param argReplacementForPlacementId the new value of {@code ReplacementForPlacementId}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 */
	public com.scobolsolo.application.Response setReplacementForPlacementId(java.lang.Integer argReplacementForPlacementId);

	/**
	 * sets the {@code ReplacementForPlacementId} to the value of {@code argReplacementForPlacementId}
	 *
	 * @param argReplacementForPlacementId the new value of {@code ReplacementForPlacementId}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.Response setReplacementForPlacementId(int argReplacementForPlacementId);

	/**
	 * @return the {@code com.scobolsolo.application.Performance}
	 * The returned {@code com.scobolsolo.application.Performance} is the {@link UserFacing} object corresponding to the entry in {@code performance} that is referenced by {@code response_performance_id_fkey}.
	 *
	 */
	public com.scobolsolo.application.Performance getPerformance();
	public com.scobolsolo.application.Response setPerformance(com.scobolsolo.application.Performance argPerformance);

	/**
	 * @return the {@code com.scobolsolo.application.Placement}
	 * The returned {@code com.scobolsolo.application.Placement} is the {@link UserFacing} object corresponding to the entry in {@code placement} that is referenced by {@code response_placement_id_fkey}.
	 *
	 */
	public com.scobolsolo.application.Placement getPlacement();
	public com.scobolsolo.application.Response setPlacement(com.scobolsolo.application.Placement argPlacement);

	/**
	 * @return the {@code com.scobolsolo.application.Placement}
	 * The returned {@code com.scobolsolo.application.Placement} is the {@link UserFacing} object corresponding to the entry in {@code placement} that is referenced by {@code response_replacement_placement_id_fkey}.
	 *
	 */
	public com.scobolsolo.application.Placement getReplacementForPlacement();
	public com.scobolsolo.application.Response setReplacementForPlacement(com.scobolsolo.application.Placement argReplacementForPlacement);

	/**
	 * @return the {@code com.scobolsolo.application.ResponseType}
	 * The returned {@code com.scobolsolo.application.ResponseType} is the {@link UserFacing} object corresponding to the entry in {@code response_type} that is referenced by {@code response_response_type_code_fkey}.
	 *
	 */
	public com.scobolsolo.application.ResponseType getResponseType();
	public com.scobolsolo.application.Response setResponseType(com.scobolsolo.application.ResponseType argResponseType);

	public com.scobolsolo.application.Response copy();

	/** This is a Comparator that can be used to compare Response objects based on their {@code Id} values. */

	public static class IdComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Response> {
		private static final IdComparator ourInstance = new IdComparator();
		public static final IdComparator getInstance() { return ourInstance; }

		private IdComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Response argFirst, com.scobolsolo.application.Response argSecond) {
			return argFirst.getIdAsObject().compareTo(argSecond.getIdAsObject());
		}
	}

}