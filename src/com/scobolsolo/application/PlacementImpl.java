package com.scobolsolo.application;

import com.opal.Opal;
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
	protected com.opal.IdentityOpal<? extends Placement> getBottomOpal() {
		return getPlacementOpal();
	}

	@Override
	protected Opal<? super Placement>[] getOpalArray() {
		return (Opal<? super Placement>[]) new Opal<?>[] {
			getPlacementOpal(),
		};
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
	public void setId(java.lang.Integer argId) {
		getPlacementOpal().setId(argId);
		return;
	}

	@Override
	public void setId(int argId) {
		getPlacementOpal().setId(argId);
		return;
	}

	@Override
	public java.lang.Integer getQuestionIdAsObject() {
		return getPlacementOpal().getQuestionIdAsObject();
	}

	@Override
	public void setQuestionId(java.lang.Integer argQuestionId) {
		getPlacementOpal().setQuestionId(argQuestionId);
		return;
	}

	@Override
	public void setQuestionId(int argQuestionId) {
		getPlacementOpal().setQuestionId(argQuestionId);
		return;
	}

	@Override
	public java.lang.Integer getPacketIdAsObject() {
		return getPlacementOpal().getPacketIdAsObject();
	}

	@Override
	public void setPacketId(java.lang.Integer argPacketId) {
		getPlacementOpal().setPacketId(argPacketId);
		return;
	}

	@Override
	public void setPacketId(int argPacketId) {
		getPlacementOpal().setPacketId(argPacketId);
		return;
	}

	@Override
	public java.lang.Integer getSequenceAsObject() {
		return getPlacementOpal().getSequenceAsObject();
	}

	@Override
	public void setSequence(java.lang.Integer argSequence) {
		getPlacementOpal().setSequence(argSequence);
		return;
	}

	@Override
	public void setSequence(int argSequence) {
		getPlacementOpal().setSequence(argSequence);
		return;
	}

	@Override
	public java.lang.Boolean isTiebreakerAsObject() {
		return getPlacementOpal().isTiebreakerAsObject();
	}

	@Override
	public void setTiebreaker(java.lang.Boolean argTiebreaker) {
		getPlacementOpal().setTiebreaker(argTiebreaker);
		return;
	}

	@Override
	public void setTiebreaker(boolean argTiebreaker) {
		getPlacementOpal().setTiebreaker(argTiebreaker);
		return;
	}

	@Override
	public java.lang.Boolean isScorecheckAfterAsObject() {
		return getPlacementOpal().isScorecheckAfterAsObject();
	}

	@Override
	public void setScorecheckAfter(java.lang.Boolean argScorecheckAfter) {
		getPlacementOpal().setScorecheckAfter(argScorecheckAfter);
		return;
	}

	@Override
	public void setScorecheckAfter(boolean argScorecheckAfter) {
		getPlacementOpal().setScorecheckAfter(argScorecheckAfter);
		return;
	}

	/* The following methods allow direct access to the user objects for which
	this object has foreign keys in the database. */

	/** Access to the Packet object created from the table placement through foreign key placement_packet_id_fkey */

	@Override
	public Packet getPacket() {
		PacketOpal lclPacketOpal = getPlacementOpal().getPacketOpal();
		return lclPacketOpal == null ? null : lclPacketOpal.getUserFacing();
	}

	@Override
	public void setPacket(Packet argPacket) {
		getPlacementOpal().setPacketOpal(argPacket == null ? null : ((PacketImpl) argPacket).getPacketOpal());
		return;
	}

	/** Access to the Question object created from the table placement through foreign key placement_question_id_fkey */

	@Override
	public Question getQuestion() {
		QuestionOpal lclQuestionOpal = getPlacementOpal().getQuestionOpal();
		return lclQuestionOpal == null ? null : lclQuestionOpal.getUserFacing();
	}

	@Override
	public void setQuestion(Question argQuestion) {
		getPlacementOpal().setQuestionOpal(argQuestion == null ? null : ((QuestionImpl) argQuestion).getQuestionOpal());
		return;
	}

	/* The following methods allow access to the user objects that have foreign keys
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
