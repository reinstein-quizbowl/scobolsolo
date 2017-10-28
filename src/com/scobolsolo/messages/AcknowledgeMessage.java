package com.scobolsolo.messages;

import java.time.LocalDateTime;
import java.util.Collection;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.Validate;

import com.google.gson.JsonObject;

import com.opal.LocalDateCache;
import com.opal.TransactionContext;

import com.scobolsolo.application.Account;
import com.scobolsolo.application.Message;
import com.scobolsolo.application.MessageFactory;
import com.scobolsolo.servlets.AjaxServlet;

public class AcknowledgeMessage extends AjaxServlet {
	private static final long serialVersionUID = 1L;
	private static final org.apache.log4j.Logger ourLogger = org.apache.log4j.Logger.getLogger(AcknowledgeMessage.class.getName());
	
	@Override
	protected JsonObject process(final HttpServletRequest argRequest, final HttpServletResponse argResponse, final Account argUser) {
		final Collection<Message> lclMessages = MessageFactory.getInstance().multipleFromHttpRequest(argRequest);
		if (lclMessages.isEmpty()) {
			ourLogger.warn("AcknowledgeMessage called with no messages to acknowledge");
		} else {
			Validate.isTrue(argUser.isAdministrator() || lclMessages.stream().allMatch(argM -> argM.getRecipient() == argUser), "Not authorized");
			
			final LocalDateTime lclNow = LocalDateCache.now();
			
			try (TransactionContext lclTC = TransactionContext.createAndActivate()) {
				for (final Message lclM : lclMessages) {
					lclM.setAcknowledgedTimestamp(lclNow);
				}
				
				lclTC.complete();
			}
		}
		
		return null; // I guess we could say something vaguely meaningful, like just spitting back the Message IDs
	}
}
