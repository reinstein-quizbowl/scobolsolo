package com.scobolsolo.persistence;

import java.io.PrintWriter;
import java.io.PrintStream;

import com.opal.*;

import com.scobolsolo.application.*;

@StoreGeneratedPrimaryKey
public final class SchoolOpal extends com.opal.UpdatableOpal<School> {

	private SchoolOpal() {
		super();
		setUserFacing(null);
	}

	public SchoolOpal(OpalFactory<School, SchoolOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
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

	/* package */ static final FieldValidator[] ourFieldValidators = new FieldValidator[] {
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
	public FieldValidator[] getFieldValidators() { return ourFieldValidators; }

	@Override
	public boolean[] getFieldNullability() { return ourFieldNullability; }

	public static FieldValidator[] getStaticFieldValidators() { return ourFieldValidators; }


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

	public synchronized void setId(final java.lang.Integer argId) {
		tryMutate();
		if (argId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myId on " + this + " to null.");
		}
		getNewValues()[0] = argId;
		return;
	}

	public void setId(final int argId) {
		setId(java.lang.Integer.valueOf(argId));
		return;
	}

	public synchronized void setName(final java.lang.String argName) {
		tryMutate();
		if (argName == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myName on " + this + " to null.");
		}
		if (argName.length() > 256) {
			throw new com.opal.ArgumentTooLongException("Maximum length of myName on " + this + " is 256.", argName.length(), 256);
		}
		getNewValues()[1] = argName;
		return;
	}

	public synchronized void setShortName(final java.lang.String argShortName) {
		tryMutate();
		if (argShortName == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myShortName on " + this + " to null.");
		}
		if (argShortName.length() > 32) {
			throw new com.opal.ArgumentTooLongException("Maximum length of myShortName on " + this + " is 32.", argShortName.length(), 32);
		}
		getNewValues()[2] = argShortName;
		return;
	}

	public synchronized void setVeryShortName(final java.lang.String argVeryShortName) {
		tryMutate();
		if (argVeryShortName == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myVeryShortName on " + this + " to null.");
		}
		if (argVeryShortName.length() > 12) {
			throw new com.opal.ArgumentTooLongException("Maximum length of myVeryShortName on " + this + " is 12.", argVeryShortName.length(), 12);
		}
		getNewValues()[3] = argVeryShortName;
		return;
	}

	public synchronized void setLocation(final java.lang.String argLocation) {
		tryMutate();
		if ((argLocation != null) && (argLocation.length() > 256)) {
			throw new com.opal.ArgumentTooLongException("Maximum length of myLocation on " + this + " is 256.", argLocation.length(), 256);
		}
		getNewValues()[4] = argLocation;
		return;
	}

	public synchronized void setNote(final java.lang.String argNote) {
		tryMutate();
		getNewValues()[5] = argNote;
		return;
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
		myNewSchoolRegistrationOpalFast3Set = null; /* Necessary if it has been rolled back */
		mySchoolRegistrationOpalCachedOperations = null; /* Ditto */
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		/** This Opal has no references to other Opals that need to be copied. */
		if (needsToClearOldCollections()) {
			myOldSchoolRegistrationOpalFast3Set = null;
			} else {
			if (myNewSchoolRegistrationOpalFast3Set != null) {
				myOldSchoolRegistrationOpalFast3Set = myNewSchoolRegistrationOpalFast3Set;
				myNewSchoolRegistrationOpalFast3Set = null;
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
		if (myNewSchoolRegistrationOpalFast3Set != null || mySchoolRegistrationOpalCachedOperations != null) {
			lclI = createSchoolRegistrationOpalIterator();
			while (lclI.hasNext()) {
				((SchoolRegistrationOpal) lclI.next()).setSchoolOpalInternal(null);
			}
		}
		return;
	}

	@Override
	protected void copyFieldsToInternal(UpdatableOpal<School> argTarget) {
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
		argPW.println("Name = " + getName());
		argPW.println("ShortName = " + getShortName());
		argPW.println("VeryShortName = " + getVeryShortName());
		argPW.println("Location = " + getLocation());
		argPW.println("Note = " + getNote());
	}

	@Override
	public synchronized void output(final PrintStream argPS) {
		argPS.println("Id = " + getIdAsObject());
		argPS.println("Name = " + getName());
		argPS.println("ShortName = " + getShortName());
		argPS.println("VeryShortName = " + getVeryShortName());
		argPS.println("Location = " + getLocation());
		argPS.println("Note = " + getNote());
	}

	private com.siliconage.util.Fast3Set<SchoolRegistrationOpal> myOldSchoolRegistrationOpalFast3Set = null;
	private com.siliconage.util.Fast3Set<SchoolRegistrationOpal> myNewSchoolRegistrationOpalFast3Set = null;
	private java.util.ArrayList<CachedOperation<SchoolRegistrationOpal>> mySchoolRegistrationOpalCachedOperations = null;

	/* package */ com.siliconage.util.Fast3Set<SchoolRegistrationOpal> getSchoolRegistrationOpalClass() {
		if (tryAccess()) {
			if (myNewSchoolRegistrationOpalFast3Set == null) {
				if (myOldSchoolRegistrationOpalFast3Set == null) {
					myOldSchoolRegistrationOpalFast3Set = OpalFactoryFactory.getInstance().getSchoolRegistrationOpalFactory().forSchoolIdCollection(getIdAsObject());
				}
				myNewSchoolRegistrationOpalFast3Set = new com.siliconage.util.Fast3Set<>(myOldSchoolRegistrationOpalFast3Set);
				if (mySchoolRegistrationOpalCachedOperations != null) {
					OpalUtility.handleCachedOperations(mySchoolRegistrationOpalCachedOperations, myNewSchoolRegistrationOpalFast3Set);
					mySchoolRegistrationOpalCachedOperations = null;
				}
			}
			return myNewSchoolRegistrationOpalFast3Set;
		}
		if (myOldSchoolRegistrationOpalFast3Set == null) {
			myOldSchoolRegistrationOpalFast3Set = OpalFactoryFactory.getInstance().getSchoolRegistrationOpalFactory().forSchoolIdCollection(getIdAsObject());
		}
		return myOldSchoolRegistrationOpalFast3Set;
	}

	public synchronized void addSchoolRegistrationOpal(SchoolRegistrationOpal argSchoolRegistrationOpal) {
		tryMutate();
		argSchoolRegistrationOpal.setSchoolOpal(this);
		return;
	}

	protected synchronized void addSchoolRegistrationOpalInternal(SchoolRegistrationOpal argSchoolRegistrationOpal) {
		tryMutate();
		if (myNewSchoolRegistrationOpalFast3Set == null) {
			if (myOldSchoolRegistrationOpalFast3Set == null) {
				if (mySchoolRegistrationOpalCachedOperations == null) { mySchoolRegistrationOpalCachedOperations = new java.util.ArrayList<>(); }
				mySchoolRegistrationOpalCachedOperations.add(new CachedOperation<>(CachedOperation.ADD, argSchoolRegistrationOpal));
			} else {
				myNewSchoolRegistrationOpalFast3Set = new com.siliconage.util.Fast3Set<>(myOldSchoolRegistrationOpalFast3Set);
				myNewSchoolRegistrationOpalFast3Set.add(argSchoolRegistrationOpal);
			}
		} else {
			myNewSchoolRegistrationOpalFast3Set.add(argSchoolRegistrationOpal);
		}
		return;
	}

	public synchronized void removeSchoolRegistrationOpal(SchoolRegistrationOpal argSchoolRegistrationOpal) {
		tryMutate();
		argSchoolRegistrationOpal.setSchoolOpal(null);
	}

	protected synchronized void removeSchoolRegistrationOpalInternal(SchoolRegistrationOpal argSchoolRegistrationOpal) {
		tryMutate();
		if (myNewSchoolRegistrationOpalFast3Set == null) {
			if (myOldSchoolRegistrationOpalFast3Set == null) {
				if (mySchoolRegistrationOpalCachedOperations == null) { mySchoolRegistrationOpalCachedOperations = new java.util.ArrayList<>(); }
				mySchoolRegistrationOpalCachedOperations.add(new CachedOperation<>(CachedOperation.REMOVE, argSchoolRegistrationOpal));
			} else {
				myNewSchoolRegistrationOpalFast3Set = new com.siliconage.util.Fast3Set<>(myOldSchoolRegistrationOpalFast3Set);
				myNewSchoolRegistrationOpalFast3Set.remove(argSchoolRegistrationOpal);
			}
		} else {
			myNewSchoolRegistrationOpalFast3Set.remove(argSchoolRegistrationOpal);
		}
		return;
	}

	public synchronized int getSchoolRegistrationOpalCount() { return getSchoolRegistrationOpalClass().size(); }

	public synchronized java.util.Iterator<SchoolRegistrationOpal> createSchoolRegistrationOpalIterator() {
		return getSchoolRegistrationOpalClass().iterator();
	}

	public synchronized java.util.stream.Stream<SchoolRegistrationOpal> streamSchoolRegistrationOpal() {
		return getSchoolRegistrationOpalClass().stream();
	}

	public synchronized void clearSchoolRegistrationOpalInternal() { getSchoolRegistrationOpalClass().clear(); }

	@Override
	public String toString() {
		StringBuilder lclSB =  new StringBuilder(64);
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
