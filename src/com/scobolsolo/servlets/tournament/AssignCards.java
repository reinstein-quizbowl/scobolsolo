package com.scobolsolo.servlets.tournament;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.Validate;

import com.opal.TransactionContext;

import com.scobolsolo.application.*;
import com.scobolsolo.servlets.ScobolSoloControllerServlet;

public class AssignCards extends ScobolSoloControllerServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String RETURN_URL = "/tournament/players.jsp";
	
	@Override
	protected String processInternalTwo(final HttpServletRequest argRequest, final HttpSession argSession, final Account argUser) {
		final Phase lclPhase = Validate.notNull(PhaseFactory.getInstance().fromHttpRequest(argRequest));
		final Tournament lclT = lclPhase.getTournament();
		Validate.isTrue(argUser.mayManageCardSystem(lclT), "Not authorized");
		
		Validate.isTrue(lclT.hasValidSeeds());
		
		final List<Player> lclPlayers = lclT.getPlayers();
		final int lclFieldSize = lclPlayers.size();
		
		final Card[] lclCards = lclPhase.createCardArray();
		Arrays.sort(lclCards);
		
		try (TransactionContext lclTC = TransactionContext.createAndActivate()) {
			normalizeSeeds(lclT);
			
			// Disguise the seeds
			// TODO: Does this work if the field size isn't a power of 2?
			final Random lclRand = new Random();
			int[] lclInitialAssignments = new int[lclFieldSize]; // lclInitialAssignments[i] is the card initially assigned to seed i
			lclInitialAssignments[0] = 0;
			lclInitialAssignments[1] = 1;
			
			int lclPod = 1;
			while (lclPod <= largestPowerOfTwoDividing(lclFieldSize)/2) {
				final int[] lclShuffledAssignments = new int[2*lclPod + 1];
				for (int i = 1; i <= lclPod; ++i) {
					final int lclPartner = 2*lclPod + 1 - i;
					
					final boolean lclFlip = lclRand.nextBoolean();
					
					if (lclFlip) {
						lclShuffledAssignments[i] = 2*lclPod + 1 - lclInitialAssignments[i];
						lclShuffledAssignments[lclPartner] = lclInitialAssignments[i];
					} else {
						lclShuffledAssignments[i] = lclInitialAssignments[i];
						lclShuffledAssignments[lclPartner] = 2*lclPod + 1 - lclInitialAssignments[i];
					}
				}
				
				lclInitialAssignments = lclShuffledAssignments;
				lclPod *= 2;
			}
			
			// Save the seeds
			for (final Player lclP : lclPlayers) {
				final Integer lclSeedObject = Validate.notNull(lclP.getSeedAsObject());
				final int lclSeed = lclSeedObject.intValue();
				
				final Card lclC = lclCards[lclInitialAssignments[lclSeed] - 1];
				
				lclC.setInitialPlayer(lclP);
			}
			
			// Copy them over into the Games, creating Games if necessary
			final RoundGroup[] lclRGs = Validate.notEmpty(lclPhase.createRoundGroupArray());
			Arrays.sort(lclRGs);
			final RoundGroup lclFirst = Validate.notNull(lclRGs[0]);
			for (final Round lclR : lclFirst.createRoundArray()) {
				for (final Match lclM : lclR.createMatchArray()) {
					final Card lclW = Validate.notNull(lclM.getWinningCard());
					final Card lclL = Validate.notNull(lclM.getLosingCard());
					
					final Player lclWP = Validate.notNull(lclW.getInitialPlayer());
					final Player lclLP = Validate.notNull(lclL.getInitialPlayer());
					
					Game lclG = lclM.getGame();
					
					if (lclG == null) {
						lclG = GameFactory.getInstance().create();
						lclM.setGame(lclG);
					}
					
					lclG.setIncomingWinningCardPlayer(lclWP);
					lclG.setIncomingLosingCardPlayer(lclLP);
				}
			}
			
			lclTC.complete();
		}
		
		return RETURN_URL + "?object=" + lclT.getUniqueString();
	}
	
	
	public static void normalizeSeeds(final Tournament argT) {
		Validate.notNull(argT);
		
		final List<Player> lclPlayers = argT.getPlayers();
		lclPlayers.sort(Player.SeedComparator.getInstance());
		
		int lclSeed = 1;
		for (final Player lclP : lclPlayers) {
			Validate.notNull(lclP.getSeedAsObject());
			lclP.setSeed(lclSeed);
			++lclSeed;
		}
	}
	
	public static int largestPowerOfTwoDividing(final int argI) {
		Validate.isTrue(argI >= 1, "Argument must be positive");
		
		int lclI = argI;
		int lclPower = 0;
		while (lclI > 0 && lclI % 2 == 0) {
			++lclPower;
			lclI /= 2;
		}
		
		final int lclTwoToPower = (int) Math.pow(2, lclPower);
		
		Validate.isTrue(argI % lclTwoToPower == 0);
		Validate.isTrue(argI % (lclTwoToPower+1) != 0);
		
		return lclTwoToPower;
	}
}
