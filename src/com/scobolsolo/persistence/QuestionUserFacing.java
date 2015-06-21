package com.scobolsolo.persistence;

import com.opal.*;

/**
 * represents a {@code Question} from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from {@code question}.  Do not modify this class directly; instead, alter the permanent storage on which it is based, the Opal configuration file for the project, and/or the {@link com.scobolsolo.application.Question}, and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various {@code forXXX} methods on the {@link com.scobolsolo.application.QuestionFactory} factory class.  To create new instances, use the {@code create()} method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link com.opal.TransactionContext}.</p>
 *
 * <p>This interface is not meant to be referenced in user code.  Only the {@link com.scobolsolo.application.Question} and the {@link com.scobolsolo.application.QuestionFactory} class should be referenced directly.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
public interface QuestionUserFacing extends IdentityUserFacing {
	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the {@code Id}
	 *
	 * <p>The {@code Id} field is a direct mapping of the {@code id} field in {@code question}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getId() method.</p>
	 *
	 * @return an object value of {@code Id} (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.Integer getIdAsObject();

	/**
	 * primitive accessor for the {@code Id}
	 *
	 * <p>The {@code Id} field is a direct mapping of the {@code id} database column in the table {@code question}.</p>
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
	 * object accessor for the {@code Description}
	 *
	 * <p>The {@code Description} field is a direct mapping of the {@code description} field in {@code question}.</p>
	 *
	 * @return an object value of {@code Description} (of the current {@link TransactionContext})  May be <code>null</code>.
	 */
	public java.lang.String getDescription();

	/**
	 * object accessor for the {@code Description} with substitution for a null value
	 *
	 * <p>The {@code Description} field is a direct mapping of the {@code description} database column in the table {@code question}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code Description} is {@code null}.
	 * @return an object value of {@code Description} (of the current {@link TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getDescription(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getDescription();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the {@code Description} to the value of {@code argDescription}
	 *
	 * @param argDescription the new value of {@code Description}.  May be <code>null</code>.
	 * @throws ArgumentTooLongException if {@code argDescription} is longer than 2147483647 characters
	 * <p>The database column {@code description} is limited to 2147483647 characters.</p>
	 *
	 */
	@com.opal.annotation.Length(maximum = 2147483647L)
	public void setDescription(java.lang.String argDescription);

	/**
	 * object accessor for the {@code CategoryCode}
	 *
	 * <p>The {@code CategoryCode} field is a direct mapping of the {@code category_code} field in {@code question}.</p>
	 *
	 * @return an object value of {@code CategoryCode} (of the current {@link TransactionContext})  Will not be <code>null</code>.
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
	 * <p>The {@code TournamentCode} field is a direct mapping of the {@code tournament_code} field in {@code question}.</p>
	 *
	 * @return an object value of {@code TournamentCode} (of the current {@link TransactionContext})  Will not be <code>null</code>.
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
	 * object accessor for the {@code Note}
	 *
	 * <p>The {@code Note} field is a direct mapping of the {@code note} field in {@code question}.</p>
	 *
	 * @return an object value of {@code Note} (of the current {@link TransactionContext})  May be <code>null</code>.
	 */
	public java.lang.String getNote();

	/**
	 * object accessor for the {@code Note} with substitution for a null value
	 *
	 * <p>The {@code Note} field is a direct mapping of the {@code note} database column in the table {@code question}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code Note} is {@code null}.
	 * @return an object value of {@code Note} (of the current {@link TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getNote(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getNote();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the {@code Note} to the value of {@code argNote}
	 *
	 * @param argNote the new value of {@code Note}.  May be <code>null</code>.
	 * @throws ArgumentTooLongException if {@code argNote} is longer than 2147483647 characters
	 * <p>The database column {@code note} is limited to 2147483647 characters.</p>
	 *
	 */
	@com.opal.annotation.Length(maximum = 2147483647L)
	public void setNote(java.lang.String argNote);

	/**
	 * @return the {@code com.scobolsolo.application.Category}
	 * The returned {@code com.scobolsolo.application.Category} is the {@link UserFacing} object corresponding to the entry in {@code category} that is referenced by {@code question_category_code_fkey}.
	 *
	 */
	public com.scobolsolo.application.Category getCategory();
	public void setCategory(com.scobolsolo.application.Category argCategory);

	/**
	 * @return the {@code com.scobolsolo.application.Tournament}
	 * The returned {@code com.scobolsolo.application.Tournament} is the {@link UserFacing} object corresponding to the entry in {@code tournament} that is referenced by {@code question_tournament_code_fkey}.
	 *
	 */
	public com.scobolsolo.application.Tournament getTournament();
	public void setTournament(com.scobolsolo.application.Tournament argTournament);

	public int getPlacementCount();
	public java.util.Iterator<com.scobolsolo.application.Placement> createPlacementIterator();

	public java.util.stream.Stream<com.scobolsolo.application.Placement> streamPlacement();

	public void addPlacement(com.scobolsolo.application.Placement argPlacement);
	public void removePlacement(com.scobolsolo.application.Placement argPlacement);
	public void clearPlacement();

	default public <T extends java.util.Collection<? super com.scobolsolo.application.Placement>> T acquirePlacement(T argC) {
		if (argC == null) { throw new IllegalArgumentException("Target Collection is null."); }
		java.util.Iterator<com.scobolsolo.application.Placement> lclI = createPlacementIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public com.scobolsolo.application.Placement[] createPlacementArray() {
		int lclLength = getPlacementCount();
		com.scobolsolo.application.Placement[] lclA = new com.scobolsolo.application.Placement[lclLength];
		int lclIndex = 0;
		java.util.Iterator<com.scobolsolo.application.Placement> lclI = createPlacementIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public com.scobolsolo.application.Question copy();

	/** This is a Comparator that can be used to compare Question objects based on their {@code Id} values. */

	public static class IdComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Question> {
		private static final IdComparator ourInstance = new IdComparator();
		public static final IdComparator getInstance() { return ourInstance; }

		private IdComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Question argFirst, com.scobolsolo.application.Question argSecond) {
			return argFirst.getIdAsObject().compareTo(argSecond.getIdAsObject());
		}
	}

	public static class CategoryComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Question> {
		private static final CategoryComparator ourInstance = new CategoryComparator();
		public static final CategoryComparator getInstance() { return ourInstance; }

		private CategoryComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Question argFirst, com.scobolsolo.application.Question argSecond) {
			return com.scobolsolo.application.Category.StandardComparator.getInstance().compare(argFirst.getCategory(),  argSecond.getCategory());
		}
	}

}
