package com.scobolsolo.servlets.tournament;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.Validate;

import com.opal.TransactionContext;

import com.scobolsolo.application.Account;
import com.scobolsolo.application.Phase;
import com.scobolsolo.application.PhaseFactory;
import com.scobolsolo.application.Tournament;
import com.scobolsolo.application.Card;
import com.scobolsolo.servlets.ScobolSoloControllerServlet;

public class UnassignCards extends ScobolSoloControllerServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String RETURN_URL = "/tournament/players.jsp";
	
	@Override
	protected String processInternalTwo(final HttpServletRequest argRequest, final HttpSession argSession, final Account argUser) throws Exception {
		final Phase lclPhase = Validate.notNull(PhaseFactory.getInstance().fromHttpRequest(argRequest));
		final Tournament lclT = lclPhase.getTournament();
		Validate.isTrue(argUser.mayManageCardSystem(lclT), "Not authorized");
		
		try (TransactionContext lclTC = TransactionContext.createAndActivate()) {
			for (Card lclC : lclPhase.createCardArray()) {
				if (lclC.getInitialPlayer() != null) {
					lclC.getInitialPlayer().setInitialCard(null);
				}
			}
			
			lclTC.complete();
		}
		
		return RETURN_URL + "?object=" + lclT.getUniqueString();
	}
}
