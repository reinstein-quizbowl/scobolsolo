package com.scobolsolo.application;

import com.scobolsolo.persistence.StaffOpal;
import com.scobolsolo.persistence.ContactOpal;
import com.scobolsolo.persistence.SchoolRegistrationOpal;
import com.scobolsolo.persistence.TournamentOpal;
import com.scobolsolo.persistence.TechnologyChoiceOpal;

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

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getIdAsObject() {
		return getStaffOpal().getIdAsObject();
	}

	@com.opal.annotation.Nullability(nullable = false)
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

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getContactIdAsObject() {
		return getStaffOpal().getContactIdAsObject();
	}

	@com.opal.annotation.Nullability(nullable = false)
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

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getTournamentCode() {
		return getStaffOpal().getTournamentCode();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public StaffImpl setTournamentCode(java.lang.String argTournamentCode) {
		getStaffOpal().setTournamentCode(argTournamentCode);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getSchoolRegistrationIdAsObject() {
		return getStaffOpal().getSchoolRegistrationIdAsObject();
	}

	@com.opal.annotation.Nullability(nullable = true)
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

	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public java.lang.String getNote() {
		return getStaffOpal().getNote();
	}

	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public StaffImpl setNote(java.lang.String argNote) {
		getStaffOpal().setNote(argNote);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@com.opal.annotation.Default(value = "TBD")
	@Override
	public java.lang.String getTechnologyChoiceCode() {
		return getStaffOpal().getTechnologyChoiceCode();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@com.opal.annotation.Default(value = "TBD")
	@Override
	public StaffImpl setTechnologyChoiceCode(java.lang.String argTechnologyChoiceCode) {
		getStaffOpal().setTechnologyChoiceCode(argTechnologyChoiceCode);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the Contact object created from staff through reference staff_contact_id_fkey */

	@com.opal.annotation.Nullability(nullable = false)
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

	@com.opal.annotation.Nullability(nullable = true)
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

	@com.opal.annotation.Nullability(nullable = false)
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

	/** @return the TechnologyChoice object created from staff through reference staff_technology_choice_code_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public TechnologyChoice getTechnologyChoice() {
		TechnologyChoiceOpal lclTechnologyChoiceOpal = getStaffOpal().getTechnologyChoiceOpal();
		return lclTechnologyChoiceOpal == null ? null : lclTechnologyChoiceOpal.getUserFacing();
	}

	@Override
	public Staff setTechnologyChoice(TechnologyChoice argTechnologyChoice) {
		getStaffOpal().setTechnologyChoiceOpal(argTechnologyChoice == null ? null : ((TechnologyChoiceImpl) argTechnologyChoice).getTechnologyChoiceOpal());
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
	public com.scobolsolo.application.Staff addScorekeeperGame(Game argGame) {
		getStaffOpal().addScorekeeperGameOpal(((GameImpl) argGame).getGameOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Staff removeScorekeeperGame(Game argGame) {
		getStaffOpal().removeScorekeeperGameOpal(((GameImpl) argGame).getGameOpal());
		return this;
	}

	@Override
	public int getScorekeeperGameCount() {
		return getStaffOpal().getScorekeeperGameOpalCount();
	}

	@Override
	public java.util.stream.Stream<Game> streamScorekeeperGame() {
		return getStaffOpal().streamScorekeeperGameOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<Game> createScorekeeperGameIterator() {
		return new com.opal.OpalIterator<> (getStaffOpal().createScorekeeperGameOpalIterator());
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
