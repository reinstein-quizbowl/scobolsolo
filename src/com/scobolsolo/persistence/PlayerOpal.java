package com.scobolsolo.persistence;

import com.scobolsolo.application.Player;

@com.opal.StoreGeneratedPrimaryKey
public final class PlayerOpal extends com.opal.UpdatableOpal<Player> {

	public static final java.lang.Boolean ourDefaultExhibition = java.lang.Boolean.FALSE;

	private PlayerOpal() {
		super();
		setUserFacing(null);
	}

	public PlayerOpal(com.opal.IdentityOpalFactory<Player, PlayerOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void applyDefaults() {
		/* Initialize fields with their default values. */
		getNewValues()[7] = ourDefaultExhibition;


		/* Initialize the back Collections to empty sets. */

		myIncomingLosingCardGameSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
				this,
				ourIncomingLosingCardGameOpalLoader,
				true
				);
		myIncomingWinningCardGameSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
				this,
				ourIncomingWinningCardGameOpalLoader,
				true
				);
		myOutgoingLosingCardGameSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
				this,
				ourOutgoingLosingCardGameOpalLoader,
				true
				);
		myOutgoingWinningCardGameSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
				this,
				ourOutgoingWinningCardGameOpalLoader,
				true
				);
		myPerformanceSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
				this,
				ourPerformanceOpalLoader,
				true
				);

		return;
	}

	@Override
	protected void initializeReferences() {
		myOldContactOpal = ContactOpal.NOT_YET_LOADED;
		myOldSchoolRegistrationOpal = SchoolRegistrationOpal.NOT_YET_LOADED;
		myOldSchoolYearOpal = SchoolYearOpal.NOT_YET_LOADED;
		myOldInitialCardOpal = CardOpal.NOT_YET_LOADED;
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

	public synchronized java.lang.Boolean isExhibitionAsObject() {
		return (java.lang.Boolean) getReadValueSet()[7];
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
			throw new com.opal.ArgumentTooLongException("Cannot set mySchoolYearCode on " + this + " to \"" + argSchoolYearCode + "\" because that field's maximum length is 32.", argSchoolYearCode.length(), 32);
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

	public synchronized PlayerOpal setExhibition(final java.lang.Boolean argExhibition) {
		tryMutate();
		if (argExhibition == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myExhibition on " + this + " to null.");
		}
		getNewValues()[7] = argExhibition;
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
		myNewSchoolRegistrationOpal = myOldSchoolRegistrationOpal;
		myNewSchoolYearOpal = myOldSchoolYearOpal;
		myNewInitialCardOpal = myOldInitialCardOpal;
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		myOldContactOpal = myNewContactOpal;
		myOldSchoolRegistrationOpal = myNewSchoolRegistrationOpal;
		myOldSchoolYearOpal = myNewSchoolYearOpal;

		myOldInitialCardOpal = myNewInitialCardOpal;
		return;
	}

	@Override
	protected void unlinkInternal() {
		getIncomingLosingCardGameOpalSet().clear();
		getIncomingWinningCardGameOpalSet().clear();
		getOutgoingLosingCardGameOpalSet().clear();
		getOutgoingWinningCardGameOpalSet().clear();
		getPerformanceOpalSet().clear();
		if (getInitialCardOpal() != null) {
			getInitialCardOpal().setInitialPlayerOpalInternal(null);
		}
		if (getContactOpal() != null) {
			getContactOpal().getPlayerOpalSet().removeInternal(this);
		}
		if (getSchoolRegistrationOpal() != null) {
			getSchoolRegistrationOpal().getPlayerOpalSet().removeInternal(this);
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
		lclTargetNewValues[7] = lclValues[7]; /* Exhibition (immutable) */

		return;
	}

	@Override
	public synchronized void translateReferencesToFields() {
		if (myNewContactOpal != ContactOpal.NOT_YET_LOADED) {
			setContactId(myNewContactOpal == null ? null : myNewContactOpal.getIdAsObject());
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
		if (lclUO != null && (lclUO.exists() == false)) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		if ((lclUO = myOldSchoolRegistrationOpal) == SchoolRegistrationOpal.NOT_YET_LOADED) {
			lclUO = myOldSchoolRegistrationOpal = retrieveSchoolRegistrationOpal(getOldValues());
		}
		if (lclUO != null && (lclUO.exists() == false)) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		if ((lclUO = myOldSchoolYearOpal) == SchoolYearOpal.NOT_YET_LOADED) {
			lclUO = myOldSchoolYearOpal = retrieveSchoolYearOpal(getOldValues());
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
		argOutput.println("ContactId = " + getContactIdAsObject());
		argOutput.println("SchoolRegistrationId = " + getSchoolRegistrationIdAsObject());
		argOutput.println("SchoolYearCode = " + getSchoolYearCode());
		argOutput.println("RankWithinSchool = " + getRankWithinSchoolAsObject());
		argOutput.println("Seed = " + getSeedAsObject());
		argOutput.println("Note = " + getNote());
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
			lclContactOpal.getPlayerOpalSet().removeInternal(this);
		}
		myNewContactOpal = argContactOpal;
		if (argContactOpal != null) {
			argContactOpal.getPlayerOpalSet().addInternal(this);
		}
		return this;
	}

	protected synchronized void setContactOpalInternal(ContactOpal argContactOpal) {
		tryMutate();
		myNewContactOpal = argContactOpal;
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
			lclSchoolRegistrationOpal.getPlayerOpalSet().removeInternal(this);
		}
		myNewSchoolRegistrationOpal = argSchoolRegistrationOpal;
		if (argSchoolRegistrationOpal != null) {
			argSchoolRegistrationOpal.getPlayerOpalSet().addInternal(this);
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

	private CardOpal myOldInitialCardOpal;
	private CardOpal myNewInitialCardOpal;

	protected CardOpal retrieveInitialCardOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[0] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getCardOpalFactory().forInitialPlayerId(getIdAsObject());
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
		myNewInitialCardOpal = argCardOpal;
		if (argCardOpal != null) {
			argCardOpal.setInitialPlayerOpalInternal(this);
		}
		return this;
	}

	public synchronized void setInitialCardOpalInternal(CardOpal argCardOpal) {
		tryMutate();
		myNewInitialCardOpal = argCardOpal;
	}

	private com.opal.types.OpalBackCollectionSet<GameOpal, PlayerOpal> myIncomingLosingCardGameSet = null;

	private static final com.opal.types.OpalBackCollectionLoader<GameOpal, PlayerOpal> ourIncomingLosingCardGameOpalLoader = 
			new com.opal.types.OpalBackCollectionLoader<>(
					OpalFactoryFactory.getInstance().getGameOpalFactory()::forIncomingLosingCardPlayerOpalCollection,
					OpalFactoryFactory.getInstance().getGameOpalFactory()::forIncomingLosingCardPlayerOpalCount,
					GameOpal::setIncomingLosingCardPlayerOpal,
					GameOpal::setIncomingLosingCardPlayerOpalInternal,
					GameOpal::getIncomingLosingCardPlayerOpal,
					com.scobolsolo.application.FactoryMap.getNoArgCtorSetCreator(),
					com.scobolsolo.application.FactoryMap.getCollectionArgSetCreator(),
					true
					);

	/* package */ synchronized com.opal.types.OpalBackCollectionSet<GameOpal, PlayerOpal> getIncomingLosingCardGameOpalSet() {
		if (myIncomingLosingCardGameSet == null) {
			myIncomingLosingCardGameSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
					this,
					ourIncomingLosingCardGameOpalLoader,
					isNew()
					);
		}
		return myIncomingLosingCardGameSet;
	}

	private com.opal.types.OpalBackCollectionSet<GameOpal, PlayerOpal> myIncomingWinningCardGameSet = null;

	private static final com.opal.types.OpalBackCollectionLoader<GameOpal, PlayerOpal> ourIncomingWinningCardGameOpalLoader = 
			new com.opal.types.OpalBackCollectionLoader<>(
					OpalFactoryFactory.getInstance().getGameOpalFactory()::forIncomingWinningCardPlayerOpalCollection,
					OpalFactoryFactory.getInstance().getGameOpalFactory()::forIncomingWinningCardPlayerOpalCount,
					GameOpal::setIncomingWinningCardPlayerOpal,
					GameOpal::setIncomingWinningCardPlayerOpalInternal,
					GameOpal::getIncomingWinningCardPlayerOpal,
					com.scobolsolo.application.FactoryMap.getNoArgCtorSetCreator(),
					com.scobolsolo.application.FactoryMap.getCollectionArgSetCreator(),
					true
					);

	/* package */ synchronized com.opal.types.OpalBackCollectionSet<GameOpal, PlayerOpal> getIncomingWinningCardGameOpalSet() {
		if (myIncomingWinningCardGameSet == null) {
			myIncomingWinningCardGameSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
					this,
					ourIncomingWinningCardGameOpalLoader,
					isNew()
					);
		}
		return myIncomingWinningCardGameSet;
	}

	private com.opal.types.OpalBackCollectionSet<GameOpal, PlayerOpal> myOutgoingLosingCardGameSet = null;

	private static final com.opal.types.OpalBackCollectionLoader<GameOpal, PlayerOpal> ourOutgoingLosingCardGameOpalLoader = 
			new com.opal.types.OpalBackCollectionLoader<>(
					OpalFactoryFactory.getInstance().getGameOpalFactory()::forOutgoingLosingCardPlayerOpalCollection,
					OpalFactoryFactory.getInstance().getGameOpalFactory()::forOutgoingLosingCardPlayerOpalCount,
					GameOpal::setOutgoingLosingCardPlayerOpal,
					GameOpal::setOutgoingLosingCardPlayerOpalInternal,
					GameOpal::getOutgoingLosingCardPlayerOpal,
					com.scobolsolo.application.FactoryMap.getNoArgCtorSetCreator(),
					com.scobolsolo.application.FactoryMap.getCollectionArgSetCreator(),
					true
					);

	/* package */ synchronized com.opal.types.OpalBackCollectionSet<GameOpal, PlayerOpal> getOutgoingLosingCardGameOpalSet() {
		if (myOutgoingLosingCardGameSet == null) {
			myOutgoingLosingCardGameSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
					this,
					ourOutgoingLosingCardGameOpalLoader,
					isNew()
					);
		}
		return myOutgoingLosingCardGameSet;
	}

	private com.opal.types.OpalBackCollectionSet<GameOpal, PlayerOpal> myOutgoingWinningCardGameSet = null;

	private static final com.opal.types.OpalBackCollectionLoader<GameOpal, PlayerOpal> ourOutgoingWinningCardGameOpalLoader = 
			new com.opal.types.OpalBackCollectionLoader<>(
					OpalFactoryFactory.getInstance().getGameOpalFactory()::forOutgoingWinningCardPlayerOpalCollection,
					OpalFactoryFactory.getInstance().getGameOpalFactory()::forOutgoingWinningCardPlayerOpalCount,
					GameOpal::setOutgoingWinningCardPlayerOpal,
					GameOpal::setOutgoingWinningCardPlayerOpalInternal,
					GameOpal::getOutgoingWinningCardPlayerOpal,
					com.scobolsolo.application.FactoryMap.getNoArgCtorSetCreator(),
					com.scobolsolo.application.FactoryMap.getCollectionArgSetCreator(),
					true
					);

	/* package */ synchronized com.opal.types.OpalBackCollectionSet<GameOpal, PlayerOpal> getOutgoingWinningCardGameOpalSet() {
		if (myOutgoingWinningCardGameSet == null) {
			myOutgoingWinningCardGameSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
					this,
					ourOutgoingWinningCardGameOpalLoader,
					isNew()
					);
		}
		return myOutgoingWinningCardGameSet;
	}

	private com.opal.types.OpalBackCollectionSet<PerformanceOpal, PlayerOpal> myPerformanceSet = null;

	private static final com.opal.types.OpalBackCollectionLoader<PerformanceOpal, PlayerOpal> ourPerformanceOpalLoader = 
			new com.opal.types.OpalBackCollectionLoader<>(
					OpalFactoryFactory.getInstance().getPerformanceOpalFactory()::forPlayerOpalCollection,
					OpalFactoryFactory.getInstance().getPerformanceOpalFactory()::forPlayerOpalCount,
					PerformanceOpal::setPlayerOpal,
					PerformanceOpal::setPlayerOpalInternal,
					PerformanceOpal::getPlayerOpal,
					com.scobolsolo.application.FactoryMap.getNoArgCtorSetCreator(),
					com.scobolsolo.application.FactoryMap.getCollectionArgSetCreator(),
					false
					);

	/* package */ synchronized com.opal.types.OpalBackCollectionSet<PerformanceOpal, PlayerOpal> getPerformanceOpalSet() {
		if (myPerformanceSet == null) {
			myPerformanceSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
					this,
					ourPerformanceOpalLoader,
					isNew()
					);
		}
		return myPerformanceSet;
	}

	@Override
	public java.lang.String toString() {
		java.lang.StringBuilder lclSB = new java.lang.StringBuilder(64);
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
