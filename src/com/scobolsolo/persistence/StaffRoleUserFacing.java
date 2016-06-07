package com.scobolsolo.persistence;


/**
 * represents a {@code StaffRole} from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from {@code staff_role}.  Do not modify this class directly; instead, alter the permanent storage on which it is based, the Opal configuration file for the project, and/or the {@link com.scobolsolo.application.StaffRole}, and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various {@code forXXX} methods on the {@link com.scobolsolo.application.StaffRoleFactory} factory class.  To create new instances, use the {@code create()} method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link com.opal.TransactionContext}.</p>
 *
 * <p>This interface is not meant to be referenced in user code.  Only the {@link com.scobolsolo.application.StaffRole} and the {@link com.scobolsolo.application.StaffRoleFactory} class should be referenced directly.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
public interface StaffRoleUserFacing extends com.opal.IdentityUserFacing, Comparable<com.scobolsolo.application.StaffRole> {

	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the {@code Code}
	 *
	 * <p>The {@code Code} field is a direct mapping of the {@code code} field in {@code staff_role}.</p>
	 *
	 * @return an object value of {@code Code} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	public java.lang.String getCode();

	/**
	 * sets the {@code Code} to the value of {@code argCode}
	 *
	 * @param argCode the new value of {@code Code}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code code} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argCode is null
	 * @throws com.opal.ArgumentTooLongException if {@code argCode} is longer than 32 characters
	 * <p>The database column {@code code} is limited to 32 characters.</p>
	 *
	 */
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	public com.scobolsolo.application.StaffRole setCode(java.lang.String argCode);

	/**
	 * object accessor for the {@code Name}
	 *
	 * <p>The {@code Name} field is a direct mapping of the {@code name} field in {@code staff_role}.</p>
	 *
	 * @return an object value of {@code Name} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	public java.lang.String getName();

	/**
	 * sets the {@code Name} to the value of {@code argName}
	 *
	 * @param argName the new value of {@code Name}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code name} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argName is null
	 * @throws com.opal.ArgumentTooLongException if {@code argName} is longer than 256 characters
	 * <p>The database column {@code name} is limited to 256 characters.</p>
	 *
	 */
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	public com.scobolsolo.application.StaffRole setName(java.lang.String argName);

	/**
	 * object accessor for the {@code ShortName}
	 *
	 * <p>The {@code ShortName} field is a direct mapping of the {@code short_name} field in {@code staff_role}.</p>
	 *
	 * @return an object value of {@code ShortName} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	public java.lang.String getShortName();

	/**
	 * sets the {@code ShortName} to the value of {@code argShortName}
	 *
	 * @param argShortName the new value of {@code ShortName}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code short_name} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argShortName is null
	 * @throws com.opal.ArgumentTooLongException if {@code argShortName} is longer than 32 characters
	 * <p>The database column {@code short_name} is limited to 32 characters.</p>
	 *
	 */
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	public com.scobolsolo.application.StaffRole setShortName(java.lang.String argShortName);

	/**
	 * object accessor for the {@code VeryShortName}
	 *
	 * <p>The {@code VeryShortName} field is a direct mapping of the {@code very_short_name} field in {@code staff_role}.</p>
	 *
	 * @return an object value of {@code VeryShortName} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 12L)
	public java.lang.String getVeryShortName();

	/**
	 * sets the {@code VeryShortName} to the value of {@code argVeryShortName}
	 *
	 * @param argVeryShortName the new value of {@code VeryShortName}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code very_short_name} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argVeryShortName is null
	 * @throws com.opal.ArgumentTooLongException if {@code argVeryShortName} is longer than 12 characters
	 * <p>The database column {@code very_short_name} is limited to 12 characters.</p>
	 *
	 */
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 12L)
	public com.scobolsolo.application.StaffRole setVeryShortName(java.lang.String argVeryShortName);

	/**
	 * object accessor for the {@code Sequence}
	 *
	 * <p>The {@code Sequence} field is a direct mapping of the {@code sequence} field in {@code staff_role}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getSequence() method.</p>
	 *
	 * @return an object value of {@code Sequence} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Nullability(nullable = false)
	public java.lang.Integer getSequenceAsObject();

	/**
	 * primitive accessor for the {@code Sequence}
	 *
	 * <p>The {@code Sequence} field is a direct mapping of the {@code sequence} database column in the table {@code staff_role}.</p>
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
	 * @throws com.opal.IllegalNullArgumentException if argSequence is null
	 */
	@com.opal.annotation.Nullability(nullable = false)
	public com.scobolsolo.application.StaffRole setSequence(java.lang.Integer argSequence);

	/**
	 * sets the {@code Sequence} to the value of {@code argSequence}
	 *
	 * @param argSequence the new value of {@code Sequence}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.StaffRole setSequence(int argSequence);

	/**
	 * object accessor for the {@code MayEnterAnyMatch}
	 *
	 * <p>The {@code MayEnterAnyMatch} field is a direct mapping of the {@code may_enter_any_match} field in {@code staff_role}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isMayEnterAnyMatch() method.</p>
	 *
	 * @return an object value of {@code MayEnterAnyMatch} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	public java.lang.Boolean isMayEnterAnyMatchAsObject();

	/**
	 * primitive accessor for the {@code MayEnterAnyMatch}
	 *
	 * <p>The {@code MayEnterAnyMatch} field is a direct mapping of the {@code may_enter_any_match} database column in the table {@code staff_role}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the isMayEnterAnyMatchAsObject() method.</p>
	 *
	 * @return the primitive value of {@code MayEnterAnyMatch} (of the current {@link com.opal.TransactionContext})
	 */
	default public boolean isMayEnterAnyMatch() {
		java.lang.Boolean lclO = isMayEnterAnyMatchAsObject();
		return lclO.booleanValue();
	}

	/**
	 * sets the {@code MayEnterAnyMatch} to the value of {@code argMayEnterAnyMatch}
	 *
	 * @param argMayEnterAnyMatch the new value of {@code MayEnterAnyMatch}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code may_enter_any_match} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argMayEnterAnyMatch is null
	 */
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	public com.scobolsolo.application.StaffRole setMayEnterAnyMatch(java.lang.Boolean argMayEnterAnyMatch);

	/**
	 * sets the {@code MayEnterAnyMatch} to the value of {@code argMayEnterAnyMatch}
	 *
	 * @param argMayEnterAnyMatch the new value of {@code MayEnterAnyMatch}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.StaffRole setMayEnterAnyMatch(boolean argMayEnterAnyMatch);

	/**
	 * object accessor for the {@code MayEnterMatchesInAssignedRoom}
	 *
	 * <p>The {@code MayEnterMatchesInAssignedRoom} field is a direct mapping of the {@code may_enter_matches_in_assigned_room} field in {@code staff_role}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isMayEnterMatchesInAssignedRoom() method.</p>
	 *
	 * @return an object value of {@code MayEnterMatchesInAssignedRoom} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	public java.lang.Boolean isMayEnterMatchesInAssignedRoomAsObject();

	/**
	 * primitive accessor for the {@code MayEnterMatchesInAssignedRoom}
	 *
	 * <p>The {@code MayEnterMatchesInAssignedRoom} field is a direct mapping of the {@code may_enter_matches_in_assigned_room} database column in the table {@code staff_role}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the isMayEnterMatchesInAssignedRoomAsObject() method.</p>
	 *
	 * @return the primitive value of {@code MayEnterMatchesInAssignedRoom} (of the current {@link com.opal.TransactionContext})
	 */
	default public boolean isMayEnterMatchesInAssignedRoom() {
		java.lang.Boolean lclO = isMayEnterMatchesInAssignedRoomAsObject();
		return lclO.booleanValue();
	}

	/**
	 * sets the {@code MayEnterMatchesInAssignedRoom} to the value of {@code argMayEnterMatchesInAssignedRoom}
	 *
	 * @param argMayEnterMatchesInAssignedRoom the new value of {@code MayEnterMatchesInAssignedRoom}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code may_enter_matches_in_assigned_room} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argMayEnterMatchesInAssignedRoom is null
	 */
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	public com.scobolsolo.application.StaffRole setMayEnterMatchesInAssignedRoom(java.lang.Boolean argMayEnterMatchesInAssignedRoom);

	/**
	 * sets the {@code MayEnterMatchesInAssignedRoom} to the value of {@code argMayEnterMatchesInAssignedRoom}
	 *
	 * @param argMayEnterMatchesInAssignedRoom the new value of {@code MayEnterMatchesInAssignedRoom}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.StaffRole setMayEnterMatchesInAssignedRoom(boolean argMayEnterMatchesInAssignedRoom);

	/**
	 * object accessor for the {@code MayViewQuestions}
	 *
	 * <p>The {@code MayViewQuestions} field is a direct mapping of the {@code may_view_questions} field in {@code staff_role}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isMayViewQuestions() method.</p>
	 *
	 * @return an object value of {@code MayViewQuestions} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	public java.lang.Boolean isMayViewQuestionsAsObject();

	/**
	 * primitive accessor for the {@code MayViewQuestions}
	 *
	 * <p>The {@code MayViewQuestions} field is a direct mapping of the {@code may_view_questions} database column in the table {@code staff_role}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the isMayViewQuestionsAsObject() method.</p>
	 *
	 * @return the primitive value of {@code MayViewQuestions} (of the current {@link com.opal.TransactionContext})
	 */
	default public boolean isMayViewQuestions() {
		java.lang.Boolean lclO = isMayViewQuestionsAsObject();
		return lclO.booleanValue();
	}

	/**
	 * sets the {@code MayViewQuestions} to the value of {@code argMayViewQuestions}
	 *
	 * @param argMayViewQuestions the new value of {@code MayViewQuestions}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code may_view_questions} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argMayViewQuestions is null
	 */
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	public com.scobolsolo.application.StaffRole setMayViewQuestions(java.lang.Boolean argMayViewQuestions);

	/**
	 * sets the {@code MayViewQuestions} to the value of {@code argMayViewQuestions}
	 *
	 * @param argMayViewQuestions the new value of {@code MayViewQuestions}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.StaffRole setMayViewQuestions(boolean argMayViewQuestions);

	/**
	 * object accessor for the {@code MayEnterMatchesBeforeUsuallyPermitted}
	 *
	 * <p>The {@code MayEnterMatchesBeforeUsuallyPermitted} field is a direct mapping of the {@code may_enter_matches_before_usually_permitted} field in {@code staff_role}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isMayEnterMatchesBeforeUsuallyPermitted() method.</p>
	 *
	 * @return an object value of {@code MayEnterMatchesBeforeUsuallyPermitted} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	public java.lang.Boolean isMayEnterMatchesBeforeUsuallyPermittedAsObject();

	/**
	 * primitive accessor for the {@code MayEnterMatchesBeforeUsuallyPermitted}
	 *
	 * <p>The {@code MayEnterMatchesBeforeUsuallyPermitted} field is a direct mapping of the {@code may_enter_matches_before_usually_permitted} database column in the table {@code staff_role}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the isMayEnterMatchesBeforeUsuallyPermittedAsObject() method.</p>
	 *
	 * @return the primitive value of {@code MayEnterMatchesBeforeUsuallyPermitted} (of the current {@link com.opal.TransactionContext})
	 */
	default public boolean isMayEnterMatchesBeforeUsuallyPermitted() {
		java.lang.Boolean lclO = isMayEnterMatchesBeforeUsuallyPermittedAsObject();
		return lclO.booleanValue();
	}

	/**
	 * sets the {@code MayEnterMatchesBeforeUsuallyPermitted} to the value of {@code argMayEnterMatchesBeforeUsuallyPermitted}
	 *
	 * @param argMayEnterMatchesBeforeUsuallyPermitted the new value of {@code MayEnterMatchesBeforeUsuallyPermitted}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code may_enter_matches_before_usually_permitted} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argMayEnterMatchesBeforeUsuallyPermitted is null
	 */
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	public com.scobolsolo.application.StaffRole setMayEnterMatchesBeforeUsuallyPermitted(java.lang.Boolean argMayEnterMatchesBeforeUsuallyPermitted);

	/**
	 * sets the {@code MayEnterMatchesBeforeUsuallyPermitted} to the value of {@code argMayEnterMatchesBeforeUsuallyPermitted}
	 *
	 * @param argMayEnterMatchesBeforeUsuallyPermitted the new value of {@code MayEnterMatchesBeforeUsuallyPermitted}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.StaffRole setMayEnterMatchesBeforeUsuallyPermitted(boolean argMayEnterMatchesBeforeUsuallyPermitted);

	public int getStaffAssignmentCount();
	public java.util.Iterator<com.scobolsolo.application.StaffAssignment> createStaffAssignmentIterator();

	public java.util.stream.Stream<com.scobolsolo.application.StaffAssignment> streamStaffAssignment();

	public com.scobolsolo.application.StaffRole addStaffAssignment(com.scobolsolo.application.StaffAssignment argStaffAssignment);
	public com.scobolsolo.application.StaffRole removeStaffAssignment(com.scobolsolo.application.StaffAssignment argStaffAssignment);
	default public <T extends java.util.Collection<? super com.scobolsolo.application.StaffAssignment>> T acquireStaffAssignment(T argC) {
		org.apache.commons.lang3.Validate.notNull(argC, "Target Collection is null");
		java.util.Iterator<com.scobolsolo.application.StaffAssignment> lclI = createStaffAssignmentIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public com.scobolsolo.application.StaffAssignment[] createStaffAssignmentArray() {
		int lclLength = getStaffAssignmentCount();
		com.scobolsolo.application.StaffAssignment[] lclA = new com.scobolsolo.application.StaffAssignment[lclLength];
		int lclIndex = 0;
		java.util.Iterator<com.scobolsolo.application.StaffAssignment> lclI = createStaffAssignmentIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public com.scobolsolo.application.StaffRole copy();

	/** This is a Comparator that can be used to compare StaffRole objects based on their {@code Code} values. */

	public static class CodeComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.StaffRole> {
		private static final CodeComparator ourInstance = new CodeComparator();
		public static final CodeComparator getInstance() { return ourInstance; }

		private CodeComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.StaffRole argFirst, com.scobolsolo.application.StaffRole argSecond) {
			return argFirst.getCode().compareToIgnoreCase(argSecond.getCode());
		}
	}

	/** This is a Comparator that can be used to compare StaffRole objects based on their {@code Name} values. */

	public static class NameComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.StaffRole> {
		private static final NameComparator ourInstance = new NameComparator();
		public static final NameComparator getInstance() { return ourInstance; }

		private NameComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.StaffRole argFirst, com.scobolsolo.application.StaffRole argSecond) {
			return argFirst.getName().compareToIgnoreCase(argSecond.getName());
		}
	}

	/** This is a Comparator that can be used to compare StaffRole objects based on their {@code ShortName} values. */

	public static class ShortNameComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.StaffRole> {
		private static final ShortNameComparator ourInstance = new ShortNameComparator();
		public static final ShortNameComparator getInstance() { return ourInstance; }

		private ShortNameComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.StaffRole argFirst, com.scobolsolo.application.StaffRole argSecond) {
			return argFirst.getShortName().compareToIgnoreCase(argSecond.getShortName());
		}
	}

	/** This is a Comparator that can be used to compare StaffRole objects based on their {@code VeryShortName} values. */

	public static class VeryShortNameComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.StaffRole> {
		private static final VeryShortNameComparator ourInstance = new VeryShortNameComparator();
		public static final VeryShortNameComparator getInstance() { return ourInstance; }

		private VeryShortNameComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.StaffRole argFirst, com.scobolsolo.application.StaffRole argSecond) {
			return argFirst.getVeryShortName().compareToIgnoreCase(argSecond.getVeryShortName());
		}
	}

	/** This is a Comparator that can be used to compare StaffRole objects based on their {@code Sequence} values. */

	public static class SequenceComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.StaffRole> {
		private static final SequenceComparator ourInstance = new SequenceComparator();
		public static final SequenceComparator getInstance() { return ourInstance; }

		private SequenceComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.StaffRole argFirst, com.scobolsolo.application.StaffRole argSecond) {
			return argFirst.getSequenceAsObject().compareTo(argSecond.getSequenceAsObject());
		}
	}

}
