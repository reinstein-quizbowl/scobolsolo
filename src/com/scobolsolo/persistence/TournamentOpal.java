package com.scobolsolo.persistence;

import java.io.PrintWriter;
import java.io.PrintStream;

import com.opal.*;

import com.scobolsolo.application.*;

public final class TournamentOpal extends com.opal.UpdatableOpal<Tournament> {
	public static final java.lang.Boolean ourDefaultTiebreakerSuddenDeath = java.lang.Boolean.TRUE;
	public static final java.lang.Boolean ourDefaultQuestionsComplete = java.lang.Boolean.FALSE;

	private TournamentOpal() {
		super();
		setUserFacing(null);
	}

	public TournamentOpal(OpalFactory<Tournament, TournamentOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void applyDefaults() {
		getNewValues()[5] = ourDefaultTiebreakerSuddenDeath;
		getNewValues()[15] = ourDefaultQuestionsComplete;
		return;
	}

	@Override
	protected void initializeReferences() {
		myOldControlRoomOpal = RoomOpal.NOT_YET_LOADED;
		myOldTournamentDirectorContactOpal = ContactOpal.NOT_YET_LOADED;
		return;
	}

	/* package */ static final String[] ourFieldNames = new String[] {
		"Date",
		"Name",
		"ShortName",
		"Code",
		"WebXmlRoleCode",
		"TiebreakerSuddenDeath",
		"Url",
		"TournamentDirectorContactId",
		"PlayerMessage",
		"StaffMessage",
		"ReplacementQuestionSocialMediaPolicy",
		"SchoolMessage",
		"ControlRoomRoomId",
		"ChampionshipRules",
		"ChampionshipMatchUrl",
		"QuestionsComplete",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.time.LocalDate.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.Boolean.class,
		java.lang.String.class,
		java.lang.Integer.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.Integer.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.Boolean.class,
	};

	/* package */ static final boolean[] ourFieldNullability = new boolean[] {
		false,
		false,
		false,
		false,
		false,
		false,
		true,
		false,
		true,
		true,
		true,
		true,
		true,
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
		null,
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

	public static final TournamentOpal NOT_YET_LOADED = new TournamentOpal();

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


	public synchronized java.time.LocalDate getDate() {
		return (java.time.LocalDate) getReadValueSet()[0];
	}

	public synchronized java.lang.String getName() {
		return (java.lang.String) getReadValueSet()[1];
	}

	public synchronized java.lang.String getShortName() {
		return (java.lang.String) getReadValueSet()[2];
	}

	public synchronized java.lang.String getCode() {
		return (java.lang.String) getReadValueSet()[3];
	}

	public synchronized java.lang.String getWebXmlRoleCode() {
		return (java.lang.String) getReadValueSet()[4];
	}

	public synchronized java.lang.Boolean isTiebreakerSuddenDeathAsObject() {
		return (java.lang.Boolean) getReadValueSet()[5];
	}

	public synchronized java.lang.String getUrl() {
		return (java.lang.String) getReadValueSet()[6];
	}

	public synchronized java.lang.Integer getTournamentDirectorContactIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[7];
	}

	public synchronized java.lang.String getPlayerMessage() {
		return (java.lang.String) getReadValueSet()[8];
	}

	public synchronized java.lang.String getStaffMessage() {
		return (java.lang.String) getReadValueSet()[9];
	}

	public synchronized java.lang.String getReplacementQuestionSocialMediaPolicy() {
		return (java.lang.String) getReadValueSet()[10];
	}

	public synchronized java.lang.String getSchoolMessage() {
		return (java.lang.String) getReadValueSet()[11];
	}

	public synchronized java.lang.Integer getControlRoomRoomIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[12];
	}

	public synchronized java.lang.String getChampionshipRules() {
		return (java.lang.String) getReadValueSet()[13];
	}

	public synchronized java.lang.String getChampionshipMatchUrl() {
		return (java.lang.String) getReadValueSet()[14];
	}

	public synchronized java.lang.Boolean isQuestionsCompleteAsObject() {
		return (java.lang.Boolean) getReadValueSet()[15];
	}

	public synchronized TournamentOpal setDate(final java.time.LocalDate argDate) {
		tryMutate();
		if (argDate == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myDate on " + this + " to null.");
		}
		getNewValues()[0] = argDate;
		return this;
	}

	public synchronized TournamentOpal setName(final java.lang.String argName) {
		tryMutate();
		if (argName == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myName on " + this + " to null.");
		}
		if (argName.length() > 256) {
			throw new com.opal.ArgumentTooLongException("Maximum length of myName on " + this + " is 256.", argName.length(), 256);
		}
		getNewValues()[1] = argName;
		return this;
	}

	public synchronized TournamentOpal setShortName(final java.lang.String argShortName) {
		tryMutate();
		if (argShortName == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myShortName on " + this + " to null.");
		}
		if (argShortName.length() > 32) {
			throw new com.opal.ArgumentTooLongException("Maximum length of myShortName on " + this + " is 32.", argShortName.length(), 32);
		}
		getNewValues()[2] = argShortName;
		return this;
	}

	public synchronized TournamentOpal setCode(final java.lang.String argCode) {
		tryMutate();
		if (argCode == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myCode on " + this + " to null.");
		}
		if (argCode.length() > 32) {
			throw new com.opal.ArgumentTooLongException("Maximum length of myCode on " + this + " is 32.", argCode.length(), 32);
		}
		getNewValues()[3] = argCode;
		return this;
	}

	public synchronized TournamentOpal setWebXmlRoleCode(final java.lang.String argWebXmlRoleCode) {
		tryMutate();
		if (argWebXmlRoleCode == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myWebXmlRoleCode on " + this + " to null.");
		}
		if (argWebXmlRoleCode.length() > 32) {
			throw new com.opal.ArgumentTooLongException("Maximum length of myWebXmlRoleCode on " + this + " is 32.", argWebXmlRoleCode.length(), 32);
		}
		getNewValues()[4] = argWebXmlRoleCode;
		return this;
	}

