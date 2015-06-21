package com.scobolsolo.persistence;

import java.io.PrintWriter;
import java.io.PrintStream;

import com.opal.*;

import com.scobolsolo.application.*;

@StoreGeneratedPrimaryKey
public final class StaffAssignmentOpal extends com.opal.UpdatableOpal<StaffAssignment> {

	private StaffAssignmentOpal() {
		super();
		setUserFacing(null);
	}

	public StaffAssignmentOpal(OpalFactory<StaffAssignment, StaffAssignmentOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void initializeReferences() {
		myOldStaffOpal = StaffOpal.NOT_YET_LOADED;
		myOldRoomOpal = RoomOpal.NOT_YET_LOADED;
		myOldPhaseOpal = PhaseOpal.NOT_YET_LOADED;
		myOldStaffRoleOpal = StaffRoleOpal.NOT_YET_LOADED;
		return;
	}

	/* package */ static final String[] ourFieldNames = new String[] {
		"Id",
		"RoomId",
		"Note",
		"StaffId",
		"PhaseId",
		"StaffRoleCode",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.lang.String.class,
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.lang.String.class,
	};

	/* package */ static final boolean[] ourFieldNullability = new boolean[] {
		false,
		false,
		true,
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
	};

	public static final StaffAssignmentOpal NOT_YET_LOADED = new StaffAssignmentOpal();

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

	public synchronized java.lang.Integer getRoomIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[1];
	}

	public synchronized java.lang.String getNote() {
		return (java.lang.String) getReadValueSet()[2];
	}

