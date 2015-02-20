package com.scobolsolo.application;

import com.opal.*;

/**
 * represents a <code>Placement</code> from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from the database table <code>placement</code>.  Do not modify this class directly; instead, alter the database table on which it is based and/or the Opal configuration file for the project and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various <code>forXXX</code> methods on the {@link PlacementFactory} factory class.  To create new instances, use the <code>create()</code> method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link TransactionContext}.</p>
 *
 * <p>This interface and the {@link PlacementFactory} class (the ones in the <code>com.scobolsolo.application</code> package) are the only two automatically generated files for the table that are intended to be referenced in user code. Other automatically generated files (namely those in the <code>com.scobolsolo.persistence</code> package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
public interface Placement extends IdentityUserFacing, Comparable<Placement> {
	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the Id
	 *
	 * <p>The Id field is a direct mapping of the <code>id</code> database column in the table <code>placement</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getId() method.</p>
	 *
	 * @return an object value of Id (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Integer getIdAsObject();
	/**
	 * primitive accessor for the Id
	 *
	 * <p>The Id field is a direct mapping of the <code>id</code> database column in the table <code>placement</code>.</p>
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
	 * object accessor for the QuestionId
	 *
	 * <p>The QuestionId field is a direct mapping of the <code>question_id</code> database column in the table <code>placement</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getQuestionId() method.</p>
	 *
	 * @return an object value of QuestionId (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Integer getQuestionIdAsObject();
	/**
	 * primitive accessor for the QuestionId
	 *
	 * <p>The QuestionId field is a direct mapping of the <code>question_id</code> database column in the table <code>placement</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getQuestionIdAsObject() method.</p>
	 *
	 * @return the primitive value of QuestionId (of the current {@link TransactionContext})
	 */
	default public int getQuestionId() {
		java.lang.Integer lclO = getQuestionIdAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the QuestionId to the value of <code>argQuestionId</code>
	 *
	 * @param argQuestionId the new value of QuestionId.  May not be <code>null</code>.
	 * <p>The database column <code>question_id</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argQuestionId is null
	 */
	@com.opal.annotation.NotNull
	public void setQuestionId(java.lang.Integer argQuestionId);

	/**
	 * sets the QuestionId to the value of <code>argQuestionId</code>
	 *
	 * @param argQuestionId the new value of QuestionId
	 */
	public void setQuestionId(int argQuestionId);

	/**
	 * object accessor for the PacketId
	 *
	 * <p>The PacketId field is a direct mapping of the <code>packet_id</code> database column in the table <code>placement</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getPacketId() method.</p>
	 *
	 * @return an object value of PacketId (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Integer getPacketIdAsObject();
	/**
	 * primitive accessor for the PacketId
	 *
	 * <p>The PacketId field is a direct mapping of the <code>packet_id</code> database column in the table <code>placement</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getPacketIdAsObject() method.</p>
	 *
	 * @return the primitive value of PacketId (of the current {@link TransactionContext})
	 */
	default public int getPacketId() {
		java.lang.Integer lclO = getPacketIdAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the PacketId to the value of <code>argPacketId</code>
	 *
	 * @param argPacketId the new value of PacketId.  May not be <code>null</code>.
	 * <p>The database column <code>packet_id</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argPacketId is null
	 */
	@com.opal.annotation.NotNull
	public void setPacketId(java.lang.Integer argPacketId);

	/**
	 * sets the PacketId to the value of <code>argPacketId</code>
	 *
	 * @param argPacketId the new value of PacketId
	 */
	public void setPacketId(int argPacketId);

	/**
	 * object accessor for the Sequence
	 *
	 * <p>The Sequence field is a direct mapping of the <code>sequence</code> database column in the table <code>placement</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getSequence() method.</p>
	 *
	 * @return an object value of Sequence (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Integer getSequenceAsObject();
	/**
	 * primitive accessor for the Sequence
	 *
	 * <p>The Sequence field is a direct mapping of the <code>sequence</code> database column in the table <code>placement</code>.</p>
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
	 * object accessor for the Tiebreaker
	 *
	 * <p>The Tiebreaker field is a direct mapping of the <code>tiebreaker</code> database column in the table <code>placement</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isTiebreaker() method.</p>
	 *
	 * @return an object value of Tiebreaker (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Boolean isTiebreakerAsObject();
	/**
	 * primitive accessor for the Tiebreaker
	 *
	 * <p>The Tiebreaker field is a direct mapping of the <code>tiebreaker</code> database column in the table <code>placement</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the isTiebreakerAsObject() method.</p>
	 *
	 * @return the primitive value of Tiebreaker (of the current {@link TransactionContext})
	 */
	default public boolean isTiebreaker() {
		java.lang.Boolean lclO = isTiebreakerAsObject();
		return lclO.booleanValue();
	}

	/**
	 * sets the Tiebreaker to the value of <code>argTiebreaker</code>
	 *
	 * @param argTiebreaker the new value of Tiebreaker.  May not be <code>null</code>.
	 * <p>The database column <code>tiebreaker</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argTiebreaker is null
	 */
	@com.opal.annotation.NotNull
	public void setTiebreaker(java.lang.Boolean argTiebreaker);

	/**
	 * sets the Tiebreaker to the value of <code>argTiebreaker</code>
	 *
	 * @param argTiebreaker the new value of Tiebreaker
	 */
	public void setTiebreaker(boolean argTiebreaker);

	/**
	 * object accessor for the ScorecheckAfter
	 *
	 * <p>The ScorecheckAfter field is a direct mapping of the <code>scorecheck_after</code> database column in the table <code>placement</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isScorecheckAfter() method.</p>
	 *
	 * @return an object value of ScorecheckAfter (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Boolean isScorecheckAfterAsObject();
	/**
	 * primitive accessor for the ScorecheckAfter
	 *
	 * <p>The ScorecheckAfter field is a direct mapping of the <code>scorecheck_after</code> database column in the table <code>placement</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the isScorecheckAfterAsObject() method.</p>
	 *
	 * @return the primitive value of ScorecheckAfter (of the current {@link TransactionContext})
	 */
	default public boolean isScorecheckAfter() {
		java.lang.Boolean lclO = isScorecheckAfterAsObject();
		return lclO.booleanValue();
	}

	/**
	 * sets the ScorecheckAfter to the value of <code>argScorecheckAfter</code>
	 *
	 * @param argScorecheckAfter the new value of ScorecheckAfter.  May not be <code>null</code>.
	 * <p>The database column <code>scorecheck_after</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argScorecheckAfter is null
	 */
	@com.opal.annotation.NotNull
	public void setScorecheckAfter(java.lang.Boolean argScorecheckAfter);

	/**
	 * sets the ScorecheckAfter to the value of <code>argScorecheckAfter</code>
	 *
	 * @param argScorecheckAfter the new value of ScorecheckAfter
	 */
	public void setScorecheckAfter(boolean argScorecheckAfter);

	/**
	 * @return the <code>Packet</code>
	 * The returned <code>Packet</code> is the {@link UserFacing} object corresponding to the row in the <code>packet</code> that is referenced by the foreign key <code>placement_packet_id_fkey</code>.
	 *
	 */
	public Packet getPacket();
	public void setPacket(Packet argPacket);

	/**
	 * @return the <code>Question</code>
	 * The returned <code>Question</code> is the {@link UserFacing} object corresponding to the row in the <code>question</code> that is referenced by the foreign key <code>placement_question_id_fkey</code>.
	 *
	 */
	public Question getQuestion();
	public void setQuestion(Question argQuestion);

	public int getResponseCount();
	public java.util.Iterator<Response> createResponseIterator();

	public java.util.stream.Stream<Response> streamResponse();

	public void addResponse(Response argResponse);
	public void removeResponse(Response argResponse);
	public void clearResponse();

	default public <T extends java.util.Collection<? super Response>> T acquireResponse(T argC) {
		org.apache.commons.lang3.Validate.notNull(argC);
		java.util.Iterator<Response> lclI = createResponseIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public Response[] createResponseArray() {
		int lclLength = getResponseCount();
		Response[] lclA = new Response[lclLength];
		int lclIndex = 0;
		java.util.Iterator<Response> lclI = createResponseIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public int getReplacementForResponseCount();
	public java.util.Iterator<Response> createReplacementForResponseIterator();

	public java.util.stream.Stream<Response> streamReplacementForResponse();

	public void addReplacementForResponse(Response argResponse);
	public void removeReplacementForResponse(Response argResponse);
	public void clearReplacementForResponse();

	default public <T extends java.util.Collection<? super Response>> T acquireReplacementForResponse(T argC) {
		org.apache.commons.lang3.Validate.notNull(argC);
		java.util.Iterator<Response> lclI = createReplacementForResponseIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public Response[] createReplacementForResponseArray() {
		int lclLength = getReplacementForResponseCount();
		Response[] lclA = new Response[lclLength];
		int lclIndex = 0;
		java.util.Iterator<Response> lclI = createReplacementForResponseIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public Placement copy();

	default public com.scobolsolo.application.Placement findReplacement() {
		return com.scobolsolo.application.PlacementDelegate.findReplacement(this);
	}

	default public String generateResponseKey(com.scobolsolo.application.Player argA) {
		return com.scobolsolo.application.PlacementDelegate.generateResponseKey(this, argA);
	}

	default public String getDescription() {
		return com.scobolsolo.application.PlacementDelegate.getDescription(this);
	}

	default public String getString() {
		return com.scobolsolo.application.PlacementDelegate.getString(this);
	}

	/** This is a Comparator that can be used to compare Placement objects based on their Id values. */

	public static class IdComparator extends com.siliconage.util.NullSafeComparator<Placement> {
		private static final IdComparator ourInstance = new IdComparator();
		public static final IdComparator getInstance() { return ourInstance; }

		private IdComparator() { super(); }

		@Override
		public int compareInternal(Placement argFirst, Placement argSecond) {
			return argFirst.getIdAsObject().compareTo(argSecond.getIdAsObject());
		}
	}

	/** This is a Comparator that can be used to compare Placement objects based on their Sequence values. */

	public static class SequenceComparator extends com.siliconage.util.NullSafeComparator<Placement> {
		private static final SequenceComparator ourInstance = new SequenceComparator();
		public static final SequenceComparator getInstance() { return ourInstance; }

		private SequenceComparator() { super(); }

		@Override
		public int compareInternal(Placement argFirst, Placement argSecond) {
			return argFirst.getSequenceAsObject().compareTo(argSecond.getSequenceAsObject());
		}
	}

	public static class StandardComparator extends com.siliconage.util.NullSafeComparator<Placement> {
		private static final StandardComparator ourInstance = new StandardComparator();
		public static final StandardComparator getInstance() { return ourInstance; }

		private StandardComparator() { super(); }

		@Override
		public int compareInternal(Placement argFirst, Placement argSecond) {
			int lclResult = com.scobolsolo.application.Packet.StandardComparator.getInstance().compare(argFirst.getPacket(), argSecond.getPacket());
			if (lclResult != 0) {
				return lclResult;
			}
			return argFirst.getSequenceAsObject().compareTo(argSecond.getSequenceAsObject());
		}
	}

}
