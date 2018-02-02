<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="2007" />
	<jsp:param name="pageTitle" value="Scobol Solo 2007" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2007()).asTopLevel().output(request, \"results\") %>" />
	<jsp:param name="h1" value="Scobol Solo 2007" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>Scobol Solo 2007 was held on Saturday, November&nbsp;10. There were 119 players. The full results have been lost to memory, but here are the final standings:</p>
		
		<table class="tournament-final-standings">
			<tbody>
				<tr>
					<th class="rank">1.</th>
					<th class="player">Greg Gauthier</th>
					<td class="school">Wheaton North High School</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">2.</th>
					<th class="player">Siva Sundaram</th>
					<td class="school">Auburn High School (Rockford)</td>
					<td class="note">Morning Champion</td>
				</tr>
				<tr>
					<th class="rank">3T.</th>
					<th class="player">John Brown</th>
					<td class="school">Auburn High School</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">&nbsp;</th>
					<th class="player">Tony Cao</th>
					<td class="school">Carbondale High School</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">5.</th>
					<th class="player">Caitie Flynn</th>
					<td class="school">Springfield High School</td>
					<td class="note">Desperation Shot champion</td>
				</tr>
				<tr>
					<th class="rank">6T.</th>
					<th class="player">Jonathan Irving</th>
					<td class="school">Wheaton North High School</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">&nbsp;</th>
					<th class="player">Robert Sido</th>
					<td class="school">New Trier High School (Winnetka)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">8.</th>
					<th class="player">Mike Verity</th>
					<td class="school">Loyola Academy (Wilmette)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">9.</th>
					<th class="player">Michael Jiang</th>
					<td class="school">Auburn High School</td>
					<td class="note">&nbsp;</td>
				</tr>
			</tbody>
		</table>
		
		<h2>Category Champions</h2>
		
		<dl>
			<dt>Algebra (7)</dt>
				<dd>Greg Gauthier, Wheaton North</dd>
			<dt>Art &amp; Architecture (6)</dt>
				<dd>Siva Sundaram, Auburn</dd>
			<dt>Astronomy, Earth Science, &amp; Geography (6)</dt>
				<dd>Dan Auerbach, Glenbrook North</dd>
			<dt>Biology (6)</dt>
				<dd>John Brown, Auburn</dd>
			<dt>British Literature (7)</dt>
				<dd>John Brown, Auburn</dd>
			<dt>Calculus &amp; Combinatorics (6)</dt>
				<dd>Greg Gauthier, Wheaton North</dd>
			<dt>Chemistry (5)</dt>
				<dd>Greg Gauthier, Wheaton North</dd>
				<dd>Mike Marszowski, Homewood Flossmoor</dd>
				<dd>Robert Sido, New Trier</dd>
				<dd>Kyle Werner, Lake Forest</dd>
			<dt>Current Events (6)</dt>
				<dd>Amy Allen, IMSA</dd>
				<dd>Dan Auerbach, Glenbrook North</dd>
				<dd>Ben Cohen, New Trier</dd>
				<dd>Jonathan Irving, Wheaton North</dd>
				<dd>Jose Tijo, Maine East</dd>
			<dt>Geometry/Trigonometry (7)</dt>
				<dd>Greg Gauthier, Wheaton North</dd>
			<dt>Language Arts (7)</dt>
				<dd>Mike Marszowski, Homewood Flossmoor</dd>
			<dt>Music (6)</dt>
				<dd>Luke Elderkin, Maine South</dd>
				<dd>Chris Izzo, Homewood Flossmoor</dd>
				<dd>Siva Sundaram, Auburn</dd>
			<dt>Nonfiction (5)</dt>
				<dd>Amy Allen, IMSA</dd>
				<dd>Dan Auerbach, Glenbrook North</dd>
				<dd>Tony Cao, Carbondale</dd>
				<dd>Ethan Epple, Maine East</dd>
			<dt>Physics (5)</dt>
				<dd>Paul Botros, Carbondale</dd>
				<dd>Greg Gauthier, Wheaton North</dd>
				<dd>Mike Marszowski, Homewood Flossmoor</dd>
			<dt>Pop Culture (6)</dt>
				<dd>Nick Bergeon, Buffalo Grove</dd>
			<dt>Religion &amp; Mythology (5)</dt>
				<dd>Daniel Ampon, Loyola</dd>
				<dd>Carl Butt, Springfield</dd>
				<dd>Siva Sundaram, Auburn</dd>
			<dt>Technology (6)</dt>
				<dd>Carl Butt, Springfield</dd>
				<dd>Tim Ekl, Lake Zurich</dd>
				<dd>Jonah Greenthal, New Trier</dd>
			<dt>U.S. History (6)</dt>
				<dd>Mike Dionesotes, Lake Zurich</dd>
				<dd>Jimmy Grizzell, Maine South</dd>
			<dt>U.S. Literature (5)</dt>
				<dd>Tim Durso, Loyola</dd>
				<dd>Catherine Grodin, Loyola</dd>
			<dt>World History (7)</dt>
				<dd>Joe Ahmad, Loyola</dd>
				<dd>Dan Auerbach, Glenbrook North</dd>
			<dt>World Literature (7)</dt>
				<dd>Siva Sundaram, Auburn</dd>
		</dl>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />