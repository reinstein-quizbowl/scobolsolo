<%@ page import="java.util.Comparator" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.stream.Collectors" %>
<%@ page import="org.apache.commons.lang3.Validate" %>
<%@ page import="com.google.common.collect.ImmutableList" %>
<%@ page import="com.google.common.collect.RowSortedTable" %>
<%@ page import="com.google.common.collect.TreeBasedTable" %>
<%@ page import="com.siliconage.util.Tally" %>
<%@ page import="com.scobolsolo.application.Game" %>
<%@ page import="com.scobolsolo.application.GameFactory" %>
<%@ page import="com.scobolsolo.application.Match" %>
<%@ page import="com.scobolsolo.application.Packet" %>
<%@ page import="com.scobolsolo.application.Performance" %>
<%@ page import="com.scobolsolo.application.Placement" %>
<%@ page import="com.scobolsolo.application.Player" %>
<%@ page import="com.scobolsolo.application.Response" %>
<%@ page import="com.scobolsolo.application.Round" %>
<%@ page import="com.scobolsolo.application.Staff" %>
<%@ page import="com.scobolsolo.application.Tournament" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.Utility" %>

<%

Game lclG = Validate.notNull(GameFactory.getInstance().fromHttpRequest(request));
Match lclM = lclG.getMatch();
Round lclRound = lclM.getRound();
Packet lclPacket = lclRound.getPacket();
Tournament lclT = lclRound.getTournament();

List<Performance> lclPerfs;
if (lclG.getOutgoingWinningCardPlayer() != null && lclG.getOutgoingLosingCardPlayer() != null) {
	lclPerfs = ImmutableList.of(lclG.findPerformance(lclG.getOutgoingWinningCardPlayer()), lclG.findPerformance(lclG.getOutgoingLosingCardPlayer()));
} else {
	lclPerfs = lclG.streamPerformance()
		.sorted(Comparator.comparing(Performance::getPlayer))
		.collect(Collectors.toList());
}

String lclTitle = lclT.getName() + " " + lclM.getRound().getName() + ": " + Utility.makeList(lclPerfs, argPerf -> argPerf.getPlayer().getName(), "vs.");
%>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="<%= lclT.getCode() %>" />
	<jsp:param name="pageTitle" value="<%= lclTitle %>" />
	<jsp:param name="topMenu" value="<%= Menus.stats(lclT).asTopLevel().output(request, \"game-\" + lclG.getId()) %>" />
	<jsp:param name="h1" value="<%= lclTitle %>" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<dl>
			<dt>Room</dt>
				<dd><%= lclM.getRoom().getName() %></dd><%
				
			Staff lclModerator = lclG.getModeratorStaff();
			Staff lclScorekeeper = lclG.getScorekeeperStaff();
			if (lclModerator != null) {
				%><dt>Moderator</dt>
					<dd><%= lclModerator.getContact().getName() %></dd><%
				if (lclScorekeeper != null && lclScorekeeper != lclModerator) {
					%><dt>Scorekeeper</dt>
						<dd><%= lclScorekeeper.getContact().getName() %></dd><%
				}
			}
			if (lclM.isCardSystem()) {
				%><dt>Cards</dt>
					<dd><%= lclG.getIncomingWinningCardPlayer().getName() %> came in with <%= lclM.getWinningCard().getName() %></dd>
					<dd><%= lclG.getIncomingLosingCardPlayer().getName() %> came in with <%= lclM.getLosingCard().getName() %></dd><%
			}
			if (lclG.getTossupsHeardAsObject() != null && lclG.getTossupsHeard() > 0) {
				%><dt>Tossups Heard</dt>
					<dd><%= lclG.getTossupsHeard() %></dd><%
			}
		%></dl>
		
		<table data-fixed-columns="1" class="unsortable">
			<thead>
				<tr>
					<th>#</th><%
					if (lclPacket.isQuestionsPublic()) {
						%><th>Answer</th><%
					}
					
					for (Performance lclPerf : lclPerfs) {
						Player lclP = lclPerf.getPlayer();
						%><th colspan="2">
							<a href="player-detail.jsp?school_registration_id=<%= lclP.getSchoolRegistration().getId() %>#player_<%= lclP.getId() %>"><%= lclP.getName() %></a><br />
							<%= lclP.getSchool().getName() %>
						</th><%
					}
				%></tr>
			</thead>
			<tbody><%
				RowSortedTable<Placement, Performance, Response> lclTable = TreeBasedTable.create(Comparator.naturalOrder(), Comparator.comparing(Performance::getPlayer, Player.SCHOOL_THEN_NAME_COMPARATOR));
				for (Performance lclPerf : lclPerfs) {
					for (Response lclR : lclPerf.getResponseSet()) {
						lclTable.put(lclR.getBasePlacement(), lclPerf, lclR);
					}
				}
				
				Tally<Performance> lclScores = new Tally<>();
				
				for (Placement lclBasePL : lclTable.rowKeySet()) {
					%><tr>
						<th><%= lclBasePL.getNumberString() %></th><%
						if (lclPacket.isQuestionsPublic()) {
							%><td><%
								if (lclBasePL.getPacket().isQuestionsPublic()) {
									%><%= lclBasePL.getQuestion().getDescription() %><%
								} else {
									%>&nbsp;<%
								}
							%></td><%
						}
						for (Performance lclPerf : lclPerfs) {
							%><td><%
								Response lclR = lclTable.get(lclBasePL, lclPerf);
								lclScores.tally(lclPerf, lclR.getType().getPoints());
								
								if (lclR == null) {
									%>&nbsp;<%
								} else {
									%><%= lclR.getType().getName() %><%
									if (lclR.getReplacementPlacement() != null && lclR.getReplacementPlacement() != lclBasePL) {
										%> (replaced)<%
									}
								}
								if (lclR.hasLocation()) {
									%> at <%= lclR.getWordStartIndex() %>/<%= lclR.getWordEndIndex() %><%
								}
							%></td>
							<td><%= lclScores.get(lclPerf) %></td><%
						}
					%></tr><%
				}
			%></tbody>
			<tfoot>
				<tr>
					<th colspan="<%= lclPacket.isQuestionsPublic() ? 2 : 1 %>">Final Score</th><%
					for (Performance lclPerf : lclPerfs) {
						%><td>&nbsp;</td>
						<td><%= lclScores.get(lclPerf) %></td><%
					}
				%></tr>
			</tfoot>
		</table>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />
