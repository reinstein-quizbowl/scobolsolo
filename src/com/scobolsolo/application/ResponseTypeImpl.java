package com.scobolsolo.application;

import com.scobolsolo.persistence.ResponseTypeOpal;

public class ResponseTypeImpl extends com.opal.AbstractIdentityImpl<ResponseType, ResponseTypeOpal> implements ResponseType {
	private final ResponseTypeOpal myResponseTypeOpal;

	public ResponseTypeImpl(ResponseTypeOpal argResponseTypeOpal) {
		super();
		myResponseTypeOpal = org.apache.commons.lang3.Validate.notNull(argResponseTypeOpal);
	}

	protected ResponseTypeOpal getResponseTypeOpal() {
		return myResponseTypeOpal;
	}

	@Override
	protected com.opal.IdentityOpal<? extends ResponseType> getOpal() {
		return getResponseTypeOpal();
	}

	@Override
	protected com.opal.IdentityOpal<? extends ResponseType> getBottomOpal() {
		return getResponseTypeOpal();
	}

	@Override
	public int compareTo(ResponseType argSecond) {
		return this.getSequenceAsObject().compareTo(argSecond.getSequenceAsObject());
	}

	@Override
	public java.lang.String getCode() {
		return getResponseTypeOpal().getCode();
	}

	@Override
	public void setCode(java.lang.String argCode) {
		getResponseTypeOpal().setCode(argCode);
		return;
	}

	@Override
	public java.lang.String getName() {
		return getResponseTypeOpal().getName();
	}

	@Override
	public void setName(java.lang.String argName) {
		getResponseTypeOpal().setName(argName);
		return;
	}

	@Override
	public java.lang.String getShortName() {
		return getResponseTypeOpal().getShortName();
	}

	@Override
	public void setShortName(java.lang.String argShortName) {
		getResponseTypeOpal().setShortName(argShortName);
		return;
	}

	@Override
	public java.lang.Integer getSequenceAsObject() {
		return getResponseTypeOpal().getSequenceAsObject();
	}

	@Override
	public void setSequence(java.lang.Integer argSequence) {
		getResponseTypeOpal().setSequence(argSequence);
		return;
	}

	@Override
	public void setSequence(int argSequence) {
		getResponseTypeOpal().setSequence(argSequence);
		return;
	}

	@Override
	public java.lang.Integer getPointsAsObject() {
		return getResponseTypeOpal().getPointsAsObject();
	}

	@Override
	public void setPoints(java.lang.Integer argPoints) {
		getResponseTypeOpal().setPoints(argPoints);
		return;
	}

	@Override
	public void setPoints(int argPoints) {
		getResponseTypeOpal().setPoints(argPoints);
		return;
	}

	@Override
	public java.lang.String getBootstrapButtonClass() {
		return getResponseTypeOpal().getBootstrapButtonClass();
	}

	@Override
	public void setBootstrapButtonClass(java.lang.String argBootstrapButtonClass) {
		getResponseTypeOpal().setBootstrapButtonClass(argBootstrapButtonClass);
		return;
	}

	@Override
	public java.lang.Boolean isDefaultAsObject() {
		return getResponseTypeOpal().isDefaultAsObject();
	}

	@Override
	public void setDefault(java.lang.Boolean argDefault) {
		getResponseTypeOpal().setDefault(argDefault);
		return;
	}

	@Override
	public void setDefault(boolean argDefault) {
		getResponseTypeOpal().setDefault(argDefault);
		return;
	}

	@Override
	public java.lang.Boolean isMultipleAllowedForSamePlacementAsObject() {
		return getResponseTypeOpal().isMultipleAllowedForSamePlacementAsObject();
	}

	@Override
	public void setMultipleAllowedForSamePlacement(java.lang.Boolean argMultipleAllowedForSamePlacement) {
		getResponseTypeOpal().setMultipleAllowedForSamePlacement(argMultipleAllowedForSamePlacement);
		return;
	}

	@Override
	public void setMultipleAllowedForSamePlacement(boolean argMultipleAllowedForSamePlacement) {
		getResponseTypeOpal().setMultipleAllowedForSamePlacement(argMultipleAllowedForSamePlacement);
		return;
	}

	@Override
	public java.lang.Boolean isAttemptAsObject() {
		return getResponseTypeOpal().isAttemptAsObject();
	}

	@Override
	public void setAttempt(java.lang.Boolean argAttempt) {
		getResponseTypeOpal().setAttempt(argAttempt);
		return;
	}

	@Override
	public void setAttempt(boolean argAttempt) {
		getResponseTypeOpal().setAttempt(argAttempt);
		return;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public void unlink() {
		getResponseTypeOpal().unlink();
	}

	@Override
	public void reload() {
		getResponseTypeOpal().reload();
	}

	@Override
	public ResponseType copy() {
		return getResponseTypeOpal().copy().getUserFacing();
	}

}
