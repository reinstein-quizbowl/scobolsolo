<%@ page import="java.text.DecimalFormat" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.stream.Collectors" %>
<%@ page import="org.apache.commons.lang3.Validate" %>
<%@ page import="com.google.common.collect.Maps" %>
<%@ page import="com.google.common.collect.SortedSetMultimap" %>
<%@ page import="com.google.common.collect.TreeMultimap" %>
<%@ page import="com.opal.ImplicitTableDatabaseQuery" %>
<%@ page import="com.scobolsolo.application.*" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.Utility" %>

<%
SchoolRegistration lclSR = Validate.notNull(SchoolRegistrationFactory.getInstance().fromHttpRequest(request));
Tournament lclT = lclSR.getTournament();
School lclS = lclSR.getSchool();
DecimalFormat lclPF = new DecimalFormat("0.0%");

String lclTitle = "Player Detail: " + lclS.getShortName();
%>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="<%= lclT.getCode() %>" />
	<jsp:param name="pageTitle" value="<%= lclTitle %>" />
	<jsp:param name="topMenu" value="<%= Menus.stats(lclT).asTopLevel().output(request, \"player-detail-\" + lclSR.getId()) %>" />
	<jsp:param name="h1" value="<%= lclTitle %>" />
</jsp:include>

<div class="row">
	<div class="small-12 columns"><%
		List<PlayerMatchV> lclPMVs = PlayerMatchVFactory.getInstance().acquireForQuery(
			new ArrayList<>(lclSR.getPlayerSet().size()),
			new ImplicitTableDatabaseQuery("school_registration_id = ?", lclSR.getIdAsObject())
		);
		
		SortedSetMultimap<Player, PlayerMatchV> lclByPlayer = TreeMultimap.create(Player.NameComparator.getInstance(), PlayerMatchV.ROUND_COMPARATOR);
		lclPMVs.forEach(argPMV -> lclByPlayer.put(argPMV.getPlayer(), argPMV));
		
		List<Object> lclGameIds = lclPMVs.stream().map(PlayerMatchV::getGameIdAsObject).collect(Collectors.toList());
		
		List<GameV> lclGVs = GameVFactory.getInstance().acquireForQuery(
			new ArrayList<>(lclPMVs.size()),
			new ImplicitTableDatabaseQuery("game_id IN (" + Utility.nParameters(lclPMVs.size()) + ")", lclGameIds)
		);
		
		Map<Game, GameV> lclGameToGV = Maps.uniqueIndex(lclGVs, GameV::getGame);
		
		for (Player lclP : lclByPlayer.keySet()) {
			%><section id="player_<%= lclP.getId() %>">
				<h2>
					<%= lclP.getContact().getName() %><%
					if (lclP.getSchoolYear() != null) {
						if (lclP.isExhibition()) {
							%> (<%= lclP.getSchoolYear().getName() %>; exhibition)<%
						} else {
							%> (<%= lclP.getSchoolYear().getName() %>)<%
						}
					}
				%></h2>
				
				<table data-fixed-columns="2">
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
						for (PlayerMatchV lclPMV : lclByPlayer.get(lclP)) {
							Game lclG = Validate.notNull(lclPMV.getGame());
							Match lclM = Validate.notNull(lclG.getMatch());
							
							GameV lclGV = lclGameToGV.get(lclG);
							if (lclGV != null) {
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
						}
					%></tbody>
				</table>
			</section>
			<br /><%
		}
	%></div>
</div>

<jsp:include page="/template/footer.jsp" />
