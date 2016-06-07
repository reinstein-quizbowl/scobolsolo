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

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getCode() {
		return getResponseTypeOpal().getCode();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public ResponseTypeImpl setCode(java.lang.String argCode) {
		getResponseTypeOpal().setCode(argCode);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public java.lang.String getName() {
		return getResponseTypeOpal().getName();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public ResponseTypeImpl setName(java.lang.String argName) {
		getResponseTypeOpal().setName(argName);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getShortName() {
		return getResponseTypeOpal().getShortName();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public ResponseTypeImpl setShortName(java.lang.String argShortName) {
		getResponseTypeOpal().setShortName(argShortName);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getSequenceAsObject() {
		return getResponseTypeOpal().getSequenceAsObject();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public ResponseTypeImpl setSequence(java.lang.Integer argSequence) {
		getResponseTypeOpal().setSequence(argSequence);
		return this;
	}

	@Override
	public ResponseTypeImpl setSequence(int argSequence) {
		getResponseTypeOpal().setSequence(argSequence);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getPointsAsObject() {
		return getResponseTypeOpal().getPointsAsObject();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public ResponseTypeImpl setPoints(java.lang.Integer argPoints) {
		getResponseTypeOpal().setPoints(argPoints);
		return this;
	}

	@Override
	public ResponseTypeImpl setPoints(int argPoints) {
		getResponseTypeOpal().setPoints(argPoints);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@Override
	public java.lang.Boolean isDefaultAsObject() {
		return getResponseTypeOpal().isDefaultAsObject();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@Override
	public ResponseTypeImpl setDefault(java.lang.Boolean argDefault) {
		getResponseTypeOpal().setDefault(argDefault);
		return this;
	}

	@Override
	public ResponseTypeImpl setDefault(boolean argDefault) {
		getResponseTypeOpal().setDefault(argDefault);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@Override
	public java.lang.Boolean isMultipleAllowedForSamePlacementAsObject() {
		return getResponseTypeOpal().isMultipleAllowedForSamePlacementAsObject();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@Override
	public ResponseTypeImpl setMultipleAllowedForSamePlacement(java.lang.Boolean argMultipleAllowedForSamePlacement) {
		getResponseTypeOpal().setMultipleAllowedForSamePlacement(argMultipleAllowedForSamePlacement);
		return this;
	}

	@Override
	public ResponseTypeImpl setMultipleAllowedForSamePlacement(boolean argMultipleAllowedForSamePlacement) {
		getResponseTypeOpal().setMultipleAllowedForSamePlacement(argMultipleAllowedForSamePlacement);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	@Override
	public java.lang.Boolean isAttemptAsObject() {
		return getResponseTypeOpal().isAttemptAsObject();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	@Override
	public ResponseTypeImpl setAttempt(java.lang.Boolean argAttempt) {
		getResponseTypeOpal().setAttempt(argAttempt);
		return this;
	}

	@Override
	public ResponseTypeImpl setAttempt(boolean argAttempt) {
		getResponseTypeOpal().setAttempt(argAttempt);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@Override
	public java.lang.Boolean allowsFurtherAttemptsToSameQuestionInMatchAsObject() {
		return getResponseTypeOpal().allowsFurtherAttemptsToSameQuestionInMatchAsObject();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@Override
	public ResponseTypeImpl setFurtherAttemptsToSameQuestionInMatch(java.lang.Boolean argFurtherAttemptsToSameQuestionInMatch) {
		getResponseTypeOpal().setFurtherAttemptsToSameQuestionInMatch(argFurtherAttemptsToSameQuestionInMatch);
		return this;
	}

	@Override
	public ResponseTypeImpl setFurtherAttemptsToSameQuestionInMatch(boolean argFurtherAttemptsToSameQuestionInMatch) {
		getResponseTypeOpal().setFurtherAttemptsToSameQuestionInMatch(argFurtherAttemptsToSameQuestionInMatch);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	@Override
	public java.lang.Boolean isShowForNonExhibitionPlayersAsObject() {
		return getResponseTypeOpal().isShowForNonExhibitionPlayersAsObject();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	@Override
	public ResponseTypeImpl setShowForNonExhibitionPlayers(java.lang.Boolean argShowForNonExhibitionPlayers) {
		getResponseTypeOpal().setShowForNonExhibitionPlayers(argShowForNonExhibitionPlayers);
		return this;
	}

	@Override
	public ResponseTypeImpl setShowForNonExhibitionPlayers(boolean argShowForNonExhibitionPlayers) {
		getResponseTypeOpal().setShowForNonExhibitionPlayers(argShowForNonExhibitionPlayers);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	@Override
	public java.lang.Boolean isShowForExhibitionPlayersAsObject() {
		return getResponseTypeOpal().isShowForExhibitionPlayersAsObject();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	@Override
	public ResponseTypeImpl setShowForExhibitionPlayers(java.lang.Boolean argShowForExhibitionPlayers) {
		getResponseTypeOpal().setShowForExhibitionPlayers(argShowForExhibitionPlayers);
		return this;
	}

	@Override
	public ResponseTypeImpl setShowForExhibitionPlayers(boolean argShowForExhibitionPlayers) {
		getResponseTypeOpal().setShowForExhibitionPlayers(argShowForExhibitionPlayers);
		return this;
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
