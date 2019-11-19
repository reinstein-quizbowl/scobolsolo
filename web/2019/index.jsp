<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="2019" />
	<jsp:param name="pageTitle" value="Scobol Solo 2019" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2019()).asTopLevel().output(request, \"results\") %>" />
	<jsp:param name="h1" value="Scobol Solo 2019" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>Scobol Solo 2019 was held on Saturday, November&nbsp;16. There were 128 players from 30 schools.</p>
		
		<table class="tournament-final-standings">
			<caption style="caption-side: top;">The nine players who made the Championship Match finished as follows:</p>
			<tbody>
				<tr>
					<th class="rank">1.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1350#player_2790">Govind Prabhakar</a></th>
					<td class="school">Adlai E. Stevenson High School (Lincolnshire)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">2.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1353#player_2801">Dylan Bowman</a></th>
					<td class="school">University Laboratory High School (Urbana)</td>
					<td class="note">Morning Champion</td>
				</tr>
				<tr>
					<th class="rank">3T.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1331#player_2734">Ben Fry</a></th>
					<td class="school">Chicago Christian High School (Palos Heights)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">&nbsp;</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1350#player_2791">Arjun Nageswaran</a></th>
					<td class="school">Adlai E. Stevenson High School</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">5T.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1353#player_2802">Jonathan Lau</a></th>
					<td class="school">University Laboratory High School (Urbana)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">&nbsp;</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1339#player_2754">Ryan Tsau</a></th>
					<td class="school">Palatine High School</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">7T.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1338#player_2761">Thomas Mercurio</a></th>
					<td class="school">Hinsdale Central High School</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">&nbsp;</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1329#player_2733">Sophie Netzel</a></th>
					<td class="school">Glenbard West High School (Glen Ellyn)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">9.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1341#player_2775">Roxanne Tang</a></th>
					<td class="school">Barrington High School</td>
					<td class="note">&nbsp;</td>
				</tr>
			</tbody>
		</table>
		
		<p>The full <a href="/stats/standings.jsp?object=2019">preliminary results</a> are available, as is the <a href="championship-match.jsp">championship match scoresheet</a>.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />