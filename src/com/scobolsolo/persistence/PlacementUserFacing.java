package com.scobolsolo.persistence;


/**
 * represents a {@code Placement} from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from {@code placement}.  Do not modify this class directly; instead, alter the permanent storage on which it is based, the Opal configuration file for the project, and/or the {@link com.scobolsolo.application.Placement}, and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various {@code forXXX} methods on the {@link com.scobolsolo.application.PlacementFactory} factory class.  To create new instances, use the {@code create()} method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link com.opal.TransactionContext}.</p>
 *
 * <p>This interface is not meant to be referenced in user code.  Only the {@link com.scobolsolo.application.Placement} and the {@link com.scobolsolo.application.PlacementFactory} class should be referenced directly.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
	@com.opal.annotation.Creatability(creatable = true)
	@com.opal.annotation.Updatability(updatable = true)
public interface PlacementUserFacing extends com.opal.IdentityUserFacing {

	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the {@code Id}
	 *
	 * <p>The {@code Id} field is a direct mapping of the {@code id} field in {@code placement}.</p>
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
	 * <p>The {@code Id} field is a direct mapping of the {@code id} database column in the table {@code placement}.</p>
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
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Placement setId(java.lang.Integer argId);

	/**
	 * sets the {@code Id} to the value of {@code argId}
	 *
	 * @param argId the new value of {@code Id}
	 * @return itself, so that mutators may be chained fluently
	 */
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Placement setId(int argId);

	/**
	 * object accessor for the {@code QuestionId}
	 *
	 * <p>The {@code QuestionId} field is a direct mapping of the {@code question_id} field in {@code placement}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getQuestionId() method.</p>
	 *
	 * @return an object value of {@code QuestionId} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	public java.lang.Integer getQuestionIdAsObject();

	/**
	 * object accessor for the {@code QuestionId} with substitution for a null value
	 *
	 * <p>The {@code QuestionId} field is a direct mapping of the {@code question_id} database column in the table {@code placement}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code QuestionId} is {@code null}.
	 * @return an object value of {@code QuestionId} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getQuestionIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getQuestionIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code QuestionId}
	 *
	 * <p>The {@code QuestionId} field is a direct mapping of the {@code question_id} database column in the table {@code placement}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getQuestionIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code QuestionId} (of the current {@link com.opal.TransactionContext})
	 * @throws com.opal.NullValueException when the internal value is null
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
	 * sets the {@code QuestionId} to the value of {@code argQuestionId}
	 *
	 * @param argQuestionId the new value of {@code QuestionId}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Placement setQuestionId(java.lang.Integer argQuestionId);

	/**
	 * sets the {@code QuestionId} to the value of {@code argQuestionId}
	 *
	 * @param argQuestionId the new value of {@code QuestionId}
	 * @return itself, so that mutators may be chained fluently
	 */
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Placement setQuestionId(int argQuestionId);

	/**
	 * object accessor for the {@code PacketId}
	 *
	 * <p>The {@code PacketId} field is a direct mapping of the {@code packet_id} field in {@code placement}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getPacketId() method.</p>
	 *
	 * @return an object value of {@code PacketId} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	public java.lang.Integer getPacketIdAsObject();

	/**
	 * primitive accessor for the {@code PacketId}
	 *
	 * <p>The {@code PacketId} field is a direct mapping of the {@code packet_id} database column in the table {@code placement}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getPacketIdAsObject() method.</p>
	 *
	 * @return the primitive value of {@code PacketId} (of the current {@link com.opal.TransactionContext})
	 */
	default public int getPacketId() {
		java.lang.Integer lclO = getPacketIdAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the {@code PacketId} to the value of {@code argPacketId}
	 *
	 * @param argPacketId the new value of {@code PacketId}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code packet_id} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argPacketId is null
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Placement setPacketId(java.lang.Integer argPacketId);

	/**
	 * sets the {@code PacketId} to the value of {@code argPacketId}
	 *
	 * @param argPacketId the new value of {@code PacketId}
	 * @return itself, so that mutators may be chained fluently
	 */
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Placement setPacketId(int argPacketId);

	/**
	 * object accessor for the {@code Number}
	 *
	 * <p>The {@code Number} field is a direct mapping of the {@code number} field in {@code placement}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getNumber() method.</p>
	 *
	 * @return an object value of {@code Number} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	public java.lang.Integer getNumberAsObject();

	/**
	 * primitive accessor for the {@code Number}
	 *
	 * <p>The {@code Number} field is a direct mapping of the {@code number} database column in the table {@code placement}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getNumberAsObject() method.</p>
	 *
	 * @return the primitive value of {@code Number} (of the current {@link com.opal.TransactionContext})
	 */
	default public int getNumber() {
		java.lang.Integer lclO = getNumberAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the {@code Number} to the value of {@code argNumber}
	 *
	 * @param argNumber the new value of {@code Number}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code number} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argNumber is null
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Placement setNumber(java.lang.Integer argNumber);

	/**
	 * sets the {@code Number} to the value of {@code argNumber}
	 *
	 * @param argNumber the new value of {@code Number}
	 * @return itself, so that mutators may be chained fluently
	 */
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Placement setNumber(int argNumber);

	/**
	 * object accessor for the {@code Tiebreaker}
	 *
	 * <p>The {@code Tiebreaker} field is a direct mapping of the {@code tiebreaker} field in {@code placement}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isTiebreaker() method.</p>
	 *
	 * @return an object value of {@code Tiebreaker} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	public java.lang.Boolean isTiebreakerAsObject();

	default public java.lang.Boolean isRegulationAsObject() {
		Boolean lclB = isTiebreakerAsObject();
		return lclB.booleanValue() ? Boolean.FALSE : Boolean.TRUE;
	}

	/**
	 * primitive accessor for the {@code Tiebreaker}
	 *
	 * <p>The {@code Tiebreaker} field is a direct mapping of the {@code tiebreaker} database column in the table {@code placement}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the isTiebreakerAsObject() method.</p>
	 *
	 * @return the primitive value of {@code Tiebreaker} (of the current {@link com.opal.TransactionContext})
	 */
	default public boolean isTiebreaker() {
		java.lang.Boolean lclO = isTiebreakerAsObject();
		return lclO.booleanValue();
	}

	default public java.lang.Boolean isRegulation() {
		return !isTiebreaker();
	}

	/**
	 * sets the {@code Tiebreaker} to the value of {@code argTiebreaker}
	 *
	 * @param argTiebreaker the new value of {@code Tiebreaker}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code tiebreaker} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argTiebreaker is null
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Placement setTiebreaker(java.lang.Boolean argTiebreaker);

	/**
	 * sets the {@code Tiebreaker} to the value of {@code argTiebreaker}
	 *
	 * @param argTiebreaker the new value of {@code Tiebreaker}
	 * @return itself, so that mutators may be chained fluently
	 */
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Placement setTiebreaker(boolean argTiebreaker);

	/**
	 * object accessor for the {@code ScorecheckAfter}
	 *
	 * <p>The {@code ScorecheckAfter} field is a direct mapping of the {@code scorecheck_after} field in {@code placement}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isScorecheckAfter() method.</p>
	 *
	 * @return an object value of {@code ScorecheckAfter} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	public java.lang.Boolean isScorecheckAfterAsObject();

	/**
	 * primitive accessor for the {@code ScorecheckAfter}
	 *
	 * <p>The {@code ScorecheckAfter} field is a direct mapping of the {@code scorecheck_after} database column in the table {@code placement}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the isScorecheckAfterAsObject() method.</p>
	 *
	 * @return the primitive value of {@code ScorecheckAfter} (of the current {@link com.opal.TransactionContext})
	 */
	default public boolean isScorecheckAfter() {
		java.lang.Boolean lclO = isScorecheckAfterAsObject();
		return lclO.booleanValue();
	}

	/**
	 * sets the {@code ScorecheckAfter} to the value of {@code argScorecheckAfter}
	 *
	 * @param argScorecheckAfter the new value of {@code ScorecheckAfter}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code scorecheck_after} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argScorecheckAfter is null
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Placement setScorecheckAfter(java.lang.Boolean argScorecheckAfter);

	/**
	 * sets the {@code ScorecheckAfter} to the value of {@code argScorecheckAfter}
	 *
	 * @param argScorecheckAfter the new value of {@code ScorecheckAfter}
	 * @return itself, so that mutators may be chained fluently
	 */
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Placement setScorecheckAfter(boolean argScorecheckAfter);

	/**
	 * object accessor for the {@code CategoryCode}
	 *
	 * <p>The {@code CategoryCode} field is a direct mapping of the {@code category_code} field in {@code placement}.</p>
	 *
	 * @return an object value of {@code CategoryCode} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	public java.lang.String getCategoryCode();

	/**
	 * sets the {@code CategoryCode} to the value of {@code argCategoryCode}
	 *
	 * @param argCategoryCode the new value of {@code CategoryCode}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code category_code} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argCategoryCode is null
	 * @throws com.opal.ArgumentTooLongException if {@code argCategoryCode} is longer than 32 characters
	 * <p>The database column {@code category_code} is limited to 32 characters.</p>
	 *
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Placement setCategoryCode(java.lang.String argCategoryCode);

	/**
	 * @return the {@code com.scobolsolo.application.Category}
	 * The returned {@code com.scobolsolo.application.Category} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code category} that is referenced by {@code placement_category_code_fkey}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = false)
	public com.scobolsolo.application.Category getCategory();
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Placement setCategory(com.scobolsolo.application.Category argCategory);

	/**
	 * @return the {@code com.scobolsolo.application.Packet}
	 * The returned {@code com.scobolsolo.application.Packet} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code packet} that is referenced by {@code placement_packet_id_fkey}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = false)
	public com.scobolsolo.application.Packet getPacket();
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Placement setPacket(com.scobolsolo.application.Packet argPacket);

	/**
	 * @return the {@code com.scobolsolo.application.Question}
	 * The returned {@code com.scobolsolo.application.Question} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code question} that is referenced by {@code placement_question_id_fkey}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public com.scobolsolo.application.Question getQuestion();
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Placement setQuestion(com.scobolsolo.application.Question argQuestion);

	public java.util.Set<com.scobolsolo.application.Response> getBaseResponseSet();

	default public java.util.stream.Stream<com.scobolsolo.application.Response> streamBaseResponse() {
		return getBaseResponseSet().stream();
	}

	default public com.scobolsolo.application.Response[] createBaseResponseArray() {
		java.util.Set<com.scobolsolo.application.Response> lclS = getBaseResponseSet();
		return lclS.toArray(new com.scobolsolo.application.Response[lclS.size()]);
	}

	public java.util.Set<com.scobolsolo.application.Response> getReplacementResponseSet();

	default public java.util.stream.Stream<com.scobolsolo.application.Response> streamReplacementResponse() {
		return getReplacementResponseSet().stream();
	}

	default public com.scobolsolo.application.Response[] createReplacementResponseArray() {
		java.util.Set<com.scobolsolo.application.Response> lclS = getReplacementResponseSet();
		return lclS.toArray(new com.scobolsolo.application.Response[lclS.size()]);
	}

	public com.scobolsolo.application.Placement copy();

	/** This is a Comparator that can be used to compare Placement objects based on their {@code Id} values. */

	public static class IdComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Placement> {
		private static final IdComparator ourInstance = new IdComparator();
		public static final IdComparator getInstance() { return ourInstance; }

		private IdComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Placement argFirst, com.scobolsolo.application.Placement argSecond) {
			return argFirst.getIdAsObject().compareTo(argSecond.getIdAsObject());
		}
	}

}
