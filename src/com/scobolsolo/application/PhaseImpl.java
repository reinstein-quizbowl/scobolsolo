package com.scobolsolo.application;

import com.scobolsolo.persistence.PhaseOpal;
import com.scobolsolo.persistence.TournamentOpal;

public class PhaseImpl extends com.opal.AbstractIdentityImpl<Phase, PhaseOpal> implements Phase {
	private final PhaseOpal myPhaseOpal;

	public PhaseImpl(PhaseOpal argPhaseOpal) {
		super();
		myPhaseOpal = org.apache.commons.lang3.Validate.notNull(argPhaseOpal);
	}

	protected PhaseOpal getPhaseOpal() {
		return myPhaseOpal;
	}

	@Override
	protected com.opal.IdentityOpal<? extends Phase> getOpal() {
		return getPhaseOpal();
	}

	@Override
	protected com.opal.IdentityOpal<? extends Phase> getBottomOpal() {
		return getPhaseOpal();
	}

	@Override
	public int compareTo(Phase argSecond) {
		return this.getSequenceAsObject().compareTo(argSecond.getSequenceAsObject());
	}

	@Override
	public java.lang.Integer getIdAsObject() {
		return getPhaseOpal().getIdAsObject();
	}

	@Override
	public PhaseImpl setId(java.lang.Integer argId) {
		getPhaseOpal().setId(argId);
		return this;
	}

	@Override
	public PhaseImpl setId(int argId) {
		getPhaseOpal().setId(argId);
		return this;
	}

	@Override
	public java.lang.String getTournamentCode() {
		return getPhaseOpal().getTournamentCode();
	}

	@Override
	public PhaseImpl setTournamentCode(java.lang.String argTournamentCode) {
		getPhaseOpal().setTournamentCode(argTournamentCode);
		return this;
	}

	@Override
	public java.lang.String getName() {
		return getPhaseOpal().getName();
	}

	@Override
	public PhaseImpl setName(java.lang.String argName) {
		getPhaseOpal().setName(argName);
		return this;
	}

	@Override
	public java.lang.String getShortName() {
		return getPhaseOpal().getShortName();
	}

	@Override
	public PhaseImpl setShortName(java.lang.String argShortName) {
		getPhaseOpal().setShortName(argShortName);
		return this;
	}

	@Override
	public java.lang.Integer getSequenceAsObject() {
		return getPhaseOpal().getSequenceAsObject();
	}

	@Override
	public PhaseImpl setSequence(java.lang.Integer argSequence) {
		getPhaseOpal().setSequence(argSequence);
		return this;
	}

	@Override
	public PhaseImpl setSequence(int argSequence) {
		getPhaseOpal().setSequence(argSequence);
		return this;
	}

	@Override
	public java.lang.Boolean isCardSystemAsObject() {
		return getPhaseOpal().isCardSystemAsObject();
	}

	@Override
	public PhaseImpl setCardSystem(java.lang.Boolean argCardSystem) {
		getPhaseOpal().setCardSystem(argCardSystem);
		return this;
	}

	@Override
	public PhaseImpl setCardSystem(boolean argCardSystem) {
		getPhaseOpal().setCardSystem(argCardSystem);
		return this;
	}

	@Override
	public java.lang.String getNote() {
		return getPhaseOpal().getNote();
	}

	@Override
	public PhaseImpl setNote(java.lang.String argNote) {
		getPhaseOpal().setNote(argNote);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** Access to the Tournament object created from phase through reference phase_tournament_code_fkey */

	@Override
	public Tournament getTournament() {
		TournamentOpal lclTournamentOpal = getPhaseOpal().getTournamentOpal();
		return lclTournamentOpal == null ? null : lclTournamentOpal.getUserFacing();
	}

	@Override
	public Phase setTournament(Tournament argTournament) {
		getPhaseOpal().setTournamentOpal(argTournament == null ? null : ((TournamentImpl) argTournament).getTournamentOpal());
		return this;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public void addStaffAssignment(StaffAssignment argStaffAssignment) {
		getPhaseOpal().addStaffAssignmentOpal(((StaffAssignmentImpl) argStaffAssignment).getStaffAssignmentOpal());
	}

	@Override
	public void removeStaffAssignment(StaffAssignment argStaffAssignment) {
		getPhaseOpal().removeStaffAssignmentOpal(((StaffAssignmentImpl) argStaffAssignment).getStaffAssignmentOpal());
	}

	@Override
	public int getStaffAssignmentCount() {
		return getPhaseOpal().getStaffAssignmentOpalCount();
	}

	@Override
	public java.util.stream.Stream<StaffAssignment> streamStaffAssignment() {
		return getPhaseOpal().streamStaffAssignmentOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<StaffAssignment> createStaffAssignmentIterator() {
		return new com.opal.OpalIterator<> (getPhaseOpal().createStaffAssignmentOpalIterator());
	}

	@Override
	public void clearStaffAssignment() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addRoundGroup(RoundGroup argRoundGroup) {
		getPhaseOpal().addRoundGroupOpal(((RoundGroupImpl) argRoundGroup).getRoundGroupOpal());
	}

	@Override
	public void removeRoundGroup(RoundGroup argRoundGroup) {
		getPhaseOpal().removeRoundGroupOpal(((RoundGroupImpl) argRoundGroup).getRoundGroupOpal());
	}

	@Override
	public int getRoundGroupCount() {
		return getPhaseOpal().getRoundGroupOpalCount();
	}

	@Override
	public java.util.stream.Stream<RoundGroup> streamRoundGroup() {
		return getPhaseOpal().streamRoundGroupOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<RoundGroup> createRoundGroupIterator() {
		return new com.opal.OpalIterator<> (getPhaseOpal().createRoundGroupOpalIterator());
	}

	@Override
	public void clearRoundGroup() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addCard(Card argCard) {
		getPhaseOpal().addCardOpal(((CardImpl) argCard).getCardOpal());
	}

	@Override
	public void removeCard(Card argCard) {
		getPhaseOpal().removeCardOpal(((CardImpl) argCard).getCardOpal());
	}

	@Override
	public int getCardCount() {
		return getPhaseOpal().getCardOpalCount();
	}

	@Override
	public java.util.stream.Stream<Card> streamCard() {
		return getPhaseOpal().streamCardOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<Card> createCardIterator() {
		return new com.opal.OpalIterator<> (getPhaseOpal().createCardOpalIterator());
	}

	@Override
	public void clearCard() {
		throw new UnsupportedOperationException();
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
	public Phase copy() {
		return getPhaseOpal().copy().getUserFacing();
	}

}
