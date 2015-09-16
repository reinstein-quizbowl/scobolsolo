package com.scobolsolo.persistence;

import java.io.PrintWriter;
import java.io.PrintStream;

import com.opal.*;

import com.scobolsolo.application.*;

@StoreGeneratedPrimaryKey
public final class DiffOpal extends com.opal.UpdatableOpal<Diff> {

	private DiffOpal() {
		super();
		setUserFacing(null);
	}

	public DiffOpal(OpalFactory<Diff, DiffOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void applyDefaults() {
		getNewValues()[7] = java.time.LocalDateTime.now();
		return;
	}

	@Override
	protected void initializeReferences() {
		myOldEditorOpal = AccountOpal.NOT_YET_LOADED;
		myOldQuestionOpal = QuestionOpal.NOT_YET_LOADED;
		myOldStatusOpal = QuestionStatusOpal.NOT_YET_LOADED;
		myOldCategoryOpal = CategoryOpal.NOT_YET_LOADED;
		return;
	}

	/* package */ static final String[] ourFieldNames = new String[] {
		"Id",
		"EditorAccountId",
		"Text",
		"Answer",
		"Note",
		"Remark",
		"EditDistance",
		"Timestamp",
		"QuestionId",
		"RevisionNumber",
		"QuestionStatusCode",
		"CategoryCode",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.Integer.class,
		java.time.LocalDateTime.class,
		java.lang.Integer.class,
		java.lang.Integer.class,
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
		false,
		true,
		false,
		false,
		false,
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
	};

	public static final DiffOpal NOT_YET_LOADED = new DiffOpal();

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

	public synchronized java.lang.Integer getEditorAccountIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[1];
	}

	public synchronized java.lang.String getText() {
		return (java.lang.String) getReadValueSet()[2];
	}

	public synchronized java.lang.String getAnswer() {
		return (java.lang.String) getReadValueSet()[3];
	}

	public synchronized java.lang.String getNote() {
		return (java.lang.String) getReadValueSet()[4];
	}

	public synchronized java.lang.String getRemark() {
		return (java.lang.String) getReadValueSet()[5];
	}

	public synchronized java.lang.Integer getEditDistanceAsObject() {
		return (java.lang.Integer) getReadValueSet()[6];
	}

	public synchronized java.time.LocalDateTime getTimestamp() {
		return (java.time.LocalDateTime) getReadValueSet()[7];
	}

	public synchronized java.lang.Integer getQuestionIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[8];
	}

	public synchronized java.lang.Integer getRevisionNumberAsObject() {
		return (java.lang.Integer) getReadValueSet()[9];
	}

	public synchronized java.lang.String getQuestionStatusCode() {
		return (java.lang.String) getReadValueSet()[10];
	}

	public synchronized java.lang.String getCategoryCode() {
		return (java.lang.String) getReadValueSet()[11];
	}

	public synchronized DiffOpal setId(final java.lang.Integer argId) {
		tryMutate();
		if (argId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myId on " + this + " to null.");
		}
		getNewValues()[0] = argId;
		return this;
	}

	public DiffOpal setId(final int argId) {
		setId(java.lang.Integer.valueOf(argId));
		return this;
	}

	public synchronized DiffOpal setEditorAccountId(final java.lang.Integer argEditorAccountId) {
		tryMutate();
		if (argEditorAccountId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myEditorAccountId on " + this + " to null.");
		}
		getNewValues()[1] = argEditorAccountId;
		return this;
	}

	public DiffOpal setEditorAccountId(final int argEditorAccountId) {
		setEditorAccountId(java.lang.Integer.valueOf(argEditorAccountId));
		return this;
	}

	public synchronized DiffOpal setText(final java.lang.String argText) {
		tryMutate();
		if (argText == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myText on " + this + " to null.");
		}
		getNewValues()[2] = argText;
		return this;
	}

	public synchronized DiffOpal setAnswer(final java.lang.String argAnswer) {
		tryMutate();
		if (argAnswer == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myAnswer on " + this + " to null.");
		}
		getNewValues()[3] = argAnswer;
		return this;
	}

	public synchronized DiffOpal setNote(final java.lang.String argNote) {
		tryMutate();
		getNewValues()[4] = argNote;
		return this;
	}

	public synchronized DiffOpal setRemark(final java.lang.String argRemark) {
		tryMutate();
		getNewValues()[5] = argRemark;
		return this;
	}

	public synchronized DiffOpal setEditDistance(final java.lang.Integer argEditDistance) {
		tryMutate();
		if (argEditDistance == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myEditDistance on " + this + " to null.");
		}
		getNewValues()[6] = argEditDistance;
		return this;
	}

	public DiffOpal setEditDistance(final int argEditDistance) {
		setEditDistance(java.lang.Integer.valueOf(argEditDistance));
		return this;
	}

	public synchronized DiffOpal setTimestamp(final java.time.LocalDateTime argTimestamp) {
		tryMutate();
		getNewValues()[7] = argTimestamp;
		return this;
	}

	public synchronized DiffOpal setQuestionId(final java.lang.Integer argQuestionId) {
		tryMutate();
		if (argQuestionId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myQuestionId on " + this + " to null.");
		}
		getNewValues()[8] = argQuestionId;
		return this;
	}

	public DiffOpal setQuestionId(final int argQuestionId) {
		setQuestionId(java.lang.Integer.valueOf(argQuestionId));
		return this;
	}

	public synchronized DiffOpal setRevisionNumber(final java.lang.Integer argRevisionNumber) {
		tryMutate();
		if (argRevisionNumber == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myRevisionNumber on " + this + " to null.");
		}
		getNewValues()[9] = argRevisionNumber;
		return this;
	}

	public DiffOpal setRevisionNumber(final int argRevisionNumber) {
		setRevisionNumber(java.lang.Integer.valueOf(argRevisionNumber));
		return this;
	}

	public synchronized DiffOpal setQuestionStatusCode(final java.lang.String argQuestionStatusCode) {
		tryMutate();
		if (argQuestionStatusCode == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myQuestionStatusCode on " + this + " to null.");
		}
		if (argQuestionStatusCode.length() > 32) {
			throw new com.opal.ArgumentTooLongException("Maximum length of myQuestionStatusCode on " + this + " is 32.", argQuestionStatusCode.length(), 32);
		}
		getNewValues()[10] = argQuestionStatusCode;
		return this;
	}

	public synchronized DiffOpal setCategoryCode(final java.lang.String argCategoryCode) {
		tryMutate();
		if (argCategoryCode == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myCategoryCode on " + this + " to null.");
		}
		if (argCategoryCode.length() > 32) {
			throw new com.opal.ArgumentTooLongException("Maximum length of myCategoryCode on " + this + " is 32.", argCategoryCode.length(), 32);
		}
		getNewValues()[11] = argCategoryCode;
		return this;
	}

	@Override
	protected /* synchronized */ void copyOldValuesToNewInternal() {
		myNewEditorOpal = myOldEditorOpal;
		myNewQuestionOpal = myOldQuestionOpal;
		myNewStatusOpal = myOldStatusOpal;
		myNewCategoryOpal = myOldCategoryOpal;
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		myOldEditorOpal = myNewEditorOpal;
		myOldQuestionOpal = myNewQuestionOpal;
		myOldStatusOpal = myNewStatusOpal;
		myOldCategoryOpal = myNewCategoryOpal;

		return;
	}

	@Override
	protected void unlinkInternal() {
		if (getEditorOpal() != null) {
			getEditorOpal().removeEditorDiffOpalInternal(this);
		}
		if (getQuestionOpal() != null) {
			getQuestionOpal().removeDiffOpalInternal(this);
		}
		if (getStatusOpal() != null) {
			getStatusOpal().removeDiffOpalInternal(this);
		}
		if (getCategoryOpal() != null) {
			getCategoryOpal().removeDiffOpalInternal(this);
		}
		return;
	}

	@Override
	protected void copyFieldsToInternal(UpdatableOpal<Diff> argTarget) {
		Object[] lclValues = getReadValueSet();
		Object[] lclTargetNewValues = argTarget.getNewValues();
		/* Field 0 (Id) is database generated. */
		lclTargetNewValues[1] = lclValues[1]; /* EditorAccountId (immutable) */
		lclTargetNewValues[2] = lclValues[2]; /* Text (immutable) */
		lclTargetNewValues[3] = lclValues[3]; /* Answer (immutable) */
		lclTargetNewValues[4] = lclValues[4]; /* Note (immutable) */
		lclTargetNewValues[5] = lclValues[5]; /* Remark (immutable) */
		lclTargetNewValues[6] = lclValues[6]; /* EditDistance (immutable) */
		lclTargetNewValues[7] = lclValues[7]; /* Timestamp (immutable) */
		lclTargetNewValues[8] = lclValues[8]; /* QuestionId (immutable) */
		lclTargetNewValues[9] = lclValues[9]; /* RevisionNumber (immutable) */
		lclTargetNewValues[10] = lclValues[10]; /* QuestionStatusCode (immutable) */
		lclTargetNewValues[11] = lclValues[11]; /* CategoryCode (immutable) */

		return;
	}

	@Override
	public synchronized void translateReferencesToFields() {
		if (myNewEditorOpal != AccountOpal.NOT_YET_LOADED) {
			setEditorAccountId(myNewEditorOpal == null ? null : myNewEditorOpal.getIdAsObject());
		}
		if (myNewQuestionOpal != QuestionOpal.NOT_YET_LOADED) {
			setQuestionId(myNewQuestionOpal == null ? null : myNewQuestionOpal.getIdAsObject());
		}
		if (myNewStatusOpal != QuestionStatusOpal.NOT_YET_LOADED) {
			setQuestionStatusCode(myNewStatusOpal == null ? null : myNewStatusOpal.getCode());
		}
		if (myNewCategoryOpal != CategoryOpal.NOT_YET_LOADED) {
			setCategoryCode(myNewCategoryOpal == null ? null : myNewCategoryOpal.getCode());
		}
		return;
	}

	@Override
	public java.util.Set<com.opal.TransactionAware> getRequiredPriorCommits() {
		java.util.Set<com.opal.TransactionAware> lclTAs = null;
		UpdatableOpal<?> lclUO;
		lclUO = myNewCategoryOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		lclUO = myNewEditorOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		lclUO = myNewQuestionOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		lclUO = myNewStatusOpal;
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
		UpdatableOpal<?> lclUO;
		if ((lclUO = myOldCategoryOpal) == CategoryOpal.NOT_YET_LOADED) {
			lclUO = myOldCategoryOpal = retrieveCategoryOpal(getOldValues());
		}
		if (lclUO != null && lclUO.isDeleted()) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		if ((lclUO = myOldEditorOpal) == AccountOpal.NOT_YET_LOADED) {
			lclUO = myOldEditorOpal = retrieveEditorOpal(getOldValues());
		}
		if (lclUO != null && lclUO.isDeleted()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		if ((lclUO = myOldQuestionOpal) == QuestionOpal.NOT_YET_LOADED) {
			lclUO = myOldQuestionOpal = retrieveQuestionOpal(getOldValues());
		}
		if (lclUO != null && lclUO.isDeleted()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		if ((lclUO = myOldStatusOpal) == QuestionStatusOpal.NOT_YET_LOADED) {
			lclUO = myOldStatusOpal = retrieveStatusOpal(getOldValues());
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
	public synchronized void output(final PrintWriter argPW) {
		argPW.println("Id = " + getIdAsObject());
		argPW.println("EditorAccountId = " + getEditorAccountIdAsObject());
		argPW.println("Text = " + getText());
		argPW.println("Answer = " + getAnswer());
		argPW.println("Note = " + getNote());
		argPW.println("Remark = " + getRemark());
		argPW.println("EditDistance = " + getEditDistanceAsObject());
		argPW.println("Timestamp = " + getTimestamp());
		argPW.println("QuestionId = " + getQuestionIdAsObject());
		argPW.println("RevisionNumber = " + getRevisionNumberAsObject());
		argPW.println("QuestionStatusCode = " + getQuestionStatusCode());
		argPW.println("CategoryCode = " + getCategoryCode());
	}

	@Override
	public synchronized void output(final PrintStream argPS) {
		argPS.println("Id = " + getIdAsObject());
		argPS.println("EditorAccountId = " + getEditorAccountIdAsObject());
		argPS.println("Text = " + getText());
		argPS.println("Answer = " + getAnswer());
		argPS.println("Note = " + getNote());
		argPS.println("Remark = " + getRemark());
		argPS.println("EditDistance = " + getEditDistanceAsObject());
		argPS.println("Timestamp = " + getTimestamp());
		argPS.println("QuestionId = " + getQuestionIdAsObject());
		argPS.println("RevisionNumber = " + getRevisionNumberAsObject());
		argPS.println("QuestionStatusCode = " + getQuestionStatusCode());
		argPS.println("CategoryCode = " + getCategoryCode());
	}

	private AccountOpal myOldEditorOpal;
	private AccountOpal myNewEditorOpal;

	protected AccountOpal retrieveEditorOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[1] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getAccountOpalFactory().forId(getEditorAccountIdAsObject());
	}

	public synchronized AccountOpal getEditorOpal() {
		AccountOpal lclAccountOpal;
		boolean lclAccess = tryAccess();
		lclAccountOpal = lclAccess ? myNewEditorOpal : myOldEditorOpal;
		if (lclAccountOpal == AccountOpal.NOT_YET_LOADED) {
			lclAccountOpal = retrieveEditorOpal(getReadValueSet());
			if (lclAccess) {
				myNewEditorOpal = lclAccountOpal;
			} else {
				myOldEditorOpal = lclAccountOpal;
			}
		}
		return lclAccountOpal;
	}

	public synchronized DiffOpal setEditorOpal(AccountOpal argAccountOpal) {
		tryMutate();
		AccountOpal lclAccountOpal = getEditorOpal();
		if (lclAccountOpal == argAccountOpal) { return this; }
		if (lclAccountOpal != null) {
			lclAccountOpal.removeEditorDiffOpalInternal(this);
		}
		myNewEditorOpal = argAccountOpal;
		if (argAccountOpal != null) {
			argAccountOpal.addEditorDiffOpalInternal(this);
		}
		return this;
	}

	protected synchronized void setEditorOpalInternal(AccountOpal argAccountOpal) {
		tryMutate();
		myNewEditorOpal = argAccountOpal;
	}

	private QuestionOpal myOldQuestionOpal;
	private QuestionOpal myNewQuestionOpal;

	protected QuestionOpal retrieveQuestionOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[8] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getQuestionOpalFactory().forId(getQuestionIdAsObject());
	}

	public synchronized QuestionOpal getQuestionOpal() {
		QuestionOpal lclQuestionOpal;
		boolean lclAccess = tryAccess();
		lclQuestionOpal = lclAccess ? myNewQuestionOpal : myOldQuestionOpal;
		if (lclQuestionOpal == QuestionOpal.NOT_YET_LOADED) {
			lclQuestionOpal = retrieveQuestionOpal(getReadValueSet());
			if (lclAccess) {
				myNewQuestionOpal = lclQuestionOpal;
			} else {
				myOldQuestionOpal = lclQuestionOpal;
			}
		}
		return lclQuestionOpal;
	}

	public synchronized DiffOpal setQuestionOpal(QuestionOpal argQuestionOpal) {
		tryMutate();
		QuestionOpal lclQuestionOpal = getQuestionOpal();
		if (lclQuestionOpal == argQuestionOpal) { return this; }
		if (lclQuestionOpal != null) {
			lclQuestionOpal.removeDiffOpalInternal(this);
		}
		myNewQuestionOpal = argQuestionOpal;
		if (argQuestionOpal != null) {
			argQuestionOpal.addDiffOpalInternal(this);
		}
		return this;
	}

	protected synchronized void setQuestionOpalInternal(QuestionOpal argQuestionOpal) {
		tryMutate();
		myNewQuestionOpal = argQuestionOpal;
	}

	private QuestionStatusOpal myOldStatusOpal;
	private QuestionStatusOpal myNewStatusOpal;

	protected QuestionStatusOpal retrieveStatusOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[10] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getQuestionStatusOpalFactory().forCode(getQuestionStatusCode());
	}

	public synchronized QuestionStatusOpal getStatusOpal() {
		QuestionStatusOpal lclQuestionStatusOpal;
		boolean lclAccess = tryAccess();
		lclQuestionStatusOpal = lclAccess ? myNewStatusOpal : myOldStatusOpal;
		if (lclQuestionStatusOpal == QuestionStatusOpal.NOT_YET_LOADED) {
			lclQuestionStatusOpal = retrieveStatusOpal(getReadValueSet());
			if (lclAccess) {
				myNewStatusOpal = lclQuestionStatusOpal;
			} else {
				myOldStatusOpal = lclQuestionStatusOpal;
			}
		}
		return lclQuestionStatusOpal;
	}

	public synchronized DiffOpal setStatusOpal(QuestionStatusOpal argQuestionStatusOpal) {
		tryMutate();
		QuestionStatusOpal lclQuestionStatusOpal = getStatusOpal();
		if (lclQuestionStatusOpal == argQuestionStatusOpal) { return this; }
		if (lclQuestionStatusOpal != null) {
			lclQuestionStatusOpal.removeDiffOpalInternal(this);
		}
		myNewStatusOpal = argQuestionStatusOpal;
		if (argQuestionStatusOpal != null) {
			argQuestionStatusOpal.addDiffOpalInternal(this);
		}
		return this;
	}

	protected synchronized void setStatusOpalInternal(QuestionStatusOpal argQuestionStatusOpal) {
		tryMutate();
		myNewStatusOpal = argQuestionStatusOpal;
	}

	private CategoryOpal myOldCategoryOpal;
	private CategoryOpal myNewCategoryOpal;

	protected CategoryOpal retrieveCategoryOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[11] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getCategoryOpalFactory().forCode(getCategoryCode());
	}

	public synchronized CategoryOpal getCategoryOpal() {
		CategoryOpal lclCategoryOpal;
		boolean lclAccess = tryAccess();
		lclCategoryOpal = lclAccess ? myNewCategoryOpal : myOldCategoryOpal;
		if (lclCategoryOpal == CategoryOpal.NOT_YET_LOADED) {
			lclCategoryOpal = retrieveCategoryOpal(getReadValueSet());
			if (lclAccess) {
				myNewCategoryOpal = lclCategoryOpal;
			} else {
				myOldCategoryOpal = lclCategoryOpal;
			}
		}
		return lclCategoryOpal;
	}

	public synchronized DiffOpal setCategoryOpal(CategoryOpal argCategoryOpal) {
		tryMutate();
		CategoryOpal lclCategoryOpal = getCategoryOpal();
		if (lclCategoryOpal == argCategoryOpal) { return this; }
		if (lclCategoryOpal != null) {
			lclCategoryOpal.removeDiffOpalInternal(this);
		}
		myNewCategoryOpal = argCategoryOpal;
		if (argCategoryOpal != null) {
			argCategoryOpal.addDiffOpalInternal(this);
		}
		return this;
	}

	protected synchronized void setCategoryOpalInternal(CategoryOpal argCategoryOpal) {
		tryMutate();
		myNewCategoryOpal = argCategoryOpal;
	}

	@Override
	public String toString() {
		StringBuilder lclSB =  new StringBuilder(64);
		lclSB.append("DiffOpal[");
		lclSB.append("myId=");
		lclSB.append(toStringField(0));
		lclSB.append(']');
		return lclSB.toString();
	}

	@Override
	protected void updateReferencesAfterReload() {
		if (myNewEditorOpal != AccountOpal.NOT_YET_LOADED) {
			setEditorOpal(retrieveEditorOpal(getNewValues()));
		}
		if (myNewQuestionOpal != QuestionOpal.NOT_YET_LOADED) {
			setQuestionOpal(retrieveQuestionOpal(getNewValues()));
		}
		if (myNewStatusOpal != QuestionStatusOpal.NOT_YET_LOADED) {
			setStatusOpal(retrieveStatusOpal(getNewValues()));
		}
		if (myNewCategoryOpal != CategoryOpal.NOT_YET_LOADED) {
			setCategoryOpal(retrieveCategoryOpal(getNewValues()));
		}
	}

}
