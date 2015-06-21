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
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code id} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argId is null
	 */
	@com.opal.annotation.NotNull
	public com.scobolsolo.application.Question setId(java.lang.Integer argId);

	/**
	 * sets the {@code Id} to the value of {@code argId}
	 *
	 * @param argId the new value of {@code Id}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.Question setId(int argId);

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
	 * @return itself, so that mutator calls can be chained fluently
	 * @throws ArgumentTooLongException if {@code argDescription} is longer than 2147483647 characters
	 * <p>The database column {@code description} is limited to 2147483647 characters.</p>
	 *
	 */
	@com.opal.annotation.Length(maximum = 2147483647L)
	public com.scobolsolo.application.Question setDescription(java.lang.String argDescription);

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
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code category_code} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argCategoryCode is null
	 * @throws ArgumentTooLongException if {@code argCategoryCode} is longer than 32 characters
	 * <p>The database column {@code category_code} is limited to 32 characters.</p>
	 *
	 */
	@com.opal.annotation.NotNull
	@com.opal.annotation.Length(maximum = 32L)
	public com.scobolsolo.application.Question setCategoryCode(java.lang.String argCategoryCode);

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
	 * @return itself, so that mutator calls can be chained fluently
	 * @throws ArgumentTooLongException if {@code argNote} is longer than 2147483647 characters
	 * <p>The database column {@code note} is limited to 2147483647 characters.</p>
	 *
	 */
	@com.opal.annotation.Length(maximum = 2147483647L)
	public com.scobolsolo.application.Question setNote(java.lang.String argNote);

	/**
	 * object accessor for the {@code WriterAccountId}
	 *
	 * <p>The {@code WriterAccountId} field is a direct mapping of the {@code writer_account_id} field in {@code question}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getWriterAccountId() method.</p>
	 *
	 * @return an object value of {@code WriterAccountId} (of the current {@link TransactionContext})  May be <code>null</code>.
	 */
	public java.lang.Integer getWriterAccountIdAsObject();

	/**
	 * object accessor for the {@code WriterAccountId} with substitution for a null value
	 *
	 * <p>The {@code WriterAccountId} field is a direct mapping of the {@code writer_account_id} database column in the table {@code question}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code WriterAccountId} is {@code null}.
	 * @return an object value of {@code WriterAccountId} (of the current {@link TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getWriterAccountIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getWriterAccountIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code WriterAccountId}
	 *
	 * <p>The {@code WriterAccountId} field is a direct mapping of the {@code writer_account_id} database column in the table {@code question}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getWriterAccountIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code WriterAccountId} (of the current {@link TransactionContext})
	 * @throws NullValueException when the internal value is null
	 */
	default public int getWriterAccountId() throws com.opal.NullValueException {
		java.lang.Integer lclO = getWriterAccountIdAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getWriterAccountId(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getWriterAccountIdAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getWriterAccountId(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getWriterAccountIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * sets the {@code WriterAccountId} to the value of {@code argWriterAccountId}
	 *
	 * @param argWriterAccountId the new value of {@code WriterAccountId}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 */
	public com.scobolsolo.application.Question setWriterAccountId(java.lang.Integer argWriterAccountId);

	/**
	 * sets the {@code WriterAccountId} to the value of {@code argWriterAccountId}
	 *
	 * @param argWriterAccountId the new value of {@code WriterAccountId}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.Question setWriterAccountId(int argWriterAccountId);

	/**
	 * object accessor for the {@code Text}
	 *
	 * <p>The {@code Text} field is a direct mapping of the {@code text} field in {@code question}.</p>
	 *
	 * @return an object value of {@code Text} (of the current {@link TransactionContext})  May be <code>null</code>.
	 */
	public java.lang.String getText();

	/**
	 * object accessor for the {@code Text} with substitution for a null value
	 *
	 * <p>The {@code Text} field is a direct mapping of the {@code text} database column in the table {@code question}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code Text} is {@code null}.
	 * @return an object value of {@code Text} (of the current {@link TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getText(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getText();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the {@code Text} to the value of {@code argText}
	 *
	 * @param argText the new value of {@code Text}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * @throws ArgumentTooLongException if {@code argText} is longer than 2147483647 characters
	 * <p>The database column {@code text} is limited to 2147483647 characters.</p>
	 *
	 */
	@com.opal.annotation.Length(maximum = 2147483647L)
	public com.scobolsolo.application.Question setText(java.lang.String argText);

	/**
	 * object accessor for the {@code Answer}
	 *
	 * <p>The {@code Answer} field is a direct mapping of the {@code answer} field in {@code question}.</p>
	 *
	 * @return an object value of {@code Answer} (of the current {@link TransactionContext})  May be <code>null</code>.
	 */
	public java.lang.String getAnswer();

	/**
	 * object accessor for the {@code Answer} with substitution for a null value
	 *
	 * <p>The {@code Answer} field is a direct mapping of the {@code answer} database column in the table {@code question}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code Answer} is {@code null}.
	 * @return an object value of {@code Answer} (of the current {@link TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getAnswer(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getAnswer();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the {@code Answer} to the value of {@code argAnswer}
	 *
	 * @param argAnswer the new value of {@code Answer}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * @throws ArgumentTooLongException if {@code argAnswer} is longer than 2147483647 characters
	 * <p>The database column {@code answer} is limited to 2147483647 characters.</p>
	 *
	 */
	@com.opal.annotation.Length(maximum = 2147483647L)
	public com.scobolsolo.application.Question setAnswer(java.lang.String argAnswer);

	/**
	 * @return the {@code com.scobolsolo.application.Category}
	 * The returned {@code com.scobolsolo.application.Category} is the {@link UserFacing} object corresponding to the entry in {@code category} that is referenced by {@code question_category_code_fkey}.
	 *
	 */
	public com.scobolsolo.application.Category getCategory();
	public com.scobolsolo.application.Question setCategory(com.scobolsolo.application.Category argCategory);

	/**
	 * @return the {@code com.scobolsolo.application.Account}
	 * The returned {@code com.scobolsolo.application.Account} is the {@link UserFacing} object corresponding to the entry in {@code account} that is referenced by {@code question_writer_account_id_fkey}.
	 *
	 */
	public com.scobolsolo.application.Account getWriter();
	public com.scobolsolo.application.Question setWriter(com.scobolsolo.application.Account argWriter);

	public int getDiffCount();
	public java.util.Iterator<com.scobolsolo.application.Diff> createDiffIterator();

	public java.util.stream.Stream<com.scobolsolo.application.Diff> streamDiff();

	public void addDiff(com.scobolsolo.application.Diff argDiff);
	public void removeDiff(com.scobolsolo.application.Diff argDiff);
	public void clearDiff();

	default public <T extends java.util.Collection<? super com.scobolsolo.application.Diff>> T acquireDiff(T argC) {
		if (argC == null) { throw new IllegalArgumentException("Target Collection is null."); }
		java.util.Iterator<com.scobolsolo.application.Diff> lclI = createDiffIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public com.scobolsolo.application.Diff[] createDiffArray() {
		int lclLength = getDiffCount();
		com.scobolsolo.application.Diff[] lclA = new com.scobolsolo.application.Diff[lclLength];
		int lclIndex = 0;
		java.util.Iterator<com.scobolsolo.application.Diff> lclI = createDiffIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

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
