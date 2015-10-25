package com.scobolsolo.servlets.tournament;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.Validate;

import com.opal.TransactionContext;

import com.scobolsolo.application.Account;
import com.scobolsolo.application.StandbyEntry;
import com.scobolsolo.application.Tournament;
import com.scobolsolo.application.TournamentFactory;
import com.scobolsolo.servlets.ScobolSoloControllerServlet;

public class RearrangeStandby extends ScobolSoloControllerServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String RETURN_URL = "/tournament/standby.jsp";
	
	@Override
	protected String processInternalTwo(final HttpServletRequest argRequest, final HttpSession argSession, final Account argUser) throws Exception {
		final Tournament lclT = Validate.notNull(TournamentFactory.getInstance().fromHttpRequest(argRequest));
		Validate.isTrue(argUser.mayActAsTournamentDirector(lclT), "Not authorized");
		
		final List<StandbyEntry> lclSEs = lclT.getStandbyEntries();
		
		try (TransactionContext lclTC = TransactionContext.createAndActivate()) {
			for (final StandbyEntry lclSE : lclSEs) {
				lclSE.setSequence(getRequiredIntParameter(argRequest, "sequence-" + lclSE.getId()));
			}
			
			lclTC.complete();
		}
		
		return RETURN_URL + "?object=" + lclT.getUniqueString();
	}
}
