package com.scobolsolo.persistence;

import com.scobolsolo.application.QuestionStatus;

public final class QuestionStatusOpal extends com.opal.UpdatableOpal<QuestionStatus> {

	private QuestionStatusOpal() {
		super();
		setUserFacing(null);
	}

	public QuestionStatusOpal(com.opal.OpalFactory<QuestionStatus, QuestionStatusOpal> argOpalFactory, Object[] argValues) {
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

	public static final QuestionStatusOpal NOT_YET_LOADED = new QuestionStatusOpal();

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

	public synchronized QuestionStatusOpal setCode(final java.lang.String argCode) {
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

	public synchronized QuestionStatusOpal setName(final java.lang.String argName) {
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

	public synchronized QuestionStatusOpal setShortName(final java.lang.String argShortName) {
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

	public synchronized QuestionStatusOpal setSequence(final java.lang.Integer argSequence) {
		tryMutate();
		if (argSequence == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set mySequence on " + this + " to null.");
		}
		getNewValues()[3] = argSequence;
		return this;
	}

	public QuestionStatusOpal setSequence(final int argSequence) {
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
		myNewQuestionOpalHashSet = null; /* Necessary if it has been rolled back */
		myQuestionOpalCachedOperations = null; /* Ditto */
		myNewDiffOpalHashSet = null; /* Necessary if it has been rolled back */
		myDiffOpalCachedOperations = null; /* Ditto */
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		/** This Opal has no references to other Opals that need to be copied. */
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
			myOldDiffOpalHashSet = null;
			} else {
			if (myNewDiffOpalHashSet != null) {
				myOldDiffOpalHashSet = myNewDiffOpalHashSet;
				myNewDiffOpalHashSet = null;
			} else {
				myDiffOpalCachedOperations = null;
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
				((QuestionOpal) lclI.next()).setStatusOpalInternal(null);
			}
		}
		if (myNewDiffOpalHashSet != null || myDiffOpalCachedOperations != null) {
			lclI = createDiffOpalIterator();
			while (lclI.hasNext()) {
				((DiffOpal) lclI.next()).setStatusOpalInternal(null);
			}
		}
		return;
	}

	@Override
	protected void copyFieldsToInternal(com.opal.UpdatableOpal<QuestionStatus> argTarget) {
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

	private java.util.HashSet<QuestionOpal> myOldQuestionOpalHashSet = null;
	private java.util.HashSet<QuestionOpal> myNewQuestionOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<QuestionOpal>> myQuestionOpalCachedOperations = null;

	/* package */ java.util.HashSet<QuestionOpal> getQuestionOpalHashSet() {
		if (tryAccess()) {
			if (myNewQuestionOpalHashSet == null) {
				if (myOldQuestionOpalHashSet == null) {
					if (isNew()) {
						myOldQuestionOpalHashSet = new java.util.HashSet<>();
					} else {
						myOldQuestionOpalHashSet = OpalFactoryFactory.getInstance().getQuestionOpalFactory().forQuestionStatusCodeCollection(getCode());
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
				myOldQuestionOpalHashSet = OpalFactoryFactory.getInstance().getQuestionOpalFactory().forQuestionStatusCodeCollection(getCode());
			}
			return myOldQuestionOpalHashSet;
		}
	}

	public synchronized void addQuestionOpal(QuestionOpal argQuestionOpal) {
		tryMutate();
		argQuestionOpal.setStatusOpal(this);
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
		argQuestionOpal.setStatusOpal(null);
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

	public synchronized void clearQuestionOpalInternal() { getQuestionOpalHashSet().clear(); }

	private java.util.HashSet<DiffOpal> myOldDiffOpalHashSet = null;
	private java.util.HashSet<DiffOpal> myNewDiffOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<DiffOpal>> myDiffOpalCachedOperations = null;

	/* package */ java.util.HashSet<DiffOpal> getDiffOpalHashSet() {
		if (tryAccess()) {
			if (myNewDiffOpalHashSet == null) {
				if (myOldDiffOpalHashSet == null) {
					if (isNew()) {
						myOldDiffOpalHashSet = new java.util.HashSet<>();
					} else {
						myOldDiffOpalHashSet = OpalFactoryFactory.getInstance().getDiffOpalFactory().forQuestionStatusCodeCollection(getCode());
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
				myOldDiffOpalHashSet = OpalFactoryFactory.getInstance().getDiffOpalFactory().forQuestionStatusCodeCollection(getCode());
			}
			return myOldDiffOpalHashSet;
		}
	}

	public synchronized void addDiffOpal(DiffOpal argDiffOpal) {
		tryMutate();
		argDiffOpal.setStatusOpal(this);
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
		argDiffOpal.setStatusOpal(null);
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

	public synchronized void clearDiffOpalInternal() { getDiffOpalHashSet().clear(); }

	@Override
	public String toString() {
		StringBuilder lclSB =  new StringBuilder(64);
		lclSB.append("QuestionStatusOpal[");
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
