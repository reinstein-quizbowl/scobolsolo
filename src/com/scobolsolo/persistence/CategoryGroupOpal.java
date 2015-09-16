package com.scobolsolo.persistence;

import com.scobolsolo.application.*;

public final class CategoryGroupOpal extends com.opal.UpdatableOpal<CategoryGroup> {

	private CategoryGroupOpal() {
		super();
		setUserFacing(null);
	}

	public CategoryGroupOpal(com.opal.OpalFactory<CategoryGroup, CategoryGroupOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	/* package */ static final String[] ourFieldNames = new String[] {
		"Code",
		"Name",
		"ShortName",
		"Sequence",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.String.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.Integer.class,
	};

	/* package */ static final boolean[] ourFieldNullability = new boolean[] {
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
	};

	public static final CategoryGroupOpal NOT_YET_LOADED = new CategoryGroupOpal();

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

	public synchronized CategoryGroupOpal setCode(final java.lang.String argCode) {
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

	public synchronized CategoryGroupOpal setName(final java.lang.String argName) {
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

	public synchronized CategoryGroupOpal setShortName(final java.lang.String argShortName) {
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

	public synchronized CategoryGroupOpal setSequence(final java.lang.Integer argSequence) {
		tryMutate();
		if (argSequence == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set mySequence on " + this + " to null.");
		}
		getNewValues()[3] = argSequence;
		return this;
	}

	public CategoryGroupOpal setSequence(final int argSequence) {
		setSequence(java.lang.Integer.valueOf(argSequence));
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
		myNewCategoryOpalHashSet = null; /* Necessary if it has been rolled back */
		myCategoryOpalCachedOperations = null; /* Ditto */
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		/** This Opal has no references to other Opals that need to be copied. */
		if (needsToClearOldCollections()) {
			myOldCategoryOpalHashSet = null;
			} else {
			if (myNewCategoryOpalHashSet != null) {
				myOldCategoryOpalHashSet = myNewCategoryOpalHashSet;
				myNewCategoryOpalHashSet = null;
			} else {
				myCategoryOpalCachedOperations = null;
			}
		}
		setClearOldCollections(false);
		return;
	}

	@Override
	protected void unlinkInternal() {
		java.util.Iterator<?> lclI;
		if (myNewCategoryOpalHashSet != null || myCategoryOpalCachedOperations != null) {
			lclI = createCategoryOpalIterator();
			while (lclI.hasNext()) {
				((CategoryOpal) lclI.next()).setCategoryGroupOpalInternal(null);
			}
		}
		return;
	}

	@Override
	protected void copyFieldsToInternal(com.opal.UpdatableOpal<CategoryGroup> argTarget) {
		Object[] lclValues = getReadValueSet();
		Object[] lclTargetNewValues = argTarget.getNewValues();
		/* Field 0 (Code) is part of a unique key. */
		/* Field 1 (Name) is part of a unique key. */
		/* Field 2 (ShortName) is part of a unique key. */
		lclTargetNewValues[3] = lclValues[3]; /* Sequence (immutable) */

		return;
	}

	@Override
	public synchronized void translateReferencesToFields() {
		return;
	}

	@Override
	public java.util.Set<com.opal.TransactionAware> getRequiredPriorCommits() {
		return java.util.Collections.emptySet();
	}

	@Override
	public java.util.Set<com.opal.TransactionAware> getRequiredSubsequentCommits() {
		return java.util.Collections.emptySet();
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
	}

	@Override
	public synchronized void output(final java.io.PrintWriter argOutput) {
		argOutput.println("Code = " + getCode());
		argOutput.println("Name = " + getName());
		argOutput.println("ShortName = " + getShortName());
		argOutput.println("Sequence = " + getSequenceAsObject());
	}

	private java.util.HashSet<CategoryOpal> myOldCategoryOpalHashSet = null;
	private java.util.HashSet<CategoryOpal> myNewCategoryOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<CategoryOpal>> myCategoryOpalCachedOperations = null;

	/* package */ java.util.HashSet<CategoryOpal> getCategoryOpalHashSet() {
		if (tryAccess()) {
			if (myNewCategoryOpalHashSet == null) {
				if (myOldCategoryOpalHashSet == null) {
					if (isNew()) {
						myOldCategoryOpalHashSet = new java.util.HashSet<>();
					} else {
						myOldCategoryOpalHashSet = OpalFactoryFactory.getInstance().getCategoryOpalFactory().forCategoryGroupCodeCollection(getCode());
					}
				}
				myNewCategoryOpalHashSet = new java.util.HashSet<>(myOldCategoryOpalHashSet);
				if (myCategoryOpalCachedOperations != null) {
					com.opal.OpalUtility.handleCachedOperations(myCategoryOpalCachedOperations, myNewCategoryOpalHashSet);
					myCategoryOpalCachedOperations = null;
				}
			}
			return myNewCategoryOpalHashSet;
		} else {
			if (myOldCategoryOpalHashSet == null) {
				myOldCategoryOpalHashSet = OpalFactoryFactory.getInstance().getCategoryOpalFactory().forCategoryGroupCodeCollection(getCode());
			}
			return myOldCategoryOpalHashSet;
		}
	}

	public synchronized void addCategoryOpal(CategoryOpal argCategoryOpal) {
		tryMutate();
		argCategoryOpal.setCategoryGroupOpal(this);
		return;
	}

	protected synchronized void addCategoryOpalInternal(CategoryOpal argCategoryOpal) {
		tryMutate();
		if (myNewCategoryOpalHashSet == null) {
			if (myOldCategoryOpalHashSet == null) {
				if (myCategoryOpalCachedOperations == null) { myCategoryOpalCachedOperations = new java.util.ArrayList<>(); }
				myCategoryOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.ADD, argCategoryOpal));
			} else {
				myNewCategoryOpalHashSet = new java.util.HashSet<>(myOldCategoryOpalHashSet);
				myNewCategoryOpalHashSet.add(argCategoryOpal);
			}
		} else {
			myNewCategoryOpalHashSet.add(argCategoryOpal);
		}
		return;
	}

	public synchronized void removeCategoryOpal(CategoryOpal argCategoryOpal) {
		tryMutate();
		argCategoryOpal.setCategoryGroupOpal(null);
	}

	protected synchronized void removeCategoryOpalInternal(CategoryOpal argCategoryOpal) {
		tryMutate();
		if (myNewCategoryOpalHashSet == null) {
			if (myOldCategoryOpalHashSet == null) {
				if (myCategoryOpalCachedOperations == null) { myCategoryOpalCachedOperations = new java.util.ArrayList<>(); }
				myCategoryOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.REMOVE, argCategoryOpal));
			} else {
				myNewCategoryOpalHashSet = new java.util.HashSet<>(myOldCategoryOpalHashSet);
				myNewCategoryOpalHashSet.remove(argCategoryOpal);
			}
		} else {
			myNewCategoryOpalHashSet.remove(argCategoryOpal);
		}
		return;
	}

	public synchronized int getCategoryOpalCount() { return getCategoryOpalHashSet().size(); }

	public synchronized java.util.Iterator<CategoryOpal> createCategoryOpalIterator() {
		return getCategoryOpalHashSet().iterator();
	}

	public synchronized java.util.stream.Stream<CategoryOpal> streamCategoryOpal() {
		return getCategoryOpalHashSet().stream();
	}

	public synchronized void clearCategoryOpalInternal() { getCategoryOpalHashSet().clear(); }

	@Override
	public String toString() {
		StringBuilder lclSB =  new StringBuilder(64);
		lclSB.append("CategoryGroupOpal[");
		lclSB.append("myCode=");
		lclSB.append(toStringField(0));
		lclSB.append(']');
		return lclSB.toString();
	}

	@Override
	protected void updateCollectionsAfterReload() {
		assert needsToClearOldCollections() == false;
		setClearOldCollections(true);
	}

}
