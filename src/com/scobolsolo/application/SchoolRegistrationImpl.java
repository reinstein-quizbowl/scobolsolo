package com.scobolsolo.application;

import com.scobolsolo.persistence.SchoolRegistrationOpal;
import com.scobolsolo.persistence.ContactOpal;
import com.scobolsolo.persistence.SchoolOpal;
import com.scobolsolo.persistence.TournamentOpal;

public class SchoolRegistrationImpl extends com.opal.AbstractIdentityImpl<SchoolRegistration, SchoolRegistrationOpal> implements SchoolRegistration {

	private final SchoolRegistrationOpal mySchoolRegistrationOpal;

	public SchoolRegistrationImpl(SchoolRegistrationOpal argSchoolRegistrationOpal) {
		super();
		mySchoolRegistrationOpal = org.apache.commons.lang3.Validate.notNull(argSchoolRegistrationOpal);
	}

	protected SchoolRegistrationOpal getSchoolRegistrationOpal() {
		return mySchoolRegistrationOpal;
	}

	@Override
	protected com.opal.IdentityOpal<? extends SchoolRegistration> getOpal() {
		return getSchoolRegistrationOpal();
	}

	@Override
	protected com.opal.IdentityOpal<? extends SchoolRegistration> getBottomOpal() {
		return getSchoolRegistrationOpal();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getIdAsObject() {
		return getSchoolRegistrationOpal().getIdAsObject();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public SchoolRegistrationImpl setId(java.lang.Integer argId) {
		getSchoolRegistrationOpal().setId(argId);
		return this;
	}

	@Override
	public SchoolRegistrationImpl setId(int argId) {
		getSchoolRegistrationOpal().setId(argId);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getSchoolIdAsObject() {
		return getSchoolRegistrationOpal().getSchoolIdAsObject();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public SchoolRegistrationImpl setSchoolId(java.lang.Integer argSchoolId) {
		getSchoolRegistrationOpal().setSchoolId(argSchoolId);
		return this;
	}

	@Override
	public SchoolRegistrationImpl setSchoolId(int argSchoolId) {
		getSchoolRegistrationOpal().setSchoolId(argSchoolId);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getMainContactIdAsObject() {
		return getSchoolRegistrationOpal().getMainContactIdAsObject();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public SchoolRegistrationImpl setMainContactId(java.lang.Integer argMainContactId) {
		getSchoolRegistrationOpal().setMainContactId(argMainContactId);
		return this;
	}

	@Override
	public SchoolRegistrationImpl setMainContactId(int argMainContactId) {
		getSchoolRegistrationOpal().setMainContactId(argMainContactId);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "0.0")
	@Override
	public java.math.BigDecimal getAmountOwed() {
		return getSchoolRegistrationOpal().getAmountOwed();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "0.0")
	@Override
	public SchoolRegistrationImpl setAmountOwed(java.math.BigDecimal argAmountOwed) {
		getSchoolRegistrationOpal().setAmountOwed(argAmountOwed);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "0.0")
	@Override
	public java.math.BigDecimal getAmountPaid() {
		return getSchoolRegistrationOpal().getAmountPaid();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "0.0")
	@Override
	public SchoolRegistrationImpl setAmountPaid(java.math.BigDecimal argAmountPaid) {
		getSchoolRegistrationOpal().setAmountPaid(argAmountPaid);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public java.lang.String getNote() {
		return getSchoolRegistrationOpal().getNote();
	}

	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public SchoolRegistrationImpl setNote(java.lang.String argNote) {
		getSchoolRegistrationOpal().setNote(argNote);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getSpotsReservedAsObject() {
		return getSchoolRegistrationOpal().getSpotsReservedAsObject();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public SchoolRegistrationImpl setSpotsReserved(java.lang.Integer argSpotsReserved) {
		getSchoolRegistrationOpal().setSpotsReserved(argSpotsReserved);
		return this;
	}

	@Override
	public SchoolRegistrationImpl setSpotsReserved(int argSpotsReserved) {
		getSchoolRegistrationOpal().setSpotsReserved(argSpotsReserved);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getTournamentCode() {
		return getSchoolRegistrationOpal().getTournamentCode();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public SchoolRegistrationImpl setTournamentCode(java.lang.String argTournamentCode) {
		getSchoolRegistrationOpal().setTournamentCode(argTournamentCode);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the Contact object created from school_registration through reference registration_main_contact_id_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public Contact getMainContact() {
		ContactOpal lclContactOpal = getSchoolRegistrationOpal().getMainContactOpal();
		return lclContactOpal == null ? null : lclContactOpal.getUserFacing();
	}

	@Override
	public SchoolRegistration setMainContact(Contact argContact) {
		getSchoolRegistrationOpal().setMainContactOpal(argContact == null ? null : ((ContactImpl) argContact).getContactOpal());
		return this;
	}

	/** @return the School object created from school_registration through reference registration_school_id_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public School getSchool() {
		SchoolOpal lclSchoolOpal = getSchoolRegistrationOpal().getSchoolOpal();
		return lclSchoolOpal == null ? null : lclSchoolOpal.getUserFacing();
	}

	@Override
	public SchoolRegistration setSchool(School argSchool) {
		getSchoolRegistrationOpal().setSchoolOpal(argSchool == null ? null : ((SchoolImpl) argSchool).getSchoolOpal());
		return this;
	}

	/** @return the Tournament object created from school_registration through reference school_registration_tournament_code_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public Tournament getTournament() {
		TournamentOpal lclTournamentOpal = getSchoolRegistrationOpal().getTournamentOpal();
		return lclTournamentOpal == null ? null : lclTournamentOpal.getUserFacing();
	}

	@Override
	public SchoolRegistration setTournament(Tournament argTournament) {
		getSchoolRegistrationOpal().setTournamentOpal(argTournament == null ? null : ((TournamentImpl) argTournament).getTournamentOpal());
		return this;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public com.scobolsolo.application.SchoolRegistration addStandbyEntry(StandbyEntry argStandbyEntry) {
		getSchoolRegistrationOpal().addStandbyEntryOpal(((StandbyEntryImpl) argStandbyEntry).getStandbyEntryOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.SchoolRegistration removeStandbyEntry(StandbyEntry argStandbyEntry) {
		getSchoolRegistrationOpal().removeStandbyEntryOpal(((StandbyEntryImpl) argStandbyEntry).getStandbyEntryOpal());
		return this;
	}

	@Override
	public int getStandbyEntryCount() {
		return getSchoolRegistrationOpal().getStandbyEntryOpalCount();
	}

	@Override
	public java.util.stream.Stream<StandbyEntry> streamStandbyEntry() {
		return getSchoolRegistrationOpal().streamStandbyEntryOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<StandbyEntry> createStandbyEntryIterator() {
		return new com.opal.OpalIterator<> (getSchoolRegistrationOpal().createStandbyEntryOpalIterator());
	}

	@Override
	public com.scobolsolo.application.SchoolRegistration addPlayer(Player argPlayer) {
		getSchoolRegistrationOpal().addPlayerOpal(((PlayerImpl) argPlayer).getPlayerOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.SchoolRegistration removePlayer(Player argPlayer) {
		getSchoolRegistrationOpal().removePlayerOpal(((PlayerImpl) argPlayer).getPlayerOpal());
		return this;
	}

	@Override
	public int getPlayerCount() {
		return getSchoolRegistrationOpal().getPlayerOpalCount();
	}

	@Override
	public java.util.stream.Stream<Player> streamPlayer() {
		return getSchoolRegistrationOpal().streamPlayerOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<Player> createPlayerIterator() {
		return new com.opal.OpalIterator<> (getSchoolRegistrationOpal().createPlayerOpalIterator());
	}

	@Override
	public com.scobolsolo.application.SchoolRegistration addBuzzer(Buzzer argBuzzer) {
		getSchoolRegistrationOpal().addBuzzerOpal(((BuzzerImpl) argBuzzer).getBuzzerOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.SchoolRegistration removeBuzzer(Buzzer argBuzzer) {
		getSchoolRegistrationOpal().removeBuzzerOpal(((BuzzerImpl) argBuzzer).getBuzzerOpal());
		return this;
	}

	@Override
	public int getBuzzerCount() {
		return getSchoolRegistrationOpal().getBuzzerOpalCount();
	}

	@Override
	public java.util.stream.Stream<Buzzer> streamBuzzer() {
		return getSchoolRegistrationOpal().streamBuzzerOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<Buzzer> createBuzzerIterator() {
		return new com.opal.OpalIterator<> (getSchoolRegistrationOpal().createBuzzerOpalIterator());
	}

	@Override
	public com.scobolsolo.application.SchoolRegistration addWaitlistEntry(WaitlistEntry argWaitlistEntry) {
		getSchoolRegistrationOpal().addWaitlistEntryOpal(((WaitlistEntryImpl) argWaitlistEntry).getWaitlistEntryOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.SchoolRegistration removeWaitlistEntry(WaitlistEntry argWaitlistEntry) {
		getSchoolRegistrationOpal().removeWaitlistEntryOpal(((WaitlistEntryImpl) argWaitlistEntry).getWaitlistEntryOpal());
		return this;
	}

	@Override
	public int getWaitlistEntryCount() {
		return getSchoolRegistrationOpal().getWaitlistEntryOpalCount();
	}

	@Override
	public java.util.stream.Stream<WaitlistEntry> streamWaitlistEntry() {
		return getSchoolRegistrationOpal().streamWaitlistEntryOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<WaitlistEntry> createWaitlistEntryIterator() {
		return new com.opal.OpalIterator<> (getSchoolRegistrationOpal().createWaitlistEntryOpalIterator());
	}

	@Override
	public com.scobolsolo.application.SchoolRegistration addStaff(Staff argStaff) {
		getSchoolRegistrationOpal().addStaffOpal(((StaffImpl) argStaff).getStaffOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.SchoolRegistration removeStaff(Staff argStaff) {
		getSchoolRegistrationOpal().removeStaffOpal(((StaffImpl) argStaff).getStaffOpal());
		return this;
	}

	@Override
	public int getStaffCount() {
		return getSchoolRegistrationOpal().getStaffOpalCount();
	}

	@Override
	public java.util.stream.Stream<Staff> streamStaff() {
		return getSchoolRegistrationOpal().streamStaffOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<Staff> createStaffIterator() {
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
	public SchoolRegistration copy() {
		return getSchoolRegistrationOpal().copy().getUserFacing();
	}

}
