package com.scobolsolo.persistence;

import java.io.PrintWriter;
import java.io.PrintStream;

import com.opal.*;

import com.scobolsolo.application.*;

public final class CategoryOpal extends com.opal.UpdatableOpal<Category> {

	private CategoryOpal() {
		super();
		setUserFacing(null);
	}

	public CategoryOpal(OpalFactory<Category, CategoryOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
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
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.String.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.Integer.class,
		java.lang.String.class,
	};

	/* package */ static final boolean[] ourFieldNullability = new boolean[] {
		false,
		false,
		false,
		false,
		false,
	};

	/* package */ static final FieldValidator[] ourFieldValidators = new FieldValidator[] {
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
	public FieldValidator[] getFieldValidators() { return ourFieldValidators; }

	@Override
	public boolean[] getFieldNullability() { return ourFieldNullability; }

	public static FieldValidator[] getStaticFieldValidators() { return ourFieldValidators; }


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

	public synchronized CategoryOpal setCode(final java.lang.String argCode) {
		tryMutate();
		if (argCode == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myCode on " + this + " to null.");
		}
		if (argCode.length() > 32) {
			throw new com.opal.ArgumentTooLongException("Maximum length of myCode on " + this + " is 32.", argCode.length(), 32);
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
			throw new com.opal.ArgumentTooLongException("Maximum length of myName on " + this + " is 256.", argName.length(), 256);
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
			throw new com.opal.ArgumentTooLongException("Maximum length of myShortName on " + this + " is 32.", argShortName.length(), 32);
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
			throw new com.opal.ArgumentTooLongException("Maximum length of myCategoryGroupCode on " + this + " is 32.", argCategoryGroupCode.length(), 32);
		}
		getNewValues()[4] = argCategoryGroupCode;
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
		myNewQuestionOpalHashSet = null; /* Necessary if it has been rolled back */
		myQuestionOpalCachedOperations = null; /* Ditto */
		myNewCategoryUseOpalHashSet = null; /* Necessary if it has been rolled back */
		myCategoryUseOpalCachedOperations = null; /* Ditto */
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		myOldCategoryGroupOpal = myNewCategoryGroupOpal;

		if (needsToClearOldCollections()) {
			myOldQuestionOpalHashSet = null;
			} else {
			if (myNewQuestionOpalHashSet != null) {
				myOldQuestionOpalHashSet = myNewQuestionOpalHashSet;
				myNewQuestionOpalHashSet = null;
			} else {
				myQuestionOpalCachedOperations = null;
			}
		}
		if (needsToClearOldCollections()) {
			myOldCategoryUseOpalHashSet = null;
			} else {
			if (myNewCategoryUseOpalHashSet != null) {
				myOldCategoryUseOpalHashSet = myNewCategoryUseOpalHashSet;
				myNewCategoryUseOpalHashSet = null;
			} else {
				myCategoryUseOpalCachedOperations = null;
			}
		}
		setClearOldCollections(false);
		return;
	}

	@Override
	protected void unlinkInternal() {
		java.util.Iterator<?> lclI;
		if (myNewQuestionOpalHashSet != null || myQuestionOpalCachedOperations != null) {
			lclI = createQuestionOpalIterator();
			while (lclI.hasNext()) {
				((QuestionOpal) lclI.next()).setCategoryOpalInternal(null);
			}
		}
		if (myNewCategoryUseOpalHashSet != null || myCategoryUseOpalCachedOperations != null) {
			lclI = createCategoryUseOpalIterator();
			while (lclI.hasNext()) {
				((CategoryUseOpal) lclI.next()).setCategoryOpalInternal(null);
			}
		}
		if (getCategoryGroupOpal() != null) {
			getCategoryGroupOpal().removeCategoryOpalInternal(this);
		}
		return;
	}

	@Override
	protected void copyFieldsToInternal(UpdatableOpal<Category> argTarget) {
		Object[] lclValues = getReadValueSet();
		Object[] lclTargetNewValues = argTarget.getNewValues();
		/* Field 0 (Code) is part of a unique key. */
		/* Field 1 (Name) is part of a unique key. */
		/* Field 2 (ShortName) is part of a unique key. */
		lclTargetNewValues[3] = lclValues[3]; /* Sequence (immutable) */
		lclTargetNewValues[4] = lclValues[4]; /* CategoryGroupCode (immutable) */

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
	public java.util.Set<TransactionAware> getRequiredPriorCommits() {
		java.util.Set<TransactionAware> lclTAs = null;
		UpdatableOpal<?> lclUO;
		lclUO = myNewCategoryGroupOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		return (lclTAs != null) && (lclTAs.size() > 0) ? lclTAs : java.util.Collections.emptySet();
	}

	@Override
	public java.util.Set<TransactionAware> getRequiredSubsequentCommits() {
		java.util.Set<TransactionAware> lclTAs = null;
		UpdatableOpal<?> lclUO;
		lclUO = myOldCategoryGroupOpal;
		if ((lclUO != null) && lclUO.isDeleted()) {
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
	public synchronized void output(final PrintWriter argPW) {
		argPW.println("Code = " + getCode());
		argPW.println("Name = " + getName());
		argPW.println("ShortName = " + getShortName());
		argPW.println("Sequence = " + getSequenceAsObject());
		argPW.println("CategoryGroupCode = " + getCategoryGroupCode());
	}

	@Override
	public synchronized void output(final PrintStream argPS) {
		argPS.println("Code = " + getCode());
		argPS.println("Name = " + getName());
		argPS.println("ShortName = " + getShortName());
		argPS.println("Sequence = " + getSequenceAsObject());
		argPS.println("CategoryGroupCode = " + getCategoryGroupCode());
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

	private java.util.HashSet<QuestionOpal> myOldQuestionOpalHashSet = null;
	private java.util.HashSet<QuestionOpal> myNewQuestionOpalHashSet = null;
	private java.util.ArrayList<CachedOperation<QuestionOpal>> myQuestionOpalCachedOperations = null;

	/* package */ java.util.HashSet<QuestionOpal> getQuestionOpalClass() {
		if (tryAccess()) {
			if (myNewQuestionOpalHashSet == null) {
				if (myOldQuestionOpalHashSet == null) {
					myOldQuestionOpalHashSet = OpalFactoryFactory.getInstance().getQuestionOpalFactory().forCategoryCodeCollection(getCode());
				}
				myNewQuestionOpalHashSet = new java.util.HashSet<>(myOldQuestionOpalHashSet);
				if (myQuestionOpalCachedOperations != null) {
					OpalUtility.handleCachedOperations(myQuestionOpalCachedOperations, myNewQuestionOpalHashSet);
					myQuestionOpalCachedOperations = null;
				}
			}
			return myNewQuestionOpalHashSet;
		}
		if (myOldQuestionOpalHashSet == null) {
			myOldQuestionOpalHashSet = OpalFactoryFactory.getInstance().getQuestionOpalFactory().forCategoryCodeCollection(getCode());
		}
		return myOldQuestionOpalHashSet;
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
				myQuestionOpalCachedOperations.add(new CachedOperation<>(CachedOperation.ADD, argQuestionOpal));
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
				myQuestionOpalCachedOperations.add(new CachedOperation<>(CachedOperation.REMOVE, argQuestionOpal));
			} else {
				myNewQuestionOpalHashSet = new java.util.HashSet<>(myOldQuestionOpalHashSet);
				myNewQuestionOpalHashSet.remove(argQuestionOpal);
			}
		} else {
			myNewQuestionOpalHashSet.remove(argQuestionOpal);
		}
		return;
	}

	public synchronized int getQuestionOpalCount() { return getQuestionOpalClass().size(); }

	public synchronized java.util.Iterator<QuestionOpal> createQuestionOpalIterator() {
		return getQuestionOpalClass().iterator();
	}

	public synchronized java.util.stream.Stream<QuestionOpal> streamQuestionOpal() {
		return getQuestionOpalClass().stream();
	}

	public synchronized void clearQuestionOpalInternal() { getQuestionOpalClass().clear(); }

	private java.util.HashSet<CategoryUseOpal> myOldCategoryUseOpalHashSet = null;
	private java.util.HashSet<CategoryUseOpal> myNewCategoryUseOpalHashSet = null;
	private java.util.ArrayList<CachedOperation<CategoryUseOpal>> myCategoryUseOpalCachedOperations = null;

	/* package */ java.util.HashSet<CategoryUseOpal> getCategoryUseOpalClass() {
		if (tryAccess()) {
			if (myNewCategoryUseOpalHashSet == null) {
				if (myOldCategoryUseOpalHashSet == null) {
					myOldCategoryUseOpalHashSet = OpalFactoryFactory.getInstance().getCategoryUseOpalFactory().forCategoryCodeCollection(getCode());
				}
				myNewCategoryUseOpalHashSet = new java.util.HashSet<>(myOldCategoryUseOpalHashSet);
				if (myCategoryUseOpalCachedOperations != null) {
					OpalUtility.handleCachedOperations(myCategoryUseOpalCachedOperations, myNewCategoryUseOpalHashSet);
					myCategoryUseOpalCachedOperations = null;
				}
			}
			return myNewCategoryUseOpalHashSet;
		}
		if (myOldCategoryUseOpalHashSet == null) {
			myOldCategoryUseOpalHashSet = OpalFactoryFactory.getInstance().getCategoryUseOpalFactory().forCategoryCodeCollection(getCode());
		}
		return myOldCategoryUseOpalHashSet;
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
				myCategoryUseOpalCachedOperations.add(new CachedOperation<>(CachedOperation.ADD, argCategoryUseOpal));
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
				myCategoryUseOpalCachedOperations.add(new CachedOperation<>(CachedOperation.REMOVE, argCategoryUseOpal));
			} else {
				myNewCategoryUseOpalHashSet = new java.util.HashSet<>(myOldCategoryUseOpalHashSet);
				myNewCategoryUseOpalHashSet.remove(argCategoryUseOpal);
			}
		} else {
			myNewCategoryUseOpalHashSet.remove(argCategoryUseOpal);
		}
		return;
	}

	public synchronized int getCategoryUseOpalCount() { return getCategoryUseOpalClass().size(); }

	public synchronized java.util.Iterator<CategoryUseOpal> createCategoryUseOpalIterator() {
		return getCategoryUseOpalClass().iterator();
	}

	public synchronized java.util.stream.Stream<CategoryUseOpal> streamCategoryUseOpal() {
		return getCategoryUseOpalClass().stream();
	}

	public synchronized void clearCategoryUseOpalInternal() { getCategoryUseOpalClass().clear(); }

	@Override
	public String toString() {
		StringBuilder lclSB =  new StringBuilder(64);
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
