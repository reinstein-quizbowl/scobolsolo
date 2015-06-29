package com.scobolsolo.application;

import com.scobolsolo.persistence.PlacementOpal;
import com.scobolsolo.persistence.PacketOpal;
import com.scobolsolo.persistence.QuestionOpal;

public class PlacementImpl extends com.opal.AbstractIdentityImpl<Placement, PlacementOpal> implements Placement {
	private final PlacementOpal myPlacementOpal;

	public PlacementImpl(PlacementOpal argPlacementOpal) {
		super();
		myPlacementOpal = org.apache.commons.lang3.Validate.notNull(argPlacementOpal);
	}

	protected PlacementOpal getPlacementOpal() {
		return myPlacementOpal;
	}

	@Override
	protected com.opal.IdentityOpal<? extends Placement> getOpal() {
		return getPlacementOpal();
	}

	@Override
	protected com.opal.IdentityOpal<? extends Placement> getBottomOpal() {
		return getPlacementOpal();
	}

	@Override
	public int compareTo(Placement argSecond) {
		return this.getSequenceAsObject().compareTo(argSecond.getSequenceAsObject());
	}

	@Override
	public java.lang.Integer getIdAsObject() {
		return getPlacementOpal().getIdAsObject();
	}

	@Override
	public PlacementImpl setId(java.lang.Integer argId) {
		getPlacementOpal().setId(argId);
		return this;
	}

	@Override
	public PlacementImpl setId(int argId) {
		getPlacementOpal().setId(argId);
		return this;
	}

	@Override
	public java.lang.Integer getQuestionIdAsObject() {
		return getPlacementOpal().getQuestionIdAsObject();
	}

	@Override
	public PlacementImpl setQuestionId(java.lang.Integer argQuestionId) {
		getPlacementOpal().setQuestionId(argQuestionId);
		return this;
	}

	@Override
	public PlacementImpl setQuestionId(int argQuestionId) {
		getPlacementOpal().setQuestionId(argQuestionId);
		return this;
	}

	@Override
	public java.lang.Integer getPacketIdAsObject() {
		return getPlacementOpal().getPacketIdAsObject();
	}

	@Override
	public PlacementImpl setPacketId(java.lang.Integer argPacketId) {
		getPlacementOpal().setPacketId(argPacketId);
		return this;
	}

	@Override
	public PlacementImpl setPacketId(int argPacketId) {
		getPlacementOpal().setPacketId(argPacketId);
		return this;
	}

	@Override
	public java.lang.Integer getSequenceAsObject() {
		return getPlacementOpal().getSequenceAsObject();
	}

	@Override
	public PlacementImpl setSequence(java.lang.Integer argSequence) {
		getPlacementOpal().setSequence(argSequence);
		return this;
	}

	@Override
	public PlacementImpl setSequence(int argSequence) {
		getPlacementOpal().setSequence(argSequence);
		return this;
	}

	@Override
	public java.lang.Boolean isTiebreakerAsObject() {
		return getPlacementOpal().isTiebreakerAsObject();
	}

	@Override
	public PlacementImpl setTiebreaker(java.lang.Boolean argTiebreaker) {
		getPlacementOpal().setTiebreaker(argTiebreaker);
		return this;
	}

	@Override
	public PlacementImpl setTiebreaker(boolean argTiebreaker) {
		getPlacementOpal().setTiebreaker(argTiebreaker);
		return this;
	}

	@Override
	public java.lang.Boolean isScorecheckAfterAsObject() {
		return getPlacementOpal().isScorecheckAfterAsObject();
	}

	@Override
	public PlacementImpl setScorecheckAfter(java.lang.Boolean argScorecheckAfter) {
		getPlacementOpal().setScorecheckAfter(argScorecheckAfter);
		return this;
	}

	@Override
	public PlacementImpl setScorecheckAfter(boolean argScorecheckAfter) {
		getPlacementOpal().setScorecheckAfter(argScorecheckAfter);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** Access to the Packet object created from placement through reference placement_packet_id_fkey */

	@Override
	public Packet getPacket() {
		PacketOpal lclPacketOpal = getPlacementOpal().getPacketOpal();
		return lclPacketOpal == null ? null : lclPacketOpal.getUserFacing();
	}

	@Override
	public Placement setPacket(Packet argPacket) {
		getPlacementOpal().setPacketOpal(argPacket == null ? null : ((PacketImpl) argPacket).getPacketOpal());
		return this;
	}

	/** Access to the Question object created from placement through reference placement_question_id_fkey */

	@Override
	public Question getQuestion() {
		QuestionOpal lclQuestionOpal = getPlacementOpal().getQuestionOpal();
		return lclQuestionOpal == null ? null : lclQuestionOpal.getUserFacing();
	}

	@Override
	public Placement setQuestion(Question argQuestion) {
		getPlacementOpal().setQuestionOpal(argQuestion == null ? null : ((QuestionImpl) argQuestion).getQuestionOpal());
		return this;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public void addResponse(Response argResponse) {
		getPlacementOpal().addResponseOpal(((ResponseImpl) argResponse).getResponseOpal());
	}

	@Override
	public void removeResponse(Response argResponse) {
		getPlacementOpal().removeResponseOpal(((ResponseImpl) argResponse).getResponseOpal());
	}

	@Override
	public int getResponseCount() {
		return getPlacementOpal().getResponseOpalCount();
	}

	@Override
	public java.util.stream.Stream<Response> streamResponse() {
		return getPlacementOpal().streamResponseOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<Response> createResponseIterator() {
		return new com.opal.OpalIterator<> (getPlacementOpal().createResponseOpalIterator());
	}

	@Override
	public void clearResponse() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addReplacementForResponse(Response argResponse) {
		getPlacementOpal().addReplacementForResponseOpal(((ResponseImpl) argResponse).getResponseOpal());
	}

	@Override
	public void removeReplacementForResponse(Response argResponse) {
		getPlacementOpal().removeReplacementForResponseOpal(((ResponseImpl) argResponse).getResponseOpal());
	}

	@Override
	public int getReplacementForResponseCount() {
		return getPlacementOpal().getReplacementForResponseOpalCount();
	}

	@Override
	public java.util.stream.Stream<Response> streamReplacementForResponse() {
		return getPlacementOpal().streamReplacementForResponseOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<Response> createReplacementForResponseIterator() {
		return new com.opal.OpalIterator<> (getPlacementOpal().createReplacementForResponseOpalIterator());
	}

	@Override
	public void clearReplacementForResponse() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void unlink() {
		getPlacementOpal().unlink();
	}

	@Override
	public void reload() {
		getPlacementOpal().reload();
	}

	@Override
	public Placement copy() {
		return getPlacementOpal().copy().getUserFacing();
	}

}