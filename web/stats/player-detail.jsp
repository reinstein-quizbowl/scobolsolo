<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="org.apache.commons.lang3.Validate" %>
<%@ page import="com.google.common.collect.SetMultimap" %>
<%@ page import="com.google.common.collect.TreeMultimap" %>
<%@ page import="com.opal.ImplicitTableDatabaseQuery" %>
<%@ page import="com.scobolsolo.application.*" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<%
Tournament lclT = Validate.notNull(TournamentFactory.getInstance().forUniqueString(request.getParameter("object")));
%>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="<%= lclT.getCode() %>" />
	<jsp:param name="pageTitle" value="Player Detail" />
	<jsp:param name="topMenu" value="<%= Menus.stats(lclT).asTopLevel().output(request, \"player-detail\") %>" />
	<jsp:param name="h1" value="Player Detail" />
</jsp:include>

<div class="row">
	<div class="small-12 large-9 columns"><%
		List<Player> lclPlayers = lclT.getPlayers();
		SetMultimap<School, Player> lclSchoolToPlayers = TreeMultimap.create(School.NameComparator.getInstance(), Player.NameComparator.getInstance());
		for (Player lclP : lclPlayers) {
			lclSchoolToPlayers.put(lclP.getSchoolRegistration().getSchool(), lclP);
		}

		List<PlayerMatchV> lclPMVList = new ArrayList<>();
		PlayerMatchVFactory.getInstance().acquireForQuery(
			lclPMVList,
			new ImplicitTableDatabaseQuery("tournament_code = ?", lclT.getCode())
		);
		SetMultimap<Player, PlayerMatchV> lclPlayerToPMVs = TreeMultimap.create(Player.NameComparator.getInstance(), PlayerMatchV.RoundComparator.getInstance());
		for (PlayerMatchV lclPMV : lclPMVList) {
			lclPlayerToPMVs.put(lclPMV.getPlayer(), lclPMV);
		}

		List<GameV> lclGVList = new ArrayList<>();
		GameVFactory.getInstance().acquireForQuery(
			lclGVList,
			new ImplicitTableDatabaseQuery("tournament_code = ?", lclT.getCode())
		);
		Map<Game, GameV> lclGameToGV = new HashMap<>(lclGVList.size());
		for (GameV lclGV : lclGVList) {
			lclGameToGV.put(lclGV.getGame(), lclGV);
		}

		for (School lclS : lclSchoolToPlayers.keySet()) {
			%><h2 id="school_<%= lclS.getId() %>" data-magellan-destination="school_<%= lclS.getId() %>"><%= lclS.getExplainedName() %></h2><%
			
			for (Player lclP : lclSchoolToPlayers.get(lclS)) {
				%><h3 id="player_<%= lclP.getId() %>"><%= lclP.getContact().getName() %></h3><%
				if (lclPlayerToPMVs.containsKey(lclP) && !lclPlayerToPMVs.get(lclP).isEmpty()) {
					%><table class="responsive">
						<thead>
							<tr>
								<th>Round</th>
								<th>Opponent</th>
								<th>Score</th>
								<th>Opp.&nbsp;Score</th>
								<th><abbr title="tossups heard">TUH</abbr></th>
								<th>Record After</th>
							</tr>
						</thead>
						<tbody><%
							int lclWins = 0, lclLosses = 0;
							for (PlayerMatchV lclPMV : lclPlayerToPMVs.get(lclP)) {
								Game lclG = Validate.notNull(lclPMV.getGame());
								Match lclM = Validate.notNull(lclG.getMatch());
								
								GameV lclGV = lclGameToGV.get(lclG);
								if (lclGV == null) {
									continue;
								}
								
								boolean lclWon;
								if (lclGV.getWinnerPlayer() == lclP) {
									lclWon = true;
									++lclWins;
								} else if (lclGV.getLoserPlayer() == lclP) {
									lclWon = false;
									++lclLosses;
								} else {
									throw new IllegalStateException();
								}
								
								Player lclOpponentPlayer = Validate.notNull(lclWon ? lclGV.getLoserPlayer() : lclGV.getWinnerPlayer());
								%><tr>
									<td data-tablesorter="<%= lclM.getRound().getSequence() %>"><%= lclM.getRound().getShortName() %></td>
									<td data-tablesorter="<%= lclOpponentPlayer.getContact().getSortBy() %>"><a href="#player_<%= lclOpponentPlayer.getId() %>"><%= lclOpponentPlayer.getNameWithSchoolShortName() %></a></td>
									<td><%= lclWon ? lclGV.getWinnerScore(0) : lclGV.getLoserScore(0) %></td>
									<td><%= lclWon ? lclGV.getLoserScore(0) : lclGV.getWinnerScore(0) %></td>
									<td><%= lclGV.getTossupsHeard(0) %></td>
									<td><%= lclWins %>&ndash;<%= lclLosses %></td>
								</tr><%
							}
						%></tbody>
					</table>
					<br /><%
				} else {
					%><p><small>no results</small></p><%
				}
			}
		}
	%></div>
	
	<div class="show-for-large-up large-3 columns">
		<div data-magellan-expedition>
			<ul class="magellan side-nav"><%
				for (School lclS : lclSchoolToPlayers.keySet()) {
					%><li data-magellan-arrival="school_<%= lclS.getId() %>"><a href="#school_<%= lclS.getId() %>"><%= lclS.getName() %></a></li><%
				}
			%></ul>
		</div>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />