package com.scobolsolo.persistence;
import com.scobolsolo.application.Placement;
import com.opal.PersistenceException;

public interface PlacementOpalFactory extends com.opal.IdentityOpalFactory<Placement, PlacementOpal>, com.opal.OpalFactoryCreator<Placement, PlacementOpal> {

	public java.util.HashSet<PlacementOpal> forCategoryCodeCollection(java.lang.String argCategoryCode) throws com.opal.PersistenceException;

	default public java.util.HashSet<PlacementOpal> forCategoryOpalCollection(CategoryOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		java.lang.String lclCode = argParent.getCode();
		if (lclCode == null) { throw new IllegalStateException("Key value is null."); }
		return forCategoryCodeCollection(lclCode);
	}

	default public int forCategoryOpalCount(CategoryOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		throw new com.siliconage.util.UnimplementedOperationException();
	}

	public java.util.HashSet<PlacementOpal> forPacketIdCollection(java.lang.Integer argPacketId) throws com.opal.PersistenceException;

	default public java.util.HashSet<PlacementOpal> forPacketOpalCollection(PacketOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		java.lang.Integer lclId = argParent.getIdAsObject();
		if (lclId == null) { throw new IllegalStateException("Key value is null."); }
		return forPacketIdCollection(lclId);
	}

	default public int forPacketOpalCount(PacketOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		throw new com.siliconage.util.UnimplementedOperationException();
	}

	public java.util.HashSet<PlacementOpal> forQuestionIdCollection(java.lang.Integer argQuestionId) throws com.opal.PersistenceException;

	default public java.util.HashSet<PlacementOpal> forQuestionOpalCollection(QuestionOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		java.lang.Integer lclId = argParent.getIdAsObject();
		if (lclId == null) { throw new IllegalStateException("Key value is null."); }
		return forQuestionIdCollection(lclId);
	}

	default public int forQuestionOpalCount(QuestionOpal argParent) throws com.opal.PersistenceException {
		if (argParent == null) {
			throw new IllegalStateException("argParent is null.");
		}
		throw new com.siliconage.util.UnimplementedOperationException();
	}

	public PlacementOpal forId(java.lang.Integer argId) throws PersistenceException;
	public PlacementOpal forQuestionIdPacketId(java.lang.Integer argQuestionId, java.lang.Integer argPacketId) throws PersistenceException;
}
