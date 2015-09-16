package com.scobolsolo.persistence;


/**
 * represents a {@code RoundGroup} from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from {@code round_group}.  Do not modify this class directly; instead, alter the permanent storage on which it is based, the Opal configuration file for the project, and/or the {@link com.scobolsolo.application.RoundGroup}, and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various {@code forXXX} methods on the {@link com.scobolsolo.application.RoundGroupFactory} factory class.  To create new instances, use the {@code create()} method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link com.opal.TransactionContext}.</p>
 *
 * <p>This interface is not meant to be referenced in user code.  Only the {@link com.scobolsolo.application.RoundGroup} and the {@link com.scobolsolo.application.RoundGroupFactory} class should be referenced directly.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
public interface RoundGroupUserFacing extends com.opal.IdentityUserFacing {
	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the {@code Id}
	 *
	 * <p>The {@code Id} field is a direct mapping of the {@code id} field in {@code round_group}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getId() method.</p>
	 *
	 * @return an object value of {@code Id} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.Integer getIdAsObject();

	/**
	 * primitive accessor for the {@code Id}
	 *
	 * <p>The {@code Id} field is a direct mapping of the {@code id} database column in the table {@code round_group}.</p>
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
	 * @throws IllegalNullArgumentException if argId is null
	 */
	@com.opal.annotation.NotNull
	public com.scobolsolo.application.RoundGroup setId(java.lang.Integer argId);

	/**
	 * sets the {@code Id} to the value of {@code argId}
	 *
	 * @param argId the new value of {@code Id}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.RoundGroup setId(int argId);

	/**
	 * object accessor for the {@code Name}
	 *
	 * <p>The {@code Name} field is a direct mapping of the {@code name} field in {@code round_group}.</p>
	 *
	 * @return an object value of {@code Name} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.String getName();

	/**
	 * sets the {@code Name} to the value of {@code argName}
	 *
	 * @param argName the new value of {@code Name}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code name} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argName is null
	 * @throws ArgumentTooLongException if {@code argName} is longer than 256 characters
	 * <p>The database column {@code name} is limited to 256 characters.</p>
	 *
	 */
	@com.opal.annotation.NotNull
	@com.opal.annotation.Length(maximum = 256L)
	public com.scobolsolo.application.RoundGroup setName(java.lang.String argName);

	/**
	 * object accessor for the {@code ShortName}
	 *
	 * <p>The {@code ShortName} field is a direct mapping of the {@code short_name} field in {@code round_group}.</p>
	 *
	 * @return an object value of {@code ShortName} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.String getShortName();

	/**
	 * sets the {@code ShortName} to the value of {@code argShortName}
	 *
	 * @param argShortName the new value of {@code ShortName}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code short_name} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argShortName is null
	 * @throws ArgumentTooLongException if {@code argShortName} is longer than 32 characters
	 * <p>The database column {@code short_name} is limited to 32 characters.</p>
	 *
	 */
	@com.opal.annotation.NotNull
	@com.opal.annotation.Length(maximum = 32L)
	public com.scobolsolo.application.RoundGroup setShortName(java.lang.String argShortName);

	/**
	 * object accessor for the {@code Sequence}
	 *
	 * <p>The {@code Sequence} field is a direct mapping of the {@code sequence} field in {@code round_group}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getSequence() method.</p>
	 *
	 * @return an object value of {@code Sequence} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.Integer getSequenceAsObject();

	/**
	 * primitive accessor for the {@code Sequence}
	 *
	 * <p>The {@code Sequence} field is a direct mapping of the {@code sequence} database column in the table {@code round_group}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getSequenceAsObject() method.</p>
	 *
	 * @return the primitive value of {@code Sequence} (of the current {@link com.opal.TransactionContext})
	 */
	default public int getSequence() {
		java.lang.Integer lclO = getSequenceAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the {@code Sequence} to the value of {@code argSequence}
	 *
	 * @param argSequence the new value of {@code Sequence}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code sequence} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argSequence is null
	 */
	@com.opal.annotation.NotNull
	public com.scobolsolo.application.RoundGroup setSequence(java.lang.Integer argSequence);

	/**
	 * sets the {@code Sequence} to the value of {@code argSequence}
	 *
	 * @param argSequence the new value of {@code Sequence}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.RoundGroup setSequence(int argSequence);

	/**
	 * object accessor for the {@code PhaseId}
	 *
	 * <p>The {@code PhaseId} field is a direct mapping of the {@code phase_id} field in {@code round_group}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getPhaseId() method.</p>
	 *
	 * @return an object value of {@code PhaseId} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.Integer getPhaseIdAsObject();

	/**
	 * primitive accessor for the {@code PhaseId}
	 *
	 * <p>The {@code PhaseId} field is a direct mapping of the {@code phase_id} database column in the table {@code round_group}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getPhaseIdAsObject() method.</p>
	 *
	 * @return the primitive value of {@code PhaseId} (of the current {@link com.opal.TransactionContext})
	 */
	default public int getPhaseId() {
		java.lang.Integer lclO = getPhaseIdAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the {@code PhaseId} to the value of {@code argPhaseId}
	 *
	 * @param argPhaseId the new value of {@code PhaseId}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code phase_id} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argPhaseId is null
	 */
	@com.opal.annotation.NotNull
	public com.scobolsolo.application.RoundGroup setPhaseId(java.lang.Integer argPhaseId);

	/**
	 * sets the {@code PhaseId} to the value of {@code argPhaseId}
	 *
	 * @param argPhaseId the new value of {@code PhaseId}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.RoundGroup setPhaseId(int argPhaseId);

	/**
	 * @return the {@code com.scobolsolo.application.Phase}
	 * The returned {@code com.scobolsolo.application.Phase} is the {@link UserFacing} object corresponding to the entry in {@code phase} that is referenced by {@code round_group_phase_id_fkey}.
	 *
	 */
	public com.scobolsolo.application.Phase getPhase();
	public com.scobolsolo.application.RoundGroup setPhase(com.scobolsolo.application.Phase argPhase);

	public int getRoundCount();
	public java.util.Iterator<com.scobolsolo.application.Round> createRoundIterator();

	public java.util.stream.Stream<com.scobolsolo.application.Round> streamRound();

	public com.scobolsolo.application.RoundGroup addRound(com.scobolsolo.application.Round argRound);
	public com.scobolsolo.application.RoundGroup removeRound(com.scobolsolo.application.Round argRound);
	public com.scobolsolo.application.RoundGroup clearRound();

	default public <T extends java.util.Collection<? super com.scobolsolo.application.Round>> T acquireRound(T argC) {
		org.apache.commons.lang3.Validate.notNull(argC, "Target Collection is null");
		java.util.Iterator<com.scobolsolo.application.Round> lclI = createRoundIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public com.scobolsolo.application.Round[] createRoundArray() {
		int lclLength = getRoundCount();
		com.scobolsolo.application.Round[] lclA = new com.scobolsolo.application.Round[lclLength];
		int lclIndex = 0;
		java.util.Iterator<com.scobolsolo.application.Round> lclI = createRoundIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public com.scobolsolo.application.RoundGroup copy();

	/** This is a Comparator that can be used to compare RoundGroup objects based on their {@code Id} values. */

	public static class IdComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.RoundGroup> {
		private static final IdComparator ourInstance = new IdComparator();
		public static final IdComparator getInstance() { return ourInstance; }

		private IdComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.RoundGroup argFirst, com.scobolsolo.application.RoundGroup argSecond) {
			return argFirst.getIdAsObject().compareTo(argSecond.getIdAsObject());
		}
	}

	/** This is a Comparator that can be used to compare RoundGroup objects based on their {@code Name} values. */

	public static class NameComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.RoundGroup> {
		private static final NameComparator ourInstance = new NameComparator();
		public static final NameComparator getInstance() { return ourInstance; }

		private NameComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.RoundGroup argFirst, com.scobolsolo.application.RoundGroup argSecond) {
			return argFirst.getName().compareToIgnoreCase(argSecond.getName());
		}
	}

	/** This is a Comparator that can be used to compare RoundGroup objects based on their {@code ShortName} values. */

	public static class ShortNameComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.RoundGroup> {
		private static final ShortNameComparator ourInstance = new ShortNameComparator();
		public static final ShortNameComparator getInstance() { return ourInstance; }

		private ShortNameComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.RoundGroup argFirst, com.scobolsolo.application.RoundGroup argSecond) {
			return argFirst.getShortName().compareToIgnoreCase(argSecond.getShortName());
		}
	}

	/** This is a Comparator that can be used to compare RoundGroup objects based on their {@code Sequence} values. */

	public static class SequenceComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.RoundGroup> {
		private static final SequenceComparator ourInstance = new SequenceComparator();
		public static final SequenceComparator getInstance() { return ourInstance; }

		private SequenceComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.RoundGroup argFirst, com.scobolsolo.application.RoundGroup argSecond) {
			return argFirst.getSequenceAsObject().compareTo(argSecond.getSequenceAsObject());
		}
	}

}