	public synchronized TournamentOpal setTiebreakerSuddenDeath(final java.lang.Boolean argTiebreakerSuddenDeath) {
		tryMutate();
		if (argTiebreakerSuddenDeath == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myTiebreakerSuddenDeath on " + this + " to null.");
		}
		getNewValues()[5] = argTiebreakerSuddenDeath;
		return this;
	}

	public TournamentOpal setTiebreakerSuddenDeath(final boolean argTiebreakerSuddenDeath) {
		setTiebreakerSuddenDeath(argTiebreakerSuddenDeath ? Boolean.TRUE : Boolean.FALSE);
		return this;
	}

	public synchronized TournamentOpal setUrl(final java.lang.String argUrl) {
		tryMutate();
		getNewValues()[6] = argUrl;
		return this;
	}

	public synchronized TournamentOpal setTournamentDirectorContactId(final java.lang.Integer argTournamentDirectorContactId) {
		tryMutate();
		if (argTournamentDirectorContactId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myTournamentDirectorContactId on " + this + " to null.");
		}
		getNewValues()[7] = argTournamentDirectorContactId;
		return this;
	}

	public TournamentOpal setTournamentDirectorContactId(final int argTournamentDirectorContactId) {
		setTournamentDirectorContactId(java.lang.Integer.valueOf(argTournamentDirectorContactId));
		return this;
	}

	public synchronized TournamentOpal setPlayerMessage(final java.lang.String argPlayerMessage) {
		tryMutate();
		getNewValues()[8] = argPlayerMessage;
		return this;
	}

	public synchronized TournamentOpal setStaffMessage(final java.lang.String argStaffMessage) {
		tryMutate();
		getNewValues()[9] = argStaffMessage;
		return this;
	}

	public synchronized TournamentOpal setReplacementQuestionSocialMediaPolicy(final java.lang.String argReplacementQuestionSocialMediaPolicy) {
		tryMutate();
		getNewValues()[10] = argReplacementQuestionSocialMediaPolicy;
		return this;
	}

	public synchronized TournamentOpal setSchoolMessage(final java.lang.String argSchoolMessage) {
		tryMutate();
		getNewValues()[11] = argSchoolMessage;
		return this;
	}

	public synchronized TournamentOpal setControlRoomRoomId(final java.lang.Integer argControlRoomRoomId) {
		tryMutate();
		getNewValues()[12] = argControlRoomRoomId;
		return this;
	}

	public TournamentOpal setControlRoomRoomId(final int argControlRoomRoomId) {
		setControlRoomRoomId(java.lang.Integer.valueOf(argControlRoomRoomId));
		return this;
	}

	public synchronized TournamentOpal setChampionshipRules(final java.lang.String argChampionshipRules) {
		tryMutate();
		getNewValues()[13] = argChampionshipRules;
		return this;
	}

	public synchronized TournamentOpal setChampionshipMatchUrl(final java.lang.String argChampionshipMatchUrl) {
		tryMutate();
		if ((argChampionshipMatchUrl != null) && (argChampionshipMatchUrl.length() > 256)) {
			throw new com.opal.ArgumentTooLongException("Maximum length of myChampionshipMatchUrl on " + this + " is 256.", argChampionshipMatchUrl.length(), 256);
		}
		getNewValues()[14] = argChampionshipMatchUrl;
		return this;
	}

	public synchronized TournamentOpal setQuestionsComplete(final java.lang.Boolean argQuestionsComplete) {
		tryMutate();
		if (argQuestionsComplete == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myQuestionsComplete on " + this + " to null.");
		}
		getNewValues()[15] = argQuestionsComplete;
		return this;
	}

	public TournamentOpal setQuestionsComplete(final boolean argQuestionsComplete) {
		setQuestionsComplete(argQuestionsComplete ? Boolean.TRUE : Boolean.FALSE);
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
		myNewControlRoomOpal = myOldControlRoomOpal;
		myNewTournamentDirectorContactOpal = myOldTournamentDirectorContactOpal;
		myNewPhaseOpalHashSet = null; /* Necessary if it has been rolled back */
		myPhaseOpalCachedOperations = null; /* Ditto */
		myNewSchoolRegistrationOpalHashSet = null; /* Necessary if it has been rolled back */
		mySchoolRegistrationOpalCachedOperations = null; /* Ditto */
		myNewStaffOpalHashSet = null; /* Necessary if it has been rolled back */
		myStaffOpalCachedOperations = null; /* Ditto */
		myNewCategoryUseOpalHashSet = null; /* Necessary if it has been rolled back */
		myCategoryUseOpalCachedOperations = null; /* Ditto */
		myNewPacketOpalHashSet = null; /* Necessary if it has been rolled back */
		myPacketOpalCachedOperations = null; /* Ditto */
		myNewRoomOpalHashSet = null; /* Necessary if it has been rolled back */
		myRoomOpalCachedOperations = null; /* Ditto */
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		myOldControlRoomOpal = myNewControlRoomOpal;
		myOldTournamentDirectorContactOpal = myNewTournamentDirectorContactOpal;

		if (needsToClearOldCollections()) {
			myOldPhaseOpalHashSet = null;
			} else {
			if (myNewPhaseOpalHashSet != null) {
				myOldPhaseOpalHashSet = myNewPhaseOpalHashSet;
				myNewPhaseOpalHashSet = null;
			} else {
				myPhaseOpalCachedOperations = null;
			}
		}
		if (needsToClearOldCollections()) {
			myOldSchoolRegistrationOpalHashSet = null;
			} else {
			if (myNewSchoolRegistrationOpalHashSet != null) {
				myOldSchoolRegistrationOpalHashSet = myNewSchoolRegistrationOpalHashSet;
				myNewSchoolRegistrationOpalHashSet = null;
			} else {
				mySchoolRegistrationOpalCachedOperations = null;
			}
		}
		if (needsToClearOldCollections()) {
			myOldStaffOpalHashSet = null;
			} else {
			if (myNewStaffOpalHashSet != null) {
				myOldStaffOpalHashSet = myNewStaffOpalHashSet;
				myNewStaffOpalHashSet = null;
			} else {
				myStaffOpalCachedOperations = null;
			}
		}
		if (needsToClearOldCollections()) {
			myOldCategoryUseOpalHashSet = null;
			} else {
			if (myNewCategoryUseOpalHashSet != null) {
				myOldCategoryUseOpalHashSet = myNewCategoryUseOpalHashSet;
				myNewCategoryUseOpalHashSet = null;
			} else {
				myCategoryUseOpalCachedOperations = null;
			}
		}
		if (needsToClearOldCollections()) {
			myOldPacketOpalHashSet = null;
			} else {
			if (myNewPacketOpalHashSet != null) {
				myOldPacketOpalHashSet = myNewPacketOpalHashSet;
				myNewPacketOpalHashSet = null;
			} else {
				myPacketOpalCachedOperations = null;
			}
		}
		if (needsToClearOldCollections()) {
			myOldRoomOpalHashSet = null;
			} else {
			if (myNewRoomOpalHashSet != null) {
				myOldRoomOpalHashSet = myNewRoomOpalHashSet;
				myNewRoomOpalHashSet = null;
			} else {
				myRoomOpalCachedOperations = null;
			}
		}
		setClearOldCollections(false);
		return;
	}

	@Override
	protected void unlinkInternal() {
		java.util.Iterator<?> lclI;
		if (myNewPhaseOpalHashSet != null || myPhaseOpalCachedOperations != null) {
			lclI = createPhaseOpalIterator();
			while (lclI.hasNext()) {
				((PhaseOpal) lclI.next()).setTournamentOpalInternal(null);
			}
		}
		if (myNewSchoolRegistrationOpalHashSet != null || mySchoolRegistrationOpalCachedOperations != null) {
			lclI = createSchoolRegistrationOpalIterator();
			while (lclI.hasNext()) {
				((SchoolRegistrationOpal) lclI.next()).setTournamentOpalInternal(null);
			}
		}
		if (myNewStaffOpalHashSet != null || myStaffOpalCachedOperations != null) {
			lclI = createStaffOpalIterator();
			while (lclI.hasNext()) {
				((StaffOpal) lclI.next()).setTournamentOpalInternal(null);
			}
		}
		if (myNewCategoryUseOpalHashSet != null || myCategoryUseOpalCachedOperations != null) {
			lclI = createCategoryUseOpalIterator();
			while (lclI.hasNext()) {
				((CategoryUseOpal) lclI.next()).setTournamentOpalInternal(null);
			}
		}
		if (myNewPacketOpalHashSet != null || myPacketOpalCachedOperations != null) {
			lclI = createPacketOpalIterator();
			while (lclI.hasNext()) {
				((PacketOpal) lclI.next()).setTournamentOpalInternal(null);
			}
		}
		if (myNewRoomOpalHashSet != null || myRoomOpalCachedOperations != null) {
			lclI = createRoomOpalIterator();
			while (lclI.hasNext()) {
				((RoomOpal) lclI.next()).setTournamentOpalInternal(null);
			}
		}
		if (getControlRoomOpal() != null) {
			getControlRoomOpal().removeControlRoomTournamentOpalInternal(this);
		}
		if (getTournamentDirectorContactOpal() != null) {
			getTournamentDirectorContactOpal().removeTournamentDirectorTournamentOpalInternal(this);
		}
		return;
	}

	@Override
	protected void copyFieldsToInternal(UpdatableOpal<Tournament> argTarget) {
		Object[] lclValues = getReadValueSet();
		Object[] lclTargetNewValues = argTarget.getNewValues();
		lclTargetNewValues[0] = lclValues[0]; /* Date (immutable) */
		/* Field 1 (Name) is part of a unique key. */
		/* Field 2 (ShortName) is part of a unique key. */
		/* Field 3 (Code) is part of a unique key. */
		/* Field 4 (WebXmlRoleCode) is part of a unique key. */
		lclTargetNewValues[5] = lclValues[5]; /* TiebreakerSuddenDeath (immutable) */
		lclTargetNewValues[6] = lclValues[6]; /* Url (immutable) */
		lclTargetNewValues[7] = lclValues[7]; /* TournamentDirectorContactId (immutable) */
		lclTargetNewValues[8] = lclValues[8]; /* PlayerMessage (immutable) */
		lclTargetNewValues[9] = lclValues[9]; /* StaffMessage (immutable) */
		lclTargetNewValues[10] = lclValues[10]; /* ReplacementQuestionSocialMediaPolicy (immutable) */
		lclTargetNewValues[11] = lclValues[11]; /* SchoolMessage (immutable) */
		lclTargetNewValues[12] = lclValues[12]; /* ControlRoomRoomId (immutable) */
		lclTargetNewValues[13] = lclValues[13]; /* ChampionshipRules (immutable) */
		lclTargetNewValues[14] = lclValues[14]; /* ChampionshipMatchUrl (immutable) */
		lclTargetNewValues[15] = lclValues[15]; /* QuestionsComplete (immutable) */

		return;
	}

	@Override
	public synchronized void translateReferencesToFields() {
		if (myNewControlRoomOpal != RoomOpal.NOT_YET_LOADED) {
			setControlRoomRoomId(myNewControlRoomOpal == null ? null : myNewControlRoomOpal.getIdAsObject());
		}
		if (myNewTournamentDirectorContactOpal != ContactOpal.NOT_YET_LOADED) {
			setTournamentDirectorContactId(myNewTournamentDirectorContactOpal == null ? null : myNewTournamentDirectorContactOpal.getIdAsObject());
		}
		return;
	}

	@Override
	public java.util.Set<com.opal.TransactionAware> getRequiredPriorCommits() {
		java.util.Set<com.opal.TransactionAware> lclTAs = null;
		UpdatableOpal<?> lclUO;
		lclUO = myNewControlRoomOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		lclUO = myNewTournamentDirectorContactOpal;
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
		lclUO = myOldControlRoomOpal;
		if ((lclUO != null) && lclUO.isDeleted()) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		lclUO = myOldTournamentDirectorContactOpal;
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
		return new Object[] {getOldValues()[3], };
	}

	private static int getFieldCountInternal() { return ourFieldNames.length; }

	@Override
	protected int getFieldCount() { return getFieldCountInternal(); }

	@Override
	protected String[] getFieldNames() { return ourFieldNames; }

	@Override
	public synchronized void output(final PrintWriter argPW) {
		argPW.println("Date = " + getDate());
		argPW.println("Name = " + getName());
		argPW.println("ShortName = " + getShortName());
		argPW.println("Code = " + getCode());
		argPW.println("WebXmlRoleCode = " + getWebXmlRoleCode());
		argPW.println("TiebreakerSuddenDeath = " + isTiebreakerSuddenDeathAsObject());
		argPW.println("Url = " + getUrl());
		argPW.println("TournamentDirectorContactId = " + getTournamentDirectorContactIdAsObject());
		argPW.println("PlayerMessage = " + getPlayerMessage());
		argPW.println("StaffMessage = " + getStaffMessage());
		argPW.println("ReplacementQuestionSocialMediaPolicy = " + getReplacementQuestionSocialMediaPolicy());
		argPW.println("SchoolMessage = " + getSchoolMessage());
		argPW.println("ControlRoomRoomId = " + getControlRoomRoomIdAsObject());
		argPW.println("ChampionshipRules = " + getChampionshipRules());
		argPW.println("ChampionshipMatchUrl = " + getChampionshipMatchUrl());
		argPW.println("QuestionsComplete = " + isQuestionsCompleteAsObject());
	}

	@Override
	public synchronized void output(final PrintStream argPS) {
		argPS.println("Date = " + getDate());
		argPS.println("Name = " + getName());
		argPS.println("ShortName = " + getShortName());
		argPS.println("Code = " + getCode());
		argPS.println("WebXmlRoleCode = " + getWebXmlRoleCode());
		argPS.println("TiebreakerSuddenDeath = " + isTiebreakerSuddenDeathAsObject());
		argPS.println("Url = " + getUrl());
		argPS.println("TournamentDirectorContactId = " + getTournamentDirectorContactIdAsObject());
		argPS.println("PlayerMessage = " + getPlayerMessage());
		argPS.println("StaffMessage = " + getStaffMessage());
		argPS.println("ReplacementQuestionSocialMediaPolicy = " + getReplacementQuestionSocialMediaPolicy());
		argPS.println("SchoolMessage = " + getSchoolMessage());
		argPS.println("ControlRoomRoomId = " + getControlRoomRoomIdAsObject());
		argPS.println("ChampionshipRules = " + getChampionshipRules());
		argPS.println("ChampionshipMatchUrl = " + getChampionshipMatchUrl());
		argPS.println("QuestionsComplete = " + isQuestionsCompleteAsObject());
	}

	private RoomOpal myOldControlRoomOpal;
	private RoomOpal myNewControlRoomOpal;

