package com.scobolsolo.application;

import com.opal.*;

/**
 * represents a <code>RoundGroup</code> from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from the database table <code>round_group</code>.  Do not modify this class directly; instead, alter the database table on which it is based and/or the Opal configuration file for the project and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various <code>forXXX</code> methods on the {@link RoundGroupFactory} factory class.  To create new instances, use the <code>create()</code> method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link TransactionContext}.</p>
 *
 * <p>This interface and the {@link RoundGroupFactory} class (the ones in the <code>com.scobolsolo.application</code> package) are the only two automatically generated files for the table that are intended to be referenced in user code. Other automatically generated files (namely those in the <code>com.scobolsolo.persistence</code> package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
public interface RoundGroup extends IdentityUserFacing {
	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the Id
	 *
	 * <p>The Id field is a direct mapping of the <code>id</code> database column in the table <code>round_group</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getId() method.</p>
	 *
	 * @return an object value of Id (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Integer getIdAsObject();
	/**
	 * primitive accessor for the Id
	 *
	 * <p>The Id field is a direct mapping of the <code>id</code> database column in the table <code>round_group</code>.</p>
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
	 * object accessor for the Name
	 *
	 * <p>The Name field is a direct mapping of the <code>name</code> database column in the table <code>round_group</code>.</p>
	 *
	 * @return an object value of Name (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.String getName();
	/**
	 * sets the Name to the value of <code>argName</code>
	 *
	 * @param argName the new value of Name.  May not be <code>null</code>.
	 * <p>The database column <code>name</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argName is null
	 * @throws ArgumentTooLongException if <code>argName</code> is longer than 256 characters
	 * <p>The database column <code>name</code> is limited to 256 characters.</p>
	 *
	 */
	@com.opal.annotation.NotNull
	@com.opal.annotation.Length(maximum = 256L)
	public void setName(java.lang.String argName);

	/**
	 * object accessor for the ShortName
	 *
	 * <p>The ShortName field is a direct mapping of the <code>short_name</code> database column in the table <code>round_group</code>.</p>
	 *
	 * @return an object value of ShortName (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.String getShortName();
	/**
	 * sets the ShortName to the value of <code>argShortName</code>
	 *
	 * @param argShortName the new value of ShortName.  May not be <code>null</code>.
	 * <p>The database column <code>short_name</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argShortName is null
	 * @throws ArgumentTooLongException if <code>argShortName</code> is longer than 32 characters
	 * <p>The database column <code>short_name</code> is limited to 32 characters.</p>
	 *
	 */
	@com.opal.annotation.NotNull
	@com.opal.annotation.Length(maximum = 32L)
	public void setShortName(java.lang.String argShortName);

	/**
	 * object accessor for the Sequence
	 *
	 * <p>The Sequence field is a direct mapping of the <code>sequence</code> database column in the table <code>round_group</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getSequence() method.</p>
	 *
	 * @return an object value of Sequence (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Integer getSequenceAsObject();
	/**
	 * primitive accessor for the Sequence
	 *
	 * <p>The Sequence field is a direct mapping of the <code>sequence</code> database column in the table <code>round_group</code>.</p>
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
	 * object accessor for the PhaseId
	 *
	 * <p>The PhaseId field is a direct mapping of the <code>phase_id</code> database column in the table <code>round_group</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getPhaseId() method.</p>
	 *
	 * @return an object value of PhaseId (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Integer getPhaseIdAsObject();
	/**
	 * primitive accessor for the PhaseId
	 *
	 * <p>The PhaseId field is a direct mapping of the <code>phase_id</code> database column in the table <code>round_group</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getPhaseIdAsObject() method.</p>
	 *
	 * @return the primitive value of PhaseId (of the current {@link TransactionContext})
	 */
	default public int getPhaseId() {
		java.lang.Integer lclO = getPhaseIdAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the PhaseId to the value of <code>argPhaseId</code>
	 *
	 * @param argPhaseId the new value of PhaseId.  May not be <code>null</code>.
	 * <p>The database column <code>phase_id</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argPhaseId is null
	 */
	@com.opal.annotation.NotNull
	public void setPhaseId(java.lang.Integer argPhaseId);

	/**
	 * sets the PhaseId to the value of <code>argPhaseId</code>
	 *
	 * @param argPhaseId the new value of PhaseId
	 */
	public void setPhaseId(int argPhaseId);

	/**
	 * @return the <code>Phase</code>
	 * The returned <code>Phase</code> is the {@link UserFacing} object corresponding to the row in the <code>phase</code> that is referenced by the foreign key <code>round_group_phase_id_fkey</code>.
	 *
	 */
	public Phase getPhase();
	public void setPhase(Phase argPhase);

	public int getRoundCount();
	public java.util.Iterator<Round> createRoundIterator();

	public java.util.stream.Stream<Round> streamRound();

	public void addRound(Round argRound);
	public void removeRound(Round argRound);
	public void clearRound();

	default public <T extends java.util.Collection<? super Round>> T acquireRound(T argC) {
		org.apache.commons.lang3.Validate.notNull(argC);
		java.util.Iterator<Round> lclI = createRoundIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public Round[] createRoundArray() {
		int lclLength = getRoundCount();
		Round[] lclA = new Round[lclLength];
		int lclIndex = 0;
		java.util.Iterator<Round> lclI = createRoundIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public RoundGroup copy();

	default public com.scobolsolo.application.RoundGroup getNext() {
		return com.scobolsolo.application.RoundGroupDelegate.getNext(this);
	}

	/** This is a Comparator that can be used to compare RoundGroup objects based on their Id values. */

	public static class IdComparator extends com.siliconage.util.NullSafeComparator<RoundGroup> {
		private static final IdComparator ourInstance = new IdComparator();
		public static final IdComparator getInstance() { return ourInstance; }

		private IdComparator() { super(); }

		@Override
		public int compareInternal(RoundGroup argFirst, RoundGroup argSecond) {
			return argFirst.getIdAsObject().compareTo(argSecond.getIdAsObject());
		}
	}

	/** This is a Comparator that can be used to compare RoundGroup objects based on their Name values. */

	public static class NameComparator extends com.siliconage.util.NullSafeComparator<RoundGroup> {
		private static final NameComparator ourInstance = new NameComparator();
		public static final NameComparator getInstance() { return ourInstance; }

		private NameComparator() { super(); }

		@Override
		public int compareInternal(RoundGroup argFirst, RoundGroup argSecond) {
			return argFirst.getName().compareToIgnoreCase(argSecond.getName());
		}
	}

	/** This is a Comparator that can be used to compare RoundGroup objects based on their ShortName values. */

	public static class ShortNameComparator extends com.siliconage.util.NullSafeComparator<RoundGroup> {
		private static final ShortNameComparator ourInstance = new ShortNameComparator();
		public static final ShortNameComparator getInstance() { return ourInstance; }

		private ShortNameComparator() { super(); }

		@Override
		public int compareInternal(RoundGroup argFirst, RoundGroup argSecond) {
			return argFirst.getShortName().compareToIgnoreCase(argSecond.getShortName());
		}
	}

	/** This is a Comparator that can be used to compare RoundGroup objects based on their Sequence values. */

	public static class SequenceComparator extends com.siliconage.util.NullSafeComparator<RoundGroup> {
		private static final SequenceComparator ourInstance = new SequenceComparator();
		public static final SequenceComparator getInstance() { return ourInstance; }

		private SequenceComparator() { super(); }

		@Override
		public int compareInternal(RoundGroup argFirst, RoundGroup argSecond) {
			return argFirst.getSequenceAsObject().compareTo(argSecond.getSequenceAsObject());
		}
	}

	public static class StandardComparator extends com.siliconage.util.NullSafeComparator<RoundGroup> {
		private static final StandardComparator ourInstance = new StandardComparator();
		public static final StandardComparator getInstance() { return ourInstance; }

		private StandardComparator() { super(); }

		@Override
		public int compareInternal(RoundGroup argFirst, RoundGroup argSecond) {
			int lclResult = com.scobolsolo.application.Phase.SequenceComparator.getInstance().compare(argFirst.getPhase(), argSecond.getPhase());
			if (lclResult != 0) {
				return lclResult;
			}
			return argFirst.getSequenceAsObject().compareTo(argSecond.getSequenceAsObject());
		}
	}

}
