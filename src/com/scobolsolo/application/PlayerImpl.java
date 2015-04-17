package com.scobolsolo.application;

import com.opal.Opal;
import com.scobolsolo.persistence.PlayerOpal;
import com.scobolsolo.persistence.ContactOpal;
import com.scobolsolo.persistence.CardOpal;
import com.scobolsolo.persistence.SchoolRegistrationOpal;
import com.scobolsolo.persistence.SchoolYearOpal;

public class PlayerImpl extends com.opal.AbstractIdentityImpl<Player, PlayerOpal> implements Player {
	private final PlayerOpal myPlayerOpal;

	public PlayerImpl(PlayerOpal argPlayerOpal) {
		super();
		myPlayerOpal = org.apache.commons.lang3.Validate.notNull(argPlayerOpal);
	}

	protected PlayerOpal getPlayerOpal() {
		return myPlayerOpal;
	}

	@Override
	protected com.opal.IdentityOpal<? extends Player> getBottomOpal() {
		return getPlayerOpal();
	}

	@Override
	protected Opal<? super Player>[] getOpalArray() {
		return (Opal<? super Player>[]) new Opal<?>[] {
			getPlayerOpal(),
		};
	}

	@Override
	public java.lang.Integer getIdAsObject() {
		return getPlayerOpal().getIdAsObject();
	}

	@Override
	public void setId(java.lang.Integer argId) {
		getPlayerOpal().setId(argId);
		return;
	}

	@Override
	public void setId(int argId) {
		getPlayerOpal().setId(argId);
		return;
	}

	@Override
	public java.lang.Integer getContactIdAsObject() {
		return getPlayerOpal().getContactIdAsObject();
	}

	@Override
	public void setContactId(java.lang.Integer argContactId) {
		getPlayerOpal().setContactId(argContactId);
		return;
	}

	@Override
	public void setContactId(int argContactId) {
		getPlayerOpal().setContactId(argContactId);
		return;
	}

	@Override
	public java.lang.Integer getSchoolRegistrationIdAsObject() {
		return getPlayerOpal().getSchoolRegistrationIdAsObject();
	}

	@Override
	public void setSchoolRegistrationId(java.lang.Integer argSchoolRegistrationId) {
		getPlayerOpal().setSchoolRegistrationId(argSchoolRegistrationId);
		return;
	}

	@Override
	public void setSchoolRegistrationId(int argSchoolRegistrationId) {
		getPlayerOpal().setSchoolRegistrationId(argSchoolRegistrationId);
		return;
	}

	@Override
	public java.lang.String getSchoolYearCode() {
		return getPlayerOpal().getSchoolYearCode();
	}

	@Override
	public void setSchoolYearCode(java.lang.String argSchoolYearCode) {
		getPlayerOpal().setSchoolYearCode(argSchoolYearCode);
		return;
	}

	@Override
	public java.lang.Integer getRankWithinSchoolAsObject() {
		return getPlayerOpal().getRankWithinSchoolAsObject();
	}

	@Override
	public void setRankWithinSchool(java.lang.Integer argRankWithinSchool) {
		getPlayerOpal().setRankWithinSchool(argRankWithinSchool);
		return;
	}

	@Override
	public void setRankWithinSchool(int argRankWithinSchool) {
		getPlayerOpal().setRankWithinSchool(argRankWithinSchool);
		return;
	}

	@Override
	public java.lang.Integer getSeedAsObject() {
		return getPlayerOpal().getSeedAsObject();
	}

	@Override
	public void setSeed(java.lang.Integer argSeed) {
		getPlayerOpal().setSeed(argSeed);
		return;
	}

	@Override
	public void setSeed(int argSeed) {
		getPlayerOpal().setSeed(argSeed);
		return;
	}

	@Override
	public java.lang.String getNote() {
		return getPlayerOpal().getNote();
	}

	@Override
	public void setNote(java.lang.String argNote) {
		getPlayerOpal().setNote(argNote);
		return;
	}

