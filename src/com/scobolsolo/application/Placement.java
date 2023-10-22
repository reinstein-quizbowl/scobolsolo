package com.scobolsolo.application;

import java.util.Comparator;
import java.util.Arrays;

import org.apache.commons.lang3.Validate;

import com.scobolsolo.persistence.PlacementUserFacing;

/**
 * This interface may be changed at will.
 *
 * <p>This interface and the {@link PlacementFactory} class are the only two automatically generated files for this type that are intended to be referenced in user code. Other automatically generated files package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */

public interface Placement extends PlacementUserFacing, Comparable<Placement> {
	static final Comparator<Placement> NATURAL_COMPARATOR = Comparator.comparing(Placement::getPacket).thenComparingInt(Placement::getNumber);
	
	@Override
	default int compareTo(Placement that) {
		return NATURAL_COMPARATOR.compare(this, that);
	}
	
	default boolean isReplaceable() {
		return findReplacement() != null;
	}
	
	default Placement findReplacement() {
		// TODO: Add arguments for the players involved (Player[] because of the championship) and make sure the question returned hasn't been heard by any of them!
		
		final Packet lclReplacementPacket = getPacket().getReplacementPacket();
		if (lclReplacementPacket == null || lclReplacementPacket == getPacket()) {
			return null;
		}
		
		final Placement[] lclReplacements = lclReplacementPacket.createPlacementArray();
		Arrays.sort(lclReplacements);
		
		final Category lclC = getCategory();
		Validate.isTrue(isEmpty() || lclC == getQuestion().getCategory(), "Category mismatch for placement #" + getId());
		
		// Try to find a question in the replacement packet with the same Category
		for (final Placement lclReplacementCandidate : lclReplacements) {
			if (lclReplacementCandidate.isFilled() && lclReplacementCandidate.getQuestion().getCategory() == lclC) {
				return lclReplacementCandidate;
			}
		}
		
		// No question in the same category was available. Try the same CategoryGroup.
		for (final Placement lclReplacementCandidate : lclReplacements) {
			if (lclReplacementCandidate.isFilled() && lclReplacementCandidate.getQuestion().getCategory().getCategoryGroup() == lclC.getCategoryGroup()) {
				return lclReplacementCandidate;
			}
		}
		
		// We can't find anything.
		return null;
	}
	
	default String generateResponseKey(final Player argPlayer) {
		Validate.notNull(argPlayer);
		
		return "placement_id_" + getUniqueString() + "_player_id_" + argPlayer.getUniqueString() +"_response_type_id";
	}
	
	default String getString() {
		return getPacket().getName() + ", #" + getNumberString();
	}
	
	default String getNumberString() {
		return getNumber() + (isOvertime() ? " (OT)" : "");
	}
	
	default String getDescription() {
		return "#" + getNumber() + " in packet " + getPacket().getShortName() + " (" + getQuestion().getDescription() + "; ID " + getId() + ")";
	}
	
	default Tournament getTournament() {
		return getPacket().getTournament();
	}
	
	default boolean isFilled() {
		return getQuestion() != null;
	}
	
	default boolean isEmpty() {
		return !isFilled();
	}
	
	default String getNumberStringWithQuestionDescription() {
		if (isFilled()) {
			return getNumberString() + ": " + getQuestion().getDescription();
		} else {
			return getNumberString() + " [empty]";
		}
	}
}
