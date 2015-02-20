package com.scobolsolo.application;

import com.opal.*;

/**
 * represents a <code>Question</code> from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from the database table <code>question</code>.  Do not modify this class directly; instead, alter the database table on which it is based and/or the Opal configuration file for the project and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various <code>forXXX</code> methods on the {@link QuestionFactory} factory class.  To create new instances, use the <code>create()</code> method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link TransactionContext}.</p>
 *
 * <p>This interface and the {@link QuestionFactory} class (the ones in the <code>com.scobolsolo.application</code> package) are the only two automatically generated files for the table that are intended to be referenced in user code. Other automatically generated files (namely those in the <code>com.scobolsolo.persistence</code> package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
public interface Question extends IdentityUserFacing {
	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the Id
	 *
	 * <p>The Id field is a direct mapping of the <code>id</code> database column in the table <code>question</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getId() method.</p>
	 *
	 * @return an object value of Id (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Integer getIdAsObject();
	/**
	 * primitive accessor for the Id
	 *
	 * <p>The Id field is a direct mapping of the <code>id</code> database column in the table <code>question</code>.</p>
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
	 * object accessor for the Description
	 *
	 * <p>The Description field is a direct mapping of the <code>description</code> database column in the table <code>question</code>.</p>
	 *
	 * @return an object value of Description (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.String getDescription();
	/**
	 * object accessor for the Description with substitution for a null value
	 *
	 * <p>The Description field is a direct mapping of the <code>description</code> database column in the table <code>question</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the Description is <code>null</code>.
	 * @return an object value of Description (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getDescription(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getDescription();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the Description to the value of <code>argDescription</code>
	 *
	 * @param argDescription the new value of Description.  May be <code>null</code>.
	 * @throws ArgumentTooLongException if <code>argDescription</code> is longer than 2147483647 characters
	 * <p>The database column <code>description</code> is limited to 2147483647 characters.</p>
	 *
	 */
	@com.opal.annotation.Length(maximum = 2147483647L)
	public void setDescription(java.lang.String argDescription);

	/**
	 * object accessor for the CategoryCode
	 *
	 * <p>The CategoryCode field is a direct mapping of the <code>category_code</code> database column in the table <code>question</code>.</p>
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
	 * <p>The TournamentCode field is a direct mapping of the <code>tournament_code</code> database column in the table <code>question</code>.</p>
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
	 * object accessor for the Note
	 *
	 * <p>The Note field is a direct mapping of the <code>note</code> database column in the table <code>question</code>.</p>
	 *
	 * @return an object value of Note (of the current {@link TransactionContext})  May be <code>null</code>.
	 */

	public java.lang.String getNote();
	/**
	 * object accessor for the Note with substitution for a null value
	 *
	 * <p>The Note field is a direct mapping of the <code>note</code> database column in the table <code>question</code>.</p>
	 *
	 * <p>This method returns the current value if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if the current value is <code>null</code>.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the Note is <code>null</code>.
	 * @return an object value of Note (of the current {@link TransactionContext}) if it is not <code>null</code>, or <code>argStringToSubstituteIfNull</code> if it is <code>null</code>.
	 */
	default public java.lang.String getNote(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getNote();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the Note to the value of <code>argNote</code>
	 *
	 * @param argNote the new value of Note.  May be <code>null</code>.
	 * @throws ArgumentTooLongException if <code>argNote</code> is longer than 2147483647 characters
	 * <p>The database column <code>note</code> is limited to 2147483647 characters.</p>
	 *
	 */
	@com.opal.annotation.Length(maximum = 2147483647L)
	public void setNote(java.lang.String argNote);

	/**
	 * @return the <code>Category</code>
	 * The returned <code>Category</code> is the {@link UserFacing} object corresponding to the row in the <code>category</code> that is referenced by the foreign key <code>question_category_code_fkey</code>.
	 *
	 */
	public Category getCategory();
	public void setCategory(Category argCategory);

	/**
	 * @return the <code>Tournament</code>
	 * The returned <code>Tournament</code> is the {@link UserFacing} object corresponding to the row in the <code>tournament</code> that is referenced by the foreign key <code>question_tournament_code_fkey</code>.
	 *
	 */
	public Tournament getTournament();
	public void setTournament(Tournament argTournament);

	public int getPlacementCount();
	public java.util.Iterator<Placement> createPlacementIterator();

	public java.util.stream.Stream<Placement> streamPlacement();

	public void addPlacement(Placement argPlacement);
	public void removePlacement(Placement argPlacement);
	public void clearPlacement();

	default public <T extends java.util.Collection<? super Placement>> T acquirePlacement(T argC) {
		org.apache.commons.lang3.Validate.notNull(argC);
		java.util.Iterator<Placement> lclI = createPlacementIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public Placement[] createPlacementArray() {
		int lclLength = getPlacementCount();
		Placement[] lclA = new Placement[lclLength];
		int lclIndex = 0;
		java.util.Iterator<Placement> lclI = createPlacementIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public Question copy();

	/** This is a Comparator that can be used to compare Question objects based on their Id values. */

	public static class IdComparator extends com.siliconage.util.NullSafeComparator<Question> {
		private static final IdComparator ourInstance = new IdComparator();
		public static final IdComparator getInstance() { return ourInstance; }

		private IdComparator() { super(); }

		@Override
		public int compareInternal(Question argFirst, Question argSecond) {
			return argFirst.getIdAsObject().compareTo(argSecond.getIdAsObject());
		}
	}

	public static class CategoryComparator extends com.siliconage.util.NullSafeComparator<Question> {
		private static final CategoryComparator ourInstance = new CategoryComparator();
		public static final CategoryComparator getInstance() { return ourInstance; }

		private CategoryComparator() { super(); }

		@Override
		public int compareInternal(Question argFirst, Question argSecond) {
			return com.scobolsolo.application.Category.StandardComparator.getInstance().compare(argFirst.getCategory(), argSecond.getCategory());
		}
	}

}
