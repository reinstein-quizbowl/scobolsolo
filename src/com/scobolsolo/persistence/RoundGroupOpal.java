package com.scobolsolo.persistence;

import com.scobolsolo.application.RoundGroup;

@com.opal.StoreGeneratedPrimaryKey
public final class RoundGroupOpal extends com.opal.UpdatableOpal<RoundGroup> {


	private RoundGroupOpal() {
		super();
		setUserFacing(null);
	}

	public RoundGroupOpal(com.opal.IdentityOpalFactory<RoundGroup, RoundGroupOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void applyDefaults() {

		/* Initialize the back Collections to empty sets. */

		myRoundSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
				this,
				ourRoundOpalLoader,
				true
				);

		return;
	}

	@Override
	protected void initializeReferences() {
		myOldPhaseOpal = PhaseOpal.NOT_YET_LOADED;
		return;
	}

	/* package */ static final String[] ourFieldNames = new String[] {
		"Id",
		"Name",
		"ShortName",
		"Sequence",
		"PhaseId",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.Integer.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.Integer.class,
		java.lang.Integer.class,
	};

	/* package */ static final boolean[] ourFieldNullability = new boolean[] {
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
	};

	public static final RoundGroupOpal NOT_YET_LOADED = new RoundGroupOpal();

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

	public synchronized java.lang.String getName() {
		return (java.lang.String) getReadValueSet()[1];
	}

	public synchronized java.lang.String getShortName() {
		return (java.lang.String) getReadValueSet()[2];
	}

	public synchronized java.lang.Integer getSequenceAsObject() {
		return (java.lang.Integer) getReadValueSet()[3];
	}

	public synchronized java.lang.Integer getPhaseIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[4];
	}

	public synchronized RoundGroupOpal setId(final java.lang.Integer argId) {
		tryMutate();
		if (argId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myId on " + this + " to null.");
		}
		getNewValues()[0] = argId;
		return this;
	}

	public RoundGroupOpal setId(final int argId) {
		setId(java.lang.Integer.valueOf(argId));
		return this;
	}

	public synchronized RoundGroupOpal setName(final java.lang.String argName) {
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

	public synchronized RoundGroupOpal setShortName(final java.lang.String argShortName) {
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

	public synchronized RoundGroupOpal setSequence(final java.lang.Integer argSequence) {
		tryMutate();
		if (argSequence == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set mySequence on " + this + " to null.");
		}
		getNewValues()[3] = argSequence;
		return this;
	}

	public RoundGroupOpal setSequence(final int argSequence) {
		setSequence(java.lang.Integer.valueOf(argSequence));
		return this;
	}

	public synchronized RoundGroupOpal setPhaseId(final java.lang.Integer argPhaseId) {
		tryMutate();
		if (argPhaseId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myPhaseId on " + this + " to null.");
		}
		getNewValues()[4] = argPhaseId;
		return this;
	}

	public RoundGroupOpal setPhaseId(final int argPhaseId) {
		setPhaseId(java.lang.Integer.valueOf(argPhaseId));
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
		myNewPhaseOpal = myOldPhaseOpal;
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		myOldPhaseOpal = myNewPhaseOpal;

		return;
	}

	@Override
	protected void unlinkInternal() {
		getRoundOpalSet().clear();
		if (getPhaseOpal() != null) {
			getPhaseOpal().getRoundGroupOpalSet().removeInternal(this);
		}
		return;
	}

	@Override
	protected void copyFieldsToInternal(com.opal.UpdatableOpal<RoundGroup> argTarget) {
		Object[] lclValues = getReadValueSet();
		Object[] lclTargetNewValues = argTarget.getNewValues();
		/* Field 0 (Id) is database generated. */
		lclTargetNewValues[1] = lclValues[1]; /* Name (immutable) */
		lclTargetNewValues[2] = lclValues[2]; /* ShortName (immutable) */
		lclTargetNewValues[3] = lclValues[3]; /* Sequence (immutable) */
		lclTargetNewValues[4] = lclValues[4]; /* PhaseId (immutable) */

		return;
	}

	@Override
	public synchronized void translateReferencesToFields() {
		if (myNewPhaseOpal != PhaseOpal.NOT_YET_LOADED) {
			setPhaseId(myNewPhaseOpal == null ? null : myNewPhaseOpal.getIdAsObject());
		}
		return;
	}

	@Override
	public java.util.Set<com.opal.TransactionAware> getRequiredPriorCommits() {
		java.util.Set<com.opal.TransactionAware> lclTAs = null;
		com.opal.UpdatableOpal<?> lclUO;
		lclUO = myNewPhaseOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
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
		if ((lclUO = myOldPhaseOpal) == PhaseOpal.NOT_YET_LOADED) {
			lclUO = myOldPhaseOpal = retrievePhaseOpal(getOldValues());
		}
		if (lclUO != null && (lclUO.exists() == false)) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
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
		argOutput.println("Name = " + getName());
		argOutput.println("ShortName = " + getShortName());
		argOutput.println("Sequence = " + getSequenceAsObject());
		argOutput.println("PhaseId = " + getPhaseIdAsObject());
	}

	@Override
	public synchronized void output(final java.io.PrintWriter argOutput) {
		argOutput.println("Id = " + getIdAsObject());
		argOutput.println("Name = " + getName());
		argOutput.println("ShortName = " + getShortName());
		argOutput.println("Sequence = " + getSequenceAsObject());
		argOutput.println("PhaseId = " + getPhaseIdAsObject());
	}

	private PhaseOpal myOldPhaseOpal;
	private PhaseOpal myNewPhaseOpal;

	protected PhaseOpal retrievePhaseOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[4] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getPhaseOpalFactory().forId(getPhaseIdAsObject());
	}

	public synchronized PhaseOpal getPhaseOpal() {
		PhaseOpal lclPhaseOpal;
		boolean lclAccess = tryAccess();
		lclPhaseOpal = lclAccess ? myNewPhaseOpal : myOldPhaseOpal;
		if (lclPhaseOpal == PhaseOpal.NOT_YET_LOADED) {
			lclPhaseOpal = retrievePhaseOpal(getReadValueSet());
			if (lclAccess) {
				myNewPhaseOpal = lclPhaseOpal;
			} else {
				myOldPhaseOpal = lclPhaseOpal;
			}
		}
		return lclPhaseOpal;
	}

	public synchronized RoundGroupOpal setPhaseOpal(PhaseOpal argPhaseOpal) {
		tryMutate();
		PhaseOpal lclPhaseOpal = getPhaseOpal();
		if (lclPhaseOpal == argPhaseOpal) { return this; }
		if (lclPhaseOpal != null) {
			lclPhaseOpal.getRoundGroupOpalSet().removeInternal(this);
		}
		myNewPhaseOpal = argPhaseOpal;
		if (argPhaseOpal != null) {
			argPhaseOpal.getRoundGroupOpalSet().addInternal(this);
		}
		return this;
	}

	protected synchronized void setPhaseOpalInternal(PhaseOpal argPhaseOpal) {
		tryMutate();
		myNewPhaseOpal = argPhaseOpal;
	}

	private com.opal.types.OpalBackCollectionSet<RoundOpal, RoundGroupOpal> myRoundSet = null;

	private static final com.opal.types.OpalBackCollectionLoader<RoundOpal, RoundGroupOpal> ourRoundOpalLoader = 
			new com.opal.types.OpalBackCollectionLoader<>(
					OpalFactoryFactory.getInstance().getRoundOpalFactory()::forRoundGroupOpalCollection,
					OpalFactoryFactory.getInstance().getRoundOpalFactory()::forRoundGroupOpalCount,
					RoundOpal::setRoundGroupOpal,
					RoundOpal::setRoundGroupOpalInternal,
					RoundOpal::getRoundGroupOpal,
					com.scobolsolo.application.FactoryMap.getNoArgCtorSetCreator(),
					com.scobolsolo.application.FactoryMap.getCollectionArgSetCreator(),
					true
					);

	/* package */ synchronized com.opal.types.OpalBackCollectionSet<RoundOpal, RoundGroupOpal> getRoundOpalSet() {
		if (myRoundSet == null) {
			myRoundSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
					this,
					ourRoundOpalLoader,
					isNew()
					);
		}
		return myRoundSet;
	}

	@Override
	public java.lang.String toString() {
		java.lang.StringBuilder lclSB = new java.lang.StringBuilder(64);
		lclSB.append("RoundGroupOpal[");
		lclSB.append("myId=");
		lclSB.append(toStringField(0));
		lclSB.append(']');
		return lclSB.toString();
	}

	@Override
	protected void updateReferencesAfterReload() {
		if (myNewPhaseOpal != PhaseOpal.NOT_YET_LOADED) {
			setPhaseOpal(retrievePhaseOpal(getNewValues()));
		}
	}

	@Override
	protected void updateCollectionsAfterReload() {
		assert needsToClearOldCollections() == false;
		setClearOldCollections(true);
	}

}
