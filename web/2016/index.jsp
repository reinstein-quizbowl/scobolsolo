<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="2016" />
	<jsp:param name="pageTitle" value="Scobol Solo 2016" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2016()).asTopLevel().output(request, \"home\") %>" />
	<jsp:param name="h1" value="Scobol Solo 2016" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>Scobol Solo 2016 was held on Saturday, October&nbsp;29. There were 128 players from 29 schools.</p>
		
		<table class="tournament-final-standings">
			<caption style="caption-side: top;">The nine players who made the Championship Match finished as follows:</p>
			<tbody>
				<tr>
					<th class="rank">1.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1091#player_1417">John Waldron</a></th>
					<td class="school">Barrington</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">2.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1091#player_1416">Matthew Lehmann</a></th>
					<td class="school">Barrington</td>
					<td class="note">Morning champion</td>
				</tr>
				<tr>
					<th class="rank">3.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1090#player_1491">Ali Saeed</a></th>
					<td class="school">Stevenson (Lincolnshire)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">4.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1107#player_1454">Jakob Myers</a></th>
					<td class="school">Naperville North</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">5T.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1096#player_1436">Jack Mayer</a></th>
					<td class="school">Loyola Academy (Wilmette)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">&nbsp;</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1089#player_1524">Ethan Strombeck</a></th>
					<td class="school">Auburn (Rockford)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">&nbsp;</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1112#player_1512">Aristotle Vainikos</a></th>
					<td class="school">Carl Sandburg (Orland Park)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">8.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1110">John Banta</a></th>
					<td class="school">Lake Forest</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">9.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1092#player_1470">Lily Hamer</a></th>
					<td class="school">Homewood-Flossmoor</td>
					<td class="note">&nbsp;</td>
				</tr>
			</tbody>
		</table>
		
		<p>The full <a href="/stats/standings.jsp?object=2016">preliminary results</a> are available, as is the <a href="championship-match.jsp">championship match scoresheet</a>.</p>
		
		<p>The <a href="packets.zip">questions are available for download</a>.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />