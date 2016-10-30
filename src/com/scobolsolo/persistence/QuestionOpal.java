package com.scobolsolo.persistence;

import com.scobolsolo.application.Question;

@com.opal.StoreGeneratedPrimaryKey
public final class QuestionOpal extends com.opal.UpdatableOpal<Question> {

	public static final java.lang.String ourDefaultQuestionStatusCode = "DRAFTED";

	private QuestionOpal() {
		super();
		setUserFacing(null);
	}

	public QuestionOpal(com.opal.IdentityOpalFactory<Question, QuestionOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void applyDefaults() {
		/* Initialize fields with their default values. */
		getNewValues()[7] = ourDefaultQuestionStatusCode;


		/* Initialize the back Collections to empty sets. */

		myNewDiffOpalHashSet = new java.util.HashSet<>();
		myNewPlacementOpalHashSet = new java.util.HashSet<>();

		return;
	}

	@Override
	protected void initializeReferences() {
		myOldCategoryOpal = CategoryOpal.NOT_YET_LOADED;
		myOldWriterOpal = AccountOpal.NOT_YET_LOADED;
		myOldStatusOpal = QuestionStatusOpal.NOT_YET_LOADED;
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
		"QuestionStatusCode",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.Integer.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.Integer.class,
		java.lang.String.class,
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
		false,
	};

	/* package */ static final com.opal.FieldValidator[] ourFieldValidators = new com.opal.FieldValidator[] {
		null,
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
	public com.opal.FieldValidator[] getFieldValidators() { return ourFieldValidators; }

	@Override
	public boolean[] getFieldNullability() { return ourFieldNullability; }

	public static com.opal.FieldValidator[] getStaticFieldValidators() { return ourFieldValidators; }


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

	public synchronized java.lang.String getQuestionStatusCode() {
		return (java.lang.String) getReadValueSet()[7];
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
			throw new com.opal.ArgumentTooLongException("Cannot set myCategoryCode on " + this + " to \"" + argCategoryCode + "\" because that field's maximum length is 32.", argCategoryCode.length(), 32);
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

	public synchronized QuestionOpal setQuestionStatusCode(final java.lang.String argQuestionStatusCode) {
		tryMutate();
		if (argQuestionStatusCode == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myQuestionStatusCode on " + this + " to null.");
		}
		if (argQuestionStatusCode.length() > 32) {
			throw new com.opal.ArgumentTooLongException("Cannot set myQuestionStatusCode on " + this + " to \"" + argQuestionStatusCode + "\" because that field's maximum length is 32.", argQuestionStatusCode.length(), 32);
		}
		getNewValues()[7] = argQuestionStatusCode;
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
		myNewStatusOpal = myOldStatusOpal;
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
		myOldStatusOpal = myNewStatusOpal;

		if (needsToClearOldCollections()) {
			myOldDiffOpalHashSet = null;
			myOldPlacementOpalHashSet = null;
		} else {
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
		if (getStatusOpal() != null) {
			getStatusOpal().removeQuestionOpalInternal(this);
		}
		return;
	}

	@Override
	protected void copyFieldsToInternal(com.opal.UpdatableOpal<Question> argTarget) {
		Object[] lclValues = getReadValueSet();
		Object[] lclTargetNewValues = argTarget.getNewValues();
		/* Field 0 (Id) is database generated. */
		lclTargetNewValues[1] = lclValues[1]; /* Description (immutable) */
		lclTargetNewValues[2] = lclValues[2]; /* CategoryCode (immutable) */
		lclTargetNewValues[3] = lclValues[3]; /* Note (immutable) */
		lclTargetNewValues[4] = lclValues[4]; /* WriterAccountId (immutable) */
		lclTargetNewValues[5] = lclValues[5]; /* Text (immutable) */
		lclTargetNewValues[6] = lclValues[6]; /* Answer (immutable) */
		lclTargetNewValues[7] = lclValues[7]; /* QuestionStatusCode (immutable) */

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
		if (myNewStatusOpal != QuestionStatusOpal.NOT_YET_LOADED) {
			setQuestionStatusCode(myNewStatusOpal == null ? null : myNewStatusOpal.getCode());
		}
		return;
	}

	@Override
	public java.util.Set<com.opal.TransactionAware> getRequiredPriorCommits() {
		java.util.Set<com.opal.TransactionAware> lclTAs = null;
		com.opal.UpdatableOpal<?> lclUO;
		lclUO = myNewCategoryOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		lclUO = myNewStatusOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
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
	public java.util.Set<com.opal.TransactionAware> getRequiredSubsequentCommits() {
		if (isNew()) {
			return java.util.Collections.emptySet();
		}
		java.util.Set<com.opal.TransactionAware> lclTAs = null;
		com.opal.UpdatableOpal<?> lclUO;
		if ((lclUO = myOldCategoryOpal) == CategoryOpal.NOT_YET_LOADED) {
			lclUO = myOldCategoryOpal = retrieveCategoryOpal(getOldValues());
		}
		if (lclUO != null && lclUO.isDeleted()) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		if ((lclUO = myOldStatusOpal) == QuestionStatusOpal.NOT_YET_LOADED) {
			lclUO = myOldStatusOpal = retrieveStatusOpal(getOldValues());
		}
		if (lclUO != null && lclUO.isDeleted()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		if ((lclUO = myOldWriterOpal) == AccountOpal.NOT_YET_LOADED) {
			lclUO = myOldWriterOpal = retrieveWriterOpal(getOldValues());
		}
		if (lclUO != null && lclUO.isDeleted()) {
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
		argOutput.println("Description = " + getDescription());
		argOutput.println("CategoryCode = " + getCategoryCode());
		argOutput.println("Note = " + getNote());
		argOutput.println("WriterAccountId = " + getWriterAccountIdAsObject());
		argOutput.println("Text = " + getText());
		argOutput.println("Answer = " + getAnswer());
		argOutput.println("QuestionStatusCode = " + getQuestionStatusCode());
	}

	@Override
	public synchronized void output(final java.io.PrintWriter argOutput) {
		argOutput.println("Id = " + getIdAsObject());
		argOutput.println("Description = " + getDescription());
		argOutput.println("CategoryCode = " + getCategoryCode());
		argOutput.println("Note = " + getNote());
		argOutput.println("WriterAccountId = " + getWriterAccountIdAsObject());
		argOutput.println("Text = " + getText());
		argOutput.println("Answer = " + getAnswer());
		argOutput.println("QuestionStatusCode = " + getQuestionStatusCode());
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

	private QuestionStatusOpal myOldStatusOpal;
	private QuestionStatusOpal myNewStatusOpal;

	protected QuestionStatusOpal retrieveStatusOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[7] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getQuestionStatusOpalFactory().forCode(getQuestionStatusCode());
	}

	public synchronized QuestionStatusOpal getStatusOpal() {
		QuestionStatusOpal lclQuestionStatusOpal;
		boolean lclAccess = tryAccess();
		lclQuestionStatusOpal = lclAccess ? myNewStatusOpal : myOldStatusOpal;
		if (lclQuestionStatusOpal == QuestionStatusOpal.NOT_YET_LOADED) {
			lclQuestionStatusOpal = retrieveStatusOpal(getReadValueSet());
			if (lclAccess) {
				myNewStatusOpal = lclQuestionStatusOpal;
			} else {
				myOldStatusOpal = lclQuestionStatusOpal;
			}
		}
		return lclQuestionStatusOpal;
	}

	public synchronized QuestionOpal setStatusOpal(QuestionStatusOpal argQuestionStatusOpal) {
		tryMutate();
		QuestionStatusOpal lclQuestionStatusOpal = getStatusOpal();
		if (lclQuestionStatusOpal == argQuestionStatusOpal) { return this; }
		if (lclQuestionStatusOpal != null) {
			lclQuestionStatusOpal.removeQuestionOpalInternal(this);
		}
		myNewStatusOpal = argQuestionStatusOpal;
		if (argQuestionStatusOpal != null) {
			argQuestionStatusOpal.addQuestionOpalInternal(this);
		}
		return this;
	}

	protected synchronized void setStatusOpalInternal(QuestionStatusOpal argQuestionStatusOpal) {
		tryMutate();
		myNewStatusOpal = argQuestionStatusOpal;
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
						lclS = OpalFactoryFactory.getInstance().getDiffOpalFactory().forQuestionIdCollection(getIdAsObject());
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
				lclS = OpalFactoryFactory.getInstance().getDiffOpalFactory().forQuestionIdCollection(getIdAsObject());
				myOldDiffOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
			}
			return myOldDiffOpalHashSet;
		}
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
		argDiffOpal.setQuestionOpal(null);
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
						lclS = OpalFactoryFactory.getInstance().getPlacementOpalFactory().forQuestionIdCollection(getIdAsObject());
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
				lclS = OpalFactoryFactory.getInstance().getPlacementOpalFactory().forQuestionIdCollection(getIdAsObject());
				myOldPlacementOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
			}
			return myOldPlacementOpalHashSet;
		}
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
		argPlacementOpal.setQuestionOpal(null);
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
		if (myNewStatusOpal != QuestionStatusOpal.NOT_YET_LOADED) {
			setStatusOpal(retrieveStatusOpal(getNewValues()));
		}
	}

	@Override
	protected void updateCollectionsAfterReload() {
		assert needsToClearOldCollections() == false;
		setClearOldCollections(true);
	}

}
