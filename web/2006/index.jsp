<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="2006" />
	<jsp:param name="pageTitle" value="Scobol Solo 2006" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2006()).asTopLevel().output(request, \"home\") %>" />
	<jsp:param name="h1" value="Scobol Solo 2006" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>Scobol Solo 2006 was held on Saturday, November&nbsp;11. There were 112 players. The full results have been lost to memory, but here are the final standings:</p>
		
		<table class="tournament-final-standings">
			<tbody>
				<tr>
					<th class="rank">1.</th>
					<th class="player">Carlo Angiuli</th>
					<td class="school">New Trier (Winnetka)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">2.</th>
					<th class="player">Greg Gauthier</th>
					<td class="school">Wheaton North</td>
					<td class="note">Morning champion</td>
				</tr>
				<tr>
					<th class="rank">3T.</th>
					<th class="player">Greg Peterson</th>
					<td class="school">Maine South (Park Ridge)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">&nbsp;</th>
					<th class="player">Kristina Warren</th>
					<td class="school">Bloomington</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">5.</th>
					<th class="player">Jeff Wear</th>
					<td class="school">Maine South</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">6T.</th>
					<th class="player">John Brown</th>
					<td class="school">Auburn (Rockford)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">&nbsp;</th>
					<th class="player">Katie Hibbeln</th>
					<td class="school">Downers Grove North</td>
					<td class="note">Desperation Shot champion</td>
				</tr>
				<tr>
					<th class="rank">&nbsp;</th>
					<th class="player">Justin Stoncius</th>
					<td class="school">Carbondale</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">9.</th>
					<th class="player">Siva Sundaram</th>
					<td class="school">Auburn</td>
					<td class="note">&nbsp;</td>
				</tr>
			</tbody>
		</table>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />