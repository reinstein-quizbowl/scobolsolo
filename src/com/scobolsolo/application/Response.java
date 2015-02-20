package com.scobolsolo.application;

import com.opal.*;

/**
 * represents a <code>Response</code> from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from the database table <code>response</code>.  Do not modify this class directly; instead, alter the database table on which it is based and/or the Opal configuration file for the project and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various <code>forXXX</code> methods on the {@link ResponseFactory} factory class.  To create new instances, use the <code>create()</code> method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link TransactionContext}.</p>
 *
 * <p>This interface and the {@link ResponseFactory} class (the ones in the <code>com.scobolsolo.application</code> package) are the only two automatically generated files for the table that are intended to be referenced in user code. Other automatically generated files (namely those in the <code>com.scobolsolo.persistence</code> package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
public interface Response extends IdentityUserFacing {
	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the Id
	 *
	 * <p>The Id field is a direct mapping of the <code>id</code> database column in the table <code>response</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getId() method.</p>
	 *
	 * @return an object value of Id (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Integer getIdAsObject();
	/**
	 * primitive accessor for the Id
	 *
	 * <p>The Id field is a direct mapping of the <code>id</code> database column in the table <code>response</code>.</p>
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
	 * object accessor for the PerformanceId
	 *
	 * <p>The PerformanceId field is a direct mapping of the <code>performance_id</code> database column in the table <code>response</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getPerformanceId() method.</p>
	 *
	 * @return an object value of PerformanceId (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Integer getPerformanceIdAsObject();
	/**
	 * primitive accessor for the PerformanceId
	 *
	 * <p>The PerformanceId field is a direct mapping of the <code>performance_id</code> database column in the table <code>response</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getPerformanceIdAsObject() method.</p>
	 *
	 * @return the primitive value of PerformanceId (of the current {@link TransactionContext})
	 */
	default public int getPerformanceId() {
		java.lang.Integer lclO = getPerformanceIdAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the PerformanceId to the value of <code>argPerformanceId</code>
	 *
	 * @param argPerformanceId the new value of PerformanceId.  May not be <code>null</code>.
	 * <p>The database column <code>performance_id</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argPerformanceId is null
	 */
	@com.opal.annotation.NotNull
	public void setPerformanceId(java.lang.Integer argPerformanceId);

	/**
	 * sets the PerformanceId to the value of <code>argPerformanceId</code>
	 *
	 * @param argPerformanceId the new value of PerformanceId
	 */
	public void setPerformanceId(int argPerformanceId);

	/**
	 * object accessor for the PlacementId
	 *
	 * <p>The PlacementId field is a direct mapping of the <code>placement_id</code> database column in the table <code>response</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getPlacementId() method.</p>
	 *
	 * @return an object value of PlacementId (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Integer getPlacementIdAsObject();
	/**
	 * primitive accessor for the PlacementId
	 *
	 * <p>The PlacementId field is a direct mapping of the <code>placement_id</code> database column in the table <code>response</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getPlacementIdAsObject() method.</p>
	 *
	 * @return the primitive value of PlacementId (of the current {@link TransactionContext})
	 */
	default public int getPlacementId() {
		java.lang.Integer lclO = getPlacementIdAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the PlacementId to the value of <code>argPlacementId</code>
	 *
	 * @param argPlacementId the new value of PlacementId.  May not be <code>null</code>.
	 * <p>The database column <code>placement_id</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argPlacementId is null
	 */
	@com.opal.annotation.NotNull
	public void setPlacementId(java.lang.Integer argPlacementId);

	/**
	 * sets the PlacementId to the value of <code>argPlacementId</code>
	 *
	 * @param argPlacementId the new value of PlacementId
	 */
	public void setPlacementId(int argPlacementId);

	/**
	 * object accessor for the ResponseTypeCode
	 *
	 * <p>The ResponseTypeCode field is a direct mapping of the <code>response_type_code</code> database column in the table <code>response</code>.</p>
	 *
	 * @return an object value of ResponseTypeCode (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.String getResponseTypeCode();
	/**
	 * sets the ResponseTypeCode to the value of <code>argResponseTypeCode</code>
	 *
	 * @param argResponseTypeCode the new value of ResponseTypeCode.  May not be <code>null</code>.
	 * <p>The database column <code>response_type_code</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argResponseTypeCode is null
	 * @throws ArgumentTooLongException if <code>argResponseTypeCode</code> is longer than 32 characters
	 * <p>The database column <code>response_type_code</code> is limited to 32 characters.</p>
	 *
	 */
	@com.opal.annotation.NotNull
	@com.opal.annotation.Length(maximum = 32L)
	public void setResponseTypeCode(java.lang.String argResponseTypeCode);

	/**
	 * object accessor for the ReplacementForPlacementId
	 *
	 * <p>The ReplacementForPlacementId field is a direct mapping of the <code>replacement_for_placement_id</code> database column in the table <code>response</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getReplacementForPlacementId() method.</p>
	 *
	 * @return an object value of ReplacementForPlacementId (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.Integer getReplacementForPlacementIdAsObject();
	/**
	 * object accessor for the ReplacementForPlacementId with substitution for a null value
	 *
	 * <p>The ReplacementForPlacementId field is a direct mapping of the <code>replacement_for_placement_id</code> database column in the table <code>response</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the ReplacementForPlacementId is <code>null</code>.
	 * @return an object value of ReplacementForPlacementId (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getReplacementForPlacementIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getReplacementForPlacementIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the ReplacementForPlacementId
	 *
	 * <p>The ReplacementForPlacementId field is a direct mapping of the <code>replacement_for_placement_id</code> database column in the table <code>response</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getReplacementForPlacementIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a <code>NULL</code> value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of ReplacementForPlacementId (of the current {@link TransactionContext})
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
	 * sets the ReplacementForPlacementId to the value of <code>argReplacementForPlacementId</code>
	 *
	 * @param argReplacementForPlacementId the new value of ReplacementForPlacementId.  May be <code>null</code>.
	 */
	public void setReplacementForPlacementId(java.lang.Integer argReplacementForPlacementId);

	/**
	 * sets the ReplacementForPlacementId to the value of <code>argReplacementForPlacementId</code>
	 *
	 * @param argReplacementForPlacementId the new value of ReplacementForPlacementId
	 */
	public void setReplacementForPlacementId(int argReplacementForPlacementId);

	/**
	 * @return the <code>Performance</code>
	 * The returned <code>Performance</code> is the {@link UserFacing} object corresponding to the row in the <code>performance</code> that is referenced by the foreign key <code>response_performance_id_fkey</code>.
	 *
	 */
	public Performance getPerformance();
	public void setPerformance(Performance argPerformance);

	/**
	 * @return the <code>Placement</code>
	 * The returned <code>Placement</code> is the {@link UserFacing} object corresponding to the row in the <code>placement</code> that is referenced by the foreign key <code>response_placement_id_fkey</code>.
	 *
	 */
	public Placement getPlacement();
	public void setPlacement(Placement argPlacement);

	/**
	 * @return the <code>Placement</code>
	 * The returned <code>Placement</code> is the {@link UserFacing} object corresponding to the row in the <code>placement</code> that is referenced by the foreign key <code>response_replacement_placement_id_fkey</code>.
	 *
	 */
	public Placement getReplacementForPlacement();
	public void setReplacementForPlacement(Placement argPlacement);

	/**
	 * @return the <code>ResponseType</code>
	 * The returned <code>ResponseType</code> is the {@link UserFacing} object corresponding to the row in the <code>response_type</code> that is referenced by the foreign key <code>response_response_type_code_fkey</code>.
	 *
	 */
	public ResponseType getResponseType();
	public void setResponseType(ResponseType argResponseType);

	public Response copy();

	/** This is a Comparator that can be used to compare Response objects based on their Id values. */

	public static class IdComparator extends com.siliconage.util.NullSafeComparator<Response> {
		private static final IdComparator ourInstance = new IdComparator();
		public static final IdComparator getInstance() { return ourInstance; }

		private IdComparator() { super(); }

		@Override
		public int compareInternal(Response argFirst, Response argSecond) {
			return argFirst.getIdAsObject().compareTo(argSecond.getIdAsObject());
		}
	}

}
