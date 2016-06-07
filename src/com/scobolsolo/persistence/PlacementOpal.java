package com.scobolsolo.persistence;

import com.scobolsolo.application.Placement;

@com.opal.StoreGeneratedPrimaryKey
public final class PlacementOpal extends com.opal.UpdatableOpal<Placement> {

	public static final java.lang.Boolean ourDefaultTiebreaker = java.lang.Boolean.FALSE;
	public static final java.lang.Boolean ourDefaultScorecheckAfter = java.lang.Boolean.FALSE;

	private PlacementOpal() {
		super();
		setUserFacing(null);
	}

	public PlacementOpal(com.opal.IdentityOpalFactory<Placement, PlacementOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void applyDefaults() {
		/* Initialize fields with their default values. */
		getNewValues()[4] = ourDefaultTiebreaker;
		getNewValues()[5] = ourDefaultScorecheckAfter;


		/* Initialize the back Collections to empty sets. */

		myNewResponseOpalHashSet = new java.util.HashSet<>();
		myNewReplacementForResponseOpalFast3Set = new com.siliconage.util.Fast3Set<>();

		return;
	}

	@Override
	protected void initializeReferences() {
		myOldPacketOpal = PacketOpal.NOT_YET_LOADED;
		myOldQuestionOpal = QuestionOpal.NOT_YET_LOADED;
		myOldCategoryOpal = CategoryOpal.NOT_YET_LOADED;
		return;
	}

	/* package */ static final String[] ourFieldNames = new String[] {
		"Id",
		"QuestionId",
		"PacketId",
		"Number",
		"Tiebreaker",
		"ScorecheckAfter",
		"CategoryCode",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.lang.Boolean.class,
		java.lang.Boolean.class,
		java.lang.String.class,
	};

	/* package */ static final boolean[] ourFieldNullability = new boolean[] {
		false,
		true,
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
		null,
	};

	public static final PlacementOpal NOT_YET_LOADED = new PlacementOpal();

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

	public synchronized java.lang.Integer getQuestionIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[1];
	}

