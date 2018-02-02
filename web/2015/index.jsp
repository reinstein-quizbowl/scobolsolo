<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="2015" />
	<jsp:param name="pageTitle" value="Scobol Solo 2015" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2015()).asTopLevel().output(request, \"results\") %>" />
	<jsp:param name="h1" value="Scobol Solo 2015" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>Scobol Solo 2015 was held on Saturday, October&nbsp;31. There were 128 players from 26 schools.</p>
		
		<table class="tournament-final-standings">
			<caption style="caption-side: top;">The nine players who made the Championship Match finished as follows:</p>
			<tbody>
				<tr>
					<th class="rank">1.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1064#player_1323">Ali Saeed</a></th>
					<td class="school">Adlai E. Stevenson High School (Lincolnshire)</td>
					<td class="note">Morning Champion</td>
				</tr>
				<tr>
					<th class="rank">2.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1067#player_1331">Cole Timmerwilke</a></th>
					<td class="school">Auburn High School (Rockford)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">3.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1077#player_1272">Matthew Lehmann</a></th>
					<td class="school">Barrington High School</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">4.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1061">Jakob Myers</a></th>
					<td class="school">Naperville North High School</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">5T.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1067#player_1333">Ethan Strombeck</a></th>
					<td class="school">Auburn High School</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">&nbsp;</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1077#player_1273">John Waldron</a></th>
					<td class="school">Barrington High School</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">7.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1065#player_1308">Jonathan Suh</a></th>
					<td class="school">Wheaton Warrenville South High School</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">8T.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1079#player_1352">Ankush Bajaj</a></th>
					<td class="school">Hinsdale Central High School</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">&nbsp;</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1062#player_1289">Michael Gislason</a></th>
					<td class="school">Homewood-Flossmoor High School</td>
					<td class="">&nbsp;</td>
				</tr>
			</tbody>
		</table>
		
		<p>The full <a href="/stats/standings.jsp?object=2015">preliminary results</a> are available, as is the <a href="championship-match.jsp">championship match scoresheet</a>.</p>
		
		<p>The <a href="packets.zip">questions are available for download</a>.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />