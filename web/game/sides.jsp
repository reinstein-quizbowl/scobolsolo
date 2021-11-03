﻿<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.Collection" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.LinkedList" %>
<%@ page import="java.util.stream.Collectors" %>
<%@ page import="org.apache.commons.lang3.ObjectUtils" %>
<%@ page import="org.apache.commons.lang3.Validate" %>
<%@ page import="com.siliconage.web.ControllerServlet" %>
<%@ page import="com.siliconage.web.form.AssembledDropdownField" %>
<%@ page import="com.siliconage.web.form.FunctionalNameCodeExtractor" %>
<%@ page import="com.siliconage.web.form.NameCodeExtractor" %>
<%@ page import="com.siliconage.web.form.RadioField" %>
<%@ page import="com.scobolsolo.application.Account" %>
<%@ page import="com.scobolsolo.application.Game" %>
<%@ page import="com.scobolsolo.application.Match" %>
<%@ page import="com.scobolsolo.application.MatchFactory" %>
<%@ page import="com.scobolsolo.application.Player" %>
<%@ page import="com.scobolsolo.application.Staff" %>
<%@ page import="com.scobolsolo.application.Tournament" %>
<%@ page import="com.scobolsolo.matches.MatchStatus" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<%
Match lclMatch = Validate.notNull(MatchFactory.getInstance().fromHttpRequest(request));
Account lclUser = Account.demand(request);
Validate.isTrue(lclUser.mayEnter(lclMatch), "Not authorized");
Game lclGame = lclMatch.getGame(); // may be null

Tournament lclT = lclMatch.getTournament();
boolean lclTD = lclUser.mayActAsTournamentDirector(lclT) && ControllerServlet.getBooleanParameter(request, "admin");

Staff lclS = lclUser.getContact().findStaff(lclT);
Staff lclSelectedModeratorStaff = ObjectUtils.firstNonNull(lclMatch.determineLikelyModerator(), lclS, lclGame == null ? null : lclGame.getModeratorStaff());
Staff lclSelectedScorekeeperStaff = ObjectUtils.firstNonNull(lclMatch.determineLikelyScorekeeper(), lclS, lclGame == null ? null : lclGame.getScorekeeperStaff());

List<Staff> lclStaffChoices = lclT.getStaff();

MatchStatus lclStatus = lclMatch.determineStatus();
%>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="<%= lclT.getCode() %>" />
    <jsp:param name="pageTitle" value="Game Entry" />
	<jsp:param name="topMenu" value="<%= Menus.staff(lclUser.findStaff(lclT)).asTopLevel().output(request, \"match-\" + lclMatch.getUniqueString()) %>" />
	<jsp:param name="h1" value="<%= lclMatch.getRound().getName() %>" />
</jsp:include>

<form action="SetSides" method="post">
	<input type="hidden" name="match_id" value="<%= lclMatch.getId() %>" />
	<div class="row">
		<div class="small-12 medium-12 large-6 columns">
			<fieldset class="fieldset">
				<legend>Moderator</legend>
				<label><%= new AssembledDropdownField<>("moderator_staff_id", lclSelectedModeratorStaff).choices(lclStaffChoices).namer(Staff::getName, Staff::getUniqueString) %></label>
			</fieldset>
		</div>
		<div class="small-12 medium-12 large-6 columns">
			<fieldset class="fieldset">
				<legend>Scorekeeper</legend>
				<label><%= new AssembledDropdownField<>("scorekeeper_staff_id", lclSelectedScorekeeperStaff).choices(lclStaffChoices).namer(Staff::getName, Staff::getUniqueString) %></label>
			</fieldset>
		</div>
	</div>
	<div class="row" data-equalizer><%
		List<Player> lclCandidates;
		NameCodeExtractor<Player> lclPlayerNCE = new FunctionalNameCodeExtractor<>(Player::getNameWithSchoolShortName, Player::getUniqueString); 
		
		if (lclTD) {
			lclCandidates = lclT.getPlayers();
			lclCandidates.sort(Player.NameComparator.getInstance());
		} else {
			switch (lclStatus) {
				case NO_DATA:
					lclCandidates = lclT.getPlayers();
					break;
				case ONE_PLAYER_KNOWN:
					Validate.notNull(lclGame);
					lclCandidates = new LinkedList<>(lclT.getPlayers());
					lclCandidates.remove(lclGame.getSingleKnownPlayer());
					lclCandidates.add(0, lclGame.getSingleKnownPlayer());
					lclCandidates.sort(Player.NameComparator.getInstance());
					break;
				case READY:
				case IN_PROGRESS:
				case COMPLETE:
					lclCandidates = Arrays.asList(lclGame.getIncomingWinningCardPlayer(), lclGame.getIncomingLosingCardPlayer());
					break;
				default: throw new IllegalStateException("Unknown MatchStatus " + lclStatus);
			}
		}
		
		%><div class="small-12 medium-6 large-6 columns"><%= makeChoices(lclUser, lclCandidates, lclPlayerNCE, "left_player_id", "Left Player") %></div>
		<div class="small-12 medium-6 large-6 columns"><%= makeChoices(lclUser, lclCandidates, lclPlayerNCE, "right_player_id", "Right Player") %></div>
	</div><%
	
	if (lclMatch.requiresIdentificationOfWinningAndLosingCardPlayers()) {
		%><div class="row">
			<div class="small-12 medium-6 columns">
				<fieldset class="fieldset">
					<legend>Which came in with the <em>winning</em> card&nbsp;(<%= lclMatch.getWinningCard().getShortName() %>)?</legend>
					<label><input type="radio" name="winning_card_holder" value="left" checked="checked" />&nbsp;the left player</label>
					<label><input type="radio" name="winning_card_holder" value="right" />&nbsp;the right player</label>
				</fieldset>
			</div>
		</div><%
	}
	
	if (lclMatch.isBothCardsGetWin()) {
		%><div class="row columns">
			<div class="warning callout">
				<p>Tell the players that regardless of the outcome of the game, both will be credited with a win in the standings. However, the actual results still affect category awards, seeds, and potentially tiebreakers to get into the Championship Match.</p>
			</div>
		</div><%
	}
	
	%><div class="row">
		<div class="small-12 columns">
			<input type="submit" value="Continue…" />
		</div>
	</div>
</form>

<jsp:include page="/template/footer.jsp">
	<jsp:param name="loadScript" value="sides.js" />
</jsp:include>
<%!

String makeChoices(Account lclUser, Collection<Player> argCandidates, NameCodeExtractor<Player> argNCE, String argName, String argLabel) {
	Validate.notNull(lclUser);
	Validate.notNull(argCandidates); // but it may be empty
	Validate.notNull(argNCE);
	Validate.notEmpty(argName);
	Validate.notEmpty(argLabel);
	
	boolean lclUseRadios = argCandidates.size() <= 4; // Magic number!
	
	if (lclUseRadios) {
		StringBuilder lclSB = new StringBuilder()
			.append("<fieldset class=\"fieldset\" data-equalizer-watch>")
			.append("<legend>").append(argLabel).append("</legend>");
		for (Player lclP : argCandidates) {
			lclSB.append("<label id=\"").append(argName).append("_label_").append(argNCE.extractCode(lclP)).append("\">")
				.append(new RadioField<>(argName, argNCE.extractCode(lclP), false, null).attribute("onchange", "radioSidesUpdated(this)").required())
				.append("&nbsp;")
				.append(argNCE.extractName(lclP))
				.append("</label>");
		}
		lclSB.append("</fieldset>");
		
		return lclSB.toString();
	} else {
		return "<fieldset class=\"fieldset\" data-equalizer-watch><legend>" + argLabel + "</legend>" + (new AssembledDropdownField<>(argName, (Player) null).choices(argCandidates).namer(argNCE).attribute("onchange", "dropdownSidesUpdated(this)")).required() + "</fieldset>";
	}
}

%>