package com.scobolsolo.persistence;

import java.io.PrintWriter;
import java.io.PrintStream;

import com.opal.*;

import com.scobolsolo.application.*;

@StoreGeneratedPrimaryKey
public final class ResponseOpal extends com.opal.UpdatableOpal<Response> {

	private ResponseOpal() {
		super();
		setUserFacing(null);
	}

	public ResponseOpal(OpalFactory<Response, ResponseOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void initializeReferences() {
		myOldPerformanceOpal = PerformanceOpal.NOT_YET_LOADED;
		myOldPlacementOpal = PlacementOpal.NOT_YET_LOADED;
		myOldReplacementForPlacementOpal = PlacementOpal.NOT_YET_LOADED;
		myOldResponseTypeOpal = ResponseTypeOpal.NOT_YET_LOADED;
		return;
	}

	/* package */ static final String[] ourFieldNames = new String[] {
		"Id",
		"PerformanceId",
		"PlacementId",
		"ResponseTypeCode",
		"ReplacementForPlacementId",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.lang.String.class,
		java.lang.Integer.class,
	};

	/* package */ static final boolean[] ourFieldNullability = new boolean[] {
		false,
		false,
		false,
		false,
		true,
	};

	/* package */ static final FieldValidator[] ourFieldValidators = new FieldValidator[] {
		null,
		null,
		null,
		null,
		null,
	};

	public static final ResponseOpal NOT_YET_LOADED = new ResponseOpal();

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

	public synchronized java.lang.Integer getPerformanceIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[1];
	}

