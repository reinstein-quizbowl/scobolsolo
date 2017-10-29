<%@ page import="java.util.Collections" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="org.apache.commons.lang3.Validate" %>
<%@ page import="com.opal.DatabaseQuery" %>
<%@ page import="com.scobolsolo.application.Game" %>
<%@ page import="com.scobolsolo.application.Match" %>
<%@ page import="com.scobolsolo.application.MatchFactory" %>
<%@ page import="com.scobolsolo.application.Staff" %>
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
		<table data-fixed-columns="1">
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
						"	JOIN Phase P ON RG.phase_id = P.id " +
						"WHERE P.tournament_code = ?",
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
							boolean lclCertain;
							Staff lclModerator = null;
							
							if (lclG == null) {
								lclCertain = false;
								lclModerator = lclM.determineLikelyModerator(); // may be null
							} else {
								lclModerator = lclG.getModeratorStaff();
								if (lclModerator == null) {
									lclCertain = false;
									lclModerator = lclM.determineLikelyModerator(); // may still be null
								} else {
									lclCertain = true;
								}
							}
							
							if (lclModerator == null) {
								%><abbr class="stealth-tooltip" title="to be determined">TBD</abbr><%
							} else {
								%><%= lclModerator.getContact().getName() %><%
								if (lclCertain == false) {
									%> (probably)<%
								}
							}
						%></td>
						<td><%
							if (lclM.getRound().getRoundGroup().getPhase().isCardSystem()) {
								%><%= lclM.getWinningCard().getShortName() %>&nbsp;v.&nbsp;<%= lclM.getLosingCard().getShortName() %><%
							} else {
								%><span class="stealth-tooltip" title="This match does not use the card system">n/a</span><%
							}
						%></td>
						<td><%
							if (lclG != null && lclG.getIncomingWinningCardPlayer() != null && lclG.getIncomingLosingCardPlayer() != null) {
								%><a href="/stats/player-detail.jsp?school_registration_id=<%= lclG.getIncomingWinningCardPlayer().getSchoolRegistration().getId() %>#player_<%= lclG.getIncomingWinningCardPlayer().getId() %>"><%= lclG.getIncomingWinningCardPlayer().getNameWithSchool() %></a><br />
								<a href="/stats/player-detail.jsp?school_registration_id=<%= lclG.getIncomingLosingCardPlayer().getId() %>#player_<%= lclG.getIncomingLosingCardPlayer().getId() %>"><%= lclG.getIncomingLosingCardPlayer().getNameWithSchool() %></a><%
							} else {
								%><abbr class="stealth-tooltip" title="to be determined">TBD</abbr><%
							}
						%></td>
					</tr><%
				}
			%></tbody>
		</table>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />