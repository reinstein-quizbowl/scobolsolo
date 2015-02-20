<%@ page import="java.text.DecimalFormat" %>
<%@ page import="java.util.Collections" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="org.apache.commons.lang3.Validate" %>
<%@ page import="com.opal.ImplicitTableDatabaseQuery" %>
<%@ page import="com.scobolsolo.application.PlayerRecordV" %>
<%@ page import="com.scobolsolo.application.PlayerRecordVFactory" %>
<%@ page import="com.scobolsolo.application.Tournament" %>
<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.opalforms.compare.PlayerRecordVRecordThenPPTUH" %>

<%
Tournament lclT = Validate.notNull(TournamentFactory.getInstance().forUniqueString(request.getParameter("object")));
%>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="<%= lclT.getCode() %>" />
	<jsp:param name="pageTitle" value="Standings" />
	<jsp:param name="topMenu" value="<%= Menus.stats(lclT).asTopLevel().output(request, \"standings\") %>" />
	<jsp:param name="h1" value="Standings" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<table class="responsive">
			<thead>
				<tr>
					<th>Player</th>
					<th>School</th>
					<th>Record</th>
					<th>Points</th>
					<th>Tossups Heard</th>
					<th><abbr title="points per 20 tossups heard">PP20TUH</abbr></th>
				</tr>
			</thead>
			<tbody><%
				DecimalFormat lclDF = new DecimalFormat("0.00");
				
				List<PlayerRecordV> lclPRVs = new ArrayList<>();
				PlayerRecordVFactory.getInstance().acquireForQuery(
					lclPRVs,
					new ImplicitTableDatabaseQuery("tournament_code = ?", lclT.getCode())
				);
				lclPRVs.sort(PlayerRecordVRecordThenPPTUH.getInstance());
				
				for (PlayerRecordV lclPRV : lclPRVs) {
					%><tr>
						<td data-tablesorter="<%= lclPRV.getPlayer().getContact().getSortBy() %>"><a href="player-detail.jsp?object=<%= lclT.getUniqueString() %>#player_<%= lclPRV.getPlayer().getId() %>"><%= lclPRV.getPlayer().getContact().getName() %></a></td>
						<td><a href="player-detail.jsp?object=<%= lclT.getUniqueString() %>#school_<%= lclPRV.getPlayer().getSchoolRegistration().getSchool().getId() %>"><%= lclPRV.getPlayer().getSchoolRegistration().getSchool().getExplainedName() %></a></td>
						<td data-tablesorter="<%= lclDF.format(lclPRV.getWinningPercentage()) %>"><%= lclPRV.getWinCount(0) %>&#8211;<%= lclPRV.getLossCount(0) %></td>
						<td><%= lclPRV.getPoints(0) %></td>
						<td><%= lclPRV.getTossupsHeard(0) %></td>
						<td><%= lclDF.format(20.0d * lclPRV.getPPTUH()) %></td>
					</tr><%
				}
			%></tbody>
		</table>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />