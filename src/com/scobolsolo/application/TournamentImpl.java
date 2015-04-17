package com.scobolsolo.application;

import com.opal.Opal;
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
	protected com.opal.IdentityOpal<? extends Tournament> getBottomOpal() {
		return getTournamentOpal();
	}

	@Override
	protected Opal<? super Tournament>[] getOpalArray() {
		return (Opal<? super Tournament>[]) new Opal<?>[] {
			getTournamentOpal(),
		};
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
	public void setDate(java.time.LocalDate argDate) {
		getTournamentOpal().setDate(argDate);
		return;
	}

	@Override
	public java.lang.String getName() {
		return getTournamentOpal().getName();
	}

	@Override
	public void setName(java.lang.String argName) {
		getTournamentOpal().setName(argName);
		return;
	}

	@Override
	public java.lang.String getShortName() {
		return getTournamentOpal().getShortName();
	}

	@Override
	public void setShortName(java.lang.String argShortName) {
		getTournamentOpal().setShortName(argShortName);
		return;
	}

	@Override
	public java.lang.String getCode() {
		return getTournamentOpal().getCode();
	}

	@Override
	public void setCode(java.lang.String argCode) {
		getTournamentOpal().setCode(argCode);
		return;
	}

	@Override
	public java.lang.String getWebXmlRoleCode() {
		return getTournamentOpal().getWebXmlRoleCode();
	}

	@Override
	public void setWebXmlRoleCode(java.lang.String argWebXmlRoleCode) {
		getTournamentOpal().setWebXmlRoleCode(argWebXmlRoleCode);
		return;
	}

	@Override
	public java.lang.Boolean isTiebreakerSuddenDeathAsObject() {
		return getTournamentOpal().isTiebreakerSuddenDeathAsObject();
	}

	@Override
	public void setTiebreakerSuddenDeath(java.lang.Boolean argTiebreakerSuddenDeath) {
		getTournamentOpal().setTiebreakerSuddenDeath(argTiebreakerSuddenDeath);
		return;
	}

	@Override
	public void setTiebreakerSuddenDeath(boolean argTiebreakerSuddenDeath) {
		getTournamentOpal().setTiebreakerSuddenDeath(argTiebreakerSuddenDeath);
		return;
	}

	@Override
	public java.lang.String getUrl() {
		return getTournamentOpal().getUrl();
	}

	@Override
	public void setUrl(java.lang.String argUrl) {
		getTournamentOpal().setUrl(argUrl);
		return;
	}

	@Override
	public java.lang.Integer getTournamentDirectorContactIdAsObject() {
		return getTournamentOpal().getTournamentDirectorContactIdAsObject();
	}

	@Override
	public void setTournamentDirectorContactId(java.lang.Integer argTournamentDirectorContactId) {
		getTournamentOpal().setTournamentDirectorContactId(argTournamentDirectorContactId);
		return;
	}

	@Override
	public void setTournamentDirectorContactId(int argTournamentDirectorContactId) {
		getTournamentOpal().setTournamentDirectorContactId(argTournamentDirectorContactId);
		return;
	}

	@Override
	public java.lang.String getPlayerMessage() {
		return getTournamentOpal().getPlayerMessage();
	}

	@Override
	public void setPlayerMessage(java.lang.String argPlayerMessage) {
		getTournamentOpal().setPlayerMessage(argPlayerMessage);
		return;
	}

	@Override
	public java.lang.String getStaffMessage() {
		return getTournamentOpal().getStaffMessage();
	}

	@Override
	public void setStaffMessage(java.lang.String argStaffMessage) {
		getTournamentOpal().setStaffMessage(argStaffMessage);
		return;
	}

	@Override
	public java.lang.String getReplacementQuestionSocialMediaPolicy() {
		return getTournamentOpal().getReplacementQuestionSocialMediaPolicy();
	}

	@Override
	public void setReplacementQuestionSocialMediaPolicy(java.lang.String argReplacementQuestionSocialMediaPolicy) {
		getTournamentOpal().setReplacementQuestionSocialMediaPolicy(argReplacementQuestionSocialMediaPolicy);
		return;
	}

	@Override
	public java.lang.String getSchoolMessage() {
		return getTournamentOpal().getSchoolMessage();
	}

	@Override
	public void setSchoolMessage(java.lang.String argSchoolMessage) {
		getTournamentOpal().setSchoolMessage(argSchoolMessage);
		return;
	}

	@Override
	public java.lang.Integer getControlRoomRoomIdAsObject() {
		return getTournamentOpal().getControlRoomRoomIdAsObject();
	}

	@Override
	public void setControlRoomRoomId(java.lang.Integer argControlRoomRoomId) {
		getTournamentOpal().setControlRoomRoomId(argControlRoomRoomId);
		return;
	}

	@Override
	public void setControlRoomRoomId(int argControlRoomRoomId) {
		getTournamentOpal().setControlRoomRoomId(argControlRoomRoomId);
		return;
	}

	@Override
	public java.lang.String getChampionshipRules() {
		return getTournamentOpal().getChampionshipRules();
	}

	@Override
	public void setChampionshipRules(java.lang.String argChampionshipRules) {
		getTournamentOpal().setChampionshipRules(argChampionshipRules);
		return;
	}

	@Override
	public java.lang.String getChampionshipMatchUrl() {
		return getTournamentOpal().getChampionshipMatchUrl();
	}

	@Override
	public void setChampionshipMatchUrl(java.lang.String argChampionshipMatchUrl) {
		getTournamentOpal().setChampionshipMatchUrl(argChampionshipMatchUrl);
		return;
	}

	/* The following methods allow direct access to the user objects for which
	this object has foreign keys in the database. */

	/** Access to the Room object created from the table tournament through foreign key tournament_control_room_room_id_fkey */

	@Override
	public Room getControlRoom() {
		RoomOpal lclRoomOpal = getTournamentOpal().getControlRoomOpal();
		return lclRoomOpal == null ? null : lclRoomOpal.getUserFacing();
	}

	@Override
	public void setControlRoom(Room argRoom) {
		getTournamentOpal().setControlRoomOpal(argRoom == null ? null : ((RoomImpl) argRoom).getRoomOpal());
		return;
	}

	/** Access to the Contact object created from the table tournament through foreign key tournament_tournament_director_contact_id_fkey */

	@Override
	public Contact getTournamentDirectorContact() {
		ContactOpal lclContactOpal = getTournamentOpal().getTournamentDirectorContactOpal();
		return lclContactOpal == null ? null : lclContactOpal.getUserFacing();
	}

	@Override
	public void setTournamentDirectorContact(Contact argContact) {
		getTournamentOpal().setTournamentDirectorContactOpal(argContact == null ? null : ((ContactImpl) argContact).getContactOpal());
		return;
	}

	/* The following methods allow access to the user objects that have foreign keys
	to this object. */

	@Override
	public void addPhase(Phase argPhase) {
		getTournamentOpal().addPhaseOpal(((PhaseImpl) argPhase).getPhaseOpal());
	}

	@Override
	public void removePhase(Phase argPhase) {
		getTournamentOpal().removePhaseOpal(((PhaseImpl) argPhase).getPhaseOpal());
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
	public void clearPhase() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addQuestion(Question argQuestion) {
		getTournamentOpal().addQuestionOpal(((QuestionImpl) argQuestion).getQuestionOpal());
	}

	@Override
	public void removeQuestion(Question argQuestion) {
		getTournamentOpal().removeQuestionOpal(((QuestionImpl) argQuestion).getQuestionOpal());
	}

	@Override
	public int getQuestionCount() {
		return getTournamentOpal().getQuestionOpalCount();
	}

	@Override
	public java.util.stream.Stream<Question> streamQuestion() {
		return getTournamentOpal().streamQuestionOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<Question> createQuestionIterator() {
		return new com.opal.OpalIterator<> (getTournamentOpal().createQuestionOpalIterator());
	}

	@Override
	public void clearQuestion() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addSchoolRegistration(SchoolRegistration argSchoolRegistration) {
		getTournamentOpal().addSchoolRegistrationOpal(((SchoolRegistrationImpl) argSchoolRegistration).getSchoolRegistrationOpal());
	}

	@Override
	public void removeSchoolRegistration(SchoolRegistration argSchoolRegistration) {
		getTournamentOpal().removeSchoolRegistrationOpal(((SchoolRegistrationImpl) argSchoolRegistration).getSchoolRegistrationOpal());
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
	public void clearSchoolRegistration() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addStaff(Staff argStaff) {
		getTournamentOpal().addStaffOpal(((StaffImpl) argStaff).getStaffOpal());
	}

	@Override
	public void removeStaff(Staff argStaff) {
		getTournamentOpal().removeStaffOpal(((StaffImpl) argStaff).getStaffOpal());
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
	public void clearStaff() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addCategoryUse(CategoryUse argCategoryUse) {
		getTournamentOpal().addCategoryUseOpal(((CategoryUseImpl) argCategoryUse).getCategoryUseOpal());
	}

	@Override
	public void removeCategoryUse(CategoryUse argCategoryUse) {
		getTournamentOpal().removeCategoryUseOpal(((CategoryUseImpl) argCategoryUse).getCategoryUseOpal());
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
	public void clearCategoryUse() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addPacket(Packet argPacket) {
		getTournamentOpal().addPacketOpal(((PacketImpl) argPacket).getPacketOpal());
	}

	@Override
	public void removePacket(Packet argPacket) {
		getTournamentOpal().removePacketOpal(((PacketImpl) argPacket).getPacketOpal());
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
	public void clearPacket() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addRoom(Room argRoom) {
		getTournamentOpal().addRoomOpal(((RoomImpl) argRoom).getRoomOpal());
	}

	@Override
	public void removeRoom(Room argRoom) {
		getTournamentOpal().removeRoomOpal(((RoomImpl) argRoom).getRoomOpal());
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
	public void clearRoom() {
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
