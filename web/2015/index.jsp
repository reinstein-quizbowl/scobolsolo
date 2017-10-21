﻿<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="2015" />
	<jsp:param name="pageTitle" value="Scobol Solo 2015" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2015()).asTopLevel().output(request, \"home\") %>" />
	<jsp:param name="h1" value="Scobol Solo 2015" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>Scobol Solo 2015 was held on Saturday, October 31, and included 128 players from 26 schools.</p>
		
		<table class="tournament-final-standings data-freeze-0">
			<caption style="caption-side: top;">The nine players who made the Championship Match finished as follows:</p>
			<tbody>
				<tr>
					<th>1.</th>
					<td>
						<a href="/stats/player-detail.jsp?object=2015#player_1323">Ali Saeed</a> (Adlai E. Stevenson, also the morning champion)
					</td>
				</tr>
				<tr>
					<th>2.</th>
					<td>
						<a href="/stats/player-detail.jsp?object=2015#player_1331">Cole Timmerwilke</a> (Auburn)
					</td>
				</tr>
				<tr>
					<th>3.</th>
					<td>
						<a href="/stats/player-detail.jsp?object=2015#player_1272">Matthew Lehmann</a> (Barrington)
					</th>
				</tr>
				<tr>
					<th>4.</th>
					<td>
						<a href="/stats/player-detail.jsp?object=2015#player_1274">Jakob Myers</a> (Naperville North)
					</td>
				</tr>
				<tr>
					<th>5T.</th>
					<td>
						<a href="/stats/player-detail.jsp?object=2015#player_1333">Ethan Strombeck</a> (Auburn)<br />
						<a href="/stats/player-detail.jsp?object=2015#player_1273">John Waldron</a> (Barrington)
					</td>
				</tr>
				<tr>
					<th>7.</th>
					<td>
						<a href="/stats/player-detail.jsp?object=2015#player_1308">Jonathan Suh</a> (Wheaton Warrenville South)
					</td>
				</tr>
				<tr>
					<th>8T.</th>
					<td>
						<a href="/stats/player-detail.jsp?object=2015#player_1352">Ankush Bajaj</a> (Hinsdale Central)<br />
						<a href="/stats/player-detail.jsp?object=2015#player_1289">Michael Gislason</a> (Homewood-Flossmoor)
					</td>
				</tr>
			</tbody>
		</table>
		
		<p>The full <a href="/stats/standings.jsp?object=2015">preliminary results</a> are available, as is the <a href="championship-match.jsp">championship match scoresheet</a>.</p>
		
		<p>The <a href="packets.zip">questions are available for download</a>.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />