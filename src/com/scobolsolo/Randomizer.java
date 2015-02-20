package com.scobolsolo;

import java.util.Collections;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class Randomizer extends Standalone {
	private static final int PERMUTATIONS_NEEDED = 17;
	
	private static enum Group {SCIENCE, FINE_ART_MATH, HISTORY, LITERATURE, OTHER};
	
	private static enum Category {
		Physics(Group.SCIENCE), Biology(Group.SCIENCE), Chemistry(Group.SCIENCE), Math(Group.FINE_ART_MATH), OtherScience(Group.SCIENCE), UShistory(Group.HISTORY), EuropeanHistory(Group.HISTORY), WorldHistory(Group.HISTORY), MilitaryHistory(Group.HISTORY), USliterature(Group.LITERATURE), BritishLiterature(Group.LITERATURE), EuroWorldLiterature(Group.LITERATURE), Poetry(Group.LITERATURE), Painting(Group.FINE_ART_MATH), Music(Group.FINE_ART_MATH), OtherFineArt(Group.FINE_ART_MATH), ReligionMyth(Group.OTHER), SocSciPhilosophy(Group.OTHER), CurrentEvents(Group.OTHER), Geography(Group.OTHER);
		
		private final Group myGroup;
		
		private Category(final Group argG) {
			myGroup = argG;
		}
		
		public Group getGroup() {
			return myGroup;
		}
	}
	
	public static void main(final String[] args) throws Exception {
		try {
			Standalone.initialize();
			
			run(args);
			
		} finally {
			Standalone.shutdown();
		}
	}
	
	private static void run(final String[] args) throws Exception {
		int lclPermutationsFound = 0;
		
		while (lclPermutationsFound < PERMUTATIONS_NEEDED) {
			final List<Category> lclCs = new ArrayList<>(Arrays.asList(Category.values()));
			
			Collections.shuffle(lclCs);
			
			if (passes(lclCs)) {
				System.out.println(lclCs.toString());
				++lclPermutationsFound;
			}
		}
	}
	
	private static boolean passes(final List<Category> argCs) {
		return passesGroups(argCs) && passesAdjacency(argCs);
	}
	
	private static boolean passesGroups(final List<Category> argCs) {
		return noRepetitionsWithin(argCs.subList(0, 4)) && noRepetitionsWithin(argCs.subList(5, 9)) && noRepetitionsWithin(argCs.subList(10, 14)) && noRepetitionsWithin(argCs.subList(15, 19));
	}
	
	private static boolean noRepetitionsWithin(final List<Category> argCs) {
		final Set<Group> lclSeen = new HashSet<>();
		
		for (final Category lclC : argCs) {
			final Group lclG = lclC.getGroup();
			if (lclSeen.contains(lclG)) {
				return false;
			}
			
			lclSeen.add(lclG);
		}
		
		return true;
	}
	
	private static boolean passesAdjacency(final List<Category> argCs) {
		Group lclLast = null;
		for (Category lclC : argCs) {
			Group lclG = lclC.getGroup();
			if (lclLast != null && lclLast == lclG) {
				return false;
			}
			
			lclLast = lclG;
		}
		
		return true;
	}
}
