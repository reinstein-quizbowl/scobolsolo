package com.scobolsolo.servlets.tournament;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.Validate;

import com.opal.TransactionContext;

import com.scobolsolo.application.Account;
import com.scobolsolo.application.Player;
import com.scobolsolo.application.Tournament;
import com.scobolsolo.application.TournamentFactory;
import com.scobolsolo.servlets.ScobolSoloControllerServlet;

public class RearrangeSeeds extends ScobolSoloControllerServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String RETURN_URL = "/tournament/players.jsp";
	
	@Override
	protected String processInternalTwo(final HttpServletRequest argRequest, final HttpSession argSession, final Account argUser) {
		final Tournament lclT = Validate.notNull(TournamentFactory.getInstance().fromHttpRequest(argRequest));
		Validate.isTrue(argUser.mayManageCardSystem(lclT), "Not authorized");
		
		final List<Player> lclPs = lclT.getPlayers();
		
		try (TransactionContext lclTC = TransactionContext.createAndActivate()) {
			for (final Player lclP : lclPs) {
				lclP.setSeed(getRequiredIntParameter(argRequest, "player_" + lclP.getId() + "_seed"));
			}
			
			lclTC.complete();
		}
		
		return RETURN_URL + "?object=" + lclT.getUniqueString();
	}
}
