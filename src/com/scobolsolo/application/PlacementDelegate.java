package com.scobolsolo.application;

import java.util.Arrays;

import org.apache.commons.lang3.Validate;

public abstract class PlacementDelegate {
	static Placement findReplacement(final Placement argPL) {
		// TODO: Add arguments for the players involved (Player[] because of the championship) and make sure the question returned hasn't been heard by any of them!
		
		Validate.notNull(argPL);
		
		final Category lclC = argPL.getQuestion().getCategory();
		
		final Packet lclReplacementPacket = argPL.getPacket().getReplacementPacket();
		if (lclReplacementPacket == null || lclReplacementPacket == argPL.getPacket()) {
			return null;
		}
		
		final Placement[] lclReplacements = lclReplacementPacket.createPlacementArray();
		Arrays.sort(lclReplacements, Placement.StandardComparator.getInstance());
		
		// Try to find a question in the replacement packet with the same Category
		for (final Placement lclReplacementCandidate : lclReplacements) {
			if (lclReplacementCandidate.getQuestion().getCategory() == lclC) {
				return lclReplacementCandidate;
			}
		}
		
		// No question in the same category was available. Try the same CategoryGroup.
		for (final Placement lclReplacementCandidate : lclReplacements) {
			if (lclReplacementCandidate.getQuestion().getCategory().getCategoryGroup() == lclC.getCategoryGroup()) {
				return lclReplacementCandidate;
			}
		}
		
		// We can't find anything.
		return null;
	}
	
	static String generateResponseKey(final Placement argPL, final Player argPlayer) {
		Validate.notNull(argPL);
		Validate.notNull(argPlayer);
		
		return "placement_id_" + argPL.getUniqueString() + "_player_id_" + argPlayer.getUniqueString() +"_response_type_id";
	}
	
	static String getString(final Placement argPL) {
		Validate.notNull(argPL);
		
		return argPL.getPacket().getName() + ", #" + argPL.getSequence() + (argPL.isTiebreaker() ? " (TB)" : "");
	}
	
	static String getDescription(final Placement argPL) {
		Validate.notNull(argPL);
		
		return "#" + argPL.getSequence() + " in packet " + argPL.getPacket().getShortName() + " (" + argPL.getQuestion().getDescription() + "; ID " + argPL.getId() + ")";
	}
}