	protected RoomOpal retrieveControlRoomOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[12] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getRoomOpalFactory().forId(getControlRoomRoomIdAsObject());
	}

	public synchronized RoomOpal getControlRoomOpal() {
		RoomOpal lclRoomOpal;
		boolean lclAccess = tryAccess();
		lclRoomOpal = lclAccess ? myNewControlRoomOpal : myOldControlRoomOpal;
		if (lclRoomOpal == RoomOpal.NOT_YET_LOADED) {
			lclRoomOpal = retrieveControlRoomOpal(getReadValueSet());
			if (lclAccess) {
				myNewControlRoomOpal = lclRoomOpal;
			} else {
				myOldControlRoomOpal = lclRoomOpal;
			}
		}
		return lclRoomOpal;
	}

	public synchronized TournamentOpal setControlRoomOpal(RoomOpal argRoomOpal) {
		tryMutate();
		RoomOpal lclRoomOpal = getControlRoomOpal();
		if (lclRoomOpal == argRoomOpal) { return this; }
		if (lclRoomOpal != null) {
			lclRoomOpal.removeControlRoomTournamentOpalInternal(this);
		}
		myNewControlRoomOpal = argRoomOpal;
		if (argRoomOpal != null) {
			argRoomOpal.addControlRoomTournamentOpalInternal(this);
		}
		return this;
	}

	protected synchronized void setControlRoomOpalInternal(RoomOpal argRoomOpal) {
		tryMutate();
		myNewControlRoomOpal = argRoomOpal;
	}

	private ContactOpal myOldTournamentDirectorContactOpal;
	private ContactOpal myNewTournamentDirectorContactOpal;

	protected ContactOpal retrieveTournamentDirectorContactOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[7] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getContactOpalFactory().forId(getTournamentDirectorContactIdAsObject());
	}

	public synchronized ContactOpal getTournamentDirectorContactOpal() {
		ContactOpal lclContactOpal;
		boolean lclAccess = tryAccess();
		lclContactOpal = lclAccess ? myNewTournamentDirectorContactOpal : myOldTournamentDirectorContactOpal;
		if (lclContactOpal == ContactOpal.NOT_YET_LOADED) {
			lclContactOpal = retrieveTournamentDirectorContactOpal(getReadValueSet());
			if (lclAccess) {
				myNewTournamentDirectorContactOpal = lclContactOpal;
			} else {
				myOldTournamentDirectorContactOpal = lclContactOpal;
			}
		}
		return lclContactOpal;
	}

	public synchronized TournamentOpal setTournamentDirectorContactOpal(ContactOpal argContactOpal) {
		tryMutate();
		ContactOpal lclContactOpal = getTournamentDirectorContactOpal();
		if (lclContactOpal == argContactOpal) { return this; }
		if (lclContactOpal != null) {
			lclContactOpal.removeTournamentDirectorTournamentOpalInternal(this);
		}
		myNewTournamentDirectorContactOpal = argContactOpal;
		if (argContactOpal != null) {
			argContactOpal.addTournamentDirectorTournamentOpalInternal(this);
		}
		return this;
	}

	protected synchronized void setTournamentDirectorContactOpalInternal(ContactOpal argContactOpal) {
		tryMutate();
		myNewTournamentDirectorContactOpal = argContactOpal;
	}

	private java.util.HashSet<PhaseOpal> myOldPhaseOpalHashSet = null;
	private java.util.HashSet<PhaseOpal> myNewPhaseOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<PhaseOpal>> myPhaseOpalCachedOperations = null;

	/* package */ java.util.HashSet<PhaseOpal> getPhaseOpalHashSet() {
		if (tryAccess()) {
			if (myNewPhaseOpalHashSet == null) {
				if (myOldPhaseOpalHashSet == null) {
					if (isNew()) {
						myOldPhaseOpalHashSet = new java.util.HashSet<>();
					} else {
						myOldPhaseOpalHashSet = OpalFactoryFactory.getInstance().getPhaseOpalFactory().forTournamentCodeCollection(getCode());
					}
				}
				myNewPhaseOpalHashSet = new java.util.HashSet<>(myOldPhaseOpalHashSet);
				if (myPhaseOpalCachedOperations != null) {
					OpalUtility.handleCachedOperations(myPhaseOpalCachedOperations, myNewPhaseOpalHashSet);
					myPhaseOpalCachedOperations = null;
				}
			}
			return myNewPhaseOpalHashSet;
		} else {
			if (myOldPhaseOpalHashSet == null) {
				myOldPhaseOpalHashSet = OpalFactoryFactory.getInstance().getPhaseOpalFactory().forTournamentCodeCollection(getCode());
			}
			return myOldPhaseOpalHashSet;
		}
	}

	public synchronized void addPhaseOpal(PhaseOpal argPhaseOpal) {
		tryMutate();
		argPhaseOpal.setTournamentOpal(this);
		return;
	}

	protected synchronized void addPhaseOpalInternal(PhaseOpal argPhaseOpal) {
		tryMutate();
		if (myNewPhaseOpalHashSet == null) {
			if (myOldPhaseOpalHashSet == null) {
				if (myPhaseOpalCachedOperations == null) { myPhaseOpalCachedOperations = new java.util.ArrayList<>(); }
				myPhaseOpalCachedOperations.add(new CachedOperation<>(CachedOperation.ADD, argPhaseOpal));
			} else {
				myNewPhaseOpalHashSet = new java.util.HashSet<>(myOldPhaseOpalHashSet);
				myNewPhaseOpalHashSet.add(argPhaseOpal);
			}
		} else {
			myNewPhaseOpalHashSet.add(argPhaseOpal);
		}
		return;
	}

	public synchronized void removePhaseOpal(PhaseOpal argPhaseOpal) {
		tryMutate();
		argPhaseOpal.setTournamentOpal(null);
	}

	protected synchronized void removePhaseOpalInternal(PhaseOpal argPhaseOpal) {
		tryMutate();
		if (myNewPhaseOpalHashSet == null) {
			if (myOldPhaseOpalHashSet == null) {
				if (myPhaseOpalCachedOperations == null) { myPhaseOpalCachedOperations = new java.util.ArrayList<>(); }
				myPhaseOpalCachedOperations.add(new CachedOperation<>(CachedOperation.REMOVE, argPhaseOpal));
			} else {
				myNewPhaseOpalHashSet = new java.util.HashSet<>(myOldPhaseOpalHashSet);
				myNewPhaseOpalHashSet.remove(argPhaseOpal);
			}
		} else {
			myNewPhaseOpalHashSet.remove(argPhaseOpal);
		}
		return;
	}

	public synchronized int getPhaseOpalCount() { return getPhaseOpalHashSet().size(); }

	public synchronized java.util.Iterator<PhaseOpal> createPhaseOpalIterator() {
		return getPhaseOpalHashSet().iterator();
	}

	public synchronized java.util.stream.Stream<PhaseOpal> streamPhaseOpal() {
		return getPhaseOpalHashSet().stream();
	}

	public synchronized void clearPhaseOpalInternal() { getPhaseOpalHashSet().clear(); }

	private java.util.HashSet<SchoolRegistrationOpal> myOldSchoolRegistrationOpalHashSet = null;
	private java.util.HashSet<SchoolRegistrationOpal> myNewSchoolRegistrationOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<SchoolRegistrationOpal>> mySchoolRegistrationOpalCachedOperations = null;

	/* package */ java.util.HashSet<SchoolRegistrationOpal> getSchoolRegistrationOpalHashSet() {
		if (tryAccess()) {
			if (myNewSchoolRegistrationOpalHashSet == null) {
				if (myOldSchoolRegistrationOpalHashSet == null) {
					if (isNew()) {
						myOldSchoolRegistrationOpalHashSet = new java.util.HashSet<>();
					} else {
						myOldSchoolRegistrationOpalHashSet = OpalFactoryFactory.getInstance().getSchoolRegistrationOpalFactory().forTournamentCodeCollection(getCode());
					}
				}
				myNewSchoolRegistrationOpalHashSet = new java.util.HashSet<>(myOldSchoolRegistrationOpalHashSet);
				if (mySchoolRegistrationOpalCachedOperations != null) {
					OpalUtility.handleCachedOperations(mySchoolRegistrationOpalCachedOperations, myNewSchoolRegistrationOpalHashSet);
					mySchoolRegistrationOpalCachedOperations = null;
				}
			}
			return myNewSchoolRegistrationOpalHashSet;
		} else {
			if (myOldSchoolRegistrationOpalHashSet == null) {
				myOldSchoolRegistrationOpalHashSet = OpalFactoryFactory.getInstance().getSchoolRegistrationOpalFactory().forTournamentCodeCollection(getCode());
			}
			return myOldSchoolRegistrationOpalHashSet;
		}
	}

	public synchronized void addSchoolRegistrationOpal(SchoolRegistrationOpal argSchoolRegistrationOpal) {
		tryMutate();
		argSchoolRegistrationOpal.setTournamentOpal(this);
		return;
	}

	protected synchronized void addSchoolRegistrationOpalInternal(SchoolRegistrationOpal argSchoolRegistrationOpal) {
		tryMutate();
		if (myNewSchoolRegistrationOpalHashSet == null) {
			if (myOldSchoolRegistrationOpalHashSet == null) {
				if (mySchoolRegistrationOpalCachedOperations == null) { mySchoolRegistrationOpalCachedOperations = new java.util.ArrayList<>(); }
				mySchoolRegistrationOpalCachedOperations.add(new CachedOperation<>(CachedOperation.ADD, argSchoolRegistrationOpal));
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
		argSchoolRegistrationOpal.setTournamentOpal(null);
	}

	protected synchronized void removeSchoolRegistrationOpalInternal(SchoolRegistrationOpal argSchoolRegistrationOpal) {
		tryMutate();
		if (myNewSchoolRegistrationOpalHashSet == null) {
			if (myOldSchoolRegistrationOpalHashSet == null) {
				if (mySchoolRegistrationOpalCachedOperations == null) { mySchoolRegistrationOpalCachedOperations = new java.util.ArrayList<>(); }
				mySchoolRegistrationOpalCachedOperations.add(new CachedOperation<>(CachedOperation.REMOVE, argSchoolRegistrationOpal));
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

	public synchronized void clearSchoolRegistrationOpalInternal() { getSchoolRegistrationOpalHashSet().clear(); }

	private java.util.HashSet<StaffOpal> myOldStaffOpalHashSet = null;
	private java.util.HashSet<StaffOpal> myNewStaffOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<StaffOpal>> myStaffOpalCachedOperations = null;

	/* package */ java.util.HashSet<StaffOpal> getStaffOpalHashSet() {
		if (tryAccess()) {
			if (myNewStaffOpalHashSet == null) {
				if (myOldStaffOpalHashSet == null) {
					if (isNew()) {
						myOldStaffOpalHashSet = new java.util.HashSet<>();
					} else {
						myOldStaffOpalHashSet = OpalFactoryFactory.getInstance().getStaffOpalFactory().forTournamentCodeCollection(getCode());
					}
				}
				myNewStaffOpalHashSet = new java.util.HashSet<>(myOldStaffOpalHashSet);
				if (myStaffOpalCachedOperations != null) {
					OpalUtility.handleCachedOperations(myStaffOpalCachedOperations, myNewStaffOpalHashSet);
					myStaffOpalCachedOperations = null;
				}
			}
			return myNewStaffOpalHashSet;
		} else {
			if (myOldStaffOpalHashSet == null) {
				myOldStaffOpalHashSet = OpalFactoryFactory.getInstance().getStaffOpalFactory().forTournamentCodeCollection(getCode());
			}
			return myOldStaffOpalHashSet;
		}
	}

	public synchronized void addStaffOpal(StaffOpal argStaffOpal) {
		tryMutate();
		argStaffOpal.setTournamentOpal(this);
		return;
	}

	protected synchronized void addStaffOpalInternal(StaffOpal argStaffOpal) {
		tryMutate();
		if (myNewStaffOpalHashSet == null) {
			if (myOldStaffOpalHashSet == null) {
				if (myStaffOpalCachedOperations == null) { myStaffOpalCachedOperations = new java.util.ArrayList<>(); }
				myStaffOpalCachedOperations.add(new CachedOperation<>(CachedOperation.ADD, argStaffOpal));
			} else {
				myNewStaffOpalHashSet = new java.util.HashSet<>(myOldStaffOpalHashSet);
				myNewStaffOpalHashSet.add(argStaffOpal);
			}
		} else {
			myNewStaffOpalHashSet.add(argStaffOpal);
		}
		return;
	}

	public synchronized void removeStaffOpal(StaffOpal argStaffOpal) {
		tryMutate();
		argStaffOpal.setTournamentOpal(null);
	}

	protected synchronized void removeStaffOpalInternal(StaffOpal argStaffOpal) {
		tryMutate();
		if (myNewStaffOpalHashSet == null) {
			if (myOldStaffOpalHashSet == null) {
				if (myStaffOpalCachedOperations == null) { myStaffOpalCachedOperations = new java.util.ArrayList<>(); }
				myStaffOpalCachedOperations.add(new CachedOperation<>(CachedOperation.REMOVE, argStaffOpal));
			} else {
				myNewStaffOpalHashSet = new java.util.HashSet<>(myOldStaffOpalHashSet);
				myNewStaffOpalHashSet.remove(argStaffOpal);
			}
		} else {
			myNewStaffOpalHashSet.remove(argStaffOpal);
		}
		return;
	}

	public synchronized int getStaffOpalCount() { return getStaffOpalHashSet().size(); }

	public synchronized java.util.Iterator<StaffOpal> createStaffOpalIterator() {
		return getStaffOpalHashSet().iterator();
	}

	public synchronized java.util.stream.Stream<StaffOpal> streamStaffOpal() {
		return getStaffOpalHashSet().stream();
	}

	public synchronized void clearStaffOpalInternal() { getStaffOpalHashSet().clear(); }

	private java.util.HashSet<CategoryUseOpal> myOldCategoryUseOpalHashSet = null;
	private java.util.HashSet<CategoryUseOpal> myNewCategoryUseOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<CategoryUseOpal>> myCategoryUseOpalCachedOperations = null;

	/* package */ java.util.HashSet<CategoryUseOpal> getCategoryUseOpalHashSet() {
		if (tryAccess()) {
			if (myNewCategoryUseOpalHashSet == null) {
				if (myOldCategoryUseOpalHashSet == null) {
					if (isNew()) {
						myOldCategoryUseOpalHashSet = new java.util.HashSet<>();
					} else {
						myOldCategoryUseOpalHashSet = OpalFactoryFactory.getInstance().getCategoryUseOpalFactory().forTournamentCodeCollection(getCode());
					}
				}
				myNewCategoryUseOpalHashSet = new java.util.HashSet<>(myOldCategoryUseOpalHashSet);
				if (myCategoryUseOpalCachedOperations != null) {
					OpalUtility.handleCachedOperations(myCategoryUseOpalCachedOperations, myNewCategoryUseOpalHashSet);
					myCategoryUseOpalCachedOperations = null;
				}
			}
			return myNewCategoryUseOpalHashSet;
		} else {
			if (myOldCategoryUseOpalHashSet == null) {
				myOldCategoryUseOpalHashSet = OpalFactoryFactory.getInstance().getCategoryUseOpalFactory().forTournamentCodeCollection(getCode());
			}
			return myOldCategoryUseOpalHashSet;
		}
	}

	public synchronized void addCategoryUseOpal(CategoryUseOpal argCategoryUseOpal) {
		tryMutate();
		argCategoryUseOpal.setTournamentOpal(this);
		return;
	}

	protected synchronized void addCategoryUseOpalInternal(CategoryUseOpal argCategoryUseOpal) {
		tryMutate();
		if (myNewCategoryUseOpalHashSet == null) {
			if (myOldCategoryUseOpalHashSet == null) {
				if (myCategoryUseOpalCachedOperations == null) { myCategoryUseOpalCachedOperations = new java.util.ArrayList<>(); }
				myCategoryUseOpalCachedOperations.add(new CachedOperation<>(CachedOperation.ADD, argCategoryUseOpal));
			} else {
				myNewCategoryUseOpalHashSet = new java.util.HashSet<>(myOldCategoryUseOpalHashSet);
				myNewCategoryUseOpalHashSet.add(argCategoryUseOpal);
			}
		} else {
			myNewCategoryUseOpalHashSet.add(argCategoryUseOpal);
		}
		return;
	}

	public synchronized void removeCategoryUseOpal(CategoryUseOpal argCategoryUseOpal) {
		tryMutate();
		argCategoryUseOpal.setTournamentOpal(null);
	}

	protected synchronized void removeCategoryUseOpalInternal(CategoryUseOpal argCategoryUseOpal) {
		tryMutate();
		if (myNewCategoryUseOpalHashSet == null) {
			if (myOldCategoryUseOpalHashSet == null) {
				if (myCategoryUseOpalCachedOperations == null) { myCategoryUseOpalCachedOperations = new java.util.ArrayList<>(); }
				myCategoryUseOpalCachedOperations.add(new CachedOperation<>(CachedOperation.REMOVE, argCategoryUseOpal));
			} else {
				myNewCategoryUseOpalHashSet = new java.util.HashSet<>(myOldCategoryUseOpalHashSet);
				myNewCategoryUseOpalHashSet.remove(argCategoryUseOpal);
			}
		} else {
			myNewCategoryUseOpalHashSet.remove(argCategoryUseOpal);
		}
		return;
	}

	public synchronized int getCategoryUseOpalCount() { return getCategoryUseOpalHashSet().size(); }

	public synchronized java.util.Iterator<CategoryUseOpal> createCategoryUseOpalIterator() {
		return getCategoryUseOpalHashSet().iterator();
	}

	public synchronized java.util.stream.Stream<CategoryUseOpal> streamCategoryUseOpal() {
		return getCategoryUseOpalHashSet().stream();
	}

	public synchronized void clearCategoryUseOpalInternal() { getCategoryUseOpalHashSet().clear(); }

	private java.util.HashSet<PacketOpal> myOldPacketOpalHashSet = null;
	private java.util.HashSet<PacketOpal> myNewPacketOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<PacketOpal>> myPacketOpalCachedOperations = null;

	/* package */ java.util.HashSet<PacketOpal> getPacketOpalHashSet() {
		if (tryAccess()) {
			if (myNewPacketOpalHashSet == null) {
				if (myOldPacketOpalHashSet == null) {
					if (isNew()) {
						myOldPacketOpalHashSet = new java.util.HashSet<>();
					} else {
						myOldPacketOpalHashSet = OpalFactoryFactory.getInstance().getPacketOpalFactory().forTournamentCodeCollection(getCode());
					}
				}
				myNewPacketOpalHashSet = new java.util.HashSet<>(myOldPacketOpalHashSet);
				if (myPacketOpalCachedOperations != null) {
					OpalUtility.handleCachedOperations(myPacketOpalCachedOperations, myNewPacketOpalHashSet);
					myPacketOpalCachedOperations = null;
				}
			}
			return myNewPacketOpalHashSet;
		} else {
			if (myOldPacketOpalHashSet == null) {
				myOldPacketOpalHashSet = OpalFactoryFactory.getInstance().getPacketOpalFactory().forTournamentCodeCollection(getCode());
			}
			return myOldPacketOpalHashSet;
		}
	}

	public synchronized void addPacketOpal(PacketOpal argPacketOpal) {
		tryMutate();
		argPacketOpal.setTournamentOpal(this);
		return;
	}

	protected synchronized void addPacketOpalInternal(PacketOpal argPacketOpal) {
		tryMutate();
		if (myNewPacketOpalHashSet == null) {
			if (myOldPacketOpalHashSet == null) {
				if (myPacketOpalCachedOperations == null) { myPacketOpalCachedOperations = new java.util.ArrayList<>(); }
				myPacketOpalCachedOperations.add(new CachedOperation<>(CachedOperation.ADD, argPacketOpal));
			} else {
				myNewPacketOpalHashSet = new java.util.HashSet<>(myOldPacketOpalHashSet);
				myNewPacketOpalHashSet.add(argPacketOpal);
			}
		} else {
			myNewPacketOpalHashSet.add(argPacketOpal);
		}
		return;
	}

	public synchronized void removePacketOpal(PacketOpal argPacketOpal) {
		tryMutate();
		argPacketOpal.setTournamentOpal(null);
	}

	protected synchronized void removePacketOpalInternal(PacketOpal argPacketOpal) {
		tryMutate();
		if (myNewPacketOpalHashSet == null) {
			if (myOldPacketOpalHashSet == null) {
				if (myPacketOpalCachedOperations == null) { myPacketOpalCachedOperations = new java.util.ArrayList<>(); }
				myPacketOpalCachedOperations.add(new CachedOperation<>(CachedOperation.REMOVE, argPacketOpal));
			} else {
				myNewPacketOpalHashSet = new java.util.HashSet<>(myOldPacketOpalHashSet);
				myNewPacketOpalHashSet.remove(argPacketOpal);
			}
		} else {
			myNewPacketOpalHashSet.remove(argPacketOpal);
		}
		return;
	}

	public synchronized int getPacketOpalCount() { return getPacketOpalHashSet().size(); }

	public synchronized java.util.Iterator<PacketOpal> createPacketOpalIterator() {
		return getPacketOpalHashSet().iterator();
	}

	public synchronized java.util.stream.Stream<PacketOpal> streamPacketOpal() {
		return getPacketOpalHashSet().stream();
	}

	public synchronized void clearPacketOpalInternal() { getPacketOpalHashSet().clear(); }

	private java.util.HashSet<RoomOpal> myOldRoomOpalHashSet = null;
	private java.util.HashSet<RoomOpal> myNewRoomOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<RoomOpal>> myRoomOpalCachedOperations = null;

	/* package */ java.util.HashSet<RoomOpal> getRoomOpalHashSet() {
		if (tryAccess()) {
			if (myNewRoomOpalHashSet == null) {
				if (myOldRoomOpalHashSet == null) {
					if (isNew()) {
						myOldRoomOpalHashSet = new java.util.HashSet<>();
					} else {
						myOldRoomOpalHashSet = OpalFactoryFactory.getInstance().getRoomOpalFactory().forTournamentCodeCollection(getCode());
					}
				}
				myNewRoomOpalHashSet = new java.util.HashSet<>(myOldRoomOpalHashSet);
				if (myRoomOpalCachedOperations != null) {
					OpalUtility.handleCachedOperations(myRoomOpalCachedOperations, myNewRoomOpalHashSet);
					myRoomOpalCachedOperations = null;
				}
			}
			return myNewRoomOpalHashSet;
		} else {
			if (myOldRoomOpalHashSet == null) {
				myOldRoomOpalHashSet = OpalFactoryFactory.getInstance().getRoomOpalFactory().forTournamentCodeCollection(getCode());
			}
			return myOldRoomOpalHashSet;
		}
	}

	public synchronized void addRoomOpal(RoomOpal argRoomOpal) {
		tryMutate();
		argRoomOpal.setTournamentOpal(this);
		return;
	}

	protected synchronized void addRoomOpalInternal(RoomOpal argRoomOpal) {
		tryMutate();
		if (myNewRoomOpalHashSet == null) {
			if (myOldRoomOpalHashSet == null) {
				if (myRoomOpalCachedOperations == null) { myRoomOpalCachedOperations = new java.util.ArrayList<>(); }
				myRoomOpalCachedOperations.add(new CachedOperation<>(CachedOperation.ADD, argRoomOpal));
			} else {
				myNewRoomOpalHashSet = new java.util.HashSet<>(myOldRoomOpalHashSet);
				myNewRoomOpalHashSet.add(argRoomOpal);
			}
		} else {
			myNewRoomOpalHashSet.add(argRoomOpal);
		}
		return;
	}

	public synchronized void removeRoomOpal(RoomOpal argRoomOpal) {
		tryMutate();
		argRoomOpal.setTournamentOpal(null);
	}

	protected synchronized void removeRoomOpalInternal(RoomOpal argRoomOpal) {
		tryMutate();
		if (myNewRoomOpalHashSet == null) {
			if (myOldRoomOpalHashSet == null) {
				if (myRoomOpalCachedOperations == null) { myRoomOpalCachedOperations = new java.util.ArrayList<>(); }
				myRoomOpalCachedOperations.add(new CachedOperation<>(CachedOperation.REMOVE, argRoomOpal));
			} else {
				myNewRoomOpalHashSet = new java.util.HashSet<>(myOldRoomOpalHashSet);
				myNewRoomOpalHashSet.remove(argRoomOpal);
			}
		} else {
			myNewRoomOpalHashSet.remove(argRoomOpal);
		}
		return;
	}

	public synchronized int getRoomOpalCount() { return getRoomOpalHashSet().size(); }

	public synchronized java.util.Iterator<RoomOpal> createRoomOpalIterator() {
		return getRoomOpalHashSet().iterator();
	}

	public synchronized java.util.stream.Stream<RoomOpal> streamRoomOpal() {
		return getRoomOpalHashSet().stream();
	}

	public synchronized void clearRoomOpalInternal() { getRoomOpalHashSet().clear(); }

	@Override
	public String toString() {
		StringBuilder lclSB =  new StringBuilder(64);
		lclSB.append("TournamentOpal[");
		lclSB.append("myCode=");
		lclSB.append(toStringField(3));
		lclSB.append(']');
		return lclSB.toString();
	}

	@Override
	protected void updateReferencesAfterReload() {
		if (myNewControlRoomOpal != RoomOpal.NOT_YET_LOADED) {
			setControlRoomOpal(retrieveControlRoomOpal(getNewValues()));
		}
		if (myNewTournamentDirectorContactOpal != ContactOpal.NOT_YET_LOADED) {
			setTournamentDirectorContactOpal(retrieveTournamentDirectorContactOpal(getNewValues()));
		}
	}

	@Override
	protected void updateCollectionsAfterReload() {
		assert needsToClearOldCollections() == false;
		setClearOldCollections(true);
	}

}
