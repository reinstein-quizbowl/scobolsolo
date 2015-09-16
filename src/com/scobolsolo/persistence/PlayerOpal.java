package com.scobolsolo.persistence;

import com.scobolsolo.application.*;

@com.opal.StoreGeneratedPrimaryKey
public final class PlayerOpal extends com.opal.UpdatableOpal<Player> {
	public static final java.lang.Boolean ourDefaultExhibition = java.lang.Boolean.FALSE;

	private PlayerOpal() {
		super();
		setUserFacing(null);
	}

	public PlayerOpal(com.opal.OpalFactory<Player, PlayerOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void applyDefaults() {
		getNewValues()[8] = ourDefaultExhibition;
		return;
	}

	@Override
	protected void initializeReferences() {
		myOldContactOpal = ContactOpal.NOT_YET_LOADED;
		myOldInitialCardOpal = CardOpal.NOT_YET_LOADED;
		myOldSchoolRegistrationOpal = SchoolRegistrationOpal.NOT_YET_LOADED;
		myOldSchoolYearOpal = SchoolYearOpal.NOT_YET_LOADED;
		return;
	}

	/* package */ static final String[] ourFieldNames = new String[] {
		"Id",
		"ContactId",
		"SchoolRegistrationId",
		"SchoolYearCode",
		"RankWithinSchool",
		"Seed",
		"Note",
		"InitialCardId",
		"Exhibition",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.lang.String.class,
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.lang.String.class,
		java.lang.Integer.class,
		java.lang.Boolean.class,
	};

	/* package */ static final boolean[] ourFieldNullability = new boolean[] {
		false,
		false,
		true,
		true,
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
		null,
	};

	public static final PlayerOpal NOT_YET_LOADED = new PlayerOpal();

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

	public synchronized java.lang.Integer getContactIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[1];
	}

