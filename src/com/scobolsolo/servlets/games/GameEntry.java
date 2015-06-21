package com.scobolsolo.servlets.games;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.Validate;

import com.opal.TransactionContext;

import com.scobolsolo.application.*;
import com.scobolsolo.matches.*;
import com.scobolsolo.servlets.ScobolSoloControllerServlet;

public class GameEntry extends ScobolSoloControllerServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String RETURN_URL = "/games/dual-game-enter.jsp";
	
	@Override
	protected String processInternalTwo(final HttpServletRequest argRequest, final HttpSession argSession, final Account argUser) throws Exception {
		final Game lclG = Validate.notNull(GameFactory.getInstance().fromHttpRequest(argRequest));
		final Match lclM = Validate.notNull(lclG.getMatch());
		
		final Round lclRound = lclM.getRound();
		
		final boolean lclFlip = Boolean.parseBoolean(argRequest.getParameter("flip"));
		final String lclFlipString = lclFlip ? "&flip=true" : "";
		
		final String lclReturnUrl = RETURN_URL + "?match_id=" + lclM.getId() + lclFlipString;
		
		final GameEntryResult lclResult = new GameEntryResult(lclG);
		argSession.setAttribute("com.scobolsolo.matches.GameEntryResult", lclResult);
		
		Integer lclTUH = null;
		final String lclTUHString = argRequest.getParameter("tossups_heard");
		if (lclTUHString != null) {
			try {
				lclTUH = Integer.parseInt(lclTUHString);
			} catch (NumberFormatException lclNFE) {
				passBackMessage("The number of tossups heard (" + lclTUHString + ") is invalid."); // just a warning
			}
		}
		
		final Player lclIWCPlayer = Validate.notNull(lclG.getIncomingWinningCardPlayer());
		final Player lclILCPlayer = Validate.notNull(lclG.getIncomingLosingCardPlayer());
		
		ResponseType DEFAULT_RESPONSE_TYPE = null;
		for (final ResponseType lclRT : ResponseTypeFactory.getInstance().createAllArray()) {
			if (lclRT.isDefault()) {
				DEFAULT_RESPONSE_TYPE = lclRT;
			}
		}
		Validate.notNull(DEFAULT_RESPONSE_TYPE);
		
		try (TransactionContext lclTC = TransactionContext.createAndActivate()) {			
			if (lclTUH != null) {
				lclG.setTossupsHeard(lclTUH);
			}
			
			Performance lclIWCPerformance = null;
			Performance lclILCPerformance = null;
			
			for (final Performance lclP : lclG.createPerformanceArray()) {
				if (lclP.getPlayer() == lclIWCPlayer) {
					lclIWCPerformance = lclP;
				} else if (lclP.getPlayer() == lclILCPlayer) {
					lclILCPerformance = lclP;
				}
				
				for (final Response lclOldResponse : lclP.createResponseArray()) {
					lclOldResponse.unlink();
				}
			}
			
			if (lclIWCPerformance == null) {
				lclIWCPerformance = PerformanceFactory.getInstance().create();
				lclIWCPerformance.setGame(lclG);
				lclIWCPerformance.setPlayer(lclIWCPlayer);
			}
			
			if (lclILCPerformance == null) {
				lclILCPerformance = PerformanceFactory.getInstance().create();
				lclILCPerformance.setGame(lclG);
				lclILCPerformance.setPlayer(lclILCPlayer);
			}
			
			int lclIWCScore = 0;
			int lclILCScore = 0;
			
			
			final Packet[] lclPackets = lclRound.createPacketArray();
			Arrays.sort(lclPackets, Packet.StandardComparator.getInstance());
			
			// Packets:
			for (final Packet lclPacket : lclPackets) {
				final Placement[] lclPlacements = lclPacket.createPlacementArray();
				Arrays.sort(lclPlacements, Placement.StandardComparator.getInstance());
				
				// Placements:
				for (final Placement lclPL : lclPlacements) {
					final String lclDescription = lclPL.getDescription();
					
					ResponseType lclIWCResponseType, lclILCResponseType;
					
					final String lclIWCResponseTypeCode = argRequest.getParameter(lclPL.generateResponseKey(lclIWCPlayer));
					if (lclIWCResponseTypeCode == null) {
						passBackMessage("No response found for " + lclIWCPlayer.getContact().getName() + " to " + lclDescription + "; assuming " + DEFAULT_RESPONSE_TYPE.getShortName()); // just a warning
						lclIWCResponseType = DEFAULT_RESPONSE_TYPE;
					} else {
						lclIWCResponseType = ResponseTypeFactory.getInstance().forCode(lclIWCResponseTypeCode);
						if (lclIWCResponseType == null) {
							passBackError("Invalid response type code '" + lclIWCResponseTypeCode + "' for " + lclIWCPlayer.getContact().getName() + " to " + lclDescription);
						}
					}
					
					final String lclILCResponseTypeCode = argRequest.getParameter(lclPL.generateResponseKey(lclILCPlayer));
					if (lclILCResponseTypeCode == null) {
						passBackMessage("No response found for " + lclILCPlayer.getContact().getName() + " to " + lclDescription + "; assuming " + DEFAULT_RESPONSE_TYPE.getShortName()); // just a warning
						lclILCResponseType = DEFAULT_RESPONSE_TYPE;
					} else {
						lclILCResponseType = ResponseTypeFactory.getInstance().forCode(lclILCResponseTypeCode);
						if (lclILCResponseType == null) {
							passBackError("Invalid response type code '" + lclILCResponseTypeCode + "' for " + lclILCPlayer.getContact().getName() + " to " + lclDescription);
						}
					}
					
					if (lclIWCResponseType == lclILCResponseType && !lclIWCResponseType.isMultipleAllowedForSamePlacement()) {
						passBackError("There are multiple \"" + lclIWCResponseType.getShortName() + "\" responses to " + lclDescription + ", which is not permitted");
					}
					
					
					// Tiebreakers are only allowed if the score, thus far, is tied.
					if (lclPL.isTiebreaker()) {
						if (lclIWCResponseType == ResponseTypeFactory.NO_ATTEMPT() && lclILCResponseType == ResponseTypeFactory.NO_ATTEMPT()) {
							continue;
						} else {
							if (lclIWCScore != lclILCScore) {
								passBackError(lclDescription + " is a tiebreaker question, but the score was not tied going into it (specifically, the score was " + lclIWCScore + '-' + lclILCScore + "), so there should be no responses recorded.");
							}
						}
					}
					
					final Response lclIWCResponse = ResponseFactory.getInstance().create();
					lclIWCResponse.setPerformance(lclIWCPerformance);
					lclIWCResponse.setResponseType(lclIWCResponseType);
					
					final Response lclILCResponse = ResponseFactory.getInstance().create();
					lclILCResponse.setPerformance(lclILCPerformance);
					lclILCResponse.setResponseType(lclILCResponseType);
					
					// Was the question replaced?
					final Placement lclReplacement = PlacementFactory.getInstance().fromHttpRequest(argRequest, "replaced_placement_unique_string_" + lclPL.getUniqueString());
					if (lclReplacement != null) {
						// Yep.
						lclIWCResponse.setPlacement(lclReplacement);
						lclIWCResponse.setReplacementForPlacement(lclPL);
						
						lclILCResponse.setPlacement(lclReplacement);
						lclILCResponse.setReplacementForPlacement(lclPL);
					} else {
						// Nope.
						lclIWCResponse.setPlacement(lclPL);
						lclIWCResponse.setReplacementForPlacement(null); // That's the default, but let's just be sure.
						
						lclILCResponse.setPlacement(lclPL);
						lclILCResponse.setReplacementForPlacement(null); // That's the default, but let's just be sure.
					}
					// TODO: It's possible that one of the players heard a replacement question and the other heard the original question, for instance if player A negs and the moderator reveals the correct answer before player B has a chance. We currently have no way to indicate this from the web interface.
					
					lclIWCScore += lclIWCResponseType.getPoints();
					lclILCScore += lclILCResponseType.getPoints();
				}
			}
			
			if (lclIWCScore == lclILCScore) {
				passBackError("There is a tie (" + lclIWCScore + '-' + lclILCScore + "). Ties must be broken.");
			}
			
			
			if (passBackErrorsExist()) {
				return lclReturnUrl;
			}
			
			final Match lclNextMatchForWinner = lclM.getWinningCard().getNextMatch(lclRound);
			Game lclNextGameForWinner = null;
			if (lclNextMatchForWinner != null) {
				lclNextGameForWinner = lclNextMatchForWinner.getGame();
				if (lclNextGameForWinner == null) {
					lclNextGameForWinner = GameFactory.getInstance().create();
					lclNextGameForWinner.setMatch(lclNextMatchForWinner);
					lclNextGameForWinner.setModeratorStaff(lclNextMatchForWinner.determineLikelyModerator());
					lclNextMatchForWinner.setGame(lclNextGameForWinner);
				}
			}
			
			final Match lclNextMatchForLoser = lclM.getLosingCard().getNextMatch(lclRound);
			Game lclNextGameForLoser = null;
			if (lclNextMatchForLoser != null) {
				lclNextGameForLoser = lclNextMatchForLoser.getGame();
				if (lclNextGameForLoser == null) {
					lclNextGameForLoser = GameFactory.getInstance().create();
					lclNextGameForLoser.setMatch(lclNextMatchForLoser);
					lclNextGameForLoser.setModeratorStaff(lclNextMatchForLoser.determineLikelyModerator());
					lclNextMatchForLoser.setGame(lclNextGameForLoser);
				}
			}
			
			if (lclIWCScore > lclILCScore) {
				// Cards weren't traded
				
				lclG.setOutgoingWinningCardPlayer(lclIWCPlayer);
				lclG.setOutgoingLosingCardPlayer(lclILCPlayer);
				
				if (lclNextMatchForWinner != null) {
					Validate.notNull(lclNextGameForWinner);
					if (lclNextMatchForWinner.getWinningCard() == lclM.getWinningCard()) {
						lclNextGameForWinner.setIncomingWinningCardPlayer(lclIWCPlayer);
					} else if (lclNextMatchForWinner.getLosingCard() == lclM.getWinningCard()) {
						lclNextGameForWinner.setIncomingLosingCardPlayer(lclIWCPlayer);
					} else {
						throw new IllegalStateException("lclNextMatchForWinner isn't actually the next match for the winner");
					}
				}
				
				if (lclNextMatchForLoser != null) {
					Validate.notNull(lclNextGameForLoser);
					if (lclNextMatchForLoser.getWinningCard() == lclM.getLosingCard()) {
						lclNextGameForLoser.setIncomingWinningCardPlayer(lclILCPlayer);
					} else if (lclNextMatchForLoser.getLosingCard() == lclM.getLosingCard()) {
						lclNextGameForLoser.setIncomingLosingCardPlayer(lclILCPlayer);
					} else {
						throw new IllegalStateException("lclNextMatchForLoser isn't actually the next match for the loser");
					}
				}
				
				lclResult.setWinnerPlayer(lclIWCPlayer);
				lclResult.setNextMatchForWinner(lclNextMatchForWinner);
				lclResult.setLoserPlayer(lclILCPlayer);
				lclResult.setNextMatchForLoser(lclNextMatchForLoser);
			} else if (lclILCScore > lclIWCScore) {
				// Cards were traded
				
				lclG.setOutgoingWinningCardPlayer(lclILCPlayer);
				lclG.setOutgoingLosingCardPlayer(lclIWCPlayer);
				
				if (lclNextMatchForWinner != null) {
					if (lclNextMatchForWinner.getWinningCard() == lclM.getWinningCard()) {
						lclNextGameForWinner.setIncomingWinningCardPlayer(lclILCPlayer);
					} else if (lclNextMatchForWinner.getLosingCard() == lclM.getWinningCard()) {
						lclNextGameForWinner.setIncomingLosingCardPlayer(lclILCPlayer);
					} else {
						throw new IllegalStateException("lclNextMatchForWinner isn't actually the next match for the winner");
					}
				}
				
				if (lclNextMatchForLoser != null) {
					if (lclNextMatchForLoser.getWinningCard() == lclM.getLosingCard()) {
						lclNextGameForLoser.setIncomingWinningCardPlayer(lclIWCPlayer);
					} else if (lclNextMatchForLoser.getLosingCard() == lclM.getLosingCard()) {
						lclNextGameForLoser.setIncomingLosingCardPlayer(lclIWCPlayer);
					} else {
						throw new IllegalStateException("lclNextMatchForLoser isn't actually the next match for the loser");
					}
				}
				
				lclResult.setWinnerPlayer(lclILCPlayer);
				
				if (lclNextMatchForWinner != null) {
					lclResult.setNextMatchForWinner(lclNextMatchForWinner);
				}
				
				
				lclResult.setLoserPlayer(lclIWCPlayer);
				
				if (lclNextMatchForLoser != null) {
					lclResult.setNextMatchForLoser(lclNextMatchForLoser);
				}
			} // else There's a tie; the error status will be checked, the transaction not committed, and the appropriate information returned to the browser
			
			if (passBackErrorsExist()) {
				lclTC.rollback();
			} else {
				lclTC.complete();
				GameResult.uncache(lclG);
			}
		}
		
		return lclReturnUrl;
	}
}
