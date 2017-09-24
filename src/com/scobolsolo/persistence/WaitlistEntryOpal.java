package com.scobolsolo.persistence;

import com.scobolsolo.application.WaitlistEntry;

@com.opal.StoreGeneratedPrimaryKey
public final class WaitlistEntryOpal extends com.opal.UpdatableOpal<WaitlistEntry> {

	public static final java.lang.Integer ourDefaultPlayerCount = java.lang.Integer.valueOf(1);

	private WaitlistEntryOpal() {
		super();
		setUserFacing(null);
	}

	public WaitlistEntryOpal(com.opal.IdentityOpalFactory<WaitlistEntry, WaitlistEntryOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void applyDefaults() {
		/* Initialize fields with their default values. */
		getNewValues()[3] = ourDefaultPlayerCount;

		return;
	}

	@Override
	protected void initializeReferences() {
		myOldSchoolRegistrationOpal = SchoolRegistrationOpal.NOT_YET_LOADED;
		return;
	}

	/* package */ static final String[] ourFieldNames = new String[] {
		"Id",
		"SchoolRegistrationId",
		"Sequence",
		"PlayerCount",
		"Note",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.lang.String.class,
	};

	/* package */ static final boolean[] ourFieldNullability = new boolean[] {
		false,
		false,
		false,
		false,
		true,
	};

	/* package */ static final com.opal.FieldValidator[] ourFieldValidators = new com.opal.FieldValidator[] {
		null,
		null,
		null,
		null,
		null,
	};

	public static final WaitlistEntryOpal NOT_YET_LOADED = new WaitlistEntryOpal();

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

	public synchronized java.lang.Integer getSchoolRegistrationIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[1];
	}

	public synchronized java.lang.Integer getSequenceAsObject() {
		return (java.lang.Integer) getReadValueSet()[2];
	}

	public synchronized java.lang.Integer getPlayerCountAsObject() {
		return (java.lang.Integer) getReadValueSet()[3];
	}

	public synchronized java.lang.String getNote() {
		return (java.lang.String) getReadValueSet()[4];
	}

	public synchronized WaitlistEntryOpal setId(final java.lang.Integer argId) {
		tryMutate();
		if (argId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myId on " + this + " to null.");
		}
		getNewValues()[0] = argId;
		return this;
	}

	public WaitlistEntryOpal setId(final int argId) {
		setId(java.lang.Integer.valueOf(argId));
		return this;
	}

	public synchronized WaitlistEntryOpal setSchoolRegistrationId(final java.lang.Integer argSchoolRegistrationId) {
		tryMutate();
		if (argSchoolRegistrationId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set mySchoolRegistrationId on " + this + " to null.");
		}
		getNewValues()[1] = argSchoolRegistrationId;
		return this;
	}

	public WaitlistEntryOpal setSchoolRegistrationId(final int argSchoolRegistrationId) {
		setSchoolRegistrationId(java.lang.Integer.valueOf(argSchoolRegistrationId));
		return this;
	}

	public synchronized WaitlistEntryOpal setSequence(final java.lang.Integer argSequence) {
		tryMutate();
		if (argSequence == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set mySequence on " + this + " to null.");
		}
		getNewValues()[2] = argSequence;
		return this;
	}

	public WaitlistEntryOpal setSequence(final int argSequence) {
		setSequence(java.lang.Integer.valueOf(argSequence));
		return this;
	}

	public synchronized WaitlistEntryOpal setPlayerCount(final java.lang.Integer argPlayerCount) {
		tryMutate();
		if (argPlayerCount == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myPlayerCount on " + this + " to null.");
		}
		getNewValues()[3] = argPlayerCount;
		return this;
	}

	public WaitlistEntryOpal setPlayerCount(final int argPlayerCount) {
		setPlayerCount(java.lang.Integer.valueOf(argPlayerCount));
		return this;
	}

	public synchronized WaitlistEntryOpal setNote(final java.lang.String argNote) {
		tryMutate();
		getNewValues()[4] = argNote;
		return this;
	}

	@Override
	protected /* synchronized */ void copyOldValuesToNewInternal() {
		myNewSchoolRegistrationOpal = myOldSchoolRegistrationOpal;
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		myOldSchoolRegistrationOpal = myNewSchoolRegistrationOpal;

		return;
	}