	@Override
	public java.lang.Integer getInitialCardIdAsObject() {
		return getPlayerOpal().getInitialCardIdAsObject();
	}

	@Override
	public void setInitialCardId(java.lang.Integer argInitialCardId) {
		getPlayerOpal().setInitialCardId(argInitialCardId);
		return;
	}

	@Override
	public void setInitialCardId(int argInitialCardId) {
		getPlayerOpal().setInitialCardId(argInitialCardId);
		return;
	}

	@Override
	public java.lang.Boolean isExhibitionAsObject() {
		return getPlayerOpal().isExhibitionAsObject();
	}

	@Override
	public void setExhibition(java.lang.Boolean argExhibition) {
		getPlayerOpal().setExhibition(argExhibition);
		return;
	}

	@Override
	public void setExhibition(boolean argExhibition) {
		getPlayerOpal().setExhibition(argExhibition);
		return;
	}

	/* The following methods allow direct access to the user objects for which
	this object has foreign keys in the database. */

	/** Access to the Contact object created from the table player through foreign key player_contact_id_fkey */

	@Override
	public Contact getContact() {
		ContactOpal lclContactOpal = getPlayerOpal().getContactOpal();
		return lclContactOpal == null ? null : lclContactOpal.getUserFacing();
	}

	@Override
	public void setContact(Contact argContact) {
		getPlayerOpal().setContactOpal(argContact == null ? null : ((ContactImpl) argContact).getContactOpal());
		return;
	}

	/** Access to the Card object created from the table player through foreign key player_initial_card_id_fkey */

	@Override
	public Card getInitialCard() {
		CardOpal lclCardOpal = getPlayerOpal().getInitialCardOpal();
		return lclCardOpal == null ? null : lclCardOpal.getUserFacing();
	}

	@Override
	public void setInitialCard(Card argCard) {
		getPlayerOpal().setInitialCardOpal(argCard == null ? null : ((CardImpl) argCard).getCardOpal());
		return;
	}

	/** Access to the SchoolRegistration object created from the table player through foreign key player_registration_id_fkey */

	@Override
	public SchoolRegistration getSchoolRegistration() {
		SchoolRegistrationOpal lclSchoolRegistrationOpal = getPlayerOpal().getSchoolRegistrationOpal();
		return lclSchoolRegistrationOpal == null ? null : lclSchoolRegistrationOpal.getUserFacing();
	}

	@Override
	public void setSchoolRegistration(SchoolRegistration argSchoolRegistration) {
		getPlayerOpal().setSchoolRegistrationOpal(argSchoolRegistration == null ? null : ((SchoolRegistrationImpl) argSchoolRegistration).getSchoolRegistrationOpal());
		return;
	}

	/** Access to the SchoolYear object created from the table player through foreign key player_school_year_code_fkey */

	@Override
	public SchoolYear getSchoolYear() {
		SchoolYearOpal lclSchoolYearOpal = getPlayerOpal().getSchoolYearOpal();
		return lclSchoolYearOpal == null ? null : lclSchoolYearOpal.getUserFacing();
	}

	@Override
	public void setSchoolYear(SchoolYear argSchoolYear) {
		getPlayerOpal().setSchoolYearOpal(argSchoolYear == null ? null : ((SchoolYearImpl) argSchoolYear).getSchoolYearOpal());
		return;
	}

	/* The following methods allow access to the user objects that have foreign keys
	to this object. */

	@Override
	public void addIncomingLosingCardGame(Game argGame) {
		getPlayerOpal().addIncomingLosingCardGameOpal(((GameImpl) argGame).getGameOpal());
	}

	@Override
	public void removeIncomingLosingCardGame(Game argGame) {
		getPlayerOpal().removeIncomingLosingCardGameOpal(((GameImpl) argGame).getGameOpal());
	}

	@Override
	public int getIncomingLosingCardGameCount() {
		return getPlayerOpal().getIncomingLosingCardGameOpalCount();
	}

	@Override
	public java.util.stream.Stream<Game> streamIncomingLosingCardGame() {
		return getPlayerOpal().streamIncomingLosingCardGameOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<Game> createIncomingLosingCardGameIterator() {
		return new com.opal.OpalIterator<> (getPlayerOpal().createIncomingLosingCardGameOpalIterator());
	}

	@Override
	public void clearIncomingLosingCardGame() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addIncomingWinningCardGame(Game argGame) {
		getPlayerOpal().addIncomingWinningCardGameOpal(((GameImpl) argGame).getGameOpal());
	}

	@Override
	public void removeIncomingWinningCardGame(Game argGame) {
		getPlayerOpal().removeIncomingWinningCardGameOpal(((GameImpl) argGame).getGameOpal());
	}

	@Override
	public int getIncomingWinningCardGameCount() {
		return getPlayerOpal().getIncomingWinningCardGameOpalCount();
	}

	@Override
	public java.util.stream.Stream<Game> streamIncomingWinningCardGame() {
		return getPlayerOpal().streamIncomingWinningCardGameOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<Game> createIncomingWinningCardGameIterator() {
		return new com.opal.OpalIterator<> (getPlayerOpal().createIncomingWinningCardGameOpalIterator());
	}

	@Override
	public void clearIncomingWinningCardGame() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addOutgoingLosingCardGame(Game argGame) {
		getPlayerOpal().addOutgoingLosingCardGameOpal(((GameImpl) argGame).getGameOpal());
	}

	@Override
	public void removeOutgoingLosingCardGame(Game argGame) {
		getPlayerOpal().removeOutgoingLosingCardGameOpal(((GameImpl) argGame).getGameOpal());
	}

	@Override
	public int getOutgoingLosingCardGameCount() {
		return getPlayerOpal().getOutgoingLosingCardGameOpalCount();
	}

	@Override
	public java.util.stream.Stream<Game> streamOutgoingLosingCardGame() {
		return getPlayerOpal().streamOutgoingLosingCardGameOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<Game> createOutgoingLosingCardGameIterator() {
		return new com.opal.OpalIterator<> (getPlayerOpal().createOutgoingLosingCardGameOpalIterator());
	}

	@Override
	public void clearOutgoingLosingCardGame() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addOutgoingWinningCardGame(Game argGame) {
		getPlayerOpal().addOutgoingWinningCardGameOpal(((GameImpl) argGame).getGameOpal());
	}

	@Override
	public void removeOutgoingWinningCardGame(Game argGame) {
		getPlayerOpal().removeOutgoingWinningCardGameOpal(((GameImpl) argGame).getGameOpal());
	}

	@Override
	public int getOutgoingWinningCardGameCount() {
		return getPlayerOpal().getOutgoingWinningCardGameOpalCount();
	}

	@Override
	public java.util.stream.Stream<Game> streamOutgoingWinningCardGame() {
		return getPlayerOpal().streamOutgoingWinningCardGameOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<Game> createOutgoingWinningCardGameIterator() {
		return new com.opal.OpalIterator<> (getPlayerOpal().createOutgoingWinningCardGameOpalIterator());
	}

	@Override
	public void clearOutgoingWinningCardGame() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addPerformance(Performance argPerformance) {
		getPlayerOpal().addPerformanceOpal(((PerformanceImpl) argPerformance).getPerformanceOpal());
	}

	@Override
	public void removePerformance(Performance argPerformance) {
		getPlayerOpal().removePerformanceOpal(((PerformanceImpl) argPerformance).getPerformanceOpal());
	}

	@Override
	public int getPerformanceCount() {
		return getPlayerOpal().getPerformanceOpalCount();
	}

	@Override
	public java.util.stream.Stream<Performance> streamPerformance() {
		return getPlayerOpal().streamPerformanceOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<Performance> createPerformanceIterator() {
		return new com.opal.OpalIterator<> (getPlayerOpal().createPerformanceOpalIterator());
	}

	@Override
	public void clearPerformance() {
		throw new UnsupportedOperationException();
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
	public Player copy() {
		return getPlayerOpal().copy().getUserFacing();
	}

}
