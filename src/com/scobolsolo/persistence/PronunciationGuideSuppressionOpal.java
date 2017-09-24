package com.scobolsolo.persistence;

import com.scobolsolo.application.PronunciationGuideSuppression;

@com.opal.StoreGeneratedPrimaryKey
public final class PronunciationGuideSuppressionOpal extends com.opal.UpdatableOpal<PronunciationGuideSuppression> {


	private PronunciationGuideSuppressionOpal() {
		super();
		setUserFacing(null);
	}

	public PronunciationGuideSuppressionOpal(com.opal.IdentityOpalFactory<PronunciationGuideSuppression, PronunciationGuideSuppressionOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void initializeReferences() {
		myOldAccountOpal = AccountOpal.NOT_YET_LOADED;
		myOldCategoryOpal = CategoryOpal.NOT_YET_LOADED;
		return;
	}

	/* package */ static final String[] ourFieldNames = new String[] {
		"Id",
		"AccountId",
		"CategoryCode",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.lang.String.class,
	};

	/* package */ static final boolean[] ourFieldNullability = new boolean[] {
		false,
		false,
		false,
	};

	/* package */ static final com.opal.FieldValidator[] ourFieldValidators = new com.opal.FieldValidator[] {
		null,
		null,
		null,
	};

	public static final PronunciationGuideSuppressionOpal NOT_YET_LOADED = new PronunciationGuideSuppressionOpal();

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


	public synchronized java.lang.Integer getIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[0];
	}

	public synchronized java.lang.Integer getAccountIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[1];
	}

	public synchronized java.lang.String getCategoryCode() {
		return (java.lang.String) getReadValueSet()[2];
	}

	public synchronized PronunciationGuideSuppressionOpal setId(final java.lang.Integer argId) {
		tryMutate();
		if (argId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myId on " + this + " to null.");
		}
		getNewValues()[0] = argId;
		return this;
	}

	public PronunciationGuideSuppressionOpal setId(final int argId) {
		setId(java.lang.Integer.valueOf(argId));
		return this;
	}

	public synchronized PronunciationGuideSuppressionOpal setAccountId(final java.lang.Integer argAccountId) {
		tryMutate();
		if (argAccountId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myAccountId on " + this + " to null.");
		}
		getNewValues()[1] = argAccountId;
		return this;
	}

	public PronunciationGuideSuppressionOpal setAccountId(final int argAccountId) {
		setAccountId(java.lang.Integer.valueOf(argAccountId));
		return this;
	}

	public synchronized PronunciationGuideSuppressionOpal setCategoryCode(final java.lang.String argCategoryCode) {
		tryMutate();
		if (argCategoryCode == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myCategoryCode on " + this + " to null.");
		}
		if (argCategoryCode.length() > 32) {
			throw new com.opal.ArgumentTooLongException("Cannot set myCategoryCode on " + this + " to \"" + argCategoryCode + "\" because that field's maximum length is 32.", argCategoryCode.length(), 32);
		}
		getNewValues()[2] = argCategoryCode;
		return this;
	}

	@Override
	protected /* synchronized */ void copyOldValuesToNewInternal() {
		myNewAccountOpal = myOldAccountOpal;
		myNewCategoryOpal = myOldCategoryOpal;
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		myOldAccountOpal = myNewAccountOpal;
		myOldCategoryOpal = myNewCategoryOpal;

		return;
	}

	@Override
	protected void unlinkInternal() {
		if (getAccountOpal() != null) {
			getAccountOpal().getPronunciationGuideSuppressionOpalSet().removeInternal(this);
		}
		if (getCategoryOpal() != null) {
			getCategoryOpal().getPronunciationGuideSuppressionOpalSet().removeInternal(this);
		}
		return;
	}

	@Override
	protected void copyFieldsToInternal(com.opal.UpdatableOpal<PronunciationGuideSuppression> argTarget) {
		/* Field 0 (Id) is database generated. */
		/* Field 1 (AccountId) is part of a unique key. */
		/* Field 2 (CategoryCode) is part of a unique key. */

		return;
	}

	@Override
	public synchronized void translateReferencesToFields() {
		if (myNewAccountOpal != AccountOpal.NOT_YET_LOADED) {
			setAccountId(myNewAccountOpal == null ? null : myNewAccountOpal.getIdAsObject());
		}
		if (myNewCategoryOpal != CategoryOpal.NOT_YET_LOADED) {
			setCategoryCode(myNewCategoryOpal == null ? null : myNewCategoryOpal.getCode());
		}
		return;
	}

	@Override
	public java.util.Set<com.opal.TransactionAware> getRequiredPriorCommits() {
		java.util.Set<com.opal.TransactionAware> lclTAs = null;
		com.opal.UpdatableOpal<?> lclUO;
		lclUO = myNewAccountOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		lclUO = myNewCategoryOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
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
		if ((lclUO = myOldAccountOpal) == AccountOpal.NOT_YET_LOADED) {
			lclUO = myOldAccountOpal = retrieveAccountOpal(getOldValues());
		}
		if (lclUO != null && (lclUO.exists() == false)) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		if ((lclUO = myOldCategoryOpal) == CategoryOpal.NOT_YET_LOADED) {
			lclUO = myOldCategoryOpal = retrieveCategoryOpal(getOldValues());
		}
		if (lclUO != null && (lclUO.exists() == false)) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
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
		argOutput.println("Id = " + getIdAsObject());
		argOutput.println("AccountId = " + getAccountIdAsObject());
		argOutput.println("CategoryCode = " + getCategoryCode());
	}

	@Override
	public synchronized void output(final java.io.PrintWriter argOutput) {
		argOutput.println("Id = " + getIdAsObject());
		argOutput.println("AccountId = " + getAccountIdAsObject());
		argOutput.println("CategoryCode = " + getCategoryCode());
	}

	private AccountOpal myOldAccountOpal;
	private AccountOpal myNewAccountOpal;

	protected AccountOpal retrieveAccountOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[1] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getAccountOpalFactory().forId(getAccountIdAsObject());
	}

	public synchronized AccountOpal getAccountOpal() {
		AccountOpal lclAccountOpal;
		boolean lclAccess = tryAccess();
		lclAccountOpal = lclAccess ? myNewAccountOpal : myOldAccountOpal;
		if (lclAccountOpal == AccountOpal.NOT_YET_LOADED) {
			lclAccountOpal = retrieveAccountOpal(getReadValueSet());
			if (lclAccess) {
				myNewAccountOpal = lclAccountOpal;
			} else {
				myOldAccountOpal = lclAccountOpal;
			}
		}
		return lclAccountOpal;
	}

	public synchronized PronunciationGuideSuppressionOpal setAccountOpal(AccountOpal argAccountOpal) {
		tryMutate();
		AccountOpal lclAccountOpal = getAccountOpal();
		if (lclAccountOpal == argAccountOpal) { return this; }
		if (lclAccountOpal != null) {
			lclAccountOpal.getPronunciationGuideSuppressionOpalSet().removeInternal(this);
		}
		myNewAccountOpal = argAccountOpal;
		if (argAccountOpal != null) {
			argAccountOpal.getPronunciationGuideSuppressionOpalSet().addInternal(this);
		}
		return this;
	}

	protected synchronized void setAccountOpalInternal(AccountOpal argAccountOpal) {
		tryMutate();
		myNewAccountOpal = argAccountOpal;
	}

	private CategoryOpal myOldCategoryOpal;
	private CategoryOpal myNewCategoryOpal;

	protected CategoryOpal retrieveCategoryOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[2] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getCategoryOpalFactory().forCode(getCategoryCode());
	}

	public synchronized CategoryOpal getCategoryOpal() {
		CategoryOpal lclCategoryOpal;
		boolean lclAccess = tryAccess();
		lclCategoryOpal = lclAccess ? myNewCategoryOpal : myOldCategoryOpal;
		if (lclCategoryOpal == CategoryOpal.NOT_YET_LOADED) {
			lclCategoryOpal = retrieveCategoryOpal(getReadValueSet());
			if (lclAccess) {
				myNewCategoryOpal = lclCategoryOpal;
			} else {
				myOldCategoryOpal = lclCategoryOpal;
			}
		}
		return lclCategoryOpal;
	}

	public synchronized PronunciationGuideSuppressionOpal setCategoryOpal(CategoryOpal argCategoryOpal) {
		tryMutate();
		CategoryOpal lclCategoryOpal = getCategoryOpal();
		if (lclCategoryOpal == argCategoryOpal) { return this; }
		if (lclCategoryOpal != null) {
			lclCategoryOpal.getPronunciationGuideSuppressionOpalSet().removeInternal(this);
		}
		myNewCategoryOpal = argCategoryOpal;
		if (argCategoryOpal != null) {
			argCategoryOpal.getPronunciationGuideSuppressionOpalSet().addInternal(this);
		}
		return this;
	}

	protected synchronized void setCategoryOpalInternal(CategoryOpal argCategoryOpal) {
		tryMutate();
		myNewCategoryOpal = argCategoryOpal;
	}

	@Override
	public java.lang.String toString() {
		java.lang.StringBuilder lclSB = new java.lang.StringBuilder(64);
		lclSB.append("PronunciationGuideSuppressionOpal[");
		lclSB.append("myId=");
		lclSB.append(toStringField(0));
		lclSB.append(']');
		return lclSB.toString();
	}

	@Override
	protected void updateReferencesAfterReload() {
		if (myNewAccountOpal != AccountOpal.NOT_YET_LOADED) {
			setAccountOpal(retrieveAccountOpal(getNewValues()));
		}
		if (myNewCategoryOpal != CategoryOpal.NOT_YET_LOADED) {
			setCategoryOpal(retrieveCategoryOpal(getNewValues()));
		}
	}

}
