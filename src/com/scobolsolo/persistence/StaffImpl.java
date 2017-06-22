package com.scobolsolo.persistence;


public class StaffImpl extends com.opal.AbstractIdentityImpl<com.scobolsolo.application.Staff, com.scobolsolo.persistence.StaffOpal> implements com.scobolsolo.application.Staff {

	private final com.scobolsolo.persistence.StaffOpal myStaffOpal;

	public StaffImpl(StaffOpal argStaffOpal) {
		super();
		myStaffOpal = org.apache.commons.lang3.Validate.notNull(argStaffOpal);
	}

	protected com.scobolsolo.persistence.StaffOpal getStaffOpal() {
		return myStaffOpal;
	}

	@Override
	protected com.opal.IdentityOpal<? extends com.scobolsolo.application.Staff> getOpal() {
		return getStaffOpal();
	}

	@Override
	protected com.opal.IdentityOpal<? extends com.scobolsolo.application.Staff> getBottomOpal() {
		return getStaffOpal();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getIdAsObject() {
		return getStaffOpal().getIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.StaffImpl setId(java.lang.Integer argId) {
		getStaffOpal().setId(argId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.StaffImpl setId(int argId) {
		getStaffOpal().setId(argId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getContactIdAsObject() {
		return getStaffOpal().getContactIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.StaffImpl setContactId(java.lang.Integer argContactId) {
		getStaffOpal().setContactId(argContactId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.StaffImpl setContactId(int argContactId) {
		getStaffOpal().setContactId(argContactId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getTournamentCode() {
		return getStaffOpal().getTournamentCode();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public com.scobolsolo.persistence.StaffImpl setTournamentCode(java.lang.String argTournamentCode) {
		getStaffOpal().setTournamentCode(argTournamentCode);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getSchoolRegistrationIdAsObject() {
		return getStaffOpal().getSchoolRegistrationIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.persistence.StaffImpl setSchoolRegistrationId(java.lang.Integer argSchoolRegistrationId) {
		getStaffOpal().setSchoolRegistrationId(argSchoolRegistrationId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.StaffImpl setSchoolRegistrationId(int argSchoolRegistrationId) {
		getStaffOpal().setSchoolRegistrationId(argSchoolRegistrationId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public java.lang.String getNote() {
		return getStaffOpal().getNote();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public com.scobolsolo.persistence.StaffImpl setNote(java.lang.String argNote) {
		getStaffOpal().setNote(argNote);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@com.opal.annotation.Default(value = "TBD")
	@Override
	public java.lang.String getTechnologyChoiceCode() {
		return getStaffOpal().getTechnologyChoiceCode();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@com.opal.annotation.Default(value = "TBD")
	@Override
	public com.scobolsolo.persistence.StaffImpl setTechnologyChoiceCode(java.lang.String argTechnologyChoiceCode) {
		getStaffOpal().setTechnologyChoiceCode(argTechnologyChoiceCode);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the Contact object created from staff through reference staff_contact_id_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.Contact getContact() {
		ContactOpal lclContactOpal = getStaffOpal().getContactOpal();
		return lclContactOpal == null ? null : lclContactOpal.getUserFacing();
	}

	@Override
	public com.scobolsolo.application.Staff setContact(com.scobolsolo.application.Contact argContact) {
		getStaffOpal().setContactOpal(argContact == null ? null : ((ContactImpl) argContact).getContactOpal());
		return this;
	}

	/** @return the SchoolRegistration object created from staff through reference staff_school_registration_id_fkey */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.application.SchoolRegistration getSchoolRegistration() {
		SchoolRegistrationOpal lclSchoolRegistrationOpal = getStaffOpal().getSchoolRegistrationOpal();
		return lclSchoolRegistrationOpal == null ? null : lclSchoolRegistrationOpal.getUserFacing();
	}

	@Override
	public com.scobolsolo.application.Staff setSchoolRegistration(com.scobolsolo.application.SchoolRegistration argSchoolRegistration) {
		getStaffOpal().setSchoolRegistrationOpal(argSchoolRegistration == null ? null : ((SchoolRegistrationImpl) argSchoolRegistration).getSchoolRegistrationOpal());
		return this;
	}

	/** @return the TechnologyChoice object created from staff through reference staff_technology_choice_code_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.TechnologyChoice getTechnologyChoice() {
		TechnologyChoiceOpal lclTechnologyChoiceOpal = getStaffOpal().getTechnologyChoiceOpal();
		return lclTechnologyChoiceOpal == null ? null : lclTechnologyChoiceOpal.getUserFacing();
	}

	@Override
	public com.scobolsolo.application.Staff setTechnologyChoice(com.scobolsolo.application.TechnologyChoice argTechnologyChoice) {
		getStaffOpal().setTechnologyChoiceOpal(argTechnologyChoice == null ? null : ((TechnologyChoiceImpl) argTechnologyChoice).getTechnologyChoiceOpal());
		return this;
	}

	/** @return the Tournament object created from staff through reference staff_tournament_code_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.Tournament getTournament() {
		TournamentOpal lclTournamentOpal = getStaffOpal().getTournamentOpal();
		return lclTournamentOpal == null ? null : lclTournamentOpal.getUserFacing();
	}

	@Override
	public com.scobolsolo.application.Staff setTournament(com.scobolsolo.application.Tournament argTournament) {
		getStaffOpal().setTournamentOpal(argTournament == null ? null : ((TournamentImpl) argTournament).getTournamentOpal());
		return this;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public com.scobolsolo.application.Staff addModeratorGame(com.scobolsolo.application.Game argGame) {
		getStaffOpal().addModeratorGameOpal(((GameImpl) argGame).getGameOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Staff removeModeratorGame(com.scobolsolo.application.Game argGame) {
		getStaffOpal().removeModeratorGameOpal(((GameImpl) argGame).getGameOpal());
		return this;
	}

	@Override
	public int getModeratorGameCount() {
		return getStaffOpal().getModeratorGameOpalCount();
	}

	@Override
	public java.util.stream.Stream<com.scobolsolo.application.Game> streamModeratorGame() {
		return getStaffOpal().streamModeratorGameOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<com.scobolsolo.application.Game> createModeratorGameIterator() {
		return new com.opal.OpalIterator<> (getStaffOpal().createModeratorGameOpalIterator());
	}

	@Override
	public com.scobolsolo.application.Staff addScorekeeperGame(com.scobolsolo.application.Game argGame) {
		getStaffOpal().addScorekeeperGameOpal(((GameImpl) argGame).getGameOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Staff removeScorekeeperGame(com.scobolsolo.application.Game argGame) {
		getStaffOpal().removeScorekeeperGameOpal(((GameImpl) argGame).getGameOpal());
		return this;
	}

	@Override
	public int getScorekeeperGameCount() {
		return getStaffOpal().getScorekeeperGameOpalCount();
	}

	@Override
	public java.util.stream.Stream<com.scobolsolo.application.Game> streamScorekeeperGame() {
		return getStaffOpal().streamScorekeeperGameOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<com.scobolsolo.application.Game> createScorekeeperGameIterator() {
		return new com.opal.OpalIterator<> (getStaffOpal().createScorekeeperGameOpalIterator());
	}

	@Override
	public com.scobolsolo.application.Staff addStaffAssignment(com.scobolsolo.application.StaffAssignment argStaffAssignment) {
		getStaffOpal().addStaffAssignmentOpal(((StaffAssignmentImpl) argStaffAssignment).getStaffAssignmentOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Staff removeStaffAssignment(com.scobolsolo.application.StaffAssignment argStaffAssignment) {
		getStaffOpal().removeStaffAssignmentOpal(((StaffAssignmentImpl) argStaffAssignment).getStaffAssignmentOpal());
		return this;
	}

	@Override
	public int getStaffAssignmentCount() {
		return getStaffOpal().getStaffAssignmentOpalCount();
	}

	@Override
	public java.util.stream.Stream<com.scobolsolo.application.StaffAssignment> streamStaffAssignment() {
		return getStaffOpal().streamStaffAssignmentOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<com.scobolsolo.application.StaffAssignment> createStaffAssignmentIterator() {
		return new com.opal.OpalIterator<> (getStaffOpal().createStaffAssignmentOpalIterator());
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
	public com.scobolsolo.application.Staff copy() {
		return getStaffOpal().copy().getUserFacing();
	}

}
