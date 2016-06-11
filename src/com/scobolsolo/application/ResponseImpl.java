package com.scobolsolo.application;

import com.scobolsolo.persistence.ResponseOpal;
import com.scobolsolo.persistence.PerformanceOpal;
import com.scobolsolo.persistence.ResponseTypeOpal;
import com.scobolsolo.persistence.PlacementOpal;

public class ResponseImpl extends com.opal.AbstractIdentityImpl<Response, ResponseOpal> implements Response {

	private final ResponseOpal myResponseOpal;

	public ResponseImpl(ResponseOpal argResponseOpal) {
		super();
		myResponseOpal = org.apache.commons.lang3.Validate.notNull(argResponseOpal);
	}

	protected ResponseOpal getResponseOpal() {
		return myResponseOpal;
	}

	@Override
	protected com.opal.IdentityOpal<? extends Response> getOpal() {
		return getResponseOpal();
	}

	@Override
	protected com.opal.IdentityOpal<? extends Response> getBottomOpal() {
		return getResponseOpal();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getIdAsObject() {
		return getResponseOpal().getIdAsObject();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public ResponseImpl setId(java.lang.Integer argId) {
		getResponseOpal().setId(argId);
		return this;
	}

	@Override
	public ResponseImpl setId(int argId) {
		getResponseOpal().setId(argId);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getPerformanceIdAsObject() {
		return getResponseOpal().getPerformanceIdAsObject();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public ResponseImpl setPerformanceId(java.lang.Integer argPerformanceId) {
		getResponseOpal().setPerformanceId(argPerformanceId);
		return this;
	}

	@Override
	public ResponseImpl setPerformanceId(int argPerformanceId) {
		getResponseOpal().setPerformanceId(argPerformanceId);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getResponseTypeCode() {
		return getResponseOpal().getResponseTypeCode();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public ResponseImpl setResponseTypeCode(java.lang.String argResponseTypeCode) {
		getResponseOpal().setResponseTypeCode(argResponseTypeCode);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getBasePlacementIdAsObject() {
		return getResponseOpal().getBasePlacementIdAsObject();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public ResponseImpl setBasePlacementId(java.lang.Integer argBasePlacementId) {
		getResponseOpal().setBasePlacementId(argBasePlacementId);
		return this;
	}

	@Override
	public ResponseImpl setBasePlacementId(int argBasePlacementId) {
		getResponseOpal().setBasePlacementId(argBasePlacementId);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getReplacementPlacementIdAsObject() {
		return getResponseOpal().getReplacementPlacementIdAsObject();
	}

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public ResponseImpl setReplacementPlacementId(java.lang.Integer argReplacementPlacementId) {
		getResponseOpal().setReplacementPlacementId(argReplacementPlacementId);
		return this;
	}

	@Override
	public ResponseImpl setReplacementPlacementId(int argReplacementPlacementId) {
		getResponseOpal().setReplacementPlacementId(argReplacementPlacementId);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the Performance object created from response through reference response_performance_id_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public Performance getPerformance() {
		PerformanceOpal lclPerformanceOpal = getResponseOpal().getPerformanceOpal();
		return lclPerformanceOpal == null ? null : lclPerformanceOpal.getUserFacing();
	}

	@Override
	public Response setPerformance(Performance argPerformance) {
		getResponseOpal().setPerformanceOpal(argPerformance == null ? null : ((PerformanceImpl) argPerformance).getPerformanceOpal());
		return this;
	}

	/** @return the ResponseType object created from response through reference response_response_type_code_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public ResponseType getResponseType() {
		ResponseTypeOpal lclResponseTypeOpal = getResponseOpal().getResponseTypeOpal();
		return lclResponseTypeOpal == null ? null : lclResponseTypeOpal.getUserFacing();
	}

	@Override
	public Response setResponseType(ResponseType argResponseType) {
		getResponseOpal().setResponseTypeOpal(argResponseType == null ? null : ((ResponseTypeImpl) argResponseType).getResponseTypeOpal());
		return this;
	}

	/** @return the Placement object created from response through reference response_base_placement_id_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public Placement getBasePlacement() {
		PlacementOpal lclPlacementOpal = getResponseOpal().getBasePlacementOpal();
		return lclPlacementOpal == null ? null : lclPlacementOpal.getUserFacing();
	}

	@Override
	public Response setBasePlacement(Placement argPlacement) {
		getResponseOpal().setBasePlacementOpal(argPlacement == null ? null : ((PlacementImpl) argPlacement).getPlacementOpal());
		return this;
	}

	/** @return the Placement object created from response through reference response_replacement_placement_id_fkey1 */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public Placement getReplacementPlacement() {
		PlacementOpal lclPlacementOpal = getResponseOpal().getReplacementPlacementOpal();
		return lclPlacementOpal == null ? null : lclPlacementOpal.getUserFacing();
	}

	@Override
	public Response setReplacementPlacement(Placement argPlacement) {
		getResponseOpal().setReplacementPlacementOpal(argPlacement == null ? null : ((PlacementImpl) argPlacement).getPlacementOpal());
		return this;
	}

	/* The following methods allow access to the user objects that have references
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
