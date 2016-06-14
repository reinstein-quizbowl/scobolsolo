package com.scobolsolo.persistence;

import com.scobolsolo.application.Message;

@com.opal.StoreGeneratedPrimaryKey
public final class MessageOpal extends com.opal.UpdatableOpal<Message> {


	private MessageOpal() {
		super();
		setUserFacing(null);
	}

	public MessageOpal(com.opal.IdentityOpalFactory<Message, MessageOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void applyDefaults() {
		/* Initialize fields with their default values. */
		getNewValues()[4] = com.opal.LocalDateCache.now();

		return;
	}

	@Override
	protected void initializeReferences() {
		myOldFromAccountOpal = AccountOpal.NOT_YET_LOADED;
		myOldToAccountOpal = AccountOpal.NOT_YET_LOADED;
		return;
	}

	/* package */ static final String[] ourFieldNames = new String[] {
		"Id",
		"FromAccountId",
		"ToAccountId",
		"Text",
		"SentTimestamp",
		"AcknowledgedTimestamp",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.lang.String.class,
		java.time.LocalDateTime.class,
		java.time.LocalDateTime.class,
	};

	/* package */ static final boolean[] ourFieldNullability = new boolean[] {
		false,
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
		null,
	};

	public static final MessageOpal NOT_YET_LOADED = new MessageOpal();

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

	public synchronized java.lang.Integer getFromAccountIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[1];
	}

	public synchronized java.lang.Integer getToAccountIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[2];
	}

	public synchronized java.lang.String getText() {
		return (java.lang.String) getReadValueSet()[3];
	}

	public synchronized java.time.LocalDateTime getSentTimestamp() {
		return (java.time.LocalDateTime) getReadValueSet()[4];
	}

	public synchronized java.time.LocalDateTime getAcknowledgedTimestamp() {
		return (java.time.LocalDateTime) getReadValueSet()[5];
	}

	public synchronized MessageOpal setId(final java.lang.Integer argId) {
		tryMutate();
		if (argId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myId on " + this + " to null.");
		}
		getNewValues()[0] = argId;
		return this;
	}

	public MessageOpal setId(final int argId) {
		setId(java.lang.Integer.valueOf(argId));
		return this;
	}

	public synchronized MessageOpal setFromAccountId(final java.lang.Integer argFromAccountId) {
		tryMutate();
		if (argFromAccountId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myFromAccountId on " + this + " to null.");
		}
		getNewValues()[1] = argFromAccountId;
		return this;
	}

	public MessageOpal setFromAccountId(final int argFromAccountId) {
		setFromAccountId(java.lang.Integer.valueOf(argFromAccountId));
		return this;
	}

	public synchronized MessageOpal setToAccountId(final java.lang.Integer argToAccountId) {
		tryMutate();
		if (argToAccountId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myToAccountId on " + this + " to null.");
		}
		getNewValues()[2] = argToAccountId;
		return this;
	}

	public MessageOpal setToAccountId(final int argToAccountId) {
		setToAccountId(java.lang.Integer.valueOf(argToAccountId));
		return this;
	}

	public synchronized MessageOpal setText(final java.lang.String argText) {
		tryMutate();
		if (argText == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myText on " + this + " to null.");
		}
		getNewValues()[3] = argText;
		return this;
	}

	public synchronized MessageOpal setSentTimestamp(final java.time.LocalDateTime argSentTimestamp) {
		tryMutate();
		if (argSentTimestamp == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set mySentTimestamp on " + this + " to null.");
		}
		getNewValues()[4] = argSentTimestamp;
		return this;
	}

	public synchronized MessageOpal setAcknowledgedTimestamp(final java.time.LocalDateTime argAcknowledgedTimestamp) {
		tryMutate();
		getNewValues()[5] = argAcknowledgedTimestamp;
		return this;
	}

	@Override
	protected /* synchronized */ void copyOldValuesToNewInternal() {
		myNewFromAccountOpal = myOldFromAccountOpal;
		myNewToAccountOpal = myOldToAccountOpal;
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		myOldFromAccountOpal = myNewFromAccountOpal;
		myOldToAccountOpal = myNewToAccountOpal;

		return;
	}

	@Override
	protected void unlinkInternal() {
		if (getFromAccountOpal() != null) {
			getFromAccountOpal().removeFromMessageOpalInternal(this);
		}
		if (getToAccountOpal() != null) {
			getToAccountOpal().removeToMessageOpalInternal(this);
		}
		return;
	}

	@Override
	protected void copyFieldsToInternal(com.opal.UpdatableOpal<Message> argTarget) {
		Object[] lclValues = getReadValueSet();
		Object[] lclTargetNewValues = argTarget.getNewValues();
		/* Field 0 (Id) is database generated. */
		lclTargetNewValues[1] = lclValues[1]; /* FromAccountId (immutable) */
		lclTargetNewValues[2] = lclValues[2]; /* ToAccountId (immutable) */
		lclTargetNewValues[3] = lclValues[3]; /* Text (immutable) */
		lclTargetNewValues[4] = lclValues[4]; /* SentTimestamp (immutable) */
		lclTargetNewValues[5] = lclValues[5]; /* AcknowledgedTimestamp (immutable) */

		return;
	}

	@Override
	public synchronized void translateReferencesToFields() {
		if (myNewFromAccountOpal != AccountOpal.NOT_YET_LOADED) {
			setFromAccountId(myNewFromAccountOpal == null ? null : myNewFromAccountOpal.getIdAsObject());
		}
		if (myNewToAccountOpal != AccountOpal.NOT_YET_LOADED) {
			setToAccountId(myNewToAccountOpal == null ? null : myNewToAccountOpal.getIdAsObject());
		}
		return;
	}

	@Override
	public java.util.Set<com.opal.TransactionAware> getRequiredPriorCommits() {
		java.util.Set<com.opal.TransactionAware> lclTAs = null;
		com.opal.UpdatableOpal<?> lclUO;
		lclUO = myNewFromAccountOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		lclUO = myNewToAccountOpal;
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
		if ((lclUO = myOldFromAccountOpal) == AccountOpal.NOT_YET_LOADED) {
			lclUO = myOldFromAccountOpal = retrieveFromAccountOpal(getOldValues());
		}
		if (lclUO != null && lclUO.isDeleted()) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		if ((lclUO = myOldToAccountOpal) == AccountOpal.NOT_YET_LOADED) {
			lclUO = myOldToAccountOpal = retrieveToAccountOpal(getOldValues());
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
		argOutput.println("FromAccountId = " + getFromAccountIdAsObject());
		argOutput.println("ToAccountId = " + getToAccountIdAsObject());
		argOutput.println("Text = " + getText());
		argOutput.println("SentTimestamp = " + getSentTimestamp());
		argOutput.println("AcknowledgedTimestamp = " + getAcknowledgedTimestamp());
	}

	@Override
	public synchronized void output(final java.io.PrintWriter argOutput) {
		argOutput.println("Id = " + getIdAsObject());
		argOutput.println("FromAccountId = " + getFromAccountIdAsObject());
		argOutput.println("ToAccountId = " + getToAccountIdAsObject());
		argOutput.println("Text = " + getText());
		argOutput.println("SentTimestamp = " + getSentTimestamp());
		argOutput.println("AcknowledgedTimestamp = " + getAcknowledgedTimestamp());
	}

	private AccountOpal myOldFromAccountOpal;
	private AccountOpal myNewFromAccountOpal;

	protected AccountOpal retrieveFromAccountOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[1] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getAccountOpalFactory().forId(getFromAccountIdAsObject());
	}

	public synchronized AccountOpal getFromAccountOpal() {
		AccountOpal lclAccountOpal;
		boolean lclAccess = tryAccess();
		lclAccountOpal = lclAccess ? myNewFromAccountOpal : myOldFromAccountOpal;
		if (lclAccountOpal == AccountOpal.NOT_YET_LOADED) {
			lclAccountOpal = retrieveFromAccountOpal(getReadValueSet());
			if (lclAccess) {
				myNewFromAccountOpal = lclAccountOpal;
			} else {
				myOldFromAccountOpal = lclAccountOpal;
			}
		}
		return lclAccountOpal;
	}

	public synchronized MessageOpal setFromAccountOpal(AccountOpal argAccountOpal) {
		tryMutate();
		AccountOpal lclAccountOpal = getFromAccountOpal();
		if (lclAccountOpal == argAccountOpal) { return this; }
		if (lclAccountOpal != null) {
			lclAccountOpal.removeFromMessageOpalInternal(this);
		}
		myNewFromAccountOpal = argAccountOpal;
		if (argAccountOpal != null) {
			argAccountOpal.addFromMessageOpalInternal(this);
		}
		return this;
	}

	protected synchronized void setFromAccountOpalInternal(AccountOpal argAccountOpal) {
		tryMutate();
		myNewFromAccountOpal = argAccountOpal;
	}

	private AccountOpal myOldToAccountOpal;
	private AccountOpal myNewToAccountOpal;

	protected AccountOpal retrieveToAccountOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[2] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getAccountOpalFactory().forId(getToAccountIdAsObject());
	}

	public synchronized AccountOpal getToAccountOpal() {
		AccountOpal lclAccountOpal;
		boolean lclAccess = tryAccess();
		lclAccountOpal = lclAccess ? myNewToAccountOpal : myOldToAccountOpal;
		if (lclAccountOpal == AccountOpal.NOT_YET_LOADED) {
			lclAccountOpal = retrieveToAccountOpal(getReadValueSet());
			if (lclAccess) {
				myNewToAccountOpal = lclAccountOpal;
			} else {
				myOldToAccountOpal = lclAccountOpal;
			}
		}
		return lclAccountOpal;
	}

	public synchronized MessageOpal setToAccountOpal(AccountOpal argAccountOpal) {
		tryMutate();
		AccountOpal lclAccountOpal = getToAccountOpal();
		if (lclAccountOpal == argAccountOpal) { return this; }
		if (lclAccountOpal != null) {
			lclAccountOpal.removeToMessageOpalInternal(this);
		}
		myNewToAccountOpal = argAccountOpal;
		if (argAccountOpal != null) {
			argAccountOpal.addToMessageOpalInternal(this);
		}
		return this;
	}

	protected synchronized void setToAccountOpalInternal(AccountOpal argAccountOpal) {
		tryMutate();
		myNewToAccountOpal = argAccountOpal;
	}

	@Override
	public java.lang.String toString() {
		java.lang.StringBuilder lclSB = new java.lang.StringBuilder(64);
		lclSB.append("MessageOpal[");
		lclSB.append("myId=");
		lclSB.append(toStringField(0));
		lclSB.append(']');
		return lclSB.toString();
	}

	@Override
	protected void updateReferencesAfterReload() {
		if (myNewFromAccountOpal != AccountOpal.NOT_YET_LOADED) {
			setFromAccountOpal(retrieveFromAccountOpal(getNewValues()));
		}
		if (myNewToAccountOpal != AccountOpal.NOT_YET_LOADED) {
			setToAccountOpal(retrieveToAccountOpal(getNewValues()));
		}
	}

}