	public synchronized java.lang.Integer getPlacementIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[2];
	}

	public synchronized java.lang.String getResponseTypeCode() {
		return (java.lang.String) getReadValueSet()[3];
	}

	public synchronized java.lang.Integer getReplacementForPlacementIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[4];
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

	public synchronized void setPerformanceId(final java.lang.Integer argPerformanceId) {
		tryMutate();
		if (argPerformanceId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myPerformanceId on " + this + " to null.");
		}
		getNewValues()[1] = argPerformanceId;
		return;
	}

	public void setPerformanceId(final int argPerformanceId) {
		setPerformanceId(java.lang.Integer.valueOf(argPerformanceId));
		return;
	}

	public synchronized void setPlacementId(final java.lang.Integer argPlacementId) {
		tryMutate();
		if (argPlacementId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myPlacementId on " + this + " to null.");
		}
		getNewValues()[2] = argPlacementId;
		return;
	}

	public void setPlacementId(final int argPlacementId) {
		setPlacementId(java.lang.Integer.valueOf(argPlacementId));
		return;
	}

	public synchronized void setResponseTypeCode(final java.lang.String argResponseTypeCode) {
		tryMutate();
		if (argResponseTypeCode == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myResponseTypeCode on " + this + " to null.");
		}
		if (argResponseTypeCode.length() > 32) {
			throw new com.opal.ArgumentTooLongException("Maximum length of myResponseTypeCode on " + this + " is 32.", argResponseTypeCode.length(), 32);
		}
		getNewValues()[3] = argResponseTypeCode;
		return;
	}

	public synchronized void setReplacementForPlacementId(final java.lang.Integer argReplacementForPlacementId) {
		tryMutate();
		getNewValues()[4] = argReplacementForPlacementId;
		return;
	}

	public void setReplacementForPlacementId(final int argReplacementForPlacementId) {
		setReplacementForPlacementId(java.lang.Integer.valueOf(argReplacementForPlacementId));
		return;
	}

	@Override
	protected /* synchronized */ void copyOldValuesToNewInternal() {
		myNewPerformanceOpal = myOldPerformanceOpal;
		myNewPlacementOpal = myOldPlacementOpal;
		myNewReplacementForPlacementOpal = myOldReplacementForPlacementOpal;
		myNewResponseTypeOpal = myOldResponseTypeOpal;
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		myOldPerformanceOpal = myNewPerformanceOpal;
		myOldPlacementOpal = myNewPlacementOpal;
		myOldReplacementForPlacementOpal = myNewReplacementForPlacementOpal;
		myOldResponseTypeOpal = myNewResponseTypeOpal;

		return;
	}

	@Override
	protected void unlinkInternal() {
		if (getPerformanceOpal() != null) {
			getPerformanceOpal().removeResponseOpalInternal(this);
		}
		if (getPlacementOpal() != null) {
			getPlacementOpal().removeResponseOpalInternal(this);
		}
		if (getReplacementForPlacementOpal() != null) {
			getReplacementForPlacementOpal().removeReplacementForResponseOpalInternal(this);
		}
		return;
	}

	@Override
	protected void copyFieldsToInternal(UpdatableOpal<Response> argTarget) {
		Object[] lclValues = getReadValueSet();
		Object[] lclTargetNewValues = argTarget.getNewValues();
		/* Field 0 (Id) is database generated. */
		/* Field 1 (PerformanceId) is part of a unique key. */
		/* Field 2 (PlacementId) is part of a unique key. */
		lclTargetNewValues[3] = lclValues[3]; /* ResponseTypeCode (immutable) */
		lclTargetNewValues[4] = lclValues[4]; /* ReplacementForPlacementId (immutable) */

		return;
	}

	@Override
	public synchronized void translateReferencesToFields() {
		if (myNewPerformanceOpal != PerformanceOpal.NOT_YET_LOADED) {
			setPerformanceId(myNewPerformanceOpal == null ? null : myNewPerformanceOpal.getIdAsObject());
		}
		if (myNewPlacementOpal != PlacementOpal.NOT_YET_LOADED) {
			setPlacementId(myNewPlacementOpal == null ? null : myNewPlacementOpal.getIdAsObject());
		}
		if (myNewReplacementForPlacementOpal != PlacementOpal.NOT_YET_LOADED) {
			setReplacementForPlacementId(myNewReplacementForPlacementOpal == null ? null : myNewReplacementForPlacementOpal.getIdAsObject());
		}
		if (myNewResponseTypeOpal != ResponseTypeOpal.NOT_YET_LOADED) {
			setResponseTypeCode(myNewResponseTypeOpal == null ? null : myNewResponseTypeOpal.getCode());
		}
		return;
	}

	@Override
	public java.util.Set<TransactionAware> getRequiredPriorCommits() {
		java.util.Set<TransactionAware> lclTAs = null;
		UpdatableOpal<?> lclUO;
		lclUO = myNewResponseTypeOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		lclUO = myNewPerformanceOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		lclUO = myNewReplacementForPlacementOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		lclUO = myNewPlacementOpal;
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
		lclUO = myOldResponseTypeOpal;
		if ((lclUO != null) && lclUO.isDeleted()) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		lclUO = myOldPerformanceOpal;
		if ((lclUO != null) && lclUO.isDeleted()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		lclUO = myOldReplacementForPlacementOpal;
		if ((lclUO != null) && lclUO.isDeleted()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		lclUO = myOldPlacementOpal;
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
		argPW.println("PerformanceId = " + getPerformanceIdAsObject());
		argPW.println("PlacementId = " + getPlacementIdAsObject());
		argPW.println("ResponseTypeCode = " + getResponseTypeCode());
		argPW.println("ReplacementForPlacementId = " + getReplacementForPlacementIdAsObject());
	}

	@Override
	public synchronized void output(final PrintStream argPS) {
		argPS.println("Id = " + getIdAsObject());
		argPS.println("PerformanceId = " + getPerformanceIdAsObject());
		argPS.println("PlacementId = " + getPlacementIdAsObject());
		argPS.println("ResponseTypeCode = " + getResponseTypeCode());
		argPS.println("ReplacementForPlacementId = " + getReplacementForPlacementIdAsObject());
	}

	private PerformanceOpal myOldPerformanceOpal;
	private PerformanceOpal myNewPerformanceOpal;

	protected PerformanceOpal retrievePerformanceOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[1] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getPerformanceOpalFactory().forId(getPerformanceIdAsObject());
	}

	public synchronized PerformanceOpal getPerformanceOpal() {
		PerformanceOpal lclPerformanceOpal;
		boolean lclAccess = tryAccess();
		lclPerformanceOpal = lclAccess ? myNewPerformanceOpal : myOldPerformanceOpal;
		if (lclPerformanceOpal == PerformanceOpal.NOT_YET_LOADED) {
			lclPerformanceOpal = retrievePerformanceOpal(getReadValueSet());
			if (lclAccess) {
				myNewPerformanceOpal = lclPerformanceOpal;
			} else {
				myOldPerformanceOpal = lclPerformanceOpal;
			}
		}
		return lclPerformanceOpal;
	}

	public synchronized void setPerformanceOpal(PerformanceOpal argPerformanceOpal) {
		tryMutate();
		PerformanceOpal lclPerformanceOpal = getPerformanceOpal();
		if (lclPerformanceOpal == argPerformanceOpal) { return; }
		if (lclPerformanceOpal != null) {
			lclPerformanceOpal.removeResponseOpalInternal(this);
		}
		myNewPerformanceOpal = argPerformanceOpal;
		if (argPerformanceOpal != null) {
			argPerformanceOpal.addResponseOpalInternal(this);
		}
		return;
	}

	protected synchronized void setPerformanceOpalInternal(PerformanceOpal argPerformanceOpal) {
		tryMutate();
		myNewPerformanceOpal = argPerformanceOpal;
	}

	private PlacementOpal myOldPlacementOpal;
	private PlacementOpal myNewPlacementOpal;

	protected PlacementOpal retrievePlacementOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[2] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getPlacementOpalFactory().forId(getPlacementIdAsObject());
	}

	public synchronized PlacementOpal getPlacementOpal() {
		PlacementOpal lclPlacementOpal;
		boolean lclAccess = tryAccess();
		lclPlacementOpal = lclAccess ? myNewPlacementOpal : myOldPlacementOpal;
		if (lclPlacementOpal == PlacementOpal.NOT_YET_LOADED) {
			lclPlacementOpal = retrievePlacementOpal(getReadValueSet());
			if (lclAccess) {
				myNewPlacementOpal = lclPlacementOpal;
			} else {
				myOldPlacementOpal = lclPlacementOpal;
			}
		}
		return lclPlacementOpal;
	}

	public synchronized void setPlacementOpal(PlacementOpal argPlacementOpal) {
		tryMutate();
		PlacementOpal lclPlacementOpal = getPlacementOpal();
		if (lclPlacementOpal == argPlacementOpal) { return; }
		if (lclPlacementOpal != null) {
			lclPlacementOpal.removeResponseOpalInternal(this);
		}
		myNewPlacementOpal = argPlacementOpal;
		if (argPlacementOpal != null) {
			argPlacementOpal.addResponseOpalInternal(this);
		}
		return;
	}

	protected synchronized void setPlacementOpalInternal(PlacementOpal argPlacementOpal) {
		tryMutate();
		myNewPlacementOpal = argPlacementOpal;
	}

	private PlacementOpal myOldReplacementForPlacementOpal;
	private PlacementOpal myNewReplacementForPlacementOpal;

	protected PlacementOpal retrieveReplacementForPlacementOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[4] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getPlacementOpalFactory().forId(getReplacementForPlacementIdAsObject());
	}

	public synchronized PlacementOpal getReplacementForPlacementOpal() {
		PlacementOpal lclPlacementOpal;
		boolean lclAccess = tryAccess();
		lclPlacementOpal = lclAccess ? myNewReplacementForPlacementOpal : myOldReplacementForPlacementOpal;
		if (lclPlacementOpal == PlacementOpal.NOT_YET_LOADED) {
			lclPlacementOpal = retrieveReplacementForPlacementOpal(getReadValueSet());
			if (lclAccess) {
				myNewReplacementForPlacementOpal = lclPlacementOpal;
			} else {
				myOldReplacementForPlacementOpal = lclPlacementOpal;
			}
		}
		return lclPlacementOpal;
	}

	public synchronized void setReplacementForPlacementOpal(PlacementOpal argPlacementOpal) {
		tryMutate();
		PlacementOpal lclPlacementOpal = getReplacementForPlacementOpal();
		if (lclPlacementOpal == argPlacementOpal) { return; }
		if (lclPlacementOpal != null) {
			lclPlacementOpal.removeReplacementForResponseOpalInternal(this);
		}
		myNewReplacementForPlacementOpal = argPlacementOpal;
		if (argPlacementOpal != null) {
			argPlacementOpal.addReplacementForResponseOpalInternal(this);
		}
		return;
	}

	protected synchronized void setReplacementForPlacementOpalInternal(PlacementOpal argPlacementOpal) {
		tryMutate();
		myNewReplacementForPlacementOpal = argPlacementOpal;
	}

	private ResponseTypeOpal myOldResponseTypeOpal;
	private ResponseTypeOpal myNewResponseTypeOpal;

	protected ResponseTypeOpal retrieveResponseTypeOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[3] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getResponseTypeOpalFactory().forCode(getResponseTypeCode());
	}

	public synchronized ResponseTypeOpal getResponseTypeOpal() {
		ResponseTypeOpal lclResponseTypeOpal;
		boolean lclAccess = tryAccess();
		lclResponseTypeOpal = lclAccess ? myNewResponseTypeOpal : myOldResponseTypeOpal;
		if (lclResponseTypeOpal == ResponseTypeOpal.NOT_YET_LOADED) {
			lclResponseTypeOpal = retrieveResponseTypeOpal(getReadValueSet());
			if (lclAccess) {
				myNewResponseTypeOpal = lclResponseTypeOpal;
			} else {
				myOldResponseTypeOpal = lclResponseTypeOpal;
			}
		}
		return lclResponseTypeOpal;
	}

	public synchronized void setResponseTypeOpal(ResponseTypeOpal argResponseTypeOpal) {
		tryMutate();
		myNewResponseTypeOpal = argResponseTypeOpal;
		return;
	}

	@Override
	public String toString() {
		StringBuilder lclSB =  new StringBuilder(64);
		lclSB.append("ResponseOpal[");
		lclSB.append("myId=");
		lclSB.append(toStringField(0));
		lclSB.append(']');
		return lclSB.toString();
	}

	@Override
	protected void updateReferencesAfterReload() {
		if (myNewPerformanceOpal != PerformanceOpal.NOT_YET_LOADED) {
			setPerformanceOpal(retrievePerformanceOpal(getNewValues()));
		}
		if (myNewPlacementOpal != PlacementOpal.NOT_YET_LOADED) {
			setPlacementOpal(retrievePlacementOpal(getNewValues()));
		}
		if (myNewReplacementForPlacementOpal != PlacementOpal.NOT_YET_LOADED) {
			setReplacementForPlacementOpal(retrieveReplacementForPlacementOpal(getNewValues()));
		}
		if (myNewResponseTypeOpal != ResponseTypeOpal.NOT_YET_LOADED) {
			setResponseTypeOpal(retrieveResponseTypeOpal(getNewValues()));
		}
	}

}
