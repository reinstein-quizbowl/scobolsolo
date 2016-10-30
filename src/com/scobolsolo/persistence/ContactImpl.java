package com.scobolsolo.persistence;


public class ContactImpl extends com.opal.AbstractIdentityImpl<com.scobolsolo.application.Contact, com.scobolsolo.persistence.ContactOpal> implements com.scobolsolo.application.Contact {

	private final com.scobolsolo.persistence.ContactOpal myContactOpal;

	public ContactImpl(ContactOpal argContactOpal) {
		super();
		myContactOpal = org.apache.commons.lang3.Validate.notNull(argContactOpal);
	}

	protected com.scobolsolo.persistence.ContactOpal getContactOpal() {
		return myContactOpal;
	}

	@Override
	protected com.opal.IdentityOpal<? extends com.scobolsolo.application.Contact> getOpal() {
		return getContactOpal();
	}

	@Override
	protected com.opal.IdentityOpal<? extends com.scobolsolo.application.Contact> getBottomOpal() {
		return getContactOpal();
	}

	@Override
	public int compareTo(com.scobolsolo.application.Contact argSecond) {
		return this.getSortBy().compareTo(argSecond.getSortBy());
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getIdAsObject() {
		return getContactOpal().getIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.ContactImpl setId(java.lang.Integer argId) {
		getContactOpal().setId(argId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.ContactImpl setId(int argId) {
		getContactOpal().setId(argId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public java.lang.String getEmailAddress() {
		return getContactOpal().getEmailAddress();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public com.scobolsolo.persistence.ContactImpl setEmailAddress(java.lang.String argEmailAddress) {
		getContactOpal().setEmailAddress(argEmailAddress);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getAdvancePhone() {
		return getContactOpal().getAdvancePhone();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public com.scobolsolo.persistence.ContactImpl setAdvancePhone(java.lang.String argAdvancePhone) {
		getContactOpal().setAdvancePhone(argAdvancePhone);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getDayOfPhone() {
		return getContactOpal().getDayOfPhone();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public com.scobolsolo.persistence.ContactImpl setDayOfPhone(java.lang.String argDayOfPhone) {
		getContactOpal().setDayOfPhone(argDayOfPhone);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public java.lang.String getNote() {
		return getContactOpal().getNote();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public com.scobolsolo.persistence.ContactImpl setNote(java.lang.String argNote) {
		getContactOpal().setNote(argNote);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public java.lang.String getName() {
		return getContactOpal().getName();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public com.scobolsolo.persistence.ContactImpl setName(java.lang.String argName) {
		getContactOpal().setName(argName);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public java.lang.String getSortBy() {
		return getContactOpal().getSortBy();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public com.scobolsolo.persistence.ContactImpl setSortBy(java.lang.String argSortBy) {
		getContactOpal().setSortBy(argSortBy);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	@Override
	public java.lang.Boolean isActiveAsObject() {
		return getContactOpal().isActiveAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	@Override
	public com.scobolsolo.persistence.ContactImpl setActive(java.lang.Boolean argActive) {
		getContactOpal().setActive(argActive);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.ContactImpl setActive(boolean argActive) {
		getContactOpal().setActive(argActive);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public java.lang.String getAddress() {
		return getContactOpal().getAddress();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public com.scobolsolo.persistence.ContactImpl setAddress(java.lang.String argAddress) {
		getContactOpal().setAddress(argAddress);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	@Override
	public com.scobolsolo.application.Account getAccount() {
		AccountOpal lclO = getContactOpal().getAccountOpal();
		return lclO == null ? null : lclO.getUserFacing();
	}

	@Override
	public com.scobolsolo.application.Contact setAccount(com.scobolsolo.application.Account argAccount) {
		getContactOpal().setAccountOpal(argAccount == null ? null : ((AccountImpl) argAccount).getAccountOpal());
		return this;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public com.scobolsolo.application.Contact addTournamentDirectorTournament(com.scobolsolo.application.Tournament argTournament) {
		getContactOpal().addTournamentDirectorTournamentOpal(((TournamentImpl) argTournament).getTournamentOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Contact removeTournamentDirectorTournament(com.scobolsolo.application.Tournament argTournament) {
		getContactOpal().removeTournamentDirectorTournamentOpal(((TournamentImpl) argTournament).getTournamentOpal());
		return this;
	}

	@Override
	public int getTournamentDirectorTournamentCount() {
		return getContactOpal().getTournamentDirectorTournamentOpalCount();
	}

	@Override
	public java.util.stream.Stream<com.scobolsolo.application.Tournament> streamTournamentDirectorTournament() {
		return getContactOpal().streamTournamentDirectorTournamentOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<com.scobolsolo.application.Tournament> createTournamentDirectorTournamentIterator() {
		return new com.opal.OpalIterator<> (getContactOpal().createTournamentDirectorTournamentOpalIterator());
	}

	@Override
	public com.scobolsolo.application.Contact addPlayer(com.scobolsolo.application.Player argPlayer) {
		getContactOpal().addPlayerOpal(((PlayerImpl) argPlayer).getPlayerOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Contact removePlayer(com.scobolsolo.application.Player argPlayer) {
		getContactOpal().removePlayerOpal(((PlayerImpl) argPlayer).getPlayerOpal());
		return this;
	}

	@Override
	public int getPlayerCount() {
		return getContactOpal().getPlayerOpalCount();
	}

	@Override
	public java.util.stream.Stream<com.scobolsolo.application.Player> streamPlayer() {
		return getContactOpal().streamPlayerOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<com.scobolsolo.application.Player> createPlayerIterator() {
		return new com.opal.OpalIterator<> (getContactOpal().createPlayerOpalIterator());
	}

	@Override
	public com.scobolsolo.application.Contact addMainSchoolRegistration(com.scobolsolo.application.SchoolRegistration argSchoolRegistration) {
		getContactOpal().addMainSchoolRegistrationOpal(((SchoolRegistrationImpl) argSchoolRegistration).getSchoolRegistrationOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Contact removeMainSchoolRegistration(com.scobolsolo.application.SchoolRegistration argSchoolRegistration) {
		getContactOpal().removeMainSchoolRegistrationOpal(((SchoolRegistrationImpl) argSchoolRegistration).getSchoolRegistrationOpal());
		return this;
	}

	@Override
	public int getMainSchoolRegistrationCount() {
		return getContactOpal().getMainSchoolRegistrationOpalCount();
	}

	@Override
	public java.util.stream.Stream<com.scobolsolo.application.SchoolRegistration> streamMainSchoolRegistration() {
		return getContactOpal().streamMainSchoolRegistrationOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<com.scobolsolo.application.SchoolRegistration> createMainSchoolRegistrationIterator() {
		return new com.opal.OpalIterator<> (getContactOpal().createMainSchoolRegistrationOpalIterator());
	}

	@Override
	public com.scobolsolo.application.Contact addStaff(com.scobolsolo.application.Staff argStaff) {
		getContactOpal().addStaffOpal(((StaffImpl) argStaff).getStaffOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Contact removeStaff(com.scobolsolo.application.Staff argStaff) {
		getContactOpal().removeStaffOpal(((StaffImpl) argStaff).getStaffOpal());
		return this;
	}

	@Override
	public int getStaffCount() {
		return getContactOpal().getStaffOpalCount();
	}

	@Override
	public java.util.stream.Stream<com.scobolsolo.application.Staff> streamStaff() {
		return getContactOpal().streamStaffOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<com.scobolsolo.application.Staff> createStaffIterator() {
		return new com.opal.OpalIterator<> (getContactOpal().createStaffOpalIterator());
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
	public com.scobolsolo.application.Contact copy() {
		return getContactOpal().copy().getUserFacing();
	}

}