	public synchronized java.lang.Integer getPacketIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[2];
	}

	public synchronized java.lang.Integer getNumberAsObject() {
		return (java.lang.Integer) getReadValueSet()[3];
	}

	public synchronized java.lang.Boolean isTiebreakerAsObject() {
		return (java.lang.Boolean) getReadValueSet()[4];
	}

	public synchronized java.lang.Boolean isScorecheckAfterAsObject() {
		return (java.lang.Boolean) getReadValueSet()[5];
	}

	public synchronized java.lang.String getCategoryCode() {
		return (java.lang.String) getReadValueSet()[6];
	}

	public synchronized PlacementOpal setId(final java.lang.Integer argId) {
		tryMutate();
		if (argId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myId on " + this + " to null.");
		}
		getNewValues()[0] = argId;
		return this;
	}

	public PlacementOpal setId(final int argId) {
		setId(java.lang.Integer.valueOf(argId));
		return this;
	}

	public synchronized PlacementOpal setQuestionId(final java.lang.Integer argQuestionId) {
		tryMutate();
		getNewValues()[1] = argQuestionId;
		return this;
	}

	public PlacementOpal setQuestionId(final int argQuestionId) {
		setQuestionId(java.lang.Integer.valueOf(argQuestionId));
		return this;
	}

	public synchronized PlacementOpal setPacketId(final java.lang.Integer argPacketId) {
		tryMutate();
		if (argPacketId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myPacketId on " + this + " to null.");
		}
		getNewValues()[2] = argPacketId;
		return this;
	}

	public PlacementOpal setPacketId(final int argPacketId) {
		setPacketId(java.lang.Integer.valueOf(argPacketId));
		return this;
	}

	public synchronized PlacementOpal setNumber(final java.lang.Integer argNumber) {
		tryMutate();
		if (argNumber == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myNumber on " + this + " to null.");
		}
		getNewValues()[3] = argNumber;
		return this;
	}

	public PlacementOpal setNumber(final int argNumber) {
		setNumber(java.lang.Integer.valueOf(argNumber));
		return this;
	}

	public synchronized PlacementOpal setTiebreaker(final java.lang.Boolean argTiebreaker) {
		tryMutate();
		if (argTiebreaker == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myTiebreaker on " + this + " to null.");
		}
		getNewValues()[4] = argTiebreaker;
		return this;
	}

	public PlacementOpal setTiebreaker(final boolean argTiebreaker) {
		setTiebreaker(argTiebreaker ? Boolean.TRUE : Boolean.FALSE);
		return this;
	}

	public synchronized PlacementOpal setScorecheckAfter(final java.lang.Boolean argScorecheckAfter) {
		tryMutate();
		if (argScorecheckAfter == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myScorecheckAfter on " + this + " to null.");
		}
		getNewValues()[5] = argScorecheckAfter;
		return this;
	}

	public PlacementOpal setScorecheckAfter(final boolean argScorecheckAfter) {
		setScorecheckAfter(argScorecheckAfter ? Boolean.TRUE : Boolean.FALSE);
		return this;
	}

	public synchronized PlacementOpal setCategoryCode(final java.lang.String argCategoryCode) {
		tryMutate();
		if (argCategoryCode == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myCategoryCode on " + this + " to null.");
		}
		if (argCategoryCode.length() > 32) {
			throw new com.opal.ArgumentTooLongException("Cannot set myCategoryCode on " + this + " to \"" + argCategoryCode + "\" because that field's maximum length is 32.", argCategoryCode.length(), 32);
		}
		getNewValues()[6] = argCategoryCode;
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
		myNewPacketOpal = myOldPacketOpal;
		myNewQuestionOpal = myOldQuestionOpal;
		myNewCategoryOpal = myOldCategoryOpal;
		myNewResponseOpalHashSet = null; /* Necessary if it has been rolled back */
		myResponseOpalCachedOperations = null; /* Ditto */
		myNewReplacementForResponseOpalFast3Set = null; /* Necessary if it has been rolled back */
		myReplacementForResponseOpalCachedOperations = null; /* Ditto */
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		myOldPacketOpal = myNewPacketOpal;
		myOldQuestionOpal = myNewQuestionOpal;
		myOldCategoryOpal = myNewCategoryOpal;

		if (needsToClearOldCollections()) {
			myOldResponseOpalHashSet = null;
			myOldReplacementForResponseOpalFast3Set = null;
		} else {
			if (myNewResponseOpalHashSet != null) {
				if (myNewResponseOpalHashSet.size() > 0) {
					myOldResponseOpalHashSet = myNewResponseOpalHashSet;
				} else {
					myOldResponseOpalHashSet = java.util.Collections.emptySet();
				}
				myNewResponseOpalHashSet = null;
			} else {
				myResponseOpalCachedOperations = null;
			}
			if (myNewReplacementForResponseOpalFast3Set != null) {
				if (myNewReplacementForResponseOpalFast3Set.size() > 0) {
					myOldReplacementForResponseOpalFast3Set = myNewReplacementForResponseOpalFast3Set;
				} else {
					myOldReplacementForResponseOpalFast3Set = java.util.Collections.emptySet();
				}
				myNewReplacementForResponseOpalFast3Set = null;
			} else {
				myReplacementForResponseOpalCachedOperations = null;
			}
		}
		setClearOldCollections(false);
		return;
	}

	@Override
	protected void unlinkInternal() {
		java.util.Iterator<?> lclI;
		if (myNewResponseOpalHashSet != null || myResponseOpalCachedOperations != null) {
			lclI = createResponseOpalIterator();
			while (lclI.hasNext()) {
				((ResponseOpal) lclI.next()).setPlacementOpalInternal(null);
			}
		}
		if (myNewReplacementForResponseOpalFast3Set != null || myReplacementForResponseOpalCachedOperations != null) {
			lclI = createReplacementForResponseOpalIterator();
			while (lclI.hasNext()) {
				((ResponseOpal) lclI.next()).setReplacementForPlacementOpalInternal(null);
			}
		}
		if (getPacketOpal() != null) {
			getPacketOpal().removePlacementOpalInternal(this);
		}
		if (getQuestionOpal() != null) {
			getQuestionOpal().removePlacementOpalInternal(this);
		}
		if (getCategoryOpal() != null) {
			getCategoryOpal().removePlacementOpalInternal(this);
		}
		return;
	}

	@Override
	protected void copyFieldsToInternal(com.opal.UpdatableOpal<Placement> argTarget) {
		Object[] lclValues = getReadValueSet();
		Object[] lclTargetNewValues = argTarget.getNewValues();
		/* Field 0 (Id) is database generated. */
		/* Field 1 (QuestionId) is part of a unique key. */
		/* Field 2 (PacketId) is part of a unique key. */
		lclTargetNewValues[3] = lclValues[3]; /* Number (immutable) */
		lclTargetNewValues[4] = lclValues[4]; /* Tiebreaker (immutable) */
		lclTargetNewValues[5] = lclValues[5]; /* ScorecheckAfter (immutable) */
		lclTargetNewValues[6] = lclValues[6]; /* CategoryCode (immutable) */

		return;
	}

	@Override
	public synchronized void translateReferencesToFields() {
		if (myNewPacketOpal != PacketOpal.NOT_YET_LOADED) {
			setPacketId(myNewPacketOpal == null ? null : myNewPacketOpal.getIdAsObject());
		}
		if (myNewQuestionOpal != QuestionOpal.NOT_YET_LOADED) {
			setQuestionId(myNewQuestionOpal == null ? null : myNewQuestionOpal.getIdAsObject());
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
		lclUO = myNewCategoryOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		lclUO = myNewPacketOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		lclUO = myNewQuestionOpal;
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
		if ((lclUO = myOldPacketOpal) == PacketOpal.NOT_YET_LOADED) {
			lclUO = myOldPacketOpal = retrievePacketOpal(getOldValues());
		}
		if (lclUO != null && lclUO.isDeleted()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		if ((lclUO = myOldQuestionOpal) == QuestionOpal.NOT_YET_LOADED) {
			lclUO = myOldQuestionOpal = retrieveQuestionOpal(getOldValues());
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
		argOutput.println("QuestionId = " + getQuestionIdAsObject());
		argOutput.println("PacketId = " + getPacketIdAsObject());
		argOutput.println("Number = " + getNumberAsObject());
		argOutput.println("Tiebreaker = " + isTiebreakerAsObject());
		argOutput.println("ScorecheckAfter = " + isScorecheckAfterAsObject());
		argOutput.println("CategoryCode = " + getCategoryCode());
	}

	@Override
	public synchronized void output(final java.io.PrintWriter argOutput) {
		argOutput.println("Id = " + getIdAsObject());
		argOutput.println("QuestionId = " + getQuestionIdAsObject());
		argOutput.println("PacketId = " + getPacketIdAsObject());
		argOutput.println("Number = " + getNumberAsObject());
		argOutput.println("Tiebreaker = " + isTiebreakerAsObject());
		argOutput.println("ScorecheckAfter = " + isScorecheckAfterAsObject());
		argOutput.println("CategoryCode = " + getCategoryCode());
	}

	private PacketOpal myOldPacketOpal;
	private PacketOpal myNewPacketOpal;

	protected PacketOpal retrievePacketOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[2] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getPacketOpalFactory().forId(getPacketIdAsObject());
	}

	public synchronized PacketOpal getPacketOpal() {
		PacketOpal lclPacketOpal;
		boolean lclAccess = tryAccess();
		lclPacketOpal = lclAccess ? myNewPacketOpal : myOldPacketOpal;
		if (lclPacketOpal == PacketOpal.NOT_YET_LOADED) {
			lclPacketOpal = retrievePacketOpal(getReadValueSet());
			if (lclAccess) {
				myNewPacketOpal = lclPacketOpal;
			} else {
				myOldPacketOpal = lclPacketOpal;
			}
		}
		return lclPacketOpal;
	}

	public synchronized PlacementOpal setPacketOpal(PacketOpal argPacketOpal) {
		tryMutate();
		PacketOpal lclPacketOpal = getPacketOpal();
		if (lclPacketOpal == argPacketOpal) { return this; }
		if (lclPacketOpal != null) {
			lclPacketOpal.removePlacementOpalInternal(this);
		}
		myNewPacketOpal = argPacketOpal;
		if (argPacketOpal != null) {
			argPacketOpal.addPlacementOpalInternal(this);
		}
		return this;
	}

	protected synchronized void setPacketOpalInternal(PacketOpal argPacketOpal) {
		tryMutate();
		myNewPacketOpal = argPacketOpal;
	}

	private QuestionOpal myOldQuestionOpal;
	private QuestionOpal myNewQuestionOpal;

	protected QuestionOpal retrieveQuestionOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[1] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getQuestionOpalFactory().forId(getQuestionIdAsObject());
	}

	public synchronized QuestionOpal getQuestionOpal() {
		QuestionOpal lclQuestionOpal;
		boolean lclAccess = tryAccess();
		lclQuestionOpal = lclAccess ? myNewQuestionOpal : myOldQuestionOpal;
		if (lclQuestionOpal == QuestionOpal.NOT_YET_LOADED) {
			lclQuestionOpal = retrieveQuestionOpal(getReadValueSet());
			if (lclAccess) {
				myNewQuestionOpal = lclQuestionOpal;
			} else {
				myOldQuestionOpal = lclQuestionOpal;
			}
		}
		return lclQuestionOpal;
	}

	public synchronized PlacementOpal setQuestionOpal(QuestionOpal argQuestionOpal) {
		tryMutate();
		QuestionOpal lclQuestionOpal = getQuestionOpal();
		if (lclQuestionOpal == argQuestionOpal) { return this; }
		if (lclQuestionOpal != null) {
			lclQuestionOpal.removePlacementOpalInternal(this);
		}
		myNewQuestionOpal = argQuestionOpal;
		if (argQuestionOpal != null) {
			argQuestionOpal.addPlacementOpalInternal(this);
		}
		return this;
	}

	protected synchronized void setQuestionOpalInternal(QuestionOpal argQuestionOpal) {
		tryMutate();
		myNewQuestionOpal = argQuestionOpal;
	}

	private CategoryOpal myOldCategoryOpal;
	private CategoryOpal myNewCategoryOpal;

	protected CategoryOpal retrieveCategoryOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[6] == null)) {
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

	public synchronized PlacementOpal setCategoryOpal(CategoryOpal argCategoryOpal) {
		tryMutate();
		CategoryOpal lclCategoryOpal = getCategoryOpal();
		if (lclCategoryOpal == argCategoryOpal) { return this; }
		if (lclCategoryOpal != null) {
			lclCategoryOpal.removePlacementOpalInternal(this);
		}
		myNewCategoryOpal = argCategoryOpal;
		if (argCategoryOpal != null) {
			argCategoryOpal.addPlacementOpalInternal(this);
		}
		return this;
	}

	protected synchronized void setCategoryOpalInternal(CategoryOpal argCategoryOpal) {
		tryMutate();
		myNewCategoryOpal = argCategoryOpal;
	}

	private java.util.Set<ResponseOpal> myOldResponseOpalHashSet = null;
	private java.util.Set<ResponseOpal> myNewResponseOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<ResponseOpal>> myResponseOpalCachedOperations = null;

	/* package */ java.util.Set<ResponseOpal> getResponseOpalHashSet() {
		if (tryAccess()) {
			if (myNewResponseOpalHashSet == null) {
				if (myOldResponseOpalHashSet == null) {
					if (isNew()) {
						myOldResponseOpalHashSet = java.util.Collections.emptySet();
					} else {
						java.util.Set<ResponseOpal> lclS;
						lclS = OpalFactoryFactory.getInstance().getResponseOpalFactory().forPlacementIdCollection(getIdAsObject());
						myOldResponseOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
					}
				}
				myNewResponseOpalHashSet = new java.util.HashSet<>(myOldResponseOpalHashSet);
				if (myResponseOpalCachedOperations != null) {
					com.opal.OpalUtility.handleCachedOperations(myResponseOpalCachedOperations, myNewResponseOpalHashSet);
					myResponseOpalCachedOperations = null;
				}
			}
			return myNewResponseOpalHashSet;
		} else {
			if (myOldResponseOpalHashSet == null) {
				java.util.Set<ResponseOpal> lclS;
				lclS = OpalFactoryFactory.getInstance().getResponseOpalFactory().forPlacementIdCollection(getIdAsObject());
				myOldResponseOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
			}
			return myOldResponseOpalHashSet;
		}
	}

	public synchronized void addResponseOpal(ResponseOpal argResponseOpal) {
		tryMutate();
		argResponseOpal.setPlacementOpal(this);
		return;
	}

	protected synchronized void addResponseOpalInternal(ResponseOpal argResponseOpal) {
		tryMutate();
		if (myNewResponseOpalHashSet == null) {
			if (myOldResponseOpalHashSet == null) {
				if (myResponseOpalCachedOperations == null) { myResponseOpalCachedOperations = new java.util.ArrayList<>(); }
				myResponseOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.ADD, argResponseOpal));
			} else {
				myNewResponseOpalHashSet = new java.util.HashSet<>(myOldResponseOpalHashSet);
				myNewResponseOpalHashSet.add(argResponseOpal);
			}
		} else {
			myNewResponseOpalHashSet.add(argResponseOpal);
		}
		return;
	}

	public synchronized void removeResponseOpal(ResponseOpal argResponseOpal) {
		tryMutate();
		argResponseOpal.setPlacementOpal(null);
	}

	protected synchronized void removeResponseOpalInternal(ResponseOpal argResponseOpal) {
		tryMutate();
		if (myNewResponseOpalHashSet == null) {
			if (myOldResponseOpalHashSet == null) {
				if (myResponseOpalCachedOperations == null) { myResponseOpalCachedOperations = new java.util.ArrayList<>(); }
				myResponseOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.REMOVE, argResponseOpal));
			} else {
				myNewResponseOpalHashSet = new java.util.HashSet<>(myOldResponseOpalHashSet);
				myNewResponseOpalHashSet.remove(argResponseOpal);
			}
		} else {
			myNewResponseOpalHashSet.remove(argResponseOpal);
		}
		return;
	}

	public synchronized int getResponseOpalCount() { return getResponseOpalHashSet().size(); }

	public synchronized java.util.Iterator<ResponseOpal> createResponseOpalIterator() {
		return getResponseOpalHashSet().iterator();
	}

	public synchronized java.util.stream.Stream<ResponseOpal> streamResponseOpal() {
		return getResponseOpalHashSet().stream();
	}

	private java.util.Set<ResponseOpal> myOldReplacementForResponseOpalFast3Set = null;
	private java.util.Set<ResponseOpal> myNewReplacementForResponseOpalFast3Set = null;
	private java.util.ArrayList<com.opal.CachedOperation<ResponseOpal>> myReplacementForResponseOpalCachedOperations = null;

	/* package */ java.util.Set<ResponseOpal> getReplacementForResponseOpalFast3Set() {
		if (tryAccess()) {
			if (myNewReplacementForResponseOpalFast3Set == null) {
				if (myOldReplacementForResponseOpalFast3Set == null) {
					if (isNew()) {
						myOldReplacementForResponseOpalFast3Set = java.util.Collections.emptySet();
					} else {
						java.util.Set<ResponseOpal> lclS;
						lclS = OpalFactoryFactory.getInstance().getResponseOpalFactory().forReplacementForPlacementIdCollection(getIdAsObject());
						myOldReplacementForResponseOpalFast3Set = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
					}
				}
				myNewReplacementForResponseOpalFast3Set = new com.siliconage.util.Fast3Set<>(myOldReplacementForResponseOpalFast3Set);
				if (myReplacementForResponseOpalCachedOperations != null) {
					com.opal.OpalUtility.handleCachedOperations(myReplacementForResponseOpalCachedOperations, myNewReplacementForResponseOpalFast3Set);
					myReplacementForResponseOpalCachedOperations = null;
				}
			}
			return myNewReplacementForResponseOpalFast3Set;
		} else {
			if (myOldReplacementForResponseOpalFast3Set == null) {
				java.util.Set<ResponseOpal> lclS;
				lclS = OpalFactoryFactory.getInstance().getResponseOpalFactory().forReplacementForPlacementIdCollection(getIdAsObject());
				myOldReplacementForResponseOpalFast3Set = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
			}
			return myOldReplacementForResponseOpalFast3Set;
		}
	}

	public synchronized void addReplacementForResponseOpal(ResponseOpal argResponseOpal) {
		tryMutate();
		argResponseOpal.setReplacementForPlacementOpal(this);
		return;
	}

	protected synchronized void addReplacementForResponseOpalInternal(ResponseOpal argResponseOpal) {
		tryMutate();
		if (myNewReplacementForResponseOpalFast3Set == null) {
			if (myOldReplacementForResponseOpalFast3Set == null) {
				if (myReplacementForResponseOpalCachedOperations == null) { myReplacementForResponseOpalCachedOperations = new java.util.ArrayList<>(); }
				myReplacementForResponseOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.ADD, argResponseOpal));
			} else {
				myNewReplacementForResponseOpalFast3Set = new com.siliconage.util.Fast3Set<>(myOldReplacementForResponseOpalFast3Set);
				myNewReplacementForResponseOpalFast3Set.add(argResponseOpal);
			}
		} else {
			myNewReplacementForResponseOpalFast3Set.add(argResponseOpal);
		}
		return;
	}

	public synchronized void removeReplacementForResponseOpal(ResponseOpal argResponseOpal) {
		tryMutate();
		argResponseOpal.setReplacementForPlacementOpal(null);
	}

	protected synchronized void removeReplacementForResponseOpalInternal(ResponseOpal argResponseOpal) {
		tryMutate();
		if (myNewReplacementForResponseOpalFast3Set == null) {
			if (myOldReplacementForResponseOpalFast3Set == null) {
				if (myReplacementForResponseOpalCachedOperations == null) { myReplacementForResponseOpalCachedOperations = new java.util.ArrayList<>(); }
				myReplacementForResponseOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.REMOVE, argResponseOpal));
			} else {
				myNewReplacementForResponseOpalFast3Set = new com.siliconage.util.Fast3Set<>(myOldReplacementForResponseOpalFast3Set);
				myNewReplacementForResponseOpalFast3Set.remove(argResponseOpal);
			}
		} else {
			myNewReplacementForResponseOpalFast3Set.remove(argResponseOpal);
		}
		return;
	}

	public synchronized int getReplacementForResponseOpalCount() { return getReplacementForResponseOpalFast3Set().size(); }

	public synchronized java.util.Iterator<ResponseOpal> createReplacementForResponseOpalIterator() {
		return getReplacementForResponseOpalFast3Set().iterator();
	}

	public synchronized java.util.stream.Stream<ResponseOpal> streamReplacementForResponseOpal() {
		return getReplacementForResponseOpalFast3Set().stream();
	}

	@Override
	public java.lang.String toString() {
		java.lang.StringBuilder lclSB = new java.lang.StringBuilder(64);
		lclSB.append("PlacementOpal[");
		lclSB.append("myId=");
		lclSB.append(toStringField(0));
		lclSB.append(']');
		return lclSB.toString();
	}

	@Override
	protected void updateReferencesAfterReload() {
		if (myNewPacketOpal != PacketOpal.NOT_YET_LOADED) {
			setPacketOpal(retrievePacketOpal(getNewValues()));
		}
		if (myNewQuestionOpal != QuestionOpal.NOT_YET_LOADED) {
			setQuestionOpal(retrieveQuestionOpal(getNewValues()));
		}
		if (myNewCategoryOpal != CategoryOpal.NOT_YET_LOADED) {
			setCategoryOpal(retrieveCategoryOpal(getNewValues()));
		}
	}

	@Override
	protected void updateCollectionsAfterReload() {
		assert needsToClearOldCollections() == false;
		setClearOldCollections(true);
	}

}
