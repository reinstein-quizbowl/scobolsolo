<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="2010" />
	<jsp:param name="pageTitle" value="Scobol Solo 2010" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2010()).asTopLevel().output(request, \"results\") %>" />
	<jsp:param name="h1" value="Scobol Solo 2010" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>Scobol Solo 2010 was held on Saturday, November&nbsp;20. There were 128 players from 26 schools.</p>
		
		<table class="tournament-final-standings">
			<caption style="caption-side: top;">The nine players who made the Championship Match finished as follows:</p>
			<tbody>
				<tr>
					<th class="rank">1.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1226#player_2176">Kevin Malis</a></th>
					<td class="school">Adlai E. Stevenson High School (Lincolnshire)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">2.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1215#player_2142">Ben Carbery</a></th>
					<td class="school">Oak Park-River Forest High School</td>
					<td class="note">Morning Champion</td>
				</tr>
				<tr>
					<th class="rank">3.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1227#player_2139">Andrew Deveau</a></th>
					<td class="school">St.&nbsp;Ignatius College Prep (Chicago)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">4.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1232#player_2163">Ben Chametzky</a></th>
					<td class="school">Carbondale Community High School</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">5.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1218#player_2427">Andrew Van Duyn</a></th>
					<td class="school">Culver Academies (Indiana)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">6.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1216#player_2153">Lloyd Sy</a></th>
					<td class="school">Auburn High School (Rockford)</td></td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">7T.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1226#player_2141">Zach Blumenfeld</a></th>
					<td class="school">Adlai E. Stevenson High School</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">&nbsp;</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1222#player_2131">Andrew Wang</a></th>
					<td class="school">New Trier High School (Winnetka)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">9.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1226#player_2388">Jacob Rebnord</a></th>
					<td class="school">Adlai E. Stevenson High School</td>
					<td class="note">&nbsp;</td>
				</tr>
			</tbody>
		</table>
		
		<p>The full <a href="/stats/standings.jsp?object=2010">preliminary results</a> are available, as is the <a href="championship-match.jsp">championship match scoresheet</a>.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />
