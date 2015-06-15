package com.scobolsolo.persistence;

import com.opal.*;

/**
 * represents a {@code CategoryUse} from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from {@code category_use}.  Do not modify this class directly; instead, alter the permanent storage on which it is based, the Opal configuration file for the project, and/or the {@link com.scobolsolo.application.CategoryUse}, and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various {@code forXXX} methods on the {@link com.scobolsolo.application.CategoryUseFactory} factory class.  To create new instances, use the {@code create()} method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link com.opal.TransactionContext}.</p>
 *
 * <p>This interface is not meant to be referenced in user code.  Only the {@link com.scobolsolo.application.CategoryUse} and the {@link com.scobolsolo.application.CategoryUseFactory} class should be referenced directly.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
public interface CategoryUseUserFacing extends IdentityUserFacing {
	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the {@code CategoryCode}
	 *
	 * <p>The {@code CategoryCode} field is a direct mapping of the {@code category_code} field in {@code category_use}.</p>
	 *
	 * @return an object value of {@code CategoryCode} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.String getCategoryCode();

	/**
	 * sets the {@code CategoryCode} to the value of {@code argCategoryCode}
	 *
	 * @param argCategoryCode the new value of {@code CategoryCode}.  May not be <code>null</code>.
	 * <p>The database column {@code category_code} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argCategoryCode is null
	 * @throws ArgumentTooLongException if {@code argCategoryCode} is longer than 32 characters
	 * <p>The database column {@code category_code} is limited to 32 characters.</p>
	 *
	 */
	@com.opal.annotation.NotNull
	@com.opal.annotation.Length(maximum = 32L)
	public void setCategoryCode(java.lang.String argCategoryCode);

	/**
	 * object accessor for the {@code TournamentCode}
	 *
	 * <p>The {@code TournamentCode} field is a direct mapping of the {@code tournament_code} field in {@code category_use}.</p>
	 *
	 * @return an object value of {@code TournamentCode} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.String getTournamentCode();

	/**
	 * sets the {@code TournamentCode} to the value of {@code argTournamentCode}
	 *
	 * @param argTournamentCode the new value of {@code TournamentCode}.  May not be <code>null</code>.
	 * <p>The database column {@code tournament_code} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argTournamentCode is null
	 * @throws ArgumentTooLongException if {@code argTournamentCode} is longer than 32 characters
	 * <p>The database column {@code tournament_code} is limited to 32 characters.</p>
	 *
	 */
	@com.opal.annotation.NotNull
	@com.opal.annotation.Length(maximum = 32L)
	public void setTournamentCode(java.lang.String argTournamentCode);

	/**
	 * @return the {@code com.scobolsolo.application.Category}
	 * The returned {@code com.scobolsolo.application.Category} is the {@link UserFacing} object corresponding to the entry in {@code category} that is referenced by {@code category_use_category_code_fkey}.
	 *
	 */
	public com.scobolsolo.application.Category getCategory();
	public void setCategory(com.scobolsolo.application.Category argCategory);

	/**
	 * @return the {@code com.scobolsolo.application.Tournament}
	 * The returned {@code com.scobolsolo.application.Tournament} is the {@link UserFacing} object corresponding to the entry in {@code tournament} that is referenced by {@code category_use_tournament_code_fkey}.
	 *
	 */
	public com.scobolsolo.application.Tournament getTournament();
	public void setTournament(com.scobolsolo.application.Tournament argTournament);

	public com.scobolsolo.application.CategoryUse copy();

	public static class CategoryComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.CategoryUse> {
		private static final CategoryComparator ourInstance = new CategoryComparator();
		public static final CategoryComparator getInstance() { return ourInstance; }

		private CategoryComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.CategoryUse argFirst, com.scobolsolo.application.CategoryUse argSecond) {
			return com.scobolsolo.application.Category.StandardComparator.getInstance().compare(argFirst.getCategory(), argSecond.getCategory());
		}
	}

	public static class TournamentComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.CategoryUse> {
		private static final TournamentComparator ourInstance = new TournamentComparator();
		public static final TournamentComparator getInstance() { return ourInstance; }

		private TournamentComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.CategoryUse argFirst, com.scobolsolo.application.CategoryUse argSecond) {
			return com.scobolsolo.application.Tournament.DateComparator.getInstance().compare(argFirst.getTournament(), argSecond.getTournament());
		}
	}

}
