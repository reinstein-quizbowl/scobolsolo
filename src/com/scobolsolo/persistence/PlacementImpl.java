package com.scobolsolo.persistence;


public class PlacementImpl extends com.opal.AbstractIdentityImpl<com.scobolsolo.application.Placement, com.scobolsolo.persistence.PlacementOpal> implements com.scobolsolo.application.Placement {

	private final com.scobolsolo.persistence.PlacementOpal myPlacementOpal;

	public PlacementImpl(PlacementOpal argPlacementOpal) {
		super();
		myPlacementOpal = org.apache.commons.lang3.Validate.notNull(argPlacementOpal);
	}

	protected com.scobolsolo.persistence.PlacementOpal getPlacementOpal() {
		return myPlacementOpal;
	}

	@Override
	protected com.opal.IdentityOpal<? extends com.scobolsolo.application.Placement> getOpal() {
		return getPlacementOpal();
	}

	@Override
	protected com.opal.IdentityOpal<? extends com.scobolsolo.application.Placement> getBottomOpal() {
		return getPlacementOpal();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getIdAsObject() {
		return getPlacementOpal().getIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.PlacementImpl setId(java.lang.Integer argId) {
		getPlacementOpal().setId(argId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.PlacementImpl setId(int argId) {
		getPlacementOpal().setId(argId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public java.lang.Integer getQuestionIdAsObject() {
		return getPlacementOpal().getQuestionIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.persistence.PlacementImpl setQuestionId(java.lang.Integer argQuestionId) {
		getPlacementOpal().setQuestionId(argQuestionId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.PlacementImpl setQuestionId(int argQuestionId) {
		getPlacementOpal().setQuestionId(argQuestionId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getPacketIdAsObject() {
		return getPlacementOpal().getPacketIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.PlacementImpl setPacketId(java.lang.Integer argPacketId) {
		getPlacementOpal().setPacketId(argPacketId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.PlacementImpl setPacketId(int argPacketId) {
		getPlacementOpal().setPacketId(argPacketId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getNumberAsObject() {
		return getPlacementOpal().getNumberAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.PlacementImpl setNumber(java.lang.Integer argNumber) {
		getPlacementOpal().setNumber(argNumber);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.PlacementImpl setNumber(int argNumber) {
		getPlacementOpal().setNumber(argNumber);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@Override
	public java.lang.Boolean isTiebreakerAsObject() {
		return getPlacementOpal().isTiebreakerAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@Override
	public com.scobolsolo.persistence.PlacementImpl setTiebreaker(java.lang.Boolean argTiebreaker) {
		getPlacementOpal().setTiebreaker(argTiebreaker);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.PlacementImpl setTiebreaker(boolean argTiebreaker) {
		getPlacementOpal().setTiebreaker(argTiebreaker);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@Override
	public java.lang.Boolean isScorecheckAfterAsObject() {
		return getPlacementOpal().isScorecheckAfterAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Default(value = "false")
	@Override
	public com.scobolsolo.persistence.PlacementImpl setScorecheckAfter(java.lang.Boolean argScorecheckAfter) {
		getPlacementOpal().setScorecheckAfter(argScorecheckAfter);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.PlacementImpl setScorecheckAfter(boolean argScorecheckAfter) {
		getPlacementOpal().setScorecheckAfter(argScorecheckAfter);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getCategoryCode() {
		return getPlacementOpal().getCategoryCode();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public com.scobolsolo.persistence.PlacementImpl setCategoryCode(java.lang.String argCategoryCode) {
		getPlacementOpal().setCategoryCode(argCategoryCode);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the Packet object created from placement through reference placement_packet_id_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.Packet getPacket() {
		PacketOpal lclPacketOpal = getPlacementOpal().getPacketOpal();
		return lclPacketOpal == null ? null : lclPacketOpal.getUserFacing();
	}

	@Override
	public com.scobolsolo.application.Placement setPacket(com.scobolsolo.application.Packet argPacket) {
		getPlacementOpal().setPacketOpal(argPacket == null ? null : ((PacketImpl) argPacket).getPacketOpal());
		return this;
	}

	/** @return the Question object created from placement through reference placement_question_id_fkey */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.scobolsolo.application.Question getQuestion() {
		QuestionOpal lclQuestionOpal = getPlacementOpal().getQuestionOpal();
		return lclQuestionOpal == null ? null : lclQuestionOpal.getUserFacing();
	}

	@Override
	public com.scobolsolo.application.Placement setQuestion(com.scobolsolo.application.Question argQuestion) {
		getPlacementOpal().setQuestionOpal(argQuestion == null ? null : ((QuestionImpl) argQuestion).getQuestionOpal());
		return this;
	}

	/** @return the Category object created from placement through reference placement_category_code_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.Category getCategory() {
		CategoryOpal lclCategoryOpal = getPlacementOpal().getCategoryOpal();
		return lclCategoryOpal == null ? null : lclCategoryOpal.getUserFacing();
	}

	@Override
	public com.scobolsolo.application.Placement setCategory(com.scobolsolo.application.Category argCategory) {
		getPlacementOpal().setCategoryOpal(argCategory == null ? null : ((CategoryImpl) argCategory).getCategoryOpal());
		return this;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public com.scobolsolo.application.Placement addBaseResponse(com.scobolsolo.application.Response argResponse) {
		getPlacementOpal().addBaseResponseOpal(((ResponseImpl) argResponse).getResponseOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Placement removeBaseResponse(com.scobolsolo.application.Response argResponse) {
		getPlacementOpal().removeBaseResponseOpal(((ResponseImpl) argResponse).getResponseOpal());
		return this;
	}

	@Override
	public int getBaseResponseCount() {
		return getPlacementOpal().getBaseResponseOpalCount();
	}

	@Override
	public java.util.stream.Stream<com.scobolsolo.application.Response> streamBaseResponse() {
		return getPlacementOpal().streamBaseResponseOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<com.scobolsolo.application.Response> createBaseResponseIterator() {
		return new com.opal.OpalIterator<> (getPlacementOpal().createBaseResponseOpalIterator());
	}

	@Override
	public com.scobolsolo.application.Placement addReplacementResponse(com.scobolsolo.application.Response argResponse) {
		getPlacementOpal().addReplacementResponseOpal(((ResponseImpl) argResponse).getResponseOpal());
		return this;
	}

	@Override
	public com.scobolsolo.application.Placement removeReplacementResponse(com.scobolsolo.application.Response argResponse) {
		getPlacementOpal().removeReplacementResponseOpal(((ResponseImpl) argResponse).getResponseOpal());
		return this;
	}

	@Override
	public int getReplacementResponseCount() {
		return getPlacementOpal().getReplacementResponseOpalCount();
	}

	@Override
	public java.util.stream.Stream<com.scobolsolo.application.Response> streamReplacementResponse() {
		return getPlacementOpal().streamReplacementResponseOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<com.scobolsolo.application.Response> createReplacementResponseIterator() {
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
	public com.scobolsolo.application.Placement copy() {
		return getPlacementOpal().copy().getUserFacing();
	}

}
