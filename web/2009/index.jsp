<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="2009" />
	<jsp:param name="pageTitle" value="Scobol Solo 2009" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2009()).asTopLevel().output(request, \"results\") %>" />
	<jsp:param name="h1" value="Scobol Solo 2009" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>Scobol Solo 2009 was held on Saturday, November&nbsp;7. There were 128 players from 36 schools.</p>
		
		<table class="tournament-final-standings">
			<caption style="caption-side: top;">The nine players who made the Championship Match finished as follows:</p>
			<tbody>
				<tr>
					<th class="rank">1.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1178#player_1824">Lloyd Sy</a></th>
					<td class="school">Auburn High School (Rockford)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">2.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1190#player_1836">Andrew Deveau</a></th>
					<td class="school">St.&nbsp;Ignatius College Prep (Chicago)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">3.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1191#player_1875">Kevin Malis</a></th>
					<td class="school">Adlai E. Stevenson High School (Lincolnshire)</td>
					<td class="note">Morning Champion</td>
				</tr>
				<tr>
					<th class="rank">4.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1177#player_1826">Steve Server</a></th>
					<td class="school">New Trier High School (Winnetka)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">5.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1180#player_1859">Jeremiah Monk</a></th>
					<td class="school">Carbondale Community High School</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">6T.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1204#player_1850">Ben Carbery</a></th>
					<td class="school">Oak Park-River Forest High School</td></td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">&nbsp;</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1200#player_1828">Isa Domin</a></th>
					<td class="school">Niles North High School (Skokie)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">8.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1199#player_1844">Greg Dzuricsko</a></th>
					<td class="school">Lisle Senior High School</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">9.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1186#player_1832">Christian Kreb</a></th>
					<td class="school">Loyola Academy (Wilmette)</td>
					<td class="note">&nbsp;</td>
				</tr>
			</tbody>
		</table>
		
		<p>The full <a href="/stats/standings.jsp?object=2009">preliminary results</a> are available, as is the <a href="championship-match.jsp">championship match scoresheet</a>.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />
