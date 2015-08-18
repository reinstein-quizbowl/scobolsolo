package com.scobolsolo.persistence;
import com.scobolsolo.application.Placement;
import com.opal.PersistenceException;

public interface PlacementOpalFactory extends com.opal.OpalFactory<Placement, PlacementOpal>, com.opal.OpalFactoryCreator<Placement, PlacementOpal> {
	public java.util.HashSet<PlacementOpal> forPacketIdCollection(java.lang.Integer argPacketId) throws com.opal.PersistenceException;
	public java.util.HashSet<PlacementOpal> forQuestionIdCollection(java.lang.Integer argQuestionId) throws com.opal.PersistenceException;
	public java.util.HashSet<PlacementOpal> forCategoryCodeCollection(java.lang.String argCategoryCode) throws com.opal.PersistenceException;
	public PlacementOpal forId(java.lang.Integer argId) throws PersistenceException;
	public PlacementOpal forQuestionIdPacketId(java.lang.Integer argQuestionId, java.lang.Integer argPacketId) throws PersistenceException;
}
