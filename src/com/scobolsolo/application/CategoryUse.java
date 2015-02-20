package com.scobolsolo.application;

import com.opal.*;

/**
 * represents a <code>CategoryUse</code> from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from the database table <code>category_use</code>.  Do not modify this class directly; instead, alter the database table on which it is based and/or the Opal configuration file for the project and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various <code>forXXX</code> methods on the {@link CategoryUseFactory} factory class.  To create new instances, use the <code>create()</code> method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link TransactionContext}.</p>
 *
 * <p>This interface and the {@link CategoryUseFactory} class (the ones in the <code>com.scobolsolo.application</code> package) are the only two automatically generated files for the table that are intended to be referenced in user code. Other automatically generated files (namely those in the <code>com.scobolsolo.persistence</code> package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
public interface CategoryUse extends IdentityUserFacing {
	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the CategoryCode
	 *
	 * <p>The CategoryCode field is a direct mapping of the <code>category_code</code> database column in the table <code>category_use</code>.</p>
	 *
	 * @return an object value of CategoryCode (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.String getCategoryCode();
	/**
	 * sets the CategoryCode to the value of <code>argCategoryCode</code>
	 *
	 * @param argCategoryCode the new value of CategoryCode.  May not be <code>null</code>.
	 * <p>The database column <code>category_code</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argCategoryCode is null
	 * @throws ArgumentTooLongException if <code>argCategoryCode</code> is longer than 32 characters
	 * <p>The database column <code>category_code</code> is limited to 32 characters.</p>
	 *
	 */
	@com.opal.annotation.NotNull
	@com.opal.annotation.Length(maximum = 32L)
	public void setCategoryCode(java.lang.String argCategoryCode);

	/**
	 * object accessor for the TournamentCode
	 *
	 * <p>The TournamentCode field is a direct mapping of the <code>tournament_code</code> database column in the table <code>category_use</code>.</p>
	 *
	 * @return an object value of TournamentCode (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.String getTournamentCode();
	/**
	 * sets the TournamentCode to the value of <code>argTournamentCode</code>
	 *
	 * @param argTournamentCode the new value of TournamentCode.  May not be <code>null</code>.
	 * <p>The database column <code>tournament_code</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argTournamentCode is null
	 * @throws ArgumentTooLongException if <code>argTournamentCode</code> is longer than 32 characters
	 * <p>The database column <code>tournament_code</code> is limited to 32 characters.</p>
	 *
	 */
	@com.opal.annotation.NotNull
	@com.opal.annotation.Length(maximum = 32L)
	public void setTournamentCode(java.lang.String argTournamentCode);

	/**
	 * @return the <code>Category</code>
	 * The returned <code>Category</code> is the {@link UserFacing} object corresponding to the row in the <code>category</code> that is referenced by the foreign key <code>category_use_category_code_fkey</code>.
	 *
	 */
	public Category getCategory();
	public void setCategory(Category argCategory);

	/**
	 * @return the <code>Tournament</code>
	 * The returned <code>Tournament</code> is the {@link UserFacing} object corresponding to the row in the <code>tournament</code> that is referenced by the foreign key <code>category_use_tournament_code_fkey</code>.
	 *
	 */
	public Tournament getTournament();
	public void setTournament(Tournament argTournament);

	public CategoryUse copy();

	public static class CategoryComparator extends com.siliconage.util.NullSafeComparator<CategoryUse> {
		private static final CategoryComparator ourInstance = new CategoryComparator();
		public static final CategoryComparator getInstance() { return ourInstance; }

		private CategoryComparator() { super(); }

		@Override
		public int compareInternal(CategoryUse argFirst, CategoryUse argSecond) {
			return com.scobolsolo.application.Category.StandardComparator.getInstance().compare(argFirst.getCategory(), argSecond.getCategory());
		}
	}

	public static class TournamentComparator extends com.siliconage.util.NullSafeComparator<CategoryUse> {
		private static final TournamentComparator ourInstance = new TournamentComparator();
		public static final TournamentComparator getInstance() { return ourInstance; }

		private TournamentComparator() { super(); }

		@Override
		public int compareInternal(CategoryUse argFirst, CategoryUse argSecond) {
			return com.scobolsolo.application.Tournament.DateComparator.getInstance().compare(argFirst.getTournament(), argSecond.getTournament());
		}
	}

}
