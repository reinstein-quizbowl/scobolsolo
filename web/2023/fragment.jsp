<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import="java.time.format.FormatStyle" %>
<%@ page import="org.apache.commons.lang3.StringUtils" %>
<%@ page import="com.siliconage.web.ControllerServlet" %>
<%@ page import="com.opal.LocalDateCache" %>
<%@ page import="com.scobolsolo.application.Player" %>
<%@ page import="com.scobolsolo.application.SchoolRegistration" %>
<%@ page import="com.scobolsolo.application.Tournament" %>
<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%

final String lclName = "Scobol Solo 2023";
final String lclShortName = "2023";
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
			%><p><%= lclTourn.getName() %> was <%= lclTourn.getDate().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)) %> at <%= lclTourn.getSiteSchool().getExplainedName() %>. There were <%= lclTourn.getRealPlayerCount() %>&nbsp;players from <%= lclTourn.getSchoolCount() %>&nbsp;schools.</p>
			
			<table class="tournament-final-standings">
				<caption style="caption-side: top;">The nine players who made the Championship Match finished as follows:</p>
				<tbody>
					<tr>
						<th class="rank">1.</th>
						<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1490#player_3370">Rohan Kher</a></th>
						<td class="school">Barrington High School</td>
						<td class="note">Morning Champion</td>
					</tr>
					<tr>
						<th class="rank">2.</th>
						<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1490#player_3369">Charles Young</a></th>
						<td class="school">Barrington High School</td>
						<td class="note">&nbsp;</td>
					</tr>
					<tr>
						<th class="rank">3.</th>
						<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1471#player_3299">Sriram Koritala</a></th>
						<td class="school">Lisle Senior High School</td>
						<td class="note">&nbsp;</td>
					</tr>
					<tr>
						<th class="rank">4.</th>
						<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1492#player_3383">Dwij Bhatt</a></th>
						<td class="school">William Fremd High School (Palatine)</td>
						<td class="note">&nbsp;</td>
					</tr>
					<tr>
						<th class="rank">5T.</th>
						<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1484">David Bertolasi</a></th>
						<td class="school">Belvidere High School</td>
						<td class="note">&nbsp;</td>
					</tr>
					<tr>
						<th class="rank">&nbsp;</th>
						<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1492#player_3382">Omkar Marathe</a></th>
						<td class="school">William Fremd High School</td>
						<td class="note">&nbsp;</td>
					</tr>
					<tr>
						<th class="rank">&nbsp;</th>
						<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1475">Anna-Maria Olarov</a></th>
						<td class="school">Naperville North High School</td>
						<td class="note">&nbsp;</td>
					</tr>
					<tr>
						<th class="rank">8.</th>
						<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1494#player_3397">Soren Gjesfjeld</a></th>
						<td class="school">Bloomington High School</td>
						<td class="note">&nbsp;</td>
					</tr>
					<tr>
						<th class="rank">9.</th>
						<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1491#player_3375">Sam Kemeny</a></th>
						<td class="school">Evanston Township High School</td>
						<td class="note">&nbsp;</td>
					</tr>
				</tbody>
			</table><%
			
			if (StringUtils.isBlank(lclTourn.getChampionshipMatchUrl())) {
				%><p>The full <a href="/stats/standings.jsp?object=<%= lclTourn.getUniqueString() %>">preliminary results</a> are available.</p><%
			} else {
				%><p>The full <a href="/stats/standings.jsp?object=<%= lclTourn.getUniqueString() %>">preliminary results</a> are available, as is the <a href="<%= lclTourn.getChampionshipMatchUrl() %>">championship match scoresheet</a>.</p><%
			}
		}
	%></div>
</div>
