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
		return;
	}

	/* package */ static final String[] ourFieldNames = new String[] {
		"Id",
		"RoomId",
		"Note",
		"StaffId",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.lang.String.class,
		java.lang.Integer.class,
	};

	/* package */ static final boolean[] ourFieldNullability = new boolean[] {
		false,
		false,
		true,
		false,
	};

	/* package */ static final FieldValidator[] ourFieldValidators = new FieldValidator[] {
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

	public synchronized void setId(final java.lang.Integer argId) {
		tryMutate();
		if (argId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myId on " + this + " to null.");
		}
		getNewValues()[0] = argId;
		return;
	}

	public void setId(final int argId) {
		setId(java.lang.Integer.valueOf(argId));
		return;
	}

	public synchronized void setRoomId(final java.lang.Integer argRoomId) {
		tryMutate();
		if (argRoomId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myRoomId on " + this + " to null.");
		}
		getNewValues()[1] = argRoomId;
		return;
	}

	public void setRoomId(final int argRoomId) {
		setRoomId(java.lang.Integer.valueOf(argRoomId));
		return;
	}

	public synchronized void setNote(final java.lang.String argNote) {
		tryMutate();
		getNewValues()[2] = argNote;
		return;
	}

	public synchronized void setStaffId(final java.lang.Integer argStaffId) {
		tryMutate();
		if (argStaffId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myStaffId on " + this + " to null.");
		}
		getNewValues()[3] = argStaffId;
		return;
	}

	public void setStaffId(final int argStaffId) {
		setStaffId(java.lang.Integer.valueOf(argStaffId));
		return;
	}

	@Override
	protected /* synchronized */ void copyOldValuesToNewInternal() {
		myNewStaffOpal = myOldStaffOpal;
		myNewRoomOpal = myOldRoomOpal;
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		myOldStaffOpal = myNewStaffOpal;
		myOldRoomOpal = myNewRoomOpal;

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
		return;
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
	}

	@Override
	public synchronized void output(final PrintStream argPS) {
		argPS.println("Id = " + getIdAsObject());
		argPS.println("RoomId = " + getRoomIdAsObject());
		argPS.println("Note = " + getNote());
		argPS.println("StaffId = " + getStaffIdAsObject());
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

	public synchronized void setStaffOpal(StaffOpal argStaffOpal) {
		tryMutate();
		StaffOpal lclStaffOpal = getStaffOpal();
		if (lclStaffOpal == argStaffOpal) { return; }
		if (lclStaffOpal != null) {
			lclStaffOpal.removeStaffAssignmentOpalInternal(this);
		}
		myNewStaffOpal = argStaffOpal;
		if (argStaffOpal != null) {
			argStaffOpal.addStaffAssignmentOpalInternal(this);
		}
		return;
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

	public synchronized void setRoomOpal(RoomOpal argRoomOpal) {
		tryMutate();
		RoomOpal lclRoomOpal = getRoomOpal();
		if (lclRoomOpal == argRoomOpal) { return; }
		if (lclRoomOpal != null) {
			lclRoomOpal.removeStaffAssignmentOpalInternal(this);
		}
		myNewRoomOpal = argRoomOpal;
		if (argRoomOpal != null) {
			argRoomOpal.addStaffAssignmentOpalInternal(this);
		}
		return;
	}

	protected synchronized void setRoomOpalInternal(RoomOpal argRoomOpal) {
		tryMutate();
		myNewRoomOpal = argRoomOpal;
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
	}

}
