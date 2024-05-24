<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import="java.time.format.FormatStyle" %>
<%@ page import="java.util.Set" %>
<%@ page import="java.util.SortedSet" %>
<%@ page import="org.apache.commons.lang3.StringUtils" %>
<%@ page import="com.google.common.collect.SortedSetMultimap" %>
<%@ page import="com.google.common.collect.TreeMultimap" %>
<%@ page import="com.siliconage.util.Fast3Set" %>
<%@ page import="com.siliconage.web.ControllerServlet" %>
<%@ page import="com.opal.LocalDateCache" %>
<%@ page import="com.scobolsolo.application.Player" %>
<%@ page import="com.scobolsolo.application.School" %>
<%@ page import="com.scobolsolo.application.SchoolRegistration" %>
<%@ page import="com.scobolsolo.application.Tournament" %>
<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.Utility" %>
<%

final String lclName = "Scobol Solo 2024";
final String lclShortName = "2024";
final Tournament lclTourn = TournamentFactory.getInstance().forName(lclName);

%>
<div class="row">
	<div class="small-12 columns"><%
		if (ControllerServlet.getBooleanParameter(request, "show_header")) {
			%><h2><%= lclTourn == null ? lclShortName : lclTourn.getShortName() %></h2><%
		}
		
		if (lclTourn == null) {
			%><p><%= lclName %> will be held in the fall. The date and location have not been finalized but will be posted here when they are known.</p><%
		} else if (lclTourn.getDate().isAfter(LocalDateCache.today())) {
			%><p><%= lclTourn.getName() %> will be <%= lclTourn.getDate().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)) %> at <%= lclTourn.getSiteSchool().getExplainedName() %>.</p><%
			
			if (lclTourn.isRegistrationOpen()) {
				%><p><a class="primary button" href="/register/">Register</a></p><%
			}
		} else if (lclTourn.streamSchoolRegistration().flatMap(SchoolRegistration::streamPlayer).noneMatch(Player::isRanked)) {
			%><p><%= lclTourn.getName() %> is today at <%= lclTourn.getSiteSchool().getExplainedName() %>.</p>
			
			<p>Results are being posted live.</p>
			
			<p><a class="primary button" href="/stats/standings.jsp?object=<%= lclTourn.getUniqueString() %>">Standings</a></p><%
		} else {
			%><p><%= lclTourn.getName() %> was <%= lclTourn.getDate().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)) %> at <%= lclTourn.getSiteSchool().getExplainedName() %>. There were <%= Utility.writeOutIfAppropriate(lclTourn.getRealPlayerCount()) %>&nbsp;players from <%= Utility.writeOutIfAppropriate(lclTourn.getSchoolCount()) %>&nbsp;schools.</p><%
			
			final SortedSetMultimap<Integer, Player> lclChampionshipPlayersByRank = TreeMultimap.create();
			lclTourn.streamSchoolRegistration()
				.flatMap(SchoolRegistration::streamPlayer)
				.filter(Player::isRanked)
				.filter(it -> it.getFinalPlace(Integer.MAX_VALUE) <= 9)
				.forEach(it -> lclChampionshipPlayersByRank.put(it.getFinalPlaceAsObject(), it));
			
			final Set<School> lclAlreadyExplainedSchools = new Fast3Set<>();
			
			%><table class="tournament-final-standings">
				<caption style="caption-side: top;">The <%= Utility.writeOutIfAppropriate(lclChampionshipPlayersByRank.values().size()) %> players who made the Championship Match finished as follows:</p>
				<tbody><%
					for (final Integer lclPlace : lclChampionshipPlayersByRank.keySet()) {
						final SortedSet<Player> lclPlayers = lclChampionshipPlayersByRank.get(lclPlace);
						boolean lclFirstOfRank = true;
						for (final Player lclPlayer : lclPlayers) {
							final String lclRankDisplay;
							if (lclFirstOfRank) {
								if (lclPlayers.size() > 1) {
									lclRankDisplay = lclPlace + "T.";
								} else {
									lclRankDisplay = lclPlace + ".";
								}
							} else {
								lclRankDisplay = "&nbsp;";
							}
							
							final String lclUrl = lclPlayer.getSchoolRegistration().getPlayerSet().size() == 1 ?
								"/stats/player-detail.jsp?school_registration_id=" + lclPlayer.getSchoolRegistration().getId() :
								"/stats/player-detail.jsp?school_registration_id=" + lclPlayer.getSchoolRegistration().getId() + "#player_" + lclPlayer.getId();
							
							final String lclSchoolName = lclAlreadyExplainedSchools.contains(lclPlayer.getSchool()) ? lclPlayer.getSchool().getName() : lclPlayer.getSchool().getExplainedName();
							lclAlreadyExplainedSchools.add(lclPlayer.getSchool());
							
							%><tr>
								<th class="rank"><%= lclRankDisplay %></th>
								<th class="player"><a href="<%= lclUrl %>"><%= lclPlayer.getName() %></th>
								<td class="school"><%= lclSchoolName %></td>
								<td class="note"><%= lclPlayer.getOutgoingWinningCardGameSet().size() == 7 ? "Morning Champion" : "&nbsp;" %></td>
							</tr><%
							lclFirstOfRank = false;
						}
					}
				%></tbody>
			</table><%
			
			if (StringUtils.isBlank(lclTourn.getChampionshipMatchUrl())) {
				%><p>The full <a href="/stats/standings.jsp?object=<%= lclTourn.getUniqueString() %>">preliminary results</a> are available.</p><%
			} else {
				%><p>The full <a href="/stats/standings.jsp?object=<%= lclTourn.getUniqueString() %>">preliminary results</a> are available, as is the <a href="<%= lclTourn.getChampionshipMatchUrl() %>">championship match scoresheet</a>.</p><%
			}
		}
	%></div>
</div>
