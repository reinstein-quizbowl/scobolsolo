package com.scobolsolo.messages;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Collection;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;
import org.apache.commons.mail.EmailException;

import com.opal.ImplicitTableDatabaseQuery;
import com.opal.TransactionContext;

import com.scobolsolo.application.Account;
import com.scobolsolo.application.AccountFactory;
import com.scobolsolo.application.Message;
import com.scobolsolo.application.MessageFactory;
import com.scobolsolo.servlets.ScobolSoloControllerServlet;
import com.scobolsolo.Mail;

public class SendMessage extends ScobolSoloControllerServlet {
	private static final org.apache.log4j.Logger ourLogger = org.apache.log4j.Logger.getLogger(SendMessage.class);
	private static final long serialVersionUID = 1L;
	
	private static final String NOTIFICATION_FROM_ADDRESS = "jonah@jonahgreenthal.com";
	
	private static final String RETURN_URL = "/messages/";
	
	@Override
	protected String processInternalTwo(final HttpServletRequest argRequest, final HttpSession argSession, final Account argUser) {
		final Account lclRecipient = Validate.notNull(AccountFactory.getInstance().fromHttpRequest(argRequest, "recipient_account_id"), "No recipient specified");
		final String lclText = Validate.notNull(StringUtils.trimToNull(argRequest.getParameter("message")), "No message specified");
		
		final String lclLoadTimeString = Validate.notNull(StringUtils.trimToNull(argRequest.getParameter("load_timestamp")), "Load timestamp not specified");
		final LocalDateTime lclLoadTime;
		try {
			lclLoadTime = LocalDateTime.parse(lclLoadTimeString, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		} catch (DateTimeParseException lclE) {
			throw new IllegalArgumentException("Could not parse '" + lclLoadTimeString + "' as a (load) timestamp", lclE);
		}
		Validate.notNull(lclLoadTime);
		
		Collection<Message> lclPreviousFromRecipientToSender = MessageFactory.getInstance().acquireForQuery(
			new ArrayList<>(),
			new ImplicitTableDatabaseQuery(
				"from_account_id = ? AND to_account_id = ? AND sent_timestamp < ?",
				lclRecipient.getIdAsObject(), argUser.getIdAsObject(), lclLoadTime
			)
		);
		
		try (TransactionContext lclTC = TransactionContext.createAndActivate()) {
			MessageFactory.getInstance().create()
				.setFromAccount(argUser)
				.setToAccount(lclRecipient)
				.setText(lclText);
			
			if (StringUtils.isNotBlank(lclRecipient.getMessageEmailNotifications())) {
				try {
					Mail.createEmail()
						.addTo(lclRecipient.getMessageEmailNotifications())
						.setFrom(NOTIFICATION_FROM_ADDRESS, argUser.getContact().getName())
						.setSubject("Scobol Solo message")
						.setMsg(lclText)
						.send();
				} catch (EmailException lclE) {
					ourLogger.warn(lclE);
				}
			}
			
			// Mark previous messages from the recipient to the sender as acknowledged
			for (Message lclOld : lclPreviousFromRecipientToSender) {
				lclOld.setAcknowledgedTimestamp(lclLoadTime);
			}
			
			lclTC.complete();
		}
		
		return RETURN_URL;
	}
}