	public synchronized java.lang.Integer getStaffIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[3];
	}

	public synchronized java.lang.Integer getPhaseIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[4];
	}

	public synchronized java.lang.String getStaffRoleCode() {
		return (java.lang.String) getReadValueSet()[5];
	}

	public synchronized StaffAssignmentOpal setId(final java.lang.Integer argId) {
		tryMutate();
		if (argId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myId on " + this + " to null.");
		}
		getNewValues()[0] = argId;
		return this;
	}

	public StaffAssignmentOpal setId(final int argId) {
		setId(java.lang.Integer.valueOf(argId));
		return this;
	}

	public synchronized StaffAssignmentOpal setRoomId(final java.lang.Integer argRoomId) {
		tryMutate();
		if (argRoomId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myRoomId on " + this + " to null.");
		}
		getNewValues()[1] = argRoomId;
		return this;
	}

	public StaffAssignmentOpal setRoomId(final int argRoomId) {
		setRoomId(java.lang.Integer.valueOf(argRoomId));
		return this;
	}

	public synchronized StaffAssignmentOpal setNote(final java.lang.String argNote) {
		tryMutate();
		getNewValues()[2] = argNote;
		return this;
	}

	public synchronized StaffAssignmentOpal setStaffId(final java.lang.Integer argStaffId) {
		tryMutate();
		if (argStaffId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myStaffId on " + this + " to null.");
		}
		getNewValues()[3] = argStaffId;
		return this;
	}

	public StaffAssignmentOpal setStaffId(final int argStaffId) {
		setStaffId(java.lang.Integer.valueOf(argStaffId));
		return this;
	}

	public synchronized StaffAssignmentOpal setPhaseId(final java.lang.Integer argPhaseId) {
		tryMutate();
		if (argPhaseId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myPhaseId on " + this + " to null.");
		}
		getNewValues()[4] = argPhaseId;
		return this;
	}

	public StaffAssignmentOpal setPhaseId(final int argPhaseId) {
		setPhaseId(java.lang.Integer.valueOf(argPhaseId));
		return this;
	}

	public synchronized StaffAssignmentOpal setStaffRoleCode(final java.lang.String argStaffRoleCode) {
		tryMutate();
		if (argStaffRoleCode == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myStaffRoleCode on " + this + " to null.");
		}
		if (argStaffRoleCode.length() > 32) {
			throw new com.opal.ArgumentTooLongException("Maximum length of myStaffRoleCode on " + this + " is 32.", argStaffRoleCode.length(), 32);
		}
		getNewValues()[5] = argStaffRoleCode;
		return this;
	}

	@Override
	protected /* synchronized */ void copyOldValuesToNewInternal() {
		myNewStaffOpal = myOldStaffOpal;
		myNewRoomOpal = myOldRoomOpal;
		myNewPhaseOpal = myOldPhaseOpal;
		myNewStaffRoleOpal = myOldStaffRoleOpal;
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		myOldStaffOpal = myNewStaffOpal;
		myOldRoomOpal = myNewRoomOpal;
		myOldPhaseOpal = myNewPhaseOpal;
		myOldStaffRoleOpal = myNewStaffRoleOpal;

		return;
	}

	@Override
	protected void unlinkInternal() {
		if (getStaffOpal() != null) {
			getStaffOpal().removeStaffAssignmentOpalInternal(this);
		}
		if (getRoomOpal() != null) {
			getRoomOpal().removeStaffAssignmentOpalInternal(this);
		}
		if (getPhaseOpal() != null) {
			getPhaseOpal().removeStaffAssignmentOpalInternal(this);
		}
		return;
	}

	@Override
	protected void copyFieldsToInternal(UpdatableOpal<StaffAssignment> argTarget) {
		Object[] lclValues = getReadValueSet();
		Object[] lclTargetNewValues = argTarget.getNewValues();
		/* Field 0 (Id) is database generated. */
		lclTargetNewValues[1] = lclValues[1]; /* RoomId (immutable) */
		lclTargetNewValues[2] = lclValues[2]; /* Note (immutable) */
		lclTargetNewValues[3] = lclValues[3]; /* StaffId (immutable) */
		lclTargetNewValues[4] = lclValues[4]; /* PhaseId (immutable) */
		lclTargetNewValues[5] = lclValues[5]; /* StaffRoleCode (immutable) */

		return;
	}

	@Override
	public synchronized void translateReferencesToFields() {
		if (myNewStaffOpal != StaffOpal.NOT_YET_LOADED) {
			setStaffId(myNewStaffOpal == null ? null : myNewStaffOpal.getIdAsObject());
		}
		if (myNewRoomOpal != RoomOpal.NOT_YET_LOADED) {
			setRoomId(myNewRoomOpal == null ? null : myNewRoomOpal.getIdAsObject());
		}
		if (myNewPhaseOpal != PhaseOpal.NOT_YET_LOADED) {
			setPhaseId(myNewPhaseOpal == null ? null : myNewPhaseOpal.getIdAsObject());
		}
		if (myNewStaffRoleOpal != StaffRoleOpal.NOT_YET_LOADED) {
			setStaffRoleCode(myNewStaffRoleOpal == null ? null : myNewStaffRoleOpal.getCode());
		}
		return;
	}

	@Override
	public java.util.Set<TransactionAware> getRequiredPriorCommits() {
		java.util.Set<TransactionAware> lclTAs = null;
		UpdatableOpal<?> lclUO;
		lclUO = myNewRoomOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		lclUO = myNewStaffOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		lclUO = myNewPhaseOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		lclUO = myNewStaffRoleOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		return (lclTAs != null) && (lclTAs.size() > 0) ? lclTAs : java.util.Collections.emptySet();
	}

	@Override
	public java.util.Set<TransactionAware> getRequiredSubsequentCommits() {
		java.util.Set<TransactionAware> lclTAs = null;
		UpdatableOpal<?> lclUO;
		lclUO = myOldRoomOpal;
		if ((lclUO != null) && lclUO.isDeleted()) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		lclUO = myOldStaffOpal;
		if ((lclUO != null) && lclUO.isDeleted()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		lclUO = myOldPhaseOpal;
		if ((lclUO != null) && lclUO.isDeleted()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		lclUO = myOldStaffRoleOpal;
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
		argPW.println("RoomId = " + getRoomIdAsObject());
		argPW.println("Note = " + getNote());
		argPW.println("StaffId = " + getStaffIdAsObject());
		argPW.println("PhaseId = " + getPhaseIdAsObject());
		argPW.println("StaffRoleCode = " + getStaffRoleCode());
	}

	@Override
	public synchronized void output(final PrintStream argPS) {
		argPS.println("Id = " + getIdAsObject());
		argPS.println("RoomId = " + getRoomIdAsObject());
		argPS.println("Note = " + getNote());
		argPS.println("StaffId = " + getStaffIdAsObject());
		argPS.println("PhaseId = " + getPhaseIdAsObject());
		argPS.println("StaffRoleCode = " + getStaffRoleCode());
	}

	private StaffOpal myOldStaffOpal;
	private StaffOpal myNewStaffOpal;

	protected StaffOpal retrieveStaffOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[3] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getStaffOpalFactory().forId(getStaffIdAsObject());
	}

	public synchronized StaffOpal getStaffOpal() {
		StaffOpal lclStaffOpal;
		boolean lclAccess = tryAccess();
		lclStaffOpal = lclAccess ? myNewStaffOpal : myOldStaffOpal;
		if (lclStaffOpal == StaffOpal.NOT_YET_LOADED) {
			lclStaffOpal = retrieveStaffOpal(getReadValueSet());
			if (lclAccess) {
				myNewStaffOpal = lclStaffOpal;
			} else {
				myOldStaffOpal = lclStaffOpal;
			}
		}
		return lclStaffOpal;
	}

	public synchronized StaffAssignmentOpal setStaffOpal(StaffOpal argStaffOpal) {
		tryMutate();
		StaffOpal lclStaffOpal = getStaffOpal();
		if (lclStaffOpal == argStaffOpal) { return this; }
		if (lclStaffOpal != null) {
			lclStaffOpal.removeStaffAssignmentOpalInternal(this);
		}
		myNewStaffOpal = argStaffOpal;
		if (argStaffOpal != null) {
			argStaffOpal.addStaffAssignmentOpalInternal(this);
		}
		return this;
	}

	protected synchronized void setStaffOpalInternal(StaffOpal argStaffOpal) {
		tryMutate();
		myNewStaffOpal = argStaffOpal;
	}

	private RoomOpal myOldRoomOpal;
	private RoomOpal myNewRoomOpal;

	protected RoomOpal retrieveRoomOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[1] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getRoomOpalFactory().forId(getRoomIdAsObject());
	}

	public synchronized RoomOpal getRoomOpal() {
		RoomOpal lclRoomOpal;
		boolean lclAccess = tryAccess();
		lclRoomOpal = lclAccess ? myNewRoomOpal : myOldRoomOpal;
		if (lclRoomOpal == RoomOpal.NOT_YET_LOADED) {
			lclRoomOpal = retrieveRoomOpal(getReadValueSet());
			if (lclAccess) {
				myNewRoomOpal = lclRoomOpal;
			} else {
				myOldRoomOpal = lclRoomOpal;
			}
		}
		return lclRoomOpal;
	}

	public synchronized StaffAssignmentOpal setRoomOpal(RoomOpal argRoomOpal) {
		tryMutate();
		RoomOpal lclRoomOpal = getRoomOpal();
		if (lclRoomOpal == argRoomOpal) { return this; }
		if (lclRoomOpal != null) {
			lclRoomOpal.removeStaffAssignmentOpalInternal(this);
		}
		myNewRoomOpal = argRoomOpal;
		if (argRoomOpal != null) {
			argRoomOpal.addStaffAssignmentOpalInternal(this);
		}
		return this;
	}

	protected synchronized void setRoomOpalInternal(RoomOpal argRoomOpal) {
		tryMutate();
		myNewRoomOpal = argRoomOpal;
	}

	private PhaseOpal myOldPhaseOpal;
	private PhaseOpal myNewPhaseOpal;

	protected PhaseOpal retrievePhaseOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[4] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getPhaseOpalFactory().forId(getPhaseIdAsObject());
	}

	public synchronized PhaseOpal getPhaseOpal() {
		PhaseOpal lclPhaseOpal;
		boolean lclAccess = tryAccess();
		lclPhaseOpal = lclAccess ? myNewPhaseOpal : myOldPhaseOpal;
		if (lclPhaseOpal == PhaseOpal.NOT_YET_LOADED) {
			lclPhaseOpal = retrievePhaseOpal(getReadValueSet());
			if (lclAccess) {
				myNewPhaseOpal = lclPhaseOpal;
			} else {
				myOldPhaseOpal = lclPhaseOpal;
			}
		}
		return lclPhaseOpal;
	}

	public synchronized StaffAssignmentOpal setPhaseOpal(PhaseOpal argPhaseOpal) {
		tryMutate();
		PhaseOpal lclPhaseOpal = getPhaseOpal();
		if (lclPhaseOpal == argPhaseOpal) { return this; }
		if (lclPhaseOpal != null) {
			lclPhaseOpal.removeStaffAssignmentOpalInternal(this);
		}
		myNewPhaseOpal = argPhaseOpal;
		if (argPhaseOpal != null) {
			argPhaseOpal.addStaffAssignmentOpalInternal(this);
		}
		return this;
	}

	protected synchronized void setPhaseOpalInternal(PhaseOpal argPhaseOpal) {
		tryMutate();
		myNewPhaseOpal = argPhaseOpal;
	}

	private StaffRoleOpal myOldStaffRoleOpal;
	private StaffRoleOpal myNewStaffRoleOpal;

	protected StaffRoleOpal retrieveStaffRoleOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[5] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getStaffRoleOpalFactory().forCode(getStaffRoleCode());
	}

	public synchronized StaffRoleOpal getStaffRoleOpal() {
		StaffRoleOpal lclStaffRoleOpal;
		boolean lclAccess = tryAccess();
		lclStaffRoleOpal = lclAccess ? myNewStaffRoleOpal : myOldStaffRoleOpal;
		if (lclStaffRoleOpal == StaffRoleOpal.NOT_YET_LOADED) {
			lclStaffRoleOpal = retrieveStaffRoleOpal(getReadValueSet());
			if (lclAccess) {
				myNewStaffRoleOpal = lclStaffRoleOpal;
			} else {
				myOldStaffRoleOpal = lclStaffRoleOpal;
			}
		}
		return lclStaffRoleOpal;
	}

	public synchronized StaffAssignmentOpal setStaffRoleOpal(StaffRoleOpal argStaffRoleOpal) {
		tryMutate();
		myNewStaffRoleOpal = argStaffRoleOpal;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder lclSB =  new StringBuilder(64);
		lclSB.append("StaffAssignmentOpal[");
		lclSB.append("myId=");
		lclSB.append(toStringField(0));
		lclSB.append(']');
		return lclSB.toString();
	}

	@Override
	protected void updateReferencesAfterReload() {
		if (myNewStaffOpal != StaffOpal.NOT_YET_LOADED) {
			setStaffOpal(retrieveStaffOpal(getNewValues()));
		}
		if (myNewRoomOpal != RoomOpal.NOT_YET_LOADED) {
			setRoomOpal(retrieveRoomOpal(getNewValues()));
		}
		if (myNewPhaseOpal != PhaseOpal.NOT_YET_LOADED) {
			setPhaseOpal(retrievePhaseOpal(getNewValues()));
		}
		if (myNewStaffRoleOpal != StaffRoleOpal.NOT_YET_LOADED) {
			setStaffRoleOpal(retrieveStaffRoleOpal(getNewValues()));
		}
	}

}
