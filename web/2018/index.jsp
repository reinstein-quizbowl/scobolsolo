<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="2018" />
	<jsp:param name="pageTitle" value="Scobol Solo 2018" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2018()).asTopLevel().output(request, \"results\") %>" />
	<jsp:param name="h1" value="Scobol Solo 2018" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>Scobol Solo 2018 was held on Saturday, October&nbsp;27. There were 128 players from 30 schools.</p>
		
		<table class="tournament-final-standings">
			<caption style="caption-side: top;">The nine players who made the Championship Match finished as follows:</p>
			<tbody>
				<tr>
					<th class="rank">1.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1311#player_2606">Kevin Kodama</a></th>
					<td class="school">Oak Park and River Forest High School</td>
					<td class="note">Morning Champion</td>
				</tr>
				<tr>
					<th class="rank">2.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1314#player_2689">Hanson Hao</a></th>
					<td class="school">Illinois Mathematics and Science Academy</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">3.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1297#player_2630">Ethan Strombeck</a></th>
					<td class="school">Auburn High School (Rockford)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">4.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1302#player_2612">Jonathan Lau</a></th>
					<td class="school">University Laboratory High School (Urbana)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">5.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1298#player_2598">Aristotle Vainikos</a></th>
					<td class="school">Carl Sandburg High School (Orland Park)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">6T.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1302#player_2610">Dylan Bowman</a></th>
					<td class="school">University Laboratory High School (Urbana)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">&nbsp;</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1301#player_2589">Govind Prabhakar</a></th>
					<td class="school">Adlai E. Stevenson High School (Lincolnshire)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">8.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1301#player_2590">Olivia Lamberti</a></th>
					<td class="school">Adlai E. Stevenson High School (Lincolnshire)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">9.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1307#player_2693">Tom&aacute;s Aguilar-Fraga</a></th>
					<td class="school">Saint Joseph High School (South Bend, Indiana)</td>
					<td class="note">&nbsp;</td>
				</tr>
			</tbody>
		</table>
		
		<p>The full <a href="/stats/standings.jsp?object=2018">preliminary results</a> are available. The <!-- <a href="championship-match.jsp"> -->championship match scoresheet<!-- </a> --> will be available soon.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />