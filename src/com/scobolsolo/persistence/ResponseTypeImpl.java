package com.scobolsolo.persistence;

public class ResponseTypeImpl extends com.opal.AbstractIdentityImpl<com.scobolsolo.application.ResponseType, com.scobolsolo.persistence.ResponseTypeOpal> implements com.scobolsolo.application.ResponseType {

	private final com.scobolsolo.persistence.ResponseTypeOpal myResponseTypeOpal;

	public ResponseTypeImpl(ResponseTypeOpal argResponseTypeOpal) {
		super();
		myResponseTypeOpal = org.apache.commons.lang3.Validate.notNull(argResponseTypeOpal);
	}

	protected com.scobolsolo.persistence.ResponseTypeOpal getResponseTypeOpal() {
		return myResponseTypeOpal;
	}

	@Override
	public com.scobolsolo.persistence.ResponseTypeOpal getOpal() {
		return getResponseTypeOpal();
	}

	@Override
	public com.scobolsolo.persistence.ResponseTypeOpal getBottomOpal() {
		return getResponseTypeOpal();
	}

	@Override
	public int compareTo(com.scobolsolo.application.ResponseType argSecond) {
		return this.getSequenceAsObject().compareTo(argSecond.getSequenceAsObject());
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getCode() {
		return getResponseTypeOpal().getCode();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public com.scobolsolo.persistence.ResponseTypeImpl setCode(java.lang.String argCode) {
		getResponseTypeOpal().setCode(argCode);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public java.lang.String getName() {
		return getResponseTypeOpal().getName();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public com.scobolsolo.persistence.ResponseTypeImpl setName(java.lang.String argName) {
		getResponseTypeOpal().setName(argName);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getShortName() {
		return getResponseTypeOpal().getShortName();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public com.scobolsolo.persistence.ResponseTypeImpl setShortName(java.lang.String argShortName) {
		getResponseTypeOpal().setShortName(argShortName);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getSequenceAsObject() {
		return getResponseTypeOpal().getSequenceAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.ResponseTypeImpl setSequence(java.lang.Integer argSequence) {
		getResponseTypeOpal().setSequence(argSequence);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.ResponseTypeImpl setSequence(int argSequence) {
		getResponseTypeOpal().setSequence(argSequence);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getPointsAsObject() {
		return getResponseTypeOpal().getPointsAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.ResponseTypeImpl setPoints(java.lang.Integer argPoints) {
		getResponseTypeOpal().setPoints(argPoints);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.ResponseTypeImpl setPoints(int argPoints) {
		getResponseTypeOpal().setPoints(argPoints);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@Override
	public java.lang.Boolean isDefaultAsObject() {
		return getResponseTypeOpal().isDefaultAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@Override
	public com.scobolsolo.persistence.ResponseTypeImpl setDefault(java.lang.Boolean argDefault) {
		getResponseTypeOpal().setDefault(argDefault);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.ResponseTypeImpl setDefault(boolean argDefault) {
		getResponseTypeOpal().setDefault(argDefault);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@Override
	public java.lang.Boolean isMultipleAllowedForSamePlacementAsObject() {
		return getResponseTypeOpal().isMultipleAllowedForSamePlacementAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@Override
	public com.scobolsolo.persistence.ResponseTypeImpl setMultipleAllowedForSamePlacement(java.lang.Boolean argMultipleAllowedForSamePlacement) {
		getResponseTypeOpal().setMultipleAllowedForSamePlacement(argMultipleAllowedForSamePlacement);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.ResponseTypeImpl setMultipleAllowedForSamePlacement(boolean argMultipleAllowedForSamePlacement) {
		getResponseTypeOpal().setMultipleAllowedForSamePlacement(argMultipleAllowedForSamePlacement);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	@Override
	public java.lang.Boolean isAttemptAsObject() {
		return getResponseTypeOpal().isAttemptAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	@Override
	public com.scobolsolo.persistence.ResponseTypeImpl setAttempt(java.lang.Boolean argAttempt) {
		getResponseTypeOpal().setAttempt(argAttempt);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.ResponseTypeImpl setAttempt(boolean argAttempt) {
		getResponseTypeOpal().setAttempt(argAttempt);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@Override
	public java.lang.Boolean allowsFurtherAttemptsToSameQuestionInMatchAsObject() {
		return getResponseTypeOpal().allowsFurtherAttemptsToSameQuestionInMatchAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@Override
	public com.scobolsolo.persistence.ResponseTypeImpl setFurtherAttemptsToSameQuestionInMatch(java.lang.Boolean argFurtherAttemptsToSameQuestionInMatch) {
		getResponseTypeOpal().setFurtherAttemptsToSameQuestionInMatch(argFurtherAttemptsToSameQuestionInMatch);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.ResponseTypeImpl setFurtherAttemptsToSameQuestionInMatch(boolean argFurtherAttemptsToSameQuestionInMatch) {
		getResponseTypeOpal().setFurtherAttemptsToSameQuestionInMatch(argFurtherAttemptsToSameQuestionInMatch);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	@Override
	public java.lang.Boolean isShowForNonExhibitionPlayersAsObject() {
		return getResponseTypeOpal().isShowForNonExhibitionPlayersAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	@Override
	public com.scobolsolo.persistence.ResponseTypeImpl setShowForNonExhibitionPlayers(java.lang.Boolean argShowForNonExhibitionPlayers) {
		getResponseTypeOpal().setShowForNonExhibitionPlayers(argShowForNonExhibitionPlayers);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.ResponseTypeImpl setShowForNonExhibitionPlayers(boolean argShowForNonExhibitionPlayers) {
		getResponseTypeOpal().setShowForNonExhibitionPlayers(argShowForNonExhibitionPlayers);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	@Override
	public java.lang.Boolean isShowForExhibitionPlayersAsObject() {
		return getResponseTypeOpal().isShowForExhibitionPlayersAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	@Override
	public com.scobolsolo.persistence.ResponseTypeImpl setShowForExhibitionPlayers(java.lang.Boolean argShowForExhibitionPlayers) {
		getResponseTypeOpal().setShowForExhibitionPlayers(argShowForExhibitionPlayers);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.ResponseTypeImpl setShowForExhibitionPlayers(boolean argShowForExhibitionPlayers) {
		getResponseTypeOpal().setShowForExhibitionPlayers(argShowForExhibitionPlayers);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	@Override
	public java.lang.Boolean isShowInReportsAsObject() {
		return getResponseTypeOpal().isShowInReportsAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	@Override
	public com.scobolsolo.persistence.ResponseTypeImpl setShowInReports(java.lang.Boolean argShowInReports) {
		getResponseTypeOpal().setShowInReports(argShowInReports);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.ResponseTypeImpl setShowInReports(boolean argShowInReports) {
		getResponseTypeOpal().setShowInReports(argShowInReports);
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
	public com.scobolsolo.application.ResponseType copy() {
		return getResponseTypeOpal().copy().getUserFacing();
	}

}
