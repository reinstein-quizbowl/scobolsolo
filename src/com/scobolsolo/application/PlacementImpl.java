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
	public com.scobolsolo.application.Placement addBaseResponse(Response argResponse) {
		getPlacementOpal().addBaseResponseOpal(((ResponseImpl) argResponse).getResponseOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Placement removeBaseResponse(Response argResponse) {
		getPlacementOpal().removeBaseResponseOpal(((ResponseImpl) argResponse).getResponseOpal());
		return this;
	}

	@Override
	public int getBaseResponseCount() {
		return getPlacementOpal().getBaseResponseOpalCount();
	}

	@Override
	public java.util.stream.Stream<Response> streamBaseResponse() {
		return getPlacementOpal().streamBaseResponseOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<Response> createBaseResponseIterator() {
		return new com.opal.OpalIterator<> (getPlacementOpal().createBaseResponseOpalIterator());
	}

	@Override
	public com.scobolsolo.application.Placement addReplacementResponse(Response argResponse) {
		getPlacementOpal().addReplacementResponseOpal(((ResponseImpl) argResponse).getResponseOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Placement removeReplacementResponse(Response argResponse) {
		getPlacementOpal().removeReplacementResponseOpal(((ResponseImpl) argResponse).getResponseOpal());
		return this;
	}

	@Override
	public int getReplacementResponseCount() {
		return getPlacementOpal().getReplacementResponseOpalCount();
	}

	@Override
	public java.util.stream.Stream<Response> streamReplacementResponse() {
		return getPlacementOpal().streamReplacementResponseOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<Response> createReplacementResponseIterator() {
		return new com.opal.OpalIterator<> (getPlacementOpal().createReplacementResponseOpalIterator());
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
