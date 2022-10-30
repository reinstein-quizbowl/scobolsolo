<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import="java.time.format.FormatStyle" %>
<%@ page import="com.opal.LocalDateCache" %>
<%@ page import="com.scobolsolo.application.Tournament" %>
<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%

Tournament lclTourn = TournamentFactory._2022();

%>
<div class="row">
	<div class="small-12 columns"><%
		if (lclTourn.getDate().isAfter(LocalDateCache.today())) {
			%><p>Scobol Solo 2022 will be <%= lclTourn.getDate().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)) %> at <%= lclTourn.getSiteSchool().getExplainedName() %>.</p>
			
			<p><a class="primary button" href="/register/">Register</a></p><%
		} else if (lclTourn.getDate().equals(LocalDateCache.today())) {
			%><p>Scobol Solo 2022 is today at <%= lclTourn.getSiteSchool().getExplainedName() %>.</p>
			
			<p>Results are being posted live.</p>
			
			<p><a class="primary button" href="/stats/standings.jsp?object=<%= lclTourn.getUniqueString() %>">Standings</a></p><%
		} else {
			%><p>Scobol Solo 2022 was <%= lclTourn.getDate().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)) %> at <%= lclTourn.getSiteSchool().getExplainedName() %>. There were <%= lclTourn.getRealPlayerCount() %>&nbsp;players from <%= lclTourn.getSchoolCount() %>&nbsp;schools.</p>
			
			<table class="tournament-final-standings">
				<caption style="caption-side: top;">The nine players who made the Championship Match finished as follows:</p>
				<tbody>
					<tr>
						<th class="rank">1.</th>
						<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1440#player_3148">Charles Young</a></th>
						<td class="school">Barrington High School</td>
						<td class="note">Morning Champion</td>
					</tr>
					<tr>
						<th class="rank">2.</th>
						<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1438#player_3139">Sinecio Morales</a></th>
						<td class="school">Auburn High School (Rockford)</td>
						<td class="note">&nbsp;</td>
					</tr>
					<tr>
						<th class="rank">3.</th>
						<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1440#player_3149">Rohan Kher</a></th>
						<td class="school">Barrington High School</td>
						<td class="note">&nbsp;</td>
					</tr>
					<tr>
						<th class="rank">4.</th>
						<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1443#player_3220">Teigue Kelly</a></th>
						<td class="school">Waubonsie Valley High School (Aurora)</td>
						<td class="note">&nbsp;</td>
					</tr>
					<tr>
						<th class="rank">5.</th>
						<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1452#player_3205">Jason Qin</a></th>
						<td class="school">Illinois Mathematics &amp; Science Academy (Aurora)</td>
						<td class="note">&nbsp;</td>
					</tr>
					<tr>
						<th class="rank">6.</th>
						<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1450#player_3199">Soren Gjesfjeld</a></th>
						<td class="school">Bloomington High School</td>
						<td class="note">&nbsp;</td>
					</tr>
					<tr>
						<th class="rank">7.</th>
						<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1438#player_3158">Alex Crowell</a></th>
						<td class="school">Auburn High School</td>
						<td class="note">&nbsp;</td>
					</tr>
					<tr>
						<th class="rank">8.</th>
						<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1440#player_3151">Colin Stewart</a></th>
						<td class="school">Barrington High School</td>
						<td class="note">&nbsp;</td>
					</tr>
					<tr>
						<th class="rank">9.</th>
						<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1455">Dwij Bhatt</a></th>
						<td class="school">William Fremd High School (Palatine)</td>
						<td class="note">&nbsp;</td>
					</tr>
				</tbody>
			</table>
			
			<p>This is Charles Young&#8217;s <a href="/2021/">second consecutive championship</a>.</p>
			
			<p>The full <a href="/stats/standings.jsp?object=2022">preliminary results</a> are available, as is the <a href="championship-match.jsp">championship match scoresheet</a>.</p><%
		}
	%></div>
</div>
