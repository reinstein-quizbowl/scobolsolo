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
	public com.scobolsolo.persistence.PlacementOpal getOpal() {
		return getPlacementOpal();
	}

	@Override
	public com.scobolsolo.persistence.PlacementOpal getBottomOpal() {
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

	/** @return the Category object created from placement through reference placement_category_code_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.Category getCategory() {
		CategoryOpal lclCategoryOpal = getPlacementOpal().getCategoryOpal();
		return lclCategoryOpal == null ? null : lclCategoryOpal.getUserFacing();
	}

	@Override
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.Placement setCategory(com.scobolsolo.application.Category argCategory) {
		getPlacementOpal().setCategoryOpal(argCategory == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.Category, com.scobolsolo.persistence.CategoryOpal>) argCategory).getOpal());
		return this;
	}

	/** @return the Packet object created from placement through reference placement_packet_id_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.Packet getPacket() {
		PacketOpal lclPacketOpal = getPlacementOpal().getPacketOpal();
		return lclPacketOpal == null ? null : lclPacketOpal.getUserFacing();
	}

	@Override
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.Placement setPacket(com.scobolsolo.application.Packet argPacket) {
		getPlacementOpal().setPacketOpal(argPacket == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.Packet, com.scobolsolo.persistence.PacketOpal>) argPacket).getOpal());
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
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.Placement setQuestion(com.scobolsolo.application.Question argQuestion) {
		getPlacementOpal().setQuestionOpal(argQuestion == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.Question, com.scobolsolo.persistence.QuestionOpal>) argQuestion).getOpal());
		return this;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public java.util.Set<com.scobolsolo.application.Response> getBaseResponseSet() {
		return new com.opal.UserFacingBackCollectionSet<>(getPlacementOpal().getBaseResponseOpalSet());
	}

	@Override
	public java.util.Set<com.scobolsolo.application.Response> getReplacementResponseSet() {
		return new com.opal.UserFacingBackCollectionSet<>(getPlacementOpal().getReplacementResponseOpalSet());
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
