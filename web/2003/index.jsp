<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="2003" />
	<jsp:param name="pageTitle" value="Scobol Solo 2003" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2003()).asTopLevel().output(request, \"home\") %>" />
	<jsp:param name="h1" value="Scobol Solo 2003" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>Scobol Solo 2003 was held on Saturday, November&nbsp;8. There were 64 players. The full results have been lost to memory, but here are the final standings:</p>
		
		<table class="tournament-final-standings">
			<tbody>
				<tr>
					<th class="rank">1.</th>
					<th class="player">Paul Gauthier</th>
					<td class="school">Wheaton North</td>
					<td class="year">Senior</td>
				</tr>
				<tr>
					<th class="rank">2.</th>
					<th class="player">Michael Evans</th>
					<td class="school">New Trier (Winnetka)</td>
					<td class="year">Senior</td>
				</tr>
				<tr>
					<th class="rank">3.</th>
					<th class="player">Andrew Uzzell</th>
					<td class="school">Evanston</td>
					<td class="year">Senior</td>
				</tr>
				<tr>
					<th class="rank">4.</th>
					<th class="player">Eric Grebing</th>
					<td class="school">Bunker Hill</td>
					<td class="year">Senior</td>
				</tr>
				<tr>
					<th class="rank">5T.</th>
					<th class="player">Nik Brendler</th>
					<td class="school">Lincoln-Way East (Frankfort)</td>
					<td class="year">Senior</td>
				</tr>
				<tr>
					<th class="rank">&nbsp;</th>
					<th class="player">Yian Chen</th>
					<td class="school">New Trier</td>
					<td class="year">Senior</td>
				</tr>
				<tr>
					<th class="rank">7.</th>
					<th class="player">Jaya Kalra</th>
					<td class="school">Sterling</td>
					<td class="year">Senior</td>
				</tr>
				<tr>
					<th class="rank">8.</th>
					<th class="player">Amy Minas</th>
					<td class="school">Bradley-Bourbonnais</td>
					<td class="year">Senior</td>
				</tr>
			</tbody>
		</table>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />