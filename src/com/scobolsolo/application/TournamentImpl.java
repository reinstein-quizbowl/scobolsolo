package com.scobolsolo.application;

import com.scobolsolo.persistence.TournamentOpal;
import com.scobolsolo.persistence.RoomOpal;
import com.scobolsolo.persistence.ContactOpal;

public class TournamentImpl extends com.opal.AbstractIdentityImpl<Tournament, TournamentOpal> implements Tournament {
	private final TournamentOpal myTournamentOpal;

	public TournamentImpl(TournamentOpal argTournamentOpal) {
		super();
		myTournamentOpal = org.apache.commons.lang3.Validate.notNull(argTournamentOpal);
	}

	protected TournamentOpal getTournamentOpal() {
		return myTournamentOpal;
	}

	@Override
	protected com.opal.IdentityOpal<? extends Tournament> getOpal() {
		return getTournamentOpal();
	}

	@Override
	protected com.opal.IdentityOpal<? extends Tournament> getBottomOpal() {
		return getTournamentOpal();
	}

	@Override
	public int compareTo(Tournament argSecond) {
		return this.getDate().compareTo(argSecond.getDate());
	}

	@Override
	public java.time.LocalDate getDate() {
		return getTournamentOpal().getDate();
	}

	@Override
	public TournamentImpl setDate(java.time.LocalDate argDate) {
		getTournamentOpal().setDate(argDate);
		return this;
	}

	@Override
	public java.lang.String getName() {
		return getTournamentOpal().getName();
	}

	@Override
	public TournamentImpl setName(java.lang.String argName) {
		getTournamentOpal().setName(argName);
		return this;
	}

	@Override
	public java.lang.String getShortName() {
		return getTournamentOpal().getShortName();
	}

	@Override
	public TournamentImpl setShortName(java.lang.String argShortName) {
		getTournamentOpal().setShortName(argShortName);
		return this;
	}

	@Override
	public java.lang.String getCode() {
		return getTournamentOpal().getCode();
	}

	@Override
	public TournamentImpl setCode(java.lang.String argCode) {
		getTournamentOpal().setCode(argCode);
		return this;
	}

	@Override
	public java.lang.String getWebXmlRoleCode() {
		return getTournamentOpal().getWebXmlRoleCode();
	}

	@Override
	public TournamentImpl setWebXmlRoleCode(java.lang.String argWebXmlRoleCode) {
		getTournamentOpal().setWebXmlRoleCode(argWebXmlRoleCode);
		return this;
	}

	@Override
	public java.lang.Boolean isTiebreakerSuddenDeathAsObject() {
		return getTournamentOpal().isTiebreakerSuddenDeathAsObject();
	}

	@Override
	public TournamentImpl setTiebreakerSuddenDeath(java.lang.Boolean argTiebreakerSuddenDeath) {
		getTournamentOpal().setTiebreakerSuddenDeath(argTiebreakerSuddenDeath);
		return this;
	}

	@Override
	public TournamentImpl setTiebreakerSuddenDeath(boolean argTiebreakerSuddenDeath) {
		getTournamentOpal().setTiebreakerSuddenDeath(argTiebreakerSuddenDeath);
		return this;
	}

	@Override
	public java.lang.String getUrl() {
		return getTournamentOpal().getUrl();
	}

	@Override
	public TournamentImpl setUrl(java.lang.String argUrl) {
		getTournamentOpal().setUrl(argUrl);
		return this;
	}

	@Override
	public java.lang.Integer getTournamentDirectorContactIdAsObject() {
		return getTournamentOpal().getTournamentDirectorContactIdAsObject();
	}

	@Override
	public TournamentImpl setTournamentDirectorContactId(java.lang.Integer argTournamentDirectorContactId) {
		getTournamentOpal().setTournamentDirectorContactId(argTournamentDirectorContactId);
		return this;
	}

	@Override
	public TournamentImpl setTournamentDirectorContactId(int argTournamentDirectorContactId) {
		getTournamentOpal().setTournamentDirectorContactId(argTournamentDirectorContactId);
		return this;
	}

	@Override
	public java.lang.String getPlayerMessage() {
		return getTournamentOpal().getPlayerMessage();
	}

	@Override
	public TournamentImpl setPlayerMessage(java.lang.String argPlayerMessage) {
		getTournamentOpal().setPlayerMessage(argPlayerMessage);
		return this;
	}

	@Override
	public java.lang.String getStaffMessage() {
		return getTournamentOpal().getStaffMessage();
	}

	@Override
	public TournamentImpl setStaffMessage(java.lang.String argStaffMessage) {
		getTournamentOpal().setStaffMessage(argStaffMessage);
		return this;
	}

	@Override
	public java.lang.String getReplacementQuestionSocialMediaPolicy() {
		return getTournamentOpal().getReplacementQuestionSocialMediaPolicy();
	}

	@Override
	public TournamentImpl setReplacementQuestionSocialMediaPolicy(java.lang.String argReplacementQuestionSocialMediaPolicy) {
		getTournamentOpal().setReplacementQuestionSocialMediaPolicy(argReplacementQuestionSocialMediaPolicy);
		return this;
	}

	@Override
	public java.lang.String getSchoolMessage() {
		return getTournamentOpal().getSchoolMessage();
	}

	@Override
	public TournamentImpl setSchoolMessage(java.lang.String argSchoolMessage) {
		getTournamentOpal().setSchoolMessage(argSchoolMessage);
		return this;
	}

	@Override
	public java.lang.Integer getControlRoomRoomIdAsObject() {
		return getTournamentOpal().getControlRoomRoomIdAsObject();
	}

	@Override
	public TournamentImpl setControlRoomRoomId(java.lang.Integer argControlRoomRoomId) {
		getTournamentOpal().setControlRoomRoomId(argControlRoomRoomId);
		return this;
	}

	@Override
	public TournamentImpl setControlRoomRoomId(int argControlRoomRoomId) {
		getTournamentOpal().setControlRoomRoomId(argControlRoomRoomId);
		return this;
	}

	@Override
	public java.lang.String getChampionshipRules() {
		return getTournamentOpal().getChampionshipRules();
	}

	@Override
	public TournamentImpl setChampionshipRules(java.lang.String argChampionshipRules) {
		getTournamentOpal().setChampionshipRules(argChampionshipRules);
		return this;
	}

	@Override
	public java.lang.String getChampionshipMatchUrl() {
		return getTournamentOpal().getChampionshipMatchUrl();
	}

	@Override
	public TournamentImpl setChampionshipMatchUrl(java.lang.String argChampionshipMatchUrl) {
		getTournamentOpal().setChampionshipMatchUrl(argChampionshipMatchUrl);
		return this;
	}

	@Override
	public java.lang.Boolean isQuestionsCompleteAsObject() {
		return getTournamentOpal().isQuestionsCompleteAsObject();
	}

	@Override
	public TournamentImpl setQuestionsComplete(java.lang.Boolean argQuestionsComplete) {
		getTournamentOpal().setQuestionsComplete(argQuestionsComplete);
		return this;
	}

	@Override
	public TournamentImpl setQuestionsComplete(boolean argQuestionsComplete) {
		getTournamentOpal().setQuestionsComplete(argQuestionsComplete);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the Room object created from tournament through reference tournament_control_room_room_id_fkey */

	@Override
	public Room getControlRoom() {
		RoomOpal lclRoomOpal = getTournamentOpal().getControlRoomOpal();
		return lclRoomOpal == null ? null : lclRoomOpal.getUserFacing();
	}

	@Override
	public Tournament setControlRoom(Room argRoom) {
		getTournamentOpal().setControlRoomOpal(argRoom == null ? null : ((RoomImpl) argRoom).getRoomOpal());
		return this;
	}

	/** @return the Contact object created from tournament through reference tournament_tournament_director_contact_id_fkey */

	@Override
	public Contact getTournamentDirectorContact() {
		ContactOpal lclContactOpal = getTournamentOpal().getTournamentDirectorContactOpal();
		return lclContactOpal == null ? null : lclContactOpal.getUserFacing();
	}

	@Override
	public Tournament setTournamentDirectorContact(Contact argContact) {
		getTournamentOpal().setTournamentDirectorContactOpal(argContact == null ? null : ((ContactImpl) argContact).getContactOpal());
		return this;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public com.scobolsolo.application.Tournament addPhase(Phase argPhase) {
		getTournamentOpal().addPhaseOpal(((PhaseImpl) argPhase).getPhaseOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Tournament removePhase(Phase argPhase) {
		getTournamentOpal().removePhaseOpal(((PhaseImpl) argPhase).getPhaseOpal());
		return this;
	}

	@Override
	public int getPhaseCount() {
		return getTournamentOpal().getPhaseOpalCount();
	}

	@Override
	public java.util.stream.Stream<Phase> streamPhase() {
		return getTournamentOpal().streamPhaseOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<Phase> createPhaseIterator() {
		return new com.opal.OpalIterator<> (getTournamentOpal().createPhaseOpalIterator());
	}

	@Override
	public com.scobolsolo.application.Tournament clearPhase() {
		throw new UnsupportedOperationException();
	}

	@Override
	public com.scobolsolo.application.Tournament addSchoolRegistration(SchoolRegistration argSchoolRegistration) {
		getTournamentOpal().addSchoolRegistrationOpal(((SchoolRegistrationImpl) argSchoolRegistration).getSchoolRegistrationOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Tournament removeSchoolRegistration(SchoolRegistration argSchoolRegistration) {
		getTournamentOpal().removeSchoolRegistrationOpal(((SchoolRegistrationImpl) argSchoolRegistration).getSchoolRegistrationOpal());
		return this;
	}

	@Override
	public int getSchoolRegistrationCount() {
		return getTournamentOpal().getSchoolRegistrationOpalCount();
	}

	@Override
	public java.util.stream.Stream<SchoolRegistration> streamSchoolRegistration() {
		return getTournamentOpal().streamSchoolRegistrationOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<SchoolRegistration> createSchoolRegistrationIterator() {
		return new com.opal.OpalIterator<> (getTournamentOpal().createSchoolRegistrationOpalIterator());
	}

	@Override
	public com.scobolsolo.application.Tournament clearSchoolRegistration() {
		throw new UnsupportedOperationException();
	}

	@Override
	public com.scobolsolo.application.Tournament addStaff(Staff argStaff) {
		getTournamentOpal().addStaffOpal(((StaffImpl) argStaff).getStaffOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Tournament removeStaff(Staff argStaff) {
		getTournamentOpal().removeStaffOpal(((StaffImpl) argStaff).getStaffOpal());
		return this;
	}

	@Override
	public int getStaffCount() {
		return getTournamentOpal().getStaffOpalCount();
	}

	@Override
	public java.util.stream.Stream<Staff> streamStaff() {
		return getTournamentOpal().streamStaffOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<Staff> createStaffIterator() {
		return new com.opal.OpalIterator<> (getTournamentOpal().createStaffOpalIterator());
	}

	@Override
	public com.scobolsolo.application.Tournament clearStaff() {
		throw new UnsupportedOperationException();
	}

	@Override
	public com.scobolsolo.application.Tournament addCategoryUse(CategoryUse argCategoryUse) {
		getTournamentOpal().addCategoryUseOpal(((CategoryUseImpl) argCategoryUse).getCategoryUseOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Tournament removeCategoryUse(CategoryUse argCategoryUse) {
		getTournamentOpal().removeCategoryUseOpal(((CategoryUseImpl) argCategoryUse).getCategoryUseOpal());
		return this;
	}

	@Override
	public int getCategoryUseCount() {
		return getTournamentOpal().getCategoryUseOpalCount();
	}

	@Override
	public java.util.stream.Stream<CategoryUse> streamCategoryUse() {
		return getTournamentOpal().streamCategoryUseOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<CategoryUse> createCategoryUseIterator() {
		return new com.opal.OpalIterator<> (getTournamentOpal().createCategoryUseOpalIterator());
	}

	@Override
	public com.scobolsolo.application.Tournament clearCategoryUse() {
		throw new UnsupportedOperationException();
	}

	@Override
	public com.scobolsolo.application.Tournament addPacket(Packet argPacket) {
		getTournamentOpal().addPacketOpal(((PacketImpl) argPacket).getPacketOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Tournament removePacket(Packet argPacket) {
		getTournamentOpal().removePacketOpal(((PacketImpl) argPacket).getPacketOpal());
		return this;
	}

	@Override
	public int getPacketCount() {
		return getTournamentOpal().getPacketOpalCount();
	}

	@Override
	public java.util.stream.Stream<Packet> streamPacket() {
		return getTournamentOpal().streamPacketOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<Packet> createPacketIterator() {
		return new com.opal.OpalIterator<> (getTournamentOpal().createPacketOpalIterator());
	}

	@Override
	public com.scobolsolo.application.Tournament clearPacket() {
		throw new UnsupportedOperationException();
	}

	@Override
	public com.scobolsolo.application.Tournament addRoom(Room argRoom) {
		getTournamentOpal().addRoomOpal(((RoomImpl) argRoom).getRoomOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Tournament removeRoom(Room argRoom) {
		getTournamentOpal().removeRoomOpal(((RoomImpl) argRoom).getRoomOpal());
		return this;
	}

	@Override
	public int getRoomCount() {
		return getTournamentOpal().getRoomOpalCount();
	}

	@Override
	public java.util.stream.Stream<Room> streamRoom() {
		return getTournamentOpal().streamRoomOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<Room> createRoomIterator() {
		return new com.opal.OpalIterator<> (getTournamentOpal().createRoomOpalIterator());
	}

	@Override
	public com.scobolsolo.application.Tournament clearRoom() {
		throw new UnsupportedOperationException();
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
	public Tournament copy() {
		return getTournamentOpal().copy().getUserFacing();
	}

}
