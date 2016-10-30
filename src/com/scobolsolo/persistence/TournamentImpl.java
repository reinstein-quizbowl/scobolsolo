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
	protected com.opal.IdentityOpal<? extends com.scobolsolo.application.Tournament> getOpal() {
		return getTournamentOpal();
	}

	@Override
	protected com.opal.IdentityOpal<? extends com.scobolsolo.application.Tournament> getBottomOpal() {
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
	public java.lang.Boolean isTiebreakerSuddenDeathAsObject() {
		return getTournamentOpal().isTiebreakerSuddenDeathAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "true")
	@Override
	public com.scobolsolo.persistence.TournamentImpl setTiebreakerSuddenDeath(java.lang.Boolean argTiebreakerSuddenDeath) {
		getTournamentOpal().setTiebreakerSuddenDeath(argTiebreakerSuddenDeath);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.TournamentImpl setTiebreakerSuddenDeath(boolean argTiebreakerSuddenDeath) {
		getTournamentOpal().setTiebreakerSuddenDeath(argTiebreakerSuddenDeath);
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
	public com.scobolsolo.application.Tournament setControlRoom(com.scobolsolo.application.Room argRoom) {
		getTournamentOpal().setControlRoomOpal(argRoom == null ? null : ((RoomImpl) argRoom).getRoomOpal());
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
	public com.scobolsolo.application.Tournament setTournamentDirectorContact(com.scobolsolo.application.Contact argContact) {
		getTournamentOpal().setTournamentDirectorContactOpal(argContact == null ? null : ((ContactImpl) argContact).getContactOpal());
		return this;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public com.scobolsolo.application.Tournament addPhase(com.scobolsolo.application.Phase argPhase) {
		getTournamentOpal().addPhaseOpal(((PhaseImpl) argPhase).getPhaseOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Tournament removePhase(com.scobolsolo.application.Phase argPhase) {
		getTournamentOpal().removePhaseOpal(((PhaseImpl) argPhase).getPhaseOpal());
		return this;
	}

	@Override
	public int getPhaseCount() {
		return getTournamentOpal().getPhaseOpalCount();
	}

	@Override
	public java.util.stream.Stream<com.scobolsolo.application.Phase> streamPhase() {
		return getTournamentOpal().streamPhaseOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<com.scobolsolo.application.Phase> createPhaseIterator() {
		return new com.opal.OpalIterator<> (getTournamentOpal().createPhaseOpalIterator());
	}

	@Override
	public com.scobolsolo.application.Tournament addSchoolRegistration(com.scobolsolo.application.SchoolRegistration argSchoolRegistration) {
		getTournamentOpal().addSchoolRegistrationOpal(((SchoolRegistrationImpl) argSchoolRegistration).getSchoolRegistrationOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Tournament removeSchoolRegistration(com.scobolsolo.application.SchoolRegistration argSchoolRegistration) {
		getTournamentOpal().removeSchoolRegistrationOpal(((SchoolRegistrationImpl) argSchoolRegistration).getSchoolRegistrationOpal());
		return this;
	}

	@Override
	public int getSchoolRegistrationCount() {
		return getTournamentOpal().getSchoolRegistrationOpalCount();
	}

	@Override
	public java.util.stream.Stream<com.scobolsolo.application.SchoolRegistration> streamSchoolRegistration() {
		return getTournamentOpal().streamSchoolRegistrationOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<com.scobolsolo.application.SchoolRegistration> createSchoolRegistrationIterator() {
		return new com.opal.OpalIterator<> (getTournamentOpal().createSchoolRegistrationOpalIterator());
	}

	@Override
	public com.scobolsolo.application.Tournament addStaff(com.scobolsolo.application.Staff argStaff) {
		getTournamentOpal().addStaffOpal(((StaffImpl) argStaff).getStaffOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Tournament removeStaff(com.scobolsolo.application.Staff argStaff) {
		getTournamentOpal().removeStaffOpal(((StaffImpl) argStaff).getStaffOpal());
		return this;
	}

	@Override
	public int getStaffCount() {
		return getTournamentOpal().getStaffOpalCount();
	}

	@Override
	public java.util.stream.Stream<com.scobolsolo.application.Staff> streamStaff() {
		return getTournamentOpal().streamStaffOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<com.scobolsolo.application.Staff> createStaffIterator() {
		return new com.opal.OpalIterator<> (getTournamentOpal().createStaffOpalIterator());
	}

	@Override
	public com.scobolsolo.application.Tournament addCategoryUse(com.scobolsolo.application.CategoryUse argCategoryUse) {
		getTournamentOpal().addCategoryUseOpal(((CategoryUseImpl) argCategoryUse).getCategoryUseOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Tournament removeCategoryUse(com.scobolsolo.application.CategoryUse argCategoryUse) {
		getTournamentOpal().removeCategoryUseOpal(((CategoryUseImpl) argCategoryUse).getCategoryUseOpal());
		return this;
	}

	@Override
	public int getCategoryUseCount() {
		return getTournamentOpal().getCategoryUseOpalCount();
	}

	@Override
	public java.util.stream.Stream<com.scobolsolo.application.CategoryUse> streamCategoryUse() {
		return getTournamentOpal().streamCategoryUseOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<com.scobolsolo.application.CategoryUse> createCategoryUseIterator() {
		return new com.opal.OpalIterator<> (getTournamentOpal().createCategoryUseOpalIterator());
	}

	@Override
	public com.scobolsolo.application.Tournament addPacket(com.scobolsolo.application.Packet argPacket) {
		getTournamentOpal().addPacketOpal(((PacketImpl) argPacket).getPacketOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Tournament removePacket(com.scobolsolo.application.Packet argPacket) {
		getTournamentOpal().removePacketOpal(((PacketImpl) argPacket).getPacketOpal());
		return this;
	}

	@Override
	public int getPacketCount() {
		return getTournamentOpal().getPacketOpalCount();
	}

	@Override
	public java.util.stream.Stream<com.scobolsolo.application.Packet> streamPacket() {
		return getTournamentOpal().streamPacketOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<com.scobolsolo.application.Packet> createPacketIterator() {
		return new com.opal.OpalIterator<> (getTournamentOpal().createPacketOpalIterator());
	}

	@Override
	public com.scobolsolo.application.Tournament addRoom(com.scobolsolo.application.Room argRoom) {
		getTournamentOpal().addRoomOpal(((RoomImpl) argRoom).getRoomOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Tournament removeRoom(com.scobolsolo.application.Room argRoom) {
		getTournamentOpal().removeRoomOpal(((RoomImpl) argRoom).getRoomOpal());
		return this;
	}

	@Override
	public int getRoomCount() {
		return getTournamentOpal().getRoomOpalCount();
	}

	@Override
	public java.util.stream.Stream<com.scobolsolo.application.Room> streamRoom() {
		return getTournamentOpal().streamRoomOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<com.scobolsolo.application.Room> createRoomIterator() {
		return new com.opal.OpalIterator<> (getTournamentOpal().createRoomOpalIterator());
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
