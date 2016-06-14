package com.scobolsolo.messages;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

import com.opal.TransactionContext;

import com.scobolsolo.application.Account;
import com.scobolsolo.application.AccountFactory;
import com.scobolsolo.application.MessageFactory;
import com.scobolsolo.servlets.ScobolSoloControllerServlet;

public class SendMessage extends ScobolSoloControllerServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String RETURN_URL = "/messages/";
	
	@Override
	protected String processInternalTwo(final HttpServletRequest argRequest, final HttpSession argSession, final Account argUser) {
		final Account lclRecipient = Validate.notNull(AccountFactory.getInstance().fromHttpRequest(argRequest, "recipient_account_id"), "No recipient specified");
		final String lclText = Validate.notNull(StringUtils.trimToNull(argRequest.getParameter("message")), "No message specified");
		
		try (TransactionContext lclTC = TransactionContext.createAndActivate()) {
			MessageFactory.getInstance().create()
				.setFromAccount(argUser)
				.setToAccount(lclRecipient)
				.setText(lclText);
			
			lclTC.complete();
		}
		
		return RETURN_URL;
	}
}
