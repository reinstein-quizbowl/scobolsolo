package com.scobolsolo.persistence;

import com.scobolsolo.application.School;

@com.opal.StoreGeneratedPrimaryKey
public final class SchoolOpal extends com.opal.UpdatableOpal<School> {


	private SchoolOpal() {
		super();
		setUserFacing(null);
	}

	public SchoolOpal(com.opal.IdentityOpalFactory<School, SchoolOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void applyDefaults() {

		/* Initialize the back Collections to empty sets. */

		myNewSchoolRegistrationOpalHashSet = new java.util.HashSet<>();

		return;
	}

	/* package */ static final String[] ourFieldNames = new String[] {
		"Id",
		"Name",
		"ShortName",
		"VeryShortName",
		"Location",
		"Note",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.Integer.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.String.class,
	};

	/* package */ static final boolean[] ourFieldNullability = new boolean[] {
		false,
		false,
		false,
		false,
		true,
		true,
	};

	/* package */ static final com.opal.FieldValidator[] ourFieldValidators = new com.opal.FieldValidator[] {
		null,
		null,
		null,
		null,
		null,
		null,
	};

	public static final SchoolOpal NOT_YET_LOADED = new SchoolOpal();

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

	public synchronized java.lang.String getVeryShortName() {
		return (java.lang.String) getReadValueSet()[3];
	}

	public synchronized java.lang.String getLocation() {
		return (java.lang.String) getReadValueSet()[4];
	}

	public synchronized java.lang.String getNote() {
		return (java.lang.String) getReadValueSet()[5];
	}

	public synchronized SchoolOpal setId(final java.lang.Integer argId) {
		tryMutate();
		if (argId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myId on " + this + " to null.");
		}
		getNewValues()[0] = argId;
		return this;
	}

	public SchoolOpal setId(final int argId) {
		setId(java.lang.Integer.valueOf(argId));
		return this;
	}

	public synchronized SchoolOpal setName(final java.lang.String argName) {
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

	public synchronized SchoolOpal setShortName(final java.lang.String argShortName) {
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

	public synchronized SchoolOpal setVeryShortName(final java.lang.String argVeryShortName) {
		tryMutate();
		if (argVeryShortName == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myVeryShortName on " + this + " to null.");
		}
		if (argVeryShortName.length() > 12) {
			throw new com.opal.ArgumentTooLongException("Cannot set myVeryShortName on " + this + " to \"" + argVeryShortName + "\" because that field's maximum length is 12.", argVeryShortName.length(), 12);
		}
		getNewValues()[3] = argVeryShortName;
		return this;
	}

	public synchronized SchoolOpal setLocation(final java.lang.String argLocation) {
		tryMutate();
		if ((argLocation != null) && (argLocation.length() > 256)) {
			throw new com.opal.ArgumentTooLongException("Cannot set myLocation on " + this + " to \"" + argLocation + "\" because that field's maximum length is 256.", argLocation.length(), 256);
		}
		getNewValues()[4] = argLocation;
		return this;
	}

	public synchronized SchoolOpal setNote(final java.lang.String argNote) {
		tryMutate();
		getNewValues()[5] = argNote;
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
		myNewSchoolRegistrationOpalHashSet = null; /* Necessary if it has been rolled back */
		mySchoolRegistrationOpalCachedOperations = null; /* Ditto */
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		/** This Opal has no references to other Opals that need to be copied. */
		if (needsToClearOldCollections()) {
			myOldSchoolRegistrationOpalHashSet = null;
		} else {
			if (myNewSchoolRegistrationOpalHashSet != null) {
				if (myNewSchoolRegistrationOpalHashSet.size() > 0) {
					myOldSchoolRegistrationOpalHashSet = myNewSchoolRegistrationOpalHashSet;
				} else {
					myOldSchoolRegistrationOpalHashSet = java.util.Collections.emptySet();
				}
				myNewSchoolRegistrationOpalHashSet = null;
			} else {
				mySchoolRegistrationOpalCachedOperations = null;
			}
		}
		setClearOldCollections(false);
		return;
	}

	@Override
	protected void unlinkInternal() {
		java.util.Iterator<?> lclI;
		if (myNewSchoolRegistrationOpalHashSet != null || mySchoolRegistrationOpalCachedOperations != null) {
			lclI = createSchoolRegistrationOpalIterator();
			while (lclI.hasNext()) {
				((SchoolRegistrationOpal) lclI.next()).setSchoolOpalInternal(null);
			}
		}
		return;
	}

	@Override
	protected void copyFieldsToInternal(com.opal.UpdatableOpal<School> argTarget) {
		Object[] lclValues = getReadValueSet();
		Object[] lclTargetNewValues = argTarget.getNewValues();
		/* Field 0 (Id) is database generated. */
		/* Field 1 (Name) is part of a unique key. */
		/* Field 2 (ShortName) is part of a unique key. */
		/* Field 3 (VeryShortName) is part of a unique key. */
		lclTargetNewValues[4] = lclValues[4]; /* Location (immutable) */
		lclTargetNewValues[5] = lclValues[5]; /* Note (immutable) */

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
		argOutput.println("Id = " + getIdAsObject());
		argOutput.println("Name = " + getName());
		argOutput.println("ShortName = " + getShortName());
		argOutput.println("VeryShortName = " + getVeryShortName());
		argOutput.println("Location = " + getLocation());
		argOutput.println("Note = " + getNote());
	}

	@Override
	public synchronized void output(final java.io.PrintWriter argOutput) {
		argOutput.println("Id = " + getIdAsObject());
		argOutput.println("Name = " + getName());
		argOutput.println("ShortName = " + getShortName());
		argOutput.println("VeryShortName = " + getVeryShortName());
		argOutput.println("Location = " + getLocation());
		argOutput.println("Note = " + getNote());
	}

	private java.util.Set<SchoolRegistrationOpal> myOldSchoolRegistrationOpalHashSet = null;
	private java.util.Set<SchoolRegistrationOpal> myNewSchoolRegistrationOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<SchoolRegistrationOpal>> mySchoolRegistrationOpalCachedOperations = null;

	/* package */ java.util.Set<SchoolRegistrationOpal> getSchoolRegistrationOpalHashSet() {
		if (tryAccess()) {
			if (myNewSchoolRegistrationOpalHashSet == null) {
				if (myOldSchoolRegistrationOpalHashSet == null) {
					if (isNew()) {
						myOldSchoolRegistrationOpalHashSet = java.util.Collections.emptySet();
					} else {
						java.util.Set<SchoolRegistrationOpal> lclS;
						lclS = OpalFactoryFactory.getInstance().getSchoolRegistrationOpalFactory().forSchoolIdCollection(getIdAsObject());
						myOldSchoolRegistrationOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
					}
				}
				myNewSchoolRegistrationOpalHashSet = new java.util.HashSet<>(myOldSchoolRegistrationOpalHashSet);
				if (mySchoolRegistrationOpalCachedOperations != null) {
					com.opal.OpalUtility.handleCachedOperations(mySchoolRegistrationOpalCachedOperations, myNewSchoolRegistrationOpalHashSet);
					mySchoolRegistrationOpalCachedOperations = null;
				}
			}
			return myNewSchoolRegistrationOpalHashSet;
		} else {
			if (myOldSchoolRegistrationOpalHashSet == null) {
				java.util.Set<SchoolRegistrationOpal> lclS;
				lclS = OpalFactoryFactory.getInstance().getSchoolRegistrationOpalFactory().forSchoolIdCollection(getIdAsObject());
				myOldSchoolRegistrationOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
			}
			return myOldSchoolRegistrationOpalHashSet;
		}
	}

	public synchronized void addSchoolRegistrationOpal(SchoolRegistrationOpal argSchoolRegistrationOpal) {
		tryMutate();
		argSchoolRegistrationOpal.setSchoolOpal(this);
		return;
	}

	protected synchronized void addSchoolRegistrationOpalInternal(SchoolRegistrationOpal argSchoolRegistrationOpal) {
		tryMutate();
		if (myNewSchoolRegistrationOpalHashSet == null) {
			if (myOldSchoolRegistrationOpalHashSet == null) {
				if (mySchoolRegistrationOpalCachedOperations == null) { mySchoolRegistrationOpalCachedOperations = new java.util.ArrayList<>(); }
				mySchoolRegistrationOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.ADD, argSchoolRegistrationOpal));
			} else {
				myNewSchoolRegistrationOpalHashSet = new java.util.HashSet<>(myOldSchoolRegistrationOpalHashSet);
				myNewSchoolRegistrationOpalHashSet.add(argSchoolRegistrationOpal);
			}
		} else {
			myNewSchoolRegistrationOpalHashSet.add(argSchoolRegistrationOpal);
		}
		return;
	}

	public synchronized void removeSchoolRegistrationOpal(SchoolRegistrationOpal argSchoolRegistrationOpal) {
		tryMutate();
		argSchoolRegistrationOpal.setSchoolOpal(null);
	}

	protected synchronized void removeSchoolRegistrationOpalInternal(SchoolRegistrationOpal argSchoolRegistrationOpal) {
		tryMutate();
		if (myNewSchoolRegistrationOpalHashSet == null) {
			if (myOldSchoolRegistrationOpalHashSet == null) {
				if (mySchoolRegistrationOpalCachedOperations == null) { mySchoolRegistrationOpalCachedOperations = new java.util.ArrayList<>(); }
				mySchoolRegistrationOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.REMOVE, argSchoolRegistrationOpal));
			} else {
				myNewSchoolRegistrationOpalHashSet = new java.util.HashSet<>(myOldSchoolRegistrationOpalHashSet);
				myNewSchoolRegistrationOpalHashSet.remove(argSchoolRegistrationOpal);
			}
		} else {
			myNewSchoolRegistrationOpalHashSet.remove(argSchoolRegistrationOpal);
		}
		return;
	}

	public synchronized int getSchoolRegistrationOpalCount() { return getSchoolRegistrationOpalHashSet().size(); }

	public synchronized java.util.Iterator<SchoolRegistrationOpal> createSchoolRegistrationOpalIterator() {
		return getSchoolRegistrationOpalHashSet().iterator();
	}

	public synchronized java.util.stream.Stream<SchoolRegistrationOpal> streamSchoolRegistrationOpal() {
		return getSchoolRegistrationOpalHashSet().stream();
	}

	@Override
	public java.lang.String toString() {
		java.lang.StringBuilder lclSB = new java.lang.StringBuilder(64);
		lclSB.append("SchoolOpal[");
		lclSB.append("myId=");
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
