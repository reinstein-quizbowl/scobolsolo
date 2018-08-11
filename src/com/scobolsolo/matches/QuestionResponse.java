package com.scobolsolo.matches;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import com.opal.TransactionContext;

import com.scobolsolo.application.Account;
import com.scobolsolo.application.Game;
import com.scobolsolo.application.Diff;
import com.scobolsolo.application.DiffFactory;
import com.scobolsolo.application.GameFactory;
import com.scobolsolo.application.Match;
import com.scobolsolo.application.Packet;
import com.scobolsolo.application.Performance;
import com.scobolsolo.application.Placement;
import com.scobolsolo.application.PlacementFactory;
import com.scobolsolo.application.Player;
import com.scobolsolo.application.PlayerFactory;
import com.scobolsolo.application.Question;
import com.scobolsolo.application.Response;
import com.scobolsolo.application.ResponseType;
import com.scobolsolo.application.ResponseTypeFactory;
import com.scobolsolo.servlets.ScobolSoloControllerServlet;

public class QuestionResponse extends ScobolSoloControllerServlet {
	private static final long serialVersionUID = 1L;
	private static final org.apache.log4j.Logger ourLogger = org.apache.log4j.Logger.getLogger(QuestionResponse.class.getName());
	
	private static final String CONTINUE_URL_BASE = "/game/question.jsp";
	private static final String TIE_URL_BASE = "/game/tie.jsp";
	private static final String COMPLETE_URL_BASE = "/game/end.jsp";
	private static final String OUT_OF_QUESTIONS_URL_BASE = "/game/out-of-questions.jsp";
	
