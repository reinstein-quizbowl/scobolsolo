package com.scobolsolo.persistence;

import com.scobolsolo.application.CategoryGroup;

public final class CategoryGroupOpal extends com.opal.UpdatableOpal<CategoryGroup> {


	private CategoryGroupOpal() {
		super();
		setUserFacing(null);
	}

	public CategoryGroupOpal(com.opal.IdentityOpalFactory<CategoryGroup, CategoryGroupOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void applyDefaults() {

		/* Initialize the back Collections to empty sets. */

		myCategorySet = new com.opal.types.OpalBackCollectionDoubleSet<>(
				this,
				ourCategoryOpalLoader,
				true
				);

		return;
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
			throw new com.opal.ArgumentTooLongException("Cannot set myCode on " + this + " to \"" + argCode + "\" because that field's maximum length is 32.", argCode.length(), 32);
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
			throw new com.opal.ArgumentTooLongException("Cannot set myName on " + this + " to \"" + argName + "\" because that field's maximum length is 256.", argName.length(), 256);
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
			throw new com.opal.ArgumentTooLongException("Cannot set myShortName on " + this + " to \"" + argShortName + "\" because that field's maximum length is 32.", argShortName.length(), 32);
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
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		/** This Opal has no references to other Opals that need to be copied. */
		return;
	}

	@Override
	protected void unlinkInternal() {
		getCategoryOpalSet().clear();
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

	private com.opal.types.OpalBackCollectionSet<CategoryOpal, CategoryGroupOpal> myCategorySet = null;

	private static final com.opal.types.OpalBackCollectionLoader<CategoryOpal, CategoryGroupOpal> ourCategoryOpalLoader = 
			new com.opal.types.OpalBackCollectionLoader<>(
					OpalFactoryFactory.getInstance().getCategoryOpalFactory()::forCategoryGroupOpalCollection,
					OpalFactoryFactory.getInstance().getCategoryOpalFactory()::forCategoryGroupOpalCount,
					CategoryOpal::setCategoryGroupOpal,
					CategoryOpal::setCategoryGroupOpalInternal,
					CategoryOpal::getCategoryGroupOpal,
					com.scobolsolo.application.FactoryMap.getNoArgCtorSetCreator(),
					com.scobolsolo.application.FactoryMap.getCollectionArgSetCreator(),
					false
					);

	/* package */ synchronized com.opal.types.OpalBackCollectionSet<CategoryOpal, CategoryGroupOpal> getCategoryOpalSet() {
		if (myCategorySet == null) {
			myCategorySet = new com.opal.types.OpalBackCollectionDoubleSet<>(
					this,
					ourCategoryOpalLoader,
					isNew()
					);
		}
		return myCategorySet;
	}

	@Override
	public java.lang.String toString() {
		java.lang.StringBuilder lclSB = new java.lang.StringBuilder(64);
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
