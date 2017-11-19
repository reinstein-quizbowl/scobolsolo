<%@ page import="java.util.Objects" %>
<%@ page import="java.util.Comparator" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.stream.Collectors" %>
<%@ page import="org.apache.commons.lang3.Validate" %>
<%@ page import="com.scobolsolo.application.Account" %>
<%@ page import="com.scobolsolo.application.Game" %>
<%@ page import="com.scobolsolo.application.Match" %>
<%@ page import="com.scobolsolo.application.Performance" %>
<%@ page import="com.scobolsolo.application.Placement" %>
<%@ page import="com.scobolsolo.application.Player" %>
<%@ page import="com.scobolsolo.application.Phase" %>
<%@ page import="com.scobolsolo.application.Response" %>
<%@ page import="com.scobolsolo.application.Round" %>
<%@ page import="com.scobolsolo.application.Staff" %>
<%@ page import="com.scobolsolo.application.Tournament" %>
<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.matches.MatchStatus" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<%
Tournament lclT = Validate.notNull(TournamentFactory.getInstance().forUniqueString(request.getParameter("object")));
Account lclUser = Account.demand(request);
%>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="<%= lclT.getCode() %>" />
    <jsp:param name="pageTitle" value="Games" />
	<jsp:param name="topMenu" value="<%= Menus.staff(lclUser.findStaff(lclT)).asTopLevel().output(request, \"all-matches\") %>" />
	<jsp:param name="h1" value="Games" />
</jsp:include>

<div class="row">
	<div class="small-12 columns"><%
		List<Match> lclMatches = lclT.streamPhase()
			.flatMap(Phase::streamRound)
			.flatMap(Round::streamMatch)
			.sorted(Match.ENTERING_PRIORITY_COMPARATOR)
			.collect(Collectors.toList());
		
		%><table data-fixed-columns="2">
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
						<td><%
							boolean lclShowLink = lclUser.mayEnter(lclM);
							if (lclShowLink) {
								%><a href="sides.jsp?match_id=<%= lclM.getId() %>"><%
							}
							MatchStatus lclS = lclM.determineStatus();
							%><%= lclS %><%
							if (lclS.hasResults() && lclM.isDual()) {
								Validate.notNull(lclG); // should be implied by lclS.hasResults()
								%> (<%= lclG.getScoreHTMLWithWinner(Player::getName) %>)<%
							}
							if (lclShowLink) {
								%></a><%
							}
							
							if (lclS == MatchStatus.IN_PROGRESS && lclG != null) {
								Placement lclThrough = lclG.streamPerformance()
									.flatMap(Performance::streamResponse)
									.map(Response::getBasePlacement)
									.filter(Objects::nonNull)
									.max(Comparator.naturalOrder()).orElse(null);
								if (lclThrough != null) {
									%> (through&nbsp;<%= lclThrough.getNumberString() %>)<%
								}
							}
							
							if (lclUser.isAdministrator() && lclG != null) {
								%> (<a href="/admin/game-edit.jsp?game_id=<%= lclG.getId() %>">admin</a>)<%
							}
						%></td>
						<td><%= lclM.getRound().getShortName() %></td>
						<td><%= lclM.getRoom().getShortName() %></td>
						<td><%
							boolean lclCertain;
							Staff lclModerator = null;
							Staff lclScorekeeper = null;
							
							if (lclG == null) {
								lclCertain = false;
								lclModerator = lclM.determineLikelyModerator(); // may be null
								lclScorekeeper = lclM.determineLikelyScorekeeper(); // may be null
							} else {
								lclModerator = lclG.getModeratorStaff();
								if (lclModerator == null) {
									lclCertain = false;
									lclModerator = lclM.determineLikelyModerator(); // may still be null
								} else {
									lclCertain = true;
								}
								
								lclScorekeeper = lclG.getScorekeeperStaff();
								if (lclScorekeeper == null) {
									lclModerator = lclM.determineLikelyScorekeeper(); // may still be null
								} else {
								}
							}
							
							if (lclModerator == null) {
								%><abbr class="stealth-tooltip" title="to be determined">TBD</abbr><%
							} else {
								%><%= lclModerator.getContact().getName() %><%
								if (lclScorekeeper != null && lclScorekeeper != lclModerator) {
									%><br />Scorekeeper: <%= lclScorekeeper.getContact().getName() %><%
								}
								if (lclCertain == false) {
									%> (probably)<%
								}
							}
						%></td>
						<td><%
							if (lclM.getRound().getPhase().isCardSystem()) {
								%><%= lclM.getWinningCard().getShortName() %> v. <%= lclM.getLosingCard().getShortName() %><%
							} else {
								%>non-card-system<%
							}
						%></td>
						<td><%
							if (lclG != null && (lclG.getIncomingWinningCardPlayer() != null || lclG.getIncomingLosingCardPlayer() != null)) {
								%><%= lclG.getIncomingWinningCardPlayer() == null ? "" : lclG.getIncomingWinningCardPlayer().getNameWithSchoolShortName() + "<br />" %>
								<%= lclG.getIncomingLosingCardPlayer() == null ? "" : lclG.getIncomingLosingCardPlayer().getNameWithSchoolShortName() %><%
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