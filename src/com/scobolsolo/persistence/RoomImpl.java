package com.scobolsolo.persistence;

public class RoomImpl extends com.opal.AbstractIdentityImpl<com.scobolsolo.application.Room, com.scobolsolo.persistence.RoomOpal> implements com.scobolsolo.application.Room {

	private final com.scobolsolo.persistence.RoomOpal myRoomOpal;

	public RoomImpl(RoomOpal argRoomOpal) {
		super();
		myRoomOpal = org.apache.commons.lang3.Validate.notNull(argRoomOpal);
	}

	protected com.scobolsolo.persistence.RoomOpal getRoomOpal() {
		return myRoomOpal;
	}

	@Override
	public com.scobolsolo.persistence.RoomOpal getOpal() {
		return getRoomOpal();
	}

	@Override
	public com.scobolsolo.persistence.RoomOpal getBottomOpal() {
		return getRoomOpal();
	}

	@Override
	public int compareTo(com.scobolsolo.application.Room argSecond) {
		return this.getSequenceAsObject().compareTo(argSecond.getSequenceAsObject());
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getIdAsObject() {
		return getRoomOpal().getIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.RoomImpl setId(java.lang.Integer argId) {
		getRoomOpal().setId(argId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.RoomImpl setId(int argId) {
		getRoomOpal().setId(argId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public java.lang.String getName() {
		return getRoomOpal().getName();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public com.scobolsolo.persistence.RoomImpl setName(java.lang.String argName) {
		getRoomOpal().setName(argName);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getShortName() {
		return getRoomOpal().getShortName();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public com.scobolsolo.persistence.RoomImpl setShortName(java.lang.String argShortName) {
		getRoomOpal().setShortName(argShortName);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public java.lang.String getNote() {
		return getRoomOpal().getNote();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public com.scobolsolo.persistence.RoomImpl setNote(java.lang.String argNote) {
		getRoomOpal().setNote(argNote);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getTournamentCode() {
		return getRoomOpal().getTournamentCode();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public com.scobolsolo.persistence.RoomImpl setTournamentCode(java.lang.String argTournamentCode) {
		getRoomOpal().setTournamentCode(argTournamentCode);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getSequenceAsObject() {
		return getRoomOpal().getSequenceAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.RoomImpl setSequence(java.lang.Integer argSequence) {
		getRoomOpal().setSequence(argSequence);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.RoomImpl setSequence(int argSequence) {
		getRoomOpal().setSequence(argSequence);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the Tournament object created from room through reference room_tournament_code_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.Tournament getTournament() {
		TournamentOpal lclTournamentOpal = getRoomOpal().getTournamentOpal();
		return lclTournamentOpal == null ? null : lclTournamentOpal.getUserFacing();
	}

	@Override
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.Room setTournament(com.scobolsolo.application.Tournament argTournament) {
		getRoomOpal().setTournamentOpal(argTournament == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.Tournament, com.scobolsolo.persistence.TournamentOpal>) argTournament).getOpal());
		return this;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public java.util.Set<com.scobolsolo.application.Tournament> getControlRoomTournamentSet() {
		return new com.opal.UserFacingBackCollectionSet<>(getRoomOpal().getControlRoomTournamentOpalSet());
	}

	@Override
	public java.util.Set<com.scobolsolo.application.StaffAssignment> getStaffAssignmentSet() {
		return new com.opal.UserFacingBackCollectionSet<>(getRoomOpal().getStaffAssignmentOpalSet());
	}

	@Override
	public java.util.Set<com.scobolsolo.application.Buzzer> getBuzzerSet() {
		return new com.opal.UserFacingBackCollectionSet<>(getRoomOpal().getBuzzerOpalSet());
	}

	@Override
	public java.util.Set<com.scobolsolo.application.Match> getMatchSet() {
		return new com.opal.UserFacingBackCollectionSet<>(getRoomOpal().getMatchOpalSet());
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
	public com.scobolsolo.application.Room copy() {
		return getRoomOpal().copy().getUserFacing();
	}

}
