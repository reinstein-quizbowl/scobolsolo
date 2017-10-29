<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="2017" />
	<jsp:param name="pageTitle" value="Scobol Solo 2017" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2017()).asTopLevel().output(request, \"home\") %>" />
	<jsp:param name="h1" value="Scobol Solo 2017" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>Scobol Solo 2017 was held on Saturday, October&nbsp;28, and included 125 players from 29 schools.</p>
		
		<table class="tournament-final-standings">
			<caption style="caption-side: top;">The nine players who made the Championship Match finished as follows:</p>
			<tbody>
				<tr>
					<th>1.</th>
					<td>
						<a href="/stats/player-detail.jsp?school_registration_id=1122#player_1621">Ethan Strombeck</a> (Auburn; also the morning champion)
					</td>
				</tr>
				<tr>
					<th>2.</th>
					<td>
						<a href="/stats/player-detail.jsp?school_registration_id=1119#player_1550">Kevin Kodama</a> (Oak Park-River Forest)
					</td>
				</tr>
				<tr>
					<th>3.</th>
					<td>
						<a href="/stats/player-detail.jsp?school_registration_id=1118#player_1549">Mitch McCullar</a> (Williamsville)
					</th>
				</tr>
				<tr>
					<th>4.</th>
					<td>
						<a href="/stats/player-detail.jsp?school_registration_id=1141#player_1601">Aristotle Vainikos</a> (Sandburg)
					</td>
				</tr>
				<tr>
					<th>5T.</th>
					<td>
						<a href="/stats/player-detail.jsp?school_registration_id=1131#player_1653">Matthew Lee</a> (IMSA)<br />
						<a href="/stats/player-detail.jsp?school_registration_id=1124#player_1635">Jaden Lucas</a> (Carbondale)<br />
						<a href="/stats/player-detail.jsp?school_registration_id=1142#player_1661">Arjun Nageswaran</a> (Stevenson)
					</td>
				</tr>
				<tr>
					<th>8T.</th>
					<td>
						<a href="/stats/player-detail.jsp?school_registration_id=1125#player_1560">Ana Pranger</a> (Latin School)<br />
						<a href="/stats/player-detail.jsp?school_registration_id=1123#player_1559">Wilder Seitz</a> (Barrington)
					</td>
				</tr>
			</tbody>
		</table>
		
		<p>The full <a href="/stats/standings.jsp?object=2017">preliminary results</a> are available<!--, as is the <a href="championship-match.jsp">championship match scoresheet</a>-->.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />