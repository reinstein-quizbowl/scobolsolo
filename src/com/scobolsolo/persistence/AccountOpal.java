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

		myNewPronunciationGuideSuppressionOpalHashSet = new java.util.HashSet<>();
		myNewWriterQuestionOpalHashSet = new java.util.HashSet<>();
		myNewEditorDiffOpalHashSet = new java.util.HashSet<>();
		myNewFromMessageOpalHashSet = new java.util.HashSet<>();
		myNewToMessageOpalHashSet = new java.util.HashSet<>();

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
		myNewPronunciationGuideSuppressionOpalHashSet = null; /* Necessary if it has been rolled back */
		myPronunciationGuideSuppressionOpalCachedOperations = null; /* Ditto */
		myNewWriterQuestionOpalHashSet = null; /* Necessary if it has been rolled back */
		myWriterQuestionOpalCachedOperations = null; /* Ditto */
		myNewEditorDiffOpalHashSet = null; /* Necessary if it has been rolled back */
		myEditorDiffOpalCachedOperations = null; /* Ditto */
		myNewFromMessageOpalHashSet = null; /* Necessary if it has been rolled back */
		myFromMessageOpalCachedOperations = null; /* Ditto */
		myNewToMessageOpalHashSet = null; /* Necessary if it has been rolled back */
		myToMessageOpalCachedOperations = null; /* Ditto */
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		myOldContactOpal = myNewContactOpal;

		if (needsToClearOldCollections()) {
			myOldPronunciationGuideSuppressionOpalHashSet = null;
			myOldWriterQuestionOpalHashSet = null;
			myOldEditorDiffOpalHashSet = null;
			myOldFromMessageOpalHashSet = null;
			myOldToMessageOpalHashSet = null;
		} else {
			if (myNewPronunciationGuideSuppressionOpalHashSet != null) {
				if (myNewPronunciationGuideSuppressionOpalHashSet.size() > 0) {
					myOldPronunciationGuideSuppressionOpalHashSet = myNewPronunciationGuideSuppressionOpalHashSet;
				} else {
					myOldPronunciationGuideSuppressionOpalHashSet = java.util.Collections.emptySet();
				}
				myNewPronunciationGuideSuppressionOpalHashSet = null;
			} else {
				myPronunciationGuideSuppressionOpalCachedOperations = null;
			}
			if (myNewWriterQuestionOpalHashSet != null) {
				if (myNewWriterQuestionOpalHashSet.size() > 0) {
					myOldWriterQuestionOpalHashSet = myNewWriterQuestionOpalHashSet;
				} else {
					myOldWriterQuestionOpalHashSet = java.util.Collections.emptySet();
				}
				myNewWriterQuestionOpalHashSet = null;
			} else {
				myWriterQuestionOpalCachedOperations = null;
			}
			if (myNewEditorDiffOpalHashSet != null) {
				if (myNewEditorDiffOpalHashSet.size() > 0) {
					myOldEditorDiffOpalHashSet = myNewEditorDiffOpalHashSet;
				} else {
					myOldEditorDiffOpalHashSet = java.util.Collections.emptySet();
				}
				myNewEditorDiffOpalHashSet = null;
			} else {
				myEditorDiffOpalCachedOperations = null;
			}
			if (myNewFromMessageOpalHashSet != null) {
				if (myNewFromMessageOpalHashSet.size() > 0) {
					myOldFromMessageOpalHashSet = myNewFromMessageOpalHashSet;
				} else {
					myOldFromMessageOpalHashSet = java.util.Collections.emptySet();
				}
				myNewFromMessageOpalHashSet = null;
			} else {
				myFromMessageOpalCachedOperations = null;
			}
			if (myNewToMessageOpalHashSet != null) {
				if (myNewToMessageOpalHashSet.size() > 0) {
					myOldToMessageOpalHashSet = myNewToMessageOpalHashSet;
				} else {
					myOldToMessageOpalHashSet = java.util.Collections.emptySet();
				}
				myNewToMessageOpalHashSet = null;
			} else {
				myToMessageOpalCachedOperations = null;
			}
		}
		setClearOldCollections(false);
		return;
	}

	@Override
	protected void unlinkInternal() {
		java.util.Iterator<?> lclI;
		if (myNewPronunciationGuideSuppressionOpalHashSet != null || myPronunciationGuideSuppressionOpalCachedOperations != null) {
			lclI = createPronunciationGuideSuppressionOpalIterator();
			while (lclI.hasNext()) {
				((PronunciationGuideSuppressionOpal) lclI.next()).setAccountOpalInternal(null);
			}
		}
		if (myNewWriterQuestionOpalHashSet != null || myWriterQuestionOpalCachedOperations != null) {
			lclI = createWriterQuestionOpalIterator();
			while (lclI.hasNext()) {
				((QuestionOpal) lclI.next()).setWriterOpalInternal(null);
			}
		}
		if (myNewEditorDiffOpalHashSet != null || myEditorDiffOpalCachedOperations != null) {
			lclI = createEditorDiffOpalIterator();
			while (lclI.hasNext()) {
				((DiffOpal) lclI.next()).setEditorOpalInternal(null);
			}
		}
		if (myNewFromMessageOpalHashSet != null || myFromMessageOpalCachedOperations != null) {
			lclI = createFromMessageOpalIterator();
			while (lclI.hasNext()) {
				((MessageOpal) lclI.next()).setFromAccountOpalInternal(null);
			}
		}
		if (myNewToMessageOpalHashSet != null || myToMessageOpalCachedOperations != null) {
			lclI = createToMessageOpalIterator();
			while (lclI.hasNext()) {
				((MessageOpal) lclI.next()).setToAccountOpalInternal(null);
			}
		}
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
		if (lclUO != null && lclUO.isDeleted()) {
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

	private java.util.Set<PronunciationGuideSuppressionOpal> myOldPronunciationGuideSuppressionOpalHashSet = null;
	private java.util.Set<PronunciationGuideSuppressionOpal> myNewPronunciationGuideSuppressionOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<PronunciationGuideSuppressionOpal>> myPronunciationGuideSuppressionOpalCachedOperations = null;

	/* package */ java.util.Set<PronunciationGuideSuppressionOpal> getPronunciationGuideSuppressionOpalHashSet() {
		if (tryAccess()) {
			if (myNewPronunciationGuideSuppressionOpalHashSet == null) {
				if (myOldPronunciationGuideSuppressionOpalHashSet == null) {
					if (isNew()) {
						myOldPronunciationGuideSuppressionOpalHashSet = java.util.Collections.emptySet();
					} else {
						java.util.Set<PronunciationGuideSuppressionOpal> lclS;
						lclS = OpalFactoryFactory.getInstance().getPronunciationGuideSuppressionOpalFactory().forAccountIdCollection(getIdAsObject());
						myOldPronunciationGuideSuppressionOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
					}
				}
				myNewPronunciationGuideSuppressionOpalHashSet = new java.util.HashSet<>(myOldPronunciationGuideSuppressionOpalHashSet);
				if (myPronunciationGuideSuppressionOpalCachedOperations != null) {
					com.opal.OpalUtility.handleCachedOperations(myPronunciationGuideSuppressionOpalCachedOperations, myNewPronunciationGuideSuppressionOpalHashSet);
					myPronunciationGuideSuppressionOpalCachedOperations = null;
				}
			}
			return myNewPronunciationGuideSuppressionOpalHashSet;
		} else {
			if (myOldPronunciationGuideSuppressionOpalHashSet == null) {
				java.util.Set<PronunciationGuideSuppressionOpal> lclS;
				lclS = OpalFactoryFactory.getInstance().getPronunciationGuideSuppressionOpalFactory().forAccountIdCollection(getIdAsObject());
				myOldPronunciationGuideSuppressionOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
			}
			return myOldPronunciationGuideSuppressionOpalHashSet;
		}
	}

	public synchronized void addPronunciationGuideSuppressionOpal(PronunciationGuideSuppressionOpal argPronunciationGuideSuppressionOpal) {
		tryMutate();
		argPronunciationGuideSuppressionOpal.setAccountOpal(this);
		return;
	}

	protected synchronized void addPronunciationGuideSuppressionOpalInternal(PronunciationGuideSuppressionOpal argPronunciationGuideSuppressionOpal) {
		tryMutate();
		if (myNewPronunciationGuideSuppressionOpalHashSet == null) {
			if (myOldPronunciationGuideSuppressionOpalHashSet == null) {
				if (myPronunciationGuideSuppressionOpalCachedOperations == null) { myPronunciationGuideSuppressionOpalCachedOperations = new java.util.ArrayList<>(); }
				myPronunciationGuideSuppressionOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.ADD, argPronunciationGuideSuppressionOpal));
			} else {
				myNewPronunciationGuideSuppressionOpalHashSet = new java.util.HashSet<>(myOldPronunciationGuideSuppressionOpalHashSet);
				myNewPronunciationGuideSuppressionOpalHashSet.add(argPronunciationGuideSuppressionOpal);
			}
		} else {
			myNewPronunciationGuideSuppressionOpalHashSet.add(argPronunciationGuideSuppressionOpal);
		}
		return;
	}

	public synchronized void removePronunciationGuideSuppressionOpal(PronunciationGuideSuppressionOpal argPronunciationGuideSuppressionOpal) {
		tryMutate();
		argPronunciationGuideSuppressionOpal.setAccountOpal(null);
	}

	protected synchronized void removePronunciationGuideSuppressionOpalInternal(PronunciationGuideSuppressionOpal argPronunciationGuideSuppressionOpal) {
		tryMutate();
		if (myNewPronunciationGuideSuppressionOpalHashSet == null) {
			if (myOldPronunciationGuideSuppressionOpalHashSet == null) {
				if (myPronunciationGuideSuppressionOpalCachedOperations == null) { myPronunciationGuideSuppressionOpalCachedOperations = new java.util.ArrayList<>(); }
				myPronunciationGuideSuppressionOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.REMOVE, argPronunciationGuideSuppressionOpal));
			} else {
				myNewPronunciationGuideSuppressionOpalHashSet = new java.util.HashSet<>(myOldPronunciationGuideSuppressionOpalHashSet);
				myNewPronunciationGuideSuppressionOpalHashSet.remove(argPronunciationGuideSuppressionOpal);
			}
		} else {
			myNewPronunciationGuideSuppressionOpalHashSet.remove(argPronunciationGuideSuppressionOpal);
		}
		return;
	}

	public synchronized int getPronunciationGuideSuppressionOpalCount() { return getPronunciationGuideSuppressionOpalHashSet().size(); }

	public synchronized java.util.Iterator<PronunciationGuideSuppressionOpal> createPronunciationGuideSuppressionOpalIterator() {
		return getPronunciationGuideSuppressionOpalHashSet().iterator();
	}

	public synchronized java.util.stream.Stream<PronunciationGuideSuppressionOpal> streamPronunciationGuideSuppressionOpal() {
		return getPronunciationGuideSuppressionOpalHashSet().stream();
	}

	private java.util.Set<QuestionOpal> myOldWriterQuestionOpalHashSet = null;
	private java.util.Set<QuestionOpal> myNewWriterQuestionOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<QuestionOpal>> myWriterQuestionOpalCachedOperations = null;

	/* package */ java.util.Set<QuestionOpal> getWriterQuestionOpalHashSet() {
		if (tryAccess()) {
			if (myNewWriterQuestionOpalHashSet == null) {
				if (myOldWriterQuestionOpalHashSet == null) {
					if (isNew()) {
						myOldWriterQuestionOpalHashSet = java.util.Collections.emptySet();
					} else {
						java.util.Set<QuestionOpal> lclS;
						lclS = OpalFactoryFactory.getInstance().getQuestionOpalFactory().forWriterAccountIdCollection(getIdAsObject());
						myOldWriterQuestionOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
					}
				}
				myNewWriterQuestionOpalHashSet = new java.util.HashSet<>(myOldWriterQuestionOpalHashSet);
				if (myWriterQuestionOpalCachedOperations != null) {
					com.opal.OpalUtility.handleCachedOperations(myWriterQuestionOpalCachedOperations, myNewWriterQuestionOpalHashSet);
					myWriterQuestionOpalCachedOperations = null;
				}
			}
			return myNewWriterQuestionOpalHashSet;
		} else {
			if (myOldWriterQuestionOpalHashSet == null) {
				java.util.Set<QuestionOpal> lclS;
				lclS = OpalFactoryFactory.getInstance().getQuestionOpalFactory().forWriterAccountIdCollection(getIdAsObject());
				myOldWriterQuestionOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
			}
			return myOldWriterQuestionOpalHashSet;
		}
	}

	public synchronized void addWriterQuestionOpal(QuestionOpal argQuestionOpal) {
		tryMutate();
		argQuestionOpal.setWriterOpal(this);
		return;
	}

	protected synchronized void addWriterQuestionOpalInternal(QuestionOpal argQuestionOpal) {
		tryMutate();
		if (myNewWriterQuestionOpalHashSet == null) {
			if (myOldWriterQuestionOpalHashSet == null) {
				if (myWriterQuestionOpalCachedOperations == null) { myWriterQuestionOpalCachedOperations = new java.util.ArrayList<>(); }
				myWriterQuestionOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.ADD, argQuestionOpal));
			} else {
				myNewWriterQuestionOpalHashSet = new java.util.HashSet<>(myOldWriterQuestionOpalHashSet);
				myNewWriterQuestionOpalHashSet.add(argQuestionOpal);
			}
		} else {
			myNewWriterQuestionOpalHashSet.add(argQuestionOpal);
		}
		return;
	}

	public synchronized void removeWriterQuestionOpal(QuestionOpal argQuestionOpal) {
		tryMutate();
		argQuestionOpal.setWriterOpal(null);
	}

	protected synchronized void removeWriterQuestionOpalInternal(QuestionOpal argQuestionOpal) {
		tryMutate();
		if (myNewWriterQuestionOpalHashSet == null) {
			if (myOldWriterQuestionOpalHashSet == null) {
				if (myWriterQuestionOpalCachedOperations == null) { myWriterQuestionOpalCachedOperations = new java.util.ArrayList<>(); }
				myWriterQuestionOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.REMOVE, argQuestionOpal));
			} else {
				myNewWriterQuestionOpalHashSet = new java.util.HashSet<>(myOldWriterQuestionOpalHashSet);
				myNewWriterQuestionOpalHashSet.remove(argQuestionOpal);
			}
		} else {
			myNewWriterQuestionOpalHashSet.remove(argQuestionOpal);
		}
		return;
	}

	public synchronized int getWriterQuestionOpalCount() { return getWriterQuestionOpalHashSet().size(); }

	public synchronized java.util.Iterator<QuestionOpal> createWriterQuestionOpalIterator() {
		return getWriterQuestionOpalHashSet().iterator();
	}

	public synchronized java.util.stream.Stream<QuestionOpal> streamWriterQuestionOpal() {
		return getWriterQuestionOpalHashSet().stream();
	}

	private java.util.Set<DiffOpal> myOldEditorDiffOpalHashSet = null;
	private java.util.Set<DiffOpal> myNewEditorDiffOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<DiffOpal>> myEditorDiffOpalCachedOperations = null;

	/* package */ java.util.Set<DiffOpal> getEditorDiffOpalHashSet() {
		if (tryAccess()) {
			if (myNewEditorDiffOpalHashSet == null) {
				if (myOldEditorDiffOpalHashSet == null) {
					if (isNew()) {
						myOldEditorDiffOpalHashSet = java.util.Collections.emptySet();
					} else {
						java.util.Set<DiffOpal> lclS;
						lclS = OpalFactoryFactory.getInstance().getDiffOpalFactory().forEditorAccountIdCollection(getIdAsObject());
						myOldEditorDiffOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
					}
				}
				myNewEditorDiffOpalHashSet = new java.util.HashSet<>(myOldEditorDiffOpalHashSet);
				if (myEditorDiffOpalCachedOperations != null) {
					com.opal.OpalUtility.handleCachedOperations(myEditorDiffOpalCachedOperations, myNewEditorDiffOpalHashSet);
					myEditorDiffOpalCachedOperations = null;
				}
			}
			return myNewEditorDiffOpalHashSet;
		} else {
			if (myOldEditorDiffOpalHashSet == null) {
				java.util.Set<DiffOpal> lclS;
				lclS = OpalFactoryFactory.getInstance().getDiffOpalFactory().forEditorAccountIdCollection(getIdAsObject());
				myOldEditorDiffOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
			}
			return myOldEditorDiffOpalHashSet;
		}
	}

	public synchronized void addEditorDiffOpal(DiffOpal argDiffOpal) {
		tryMutate();
		argDiffOpal.setEditorOpal(this);
		return;
	}

	protected synchronized void addEditorDiffOpalInternal(DiffOpal argDiffOpal) {
		tryMutate();
		if (myNewEditorDiffOpalHashSet == null) {
			if (myOldEditorDiffOpalHashSet == null) {
				if (myEditorDiffOpalCachedOperations == null) { myEditorDiffOpalCachedOperations = new java.util.ArrayList<>(); }
				myEditorDiffOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.ADD, argDiffOpal));
			} else {
				myNewEditorDiffOpalHashSet = new java.util.HashSet<>(myOldEditorDiffOpalHashSet);
				myNewEditorDiffOpalHashSet.add(argDiffOpal);
			}
		} else {
			myNewEditorDiffOpalHashSet.add(argDiffOpal);
		}
		return;
	}

	public synchronized void removeEditorDiffOpal(DiffOpal argDiffOpal) {
		tryMutate();
		argDiffOpal.setEditorOpal(null);
	}

	protected synchronized void removeEditorDiffOpalInternal(DiffOpal argDiffOpal) {
		tryMutate();
		if (myNewEditorDiffOpalHashSet == null) {
			if (myOldEditorDiffOpalHashSet == null) {
				if (myEditorDiffOpalCachedOperations == null) { myEditorDiffOpalCachedOperations = new java.util.ArrayList<>(); }
				myEditorDiffOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.REMOVE, argDiffOpal));
			} else {
				myNewEditorDiffOpalHashSet = new java.util.HashSet<>(myOldEditorDiffOpalHashSet);
				myNewEditorDiffOpalHashSet.remove(argDiffOpal);
			}
		} else {
			myNewEditorDiffOpalHashSet.remove(argDiffOpal);
		}
		return;
	}

	public synchronized int getEditorDiffOpalCount() { return getEditorDiffOpalHashSet().size(); }

	public synchronized java.util.Iterator<DiffOpal> createEditorDiffOpalIterator() {
		return getEditorDiffOpalHashSet().iterator();
	}

	public synchronized java.util.stream.Stream<DiffOpal> streamEditorDiffOpal() {
		return getEditorDiffOpalHashSet().stream();
	}

	private java.util.Set<MessageOpal> myOldFromMessageOpalHashSet = null;
	private java.util.Set<MessageOpal> myNewFromMessageOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<MessageOpal>> myFromMessageOpalCachedOperations = null;

	/* package */ java.util.Set<MessageOpal> getFromMessageOpalHashSet() {
		if (tryAccess()) {
			if (myNewFromMessageOpalHashSet == null) {
				if (myOldFromMessageOpalHashSet == null) {
					if (isNew()) {
						myOldFromMessageOpalHashSet = java.util.Collections.emptySet();
					} else {
						java.util.Set<MessageOpal> lclS;
						lclS = OpalFactoryFactory.getInstance().getMessageOpalFactory().forFromAccountIdCollection(getIdAsObject());
						myOldFromMessageOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
					}
				}
				myNewFromMessageOpalHashSet = new java.util.HashSet<>(myOldFromMessageOpalHashSet);
				if (myFromMessageOpalCachedOperations != null) {
					com.opal.OpalUtility.handleCachedOperations(myFromMessageOpalCachedOperations, myNewFromMessageOpalHashSet);
					myFromMessageOpalCachedOperations = null;
				}
			}
			return myNewFromMessageOpalHashSet;
		} else {
			if (myOldFromMessageOpalHashSet == null) {
				java.util.Set<MessageOpal> lclS;
				lclS = OpalFactoryFactory.getInstance().getMessageOpalFactory().forFromAccountIdCollection(getIdAsObject());
				myOldFromMessageOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
			}
			return myOldFromMessageOpalHashSet;
		}
	}

	public synchronized void addFromMessageOpal(MessageOpal argMessageOpal) {
		tryMutate();
		argMessageOpal.setFromAccountOpal(this);
		return;
	}

	protected synchronized void addFromMessageOpalInternal(MessageOpal argMessageOpal) {
		tryMutate();
		if (myNewFromMessageOpalHashSet == null) {
			if (myOldFromMessageOpalHashSet == null) {
				if (myFromMessageOpalCachedOperations == null) { myFromMessageOpalCachedOperations = new java.util.ArrayList<>(); }
				myFromMessageOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.ADD, argMessageOpal));
			} else {
				myNewFromMessageOpalHashSet = new java.util.HashSet<>(myOldFromMessageOpalHashSet);
				myNewFromMessageOpalHashSet.add(argMessageOpal);
			}
		} else {
			myNewFromMessageOpalHashSet.add(argMessageOpal);
		}
		return;
	}

	public synchronized void removeFromMessageOpal(MessageOpal argMessageOpal) {
		tryMutate();
		argMessageOpal.setFromAccountOpal(null);
	}

	protected synchronized void removeFromMessageOpalInternal(MessageOpal argMessageOpal) {
		tryMutate();
		if (myNewFromMessageOpalHashSet == null) {
			if (myOldFromMessageOpalHashSet == null) {
				if (myFromMessageOpalCachedOperations == null) { myFromMessageOpalCachedOperations = new java.util.ArrayList<>(); }
				myFromMessageOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.REMOVE, argMessageOpal));
			} else {
				myNewFromMessageOpalHashSet = new java.util.HashSet<>(myOldFromMessageOpalHashSet);
				myNewFromMessageOpalHashSet.remove(argMessageOpal);
			}
		} else {
			myNewFromMessageOpalHashSet.remove(argMessageOpal);
		}
		return;
	}

	public synchronized int getFromMessageOpalCount() { return getFromMessageOpalHashSet().size(); }

	public synchronized java.util.Iterator<MessageOpal> createFromMessageOpalIterator() {
		return getFromMessageOpalHashSet().iterator();
	}

	public synchronized java.util.stream.Stream<MessageOpal> streamFromMessageOpal() {
		return getFromMessageOpalHashSet().stream();
	}

	private java.util.Set<MessageOpal> myOldToMessageOpalHashSet = null;
	private java.util.Set<MessageOpal> myNewToMessageOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<MessageOpal>> myToMessageOpalCachedOperations = null;

	/* package */ java.util.Set<MessageOpal> getToMessageOpalHashSet() {
		if (tryAccess()) {
			if (myNewToMessageOpalHashSet == null) {
				if (myOldToMessageOpalHashSet == null) {
					if (isNew()) {
						myOldToMessageOpalHashSet = java.util.Collections.emptySet();
					} else {
						java.util.Set<MessageOpal> lclS;
						lclS = OpalFactoryFactory.getInstance().getMessageOpalFactory().forToAccountIdCollection(getIdAsObject());
						myOldToMessageOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
					}
				}
				myNewToMessageOpalHashSet = new java.util.HashSet<>(myOldToMessageOpalHashSet);
				if (myToMessageOpalCachedOperations != null) {
					com.opal.OpalUtility.handleCachedOperations(myToMessageOpalCachedOperations, myNewToMessageOpalHashSet);
					myToMessageOpalCachedOperations = null;
				}
			}
			return myNewToMessageOpalHashSet;
		} else {
			if (myOldToMessageOpalHashSet == null) {
				java.util.Set<MessageOpal> lclS;
				lclS = OpalFactoryFactory.getInstance().getMessageOpalFactory().forToAccountIdCollection(getIdAsObject());
				myOldToMessageOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
			}
			return myOldToMessageOpalHashSet;
		}
	}

	public synchronized void addToMessageOpal(MessageOpal argMessageOpal) {
		tryMutate();
		argMessageOpal.setToAccountOpal(this);
		return;
	}

	protected synchronized void addToMessageOpalInternal(MessageOpal argMessageOpal) {
		tryMutate();
		if (myNewToMessageOpalHashSet == null) {
			if (myOldToMessageOpalHashSet == null) {
				if (myToMessageOpalCachedOperations == null) { myToMessageOpalCachedOperations = new java.util.ArrayList<>(); }
				myToMessageOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.ADD, argMessageOpal));
			} else {
				myNewToMessageOpalHashSet = new java.util.HashSet<>(myOldToMessageOpalHashSet);
				myNewToMessageOpalHashSet.add(argMessageOpal);
			}
		} else {
			myNewToMessageOpalHashSet.add(argMessageOpal);
		}
		return;
	}

	public synchronized void removeToMessageOpal(MessageOpal argMessageOpal) {
		tryMutate();
		argMessageOpal.setToAccountOpal(null);
	}

	protected synchronized void removeToMessageOpalInternal(MessageOpal argMessageOpal) {
		tryMutate();
		if (myNewToMessageOpalHashSet == null) {
			if (myOldToMessageOpalHashSet == null) {
				if (myToMessageOpalCachedOperations == null) { myToMessageOpalCachedOperations = new java.util.ArrayList<>(); }
				myToMessageOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.REMOVE, argMessageOpal));
			} else {
				myNewToMessageOpalHashSet = new java.util.HashSet<>(myOldToMessageOpalHashSet);
				myNewToMessageOpalHashSet.remove(argMessageOpal);
			}
		} else {
			myNewToMessageOpalHashSet.remove(argMessageOpal);
		}
		return;
	}

	public synchronized int getToMessageOpalCount() { return getToMessageOpalHashSet().size(); }

	public synchronized java.util.Iterator<MessageOpal> createToMessageOpalIterator() {
		return getToMessageOpalHashSet().iterator();
	}

	public synchronized java.util.stream.Stream<MessageOpal> streamToMessageOpal() {
		return getToMessageOpalHashSet().stream();
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
