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
	public com.scobolsolo.persistence.SchoolRegistrationOpal getOpal() {
		return getSchoolRegistrationOpal();
	}

	@Override
	public com.scobolsolo.persistence.SchoolRegistrationOpal getBottomOpal() {
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
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.SchoolRegistration setMainContact(com.scobolsolo.application.Contact argContact) {
		getSchoolRegistrationOpal().setMainContactOpal(argContact == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.Contact, com.scobolsolo.persistence.ContactOpal>) argContact).getOpal());
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
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.SchoolRegistration setSchool(com.scobolsolo.application.School argSchool) {
		getSchoolRegistrationOpal().setSchoolOpal(argSchool == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.School, com.scobolsolo.persistence.SchoolOpal>) argSchool).getOpal());
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
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.SchoolRegistration setTournament(com.scobolsolo.application.Tournament argTournament) {
		getSchoolRegistrationOpal().setTournamentOpal(argTournament == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.Tournament, com.scobolsolo.persistence.TournamentOpal>) argTournament).getOpal());
		return this;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public java.util.Set<com.scobolsolo.application.StandbyEntry> getStandbyEntrySet() {
		return new com.opal.UserFacingBackCollectionSet<>(getSchoolRegistrationOpal().getStandbyEntryOpalSet());
	}

	@Override
	public java.util.Set<com.scobolsolo.application.Player> getPlayerSet() {
		return new com.opal.UserFacingBackCollectionSet<>(getSchoolRegistrationOpal().getPlayerOpalSet());
	}

	@Override
	public java.util.Set<com.scobolsolo.application.Buzzer> getBuzzerSet() {
		return new com.opal.UserFacingBackCollectionSet<>(getSchoolRegistrationOpal().getBuzzerOpalSet());
	}

	@Override
	public java.util.Set<com.scobolsolo.application.WaitlistEntry> getWaitlistEntrySet() {
		return new com.opal.UserFacingBackCollectionSet<>(getSchoolRegistrationOpal().getWaitlistEntryOpalSet());
	}

	@Override
	public java.util.Set<com.scobolsolo.application.Staff> getStaffSet() {
		return new com.opal.UserFacingBackCollectionSet<>(getSchoolRegistrationOpal().getStaffOpalSet());
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
