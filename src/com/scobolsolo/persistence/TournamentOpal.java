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

		myPhaseSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
				this,
				ourPhaseOpalLoader,
				true
				);
		mySchoolRegistrationSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
				this,
				ourSchoolRegistrationOpalLoader,
				true
				);
		myStaffSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
				this,
				ourStaffOpalLoader,
				true
				);
		myCategoryUseSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
				this,
				ourCategoryUseOpalLoader,
				true
				);
		myPacketSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
				this,
				ourPacketOpalLoader,
				true
				);
		myRoomSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
				this,
				ourRoomOpalLoader,
				true
				);

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
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		myOldControlRoomOpal = myNewControlRoomOpal;
		myOldTournamentDirectorContactOpal = myNewTournamentDirectorContactOpal;

		return;
	}

	@Override
	protected void unlinkInternal() {
		getPhaseOpalSet().clear();
		getSchoolRegistrationOpalSet().clear();
		getStaffOpalSet().clear();
		getCategoryUseOpalSet().clear();
		getPacketOpalSet().clear();
		getRoomOpalSet().clear();
		if (getControlRoomOpal() != null) {
			getControlRoomOpal().getControlRoomTournamentOpalSet().removeInternal(this);
		}
		if (getTournamentDirectorContactOpal() != null) {
			getTournamentDirectorContactOpal().getTournamentDirectorTournamentOpalSet().removeInternal(this);
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
		if (lclUO != null && (lclUO.exists() == false)) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		if ((lclUO = myOldTournamentDirectorContactOpal) == ContactOpal.NOT_YET_LOADED) {
			lclUO = myOldTournamentDirectorContactOpal = retrieveTournamentDirectorContactOpal(getOldValues());
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
			lclRoomOpal.getControlRoomTournamentOpalSet().removeInternal(this);
		}
		myNewControlRoomOpal = argRoomOpal;
		if (argRoomOpal != null) {
			argRoomOpal.getControlRoomTournamentOpalSet().addInternal(this);
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
			lclContactOpal.getTournamentDirectorTournamentOpalSet().removeInternal(this);
		}
		myNewTournamentDirectorContactOpal = argContactOpal;
		if (argContactOpal != null) {
			argContactOpal.getTournamentDirectorTournamentOpalSet().addInternal(this);
		}
		return this;
	}

	protected synchronized void setTournamentDirectorContactOpalInternal(ContactOpal argContactOpal) {
		tryMutate();
		myNewTournamentDirectorContactOpal = argContactOpal;
	}

	private com.opal.types.OpalBackCollectionSet<PhaseOpal, TournamentOpal> myPhaseSet = null;

	private static final com.opal.types.OpalBackCollectionLoader<PhaseOpal, TournamentOpal> ourPhaseOpalLoader = 
			new com.opal.types.OpalBackCollectionLoader<>(
					OpalFactoryFactory.getInstance().getPhaseOpalFactory()::forTournamentOpalCollection,
					OpalFactoryFactory.getInstance().getPhaseOpalFactory()::forTournamentOpalCount,
					PhaseOpal::setTournamentOpal,
					PhaseOpal::setTournamentOpalInternal,
					PhaseOpal::getTournamentOpal,
					com.scobolsolo.application.FactoryMap.getNoArgCtorSetCreator(),
					com.scobolsolo.application.FactoryMap.getCollectionArgSetCreator(),
					false
					);

	/* package */ synchronized com.opal.types.OpalBackCollectionSet<PhaseOpal, TournamentOpal> getPhaseOpalSet() {
		if (myPhaseSet == null) {
			myPhaseSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
					this,
					ourPhaseOpalLoader,
					isNew()
					);
		}
		return myPhaseSet;
	}

	private com.opal.types.OpalBackCollectionSet<SchoolRegistrationOpal, TournamentOpal> mySchoolRegistrationSet = null;

	private static final com.opal.types.OpalBackCollectionLoader<SchoolRegistrationOpal, TournamentOpal> ourSchoolRegistrationOpalLoader = 
			new com.opal.types.OpalBackCollectionLoader<>(
					OpalFactoryFactory.getInstance().getSchoolRegistrationOpalFactory()::forTournamentOpalCollection,
					OpalFactoryFactory.getInstance().getSchoolRegistrationOpalFactory()::forTournamentOpalCount,
					SchoolRegistrationOpal::setTournamentOpal,
					SchoolRegistrationOpal::setTournamentOpalInternal,
					SchoolRegistrationOpal::getTournamentOpal,
					com.scobolsolo.application.FactoryMap.getNoArgCtorSetCreator(),
					com.scobolsolo.application.FactoryMap.getCollectionArgSetCreator(),
					false
					);

	/* package */ synchronized com.opal.types.OpalBackCollectionSet<SchoolRegistrationOpal, TournamentOpal> getSchoolRegistrationOpalSet() {
		if (mySchoolRegistrationSet == null) {
			mySchoolRegistrationSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
					this,
					ourSchoolRegistrationOpalLoader,
					isNew()
					);
		}
		return mySchoolRegistrationSet;
	}

	private com.opal.types.OpalBackCollectionSet<StaffOpal, TournamentOpal> myStaffSet = null;

	private static final com.opal.types.OpalBackCollectionLoader<StaffOpal, TournamentOpal> ourStaffOpalLoader = 
			new com.opal.types.OpalBackCollectionLoader<>(
					OpalFactoryFactory.getInstance().getStaffOpalFactory()::forTournamentOpalCollection,
					OpalFactoryFactory.getInstance().getStaffOpalFactory()::forTournamentOpalCount,
					StaffOpal::setTournamentOpal,
					StaffOpal::setTournamentOpalInternal,
					StaffOpal::getTournamentOpal,
					com.scobolsolo.application.FactoryMap.getNoArgCtorSetCreator(),
					com.scobolsolo.application.FactoryMap.getCollectionArgSetCreator(),
					false
					);

	/* package */ synchronized com.opal.types.OpalBackCollectionSet<StaffOpal, TournamentOpal> getStaffOpalSet() {
		if (myStaffSet == null) {
			myStaffSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
					this,
					ourStaffOpalLoader,
					isNew()
					);
		}
		return myStaffSet;
	}

	private com.opal.types.OpalBackCollectionSet<CategoryUseOpal, TournamentOpal> myCategoryUseSet = null;

	private static final com.opal.types.OpalBackCollectionLoader<CategoryUseOpal, TournamentOpal> ourCategoryUseOpalLoader = 
			new com.opal.types.OpalBackCollectionLoader<>(
					OpalFactoryFactory.getInstance().getCategoryUseOpalFactory()::forTournamentOpalCollection,
					OpalFactoryFactory.getInstance().getCategoryUseOpalFactory()::forTournamentOpalCount,
					CategoryUseOpal::setTournamentOpal,
					CategoryUseOpal::setTournamentOpalInternal,
					CategoryUseOpal::getTournamentOpal,
					com.scobolsolo.application.FactoryMap.getNoArgCtorSetCreator(),
					com.scobolsolo.application.FactoryMap.getCollectionArgSetCreator(),
					false
					);

	/* package */ synchronized com.opal.types.OpalBackCollectionSet<CategoryUseOpal, TournamentOpal> getCategoryUseOpalSet() {
		if (myCategoryUseSet == null) {
			myCategoryUseSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
					this,
					ourCategoryUseOpalLoader,
					isNew()
					);
		}
		return myCategoryUseSet;
	}

	private com.opal.types.OpalBackCollectionSet<PacketOpal, TournamentOpal> myPacketSet = null;

	private static final com.opal.types.OpalBackCollectionLoader<PacketOpal, TournamentOpal> ourPacketOpalLoader = 
			new com.opal.types.OpalBackCollectionLoader<>(
					OpalFactoryFactory.getInstance().getPacketOpalFactory()::forTournamentOpalCollection,
					OpalFactoryFactory.getInstance().getPacketOpalFactory()::forTournamentOpalCount,
					PacketOpal::setTournamentOpal,
					PacketOpal::setTournamentOpalInternal,
					PacketOpal::getTournamentOpal,
					com.scobolsolo.application.FactoryMap.getNoArgCtorSetCreator(),
					com.scobolsolo.application.FactoryMap.getCollectionArgSetCreator(),
					false
					);

	/* package */ synchronized com.opal.types.OpalBackCollectionSet<PacketOpal, TournamentOpal> getPacketOpalSet() {
		if (myPacketSet == null) {
			myPacketSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
					this,
					ourPacketOpalLoader,
					isNew()
					);
		}
		return myPacketSet;
	}

	private com.opal.types.OpalBackCollectionSet<RoomOpal, TournamentOpal> myRoomSet = null;

	private static final com.opal.types.OpalBackCollectionLoader<RoomOpal, TournamentOpal> ourRoomOpalLoader = 
			new com.opal.types.OpalBackCollectionLoader<>(
					OpalFactoryFactory.getInstance().getRoomOpalFactory()::forTournamentOpalCollection,
					OpalFactoryFactory.getInstance().getRoomOpalFactory()::forTournamentOpalCount,
					RoomOpal::setTournamentOpal,
					RoomOpal::setTournamentOpalInternal,
					RoomOpal::getTournamentOpal,
					com.scobolsolo.application.FactoryMap.getNoArgCtorSetCreator(),
					com.scobolsolo.application.FactoryMap.getCollectionArgSetCreator(),
					false
					);

	/* package */ synchronized com.opal.types.OpalBackCollectionSet<RoomOpal, TournamentOpal> getRoomOpalSet() {
		if (myRoomSet == null) {
			myRoomSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
					this,
					ourRoomOpalLoader,
					isNew()
					);
		}
		return myRoomSet;
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
