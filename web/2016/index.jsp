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
		<p>Scobol Solo 2016 was held on Saturday, October 29, and included 128 players from 29 schools.</p>
		
		<table class="tournament-final-standings">
			<caption style="caption-side: top;">The nine players who made the Championship Match finished as follows:</p>
			<tbody>
				<tr>
					<th>1.</th>
					<td>
						<a href="/stats/player-detail.jsp?object=2016#player_1417">John Waldron</a> (Barrington)
					</td>
				</tr>
				<tr>
					<th>2.</th>
					<td>
						<a href="/stats/player-detail.jsp?object=2016#player_1416">Matthew Lehmann</a> (Barrington; also the morning champion)
					</td>
				</tr>
				<tr>
					<th>3.</th>
					<td>
						<a href="/stats/player-detail.jsp?object=2016#player_1491">Ali Saeed</a> (Adlai E. Stevenson)
					</th>
				</tr>
				<tr>
					<th>4.</th>
					<td>
						<a href="/stats/player-detail.jsp?object=2016#player_1454">Jakob Myers</a> (Naperville North)
					</td>
				</tr>
				<tr>
					<th>5T.</th>
					<td>
						<a href="/stats/player-detail.jsp?object=2016#player_1436">Jack Mayer</a> (Loyola Academy)<br />
						<a href="/stats/player-detail.jsp?object=2016#player_1524">Ethan Strombeck</a> (Auburn)<br />
						<a href="/stats/player-detail.jsp?object=2016#player_1512">Aristotle Vainikos</a> (Carl Sandburg)
					</td>
				</tr>
				<tr>
					<th>8.</th>
					<td>
						<a href="/stats/player-detail.jsp?object=2016#player_1418">John Banta</a> (Lake Forest)
					</td>
				</tr>
				<tr>
					<th>9.</th>
					<td>
						<a href="/stats/player-detail.jsp?object=2016#player_1470">Lily Hamer</a> (Homewood-Flossmoor)
					</td>
				</tr>
			</tbody>
		</table>
		
		<p>The full <a href="/stats/standings.jsp?object=2016">preliminary results</a> are available, as is the <a href="championship-match.jsp">championship match scoresheet</a>.</p>
		
		<!-- <p>The <a href="packets.zip">questions are available for download</a>.</p> -->
	</div>
</div>

<jsp:include page="/template/footer.jsp" />