package com.scobolsolo.persistence;

import java.io.PrintWriter;
import java.io.PrintStream;

import com.opal.*;

import com.scobolsolo.application.*;

public final class ResponseTypeOpal extends com.opal.UpdatableOpal<ResponseType> {
	public static final java.lang.String ourDefaultBootstrapButtonClass = "btn-default";
	public static final java.lang.Boolean ourDefaultDefault = java.lang.Boolean.FALSE;
	public static final java.lang.Boolean ourDefaultMultipleAllowedForSamePlacement = java.lang.Boolean.FALSE;
	public static final java.lang.Boolean ourDefaultAttempt = java.lang.Boolean.TRUE;

	private ResponseTypeOpal() {
		super();
		setUserFacing(null);
	}

	public ResponseTypeOpal(OpalFactory<ResponseType, ResponseTypeOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void applyDefaults() {
		getNewValues()[5] = ourDefaultBootstrapButtonClass;
		getNewValues()[6] = ourDefaultDefault;
		getNewValues()[7] = ourDefaultMultipleAllowedForSamePlacement;
		getNewValues()[8] = ourDefaultAttempt;
		return;
	}

	/* package */ static final String[] ourFieldNames = new String[] {
		"Code",
		"Name",
		"ShortName",
		"Sequence",
		"Points",
		"BootstrapButtonClass",
		"Default",
		"MultipleAllowedForSamePlacement",
		"Attempt",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.String.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.lang.String.class,
		java.lang.Boolean.class,
		java.lang.Boolean.class,
		java.lang.Boolean.class,
	};

	/* package */ static final boolean[] ourFieldNullability = new boolean[] {
		false,
		false,
		false,
		false,
		false,
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
	};

	public static final ResponseTypeOpal NOT_YET_LOADED = new ResponseTypeOpal();

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


	public synchronized java.lang.String getCode() {
		return (java.lang.String) getReadValueSet()[0];
	}

	public synchronized java.lang.String getName() {
		return (java.lang.String) getReadValueSet()[1];
	}

	public synchronized java.lang.String getShortName() {
		return (java.lang.String) getReadValueSet()[2];
	}

	public synchronized java.lang.Integer getSequenceAsObject() {
		return (java.lang.Integer) getReadValueSet()[3];
	}

	public synchronized java.lang.Integer getPointsAsObject() {
		return (java.lang.Integer) getReadValueSet()[4];
	}

	public synchronized java.lang.String getBootstrapButtonClass() {
		return (java.lang.String) getReadValueSet()[5];
	}

	public synchronized java.lang.Boolean isDefaultAsObject() {
		return (java.lang.Boolean) getReadValueSet()[6];
	}

	public synchronized java.lang.Boolean isMultipleAllowedForSamePlacementAsObject() {
		return (java.lang.Boolean) getReadValueSet()[7];
	}

	public synchronized java.lang.Boolean isAttemptAsObject() {
		return (java.lang.Boolean) getReadValueSet()[8];
	}

	public synchronized ResponseTypeOpal setCode(final java.lang.String argCode) {
		tryMutate();
		if (argCode == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myCode on " + this + " to null.");
		}
		if (argCode.length() > 32) {
			throw new com.opal.ArgumentTooLongException("Maximum length of myCode on " + this + " is 32.", argCode.length(), 32);
		}
		getNewValues()[0] = argCode;
		return this;
	}

	public synchronized ResponseTypeOpal setName(final java.lang.String argName) {
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

	public synchronized ResponseTypeOpal setShortName(final java.lang.String argShortName) {
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

	public synchronized ResponseTypeOpal setSequence(final java.lang.Integer argSequence) {
		tryMutate();
		if (argSequence == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set mySequence on " + this + " to null.");
		}
		getNewValues()[3] = argSequence;
		return this;
	}

	public ResponseTypeOpal setSequence(final int argSequence) {
		setSequence(java.lang.Integer.valueOf(argSequence));
		return this;
	}

	public synchronized ResponseTypeOpal setPoints(final java.lang.Integer argPoints) {
		tryMutate();
		if (argPoints == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myPoints on " + this + " to null.");
		}
		getNewValues()[4] = argPoints;
		return this;
	}

	public ResponseTypeOpal setPoints(final int argPoints) {
		setPoints(java.lang.Integer.valueOf(argPoints));
		return this;
	}

	public synchronized ResponseTypeOpal setBootstrapButtonClass(final java.lang.String argBootstrapButtonClass) {
		tryMutate();
		if (argBootstrapButtonClass == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myBootstrapButtonClass on " + this + " to null.");
		}
		if (argBootstrapButtonClass.length() > 64) {
			throw new com.opal.ArgumentTooLongException("Maximum length of myBootstrapButtonClass on " + this + " is 64.", argBootstrapButtonClass.length(), 64);
		}
		getNewValues()[5] = argBootstrapButtonClass;
		return this;
	}

	public synchronized ResponseTypeOpal setDefault(final java.lang.Boolean argDefault) {
		tryMutate();
		if (argDefault == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myDefault on " + this + " to null.");
		}
		getNewValues()[6] = argDefault;
		return this;
	}

	public ResponseTypeOpal setDefault(final boolean argDefault) {
		setDefault(argDefault ? Boolean.TRUE : Boolean.FALSE);
		return this;
	}

	public synchronized ResponseTypeOpal setMultipleAllowedForSamePlacement(final java.lang.Boolean argMultipleAllowedForSamePlacement) {
		tryMutate();
		if (argMultipleAllowedForSamePlacement == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myMultipleAllowedForSamePlacement on " + this + " to null.");
		}
		getNewValues()[7] = argMultipleAllowedForSamePlacement;
		return this;
	}

	public ResponseTypeOpal setMultipleAllowedForSamePlacement(final boolean argMultipleAllowedForSamePlacement) {
		setMultipleAllowedForSamePlacement(argMultipleAllowedForSamePlacement ? Boolean.TRUE : Boolean.FALSE);
		return this;
	}

	public synchronized ResponseTypeOpal setAttempt(final java.lang.Boolean argAttempt) {
		tryMutate();
		if (argAttempt == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myAttempt on " + this + " to null.");
		}
		getNewValues()[8] = argAttempt;
		return this;
	}

	public ResponseTypeOpal setAttempt(final boolean argAttempt) {
		setAttempt(argAttempt ? Boolean.TRUE : Boolean.FALSE);
		return this;
	}

	@Override
	protected /* synchronized */ void copyOldValuesToNewInternal() {
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		/** This Opal has no references to other Opals that need to be copied. */
		return;
	}

	@Override
	protected void unlinkInternal() {
		return;
	}

	@Override
	protected void copyFieldsToInternal(UpdatableOpal<ResponseType> argTarget) {
		Object[] lclValues = getReadValueSet();
		Object[] lclTargetNewValues = argTarget.getNewValues();
		/* Field 0 (Code) is part of a unique key. */
		/* Field 1 (Name) is part of a unique key. */
		/* Field 2 (ShortName) is part of a unique key. */
		lclTargetNewValues[3] = lclValues[3]; /* Sequence (immutable) */
		lclTargetNewValues[4] = lclValues[4]; /* Points (immutable) */
		lclTargetNewValues[5] = lclValues[5]; /* BootstrapButtonClass (immutable) */
		lclTargetNewValues[6] = lclValues[6]; /* Default (immutable) */
		lclTargetNewValues[7] = lclValues[7]; /* MultipleAllowedForSamePlacement (immutable) */
		lclTargetNewValues[8] = lclValues[8]; /* Attempt (immutable) */

		return;
	}

	@Override
	public synchronized void translateReferencesToFields() {
		return;
	}

	@Override
	public java.util.Set<TransactionAware> getRequiredPriorCommits() {
		return java.util.Collections.emptySet();
	}

	@Override
	public java.util.Set<TransactionAware> getRequiredSubsequentCommits() {
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
	public synchronized void output(final PrintWriter argPW) {
		argPW.println("Code = " + getCode());
		argPW.println("Name = " + getName());
		argPW.println("ShortName = " + getShortName());
		argPW.println("Sequence = " + getSequenceAsObject());
		argPW.println("Points = " + getPointsAsObject());
		argPW.println("BootstrapButtonClass = " + getBootstrapButtonClass());
		argPW.println("Default = " + isDefaultAsObject());
		argPW.println("MultipleAllowedForSamePlacement = " + isMultipleAllowedForSamePlacementAsObject());
		argPW.println("Attempt = " + isAttemptAsObject());
	}

	@Override
	public synchronized void output(final PrintStream argPS) {
		argPS.println("Code = " + getCode());
		argPS.println("Name = " + getName());
		argPS.println("ShortName = " + getShortName());
		argPS.println("Sequence = " + getSequenceAsObject());
		argPS.println("Points = " + getPointsAsObject());
		argPS.println("BootstrapButtonClass = " + getBootstrapButtonClass());
		argPS.println("Default = " + isDefaultAsObject());
		argPS.println("MultipleAllowedForSamePlacement = " + isMultipleAllowedForSamePlacementAsObject());
		argPS.println("Attempt = " + isAttemptAsObject());
	}

	@Override
	public String toString() {
		StringBuilder lclSB =  new StringBuilder(64);
		lclSB.append("ResponseTypeOpal[");
		lclSB.append("myCode=");
		lclSB.append(toStringField(0));
		lclSB.append(']');
		return lclSB.toString();
	}

}
