package com.scobolsolo.persistence;

import com.scobolsolo.application.Category;

public final class CategoryOpal extends com.opal.UpdatableOpal<Category> {

	public static final java.lang.Boolean ourDefaultAllowPronunciationGuideSuppression = java.lang.Boolean.TRUE;

	private CategoryOpal() {
		super();
		setUserFacing(null);
	}

	public CategoryOpal(com.opal.IdentityOpalFactory<Category, CategoryOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void applyDefaults() {
		/* Initialize fields with their default values. */
		getNewValues()[5] = ourDefaultAllowPronunciationGuideSuppression;


		/* Initialize the back Collections to empty sets. */

		myPronunciationGuideSuppressionSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
				this,
				ourPronunciationGuideSuppressionOpalLoader,
				true
				);
		myQuestionSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
				this,
				ourQuestionOpalLoader,
				true
				);
		myDiffSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
				this,
				ourDiffOpalLoader,
				true
				);
		myCategoryUseSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
				this,
				ourCategoryUseOpalLoader,
				true
				);
		myPlacementSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
				this,
				ourPlacementOpalLoader,
				true
				);

		return;
	}

	@Override
	protected void initializeReferences() {
		myOldCategoryGroupOpal = CategoryGroupOpal.NOT_YET_LOADED;
		return;
	}

	/* package */ static final String[] ourFieldNames = new String[] {
		"Code",
		"Name",
		"ShortName",
		"Sequence",
		"CategoryGroupCode",
		"AllowPronunciationGuideSuppression",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.String.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.Integer.class,
		java.lang.String.class,
		java.lang.Boolean.class,
	};

	/* package */ static final boolean[] ourFieldNullability = new boolean[] {
		false,
		false,
		false,
		false,
		false,
		false,
	};

	/* package */ static final com.opal.FieldValidator[] ourFieldValidators = new com.opal.FieldValidator[] {
		null,
		null,
		null,
		null,
		null,
		null,
	};

	public static final CategoryOpal NOT_YET_LOADED = new CategoryOpal();

	public static String[] getStaticFieldNames() { return ourFieldNames; }

	public static Class<?>[] getStaticFieldTypes() { return ourFieldTypes; }

	@Override
	public Class<?>[] getFieldTypes() { return ourFieldTypes; }

	public static boolean[] getStaticFieldNullability() { return ourFieldNullability; }

	@Override
	public com.opal.FieldValidator[] getFieldValidators() { return ourFieldValidators; }

	@Override
	public boolean[] getFieldNullability() { return ourFieldNullability; }

	public static com.opal.FieldValidator[] getStaticFieldValidators() { return ourFieldValidators; }


	public synchronized java.lang.String getCode() {
		return (java.lang.String) getReadValueSet()[0];
	}

	public synchronized java.lang.String getName() {
		return (java.lang.String) getReadValueSet()[1];
	}

	public synchronized java.lang.String getShortName() {
		return (java.lang.String) getReadValueSet()[2];
	}

	public synchronized java.lang.Integer getSequenceAsObject() {
		return (java.lang.Integer) getReadValueSet()[3];
	}

	public synchronized java.lang.String getCategoryGroupCode() {
		return (java.lang.String) getReadValueSet()[4];
	}

	public synchronized java.lang.Boolean isAllowPronunciationGuideSuppressionAsObject() {
		return (java.lang.Boolean) getReadValueSet()[5];
	}

	public synchronized CategoryOpal setCode(final java.lang.String argCode) {
		tryMutate();
		if (argCode == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myCode on " + this + " to null.");
		}
		if (argCode.length() > 32) {
			throw new com.opal.ArgumentTooLongException("Cannot set myCode on " + this + " to \"" + argCode + "\" because that field's maximum length is 32.", argCode.length(), 32);
		}
		getNewValues()[0] = argCode;
		return this;
	}

	public synchronized CategoryOpal setName(final java.lang.String argName) {
		tryMutate();
		if (argName == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myName on " + this + " to null.");
		}
		if (argName.length() > 256) {
			throw new com.opal.ArgumentTooLongException("Cannot set myName on " + this + " to \"" + argName + "\" because that field's maximum length is 256.", argName.length(), 256);
		}
		getNewValues()[1] = argName;
		return this;
	}

	public synchronized CategoryOpal setShortName(final java.lang.String argShortName) {
		tryMutate();
		if (argShortName == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myShortName on " + this + " to null.");
		}
		if (argShortName.length() > 32) {
			throw new com.opal.ArgumentTooLongException("Cannot set myShortName on " + this + " to \"" + argShortName + "\" because that field's maximum length is 32.", argShortName.length(), 32);
		}
		getNewValues()[2] = argShortName;
		return this;
	}

	public synchronized CategoryOpal setSequence(final java.lang.Integer argSequence) {
		tryMutate();
		if (argSequence == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set mySequence on " + this + " to null.");
		}
		getNewValues()[3] = argSequence;
		return this;
	}

	public CategoryOpal setSequence(final int argSequence) {
		setSequence(java.lang.Integer.valueOf(argSequence));
		return this;
	}

	public synchronized CategoryOpal setCategoryGroupCode(final java.lang.String argCategoryGroupCode) {
		tryMutate();
		if (argCategoryGroupCode == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myCategoryGroupCode on " + this + " to null.");
		}
		if (argCategoryGroupCode.length() > 32) {
			throw new com.opal.ArgumentTooLongException("Cannot set myCategoryGroupCode on " + this + " to \"" + argCategoryGroupCode + "\" because that field's maximum length is 32.", argCategoryGroupCode.length(), 32);
		}
		getNewValues()[4] = argCategoryGroupCode;
		return this;
	}

	public synchronized CategoryOpal setAllowPronunciationGuideSuppression(final java.lang.Boolean argAllowPronunciationGuideSuppression) {
		tryMutate();
		if (argAllowPronunciationGuideSuppression == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myAllowPronunciationGuideSuppression on " + this + " to null.");
		}
		getNewValues()[5] = argAllowPronunciationGuideSuppression;
		return this;
	}

	public CategoryOpal setAllowPronunciationGuideSuppression(final boolean argAllowPronunciationGuideSuppression) {
		setAllowPronunciationGuideSuppression(argAllowPronunciationGuideSuppression ? Boolean.TRUE : Boolean.FALSE);
		return this;
	}

	private boolean myClearOldCollections = false;

	protected boolean needsToClearOldCollections() {
		return myClearOldCollections;
	}

	protected final void setClearOldCollections(boolean argValue) {
		myClearOldCollections = argValue;
	}

	@Override
	protected /* synchronized */ void copyOldValuesToNewInternal() {
		myNewCategoryGroupOpal = myOldCategoryGroupOpal;
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		myOldCategoryGroupOpal = myNewCategoryGroupOpal;

		return;
	}

	@Override
	protected void unlinkInternal() {
		getPronunciationGuideSuppressionOpalSet().clear();
		getQuestionOpalSet().clear();
		getDiffOpalSet().clear();
		getCategoryUseOpalSet().clear();
		getPlacementOpalSet().clear();
		if (getCategoryGroupOpal() != null) {
			getCategoryGroupOpal().getCategoryOpalSet().removeInternal(this);
		}
		return;
	}

	@Override
	protected void copyFieldsToInternal(com.opal.UpdatableOpal<Category> argTarget) {
		Object[] lclValues = getReadValueSet();
		Object[] lclTargetNewValues = argTarget.getNewValues();
		/* Field 0 (Code) is part of a unique key. */
		/* Field 1 (Name) is part of a unique key. */
		/* Field 2 (ShortName) is part of a unique key. */
		lclTargetNewValues[3] = lclValues[3]; /* Sequence (immutable) */
		lclTargetNewValues[4] = lclValues[4]; /* CategoryGroupCode (immutable) */
		lclTargetNewValues[5] = lclValues[5]; /* AllowPronunciationGuideSuppression (immutable) */

		return;
	}

	@Override
	public synchronized void translateReferencesToFields() {
		if (myNewCategoryGroupOpal != CategoryGroupOpal.NOT_YET_LOADED) {
			setCategoryGroupCode(myNewCategoryGroupOpal == null ? null : myNewCategoryGroupOpal.getCode());
		}
		return;
	}

	@Override
	public java.util.Set<com.opal.TransactionAware> getRequiredPriorCommits() {
		java.util.Set<com.opal.TransactionAware> lclTAs = null;
		com.opal.UpdatableOpal<?> lclUO;
		lclUO = myNewCategoryGroupOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		return (lclTAs != null) && (lclTAs.size() > 0) ? lclTAs : java.util.Collections.emptySet();
	}

	@Override
	public java.util.Set<com.opal.TransactionAware> getRequiredSubsequentCommits() {
		if (isNew()) {
			return java.util.Collections.emptySet();
		}
		java.util.Set<com.opal.TransactionAware> lclTAs = null;
		com.opal.UpdatableOpal<?> lclUO;
		if ((lclUO = myOldCategoryGroupOpal) == CategoryGroupOpal.NOT_YET_LOADED) {
			lclUO = myOldCategoryGroupOpal = retrieveCategoryGroupOpal(getOldValues());
		}
		if (lclUO != null && (lclUO.exists() == false)) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		return (lclTAs != null) && (lclTAs.size() > 0) ? lclTAs : java.util.Collections.emptySet();
	}

	@Override
	public Object[] getPrimaryKeyWhereClauseValues() {
		return new Object[] {getOldValues()[0], };
	}

	private static int getFieldCountInternal() { return ourFieldNames.length; }

	@Override
	protected int getFieldCount() { return getFieldCountInternal(); }

	@Override
	protected String[] getFieldNames() { return ourFieldNames; }

	@Override
	public synchronized void output(final java.io.PrintStream argOutput) {
		argOutput.println("Code = " + getCode());
		argOutput.println("Name = " + getName());
		argOutput.println("ShortName = " + getShortName());
		argOutput.println("Sequence = " + getSequenceAsObject());
		argOutput.println("CategoryGroupCode = " + getCategoryGroupCode());
		argOutput.println("AllowPronunciationGuideSuppression = " + isAllowPronunciationGuideSuppressionAsObject());
	}

	@Override
	public synchronized void output(final java.io.PrintWriter argOutput) {
		argOutput.println("Code = " + getCode());
		argOutput.println("Name = " + getName());
		argOutput.println("ShortName = " + getShortName());
		argOutput.println("Sequence = " + getSequenceAsObject());
		argOutput.println("CategoryGroupCode = " + getCategoryGroupCode());
		argOutput.println("AllowPronunciationGuideSuppression = " + isAllowPronunciationGuideSuppressionAsObject());
	}

	private CategoryGroupOpal myOldCategoryGroupOpal;
	private CategoryGroupOpal myNewCategoryGroupOpal;

	protected CategoryGroupOpal retrieveCategoryGroupOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[4] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getCategoryGroupOpalFactory().forCode(getCategoryGroupCode());
	}

	public synchronized CategoryGroupOpal getCategoryGroupOpal() {
		CategoryGroupOpal lclCategoryGroupOpal;
		boolean lclAccess = tryAccess();
		lclCategoryGroupOpal = lclAccess ? myNewCategoryGroupOpal : myOldCategoryGroupOpal;
		if (lclCategoryGroupOpal == CategoryGroupOpal.NOT_YET_LOADED) {
			lclCategoryGroupOpal = retrieveCategoryGroupOpal(getReadValueSet());
			if (lclAccess) {
				myNewCategoryGroupOpal = lclCategoryGroupOpal;
			} else {
				myOldCategoryGroupOpal = lclCategoryGroupOpal;
			}
		}
		return lclCategoryGroupOpal;
	}

	public synchronized CategoryOpal setCategoryGroupOpal(CategoryGroupOpal argCategoryGroupOpal) {
		tryMutate();
		CategoryGroupOpal lclCategoryGroupOpal = getCategoryGroupOpal();
		if (lclCategoryGroupOpal == argCategoryGroupOpal) { return this; }
		if (lclCategoryGroupOpal != null) {
			lclCategoryGroupOpal.getCategoryOpalSet().removeInternal(this);
		}
		myNewCategoryGroupOpal = argCategoryGroupOpal;
		if (argCategoryGroupOpal != null) {
			argCategoryGroupOpal.getCategoryOpalSet().addInternal(this);
		}
		return this;
	}

	protected synchronized void setCategoryGroupOpalInternal(CategoryGroupOpal argCategoryGroupOpal) {
		tryMutate();
		myNewCategoryGroupOpal = argCategoryGroupOpal;
	}

	private com.opal.types.OpalBackCollectionSet<PronunciationGuideSuppressionOpal, CategoryOpal> myPronunciationGuideSuppressionSet = null;

	private static final com.opal.types.OpalBackCollectionLoader<PronunciationGuideSuppressionOpal, CategoryOpal> ourPronunciationGuideSuppressionOpalLoader = 
			new com.opal.types.OpalBackCollectionLoader<>(
					OpalFactoryFactory.getInstance().getPronunciationGuideSuppressionOpalFactory()::forCategoryOpalCollection,
					OpalFactoryFactory.getInstance().getPronunciationGuideSuppressionOpalFactory()::forCategoryOpalCount,
					PronunciationGuideSuppressionOpal::setCategoryOpal,
					PronunciationGuideSuppressionOpal::setCategoryOpalInternal,
					PronunciationGuideSuppressionOpal::getCategoryOpal,
					com.scobolsolo.application.FactoryMap.getNoArgCtorSetCreator(),
					com.scobolsolo.application.FactoryMap.getCollectionArgSetCreator(),
					false
					);

	/* package */ synchronized com.opal.types.OpalBackCollectionSet<PronunciationGuideSuppressionOpal, CategoryOpal> getPronunciationGuideSuppressionOpalSet() {
		if (myPronunciationGuideSuppressionSet == null) {
			myPronunciationGuideSuppressionSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
					this,
					ourPronunciationGuideSuppressionOpalLoader,
					isNew()
					);
		}
		return myPronunciationGuideSuppressionSet;
	}

	private com.opal.types.OpalBackCollectionSet<QuestionOpal, CategoryOpal> myQuestionSet = null;

	private static final com.opal.types.OpalBackCollectionLoader<QuestionOpal, CategoryOpal> ourQuestionOpalLoader = 
			new com.opal.types.OpalBackCollectionLoader<>(
					OpalFactoryFactory.getInstance().getQuestionOpalFactory()::forCategoryOpalCollection,
					OpalFactoryFactory.getInstance().getQuestionOpalFactory()::forCategoryOpalCount,
					QuestionOpal::setCategoryOpal,
					QuestionOpal::setCategoryOpalInternal,
					QuestionOpal::getCategoryOpal,
					com.scobolsolo.application.FactoryMap.getNoArgCtorSetCreator(),
					com.scobolsolo.application.FactoryMap.getCollectionArgSetCreator(),
					false
					);

	/* package */ synchronized com.opal.types.OpalBackCollectionSet<QuestionOpal, CategoryOpal> getQuestionOpalSet() {
		if (myQuestionSet == null) {
			myQuestionSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
					this,
					ourQuestionOpalLoader,
					isNew()
					);
		}
		return myQuestionSet;
	}

	private com.opal.types.OpalBackCollectionSet<DiffOpal, CategoryOpal> myDiffSet = null;

	private static final com.opal.types.OpalBackCollectionLoader<DiffOpal, CategoryOpal> ourDiffOpalLoader = 
			new com.opal.types.OpalBackCollectionLoader<>(
					OpalFactoryFactory.getInstance().getDiffOpalFactory()::forCategoryOpalCollection,
					OpalFactoryFactory.getInstance().getDiffOpalFactory()::forCategoryOpalCount,
					DiffOpal::setCategoryOpal,
					DiffOpal::setCategoryOpalInternal,
					DiffOpal::getCategoryOpal,
					com.scobolsolo.application.FactoryMap.getNoArgCtorSetCreator(),
					com.scobolsolo.application.FactoryMap.getCollectionArgSetCreator(),
					false
					);

	/* package */ synchronized com.opal.types.OpalBackCollectionSet<DiffOpal, CategoryOpal> getDiffOpalSet() {
		if (myDiffSet == null) {
			myDiffSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
					this,
					ourDiffOpalLoader,
					isNew()
					);
		}
		return myDiffSet;
	}

	private com.opal.types.OpalBackCollectionSet<CategoryUseOpal, CategoryOpal> myCategoryUseSet = null;

	private static final com.opal.types.OpalBackCollectionLoader<CategoryUseOpal, CategoryOpal> ourCategoryUseOpalLoader = 
			new com.opal.types.OpalBackCollectionLoader<>(
					OpalFactoryFactory.getInstance().getCategoryUseOpalFactory()::forCategoryOpalCollection,
					OpalFactoryFactory.getInstance().getCategoryUseOpalFactory()::forCategoryOpalCount,
					CategoryUseOpal::setCategoryOpal,
					CategoryUseOpal::setCategoryOpalInternal,
					CategoryUseOpal::getCategoryOpal,
					com.scobolsolo.application.FactoryMap.getNoArgCtorSetCreator(),
					com.scobolsolo.application.FactoryMap.getCollectionArgSetCreator(),
					false
					);

	/* package */ synchronized com.opal.types.OpalBackCollectionSet<CategoryUseOpal, CategoryOpal> getCategoryUseOpalSet() {
		if (myCategoryUseSet == null) {
			myCategoryUseSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
					this,
					ourCategoryUseOpalLoader,
					isNew()
					);
		}
		return myCategoryUseSet;
	}

	private com.opal.types.OpalBackCollectionSet<PlacementOpal, CategoryOpal> myPlacementSet = null;

	private static final com.opal.types.OpalBackCollectionLoader<PlacementOpal, CategoryOpal> ourPlacementOpalLoader = 
			new com.opal.types.OpalBackCollectionLoader<>(
					OpalFactoryFactory.getInstance().getPlacementOpalFactory()::forCategoryOpalCollection,
					OpalFactoryFactory.getInstance().getPlacementOpalFactory()::forCategoryOpalCount,
					PlacementOpal::setCategoryOpal,
					PlacementOpal::setCategoryOpalInternal,
					PlacementOpal::getCategoryOpal,
					com.scobolsolo.application.FactoryMap.getNoArgCtorSetCreator(),
					com.scobolsolo.application.FactoryMap.getCollectionArgSetCreator(),
					false
					);

	/* package */ synchronized com.opal.types.OpalBackCollectionSet<PlacementOpal, CategoryOpal> getPlacementOpalSet() {
		if (myPlacementSet == null) {
			myPlacementSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
					this,
					ourPlacementOpalLoader,
					isNew()
					);
		}
		return myPlacementSet;
	}

	@Override
	public java.lang.String toString() {
		java.lang.StringBuilder lclSB = new java.lang.StringBuilder(64);
		lclSB.append("CategoryOpal[");
		lclSB.append("myCode=");
		lclSB.append(toStringField(0));
		lclSB.append(']');
		return lclSB.toString();
	}

	@Override
	protected void updateReferencesAfterReload() {
		if (myNewCategoryGroupOpal != CategoryGroupOpal.NOT_YET_LOADED) {
			setCategoryGroupOpal(retrieveCategoryGroupOpal(getNewValues()));
		}
	}

	@Override
	protected void updateCollectionsAfterReload() {
		assert needsToClearOldCollections() == false;
		setClearOldCollections(true);
	}

}
