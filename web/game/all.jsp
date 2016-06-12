<%@ page import="java.util.List" %>
<%@ page import="java.util.stream.Collectors" %>
<%@ page import="org.apache.commons.lang3.Validate" %>
<%@ page import="com.scobolsolo.application.Account" %>
<%@ page import="com.scobolsolo.application.Game" %>
<%@ page import="com.scobolsolo.application.Match" %>
<%@ page import="com.scobolsolo.application.Player" %>
<%@ page import="com.scobolsolo.application.Phase" %>
<%@ page import="com.scobolsolo.application.Round" %>
<%@ page import="com.scobolsolo.application.RoundGroup" %>
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
			.flatMap(Phase::streamRoundGroup)
			.flatMap(RoundGroup::streamRound)
			.flatMap(Round::streamMatch)
			.sorted(Match.ENTERING_PRIORITY_COMPARATOR)
			.collect(Collectors.toList());
		
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
						%></td>
						<td><%= lclM.getRound().getShortName() %></td>
						<td><%= lclM.getRoom().getShortName() %></td>
						<td><%
							if (lclG != null) {
								if (lclG.getModeratorStaff() == null) {
									%>?<%
								} else {
									%><%= lclG.getModeratorStaff().getContact().getName() %><%
									if (lclG.getScorekeeperStaff() != null && lclG.getScorekeeperStaff() != lclG.getModeratorStaff()) {
										%><br />Scorekeeper: <%= lclG.getScorekeeperStaff().getContact().getName() %><%
									}
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