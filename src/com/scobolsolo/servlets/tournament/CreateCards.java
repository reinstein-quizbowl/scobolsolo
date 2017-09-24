package com.scobolsolo.servlets.tournament;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.Validate;

import com.opal.TransactionContext;

import com.scobolsolo.application.Account;
import com.scobolsolo.application.Card;
import com.scobolsolo.application.CardFactory;
import com.scobolsolo.application.Phase;
import com.scobolsolo.application.PhaseFactory;
import com.scobolsolo.servlets.ScobolSoloControllerServlet;

public class CreateCards extends ScobolSoloControllerServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String RETURN_URL = "/tournament/cards.jsp";
	
	@Override
	protected String processInternalTwo(final HttpServletRequest argRequest, final HttpSession argSession, final Account argUser) {
		final Phase lclPhase = Validate.notNull(PhaseFactory.getInstance().fromHttpRequest(argRequest));
		Validate.isTrue(argUser.mayManageCardSystem(lclPhase.getTournament()), "Not authorized");
		
		final int lclSmallestCardNumber = getRequiredIntParameter(argRequest, "smallest_number");
		final int lclLargestCardNumber = getRequiredIntParameter(argRequest, "largest_number");
		
		Validate.isTrue(lclSmallestCardNumber <= lclLargestCardNumber, "The smallest card number must be less than or equal to the largest card number.");
		
		try (TransactionContext lclTC = TransactionContext.createAndActivate()) {
			lclPhase.getCardSet().clear();
			
			for (int lclI = lclSmallestCardNumber; lclI <= lclLargestCardNumber; ++lclI) {
				final Card lclC = CardFactory.getInstance().create();
				lclC.setPhase(lclPhase);
				lclC.setName("Card " + lclI);
				lclC.setShortName(String.valueOf(lclI));
				lclC.setSequence(lclI);
			}
			
			lclTC.complete();
		}
		
		return RETURN_URL + "?phase_id=" + lclPhase.getId();
	}
}
