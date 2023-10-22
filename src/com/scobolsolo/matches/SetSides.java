package com.scobolsolo.matches;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.Validate;

import com.opal.LocalDateCache;
import com.opal.TransactionContext;

import com.scobolsolo.application.Account;
import com.scobolsolo.application.Game;
import com.scobolsolo.application.GameFactory;
import com.scobolsolo.application.Match;
import com.scobolsolo.application.MatchFactory;
import com.scobolsolo.application.Player;
import com.scobolsolo.application.PlayerFactory;
import com.scobolsolo.application.Staff;
import com.scobolsolo.application.StaffFactory;
import com.scobolsolo.servlets.ScobolSoloControllerServlet;

public class SetSides extends ScobolSoloControllerServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String RETURN_URL_BASE = "/game/question.jsp";
	
	@Override
	protected String processInternalTwo(final HttpServletRequest argRequest, final HttpSession argSession, final Account argUser) {
		final Match lclMatch = Validate.notNull(MatchFactory.getInstance().fromHttpRequest(argRequest));
		Validate.isTrue(argUser.mayEnter(lclMatch), "Not authorized");
		
		final Staff lclModerator = Validate.notNull(
			ObjectUtils.firstNonNull(
				StaffFactory.getInstance().fromHttpRequest(argRequest, "moderator_staff_id"),
				argUser.getContact().findStaff(lclMatch.getTournament())
			),
			"You must choose the moderator.");
		final Staff lclScorekeeper = Validate.notNull(
			ObjectUtils.firstNonNull(
				StaffFactory.getInstance().fromHttpRequest(argRequest, "scorekeeper_staff_id"),
				lclModerator
			),
			"You must choose the moderator.");
		final Player lclLeftPlayer = Validate.notNull(PlayerFactory.getInstance().fromHttpRequest(argRequest, "left_player_id"), "You must choose the player on the left.");
		final Player lclRightPlayer = Validate.notNull(PlayerFactory.getInstance().fromHttpRequest(argRequest, "right_player_id"), "You must choose the player on the right.");
		
		Game lclGame = lclMatch.getGame();
		
		try (TransactionContext lclTC = TransactionContext.createAndActivate()) {
			if (lclMatch.requiresIdentificationOfWinningAndLosingCardPlayers()) {
				final String lclWhichPlayerCameInWithWinningCard = getRequiredParameter(argRequest, "winning_card_holder");
				
				if (lclGame == null) {
					lclGame = GameFactory.getInstance().create().setMatch(lclMatch);
				}
				
				if ("left".equalsIgnoreCase(lclWhichPlayerCameInWithWinningCard)) {
					lclGame.setIncomingWinningCardPlayer(lclLeftPlayer)
						.setIncomingLosingCardPlayer(lclRightPlayer);
				} else if ("right".equalsIgnoreCase(lclWhichPlayerCameInWithWinningCard)) {
					lclGame.setIncomingWinningCardPlayer(lclRightPlayer)
						.setIncomingLosingCardPlayer(lclLeftPlayer);
				} else {
					throw new IllegalArgumentException("The player who came in with the winning card must be indicated as 'left' or 'right', but we got a value of " + lclWhichPlayerCameInWithWinningCard);
				}
			}
			
			lclGame.setModeratorStaff(lclModerator)
				.setScorekeeperStaff(lclScorekeeper);
			
			if (lclGame.getStartTime() == null) {
				lclGame.setStartTime(LocalDateCache.now());
			}
			
			lclTC.complete();
		}
		
		return RETURN_URL_BASE + "?game_id=" + lclGame.getId() + "&left_player_id=" + lclLeftPlayer.getId() + "&right_player_id=" + lclRightPlayer.getId() + "&index=0";
	}
}
