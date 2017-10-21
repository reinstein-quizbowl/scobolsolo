<%@ page import="java.text.DecimalFormat" %>
<%@ page import="java.util.Comparator" %>
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
DecimalFormat lclPF = new DecimalFormat("0.0%");
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
		SetMultimap<Player, PlayerMatchV> lclPlayerToPMVs = TreeMultimap.create(Player.SchoolNameComparator.getInstance(), PlayerMatchV.ROUND_COMPARATOR);
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
			%><h2 id="school_<%= lclS.getId() %>" data-magellan-target="school_<%= lclS.getId() %>"><%= lclS.getExplainedName() %></h2><%
			
			for (Player lclP : lclSchoolToPlayers.get(lclS)) {
				%><h3 id="player_<%= lclP.getId() %>"><%= lclP.getContact().getName() %></h3><%
				if (lclPlayerToPMVs.containsKey(lclP) && !lclPlayerToPMVs.get(lclP).isEmpty()) {
					%><table class="responsive data-freeze-2">
						<thead>
							<tr>
								<th style="width: 10%;">Round</th>
								<th style="width: 40%;">Opponent</th>
								<th style="width: 10%;" class="number">Score</th>
								<th style="width: 10%;" class="number">Opp.&nbsp;Score</th>
								<th style="width: 5%;" class="number"><abbr title="tossups heard">TUH</abbr></th>
								<th style="width: 10%;" class="number"><abbr title="average distance into questions of correct buzzes">CDepth</abbr></th>
								<th style="width: 15%;" class="number"><abbr title="record after">Rec. After</abbr></th>
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
								
								Double lclCDepth = lclWon ? lclGV.getWinnerAverageCorrectBuzzDepthAsObject() : lclGV.getLoserAverageCorrectBuzzDepthAsObject();
								
								Player lclOpponentPlayer = Validate.notNull(lclWon ? lclGV.getLoserPlayer() : lclGV.getWinnerPlayer());
								%><tr>
									<th data-order="<%= lclM.getRound().getSequence() %>"><%= lclM.getRound().getShortName() %></th>
									<th data-order="<%= lclOpponentPlayer.getContact().getSortBy() %>"><a href="#player_<%= lclOpponentPlayer.getId() %>"><%= lclOpponentPlayer.getNameWithSchoolShortName() %></a></th>
									<td class="number"><%= lclWon ? lclGV.getWinnerScore(0) : lclGV.getLoserScore(0) %></td>
									<td class="number"><%= lclWon ? lclGV.getLoserScore(0) : lclGV.getWinnerScore(0) %></td>
									<td class="number"><%= lclGV.getTossupsHeard(0) %></td>
									<td class="number"><%= lclCDepth == null ? "n/a" : lclPF.format(lclCDepth.doubleValue()) %></td>
									<td class="number"><%= lclWins %>&ndash;<%= lclLosses %></td>
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
	
	<nav class="show-for-large large-3 columns" data-magellan data-active-class="active">
		<ul class="magellan side-nav no-bullet"><%
			for (School lclS : lclSchoolToPlayers.keySet()) {
				%><li><a href="#school_<%= lclS.getId() %>"><%= lclS.getName() %></a></li><%
			}
		%></ul>
	</nav>
</div>

<jsp:include page="/template/footer.jsp" />