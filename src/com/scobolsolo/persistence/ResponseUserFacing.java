package com.scobolsolo.persistence;


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
	@com.opal.annotation.Creatability(creatable = true)
	@com.opal.annotation.Updatability(updatable = true)
public interface ResponseUserFacing extends com.opal.IdentityUserFacing {

	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the {@code Id}
	 *
	 * <p>The {@code Id} field is a direct mapping of the {@code id} field in {@code response}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getId() method.</p>
	 *
	 * @return an object value of {@code Id} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	public java.lang.Integer getIdAsObject();

	/**
	 * primitive accessor for the {@code Id}
	 *
	 * <p>The {@code Id} field is a direct mapping of the {@code id} database column in the table {@code response}.</p>
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
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
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
	 * @return an object value of {@code PerformanceId} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	public java.lang.Integer getPerformanceIdAsObject();

	/**
	 * primitive accessor for the {@code PerformanceId}
	 *
	 * <p>The {@code PerformanceId} field is a direct mapping of the {@code performance_id} database column in the table {@code response}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getPerformanceIdAsObject() method.</p>
	 *
	 * @return the primitive value of {@code PerformanceId} (of the current {@link com.opal.TransactionContext})
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
	 * @throws com.opal.IllegalNullArgumentException if argPerformanceId is null
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	public com.scobolsolo.application.Response setPerformanceId(java.lang.Integer argPerformanceId);

	/**
	 * sets the {@code PerformanceId} to the value of {@code argPerformanceId}
	 *
	 * @param argPerformanceId the new value of {@code PerformanceId}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.Response setPerformanceId(int argPerformanceId);

	/**
	 * object accessor for the {@code ResponseTypeCode}
	 *
	 * <p>The {@code ResponseTypeCode} field is a direct mapping of the {@code response_type_code} field in {@code response}.</p>
	 *
	 * @return an object value of {@code ResponseTypeCode} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	public java.lang.String getResponseTypeCode();

	/**
	 * sets the {@code ResponseTypeCode} to the value of {@code argResponseTypeCode}
	 *
	 * @param argResponseTypeCode the new value of {@code ResponseTypeCode}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code response_type_code} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argResponseTypeCode is null
	 * @throws com.opal.ArgumentTooLongException if {@code argResponseTypeCode} is longer than 32 characters
	 * <p>The database column {@code response_type_code} is limited to 32 characters.</p>
	 *
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	public com.scobolsolo.application.Response setResponseTypeCode(java.lang.String argResponseTypeCode);

	/**
	 * object accessor for the {@code BasePlacementId}
	 *
	 * <p>The {@code BasePlacementId} field is a direct mapping of the {@code base_placement_id} field in {@code response}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getBasePlacementId() method.</p>
	 *
	 * @return an object value of {@code BasePlacementId} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	public java.lang.Integer getBasePlacementIdAsObject();

	/**
	 * primitive accessor for the {@code BasePlacementId}
	 *
	 * <p>The {@code BasePlacementId} field is a direct mapping of the {@code base_placement_id} database column in the table {@code response}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getBasePlacementIdAsObject() method.</p>
	 *
	 * @return the primitive value of {@code BasePlacementId} (of the current {@link com.opal.TransactionContext})
	 */
	default public int getBasePlacementId() {
		java.lang.Integer lclO = getBasePlacementIdAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the {@code BasePlacementId} to the value of {@code argBasePlacementId}
	 *
	 * @param argBasePlacementId the new value of {@code BasePlacementId}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code base_placement_id} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argBasePlacementId is null
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	public com.scobolsolo.application.Response setBasePlacementId(java.lang.Integer argBasePlacementId);

	/**
	 * sets the {@code BasePlacementId} to the value of {@code argBasePlacementId}
	 *
	 * @param argBasePlacementId the new value of {@code BasePlacementId}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.Response setBasePlacementId(int argBasePlacementId);

	/**
	 * object accessor for the {@code ReplacementPlacementId}
	 *
	 * <p>The {@code ReplacementPlacementId} field is a direct mapping of the {@code replacement_placement_id} field in {@code response}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getReplacementPlacementId() method.</p>
	 *
	 * @return an object value of {@code ReplacementPlacementId} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	public java.lang.Integer getReplacementPlacementIdAsObject();

	/**
	 * object accessor for the {@code ReplacementPlacementId} with substitution for a null value
	 *
	 * <p>The {@code ReplacementPlacementId} field is a direct mapping of the {@code replacement_placement_id} database column in the table {@code response}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code ReplacementPlacementId} is {@code null}.
	 * @return an object value of {@code ReplacementPlacementId} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getReplacementPlacementIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getReplacementPlacementIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code ReplacementPlacementId}
	 *
	 * <p>The {@code ReplacementPlacementId} field is a direct mapping of the {@code replacement_placement_id} database column in the table {@code response}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getReplacementPlacementIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code ReplacementPlacementId} (of the current {@link com.opal.TransactionContext})
	 * @throws com.opal.NullValueException when the internal value is null
	 */
	default public int getReplacementPlacementId() throws com.opal.NullValueException {
		java.lang.Integer lclO = getReplacementPlacementIdAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getReplacementPlacementId(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getReplacementPlacementIdAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getReplacementPlacementId(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getReplacementPlacementIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * sets the {@code ReplacementPlacementId} to the value of {@code argReplacementPlacementId}
	 *
	 * @param argReplacementPlacementId the new value of {@code ReplacementPlacementId}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	public com.scobolsolo.application.Response setReplacementPlacementId(java.lang.Integer argReplacementPlacementId);

	/**
	 * sets the {@code ReplacementPlacementId} to the value of {@code argReplacementPlacementId}
	 *
	 * @param argReplacementPlacementId the new value of {@code ReplacementPlacementId}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.Response setReplacementPlacementId(int argReplacementPlacementId);

	/**
	 * object accessor for the {@code DiffId}
	 *
	 * <p>The {@code DiffId} field is a direct mapping of the {@code diff_id} field in {@code response}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getDiffId() method.</p>
	 *
	 * @return an object value of {@code DiffId} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	public java.lang.Integer getDiffIdAsObject();

	/**
	 * object accessor for the {@code DiffId} with substitution for a null value
	 *
	 * <p>The {@code DiffId} field is a direct mapping of the {@code diff_id} database column in the table {@code response}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code DiffId} is {@code null}.
	 * @return an object value of {@code DiffId} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getDiffIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getDiffIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code DiffId}
	 *
	 * <p>The {@code DiffId} field is a direct mapping of the {@code diff_id} database column in the table {@code response}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getDiffIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code DiffId} (of the current {@link com.opal.TransactionContext})
	 * @throws com.opal.NullValueException when the internal value is null
	 */
	default public int getDiffId() throws com.opal.NullValueException {
		java.lang.Integer lclO = getDiffIdAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getDiffId(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getDiffIdAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getDiffId(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getDiffIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * sets the {@code DiffId} to the value of {@code argDiffId}
	 *
	 * @param argDiffId the new value of {@code DiffId}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	public com.scobolsolo.application.Response setDiffId(java.lang.Integer argDiffId);

	/**
	 * sets the {@code DiffId} to the value of {@code argDiffId}
	 *
	 * @param argDiffId the new value of {@code DiffId}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.Response setDiffId(int argDiffId);

	/**
	 * object accessor for the {@code Location}
	 *
	 * <p>The {@code Location} field is a direct mapping of the {@code location} field in {@code response}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getLocation() method.</p>
	 *
	 * @return an object value of {@code Location} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	public java.lang.Integer getLocationAsObject();

	/**
	 * object accessor for the {@code Location} with substitution for a null value
	 *
	 * <p>The {@code Location} field is a direct mapping of the {@code location} database column in the table {@code response}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code Location} is {@code null}.
	 * @return an object value of {@code Location} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getLocationAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getLocationAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code Location}
	 *
	 * <p>The {@code Location} field is a direct mapping of the {@code location} database column in the table {@code response}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getLocationAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code Location} (of the current {@link com.opal.TransactionContext})
	 * @throws com.opal.NullValueException when the internal value is null
	 */
	default public int getLocation() throws com.opal.NullValueException {
		java.lang.Integer lclO = getLocationAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getLocation(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getLocationAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getLocation(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getLocationAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * sets the {@code Location} to the value of {@code argLocation}
	 *
	 * @param argLocation the new value of {@code Location}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	public com.scobolsolo.application.Response setLocation(java.lang.Integer argLocation);

	/**
	 * sets the {@code Location} to the value of {@code argLocation}
	 *
	 * @param argLocation the new value of {@code Location}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.Response setLocation(int argLocation);

	/**
	 * @return the {@code com.scobolsolo.application.Placement}
	 * The returned {@code com.scobolsolo.application.Placement} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code placement} that is referenced by {@code response_base_placement_id_fkey}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = false)
	public com.scobolsolo.application.Placement getBasePlacement();
	public com.scobolsolo.application.Response setBasePlacement(com.scobolsolo.application.Placement argBasePlacement);

	/**
	 * @return the {@code com.scobolsolo.application.Diff}
	 * The returned {@code com.scobolsolo.application.Diff} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code diff} that is referenced by {@code response_diff_id_fkey}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public com.scobolsolo.application.Diff getDiff();
	public com.scobolsolo.application.Response setDiff(com.scobolsolo.application.Diff argDiff);

	/**
	 * @return the {@code com.scobolsolo.application.Performance}
	 * The returned {@code com.scobolsolo.application.Performance} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code performance} that is referenced by {@code response_performance_id_fkey}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = false)
	public com.scobolsolo.application.Performance getPerformance();
	public com.scobolsolo.application.Response setPerformance(com.scobolsolo.application.Performance argPerformance);

	/**
	 * @return the {@code com.scobolsolo.application.Placement}
	 * The returned {@code com.scobolsolo.application.Placement} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code placement} that is referenced by {@code response_replacement_placement_id_fkey1}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public com.scobolsolo.application.Placement getReplacementPlacement();
	public com.scobolsolo.application.Response setReplacementPlacement(com.scobolsolo.application.Placement argReplacementPlacement);

	/**
	 * @return the {@code com.scobolsolo.application.ResponseType}
	 * The returned {@code com.scobolsolo.application.ResponseType} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code response_type} that is referenced by {@code response_response_type_code_fkey}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = false)
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
