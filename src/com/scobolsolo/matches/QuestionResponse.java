package com.scobolsolo.matches;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.Validate;

import com.opal.TransactionContext;

import com.scobolsolo.application.Account;
import com.scobolsolo.application.Game;
import com.scobolsolo.application.GameFactory;
import com.scobolsolo.application.Packet;
import com.scobolsolo.application.Performance;
import com.scobolsolo.application.Placement;
import com.scobolsolo.application.PlacementFactory;
import com.scobolsolo.application.Player;
import com.scobolsolo.application.PlayerFactory;
import com.scobolsolo.application.Response;
import com.scobolsolo.application.ResponseType;
import com.scobolsolo.application.ResponseType;
import com.scobolsolo.application.ResponseTypeFactory;
import com.scobolsolo.application.Staff;
import com.scobolsolo.application.StaffFactory;
import com.scobolsolo.servlets.ScobolSoloControllerServlet;

public class QuestionResponse extends ScobolSoloControllerServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String CONTINUE_URL_BASE = "/game/question.jsp";
	private static final String TIE_URL_BASE = "/game/tie.jsp";
	private static final String COMPLETE_URL_BASE = "/game/end.jsp";
	private static final String OUT_OF_QUESTIONS_URL_BASE = "/game/out-of-questions.jsp";
	
	@Override
	protected String processInternalTwo(final HttpServletRequest argRequest, final HttpSession argSession, final Account argUser) throws Exception {
		final Game lclGame = Validate.notNull(GameFactory.getInstance().fromHttpRequest(argRequest), "Missing game ID");
		Validate.isTrue(argUser.mayEnter(lclGame.getMatch()), "Not authorized");
		final Player lclLeftPlayer = Validate.notNull(PlayerFactory.getInstance().fromHttpRequest(argRequest, "left_player_id"), "Missing left player");
		final Player lclRightPlayer = Validate.notNull(PlayerFactory.getInstance().fromHttpRequest(argRequest, "right_player_id"), "Missing right player");
		
		final int lclIndex = getRequiredIntParameter(argRequest, "index");
		final boolean lclOvertime = getBooleanParameter(argRequest, "overtime");
		final Packet lclPacket = lclGame.getMatch().getRound().getPacket();
		final List<Placement> lclPlacements = lclOvertime ? lclPacket.getOvertimePlacements() : lclPacket.getRegulationPlacements();
		Validate.validIndex(lclPlacements, lclIndex);
		
		
		final Placement lclBasePL = Validate.notNull(PlacementFactory.getInstance().fromHttpRequest(argRequest, "base_placement_id"), "Missing base placement");
		final Placement lclPL = Validate.notNull(PlacementFactory.getInstance().fromHttpRequest(argRequest), "Missing placement");
		final boolean lclReplaced = lclBasePL != lclPL;
		
		final ResponseType lclLeftRT = Validate.notNull(ResponseTypeFactory.getInstance().fromHttpRequest(argRequest, "left_player_response_type_code"), "Left player's response wasn't specified");
		final ResponseType lclRightRT = Validate.notNull(ResponseTypeFactory.getInstance().fromHttpRequest(argRequest, "right_player_response_type_code"), "Right player's response wasn't specified");
		
		try (TransactionContext lclTC = TransactionContext.createAndActivate()) {
			final Performance lclLeftPerf = lclGame.findOrCreatePerformance(lclLeftPlayer);
			final Performance lclRightPerf = lclGame.findOrCreatePerformance(lclRightPlayer);
			
			final Response lclLeftResponse;
			final Response lclRightResponse;
			
			if (lclReplaced) {
				// Do we already have responses for the original question? If so, delete them.
				// TODO: Make it possible to properly record a question being replaced for one player only.
				final Response lclLeftResponseOldQuestion = lclLeftPerf.findResponse(lclBasePL);
				if (lclLeftResponseOldQuestion != null) {
					lclLeftResponseOldQuestion.unlink();
				}
				final Response lclRightResponseOldQuestion = lclRightPerf.findResponse(lclBasePL);
				if (lclRightResponseOldQuestion != null) {
					lclRightResponseOldQuestion.unlink();
				}
			}
			
			lclLeftResponse = lclLeftPerf.findOrCreateResponse(lclPL);
			lclRightResponse = lclRightPerf.findOrCreateResponse(lclPL);
			
			lclLeftResponse.setResponseType(lclLeftRT);
			lclRightResponse.setResponseType(lclRightRT);
			
			if (lclReplaced) {
				lclLeftResponse.setReplacementForPlacement(lclBasePL);
				lclRightResponse.setReplacementForPlacement(lclBasePL);
			}
			
			lclTC.complete();
			
			boolean lclEndOfSegment = lclIndex == lclPlacements.size() - 1;
			if (lclEndOfSegment) {
				boolean lclTied = lclGame.isTiedAfter(lclIndex, lclOvertime);
				if (lclOvertime) { // i.e., we were *already* in overtime
					if (lclTied) {
						return OUT_OF_QUESTIONS_URL_BASE + generateQueryString(lclGame, lclLeftPlayer, lclRightPlayer, lclIndex + 1, false, true);
					} else {
						return COMPLETE_URL_BASE + generateQueryString(lclGame, lclLeftPlayer, lclRightPlayer, -1, false, true);
					}
				} else {
					if (lclTied) {
						return TIE_URL_BASE + generateQueryString(lclGame, lclLeftPlayer, lclRightPlayer, -1, false, false /* because we haven't started overtime yet */);
					} else {
						return COMPLETE_URL_BASE + generateQueryString(lclGame, lclLeftPlayer, lclRightPlayer, -1, false, false);
					}
				}
			} else if (lclOvertime) {
				boolean lclTied = lclGame.isTiedAfter(lclIndex, lclOvertime);
				if (lclTied) {
					return CONTINUE_URL_BASE + generateQueryString(lclGame, lclLeftPlayer, lclRightPlayer, lclIndex + 1, false, lclOvertime);
				} else {
					return COMPLETE_URL_BASE + generateQueryString(lclGame, lclLeftPlayer, lclRightPlayer, -1, false, false);
				}
			} else {
				return CONTINUE_URL_BASE + generateQueryString(lclGame, lclLeftPlayer, lclRightPlayer, lclIndex + 1, false, lclOvertime);
			}
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
}
