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

DecimalFormat lclDF = new DecimalFormat("0.00");
DecimalFormat lclPF = new DecimalFormat("0.0%");
%>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="<%= lclT.getCode() %>" />
	<jsp:param name="pageTitle" value="Points" />
	<jsp:param name="topMenu" value="<%= Menus.stats(lclT).asTopLevel().output(request, \"points\") %>" />
	<jsp:param name="h1" value="Points" />
</jsp:include>

<div class="row">
	<div class="small-12 large-9 columns">
		<h2 id="overall" data-magellan-target="overall">Overall</h2>
		<table class="responsive">
			<thead>
				<tr>
					<th class="number"><abbr title="points">Pts</abbr></th>
					<th>Player</th>
					<th>School</th>
					<th>Record</th>
					<th class="number"><abbr title="tossups heard">TUH</abbr></th>
					<th class="number"><abbr title="points per 20 tossups heard">PP20TUH</abbr></th>
					<th class="number"><abbr title="average distance into questions of correct buzzes, weighted by game">CDepth</abbr></th>
				</tr>
			</thead>
			<tbody><%
				List<PlayerRecordV> lclPRVs = new ArrayList<>();
				PlayerRecordVFactory.getInstance().acquireForQuery(
					lclPRVs, 
					new ImplicitTableDatabaseQuery("tournament_code = ?", lclT.getCode())
				);
				lclPRVs.sort(PlayerRecordV.PPTUH_COMPARATOR);
				
				for (PlayerRecordV lclPRV : lclPRVs) {
					Player lclPlayer = lclPRV.getPlayer();
					School lclSchool = lclPlayer.getSchool();
					
					%><tr>
						<th class="number"><%= lclPRV.getPoints(0) %></th>
						<th data-tablesorter="<%= lclPlayer.getContact().getSortBy() %>"><a href="/stats/player-detail.jsp?object=<%= lclT.getUniqueString() %>#player_<%= lclPlayer.getId() %>"><%= lclPlayer.getContact().getName() %></a></th>
						<td data-tablesorter="<%= lclSchool.getShortName() %>"><a href="/stats/player-detail.jsp?object=<%= lclT.getUniqueString() %>#school_<%= lclPlayer.getSchoolRegistration().getSchool().getId() %>" title="<%= lclSchool.getExplainedName() %>"><%= lclSchool.getShortName() %></a></td>
						<td data-tablesorter="<%= lclDF.format(lclPRV.getWinningPercentage()) %>"><%= lclPRV.getWinCount(0) %>&#8211;<%= lclPRV.getLossCount(0) %></td>
						<td class="number"><%= lclPRV.getTossupsHeard(0) %></td>
						<td class="number"><%= lclDF.format(20.0f * lclPRV.getPPTUH()) %></td>
						<td class="number"><%
							OptionalDouble lclACBD = lclPRV.getAverageCorrectBuzzDepth();
							if (lclACBD.isPresent()) {
								%><%= lclPF.format(lclACBD.getAsDouble()) %><%
							} else {
								%>n/a<%
							}
						%></td>
					</tr><%
				}
			%></tbody>
		</table>
		
		<p>Tiebreakers are excluded from the category-specific point totals.</p><%
		
		List<Category> lclCategories = CategoryFactory.getInstance().acquireForQuery(
			new ArrayList<>(),
			new ImplicitTableDatabaseQuery(
				"code IN (SELECT category_code FROM Category_Use WHERE tournament_code = ?)", 
				lclT.getCode()
			)
		);
		lclCategories.sort(null);
		
		List<Player> lclPlayers = lclT.getPlayers();
		ListMultimap<Category, PlayerCategoryPointV> lclMultimap = ArrayListMultimap.create(lclCategories.size(), lclPlayers.size());
		
		List<PlayerCategoryPointV> lclAllPCPVs = new ArrayList<>(lclCategories.size() * lclPlayers.size());
		PlayerCategoryPointVFactory.getInstance().acquireForQuery(
			lclAllPCPVs, 
			new ImplicitTableDatabaseQuery("tournament_code = ?", lclT.getCode())
		);
		for (PlayerCategoryPointV lclPCPV : lclAllPCPVs) {
			lclMultimap.put(lclPCPV.getCategory(), lclPCPV);
		}
		
		
		for (Category lclC : lclCategories) {
			%><h2 id="<%= lclC.getCode() %>" data-magellan-target="<%= lclC.getCode() %>"><%= lclC.getName() %></h2><%
			
			List<PlayerCategoryPointV> lclPCPVs = lclMultimap.get(lclC);
			if (lclPCPVs == null || lclPCPVs.isEmpty()) {
				%><p>No results available</p><%
			} else {
				lclPCPVs.sort(PlayerCategoryPointV.PPTUH_COMPARATOR);
				%><table class="responsive">
					<thead>
						<tr>
							<th class="number"><abbr title="points">Pts</abbr></th>
							<th>Player</th>
							<th>School</th>
							<th class="number"><abbr title="tossups heard">TUH</abbr></th>
							<th class="number"><abbr title="points per tossup heard">PPTUH</abbr></th>
							<th class="number"><abbr title="average distance into questions of correct buzzes">CDepth</abbr></th>
						</tr>
					</thead>
					<tbody><%
						for (PlayerCategoryPointV lclPCPV : lclPCPVs) {
							Player lclPlayer = lclPCPV.getPlayer();
							School lclSchool = lclPlayer.getSchool();
							
							%><tr>
								<th class="number"><%= lclPCPV.getPoints(0) %></th>
								<th data-tablesorter="<%= lclPlayer.getContact().getSortBy() %>"><a href="/stats/player-detail.jsp?object=<%= lclT.getUniqueString() %>#player_<%= lclPlayer.getId() %>"><%= lclPlayer.getContact().getName() %></a></th>
								<td data-tablesorter="<%= lclSchool.getShortName() %>"><a href="/stats/player-detail.jsp?object=<%= lclT.getUniqueString() %>#school_<%= lclPlayer.getSchoolRegistration().getSchool().getId() %>" title="<%= lclSchool.getExplainedName() %>"><%= lclSchool.getShortName() %></a></td>
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
		}
	%></div>
	
	<nav class="show-for-large large-3 columns" data-magellan data-active-class="active">
		<ul class="magellan side-nav no-bullet">
			<li><a href="#overall">Overall</a></li><%
			for (Category lclC : lclCategories) {
				%><li><a href="#<%= lclC.getCode() %>"><%= lclC.getName() %></a></li><%
			}
		%></ul>
	</nav>
</div>

<jsp:include page="/template/footer.jsp" />