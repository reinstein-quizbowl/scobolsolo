package com.scobolsolo.persistence;

import java.io.PrintWriter;
import java.io.PrintStream;

import com.opal.*;

import com.scobolsolo.application.*;

@StoreGeneratedPrimaryKey
public final class QuestionOpal extends com.opal.UpdatableOpal<Question> {

	private QuestionOpal() {
		super();
		setUserFacing(null);
	}

	public QuestionOpal(OpalFactory<Question, QuestionOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void initializeReferences() {
		myOldCategoryOpal = CategoryOpal.NOT_YET_LOADED;
		myOldWriterOpal = AccountOpal.NOT_YET_LOADED;
		return;
	}

	/* package */ static final String[] ourFieldNames = new String[] {
		"Id",
		"Description",
		"CategoryCode",
		"Note",
		"WriterAccountId",
		"Text",
		"Answer",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.Integer.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.Integer.class,
		java.lang.String.class,
		java.lang.String.class,
	};

	/* package */ static final boolean[] ourFieldNullability = new boolean[] {
		false,
		true,
		false,
		true,
		true,
		true,
		true,
	};

	/* package */ static final FieldValidator[] ourFieldValidators = new FieldValidator[] {
		null,
		null,
		null,
		null,
		null,
		null,
		null,
	};

	public static final QuestionOpal NOT_YET_LOADED = new QuestionOpal();

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


	public synchronized java.lang.Integer getIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[0];
	}

	public synchronized java.lang.String getDescription() {
		return (java.lang.String) getReadValueSet()[1];
	}

	public synchronized java.lang.String getCategoryCode() {
		return (java.lang.String) getReadValueSet()[2];
	}

	public synchronized java.lang.String getNote() {
		return (java.lang.String) getReadValueSet()[3];
	}

	public synchronized java.lang.Integer getWriterAccountIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[4];
	}

	public synchronized java.lang.String getText() {
		return (java.lang.String) getReadValueSet()[5];
	}

	public synchronized java.lang.String getAnswer() {
		return (java.lang.String) getReadValueSet()[6];
	}

	public synchronized QuestionOpal setId(final java.lang.Integer argId) {
		tryMutate();
		if (argId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myId on " + this + " to null.");
		}
		getNewValues()[0] = argId;
		return this;
	}

	public QuestionOpal setId(final int argId) {
		setId(java.lang.Integer.valueOf(argId));
		return this;
	}

	public synchronized QuestionOpal setDescription(final java.lang.String argDescription) {
		tryMutate();
		getNewValues()[1] = argDescription;
		return this;
	}

	public synchronized QuestionOpal setCategoryCode(final java.lang.String argCategoryCode) {
		tryMutate();
		if (argCategoryCode == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myCategoryCode on " + this + " to null.");
		}
		if (argCategoryCode.length() > 32) {
			throw new com.opal.ArgumentTooLongException("Maximum length of myCategoryCode on " + this + " is 32.", argCategoryCode.length(), 32);
		}
		getNewValues()[2] = argCategoryCode;
		return this;
	}

	public synchronized QuestionOpal setNote(final java.lang.String argNote) {
		tryMutate();
		getNewValues()[3] = argNote;
		return this;
	}

	public synchronized QuestionOpal setWriterAccountId(final java.lang.Integer argWriterAccountId) {
		tryMutate();
		getNewValues()[4] = argWriterAccountId;
		return this;
	}

	public QuestionOpal setWriterAccountId(final int argWriterAccountId) {
		setWriterAccountId(java.lang.Integer.valueOf(argWriterAccountId));
		return this;
	}

	public synchronized QuestionOpal setText(final java.lang.String argText) {
		tryMutate();
		getNewValues()[5] = argText;
		return this;
	}

	public synchronized QuestionOpal setAnswer(final java.lang.String argAnswer) {
		tryMutate();
		getNewValues()[6] = argAnswer;
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
		myNewCategoryOpal = myOldCategoryOpal;
		myNewWriterOpal = myOldWriterOpal;
		myNewDiffOpalHashSet = null; /* Necessary if it has been rolled back */
		myDiffOpalCachedOperations = null; /* Ditto */
		myNewPlacementOpalHashSet = null; /* Necessary if it has been rolled back */
		myPlacementOpalCachedOperations = null; /* Ditto */
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		myOldCategoryOpal = myNewCategoryOpal;
		myOldWriterOpal = myNewWriterOpal;

		if (needsToClearOldCollections()) {
			myOldDiffOpalHashSet = null;
			} else {
			if (myNewDiffOpalHashSet != null) {
				myOldDiffOpalHashSet = myNewDiffOpalHashSet;
				myNewDiffOpalHashSet = null;
			} else {
				myDiffOpalCachedOperations = null;
			}
		}
		if (needsToClearOldCollections()) {
			myOldPlacementOpalHashSet = null;
			} else {
			if (myNewPlacementOpalHashSet != null) {
				myOldPlacementOpalHashSet = myNewPlacementOpalHashSet;
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
		if (myNewDiffOpalHashSet != null || myDiffOpalCachedOperations != null) {
			lclI = createDiffOpalIterator();
			while (lclI.hasNext()) {
				((DiffOpal) lclI.next()).setQuestionOpalInternal(null);
			}
		}
		if (myNewPlacementOpalHashSet != null || myPlacementOpalCachedOperations != null) {
			lclI = createPlacementOpalIterator();
			while (lclI.hasNext()) {
				((PlacementOpal) lclI.next()).setQuestionOpalInternal(null);
			}
		}
		if (getCategoryOpal() != null) {
			getCategoryOpal().removeQuestionOpalInternal(this);
		}
		if (getWriterOpal() != null) {
			getWriterOpal().removeWriterQuestionOpalInternal(this);
		}
		return;
	}

	@Override
	protected void copyFieldsToInternal(UpdatableOpal<Question> argTarget) {
		Object[] lclValues = getReadValueSet();
		Object[] lclTargetNewValues = argTarget.getNewValues();
		/* Field 0 (Id) is database generated. */
		lclTargetNewValues[1] = lclValues[1]; /* Description (immutable) */
		lclTargetNewValues[2] = lclValues[2]; /* CategoryCode (immutable) */
		lclTargetNewValues[3] = lclValues[3]; /* Note (immutable) */
		lclTargetNewValues[4] = lclValues[4]; /* WriterAccountId (immutable) */
		lclTargetNewValues[5] = lclValues[5]; /* Text (immutable) */
		lclTargetNewValues[6] = lclValues[6]; /* Answer (immutable) */

		return;
	}

	@Override
	public synchronized void translateReferencesToFields() {
		if (myNewCategoryOpal != CategoryOpal.NOT_YET_LOADED) {
			setCategoryCode(myNewCategoryOpal == null ? null : myNewCategoryOpal.getCode());
		}
		if (myNewWriterOpal != AccountOpal.NOT_YET_LOADED) {
			setWriterAccountId(myNewWriterOpal == null ? null : myNewWriterOpal.getIdAsObject());
		}
		return;
	}

	@Override
	public java.util.Set<TransactionAware> getRequiredPriorCommits() {
		java.util.Set<TransactionAware> lclTAs = null;
		UpdatableOpal<?> lclUO;
		lclUO = myNewCategoryOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		lclUO = myNewWriterOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		return (lclTAs != null) && (lclTAs.size() > 0) ? lclTAs : java.util.Collections.emptySet();
	}

	@Override
	public java.util.Set<TransactionAware> getRequiredSubsequentCommits() {
		java.util.Set<TransactionAware> lclTAs = null;
		UpdatableOpal<?> lclUO;
		lclUO = myOldCategoryOpal;
		if ((lclUO != null) && lclUO.isDeleted()) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		lclUO = myOldWriterOpal;
		if ((lclUO != null) && lclUO.isDeleted()) {
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
	public synchronized void output(final PrintWriter argPW) {
		argPW.println("Id = " + getIdAsObject());
		argPW.println("Description = " + getDescription());
		argPW.println("CategoryCode = " + getCategoryCode());
		argPW.println("Note = " + getNote());
		argPW.println("WriterAccountId = " + getWriterAccountIdAsObject());
		argPW.println("Text = " + getText());
		argPW.println("Answer = " + getAnswer());
	}

	@Override
	public synchronized void output(final PrintStream argPS) {
		argPS.println("Id = " + getIdAsObject());
		argPS.println("Description = " + getDescription());
		argPS.println("CategoryCode = " + getCategoryCode());
		argPS.println("Note = " + getNote());
		argPS.println("WriterAccountId = " + getWriterAccountIdAsObject());
		argPS.println("Text = " + getText());
		argPS.println("Answer = " + getAnswer());
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

	public synchronized QuestionOpal setCategoryOpal(CategoryOpal argCategoryOpal) {
		tryMutate();
		CategoryOpal lclCategoryOpal = getCategoryOpal();
		if (lclCategoryOpal == argCategoryOpal) { return this; }
		if (lclCategoryOpal != null) {
			lclCategoryOpal.removeQuestionOpalInternal(this);
		}
		myNewCategoryOpal = argCategoryOpal;
		if (argCategoryOpal != null) {
			argCategoryOpal.addQuestionOpalInternal(this);
		}
		return this;
	}

	protected synchronized void setCategoryOpalInternal(CategoryOpal argCategoryOpal) {
		tryMutate();
		myNewCategoryOpal = argCategoryOpal;
	}

	private AccountOpal myOldWriterOpal;
	private AccountOpal myNewWriterOpal;

	protected AccountOpal retrieveWriterOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[4] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getAccountOpalFactory().forId(getWriterAccountIdAsObject());
	}

	public synchronized AccountOpal getWriterOpal() {
		AccountOpal lclAccountOpal;
		boolean lclAccess = tryAccess();
		lclAccountOpal = lclAccess ? myNewWriterOpal : myOldWriterOpal;
		if (lclAccountOpal == AccountOpal.NOT_YET_LOADED) {
			lclAccountOpal = retrieveWriterOpal(getReadValueSet());
			if (lclAccess) {
				myNewWriterOpal = lclAccountOpal;
			} else {
				myOldWriterOpal = lclAccountOpal;
			}
		}
		return lclAccountOpal;
	}

	public synchronized QuestionOpal setWriterOpal(AccountOpal argAccountOpal) {
		tryMutate();
		AccountOpal lclAccountOpal = getWriterOpal();
		if (lclAccountOpal == argAccountOpal) { return this; }
		if (lclAccountOpal != null) {
			lclAccountOpal.removeWriterQuestionOpalInternal(this);
		}
		myNewWriterOpal = argAccountOpal;
		if (argAccountOpal != null) {
			argAccountOpal.addWriterQuestionOpalInternal(this);
		}
		return this;
	}

	protected synchronized void setWriterOpalInternal(AccountOpal argAccountOpal) {
		tryMutate();
		myNewWriterOpal = argAccountOpal;
	}

	private java.util.HashSet<DiffOpal> myOldDiffOpalHashSet = null;
	private java.util.HashSet<DiffOpal> myNewDiffOpalHashSet = null;
	private java.util.ArrayList<CachedOperation<DiffOpal>> myDiffOpalCachedOperations = null;

	/* package */ java.util.HashSet<DiffOpal> getDiffOpalClass() {
		if (tryAccess()) {
			if (myNewDiffOpalHashSet == null) {
				if (myOldDiffOpalHashSet == null) {
					myOldDiffOpalHashSet = OpalFactoryFactory.getInstance().getDiffOpalFactory().forQuestionIdCollection(getIdAsObject());
				}
				myNewDiffOpalHashSet = new java.util.HashSet<>(myOldDiffOpalHashSet);
				if (myDiffOpalCachedOperations != null) {
					OpalUtility.handleCachedOperations(myDiffOpalCachedOperations, myNewDiffOpalHashSet);
					myDiffOpalCachedOperations = null;
				}
			}
			return myNewDiffOpalHashSet;
		}
		if (myOldDiffOpalHashSet == null) {
			myOldDiffOpalHashSet = OpalFactoryFactory.getInstance().getDiffOpalFactory().forQuestionIdCollection(getIdAsObject());
		}
		return myOldDiffOpalHashSet;
	}

	public synchronized void addDiffOpal(DiffOpal argDiffOpal) {
		tryMutate();
		argDiffOpal.setQuestionOpal(this);
		return;
	}

	protected synchronized void addDiffOpalInternal(DiffOpal argDiffOpal) {
		tryMutate();
		if (myNewDiffOpalHashSet == null) {
			if (myOldDiffOpalHashSet == null) {
				if (myDiffOpalCachedOperations == null) { myDiffOpalCachedOperations = new java.util.ArrayList<>(); }
				myDiffOpalCachedOperations.add(new CachedOperation<>(CachedOperation.ADD, argDiffOpal));
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
		argDiffOpal.setQuestionOpal(null);
	}

	protected synchronized void removeDiffOpalInternal(DiffOpal argDiffOpal) {
		tryMutate();
		if (myNewDiffOpalHashSet == null) {
			if (myOldDiffOpalHashSet == null) {
				if (myDiffOpalCachedOperations == null) { myDiffOpalCachedOperations = new java.util.ArrayList<>(); }
				myDiffOpalCachedOperations.add(new CachedOperation<>(CachedOperation.REMOVE, argDiffOpal));
			} else {
				myNewDiffOpalHashSet = new java.util.HashSet<>(myOldDiffOpalHashSet);
				myNewDiffOpalHashSet.remove(argDiffOpal);
			}
		} else {
			myNewDiffOpalHashSet.remove(argDiffOpal);
		}
		return;
	}

	public synchronized int getDiffOpalCount() { return getDiffOpalClass().size(); }

	public synchronized java.util.Iterator<DiffOpal> createDiffOpalIterator() {
		return getDiffOpalClass().iterator();
	}

	public synchronized java.util.stream.Stream<DiffOpal> streamDiffOpal() {
		return getDiffOpalClass().stream();
	}

	public synchronized void clearDiffOpalInternal() { getDiffOpalClass().clear(); }

	private java.util.HashSet<PlacementOpal> myOldPlacementOpalHashSet = null;
	private java.util.HashSet<PlacementOpal> myNewPlacementOpalHashSet = null;
	private java.util.ArrayList<CachedOperation<PlacementOpal>> myPlacementOpalCachedOperations = null;

	/* package */ java.util.HashSet<PlacementOpal> getPlacementOpalClass() {
		if (tryAccess()) {
			if (myNewPlacementOpalHashSet == null) {
				if (myOldPlacementOpalHashSet == null) {
					myOldPlacementOpalHashSet = OpalFactoryFactory.getInstance().getPlacementOpalFactory().forQuestionIdCollection(getIdAsObject());
				}
				myNewPlacementOpalHashSet = new java.util.HashSet<>(myOldPlacementOpalHashSet);
				if (myPlacementOpalCachedOperations != null) {
					OpalUtility.handleCachedOperations(myPlacementOpalCachedOperations, myNewPlacementOpalHashSet);
					myPlacementOpalCachedOperations = null;
				}
			}
			return myNewPlacementOpalHashSet;
		}
		if (myOldPlacementOpalHashSet == null) {
			myOldPlacementOpalHashSet = OpalFactoryFactory.getInstance().getPlacementOpalFactory().forQuestionIdCollection(getIdAsObject());
		}
		return myOldPlacementOpalHashSet;
	}

	public synchronized void addPlacementOpal(PlacementOpal argPlacementOpal) {
		tryMutate();
		argPlacementOpal.setQuestionOpal(this);
		return;
	}

	protected synchronized void addPlacementOpalInternal(PlacementOpal argPlacementOpal) {
		tryMutate();
		if (myNewPlacementOpalHashSet == null) {
			if (myOldPlacementOpalHashSet == null) {
				if (myPlacementOpalCachedOperations == null) { myPlacementOpalCachedOperations = new java.util.ArrayList<>(); }
				myPlacementOpalCachedOperations.add(new CachedOperation<>(CachedOperation.ADD, argPlacementOpal));
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
		argPlacementOpal.setQuestionOpal(null);
	}

	protected synchronized void removePlacementOpalInternal(PlacementOpal argPlacementOpal) {
		tryMutate();
		if (myNewPlacementOpalHashSet == null) {
			if (myOldPlacementOpalHashSet == null) {
				if (myPlacementOpalCachedOperations == null) { myPlacementOpalCachedOperations = new java.util.ArrayList<>(); }
				myPlacementOpalCachedOperations.add(new CachedOperation<>(CachedOperation.REMOVE, argPlacementOpal));
			} else {
				myNewPlacementOpalHashSet = new java.util.HashSet<>(myOldPlacementOpalHashSet);
				myNewPlacementOpalHashSet.remove(argPlacementOpal);
			}
		} else {
			myNewPlacementOpalHashSet.remove(argPlacementOpal);
		}
		return;
	}

	public synchronized int getPlacementOpalCount() { return getPlacementOpalClass().size(); }

	public synchronized java.util.Iterator<PlacementOpal> createPlacementOpalIterator() {
		return getPlacementOpalClass().iterator();
	}

	public synchronized java.util.stream.Stream<PlacementOpal> streamPlacementOpal() {
		return getPlacementOpalClass().stream();
	}

	public synchronized void clearPlacementOpalInternal() { getPlacementOpalClass().clear(); }

	@Override
	public String toString() {
		StringBuilder lclSB =  new StringBuilder(64);
		lclSB.append("QuestionOpal[");
		lclSB.append("myId=");
		lclSB.append(toStringField(0));
		lclSB.append(']');
		return lclSB.toString();
	}

	@Override
	protected void updateReferencesAfterReload() {
		if (myNewCategoryOpal != CategoryOpal.NOT_YET_LOADED) {
			setCategoryOpal(retrieveCategoryOpal(getNewValues()));
		}
		if (myNewWriterOpal != AccountOpal.NOT_YET_LOADED) {
			setWriterOpal(retrieveWriterOpal(getNewValues()));
		}
	}

	@Override
	protected void updateCollectionsAfterReload() {
		assert needsToClearOldCollections() == false;
		setClearOldCollections(true);
	}

}
