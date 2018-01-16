<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="2008" />
	<jsp:param name="pageTitle" value="Scobol Solo 2008" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2008()).asTopLevel().output(request, \"home\") %>" />
	<jsp:param name="h1" value="Scobol Solo 2008" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>Scobol Solo 2008 was held on Saturday, November&nbsp;22. There were 128 players from 28 schools.</p>
		
		<table class="tournament-final-standings">
			<caption style="caption-side: top;">The nine players who made the Championship Match finished as follows:</p>
			<tbody>
				<tr>
					<th class="rank">1.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1150#player_1692">Siva Sundaram</a></th>
					<td class="school">Auburn (Rockford)</td>
					<td class="note">Morning champion</td>
				</tr>
				<tr>
					<th class="rank">2.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1157#player_1700">Joe Ahmad</a></th>
					<td class="school">Loyola Academy (Wilmette)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">3.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1152#player_1716">Tony Cao</a></th>
					<td class="school">Carbondale</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">4.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1149#player_1708">Ben Cohen</a></th>
					<td class="school">New Trier (Winnetka)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">5.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1160#player_1694">Krystle Leung</a></th>
					<td class="school">Naperville Central</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">6T.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1164#player_1750">Alex Cash</a></th>
					<td class="school">Wheaton Warrenville South</td></td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">&nbsp;</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1170#player_1718">Isa Domin</a></th>
					<td class="school">Niles North (Skokie)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">&nbsp;</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1150#player_1721">Michael Jiang</a></th>
					<td class="school">Auburn</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">9.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1151#player_1711">Calvin Quilty</a></th>
					<td class="school">Bloomington</td>
					<td class="note">&nbsp;</td>
				</tr>
			</tbody>
		</table>
		
		<p>The full <a href="/stats/standings.jsp?object=2008">preliminary results</a> are available, as is the <a href="championship-match.jsp">championship match scoresheet</a>.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />