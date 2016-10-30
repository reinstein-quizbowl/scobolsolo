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
	protected com.opal.IdentityOpal<? extends com.scobolsolo.application.Player> getOpal() {
		return getPlayerOpal();
	}

	@Override
	protected com.opal.IdentityOpal<? extends com.scobolsolo.application.Player> getBottomOpal() {
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
	public com.scobolsolo.application.Player setContact(com.scobolsolo.application.Contact argContact) {
		getPlayerOpal().setContactOpal(argContact == null ? null : ((ContactImpl) argContact).getContactOpal());
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
	public com.scobolsolo.application.Player setSchoolRegistration(com.scobolsolo.application.SchoolRegistration argSchoolRegistration) {
		getPlayerOpal().setSchoolRegistrationOpal(argSchoolRegistration == null ? null : ((SchoolRegistrationImpl) argSchoolRegistration).getSchoolRegistrationOpal());
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
	public com.scobolsolo.application.Player setSchoolYear(com.scobolsolo.application.SchoolYear argSchoolYear) {
		getPlayerOpal().setSchoolYearOpal(argSchoolYear == null ? null : ((SchoolYearImpl) argSchoolYear).getSchoolYearOpal());
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
	public com.scobolsolo.application.Player addOutgoingLosingCardGame(com.scobolsolo.application.Game argGame) {
		getPlayerOpal().addOutgoingLosingCardGameOpal(((GameImpl) argGame).getGameOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Player removeOutgoingLosingCardGame(com.scobolsolo.application.Game argGame) {
		getPlayerOpal().removeOutgoingLosingCardGameOpal(((GameImpl) argGame).getGameOpal());
		return this;
	}

	@Override
	public int getOutgoingLosingCardGameCount() {
		return getPlayerOpal().getOutgoingLosingCardGameOpalCount();
	}

	@Override
	public java.util.stream.Stream<com.scobolsolo.application.Game> streamOutgoingLosingCardGame() {
		return getPlayerOpal().streamOutgoingLosingCardGameOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<com.scobolsolo.application.Game> createOutgoingLosingCardGameIterator() {
		return new com.opal.OpalIterator<> (getPlayerOpal().createOutgoingLosingCardGameOpalIterator());
	}

	@Override
	public com.scobolsolo.application.Player addOutgoingWinningCardGame(com.scobolsolo.application.Game argGame) {
		getPlayerOpal().addOutgoingWinningCardGameOpal(((GameImpl) argGame).getGameOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Player removeOutgoingWinningCardGame(com.scobolsolo.application.Game argGame) {
		getPlayerOpal().removeOutgoingWinningCardGameOpal(((GameImpl) argGame).getGameOpal());
		return this;
	}

	@Override
	public int getOutgoingWinningCardGameCount() {
		return getPlayerOpal().getOutgoingWinningCardGameOpalCount();
	}

	@Override
	public java.util.stream.Stream<com.scobolsolo.application.Game> streamOutgoingWinningCardGame() {
		return getPlayerOpal().streamOutgoingWinningCardGameOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<com.scobolsolo.application.Game> createOutgoingWinningCardGameIterator() {
		return new com.opal.OpalIterator<> (getPlayerOpal().createOutgoingWinningCardGameOpalIterator());
	}

	@Override
	public com.scobolsolo.application.Player addIncomingLosingCardGame(com.scobolsolo.application.Game argGame) {
		getPlayerOpal().addIncomingLosingCardGameOpal(((GameImpl) argGame).getGameOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Player removeIncomingLosingCardGame(com.scobolsolo.application.Game argGame) {
		getPlayerOpal().removeIncomingLosingCardGameOpal(((GameImpl) argGame).getGameOpal());
		return this;
	}

	@Override
	public int getIncomingLosingCardGameCount() {
		return getPlayerOpal().getIncomingLosingCardGameOpalCount();
	}

	@Override
	public java.util.stream.Stream<com.scobolsolo.application.Game> streamIncomingLosingCardGame() {
		return getPlayerOpal().streamIncomingLosingCardGameOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<com.scobolsolo.application.Game> createIncomingLosingCardGameIterator() {
		return new com.opal.OpalIterator<> (getPlayerOpal().createIncomingLosingCardGameOpalIterator());
	}

	@Override
	public com.scobolsolo.application.Player addIncomingWinningCardGame(com.scobolsolo.application.Game argGame) {
		getPlayerOpal().addIncomingWinningCardGameOpal(((GameImpl) argGame).getGameOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Player removeIncomingWinningCardGame(com.scobolsolo.application.Game argGame) {
		getPlayerOpal().removeIncomingWinningCardGameOpal(((GameImpl) argGame).getGameOpal());
		return this;
	}

	@Override
	public int getIncomingWinningCardGameCount() {
		return getPlayerOpal().getIncomingWinningCardGameOpalCount();
	}

	@Override
	public java.util.stream.Stream<com.scobolsolo.application.Game> streamIncomingWinningCardGame() {
		return getPlayerOpal().streamIncomingWinningCardGameOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<com.scobolsolo.application.Game> createIncomingWinningCardGameIterator() {
		return new com.opal.OpalIterator<> (getPlayerOpal().createIncomingWinningCardGameOpalIterator());
	}

	@Override
	public com.scobolsolo.application.Player addPerformance(com.scobolsolo.application.Performance argPerformance) {
		getPlayerOpal().addPerformanceOpal(((PerformanceImpl) argPerformance).getPerformanceOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Player removePerformance(com.scobolsolo.application.Performance argPerformance) {
		getPlayerOpal().removePerformanceOpal(((PerformanceImpl) argPerformance).getPerformanceOpal());
		return this;
	}

	@Override
	public int getPerformanceCount() {
		return getPlayerOpal().getPerformanceOpalCount();
	}

	@Override
	public java.util.stream.Stream<com.scobolsolo.application.Performance> streamPerformance() {
		return getPlayerOpal().streamPerformanceOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<com.scobolsolo.application.Performance> createPerformanceIterator() {
		return new com.opal.OpalIterator<> (getPlayerOpal().createPerformanceOpalIterator());
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
