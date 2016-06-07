package com.scobolsolo.application;

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
	protected com.opal.IdentityOpal<? extends Room> getOpal() {
		return getRoomOpal();
	}

	@Override
	protected com.opal.IdentityOpal<? extends Room> getBottomOpal() {
		return getRoomOpal();
	}

	@Override
	public int compareTo(Room argSecond) {
		return this.getSequenceAsObject().compareTo(argSecond.getSequenceAsObject());
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getIdAsObject() {
		return getRoomOpal().getIdAsObject();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public RoomImpl setId(java.lang.Integer argId) {
		getRoomOpal().setId(argId);
		return this;
	}

	@Override
	public RoomImpl setId(int argId) {
		getRoomOpal().setId(argId);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public java.lang.String getName() {
		return getRoomOpal().getName();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public RoomImpl setName(java.lang.String argName) {
		getRoomOpal().setName(argName);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getShortName() {
		return getRoomOpal().getShortName();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public RoomImpl setShortName(java.lang.String argShortName) {
		getRoomOpal().setShortName(argShortName);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public java.lang.String getNote() {
		return getRoomOpal().getNote();
	}

	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public RoomImpl setNote(java.lang.String argNote) {
		getRoomOpal().setNote(argNote);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getTournamentCode() {
		return getRoomOpal().getTournamentCode();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public RoomImpl setTournamentCode(java.lang.String argTournamentCode) {
		getRoomOpal().setTournamentCode(argTournamentCode);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getSequenceAsObject() {
		return getRoomOpal().getSequenceAsObject();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public RoomImpl setSequence(java.lang.Integer argSequence) {
		getRoomOpal().setSequence(argSequence);
		return this;
	}

	@Override
	public RoomImpl setSequence(int argSequence) {
		getRoomOpal().setSequence(argSequence);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the Tournament object created from room through reference room_tournament_code_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public Tournament getTournament() {
		TournamentOpal lclTournamentOpal = getRoomOpal().getTournamentOpal();
		return lclTournamentOpal == null ? null : lclTournamentOpal.getUserFacing();
	}

	@Override
	public Room setTournament(Tournament argTournament) {
		getRoomOpal().setTournamentOpal(argTournament == null ? null : ((TournamentImpl) argTournament).getTournamentOpal());
		return this;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public com.scobolsolo.application.Room addControlRoomTournament(Tournament argTournament) {
		getRoomOpal().addControlRoomTournamentOpal(((TournamentImpl) argTournament).getTournamentOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Room removeControlRoomTournament(Tournament argTournament) {
		getRoomOpal().removeControlRoomTournamentOpal(((TournamentImpl) argTournament).getTournamentOpal());
		return this;
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
	public com.scobolsolo.application.Room addStaffAssignment(StaffAssignment argStaffAssignment) {
		getRoomOpal().addStaffAssignmentOpal(((StaffAssignmentImpl) argStaffAssignment).getStaffAssignmentOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Room removeStaffAssignment(StaffAssignment argStaffAssignment) {
		getRoomOpal().removeStaffAssignmentOpal(((StaffAssignmentImpl) argStaffAssignment).getStaffAssignmentOpal());
		return this;
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
	public com.scobolsolo.application.Room addBuzzer(Buzzer argBuzzer) {
		getRoomOpal().addBuzzerOpal(((BuzzerImpl) argBuzzer).getBuzzerOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Room removeBuzzer(Buzzer argBuzzer) {
		getRoomOpal().removeBuzzerOpal(((BuzzerImpl) argBuzzer).getBuzzerOpal());
		return this;
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
	public com.scobolsolo.application.Room addMatch(Match argMatch) {
		getRoomOpal().addMatchOpal(((MatchImpl) argMatch).getMatchOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Room removeMatch(Match argMatch) {
		getRoomOpal().removeMatchOpal(((MatchImpl) argMatch).getMatchOpal());
		return this;
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
