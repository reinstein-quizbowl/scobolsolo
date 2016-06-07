package com.scobolsolo.application;

import com.scobolsolo.persistence.PlacementOpal;
import com.scobolsolo.persistence.PacketOpal;
import com.scobolsolo.persistence.QuestionOpal;
import com.scobolsolo.persistence.CategoryOpal;

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

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getIdAsObject() {
		return getPlacementOpal().getIdAsObject();
	}

	@com.opal.annotation.Nullability(nullable = false)
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

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getQuestionIdAsObject() {
		return getPlacementOpal().getQuestionIdAsObject();
	}

	@com.opal.annotation.Nullability(nullable = true)
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

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getPacketIdAsObject() {
		return getPlacementOpal().getPacketIdAsObject();
	}

	@com.opal.annotation.Nullability(nullable = false)
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

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getNumberAsObject() {
		return getPlacementOpal().getNumberAsObject();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public PlacementImpl setNumber(java.lang.Integer argNumber) {
		getPlacementOpal().setNumber(argNumber);
		return this;
	}

	@Override
	public PlacementImpl setNumber(int argNumber) {
		getPlacementOpal().setNumber(argNumber);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@Override
	public java.lang.Boolean isTiebreakerAsObject() {
		return getPlacementOpal().isTiebreakerAsObject();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
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

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@Override
	public java.lang.Boolean isScorecheckAfterAsObject() {
		return getPlacementOpal().isScorecheckAfterAsObject();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
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

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getCategoryCode() {
		return getPlacementOpal().getCategoryCode();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public PlacementImpl setCategoryCode(java.lang.String argCategoryCode) {
		getPlacementOpal().setCategoryCode(argCategoryCode);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the Packet object created from placement through reference placement_packet_id_fkey */

	@com.opal.annotation.Nullability(nullable = false)
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

	/** @return the Question object created from placement through reference placement_question_id_fkey */

	@com.opal.annotation.Nullability(nullable = true)
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

	/** @return the Category object created from placement through reference placement_category_code_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public Category getCategory() {
		CategoryOpal lclCategoryOpal = getPlacementOpal().getCategoryOpal();
		return lclCategoryOpal == null ? null : lclCategoryOpal.getUserFacing();
	}

	@Override
	public Placement setCategory(Category argCategory) {
		getPlacementOpal().setCategoryOpal(argCategory == null ? null : ((CategoryImpl) argCategory).getCategoryOpal());
		return this;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public com.scobolsolo.application.Placement addResponse(Response argResponse) {
		getPlacementOpal().addResponseOpal(((ResponseImpl) argResponse).getResponseOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Placement removeResponse(Response argResponse) {
		getPlacementOpal().removeResponseOpal(((ResponseImpl) argResponse).getResponseOpal());
		return this;
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
	public com.scobolsolo.application.Placement addReplacementForResponse(Response argResponse) {
		getPlacementOpal().addReplacementForResponseOpal(((ResponseImpl) argResponse).getResponseOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Placement removeReplacementForResponse(Response argResponse) {
		getPlacementOpal().removeReplacementForResponseOpal(((ResponseImpl) argResponse).getResponseOpal());
		return this;
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
