package com.scobolsolo.application;

import com.scobolsolo.persistence.ResponseOpal;
import com.scobolsolo.persistence.PerformanceOpal;
import com.scobolsolo.persistence.PlacementOpal;
import com.scobolsolo.persistence.ResponseTypeOpal;

public class ResponseImpl extends com.opal.AbstractIdentityImpl<ResponseOpal> implements Response {
	private final ResponseOpal myResponseOpal;

	public ResponseImpl(ResponseOpal argResponseOpal) {
		super();
		myResponseOpal = org.apache.commons.lang3.Validate.notNull(argResponseOpal);
	}

	protected ResponseOpal getResponseOpal() {
		return myResponseOpal;
	}

	@Override
	protected /* Opal<? extends UserFacing> */ ResponseOpal getBottomOpal() {
		return getResponseOpal();
	}

	@Override
	protected /* Opal<? extends UserFacing> */ ResponseOpal[] getOpalArray() {
		return new /* Opal<?> */ ResponseOpal[] {
			getResponseOpal(),
		};
	}

	@Override
	public java.lang.Integer getIdAsObject() {
		return getResponseOpal().getIdAsObject();
	}

	@Override
	public void setId(java.lang.Integer argId) {
		getResponseOpal().setId(argId);
		return;
	}

	@Override
	public void setId(int argId) {
		getResponseOpal().setId(argId);
		return;
	}

	@Override
	public java.lang.Integer getPerformanceIdAsObject() {
		return getResponseOpal().getPerformanceIdAsObject();
	}

	@Override
	public void setPerformanceId(java.lang.Integer argPerformanceId) {
		getResponseOpal().setPerformanceId(argPerformanceId);
		return;
	}

	@Override
	public void setPerformanceId(int argPerformanceId) {
		getResponseOpal().setPerformanceId(argPerformanceId);
		return;
	}

	@Override
	public java.lang.Integer getPlacementIdAsObject() {
		return getResponseOpal().getPlacementIdAsObject();
	}

	@Override
	public void setPlacementId(java.lang.Integer argPlacementId) {
		getResponseOpal().setPlacementId(argPlacementId);
		return;
	}

	@Override
	public void setPlacementId(int argPlacementId) {
		getResponseOpal().setPlacementId(argPlacementId);
		return;
	}

	@Override
	public java.lang.String getResponseTypeCode() {
		return getResponseOpal().getResponseTypeCode();
	}

	@Override
	public void setResponseTypeCode(java.lang.String argResponseTypeCode) {
		getResponseOpal().setResponseTypeCode(argResponseTypeCode);
		return;
	}

	@Override
	public java.lang.Integer getReplacementForPlacementIdAsObject() {
		return getResponseOpal().getReplacementForPlacementIdAsObject();
	}

	@Override
	public void setReplacementForPlacementId(java.lang.Integer argReplacementForPlacementId) {
		getResponseOpal().setReplacementForPlacementId(argReplacementForPlacementId);
		return;
	}

	@Override
	public void setReplacementForPlacementId(int argReplacementForPlacementId) {
		getResponseOpal().setReplacementForPlacementId(argReplacementForPlacementId);
		return;
	}

	/* The following methods allow direct access to the user objects for which
	this object has foreign keys in the database. */

	/** Access to the Performance object created from the table response through foreign key response_performance_id_fkey */

	@Override
	public Performance getPerformance() {
		PerformanceOpal lclPerformanceOpal = getResponseOpal().getPerformanceOpal();
		return lclPerformanceOpal == null ? null : lclPerformanceOpal.getUserFacing();
	}

	@Override
	public void setPerformance(Performance argPerformance) {
		getResponseOpal().setPerformanceOpal(argPerformance == null ? null : ((PerformanceImpl) argPerformance).getPerformanceOpal());
		return;
	}

	/** Access to the Placement object created from the table response through foreign key response_placement_id_fkey */

	@Override
	public Placement getPlacement() {
		PlacementOpal lclPlacementOpal = getResponseOpal().getPlacementOpal();
		return lclPlacementOpal == null ? null : lclPlacementOpal.getUserFacing();
	}

	@Override
	public void setPlacement(Placement argPlacement) {
		getResponseOpal().setPlacementOpal(argPlacement == null ? null : ((PlacementImpl) argPlacement).getPlacementOpal());
		return;
	}

	/** Access to the Placement object created from the table response through foreign key response_replacement_placement_id_fkey */

	@Override
	public Placement getReplacementForPlacement() {
		PlacementOpal lclPlacementOpal = getResponseOpal().getReplacementForPlacementOpal();
		return lclPlacementOpal == null ? null : lclPlacementOpal.getUserFacing();
	}

	@Override
	public void setReplacementForPlacement(Placement argPlacement) {
		getResponseOpal().setReplacementForPlacementOpal(argPlacement == null ? null : ((PlacementImpl) argPlacement).getPlacementOpal());
		return;
	}

	/** Access to the ResponseType object created from the table response through foreign key response_response_type_code_fkey */

	@Override
	public ResponseType getResponseType() {
		ResponseTypeOpal lclResponseTypeOpal = getResponseOpal().getResponseTypeOpal();
		return lclResponseTypeOpal == null ? null : lclResponseTypeOpal.getUserFacing();
	}

	@Override
	public void setResponseType(ResponseType argResponseType) {
		getResponseOpal().setResponseTypeOpal(argResponseType == null ? null : ((ResponseTypeImpl) argResponseType).getResponseTypeOpal());
		return;
	}

	/* The following methods allow access to the user objects that have foreign keys
	to this object. */

	@Override
	public void unlink() {
		getResponseOpal().unlink();
	}

	@Override
	public void reload() {
		getResponseOpal().reload();
	}

	@Override
	public Response copy() {
		return getResponseOpal().copy().getUserFacing();
	}

}
