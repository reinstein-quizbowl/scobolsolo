package com.scobolsolo.servlets.games;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.Validate;

import com.opal.TransactionContext;

import com.scobolsolo.application.Account;
import com.scobolsolo.application.Game;
import com.scobolsolo.application.GameFactory;
import com.scobolsolo.application.Performance;
import com.scobolsolo.application.Response;
import com.scobolsolo.matches.GameResult;
import com.scobolsolo.servlets.ScobolSoloControllerServlet;

public class ClearGame extends ScobolSoloControllerServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String RETURN_URL = "/games/dual-game-enter.jsp";
	
	@Override
	protected String processInternalTwo(final HttpServletRequest argRequest, final HttpSession argSession, final Account argUser) throws Exception {
		final Game lclG = Validate.notNull(GameFactory.getInstance().fromHttpRequest(argRequest));
		
		final String lclReturnUrl = RETURN_URL + "?match_id=" + lclG.getMatch().getId();
		
		try (TransactionContext lclTC = TransactionContext.createAndActivate()) {
			for (final Performance lclP : lclG.createPerformanceArray()) {
				for (final Response lclR : lclP.createResponseArray()) {
					lclR.unlink();
				}
				
				lclP.unlink();
			}
			
			GameResult.uncache(lclG);
			
			lclG.unlink();
			
			lclTC.complete();
		}
		
		return lclReturnUrl;
	}
}
