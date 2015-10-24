package com.scobolsolo.servlets.tournament;

import java.util.Collections;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.Validate;

import com.google.common.collect.Multimap;
import com.google.common.collect.HashMultimap;

import com.siliconage.util.Tally;

import com.opal.TransactionContext;

import com.scobolsolo.application.Account;
import com.scobolsolo.application.Category;
import com.scobolsolo.application.CategoryGroup;
import com.scobolsolo.application.CategoryGroupFactory;
import com.scobolsolo.application.Packet;
import com.scobolsolo.application.PacketFactory;
import com.scobolsolo.application.Placement;
import com.scobolsolo.application.Tournament;
import com.scobolsolo.servlets.ScobolSoloControllerServlet;

public class OrderPackets extends ScobolSoloControllerServlet {
	private static final org.apache.log4j.Logger ourLogger = org.apache.log4j.Logger.getLogger(OrderPackets.class);
	private static final long serialVersionUID = 1L;
	private static final Random ourRandom = new Random(System.currentTimeMillis());
	
	public static final int SPAN_FOR_NO_CATEGORY_GROUP_REPEATS = 4;
	public static final Function<Placement, CategoryGroup> CATEGORY_GROUP_EXTRACTOR = argPL -> argPL.getCategory().getCategoryGroup();
	
	private static final String DEFAULT_RETURN_URL = "/tournament/packets.jsp";
	
	@Override
	protected String processInternalTwo(final HttpServletRequest argRequest, final HttpSession argSession, final Account argUser) throws Exception {
		final Collection<Packet> lclPackets = Validate.notNull(PacketFactory.getInstance().multipleFromHttpRequest(argRequest));
		
		final Set<Tournament> lclTs = lclPackets.stream().map(Packet::getTournament).collect(Collectors.toSet());
		for (final Tournament lclT : lclTs) {
			Validate.isTrue(argUser.mayUpdate(lclT), "Not authorized to modify packets for " + lclT.getName());
		}
		
		for (final Packet lclP : lclPackets) {
			if (isOrdered(lclP)) {
				continue;
			} else {
				try (TransactionContext lclTC = TransactionContext.createAndActivate()) {
					while (!isOrdered(lclP)) {
						order(lclP); // it may take multiple attempts
					}
					Validate.isTrue(isOrdered(lclP));
					
					lclTC.complete();
				}
			}
		}
		
		String lclReturnUrl = getParedParameter(argRequest, "return");
		if (lclReturnUrl == null) {
			Validate.isTrue(lclTs.size() == 1, "When randomizing packets from multiple tournaments, a return URL must be specified");
			return DEFAULT_RETURN_URL + "?object=" + lclTs.iterator().next().getUniqueString();
		} else {
			return lclReturnUrl;
		}
	}
	
	public static boolean isOrdered(Packet lclP) {
		Validate.notNull(lclP);
		
		boolean lclNoRepeatedNumbers = areThereNoRepeatedNumbers(Arrays.asList(lclP.createPlacementArray()));
		if (!lclNoRepeatedNumbers) {
			ourLogger.debug(lclP.getName() + " has a repeated number");
			return false;
		}
		
		List<Placement> lclRegulation = lclP.getRegulationPlacements();
		
		int lclHalf = lclRegulation.size() / 2;
		List<Placement> lclFirstHalf = lclRegulation.subList(0, lclHalf);
		List<Placement> lclSecondHalf = lclRegulation.subList(lclHalf, lclRegulation.size());
		Validate.isTrue(Math.abs(lclFirstHalf.size() - lclSecondHalf.size()) <= 1);
		
		boolean lclHalvesSplit = isHalfSplittingValid(lclFirstHalf, lclSecondHalf);
		if (!lclHalvesSplit) {
			ourLogger.debug(lclP.getName() + " halves are not validly split");
			return false;
		}
		
		boolean lclFirstHalfNoRepeatsInSpan = areThereNoCategoryGroupRepeatsWithinSpan(lclFirstHalf, SPAN_FOR_NO_CATEGORY_GROUP_REPEATS);
		if (!lclFirstHalfNoRepeatsInSpan) {
			ourLogger.debug(lclP.getName() + " first half has category groups repeated too closely");
			return false;
		}
		
		boolean lclSecondHalfNoRepeatsInSpan = areThereNoCategoryGroupRepeatsWithinSpan(lclSecondHalf, SPAN_FOR_NO_CATEGORY_GROUP_REPEATS);
		if (!lclSecondHalfNoRepeatsInSpan) {
			ourLogger.debug(lclP.getName() + " second half has category groups repeated too closely");
			return false;
		}
		
		return true;
	}
	