	@Override
	protected String processInternalTwo(final HttpServletRequest argRequest, final HttpSession argSession, final Account argUser) {
		Validate.notNull(argRequest);
		Validate.notNull(argSession);
		Validate.notNull(argUser);
		
		final String lclData = Validate.notEmpty(argRequest.getParameter("data"), "No data");
		final JsonObject lclJson = new JsonParser().parse(lclData).getAsJsonObject();
		
		final int lclGameId = extractInt(lclJson, "game_id", -1);
		Validate.isTrue(lclGameId != -1, "Missing game_id");
		final Game lclGame = Validate.notNull(GameFactory.getInstance().forId(lclGameId), "Invalid game_id");
		
		final int lclBasePlacementId = extractInt(lclJson, "base_placement_id", -1);
		Validate.isTrue(lclBasePlacementId != -1, "Missing base_placement_id");
		final Placement lclBasePL = Validate.notNull(PlacementFactory.getInstance().forId(lclBasePlacementId), "Invalid base_placement_id");
		
		final Placement lclReplacementPL;
		final int lclReplacementPlacementId = extractInt(lclJson, "replacement_placement_id", -1);
		if (lclReplacementPlacementId == -1) {
			lclReplacementPL = null;
		} else {
			lclReplacementPL = Validate.notNull(PlacementFactory.getInstance().forId(lclReplacementPlacementId), "Invalid replacement_placement_id");
		}
		
		final Placement lclActualPL = Validate.notNull(ObjectUtils.firstNonNull(lclReplacementPL, lclBasePL));
		
		final int lclDiffId = extractInt(lclJson, "diff_id", -1);
		Validate.isTrue(lclDiffId != -1, "Missing diff_id");
		final Diff lclDiff = Validate.notNull(DiffFactory.getInstance().forId(lclDiffId), "Invalid diff_id");
		
		if (lclReplacementPL == null) {
			Validate.isTrue(lclDiff.getQuestion() == lclBasePL.getQuestion(), "Diff does not match base placement");
		} else {
			Validate.isTrue(lclDiff.getQuestion() == lclReplacementPL.getQuestion(), "Diff does not match replacement placement");
		}
		
		final boolean lclOvertime = extractBoolean(lclJson, "overtime", false);
		
		final int lclIndex = extractInt(lclJson, "index", -1);
		Validate.isTrue(lclIndex >= 0, "Missing index");
		final Packet lclPacket = lclGame.getMatch().getRound().getPacket();
		final List<Placement> lclPlacements = lclOvertime ? lclPacket.getOvertimePlacements() : lclPacket.getRegulationPlacements();
		Validate.validIndex(lclPlacements, lclIndex);
		
		final JsonElement lclLeftPlayerElt = Validate.notNull(lclJson.get("left"), "Missing left player");
		Validate.isTrue(lclLeftPlayerElt.isJsonObject(), "left is not a JsonObject");
		final JsonObject lclLeftPlayerObj = lclLeftPlayerElt.getAsJsonObject();
		
		final Player lclLeftPlayer = extractPlayer(lclLeftPlayerObj);
		final boolean lclLeftBuzzed = extractBuzzed(lclLeftPlayerObj);
		final boolean lclLeftCorrect = extractCorrect(lclLeftPlayerObj);
		final int lclLeftBuzzWordStartIndex = extractBuzzIndex(lclLeftPlayerObj);
		final int lclLeftBuzzWordEndIndex = startIndexToEndIndex(lclDiff, lclLeftBuzzWordStartIndex);
		
		final JsonElement lclRightPlayerElt = Validate.notNull(lclJson.get("right"), "Missing right player");
		Validate.isTrue(lclRightPlayerElt.isJsonObject(), "right is not a JsonObject");
		final JsonObject lclRightPlayerObj = lclRightPlayerElt.getAsJsonObject();
		
		final Player lclRightPlayer = extractPlayer(lclRightPlayerObj);
		final boolean lclRightBuzzed = extractBuzzed(lclRightPlayerObj);
		final boolean lclRightCorrect = extractCorrect(lclRightPlayerObj);
		final int lclRightBuzzWordStartIndex = extractBuzzIndex(lclRightPlayerObj);
		final int lclRightBuzzWordEndIndex = startIndexToEndIndex(lclDiff, lclRightBuzzWordStartIndex);
		
		final ResponseType lclLeftRT = determineResponseType(lclActualPL, lclLeftPlayer, lclLeftBuzzed, lclLeftCorrect, lclLeftBuzzWordEndIndex);
		final ResponseType lclRightRT = determineResponseType(lclActualPL, lclRightPlayer, lclRightBuzzed, lclRightCorrect, lclRightBuzzWordEndIndex);
		
		try (TransactionContext lclTC = TransactionContext.createAndActivate()) {
			final Performance lclLeftPerf = lclGame.findOrCreatePerformance(lclLeftPlayer);
			final Performance lclRightPerf = lclGame.findOrCreatePerformance(lclRightPlayer);
			
			if (lclReplacementPL != null) {
				// Do we already have responses for the original question? If so, delete them.
				// TODO: Make it possible to properly record a question being replaced for one player only.
				final Response lclLeftResponseOldQuestion = lclLeftPerf.findResponseForBasePlacement(lclBasePL);
				if (lclLeftResponseOldQuestion != null) {
					lclLeftResponseOldQuestion.unlink();
				}
				final Response lclRightResponseOldQuestion = lclRightPerf.findResponseForBasePlacement(lclBasePL);
				if (lclRightResponseOldQuestion != null) {
					lclRightResponseOldQuestion.unlink();
				}
			}
			
			if (lclLeftRT != null) {
				lclLeftPerf.findOrCreateResponse(lclBasePL, lclReplacementPL)
					.setResponseType(lclLeftRT)
					.setDiff(lclDiff)
					.setWordStartIndex(lclLeftBuzzWordStartIndex >= 0 ? lclLeftBuzzWordStartIndex : null)
					.setWordEndIndex(lclLeftBuzzWordEndIndex >= 0 ? lclLeftBuzzWordEndIndex : null);
			}
			
			if (lclRightRT != null) {
				lclRightPerf.findOrCreateResponse(lclBasePL, lclReplacementPL)
					.setResponseType(lclRightRT)
					.setDiff(lclDiff)
					.setWordStartIndex(lclRightBuzzWordStartIndex >= 0 ? lclRightBuzzWordStartIndex : null)
					.setWordEndIndex(lclRightBuzzWordEndIndex >= 0 ? lclRightBuzzWordEndIndex : null);
			}
			
			lclTC.complete();
			
			final boolean lclEndOfSegment = lclIndex == lclPlacements.size() - 1;
			if (lclEndOfSegment) {
				final boolean lclTied = lclGame.isTiedAfter(lclIndex, lclOvertime);
				if (lclOvertime) { // i.e., we were *already* in overtime
					if (lclTied) {
						// ourLogger.debug("return A");
						return OUT_OF_QUESTIONS_URL_BASE + generateQueryString(lclGame, lclLeftPlayer, lclRightPlayer, lclIndex + 1, false, true);
					} else {
						recordResult(lclGame);
						// ourLogger.debug("return B");
						return COMPLETE_URL_BASE + generateQueryString(lclGame, lclLeftPlayer, lclRightPlayer, -1, false, true);
					}
				} else {
					if (lclTied) {
						// ourLogger.debug("return C");
						return TIE_URL_BASE + generateQueryString(lclGame, lclLeftPlayer, lclRightPlayer, -1, false, false /* because we haven't started overtime yet */);
					} else {
						recordResult(lclGame);
						// ourLogger.debug("return D");
						return COMPLETE_URL_BASE + generateQueryString(lclGame, lclLeftPlayer, lclRightPlayer, -1, false, false);
					}
				}
			} else if (lclOvertime) {
				final boolean lclTied = lclGame.isTiedAfter(lclIndex, lclOvertime);
				if (lclTied) {
					// ourLogger.debug("return E");
					return CONTINUE_URL_BASE + generateQueryString(lclGame, lclLeftPlayer, lclRightPlayer, lclIndex + 1, false, lclOvertime);
				} else {
					recordResult(lclGame);
					// ourLogger.debug("return F");
					return COMPLETE_URL_BASE + generateQueryString(lclGame, lclLeftPlayer, lclRightPlayer, -1, false, false);
				}
			} else {
				// ourLogger.debug("return G");
				return CONTINUE_URL_BASE + generateQueryString(lclGame, lclLeftPlayer, lclRightPlayer, lclIndex + 1, false, lclOvertime);
			}
		}
	}
	
