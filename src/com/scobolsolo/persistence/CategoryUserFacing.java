package com.scobolsolo.persistence;


/**
 * represents a {@code Category} from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from {@code category}.  Do not modify this class directly; instead, alter the permanent storage on which it is based, the Opal configuration file for the project, and/or the {@link com.scobolsolo.application.Category}, and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various {@code forXXX} methods on the {@link com.scobolsolo.application.CategoryFactory} factory class.  To create new instances, use the {@code create()} method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link com.opal.TransactionContext}.</p>
 *
 * <p>This interface is not meant to be referenced in user code.  Only the {@link com.scobolsolo.application.Category} and the {@link com.scobolsolo.application.CategoryFactory} class should be referenced directly.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
	@com.opal.annotation.Creatability(creatable = true)
	@com.opal.annotation.Updatability(updatable = true)
public interface CategoryUserFacing extends com.opal.IdentityUserFacing {

	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the {@code Code}
	 *
	 * <p>The {@code Code} field is a direct mapping of the {@code code} field in {@code category}.</p>
	 *
	 * @return an object value of {@code Code} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
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
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Category setCode(java.lang.String argCode);

	/**
	 * object accessor for the {@code Name}
	 *
	 * <p>The {@code Name} field is a direct mapping of the {@code name} field in {@code category}.</p>
	 *
	 * @return an object value of {@code Name} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
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
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Category setName(java.lang.String argName);

	/**
	 * object accessor for the {@code ShortName}
	 *
	 * <p>The {@code ShortName} field is a direct mapping of the {@code short_name} field in {@code category}.</p>
	 *
	 * @return an object value of {@code ShortName} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
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
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Category setShortName(java.lang.String argShortName);

	/**
	 * object accessor for the {@code Sequence}
	 *
	 * <p>The {@code Sequence} field is a direct mapping of the {@code sequence} field in {@code category}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getSequence() method.</p>
	 *
	 * @return an object value of {@code Sequence} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	public java.lang.Integer getSequenceAsObject();

	/**
	 * primitive accessor for the {@code Sequence}
	 *
	 * <p>The {@code Sequence} field is a direct mapping of the {@code sequence} database column in the table {@code category}.</p>
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
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Category setSequence(java.lang.Integer argSequence);

	/**
	 * sets the {@code Sequence} to the value of {@code argSequence}
	 *
	 * @param argSequence the new value of {@code Sequence}
	 * @return itself, so that mutators may be chained fluently
	 */
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Category setSequence(int argSequence);

	/**
	 * object accessor for the {@code CategoryGroupCode}
	 *
	 * <p>The {@code CategoryGroupCode} field is a direct mapping of the {@code category_group_code} field in {@code category}.</p>
	 *
	 * @return an object value of {@code CategoryGroupCode} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	public java.lang.String getCategoryGroupCode();

	/**
	 * sets the {@code CategoryGroupCode} to the value of {@code argCategoryGroupCode}
	 *
	 * @param argCategoryGroupCode the new value of {@code CategoryGroupCode}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code category_group_code} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argCategoryGroupCode is null
	 * @throws com.opal.ArgumentTooLongException if {@code argCategoryGroupCode} is longer than 32 characters
	 * <p>The database column {@code category_group_code} is limited to 32 characters.</p>
	 *
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Category setCategoryGroupCode(java.lang.String argCategoryGroupCode);

	/**
	 * object accessor for the {@code AllowPronunciationGuideSuppression}
	 *
	 * <p>The {@code AllowPronunciationGuideSuppression} field is a direct mapping of the {@code allow_pronunciation_guide_suppression} field in {@code category}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isAllowPronunciationGuideSuppression() method.</p>
	 *
	 * @return an object value of {@code AllowPronunciationGuideSuppression} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	public java.lang.Boolean isAllowPronunciationGuideSuppressionAsObject();

	/**
	 * primitive accessor for the {@code AllowPronunciationGuideSuppression}
	 *
	 * <p>The {@code AllowPronunciationGuideSuppression} field is a direct mapping of the {@code allow_pronunciation_guide_suppression} database column in the table {@code category}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the isAllowPronunciationGuideSuppressionAsObject() method.</p>
	 *
	 * @return the primitive value of {@code AllowPronunciationGuideSuppression} (of the current {@link com.opal.TransactionContext})
	 */
	default public boolean isAllowPronunciationGuideSuppression() {
		java.lang.Boolean lclO = isAllowPronunciationGuideSuppressionAsObject();
		return lclO.booleanValue();
	}

	/**
	 * sets the {@code AllowPronunciationGuideSuppression} to the value of {@code argAllowPronunciationGuideSuppression}
	 *
	 * @param argAllowPronunciationGuideSuppression the new value of {@code AllowPronunciationGuideSuppression}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code allow_pronunciation_guide_suppression} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argAllowPronunciationGuideSuppression is null
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Category setAllowPronunciationGuideSuppression(java.lang.Boolean argAllowPronunciationGuideSuppression);

	/**
	 * sets the {@code AllowPronunciationGuideSuppression} to the value of {@code argAllowPronunciationGuideSuppression}
	 *
	 * @param argAllowPronunciationGuideSuppression the new value of {@code AllowPronunciationGuideSuppression}
	 * @return itself, so that mutators may be chained fluently
	 */
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Category setAllowPronunciationGuideSuppression(boolean argAllowPronunciationGuideSuppression);

	/**
	 * object accessor for the {@code Active}
	 *
	 * <p>The {@code Active} field is a direct mapping of the {@code active} field in {@code category}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isActive() method.</p>
	 *
	 * @return an object value of {@code Active} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	public java.lang.Boolean isActiveAsObject();

	/**
	 * primitive accessor for the {@code Active}
	 *
	 * <p>The {@code Active} field is a direct mapping of the {@code active} database column in the table {@code category}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the isActiveAsObject() method.</p>
	 *
	 * @return the primitive value of {@code Active} (of the current {@link com.opal.TransactionContext})
	 */
	default public boolean isActive() {
		java.lang.Boolean lclO = isActiveAsObject();
		return lclO.booleanValue();
	}

	/**
	 * sets the {@code Active} to the value of {@code argActive}
	 *
	 * @param argActive the new value of {@code Active}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code active} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argActive is null
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Category setActive(java.lang.Boolean argActive);

	/**
	 * sets the {@code Active} to the value of {@code argActive}
	 *
	 * @param argActive the new value of {@code Active}
	 * @return itself, so that mutators may be chained fluently
	 */
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Category setActive(boolean argActive);

	/**
	 * @return the {@code com.scobolsolo.application.CategoryGroup}
	 * The returned {@code com.scobolsolo.application.CategoryGroup} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code category_group} that is referenced by {@code category_category_group_code_fkey}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = false)
	public com.scobolsolo.application.CategoryGroup getCategoryGroup();
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Category setCategoryGroup(com.scobolsolo.application.CategoryGroup argCategoryGroup);

	public java.util.Set<com.scobolsolo.application.PronunciationGuideSuppression> getPronunciationGuideSuppressionSet();

	default public java.util.stream.Stream<com.scobolsolo.application.PronunciationGuideSuppression> streamPronunciationGuideSuppression() {
		return getPronunciationGuideSuppressionSet().stream();
	}

	default public com.scobolsolo.application.PronunciationGuideSuppression[] createPronunciationGuideSuppressionArray() {
		java.util.Set<com.scobolsolo.application.PronunciationGuideSuppression> lclS = getPronunciationGuideSuppressionSet();
		return lclS.toArray(new com.scobolsolo.application.PronunciationGuideSuppression[lclS.size()]);
	}

	public java.util.Set<com.scobolsolo.application.CategoryUse> getCategoryUseSet();

	default public java.util.stream.Stream<com.scobolsolo.application.CategoryUse> streamCategoryUse() {
		return getCategoryUseSet().stream();
	}

	default public com.scobolsolo.application.CategoryUse[] createCategoryUseArray() {
		java.util.Set<com.scobolsolo.application.CategoryUse> lclS = getCategoryUseSet();
		return lclS.toArray(new com.scobolsolo.application.CategoryUse[lclS.size()]);
	}

	public java.util.Set<com.scobolsolo.application.Placement> getPlacementSet();

	default public java.util.stream.Stream<com.scobolsolo.application.Placement> streamPlacement() {
		return getPlacementSet().stream();
	}

	default public com.scobolsolo.application.Placement[] createPlacementArray() {
		java.util.Set<com.scobolsolo.application.Placement> lclS = getPlacementSet();
		return lclS.toArray(new com.scobolsolo.application.Placement[lclS.size()]);
	}

	public com.scobolsolo.application.Category copy();

	/** This is a Comparator that can be used to compare Category objects based on their {@code Code} values. */

	public static class CodeComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Category> {
		private static final CodeComparator ourInstance = new CodeComparator();
		public static final CodeComparator getInstance() { return ourInstance; }

		private CodeComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Category argFirst, com.scobolsolo.application.Category argSecond) {
			return argFirst.getCode().compareToIgnoreCase(argSecond.getCode());
		}
	}

	/** This is a Comparator that can be used to compare Category objects based on their {@code Name} values. */

	public static class NameComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Category> {
		private static final NameComparator ourInstance = new NameComparator();
		public static final NameComparator getInstance() { return ourInstance; }

		private NameComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Category argFirst, com.scobolsolo.application.Category argSecond) {
			return argFirst.getName().compareToIgnoreCase(argSecond.getName());
		}
	}

	/** This is a Comparator that can be used to compare Category objects based on their {@code ShortName} values. */

	public static class ShortNameComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Category> {
		private static final ShortNameComparator ourInstance = new ShortNameComparator();
		public static final ShortNameComparator getInstance() { return ourInstance; }

		private ShortNameComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Category argFirst, com.scobolsolo.application.Category argSecond) {
			return argFirst.getShortName().compareToIgnoreCase(argSecond.getShortName());
		}
	}

	/** This is a Comparator that can be used to compare Category objects based on their {@code Sequence} values. */

	public static class SequenceComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Category> {
		private static final SequenceComparator ourInstance = new SequenceComparator();
		public static final SequenceComparator getInstance() { return ourInstance; }

		private SequenceComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Category argFirst, com.scobolsolo.application.Category argSecond) {
			return argFirst.getSequenceAsObject().compareTo(argSecond.getSequenceAsObject());
		}
	}

}
