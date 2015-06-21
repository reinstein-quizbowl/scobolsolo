package com.scobolsolo.persistence;

import com.opal.*;

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
public interface PlacementUserFacing extends IdentityUserFacing, Comparable<com.scobolsolo.application.Placement> {
	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the {@code Id}
	 *
	 * <p>The {@code Id} field is a direct mapping of the {@code id} field in {@code placement}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getId() method.</p>
	 *
	 * @return an object value of {@code Id} (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.Integer getIdAsObject();

	/**
	 * primitive accessor for the {@code Id}
	 *
	 * <p>The {@code Id} field is a direct mapping of the {@code id} database column in the table {@code placement}.</p>
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
	 * <p>The database column {@code id} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argId is null
	 */
	@com.opal.annotation.NotNull
	public void setId(java.lang.Integer argId);

	/**
	 * sets the {@code Id} to the value of {@code argId}
	 *
	 * @param argId the new value of {@code Id}
	 */
	public void setId(int argId);

	/**
	 * object accessor for the {@code QuestionId}
	 *
	 * <p>The {@code QuestionId} field is a direct mapping of the {@code question_id} field in {@code placement}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getQuestionId() method.</p>
	 *
	 * @return an object value of {@code QuestionId} (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.Integer getQuestionIdAsObject();

	/**
	 * primitive accessor for the {@code QuestionId}
	 *
	 * <p>The {@code QuestionId} field is a direct mapping of the {@code question_id} database column in the table {@code placement}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getQuestionIdAsObject() method.</p>
	 *
	 * @return the primitive value of {@code QuestionId} (of the current {@link TransactionContext})
	 */
	default public int getQuestionId() {
		java.lang.Integer lclO = getQuestionIdAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the {@code QuestionId} to the value of {@code argQuestionId}
	 *
	 * @param argQuestionId the new value of {@code QuestionId}.  May not be <code>null</code>.
	 * <p>The database column {@code question_id} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argQuestionId is null
	 */
	@com.opal.annotation.NotNull
	public void setQuestionId(java.lang.Integer argQuestionId);

	/**
	 * sets the {@code QuestionId} to the value of {@code argQuestionId}
	 *
	 * @param argQuestionId the new value of {@code QuestionId}
	 */
	public void setQuestionId(int argQuestionId);

	/**
	 * object accessor for the {@code PacketId}
	 *
	 * <p>The {@code PacketId} field is a direct mapping of the {@code packet_id} field in {@code placement}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getPacketId() method.</p>
	 *
	 * @return an object value of {@code PacketId} (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.Integer getPacketIdAsObject();

	/**
	 * primitive accessor for the {@code PacketId}
	 *
	 * <p>The {@code PacketId} field is a direct mapping of the {@code packet_id} database column in the table {@code placement}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getPacketIdAsObject() method.</p>
	 *
	 * @return the primitive value of {@code PacketId} (of the current {@link TransactionContext})
	 */
	default public int getPacketId() {
		java.lang.Integer lclO = getPacketIdAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the {@code PacketId} to the value of {@code argPacketId}
	 *
	 * @param argPacketId the new value of {@code PacketId}.  May not be <code>null</code>.
	 * <p>The database column {@code packet_id} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argPacketId is null
	 */
	@com.opal.annotation.NotNull
	public void setPacketId(java.lang.Integer argPacketId);

	/**
	 * sets the {@code PacketId} to the value of {@code argPacketId}
	 *
	 * @param argPacketId the new value of {@code PacketId}
	 */
	public void setPacketId(int argPacketId);

	/**
	 * object accessor for the {@code Sequence}
	 *
	 * <p>The {@code Sequence} field is a direct mapping of the {@code sequence} field in {@code placement}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getSequence() method.</p>
	 *
	 * @return an object value of {@code Sequence} (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.Integer getSequenceAsObject();

	/**
	 * primitive accessor for the {@code Sequence}
	 *
	 * <p>The {@code Sequence} field is a direct mapping of the {@code sequence} database column in the table {@code placement}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getSequenceAsObject() method.</p>
	 *
	 * @return the primitive value of {@code Sequence} (of the current {@link TransactionContext})
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

	/**
	 * object accessor for the {@code Tiebreaker}
	 *
	 * <p>The {@code Tiebreaker} field is a direct mapping of the {@code tiebreaker} field in {@code placement}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isTiebreaker() method.</p>
	 *
	 * @return an object value of {@code Tiebreaker} (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.Boolean isTiebreakerAsObject();

	/**
	 * primitive accessor for the {@code Tiebreaker}
	 *
	 * <p>The {@code Tiebreaker} field is a direct mapping of the {@code tiebreaker} database column in the table {@code placement}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the isTiebreakerAsObject() method.</p>
	 *
	 * @return the primitive value of {@code Tiebreaker} (of the current {@link TransactionContext})
	 */
	default public boolean isTiebreaker() {
		java.lang.Boolean lclO = isTiebreakerAsObject();
		return lclO.booleanValue();
	}

	/**
	 * sets the {@code Tiebreaker} to the value of {@code argTiebreaker}
	 *
	 * @param argTiebreaker the new value of {@code Tiebreaker}.  May not be <code>null</code>.
	 * <p>The database column {@code tiebreaker} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argTiebreaker is null
	 */
	@com.opal.annotation.NotNull
	public void setTiebreaker(java.lang.Boolean argTiebreaker);

	/**
	 * sets the {@code Tiebreaker} to the value of {@code argTiebreaker}
	 *
	 * @param argTiebreaker the new value of {@code Tiebreaker}
	 */
	public void setTiebreaker(boolean argTiebreaker);

	/**
	 * object accessor for the {@code ScorecheckAfter}
	 *
	 * <p>The {@code ScorecheckAfter} field is a direct mapping of the {@code scorecheck_after} field in {@code placement}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isScorecheckAfter() method.</p>
	 *
	 * @return an object value of {@code ScorecheckAfter} (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.Boolean isScorecheckAfterAsObject();

	/**
	 * primitive accessor for the {@code ScorecheckAfter}
	 *
	 * <p>The {@code ScorecheckAfter} field is a direct mapping of the {@code scorecheck_after} database column in the table {@code placement}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the isScorecheckAfterAsObject() method.</p>
	 *
	 * @return the primitive value of {@code ScorecheckAfter} (of the current {@link TransactionContext})
	 */
	default public boolean isScorecheckAfter() {
		java.lang.Boolean lclO = isScorecheckAfterAsObject();
		return lclO.booleanValue();
	}

	/**
	 * sets the {@code ScorecheckAfter} to the value of {@code argScorecheckAfter}
	 *
	 * @param argScorecheckAfter the new value of {@code ScorecheckAfter}.  May not be <code>null</code>.
	 * <p>The database column {@code scorecheck_after} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argScorecheckAfter is null
	 */
	@com.opal.annotation.NotNull
	public void setScorecheckAfter(java.lang.Boolean argScorecheckAfter);

	/**
	 * sets the {@code ScorecheckAfter} to the value of {@code argScorecheckAfter}
	 *
	 * @param argScorecheckAfter the new value of {@code ScorecheckAfter}
	 */
	public void setScorecheckAfter(boolean argScorecheckAfter);

	/**
	 * @return the {@code com.scobolsolo.application.Packet}
	 * The returned {@code com.scobolsolo.application.Packet} is the {@link UserFacing} object corresponding to the entry in {@code packet} that is referenced by {@code placement_packet_id_fkey}.
	 *
	 */
	public com.scobolsolo.application.Packet getPacket();
	public void setPacket(com.scobolsolo.application.Packet argPacket);

	/**
	 * @return the {@code com.scobolsolo.application.Question}
	 * The returned {@code com.scobolsolo.application.Question} is the {@link UserFacing} object corresponding to the entry in {@code question} that is referenced by {@code placement_question_id_fkey}.
	 *
	 */
	public com.scobolsolo.application.Question getQuestion();
	public void setQuestion(com.scobolsolo.application.Question argQuestion);

	public int getResponseCount();
	public java.util.Iterator<com.scobolsolo.application.Response> createResponseIterator();

	public java.util.stream.Stream<com.scobolsolo.application.Response> streamResponse();

	public void addResponse(com.scobolsolo.application.Response argResponse);
	public void removeResponse(com.scobolsolo.application.Response argResponse);
	public void clearResponse();

	default public <T extends java.util.Collection<? super com.scobolsolo.application.Response>> T acquireResponse(T argC) {
		if (argC == null) { throw new IllegalArgumentException("Target Collection is null."); }
		java.util.Iterator<com.scobolsolo.application.Response> lclI = createResponseIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public com.scobolsolo.application.Response[] createResponseArray() {
		int lclLength = getResponseCount();
		com.scobolsolo.application.Response[] lclA = new com.scobolsolo.application.Response[lclLength];
		int lclIndex = 0;
		java.util.Iterator<com.scobolsolo.application.Response> lclI = createResponseIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public int getReplacementForResponseCount();
	public java.util.Iterator<com.scobolsolo.application.Response> createReplacementForResponseIterator();

	public java.util.stream.Stream<com.scobolsolo.application.Response> streamReplacementForResponse();

	public void addReplacementForResponse(com.scobolsolo.application.Response argResponse);
	public void removeReplacementForResponse(com.scobolsolo.application.Response argResponse);
	public void clearReplacementForResponse();

	default public <T extends java.util.Collection<? super com.scobolsolo.application.Response>> T acquireReplacementForResponse(T argC) {
		if (argC == null) { throw new IllegalArgumentException("Target Collection is null."); }
		java.util.Iterator<com.scobolsolo.application.Response> lclI = createReplacementForResponseIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public com.scobolsolo.application.Response[] createReplacementForResponseArray() {
		int lclLength = getReplacementForResponseCount();
		com.scobolsolo.application.Response[] lclA = new com.scobolsolo.application.Response[lclLength];
		int lclIndex = 0;
		java.util.Iterator<com.scobolsolo.application.Response> lclI = createReplacementForResponseIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
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

	/** This is a Comparator that can be used to compare Placement objects based on their {@code Sequence} values. */

	public static class SequenceComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Placement> {
		private static final SequenceComparator ourInstance = new SequenceComparator();
		public static final SequenceComparator getInstance() { return ourInstance; }

		private SequenceComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Placement argFirst, com.scobolsolo.application.Placement argSecond) {
			return argFirst.getSequenceAsObject().compareTo(argSecond.getSequenceAsObject());
		}
	}

	public static class StandardComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Placement> {
		private static final StandardComparator ourInstance = new StandardComparator();
		public static final StandardComparator getInstance() { return ourInstance; }

		private StandardComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Placement argFirst, com.scobolsolo.application.Placement argSecond) {
			int lclResult = com.scobolsolo.application.Packet.StandardComparator.getInstance().compare(argFirst.getPacket(),  argSecond.getPacket());
			if (lclResult != 0) {
				return lclResult;
			}
			return argFirst.getSequence() - argSecond.getSequence();
		}
	}

}
