package com.scobolsolo.persistence;

public class TournamentImpl extends com.opal.AbstractIdentityImpl<com.scobolsolo.application.Tournament, com.scobolsolo.persistence.TournamentOpal> implements com.scobolsolo.application.Tournament {

	private final com.scobolsolo.persistence.TournamentOpal myTournamentOpal;

	public TournamentImpl(TournamentOpal argTournamentOpal) {
		super();
		myTournamentOpal = org.apache.commons.lang3.Validate.notNull(argTournamentOpal);
	}

	protected com.scobolsolo.persistence.TournamentOpal getTournamentOpal() {
		return myTournamentOpal;
	}

	@Override
	public com.scobolsolo.persistence.TournamentOpal getOpal() {
		return getTournamentOpal();
	}

	@Override
	public com.scobolsolo.persistence.TournamentOpal getBottomOpal() {
		return getTournamentOpal();
	}

	@Override
	public int compareTo(com.scobolsolo.application.Tournament argSecond) {
		return this.getDate().compareTo(argSecond.getDate());
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.time.LocalDate getDate() {
		return getTournamentOpal().getDate();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.TournamentImpl setDate(java.time.LocalDate argDate) {
		getTournamentOpal().setDate(argDate);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public java.lang.String getName() {
		return getTournamentOpal().getName();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public com.scobolsolo.persistence.TournamentImpl setName(java.lang.String argName) {
		getTournamentOpal().setName(argName);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getShortName() {
		return getTournamentOpal().getShortName();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public com.scobolsolo.persistence.TournamentImpl setShortName(java.lang.String argShortName) {
		getTournamentOpal().setShortName(argShortName);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getCode() {
		return getTournamentOpal().getCode();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public com.scobolsolo.persistence.TournamentImpl setCode(java.lang.String argCode) {
		getTournamentOpal().setCode(argCode);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getWebXmlRoleCode() {
		return getTournamentOpal().getWebXmlRoleCode();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public com.scobolsolo.persistence.TournamentImpl setWebXmlRoleCode(java.lang.String argWebXmlRoleCode) {
		getTournamentOpal().setWebXmlRoleCode(argWebXmlRoleCode);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	@Override
	public java.lang.Boolean isOvertimeSuddenDeathAsObject() {
		return getTournamentOpal().isOvertimeSuddenDeathAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	@Override
	public com.scobolsolo.persistence.TournamentImpl setOvertimeSuddenDeath(java.lang.Boolean argOvertimeSuddenDeath) {
		getTournamentOpal().setOvertimeSuddenDeath(argOvertimeSuddenDeath);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.TournamentImpl setOvertimeSuddenDeath(boolean argOvertimeSuddenDeath) {
		getTournamentOpal().setOvertimeSuddenDeath(argOvertimeSuddenDeath);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public java.lang.String getUrl() {
		return getTournamentOpal().getUrl();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public com.scobolsolo.persistence.TournamentImpl setUrl(java.lang.String argUrl) {
		getTournamentOpal().setUrl(argUrl);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getTournamentDirectorContactIdAsObject() {
		return getTournamentOpal().getTournamentDirectorContactIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.TournamentImpl setTournamentDirectorContactId(java.lang.Integer argTournamentDirectorContactId) {
		getTournamentOpal().setTournamentDirectorContactId(argTournamentDirectorContactId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.TournamentImpl setTournamentDirectorContactId(int argTournamentDirectorContactId) {
		getTournamentOpal().setTournamentDirectorContactId(argTournamentDirectorContactId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public java.lang.String getPlayerMessage() {
		return getTournamentOpal().getPlayerMessage();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public com.scobolsolo.persistence.TournamentImpl setPlayerMessage(java.lang.String argPlayerMessage) {
		getTournamentOpal().setPlayerMessage(argPlayerMessage);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public java.lang.String getStaffMessage() {
		return getTournamentOpal().getStaffMessage();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public com.scobolsolo.persistence.TournamentImpl setStaffMessage(java.lang.String argStaffMessage) {
		getTournamentOpal().setStaffMessage(argStaffMessage);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public java.lang.String getReplacementQuestionSocialMediaPolicy() {
		return getTournamentOpal().getReplacementQuestionSocialMediaPolicy();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public com.scobolsolo.persistence.TournamentImpl setReplacementQuestionSocialMediaPolicy(java.lang.String argReplacementQuestionSocialMediaPolicy) {
		getTournamentOpal().setReplacementQuestionSocialMediaPolicy(argReplacementQuestionSocialMediaPolicy);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public java.lang.String getSchoolMessage() {
		return getTournamentOpal().getSchoolMessage();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public com.scobolsolo.persistence.TournamentImpl setSchoolMessage(java.lang.String argSchoolMessage) {
		getTournamentOpal().setSchoolMessage(argSchoolMessage);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getControlRoomRoomIdAsObject() {
		return getTournamentOpal().getControlRoomRoomIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.persistence.TournamentImpl setControlRoomRoomId(java.lang.Integer argControlRoomRoomId) {
		getTournamentOpal().setControlRoomRoomId(argControlRoomRoomId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.TournamentImpl setControlRoomRoomId(int argControlRoomRoomId) {
		getTournamentOpal().setControlRoomRoomId(argControlRoomRoomId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public java.lang.String getChampionshipRules() {
		return getTournamentOpal().getChampionshipRules();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public com.scobolsolo.persistence.TournamentImpl setChampionshipRules(java.lang.String argChampionshipRules) {
		getTournamentOpal().setChampionshipRules(argChampionshipRules);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public java.lang.String getChampionshipMatchUrl() {
		return getTournamentOpal().getChampionshipMatchUrl();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public com.scobolsolo.persistence.TournamentImpl setChampionshipMatchUrl(java.lang.String argChampionshipMatchUrl) {
		getTournamentOpal().setChampionshipMatchUrl(argChampionshipMatchUrl);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@Override
	public java.lang.Boolean isQuestionsCompleteAsObject() {
		return getTournamentOpal().isQuestionsCompleteAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@Override
	public com.scobolsolo.persistence.TournamentImpl setQuestionsComplete(java.lang.Boolean argQuestionsComplete) {
		getTournamentOpal().setQuestionsComplete(argQuestionsComplete);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.TournamentImpl setQuestionsComplete(boolean argQuestionsComplete) {
		getTournamentOpal().setQuestionsComplete(argQuestionsComplete);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public java.lang.String getQuestionDownloadUrl() {
		return getTournamentOpal().getQuestionDownloadUrl();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public com.scobolsolo.persistence.TournamentImpl setQuestionDownloadUrl(java.lang.String argQuestionDownloadUrl) {
		getTournamentOpal().setQuestionDownloadUrl(argQuestionDownloadUrl);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	@Override
	public java.lang.Boolean isOnlineStatsAsObject() {
		return getTournamentOpal().isOnlineStatsAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	@Override
	public com.scobolsolo.persistence.TournamentImpl setOnlineStats(java.lang.Boolean argOnlineStats) {
		getTournamentOpal().setOnlineStats(argOnlineStats);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.TournamentImpl setOnlineStats(boolean argOnlineStats) {
		getTournamentOpal().setOnlineStats(argOnlineStats);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getSiteSchoolIdAsObject() {
		return getTournamentOpal().getSiteSchoolIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.TournamentImpl setSiteSchoolId(java.lang.Integer argSiteSchoolId) {
		getTournamentOpal().setSiteSchoolId(argSiteSchoolId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.TournamentImpl setSiteSchoolId(int argSiteSchoolId) {
		getTournamentOpal().setSiteSchoolId(argSiteSchoolId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@Override
	public java.lang.Boolean isRegistrationOpenAsObject() {
		return getTournamentOpal().isRegistrationOpenAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@Override
	public com.scobolsolo.persistence.TournamentImpl setRegistrationOpen(java.lang.Boolean argRegistrationOpen) {
		getTournamentOpal().setRegistrationOpen(argRegistrationOpen);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.TournamentImpl setRegistrationOpen(boolean argRegistrationOpen) {
		getTournamentOpal().setRegistrationOpen(argRegistrationOpen);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the Room object created from tournament through reference tournament_control_room_room_id_fkey */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.application.Room getControlRoom() {
		RoomOpal lclRoomOpal = getTournamentOpal().getControlRoomOpal();
		return lclRoomOpal == null ? null : lclRoomOpal.getUserFacing();
	}

	@Override
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.Tournament setControlRoom(com.scobolsolo.application.Room argRoom) {
		getTournamentOpal().setControlRoomOpal(argRoom == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.Room, com.scobolsolo.persistence.RoomOpal>) argRoom).getOpal());
		return this;
	}

	/** @return the Contact object created from tournament through reference tournament_tournament_director_contact_id_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.Contact getTournamentDirectorContact() {
		ContactOpal lclContactOpal = getTournamentOpal().getTournamentDirectorContactOpal();
		return lclContactOpal == null ? null : lclContactOpal.getUserFacing();
	}

	@Override
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.Tournament setTournamentDirectorContact(com.scobolsolo.application.Contact argContact) {
		getTournamentOpal().setTournamentDirectorContactOpal(argContact == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.Contact, com.scobolsolo.persistence.ContactOpal>) argContact).getOpal());
		return this;
	}

	/** @return the School object created from tournament through reference tournament_site_school_id_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.School getSiteSchool() {
		SchoolOpal lclSchoolOpal = getTournamentOpal().getSiteSchoolOpal();
		return lclSchoolOpal == null ? null : lclSchoolOpal.getUserFacing();
	}

	@Override
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.Tournament setSiteSchool(com.scobolsolo.application.School argSchool) {
		getTournamentOpal().setSiteSchoolOpal(argSchool == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.School, com.scobolsolo.persistence.SchoolOpal>) argSchool).getOpal());
		return this;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public java.util.Set<com.scobolsolo.application.Phase> getPhaseSet() {
		return new com.opal.UserFacingBackCollectionSet<>(getTournamentOpal().getPhaseOpalSet());
	}

	@Override
	public java.util.Set<com.scobolsolo.application.SchoolRegistration> getSchoolRegistrationSet() {
		return new com.opal.UserFacingBackCollectionSet<>(getTournamentOpal().getSchoolRegistrationOpalSet());
	}

	@Override
	public java.util.Set<com.scobolsolo.application.Staff> getStaffSet() {
		return new com.opal.UserFacingBackCollectionSet<>(getTournamentOpal().getStaffOpalSet());
	}

	@Override
	public java.util.Set<com.scobolsolo.application.CategoryUse> getCategoryUseSet() {
		return new com.opal.UserFacingBackCollectionSet<>(getTournamentOpal().getCategoryUseOpalSet());
	}

	@Override
	public java.util.Set<com.scobolsolo.application.Packet> getPacketSet() {
		return new com.opal.UserFacingBackCollectionSet<>(getTournamentOpal().getPacketOpalSet());
	}

	@Override
	public java.util.Set<com.scobolsolo.application.Room> getRoomSet() {
		return new com.opal.UserFacingBackCollectionSet<>(getTournamentOpal().getRoomOpalSet());
	}

	@Override
	public void unlink() {
		getTournamentOpal().unlink();
	}

	@Override
	public void reload() {
		getTournamentOpal().reload();
	}

	@Override
	public com.scobolsolo.application.Tournament copy() {
		return getTournamentOpal().copy().getUserFacing();
	}

}