	public synchronized java.lang.Integer getSchoolRegistrationIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[2];
	}

	public synchronized java.lang.String getSchoolYearCode() {
		return (java.lang.String) getReadValueSet()[3];
	}

	public synchronized java.lang.Integer getRankWithinSchoolAsObject() {
		return (java.lang.Integer) getReadValueSet()[4];
	}

	public synchronized java.lang.Integer getSeedAsObject() {
		return (java.lang.Integer) getReadValueSet()[5];
	}

	public synchronized java.lang.String getNote() {
		return (java.lang.String) getReadValueSet()[6];
	}

	public synchronized java.lang.Integer getInitialCardIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[7];
	}

	public synchronized java.lang.Boolean isExhibitionAsObject() {
		return (java.lang.Boolean) getReadValueSet()[8];
	}

	public synchronized PlayerOpal setId(final java.lang.Integer argId) {
		tryMutate();
		if (argId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myId on " + this + " to null.");
		}
		getNewValues()[0] = argId;
		return this;
	}

	public PlayerOpal setId(final int argId) {
		setId(java.lang.Integer.valueOf(argId));
		return this;
	}

	public synchronized PlayerOpal setContactId(final java.lang.Integer argContactId) {
		tryMutate();
		if (argContactId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myContactId on " + this + " to null.");
		}
		getNewValues()[1] = argContactId;
		return this;
	}

	public PlayerOpal setContactId(final int argContactId) {
		setContactId(java.lang.Integer.valueOf(argContactId));
		return this;
	}

	public synchronized PlayerOpal setSchoolRegistrationId(final java.lang.Integer argSchoolRegistrationId) {
		tryMutate();
		getNewValues()[2] = argSchoolRegistrationId;
		return this;
	}

	public PlayerOpal setSchoolRegistrationId(final int argSchoolRegistrationId) {
		setSchoolRegistrationId(java.lang.Integer.valueOf(argSchoolRegistrationId));
		return this;
	}

	public synchronized PlayerOpal setSchoolYearCode(final java.lang.String argSchoolYearCode) {
		tryMutate();
		if ((argSchoolYearCode != null) && (argSchoolYearCode.length() > 32)) {
			throw new com.opal.ArgumentTooLongException("Maximum length of mySchoolYearCode on " + this + " is 32.", argSchoolYearCode.length(), 32);
		}
		getNewValues()[3] = argSchoolYearCode;
		return this;
	}

	public synchronized PlayerOpal setRankWithinSchool(final java.lang.Integer argRankWithinSchool) {
		tryMutate();
		getNewValues()[4] = argRankWithinSchool;
		return this;
	}

	public PlayerOpal setRankWithinSchool(final int argRankWithinSchool) {
		setRankWithinSchool(java.lang.Integer.valueOf(argRankWithinSchool));
		return this;
	}

	public synchronized PlayerOpal setSeed(final java.lang.Integer argSeed) {
		tryMutate();
		getNewValues()[5] = argSeed;
		return this;
	}

	public PlayerOpal setSeed(final int argSeed) {
		setSeed(java.lang.Integer.valueOf(argSeed));
		return this;
	}

	public synchronized PlayerOpal setNote(final java.lang.String argNote) {
		tryMutate();
		getNewValues()[6] = argNote;
		return this;
	}

	public synchronized PlayerOpal setInitialCardId(final java.lang.Integer argInitialCardId) {
		tryMutate();
		getNewValues()[7] = argInitialCardId;
		return this;
	}

	public PlayerOpal setInitialCardId(final int argInitialCardId) {
		setInitialCardId(java.lang.Integer.valueOf(argInitialCardId));
		return this;
	}

	public synchronized PlayerOpal setExhibition(final java.lang.Boolean argExhibition) {
		tryMutate();
		if (argExhibition == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myExhibition on " + this + " to null.");
		}
		getNewValues()[8] = argExhibition;
		return this;
	}

	public PlayerOpal setExhibition(final boolean argExhibition) {
		setExhibition(argExhibition ? Boolean.TRUE : Boolean.FALSE);
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
		myNewContactOpal = myOldContactOpal;
		myNewInitialCardOpal = myOldInitialCardOpal;
		myNewSchoolRegistrationOpal = myOldSchoolRegistrationOpal;
		myNewSchoolYearOpal = myOldSchoolYearOpal;
		myNewIncomingLosingCardGameOpalHashSet = null; /* Necessary if it has been rolled back */
		myIncomingLosingCardGameOpalCachedOperations = null; /* Ditto */
		myNewIncomingWinningCardGameOpalHashSet = null; /* Necessary if it has been rolled back */
		myIncomingWinningCardGameOpalCachedOperations = null; /* Ditto */
		myNewOutgoingLosingCardGameOpalHashSet = null; /* Necessary if it has been rolled back */
		myOutgoingLosingCardGameOpalCachedOperations = null; /* Ditto */
		myNewOutgoingWinningCardGameOpalHashSet = null; /* Necessary if it has been rolled back */
		myOutgoingWinningCardGameOpalCachedOperations = null; /* Ditto */
		myNewPerformanceOpalHashSet = null; /* Necessary if it has been rolled back */
		myPerformanceOpalCachedOperations = null; /* Ditto */
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		myOldContactOpal = myNewContactOpal;
		myOldInitialCardOpal = myNewInitialCardOpal;
		myOldSchoolRegistrationOpal = myNewSchoolRegistrationOpal;
		myOldSchoolYearOpal = myNewSchoolYearOpal;

		if (needsToClearOldCollections()) {
			myOldIncomingLosingCardGameOpalHashSet = null;
			} else {
			if (myNewIncomingLosingCardGameOpalHashSet != null) {
				myOldIncomingLosingCardGameOpalHashSet = myNewIncomingLosingCardGameOpalHashSet;
				myNewIncomingLosingCardGameOpalHashSet = null;
			} else {
				myIncomingLosingCardGameOpalCachedOperations = null;
			}
		}
		if (needsToClearOldCollections()) {
			myOldIncomingWinningCardGameOpalHashSet = null;
			} else {
			if (myNewIncomingWinningCardGameOpalHashSet != null) {
				myOldIncomingWinningCardGameOpalHashSet = myNewIncomingWinningCardGameOpalHashSet;
				myNewIncomingWinningCardGameOpalHashSet = null;
			} else {
				myIncomingWinningCardGameOpalCachedOperations = null;
			}
		}
		if (needsToClearOldCollections()) {
			myOldOutgoingLosingCardGameOpalHashSet = null;
			} else {
			if (myNewOutgoingLosingCardGameOpalHashSet != null) {
				myOldOutgoingLosingCardGameOpalHashSet = myNewOutgoingLosingCardGameOpalHashSet;
				myNewOutgoingLosingCardGameOpalHashSet = null;
			} else {
				myOutgoingLosingCardGameOpalCachedOperations = null;
			}
		}
		if (needsToClearOldCollections()) {
			myOldOutgoingWinningCardGameOpalHashSet = null;
			} else {
			if (myNewOutgoingWinningCardGameOpalHashSet != null) {
				myOldOutgoingWinningCardGameOpalHashSet = myNewOutgoingWinningCardGameOpalHashSet;
				myNewOutgoingWinningCardGameOpalHashSet = null;
			} else {
				myOutgoingWinningCardGameOpalCachedOperations = null;
			}
		}
		if (needsToClearOldCollections()) {
			myOldPerformanceOpalHashSet = null;
			} else {
			if (myNewPerformanceOpalHashSet != null) {
				myOldPerformanceOpalHashSet = myNewPerformanceOpalHashSet;
				myNewPerformanceOpalHashSet = null;
			} else {
				myPerformanceOpalCachedOperations = null;
			}
		}
		setClearOldCollections(false);
		return;
	}

	@Override
	protected void unlinkInternal() {
		java.util.Iterator<?> lclI;
		if (myNewIncomingLosingCardGameOpalHashSet != null || myIncomingLosingCardGameOpalCachedOperations != null) {
			lclI = createIncomingLosingCardGameOpalIterator();
			while (lclI.hasNext()) {
				((GameOpal) lclI.next()).setIncomingLosingCardPlayerOpalInternal(null);
			}
		}
		if (myNewIncomingWinningCardGameOpalHashSet != null || myIncomingWinningCardGameOpalCachedOperations != null) {
			lclI = createIncomingWinningCardGameOpalIterator();
			while (lclI.hasNext()) {
				((GameOpal) lclI.next()).setIncomingWinningCardPlayerOpalInternal(null);
			}
		}
		if (myNewOutgoingLosingCardGameOpalHashSet != null || myOutgoingLosingCardGameOpalCachedOperations != null) {
			lclI = createOutgoingLosingCardGameOpalIterator();
			while (lclI.hasNext()) {
				((GameOpal) lclI.next()).setOutgoingLosingCardPlayerOpalInternal(null);
			}
		}
		if (myNewOutgoingWinningCardGameOpalHashSet != null || myOutgoingWinningCardGameOpalCachedOperations != null) {
			lclI = createOutgoingWinningCardGameOpalIterator();
			while (lclI.hasNext()) {
				((GameOpal) lclI.next()).setOutgoingWinningCardPlayerOpalInternal(null);
			}
		}
		if (myNewPerformanceOpalHashSet != null || myPerformanceOpalCachedOperations != null) {
			lclI = createPerformanceOpalIterator();
			while (lclI.hasNext()) {
				((PerformanceOpal) lclI.next()).setPlayerOpalInternal(null);
			}
		}
		if (getContactOpal() != null) {
			getContactOpal().removePlayerOpalInternal(this);
		}
		if (getSchoolRegistrationOpal() != null) {
			getSchoolRegistrationOpal().removePlayerOpalInternal(this);
		}
		if (getInitialCardOpal() != null) {
			getInitialCardOpal().setInitialPlayerOpalInternal(null);
		}
		return;
	}

	@Override
	protected void copyFieldsToInternal(com.opal.UpdatableOpal<Player> argTarget) {
		Object[] lclValues = getReadValueSet();
		Object[] lclTargetNewValues = argTarget.getNewValues();
		/* Field 0 (Id) is database generated. */
		lclTargetNewValues[1] = lclValues[1]; /* ContactId (immutable) */
		lclTargetNewValues[2] = lclValues[2]; /* SchoolRegistrationId (immutable) */
		lclTargetNewValues[3] = lclValues[3]; /* SchoolYearCode (immutable) */
		lclTargetNewValues[4] = lclValues[4]; /* RankWithinSchool (immutable) */
		lclTargetNewValues[5] = lclValues[5]; /* Seed (immutable) */
		lclTargetNewValues[6] = lclValues[6]; /* Note (immutable) */
		/* Field 7 (InitialCardId) is part of a unique key. */
		lclTargetNewValues[8] = lclValues[8]; /* Exhibition (immutable) */

		return;
	}

	@Override
	public synchronized void translateReferencesToFields() {
		if (myNewContactOpal != ContactOpal.NOT_YET_LOADED) {
			setContactId(myNewContactOpal == null ? null : myNewContactOpal.getIdAsObject());
		}
		if (myNewInitialCardOpal != CardOpal.NOT_YET_LOADED) {
			setInitialCardId(myNewInitialCardOpal == null ? null : myNewInitialCardOpal.getIdAsObject());
		}
		if (myNewSchoolRegistrationOpal != SchoolRegistrationOpal.NOT_YET_LOADED) {
			setSchoolRegistrationId(myNewSchoolRegistrationOpal == null ? null : myNewSchoolRegistrationOpal.getIdAsObject());
		}
		if (myNewSchoolYearOpal != SchoolYearOpal.NOT_YET_LOADED) {
			setSchoolYearCode(myNewSchoolYearOpal == null ? null : myNewSchoolYearOpal.getCode());
		}
		return;
	}

	@Override
	public java.util.Set<com.opal.TransactionAware> getRequiredPriorCommits() {
		java.util.Set<com.opal.TransactionAware> lclTAs = null;
		com.opal.UpdatableOpal<?> lclUO;
		lclUO = myNewContactOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		lclUO = myNewInitialCardOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		lclUO = myNewSchoolRegistrationOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		lclUO = myNewSchoolYearOpal;
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
		if ((lclUO = myOldContactOpal) == ContactOpal.NOT_YET_LOADED) {
			lclUO = myOldContactOpal = retrieveContactOpal(getOldValues());
		}
		if (lclUO != null && lclUO.isDeleted()) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		if ((lclUO = myOldInitialCardOpal) == CardOpal.NOT_YET_LOADED) {
			lclUO = myOldInitialCardOpal = retrieveInitialCardOpal(getOldValues());
		}
		if (lclUO != null && lclUO.isDeleted()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		if ((lclUO = myOldSchoolRegistrationOpal) == SchoolRegistrationOpal.NOT_YET_LOADED) {
			lclUO = myOldSchoolRegistrationOpal = retrieveSchoolRegistrationOpal(getOldValues());
		}
		if (lclUO != null && lclUO.isDeleted()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		if ((lclUO = myOldSchoolYearOpal) == SchoolYearOpal.NOT_YET_LOADED) {
			lclUO = myOldSchoolYearOpal = retrieveSchoolYearOpal(getOldValues());
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
		argOutput.println("ContactId = " + getContactIdAsObject());
		argOutput.println("SchoolRegistrationId = " + getSchoolRegistrationIdAsObject());
		argOutput.println("SchoolYearCode = " + getSchoolYearCode());
		argOutput.println("RankWithinSchool = " + getRankWithinSchoolAsObject());
		argOutput.println("Seed = " + getSeedAsObject());
		argOutput.println("Note = " + getNote());
		argOutput.println("InitialCardId = " + getInitialCardIdAsObject());
		argOutput.println("Exhibition = " + isExhibitionAsObject());
	}

	@Override
	public synchronized void output(final java.io.PrintWriter argOutput) {
		argOutput.println("Id = " + getIdAsObject());
		argOutput.println("ContactId = " + getContactIdAsObject());
		argOutput.println("SchoolRegistrationId = " + getSchoolRegistrationIdAsObject());
		argOutput.println("SchoolYearCode = " + getSchoolYearCode());
		argOutput.println("RankWithinSchool = " + getRankWithinSchoolAsObject());
		argOutput.println("Seed = " + getSeedAsObject());
		argOutput.println("Note = " + getNote());
		argOutput.println("InitialCardId = " + getInitialCardIdAsObject());
		argOutput.println("Exhibition = " + isExhibitionAsObject());
	}

	private ContactOpal myOldContactOpal;
	private ContactOpal myNewContactOpal;

	protected ContactOpal retrieveContactOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[1] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getContactOpalFactory().forId(getContactIdAsObject());
	}

	public synchronized ContactOpal getContactOpal() {
		ContactOpal lclContactOpal;
		boolean lclAccess = tryAccess();
		lclContactOpal = lclAccess ? myNewContactOpal : myOldContactOpal;
		if (lclContactOpal == ContactOpal.NOT_YET_LOADED) {
			lclContactOpal = retrieveContactOpal(getReadValueSet());
			if (lclAccess) {
				myNewContactOpal = lclContactOpal;
			} else {
				myOldContactOpal = lclContactOpal;
			}
		}
		return lclContactOpal;
	}

	public synchronized PlayerOpal setContactOpal(ContactOpal argContactOpal) {
		tryMutate();
		ContactOpal lclContactOpal = getContactOpal();
		if (lclContactOpal == argContactOpal) { return this; }
		if (lclContactOpal != null) {
			lclContactOpal.removePlayerOpalInternal(this);
		}
		myNewContactOpal = argContactOpal;
		if (argContactOpal != null) {
			argContactOpal.addPlayerOpalInternal(this);
		}
		return this;
	}

	protected synchronized void setContactOpalInternal(ContactOpal argContactOpal) {
		tryMutate();
		myNewContactOpal = argContactOpal;
	}

	private CardOpal myOldInitialCardOpal;
	private CardOpal myNewInitialCardOpal;

	protected CardOpal retrieveInitialCardOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[7] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getCardOpalFactory().forId(getInitialCardIdAsObject());
	}

	public synchronized CardOpal getInitialCardOpal() {
		CardOpal lclCardOpal;
		boolean lclAccess = tryAccess();
		lclCardOpal = lclAccess ? myNewInitialCardOpal : myOldInitialCardOpal;
		if (lclCardOpal == CardOpal.NOT_YET_LOADED) {
			lclCardOpal = retrieveInitialCardOpal(getReadValueSet());
			if (lclAccess) {
				myNewInitialCardOpal = lclCardOpal;
			} else {
				myOldInitialCardOpal = lclCardOpal;
			}
		}
		return lclCardOpal;
	}

	public synchronized PlayerOpal setInitialCardOpal(CardOpal argCardOpal) {
		tryMutate();
		if (myNewInitialCardOpal != null && myNewInitialCardOpal != CardOpal.NOT_YET_LOADED) {
			myNewInitialCardOpal.setInitialPlayerOpalInternal(null);
		}
		myNewInitialCardOpal = argCardOpal;
		if (argCardOpal != null) {
			argCardOpal.setInitialPlayerOpalInternal(this);
		}
		return this;
	}

	protected synchronized void setInitialCardOpalInternal(CardOpal argCardOpal) {
		tryMutate();
		myNewInitialCardOpal = argCardOpal;
	}

	private SchoolRegistrationOpal myOldSchoolRegistrationOpal;
	private SchoolRegistrationOpal myNewSchoolRegistrationOpal;

	protected SchoolRegistrationOpal retrieveSchoolRegistrationOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[2] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getSchoolRegistrationOpalFactory().forId(getSchoolRegistrationIdAsObject());
	}

	public synchronized SchoolRegistrationOpal getSchoolRegistrationOpal() {
		SchoolRegistrationOpal lclSchoolRegistrationOpal;
		boolean lclAccess = tryAccess();
		lclSchoolRegistrationOpal = lclAccess ? myNewSchoolRegistrationOpal : myOldSchoolRegistrationOpal;
		if (lclSchoolRegistrationOpal == SchoolRegistrationOpal.NOT_YET_LOADED) {
			lclSchoolRegistrationOpal = retrieveSchoolRegistrationOpal(getReadValueSet());
			if (lclAccess) {
				myNewSchoolRegistrationOpal = lclSchoolRegistrationOpal;
			} else {
				myOldSchoolRegistrationOpal = lclSchoolRegistrationOpal;
			}
		}
		return lclSchoolRegistrationOpal;
	}

	public synchronized PlayerOpal setSchoolRegistrationOpal(SchoolRegistrationOpal argSchoolRegistrationOpal) {
		tryMutate();
		SchoolRegistrationOpal lclSchoolRegistrationOpal = getSchoolRegistrationOpal();
		if (lclSchoolRegistrationOpal == argSchoolRegistrationOpal) { return this; }
		if (lclSchoolRegistrationOpal != null) {
			lclSchoolRegistrationOpal.removePlayerOpalInternal(this);
		}
		myNewSchoolRegistrationOpal = argSchoolRegistrationOpal;
		if (argSchoolRegistrationOpal != null) {
			argSchoolRegistrationOpal.addPlayerOpalInternal(this);
		}
		return this;
	}

	protected synchronized void setSchoolRegistrationOpalInternal(SchoolRegistrationOpal argSchoolRegistrationOpal) {
		tryMutate();
		myNewSchoolRegistrationOpal = argSchoolRegistrationOpal;
	}

	private SchoolYearOpal myOldSchoolYearOpal;
	private SchoolYearOpal myNewSchoolYearOpal;

	protected SchoolYearOpal retrieveSchoolYearOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[3] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getSchoolYearOpalFactory().forCode(getSchoolYearCode());
	}

	public synchronized SchoolYearOpal getSchoolYearOpal() {
		SchoolYearOpal lclSchoolYearOpal;
		boolean lclAccess = tryAccess();
		lclSchoolYearOpal = lclAccess ? myNewSchoolYearOpal : myOldSchoolYearOpal;
		if (lclSchoolYearOpal == SchoolYearOpal.NOT_YET_LOADED) {
			lclSchoolYearOpal = retrieveSchoolYearOpal(getReadValueSet());
			if (lclAccess) {
				myNewSchoolYearOpal = lclSchoolYearOpal;
			} else {
				myOldSchoolYearOpal = lclSchoolYearOpal;
			}
		}
		return lclSchoolYearOpal;
	}

	public synchronized PlayerOpal setSchoolYearOpal(SchoolYearOpal argSchoolYearOpal) {
		tryMutate();
		myNewSchoolYearOpal = argSchoolYearOpal;
		return this;
	}

	private java.util.HashSet<GameOpal> myOldIncomingLosingCardGameOpalHashSet = null;
	private java.util.HashSet<GameOpal> myNewIncomingLosingCardGameOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<GameOpal>> myIncomingLosingCardGameOpalCachedOperations = null;

	/* package */ java.util.HashSet<GameOpal> getIncomingLosingCardGameOpalHashSet() {
		if (tryAccess()) {
			if (myNewIncomingLosingCardGameOpalHashSet == null) {
				if (myOldIncomingLosingCardGameOpalHashSet == null) {
					if (isNew()) {
						myOldIncomingLosingCardGameOpalHashSet = new java.util.HashSet<>();
					} else {
						myOldIncomingLosingCardGameOpalHashSet = OpalFactoryFactory.getInstance().getGameOpalFactory().forIncomingLosingCardPlayerIdCollection(getIdAsObject());
					}
				}
				myNewIncomingLosingCardGameOpalHashSet = new java.util.HashSet<>(myOldIncomingLosingCardGameOpalHashSet);
				if (myIncomingLosingCardGameOpalCachedOperations != null) {
					com.opal.OpalUtility.handleCachedOperations(myIncomingLosingCardGameOpalCachedOperations, myNewIncomingLosingCardGameOpalHashSet);
					myIncomingLosingCardGameOpalCachedOperations = null;
				}
			}
			return myNewIncomingLosingCardGameOpalHashSet;
		} else {
			if (myOldIncomingLosingCardGameOpalHashSet == null) {
				myOldIncomingLosingCardGameOpalHashSet = OpalFactoryFactory.getInstance().getGameOpalFactory().forIncomingLosingCardPlayerIdCollection(getIdAsObject());
			}
			return myOldIncomingLosingCardGameOpalHashSet;
		}
	}

	public synchronized void addIncomingLosingCardGameOpal(GameOpal argGameOpal) {
		tryMutate();
		argGameOpal.setIncomingLosingCardPlayerOpal(this);
		return;
	}

	protected synchronized void addIncomingLosingCardGameOpalInternal(GameOpal argGameOpal) {
		tryMutate();
		if (myNewIncomingLosingCardGameOpalHashSet == null) {
			if (myOldIncomingLosingCardGameOpalHashSet == null) {
				if (myIncomingLosingCardGameOpalCachedOperations == null) { myIncomingLosingCardGameOpalCachedOperations = new java.util.ArrayList<>(); }
				myIncomingLosingCardGameOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.ADD, argGameOpal));
			} else {
				myNewIncomingLosingCardGameOpalHashSet = new java.util.HashSet<>(myOldIncomingLosingCardGameOpalHashSet);
				myNewIncomingLosingCardGameOpalHashSet.add(argGameOpal);
			}
		} else {
			myNewIncomingLosingCardGameOpalHashSet.add(argGameOpal);
		}
		return;
	}

	public synchronized void removeIncomingLosingCardGameOpal(GameOpal argGameOpal) {
		tryMutate();
		argGameOpal.setIncomingLosingCardPlayerOpal(null);
	}

	protected synchronized void removeIncomingLosingCardGameOpalInternal(GameOpal argGameOpal) {
		tryMutate();
		if (myNewIncomingLosingCardGameOpalHashSet == null) {
			if (myOldIncomingLosingCardGameOpalHashSet == null) {
				if (myIncomingLosingCardGameOpalCachedOperations == null) { myIncomingLosingCardGameOpalCachedOperations = new java.util.ArrayList<>(); }
				myIncomingLosingCardGameOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.REMOVE, argGameOpal));
			} else {
				myNewIncomingLosingCardGameOpalHashSet = new java.util.HashSet<>(myOldIncomingLosingCardGameOpalHashSet);
				myNewIncomingLosingCardGameOpalHashSet.remove(argGameOpal);
			}
		} else {
			myNewIncomingLosingCardGameOpalHashSet.remove(argGameOpal);
		}
		return;
	}

	public synchronized int getIncomingLosingCardGameOpalCount() { return getIncomingLosingCardGameOpalHashSet().size(); }

	public synchronized java.util.Iterator<GameOpal> createIncomingLosingCardGameOpalIterator() {
		return getIncomingLosingCardGameOpalHashSet().iterator();
	}

	public synchronized java.util.stream.Stream<GameOpal> streamIncomingLosingCardGameOpal() {
		return getIncomingLosingCardGameOpalHashSet().stream();
	}

	public synchronized void clearIncomingLosingCardGameOpalInternal() { getIncomingLosingCardGameOpalHashSet().clear(); }

	private java.util.HashSet<GameOpal> myOldIncomingWinningCardGameOpalHashSet = null;
	private java.util.HashSet<GameOpal> myNewIncomingWinningCardGameOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<GameOpal>> myIncomingWinningCardGameOpalCachedOperations = null;

	/* package */ java.util.HashSet<GameOpal> getIncomingWinningCardGameOpalHashSet() {
		if (tryAccess()) {
			if (myNewIncomingWinningCardGameOpalHashSet == null) {
				if (myOldIncomingWinningCardGameOpalHashSet == null) {
					if (isNew()) {
						myOldIncomingWinningCardGameOpalHashSet = new java.util.HashSet<>();
					} else {
						myOldIncomingWinningCardGameOpalHashSet = OpalFactoryFactory.getInstance().getGameOpalFactory().forIncomingWinningCardPlayerIdCollection(getIdAsObject());
					}
				}
				myNewIncomingWinningCardGameOpalHashSet = new java.util.HashSet<>(myOldIncomingWinningCardGameOpalHashSet);
				if (myIncomingWinningCardGameOpalCachedOperations != null) {
					com.opal.OpalUtility.handleCachedOperations(myIncomingWinningCardGameOpalCachedOperations, myNewIncomingWinningCardGameOpalHashSet);
					myIncomingWinningCardGameOpalCachedOperations = null;
				}
			}
			return myNewIncomingWinningCardGameOpalHashSet;
		} else {
			if (myOldIncomingWinningCardGameOpalHashSet == null) {
				myOldIncomingWinningCardGameOpalHashSet = OpalFactoryFactory.getInstance().getGameOpalFactory().forIncomingWinningCardPlayerIdCollection(getIdAsObject());
			}
			return myOldIncomingWinningCardGameOpalHashSet;
		}
	}

	public synchronized void addIncomingWinningCardGameOpal(GameOpal argGameOpal) {
		tryMutate();
		argGameOpal.setIncomingWinningCardPlayerOpal(this);
		return;
	}

	protected synchronized void addIncomingWinningCardGameOpalInternal(GameOpal argGameOpal) {
		tryMutate();
		if (myNewIncomingWinningCardGameOpalHashSet == null) {
			if (myOldIncomingWinningCardGameOpalHashSet == null) {
				if (myIncomingWinningCardGameOpalCachedOperations == null) { myIncomingWinningCardGameOpalCachedOperations = new java.util.ArrayList<>(); }
				myIncomingWinningCardGameOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.ADD, argGameOpal));
			} else {
				myNewIncomingWinningCardGameOpalHashSet = new java.util.HashSet<>(myOldIncomingWinningCardGameOpalHashSet);
				myNewIncomingWinningCardGameOpalHashSet.add(argGameOpal);
			}
		} else {
			myNewIncomingWinningCardGameOpalHashSet.add(argGameOpal);
		}
		return;
	}

	public synchronized void removeIncomingWinningCardGameOpal(GameOpal argGameOpal) {
		tryMutate();
		argGameOpal.setIncomingWinningCardPlayerOpal(null);
	}

	protected synchronized void removeIncomingWinningCardGameOpalInternal(GameOpal argGameOpal) {
		tryMutate();
		if (myNewIncomingWinningCardGameOpalHashSet == null) {
			if (myOldIncomingWinningCardGameOpalHashSet == null) {
				if (myIncomingWinningCardGameOpalCachedOperations == null) { myIncomingWinningCardGameOpalCachedOperations = new java.util.ArrayList<>(); }
				myIncomingWinningCardGameOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.REMOVE, argGameOpal));
			} else {
				myNewIncomingWinningCardGameOpalHashSet = new java.util.HashSet<>(myOldIncomingWinningCardGameOpalHashSet);
				myNewIncomingWinningCardGameOpalHashSet.remove(argGameOpal);
			}
		} else {
			myNewIncomingWinningCardGameOpalHashSet.remove(argGameOpal);
		}
		return;
	}

	public synchronized int getIncomingWinningCardGameOpalCount() { return getIncomingWinningCardGameOpalHashSet().size(); }

	public synchronized java.util.Iterator<GameOpal> createIncomingWinningCardGameOpalIterator() {
		return getIncomingWinningCardGameOpalHashSet().iterator();
	}

	public synchronized java.util.stream.Stream<GameOpal> streamIncomingWinningCardGameOpal() {
		return getIncomingWinningCardGameOpalHashSet().stream();
	}

	public synchronized void clearIncomingWinningCardGameOpalInternal() { getIncomingWinningCardGameOpalHashSet().clear(); }

	private java.util.HashSet<GameOpal> myOldOutgoingLosingCardGameOpalHashSet = null;
	private java.util.HashSet<GameOpal> myNewOutgoingLosingCardGameOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<GameOpal>> myOutgoingLosingCardGameOpalCachedOperations = null;

	/* package */ java.util.HashSet<GameOpal> getOutgoingLosingCardGameOpalHashSet() {
		if (tryAccess()) {
			if (myNewOutgoingLosingCardGameOpalHashSet == null) {
				if (myOldOutgoingLosingCardGameOpalHashSet == null) {
					if (isNew()) {
						myOldOutgoingLosingCardGameOpalHashSet = new java.util.HashSet<>();
					} else {
						myOldOutgoingLosingCardGameOpalHashSet = OpalFactoryFactory.getInstance().getGameOpalFactory().forOutgoingLosingCardPlayerIdCollection(getIdAsObject());
					}
				}
				myNewOutgoingLosingCardGameOpalHashSet = new java.util.HashSet<>(myOldOutgoingLosingCardGameOpalHashSet);
				if (myOutgoingLosingCardGameOpalCachedOperations != null) {
					com.opal.OpalUtility.handleCachedOperations(myOutgoingLosingCardGameOpalCachedOperations, myNewOutgoingLosingCardGameOpalHashSet);
					myOutgoingLosingCardGameOpalCachedOperations = null;
				}
			}
			return myNewOutgoingLosingCardGameOpalHashSet;
		} else {
			if (myOldOutgoingLosingCardGameOpalHashSet == null) {
				myOldOutgoingLosingCardGameOpalHashSet = OpalFactoryFactory.getInstance().getGameOpalFactory().forOutgoingLosingCardPlayerIdCollection(getIdAsObject());
			}
			return myOldOutgoingLosingCardGameOpalHashSet;
		}
	}

	public synchronized void addOutgoingLosingCardGameOpal(GameOpal argGameOpal) {
		tryMutate();
		argGameOpal.setOutgoingLosingCardPlayerOpal(this);
		return;
	}

	protected synchronized void addOutgoingLosingCardGameOpalInternal(GameOpal argGameOpal) {
		tryMutate();
		if (myNewOutgoingLosingCardGameOpalHashSet == null) {
			if (myOldOutgoingLosingCardGameOpalHashSet == null) {
				if (myOutgoingLosingCardGameOpalCachedOperations == null) { myOutgoingLosingCardGameOpalCachedOperations = new java.util.ArrayList<>(); }
				myOutgoingLosingCardGameOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.ADD, argGameOpal));
			} else {
				myNewOutgoingLosingCardGameOpalHashSet = new java.util.HashSet<>(myOldOutgoingLosingCardGameOpalHashSet);
				myNewOutgoingLosingCardGameOpalHashSet.add(argGameOpal);
			}
		} else {
			myNewOutgoingLosingCardGameOpalHashSet.add(argGameOpal);
		}
		return;
	}

	public synchronized void removeOutgoingLosingCardGameOpal(GameOpal argGameOpal) {
		tryMutate();
		argGameOpal.setOutgoingLosingCardPlayerOpal(null);
	}

	protected synchronized void removeOutgoingLosingCardGameOpalInternal(GameOpal argGameOpal) {
		tryMutate();
		if (myNewOutgoingLosingCardGameOpalHashSet == null) {
			if (myOldOutgoingLosingCardGameOpalHashSet == null) {
				if (myOutgoingLosingCardGameOpalCachedOperations == null) { myOutgoingLosingCardGameOpalCachedOperations = new java.util.ArrayList<>(); }
				myOutgoingLosingCardGameOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.REMOVE, argGameOpal));
			} else {
				myNewOutgoingLosingCardGameOpalHashSet = new java.util.HashSet<>(myOldOutgoingLosingCardGameOpalHashSet);
				myNewOutgoingLosingCardGameOpalHashSet.remove(argGameOpal);
			}
		} else {
			myNewOutgoingLosingCardGameOpalHashSet.remove(argGameOpal);
		}
		return;
	}

	public synchronized int getOutgoingLosingCardGameOpalCount() { return getOutgoingLosingCardGameOpalHashSet().size(); }

	public synchronized java.util.Iterator<GameOpal> createOutgoingLosingCardGameOpalIterator() {
		return getOutgoingLosingCardGameOpalHashSet().iterator();
	}

	public synchronized java.util.stream.Stream<GameOpal> streamOutgoingLosingCardGameOpal() {
		return getOutgoingLosingCardGameOpalHashSet().stream();
	}

	public synchronized void clearOutgoingLosingCardGameOpalInternal() { getOutgoingLosingCardGameOpalHashSet().clear(); }

	private java.util.HashSet<GameOpal> myOldOutgoingWinningCardGameOpalHashSet = null;
	private java.util.HashSet<GameOpal> myNewOutgoingWinningCardGameOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<GameOpal>> myOutgoingWinningCardGameOpalCachedOperations = null;

	/* package */ java.util.HashSet<GameOpal> getOutgoingWinningCardGameOpalHashSet() {
		if (tryAccess()) {
			if (myNewOutgoingWinningCardGameOpalHashSet == null) {
				if (myOldOutgoingWinningCardGameOpalHashSet == null) {
					if (isNew()) {
						myOldOutgoingWinningCardGameOpalHashSet = new java.util.HashSet<>();
					} else {
						myOldOutgoingWinningCardGameOpalHashSet = OpalFactoryFactory.getInstance().getGameOpalFactory().forOutgoingWinningCardPlayerIdCollection(getIdAsObject());
					}
				}
				myNewOutgoingWinningCardGameOpalHashSet = new java.util.HashSet<>(myOldOutgoingWinningCardGameOpalHashSet);
				if (myOutgoingWinningCardGameOpalCachedOperations != null) {
					com.opal.OpalUtility.handleCachedOperations(myOutgoingWinningCardGameOpalCachedOperations, myNewOutgoingWinningCardGameOpalHashSet);
					myOutgoingWinningCardGameOpalCachedOperations = null;
				}
			}
			return myNewOutgoingWinningCardGameOpalHashSet;
		} else {
			if (myOldOutgoingWinningCardGameOpalHashSet == null) {
				myOldOutgoingWinningCardGameOpalHashSet = OpalFactoryFactory.getInstance().getGameOpalFactory().forOutgoingWinningCardPlayerIdCollection(getIdAsObject());
			}
			return myOldOutgoingWinningCardGameOpalHashSet;
		}
	}

	public synchronized void addOutgoingWinningCardGameOpal(GameOpal argGameOpal) {
		tryMutate();
		argGameOpal.setOutgoingWinningCardPlayerOpal(this);
		return;
	}

	protected synchronized void addOutgoingWinningCardGameOpalInternal(GameOpal argGameOpal) {
		tryMutate();
		if (myNewOutgoingWinningCardGameOpalHashSet == null) {
			if (myOldOutgoingWinningCardGameOpalHashSet == null) {
				if (myOutgoingWinningCardGameOpalCachedOperations == null) { myOutgoingWinningCardGameOpalCachedOperations = new java.util.ArrayList<>(); }
				myOutgoingWinningCardGameOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.ADD, argGameOpal));
			} else {
				myNewOutgoingWinningCardGameOpalHashSet = new java.util.HashSet<>(myOldOutgoingWinningCardGameOpalHashSet);
				myNewOutgoingWinningCardGameOpalHashSet.add(argGameOpal);
			}
		} else {
			myNewOutgoingWinningCardGameOpalHashSet.add(argGameOpal);
		}
		return;
	}

	public synchronized void removeOutgoingWinningCardGameOpal(GameOpal argGameOpal) {
		tryMutate();
		argGameOpal.setOutgoingWinningCardPlayerOpal(null);
	}

	protected synchronized void removeOutgoingWinningCardGameOpalInternal(GameOpal argGameOpal) {
		tryMutate();
		if (myNewOutgoingWinningCardGameOpalHashSet == null) {
			if (myOldOutgoingWinningCardGameOpalHashSet == null) {
				if (myOutgoingWinningCardGameOpalCachedOperations == null) { myOutgoingWinningCardGameOpalCachedOperations = new java.util.ArrayList<>(); }
				myOutgoingWinningCardGameOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.REMOVE, argGameOpal));
			} else {
				myNewOutgoingWinningCardGameOpalHashSet = new java.util.HashSet<>(myOldOutgoingWinningCardGameOpalHashSet);
				myNewOutgoingWinningCardGameOpalHashSet.remove(argGameOpal);
			}
		} else {
			myNewOutgoingWinningCardGameOpalHashSet.remove(argGameOpal);
		}
		return;
	}

	public synchronized int getOutgoingWinningCardGameOpalCount() { return getOutgoingWinningCardGameOpalHashSet().size(); }

	public synchronized java.util.Iterator<GameOpal> createOutgoingWinningCardGameOpalIterator() {
		return getOutgoingWinningCardGameOpalHashSet().iterator();
	}

	public synchronized java.util.stream.Stream<GameOpal> streamOutgoingWinningCardGameOpal() {
		return getOutgoingWinningCardGameOpalHashSet().stream();
	}

	public synchronized void clearOutgoingWinningCardGameOpalInternal() { getOutgoingWinningCardGameOpalHashSet().clear(); }

	private java.util.HashSet<PerformanceOpal> myOldPerformanceOpalHashSet = null;
	private java.util.HashSet<PerformanceOpal> myNewPerformanceOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<PerformanceOpal>> myPerformanceOpalCachedOperations = null;

	/* package */ java.util.HashSet<PerformanceOpal> getPerformanceOpalHashSet() {
		if (tryAccess()) {
			if (myNewPerformanceOpalHashSet == null) {
				if (myOldPerformanceOpalHashSet == null) {
					if (isNew()) {
						myOldPerformanceOpalHashSet = new java.util.HashSet<>();
					} else {
						myOldPerformanceOpalHashSet = OpalFactoryFactory.getInstance().getPerformanceOpalFactory().forPlayerIdCollection(getIdAsObject());
					}
				}
				myNewPerformanceOpalHashSet = new java.util.HashSet<>(myOldPerformanceOpalHashSet);
				if (myPerformanceOpalCachedOperations != null) {
					com.opal.OpalUtility.handleCachedOperations(myPerformanceOpalCachedOperations, myNewPerformanceOpalHashSet);
					myPerformanceOpalCachedOperations = null;
				}
			}
			return myNewPerformanceOpalHashSet;
		} else {
			if (myOldPerformanceOpalHashSet == null) {
				myOldPerformanceOpalHashSet = OpalFactoryFactory.getInstance().getPerformanceOpalFactory().forPlayerIdCollection(getIdAsObject());
			}
			return myOldPerformanceOpalHashSet;
		}
	}

	public synchronized void addPerformanceOpal(PerformanceOpal argPerformanceOpal) {
		tryMutate();
		argPerformanceOpal.setPlayerOpal(this);
		return;
	}

	protected synchronized void addPerformanceOpalInternal(PerformanceOpal argPerformanceOpal) {
		tryMutate();
		if (myNewPerformanceOpalHashSet == null) {
			if (myOldPerformanceOpalHashSet == null) {
				if (myPerformanceOpalCachedOperations == null) { myPerformanceOpalCachedOperations = new java.util.ArrayList<>(); }
				myPerformanceOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.ADD, argPerformanceOpal));
			} else {
				myNewPerformanceOpalHashSet = new java.util.HashSet<>(myOldPerformanceOpalHashSet);
				myNewPerformanceOpalHashSet.add(argPerformanceOpal);
			}
		} else {
			myNewPerformanceOpalHashSet.add(argPerformanceOpal);
		}
		return;
	}

	public synchronized void removePerformanceOpal(PerformanceOpal argPerformanceOpal) {
		tryMutate();
		argPerformanceOpal.setPlayerOpal(null);
	}

	protected synchronized void removePerformanceOpalInternal(PerformanceOpal argPerformanceOpal) {
		tryMutate();
		if (myNewPerformanceOpalHashSet == null) {
			if (myOldPerformanceOpalHashSet == null) {
				if (myPerformanceOpalCachedOperations == null) { myPerformanceOpalCachedOperations = new java.util.ArrayList<>(); }
				myPerformanceOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.REMOVE, argPerformanceOpal));
			} else {
				myNewPerformanceOpalHashSet = new java.util.HashSet<>(myOldPerformanceOpalHashSet);
				myNewPerformanceOpalHashSet.remove(argPerformanceOpal);
			}
		} else {
			myNewPerformanceOpalHashSet.remove(argPerformanceOpal);
		}
		return;
	}

	public synchronized int getPerformanceOpalCount() { return getPerformanceOpalHashSet().size(); }

	public synchronized java.util.Iterator<PerformanceOpal> createPerformanceOpalIterator() {
		return getPerformanceOpalHashSet().iterator();
	}

	public synchronized java.util.stream.Stream<PerformanceOpal> streamPerformanceOpal() {
		return getPerformanceOpalHashSet().stream();
	}

	public synchronized void clearPerformanceOpalInternal() { getPerformanceOpalHashSet().clear(); }

	@Override
	public String toString() {
		StringBuilder lclSB =  new StringBuilder(64);
		lclSB.append("PlayerOpal[");
		lclSB.append("myId=");
		lclSB.append(toStringField(0));
		lclSB.append(']');
		return lclSB.toString();
	}

	@Override
	protected void updateReferencesAfterReload() {
		if (myNewContactOpal != ContactOpal.NOT_YET_LOADED) {
			setContactOpal(retrieveContactOpal(getNewValues()));
		}
		if (myNewInitialCardOpal != CardOpal.NOT_YET_LOADED) {
			setInitialCardOpal(retrieveInitialCardOpal(getNewValues()));
		}
		if (myNewSchoolRegistrationOpal != SchoolRegistrationOpal.NOT_YET_LOADED) {
			setSchoolRegistrationOpal(retrieveSchoolRegistrationOpal(getNewValues()));
		}
		if (myNewSchoolYearOpal != SchoolYearOpal.NOT_YET_LOADED) {
			setSchoolYearOpal(retrieveSchoolYearOpal(getNewValues()));
		}
	}

	@Override
	protected void updateCollectionsAfterReload() {
		assert needsToClearOldCollections() == false;
		setClearOldCollections(true);
	}

}
