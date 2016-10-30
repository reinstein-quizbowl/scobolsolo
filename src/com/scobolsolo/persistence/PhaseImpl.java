package com.scobolsolo.persistence;


public class PhaseImpl extends com.opal.AbstractIdentityImpl<com.scobolsolo.application.Phase, com.scobolsolo.persistence.PhaseOpal> implements com.scobolsolo.application.Phase {

	private final com.scobolsolo.persistence.PhaseOpal myPhaseOpal;

	public PhaseImpl(PhaseOpal argPhaseOpal) {
		super();
		myPhaseOpal = org.apache.commons.lang3.Validate.notNull(argPhaseOpal);
	}

	protected com.scobolsolo.persistence.PhaseOpal getPhaseOpal() {
		return myPhaseOpal;
	}

	@Override
	protected com.opal.IdentityOpal<? extends com.scobolsolo.application.Phase> getOpal() {
		return getPhaseOpal();
	}

	@Override
	protected com.opal.IdentityOpal<? extends com.scobolsolo.application.Phase> getBottomOpal() {
		return getPhaseOpal();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getIdAsObject() {
		return getPhaseOpal().getIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.PhaseImpl setId(java.lang.Integer argId) {
		getPhaseOpal().setId(argId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.PhaseImpl setId(int argId) {
		getPhaseOpal().setId(argId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getTournamentCode() {
		return getPhaseOpal().getTournamentCode();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public com.scobolsolo.persistence.PhaseImpl setTournamentCode(java.lang.String argTournamentCode) {
		getPhaseOpal().setTournamentCode(argTournamentCode);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public java.lang.String getName() {
		return getPhaseOpal().getName();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public com.scobolsolo.persistence.PhaseImpl setName(java.lang.String argName) {
		getPhaseOpal().setName(argName);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getShortName() {
		return getPhaseOpal().getShortName();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public com.scobolsolo.persistence.PhaseImpl setShortName(java.lang.String argShortName) {
		getPhaseOpal().setShortName(argShortName);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getSequenceAsObject() {
		return getPhaseOpal().getSequenceAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.PhaseImpl setSequence(java.lang.Integer argSequence) {
		getPhaseOpal().setSequence(argSequence);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.PhaseImpl setSequence(int argSequence) {
		getPhaseOpal().setSequence(argSequence);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Boolean isCardSystemAsObject() {
		return getPhaseOpal().isCardSystemAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.PhaseImpl setCardSystem(java.lang.Boolean argCardSystem) {
		getPhaseOpal().setCardSystem(argCardSystem);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.PhaseImpl setCardSystem(boolean argCardSystem) {
		getPhaseOpal().setCardSystem(argCardSystem);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public java.lang.String getNote() {
		return getPhaseOpal().getNote();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public com.scobolsolo.persistence.PhaseImpl setNote(java.lang.String argNote) {
		getPhaseOpal().setNote(argNote);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the Tournament object created from phase through reference phase_tournament_code_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.Tournament getTournament() {
		TournamentOpal lclTournamentOpal = getPhaseOpal().getTournamentOpal();
		return lclTournamentOpal == null ? null : lclTournamentOpal.getUserFacing();
	}

	@Override
	public com.scobolsolo.application.Phase setTournament(com.scobolsolo.application.Tournament argTournament) {
		getPhaseOpal().setTournamentOpal(argTournament == null ? null : ((TournamentImpl) argTournament).getTournamentOpal());
		return this;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public com.scobolsolo.application.Phase addStaffAssignment(com.scobolsolo.application.StaffAssignment argStaffAssignment) {
		getPhaseOpal().addStaffAssignmentOpal(((StaffAssignmentImpl) argStaffAssignment).getStaffAssignmentOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Phase removeStaffAssignment(com.scobolsolo.application.StaffAssignment argStaffAssignment) {
		getPhaseOpal().removeStaffAssignmentOpal(((StaffAssignmentImpl) argStaffAssignment).getStaffAssignmentOpal());
		return this;
	}

	@Override
	public int getStaffAssignmentCount() {
		return getPhaseOpal().getStaffAssignmentOpalCount();
	}

	@Override
	public java.util.stream.Stream<com.scobolsolo.application.StaffAssignment> streamStaffAssignment() {
		return getPhaseOpal().streamStaffAssignmentOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<com.scobolsolo.application.StaffAssignment> createStaffAssignmentIterator() {
		return new com.opal.OpalIterator<> (getPhaseOpal().createStaffAssignmentOpalIterator());
	}

	@Override
	public com.scobolsolo.application.Phase addRoundGroup(com.scobolsolo.application.RoundGroup argRoundGroup) {
		getPhaseOpal().addRoundGroupOpal(((RoundGroupImpl) argRoundGroup).getRoundGroupOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Phase removeRoundGroup(com.scobolsolo.application.RoundGroup argRoundGroup) {
		getPhaseOpal().removeRoundGroupOpal(((RoundGroupImpl) argRoundGroup).getRoundGroupOpal());
		return this;
	}

	@Override
	public int getRoundGroupCount() {
		return getPhaseOpal().getRoundGroupOpalCount();
	}

	@Override
	public java.util.stream.Stream<com.scobolsolo.application.RoundGroup> streamRoundGroup() {
		return getPhaseOpal().streamRoundGroupOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<com.scobolsolo.application.RoundGroup> createRoundGroupIterator() {
		return new com.opal.OpalIterator<> (getPhaseOpal().createRoundGroupOpalIterator());
	}

	@Override
	public com.scobolsolo.application.Phase addCard(com.scobolsolo.application.Card argCard) {
		getPhaseOpal().addCardOpal(((CardImpl) argCard).getCardOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Phase removeCard(com.scobolsolo.application.Card argCard) {
		getPhaseOpal().removeCardOpal(((CardImpl) argCard).getCardOpal());
		return this;
	}

	@Override
	public int getCardCount() {
		return getPhaseOpal().getCardOpalCount();
	}

	@Override
	public java.util.stream.Stream<com.scobolsolo.application.Card> streamCard() {
		return getPhaseOpal().streamCardOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<com.scobolsolo.application.Card> createCardIterator() {
		return new com.opal.OpalIterator<> (getPhaseOpal().createCardOpalIterator());
	}

	@Override
	public void unlink() {
		getPhaseOpal().unlink();
	}

	@Override
	public void reload() {
		getPhaseOpal().reload();
	}

	@Override
	public com.scobolsolo.application.Phase copy() {
		return getPhaseOpal().copy().getUserFacing();
	}

}
