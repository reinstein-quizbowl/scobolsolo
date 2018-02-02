<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="2002" />
	<jsp:param name="pageTitle" value="Scobol Solo 2002" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2002()).asTopLevel().output(request, \"results\") %>" />
	<jsp:param name="h1" value="Scobol Solo 2002" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>Scobol Solo 2002 was held on Saturday, November&nbsp;23. There were 96 players. The full results have been lost to memory, but here are the final standings:</p>
		
		<table class="tournament-final-standings">
			<tbody>
				<tr>
					<th class="rank">1.</th>
					<th class="player">Matt Keenan</th>
					<td class="school">New Trier High School (Winnetka)</td>
					<td class="year">Senior</td>
				</tr>
				<tr>
					<th class="rank">2.</th>
					<th class="player">Ben Taylor</th>
					<td class="school">Guilford High School (Rockford)</td>
					<td class="year">Senior</td>
				</tr>
				<tr>
					<th class="rank">3.</th>
					<th class="player">Paul Gauthier</th>
					<td class="school">Wheaton North High School</td>
					<td class="year">Junior</td>
				</tr>
				<tr>
					<th class="rank">4.</th>
					<th class="player">Mark Hedden</th>
					<td class="school">Downers Grove North High School</td>
					<td class="year">Junior</td>
				</tr>
				<tr>
					<th class="rank">5.</th>
					<th class="player">Kelly Tourdot</th>
					<td class="school">Stillman Valley High School</td>
					<td class="year">Senior</td>
				</tr>
				<tr>
					<th class="rank">6.</th>
					<th class="player">Blair Nathan</th>
					<td class="school">New Trier High School</td>
					<td class="year">Sophomore</td>
				</tr>
				<tr>
					<th class="rank">7.</th>
					<th class="player">Josh Laufenberg</th>
					<td class="school">Wheaton North High School</td>
					<td class="year">Junior</td>
				</tr>
				<tr>
					<th class="rank">8.</th>
					<th class="player">David Vock</th>
					<td class="school">Wheaton North High School</td>
					<td class="year">Senior</td>
				</tr>
				<tr>
					<th class="rank">9.</th>
					<th class="player">Donald Taylor</th>
					<td class="school">Douglas MacArthur High School (Decatur)</td>
					<td class="year">Sophomore</td>
				</tr>
			</tbody>
		</table>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />