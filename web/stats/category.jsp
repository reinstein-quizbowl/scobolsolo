<%@ page import="java.text.DecimalFormat" %>
<%@ page import="java.util.Collections" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.OptionalDouble" %>
<%@ page import="org.apache.commons.lang3.Validate" %>
<%@ page import="com.google.common.collect.ListMultimap" %>
<%@ page import="com.google.common.collect.ArrayListMultimap" %>
<%@ page import="com.opal.ImplicitTableDatabaseQuery" %>
<%@ page import="com.scobolsolo.application.Category" %>
<%@ page import="com.scobolsolo.application.CategoryFactory" %>
<%@ page import="com.scobolsolo.application.Player" %>
<%@ page import="com.scobolsolo.application.PlayerCategoryPointV" %>
<%@ page import="com.scobolsolo.application.PlayerCategoryPointVFactory" %>
<%@ page import="com.scobolsolo.application.PlayerRecordV" %>
<%@ page import="com.scobolsolo.application.PlayerRecordVFactory" %>
<%@ page import="com.scobolsolo.application.School" %>
<%@ page import="com.scobolsolo.application.Tournament" %>
<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<%
Tournament lclT = Validate.notNull(TournamentFactory.getInstance().forUniqueString(request.getParameter("object")));
Category lclC = Validate.notNull(CategoryFactory.getInstance().fromHttpRequest(request));

DecimalFormat lclDF = new DecimalFormat("0.00");
DecimalFormat lclPF = new DecimalFormat("0.0%");

%>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="<%= lclT.getCode() %>" />
	<jsp:param name="pageTitle" value="<%= lclC.getName() %>" />
	<jsp:param name="topMenu" value="<%= Menus.stats(lclT).asTopLevel().output(request, \"points-\" + lclC.getCode()) %>" />
	<jsp:param name="h1" value="<%= lclC.getName() %>" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>Tiebreakers are excluded.</p><%
		
		List<PlayerCategoryPointV> lclResults = PlayerCategoryPointVFactory.getInstance().acquireForQuery(
			new ArrayList<>(lclT.getCategoryUseSet().size()),
			new ImplicitTableDatabaseQuery("tournament_code = ? AND category_code = ?", lclT.getCode(), lclC.getCode())
		);
		
		if (lclResults.isEmpty()) {
			%><p>No results available</p><%
		} else {
			lclResults.sort(PlayerCategoryPointV.PPTUH_COMPARATOR);
			%><table data-fixed-columns="2">
				<thead>
					<tr>
						<th class="number"><abbr title="points">Pts</abbr></th>
						<th>Player</th>
						<th>Year</th>
						<th>School</th>
						<th class="number"><abbr title="tossups heard">TUH</abbr></th>
						<th class="number"><abbr title="points per tossup heard">PPTUH</abbr></th>
						<th class="number"><abbr title="average distance into questions of correct buzzes">CDepth</abbr></th>
					</tr>
				</thead>
				<tbody><%
					for (PlayerCategoryPointV lclPCPV : lclResults) {
						Player lclPlayer = lclPCPV.getPlayer();
						School lclSchool = lclPlayer.getSchool();
						
						%><tr>
							<th class="number"><%= lclPCPV.getPoints(0) %></th>
							<th data-order="<%= lclPlayer.getContact().getSortBy() %>"><a href="/stats/player-detail.jsp?school_registration_id=<%= lclPlayer.getSchoolRegistration().getId() %>#player_<%= lclPlayer.getId() %>"><%= lclPlayer.getContact().getName() %></a></th>
							<td data-order="<%= lclPlayer.getSchoolYear() == null ? Integer.MAX_VALUE : lclPlayer.getSchoolYear().getSequence() %>"><%= lclPlayer.getSchoolYear() == null ? "&nbsp;" : lclPlayer.getSchoolYear().getShortName() %></td>
							<td data-order="<%= lclSchool.getShortName() %>"><a href="/stats/player-detail.jsp?school_registration_id=<%= lclPlayer.getSchoolRegistration().getId() %>#school_<%= lclPlayer.getSchoolRegistration().getSchool().getId() %>" title="<%= lclSchool.getExplainedName() %>"><%= lclSchool.getShortName() %></a></td>
							<td class="number"><%= lclPCPV.getTossupsHeard(0) %></td>
							<td class="number"><%= lclDF.format(lclPCPV.getPPTUH()) %></td>
							<td class="number"><%
								Double lclACBD = lclPCPV.getAverageCorrectBuzzDepthAsObject();
								if (lclACBD == null) {
									%>n/a<%
								} else {
									%><%= lclPF.format(lclACBD.doubleValue()) %><%
								}
							%></td>
						</tr><%
					}
				%></tbody>
			</table><%
		}
	%></div>
</div>

<jsp:include page="/template/footer.jsp" />