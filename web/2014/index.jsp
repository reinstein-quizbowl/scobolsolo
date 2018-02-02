<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="2014" />
	<jsp:param name="pageTitle" value="Scobol Solo 2014" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2014()).asTopLevel().output(request, \"results\") %>" />
	<jsp:param name="h1" value="Scobol Solo 2014" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>Scobol Solo 2014 was held on Saturday, November&nbsp;1. There were 126 players from 29 schools.</p>
		
		<table class="tournament-final-standings">
			<caption style="caption-side: top;">The nine players who made the Championship Match finished as follows:</p>
			<tbody>
				<tr>
					<th class="rank">1.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1028#player_1161">Cole Timmerwilke</a></th>
					<td class="school">Auburn High School (Rockford)</td>
					<td class="note">Morning Champion</td>
				</tr>
				<tr>
					<th class="rank">2.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1028#player_1160">Evan Pandya</a></th>
					<td class="school">Auburn High School</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">3.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1049#player_1247">Sunny Chen</a></th>
					<td class="school">Hinsdale Central High School</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">4.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1031#player_1170">Mahir Morshed</a></th>
					<td class="school">Carbondale Community High School</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">5T.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1030#player_1224">Alston Boyd</a></th>
					<td class="school">Bloomington High School</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">&nbsp;</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1042#player_1195">Nolan Liu</a></th>
					<td class="school">St.&nbsp;Joseph High School (South Bend, Indiana)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">&nbsp;</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1050#player_1220">Dan Pechi</a></th>
					<td class="school">Illinois Mathematics and Science Academy (Aurora)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">&nbsp;</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1050#player_1217">Andrew Salij</a></th>
					<td class="school">Illinois Mathematics and Science Academy</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">9.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1049#player_1248">James Zhou</a></th>
					<td class="school">Hinsdale Central High School</td>
					<td class="">&nbsp;</td>
				</tr>
			</tbody>
		</table>
		
		<p>The full <a href="/stats/standings.jsp?object=2014">preliminary results</a> are available, as is the <a href="championship-match.jsp">championship match scoresheet</a>.</p>
		
		<p>The <a href="packets.zip">questions are available for download</a>.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />