package com.scobolsolo.persistence;

import com.scobolsolo.application.StaffRole;

public final class StaffRoleOpal extends com.opal.UpdatableOpal<StaffRole> {
	public static final java.lang.Boolean ourDefaultMayEnterAnyMatch = java.lang.Boolean.FALSE;
	public static final java.lang.Boolean ourDefaultMayEnterMatchesInAssignedRoom = java.lang.Boolean.TRUE;
	public static final java.lang.Boolean ourDefaultMayViewQuestions = java.lang.Boolean.FALSE;
	public static final java.lang.Boolean ourDefaultMayEnterMatchesBeforeUsuallyPermitted = java.lang.Boolean.FALSE;

	private StaffRoleOpal() {
		super();
		setUserFacing(null);
	}

	public StaffRoleOpal(com.opal.OpalFactory<StaffRole, StaffRoleOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void applyDefaults() {
		getNewValues()[5] = ourDefaultMayEnterAnyMatch;
		getNewValues()[6] = ourDefaultMayEnterMatchesInAssignedRoom;
		getNewValues()[7] = ourDefaultMayViewQuestions;
		getNewValues()[8] = ourDefaultMayEnterMatchesBeforeUsuallyPermitted;
		return;
	}

	/* package */ static final String[] ourFieldNames = new String[] {
		"Code",
		"Name",
		"ShortName",
		"VeryShortName",
		"Sequence",
		"MayEnterAnyMatch",
		"MayEnterMatchesInAssignedRoom",
		"MayViewQuestions",
		"MayEnterMatchesBeforeUsuallyPermitted",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.String.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.Integer.class,
		java.lang.Boolean.class,
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

	public static final StaffRoleOpal NOT_YET_LOADED = new StaffRoleOpal();

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


	public synchronized java.lang.String getCode() {
		return (java.lang.String) getReadValueSet()[0];
	}

	public synchronized java.lang.String getName() {
		return (java.lang.String) getReadValueSet()[1];
	}

	public synchronized java.lang.String getShortName() {
		return (java.lang.String) getReadValueSet()[2];
	}

	public synchronized java.lang.String getVeryShortName() {
		return (java.lang.String) getReadValueSet()[3];
	}

	public synchronized java.lang.Integer getSequenceAsObject() {
		return (java.lang.Integer) getReadValueSet()[4];
	}

	public synchronized java.lang.Boolean isMayEnterAnyMatchAsObject() {
		return (java.lang.Boolean) getReadValueSet()[5];
	}

	public synchronized java.lang.Boolean isMayEnterMatchesInAssignedRoomAsObject() {
		return (java.lang.Boolean) getReadValueSet()[6];
	}

	public synchronized java.lang.Boolean isMayViewQuestionsAsObject() {
		return (java.lang.Boolean) getReadValueSet()[7];
	}

	public synchronized java.lang.Boolean isMayEnterMatchesBeforeUsuallyPermittedAsObject() {
		return (java.lang.Boolean) getReadValueSet()[8];
	}

	public synchronized StaffRoleOpal setCode(final java.lang.String argCode) {
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

	public synchronized StaffRoleOpal setName(final java.lang.String argName) {
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

	public synchronized StaffRoleOpal setShortName(final java.lang.String argShortName) {
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

	public synchronized StaffRoleOpal setVeryShortName(final java.lang.String argVeryShortName) {
		tryMutate();
		if (argVeryShortName == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myVeryShortName on " + this + " to null.");
		}
		if (argVeryShortName.length() > 12) {
			throw new com.opal.ArgumentTooLongException("Maximum length of myVeryShortName on " + this + " is 12.", argVeryShortName.length(), 12);
		}
		getNewValues()[3] = argVeryShortName;
		return this;
	}

	public synchronized StaffRoleOpal setSequence(final java.lang.Integer argSequence) {
		tryMutate();
		if (argSequence == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set mySequence on " + this + " to null.");
		}
		getNewValues()[4] = argSequence;
		return this;
	}

	public StaffRoleOpal setSequence(final int argSequence) {
		setSequence(java.lang.Integer.valueOf(argSequence));
		return this;
	}

	public synchronized StaffRoleOpal setMayEnterAnyMatch(final java.lang.Boolean argMayEnterAnyMatch) {
		tryMutate();
		if (argMayEnterAnyMatch == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myMayEnterAnyMatch on " + this + " to null.");
		}
		getNewValues()[5] = argMayEnterAnyMatch;
		return this;
	}

	public StaffRoleOpal setMayEnterAnyMatch(final boolean argMayEnterAnyMatch) {
		setMayEnterAnyMatch(argMayEnterAnyMatch ? Boolean.TRUE : Boolean.FALSE);
		return this;
	}

	public synchronized StaffRoleOpal setMayEnterMatchesInAssignedRoom(final java.lang.Boolean argMayEnterMatchesInAssignedRoom) {
		tryMutate();
		if (argMayEnterMatchesInAssignedRoom == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myMayEnterMatchesInAssignedRoom on " + this + " to null.");
		}
		getNewValues()[6] = argMayEnterMatchesInAssignedRoom;
		return this;
	}

	public StaffRoleOpal setMayEnterMatchesInAssignedRoom(final boolean argMayEnterMatchesInAssignedRoom) {
		setMayEnterMatchesInAssignedRoom(argMayEnterMatchesInAssignedRoom ? Boolean.TRUE : Boolean.FALSE);
		return this;
	}

	public synchronized StaffRoleOpal setMayViewQuestions(final java.lang.Boolean argMayViewQuestions) {
		tryMutate();
		if (argMayViewQuestions == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myMayViewQuestions on " + this + " to null.");
		}
		getNewValues()[7] = argMayViewQuestions;
		return this;
	}

	public StaffRoleOpal setMayViewQuestions(final boolean argMayViewQuestions) {
		setMayViewQuestions(argMayViewQuestions ? Boolean.TRUE : Boolean.FALSE);
		return this;
	}

	public synchronized StaffRoleOpal setMayEnterMatchesBeforeUsuallyPermitted(final java.lang.Boolean argMayEnterMatchesBeforeUsuallyPermitted) {
		tryMutate();
		if (argMayEnterMatchesBeforeUsuallyPermitted == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myMayEnterMatchesBeforeUsuallyPermitted on " + this + " to null.");
		}
		getNewValues()[8] = argMayEnterMatchesBeforeUsuallyPermitted;
		return this;
	}

	public StaffRoleOpal setMayEnterMatchesBeforeUsuallyPermitted(final boolean argMayEnterMatchesBeforeUsuallyPermitted) {
		setMayEnterMatchesBeforeUsuallyPermitted(argMayEnterMatchesBeforeUsuallyPermitted ? Boolean.TRUE : Boolean.FALSE);
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
	protected void copyFieldsToInternal(com.opal.UpdatableOpal<StaffRole> argTarget) {
		Object[] lclValues = getReadValueSet();
		Object[] lclTargetNewValues = argTarget.getNewValues();
		/* Field 0 (Code) is part of a unique key. */
		/* Field 1 (Name) is part of a unique key. */
		/* Field 2 (ShortName) is part of a unique key. */
		/* Field 3 (VeryShortName) is part of a unique key. */
		lclTargetNewValues[4] = lclValues[4]; /* Sequence (immutable) */
		lclTargetNewValues[5] = lclValues[5]; /* MayEnterAnyMatch (immutable) */
		lclTargetNewValues[6] = lclValues[6]; /* MayEnterMatchesInAssignedRoom (immutable) */
		lclTargetNewValues[7] = lclValues[7]; /* MayViewQuestions (immutable) */
		lclTargetNewValues[8] = lclValues[8]; /* MayEnterMatchesBeforeUsuallyPermitted (immutable) */

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
		argOutput.println("Code = " + getCode());
		argOutput.println("Name = " + getName());
		argOutput.println("ShortName = " + getShortName());
		argOutput.println("VeryShortName = " + getVeryShortName());
		argOutput.println("Sequence = " + getSequenceAsObject());
		argOutput.println("MayEnterAnyMatch = " + isMayEnterAnyMatchAsObject());
		argOutput.println("MayEnterMatchesInAssignedRoom = " + isMayEnterMatchesInAssignedRoomAsObject());
		argOutput.println("MayViewQuestions = " + isMayViewQuestionsAsObject());
		argOutput.println("MayEnterMatchesBeforeUsuallyPermitted = " + isMayEnterMatchesBeforeUsuallyPermittedAsObject());
	}

	@Override
	public synchronized void output(final java.io.PrintWriter argOutput) {
		argOutput.println("Code = " + getCode());
		argOutput.println("Name = " + getName());
		argOutput.println("ShortName = " + getShortName());
		argOutput.println("VeryShortName = " + getVeryShortName());
		argOutput.println("Sequence = " + getSequenceAsObject());
		argOutput.println("MayEnterAnyMatch = " + isMayEnterAnyMatchAsObject());
		argOutput.println("MayEnterMatchesInAssignedRoom = " + isMayEnterMatchesInAssignedRoomAsObject());
		argOutput.println("MayViewQuestions = " + isMayViewQuestionsAsObject());
		argOutput.println("MayEnterMatchesBeforeUsuallyPermitted = " + isMayEnterMatchesBeforeUsuallyPermittedAsObject());
	}

	@Override
	public String toString() {
		StringBuilder lclSB =  new StringBuilder(64);
		lclSB.append("StaffRoleOpal[");
		lclSB.append("myCode=");
		lclSB.append(toStringField(0));
		lclSB.append(']');
		return lclSB.toString();
	}

}
