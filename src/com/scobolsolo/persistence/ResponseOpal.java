package com.scobolsolo.persistence;

import com.scobolsolo.application.Response;

@com.opal.StoreGeneratedPrimaryKey
public final class ResponseOpal extends com.opal.UpdatableOpal<Response> {


	private ResponseOpal() {
		super();
		setUserFacing(null);
	}

	public ResponseOpal(com.opal.IdentityOpalFactory<Response, ResponseOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void initializeReferences() {
		myOldBasePlacementOpal = PlacementOpal.NOT_YET_LOADED;
		myOldDiffOpal = DiffOpal.NOT_YET_LOADED;
		myOldPerformanceOpal = PerformanceOpal.NOT_YET_LOADED;
		myOldReplacementPlacementOpal = PlacementOpal.NOT_YET_LOADED;
		myOldResponseTypeOpal = ResponseTypeOpal.NOT_YET_LOADED;
		return;
	}

	/* package */ static final String[] ourFieldNames = new String[] {
		"Id",
		"PerformanceId",
		"ResponseTypeCode",
		"BasePlacementId",
		"ReplacementPlacementId",
		"DiffId",
		"Location",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.lang.String.class,
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.lang.Integer.class,
	};

	/* package */ static final boolean[] ourFieldNullability = new boolean[] {
		false,
		false,
		false,
		false,
		true,
		true,
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
	};

	public static final ResponseOpal NOT_YET_LOADED = new ResponseOpal();

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

	public synchronized java.lang.Integer getPerformanceIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[1];
	}

	public synchronized java.lang.String getResponseTypeCode() {
		return (java.lang.String) getReadValueSet()[2];
	}

	public synchronized java.lang.Integer getBasePlacementIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[3];
	}

	public synchronized java.lang.Integer getReplacementPlacementIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[4];
	}

	public synchronized java.lang.Integer getDiffIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[5];
	}

	public synchronized java.lang.Integer getLocationAsObject() {
		return (java.lang.Integer) getReadValueSet()[6];
	}

	public synchronized ResponseOpal setId(final java.lang.Integer argId) {
		tryMutate();
		if (argId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myId on " + this + " to null.");
		}
		getNewValues()[0] = argId;
		return this;
	}

	public ResponseOpal setId(final int argId) {
		setId(java.lang.Integer.valueOf(argId));
		return this;
	}

	public synchronized ResponseOpal setPerformanceId(final java.lang.Integer argPerformanceId) {
		tryMutate();
		if (argPerformanceId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myPerformanceId on " + this + " to null.");
		}
		getNewValues()[1] = argPerformanceId;
		return this;
	}

	public ResponseOpal setPerformanceId(final int argPerformanceId) {
		setPerformanceId(java.lang.Integer.valueOf(argPerformanceId));
		return this;
	}

	public synchronized ResponseOpal setResponseTypeCode(final java.lang.String argResponseTypeCode) {
		tryMutate();
		if (argResponseTypeCode == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myResponseTypeCode on " + this + " to null.");
		}
		if (argResponseTypeCode.length() > 32) {
			throw new com.opal.ArgumentTooLongException("Cannot set myResponseTypeCode on " + this + " to \"" + argResponseTypeCode + "\" because that field's maximum length is 32.", argResponseTypeCode.length(), 32);
		}
		getNewValues()[2] = argResponseTypeCode;
		return this;
	}

	public synchronized ResponseOpal setBasePlacementId(final java.lang.Integer argBasePlacementId) {
		tryMutate();
		if (argBasePlacementId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myBasePlacementId on " + this + " to null.");
		}
		getNewValues()[3] = argBasePlacementId;
		return this;
	}

	public ResponseOpal setBasePlacementId(final int argBasePlacementId) {
		setBasePlacementId(java.lang.Integer.valueOf(argBasePlacementId));
		return this;
	}

	public synchronized ResponseOpal setReplacementPlacementId(final java.lang.Integer argReplacementPlacementId) {
		tryMutate();
		getNewValues()[4] = argReplacementPlacementId;
		return this;
	}

	public ResponseOpal setReplacementPlacementId(final int argReplacementPlacementId) {
		setReplacementPlacementId(java.lang.Integer.valueOf(argReplacementPlacementId));
		return this;
	}

	public synchronized ResponseOpal setDiffId(final java.lang.Integer argDiffId) {
		tryMutate();
		getNewValues()[5] = argDiffId;
		return this;
	}

	public ResponseOpal setDiffId(final int argDiffId) {
		setDiffId(java.lang.Integer.valueOf(argDiffId));
		return this;
	}

	public synchronized ResponseOpal setLocation(final java.lang.Integer argLocation) {
		tryMutate();
		getNewValues()[6] = argLocation;
		return this;
	}

	public ResponseOpal setLocation(final int argLocation) {
		setLocation(java.lang.Integer.valueOf(argLocation));
		return this;
	}

	@Override
	protected /* synchronized */ void copyOldValuesToNewInternal() {
		myNewBasePlacementOpal = myOldBasePlacementOpal;
		myNewDiffOpal = myOldDiffOpal;
		myNewPerformanceOpal = myOldPerformanceOpal;
		myNewReplacementPlacementOpal = myOldReplacementPlacementOpal;
		myNewResponseTypeOpal = myOldResponseTypeOpal;
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		myOldBasePlacementOpal = myNewBasePlacementOpal;
		myOldDiffOpal = myNewDiffOpal;
		myOldPerformanceOpal = myNewPerformanceOpal;
		myOldReplacementPlacementOpal = myNewReplacementPlacementOpal;
		myOldResponseTypeOpal = myNewResponseTypeOpal;

		return;
	}

	@Override
	protected void unlinkInternal() {
		if (getBasePlacementOpal() != null) {
			getBasePlacementOpal().getBaseResponseOpalSet().removeInternal(this);
		}
		if (getDiffOpal() != null) {
			getDiffOpal().getResponseOpalSet().removeInternal(this);
		}
		if (getPerformanceOpal() != null) {
			getPerformanceOpal().getResponseOpalSet().removeInternal(this);
		}
		if (getReplacementPlacementOpal() != null) {
			getReplacementPlacementOpal().getReplacementResponseOpalSet().removeInternal(this);
		}
		return;
	}

	@Override
	protected void copyFieldsToInternal(com.opal.UpdatableOpal<Response> argTarget) {
		Object[] lclValues = getReadValueSet();
		Object[] lclTargetNewValues = argTarget.getNewValues();
		/* Field 0 (Id) is database generated. */
		lclTargetNewValues[1] = lclValues[1]; /* PerformanceId (immutable) */
		lclTargetNewValues[2] = lclValues[2]; /* ResponseTypeCode (immutable) */
		lclTargetNewValues[3] = lclValues[3]; /* BasePlacementId (immutable) */
		lclTargetNewValues[4] = lclValues[4]; /* ReplacementPlacementId (immutable) */
		lclTargetNewValues[5] = lclValues[5]; /* DiffId (immutable) */
		lclTargetNewValues[6] = lclValues[6]; /* Location (immutable) */

		return;
	}

	@Override
	public synchronized void translateReferencesToFields() {
		if (myNewBasePlacementOpal != PlacementOpal.NOT_YET_LOADED) {
			setBasePlacementId(myNewBasePlacementOpal == null ? null : myNewBasePlacementOpal.getIdAsObject());
		}
		if (myNewDiffOpal != DiffOpal.NOT_YET_LOADED) {
			setDiffId(myNewDiffOpal == null ? null : myNewDiffOpal.getIdAsObject());
		}
		if (myNewPerformanceOpal != PerformanceOpal.NOT_YET_LOADED) {
			setPerformanceId(myNewPerformanceOpal == null ? null : myNewPerformanceOpal.getIdAsObject());
		}
		if (myNewReplacementPlacementOpal != PlacementOpal.NOT_YET_LOADED) {
			setReplacementPlacementId(myNewReplacementPlacementOpal == null ? null : myNewReplacementPlacementOpal.getIdAsObject());
		}
		if (myNewResponseTypeOpal != ResponseTypeOpal.NOT_YET_LOADED) {
			setResponseTypeCode(myNewResponseTypeOpal == null ? null : myNewResponseTypeOpal.getCode());
		}
		return;
	}

	@Override
	public java.util.Set<com.opal.TransactionAware> getRequiredPriorCommits() {
		java.util.Set<com.opal.TransactionAware> lclTAs = null;
		com.opal.UpdatableOpal<?> lclUO;
		lclUO = myNewBasePlacementOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		lclUO = myNewDiffOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		lclUO = myNewPerformanceOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		lclUO = myNewReplacementPlacementOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		lclUO = myNewResponseTypeOpal;
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
		if ((lclUO = myOldBasePlacementOpal) == PlacementOpal.NOT_YET_LOADED) {
			lclUO = myOldBasePlacementOpal = retrieveBasePlacementOpal(getOldValues());
		}
		if (lclUO != null && (lclUO.exists() == false)) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		if ((lclUO = myOldDiffOpal) == DiffOpal.NOT_YET_LOADED) {
			lclUO = myOldDiffOpal = retrieveDiffOpal(getOldValues());
		}
		if (lclUO != null && (lclUO.exists() == false)) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		if ((lclUO = myOldPerformanceOpal) == PerformanceOpal.NOT_YET_LOADED) {
			lclUO = myOldPerformanceOpal = retrievePerformanceOpal(getOldValues());
		}
		if (lclUO != null && (lclUO.exists() == false)) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		if ((lclUO = myOldReplacementPlacementOpal) == PlacementOpal.NOT_YET_LOADED) {
			lclUO = myOldReplacementPlacementOpal = retrieveReplacementPlacementOpal(getOldValues());
		}
		if (lclUO != null && (lclUO.exists() == false)) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		if ((lclUO = myOldResponseTypeOpal) == ResponseTypeOpal.NOT_YET_LOADED) {
			lclUO = myOldResponseTypeOpal = retrieveResponseTypeOpal(getOldValues());
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
		argOutput.println("PerformanceId = " + getPerformanceIdAsObject());
		argOutput.println("ResponseTypeCode = " + getResponseTypeCode());
		argOutput.println("BasePlacementId = " + getBasePlacementIdAsObject());
		argOutput.println("ReplacementPlacementId = " + getReplacementPlacementIdAsObject());
		argOutput.println("DiffId = " + getDiffIdAsObject());
		argOutput.println("Location = " + getLocationAsObject());
	}

	@Override
	public synchronized void output(final java.io.PrintWriter argOutput) {
		argOutput.println("Id = " + getIdAsObject());
		argOutput.println("PerformanceId = " + getPerformanceIdAsObject());
		argOutput.println("ResponseTypeCode = " + getResponseTypeCode());
		argOutput.println("BasePlacementId = " + getBasePlacementIdAsObject());
		argOutput.println("ReplacementPlacementId = " + getReplacementPlacementIdAsObject());
		argOutput.println("DiffId = " + getDiffIdAsObject());
		argOutput.println("Location = " + getLocationAsObject());
	}

	private PlacementOpal myOldBasePlacementOpal;
	private PlacementOpal myNewBasePlacementOpal;

	protected PlacementOpal retrieveBasePlacementOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[3] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getPlacementOpalFactory().forId(getBasePlacementIdAsObject());
	}

	public synchronized PlacementOpal getBasePlacementOpal() {
		PlacementOpal lclPlacementOpal;
		boolean lclAccess = tryAccess();
		lclPlacementOpal = lclAccess ? myNewBasePlacementOpal : myOldBasePlacementOpal;
		if (lclPlacementOpal == PlacementOpal.NOT_YET_LOADED) {
			lclPlacementOpal = retrieveBasePlacementOpal(getReadValueSet());
			if (lclAccess) {
				myNewBasePlacementOpal = lclPlacementOpal;
			} else {
				myOldBasePlacementOpal = lclPlacementOpal;
			}
		}
		return lclPlacementOpal;
	}

	public synchronized ResponseOpal setBasePlacementOpal(PlacementOpal argPlacementOpal) {
		tryMutate();
		PlacementOpal lclPlacementOpal = getBasePlacementOpal();
		if (lclPlacementOpal == argPlacementOpal) { return this; }
		if (lclPlacementOpal != null) {
			lclPlacementOpal.getBaseResponseOpalSet().removeInternal(this);
		}
		myNewBasePlacementOpal = argPlacementOpal;
		if (argPlacementOpal != null) {
			argPlacementOpal.getBaseResponseOpalSet().addInternal(this);
		}
		return this;
	}

	protected synchronized void setBasePlacementOpalInternal(PlacementOpal argPlacementOpal) {
		tryMutate();
		myNewBasePlacementOpal = argPlacementOpal;
	}

	private DiffOpal myOldDiffOpal;
	private DiffOpal myNewDiffOpal;

	protected DiffOpal retrieveDiffOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[5] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getDiffOpalFactory().forId(getDiffIdAsObject());
	}

	public synchronized DiffOpal getDiffOpal() {
		DiffOpal lclDiffOpal;
		boolean lclAccess = tryAccess();
		lclDiffOpal = lclAccess ? myNewDiffOpal : myOldDiffOpal;
		if (lclDiffOpal == DiffOpal.NOT_YET_LOADED) {
			lclDiffOpal = retrieveDiffOpal(getReadValueSet());
			if (lclAccess) {
				myNewDiffOpal = lclDiffOpal;
			} else {
				myOldDiffOpal = lclDiffOpal;
			}
		}
		return lclDiffOpal;
	}

	public synchronized ResponseOpal setDiffOpal(DiffOpal argDiffOpal) {
		tryMutate();
		DiffOpal lclDiffOpal = getDiffOpal();
		if (lclDiffOpal == argDiffOpal) { return this; }
		if (lclDiffOpal != null) {
			lclDiffOpal.getResponseOpalSet().removeInternal(this);
		}
		myNewDiffOpal = argDiffOpal;
		if (argDiffOpal != null) {
			argDiffOpal.getResponseOpalSet().addInternal(this);
		}
		return this;
	}

	protected synchronized void setDiffOpalInternal(DiffOpal argDiffOpal) {
		tryMutate();
		myNewDiffOpal = argDiffOpal;
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

	public synchronized ResponseOpal setPerformanceOpal(PerformanceOpal argPerformanceOpal) {
		tryMutate();
		PerformanceOpal lclPerformanceOpal = getPerformanceOpal();
		if (lclPerformanceOpal == argPerformanceOpal) { return this; }
		if (lclPerformanceOpal != null) {
			lclPerformanceOpal.getResponseOpalSet().removeInternal(this);
		}
		myNewPerformanceOpal = argPerformanceOpal;
		if (argPerformanceOpal != null) {
			argPerformanceOpal.getResponseOpalSet().addInternal(this);
		}
		return this;
	}

	protected synchronized void setPerformanceOpalInternal(PerformanceOpal argPerformanceOpal) {
		tryMutate();
		myNewPerformanceOpal = argPerformanceOpal;
	}

	private PlacementOpal myOldReplacementPlacementOpal;
	private PlacementOpal myNewReplacementPlacementOpal;

	protected PlacementOpal retrieveReplacementPlacementOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[4] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getPlacementOpalFactory().forId(getReplacementPlacementIdAsObject());
	}

	public synchronized PlacementOpal getReplacementPlacementOpal() {
		PlacementOpal lclPlacementOpal;
		boolean lclAccess = tryAccess();
		lclPlacementOpal = lclAccess ? myNewReplacementPlacementOpal : myOldReplacementPlacementOpal;
		if (lclPlacementOpal == PlacementOpal.NOT_YET_LOADED) {
			lclPlacementOpal = retrieveReplacementPlacementOpal(getReadValueSet());
			if (lclAccess) {
				myNewReplacementPlacementOpal = lclPlacementOpal;
			} else {
				myOldReplacementPlacementOpal = lclPlacementOpal;
			}
		}
		return lclPlacementOpal;
	}

	public synchronized ResponseOpal setReplacementPlacementOpal(PlacementOpal argPlacementOpal) {
		tryMutate();
		PlacementOpal lclPlacementOpal = getReplacementPlacementOpal();
		if (lclPlacementOpal == argPlacementOpal) { return this; }
		if (lclPlacementOpal != null) {
			lclPlacementOpal.getReplacementResponseOpalSet().removeInternal(this);
		}
		myNewReplacementPlacementOpal = argPlacementOpal;
		if (argPlacementOpal != null) {
			argPlacementOpal.getReplacementResponseOpalSet().addInternal(this);
		}
		return this;
	}

	protected synchronized void setReplacementPlacementOpalInternal(PlacementOpal argPlacementOpal) {
		tryMutate();
		myNewReplacementPlacementOpal = argPlacementOpal;
	}

	private ResponseTypeOpal myOldResponseTypeOpal;
	private ResponseTypeOpal myNewResponseTypeOpal;

	protected ResponseTypeOpal retrieveResponseTypeOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[2] == null)) {
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

	public synchronized ResponseOpal setResponseTypeOpal(ResponseTypeOpal argResponseTypeOpal) {
		tryMutate();
		myNewResponseTypeOpal = argResponseTypeOpal;
		return this;
	}

	@Override
	public java.lang.String toString() {
		java.lang.StringBuilder lclSB = new java.lang.StringBuilder(64);
		lclSB.append("ResponseOpal[");
		lclSB.append("myId=");
		lclSB.append(toStringField(0));
		lclSB.append(']');
		return lclSB.toString();
	}

	@Override
	protected void updateReferencesAfterReload() {
		if (myNewBasePlacementOpal != PlacementOpal.NOT_YET_LOADED) {
			setBasePlacementOpal(retrieveBasePlacementOpal(getNewValues()));
		}
		if (myNewDiffOpal != DiffOpal.NOT_YET_LOADED) {
			setDiffOpal(retrieveDiffOpal(getNewValues()));
		}
		if (myNewPerformanceOpal != PerformanceOpal.NOT_YET_LOADED) {
			setPerformanceOpal(retrievePerformanceOpal(getNewValues()));
		}
		if (myNewReplacementPlacementOpal != PlacementOpal.NOT_YET_LOADED) {
			setReplacementPlacementOpal(retrieveReplacementPlacementOpal(getNewValues()));
		}
		if (myNewResponseTypeOpal != ResponseTypeOpal.NOT_YET_LOADED) {
			setResponseTypeOpal(retrieveResponseTypeOpal(getNewValues()));
		}
	}

}
