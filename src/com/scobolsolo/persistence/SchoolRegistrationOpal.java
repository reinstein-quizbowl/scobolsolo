package com.scobolsolo.persistence;

import com.scobolsolo.application.SchoolRegistration;

@com.opal.StoreGeneratedPrimaryKey
public final class SchoolRegistrationOpal extends com.opal.UpdatableOpal<SchoolRegistration> {

	public static final java.math.BigDecimal ourDefaultAmountOwed = java.math.BigDecimal.valueOf(0.0);
	public static final java.math.BigDecimal ourDefaultAmountPaid = java.math.BigDecimal.valueOf(0.0);

	private SchoolRegistrationOpal() {
		super();
		setUserFacing(null);
	}

	public SchoolRegistrationOpal(com.opal.IdentityOpalFactory<SchoolRegistration, SchoolRegistrationOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void applyDefaults() {
		/* Initialize fields with their default values. */
		getNewValues()[3] = ourDefaultAmountOwed;
		getNewValues()[4] = ourDefaultAmountPaid;


		/* Initialize the back Collections to empty sets. */

		myStandbyEntrySet = new com.opal.types.OpalBackCollectionDoubleSet<>(
				this,
				ourStandbyEntryOpalLoader,
				true
				);
		myPlayerSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
				this,
				ourPlayerOpalLoader,
				true
				);
		myBuzzerSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
				this,
				ourBuzzerOpalLoader,
				true
				);
		myWaitlistEntrySet = new com.opal.types.OpalBackCollectionDoubleSet<>(
				this,
				ourWaitlistEntryOpalLoader,
				true
				);
		myStaffSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
				this,
				ourStaffOpalLoader,
				true
				);

		return;
	}

	@Override
	protected void initializeReferences() {
		myOldMainContactOpal = ContactOpal.NOT_YET_LOADED;
		myOldSchoolOpal = SchoolOpal.NOT_YET_LOADED;
		myOldTournamentOpal = TournamentOpal.NOT_YET_LOADED;
		return;
	}

	/* package */ static final String[] ourFieldNames = new String[] {
		"Id",
		"SchoolId",
		"MainContactId",
		"AmountOwed",
		"AmountPaid",
		"Note",
		"SpotsReserved",
		"TournamentCode",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.math.BigDecimal.class,
		java.math.BigDecimal.class,
		java.lang.String.class,
		java.lang.Integer.class,
		java.lang.String.class,
	};

	/* package */ static final boolean[] ourFieldNullability = new boolean[] {
		false,
		false,
		false,
		false,
		false,
		true,
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
		null,
	};

	public static final SchoolRegistrationOpal NOT_YET_LOADED = new SchoolRegistrationOpal();

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

	public synchronized java.lang.Integer getSchoolIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[1];
	}

	public synchronized java.lang.Integer getMainContactIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[2];
	}

	public synchronized java.math.BigDecimal getAmountOwed() {
		return (java.math.BigDecimal) getReadValueSet()[3];
	}

	public synchronized java.math.BigDecimal getAmountPaid() {
		return (java.math.BigDecimal) getReadValueSet()[4];
	}

	public synchronized java.lang.String getNote() {
		return (java.lang.String) getReadValueSet()[5];
	}

	public synchronized java.lang.Integer getSpotsReservedAsObject() {
		return (java.lang.Integer) getReadValueSet()[6];
	}

	public synchronized java.lang.String getTournamentCode() {
		return (java.lang.String) getReadValueSet()[7];
	}

	public synchronized SchoolRegistrationOpal setId(final java.lang.Integer argId) {
		tryMutate();
		if (argId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myId on " + this + " to null.");
		}
		getNewValues()[0] = argId;
		return this;
	}

	public SchoolRegistrationOpal setId(final int argId) {
		setId(java.lang.Integer.valueOf(argId));
		return this;
	}

	public synchronized SchoolRegistrationOpal setSchoolId(final java.lang.Integer argSchoolId) {
		tryMutate();
		if (argSchoolId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set mySchoolId on " + this + " to null.");
		}
		getNewValues()[1] = argSchoolId;
		return this;
	}

	public SchoolRegistrationOpal setSchoolId(final int argSchoolId) {
		setSchoolId(java.lang.Integer.valueOf(argSchoolId));
		return this;
	}

	public synchronized SchoolRegistrationOpal setMainContactId(final java.lang.Integer argMainContactId) {
		tryMutate();
		if (argMainContactId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myMainContactId on " + this + " to null.");
		}
		getNewValues()[2] = argMainContactId;
		return this;
	}

	public SchoolRegistrationOpal setMainContactId(final int argMainContactId) {
		setMainContactId(java.lang.Integer.valueOf(argMainContactId));
		return this;
	}

	public synchronized SchoolRegistrationOpal setAmountOwed(final java.math.BigDecimal argAmountOwed) {
		tryMutate();
		if (argAmountOwed == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myAmountOwed on " + this + " to null.");
		}
		getNewValues()[3] = argAmountOwed;
		return this;
	}

	public synchronized SchoolRegistrationOpal setAmountPaid(final java.math.BigDecimal argAmountPaid) {
		tryMutate();
		if (argAmountPaid == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myAmountPaid on " + this + " to null.");
		}
		getNewValues()[4] = argAmountPaid;
		return this;
	}

	public synchronized SchoolRegistrationOpal setNote(final java.lang.String argNote) {
		tryMutate();
		getNewValues()[5] = argNote;
		return this;
	}

	public synchronized SchoolRegistrationOpal setSpotsReserved(final java.lang.Integer argSpotsReserved) {
		tryMutate();
		if (argSpotsReserved == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set mySpotsReserved on " + this + " to null.");
		}
		getNewValues()[6] = argSpotsReserved;
		return this;
	}

	public SchoolRegistrationOpal setSpotsReserved(final int argSpotsReserved) {
		setSpotsReserved(java.lang.Integer.valueOf(argSpotsReserved));
		return this;
	}

	public synchronized SchoolRegistrationOpal setTournamentCode(final java.lang.String argTournamentCode) {
		tryMutate();
		if (argTournamentCode == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myTournamentCode on " + this + " to null.");
		}
		if (argTournamentCode.length() > 32) {
			throw new com.opal.ArgumentTooLongException("Cannot set myTournamentCode on " + this + " to \"" + argTournamentCode + "\" because that field's maximum length is 32.", argTournamentCode.length(), 32);
		}
		getNewValues()[7] = argTournamentCode;
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
		myNewMainContactOpal = myOldMainContactOpal;
		myNewSchoolOpal = myOldSchoolOpal;
		myNewTournamentOpal = myOldTournamentOpal;
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		myOldMainContactOpal = myNewMainContactOpal;
		myOldSchoolOpal = myNewSchoolOpal;
		myOldTournamentOpal = myNewTournamentOpal;

		return;
	}

	@Override
	protected void unlinkInternal() {
		getStandbyEntryOpalSet().clear();
		getPlayerOpalSet().clear();
		getBuzzerOpalSet().clear();
		getWaitlistEntryOpalSet().clear();
		getStaffOpalSet().clear();
		if (getMainContactOpal() != null) {
			getMainContactOpal().getMainSchoolRegistrationOpalSet().removeInternal(this);
		}
		if (getSchoolOpal() != null) {
			getSchoolOpal().getSchoolRegistrationOpalSet().removeInternal(this);
		}
		if (getTournamentOpal() != null) {
			getTournamentOpal().getSchoolRegistrationOpalSet().removeInternal(this);
		}
		return;
	}

	@Override
	protected void copyFieldsToInternal(com.opal.UpdatableOpal<SchoolRegistration> argTarget) {
		Object[] lclValues = getReadValueSet();
		Object[] lclTargetNewValues = argTarget.getNewValues();
		/* Field 0 (Id) is database generated. */
		lclTargetNewValues[1] = lclValues[1]; /* SchoolId (immutable) */
		lclTargetNewValues[2] = lclValues[2]; /* MainContactId (immutable) */
		lclTargetNewValues[3] = lclValues[3]; /* AmountOwed (immutable) */
		lclTargetNewValues[4] = lclValues[4]; /* AmountPaid (immutable) */
		lclTargetNewValues[5] = lclValues[5]; /* Note (immutable) */
		lclTargetNewValues[6] = lclValues[6]; /* SpotsReserved (immutable) */
		lclTargetNewValues[7] = lclValues[7]; /* TournamentCode (immutable) */

		return;
	}

	@Override
	public synchronized void translateReferencesToFields() {
		if (myNewMainContactOpal != ContactOpal.NOT_YET_LOADED) {
			setMainContactId(myNewMainContactOpal == null ? null : myNewMainContactOpal.getIdAsObject());
		}
		if (myNewSchoolOpal != SchoolOpal.NOT_YET_LOADED) {
			setSchoolId(myNewSchoolOpal == null ? null : myNewSchoolOpal.getIdAsObject());
		}
		if (myNewTournamentOpal != TournamentOpal.NOT_YET_LOADED) {
			setTournamentCode(myNewTournamentOpal == null ? null : myNewTournamentOpal.getCode());
		}
		return;
	}

	@Override
	public java.util.Set<com.opal.TransactionAware> getRequiredPriorCommits() {
		java.util.Set<com.opal.TransactionAware> lclTAs = null;
		com.opal.UpdatableOpal<?> lclUO;
		lclUO = myNewMainContactOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		lclUO = myNewSchoolOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		lclUO = myNewTournamentOpal;
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
		if ((lclUO = myOldMainContactOpal) == ContactOpal.NOT_YET_LOADED) {
			lclUO = myOldMainContactOpal = retrieveMainContactOpal(getOldValues());
		}
		if (lclUO != null && (lclUO.exists() == false)) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		if ((lclUO = myOldSchoolOpal) == SchoolOpal.NOT_YET_LOADED) {
			lclUO = myOldSchoolOpal = retrieveSchoolOpal(getOldValues());
		}
		if (lclUO != null && (lclUO.exists() == false)) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		if ((lclUO = myOldTournamentOpal) == TournamentOpal.NOT_YET_LOADED) {
			lclUO = myOldTournamentOpal = retrieveTournamentOpal(getOldValues());
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
		argOutput.println("SchoolId = " + getSchoolIdAsObject());
		argOutput.println("MainContactId = " + getMainContactIdAsObject());
		argOutput.println("AmountOwed = " + getAmountOwed());
		argOutput.println("AmountPaid = " + getAmountPaid());
		argOutput.println("Note = " + getNote());
		argOutput.println("SpotsReserved = " + getSpotsReservedAsObject());
		argOutput.println("TournamentCode = " + getTournamentCode());
	}

	@Override
	public synchronized void output(final java.io.PrintWriter argOutput) {
		argOutput.println("Id = " + getIdAsObject());
		argOutput.println("SchoolId = " + getSchoolIdAsObject());
		argOutput.println("MainContactId = " + getMainContactIdAsObject());
		argOutput.println("AmountOwed = " + getAmountOwed());
		argOutput.println("AmountPaid = " + getAmountPaid());
		argOutput.println("Note = " + getNote());
		argOutput.println("SpotsReserved = " + getSpotsReservedAsObject());
		argOutput.println("TournamentCode = " + getTournamentCode());
	}

	private ContactOpal myOldMainContactOpal;
	private ContactOpal myNewMainContactOpal;

	protected ContactOpal retrieveMainContactOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[2] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getContactOpalFactory().forId(getMainContactIdAsObject());
	}

	public synchronized ContactOpal getMainContactOpal() {
		ContactOpal lclContactOpal;
		boolean lclAccess = tryAccess();
		lclContactOpal = lclAccess ? myNewMainContactOpal : myOldMainContactOpal;
		if (lclContactOpal == ContactOpal.NOT_YET_LOADED) {
			lclContactOpal = retrieveMainContactOpal(getReadValueSet());
			if (lclAccess) {
				myNewMainContactOpal = lclContactOpal;
			} else {
				myOldMainContactOpal = lclContactOpal;
			}
		}
		return lclContactOpal;
	}

	public synchronized SchoolRegistrationOpal setMainContactOpal(ContactOpal argContactOpal) {
		tryMutate();
		ContactOpal lclContactOpal = getMainContactOpal();
		if (lclContactOpal == argContactOpal) { return this; }
		if (lclContactOpal != null) {
			lclContactOpal.getMainSchoolRegistrationOpalSet().removeInternal(this);
		}
		myNewMainContactOpal = argContactOpal;
		if (argContactOpal != null) {
			argContactOpal.getMainSchoolRegistrationOpalSet().addInternal(this);
		}
		return this;
	}

	protected synchronized void setMainContactOpalInternal(ContactOpal argContactOpal) {
		tryMutate();
		myNewMainContactOpal = argContactOpal;
	}

	private SchoolOpal myOldSchoolOpal;
	private SchoolOpal myNewSchoolOpal;

	protected SchoolOpal retrieveSchoolOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[1] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getSchoolOpalFactory().forId(getSchoolIdAsObject());
	}

	public synchronized SchoolOpal getSchoolOpal() {
		SchoolOpal lclSchoolOpal;
		boolean lclAccess = tryAccess();
		lclSchoolOpal = lclAccess ? myNewSchoolOpal : myOldSchoolOpal;
		if (lclSchoolOpal == SchoolOpal.NOT_YET_LOADED) {
			lclSchoolOpal = retrieveSchoolOpal(getReadValueSet());
			if (lclAccess) {
				myNewSchoolOpal = lclSchoolOpal;
			} else {
				myOldSchoolOpal = lclSchoolOpal;
			}
		}
		return lclSchoolOpal;
	}

	public synchronized SchoolRegistrationOpal setSchoolOpal(SchoolOpal argSchoolOpal) {
		tryMutate();
		SchoolOpal lclSchoolOpal = getSchoolOpal();
		if (lclSchoolOpal == argSchoolOpal) { return this; }
		if (lclSchoolOpal != null) {
			lclSchoolOpal.getSchoolRegistrationOpalSet().removeInternal(this);
		}
		myNewSchoolOpal = argSchoolOpal;
		if (argSchoolOpal != null) {
			argSchoolOpal.getSchoolRegistrationOpalSet().addInternal(this);
		}
		return this;
	}

	protected synchronized void setSchoolOpalInternal(SchoolOpal argSchoolOpal) {
		tryMutate();
		myNewSchoolOpal = argSchoolOpal;
	}

	private TournamentOpal myOldTournamentOpal;
	private TournamentOpal myNewTournamentOpal;

	protected TournamentOpal retrieveTournamentOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[7] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getTournamentOpalFactory().forCode(getTournamentCode());
	}

	public synchronized TournamentOpal getTournamentOpal() {
		TournamentOpal lclTournamentOpal;
		boolean lclAccess = tryAccess();
		lclTournamentOpal = lclAccess ? myNewTournamentOpal : myOldTournamentOpal;
		if (lclTournamentOpal == TournamentOpal.NOT_YET_LOADED) {
			lclTournamentOpal = retrieveTournamentOpal(getReadValueSet());
			if (lclAccess) {
				myNewTournamentOpal = lclTournamentOpal;
			} else {
				myOldTournamentOpal = lclTournamentOpal;
			}
		}
		return lclTournamentOpal;
	}

	public synchronized SchoolRegistrationOpal setTournamentOpal(TournamentOpal argTournamentOpal) {
		tryMutate();
		TournamentOpal lclTournamentOpal = getTournamentOpal();
		if (lclTournamentOpal == argTournamentOpal) { return this; }
		if (lclTournamentOpal != null) {
			lclTournamentOpal.getSchoolRegistrationOpalSet().removeInternal(this);
		}
		myNewTournamentOpal = argTournamentOpal;
		if (argTournamentOpal != null) {
			argTournamentOpal.getSchoolRegistrationOpalSet().addInternal(this);
		}
		return this;
	}

	protected synchronized void setTournamentOpalInternal(TournamentOpal argTournamentOpal) {
		tryMutate();
		myNewTournamentOpal = argTournamentOpal;
	}

	private com.opal.types.OpalBackCollectionSet<StandbyEntryOpal, SchoolRegistrationOpal> myStandbyEntrySet = null;

	private static final com.opal.types.OpalBackCollectionLoader<StandbyEntryOpal, SchoolRegistrationOpal> ourStandbyEntryOpalLoader = 
			new com.opal.types.OpalBackCollectionLoader<>(
					OpalFactoryFactory.getInstance().getStandbyEntryOpalFactory()::forSchoolRegistrationOpalCollection,
					OpalFactoryFactory.getInstance().getStandbyEntryOpalFactory()::forSchoolRegistrationOpalCount,
					StandbyEntryOpal::setSchoolRegistrationOpal,
					StandbyEntryOpal::setSchoolRegistrationOpalInternal,
					StandbyEntryOpal::getSchoolRegistrationOpal,
					com.scobolsolo.application.FactoryMap.getNoArgCtorSetCreator(),
					com.scobolsolo.application.FactoryMap.getCollectionArgSetCreator(),
					false
					);

	/* package */ synchronized com.opal.types.OpalBackCollectionSet<StandbyEntryOpal, SchoolRegistrationOpal> getStandbyEntryOpalSet() {
		if (myStandbyEntrySet == null) {
			myStandbyEntrySet = new com.opal.types.OpalBackCollectionDoubleSet<>(
					this,
					ourStandbyEntryOpalLoader,
					isNew()
					);
		}
		return myStandbyEntrySet;
	}

	private com.opal.types.OpalBackCollectionSet<PlayerOpal, SchoolRegistrationOpal> myPlayerSet = null;

	private static final com.opal.types.OpalBackCollectionLoader<PlayerOpal, SchoolRegistrationOpal> ourPlayerOpalLoader = 
			new com.opal.types.OpalBackCollectionLoader<>(
					OpalFactoryFactory.getInstance().getPlayerOpalFactory()::forSchoolRegistrationOpalCollection,
					OpalFactoryFactory.getInstance().getPlayerOpalFactory()::forSchoolRegistrationOpalCount,
					PlayerOpal::setSchoolRegistrationOpal,
					PlayerOpal::setSchoolRegistrationOpalInternal,
					PlayerOpal::getSchoolRegistrationOpal,
					com.scobolsolo.application.FactoryMap.getNoArgCtorSetCreator(),
					com.scobolsolo.application.FactoryMap.getCollectionArgSetCreator(),
					true
					);

	/* package */ synchronized com.opal.types.OpalBackCollectionSet<PlayerOpal, SchoolRegistrationOpal> getPlayerOpalSet() {
		if (myPlayerSet == null) {
			myPlayerSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
					this,
					ourPlayerOpalLoader,
					isNew()
					);
		}
		return myPlayerSet;
	}

	private com.opal.types.OpalBackCollectionSet<BuzzerOpal, SchoolRegistrationOpal> myBuzzerSet = null;

	private static final com.opal.types.OpalBackCollectionLoader<BuzzerOpal, SchoolRegistrationOpal> ourBuzzerOpalLoader = 
			new com.opal.types.OpalBackCollectionLoader<>(
					OpalFactoryFactory.getInstance().getBuzzerOpalFactory()::forSchoolRegistrationOpalCollection,
					OpalFactoryFactory.getInstance().getBuzzerOpalFactory()::forSchoolRegistrationOpalCount,
					BuzzerOpal::setSchoolRegistrationOpal,
					BuzzerOpal::setSchoolRegistrationOpalInternal,
					BuzzerOpal::getSchoolRegistrationOpal,
					com.scobolsolo.application.FactoryMap.getNoArgCtorSetCreator(),
					com.scobolsolo.application.FactoryMap.getCollectionArgSetCreator(),
					false
					);

	/* package */ synchronized com.opal.types.OpalBackCollectionSet<BuzzerOpal, SchoolRegistrationOpal> getBuzzerOpalSet() {
		if (myBuzzerSet == null) {
			myBuzzerSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
					this,
					ourBuzzerOpalLoader,
					isNew()
					);
		}
		return myBuzzerSet;
	}

	private com.opal.types.OpalBackCollectionSet<WaitlistEntryOpal, SchoolRegistrationOpal> myWaitlistEntrySet = null;

	private static final com.opal.types.OpalBackCollectionLoader<WaitlistEntryOpal, SchoolRegistrationOpal> ourWaitlistEntryOpalLoader = 
			new com.opal.types.OpalBackCollectionLoader<>(
					OpalFactoryFactory.getInstance().getWaitlistEntryOpalFactory()::forSchoolRegistrationOpalCollection,
					OpalFactoryFactory.getInstance().getWaitlistEntryOpalFactory()::forSchoolRegistrationOpalCount,
					WaitlistEntryOpal::setSchoolRegistrationOpal,
					WaitlistEntryOpal::setSchoolRegistrationOpalInternal,
					WaitlistEntryOpal::getSchoolRegistrationOpal,
					com.scobolsolo.application.FactoryMap.getNoArgCtorSetCreator(),
					com.scobolsolo.application.FactoryMap.getCollectionArgSetCreator(),
					false
					);

	/* package */ synchronized com.opal.types.OpalBackCollectionSet<WaitlistEntryOpal, SchoolRegistrationOpal> getWaitlistEntryOpalSet() {
		if (myWaitlistEntrySet == null) {
			myWaitlistEntrySet = new com.opal.types.OpalBackCollectionDoubleSet<>(
					this,
					ourWaitlistEntryOpalLoader,
					isNew()
					);
		}
		return myWaitlistEntrySet;
	}

	private com.opal.types.OpalBackCollectionSet<StaffOpal, SchoolRegistrationOpal> myStaffSet = null;

	private static final com.opal.types.OpalBackCollectionLoader<StaffOpal, SchoolRegistrationOpal> ourStaffOpalLoader = 
			new com.opal.types.OpalBackCollectionLoader<>(
					OpalFactoryFactory.getInstance().getStaffOpalFactory()::forSchoolRegistrationOpalCollection,
					OpalFactoryFactory.getInstance().getStaffOpalFactory()::forSchoolRegistrationOpalCount,
					StaffOpal::setSchoolRegistrationOpal,
					StaffOpal::setSchoolRegistrationOpalInternal,
					StaffOpal::getSchoolRegistrationOpal,
					com.scobolsolo.application.FactoryMap.getNoArgCtorSetCreator(),
					com.scobolsolo.application.FactoryMap.getCollectionArgSetCreator(),
					true
					);

	/* package */ synchronized com.opal.types.OpalBackCollectionSet<StaffOpal, SchoolRegistrationOpal> getStaffOpalSet() {
		if (myStaffSet == null) {
			myStaffSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
					this,
					ourStaffOpalLoader,
					isNew()
					);
		}
		return myStaffSet;
	}

	@Override
	public java.lang.String toString() {
		java.lang.StringBuilder lclSB = new java.lang.StringBuilder(64);
		lclSB.append("SchoolRegistrationOpal[");
		lclSB.append("myId=");
		lclSB.append(toStringField(0));
		lclSB.append(']');
		return lclSB.toString();
	}

	@Override
	protected void updateReferencesAfterReload() {
		if (myNewMainContactOpal != ContactOpal.NOT_YET_LOADED) {
			setMainContactOpal(retrieveMainContactOpal(getNewValues()));
		}
		if (myNewSchoolOpal != SchoolOpal.NOT_YET_LOADED) {
			setSchoolOpal(retrieveSchoolOpal(getNewValues()));
		}
		if (myNewTournamentOpal != TournamentOpal.NOT_YET_LOADED) {
			setTournamentOpal(retrieveTournamentOpal(getNewValues()));
		}
	}

	@Override
	protected void updateCollectionsAfterReload() {
		assert needsToClearOldCollections() == false;
		setClearOldCollections(true);
	}

}
