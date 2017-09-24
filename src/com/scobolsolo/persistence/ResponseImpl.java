package com.scobolsolo.persistence;

public class ResponseImpl extends com.opal.AbstractIdentityImpl<com.scobolsolo.application.Response, com.scobolsolo.persistence.ResponseOpal> implements com.scobolsolo.application.Response {

	private final com.scobolsolo.persistence.ResponseOpal myResponseOpal;

	public ResponseImpl(ResponseOpal argResponseOpal) {
		super();
		myResponseOpal = org.apache.commons.lang3.Validate.notNull(argResponseOpal);
	}

	protected com.scobolsolo.persistence.ResponseOpal getResponseOpal() {
		return myResponseOpal;
	}

	@Override
	public com.scobolsolo.persistence.ResponseOpal getOpal() {
		return getResponseOpal();
	}

	@Override
	public com.scobolsolo.persistence.ResponseOpal getBottomOpal() {
		return getResponseOpal();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getIdAsObject() {
		return getResponseOpal().getIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.ResponseImpl setId(java.lang.Integer argId) {
		getResponseOpal().setId(argId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.ResponseImpl setId(int argId) {
		getResponseOpal().setId(argId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getPerformanceIdAsObject() {
		return getResponseOpal().getPerformanceIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.ResponseImpl setPerformanceId(java.lang.Integer argPerformanceId) {
		getResponseOpal().setPerformanceId(argPerformanceId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.ResponseImpl setPerformanceId(int argPerformanceId) {
		getResponseOpal().setPerformanceId(argPerformanceId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getResponseTypeCode() {
		return getResponseOpal().getResponseTypeCode();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public com.scobolsolo.persistence.ResponseImpl setResponseTypeCode(java.lang.String argResponseTypeCode) {
		getResponseOpal().setResponseTypeCode(argResponseTypeCode);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getBasePlacementIdAsObject() {
		return getResponseOpal().getBasePlacementIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.ResponseImpl setBasePlacementId(java.lang.Integer argBasePlacementId) {
		getResponseOpal().setBasePlacementId(argBasePlacementId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.ResponseImpl setBasePlacementId(int argBasePlacementId) {
		getResponseOpal().setBasePlacementId(argBasePlacementId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getReplacementPlacementIdAsObject() {
		return getResponseOpal().getReplacementPlacementIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.persistence.ResponseImpl setReplacementPlacementId(java.lang.Integer argReplacementPlacementId) {
		getResponseOpal().setReplacementPlacementId(argReplacementPlacementId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.ResponseImpl setReplacementPlacementId(int argReplacementPlacementId) {
		getResponseOpal().setReplacementPlacementId(argReplacementPlacementId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getDiffIdAsObject() {
		return getResponseOpal().getDiffIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.persistence.ResponseImpl setDiffId(java.lang.Integer argDiffId) {
		getResponseOpal().setDiffId(argDiffId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.ResponseImpl setDiffId(int argDiffId) {
		getResponseOpal().setDiffId(argDiffId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getLocationAsObject() {
		return getResponseOpal().getLocationAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.persistence.ResponseImpl setLocation(java.lang.Integer argLocation) {
		getResponseOpal().setLocation(argLocation);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.ResponseImpl setLocation(int argLocation) {
		getResponseOpal().setLocation(argLocation);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the Placement object created from response through reference response_base_placement_id_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.Placement getBasePlacement() {
		PlacementOpal lclPlacementOpal = getResponseOpal().getBasePlacementOpal();
		return lclPlacementOpal == null ? null : lclPlacementOpal.getUserFacing();
	}

	@Override
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.Response setBasePlacement(com.scobolsolo.application.Placement argPlacement) {
		getResponseOpal().setBasePlacementOpal(argPlacement == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.Placement, com.scobolsolo.persistence.PlacementOpal>) argPlacement).getOpal());
		return this;
	}

	/** @return the Diff object created from response through reference response_diff_id_fkey */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.application.Diff getDiff() {
		DiffOpal lclDiffOpal = getResponseOpal().getDiffOpal();
		return lclDiffOpal == null ? null : lclDiffOpal.getUserFacing();
	}

	@Override
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.Response setDiff(com.scobolsolo.application.Diff argDiff) {
		getResponseOpal().setDiffOpal(argDiff == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.Diff, com.scobolsolo.persistence.DiffOpal>) argDiff).getOpal());
		return this;
	}

	/** @return the Performance object created from response through reference response_performance_id_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.Performance getPerformance() {
		PerformanceOpal lclPerformanceOpal = getResponseOpal().getPerformanceOpal();
		return lclPerformanceOpal == null ? null : lclPerformanceOpal.getUserFacing();
	}

	@Override
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.Response setPerformance(com.scobolsolo.application.Performance argPerformance) {
		getResponseOpal().setPerformanceOpal(argPerformance == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.Performance, com.scobolsolo.persistence.PerformanceOpal>) argPerformance).getOpal());
		return this;
	}

	/** @return the Placement object created from response through reference response_replacement_placement_id_fkey1 */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.application.Placement getReplacementPlacement() {
		PlacementOpal lclPlacementOpal = getResponseOpal().getReplacementPlacementOpal();
		return lclPlacementOpal == null ? null : lclPlacementOpal.getUserFacing();
	}

	@Override
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.Response setReplacementPlacement(com.scobolsolo.application.Placement argPlacement) {
		getResponseOpal().setReplacementPlacementOpal(argPlacement == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.Placement, com.scobolsolo.persistence.PlacementOpal>) argPlacement).getOpal());
		return this;
	}

	/** @return the ResponseType object created from response through reference response_response_type_code_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.ResponseType getResponseType() {
		ResponseTypeOpal lclResponseTypeOpal = getResponseOpal().getResponseTypeOpal();
		return lclResponseTypeOpal == null ? null : lclResponseTypeOpal.getUserFacing();
	}

	@Override
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.Response setResponseType(com.scobolsolo.application.ResponseType argResponseType) {
		getResponseOpal().setResponseTypeOpal(argResponseType == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.ResponseType, com.scobolsolo.persistence.ResponseTypeOpal>) argResponseType).getOpal());
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
	public com.scobolsolo.application.Response copy() {
		return getResponseOpal().copy().getUserFacing();
	}

}
