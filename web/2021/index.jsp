<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="2021" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2021()).asTopLevel().output(request, \"results\") %>" />
	<jsp:param name="h1" value="Scobol Solo 2021" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>Scobol Solo 2021 was held on Saturday, November&nbsp;13 at Carl Sandburg High School in Orland Park, Illinois. There were 104 players from 29 schools.</p>
		
		<table class="tournament-final-standings">
			<caption style="caption-side: top;">The nine players who made the Championship Match finished as follows:</p>
			<tbody>
				<tr>
					<th class="rank">1.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1424#player_3076">Charles Young</a></th>
					<td class="school">Barrington High School</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">2.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1416#player_3057">Rohan Ganeshan</a></th>
					<td class="school">Buffalo Grove High School</td>
					<td class="note">Morning Champion</td>
				</tr>
				<tr>
					<th class="rank">3.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1405#player_3007">Alex Crowell</a></th>
					<td class="school">Auburn High School (Rockford)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">4.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1428#player_3119">Anmol Dash</a></th>
					<td class="school">Adlai E. Stevenson High School (Lincolnshire)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">5T.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1410#player_3030">Thomas Lu</a></th>
					<td class="school">William Fremd High School (Palatine)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">&nbsp;</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1422#player_3069">Gavin Markoff</a></th>
					<td class="school">Herscher High School</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">7T.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1412#player_3040">Michael Hunding</a></th>
					<td class="school">Illinois Mathematics and Science Academy (Aurora)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">&nbsp;</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1423#player_3075">Teigue Kelly</a></th>
					<td class="school">Waubonsie Valley High School (Aurora)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">9.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1410#player_3031">Megan Wang</a></th>
					<td class="school">William Fremd High School</td>
					<td class="note">&nbsp;</td>
				</tr>
			</tbody>
		</table>
		
		<p>The full <a href="/stats/standings.jsp?object=2021">preliminary results</a> are available, as is the <a href="championship-match.jsp">championship match scoresheet</a>.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />
