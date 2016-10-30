package com.scobolsolo.persistence;


public class SchoolRegistrationImpl extends com.opal.AbstractIdentityImpl<com.scobolsolo.application.SchoolRegistration, com.scobolsolo.persistence.SchoolRegistrationOpal> implements com.scobolsolo.application.SchoolRegistration {

	private final com.scobolsolo.persistence.SchoolRegistrationOpal mySchoolRegistrationOpal;

	public SchoolRegistrationImpl(SchoolRegistrationOpal argSchoolRegistrationOpal) {
		super();
		mySchoolRegistrationOpal = org.apache.commons.lang3.Validate.notNull(argSchoolRegistrationOpal);
	}

	protected com.scobolsolo.persistence.SchoolRegistrationOpal getSchoolRegistrationOpal() {
		return mySchoolRegistrationOpal;
	}

	@Override
	protected com.opal.IdentityOpal<? extends com.scobolsolo.application.SchoolRegistration> getOpal() {
		return getSchoolRegistrationOpal();
	}

	@Override
	protected com.opal.IdentityOpal<? extends com.scobolsolo.application.SchoolRegistration> getBottomOpal() {
		return getSchoolRegistrationOpal();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getIdAsObject() {
		return getSchoolRegistrationOpal().getIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.SchoolRegistrationImpl setId(java.lang.Integer argId) {
		getSchoolRegistrationOpal().setId(argId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.SchoolRegistrationImpl setId(int argId) {
		getSchoolRegistrationOpal().setId(argId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getSchoolIdAsObject() {
		return getSchoolRegistrationOpal().getSchoolIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.SchoolRegistrationImpl setSchoolId(java.lang.Integer argSchoolId) {
		getSchoolRegistrationOpal().setSchoolId(argSchoolId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.SchoolRegistrationImpl setSchoolId(int argSchoolId) {
		getSchoolRegistrationOpal().setSchoolId(argSchoolId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getMainContactIdAsObject() {
		return getSchoolRegistrationOpal().getMainContactIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.SchoolRegistrationImpl setMainContactId(java.lang.Integer argMainContactId) {
		getSchoolRegistrationOpal().setMainContactId(argMainContactId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.SchoolRegistrationImpl setMainContactId(int argMainContactId) {
		getSchoolRegistrationOpal().setMainContactId(argMainContactId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "0.0")
	@Override
	public java.math.BigDecimal getAmountOwed() {
		return getSchoolRegistrationOpal().getAmountOwed();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "0.0")
	@Override
	public com.scobolsolo.persistence.SchoolRegistrationImpl setAmountOwed(java.math.BigDecimal argAmountOwed) {
		getSchoolRegistrationOpal().setAmountOwed(argAmountOwed);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "0.0")
	@Override
	public java.math.BigDecimal getAmountPaid() {
		return getSchoolRegistrationOpal().getAmountPaid();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "0.0")
	@Override
	public com.scobolsolo.persistence.SchoolRegistrationImpl setAmountPaid(java.math.BigDecimal argAmountPaid) {
		getSchoolRegistrationOpal().setAmountPaid(argAmountPaid);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public java.lang.String getNote() {
		return getSchoolRegistrationOpal().getNote();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public com.scobolsolo.persistence.SchoolRegistrationImpl setNote(java.lang.String argNote) {
		getSchoolRegistrationOpal().setNote(argNote);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getSpotsReservedAsObject() {
		return getSchoolRegistrationOpal().getSpotsReservedAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.SchoolRegistrationImpl setSpotsReserved(java.lang.Integer argSpotsReserved) {
		getSchoolRegistrationOpal().setSpotsReserved(argSpotsReserved);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.SchoolRegistrationImpl setSpotsReserved(int argSpotsReserved) {
		getSchoolRegistrationOpal().setSpotsReserved(argSpotsReserved);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getTournamentCode() {
		return getSchoolRegistrationOpal().getTournamentCode();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public com.scobolsolo.persistence.SchoolRegistrationImpl setTournamentCode(java.lang.String argTournamentCode) {
		getSchoolRegistrationOpal().setTournamentCode(argTournamentCode);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the Contact object created from school_registration through reference registration_main_contact_id_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.Contact getMainContact() {
		ContactOpal lclContactOpal = getSchoolRegistrationOpal().getMainContactOpal();
		return lclContactOpal == null ? null : lclContactOpal.getUserFacing();
	}

	@Override
	public com.scobolsolo.application.SchoolRegistration setMainContact(com.scobolsolo.application.Contact argContact) {
		getSchoolRegistrationOpal().setMainContactOpal(argContact == null ? null : ((ContactImpl) argContact).getContactOpal());
		return this;
	}

	/** @return the School object created from school_registration through reference registration_school_id_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.School getSchool() {
		SchoolOpal lclSchoolOpal = getSchoolRegistrationOpal().getSchoolOpal();
		return lclSchoolOpal == null ? null : lclSchoolOpal.getUserFacing();
	}

	@Override
	public com.scobolsolo.application.SchoolRegistration setSchool(com.scobolsolo.application.School argSchool) {
		getSchoolRegistrationOpal().setSchoolOpal(argSchool == null ? null : ((SchoolImpl) argSchool).getSchoolOpal());
		return this;
	}

	/** @return the Tournament object created from school_registration through reference school_registration_tournament_code_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.Tournament getTournament() {
		TournamentOpal lclTournamentOpal = getSchoolRegistrationOpal().getTournamentOpal();
		return lclTournamentOpal == null ? null : lclTournamentOpal.getUserFacing();
	}

	@Override
	public com.scobolsolo.application.SchoolRegistration setTournament(com.scobolsolo.application.Tournament argTournament) {
		getSchoolRegistrationOpal().setTournamentOpal(argTournament == null ? null : ((TournamentImpl) argTournament).getTournamentOpal());
		return this;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public com.scobolsolo.application.SchoolRegistration addStandbyEntry(com.scobolsolo.application.StandbyEntry argStandbyEntry) {
		getSchoolRegistrationOpal().addStandbyEntryOpal(((StandbyEntryImpl) argStandbyEntry).getStandbyEntryOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.SchoolRegistration removeStandbyEntry(com.scobolsolo.application.StandbyEntry argStandbyEntry) {
		getSchoolRegistrationOpal().removeStandbyEntryOpal(((StandbyEntryImpl) argStandbyEntry).getStandbyEntryOpal());
		return this;
	}

	@Override
	public int getStandbyEntryCount() {
		return getSchoolRegistrationOpal().getStandbyEntryOpalCount();
	}

	@Override
	public java.util.stream.Stream<com.scobolsolo.application.StandbyEntry> streamStandbyEntry() {
		return getSchoolRegistrationOpal().streamStandbyEntryOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<com.scobolsolo.application.StandbyEntry> createStandbyEntryIterator() {
		return new com.opal.OpalIterator<> (getSchoolRegistrationOpal().createStandbyEntryOpalIterator());
	}

	@Override
	public com.scobolsolo.application.SchoolRegistration addPlayer(com.scobolsolo.application.Player argPlayer) {
		getSchoolRegistrationOpal().addPlayerOpal(((PlayerImpl) argPlayer).getPlayerOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.SchoolRegistration removePlayer(com.scobolsolo.application.Player argPlayer) {
		getSchoolRegistrationOpal().removePlayerOpal(((PlayerImpl) argPlayer).getPlayerOpal());
		return this;
	}

	@Override
	public int getPlayerCount() {
		return getSchoolRegistrationOpal().getPlayerOpalCount();
	}

	@Override
	public java.util.stream.Stream<com.scobolsolo.application.Player> streamPlayer() {
		return getSchoolRegistrationOpal().streamPlayerOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<com.scobolsolo.application.Player> createPlayerIterator() {
		return new com.opal.OpalIterator<> (getSchoolRegistrationOpal().createPlayerOpalIterator());
	}

	@Override
	public com.scobolsolo.application.SchoolRegistration addBuzzer(com.scobolsolo.application.Buzzer argBuzzer) {
		getSchoolRegistrationOpal().addBuzzerOpal(((BuzzerImpl) argBuzzer).getBuzzerOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.SchoolRegistration removeBuzzer(com.scobolsolo.application.Buzzer argBuzzer) {
		getSchoolRegistrationOpal().removeBuzzerOpal(((BuzzerImpl) argBuzzer).getBuzzerOpal());
		return this;
	}

	@Override
	public int getBuzzerCount() {
		return getSchoolRegistrationOpal().getBuzzerOpalCount();
	}

	@Override
	public java.util.stream.Stream<com.scobolsolo.application.Buzzer> streamBuzzer() {
		return getSchoolRegistrationOpal().streamBuzzerOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<com.scobolsolo.application.Buzzer> createBuzzerIterator() {
		return new com.opal.OpalIterator<> (getSchoolRegistrationOpal().createBuzzerOpalIterator());
	}

	@Override
	public com.scobolsolo.application.SchoolRegistration addWaitlistEntry(com.scobolsolo.application.WaitlistEntry argWaitlistEntry) {
		getSchoolRegistrationOpal().addWaitlistEntryOpal(((WaitlistEntryImpl) argWaitlistEntry).getWaitlistEntryOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.SchoolRegistration removeWaitlistEntry(com.scobolsolo.application.WaitlistEntry argWaitlistEntry) {
		getSchoolRegistrationOpal().removeWaitlistEntryOpal(((WaitlistEntryImpl) argWaitlistEntry).getWaitlistEntryOpal());
		return this;
	}

	@Override
	public int getWaitlistEntryCount() {
		return getSchoolRegistrationOpal().getWaitlistEntryOpalCount();
	}

	@Override
	public java.util.stream.Stream<com.scobolsolo.application.WaitlistEntry> streamWaitlistEntry() {
		return getSchoolRegistrationOpal().streamWaitlistEntryOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<com.scobolsolo.application.WaitlistEntry> createWaitlistEntryIterator() {
		return new com.opal.OpalIterator<> (getSchoolRegistrationOpal().createWaitlistEntryOpalIterator());
	}

	@Override
	public com.scobolsolo.application.SchoolRegistration addStaff(com.scobolsolo.application.Staff argStaff) {
		getSchoolRegistrationOpal().addStaffOpal(((StaffImpl) argStaff).getStaffOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.SchoolRegistration removeStaff(com.scobolsolo.application.Staff argStaff) {
		getSchoolRegistrationOpal().removeStaffOpal(((StaffImpl) argStaff).getStaffOpal());
		return this;
	}

	@Override
	public int getStaffCount() {
		return getSchoolRegistrationOpal().getStaffOpalCount();
	}

	@Override
	public java.util.stream.Stream<com.scobolsolo.application.Staff> streamStaff() {
		return getSchoolRegistrationOpal().streamStaffOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<com.scobolsolo.application.Staff> createStaffIterator() {
		return new com.opal.OpalIterator<> (getSchoolRegistrationOpal().createStaffOpalIterator());
	}

	@Override
	public void unlink() {
		getSchoolRegistrationOpal().unlink();
	}

	@Override
	public void reload() {
		getSchoolRegistrationOpal().reload();
	}

	@Override
	public com.scobolsolo.application.SchoolRegistration copy() {
		return getSchoolRegistrationOpal().copy().getUserFacing();
	}

}
