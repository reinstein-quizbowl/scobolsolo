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

	@Override
	public java.lang.Integer getIdAsObject() {
		return getSchoolRegistrationOpal().getIdAsObject();
	}

	@Override
	public void setId(java.lang.Integer argId) {
		getSchoolRegistrationOpal().setId(argId);
		return;
	}

	@Override
	public void setId(int argId) {
		getSchoolRegistrationOpal().setId(argId);
		return;
	}

	@Override
	public java.lang.Integer getSchoolIdAsObject() {
		return getSchoolRegistrationOpal().getSchoolIdAsObject();
	}

	@Override
	public void setSchoolId(java.lang.Integer argSchoolId) {
		getSchoolRegistrationOpal().setSchoolId(argSchoolId);
		return;
	}

	@Override
	public void setSchoolId(int argSchoolId) {
		getSchoolRegistrationOpal().setSchoolId(argSchoolId);
		return;
	}

	@Override
	public java.lang.Integer getMainContactIdAsObject() {
		return getSchoolRegistrationOpal().getMainContactIdAsObject();
	}

	@Override
	public void setMainContactId(java.lang.Integer argMainContactId) {
		getSchoolRegistrationOpal().setMainContactId(argMainContactId);
		return;
	}

	@Override
	public void setMainContactId(int argMainContactId) {
		getSchoolRegistrationOpal().setMainContactId(argMainContactId);
		return;
	}

	@Override
	public java.math.BigDecimal getAmountOwed() {
		return getSchoolRegistrationOpal().getAmountOwed();
	}

	@Override
	public void setAmountOwed(java.math.BigDecimal argAmountOwed) {
		getSchoolRegistrationOpal().setAmountOwed(argAmountOwed);
		return;
	}

	@Override
	public java.math.BigDecimal getAmountPaid() {
		return getSchoolRegistrationOpal().getAmountPaid();
	}

	@Override
	public void setAmountPaid(java.math.BigDecimal argAmountPaid) {
		getSchoolRegistrationOpal().setAmountPaid(argAmountPaid);
		return;
	}

	@Override
	public java.lang.String getNote() {
		return getSchoolRegistrationOpal().getNote();
	}

	@Override
	public void setNote(java.lang.String argNote) {
		getSchoolRegistrationOpal().setNote(argNote);
		return;
	}

	@Override
	public java.lang.Integer getSpotsReservedAsObject() {
		return getSchoolRegistrationOpal().getSpotsReservedAsObject();
	}

	@Override
	public void setSpotsReserved(java.lang.Integer argSpotsReserved) {
		getSchoolRegistrationOpal().setSpotsReserved(argSpotsReserved);
		return;
	}

	@Override
	public void setSpotsReserved(int argSpotsReserved) {
		getSchoolRegistrationOpal().setSpotsReserved(argSpotsReserved);
		return;
	}

	@Override
	public java.lang.String getTournamentCode() {
		return getSchoolRegistrationOpal().getTournamentCode();
	}

	@Override
	public void setTournamentCode(java.lang.String argTournamentCode) {
		getSchoolRegistrationOpal().setTournamentCode(argTournamentCode);
		return;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** Access to the Contact object created from school_registration through reference registration_main_contact_id_fkey */

	@Override
	public Contact getMainContact() {
		ContactOpal lclContactOpal = getSchoolRegistrationOpal().getMainContactOpal();
		return lclContactOpal == null ? null : lclContactOpal.getUserFacing();
	}

	@Override
	public void setMainContact(Contact argContact) {
		getSchoolRegistrationOpal().setMainContactOpal(argContact == null ? null : ((ContactImpl) argContact).getContactOpal());
		return;
	}

	/** Access to the School object created from school_registration through reference registration_school_id_fkey */

	@Override
	public School getSchool() {
		SchoolOpal lclSchoolOpal = getSchoolRegistrationOpal().getSchoolOpal();
		return lclSchoolOpal == null ? null : lclSchoolOpal.getUserFacing();
	}

	@Override
	public void setSchool(School argSchool) {
		getSchoolRegistrationOpal().setSchoolOpal(argSchool == null ? null : ((SchoolImpl) argSchool).getSchoolOpal());
		return;
	}

	/** Access to the Tournament object created from school_registration through reference school_registration_tournament_code_fkey */

	@Override
	public Tournament getTournament() {
		TournamentOpal lclTournamentOpal = getSchoolRegistrationOpal().getTournamentOpal();
		return lclTournamentOpal == null ? null : lclTournamentOpal.getUserFacing();
	}

	@Override
	public void setTournament(Tournament argTournament) {
		getSchoolRegistrationOpal().setTournamentOpal(argTournament == null ? null : ((TournamentImpl) argTournament).getTournamentOpal());
		return;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public void addStandbyEntry(StandbyEntry argStandbyEntry) {
		getSchoolRegistrationOpal().addStandbyEntryOpal(((StandbyEntryImpl) argStandbyEntry).getStandbyEntryOpal());
	}

	@Override
	public void removeStandbyEntry(StandbyEntry argStandbyEntry) {
		getSchoolRegistrationOpal().removeStandbyEntryOpal(((StandbyEntryImpl) argStandbyEntry).getStandbyEntryOpal());
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
	public void clearStandbyEntry() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addPlayer(Player argPlayer) {
		getSchoolRegistrationOpal().addPlayerOpal(((PlayerImpl) argPlayer).getPlayerOpal());
	}

	@Override
	public void removePlayer(Player argPlayer) {
		getSchoolRegistrationOpal().removePlayerOpal(((PlayerImpl) argPlayer).getPlayerOpal());
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
	public void clearPlayer() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addBuzzer(Buzzer argBuzzer) {
		getSchoolRegistrationOpal().addBuzzerOpal(((BuzzerImpl) argBuzzer).getBuzzerOpal());
	}

	@Override
	public void removeBuzzer(Buzzer argBuzzer) {
		getSchoolRegistrationOpal().removeBuzzerOpal(((BuzzerImpl) argBuzzer).getBuzzerOpal());
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
	public void clearBuzzer() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addWaitlistEntry(WaitlistEntry argWaitlistEntry) {
		getSchoolRegistrationOpal().addWaitlistEntryOpal(((WaitlistEntryImpl) argWaitlistEntry).getWaitlistEntryOpal());
	}

	@Override
	public void removeWaitlistEntry(WaitlistEntry argWaitlistEntry) {
		getSchoolRegistrationOpal().removeWaitlistEntryOpal(((WaitlistEntryImpl) argWaitlistEntry).getWaitlistEntryOpal());
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
	public void clearWaitlistEntry() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addStaff(Staff argStaff) {
		getSchoolRegistrationOpal().addStaffOpal(((StaffImpl) argStaff).getStaffOpal());
	}

	@Override
	public void removeStaff(Staff argStaff) {
		getSchoolRegistrationOpal().removeStaffOpal(((StaffImpl) argStaff).getStaffOpal());
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
	public void clearStaff() {
		throw new UnsupportedOperationException();
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
