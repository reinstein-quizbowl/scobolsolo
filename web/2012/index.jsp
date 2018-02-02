<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="2012" />
	<jsp:param name="pageTitle" value="Scobol Solo 2012" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2012()).asTopLevel().output(request, \"home\") %>" />
	<jsp:param name="h1" value="Scobol Solo 2012" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>Scobol Solo 2012 was held on Saturday, November&nbsp;10. There were 127 players from 23 schools.</p>
		
		<table class="tournament-final-standings">
			<caption style="caption-side: top;">The nine players who made the Championship Match finished as follows:</p>
			<tbody>
				<tr>
					<th class="rank">1.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1291#player_2436">Nicholas Wawrykow</a></th>
					<td class="school">Saint Joseph High School (South Bend, Indiana)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">2.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1279#player_2220">Thomas Birt</a></th>
					<td class="school">Wheaton North High School</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">3T.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1271#player_2015">Maia Karpovich</a></th>
					<td class="school">Illinois Mathematics and Science Academy (Aurora)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">&nbsp;</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1280#player_2378">Anand Poozhikunnel</a></th>
					<td class="school">Wheaton Warrenville South High School</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">5.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1272#player_2421">Ian Torres</a></th>
					<td class="school">Loyola Academy (Wilmette)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">6.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1271#player_2385">Saieesh Rao</a></th>
					<td class="school">Illinois Mathematics and Science Academy</td></td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">7.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1286#player_2126">Dylan Minarik</a></th>
					<td class="school">Belvidere North High School</td>
					<td class="note">Morning Champion</td>
				</tr>
				<tr>
					<th class="rank">8.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1272#player_2185">Morgan Venkus</a></th>
					<td class="school">Loyola Academy</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">9.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1269#player_2022">Greg Krzywicki</a></th>
					<td class="school">Fenton High School (Bensenville)</td>
					<td class="note">&nbsp;</td>
				</tr>
			</tbody>
		</table>
		
		<p>The full <a href="/stats/standings.jsp?object=2012">preliminary results</a> are available.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />
