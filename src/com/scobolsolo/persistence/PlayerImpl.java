package com.scobolsolo.persistence;

public class PlayerImpl extends com.opal.AbstractIdentityImpl<com.scobolsolo.application.Player, com.scobolsolo.persistence.PlayerOpal> implements com.scobolsolo.application.Player {

	private final com.scobolsolo.persistence.PlayerOpal myPlayerOpal;

	public PlayerImpl(PlayerOpal argPlayerOpal) {
		super();
		myPlayerOpal = org.apache.commons.lang3.Validate.notNull(argPlayerOpal);
	}

	protected com.scobolsolo.persistence.PlayerOpal getPlayerOpal() {
		return myPlayerOpal;
	}

	@Override
	public com.scobolsolo.persistence.PlayerOpal getOpal() {
		return getPlayerOpal();
	}

	@Override
	public com.scobolsolo.persistence.PlayerOpal getBottomOpal() {
		return getPlayerOpal();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getIdAsObject() {
		return getPlayerOpal().getIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.PlayerImpl setId(java.lang.Integer argId) {
		getPlayerOpal().setId(argId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.PlayerImpl setId(int argId) {
		getPlayerOpal().setId(argId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getContactIdAsObject() {
		return getPlayerOpal().getContactIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.PlayerImpl setContactId(java.lang.Integer argContactId) {
		getPlayerOpal().setContactId(argContactId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.PlayerImpl setContactId(int argContactId) {
		getPlayerOpal().setContactId(argContactId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getSchoolRegistrationIdAsObject() {
		return getPlayerOpal().getSchoolRegistrationIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.persistence.PlayerImpl setSchoolRegistrationId(java.lang.Integer argSchoolRegistrationId) {
		getPlayerOpal().setSchoolRegistrationId(argSchoolRegistrationId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.PlayerImpl setSchoolRegistrationId(int argSchoolRegistrationId) {
		getPlayerOpal().setSchoolRegistrationId(argSchoolRegistrationId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getSchoolYearCode() {
		return getPlayerOpal().getSchoolYearCode();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public com.scobolsolo.persistence.PlayerImpl setSchoolYearCode(java.lang.String argSchoolYearCode) {
		getPlayerOpal().setSchoolYearCode(argSchoolYearCode);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getRankWithinSchoolAsObject() {
		return getPlayerOpal().getRankWithinSchoolAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.persistence.PlayerImpl setRankWithinSchool(java.lang.Integer argRankWithinSchool) {
		getPlayerOpal().setRankWithinSchool(argRankWithinSchool);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.PlayerImpl setRankWithinSchool(int argRankWithinSchool) {
		getPlayerOpal().setRankWithinSchool(argRankWithinSchool);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getSeedAsObject() {
		return getPlayerOpal().getSeedAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.persistence.PlayerImpl setSeed(java.lang.Integer argSeed) {
		getPlayerOpal().setSeed(argSeed);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.PlayerImpl setSeed(int argSeed) {
		getPlayerOpal().setSeed(argSeed);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public java.lang.String getNote() {
		return getPlayerOpal().getNote();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public com.scobolsolo.persistence.PlayerImpl setNote(java.lang.String argNote) {
		getPlayerOpal().setNote(argNote);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@Override
	public java.lang.Boolean isExhibitionAsObject() {
		return getPlayerOpal().isExhibitionAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@Override
	public com.scobolsolo.persistence.PlayerImpl setExhibition(java.lang.Boolean argExhibition) {
		getPlayerOpal().setExhibition(argExhibition);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.PlayerImpl setExhibition(boolean argExhibition) {
		getPlayerOpal().setExhibition(argExhibition);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getFinalPlaceAsObject() {
		return getPlayerOpal().getFinalPlaceAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.persistence.PlayerImpl setFinalPlace(java.lang.Integer argFinalPlace) {
		getPlayerOpal().setFinalPlace(argFinalPlace);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.PlayerImpl setFinalPlace(int argFinalPlace) {
		getPlayerOpal().setFinalPlace(argFinalPlace);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the Contact object created from player through reference player_contact_id_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.Contact getContact() {
		ContactOpal lclContactOpal = getPlayerOpal().getContactOpal();
		return lclContactOpal == null ? null : lclContactOpal.getUserFacing();
	}

	@Override
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.Player setContact(com.scobolsolo.application.Contact argContact) {
		getPlayerOpal().setContactOpal(argContact == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.Contact, com.scobolsolo.persistence.ContactOpal>) argContact).getOpal());
		return this;
	}

	/** @return the SchoolRegistration object created from player through reference player_registration_id_fkey */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.application.SchoolRegistration getSchoolRegistration() {
		SchoolRegistrationOpal lclSchoolRegistrationOpal = getPlayerOpal().getSchoolRegistrationOpal();
		return lclSchoolRegistrationOpal == null ? null : lclSchoolRegistrationOpal.getUserFacing();
	}

	@Override
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.Player setSchoolRegistration(com.scobolsolo.application.SchoolRegistration argSchoolRegistration) {
		getPlayerOpal().setSchoolRegistrationOpal(argSchoolRegistration == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.SchoolRegistration, com.scobolsolo.persistence.SchoolRegistrationOpal>) argSchoolRegistration).getOpal());
		return this;
	}

	/** @return the SchoolYear object created from player through reference player_school_year_code_fkey */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.application.SchoolYear getSchoolYear() {
		SchoolYearOpal lclSchoolYearOpal = getPlayerOpal().getSchoolYearOpal();
		return lclSchoolYearOpal == null ? null : lclSchoolYearOpal.getUserFacing();
	}

	@Override
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.Player setSchoolYear(com.scobolsolo.application.SchoolYear argSchoolYear) {
		getPlayerOpal().setSchoolYearOpal(argSchoolYear == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.SchoolYear, com.scobolsolo.persistence.SchoolYearOpal>) argSchoolYear).getOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Card getInitialCard() {
		CardOpal lclO = getPlayerOpal().getInitialCardOpal();
		return lclO == null ? null : lclO.getUserFacing();
	}

	@Override
	public com.scobolsolo.application.Player setInitialCard(com.scobolsolo.application.Card argCard) {
		getPlayerOpal().setInitialCardOpal(argCard == null ? null : ((CardImpl) argCard).getCardOpal());
		return this;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public java.util.Set<com.scobolsolo.application.Game> getIncomingLosingCardGameSet() {
		return new com.opal.UserFacingBackCollectionSet<>(getPlayerOpal().getIncomingLosingCardGameOpalSet());
	}

	@Override
	public java.util.Set<com.scobolsolo.application.Game> getIncomingWinningCardGameSet() {
		return new com.opal.UserFacingBackCollectionSet<>(getPlayerOpal().getIncomingWinningCardGameOpalSet());
	}

	@Override
	public java.util.Set<com.scobolsolo.application.Game> getOutgoingLosingCardGameSet() {
		return new com.opal.UserFacingBackCollectionSet<>(getPlayerOpal().getOutgoingLosingCardGameOpalSet());
	}

	@Override
	public java.util.Set<com.scobolsolo.application.Game> getOutgoingWinningCardGameSet() {
		return new com.opal.UserFacingBackCollectionSet<>(getPlayerOpal().getOutgoingWinningCardGameOpalSet());
	}

	@Override
	public java.util.Set<com.scobolsolo.application.Performance> getPerformanceSet() {
		return new com.opal.UserFacingBackCollectionSet<>(getPlayerOpal().getPerformanceOpalSet());
	}

	@Override
	public void unlink() {
		getPlayerOpal().unlink();
	}

	@Override
	public void reload() {
		getPlayerOpal().reload();
	}

	@Override
	public com.scobolsolo.application.Player copy() {
		return getPlayerOpal().copy().getUserFacing();
	}

}