	public static void recordResult(final Game argGame) {
		Validate.notNull(argGame);
		Validate.isTrue(!argGame.isTied(), "Tied! " + argGame.getScores());
		final Match lclMatch = argGame.getMatch();
		
		final Performance lclWinnerPerf = Validate.notNull(argGame.determineWinner());
		final Performance lclLoserPerf = Validate.notNull(argGame.determineLoser());
		final Player lclWinner = Validate.notNull(lclWinnerPerf.getPlayer());
		final Player lclLoser = Validate.notNull(lclLoserPerf.getPlayer());
		
		final Match lclNextMatchForWinner = lclMatch.getNextForWinner();
		final Match lclNextMatchForLoser = lclMatch.getNextForLoser();
		
		try (TransactionContext lclTC = TransactionContext.createAndActivate()) {
			argGame.setTossupsHeard(argGame.calculateTossupsHeard());
			argGame.setOutgoingWinningCardPlayer(lclWinner);
			argGame.setOutgoingLosingCardPlayer(lclLoser);
			
			if (lclNextMatchForWinner != null) {
				Game lclNextGameForWinner = lclNextMatchForWinner.getGame();
				if (lclNextGameForWinner == null) {
					lclNextGameForWinner = GameFactory.getInstance().create().setMatch(lclNextMatchForWinner);
				}
				Validate.notNull(lclNextGameForWinner);
				
				if (lclNextMatchForWinner.getWinningCard() == lclMatch.getWinningCard()) {
					Validate.isTrue(lclNextGameForWinner.getIncomingWinningCardPlayer() == null || lclNextGameForWinner.getIncomingWinningCardPlayer() == lclWinnerPerf.getPlayer());
					lclNextGameForWinner.setIncomingWinningCardPlayer(lclWinnerPerf.getPlayer());
				} else if (lclNextMatchForWinner.getLosingCard() == lclMatch.getWinningCard()) {
					Validate.isTrue(lclNextGameForWinner.getIncomingLosingCardPlayer() == null || lclNextGameForWinner.getIncomingLosingCardPlayer() == lclWinnerPerf.getPlayer());
					lclNextGameForWinner.setIncomingLosingCardPlayer(lclWinnerPerf.getPlayer());
				} else {
					throw new IllegalStateException("lclNextMatchForWinner isn't actually the next match for the winner");
				}
			}
			
			if (lclNextMatchForLoser != null) {
				Game lclNextGameForLoser = lclNextMatchForLoser.getGame();
				if (lclNextGameForLoser == null) {
					lclNextGameForLoser = GameFactory.getInstance().create().setMatch(lclNextMatchForLoser);
				}
				Validate.notNull(lclNextGameForLoser);
				
				if (lclNextMatchForLoser.getWinningCard() == lclMatch.getLosingCard()) {
					Validate.isTrue(lclNextGameForLoser.getIncomingWinningCardPlayer() == null || lclNextGameForLoser.getIncomingWinningCardPlayer() == lclLoser);
					lclNextGameForLoser.setIncomingWinningCardPlayer(lclLoser);
				} else if (lclNextMatchForLoser.getLosingCard() == lclMatch.getLosingCard()) {
					Validate.isTrue(lclNextGameForLoser.getIncomingLosingCardPlayer() == null || lclNextGameForLoser.getIncomingLosingCardPlayer() == lclLoser);
					lclNextGameForLoser.setIncomingLosingCardPlayer(lclLoser);
				} else {
					throw new IllegalStateException("lclNextMatchForLoser isn't actually the next match for the loser");
				}
			}
			
			lclTC.complete();
		}
	}
	
	public static String generateQueryString(final Game argGame, final Player argLeftPlayer, final Player argRightPlayer, final int argIndex, final boolean argReplacement, final boolean argOvertime) {
		Validate.notNull(argGame);
		Validate.notNull(argLeftPlayer);
		Validate.notNull(argRightPlayer);
		Validate.isTrue(argIndex >= -1);
		
		return new StringBuilder()
			.append("?game_id=").append(argGame.getId())
			.append("&left_player_id=").append(argLeftPlayer.getId())
			.append("&right_player_id=").append(argRightPlayer.getId())
			.append("&index=").append(argIndex)
			.append("&needs_replacement=").append(argReplacement)
			.append("&overtime=").append(argOvertime)
			.toString();
	}
	
	protected static Player extractPlayer(final JsonObject argO) {
		Validate.notNull(argO);
		
		final int lclPlayerId = extractInt(argO, "player_id", -1);
		Validate.isTrue(lclPlayerId != -1, "Missing player_id");
		
		final Player lclPlayer = Validate.notNull(PlayerFactory.getInstance().forId(lclPlayerId), "Invalid player_id");
		
		return lclPlayer;
	}
	
	protected static boolean extractBoolean(final JsonObject argO, final String argKey, final boolean argDefault) {
		Validate.notNull(argO);
		Validate.notBlank(argKey);
		
		final JsonElement lclKeyElt = argO.get(argKey);
		
		if (lclKeyElt == null || lclKeyElt.isJsonNull()) {
			return argDefault;
		} else {
			Validate.isTrue(lclKeyElt.isJsonPrimitive(), argKey + " is present, but is not a JsonPrimitive");
			
			return lclKeyElt.getAsJsonPrimitive().getAsBoolean();
		}
	}
	
	protected static int extractInt(final JsonObject argO, final String argKey, final int argDefault) {
		Validate.notNull(argO);
		Validate.notBlank(argKey);
		
		final JsonElement lclKeyElt = argO.get(argKey);
		
		if (lclKeyElt == null || lclKeyElt.isJsonNull()) {
			return argDefault;
		} else {
			Validate.isTrue(lclKeyElt.isJsonPrimitive(), argKey + " is present, but is not a JsonPrimitive");
			
			return lclKeyElt.getAsJsonPrimitive().getAsInt();
		}
	}
	
	protected static boolean extractBuzzed(final JsonObject argO) {
		Validate.notNull(argO);
		
		return extractBoolean(argO, "buzzed", false);
	}
	
	protected static boolean extractCorrect(final JsonObject argO) {
		Validate.notNull(argO);
		
		return extractBoolean(argO, "correct", false);
	}
	
	protected static int extractBuzzIndex(final JsonObject argO) {
		Validate.notNull(argO);
		
		return extractInt(argO, "buzz_index", -1);
	}
	
	public static int startIndexToEndIndex(final Diff argD, final int argRawIndex) {
		if (argRawIndex == -1) {
			return -1;
		} else if (argRawIndex < 0) {
			ourLogger.warn("Invalid raw index " + argRawIndex + " for " + argD);
		}
		Validate.notNull(argD);
		
		// The raw index is the index of the first character in the word the player buzzed on.
		// We want to correct it to the index of the *last* character in that word, so that buzzpoints show that the entire word has been read.
		// Theoretically this should be done in the method on Question that puts the indexes in, but the structure of that code makes that inordinately difficult.
		int lclCorrectedIndex;
		
		final String lclText = argD.getText();
		for (lclCorrectedIndex = argRawIndex + 1; lclCorrectedIndex < lclText.length(); ++lclCorrectedIndex) {
			char lclC = lclText.charAt(lclCorrectedIndex);
			if (Question.isWordBreakingCharacter(lclC)) {
				break;
			}
		}
		
		return lclCorrectedIndex;
	}
	
	protected static ResponseType determineResponseType(final Placement argPL, final Player argPlayer, final boolean argBuzzed, final boolean argCorrect, final int argBuzzWordEndIndex) {
		Validate.notNull(argPL);
		Validate.notNull(argPlayer);
		
		// Exhibition players (phantoms) never have their buzzes recorded.
		if (argPlayer.isExhibition()) {
			return null;
		}
		
		if (argBuzzed) {
			if (argCorrect) {
				return ResponseTypeFactory.CORRECT();
			} else {
				Question lclQ = Validate.notNull(argPL.getQuestion());
				String lclText = lclQ.getText();
				
				if (argBuzzWordEndIndex >= lclText.length() - 1) {
					return ResponseTypeFactory.INCORRECT_AT_END();
				} else {
					if (argBuzzWordEndIndex >= 0 && argBuzzWordEndIndex < lclQ.getText().length()) {
						String lclAfterBuzzIndex = lclQ.getText().substring(argBuzzWordEndIndex);
						if (StringUtils.containsAny(lclAfterBuzzIndex, Question.WORD_BREAKING_CHARACTERS)) {
							return ResponseTypeFactory.INTERRUPT();
						} else {
							return ResponseTypeFactory.INCORRECT_AT_END();
						}
					} else {
						return ResponseTypeFactory.INCORRECT_AT_END();
					}
				}
			}
		} else {
			return ResponseTypeFactory.NO_ATTEMPT();
		}
	}
}
