<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="2005" />
	<jsp:param name="pageTitle" value="Scobol Solo 2005" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2005()).asTopLevel().output(request, \"home\") %>" />
	<jsp:param name="h1" value="Scobol Solo 2005" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>Scobol Solo 2005 was held on Saturday, November&nbsp;12. There were 100 players. The full results have been lost to memory, but here are the final standings:</p>
		
		<table class="tournament-final-standings">
			<tbody>
				<tr>
					<th class="rank">1.</th>
					<th class="player">Robert Sale</th>
					<td class="school">Brookwood (Georgia)</td>
					<td class="note">Morning champion</td>
				</tr>
				<tr>
					<th class="rank">2.</th>
					<th class="player">Greg Gauthier</th>
					<td class="school">Wheaton North</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">3T.</th>
					<th class="player">Brad Fischer</th>
					<td class="school">Winnebago</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">&nbsp;</th>
					<th class="player">Katie Kragh</th>
					<td class="school">Loyola Academy (Wilmette)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">5.</th>
					<th class="player">Colleen Powers</th>
					<td class="school">Auburn (Rockford)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">6T.</th>
					<th class="player">Carlo Angiuli</th>
					<td class="school">New Trier (Winnetka)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">&nbsp;</th>
					<th class="player">John Bracke</th>
					<td class="school">Moline</td>
					<td class="note">Desperation shot champion</td>
				</tr>
				<tr>
					<th class="rank">&nbsp;</th>
					<th class="player">Nick Matchen</th>
					<td class="school">New Trier</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">9.</th>
					<th class="player">Ben Weiss</th>
					<td class="school">Latin School of Chicago</td>
					<td class="note">&nbsp;</td>
				</tr>
			</tbody>
		</table>
		
		<p>These players finished 5&ndash;2 in the preliminary rounds (and thereby qualified for the Desperation Shot):</p>
		<ul>
			<li>Alex Beata, Fremd (Palatine)</li>
			<li>Thomas Buley, New Trier (Winnetka)</li>
			<li>Moses Chan, New Trier</li>
			<li>Mike Cleary, Wheaton North</li>
			<li>Christian Csar, Lake Forest</li>
			<li>Parnell Dean, Lincoln-Way East (Frankfort)</li>
			<li>Kent Haeger, Lake Forest</li>
			<li>Ted Herbstman, Homewood-Flossmoor</li>
			<li>Jackson Lai, Libertyville</li>
			<li>Marysa Leya, St. Ignatius (Chicago)</li>
			<li>Erin Li, Maine East (Park Ridge)</li>
			<li>Matt McKenna, Loyola Academy (Wilmette)</li>
			<li>Luke Pacold, St. Ignatius</li>
			<li>Kevin Park, Maine East</li>
			<li>Greg Peterson, Maine South (Park Ridge)</li>
			<li>Ian Secviar, Mount Carmel (Chicago)</li>
			<li>Robert Sido, New Trier</li>
			<li>Ian Slack, Wheaton North</li>
			<li>Stacey Svetlichnaya, Maine South</li>
			<li>Alex Zhukhovitskiy, Maine East</li>
		</ul>
		
		
		<h2>Category Leaders</h2>
		
		<h3>Algebra</h3>
		<dl>
			<dt>Six tossups</dt>
				<dd>Greg Gauthier, Wheaton North</dd>
				<dd>Lori Knapp, St.&nbsp;Ignatius</dd>
			<dt>Five tossups</dt>
				<dd>Lawrence Chan, Fremd</dd>
			<dt>Four tossups</dt>
				<dd>Ted Herbstman, Homewood-Flossmoor</dd>
				<dd>Carly Kadlec, Wheaton North</dd>
				<dd>Marysh Leya, St.&nbsp;Ignatius</dd>
				<dd>Greg Peterson, Maine South</dd>
				<dd>Jeff Stoiber, Lincoln-Way East</dd>
				<dd>Kristina Warren, Bloomington</dd>
				<dd>Alex Zhukhovitskiy, Maine East</dd>
		</dl>
		
		<h3>Art &amp; Architecture</h3>
		<dl>
			<dt>Five tossups</dt>
				<dd>Buddy Dolan, Loyola Academy</dd>
				<dd>Katie Kragh, Loyola Academy</dd>
			<dt>Four tossups</dt>
				<dd>Alex Beata, Fremd</dd>
				<dd>Erin Li, Maine East</dd>
				<dd>Matt McKenna, Loyola Academy</dd>
				<dd>Jeff Wear, Maine South</dd>
		</dl>
		
		<h3>Astronomy, Earth Science, &amp; Geography</h3>
		<dl>
			<dt>Six tossups</dt>
				<dd>Mike Jacobson, Downers Grove North</dd>
				<dd>Kevin Ngo, Wheaton North</dd>
			<dt>Five tossups</dt>
				<dd>Joe Ahmad, Loyola Academy</dd>
				<dd>Alex Beata, Fremd</dd>
				<dd>Colleen Powers, Auburn</dd>
				<dd>Robert Sale, Brookwood</dd>
			<dt>Four tossups</dt>
				<dd>Thomas Buley, New Trier</dd>
				<dd>Moses Chan, New Trier</dd>
				<dd>Christian Csar, Lake Forest</dd>
				<dd>Ted Herbstman, Homewood-Flossmoor</dd>
				<dd>Matt McKenna, Loyola Academy</dd>
				<dd>Greg Peterson, Maine South</dd>
				<dd>Quinn Slack, New Trier</dd>
				<dd>Ed Tsai, New Trier</dd>
				<dd>Mike Verity, Loyola Academy</dd>
				<dd>Jeff Wear, Maine South</dd>
				<dd>Ben Weiss, Latin</dd>
		</dl>
		
		<h3>Biology</h3>
		<dl>
			<dt>Seven tossups</dt>
				<dd>Ian Slack, Wheaton North</dd>
			<dt>Six tossups</dt>
				<dd>Robert Sale, Brookwood</dd>
			<dt>Five tossups</dt>
				<dd>Tushar Bhattacharya, Maine East</dd>
				<dd>Thomas Buley, New Trier</dd>
				<dd>Mike Cleary, Wheaton North</dd>
				<dd>Jamie Fearon, Wheaton North</dd>
				<dd>Kent Haeger, Lake Forest</dd>
				<dd>Marysh Leya, St.&nbsp;Ignatius</dd>
				<dd>Roger Podwysachi, Lockport</dd>
				<dd>Stacey Svetlichnaya, Maine South</dd>
				<dd>Ben Weiss, Latin</dd>
			<dt>Four tossups</dt>
				<dd>Uma Avula, Homewood-Flossmoor</dd>
				<dd>Moses Chan, New Trier</dd>
				<dd>Brigette Demke, Maine South</dd>
				<dd>Jonathan Irving, Wheaton North</dd>
				<dd>Ed Tsai, New Trier</dd>
				<dd>Kristina Warren, Bloomington</dd>
		</dl>
		
		<h3>British Literature</h3>
		<dl>
			<dt>Six tossups</dt>
				<dd>Brad Fischer, Winnebago</dd>
				<dd>Kevin Park, Maine East</dd>
			<dt>Five tossups</dt>
				<dd>Shauna Guanaratne, Lisle</dd>
				<dd>Katie Kragh, Loyola Academy</dd>
				<dd>Colleen Powers, Auburn</dd>
				<dd>Robert Sale, Brookwood</dd>
			<dt>Four tossups</dt>
				<dd>Alex Beata, Fremd</dd>
				<dd>Mike Cleary, Wheaton North</dd>
				<dd>Roman Huwel, Loyola Academy</dd>
				<dd>Erin Li, Maine East</dd>
				<dd>Nick Matchen, New Trier</dd>
				<dd>Greg Peterson, Maine South</dd>
				<dd>Brandon West, Moline</dd>
		</dl>
		
		<h3>Calculus &amp; Combinatorics</h3>
		<dl>
			<dt>Seven tossups</dt>
				<dd>Alex Zhukhovitskiy, Maine East</dd>
			<dt>Five tossups</dt>
				<dd>Matt McKenna, Loyola Academy</dd>
			<dt>Four tossups</dt>
				<dd>Greg Gauthier, Wheaton North</dd>
				<dd>Mayank Kumar, Downers Grove North</dd>
				<dd>Jaden Pack, Sterling</dd>
		</dl>
		
		<h3>Chemistry</h3>
		<dl>
			<dt>Six tossups</dt>
				<dd>Carlo Angiuli, New Trier</dd>
				<dd>Kent Haeger, Lake Forest</dd>
				<dd>Jeff Wear, Maine South</dd>
			<dt>Five tossups</dt>
				<dd>Mike Cleary, Wheaton North</dd>
				<dd>Spencer Fullam, Homewood-Flossmoor</dd>
				<dd>Robert Sale, Brookwood</dd>
				<dd>Ian Slack, Wheaton North</dd>
			<dt>Four tossups</dt>
				<dd>Carolyn Goldschmidt, New Trier</dd>
				<dd>Roman Huwel, Loyola Academy</dd>
				<dd>Jackson Lai, Libertyville</dd>
				<dd>Jaden Pack, Sterling</dd>
				<dd>Ben Weiss, Latin</dd>
		</dl>
		
		<h3>Current Events</h3>
		<dl>
			<dt>Six tossups</dt>
				<dd>Ian Secviar, Mount Carmel</dd>
				<dd>Ben Weiss, Latin</dd>
			<dt>Five tossups</dt>
				<dd>Alex Beata, Fremd</dd>
				<dd>Brad Fischer, Winnebago</dd>
				<dd>Erin Li, Maine East</dd>
				<dd>Nick Matchen, New Trier</dd>
				<dd>Robert Sale, Brookwood</dd>
				<dd>Thomas Shadle, Downers Grove North</dd>
				<dd>Mike Verity, Loyola Academy</dd>
			<dt>Four tossups</dt>
				<dd>Brian Alberts, McHenry</dd>
				<dd>Kent Haeger, Lake Forest</dd>
				<dd>Jonathan Irving, Wheaton North</dd>
		</dl>
		
		<h3>Geometry &amp; Trigonometry</h3>
		<dl>
			<dt>Six tossups</dt>
				<dd>Greg Gauthier, Wheaton North</dd>
				<dd>Karen Li, Libertyville</dd>
			<dt>Five tossups</dt>
				<dd>Jaden Pack, Sterling</dd>
			<dt>Four tossups</dt>
				<dd>Carlo Angiuli, New Trier</dd>
				<dd>Lawrence Chan, Fremd</dd>
				<dd>Matt McKenna, Loyola Academy</dd>
				<dd>Jeff </dd>
				<dd>Wear, Maine South</dd>
				<dd>Alex Zhukhovitskiy, Maine East</dd>
		</dl>
		
		<h3>Language Arts</h3>
		<dl>
			<dt>Six tossups</dt>
				<dd>Christian Csar, Lake Forest</dd>
			<dt>Five tossups</dt>
				<dd>Ben Weiss, Latin</dd>
			<dt>Four tossups</dt>
				<dd>Lawrence Chan, Fremd</dd>
				<dd>Greg Gauthier, Wheaton North</dd>
				<dd>Katie Hibbeln, Downers Grove North</dd>
				<dd>Jonathan Irving, Wheaton North</dd>
				<dd>Jackson Lai, Libertyville</dd>
				<dd>Colleen Powers, Auburn</dd>
				<dd>Andrew Remissong, Lake Forest</dd>
				<dd>Robert Sale, Brookwood</dd>
				<dd>Quinn Slack, New Trier</dd>
				<dd>Alex Zhukhovitskiy, Maine East</dd>
		</dl>
		
		<h3>Music</h3>
		<dl>
			<dt>Six tossups</dt>
				<dd>Katie Hibbeln, Downers Grove North</dd>
			<dt>Five tossups</dt>
				<dd>Shauna Guanaratne, Lisle</dd>
				<dd>Roman Huwel, Loyola Academy</dd>
				<dd>Jaden Pack, Sterling</dd>
				<dd>Colin Swanson, Waukegan</dd>
			<dt>Four tossups</dt>
				<dd>Lawrence Chan, Fremd</dd>
				<dd>Moses Chan, New Trier</dd>
				<dd>Brad Fischer, Winnebago</dd>
				<dd>Marysh Leya, St.&nbsp;Ignatius</dd>
				<dd>Erin Li, Maine East</dd>
				<dd>Karen Li, Libertyville</dd>
				<dd>Nick Matchen, New Trier</dd>
				<dd>Greg Peterson, Maine South</dd>
				<dd>Colleen Powers, Auburn</dd>
				<dd>Robert Sale, Brookwood</dd>
				<dd>Ian Slack, Wheaton North</dd>
				<dd>Jeff Sommars, Wheaton North</dd>
				<dd>Mike Verity, Loyola Academy</dd>
				<dd>Ben Weiss, Latin</dd>
				<dd>Alex Zhukhovitskiy, Maine East</dd>
		</dl>
		
		<h3>Nonfiction</h3>
		<dl>
			<dt>Six tossups</dt>
				<dd>Ed Tsai, New Trier</dd>
			<dt>Five tossups</dt>
				<dd>Brad Fischer, Winnebago</dd>
				<dd>Kent Haeger, Lake Forest</dd>
				<dd>Jonathan Irving, Wheaton North</dd>
				<dd>Colleen Powers, Auburn</dd>
				<dd>Jeff Wear, Maine South</dd>
			<dt>Four tossups</dt>
				<dd>Sean Beausolei, Waukegan</dd>
				<dd>Christian Csar, Lake Forest</dd>
				<dd>Spencer Fullam, Homewood-Flossmoor</dd>
				<dd>Carolyn Goldschmidt, New Trier</dd>
				<dd>Robert Sale, Brookwood</dd>
				<dd>Kristina Warren, Bloomington</dd>
		</dl>
		
		<h3>Physics</h3>
		<dl>
			<dt>Five tossups</dt>
				<dd>Katie Kragh, Loyola Academy</dd>
				<dd>Robert Sale, Brookwood</dd>
				<dd>Robert Sido, New Trier</dd>
			<dt>Four tossups</dt>
				<dd>Carlo Angiuli, New Trier</dd>
				<dd>Lawrence Chan, Fremd</dd>
				<dd>Moses Chan, New Trier</dd>
				<dd>Christian Csar, Lake Forest</dd>
				<dd>Matt Menke, Downers Grove North</dd>
		</dl>
		
		<h3>Popular Culture</h3>
		<dl>
			<dt>Six tossups</dt>
				<dd>Tushar Bhattacharya, Maine East</dd>
				<dd>Nick Matchen, New Trier</dd>
			<dt>Five tossups</dt>
				<dd>Jessica Booten, Bunker Hill</dd>
				<dd>Brad Fischer, Winnebago</dd>
				<dd>Jonathan Irving, Wheaton North</dd>
				<dd>Jack O'Connell, Lockport</dd>
				<dd>Todd Whitney, Homewood-Flossmoor</dd>
			<dt>Four tossups</dt>
				<dd>Sean Beausolei, Waukegan</dd>
				<dd>John Bracke, Moline</dd>
				<dd>Thomas Buley, New Trier</dd>
				<dd>David Eiten, Wheaton North</dd>
				<dd>Joe Houlihan, Homewood-Flossmoor</dd>
				<dd>Karen Li, Libertyville</dd>
				<dd>Pat Marshall, St.&nbsp;Ignatius</dd>
				<dd>Greg Peterson, Maine South</dd>
				<dd>Robert Sale, Brookwood</dd>
				<dd>Ian Secviar, Mount Carmel</dd>
				<dd>Ed Tsai, New Trier</dd>
				<dd>Mike Verity, Loyola Academy</dd>
				<dd>Brandon West, Moline</dd>
				<dd>Greg Zimmer, Loyola Academy</dd>
		</dl>
		
		<h3>Religion &amp; Mythology</h3>
		<dl>
			<dt>Six tossups</dt>
				<dd>Katie Hibbeln, Downers Grove North</dd>
				<dd>Robert Sale, Brookwood</dd>
				<dd>Colin Swanson, Waukegan</dd>
			<dt>Five tossups</dt>
				<dd>Shauna Guanaratne, Lisle</dd>
				<dd>Erin Li, Maine East</dd>
				<dd>Luke Pacold, St.&nbsp;Ignatius</dd>
				<dd>Steven Ryckbosch, St.&nbsp;Ignatius</dd>
			<dt>Four tossups</dt>
				<dd>Christian Csar, Lake Forest</dd>
				<dd>Parnell Dean, Lincoln-Way East</dd>
				<dd>Buddy Dolan, Loyola Academy</dd>
				<dd>Jamie Fearon, Wheaton North</dd>
				<dd>Kent Haeger, Lake Forest</dd>
				<dd>Sam Krc, Wheaton North</dd>
				<dd>Pat Marshall, St.&nbsp;Ignatius</dd>
				<dd>Nick Matchen, New Trier</dd>
				<dd>Conor McCarthy, St.&nbsp;Ignatius</dd>
				<dd>Colleen Powers, Auburn</dd>
				<dd>Thomas Shadle, Downers Grove North</dd>
		</dl>
		
		<h3>Technology</h3>
		<dl>
			<dt>Six tossups</dt>
				<dd>Carlo Angiuli, New Trier</dd>
				<dd>Christian Csar, Lake Forest</dd>
				<dd>Jack Ringness, Wheaton North</dd>
				<dd>Quinn Slack, New Trier</dd>
				<dd>Brandon West, Moline</dd>
			<dt>Five tossups</dt>
				<dd>Zane DeLand, Downers Grove North</dd>
				<dd>Spencer Fullam, Homewood-Flossmoor</dd>
				<dd>Ted Herbstman, Homewood-Flossmoor</dd>
				<dd>Dan Hess, McHenry</dd>
				<dd>Kevin Ngo, Wheaton North</dd>
				<dd>Roger Podwysachi, Lockport</dd>
				<dd>Robert Sale, Brookwood</dd>
			<dt>Four tossups</dt>
				<dd>Joe Ahmad, Loyola Academy</dd>
				<dd>Michael Ambrose, New Trier</dd>
				<dd>Jared Hite, Homewood-Flossmoor</dd>
				<dd>Karen Li, Libertyville</dd>
				<dd>Robert Sido, New Trier</dd>
				<dd>Jeff Stoiber, Lincoln-Way East</dd>
				<dd>Stacey Svetlichnaya, Maine South</dd>
		</dl>
		
		<h3>U.S. History</h3>
		<dl>
			<dt>Six tossups</dt>
				<dd>Kristina Warren, Bloomington</dd>
			<dt>Five tossups</dt>
				<dd>Brian Alberts, McHenry</dd>
				<dd>Brad Fischer, Winnebago</dd>
				<dd>Ian Secviar, Mount Carmel</dd>
				<dd>Stacey Svetlichnaya, Maine South</dd>
			<dt>Four tossups</dt>
				<dd>Joe Ahmad, Loyola Academy</dd>
				<dd>Michael Ambrose, New Trier</dd>
				<dd>Alex Beata, Fremd</dd>
				<dd>John </dd>
				<dd>Bracke, Moline</dd>
				<dd>Thomas Buley, New Trier</dd>
				<dd>Zane DeLand, Downers Grove North</dd>
				<dd>Shauna Guanaratne, Lisle</dd>
				<dd>Carly Kadlec, Wheaton North</dd>
				<dd>Kevin Ngo, Wheaton North</dd>
				<dd>Colleen Powers, Auburn</dd>
				<dd>Robert Sale, Brookwood</dd>
				<dd>Thomas Shadle, Downers Grove North</dd>
				<dd>Jeff Wear, Maine South</dd>
				<dd>Ben Weiss, Latin</dd>
				<dd>Brandon West, Moline</dd>
				<dd>Justin Williams, Waukegan</dd>
		</dl>
		
		<h3>U.S. Literature</h3>
		<dl>
			<dt>Six tossups</dt>
				<dd>Colleen Powers, Auburn</dd>
			<dt>Four tossups</dt>
				<dd>Greg Gauthier, Wheaton North</dd>
				<dd>Kristina Warren, Bloomington</dd>
		</dl>
		
		<h3>World History</h3>
		<dl>
			<dt>Seven tossups</dt>
				<dd>Parnell Dean, Lincoln-Way East</dd>
			<dt>Six tossups</dt>
				<dd>Robert Sale, Brookwood</dd>
			<dt>Five tossups</dt>
				<dd>Brian Alberts, McHenry</dd>
				<dd>Alex Beata, Fremd</dd>
				<dd>Brad Fischer, Winnebago</dd>
				<dd>Pat Marshall, St.&nbsp;Ignatius</dd>
				<dd>Kevin Ngo, Wheaton North</dd>
				<dd>Colleen Powers, Auburn</dd>
				<dd>Steven Ryckbosch, St.&nbsp;Ignatius</dd>
				<dd>Thomas Shadle, Downers Grove North</dd>
			<dt>Four tossups</dt>
				<dd>Christian Csar, Lake Forest</dd>
				<dd>Tim Durso, Loyola Academy</dd>
				<dd>Mike Educate, Lake Forest</dd>
				<dd>Brian Guo, Downers Grove North</dd>
				<dd>Kent Haeger, Lake Forest</dd>
				<dd>Katie Hibbeln, Downers Grove North</dd>
				<dd>Katie Kragh, Loyola Academy</dd>
				<dd>Marysh Leya, St.&nbsp;Ignatius</dd>
				<dd>Conor McCarthy, St.&nbsp;Ignatius</dd>
				<dd>Adam Mohebbi, Lincoln-Way East</dd>
				<dd>Luke Pacold, St.&nbsp;Ignatius</dd>
				<dd>Greg Peterson, Maine South</dd>
				<dd>Robert Sido, New Trier</dd>
				<dd>Stacey Svetlichnaya, Maine South</dd>
				<dd>Ed Tsai, New Trier</dd>
				<dd>Kristina Warren, Bloomington</dd>
		</dl>
		
		<h3>World Literature</h3>
		<dl>
			<dt>Six tossups</dt>
				<dd>Kristina Warren, Bloomington</dd>
			<dt>Five tossups</dt>
				<dd>Tushar Bhattacharya, Maine East</dd>
				<dd>Charlie Harper, Homewood-Flossmoor</dd>
			<dt>Four tossups</dt>
				<dd>Mike Cleary, Wheaton North</dd>
				<dd>Matt McKenna, Loyola Academy</dd>
				<dd>Robert Sale, Brookwood</dd>
		</dl>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />