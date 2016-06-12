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

		myNewPronunciationGuideSuppressionOpalFast3Set = new com.siliconage.util.Fast3Set<>();
		myNewQuestionOpalHashSet = new java.util.HashSet<>();
		myNewDiffOpalHashSet = new java.util.HashSet<>();
		myNewCategoryUseOpalHashSet = new java.util.HashSet<>();
		myNewPlacementOpalHashSet = new java.util.HashSet<>();

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
		myNewPronunciationGuideSuppressionOpalFast3Set = null; /* Necessary if it has been rolled back */
		myPronunciationGuideSuppressionOpalCachedOperations = null; /* Ditto */
		myNewQuestionOpalHashSet = null; /* Necessary if it has been rolled back */
		myQuestionOpalCachedOperations = null; /* Ditto */
		myNewDiffOpalHashSet = null; /* Necessary if it has been rolled back */
		myDiffOpalCachedOperations = null; /* Ditto */
		myNewCategoryUseOpalHashSet = null; /* Necessary if it has been rolled back */
		myCategoryUseOpalCachedOperations = null; /* Ditto */
		myNewPlacementOpalHashSet = null; /* Necessary if it has been rolled back */
		myPlacementOpalCachedOperations = null; /* Ditto */
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		myOldCategoryGroupOpal = myNewCategoryGroupOpal;

		if (needsToClearOldCollections()) {
			myOldPronunciationGuideSuppressionOpalFast3Set = null;
			myOldQuestionOpalHashSet = null;
			myOldDiffOpalHashSet = null;
			myOldCategoryUseOpalHashSet = null;
			myOldPlacementOpalHashSet = null;
		} else {
			if (myNewPronunciationGuideSuppressionOpalFast3Set != null) {
				if (myNewPronunciationGuideSuppressionOpalFast3Set.size() > 0) {
					myOldPronunciationGuideSuppressionOpalFast3Set = myNewPronunciationGuideSuppressionOpalFast3Set;
				} else {
					myOldPronunciationGuideSuppressionOpalFast3Set = java.util.Collections.emptySet();
				}
				myNewPronunciationGuideSuppressionOpalFast3Set = null;
			} else {
				myPronunciationGuideSuppressionOpalCachedOperations = null;
			}
			if (myNewQuestionOpalHashSet != null) {
				if (myNewQuestionOpalHashSet.size() > 0) {
					myOldQuestionOpalHashSet = myNewQuestionOpalHashSet;
				} else {
					myOldQuestionOpalHashSet = java.util.Collections.emptySet();
				}
				myNewQuestionOpalHashSet = null;
			} else {
				myQuestionOpalCachedOperations = null;
			}
			if (myNewDiffOpalHashSet != null) {
				if (myNewDiffOpalHashSet.size() > 0) {
					myOldDiffOpalHashSet = myNewDiffOpalHashSet;
				} else {
					myOldDiffOpalHashSet = java.util.Collections.emptySet();
				}
				myNewDiffOpalHashSet = null;
			} else {
				myDiffOpalCachedOperations = null;
			}
			if (myNewCategoryUseOpalHashSet != null) {
				if (myNewCategoryUseOpalHashSet.size() > 0) {
					myOldCategoryUseOpalHashSet = myNewCategoryUseOpalHashSet;
				} else {
					myOldCategoryUseOpalHashSet = java.util.Collections.emptySet();
				}
				myNewCategoryUseOpalHashSet = null;
			} else {
				myCategoryUseOpalCachedOperations = null;
			}
			if (myNewPlacementOpalHashSet != null) {
				if (myNewPlacementOpalHashSet.size() > 0) {
					myOldPlacementOpalHashSet = myNewPlacementOpalHashSet;
				} else {
					myOldPlacementOpalHashSet = java.util.Collections.emptySet();
				}
				myNewPlacementOpalHashSet = null;
			} else {
				myPlacementOpalCachedOperations = null;
			}
		}
		setClearOldCollections(false);
		return;
	}

	@Override
	protected void unlinkInternal() {
		java.util.Iterator<?> lclI;
		if (myNewPronunciationGuideSuppressionOpalFast3Set != null || myPronunciationGuideSuppressionOpalCachedOperations != null) {
			lclI = createPronunciationGuideSuppressionOpalIterator();
			while (lclI.hasNext()) {
				((PronunciationGuideSuppressionOpal) lclI.next()).setCategoryOpalInternal(null);
			}
		}
		if (myNewQuestionOpalHashSet != null || myQuestionOpalCachedOperations != null) {
			lclI = createQuestionOpalIterator();
			while (lclI.hasNext()) {
				((QuestionOpal) lclI.next()).setCategoryOpalInternal(null);
			}
		}
		if (myNewDiffOpalHashSet != null || myDiffOpalCachedOperations != null) {
			lclI = createDiffOpalIterator();
			while (lclI.hasNext()) {
				((DiffOpal) lclI.next()).setCategoryOpalInternal(null);
			}
		}
		if (myNewCategoryUseOpalHashSet != null || myCategoryUseOpalCachedOperations != null) {
			lclI = createCategoryUseOpalIterator();
			while (lclI.hasNext()) {
				((CategoryUseOpal) lclI.next()).setCategoryOpalInternal(null);
			}
		}
		if (myNewPlacementOpalHashSet != null || myPlacementOpalCachedOperations != null) {
			lclI = createPlacementOpalIterator();
			while (lclI.hasNext()) {
				((PlacementOpal) lclI.next()).setCategoryOpalInternal(null);
			}
		}
		if (getCategoryGroupOpal() != null) {
			getCategoryGroupOpal().removeCategoryOpalInternal(this);
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
		if (lclUO != null && lclUO.isDeleted()) {
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
			lclCategoryGroupOpal.removeCategoryOpalInternal(this);
		}
		myNewCategoryGroupOpal = argCategoryGroupOpal;
		if (argCategoryGroupOpal != null) {
			argCategoryGroupOpal.addCategoryOpalInternal(this);
		}
		return this;
	}

	protected synchronized void setCategoryGroupOpalInternal(CategoryGroupOpal argCategoryGroupOpal) {
		tryMutate();
		myNewCategoryGroupOpal = argCategoryGroupOpal;
	}

	private java.util.Set<PronunciationGuideSuppressionOpal> myOldPronunciationGuideSuppressionOpalFast3Set = null;
	private java.util.Set<PronunciationGuideSuppressionOpal> myNewPronunciationGuideSuppressionOpalFast3Set = null;
	private java.util.ArrayList<com.opal.CachedOperation<PronunciationGuideSuppressionOpal>> myPronunciationGuideSuppressionOpalCachedOperations = null;

	/* package */ java.util.Set<PronunciationGuideSuppressionOpal> getPronunciationGuideSuppressionOpalFast3Set() {
		if (tryAccess()) {
			if (myNewPronunciationGuideSuppressionOpalFast3Set == null) {
				if (myOldPronunciationGuideSuppressionOpalFast3Set == null) {
					if (isNew()) {
						myOldPronunciationGuideSuppressionOpalFast3Set = java.util.Collections.emptySet();
					} else {
						java.util.Set<PronunciationGuideSuppressionOpal> lclS;
						lclS = OpalFactoryFactory.getInstance().getPronunciationGuideSuppressionOpalFactory().forCategoryCodeCollection(getCode());
						myOldPronunciationGuideSuppressionOpalFast3Set = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
					}
				}
				myNewPronunciationGuideSuppressionOpalFast3Set = new com.siliconage.util.Fast3Set<>(myOldPronunciationGuideSuppressionOpalFast3Set);
				if (myPronunciationGuideSuppressionOpalCachedOperations != null) {
					com.opal.OpalUtility.handleCachedOperations(myPronunciationGuideSuppressionOpalCachedOperations, myNewPronunciationGuideSuppressionOpalFast3Set);
					myPronunciationGuideSuppressionOpalCachedOperations = null;
				}
			}
			return myNewPronunciationGuideSuppressionOpalFast3Set;
		} else {
			if (myOldPronunciationGuideSuppressionOpalFast3Set == null) {
				java.util.Set<PronunciationGuideSuppressionOpal> lclS;
				lclS = OpalFactoryFactory.getInstance().getPronunciationGuideSuppressionOpalFactory().forCategoryCodeCollection(getCode());
				myOldPronunciationGuideSuppressionOpalFast3Set = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
			}
			return myOldPronunciationGuideSuppressionOpalFast3Set;
		}
	}

	public synchronized void addPronunciationGuideSuppressionOpal(PronunciationGuideSuppressionOpal argPronunciationGuideSuppressionOpal) {
		tryMutate();
		argPronunciationGuideSuppressionOpal.setCategoryOpal(this);
		return;
	}

	protected synchronized void addPronunciationGuideSuppressionOpalInternal(PronunciationGuideSuppressionOpal argPronunciationGuideSuppressionOpal) {
		tryMutate();
		if (myNewPronunciationGuideSuppressionOpalFast3Set == null) {
			if (myOldPronunciationGuideSuppressionOpalFast3Set == null) {
				if (myPronunciationGuideSuppressionOpalCachedOperations == null) { myPronunciationGuideSuppressionOpalCachedOperations = new java.util.ArrayList<>(); }
				myPronunciationGuideSuppressionOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.ADD, argPronunciationGuideSuppressionOpal));
			} else {
				myNewPronunciationGuideSuppressionOpalFast3Set = new com.siliconage.util.Fast3Set<>(myOldPronunciationGuideSuppressionOpalFast3Set);
				myNewPronunciationGuideSuppressionOpalFast3Set.add(argPronunciationGuideSuppressionOpal);
			}
		} else {
			myNewPronunciationGuideSuppressionOpalFast3Set.add(argPronunciationGuideSuppressionOpal);
		}
		return;
	}

	public synchronized void removePronunciationGuideSuppressionOpal(PronunciationGuideSuppressionOpal argPronunciationGuideSuppressionOpal) {
		tryMutate();
		argPronunciationGuideSuppressionOpal.setCategoryOpal(null);
	}

	protected synchronized void removePronunciationGuideSuppressionOpalInternal(PronunciationGuideSuppressionOpal argPronunciationGuideSuppressionOpal) {
		tryMutate();
		if (myNewPronunciationGuideSuppressionOpalFast3Set == null) {
			if (myOldPronunciationGuideSuppressionOpalFast3Set == null) {
				if (myPronunciationGuideSuppressionOpalCachedOperations == null) { myPronunciationGuideSuppressionOpalCachedOperations = new java.util.ArrayList<>(); }
				myPronunciationGuideSuppressionOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.REMOVE, argPronunciationGuideSuppressionOpal));
			} else {
				myNewPronunciationGuideSuppressionOpalFast3Set = new com.siliconage.util.Fast3Set<>(myOldPronunciationGuideSuppressionOpalFast3Set);
				myNewPronunciationGuideSuppressionOpalFast3Set.remove(argPronunciationGuideSuppressionOpal);
			}
		} else {
			myNewPronunciationGuideSuppressionOpalFast3Set.remove(argPronunciationGuideSuppressionOpal);
		}
		return;
	}

	public synchronized int getPronunciationGuideSuppressionOpalCount() { return getPronunciationGuideSuppressionOpalFast3Set().size(); }

	public synchronized java.util.Iterator<PronunciationGuideSuppressionOpal> createPronunciationGuideSuppressionOpalIterator() {
		return getPronunciationGuideSuppressionOpalFast3Set().iterator();
	}

	public synchronized java.util.stream.Stream<PronunciationGuideSuppressionOpal> streamPronunciationGuideSuppressionOpal() {
		return getPronunciationGuideSuppressionOpalFast3Set().stream();
	}

	private java.util.Set<QuestionOpal> myOldQuestionOpalHashSet = null;
	private java.util.Set<QuestionOpal> myNewQuestionOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<QuestionOpal>> myQuestionOpalCachedOperations = null;

	/* package */ java.util.Set<QuestionOpal> getQuestionOpalHashSet() {
		if (tryAccess()) {
			if (myNewQuestionOpalHashSet == null) {
				if (myOldQuestionOpalHashSet == null) {
					if (isNew()) {
						myOldQuestionOpalHashSet = java.util.Collections.emptySet();
					} else {
						java.util.Set<QuestionOpal> lclS;
						lclS = OpalFactoryFactory.getInstance().getQuestionOpalFactory().forCategoryCodeCollection(getCode());
						myOldQuestionOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
					}
				}
				myNewQuestionOpalHashSet = new java.util.HashSet<>(myOldQuestionOpalHashSet);
				if (myQuestionOpalCachedOperations != null) {
					com.opal.OpalUtility.handleCachedOperations(myQuestionOpalCachedOperations, myNewQuestionOpalHashSet);
					myQuestionOpalCachedOperations = null;
				}
			}
			return myNewQuestionOpalHashSet;
		} else {
			if (myOldQuestionOpalHashSet == null) {
				java.util.Set<QuestionOpal> lclS;
				lclS = OpalFactoryFactory.getInstance().getQuestionOpalFactory().forCategoryCodeCollection(getCode());
				myOldQuestionOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
			}
			return myOldQuestionOpalHashSet;
		}
	}

	public synchronized void addQuestionOpal(QuestionOpal argQuestionOpal) {
		tryMutate();
		argQuestionOpal.setCategoryOpal(this);
		return;
	}

	protected synchronized void addQuestionOpalInternal(QuestionOpal argQuestionOpal) {
		tryMutate();
		if (myNewQuestionOpalHashSet == null) {
			if (myOldQuestionOpalHashSet == null) {
				if (myQuestionOpalCachedOperations == null) { myQuestionOpalCachedOperations = new java.util.ArrayList<>(); }
				myQuestionOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.ADD, argQuestionOpal));
			} else {
				myNewQuestionOpalHashSet = new java.util.HashSet<>(myOldQuestionOpalHashSet);
				myNewQuestionOpalHashSet.add(argQuestionOpal);
			}
		} else {
			myNewQuestionOpalHashSet.add(argQuestionOpal);
		}
		return;
	}

	public synchronized void removeQuestionOpal(QuestionOpal argQuestionOpal) {
		tryMutate();
		argQuestionOpal.setCategoryOpal(null);
	}

	protected synchronized void removeQuestionOpalInternal(QuestionOpal argQuestionOpal) {
		tryMutate();
		if (myNewQuestionOpalHashSet == null) {
			if (myOldQuestionOpalHashSet == null) {
				if (myQuestionOpalCachedOperations == null) { myQuestionOpalCachedOperations = new java.util.ArrayList<>(); }
				myQuestionOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.REMOVE, argQuestionOpal));
			} else {
				myNewQuestionOpalHashSet = new java.util.HashSet<>(myOldQuestionOpalHashSet);
				myNewQuestionOpalHashSet.remove(argQuestionOpal);
			}
		} else {
			myNewQuestionOpalHashSet.remove(argQuestionOpal);
		}
		return;
	}

	public synchronized int getQuestionOpalCount() { return getQuestionOpalHashSet().size(); }

	public synchronized java.util.Iterator<QuestionOpal> createQuestionOpalIterator() {
		return getQuestionOpalHashSet().iterator();
	}

	public synchronized java.util.stream.Stream<QuestionOpal> streamQuestionOpal() {
		return getQuestionOpalHashSet().stream();
	}

	private java.util.Set<DiffOpal> myOldDiffOpalHashSet = null;
	private java.util.Set<DiffOpal> myNewDiffOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<DiffOpal>> myDiffOpalCachedOperations = null;

	/* package */ java.util.Set<DiffOpal> getDiffOpalHashSet() {
		if (tryAccess()) {
			if (myNewDiffOpalHashSet == null) {
				if (myOldDiffOpalHashSet == null) {
					if (isNew()) {
						myOldDiffOpalHashSet = java.util.Collections.emptySet();
					} else {
						java.util.Set<DiffOpal> lclS;
						lclS = OpalFactoryFactory.getInstance().getDiffOpalFactory().forCategoryCodeCollection(getCode());
						myOldDiffOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
					}
				}
				myNewDiffOpalHashSet = new java.util.HashSet<>(myOldDiffOpalHashSet);
				if (myDiffOpalCachedOperations != null) {
					com.opal.OpalUtility.handleCachedOperations(myDiffOpalCachedOperations, myNewDiffOpalHashSet);
					myDiffOpalCachedOperations = null;
				}
			}
			return myNewDiffOpalHashSet;
		} else {
			if (myOldDiffOpalHashSet == null) {
				java.util.Set<DiffOpal> lclS;
				lclS = OpalFactoryFactory.getInstance().getDiffOpalFactory().forCategoryCodeCollection(getCode());
				myOldDiffOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
			}
			return myOldDiffOpalHashSet;
		}
	}

	public synchronized void addDiffOpal(DiffOpal argDiffOpal) {
		tryMutate();
		argDiffOpal.setCategoryOpal(this);
		return;
	}

	protected synchronized void addDiffOpalInternal(DiffOpal argDiffOpal) {
		tryMutate();
		if (myNewDiffOpalHashSet == null) {
			if (myOldDiffOpalHashSet == null) {
				if (myDiffOpalCachedOperations == null) { myDiffOpalCachedOperations = new java.util.ArrayList<>(); }
				myDiffOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.ADD, argDiffOpal));
			} else {
				myNewDiffOpalHashSet = new java.util.HashSet<>(myOldDiffOpalHashSet);
				myNewDiffOpalHashSet.add(argDiffOpal);
			}
		} else {
			myNewDiffOpalHashSet.add(argDiffOpal);
		}
		return;
	}

	public synchronized void removeDiffOpal(DiffOpal argDiffOpal) {
		tryMutate();
		argDiffOpal.setCategoryOpal(null);
	}

	protected synchronized void removeDiffOpalInternal(DiffOpal argDiffOpal) {
		tryMutate();
		if (myNewDiffOpalHashSet == null) {
			if (myOldDiffOpalHashSet == null) {
				if (myDiffOpalCachedOperations == null) { myDiffOpalCachedOperations = new java.util.ArrayList<>(); }
				myDiffOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.REMOVE, argDiffOpal));
			} else {
				myNewDiffOpalHashSet = new java.util.HashSet<>(myOldDiffOpalHashSet);
				myNewDiffOpalHashSet.remove(argDiffOpal);
			}
		} else {
			myNewDiffOpalHashSet.remove(argDiffOpal);
		}
		return;
	}

	public synchronized int getDiffOpalCount() { return getDiffOpalHashSet().size(); }

	public synchronized java.util.Iterator<DiffOpal> createDiffOpalIterator() {
		return getDiffOpalHashSet().iterator();
	}

	public synchronized java.util.stream.Stream<DiffOpal> streamDiffOpal() {
		return getDiffOpalHashSet().stream();
	}

	private java.util.Set<CategoryUseOpal> myOldCategoryUseOpalHashSet = null;
	private java.util.Set<CategoryUseOpal> myNewCategoryUseOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<CategoryUseOpal>> myCategoryUseOpalCachedOperations = null;

	/* package */ java.util.Set<CategoryUseOpal> getCategoryUseOpalHashSet() {
		if (tryAccess()) {
			if (myNewCategoryUseOpalHashSet == null) {
				if (myOldCategoryUseOpalHashSet == null) {
					if (isNew()) {
						myOldCategoryUseOpalHashSet = java.util.Collections.emptySet();
					} else {
						java.util.Set<CategoryUseOpal> lclS;
						lclS = OpalFactoryFactory.getInstance().getCategoryUseOpalFactory().forCategoryCodeCollection(getCode());
						myOldCategoryUseOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
					}
				}
				myNewCategoryUseOpalHashSet = new java.util.HashSet<>(myOldCategoryUseOpalHashSet);
				if (myCategoryUseOpalCachedOperations != null) {
					com.opal.OpalUtility.handleCachedOperations(myCategoryUseOpalCachedOperations, myNewCategoryUseOpalHashSet);
					myCategoryUseOpalCachedOperations = null;
				}
			}
			return myNewCategoryUseOpalHashSet;
		} else {
			if (myOldCategoryUseOpalHashSet == null) {
				java.util.Set<CategoryUseOpal> lclS;
				lclS = OpalFactoryFactory.getInstance().getCategoryUseOpalFactory().forCategoryCodeCollection(getCode());
				myOldCategoryUseOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
			}
			return myOldCategoryUseOpalHashSet;
		}
	}

	public synchronized void addCategoryUseOpal(CategoryUseOpal argCategoryUseOpal) {
		tryMutate();
		argCategoryUseOpal.setCategoryOpal(this);
		return;
	}

	protected synchronized void addCategoryUseOpalInternal(CategoryUseOpal argCategoryUseOpal) {
		tryMutate();
		if (myNewCategoryUseOpalHashSet == null) {
			if (myOldCategoryUseOpalHashSet == null) {
				if (myCategoryUseOpalCachedOperations == null) { myCategoryUseOpalCachedOperations = new java.util.ArrayList<>(); }
				myCategoryUseOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.ADD, argCategoryUseOpal));
			} else {
				myNewCategoryUseOpalHashSet = new java.util.HashSet<>(myOldCategoryUseOpalHashSet);
				myNewCategoryUseOpalHashSet.add(argCategoryUseOpal);
			}
		} else {
			myNewCategoryUseOpalHashSet.add(argCategoryUseOpal);
		}
		return;
	}

	public synchronized void removeCategoryUseOpal(CategoryUseOpal argCategoryUseOpal) {
		tryMutate();
		argCategoryUseOpal.setCategoryOpal(null);
	}

	protected synchronized void removeCategoryUseOpalInternal(CategoryUseOpal argCategoryUseOpal) {
		tryMutate();
		if (myNewCategoryUseOpalHashSet == null) {
			if (myOldCategoryUseOpalHashSet == null) {
				if (myCategoryUseOpalCachedOperations == null) { myCategoryUseOpalCachedOperations = new java.util.ArrayList<>(); }
				myCategoryUseOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.REMOVE, argCategoryUseOpal));
			} else {
				myNewCategoryUseOpalHashSet = new java.util.HashSet<>(myOldCategoryUseOpalHashSet);
				myNewCategoryUseOpalHashSet.remove(argCategoryUseOpal);
			}
		} else {
			myNewCategoryUseOpalHashSet.remove(argCategoryUseOpal);
		}
		return;
	}

	public synchronized int getCategoryUseOpalCount() { return getCategoryUseOpalHashSet().size(); }

	public synchronized java.util.Iterator<CategoryUseOpal> createCategoryUseOpalIterator() {
		return getCategoryUseOpalHashSet().iterator();
	}

	public synchronized java.util.stream.Stream<CategoryUseOpal> streamCategoryUseOpal() {
		return getCategoryUseOpalHashSet().stream();
	}

	private java.util.Set<PlacementOpal> myOldPlacementOpalHashSet = null;
	private java.util.Set<PlacementOpal> myNewPlacementOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<PlacementOpal>> myPlacementOpalCachedOperations = null;

	/* package */ java.util.Set<PlacementOpal> getPlacementOpalHashSet() {
		if (tryAccess()) {
			if (myNewPlacementOpalHashSet == null) {
				if (myOldPlacementOpalHashSet == null) {
					if (isNew()) {
						myOldPlacementOpalHashSet = java.util.Collections.emptySet();
					} else {
						java.util.Set<PlacementOpal> lclS;
						lclS = OpalFactoryFactory.getInstance().getPlacementOpalFactory().forCategoryCodeCollection(getCode());
						myOldPlacementOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
					}
				}
				myNewPlacementOpalHashSet = new java.util.HashSet<>(myOldPlacementOpalHashSet);
				if (myPlacementOpalCachedOperations != null) {
					com.opal.OpalUtility.handleCachedOperations(myPlacementOpalCachedOperations, myNewPlacementOpalHashSet);
					myPlacementOpalCachedOperations = null;
				}
			}
			return myNewPlacementOpalHashSet;
		} else {
			if (myOldPlacementOpalHashSet == null) {
				java.util.Set<PlacementOpal> lclS;
				lclS = OpalFactoryFactory.getInstance().getPlacementOpalFactory().forCategoryCodeCollection(getCode());
				myOldPlacementOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
			}
			return myOldPlacementOpalHashSet;
		}
	}

	public synchronized void addPlacementOpal(PlacementOpal argPlacementOpal) {
		tryMutate();
		argPlacementOpal.setCategoryOpal(this);
		return;
	}

	protected synchronized void addPlacementOpalInternal(PlacementOpal argPlacementOpal) {
		tryMutate();
		if (myNewPlacementOpalHashSet == null) {
			if (myOldPlacementOpalHashSet == null) {
				if (myPlacementOpalCachedOperations == null) { myPlacementOpalCachedOperations = new java.util.ArrayList<>(); }
				myPlacementOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.ADD, argPlacementOpal));
			} else {
				myNewPlacementOpalHashSet = new java.util.HashSet<>(myOldPlacementOpalHashSet);
				myNewPlacementOpalHashSet.add(argPlacementOpal);
			}
		} else {
			myNewPlacementOpalHashSet.add(argPlacementOpal);
		}
		return;
	}

	public synchronized void removePlacementOpal(PlacementOpal argPlacementOpal) {
		tryMutate();
		argPlacementOpal.setCategoryOpal(null);
	}

	protected synchronized void removePlacementOpalInternal(PlacementOpal argPlacementOpal) {
		tryMutate();
		if (myNewPlacementOpalHashSet == null) {
			if (myOldPlacementOpalHashSet == null) {
				if (myPlacementOpalCachedOperations == null) { myPlacementOpalCachedOperations = new java.util.ArrayList<>(); }
				myPlacementOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.REMOVE, argPlacementOpal));
			} else {
				myNewPlacementOpalHashSet = new java.util.HashSet<>(myOldPlacementOpalHashSet);
				myNewPlacementOpalHashSet.remove(argPlacementOpal);
			}
		} else {
			myNewPlacementOpalHashSet.remove(argPlacementOpal);
		}
		return;
	}

	public synchronized int getPlacementOpalCount() { return getPlacementOpalHashSet().size(); }

	public synchronized java.util.Iterator<PlacementOpal> createPlacementOpalIterator() {
		return getPlacementOpalHashSet().iterator();
	}

	public synchronized java.util.stream.Stream<PlacementOpal> streamPlacementOpal() {
		return getPlacementOpalHashSet().stream();
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
