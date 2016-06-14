package com.scobolsolo.messages;

import java.util.Collection;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

import com.opal.TransactionContext;

import com.scobolsolo.application.Account;
import com.scobolsolo.application.AccountFactory;
import com.scobolsolo.application.MessageFactory;
import com.scobolsolo.application.Tournament;
import com.scobolsolo.application.TournamentFactory;
import com.scobolsolo.servlets.ScobolSoloControllerServlet;

public class BulkMessage extends ScobolSoloControllerServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String RETURN_URL = "/tournament/message-sent.jsp";
	
	@Override
	protected String processInternalTwo(final HttpServletRequest argRequest, final HttpSession argSession, final Account argUser) {
		final Tournament lclT = Validate.notNull(TournamentFactory.getInstance().fromHttpRequest(argRequest));
		Validate.isTrue(argUser.mayActAsTournamentDirector(lclT), "Not authorized");
		
		final Collection<Account> lclRecipients = AccountFactory.getInstance().multipleFromHttpRequest(argRequest);
		Validate.notEmpty(lclRecipients, "No recipients specified");
		
		final String lclText = Validate.notNull(StringUtils.trimToNull(argRequest.getParameter("message")), "No message specified");
		
		try (TransactionContext lclTC = TransactionContext.createAndActivate()) {
			for (Account lclRecipient : lclRecipients) {
				MessageFactory.getInstance().create()
					.setFromAccount(argUser)
					.setToAccount(lclRecipient)
					.setText(lclText);
				
				lclTC.complete();
			}
		}
		
		return RETURN_URL + "?object=" + lclT.getUniqueString() + "&recipient_count=" + lclRecipients.size();
	}
}
