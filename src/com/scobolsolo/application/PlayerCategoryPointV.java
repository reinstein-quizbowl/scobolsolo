package com.scobolsolo.application;

import java.util.Comparator;

import com.scobolsolo.persistence.PlayerCategoryPointVUserFacing;

/**
 * This interface may be changed at will.
 *
 * <p>This interface and the {@link PlayerCategoryPointVFactory} class are the only two automatically generated files for this type that are intended to be referenced in user code. Other automatically generated files package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */

public interface PlayerCategoryPointV extends PlayerCategoryPointVUserFacing {
	static final Comparator<PlayerCategoryPointV> POINTS_AND_NAME_COMPARATOR = Comparator
		.<PlayerCategoryPointV>comparingInt(argPCPV -> -1 * argPCPV.getPoints(0)) // descending order of points
		.thenComparing(PlayerCategoryPointV::getPlayer, Player.NameComparator.getInstance())
		.thenComparing(PlayerCategoryPointV::getPlayer, Player.IdComparator.getInstance()); // no ties
	
	public static final Comparator<PlayerCategoryPointV> CATEGORY_COMPARATOR = Comparator
		.comparing(PlayerCategoryPointV::getCategory)
		.thenComparing(POINTS_AND_NAME_COMPARATOR);
	
	public static final Comparator<PlayerCategoryPointV> PPTUH_COMPARATOR = Comparator
		.comparingDouble(PlayerCategoryPointV::getPPTUH).reversed()
		.thenComparing(POINTS_AND_NAME_COMPARATOR);
	
	default double getPPTUH() {
		if (getTossupsHeard(0) == 0) {
			return 0.0d;
		}
		
		return 1.0d * getPoints(0) / getTossupsHeard(0);
	}
}
