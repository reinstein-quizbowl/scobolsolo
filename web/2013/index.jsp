<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="2013" />
	<jsp:param name="pageTitle" value="Scobol Solo 2013" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2013()).asTopLevel().output(request, \"results\") %>" />
	<jsp:param name="h1" value="Scobol Solo 2013" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>Scobol Solo 2013 was held on Saturday, November&nbsp;9. There were 128 players from 23 schools.</p>
		
		<table class="tournament-final-standings">
			<caption style="caption-side: top;">The nine players who made the Championship Match finished as follows:</p>
			<tbody>
				<tr>
					<th class="rank">1.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1014#player_2505">Maia Karpovich</a></th>
					<td class="school">Illinois Mathematics and Science Academy (Aurora)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">2.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1006#player_2545">Evan Pandya</a></th>
					<td class="school">Auburn High School (Rockford)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">3.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1025#player_2464">Jason Asher</a></th>
					<td class="school">Adlai E. Stevenson High School (Lincolnshire)</td>
					<td class="note">Morning Champion</td>
				</tr>
				<tr>
					<th class="rank">4.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1007#player_2563">Pranav Sivakumar</a></th>
					<td class="school">Barrington High School</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">5.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1025#player_2512">Jeeho Lee</a></th>
					<td class="school">Adlai E. Stevenson High School</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">6.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1009#player_2587">James Zetterman</a></th>
					<td class="school">Carbondale Community High School</td></td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">7T.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1008#player_2467">Alston Boyd</a></th>
					<td class="school">Bloomington High School</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">&nbsp;</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1009#player_2571">Prerak Trivedi</a></th>
					<td class="school">Carbondale Community High School</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">9.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1011#player_2509">Greg Krzywicki</a></th>
					<td class="school">Fenton High School (Bensenville)</td>
					<td class="note">&nbsp;</td>
				</tr>
			</tbody>
		</table>
		
		<p>The full <a href="/stats/standings.jsp?object=2013">preliminary results</a> are available, as is the <a href="championship-match.jsp">championship match scoresheet</a>.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />
