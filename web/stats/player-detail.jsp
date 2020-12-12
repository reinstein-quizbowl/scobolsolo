<%@ page import="java.text.DecimalFormat" %>
<%@ page import="java.util.Comparator" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.OptionalDouble" %>
<%@ page import="java.util.stream.Collectors" %>
<%@ page import="org.apache.commons.lang3.Validate" %>
<%@ page import="com.google.common.collect.Maps" %>
<%@ page import="com.google.common.collect.SortedSetMultimap" %>
<%@ page import="com.google.common.collect.TreeMultimap" %>
<%@ page import="com.opal.ImplicitTableDatabaseQuery" %>
<%@ page import="com.siliconage.util.Tally" %>
<%@ page import="com.scobolsolo.application.*" %>
<%@ page import="com.scobolsolo.matches.MatchStatus" %>
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
		List<Player> lclPlayers = new ArrayList<>(lclSR.getPlayerSet());
		lclPlayers.removeIf(Player::isExhibition);
		lclPlayers.sort(null);
		
		if (lclPlayers.isEmpty()) {
			%><p><%= lclS.getName() %> has no players at this tournament.</p><%
		} else {
			for (Player lclPlayer : lclPlayers) {
				%><section id="player_<%= lclPlayer.getId() %>">
					<h2>
						<%= lclPlayer.getContact().getName() %><%
						if (lclPlayer.getSchoolYear() != null) {
							%> (<%= lclPlayer.getSchoolYear().getName() %>)<%
						}
					%></h2><%
					
					List<Performance> lclPerformances = lclPlayer.streamPerformance()
						.filter(argPerf -> argPerf.getGame().getMatch().determineStatus() == MatchStatus.COMPLETE)
						.sorted(Comparator.comparing(argPerf -> argPerf.getGame().getMatch()))
						.collect(Collectors.toList());
					if (lclPerformances.isEmpty()) {
						%><p>No results are available yet.</p><%
					} else {
						boolean lclShowCategoryDepth = lclPerformances.stream()
							.flatMap(Performance::streamResponse)
							.anyMatch(Response::hasLocation);
						
						%><table>
							<thead>
								<tr>
									<th style="width: 10%;">Round</th>
									<th style="width: 30%;">Opponent</th>
									<th style="width: 10%;">Result</th>
									<th style="width: 10%;" class="number">Score</th>
									<th style="width: 10%;" class="number">Opp.&nbsp;Score</th>
									<th style="width: 5%;" class="number"><abbr title="tossups heard">TUH</abbr></th><%
									if (lclShowCategoryDepth) {
										%><th style="width: 10%;" class="number"><abbr title="average distance into questions of correct buzzes">CDepth</abbr></th><%
									}
									%><th style="width: 15%;" class="number"><abbr title="record after">Rec. After</abbr></th>
								</tr>
							</thead>
							<tbody><%
								int lclWins = 0, lclLosses = 0;
								for (Performance lclPerf : lclPerformances) {
									Game lclG = Validate.notNull(lclPerf.getGame());
									Match lclM = Validate.notNull(lclG.getMatch());
									
									Tally<Performance> lclScores = lclG.getScores();
									int lclScore = lclScores.get(lclPerf);
									int lclPlayersWithGreaterScores = 0;
									boolean lclTie = false;
									for (Performance lclInGame : lclScores.keySet()) {
										if (lclInGame != lclPerf) {
											if (lclScores.get(lclInGame) > lclScore) {
												++lclPlayersWithGreaterScores;
											} else if (lclScores.get(lclInGame) == lclScore) {
												lclTie = true;
											}
										}
									}
									int lclRank = 1 + lclPlayersWithGreaterScores;
									int lclPlayersInGame = lclScores.size();
									
									OptionalDouble lclCDepth = Response.calculateCDepth(lclPerf.getResponseSet());
									
									List<Performance> lclOpponents = lclG.streamPerformance()
										.filter(argPerf -> argPerf != lclPerf)
										.sorted(Performance.PlayerNameComparator.getInstance())
										.collect(Collectors.toList());
									
									%><tr>
										<th data-order="<%= lclM.getRound().getSequence() %>"><%= lclM.getRound().getShortName() %></th>
										<th data-order="<%= lclOpponents.isEmpty() ? "" : lclOpponents.get(0).getPlayer().getContact().getSortBy() %>"><%
											Iterator<Performance> lclOI = lclOpponents.iterator();
											while (lclOI.hasNext()) {
												Player lclOpponent = lclOI.next().getPlayer();
												if (lclOpponent.isExhibition()) {
													%>Exhibition player<%
												} else {
													%><a href="player-detail.jsp?school_registration_id=<%= lclOpponent.getSchoolRegistration().getId() %>#player_<%= lclOpponent.getId() %>">
														<%= lclOpponent.getNameWithSchoolShortName() %>
													</a><%
												}
												if (lclOI.hasNext()) {
													%><br /><%
												}
											}
										%></th>
										<td data-order="<%= lclRank %>">
											<a href="game.jsp?game_id=<%= lclG.getId() %>"><%
												if (lclPlayersInGame == 2) {
													if (lclRank == 1) {
														++lclWins;
														%>Win<%
													} else {
														++lclLosses;
														%>Loss<%
													}
												} else {
													%><%= Utility.makeOrdinal(lclRank) %><%
													if (lclTie) {
														%> (tie)<%
													}
												}
											%></a>
										</td>
										<td class="number"><%= lclScores.get(lclPerf) %></td>
										<td class="number"><%
											lclOI = lclOpponents.iterator();
											while (lclOI.hasNext()) {
												Performance lclOpponent = lclOI.next();
												%><%= lclScores.get(lclOpponent) %><%
												if (lclOI.hasNext()) {
													%><br /><%
												}
											}
										%></td>
										<td class="number"><%= lclG.getTossupsHeard(0) %></td><%
										if (lclShowCategoryDepth) {
											%><td class="number"><%= lclCDepth.isPresent() ? lclPF.format(lclCDepth.getAsDouble()) : "n/a" %></td><%
										}
										%><td class="number"><%= lclWins %>&ndash;<%= lclLosses %></td>
									</tr><%
								}
							%></tbody>
						</table><%
					}
					
					List<Player> lclOthers = lclPlayer.getContact().streamPlayer()
						.filter(argP -> argP != lclPlayer)
						.sorted(Comparator.comparing(Player::getTournament))
						.collect(Collectors.toList());
					if (lclOthers.isEmpty() == false) {
						%><p><%= lclPlayer.getContact().getName() %> also played in <%= Utility.makeList(lclOthers, argP -> "<a href=\"/stats/player-detail.jsp?school_registration_id=" + argP.getSchoolRegistration().getId() + "#player_" + argP.getId() + "\">" + argP.getTournament().getShortName() + "</a>") %>.</p><%
					}
				%></section><%
			}
		}
	%></div>
</div>

<jsp:include page="/template/footer.jsp" />
