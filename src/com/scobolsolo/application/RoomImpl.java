package com.scobolsolo.application;

import com.opal.Opal;
import com.scobolsolo.persistence.RoomOpal;
import com.scobolsolo.persistence.TournamentOpal;

public class RoomImpl extends com.opal.AbstractIdentityImpl<Room, RoomOpal> implements Room {
	private final RoomOpal myRoomOpal;

	public RoomImpl(RoomOpal argRoomOpal) {
		super();
		myRoomOpal = org.apache.commons.lang3.Validate.notNull(argRoomOpal);
	}

	protected RoomOpal getRoomOpal() {
		return myRoomOpal;
	}

	@Override
	protected com.opal.IdentityOpal<? extends Room> getBottomOpal() {
		return getRoomOpal();
	}

	@Override
	protected Opal<? super Room>[] getOpalArray() {
		return (Opal<? super Room>[]) new Opal<?>[] {
			getRoomOpal(),
		};
	}

	@Override
	public int compareTo(Room argSecond) {
		return this.getSequenceAsObject().compareTo(argSecond.getSequenceAsObject());
	}

	@Override
	public java.lang.Integer getIdAsObject() {
		return getRoomOpal().getIdAsObject();
	}

	@Override
	public void setId(java.lang.Integer argId) {
		getRoomOpal().setId(argId);
		return;
	}

	@Override
	public void setId(int argId) {
		getRoomOpal().setId(argId);
		return;
	}

	@Override
	public java.lang.String getName() {
		return getRoomOpal().getName();
	}

	@Override
	public void setName(java.lang.String argName) {
		getRoomOpal().setName(argName);
		return;
	}

	@Override
	public java.lang.String getShortName() {
		return getRoomOpal().getShortName();
	}

	@Override
	public void setShortName(java.lang.String argShortName) {
		getRoomOpal().setShortName(argShortName);
		return;
	}

	@Override
	public java.lang.String getNote() {
		return getRoomOpal().getNote();
	}

	@Override
	public void setNote(java.lang.String argNote) {
		getRoomOpal().setNote(argNote);
		return;
	}

	@Override
	public java.lang.String getTournamentCode() {
		return getRoomOpal().getTournamentCode();
	}

	@Override
	public void setTournamentCode(java.lang.String argTournamentCode) {
		getRoomOpal().setTournamentCode(argTournamentCode);
		return;
	}

	@Override
	public java.lang.Integer getSequenceAsObject() {
		return getRoomOpal().getSequenceAsObject();
	}

	@Override
	public void setSequence(java.lang.Integer argSequence) {
		getRoomOpal().setSequence(argSequence);
		return;
	}

	@Override
	public void setSequence(int argSequence) {
		getRoomOpal().setSequence(argSequence);
		return;
	}

	@Override
	public java.lang.Boolean isGameRoomAsObject() {
		return getRoomOpal().isGameRoomAsObject();
	}

	@Override
	public void setGameRoom(java.lang.Boolean argGameRoom) {
		getRoomOpal().setGameRoom(argGameRoom);
		return;
	}

	@Override
	public void setGameRoom(boolean argGameRoom) {
		getRoomOpal().setGameRoom(argGameRoom);
		return;
	}

	/* The following methods allow direct access to the user objects for which
	this object has foreign keys in the database. */

	/** Access to the Tournament object created from the table room through foreign key room_tournament_code_fkey */

	@Override
	public Tournament getTournament() {
		TournamentOpal lclTournamentOpal = getRoomOpal().getTournamentOpal();
		return lclTournamentOpal == null ? null : lclTournamentOpal.getUserFacing();
	}

	@Override
	public void setTournament(Tournament argTournament) {
		getRoomOpal().setTournamentOpal(argTournament == null ? null : ((TournamentImpl) argTournament).getTournamentOpal());
		return;
	}

	/* The following methods allow access to the user objects that have foreign keys
	to this object. */

	@Override
	public void addControlRoomTournament(Tournament argTournament) {
		getRoomOpal().addControlRoomTournamentOpal(((TournamentImpl) argTournament).getTournamentOpal());
	}

	@Override
	public void removeControlRoomTournament(Tournament argTournament) {
		getRoomOpal().removeControlRoomTournamentOpal(((TournamentImpl) argTournament).getTournamentOpal());
	}

	@Override
	public int getControlRoomTournamentCount() {
		return getRoomOpal().getControlRoomTournamentOpalCount();
	}

	@Override
	public java.util.stream.Stream<Tournament> streamControlRoomTournament() {
		return getRoomOpal().streamControlRoomTournamentOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<Tournament> createControlRoomTournamentIterator() {
		return new com.opal.OpalIterator<> (getRoomOpal().createControlRoomTournamentOpalIterator());
	}

	@Override
	public void clearControlRoomTournament() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addStaffAssignment(StaffAssignment argStaffAssignment) {
		getRoomOpal().addStaffAssignmentOpal(((StaffAssignmentImpl) argStaffAssignment).getStaffAssignmentOpal());
	}

	@Override
	public void removeStaffAssignment(StaffAssignment argStaffAssignment) {
		getRoomOpal().removeStaffAssignmentOpal(((StaffAssignmentImpl) argStaffAssignment).getStaffAssignmentOpal());
	}

	@Override
	public int getStaffAssignmentCount() {
		return getRoomOpal().getStaffAssignmentOpalCount();
	}

	@Override
	public java.util.stream.Stream<StaffAssignment> streamStaffAssignment() {
		return getRoomOpal().streamStaffAssignmentOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<StaffAssignment> createStaffAssignmentIterator() {
		return new com.opal.OpalIterator<> (getRoomOpal().createStaffAssignmentOpalIterator());
	}

	@Override
	public void clearStaffAssignment() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addBuzzer(Buzzer argBuzzer) {
		getRoomOpal().addBuzzerOpal(((BuzzerImpl) argBuzzer).getBuzzerOpal());
	}

	@Override
	public void removeBuzzer(Buzzer argBuzzer) {
		getRoomOpal().removeBuzzerOpal(((BuzzerImpl) argBuzzer).getBuzzerOpal());
	}

	@Override
	public int getBuzzerCount() {
		return getRoomOpal().getBuzzerOpalCount();
	}

	@Override
	public java.util.stream.Stream<Buzzer> streamBuzzer() {
		return getRoomOpal().streamBuzzerOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<Buzzer> createBuzzerIterator() {
		return new com.opal.OpalIterator<> (getRoomOpal().createBuzzerOpalIterator());
	}

	@Override
	public void clearBuzzer() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addMatch(Match argMatch) {
		getRoomOpal().addMatchOpal(((MatchImpl) argMatch).getMatchOpal());
	}

	@Override
	public void removeMatch(Match argMatch) {
		getRoomOpal().removeMatchOpal(((MatchImpl) argMatch).getMatchOpal());
	}

	@Override
	public int getMatchCount() {
		return getRoomOpal().getMatchOpalCount();
	}

	@Override
	public java.util.stream.Stream<Match> streamMatch() {
		return getRoomOpal().streamMatchOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<Match> createMatchIterator() {
		return new com.opal.OpalIterator<> (getRoomOpal().createMatchOpalIterator());
	}

	@Override
	public void clearMatch() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void unlink() {
		getRoomOpal().unlink();
	}

	@Override
	public void reload() {
		getRoomOpal().reload();
	}

	@Override
	public Room copy() {
		return getRoomOpal().copy().getUserFacing();
	}

}
