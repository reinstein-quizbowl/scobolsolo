package com.scobolsolo.application;

import com.scobolsolo.persistence.ContactOpal;
import com.scobolsolo.persistence.AccountOpal;

public class ContactImpl extends com.opal.AbstractIdentityImpl<Contact, ContactOpal> implements Contact {
	private final ContactOpal myContactOpal;

	public ContactImpl(ContactOpal argContactOpal) {
		super();
		myContactOpal = org.apache.commons.lang3.Validate.notNull(argContactOpal);
	}

	protected ContactOpal getContactOpal() {
		return myContactOpal;
	}

	@Override
	protected com.opal.IdentityOpal<? extends Contact> getOpal() {
		return getContactOpal();
	}

	@Override
	protected com.opal.IdentityOpal<? extends Contact> getBottomOpal() {
		return getContactOpal();
	}

	@Override
	public int compareTo(Contact argSecond) {
		return this.getSortBy().compareTo(argSecond.getSortBy());
	}

	@Override
	public java.lang.Integer getIdAsObject() {
		return getContactOpal().getIdAsObject();
	}

	@Override
	public ContactImpl setId(java.lang.Integer argId) {
		getContactOpal().setId(argId);
		return this;
	}

	@Override
	public ContactImpl setId(int argId) {
		getContactOpal().setId(argId);
		return this;
	}

	@Override
	public java.lang.String getEmailAddress() {
		return getContactOpal().getEmailAddress();
	}

	@Override
	public ContactImpl setEmailAddress(java.lang.String argEmailAddress) {
		getContactOpal().setEmailAddress(argEmailAddress);
		return this;
	}

	@Override
	public java.lang.String getAdvancePhone() {
		return getContactOpal().getAdvancePhone();
	}

	@Override
	public ContactImpl setAdvancePhone(java.lang.String argAdvancePhone) {
		getContactOpal().setAdvancePhone(argAdvancePhone);
		return this;
	}

	@Override
	public java.lang.String getDayOfPhone() {
		return getContactOpal().getDayOfPhone();
	}

	@Override
	public ContactImpl setDayOfPhone(java.lang.String argDayOfPhone) {
		getContactOpal().setDayOfPhone(argDayOfPhone);
		return this;
	}

	@Override
	public java.lang.String getNote() {
		return getContactOpal().getNote();
	}

	@Override
	public ContactImpl setNote(java.lang.String argNote) {
		getContactOpal().setNote(argNote);
		return this;
	}

	@Override
	public java.lang.String getName() {
		return getContactOpal().getName();
	}

	@Override
	public ContactImpl setName(java.lang.String argName) {
		getContactOpal().setName(argName);
		return this;
	}

	@Override
	public java.lang.String getSortBy() {
		return getContactOpal().getSortBy();
	}

	@Override
	public ContactImpl setSortBy(java.lang.String argSortBy) {
		getContactOpal().setSortBy(argSortBy);
		return this;
	}

	@Override
	public java.lang.Boolean isActiveAsObject() {
		return getContactOpal().isActiveAsObject();
	}

	@Override
	public ContactImpl setActive(java.lang.Boolean argActive) {
		getContactOpal().setActive(argActive);
		return this;
	}

	@Override
	public ContactImpl setActive(boolean argActive) {
		getContactOpal().setActive(argActive);
		return this;
	}

	@Override
	public java.lang.String getAddress() {
		return getContactOpal().getAddress();
	}

	@Override
	public ContactImpl setAddress(java.lang.String argAddress) {
		getContactOpal().setAddress(argAddress);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	@Override
	public Account getAccount() {
		AccountOpal lclO = getContactOpal().getAccountOpal();
		return lclO == null ? null : lclO.getUserFacing();
	}

	@Override
	public Contact setAccount(Account argAccount) {
		getContactOpal().setAccountOpal(argAccount == null ? null : ((AccountImpl) argAccount).getAccountOpal());
		return this;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public void addTournamentDirectorTournament(Tournament argTournament) {
		getContactOpal().addTournamentDirectorTournamentOpal(((TournamentImpl) argTournament).getTournamentOpal());
	}

	@Override
	public void removeTournamentDirectorTournament(Tournament argTournament) {
		getContactOpal().removeTournamentDirectorTournamentOpal(((TournamentImpl) argTournament).getTournamentOpal());
	}

	@Override
	public int getTournamentDirectorTournamentCount() {
		return getContactOpal().getTournamentDirectorTournamentOpalCount();
	}

	@Override
	public java.util.stream.Stream<Tournament> streamTournamentDirectorTournament() {
		return getContactOpal().streamTournamentDirectorTournamentOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<Tournament> createTournamentDirectorTournamentIterator() {
		return new com.opal.OpalIterator<> (getContactOpal().createTournamentDirectorTournamentOpalIterator());
	}

	@Override
	public void clearTournamentDirectorTournament() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addPlayer(Player argPlayer) {
		getContactOpal().addPlayerOpal(((PlayerImpl) argPlayer).getPlayerOpal());
	}

	@Override
	public void removePlayer(Player argPlayer) {
		getContactOpal().removePlayerOpal(((PlayerImpl) argPlayer).getPlayerOpal());
	}

	@Override
	public int getPlayerCount() {
		return getContactOpal().getPlayerOpalCount();
	}

	@Override
	public java.util.stream.Stream<Player> streamPlayer() {
		return getContactOpal().streamPlayerOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<Player> createPlayerIterator() {
		return new com.opal.OpalIterator<> (getContactOpal().createPlayerOpalIterator());
	}

	@Override
	public void clearPlayer() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addMainSchoolRegistration(SchoolRegistration argSchoolRegistration) {
		getContactOpal().addMainSchoolRegistrationOpal(((SchoolRegistrationImpl) argSchoolRegistration).getSchoolRegistrationOpal());
	}

	@Override
	public void removeMainSchoolRegistration(SchoolRegistration argSchoolRegistration) {
		getContactOpal().removeMainSchoolRegistrationOpal(((SchoolRegistrationImpl) argSchoolRegistration).getSchoolRegistrationOpal());
	}

	@Override
	public int getMainSchoolRegistrationCount() {
		return getContactOpal().getMainSchoolRegistrationOpalCount();
	}

	@Override
	public java.util.stream.Stream<SchoolRegistration> streamMainSchoolRegistration() {
		return getContactOpal().streamMainSchoolRegistrationOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<SchoolRegistration> createMainSchoolRegistrationIterator() {
		return new com.opal.OpalIterator<> (getContactOpal().createMainSchoolRegistrationOpalIterator());
	}

	@Override
	public void clearMainSchoolRegistration() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addStaff(Staff argStaff) {
		getContactOpal().addStaffOpal(((StaffImpl) argStaff).getStaffOpal());
	}

	@Override
	public void removeStaff(Staff argStaff) {
		getContactOpal().removeStaffOpal(((StaffImpl) argStaff).getStaffOpal());
	}

	@Override
	public int getStaffCount() {
		return getContactOpal().getStaffOpalCount();
	}

	@Override
	public java.util.stream.Stream<Staff> streamStaff() {
		return getContactOpal().streamStaffOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<Staff> createStaffIterator() {
		return new com.opal.OpalIterator<> (getContactOpal().createStaffOpalIterator());
	}

	@Override
	public void clearStaff() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void unlink() {
		getContactOpal().unlink();
	}

	@Override
	public void reload() {
		getContactOpal().reload();
	}

	@Override
	public Contact copy() {
		return getContactOpal().copy().getUserFacing();
	}

}
