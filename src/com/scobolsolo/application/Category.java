package com.scobolsolo.application;

import com.opal.*;

/**
 * represents a <code>Category</code> from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from the database table <code>category</code>.  Do not modify this class directly; instead, alter the database table on which it is based and/or the Opal configuration file for the project and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various <code>forXXX</code> methods on the {@link CategoryFactory} factory class.  To create new instances, use the <code>create()</code> method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link TransactionContext}.</p>
 *
 * <p>This interface and the {@link CategoryFactory} class (the ones in the <code>com.scobolsolo.application</code> package) are the only two automatically generated files for the table that are intended to be referenced in user code. Other automatically generated files (namely those in the <code>com.scobolsolo.persistence</code> package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
public interface Category extends IdentityUserFacing, Comparable<Category> {
	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the Code
	 *
	 * <p>The Code field is a direct mapping of the <code>code</code> database column in the table <code>category</code>.</p>
	 *
	 * @return an object value of Code (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.String getCode();
	/**
	 * sets the Code to the value of <code>argCode</code>
	 *
	 * @param argCode the new value of Code.  May not be <code>null</code>.
	 * <p>The database column <code>code</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argCode is null
	 * @throws ArgumentTooLongException if <code>argCode</code> is longer than 32 characters
	 * <p>The database column <code>code</code> is limited to 32 characters.</p>
	 *
	 */
	@com.opal.annotation.NotNull
	@com.opal.annotation.Length(maximum = 32L)
	public void setCode(java.lang.String argCode);

	/**
	 * object accessor for the Name
	 *
	 * <p>The Name field is a direct mapping of the <code>name</code> database column in the table <code>category</code>.</p>
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
	 * <p>The ShortName field is a direct mapping of the <code>short_name</code> database column in the table <code>category</code>.</p>
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
	 * <p>The Sequence field is a direct mapping of the <code>sequence</code> database column in the table <code>category</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getSequence() method.</p>
	 *
	 * @return an object value of Sequence (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Integer getSequenceAsObject();
	/**
	 * primitive accessor for the Sequence
	 *
	 * <p>The Sequence field is a direct mapping of the <code>sequence</code> database column in the table <code>category</code>.</p>
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
	 * object accessor for the CategoryGroupCode
	 *
	 * <p>The CategoryGroupCode field is a direct mapping of the <code>category_group_code</code> database column in the table <code>category</code>.</p>
	 *
	 * @return an object value of CategoryGroupCode (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.String getCategoryGroupCode();
	/**
	 * sets the CategoryGroupCode to the value of <code>argCategoryGroupCode</code>
	 *
	 * @param argCategoryGroupCode the new value of CategoryGroupCode.  May not be <code>null</code>.
	 * <p>The database column <code>category_group_code</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argCategoryGroupCode is null
	 * @throws ArgumentTooLongException if <code>argCategoryGroupCode</code> is longer than 32 characters
	 * <p>The database column <code>category_group_code</code> is limited to 32 characters.</p>
	 *
	 */
	@com.opal.annotation.NotNull
	@com.opal.annotation.Length(maximum = 32L)
	public void setCategoryGroupCode(java.lang.String argCategoryGroupCode);

	/**
	 * @return the <code>CategoryGroup</code>
	 * The returned <code>CategoryGroup</code> is the {@link UserFacing} object corresponding to the row in the <code>category_group</code> that is referenced by the foreign key <code>category_category_group_code_fkey</code>.
	 *
	 */
	public CategoryGroup getCategoryGroup();
	public void setCategoryGroup(CategoryGroup argCategoryGroup);

	public int getQuestionCount();
	public java.util.Iterator<Question> createQuestionIterator();

	public java.util.stream.Stream<Question> streamQuestion();

	public void addQuestion(Question argQuestion);
	public void removeQuestion(Question argQuestion);
	public void clearQuestion();

	default public <T extends java.util.Collection<? super Question>> T acquireQuestion(T argC) {
		org.apache.commons.lang3.Validate.notNull(argC);
		java.util.Iterator<Question> lclI = createQuestionIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public Question[] createQuestionArray() {
		int lclLength = getQuestionCount();
		Question[] lclA = new Question[lclLength];
		int lclIndex = 0;
		java.util.Iterator<Question> lclI = createQuestionIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public int getCategoryUseCount();
	public java.util.Iterator<CategoryUse> createCategoryUseIterator();

	public java.util.stream.Stream<CategoryUse> streamCategoryUse();

	public void addCategoryUse(CategoryUse argCategoryUse);
	public void removeCategoryUse(CategoryUse argCategoryUse);
	public void clearCategoryUse();

	default public <T extends java.util.Collection<? super CategoryUse>> T acquireCategoryUse(T argC) {
		org.apache.commons.lang3.Validate.notNull(argC);
		java.util.Iterator<CategoryUse> lclI = createCategoryUseIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public CategoryUse[] createCategoryUseArray() {
		int lclLength = getCategoryUseCount();
		CategoryUse[] lclA = new CategoryUse[lclLength];
		int lclIndex = 0;
		java.util.Iterator<CategoryUse> lclI = createCategoryUseIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public Category copy();

	/** This is a Comparator that can be used to compare Category objects based on their Code values. */

	public static class CodeComparator extends com.siliconage.util.NullSafeComparator<Category> {
		private static final CodeComparator ourInstance = new CodeComparator();
		public static final CodeComparator getInstance() { return ourInstance; }

		private CodeComparator() { super(); }

		@Override
		public int compareInternal(Category argFirst, Category argSecond) {
			return argFirst.getCode().compareToIgnoreCase(argSecond.getCode());
		}
	}

	/** This is a Comparator that can be used to compare Category objects based on their Name values. */

	public static class NameComparator extends com.siliconage.util.NullSafeComparator<Category> {
		private static final NameComparator ourInstance = new NameComparator();
		public static final NameComparator getInstance() { return ourInstance; }

		private NameComparator() { super(); }

		@Override
		public int compareInternal(Category argFirst, Category argSecond) {
			return argFirst.getName().compareToIgnoreCase(argSecond.getName());
		}
	}

	/** This is a Comparator that can be used to compare Category objects based on their ShortName values. */

	public static class ShortNameComparator extends com.siliconage.util.NullSafeComparator<Category> {
		private static final ShortNameComparator ourInstance = new ShortNameComparator();
		public static final ShortNameComparator getInstance() { return ourInstance; }

		private ShortNameComparator() { super(); }

		@Override
		public int compareInternal(Category argFirst, Category argSecond) {
			return argFirst.getShortName().compareToIgnoreCase(argSecond.getShortName());
		}
	}

	/** This is a Comparator that can be used to compare Category objects based on their Sequence values. */

	public static class SequenceComparator extends com.siliconage.util.NullSafeComparator<Category> {
		private static final SequenceComparator ourInstance = new SequenceComparator();
		public static final SequenceComparator getInstance() { return ourInstance; }

		private SequenceComparator() { super(); }

		@Override
		public int compareInternal(Category argFirst, Category argSecond) {
			return argFirst.getSequenceAsObject().compareTo(argSecond.getSequenceAsObject());
		}
	}

	public static class StandardComparator extends com.siliconage.util.NullSafeComparator<Category> {
		private static final StandardComparator ourInstance = new StandardComparator();
		public static final StandardComparator getInstance() { return ourInstance; }

		private StandardComparator() { super(); }

		@Override
		public int compareInternal(Category argFirst, Category argSecond) {
			int lclResult = com.scobolsolo.application.CategoryGroup.SequenceComparator.getInstance().compare(argFirst.getCategoryGroup(), argSecond.getCategoryGroup());
			if (lclResult != 0) {
				return lclResult;
			}
			return argFirst.getSequenceAsObject().compareTo(argSecond.getSequenceAsObject());
		}
	}

}
