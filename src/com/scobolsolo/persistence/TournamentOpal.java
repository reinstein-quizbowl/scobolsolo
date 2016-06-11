package com.scobolsolo.persistence;

import com.scobolsolo.application.Tournament;

public final class TournamentOpal extends com.opal.UpdatableOpal<Tournament> {

	public static final java.lang.Boolean ourDefaultTiebreakerSuddenDeath = java.lang.Boolean.TRUE;
	public static final java.lang.Boolean ourDefaultQuestionsComplete = java.lang.Boolean.FALSE;

	private TournamentOpal() {
		super();
		setUserFacing(null);
	}

	public TournamentOpal(com.opal.IdentityOpalFactory<Tournament, TournamentOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void applyDefaults() {
		/* Initialize fields with their default values. */
		getNewValues()[5] = ourDefaultTiebreakerSuddenDeath;
		getNewValues()[15] = ourDefaultQuestionsComplete;


		/* Initialize the back Collections to empty sets. */

		myNewPhaseOpalFast3Set = new com.siliconage.util.Fast3Set<>();
		myNewSchoolRegistrationOpalHashSet = new java.util.HashSet<>();
		myNewStaffOpalHashSet = new java.util.HashSet<>();
		myNewCategoryUseOpalHashSet = new java.util.HashSet<>();
		myNewPacketOpalHashSet = new java.util.HashSet<>();
		myNewRoomOpalHashSet = new java.util.HashSet<>();

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
		"QuestionDownloadUrl",
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
		java.lang.String.class,
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
	public com.opal.FieldValidator[] getFieldValidators() { return ourFieldValidators; }

	@Override
	public boolean[] getFieldNullability() { return ourFieldNullability; }

	public static com.opal.FieldValidator[] getStaticFieldValidators() { return ourFieldValidators; }


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

	public synchronized java.lang.String getQuestionDownloadUrl() {
		return (java.lang.String) getReadValueSet()[16];
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
			throw new com.opal.ArgumentTooLongException("Cannot set myName on " + this + " to \"" + argName + "\" because that field's maximum length is 256.", argName.length(), 256);
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
			throw new com.opal.ArgumentTooLongException("Cannot set myShortName on " + this + " to \"" + argShortName + "\" because that field's maximum length is 32.", argShortName.length(), 32);
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
			throw new com.opal.ArgumentTooLongException("Cannot set myCode on " + this + " to \"" + argCode + "\" because that field's maximum length is 32.", argCode.length(), 32);
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
			throw new com.opal.ArgumentTooLongException("Cannot set myWebXmlRoleCode on " + this + " to \"" + argWebXmlRoleCode + "\" because that field's maximum length is 32.", argWebXmlRoleCode.length(), 32);
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
			throw new com.opal.ArgumentTooLongException("Cannot set myChampionshipMatchUrl on " + this + " to \"" + argChampionshipMatchUrl + "\" because that field's maximum length is 256.", argChampionshipMatchUrl.length(), 256);
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

	public synchronized TournamentOpal setQuestionDownloadUrl(final java.lang.String argQuestionDownloadUrl) {
		tryMutate();
		getNewValues()[16] = argQuestionDownloadUrl;
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
		myNewPhaseOpalFast3Set = null; /* Necessary if it has been rolled back */
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
			myOldPhaseOpalFast3Set = null;
			myOldSchoolRegistrationOpalHashSet = null;
			myOldStaffOpalHashSet = null;
			myOldCategoryUseOpalHashSet = null;
			myOldPacketOpalHashSet = null;
			myOldRoomOpalHashSet = null;
		} else {
			if (myNewPhaseOpalFast3Set != null) {
				if (myNewPhaseOpalFast3Set.size() > 0) {
					myOldPhaseOpalFast3Set = myNewPhaseOpalFast3Set;
				} else {
					myOldPhaseOpalFast3Set = java.util.Collections.emptySet();
				}
				myNewPhaseOpalFast3Set = null;
			} else {
				myPhaseOpalCachedOperations = null;
			}
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
			if (myNewStaffOpalHashSet != null) {
				if (myNewStaffOpalHashSet.size() > 0) {
					myOldStaffOpalHashSet = myNewStaffOpalHashSet;
				} else {
					myOldStaffOpalHashSet = java.util.Collections.emptySet();
				}
				myNewStaffOpalHashSet = null;
			} else {
				myStaffOpalCachedOperations = null;
			}
			if (myNewCategoryUseOpalHashSet != null) {
				if (myNewCategoryUseOpalHashSet.size() > 0) {
					myOldCategoryUseOpalHashSet = myNewCategoryUseOpalHashSet;
				} else {
					myOldCategoryUseOpalHashSet = java.util.Collections.emptySet();
				}
				myNewCategoryUseOpalHashSet = null;
			} else {
				myCategoryUseOpalCachedOperations = null;
			}
			if (myNewPacketOpalHashSet != null) {
				if (myNewPacketOpalHashSet.size() > 0) {
					myOldPacketOpalHashSet = myNewPacketOpalHashSet;
				} else {
					myOldPacketOpalHashSet = java.util.Collections.emptySet();
				}
				myNewPacketOpalHashSet = null;
			} else {
				myPacketOpalCachedOperations = null;
			}
			if (myNewRoomOpalHashSet != null) {
				if (myNewRoomOpalHashSet.size() > 0) {
					myOldRoomOpalHashSet = myNewRoomOpalHashSet;
				} else {
					myOldRoomOpalHashSet = java.util.Collections.emptySet();
				}
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
		if (myNewPhaseOpalFast3Set != null || myPhaseOpalCachedOperations != null) {
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
	protected void copyFieldsToInternal(com.opal.UpdatableOpal<Tournament> argTarget) {
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
		lclTargetNewValues[16] = lclValues[16]; /* QuestionDownloadUrl (immutable) */

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
		com.opal.UpdatableOpal<?> lclUO;
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
		if (isNew()) {
			return java.util.Collections.emptySet();
		}
		java.util.Set<com.opal.TransactionAware> lclTAs = null;
		com.opal.UpdatableOpal<?> lclUO;
		if ((lclUO = myOldControlRoomOpal) == RoomOpal.NOT_YET_LOADED) {
			lclUO = myOldControlRoomOpal = retrieveControlRoomOpal(getOldValues());
		}
		if (lclUO != null && lclUO.isDeleted()) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		if ((lclUO = myOldTournamentDirectorContactOpal) == ContactOpal.NOT_YET_LOADED) {
			lclUO = myOldTournamentDirectorContactOpal = retrieveTournamentDirectorContactOpal(getOldValues());
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
		return new Object[] {getOldValues()[3], };
	}

	private static int getFieldCountInternal() { return ourFieldNames.length; }

	@Override
	protected int getFieldCount() { return getFieldCountInternal(); }

	@Override
	protected String[] getFieldNames() { return ourFieldNames; }

	@Override
	public synchronized void output(final java.io.PrintStream argOutput) {
		argOutput.println("Date = " + getDate());
		argOutput.println("Name = " + getName());
		argOutput.println("ShortName = " + getShortName());
		argOutput.println("Code = " + getCode());
		argOutput.println("WebXmlRoleCode = " + getWebXmlRoleCode());
		argOutput.println("TiebreakerSuddenDeath = " + isTiebreakerSuddenDeathAsObject());
		argOutput.println("Url = " + getUrl());
		argOutput.println("TournamentDirectorContactId = " + getTournamentDirectorContactIdAsObject());
		argOutput.println("PlayerMessage = " + getPlayerMessage());
		argOutput.println("StaffMessage = " + getStaffMessage());
		argOutput.println("ReplacementQuestionSocialMediaPolicy = " + getReplacementQuestionSocialMediaPolicy());
		argOutput.println("SchoolMessage = " + getSchoolMessage());
		argOutput.println("ControlRoomRoomId = " + getControlRoomRoomIdAsObject());
		argOutput.println("ChampionshipRules = " + getChampionshipRules());
		argOutput.println("ChampionshipMatchUrl = " + getChampionshipMatchUrl());
		argOutput.println("QuestionsComplete = " + isQuestionsCompleteAsObject());
		argOutput.println("QuestionDownloadUrl = " + getQuestionDownloadUrl());
	}

	@Override
	public synchronized void output(final java.io.PrintWriter argOutput) {
		argOutput.println("Date = " + getDate());
		argOutput.println("Name = " + getName());
		argOutput.println("ShortName = " + getShortName());
		argOutput.println("Code = " + getCode());
		argOutput.println("WebXmlRoleCode = " + getWebXmlRoleCode());
		argOutput.println("TiebreakerSuddenDeath = " + isTiebreakerSuddenDeathAsObject());
		argOutput.println("Url = " + getUrl());
		argOutput.println("TournamentDirectorContactId = " + getTournamentDirectorContactIdAsObject());
		argOutput.println("PlayerMessage = " + getPlayerMessage());
		argOutput.println("StaffMessage = " + getStaffMessage());
		argOutput.println("ReplacementQuestionSocialMediaPolicy = " + getReplacementQuestionSocialMediaPolicy());
		argOutput.println("SchoolMessage = " + getSchoolMessage());
		argOutput.println("ControlRoomRoomId = " + getControlRoomRoomIdAsObject());
		argOutput.println("ChampionshipRules = " + getChampionshipRules());
		argOutput.println("ChampionshipMatchUrl = " + getChampionshipMatchUrl());
		argOutput.println("QuestionsComplete = " + isQuestionsCompleteAsObject());
		argOutput.println("QuestionDownloadUrl = " + getQuestionDownloadUrl());
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

	private java.util.Set<PhaseOpal> myOldPhaseOpalFast3Set = null;
	private java.util.Set<PhaseOpal> myNewPhaseOpalFast3Set = null;
	private java.util.ArrayList<com.opal.CachedOperation<PhaseOpal>> myPhaseOpalCachedOperations = null;

	/* package */ java.util.Set<PhaseOpal> getPhaseOpalFast3Set() {
		if (tryAccess()) {
			if (myNewPhaseOpalFast3Set == null) {
				if (myOldPhaseOpalFast3Set == null) {
					if (isNew()) {
						myOldPhaseOpalFast3Set = java.util.Collections.emptySet();
					} else {
						java.util.Set<PhaseOpal> lclS;
						lclS = OpalFactoryFactory.getInstance().getPhaseOpalFactory().forTournamentCodeCollection(getCode());
						myOldPhaseOpalFast3Set = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
					}
				}
				myNewPhaseOpalFast3Set = new com.siliconage.util.Fast3Set<>(myOldPhaseOpalFast3Set);
				if (myPhaseOpalCachedOperations != null) {
					com.opal.OpalUtility.handleCachedOperations(myPhaseOpalCachedOperations, myNewPhaseOpalFast3Set);
					myPhaseOpalCachedOperations = null;
				}
			}
			return myNewPhaseOpalFast3Set;
		} else {
			if (myOldPhaseOpalFast3Set == null) {
				java.util.Set<PhaseOpal> lclS;
				lclS = OpalFactoryFactory.getInstance().getPhaseOpalFactory().forTournamentCodeCollection(getCode());
				myOldPhaseOpalFast3Set = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
			}
			return myOldPhaseOpalFast3Set;
		}
	}

	public synchronized void addPhaseOpal(PhaseOpal argPhaseOpal) {
		tryMutate();
		argPhaseOpal.setTournamentOpal(this);
		return;
	}

	protected synchronized void addPhaseOpalInternal(PhaseOpal argPhaseOpal) {
		tryMutate();
		if (myNewPhaseOpalFast3Set == null) {
			if (myOldPhaseOpalFast3Set == null) {
				if (myPhaseOpalCachedOperations == null) { myPhaseOpalCachedOperations = new java.util.ArrayList<>(); }
				myPhaseOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.ADD, argPhaseOpal));
			} else {
				myNewPhaseOpalFast3Set = new com.siliconage.util.Fast3Set<>(myOldPhaseOpalFast3Set);
				myNewPhaseOpalFast3Set.add(argPhaseOpal);
			}
		} else {
			myNewPhaseOpalFast3Set.add(argPhaseOpal);
		}
		return;
	}

	public synchronized void removePhaseOpal(PhaseOpal argPhaseOpal) {
		tryMutate();
		argPhaseOpal.setTournamentOpal(null);
	}

	protected synchronized void removePhaseOpalInternal(PhaseOpal argPhaseOpal) {
		tryMutate();
		if (myNewPhaseOpalFast3Set == null) {
			if (myOldPhaseOpalFast3Set == null) {
				if (myPhaseOpalCachedOperations == null) { myPhaseOpalCachedOperations = new java.util.ArrayList<>(); }
				myPhaseOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.REMOVE, argPhaseOpal));
			} else {
				myNewPhaseOpalFast3Set = new com.siliconage.util.Fast3Set<>(myOldPhaseOpalFast3Set);
				myNewPhaseOpalFast3Set.remove(argPhaseOpal);
			}
		} else {
			myNewPhaseOpalFast3Set.remove(argPhaseOpal);
		}
		return;
	}

	public synchronized int getPhaseOpalCount() { return getPhaseOpalFast3Set().size(); }

	public synchronized java.util.Iterator<PhaseOpal> createPhaseOpalIterator() {
		return getPhaseOpalFast3Set().iterator();
	}

	public synchronized java.util.stream.Stream<PhaseOpal> streamPhaseOpal() {
		return getPhaseOpalFast3Set().stream();
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
						lclS = OpalFactoryFactory.getInstance().getSchoolRegistrationOpalFactory().forTournamentCodeCollection(getCode());
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
				lclS = OpalFactoryFactory.getInstance().getSchoolRegistrationOpalFactory().forTournamentCodeCollection(getCode());
				myOldSchoolRegistrationOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
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
		argSchoolRegistrationOpal.setTournamentOpal(null);
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

	private java.util.Set<StaffOpal> myOldStaffOpalHashSet = null;
	private java.util.Set<StaffOpal> myNewStaffOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<StaffOpal>> myStaffOpalCachedOperations = null;

	/* package */ java.util.Set<StaffOpal> getStaffOpalHashSet() {
		if (tryAccess()) {
			if (myNewStaffOpalHashSet == null) {
				if (myOldStaffOpalHashSet == null) {
					if (isNew()) {
						myOldStaffOpalHashSet = java.util.Collections.emptySet();
					} else {
						java.util.Set<StaffOpal> lclS;
						lclS = OpalFactoryFactory.getInstance().getStaffOpalFactory().forTournamentCodeCollection(getCode());
						myOldStaffOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
					}
				}
				myNewStaffOpalHashSet = new java.util.HashSet<>(myOldStaffOpalHashSet);
				if (myStaffOpalCachedOperations != null) {
					com.opal.OpalUtility.handleCachedOperations(myStaffOpalCachedOperations, myNewStaffOpalHashSet);
					myStaffOpalCachedOperations = null;
				}
			}
			return myNewStaffOpalHashSet;
		} else {
			if (myOldStaffOpalHashSet == null) {
				java.util.Set<StaffOpal> lclS;
				lclS = OpalFactoryFactory.getInstance().getStaffOpalFactory().forTournamentCodeCollection(getCode());
				myOldStaffOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
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
				myStaffOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.ADD, argStaffOpal));
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
				myStaffOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.REMOVE, argStaffOpal));
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

	private java.util.Set<CategoryUseOpal> myOldCategoryUseOpalHashSet = null;
	private java.util.Set<CategoryUseOpal> myNewCategoryUseOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<CategoryUseOpal>> myCategoryUseOpalCachedOperations = null;

	/* package */ java.util.Set<CategoryUseOpal> getCategoryUseOpalHashSet() {
		if (tryAccess()) {
			if (myNewCategoryUseOpalHashSet == null) {
				if (myOldCategoryUseOpalHashSet == null) {
					if (isNew()) {
						myOldCategoryUseOpalHashSet = java.util.Collections.emptySet();
					} else {
						java.util.Set<CategoryUseOpal> lclS;
						lclS = OpalFactoryFactory.getInstance().getCategoryUseOpalFactory().forTournamentCodeCollection(getCode());
						myOldCategoryUseOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
					}
				}
				myNewCategoryUseOpalHashSet = new java.util.HashSet<>(myOldCategoryUseOpalHashSet);
				if (myCategoryUseOpalCachedOperations != null) {
					com.opal.OpalUtility.handleCachedOperations(myCategoryUseOpalCachedOperations, myNewCategoryUseOpalHashSet);
					myCategoryUseOpalCachedOperations = null;
				}
			}
			return myNewCategoryUseOpalHashSet;
		} else {
			if (myOldCategoryUseOpalHashSet == null) {
				java.util.Set<CategoryUseOpal> lclS;
				lclS = OpalFactoryFactory.getInstance().getCategoryUseOpalFactory().forTournamentCodeCollection(getCode());
				myOldCategoryUseOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
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
				myCategoryUseOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.ADD, argCategoryUseOpal));
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
				myCategoryUseOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.REMOVE, argCategoryUseOpal));
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

	private java.util.Set<PacketOpal> myOldPacketOpalHashSet = null;
	private java.util.Set<PacketOpal> myNewPacketOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<PacketOpal>> myPacketOpalCachedOperations = null;

	/* package */ java.util.Set<PacketOpal> getPacketOpalHashSet() {
		if (tryAccess()) {
			if (myNewPacketOpalHashSet == null) {
				if (myOldPacketOpalHashSet == null) {
					if (isNew()) {
						myOldPacketOpalHashSet = java.util.Collections.emptySet();
					} else {
						java.util.Set<PacketOpal> lclS;
						lclS = OpalFactoryFactory.getInstance().getPacketOpalFactory().forTournamentCodeCollection(getCode());
						myOldPacketOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
					}
				}
				myNewPacketOpalHashSet = new java.util.HashSet<>(myOldPacketOpalHashSet);
				if (myPacketOpalCachedOperations != null) {
					com.opal.OpalUtility.handleCachedOperations(myPacketOpalCachedOperations, myNewPacketOpalHashSet);
					myPacketOpalCachedOperations = null;
				}
			}
			return myNewPacketOpalHashSet;
		} else {
			if (myOldPacketOpalHashSet == null) {
				java.util.Set<PacketOpal> lclS;
				lclS = OpalFactoryFactory.getInstance().getPacketOpalFactory().forTournamentCodeCollection(getCode());
				myOldPacketOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
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
				myPacketOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.ADD, argPacketOpal));
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
				myPacketOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.REMOVE, argPacketOpal));
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

	private java.util.Set<RoomOpal> myOldRoomOpalHashSet = null;
	private java.util.Set<RoomOpal> myNewRoomOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<RoomOpal>> myRoomOpalCachedOperations = null;

	/* package */ java.util.Set<RoomOpal> getRoomOpalHashSet() {
		if (tryAccess()) {
			if (myNewRoomOpalHashSet == null) {
				if (myOldRoomOpalHashSet == null) {
					if (isNew()) {
						myOldRoomOpalHashSet = java.util.Collections.emptySet();
					} else {
						java.util.Set<RoomOpal> lclS;
						lclS = OpalFactoryFactory.getInstance().getRoomOpalFactory().forTournamentCodeCollection(getCode());
						myOldRoomOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
					}
				}
				myNewRoomOpalHashSet = new java.util.HashSet<>(myOldRoomOpalHashSet);
				if (myRoomOpalCachedOperations != null) {
					com.opal.OpalUtility.handleCachedOperations(myRoomOpalCachedOperations, myNewRoomOpalHashSet);
					myRoomOpalCachedOperations = null;
				}
			}
			return myNewRoomOpalHashSet;
		} else {
			if (myOldRoomOpalHashSet == null) {
				java.util.Set<RoomOpal> lclS;
				lclS = OpalFactoryFactory.getInstance().getRoomOpalFactory().forTournamentCodeCollection(getCode());
				myOldRoomOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
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
				myRoomOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.ADD, argRoomOpal));
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
				myRoomOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.REMOVE, argRoomOpal));
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

	@Override
	public java.lang.String toString() {
		java.lang.StringBuilder lclSB = new java.lang.StringBuilder(64);
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
