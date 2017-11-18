package com.scobolsolo.persistence;

import com.scobolsolo.application.Account;

public final class AccountOpal extends com.opal.UpdatableOpal<Account> {

	public static final java.lang.String ourDefaultPasswordHash = "$2a$16$XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
	public static final java.lang.Boolean ourDefaultAdministrator = java.lang.Boolean.FALSE;
	public static final java.lang.Boolean ourDefaultActive = java.lang.Boolean.TRUE;
	public static final java.lang.Boolean ourDefaultWriter = java.lang.Boolean.FALSE;
	public static final java.lang.Boolean ourDefaultCanReceiveUnsolicitedMessages = java.lang.Boolean.FALSE;

	private AccountOpal() {
		super();
		setUserFacing(null);
	}

	public AccountOpal(com.opal.IdentityOpalFactory<Account, AccountOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void applyDefaults() {
		/* Initialize fields with their default values. */
		getNewValues()[2] = ourDefaultPasswordHash;
		getNewValues()[3] = ourDefaultAdministrator;
		getNewValues()[4] = ourDefaultActive;
		getNewValues()[5] = ourDefaultWriter;
		getNewValues()[8] = ourDefaultCanReceiveUnsolicitedMessages;


		/* Initialize the back Collections to empty sets. */

		myPronunciationGuideSuppressionSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
				this,
				ourPronunciationGuideSuppressionOpalLoader,
				true
				);
		myWriterQuestionSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
				this,
				ourWriterQuestionOpalLoader,
				true
				);
		myEditorDiffSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
				this,
				ourEditorDiffOpalLoader,
				true
				);
		myFromMessageSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
				this,
				ourFromMessageOpalLoader,
				true
				);
		myToMessageSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
				this,
				ourToMessageOpalLoader,
				true
				);

		return;
	}

	@Override
	protected void initializeReferences() {
		myOldContactOpal = ContactOpal.NOT_YET_LOADED;
		return;
	}

	/* package */ static final String[] ourFieldNames = new String[] {
		"Id",
		"Username",
		"PasswordHash",
		"Administrator",
		"Active",
		"Writer",
		"PasswordResetToken",
		"PasswordResetTokenExpiration",
		"CanReceiveUnsolicitedMessages",
		"MessageEmailNotifications",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.Integer.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.Boolean.class,
		java.lang.Boolean.class,
		java.lang.Boolean.class,
		java.lang.String.class,
		java.time.LocalDateTime.class,
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
	};

	public static final AccountOpal NOT_YET_LOADED = new AccountOpal();

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

	public synchronized java.lang.String getUsername() {
		return (java.lang.String) getReadValueSet()[1];
	}

	public synchronized java.lang.String getPasswordHash() {
		return (java.lang.String) getReadValueSet()[2];
	}

	public synchronized java.lang.Boolean isAdministratorAsObject() {
		return (java.lang.Boolean) getReadValueSet()[3];
	}

	public synchronized java.lang.Boolean isActiveAsObject() {
		return (java.lang.Boolean) getReadValueSet()[4];
	}

	public synchronized java.lang.Boolean isWriterAsObject() {
		return (java.lang.Boolean) getReadValueSet()[5];
	}

	public synchronized java.lang.String getPasswordResetToken() {
		return (java.lang.String) getReadValueSet()[6];
	}

	public synchronized java.time.LocalDateTime getPasswordResetTokenExpiration() {
		return (java.time.LocalDateTime) getReadValueSet()[7];
	}

	public synchronized java.lang.Boolean isCanReceiveUnsolicitedMessagesAsObject() {
		return (java.lang.Boolean) getReadValueSet()[8];
	}

	public synchronized java.lang.String getMessageEmailNotifications() {
		return (java.lang.String) getReadValueSet()[9];
	}

	public synchronized AccountOpal setId(final java.lang.Integer argId) {
		tryMutate();
		if (argId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myId on " + this + " to null.");
		}
		getNewValues()[0] = argId;
		return this;
	}

	public AccountOpal setId(final int argId) {
		setId(java.lang.Integer.valueOf(argId));
		return this;
	}

	public synchronized AccountOpal setUsername(final java.lang.String argUsername) {
		tryMutate();
		if (argUsername == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myUsername on " + this + " to null.");
		}
		if (argUsername.length() > 64) {
			throw new com.opal.ArgumentTooLongException("Cannot set myUsername on " + this + " to \"" + argUsername + "\" because that field's maximum length is 64.", argUsername.length(), 64);
		}
		getNewValues()[1] = argUsername;
		return this;
	}

	public synchronized AccountOpal setPasswordHash(final java.lang.String argPasswordHash) {
		tryMutate();
		if (argPasswordHash == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myPasswordHash on " + this + " to null.");
		}
		if (argPasswordHash.length() > 60) {
			throw new com.opal.ArgumentTooLongException("Cannot set myPasswordHash on " + this + " to \"" + argPasswordHash + "\" because that field's maximum length is 60.", argPasswordHash.length(), 60);
		}
		getNewValues()[2] = argPasswordHash;
		return this;
	}

	public synchronized AccountOpal setAdministrator(final java.lang.Boolean argAdministrator) {
		tryMutate();
		if (argAdministrator == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myAdministrator on " + this + " to null.");
		}
		getNewValues()[3] = argAdministrator;
		return this;
	}

	public AccountOpal setAdministrator(final boolean argAdministrator) {
		setAdministrator(argAdministrator ? Boolean.TRUE : Boolean.FALSE);
		return this;
	}

	public synchronized AccountOpal setActive(final java.lang.Boolean argActive) {
		tryMutate();
		if (argActive == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myActive on " + this + " to null.");
		}
		getNewValues()[4] = argActive;
		return this;
	}

	public AccountOpal setActive(final boolean argActive) {
		setActive(argActive ? Boolean.TRUE : Boolean.FALSE);
		return this;
	}

	public synchronized AccountOpal setWriter(final java.lang.Boolean argWriter) {
		tryMutate();
		if (argWriter == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myWriter on " + this + " to null.");
		}
		getNewValues()[5] = argWriter;
		return this;
	}

	public AccountOpal setWriter(final boolean argWriter) {
		setWriter(argWriter ? Boolean.TRUE : Boolean.FALSE);
		return this;
	}

	public synchronized AccountOpal setPasswordResetToken(final java.lang.String argPasswordResetToken) {
		tryMutate();
		if ((argPasswordResetToken != null) && (argPasswordResetToken.length() > 64)) {
			throw new com.opal.ArgumentTooLongException("Cannot set myPasswordResetToken on " + this + " to \"" + argPasswordResetToken + "\" because that field's maximum length is 64.", argPasswordResetToken.length(), 64);
		}
		getNewValues()[6] = argPasswordResetToken;
		return this;
	}

	public synchronized AccountOpal setPasswordResetTokenExpiration(final java.time.LocalDateTime argPasswordResetTokenExpiration) {
		tryMutate();
		getNewValues()[7] = argPasswordResetTokenExpiration;
		return this;
	}

	public synchronized AccountOpal setCanReceiveUnsolicitedMessages(final java.lang.Boolean argCanReceiveUnsolicitedMessages) {
		tryMutate();
		if (argCanReceiveUnsolicitedMessages == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myCanReceiveUnsolicitedMessages on " + this + " to null.");
		}
		getNewValues()[8] = argCanReceiveUnsolicitedMessages;
		return this;
	}

	public AccountOpal setCanReceiveUnsolicitedMessages(final boolean argCanReceiveUnsolicitedMessages) {
		setCanReceiveUnsolicitedMessages(argCanReceiveUnsolicitedMessages ? Boolean.TRUE : Boolean.FALSE);
		return this;
	}

	public synchronized AccountOpal setMessageEmailNotifications(final java.lang.String argMessageEmailNotifications) {
		tryMutate();
		if ((argMessageEmailNotifications != null) && (argMessageEmailNotifications.length() > 256)) {
			throw new com.opal.ArgumentTooLongException("Cannot set myMessageEmailNotifications on " + this + " to \"" + argMessageEmailNotifications + "\" because that field's maximum length is 256.", argMessageEmailNotifications.length(), 256);
		}
		getNewValues()[9] = argMessageEmailNotifications;
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
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		myOldContactOpal = myNewContactOpal;

		return;
	}

	@Override
	protected void unlinkInternal() {
		getPronunciationGuideSuppressionOpalSet().clear();
		getWriterQuestionOpalSet().clear();
		getEditorDiffOpalSet().clear();
		getFromMessageOpalSet().clear();
		getToMessageOpalSet().clear();
		if (getContactOpal() != null) {
			getContactOpal().setAccountOpalInternal(null);
		}
		return;
	}

	@Override
	protected void copyFieldsToInternal(com.opal.UpdatableOpal<Account> argTarget) {
		Object[] lclValues = getReadValueSet();
		Object[] lclTargetNewValues = argTarget.getNewValues();
		/* Field 0 (Id) is part of a unique key. */
		/* Field 1 (Username) is part of a unique key. */
		lclTargetNewValues[2] = lclValues[2]; /* PasswordHash (immutable) */
		lclTargetNewValues[3] = lclValues[3]; /* Administrator (immutable) */
		lclTargetNewValues[4] = lclValues[4]; /* Active (immutable) */
		lclTargetNewValues[5] = lclValues[5]; /* Writer (immutable) */
		lclTargetNewValues[6] = lclValues[6]; /* PasswordResetToken (immutable) */
		lclTargetNewValues[7] = lclValues[7]; /* PasswordResetTokenExpiration (immutable) */
		lclTargetNewValues[8] = lclValues[8]; /* CanReceiveUnsolicitedMessages (immutable) */
		lclTargetNewValues[9] = lclValues[9]; /* MessageEmailNotifications (immutable) */

		return;
	}

	@Override
	public synchronized void translateReferencesToFields() {
		if (myNewContactOpal != ContactOpal.NOT_YET_LOADED) {
			setId(myNewContactOpal == null ? null : myNewContactOpal.getIdAsObject());
		}
		return;
	}

	@Override
	public java.util.Set<com.opal.TransactionAware> getRequiredPriorCommits() {
		java.util.Set<com.opal.TransactionAware> lclTAs = null;
		com.opal.UpdatableOpal<?> lclUO;
		lclUO = myNewContactOpal;
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
		if ((lclUO = myOldContactOpal) == ContactOpal.NOT_YET_LOADED) {
			lclUO = myOldContactOpal = retrieveContactOpal(getOldValues());
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
		argOutput.println("Username = " + getUsername());
		argOutput.println("PasswordHash = " + getPasswordHash());
		argOutput.println("Administrator = " + isAdministratorAsObject());
		argOutput.println("Active = " + isActiveAsObject());
		argOutput.println("Writer = " + isWriterAsObject());
		argOutput.println("PasswordResetToken = " + getPasswordResetToken());
		argOutput.println("PasswordResetTokenExpiration = " + getPasswordResetTokenExpiration());
		argOutput.println("CanReceiveUnsolicitedMessages = " + isCanReceiveUnsolicitedMessagesAsObject());
		argOutput.println("MessageEmailNotifications = " + getMessageEmailNotifications());
	}

	@Override
	public synchronized void output(final java.io.PrintWriter argOutput) {
		argOutput.println("Id = " + getIdAsObject());
		argOutput.println("Username = " + getUsername());
		argOutput.println("PasswordHash = " + getPasswordHash());
		argOutput.println("Administrator = " + isAdministratorAsObject());
		argOutput.println("Active = " + isActiveAsObject());
		argOutput.println("Writer = " + isWriterAsObject());
		argOutput.println("PasswordResetToken = " + getPasswordResetToken());
		argOutput.println("PasswordResetTokenExpiration = " + getPasswordResetTokenExpiration());
		argOutput.println("CanReceiveUnsolicitedMessages = " + isCanReceiveUnsolicitedMessagesAsObject());
		argOutput.println("MessageEmailNotifications = " + getMessageEmailNotifications());
	}

	private ContactOpal myOldContactOpal;
	private ContactOpal myNewContactOpal;

	protected ContactOpal retrieveContactOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[0] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getContactOpalFactory().forId(getIdAsObject());
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

	public synchronized AccountOpal setContactOpal(ContactOpal argContactOpal) {
		tryMutate();
		if (myNewContactOpal != null && myNewContactOpal != ContactOpal.NOT_YET_LOADED) {
			myNewContactOpal.setAccountOpalInternal(null);
		}
		myNewContactOpal = argContactOpal;
		if (argContactOpal != null) {
			argContactOpal.setAccountOpalInternal(this);
		}
		return this;
	}

	protected synchronized void setContactOpalInternal(ContactOpal argContactOpal) {
		tryMutate();
		myNewContactOpal = argContactOpal;
	}

	private com.opal.types.OpalBackCollectionSet<PronunciationGuideSuppressionOpal, AccountOpal> myPronunciationGuideSuppressionSet = null;

	private static final com.opal.types.OpalBackCollectionLoader<PronunciationGuideSuppressionOpal, AccountOpal> ourPronunciationGuideSuppressionOpalLoader = 
			new com.opal.types.OpalBackCollectionLoader<>(
					OpalFactoryFactory.getInstance().getPronunciationGuideSuppressionOpalFactory()::forAccountOpalCollection,
					OpalFactoryFactory.getInstance().getPronunciationGuideSuppressionOpalFactory()::forAccountOpalCount,
					PronunciationGuideSuppressionOpal::setAccountOpal,
					PronunciationGuideSuppressionOpal::setAccountOpalInternal,
					PronunciationGuideSuppressionOpal::getAccountOpal,
					com.scobolsolo.application.FactoryMap.getNoArgCtorSetCreator(),
					com.scobolsolo.application.FactoryMap.getCollectionArgSetCreator(),
					false
					);

	/* package */ synchronized com.opal.types.OpalBackCollectionSet<PronunciationGuideSuppressionOpal, AccountOpal> getPronunciationGuideSuppressionOpalSet() {
		if (myPronunciationGuideSuppressionSet == null) {
			myPronunciationGuideSuppressionSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
					this,
					ourPronunciationGuideSuppressionOpalLoader,
					isNew()
					);
		}
		return myPronunciationGuideSuppressionSet;
	}

	private com.opal.types.OpalBackCollectionSet<QuestionOpal, AccountOpal> myWriterQuestionSet = null;

	private static final com.opal.types.OpalBackCollectionLoader<QuestionOpal, AccountOpal> ourWriterQuestionOpalLoader = 
			new com.opal.types.OpalBackCollectionLoader<>(
					OpalFactoryFactory.getInstance().getQuestionOpalFactory()::forWriterOpalCollection,
					OpalFactoryFactory.getInstance().getQuestionOpalFactory()::forWriterOpalCount,
					QuestionOpal::setWriterOpal,
					QuestionOpal::setWriterOpalInternal,
					QuestionOpal::getWriterOpal,
					com.scobolsolo.application.FactoryMap.getNoArgCtorSetCreator(),
					com.scobolsolo.application.FactoryMap.getCollectionArgSetCreator(),
					true
					);

	/* package */ synchronized com.opal.types.OpalBackCollectionSet<QuestionOpal, AccountOpal> getWriterQuestionOpalSet() {
		if (myWriterQuestionSet == null) {
			myWriterQuestionSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
					this,
					ourWriterQuestionOpalLoader,
					isNew()
					);
		}
		return myWriterQuestionSet;
	}

	private com.opal.types.OpalBackCollectionSet<DiffOpal, AccountOpal> myEditorDiffSet = null;

	private static final com.opal.types.OpalBackCollectionLoader<DiffOpal, AccountOpal> ourEditorDiffOpalLoader = 
			new com.opal.types.OpalBackCollectionLoader<>(
					OpalFactoryFactory.getInstance().getDiffOpalFactory()::forEditorOpalCollection,
					OpalFactoryFactory.getInstance().getDiffOpalFactory()::forEditorOpalCount,
					DiffOpal::setEditorOpal,
					DiffOpal::setEditorOpalInternal,
					DiffOpal::getEditorOpal,
					com.scobolsolo.application.FactoryMap.getNoArgCtorSetCreator(),
					com.scobolsolo.application.FactoryMap.getCollectionArgSetCreator(),
					false
					);

	/* package */ synchronized com.opal.types.OpalBackCollectionSet<DiffOpal, AccountOpal> getEditorDiffOpalSet() {
		if (myEditorDiffSet == null) {
			myEditorDiffSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
					this,
					ourEditorDiffOpalLoader,
					isNew()
					);
		}
		return myEditorDiffSet;
	}

	private com.opal.types.OpalBackCollectionSet<MessageOpal, AccountOpal> myFromMessageSet = null;

	private static final com.opal.types.OpalBackCollectionLoader<MessageOpal, AccountOpal> ourFromMessageOpalLoader = 
			new com.opal.types.OpalBackCollectionLoader<>(
					OpalFactoryFactory.getInstance().getMessageOpalFactory()::forFromAccountOpalCollection,
					OpalFactoryFactory.getInstance().getMessageOpalFactory()::forFromAccountOpalCount,
					MessageOpal::setFromAccountOpal,
					MessageOpal::setFromAccountOpalInternal,
					MessageOpal::getFromAccountOpal,
					com.scobolsolo.application.FactoryMap.getNoArgCtorSetCreator(),
					com.scobolsolo.application.FactoryMap.getCollectionArgSetCreator(),
					false
					);

	/* package */ synchronized com.opal.types.OpalBackCollectionSet<MessageOpal, AccountOpal> getFromMessageOpalSet() {
		if (myFromMessageSet == null) {
			myFromMessageSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
					this,
					ourFromMessageOpalLoader,
					isNew()
					);
		}
		return myFromMessageSet;
	}

	private com.opal.types.OpalBackCollectionSet<MessageOpal, AccountOpal> myToMessageSet = null;

	private static final com.opal.types.OpalBackCollectionLoader<MessageOpal, AccountOpal> ourToMessageOpalLoader = 
			new com.opal.types.OpalBackCollectionLoader<>(
					OpalFactoryFactory.getInstance().getMessageOpalFactory()::forToAccountOpalCollection,
					OpalFactoryFactory.getInstance().getMessageOpalFactory()::forToAccountOpalCount,
					MessageOpal::setToAccountOpal,
					MessageOpal::setToAccountOpalInternal,
					MessageOpal::getToAccountOpal,
					com.scobolsolo.application.FactoryMap.getNoArgCtorSetCreator(),
					com.scobolsolo.application.FactoryMap.getCollectionArgSetCreator(),
					false
					);

	/* package */ synchronized com.opal.types.OpalBackCollectionSet<MessageOpal, AccountOpal> getToMessageOpalSet() {
		if (myToMessageSet == null) {
			myToMessageSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
					this,
					ourToMessageOpalLoader,
					isNew()
					);
		}
		return myToMessageSet;
	}

	@Override
	public java.lang.String toString() {
		java.lang.StringBuilder lclSB = new java.lang.StringBuilder(64);
		lclSB.append("AccountOpal[");
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
	}

	@Override
	protected void updateCollectionsAfterReload() {
		assert needsToClearOldCollections() == false;
		setClearOldCollections(true);
	}

}
