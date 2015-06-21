﻿<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="org.apache.commons.lang3.Validate" %>
<%@ page import="com.scobolsolo.application.*" %>
<%@ page import="com.scobolsolo.opalforms.compare.MatchEnteringPriority" %>
<%@ page import="com.scobolsolo.matches.*" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<%
Tournament lclT = Validate.notNull(TournamentFactory.getInstance().forUniqueString(request.getParameter("object")));
%>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="<%= lclT.getCode() %>" />
    <jsp:param name="pageTitle" value="Games" />
	<jsp:param name="topMenu" value="<%= Menus.tournamentAdmin(lclT).asTopLevel().output(request, \"games-\" + lclT.getUniqueString()) %>" />
	<jsp:param name="h1" value="Games" />
</jsp:include>

<div class="row">
	<div class="small-12 columns"><%
		List<Match> lclMatches = new ArrayList<>();
		
		for (Phase lclP : lclT.createPhaseArray()) {
			for (RoundGroup lclRG : lclP.createRoundGroupArray()) {
				for (Round lclR : lclRG.createRoundArray()) {
					lclR.acquireMatch(lclMatches);
				}
			}
		}
		lclMatches.sort(MatchEnteringPriority.getInstance());
		
		%><table class="responsive">
			<thead>
				<tr>
					<th>Status</th>
					<th>Round</th>
					<th>Room</th>
					<th>Moderator</th>
					<th>Cards</th>
					<th>Players</th>
				</tr>
			</thead>
			<tbody><%
				for (Match lclM : lclMatches) {
					Game lclG = lclM.getGame();
					%><tr>
						<td>
							<a href="dual-game-enter.jsp?match_id=<%= lclM.getId() %>"><%
								MatchStatus lclS = lclM.determineStatus();
								%><%= lclS %><%
								if (lclS.hasResults() && lclM.isDual()) {
									Validate.notNull(lclG); // should be implied by lclS.hasResults()
									DualGameResult lclGR = (DualGameResult) GameResult.get(lclG);
									%> (<%= lclGR.getScore() %> in favor of <%= lclGR.getWinner().getContact().getName() %>)<%
								}
							%></a>
						</td>
						<td><%= lclM.getRound().getShortName() %></td>
						<td><%= lclM.getRoom().getShortName() %></td>
						<td><%
							if (lclG != null) {
								if (lclG.getModeratorStaff() == null) {
									%>?<%
								} else {
									%><%= lclG.getModeratorStaff().getContact().getName() %><%
								}
							} else {
								%>&nbsp;<%
							}
						%></td>
						<td><%
							if (lclM.getRound().getRoundGroup().getPhase().isCardSystem()) {
								%><%= lclM.getWinningCard().getShortName() %> v. <%= lclM.getLosingCard().getShortName() %><%
							} else {
								%>non-card-system<%
							}
						%></td>
						<td><%
							if (lclG != null && (lclG.getIncomingWinningCardPlayer() != null || lclG.getIncomingLosingCardPlayer() != null)) {
								%><%= lclG.getIncomingWinningCardPlayer() == null ? "" : lclG.getIncomingWinningCardPlayer().getNameWithSchool() + "<br />" %>
								<%= lclG.getIncomingLosingCardPlayer() == null ? "" : lclG.getIncomingLosingCardPlayer().getNameWithSchool() %><%
							} else {
								%>&nbsp;<%
							}
						%></td>
					</tr><%
				}
			%></tbody>
			</table>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />