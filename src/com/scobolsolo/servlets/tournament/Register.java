package com.scobolsolo.servlets.tournament;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.List;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;
import org.apache.commons.lang3.tuple.Pair;

import com.opal.TransactionContext;

import com.scobolsolo.application.Account;
import com.scobolsolo.application.Contact;
import com.scobolsolo.application.SchoolYear;
import com.scobolsolo.application.SchoolYearFactory;
import com.scobolsolo.application.Tournament;
import com.scobolsolo.application.TournamentFactory;
import com.scobolsolo.servlets.ScobolSoloControllerServlet;
import com.scobolsolo.Mail;
import com.scobolsolo.ScobolSoloConfiguration;

public class Register extends ScobolSoloControllerServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String RETURN_URL = "/register/confirmation.jsp";
	private static final String FROM_ADDRESS = "jonah@jonahgreenthal.com";
	private static final String CC_NAME = "Jonah Greenthal";
	private static final String CC_ADDRESS = "jonah@jonahgreenthal.com";
	
	public static final int PRICE_PER_PLAYER = 40;
	public static final int DISCOUNT_PER_MODERATOR = 75;
	public static final int MAX_DEFAULT_PLAYERS = 8;
	
	@Override
	protected String processInternalTwo(final HttpServletRequest argRequest, final HttpSession argSession, final Account argUser) {
		final StringBuilder lclConfirmation = new StringBuilder();
		
		final Tournament lclTourn = Validate.notNull(getTournamentToRegisterFor());
		final Contact lclTD = lclTourn.getTournamentDirectorContact();
		lclConfirmation.append("<h1>Registration Confirmation for " + lclTourn.getName() + "</h1>")
			.append("<p>" + lclTourn.getDate().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)) + "</p>");
		
		final String lclSchoolName = Validate.notBlank(getParedParameter(argRequest, "school_name"));
		final String lclSchoolCity = Validate.notBlank(getParedParameter(argRequest, "school_city"));
		final String lclSchoolState = Validate.notBlank(getParedParameter(argRequest, "school_state"));
		lclConfirmation.append("<h2>School</h2>")
			.append("<p><strong>" + lclSchoolName + "</strong> (" + lclSchoolCity + ", " + lclSchoolState + ")</p>");
		
		final String lclContactName = Validate.notBlank(getParedParameter(argRequest, "contact_name"));
		final String lclContactEmail = Validate.notBlank(getParedParameter(argRequest, "contact_email"));
		final String lclContactWorkPhone = getParedParameter(argRequest, "contact_work_phone");
		final String lclContactCellPhone = Validate.notBlank(getParedParameter(argRequest, "contact_cell_phone"));
		lclConfirmation.append("<h2>Contact</h2>")
			.append("<p><strong>" + lclContactName + "</strong> (" + lclContactEmail + ")</p>");
		if (StringUtils.isNotBlank(lclContactWorkPhone)) {
			lclConfirmation.append("<p>" + lclContactWorkPhone + " (work)</p>");
		}
		lclConfirmation.append("<p>" + lclContactCellPhone + " (cell)</p>");
		
		List<Pair<String, SchoolYear>> lclPlayers = new ArrayList<>(MAX_DEFAULT_PLAYERS);
		for (int i = 1; i <= MAX_DEFAULT_PLAYERS; ++i) {
			final String lclPlayerName = getParedParameter(argRequest, "player_" + i + "_name");
			if (StringUtils.isNotBlank(lclPlayerName)) {
				final SchoolYear lclPlayerSchoolYear = SchoolYearFactory.getInstance().fromHttpRequest(argRequest, "player_" + i + "_school_year_code");
				lclPlayers.add(Pair.of(lclPlayerName, lclPlayerSchoolYear));
			}
		}
		int lclAdditionalPlayerCount = 0;
		final String lclAdditionalPlayerCountString = getParedParameter(argRequest, "players_additional_desired");
		if (StringUtils.isNotBlank(lclAdditionalPlayerCountString)) {
			try {
				lclAdditionalPlayerCount = Integer.parseInt(lclAdditionalPlayerCountString);
			} catch (final NumberFormatException e) {
				ourLogger.warn("Invalid additional player count: " + lclAdditionalPlayerCountString);
				// lclAdditionalPlayerCount is still 0
			}
		}
		lclConfirmation.append("<h2>Players (" + lclPlayers.size() + ")</h2>")
			.append("<ul>");
		for (Pair<String, SchoolYear> lclPair : lclPlayers) {
			String lclPlayerName = lclPair.getLeft();
			SchoolYear lclPlayerSchoolYear = lclPair.getRight();
			lclConfirmation.append("<li><strong>" + lclPlayerName + "</strong>");
			if (lclPlayerSchoolYear != null) {
				lclConfirmation.append(" (" + lclPlayerSchoolYear.getName() + ")");
			}
			lclConfirmation.append("</li>");
		}
		if (lclAdditionalPlayerCount > 0) {
			lclConfirmation.append("<li>and " + lclAdditionalPlayerCount + " more desired if space allows</li>");
		}
		lclConfirmation.append("</ul>");
		
		int lclModeratorCount = 0;
		final String lclModeratorCountString = getParedParameter(argRequest, "moderator_count");
		if (StringUtils.isNotBlank(lclModeratorCountString)) {
			try {
				lclModeratorCount = Integer.parseInt(lclModeratorCountString);
			} catch (final NumberFormatException e) {
				ourLogger.warn("Invalid moderator count: " + lclModeratorCountString);
				// lclModeratorCount is still 0
			}
		}
		final String lclModeratorNames = getParedParameter(argRequest, "moderator_names");
		if (lclModeratorCount > 0) {
			lclConfirmation.append("<h2>Moderators: " + lclModeratorCount + "</h2>");
			if (StringUtils.isNotBlank(lclModeratorNames)) {
				lclConfirmation.append("<p>" + lclModeratorNames + "</p>");
			}
		}
		
		final int lclAmountOwed = Math.max(0, lclPlayers.size() * PRICE_PER_PLAYER - lclModeratorCount * DISCOUNT_PER_MODERATOR);
		lclConfirmation.append("<h2>Amount owed: $" + lclAmountOwed + "</h2>")
			.append("<p>Make checks payable to Reinstein QuizBowl and send them to&hellip;</p>")
			.append("<blockquote>Reinstein QuizBowl<br />P.O.&nbsp;Box 57<br />125 Schelter Rd<br />Lincolnshire, IL 60069&ndash;0057</blockquote>");
		
		final String lclNote = getParedParameter(argRequest, "note");
		if (StringUtils.isNotBlank(lclNote)) {
			lclConfirmation.append("<h2>Additional Note</h2>")
				.append("<p>" + lclNote + "</p>");
		}
		
		lclConfirmation.append("<p>If you need to change players or have any questions, reply-all to this email or write to " + lclTD.getName() + " at <a href='mailto:" + lclTD.getEmailAddress() + "'>" + lclTD.getEmailAddress() + "</a>. We&#8217;ll be in touch if we have any questions or concerns, and we&#8217;ll send more information when the tournament gets closer.</p>");
		
		try {
			ourLogger.debug("About to send " + lclConfirmation);
			Mail.createHtmlEmail()
				.setHtmlMsg(lclConfirmation.toString())
				.addTo(lclTD.getEmailAddress(), lclTD.getName())
				.addTo(lclContactEmail, lclContactName)
				.addCc(CC_ADDRESS, CC_NAME)
				.setFrom(FROM_ADDRESS, "Scobol Solo Registration")
				.setSubject(lclTourn.getName() + " Registration: " + lclSchoolName)
				.send();
			ourLogger.debug("Sent!");
		} catch (Exception lclE) {
			ourLogger.error("Could not send registration notification with data\n" + lclConfirmation, lclE);
		}
		
		return RETURN_URL;
	}
	
	@Override
	protected boolean requireUser() {
		return false;
	}
	
	public static Tournament getTournamentToRegisterFor() {
		String lclCode = ScobolSoloConfiguration.getInstance().getString("REGISTRATION_OPEN_FOR");
		if (StringUtils.isBlank(lclCode)) {
			return null;
		} else {
			return TournamentFactory.getInstance().forCode(lclCode);
		}
	}
}
