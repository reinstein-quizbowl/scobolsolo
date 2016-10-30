package com.scobolsolo.persistence;


/**
 * represents a {@code PronunciationGuideSuppression} from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from {@code pronunciation_guide_suppression}.  Do not modify this class directly; instead, alter the permanent storage on which it is based, the Opal configuration file for the project, and/or the {@link com.scobolsolo.application.PronunciationGuideSuppression}, and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various {@code forXXX} methods on the {@link com.scobolsolo.application.PronunciationGuideSuppressionFactory} factory class.  To create new instances, use the {@code create()} method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link com.opal.TransactionContext}.</p>
 *
 * <p>This interface is not meant to be referenced in user code.  Only the {@link com.scobolsolo.application.PronunciationGuideSuppression} and the {@link com.scobolsolo.application.PronunciationGuideSuppressionFactory} class should be referenced directly.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
	@com.opal.annotation.Creatability(creatable = true)
	@com.opal.annotation.Updatability(updatable = true)
public interface PronunciationGuideSuppressionUserFacing extends com.opal.IdentityUserFacing {

	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the {@code Id}
	 *
	 * <p>The {@code Id} field is a direct mapping of the {@code id} field in {@code pronunciation_guide_suppression}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getId() method.</p>
	 *
	 * @return an object value of {@code Id} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	public java.lang.Integer getIdAsObject();

	/**
	 * primitive accessor for the {@code Id}
	 *
	 * <p>The {@code Id} field is a direct mapping of the {@code id} database column in the table {@code pronunciation_guide_suppression}.</p>
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
	 * @throws com.opal.IllegalNullArgumentException if argId is null
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	public com.scobolsolo.application.PronunciationGuideSuppression setId(java.lang.Integer argId);

	/**
	 * sets the {@code Id} to the value of {@code argId}
	 *
	 * @param argId the new value of {@code Id}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.PronunciationGuideSuppression setId(int argId);

	/**
	 * object accessor for the {@code AccountId}
	 *
	 * <p>The {@code AccountId} field is a direct mapping of the {@code account_id} field in {@code pronunciation_guide_suppression}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getAccountId() method.</p>
	 *
	 * @return an object value of {@code AccountId} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	public java.lang.Integer getAccountIdAsObject();

	/**
	 * primitive accessor for the {@code AccountId}
	 *
	 * <p>The {@code AccountId} field is a direct mapping of the {@code account_id} database column in the table {@code pronunciation_guide_suppression}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getAccountIdAsObject() method.</p>
	 *
	 * @return the primitive value of {@code AccountId} (of the current {@link com.opal.TransactionContext})
	 */
	default public int getAccountId() {
		java.lang.Integer lclO = getAccountIdAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the {@code AccountId} to the value of {@code argAccountId}
	 *
	 * @param argAccountId the new value of {@code AccountId}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code account_id} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argAccountId is null
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	public com.scobolsolo.application.PronunciationGuideSuppression setAccountId(java.lang.Integer argAccountId);

	/**
	 * sets the {@code AccountId} to the value of {@code argAccountId}
	 *
	 * @param argAccountId the new value of {@code AccountId}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.PronunciationGuideSuppression setAccountId(int argAccountId);

	/**
	 * object accessor for the {@code CategoryCode}
	 *
	 * <p>The {@code CategoryCode} field is a direct mapping of the {@code category_code} field in {@code pronunciation_guide_suppression}.</p>
	 *
	 * @return an object value of {@code CategoryCode} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	public java.lang.String getCategoryCode();

	/**
	 * sets the {@code CategoryCode} to the value of {@code argCategoryCode}
	 *
	 * @param argCategoryCode the new value of {@code CategoryCode}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code category_code} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argCategoryCode is null
	 * @throws com.opal.ArgumentTooLongException if {@code argCategoryCode} is longer than 32 characters
	 * <p>The database column {@code category_code} is limited to 32 characters.</p>
	 *
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	public com.scobolsolo.application.PronunciationGuideSuppression setCategoryCode(java.lang.String argCategoryCode);

	/**
	 * @return the {@code com.scobolsolo.application.Account}
	 * The returned {@code com.scobolsolo.application.Account} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code account} that is referenced by {@code pronunciation_guide_suppression_account_id_fkey}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = false)
	public com.scobolsolo.application.Account getAccount();
	public com.scobolsolo.application.PronunciationGuideSuppression setAccount(com.scobolsolo.application.Account argAccount);

	/**
	 * @return the {@code com.scobolsolo.application.Category}
	 * The returned {@code com.scobolsolo.application.Category} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code category} that is referenced by {@code pronunciation_guide_suppression_category_code_fkey}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = false)
	public com.scobolsolo.application.Category getCategory();
	public com.scobolsolo.application.PronunciationGuideSuppression setCategory(com.scobolsolo.application.Category argCategory);

	public com.scobolsolo.application.PronunciationGuideSuppression copy();

	/** This is a Comparator that can be used to compare PronunciationGuideSuppression objects based on their {@code Id} values. */

	public static class IdComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.PronunciationGuideSuppression> {
		private static final IdComparator ourInstance = new IdComparator();
		public static final IdComparator getInstance() { return ourInstance; }

		private IdComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.PronunciationGuideSuppression argFirst, com.scobolsolo.application.PronunciationGuideSuppression argSecond) {
			return argFirst.getIdAsObject().compareTo(argSecond.getIdAsObject());
		}
	}

}
