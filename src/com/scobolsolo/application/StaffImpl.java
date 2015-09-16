package com.scobolsolo.application;

import com.scobolsolo.persistence.StaffOpal;
import com.scobolsolo.persistence.ContactOpal;
import com.scobolsolo.persistence.SchoolRegistrationOpal;
import com.scobolsolo.persistence.TournamentOpal;

public class StaffImpl extends com.opal.AbstractIdentityImpl<Staff, StaffOpal> implements Staff {
	private final StaffOpal myStaffOpal;

	public StaffImpl(StaffOpal argStaffOpal) {
		super();
		myStaffOpal = org.apache.commons.lang3.Validate.notNull(argStaffOpal);
	}

	protected StaffOpal getStaffOpal() {
		return myStaffOpal;
	}

	@Override
	protected com.opal.IdentityOpal<? extends Staff> getOpal() {
		return getStaffOpal();
	}

	@Override
	protected com.opal.IdentityOpal<? extends Staff> getBottomOpal() {
		return getStaffOpal();
	}

	@Override
	public java.lang.Integer getIdAsObject() {
		return getStaffOpal().getIdAsObject();
	}

	@Override
	public StaffImpl setId(java.lang.Integer argId) {
		getStaffOpal().setId(argId);
		return this;
	}

	@Override
	public StaffImpl setId(int argId) {
		getStaffOpal().setId(argId);
		return this;
	}

	@Override
	public java.lang.Integer getContactIdAsObject() {
		return getStaffOpal().getContactIdAsObject();
	}

	@Override
	public StaffImpl setContactId(java.lang.Integer argContactId) {
		getStaffOpal().setContactId(argContactId);
		return this;
	}

	@Override
	public StaffImpl setContactId(int argContactId) {
		getStaffOpal().setContactId(argContactId);
		return this;
	}

	@Override
	public java.lang.String getTournamentCode() {
		return getStaffOpal().getTournamentCode();
	}

	@Override
	public StaffImpl setTournamentCode(java.lang.String argTournamentCode) {
		getStaffOpal().setTournamentCode(argTournamentCode);
		return this;
	}

	@Override
	public java.lang.Integer getSchoolRegistrationIdAsObject() {
		return getStaffOpal().getSchoolRegistrationIdAsObject();
	}

	@Override
	public StaffImpl setSchoolRegistrationId(java.lang.Integer argSchoolRegistrationId) {
		getStaffOpal().setSchoolRegistrationId(argSchoolRegistrationId);
		return this;
	}

	@Override
	public StaffImpl setSchoolRegistrationId(int argSchoolRegistrationId) {
		getStaffOpal().setSchoolRegistrationId(argSchoolRegistrationId);
		return this;
	}

	@Override
	public java.lang.String getNote() {
		return getStaffOpal().getNote();
	}

	@Override
	public StaffImpl setNote(java.lang.String argNote) {
		getStaffOpal().setNote(argNote);
		return this;
	}

	@Override
	public java.lang.Boolean isBringingLaptopAsObject() {
		return getStaffOpal().isBringingLaptopAsObject();
	}

	@Override
	public StaffImpl setBringingLaptop(java.lang.Boolean argBringingLaptop) {
		getStaffOpal().setBringingLaptop(argBringingLaptop);
		return this;
	}

	@Override
	public StaffImpl setBringingLaptop(boolean argBringingLaptop) {
		getStaffOpal().setBringingLaptop(argBringingLaptop);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the Contact object created from staff through reference staff_contact_id_fkey */

	@Override
	public Contact getContact() {
		ContactOpal lclContactOpal = getStaffOpal().getContactOpal();
		return lclContactOpal == null ? null : lclContactOpal.getUserFacing();
	}

	@Override
	public Staff setContact(Contact argContact) {
		getStaffOpal().setContactOpal(argContact == null ? null : ((ContactImpl) argContact).getContactOpal());
		return this;
	}

	/** @return the SchoolRegistration object created from staff through reference staff_school_registration_id_fkey */

	@Override
	public SchoolRegistration getSchoolRegistration() {
		SchoolRegistrationOpal lclSchoolRegistrationOpal = getStaffOpal().getSchoolRegistrationOpal();
		return lclSchoolRegistrationOpal == null ? null : lclSchoolRegistrationOpal.getUserFacing();
	}

	@Override
	public Staff setSchoolRegistration(SchoolRegistration argSchoolRegistration) {
		getStaffOpal().setSchoolRegistrationOpal(argSchoolRegistration == null ? null : ((SchoolRegistrationImpl) argSchoolRegistration).getSchoolRegistrationOpal());
		return this;
	}

	/** @return the Tournament object created from staff through reference staff_tournament_code_fkey */

	@Override
	public Tournament getTournament() {
		TournamentOpal lclTournamentOpal = getStaffOpal().getTournamentOpal();
		return lclTournamentOpal == null ? null : lclTournamentOpal.getUserFacing();
	}

	@Override
	public Staff setTournament(Tournament argTournament) {
		getStaffOpal().setTournamentOpal(argTournament == null ? null : ((TournamentImpl) argTournament).getTournamentOpal());
		return this;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public com.scobolsolo.application.Staff addModeratorGame(Game argGame) {
		getStaffOpal().addModeratorGameOpal(((GameImpl) argGame).getGameOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Staff removeModeratorGame(Game argGame) {
		getStaffOpal().removeModeratorGameOpal(((GameImpl) argGame).getGameOpal());
		return this;
	}

	@Override
	public int getModeratorGameCount() {
		return getStaffOpal().getModeratorGameOpalCount();
	}

	@Override
	public java.util.stream.Stream<Game> streamModeratorGame() {
		return getStaffOpal().streamModeratorGameOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<Game> createModeratorGameIterator() {
		return new com.opal.OpalIterator<> (getStaffOpal().createModeratorGameOpalIterator());
	}

	@Override
	public com.scobolsolo.application.Staff clearModeratorGame() {
		throw new UnsupportedOperationException();
	}

	@Override
	public com.scobolsolo.application.Staff addStaffAssignment(StaffAssignment argStaffAssignment) {
		getStaffOpal().addStaffAssignmentOpal(((StaffAssignmentImpl) argStaffAssignment).getStaffAssignmentOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Staff removeStaffAssignment(StaffAssignment argStaffAssignment) {
		getStaffOpal().removeStaffAssignmentOpal(((StaffAssignmentImpl) argStaffAssignment).getStaffAssignmentOpal());
		return this;
	}

	@Override
	public int getStaffAssignmentCount() {
		return getStaffOpal().getStaffAssignmentOpalCount();
	}

	@Override
	public java.util.stream.Stream<StaffAssignment> streamStaffAssignment() {
		return getStaffOpal().streamStaffAssignmentOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<StaffAssignment> createStaffAssignmentIterator() {
		return new com.opal.OpalIterator<> (getStaffOpal().createStaffAssignmentOpalIterator());
	}

	@Override
	public com.scobolsolo.application.Staff clearStaffAssignment() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void unlink() {
		getStaffOpal().unlink();
	}

	@Override
	public void reload() {
		getStaffOpal().reload();
	}

	@Override
	public Staff copy() {
		return getStaffOpal().copy().getUserFacing();
	}

}
