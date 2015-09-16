<%@ page import="java.util.Collections" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="org.apache.commons.lang3.Validate" %>
<%@ page import="com.opal.DatabaseQuery" %>
<%@ page import="com.scobolsolo.application.Game" %>
<%@ page import="com.scobolsolo.application.Match" %>
<%@ page import="com.scobolsolo.application.MatchFactory" %>
<%@ page import="com.scobolsolo.application.Tournament" %>
<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.matches.*" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<%
Tournament lclT = Validate.notNull(TournamentFactory.getInstance().forUniqueString(request.getParameter("object")));
%>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="<%= lclT.getCode() %>" />
	<jsp:param name="pageTitle" value="Coming Up Next" />
	<jsp:param name="topMenu" value="<%= Menus.stats(lclT).asTopLevel().output(request, \"coming-up-next\") %>" />
	<jsp:param name="h1" value="Coming Up Next" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<table class="reponsive">
			<thead>
				<tr>
					<th>Round</th>
					<th>Room</th>
					<th>Moderator</th>
					<th>Cards</th>
					<th>Players</th>
				</tr>
			</thead>
			<tbody><%
				List<Match> lclMatches = new ArrayList<>();
				MatchFactory.getInstance().acquireForQuery(
					lclMatches,
					new DatabaseQuery(
						"SELECT * " +
						"FROM Upcoming_Match_v UMV " +
						"	JOIN Round R ON UMV.round_id = R.id " +
						"	JOIN Round_Group RG ON R.round_group_id = RG.id " +
						"WHERE RG.tournament_code = ?",
						lclT.getCode()
					)
				);
				lclMatches.sort(null);
				
				for (Match lclM : lclMatches) {
					Game lclG = lclM.getGame();
					%><tr>
						<td><%= lclM.getRound().getShortName() %></td>
						<td><%= lclM.getRoom().getShortName() %></td>
						<td><%
							if (lclG != null) {
								if (lclG.getModeratorStaff() == null) {
									%><abbr class="stealth-tool-tip" title="to be determined">TBD</abbr><%
								} else {
									%><%= lclG.getModeratorStaff().getContact().getName() %><%
								}
							} else {
								%><abbr class="stealth-tool-tip" title="to be determined">TBD</abbr><%
							}
						%></td>
						<td><%
							if (lclM.getRound().getRoundGroup().getPhase().isCardSystem()) {
								%><%= lclM.getWinningCard().getShortName() %>&nbsp;v.&nbsp;<%= lclM.getLosingCard().getShortName() %><%
							} else {
								%><span class="stealth-tool-tip" title="This match does not use the card system">n/a</span><%
							}
						%></td>
						<td><%
							if (lclG != null && lclG.getIncomingWinningCardPlayer() != null && lclG.getIncomingLosingCardPlayer() != null) {
								%><a href="player-detail.jsp?object=<%= lclT.getUniqueString() %>#player_<%= lclG.getIncomingWinningCardPlayer().getId() %>"><%= lclG.getIncomingWinningCardPlayer().getNameWithSchool() %></a><br />
								<a href="player-detail.jsp?object=<%= lclT.getUniqueString() %>#player_<%= lclG.getIncomingLosingCardPlayer().getId() %>"><%= lclG.getIncomingLosingCardPlayer().getNameWithSchool() %></a><%
							} else {
								%><abbr class="stealth-tool-tip" title="to be determined">TBD</abbr><%
							}
						%></td>
					</tr><%
				}
			%></tbody>
		</table>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />