package com.scobolsolo.persistence;

import com.scobolsolo.application.Contact;

@com.opal.StoreGeneratedPrimaryKey
public final class ContactOpal extends com.opal.UpdatableOpal<Contact> {

	public static final java.lang.Boolean ourDefaultActive = java.lang.Boolean.TRUE;

	private ContactOpal() {
		super();
		setUserFacing(null);
	}

	public ContactOpal(com.opal.IdentityOpalFactory<Contact, ContactOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void applyDefaults() {
		/* Initialize fields with their default values. */
		getNewValues()[7] = ourDefaultActive;


		/* Initialize the back Collections to empty sets. */

		myTournamentDirectorTournamentSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
				this,
				ourTournamentDirectorTournamentOpalLoader,
				true
				);
		myPlayerSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
				this,
				ourPlayerOpalLoader,
				true
				);
		myMainSchoolRegistrationSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
				this,
				ourMainSchoolRegistrationOpalLoader,
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
		myOldAccountOpal = AccountOpal.NOT_YET_LOADED;
		return;
	}

	/* package */ static final String[] ourFieldNames = new String[] {
		"Id",
		"EmailAddress",
		"AdvancePhone",
		"DayOfPhone",
		"Note",
		"Name",
		"SortBy",
		"Active",
		"Address",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.Integer.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.Boolean.class,
		java.lang.String.class,
	};

	/* package */ static final boolean[] ourFieldNullability = new boolean[] {
		false,
		true,
		true,
		true,
		true,
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
		null,
		null,
		null,
		null,
	};

	public static final ContactOpal NOT_YET_LOADED = new ContactOpal();

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

	public synchronized java.lang.String getEmailAddress() {
		return (java.lang.String) getReadValueSet()[1];
	}

	public synchronized java.lang.String getAdvancePhone() {
		return (java.lang.String) getReadValueSet()[2];
	}

	public synchronized java.lang.String getDayOfPhone() {
		return (java.lang.String) getReadValueSet()[3];
	}

	public synchronized java.lang.String getNote() {
		return (java.lang.String) getReadValueSet()[4];
	}

	public synchronized java.lang.String getName() {
		return (java.lang.String) getReadValueSet()[5];
	}

	public synchronized java.lang.String getSortBy() {
		return (java.lang.String) getReadValueSet()[6];
	}

	public synchronized java.lang.Boolean isActiveAsObject() {
		return (java.lang.Boolean) getReadValueSet()[7];
	}

	public synchronized java.lang.String getAddress() {
		return (java.lang.String) getReadValueSet()[8];
	}

	public synchronized ContactOpal setId(final java.lang.Integer argId) {
		tryMutate();
		if (argId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myId on " + this + " to null.");
		}
		getNewValues()[0] = argId;
		return this;
	}

	public ContactOpal setId(final int argId) {
		setId(java.lang.Integer.valueOf(argId));
		return this;
	}

	public synchronized ContactOpal setEmailAddress(final java.lang.String argEmailAddress) {
		tryMutate();
		if ((argEmailAddress != null) && (argEmailAddress.length() > 256)) {
			throw new com.opal.ArgumentTooLongException("Cannot set myEmailAddress on " + this + " to \"" + argEmailAddress + "\" because that field's maximum length is 256.", argEmailAddress.length(), 256);
		}
		getNewValues()[1] = argEmailAddress;
		return this;
	}

	public synchronized ContactOpal setAdvancePhone(final java.lang.String argAdvancePhone) {
		tryMutate();
		if ((argAdvancePhone != null) && (argAdvancePhone.length() > 32)) {
			throw new com.opal.ArgumentTooLongException("Cannot set myAdvancePhone on " + this + " to \"" + argAdvancePhone + "\" because that field's maximum length is 32.", argAdvancePhone.length(), 32);
		}
		getNewValues()[2] = argAdvancePhone;
		return this;
	}

	public synchronized ContactOpal setDayOfPhone(final java.lang.String argDayOfPhone) {
		tryMutate();
		if ((argDayOfPhone != null) && (argDayOfPhone.length() > 32)) {
			throw new com.opal.ArgumentTooLongException("Cannot set myDayOfPhone on " + this + " to \"" + argDayOfPhone + "\" because that field's maximum length is 32.", argDayOfPhone.length(), 32);
		}
		getNewValues()[3] = argDayOfPhone;
		return this;
	}

	public synchronized ContactOpal setNote(final java.lang.String argNote) {
		tryMutate();
		getNewValues()[4] = argNote;
		return this;
	}

	public synchronized ContactOpal setName(final java.lang.String argName) {
		tryMutate();
		if (argName == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myName on " + this + " to null.");
		}
		if (argName.length() > 256) {
			throw new com.opal.ArgumentTooLongException("Cannot set myName on " + this + " to \"" + argName + "\" because that field's maximum length is 256.", argName.length(), 256);
		}
		getNewValues()[5] = argName;
		return this;
	}

	public synchronized ContactOpal setSortBy(final java.lang.String argSortBy) {
		tryMutate();
		if (argSortBy == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set mySortBy on " + this + " to null.");
		}
		if (argSortBy.length() > 256) {
			throw new com.opal.ArgumentTooLongException("Cannot set mySortBy on " + this + " to \"" + argSortBy + "\" because that field's maximum length is 256.", argSortBy.length(), 256);
		}
		getNewValues()[6] = argSortBy;
		return this;
	}

	public synchronized ContactOpal setActive(final java.lang.Boolean argActive) {
		tryMutate();
		if (argActive == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myActive on " + this + " to null.");
		}
		getNewValues()[7] = argActive;
		return this;
	}

	public ContactOpal setActive(final boolean argActive) {
		setActive(argActive ? Boolean.TRUE : Boolean.FALSE);
		return this;
	}

	public synchronized ContactOpal setAddress(final java.lang.String argAddress) {
		tryMutate();
		getNewValues()[8] = argAddress;
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
		myNewAccountOpal = myOldAccountOpal;
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		/** This Opal has no references to other Opals that need to be copied. */
		myOldAccountOpal = myNewAccountOpal;
		return;
	}

	@Override
	protected void unlinkInternal() {
		getTournamentDirectorTournamentOpalSet().clear();
		getPlayerOpalSet().clear();
		getMainSchoolRegistrationOpalSet().clear();
		getStaffOpalSet().clear();
		if (getAccountOpal() != null) {
			getAccountOpal().setContactOpalInternal(null);
		}
		return;
	}

	@Override
	protected void copyFieldsToInternal(com.opal.UpdatableOpal<Contact> argTarget) {
		Object[] lclValues = getReadValueSet();
		Object[] lclTargetNewValues = argTarget.getNewValues();
		/* Field 0 (Id) is database generated. */
		lclTargetNewValues[1] = lclValues[1]; /* EmailAddress (immutable) */
		lclTargetNewValues[2] = lclValues[2]; /* AdvancePhone (immutable) */
		lclTargetNewValues[3] = lclValues[3]; /* DayOfPhone (immutable) */
		lclTargetNewValues[4] = lclValues[4]; /* Note (immutable) */
		lclTargetNewValues[5] = lclValues[5]; /* Name (immutable) */
		lclTargetNewValues[6] = lclValues[6]; /* SortBy (immutable) */
		lclTargetNewValues[7] = lclValues[7]; /* Active (immutable) */
		lclTargetNewValues[8] = lclValues[8]; /* Address (immutable) */

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
		argOutput.println("EmailAddress = " + getEmailAddress());
		argOutput.println("AdvancePhone = " + getAdvancePhone());
		argOutput.println("DayOfPhone = " + getDayOfPhone());
		argOutput.println("Note = " + getNote());
		argOutput.println("Name = " + getName());
		argOutput.println("SortBy = " + getSortBy());
		argOutput.println("Active = " + isActiveAsObject());
		argOutput.println("Address = " + getAddress());
	}

	@Override
	public synchronized void output(final java.io.PrintWriter argOutput) {
		argOutput.println("Id = " + getIdAsObject());
		argOutput.println("EmailAddress = " + getEmailAddress());
		argOutput.println("AdvancePhone = " + getAdvancePhone());
		argOutput.println("DayOfPhone = " + getDayOfPhone());
		argOutput.println("Note = " + getNote());
		argOutput.println("Name = " + getName());
		argOutput.println("SortBy = " + getSortBy());
		argOutput.println("Active = " + isActiveAsObject());
		argOutput.println("Address = " + getAddress());
	}

	private AccountOpal myOldAccountOpal;
	private AccountOpal myNewAccountOpal;

	protected AccountOpal retrieveAccountOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[0] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getAccountOpalFactory().forId(getIdAsObject());
	}

	public synchronized AccountOpal getAccountOpal() {
		AccountOpal lclAccountOpal;
		boolean lclAccess = tryAccess();
		lclAccountOpal = lclAccess ? myNewAccountOpal : myOldAccountOpal;
		if (lclAccountOpal == AccountOpal.NOT_YET_LOADED) {
			lclAccountOpal = retrieveAccountOpal(getReadValueSet());
			if (lclAccess) {
				myNewAccountOpal = lclAccountOpal;
			} else {
				myOldAccountOpal = lclAccountOpal;
			}
		}
		return lclAccountOpal;
	}

	public synchronized ContactOpal setAccountOpal(AccountOpal argAccountOpal) {
		tryMutate();
		myNewAccountOpal = argAccountOpal;
		if (argAccountOpal != null) {
			argAccountOpal.setContactOpalInternal(this);
		}
		return this;
	}

	public synchronized void setAccountOpalInternal(AccountOpal argAccountOpal) {
		tryMutate();
		myNewAccountOpal = argAccountOpal;
	}

	private com.opal.types.OpalBackCollectionSet<TournamentOpal, ContactOpal> myTournamentDirectorTournamentSet = null;

	private static final com.opal.types.OpalBackCollectionLoader<TournamentOpal, ContactOpal> ourTournamentDirectorTournamentOpalLoader = 
			new com.opal.types.OpalBackCollectionLoader<>(
					OpalFactoryFactory.getInstance().getTournamentOpalFactory()::forTournamentDirectorContactOpalCollection,
					OpalFactoryFactory.getInstance().getTournamentOpalFactory()::forTournamentDirectorContactOpalCount,
					TournamentOpal::setTournamentDirectorContactOpal,
					TournamentOpal::setTournamentDirectorContactOpalInternal,
					TournamentOpal::getTournamentDirectorContactOpal,
					com.scobolsolo.application.FactoryMap.getNoArgCtorSetCreator(),
					com.scobolsolo.application.FactoryMap.getCollectionArgSetCreator(),
					false
					);

	/* package */ synchronized com.opal.types.OpalBackCollectionSet<TournamentOpal, ContactOpal> getTournamentDirectorTournamentOpalSet() {
		if (myTournamentDirectorTournamentSet == null) {
			myTournamentDirectorTournamentSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
					this,
					ourTournamentDirectorTournamentOpalLoader,
					isNew()
					);
		}
		return myTournamentDirectorTournamentSet;
	}

	private com.opal.types.OpalBackCollectionSet<PlayerOpal, ContactOpal> myPlayerSet = null;

	private static final com.opal.types.OpalBackCollectionLoader<PlayerOpal, ContactOpal> ourPlayerOpalLoader = 
			new com.opal.types.OpalBackCollectionLoader<>(
					OpalFactoryFactory.getInstance().getPlayerOpalFactory()::forContactOpalCollection,
					OpalFactoryFactory.getInstance().getPlayerOpalFactory()::forContactOpalCount,
					PlayerOpal::setContactOpal,
					PlayerOpal::setContactOpalInternal,
					PlayerOpal::getContactOpal,
					com.scobolsolo.application.FactoryMap.getNoArgCtorSetCreator(),
					com.scobolsolo.application.FactoryMap.getCollectionArgSetCreator(),
					false
					);

	/* package */ synchronized com.opal.types.OpalBackCollectionSet<PlayerOpal, ContactOpal> getPlayerOpalSet() {
		if (myPlayerSet == null) {
			myPlayerSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
					this,
					ourPlayerOpalLoader,
					isNew()
					);
		}
		return myPlayerSet;
	}

	private com.opal.types.OpalBackCollectionSet<SchoolRegistrationOpal, ContactOpal> myMainSchoolRegistrationSet = null;

	private static final com.opal.types.OpalBackCollectionLoader<SchoolRegistrationOpal, ContactOpal> ourMainSchoolRegistrationOpalLoader = 
			new com.opal.types.OpalBackCollectionLoader<>(
					OpalFactoryFactory.getInstance().getSchoolRegistrationOpalFactory()::forMainContactOpalCollection,
					OpalFactoryFactory.getInstance().getSchoolRegistrationOpalFactory()::forMainContactOpalCount,
					SchoolRegistrationOpal::setMainContactOpal,
					SchoolRegistrationOpal::setMainContactOpalInternal,
					SchoolRegistrationOpal::getMainContactOpal,
					com.scobolsolo.application.FactoryMap.getNoArgCtorSetCreator(),
					com.scobolsolo.application.FactoryMap.getCollectionArgSetCreator(),
					false
					);

	/* package */ synchronized com.opal.types.OpalBackCollectionSet<SchoolRegistrationOpal, ContactOpal> getMainSchoolRegistrationOpalSet() {
		if (myMainSchoolRegistrationSet == null) {
			myMainSchoolRegistrationSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
					this,
					ourMainSchoolRegistrationOpalLoader,
					isNew()
					);
		}
		return myMainSchoolRegistrationSet;
	}

	private com.opal.types.OpalBackCollectionSet<StaffOpal, ContactOpal> myStaffSet = null;

	private static final com.opal.types.OpalBackCollectionLoader<StaffOpal, ContactOpal> ourStaffOpalLoader = 
			new com.opal.types.OpalBackCollectionLoader<>(
					OpalFactoryFactory.getInstance().getStaffOpalFactory()::forContactOpalCollection,
					OpalFactoryFactory.getInstance().getStaffOpalFactory()::forContactOpalCount,
					StaffOpal::setContactOpal,
					StaffOpal::setContactOpalInternal,
					StaffOpal::getContactOpal,
					com.scobolsolo.application.FactoryMap.getNoArgCtorSetCreator(),
					com.scobolsolo.application.FactoryMap.getCollectionArgSetCreator(),
					false
					);

	/* package */ synchronized com.opal.types.OpalBackCollectionSet<StaffOpal, ContactOpal> getStaffOpalSet() {
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
		lclSB.append("ContactOpal[");
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
