package com.scobolsolo.servlets.tournament;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;
import org.apache.commons.mail.Email;

import com.siliconage.util.Fast3Set;

import com.scobolsolo.application.Account;
import com.scobolsolo.application.Tournament;
import com.scobolsolo.application.TournamentFactory;
import com.scobolsolo.servlets.ScobolSoloControllerServlet;
import com.scobolsolo.Mail;

public class EmailAttendees extends ScobolSoloControllerServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String RETURN_URL = "/tournament/email-sent.jsp";
	
	@Override
	protected String processInternalTwo(final HttpServletRequest argRequest, final HttpSession argSession, final Account argUser) throws Exception {
		final Tournament lclT = Validate.notNull(TournamentFactory.getInstance().fromHttpRequest(argRequest));
		Validate.isTrue(argUser.mayActAsTournamentDirector(lclT), "Not authorized");
		
		final String[] lclToAddressesRaw = argRequest.getParameterValues("to"); // This is allowed to be null because it might just be custom-specified addresses.
		final List<String> lclToAddresses = new ArrayList<>(3 + (lclToAddressesRaw == null ? 0 : lclToAddressesRaw.length));
		if (lclToAddressesRaw != null) {
			for (final String lclAddress : lclToAddressesRaw) {
				final String lclTo = StringUtils.trimToNull(lclAddress);
				if (lclTo == null) {
					continue;
				}
				
				lclToAddresses.add(Mail.validateEmail(lclTo));
			}
		}
		
		final String lclAdditionalAddressesAsOne = getParedParameter(argRequest, "additional_to"); // may be null
		if (lclAdditionalAddressesAsOne != null) {
			final String[] lclAdditionalAddresses = StringUtils.split(lclAdditionalAddressesAsOne);
			for (String lclAdditionalAddress : lclAdditionalAddresses) {
				lclAdditionalAddress = StringUtils.remove(lclAdditionalAddress, ',');
				lclToAddresses.add(Mail.validateEmail(lclAdditionalAddress));
			}
		}
		
		Validate.isTrue(!lclToAddresses.isEmpty(), "At least one 'to' address must be provided");
		
		final String lclFrom = Mail.validateEmail(getParedParameter(argRequest, "from"));
		
		final String lclFromDescription = getParedParameter(argRequest, "from_description"); // may be null
		
		final String lclSubject = Validate.notNull(getParedParameter(argRequest, "subject"), "No subject provided");
		
		final String lclBody = Validate.notNull(getParedParameter(argRequest, "body"), "No body provided");
		
		final Set<String> lclBccs = new Fast3Set<>();
		lclBccs.add(lclFrom);
		if (argUser.getContact().getEmailAddress() != null) {
			lclBccs.add(argUser.getContact().getEmailAddress());
		}
		
		try {
			for (String lclTo : lclToAddresses) {
				Email lclE = Mail.createEmail()
					.addTo(lclTo)
					.setFrom(lclFrom, lclFromDescription)
					.setSubject(lclSubject)
					.setMsg(lclBody);
				
				for (String lclBcc : lclBccs) {
					lclE.addBcc(lclBcc);
				}
				
				lclE.send();
			}
			
			return RETURN_URL + "?object=" + lclT.getUniqueString() + "&recipient_count=" + lclToAddresses.size();
		} catch (Exception lclE) {
			throw new RuntimeException("Could not send email", lclE);
		}
	}
}
