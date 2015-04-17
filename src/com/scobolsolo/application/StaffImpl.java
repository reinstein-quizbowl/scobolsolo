package com.scobolsolo.application;

import com.opal.Opal;
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
	protected com.opal.IdentityOpal<? extends Staff> getBottomOpal() {
		return getStaffOpal();
	}

	@Override
	protected Opal<? super Staff>[] getOpalArray() {
		return (Opal<? super Staff>[]) new Opal<?>[] {
			getStaffOpal(),
		};
	}

	@Override
	public java.lang.Integer getIdAsObject() {
		return getStaffOpal().getIdAsObject();
	}

	@Override
	public void setId(java.lang.Integer argId) {
		getStaffOpal().setId(argId);
		return;
	}

	@Override
	public void setId(int argId) {
		getStaffOpal().setId(argId);
		return;
	}

	@Override
	public java.lang.Integer getContactIdAsObject() {
		return getStaffOpal().getContactIdAsObject();
	}

	@Override
	public void setContactId(java.lang.Integer argContactId) {
		getStaffOpal().setContactId(argContactId);
		return;
	}

	@Override
	public void setContactId(int argContactId) {
		getStaffOpal().setContactId(argContactId);
		return;
	}

	@Override
	public java.lang.String getTournamentCode() {
		return getStaffOpal().getTournamentCode();
	}

	@Override
	public void setTournamentCode(java.lang.String argTournamentCode) {
		getStaffOpal().setTournamentCode(argTournamentCode);
		return;
	}

	@Override
	public java.lang.Integer getSchoolRegistrationIdAsObject() {
		return getStaffOpal().getSchoolRegistrationIdAsObject();
	}

	@Override
	public void setSchoolRegistrationId(java.lang.Integer argSchoolRegistrationId) {
		getStaffOpal().setSchoolRegistrationId(argSchoolRegistrationId);
		return;
	}

	@Override
	public void setSchoolRegistrationId(int argSchoolRegistrationId) {
		getStaffOpal().setSchoolRegistrationId(argSchoolRegistrationId);
		return;
	}

	@Override
	public java.lang.String getNote() {
		return getStaffOpal().getNote();
	}

	@Override
	public void setNote(java.lang.String argNote) {
		getStaffOpal().setNote(argNote);
		return;
	}

	@Override
	public java.lang.Boolean isBringingLaptopAsObject() {
		return getStaffOpal().isBringingLaptopAsObject();
	}

	@Override
	public void setBringingLaptop(java.lang.Boolean argBringingLaptop) {
		getStaffOpal().setBringingLaptop(argBringingLaptop);
		return;
	}

	@Override
	public void setBringingLaptop(boolean argBringingLaptop) {
		getStaffOpal().setBringingLaptop(argBringingLaptop);
		return;
	}

	/* The following methods allow direct access to the user objects for which
	this object has foreign keys in the database. */

	/** Access to the Contact object created from the table staff through foreign key staff_contact_id_fkey */

	@Override
	public Contact getContact() {
		ContactOpal lclContactOpal = getStaffOpal().getContactOpal();
		return lclContactOpal == null ? null : lclContactOpal.getUserFacing();
	}

	@Override
	public void setContact(Contact argContact) {
		getStaffOpal().setContactOpal(argContact == null ? null : ((ContactImpl) argContact).getContactOpal());
		return;
	}

	/** Access to the SchoolRegistration object created from the table staff through foreign key staff_school_registration_id_fkey */

	@Override
	public SchoolRegistration getSchoolRegistration() {
		SchoolRegistrationOpal lclSchoolRegistrationOpal = getStaffOpal().getSchoolRegistrationOpal();
		return lclSchoolRegistrationOpal == null ? null : lclSchoolRegistrationOpal.getUserFacing();
	}

	@Override
	public void setSchoolRegistration(SchoolRegistration argSchoolRegistration) {
		getStaffOpal().setSchoolRegistrationOpal(argSchoolRegistration == null ? null : ((SchoolRegistrationImpl) argSchoolRegistration).getSchoolRegistrationOpal());
		return;
	}

	/** Access to the Tournament object created from the table staff through foreign key staff_tournament_code_fkey */

	@Override
	public Tournament getTournament() {
		TournamentOpal lclTournamentOpal = getStaffOpal().getTournamentOpal();
		return lclTournamentOpal == null ? null : lclTournamentOpal.getUserFacing();
	}

	@Override
	public void setTournament(Tournament argTournament) {
		getStaffOpal().setTournamentOpal(argTournament == null ? null : ((TournamentImpl) argTournament).getTournamentOpal());
		return;
	}

	/* The following methods allow access to the user objects that have foreign keys
	to this object. */

	@Override
	public void addModeratorGame(Game argGame) {
		getStaffOpal().addModeratorGameOpal(((GameImpl) argGame).getGameOpal());
	}

	@Override
	public void removeModeratorGame(Game argGame) {
		getStaffOpal().removeModeratorGameOpal(((GameImpl) argGame).getGameOpal());
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
	public void clearModeratorGame() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addStaffAssignment(StaffAssignment argStaffAssignment) {
		getStaffOpal().addStaffAssignmentOpal(((StaffAssignmentImpl) argStaffAssignment).getStaffAssignmentOpal());
	}

	@Override
	public void removeStaffAssignment(StaffAssignment argStaffAssignment) {
		getStaffOpal().removeStaffAssignmentOpal(((StaffAssignmentImpl) argStaffAssignment).getStaffAssignmentOpal());
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
	public void clearStaffAssignment() {
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
