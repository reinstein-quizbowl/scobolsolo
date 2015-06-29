package com.scobolsolo.persistence;

import java.io.PrintWriter;
import java.io.PrintStream;

import com.opal.*;

import com.scobolsolo.application.*;

@StoreGeneratedPrimaryKey
public final class StaffOpal extends com.opal.UpdatableOpal<Staff> {
	public static final java.lang.Boolean ourDefaultBringingLaptop = java.lang.Boolean.FALSE;

	private StaffOpal() {
		super();
		setUserFacing(null);
	}

	public StaffOpal(OpalFactory<Staff, StaffOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void applyDefaults() {
		getNewValues()[5] = ourDefaultBringingLaptop;
		return;
	}

	@Override
	protected void initializeReferences() {
		myOldContactOpal = ContactOpal.NOT_YET_LOADED;
		myOldSchoolRegistrationOpal = SchoolRegistrationOpal.NOT_YET_LOADED;
		myOldTournamentOpal = TournamentOpal.NOT_YET_LOADED;
		return;
	}

	/* package */ static final String[] ourFieldNames = new String[] {
		"Id",
		"ContactId",
		"TournamentCode",
		"SchoolRegistrationId",
		"Note",
		"BringingLaptop",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.lang.String.class,
		java.lang.Integer.class,
		java.lang.String.class,
		java.lang.Boolean.class,
	};

	/* package */ static final boolean[] ourFieldNullability = new boolean[] {
		false,
		false,
		false,
		true,
		true,
		false,
	};

	/* package */ static final FieldValidator[] ourFieldValidators = new FieldValidator[] {
		null,
		null,
		null,
		null,
		null,
		null,
	};

	public static final StaffOpal NOT_YET_LOADED = new StaffOpal();

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

	public synchronized java.lang.Integer getContactIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[1];
	}

	public synchronized java.lang.String getTournamentCode() {
		return (java.lang.String) getReadValueSet()[2];
	}

	public synchronized java.lang.Integer getSchoolRegistrationIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[3];
	}

	public synchronized java.lang.String getNote() {
		return (java.lang.String) getReadValueSet()[4];
	}

	public synchronized java.lang.Boolean isBringingLaptopAsObject() {
		return (java.lang.Boolean) getReadValueSet()[5];
	}

	public synchronized StaffOpal setId(final java.lang.Integer argId) {
		tryMutate();
		if (argId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myId on " + this + " to null.");
		}
		getNewValues()[0] = argId;
		return this;
	}

	public StaffOpal setId(final int argId) {
		setId(java.lang.Integer.valueOf(argId));
		return this;
	}

	public synchronized StaffOpal setContactId(final java.lang.Integer argContactId) {
		tryMutate();
		if (argContactId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myContactId on " + this + " to null.");
		}
		getNewValues()[1] = argContactId;
		return this;
	}

	public StaffOpal setContactId(final int argContactId) {
		setContactId(java.lang.Integer.valueOf(argContactId));
		return this;
	}

	public synchronized StaffOpal setTournamentCode(final java.lang.String argTournamentCode) {
		tryMutate();
		if (argTournamentCode == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myTournamentCode on " + this + " to null.");
		}
		if (argTournamentCode.length() > 32) {
			throw new com.opal.ArgumentTooLongException("Maximum length of myTournamentCode on " + this + " is 32.", argTournamentCode.length(), 32);
		}
		getNewValues()[2] = argTournamentCode;
		return this;
	}

	public synchronized StaffOpal setSchoolRegistrationId(final java.lang.Integer argSchoolRegistrationId) {
		tryMutate();
		getNewValues()[3] = argSchoolRegistrationId;
		return this;
	}

	public StaffOpal setSchoolRegistrationId(final int argSchoolRegistrationId) {
		setSchoolRegistrationId(java.lang.Integer.valueOf(argSchoolRegistrationId));
		return this;
	}

	public synchronized StaffOpal setNote(final java.lang.String argNote) {
		tryMutate();
		getNewValues()[4] = argNote;
		return this;
	}

	public synchronized StaffOpal setBringingLaptop(final java.lang.Boolean argBringingLaptop) {
		tryMutate();
		if (argBringingLaptop == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myBringingLaptop on " + this + " to null.");
		}
		getNewValues()[5] = argBringingLaptop;
		return this;
	}

	public StaffOpal setBringingLaptop(final boolean argBringingLaptop) {
		setBringingLaptop(argBringingLaptop ? Boolean.TRUE : Boolean.FALSE);
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
		myNewTournamentOpal = myOldTournamentOpal;
		myNewModeratorGameOpalHashSet = null; /* Necessary if it has been rolled back */
		myModeratorGameOpalCachedOperations = null; /* Ditto */
		myNewStaffAssignmentOpalHashSet = null; /* Necessary if it has been rolled back */
		myStaffAssignmentOpalCachedOperations = null; /* Ditto */
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		myOldContactOpal = myNewContactOpal;
		myOldSchoolRegistrationOpal = myNewSchoolRegistrationOpal;
		myOldTournamentOpal = myNewTournamentOpal;

		if (needsToClearOldCollections()) {
			myOldModeratorGameOpalHashSet = null;
			} else {
			if (myNewModeratorGameOpalHashSet != null) {
				myOldModeratorGameOpalHashSet = myNewModeratorGameOpalHashSet;
				myNewModeratorGameOpalHashSet = null;
			} else {
				myModeratorGameOpalCachedOperations = null;
			}
		}
		if (needsToClearOldCollections()) {
			myOldStaffAssignmentOpalHashSet = null;
			} else {
			if (myNewStaffAssignmentOpalHashSet != null) {
				myOldStaffAssignmentOpalHashSet = myNewStaffAssignmentOpalHashSet;
				myNewStaffAssignmentOpalHashSet = null;
			} else {
				myStaffAssignmentOpalCachedOperations = null;
			}
		}
		setClearOldCollections(false);
		return;
	}

	@Override
	protected void unlinkInternal() {
		java.util.Iterator<?> lclI;
		if (myNewModeratorGameOpalHashSet != null || myModeratorGameOpalCachedOperations != null) {
			lclI = createModeratorGameOpalIterator();
			while (lclI.hasNext()) {
				((GameOpal) lclI.next()).setModeratorStaffOpalInternal(null);
			}
		}
		if (myNewStaffAssignmentOpalHashSet != null || myStaffAssignmentOpalCachedOperations != null) {
			lclI = createStaffAssignmentOpalIterator();
			while (lclI.hasNext()) {
				((StaffAssignmentOpal) lclI.next()).setStaffOpalInternal(null);
			}
		}
		if (getContactOpal() != null) {
			getContactOpal().removeStaffOpalInternal(this);
		}
		if (getSchoolRegistrationOpal() != null) {
			getSchoolRegistrationOpal().removeStaffOpalInternal(this);
		}
		if (getTournamentOpal() != null) {
			getTournamentOpal().removeStaffOpalInternal(this);
		}
		return;
	}

	@Override
	protected void copyFieldsToInternal(UpdatableOpal<Staff> argTarget) {
		Object[] lclValues = getReadValueSet();
		Object[] lclTargetNewValues = argTarget.getNewValues();
		/* Field 0 (Id) is database generated. */
		lclTargetNewValues[1] = lclValues[1]; /* ContactId (immutable) */
		lclTargetNewValues[2] = lclValues[2]; /* TournamentCode (immutable) */
		lclTargetNewValues[3] = lclValues[3]; /* SchoolRegistrationId (immutable) */
		lclTargetNewValues[4] = lclValues[4]; /* Note (immutable) */
		lclTargetNewValues[5] = lclValues[5]; /* BringingLaptop (immutable) */

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
		if (myNewTournamentOpal != TournamentOpal.NOT_YET_LOADED) {
			setTournamentCode(myNewTournamentOpal == null ? null : myNewTournamentOpal.getCode());
		}
		return;
	}

	@Override
	public java.util.Set<com.opal.TransactionAware> getRequiredPriorCommits() {
		java.util.Set<com.opal.TransactionAware> lclTAs = null;
		UpdatableOpal<?> lclUO;
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
		java.util.Set<com.opal.TransactionAware> lclTAs = null;
		UpdatableOpal<?> lclUO;
		lclUO = myOldContactOpal;
		if ((lclUO != null) && lclUO.isDeleted()) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		lclUO = myOldSchoolRegistrationOpal;
		if ((lclUO != null) && lclUO.isDeleted()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		lclUO = myOldTournamentOpal;
		if ((lclUO != null) && lclUO.isDeleted()) {
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
		argPW.println("ContactId = " + getContactIdAsObject());
		argPW.println("TournamentCode = " + getTournamentCode());
		argPW.println("SchoolRegistrationId = " + getSchoolRegistrationIdAsObject());
		argPW.println("Note = " + getNote());
		argPW.println("BringingLaptop = " + isBringingLaptopAsObject());
	}

	@Override
	public synchronized void output(final PrintStream argPS) {
		argPS.println("Id = " + getIdAsObject());
		argPS.println("ContactId = " + getContactIdAsObject());
		argPS.println("TournamentCode = " + getTournamentCode());
		argPS.println("SchoolRegistrationId = " + getSchoolRegistrationIdAsObject());
		argPS.println("Note = " + getNote());
		argPS.println("BringingLaptop = " + isBringingLaptopAsObject());
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

	public synchronized StaffOpal setContactOpal(ContactOpal argContactOpal) {
		tryMutate();
		ContactOpal lclContactOpal = getContactOpal();
		if (lclContactOpal == argContactOpal) { return this; }
		if (lclContactOpal != null) {
			lclContactOpal.removeStaffOpalInternal(this);
		}
		myNewContactOpal = argContactOpal;
		if (argContactOpal != null) {
			argContactOpal.addStaffOpalInternal(this);
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
		if ((argValueSet[3] == null)) {
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

	public synchronized StaffOpal setSchoolRegistrationOpal(SchoolRegistrationOpal argSchoolRegistrationOpal) {
		tryMutate();
		SchoolRegistrationOpal lclSchoolRegistrationOpal = getSchoolRegistrationOpal();
		if (lclSchoolRegistrationOpal == argSchoolRegistrationOpal) { return this; }
		if (lclSchoolRegistrationOpal != null) {
			lclSchoolRegistrationOpal.removeStaffOpalInternal(this);
		}
		myNewSchoolRegistrationOpal = argSchoolRegistrationOpal;
		if (argSchoolRegistrationOpal != null) {
			argSchoolRegistrationOpal.addStaffOpalInternal(this);
		}
		return this;
	}

	protected synchronized void setSchoolRegistrationOpalInternal(SchoolRegistrationOpal argSchoolRegistrationOpal) {
		tryMutate();
		myNewSchoolRegistrationOpal = argSchoolRegistrationOpal;
	}

	private TournamentOpal myOldTournamentOpal;
	private TournamentOpal myNewTournamentOpal;

	protected TournamentOpal retrieveTournamentOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[2] == null)) {
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

	public synchronized StaffOpal setTournamentOpal(TournamentOpal argTournamentOpal) {
		tryMutate();
		TournamentOpal lclTournamentOpal = getTournamentOpal();
		if (lclTournamentOpal == argTournamentOpal) { return this; }
		if (lclTournamentOpal != null) {
			lclTournamentOpal.removeStaffOpalInternal(this);
		}
		myNewTournamentOpal = argTournamentOpal;
		if (argTournamentOpal != null) {
			argTournamentOpal.addStaffOpalInternal(this);
		}
		return this;
	}

	protected synchronized void setTournamentOpalInternal(TournamentOpal argTournamentOpal) {
		tryMutate();
		myNewTournamentOpal = argTournamentOpal;
	}

	private java.util.HashSet<GameOpal> myOldModeratorGameOpalHashSet = null;
	private java.util.HashSet<GameOpal> myNewModeratorGameOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<GameOpal>> myModeratorGameOpalCachedOperations = null;

	/* package */ java.util.HashSet<GameOpal> getModeratorGameOpalHashSet() {
		if (tryAccess()) {
			if (myNewModeratorGameOpalHashSet == null) {
				if (myOldModeratorGameOpalHashSet == null) {
					if (isNew()) {
						myOldModeratorGameOpalHashSet = new java.util.HashSet<>();
					} else {
						myOldModeratorGameOpalHashSet = OpalFactoryFactory.getInstance().getGameOpalFactory().forModeratorStaffIdCollection(getIdAsObject());
					}
				}
				myNewModeratorGameOpalHashSet = new java.util.HashSet<>(myOldModeratorGameOpalHashSet);
				if (myModeratorGameOpalCachedOperations != null) {
					OpalUtility.handleCachedOperations(myModeratorGameOpalCachedOperations, myNewModeratorGameOpalHashSet);
					myModeratorGameOpalCachedOperations = null;
				}
			}
			return myNewModeratorGameOpalHashSet;
		} else {
			if (myOldModeratorGameOpalHashSet == null) {
				myOldModeratorGameOpalHashSet = OpalFactoryFactory.getInstance().getGameOpalFactory().forModeratorStaffIdCollection(getIdAsObject());
			}
			return myOldModeratorGameOpalHashSet;
		}
	}

	public synchronized void addModeratorGameOpal(GameOpal argGameOpal) {
		tryMutate();
		argGameOpal.setModeratorStaffOpal(this);
		return;
	}

	protected synchronized void addModeratorGameOpalInternal(GameOpal argGameOpal) {
		tryMutate();
		if (myNewModeratorGameOpalHashSet == null) {
			if (myOldModeratorGameOpalHashSet == null) {
				if (myModeratorGameOpalCachedOperations == null) { myModeratorGameOpalCachedOperations = new java.util.ArrayList<>(); }
				myModeratorGameOpalCachedOperations.add(new CachedOperation<>(CachedOperation.ADD, argGameOpal));
			} else {
				myNewModeratorGameOpalHashSet = new java.util.HashSet<>(myOldModeratorGameOpalHashSet);
				myNewModeratorGameOpalHashSet.add(argGameOpal);
			}
		} else {
			myNewModeratorGameOpalHashSet.add(argGameOpal);
		}
		return;
	}

	public synchronized void removeModeratorGameOpal(GameOpal argGameOpal) {
		tryMutate();
		argGameOpal.setModeratorStaffOpal(null);
	}

	protected synchronized void removeModeratorGameOpalInternal(GameOpal argGameOpal) {
		tryMutate();
		if (myNewModeratorGameOpalHashSet == null) {
			if (myOldModeratorGameOpalHashSet == null) {
				if (myModeratorGameOpalCachedOperations == null) { myModeratorGameOpalCachedOperations = new java.util.ArrayList<>(); }
				myModeratorGameOpalCachedOperations.add(new CachedOperation<>(CachedOperation.REMOVE, argGameOpal));
			} else {
				myNewModeratorGameOpalHashSet = new java.util.HashSet<>(myOldModeratorGameOpalHashSet);
				myNewModeratorGameOpalHashSet.remove(argGameOpal);
			}
		} else {
			myNewModeratorGameOpalHashSet.remove(argGameOpal);
		}
		return;
	}

	public synchronized int getModeratorGameOpalCount() { return getModeratorGameOpalHashSet().size(); }

	public synchronized java.util.Iterator<GameOpal> createModeratorGameOpalIterator() {
		return getModeratorGameOpalHashSet().iterator();
	}

	public synchronized java.util.stream.Stream<GameOpal> streamModeratorGameOpal() {
		return getModeratorGameOpalHashSet().stream();
	}

	public synchronized void clearModeratorGameOpalInternal() { getModeratorGameOpalHashSet().clear(); }

	private java.util.HashSet<StaffAssignmentOpal> myOldStaffAssignmentOpalHashSet = null;
	private java.util.HashSet<StaffAssignmentOpal> myNewStaffAssignmentOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<StaffAssignmentOpal>> myStaffAssignmentOpalCachedOperations = null;

	/* package */ java.util.HashSet<StaffAssignmentOpal> getStaffAssignmentOpalHashSet() {
		if (tryAccess()) {
			if (myNewStaffAssignmentOpalHashSet == null) {
				if (myOldStaffAssignmentOpalHashSet == null) {
					if (isNew()) {
						myOldStaffAssignmentOpalHashSet = new java.util.HashSet<>();
					} else {
						myOldStaffAssignmentOpalHashSet = OpalFactoryFactory.getInstance().getStaffAssignmentOpalFactory().forStaffIdCollection(getIdAsObject());
					}
				}
				myNewStaffAssignmentOpalHashSet = new java.util.HashSet<>(myOldStaffAssignmentOpalHashSet);
				if (myStaffAssignmentOpalCachedOperations != null) {
					OpalUtility.handleCachedOperations(myStaffAssignmentOpalCachedOperations, myNewStaffAssignmentOpalHashSet);
					myStaffAssignmentOpalCachedOperations = null;
				}
			}
			return myNewStaffAssignmentOpalHashSet;
		} else {
			if (myOldStaffAssignmentOpalHashSet == null) {
				myOldStaffAssignmentOpalHashSet = OpalFactoryFactory.getInstance().getStaffAssignmentOpalFactory().forStaffIdCollection(getIdAsObject());
			}
			return myOldStaffAssignmentOpalHashSet;
		}
	}

	public synchronized void addStaffAssignmentOpal(StaffAssignmentOpal argStaffAssignmentOpal) {
		tryMutate();
		argStaffAssignmentOpal.setStaffOpal(this);
		return;
	}

	protected synchronized void addStaffAssignmentOpalInternal(StaffAssignmentOpal argStaffAssignmentOpal) {
		tryMutate();
		if (myNewStaffAssignmentOpalHashSet == null) {
			if (myOldStaffAssignmentOpalHashSet == null) {
				if (myStaffAssignmentOpalCachedOperations == null) { myStaffAssignmentOpalCachedOperations = new java.util.ArrayList<>(); }
				myStaffAssignmentOpalCachedOperations.add(new CachedOperation<>(CachedOperation.ADD, argStaffAssignmentOpal));
			} else {
				myNewStaffAssignmentOpalHashSet = new java.util.HashSet<>(myOldStaffAssignmentOpalHashSet);
				myNewStaffAssignmentOpalHashSet.add(argStaffAssignmentOpal);
			}
		} else {
			myNewStaffAssignmentOpalHashSet.add(argStaffAssignmentOpal);
		}
		return;
	}

	public synchronized void removeStaffAssignmentOpal(StaffAssignmentOpal argStaffAssignmentOpal) {
		tryMutate();
		argStaffAssignmentOpal.setStaffOpal(null);
	}

	protected synchronized void removeStaffAssignmentOpalInternal(StaffAssignmentOpal argStaffAssignmentOpal) {
		tryMutate();
		if (myNewStaffAssignmentOpalHashSet == null) {
			if (myOldStaffAssignmentOpalHashSet == null) {
				if (myStaffAssignmentOpalCachedOperations == null) { myStaffAssignmentOpalCachedOperations = new java.util.ArrayList<>(); }
				myStaffAssignmentOpalCachedOperations.add(new CachedOperation<>(CachedOperation.REMOVE, argStaffAssignmentOpal));
			} else {
				myNewStaffAssignmentOpalHashSet = new java.util.HashSet<>(myOldStaffAssignmentOpalHashSet);
				myNewStaffAssignmentOpalHashSet.remove(argStaffAssignmentOpal);
			}
		} else {
			myNewStaffAssignmentOpalHashSet.remove(argStaffAssignmentOpal);
		}
		return;
	}

	public synchronized int getStaffAssignmentOpalCount() { return getStaffAssignmentOpalHashSet().size(); }

	public synchronized java.util.Iterator<StaffAssignmentOpal> createStaffAssignmentOpalIterator() {
		return getStaffAssignmentOpalHashSet().iterator();
	}

	public synchronized java.util.stream.Stream<StaffAssignmentOpal> streamStaffAssignmentOpal() {
		return getStaffAssignmentOpalHashSet().stream();
	}

	public synchronized void clearStaffAssignmentOpalInternal() { getStaffAssignmentOpalHashSet().clear(); }

	@Override
	public String toString() {
		StringBuilder lclSB =  new StringBuilder(64);
		lclSB.append("StaffOpal[");
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
