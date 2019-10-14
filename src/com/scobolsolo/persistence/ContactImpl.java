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
	public com.scobolsolo.persistence.ContactOpal getOpal() {
		return getContactOpal();
	}

	@Override
	public com.scobolsolo.persistence.ContactOpal getBottomOpal() {
		return getContactOpal();
	}

	@Override
	public int compareTo(com.scobolsolo.application.Contact argSecond) {
		return this.getSortBy().compareToIgnoreCase(argSecond.getSortBy());
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
	public java.util.Set<com.scobolsolo.application.Tournament> getTournamentDirectorTournamentSet() {
		return new com.opal.UserFacingBackCollectionSet<>(getContactOpal().getTournamentDirectorTournamentOpalSet());
	}

	@Override
	public java.util.Set<com.scobolsolo.application.Player> getPlayerSet() {
		return new com.opal.UserFacingBackCollectionSet<>(getContactOpal().getPlayerOpalSet());
	}

	@Override
	public java.util.Set<com.scobolsolo.application.SchoolRegistration> getMainSchoolRegistrationSet() {
		return new com.opal.UserFacingBackCollectionSet<>(getContactOpal().getMainSchoolRegistrationOpalSet());
	}

	@Override
	public java.util.Set<com.scobolsolo.application.Staff> getStaffSet() {
		return new com.opal.UserFacingBackCollectionSet<>(getContactOpal().getStaffOpalSet());
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
