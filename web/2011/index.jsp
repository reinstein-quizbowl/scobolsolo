<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="2011" />
	<jsp:param name="pageTitle" value="Scobol Solo 2011" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2011()).asTopLevel().output(request, \"results\") %>" />
	<jsp:param name="h1" value="Scobol Solo 2011" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>Scobol Solo 2011 was held on Saturday, October&nbsp;22. There were 125 players from 26 schools.</p>
		
		<table class="tournament-final-standings">
			<caption style="caption-side: top;">The nine players who made the Championship Match finished as follows:</p>
			<tbody>
				<tr>
					<th class="rank">1.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1241#player_2152">Lloyd Sy</a></th>
					<td class="school">Auburn High School (Rockford)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">2.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1265#player_2125">Dylan Minarik</a></th>
					<td class="school">Belvidere North High School</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">3.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1248#player_2143">Nolan Winkler</a></th>
					<td class="school">Loyola Academy (Wilmette)</td>
					<td class="note">Morning Champion</td>
				</tr>
				<tr>
					<th class="rank">4.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1253#player_2130">Andrew Wang</a></th>
					<td class="school">New Trier High School (Winnetka)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">5.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1243#player_2162">Ben Chametzky</a></th>
					<td class="school">Carbondale Community High School</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">6.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1243#player_2174">Srinivas Panchamukhi</a></th>
					<td class="school">Carbondale Community High School</td></td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">7T.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1246#player_2275">Webster Guan</a></th>
					<td class="school">Illinois Mathematics and Science Academy (Aurora)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">&nbsp;</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1247#player_2155">Alex Kling</a></th>
					<td class="school">Latin School of Chicago</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">9.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1266#player_2426">Andrew Van Duyn</a></th>
					<td class="school">Culver Academies (Indiana)</td>
					<td class="note">&nbsp;</td>
				</tr>
			</tbody>
		</table>
		
		<p>The full <a href="/stats/standings.jsp?object=2011">preliminary results</a> are available, as is the <a href="championship-match.jsp">championship match scoresheet</a>.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />
