<%@ page import="java.text.DecimalFormat" %>
<%@ page import="java.util.Collections" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
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
<%@ page import="com.scobolsolo.application.Tournament" %>
<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.opalforms.compare.PlayerCategoryPointVPPTUH" %>
<%@ page import="com.scobolsolo.opalforms.compare.PlayerRecordVRecordThenPPTUH" %>

<%
Tournament lclT = Validate.notNull(TournamentFactory.getInstance().forUniqueString(request.getParameter("object")));

DecimalFormat lclDF = new DecimalFormat("0.00");
%>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="<%= lclT.getCode() %>" />
	<jsp:param name="pageTitle" value="Points" />
	<jsp:param name="topMenu" value="<%= Menus.stats(lclT).asTopLevel().output(request, \"points\") %>" />
	<jsp:param name="h1" value="Points" />
</jsp:include>

<div class="row">
	<div class="small-12 large-9 columns">
		<h2 id="overall" data-magellan-destination="overall">Overall</h2>
		<table class="responsive">
			<thead>
				<tr>
					<th>Points</th>
					<th>Player</th>
					<th>School</th>
					<th>Record</th>
					<th><abbr title="tossups heard">TUH</abbr></th>
					<th><abbr title="points per 20 tossups heard">PP20TUH</abbr></th>
				</tr>
			</thead>
			<tbody><%
				List<PlayerRecordV> lclPRVs = new ArrayList<>();
				PlayerRecordVFactory.getInstance().acquireForQuery(
					lclPRVs, 
					new ImplicitTableDatabaseQuery("tournament_code = ?", lclT.getCode())
				);
				lclPRVs.sort(PlayerRecordVRecordThenPPTUH.getInstance());
				
				for (PlayerRecordV lclPRV : lclPRVs) {
					%><tr>
						<td><%= lclPRV.getPoints(0) %></td>
						<td data-tablesorter="<%= lclPRV.getPlayer().getContact().getSortBy() %>"><a href="player-detail.jsp?object=<%= lclT.getUniqueString() %>#player_<%= lclPRV.getPlayer().getId() %>"><%= lclPRV.getPlayer().getContact().getName() %></a></td>
						<td data-tablesorter="<%= lclPRV.getPlayer().getSchoolRegistration().getSchool().getExplainedName() %>"><a href="player-detail.jsp?object=<%= lclT.getUniqueString() %>#school_<%= lclPRV.getPlayer().getSchoolRegistration().getSchool().getId() %>"><%= lclPRV.getPlayer().getSchoolRegistration().getSchool().getExplainedName() %></a></td>
						<td data-tablesorter="<%= lclDF.format(lclPRV.getWinningPercentage()) %>"><%= lclPRV.getWinCount(0) %>&#8211;<%= lclPRV.getLossCount(0) %></td>
						<td><%= lclPRV.getTossupsHeard(0) %></td>
						<td><%= lclDF.format(20.0f * lclPRV.getPPTUH()) %></td>
					</tr><%
				}
			%></tbody>
		</table>
		
		<p>Tiebreakers are excluded from the category-specific point totals.</p><%
		
		List<Category> lclCategories = new ArrayList<>();
		CategoryFactory.getInstance().acquireForQuery(
			lclCategories, 
			new ImplicitTableDatabaseQuery(
				"code IN (SELECT category_code FROM Category_Use WHERE tournament_code = ?)", 
				lclT.getCode()
			)
		);
		lclCategories.sort(Category.StandardComparator.getInstance());
		
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
			%><h2 id="<%= lclC.getCode() %>" data-magellan-destination="<%= lclC.getCode() %>"><%= lclC.getName() %></h2><%
			
			List<PlayerCategoryPointV> lclPCPVs = lclMultimap.get(lclC);
			if (lclPCPVs == null || lclPCPVs.size() == 0) {
				%><p>No results available</p><%
			} else {
				lclPCPVs.sort(PlayerCategoryPointVPPTUH.getInstance());
				%><table class="responsive">
					<thead>
						<tr>
							<th>Points</th>
							<th>Player</th>
							<th>School</th>
							<th><abbr title="tossups heard">TUH</abbr></th>
							<th><abbr title="points per tossup heard">PPTUH</abbr></th>
						</tr>
					</thead>
					<tbody><%
						for (PlayerCategoryPointV lclPCPV : lclPCPVs) {
							%><tr>
								<td><%= lclPCPV.getPoints(0) %></td>
								<td data-tablesorter="<%= lclPCPV.getPlayer().getContact().getSortBy() %>"><a href="player-detail.jsp?object=<%= lclT.getUniqueString() %>#player_<%= lclPCPV.getPlayer().getId() %>"><%= lclPCPV.getPlayer().getContact().getName() %></a></td>
								<td><a href="player-detail.jsp?object=<%= lclT.getUniqueString() %>#school_<%= lclPCPV.getPlayer().getSchoolRegistration().getSchool().getId() %>"><%= lclPCPV.getPlayer().getSchoolRegistration().getSchool().getExplainedName() %></a></td>
								<td><%= lclPCPV.getTossupsHeard(0) %></td>
								<td><%= lclDF.format(lclPCPV.getPPTUH()) %></td>
							</tr><%
						}
					%></tbody>
				</table><%
			}
		}
	%></div>
	
	<div class="show-for-large-up large-3 columns">
		<div data-magellan-expedition>
			<ul class="magellan side-nav">
				<li data-magellan-arrival="overall"><a href="#overall">Overall</a></li><%
				for (Category lclC : lclCategories) {
					%><li data-magellan-arrival="<%= lclC.getCode() %>"><a href="#<%= lclC.getCode() %>"><%= lclC.getName() %></a></li><%
				}
			%></dl>
		</div>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />