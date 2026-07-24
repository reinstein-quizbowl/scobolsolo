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

final String tournamentName = StringUtils.trimToNull(request.getParameter("tournament_name"));
final String tournamentShortName = StringUtils.trimToNull(request.getParameter("tournament_short_name"));
final Tournament tourn = tournamentName == null ? null : TournamentFactory.getInstance().forName(tournamentName);

%>
<div class="row">
	<div class="small-12 columns"><%
		if (ControllerServlet.getBooleanParameter(request, "show_header")) {
			%><h2><%= tourn == null ? tournamentShortName : tourn.getShortName() %></h2><%
		}
		
		if (tourn == null) {
			%><p><%= tournamentName %> will be held in the fall. The date and location have not been finalized but will be posted here when they are known.</p><%
		} else if (tourn.getDate().isAfter(LocalDateCache.today())) {
			%><p><%= tourn.getName() %> will be <%= tourn.getDate().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)) %> at <%= tourn.getSiteSchool().getExplainedName() %>.</p><%
			
			if (tourn.isRegistrationOpen()) {
				%><p><a class="primary button" href="/register/">Register</a></p><%
			}
		} else if (tourn.streamSchoolRegistration().flatMap(SchoolRegistration::streamPlayer).noneMatch(Player::isRanked)) {
			%><p><%= tourn.getName() %> is today at <%= tourn.getSiteSchool().getExplainedName() %>.</p>
			
			<p>Results are being posted live.</p>
			
			<p><a class="primary button" href="/stats/standings.jsp?object=<%= tourn.getUniqueString() %>">Standings</a></p><%
		} else {
			%><p><%= tourn.getName() %> was <%= tourn.getDate().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)) %> at <%= tourn.getSiteSchool().getExplainedName() %>. There were <%= Utility.writeOutIfAppropriate(tourn.getRealPlayerCount()) %>&nbsp;players from <%= Utility.writeOutIfAppropriate(tourn.getSchoolCount()) %>&nbsp;schools.</p><%
			
			final SortedSetMultimap<Integer, Player> championshipPlayersByRank = TreeMultimap.create();
			tourn.streamSchoolRegistration()
				.flatMap(SchoolRegistration::streamPlayer)
				.filter(Player::isRanked)
				.filter(it -> it.getFinalPlace(Integer.MAX_VALUE) <= 9)
				.forEach(it -> championshipPlayersByRank.put(it.getFinalPlaceAsObject(), it));
			
			final Set<School> alreadyExplainedSchools = new Fast3Set<>();
			
			%><table class="tournament-final-standings">
				<caption style="caption-side: top;">The <%= Utility.writeOutIfAppropriate(championshipPlayersByRank.values().size()) %> players who made the Championship Match finished as follows:</p>
				<tbody><%
					for (final Integer place : championshipPlayersByRank.keySet()) {
						final SortedSet<Player> players = championshipPlayersByRank.get(place);
						boolean firstOfRank = true;
						for (final Player player : players) {
							final String rankDisplay;
							if (firstOfRank) {
								if (players.size() > 1) {
									rankDisplay = place + "T.";
								} else {
									rankDisplay = place + ".";
								}
							} else {
								rankDisplay = "&nbsp;";
							}
							
							final String url = player.getSchoolRegistration().getPlayerSet().size() == 1 ?
								"/stats/player-detail.jsp?school_registration_id=" + player.getSchoolRegistration().getId() :
								"/stats/player-detail.jsp?school_registration_id=" + player.getSchoolRegistration().getId() + "#player_" + player.getId();
							
							final String schoolName = alreadyExplainedSchools.contains(player.getSchool()) ? player.getSchool().getName() : player.getSchool().getExplainedName();
							alreadyExplainedSchools.add(player.getSchool());
							
							%><tr>
								<th class="rank"><%= rankDisplay %></th>
								<th class="player"><a href="<%= url %>"><%= player.getName() %></th>
								<td class="school"><%= schoolName %></td>
								<td class="note"><%= player.getOutgoingWinningCardGameSet().size() == 7 ? "Morning Champion" : "&nbsp;" %></td>
							</tr><%
							firstOfRank = false;
						}
					}
				%></tbody>
			</table><%
			
			if (StringUtils.isBlank(tourn.getChampionshipMatchUrl())) {
				%><p>The full <a href="/stats/standings.jsp?object=<%= tourn.getUniqueString() %>">preliminary results</a> are available.</p><%
			} else {
				%><p>The full <a href="/stats/standings.jsp?object=<%= tourn.getUniqueString() %>">preliminary results</a> are available, as is the <a href="<%= tourn.getChampionshipMatchUrl() %>">championship match scoresheet</a>.</p><%
			}
		}
	%></div>
</div>