	@Override
	protected void unlinkInternal() {
		if (getSchoolRegistrationOpal() != null) {
			getSchoolRegistrationOpal().getWaitlistEntryOpalSet().removeInternal(this);
		}
		return;
	}

	@Override
	protected void copyFieldsToInternal(com.opal.UpdatableOpal<WaitlistEntry> argTarget) {
		Object[] lclValues = getReadValueSet();
		Object[] lclTargetNewValues = argTarget.getNewValues();
		/* Field 0 (Id) is database generated. */
		lclTargetNewValues[1] = lclValues[1]; /* SchoolRegistrationId (immutable) */
		lclTargetNewValues[2] = lclValues[2]; /* Sequence (immutable) */
		lclTargetNewValues[3] = lclValues[3]; /* PlayerCount (immutable) */
		lclTargetNewValues[4] = lclValues[4]; /* Note (immutable) */

		return;
	}

	@Override
	public synchronized void translateReferencesToFields() {
		if (myNewSchoolRegistrationOpal != SchoolRegistrationOpal.NOT_YET_LOADED) {
			setSchoolRegistrationId(myNewSchoolRegistrationOpal == null ? null : myNewSchoolRegistrationOpal.getIdAsObject());
		}
		return;
	}

	@Override
	public java.util.Set<com.opal.TransactionAware> getRequiredPriorCommits() {
		java.util.Set<com.opal.TransactionAware> lclTAs = null;
		com.opal.UpdatableOpal<?> lclUO;
		lclUO = myNewSchoolRegistrationOpal;
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
		if ((lclUO = myOldSchoolRegistrationOpal) == SchoolRegistrationOpal.NOT_YET_LOADED) {
			lclUO = myOldSchoolRegistrationOpal = retrieveSchoolRegistrationOpal(getOldValues());
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
		argOutput.println("SchoolRegistrationId = " + getSchoolRegistrationIdAsObject());
		argOutput.println("Sequence = " + getSequenceAsObject());
		argOutput.println("PlayerCount = " + getPlayerCountAsObject());
		argOutput.println("Note = " + getNote());
	}

	@Override
	public synchronized void output(final java.io.PrintWriter argOutput) {
		argOutput.println("Id = " + getIdAsObject());
		argOutput.println("SchoolRegistrationId = " + getSchoolRegistrationIdAsObject());
		argOutput.println("Sequence = " + getSequenceAsObject());
		argOutput.println("PlayerCount = " + getPlayerCountAsObject());
		argOutput.println("Note = " + getNote());
	}

	private SchoolRegistrationOpal myOldSchoolRegistrationOpal;
	private SchoolRegistrationOpal myNewSchoolRegistrationOpal;

	protected SchoolRegistrationOpal retrieveSchoolRegistrationOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[1] == null)) {
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

	public synchronized WaitlistEntryOpal setSchoolRegistrationOpal(SchoolRegistrationOpal argSchoolRegistrationOpal) {
		tryMutate();
		SchoolRegistrationOpal lclSchoolRegistrationOpal = getSchoolRegistrationOpal();
		if (lclSchoolRegistrationOpal == argSchoolRegistrationOpal) { return this; }
		if (lclSchoolRegistrationOpal != null) {
			lclSchoolRegistrationOpal.getWaitlistEntryOpalSet().removeInternal(this);
		}
		myNewSchoolRegistrationOpal = argSchoolRegistrationOpal;
		if (argSchoolRegistrationOpal != null) {
			argSchoolRegistrationOpal.getWaitlistEntryOpalSet().addInternal(this);
		}
		return this;
	}

	protected synchronized void setSchoolRegistrationOpalInternal(SchoolRegistrationOpal argSchoolRegistrationOpal) {
		tryMutate();
		myNewSchoolRegistrationOpal = argSchoolRegistrationOpal;
	}

	@Override
	public java.lang.String toString() {
		java.lang.StringBuilder lclSB = new java.lang.StringBuilder(64);
		lclSB.append("WaitlistEntryOpal[");
		lclSB.append("myId=");
		lclSB.append(toStringField(0));
		lclSB.append(']');
		return lclSB.toString();
	}

	@Override
	protected void updateReferencesAfterReload() {
		if (myNewSchoolRegistrationOpal != SchoolRegistrationOpal.NOT_YET_LOADED) {
			setSchoolRegistrationOpal(retrieveSchoolRegistrationOpal(getNewValues()));
		}
	}

}
