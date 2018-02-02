<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="2004" />
	<jsp:param name="pageTitle" value="Scobol Solo 2004" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2004()).asTopLevel().output(request, \"results\") %>" />
	<jsp:param name="h1" value="Scobol Solo 2004" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>Scobol Solo 2004 was held on Saturday, November&nbsp;13. There were 112 players. The full results have been lost to memory, but here are the final standings:</p>
		
		<table class="tournament-final-standings">
			<tbody>
				<tr>
					<th class="rank">1.</th>
					<th class="player">Sara Garnett</th>
					<td class="school">Okemos High School (Michigan)</td>
					<td class="year">Senior</td>
				</tr>
				<tr>
					<th class="rank">2.</th>
					<th class="player">Cliff Chang</th>
					<td class="school">New Trier High School (Winnetka)</td>
					<td class="year">Senior</td>
				</tr>
				<tr>
					<th class="rank">3.</th>
					<th class="player">Alex Beata</th>
					<td class="school">William Fremd High School (Palatine)</td>
					<td class="year">Junior</td>
				</tr>
				<tr>
					<th class="rank">4.</th>
					<th class="player">Billy Ouska</th>
					<td class="school">Buffalo Grove High School</td>
					<td class="year">Senior</td>
				</tr>
				<tr>
					<th class="rank">5T.</th>
					<th class="player">Alex Inman</th>
					<td class="school">William Fremd High School</td>
					<td class="year">Senior</td>
				</tr>
				<tr>
					<th class="rank">&nbsp;</th>
					<th class="player">Jonathan Mayer</th>
					<td class="school">Latin School of Chicago</td>
					<td class="year">Senior</td>
				</tr>
				<tr>
					<th class="rank">7.</th>
					<th class="player">Alex Schallmo</th>
					<td class="school">Maine South High School (Park Ridge)</td>
					<td class="year">Senior</td>
				</tr>
				<tr>
					<th class="rank">8.</th>
					<th class="player">Michael Bilow</th>
					<td class="school">Deerfield High School</td>
					<td class="year">Senior</td>
				</tr>
				<tr>
					<th class="rank">9.</th>
					<th class="player">Donald Taylor</th>
					<td class="school">Douglas MacArthur High School (Decatur)</td>
					<td class="year">Senior</td>
				</tr>
			</tbody>
		</table>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />