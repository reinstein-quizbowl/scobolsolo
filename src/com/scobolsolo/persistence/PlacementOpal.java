package com.scobolsolo.persistence;

import java.io.PrintWriter;
import java.io.PrintStream;

import com.opal.*;

import com.scobolsolo.application.*;

@StoreGeneratedPrimaryKey
public final class PlacementOpal extends com.opal.UpdatableOpal<Placement> {
	public static final java.lang.Boolean ourDefaultTiebreaker = java.lang.Boolean.FALSE;
	public static final java.lang.Boolean ourDefaultScorecheckAfter = java.lang.Boolean.FALSE;

	private PlacementOpal() {
		super();
		setUserFacing(null);
	}

	public PlacementOpal(OpalFactory<Placement, PlacementOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void applyDefaults() {
		getNewValues()[4] = ourDefaultTiebreaker;
		getNewValues()[5] = ourDefaultScorecheckAfter;
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
		"Sequence",
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

	/* package */ static final FieldValidator[] ourFieldValidators = new FieldValidator[] {
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
	public FieldValidator[] getFieldValidators() { return ourFieldValidators; }

	@Override
	public boolean[] getFieldNullability() { return ourFieldNullability; }

	public static FieldValidator[] getStaticFieldValidators() { return ourFieldValidators; }


	public synchronized java.lang.Integer getIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[0];
	}

	public synchronized java.lang.Integer getQuestionIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[1];
	}

	public synchronized java.lang.Integer getPacketIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[2];
	}

	public synchronized java.lang.Integer getSequenceAsObject() {
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

	public synchronized PlacementOpal setSequence(final java.lang.Integer argSequence) {
		tryMutate();
		if (argSequence == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set mySequence on " + this + " to null.");
		}
		getNewValues()[3] = argSequence;
		return this;
	}

	public PlacementOpal setSequence(final int argSequence) {
		setSequence(java.lang.Integer.valueOf(argSequence));
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
			throw new com.opal.ArgumentTooLongException("Maximum length of myCategoryCode on " + this + " is 32.", argCategoryCode.length(), 32);
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
		myNewReplacementForResponseOpalHashSet = null; /* Necessary if it has been rolled back */
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
			} else {
			if (myNewResponseOpalHashSet != null) {
				myOldResponseOpalHashSet = myNewResponseOpalHashSet;
				myNewResponseOpalHashSet = null;
			} else {
				myResponseOpalCachedOperations = null;
			}
		}
		if (needsToClearOldCollections()) {
			myOldReplacementForResponseOpalHashSet = null;
			} else {
			if (myNewReplacementForResponseOpalHashSet != null) {
				myOldReplacementForResponseOpalHashSet = myNewReplacementForResponseOpalHashSet;
				myNewReplacementForResponseOpalHashSet = null;
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
		if (myNewReplacementForResponseOpalHashSet != null || myReplacementForResponseOpalCachedOperations != null) {
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
	protected void copyFieldsToInternal(UpdatableOpal<Placement> argTarget) {
		Object[] lclValues = getReadValueSet();
		Object[] lclTargetNewValues = argTarget.getNewValues();
		/* Field 0 (Id) is database generated. */
		/* Field 1 (QuestionId) is part of a unique key. */
		/* Field 2 (PacketId) is part of a unique key. */
		lclTargetNewValues[3] = lclValues[3]; /* Sequence (immutable) */
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
		UpdatableOpal<?> lclUO;
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
		UpdatableOpal<?> lclUO;
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
	public synchronized void output(final PrintWriter argPW) {
		argPW.println("Id = " + getIdAsObject());
		argPW.println("QuestionId = " + getQuestionIdAsObject());
		argPW.println("PacketId = " + getPacketIdAsObject());
		argPW.println("Sequence = " + getSequenceAsObject());
		argPW.println("Tiebreaker = " + isTiebreakerAsObject());
		argPW.println("ScorecheckAfter = " + isScorecheckAfterAsObject());
		argPW.println("CategoryCode = " + getCategoryCode());
	}

	@Override
	public synchronized void output(final PrintStream argPS) {
		argPS.println("Id = " + getIdAsObject());
		argPS.println("QuestionId = " + getQuestionIdAsObject());
		argPS.println("PacketId = " + getPacketIdAsObject());
		argPS.println("Sequence = " + getSequenceAsObject());
		argPS.println("Tiebreaker = " + isTiebreakerAsObject());
		argPS.println("ScorecheckAfter = " + isScorecheckAfterAsObject());
		argPS.println("CategoryCode = " + getCategoryCode());
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

	private java.util.HashSet<ResponseOpal> myOldResponseOpalHashSet = null;
	private java.util.HashSet<ResponseOpal> myNewResponseOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<ResponseOpal>> myResponseOpalCachedOperations = null;

	/* package */ java.util.HashSet<ResponseOpal> getResponseOpalHashSet() {
		if (tryAccess()) {
			if (myNewResponseOpalHashSet == null) {
				if (myOldResponseOpalHashSet == null) {
					if (isNew()) {
						myOldResponseOpalHashSet = new java.util.HashSet<>();
					} else {
						myOldResponseOpalHashSet = OpalFactoryFactory.getInstance().getResponseOpalFactory().forPlacementIdCollection(getIdAsObject());
					}
				}
				myNewResponseOpalHashSet = new java.util.HashSet<>(myOldResponseOpalHashSet);
				if (myResponseOpalCachedOperations != null) {
					OpalUtility.handleCachedOperations(myResponseOpalCachedOperations, myNewResponseOpalHashSet);
					myResponseOpalCachedOperations = null;
				}
			}
			return myNewResponseOpalHashSet;
		} else {
			if (myOldResponseOpalHashSet == null) {
				myOldResponseOpalHashSet = OpalFactoryFactory.getInstance().getResponseOpalFactory().forPlacementIdCollection(getIdAsObject());
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
				myResponseOpalCachedOperations.add(new CachedOperation<>(CachedOperation.ADD, argResponseOpal));
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
				myResponseOpalCachedOperations.add(new CachedOperation<>(CachedOperation.REMOVE, argResponseOpal));
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

	public synchronized void clearResponseOpalInternal() { getResponseOpalHashSet().clear(); }

	private java.util.HashSet<ResponseOpal> myOldReplacementForResponseOpalHashSet = null;
	private java.util.HashSet<ResponseOpal> myNewReplacementForResponseOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<ResponseOpal>> myReplacementForResponseOpalCachedOperations = null;

	/* package */ java.util.HashSet<ResponseOpal> getReplacementForResponseOpalHashSet() {
		if (tryAccess()) {
			if (myNewReplacementForResponseOpalHashSet == null) {
				if (myOldReplacementForResponseOpalHashSet == null) {
					if (isNew()) {
						myOldReplacementForResponseOpalHashSet = new java.util.HashSet<>();
					} else {
						myOldReplacementForResponseOpalHashSet = OpalFactoryFactory.getInstance().getResponseOpalFactory().forReplacementForPlacementIdCollection(getIdAsObject());
					}
				}
				myNewReplacementForResponseOpalHashSet = new java.util.HashSet<>(myOldReplacementForResponseOpalHashSet);
				if (myReplacementForResponseOpalCachedOperations != null) {
					OpalUtility.handleCachedOperations(myReplacementForResponseOpalCachedOperations, myNewReplacementForResponseOpalHashSet);
					myReplacementForResponseOpalCachedOperations = null;
				}
			}
			return myNewReplacementForResponseOpalHashSet;
		} else {
			if (myOldReplacementForResponseOpalHashSet == null) {
				myOldReplacementForResponseOpalHashSet = OpalFactoryFactory.getInstance().getResponseOpalFactory().forReplacementForPlacementIdCollection(getIdAsObject());
			}
			return myOldReplacementForResponseOpalHashSet;
		}
	}

	public synchronized void addReplacementForResponseOpal(ResponseOpal argResponseOpal) {
		tryMutate();
		argResponseOpal.setReplacementForPlacementOpal(this);
		return;
	}

	protected synchronized void addReplacementForResponseOpalInternal(ResponseOpal argResponseOpal) {
		tryMutate();
		if (myNewReplacementForResponseOpalHashSet == null) {
			if (myOldReplacementForResponseOpalHashSet == null) {
				if (myReplacementForResponseOpalCachedOperations == null) { myReplacementForResponseOpalCachedOperations = new java.util.ArrayList<>(); }
				myReplacementForResponseOpalCachedOperations.add(new CachedOperation<>(CachedOperation.ADD, argResponseOpal));
			} else {
				myNewReplacementForResponseOpalHashSet = new java.util.HashSet<>(myOldReplacementForResponseOpalHashSet);
				myNewReplacementForResponseOpalHashSet.add(argResponseOpal);
			}
		} else {
			myNewReplacementForResponseOpalHashSet.add(argResponseOpal);
		}
		return;
	}

	public synchronized void removeReplacementForResponseOpal(ResponseOpal argResponseOpal) {
		tryMutate();
		argResponseOpal.setReplacementForPlacementOpal(null);
	}

	protected synchronized void removeReplacementForResponseOpalInternal(ResponseOpal argResponseOpal) {
		tryMutate();
		if (myNewReplacementForResponseOpalHashSet == null) {
			if (myOldReplacementForResponseOpalHashSet == null) {
				if (myReplacementForResponseOpalCachedOperations == null) { myReplacementForResponseOpalCachedOperations = new java.util.ArrayList<>(); }
				myReplacementForResponseOpalCachedOperations.add(new CachedOperation<>(CachedOperation.REMOVE, argResponseOpal));
			} else {
				myNewReplacementForResponseOpalHashSet = new java.util.HashSet<>(myOldReplacementForResponseOpalHashSet);
				myNewReplacementForResponseOpalHashSet.remove(argResponseOpal);
			}
		} else {
			myNewReplacementForResponseOpalHashSet.remove(argResponseOpal);
		}
		return;
	}

	public synchronized int getReplacementForResponseOpalCount() { return getReplacementForResponseOpalHashSet().size(); }

	public synchronized java.util.Iterator<ResponseOpal> createReplacementForResponseOpalIterator() {
		return getReplacementForResponseOpalHashSet().iterator();
	}

	public synchronized java.util.stream.Stream<ResponseOpal> streamReplacementForResponseOpal() {
		return getReplacementForResponseOpalHashSet().stream();
	}

	public synchronized void clearReplacementForResponseOpalInternal() { getReplacementForResponseOpalHashSet().clear(); }

	@Override
	public String toString() {
		StringBuilder lclSB =  new StringBuilder(64);
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