	public static boolean areThereNoRepeatedNumbers(List<Placement> argPLs) {
		Validate.notNull(argPLs);
		Validate.noNullElements(argPLs);
		
		return argPLs.stream().mapToInt(Placement::getNumber).distinct().count() == argPLs.size();
	}
	
	public static boolean isHalfSplittingValid(List<Placement> argFirstHalf, List<Placement> argSecondHalf) {
		Validate.notNull(argFirstHalf);
		Validate.notNull(argSecondHalf);
		Validate.isTrue(Math.abs(argFirstHalf.size() - argSecondHalf.size()) <= 1);
		
		Tally<CategoryGroup> lclFirstHalfCategoryGroups = new Tally<CategoryGroup>().tally(argFirstHalf, CATEGORY_GROUP_EXTRACTOR);
		Tally<CategoryGroup> lclSecondHalfCategoryGroups = new Tally<CategoryGroup>().tally(argSecondHalf, CATEGORY_GROUP_EXTRACTOR);
		
		for (CategoryGroup lclCG : CategoryGroupFactory.getInstance().createAllArray()) {
			if (Math.abs(lclFirstHalfCategoryGroups.get(lclCG) - lclSecondHalfCategoryGroups.get(lclCG)) > 1) {
				ourLogger.debug("Halves not validly split for " + lclCG.getCode());
				ourLogger.debug("First half: " + lclFirstHalfCategoryGroups);
				ourLogger.debug("Second half: " + lclSecondHalfCategoryGroups);
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean areThereNoCategoryGroupRepeatsWithinSpan(List<Placement> argPLs, int argSpan) {
		Validate.notNull(argPLs);
		Validate.isTrue(argSpan > 0);
		
		for (int lclI = 0; lclI < argPLs.size() - argSpan; ++lclI) {
			List<Placement> argSection = argPLs.subList(lclI, lclI + argSpan);
			if (argSection.stream().map(Placement::getCategory).map(Category::getCategoryGroup).distinct().count() < argSection.size()) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void order(Packet lclP) {
		Validate.notNull(lclP);
		
		List<Placement> lclRegulation = lclP.getRegulationPlacements();
		if (lclRegulation.isEmpty()) {
			return;
		}
		int lclHalf = lclRegulation.size() / 2;
		
		// Split into halves
		Multimap<CategoryGroup, Placement> lclUnused = HashMultimap.create();
		for (Placement lclPL : lclRegulation) {
			lclUnused.put(CATEGORY_GROUP_EXTRACTOR.apply(lclPL), lclPL);
		}
		Multimap<CategoryGroup, Placement> lclFirstHalfMM = HashMultimap.create();
		Multimap<CategoryGroup, Placement> lclSecondHalfMM = HashMultimap.create();
		while (!lclUnused.isEmpty()) {
			Set<CategoryGroup> lclUnusedCategoryGroups = new HashSet<>(lclUnused.keySet()); // need to duplicate to avoid a ConcurrentModificationException
			for (CategoryGroup lclCG : lclUnusedCategoryGroups) {
				Placement lclPL = chooseAndRemove(lclUnused, lclCG);
				
				// Add to the half with fewer questions of this CategoryGroup.
				boolean lclAddToFirstHalf;
				if (lclFirstHalfMM.get(lclCG).size() < lclSecondHalfMM.get(lclCG).size()) {
					lclAddToFirstHalf = true;
				} else if (lclFirstHalfMM.get(lclCG).size() > lclSecondHalfMM.get(lclCG).size()) {
					lclAddToFirstHalf = false;
				} else {
					// The halves are balanced for this CategoryGroup. Add to the half with fewer questions overall.
					if (lclFirstHalfMM.size() < lclSecondHalfMM.size()) {
						lclAddToFirstHalf = true;
					} else if (lclFirstHalfMM.size() > lclSecondHalfMM.size()) {
						lclAddToFirstHalf = false;
					} else {
						// The halves have the same number of questions overall. Choose randomly which to add to.
						lclAddToFirstHalf = ourRandom.nextBoolean();
					}
				}
				
				
				if (lclAddToFirstHalf) {
					lclFirstHalfMM.put(lclCG, lclPL);
				} else {
					lclSecondHalfMM.put(lclCG, lclPL);
				}
			}
		}
		
		List<Placement> lclFirstHalf = new ArrayList<>(lclFirstHalfMM.values());
		assignNumbersBasedOnListOrder(lclFirstHalf, 1, 1);
		
		List<Placement> lclSecondHalf = new ArrayList<>(lclSecondHalfMM.values());
		assignNumbersBasedOnListOrder(lclSecondHalf, lclHalf+1, 1);
		
		Validate.isTrue(isHalfSplittingValid(lclFirstHalf, lclSecondHalf));
		
		
		// Order halves
		while (!areThereNoCategoryGroupRepeatsWithinSpan(lclFirstHalf, SPAN_FOR_NO_CATEGORY_GROUP_REPEATS)) {
			tryEnsuringNoCategoryGroupRepeatsWithinSpan(lclFirstHalf, SPAN_FOR_NO_CATEGORY_GROUP_REPEATS);
		}
		Validate.isTrue(areThereNoCategoryGroupRepeatsWithinSpan(lclFirstHalf, SPAN_FOR_NO_CATEGORY_GROUP_REPEATS));
		assignNumbersBasedOnListOrder(lclFirstHalf, 1, 1);
		
		while (!areThereNoCategoryGroupRepeatsWithinSpan(lclSecondHalf, SPAN_FOR_NO_CATEGORY_GROUP_REPEATS)) {
			tryEnsuringNoCategoryGroupRepeatsWithinSpan(lclSecondHalf, SPAN_FOR_NO_CATEGORY_GROUP_REPEATS);
		}
		Validate.isTrue(areThereNoCategoryGroupRepeatsWithinSpan(lclSecondHalf, SPAN_FOR_NO_CATEGORY_GROUP_REPEATS));
		assignNumbersBasedOnListOrder(lclSecondHalf, lclHalf+1, 1);
		
		Validate.isTrue(Math.abs(lclFirstHalf.size() - lclSecondHalf.size()) <= 1);
	}
	
	protected static Placement chooseAndRemove(Multimap<CategoryGroup, Placement> argChoices, CategoryGroup argGroupToChoose) {
		Validate.notNull(argChoices);
		Validate.isTrue(!argChoices.isEmpty());
		Validate.notNull(argGroupToChoose);
		
		List<Placement> lclChoices = new ArrayList<>(argChoices.get(argGroupToChoose));
		Validate.notEmpty(lclChoices);
		Validate.noNullElements(lclChoices);
		
		int lclChosenIndex = ourRandom.nextInt(lclChoices.size());
		
		Placement lclChosen = lclChoices.get(lclChosenIndex);
		Validate.notNull(lclChosen);
		Validate.isTrue(CATEGORY_GROUP_EXTRACTOR.apply(lclChosen) == argGroupToChoose);
		
		argChoices.remove(argGroupToChoose, lclChosen);
		
		return lclChosen;
	}
	
	protected static void tryEnsuringNoCategoryGroupRepeatsWithinSpan(List<Placement> argPLs, int argSpan) {
		Collections.shuffle(argPLs, ourRandom); // FIXME this is the worst algorithm in the history of ever
	}
	
	protected static void assignNumbersBasedOnListOrder(List<Placement> argPLs) {
		assignNumbersBasedOnListOrder(argPLs, 1, 1);
	}
	
	protected static void assignNumbersBasedOnListOrder(List<Placement> argPLs, int argFirstNumber, int argStep) {
		Validate.noNullElements(argPLs);
		
		int lclN = argFirstNumber;
		for (Placement lclPL : argPLs) {
			lclPL.setNumber(lclN);
			lclN += argStep;
		}
		
		argPLs.sort(null);
	}
}
