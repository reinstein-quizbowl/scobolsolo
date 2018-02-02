<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="2001" />
	<jsp:param name="pageTitle" value="Scobol Solo 2001" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2001()).asTopLevel().output(request, \"results\") %>" />
	<jsp:param name="h1" value="Scobol Solo 2001" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>The first Scobol Solo was held on Saturday, November&nbsp;10, 2001. There were 64 players. The full results have been lost to memory, but here are the final standings:</p>
		
		<table class="tournament-final-standings">
			<tbody>
				<tr>
					<th class="rank">1.</th>
					<th class="player">Jim Davis</th>
					<td class="school">Latin School of Chicago</td>
				</tr>
				<tr>
					<th class="rank">2.</th>
					<th class="player">Parag Bhayani</th>
					<td class="school">Homewood-Flossmoor High School</td>
				</tr>
				<tr>
					<th class="rank">3.</th>
					<th class="player">Matt Keenan</th>
					<td class="school">New Trier High School (Winnetka)</td>
				</tr>
				<tr>
					<th class="rank">4.</th>
					<th class="player">Tony Wu</th>
					<td class="school">William Fremd High School (Palatine)</td>
				</tr>
				<tr>
					<th class="rank">5.</th>
					<th class="player">Sameer Gopal</th>
					<td class="school">Sterling High School</td>
				</tr>
				<tr>
					<th class="rank">6T.</th>
					<th class="player">Chris Marks</th>
					<td class="school">Downers Grove North High School</td>
				</tr>
				<tr>
					<th class="rank">&nbsp;</th>
					<th class="player">Lori Sommars</th>
					<td class="school">Wheaton North High School</td>
				</tr>
			</tbody>
		</table>
		
		<p>These players won exactly four of their last six matches:</p>
		<ul>
			<li>Denny Abraham, Leyden (Franklin Park)</li>
			<li>Paras Bhayani, Homewood-Flossmoor</li>
			<li>Mariusz Galczynski, Downers Grove North</li>
			<li>Paul Gauthier, Wheaton North</li>
			<li>Jacob Gold, New Trier (Winnetka)</li>
			<li>John Keig, Moline</li>
			<li>James Lee, Fremd (Palatine)</li>
			<li>Todd Mayer, Richmond-Burton</li>
			<li>Donnie Norton, Macomb</li>
			<li>Cezary Podkul, Leyden</li>
			<li>Jacob Straub, Fremd</li>
			<li>Ben Taylor, Guilford (Rockford)</li>
			<li>Chris Temple, Bloomington</li>
			<li>Kelly Tourdot, Stillman Valley</li>
			<li>David Vock, Wheaton North</li>
		</ul>
		
		<p>These players won exactly three of their last six matches:</p>
		<ul>
			<li>Greg Brown, Fremd (Palatine)</li>
			<li>Vince Cima, Leyden (Franklin Park)</li>
			<li>Dena Dittrich, Fremd</li>
			<li>Kristen Dorsey, Homewood-Flossmoor</li>
			<li>Manuel Estrada, Sterling</li>
			<li>Alex Gordon, New Trier (Winnetka)</li>
			<li>Alan Ho, Fremd</li>
			<li>Olivia Johns, University of Chicago Lab Schools</li>
			<li>Andrew Lemkaw, Richmond-Burton</li>
			<li>Eapen Mathew, Sterling</li>
			<li>Craig McKenna, Prairie Ridge (Crystal Lake)</li>
			<li>Keith McKenna, Prairie Ridge</li>
			<li>Aaron Mertz, Fremd</li>
			<li>Ryan O'Shea, Bloomington</li>
			<li>Mark Pliska, Fremd</li>
			<li>Phil Rasher, New Trier</li>
			<li>Ryan Reyes, Leyden</li>
			<li>Eli Wald, Von Steuben (Chicago)</li>
			<li>Ben Whitcher, Guilford (Rockford)</li>
			<li>Dylan Whitcher, Guilford</li>
		</ul>
		
		<section id="category">
			<h2>Category Results</h2>
			
			<p>The following lists include players who answered at least four tossups correctly in each category (out of a maximum of seven). Some specific numbers are unknown because the source data only listed players who answered at least four tossups correctly in each category without specifying how many, but did indicate relative rankings.</p>
			
			<h3>Algebra</h3>
			<dl>
				<dt>Seven tossups</dt>
					<dd>Denny Abraham, Leyden</dd>
				<dt>Six tossups</dt>
					<dd>Jim Davis, Latin</dd>
					<dd>Paul Gauthier, Wheaton North</dd>
					<dd>Mark Pliska, Fremd</dd>
					<dd>Tony Wu, Fremd</dd>
				<dt>Five tossups</dt>
					<dd>Parag Bhayani, Homewood-Flossmoor</dd>
				<dt>Four tossups</dt>
					<dd>Matt Abbott, Fremd</dd>
					<dd>Dena Dittrich, Fremd</dd>
					<dd>Mariusz Galczynski, Downers Grove North</dd>
					<dd>Aaron Mertz, Fremd</dd>
					<dd>Matt Nothnagel, Marian Central Catholic</dd>
			</dl>
			
			<h3>American Dramas, Poems, &amp; Short Stories</h3>
			<p>The following numbers are guesses. The relative rankings are correct. It's possible that Mark actually answered seven, Jim and Kelly answered six, and Parag et&nbsp;al answered five, or there was some other combination of point distributions between four and seven inclusive.</p>
			<dl>
				<dt>Six tossups</dt>
					<dd>Mark Pliska, Fremd</dd>
				<dt>Five tossups</dt>
					<dd>Jim Davis, Latin</dd>
					<dd>Kelly Tourdot, Stillman Valley</dd>
				<dt>Four tossups</dt>
					<dd>Parag Bhayani, Homewood-Flossmoor</dd>
					<dd>Mariusz Galczynski, Downers Grove North</dd>
					<dd>Paul Gauthier, Wheaton North</dd>
					<dd>Jacob Gold, New Trier</dd>
					<dd>Chris Marks, Downers Grove North</dd>
					<dd>Eapen Mathew, Sterling</dd>
					<dd>Lori Sommars, Wheaton North</dd>
					<dd>Ben Taylor, Guilford</dd>
					<dd>David Vock, Wheaton North</dd>
			</dl>
			
			<h3>American Literature</h3>
			<dl>
				<dt>Seven tossups</dt>
					<dd>Mariusz Galcynski, Downers Grove North</dd>
				<dt>Six tossups</dt>
					<dd>Tony Wu, Fremd</dd>
				<dt>Five tossups</dt>
					<dd>Jim Davis, Latin School of Chicago</dd>
					<dd>Alex Gordon, New Trier</dd>
				<dt>Four tossups</dt>
					<dd>Jacob Gold, New Trier</dd>
					<dd>Alan Ho, Fremd</dd>
					<dd>Chris Marks, Downers Grove North</dd>
					<dd>Lori Sommars, Wheaton North</dd>
					<dd>Ben Taylor, Guilford</dd>
					<dd>Kelly Tourdot, Stillman Valley</dd>
			</dl>
			
			<h3>Art</h3>
			<dl>
				<dt>Seven tossups</dt>
					<dd>Paul Gauthier, Wheaton North</dd>
					<dd>Lori Sommars, Wheaton North</dd>
				<dt>Six tossups</dt>
					<dd>Parag Bhayani, Homewood-Flossmoor</dd>
					<dd>Jim Davis, Latin</dd>
					<dd>Mariusz Galczynski, Downers Grove North</dd>
					<dd>Matt Keenan, New Trier</dd>
					<dd>Jacob Straub, Fremd</dd>
					<dd>Kelly Tourdot, Stillman Valley</dd>
				<dt>Five tossups</dt>
					<dd>Paras Bhayani, Homewood-Flossmoor</dd>
					<dd>Robert Dellsy, University of Chicago Lab Schools</dd>
					<dd>John Keig, Moline</dd>
					<dd>Chris Marks, Downers Grove North</dd>
					<dd>Ben Taylor, Guilford</dd>
				<dt>Four tossups</dt>
					<dd>Greg Brown, Fremd</dd>
			</dl>
			
			<h3>Biology</h3>
			<dl>
				<dt>Seven tossups</dt>
					<dd>David Vock, Wheaton North</dd>
				<dt>Six tossups</dt>
					<dd>Jim Davis, Latin</dd>
					<dd>Olivia Johns, University of Chicago Lab Schools</dd>
					<dd>Eapen Mathew, Sterling</dd>
				<dt>Five tossups</dt>
					<dd>Matt Abbott, Fremd</dd>
					<dd>Denny Abraham, Leyden</dd>
					<dd>Chris Marks, Downers Grove North</dd>
					<dd>Ben Whitcher, Guilford</dd>
				<dt>Four tossups</dt>
					<dd>Parag Bhayani, Homewood-Flossmoor</dd>
					<dd>Paras Bhayani, Homewood-Flossmoor</dd>
					<dd>Paul Gauthier, Wheaton North</dd>
					<dd>Alex Gordon, New Trier</dd>
					<dd>John Keig, Moline</dd>
					<dd>Cezary Podkul, Leyden</dd>
					<dd>Jacob Straub, Fremd</dd>
					<dd>Chris Temple, Bloomington</dd>
			</dl>
			
			<h3>Chemistry</h3>
			<p>The following numbers are guesses. The relative rankings are correct. It's possible that Jim et&nbsp;al actually answered seven, Parag and Alex answered six, and Paras et&nbsp;al answered five, or there was some other combination of point distributions between four and seven inclusive.</p>
			<dl>
				<dt>Six tossups</dt>
					<dd>Jim Davis, Latin</dd>
					<dd>Todd Mayer, Richmond-Burton</dd>
					<dd>Ryan O'Shea, Bloomington</dd>
				<dt>Five tossups</dt>
					<dd>Parag Bhayani, Homewood-Flossmoor</dd>
					<dd>Alex Gordon, New Trier</dd>
				<dt>Four tossups</dt>
					<dd>Paras Bhayani, Homewood-Flossmoor</dd>
					<dd>Matt Keenan, New Trier</dd>
					<dd>John Keig, Moline</dd>
					<dd>Chris Temple, Bloomington</dd>
			</dl>
			
			<h3>Current Events</h3>
			<dl>
				<dt>Seven tossups</dt>
					<dd>Matt Keenan, New Trier</dd>
				<dt>Six tossups</dt>
					<dd>Paras Bhayani, Homewood-Flossmoor</dd>
					<dd>Jacob Gold, New Trier</dd>
					<dd>Cezary Podkul, Leyden</dd>
					<dd>Phil Rasher, New Trier</dd>
				<dt>Five tossups</dt>
					<dd>Parag Bhayani, Homewood-Flossmoor</dd>
					<dd>Joe Danavi, Fremd</dd>
					<dd>Kelly Tourdot, Stillman Valley</dd>
					<dd>Eli Wald, Von Steuben</dd>
				<dt>Four tossups</dt>
					<dd>Vince Cima, Leyden</dd>
					<dd>Dena Dittrich, Fremd</dd>
					<dd>Kristen Dorsey, Homewood-Flossmoor</dd>
					<dd>Dylan Whitcher, Guilford</dd>
			</dl>
			
			<h3>Geography, Earth Science, &amp; Astronomy</h3>
			<dl>
				<dt>Seven tossups</dt>
					<dd>John Keig, Moline</dd>
				<dt>Six tossups</dt>
					<dd>Parag Bhayani, Homewood-Flossmoor</dd>
				<dt>Five tossups</dt>
					<dd>Denny Abraham, Leyden</dd>
					<dd>Greg Brown, Fremd</dd>
					<dd>Mike Dietrich, Prairie Ridge</dd>
					<dd>Jacob Gold, New Trier</dd>
					<dd>James Lee, Fremd</dd>
					<dd>Chris Marks, Downers Grove North</dd>
				<dt>Four tossups</dt>
					<dd>Jim Davis, Latin</dd>
					<dd>Manuel Estrada, Sterling</dd>
					<dd>Mariusz Galczynski, Downers Grove North</dd>
					<dd>Andrew Lemkaw, Richmond-Burton</dd>
					<dd>Ben Whitcher, Guilford</dd>
			</dl>
			
			<h3>Geometry &amp; Trigonometry</h3>
			<dl>
				<dt>Some number of tossups <i>x</i> &ge; 5</dt>
					<dd>Denny Abraham, Leyden</dd>
					<dd>Parag Bhayani, Homewood-Flossmoor</dd>
					<dd>Tony Wu, Fremd</dd>
				<dt>Some smaller number of tossups <i>y</i> &ge; 4</dt>
					<dd>Ellie Frazier, Richmond-Burton</dd>
					<dd>Sandra Karolus, Richmond-Burton</dd>
					<dd>John Keig, Moline</dd>
					<dd>Chris Marks, Downers Grove North</dd>
					<dd>Eapen Mathew, Sterling</dd>
					<dd>Aaron Mertz, Fremd</dd>
			</dl>
			
			<h3>Language Arts</h3>
			<p>The following numbers are guesses. The relative rankings are correct. It's possible that John actually answered seven, Jim et&nbsp;al answered six, and Denny et&nbsp;al answered five, or there was some other combination of point distributions between four and seven inclusive.</p>
			<dl>
				<dt>Six tossups</dt>
					<dd>John Keig, Moline</dd>
				<dt>Five tossups</dt>
					<dd>Jim Davis, Latin</dd>
					<dd>Paul Gauthier, Wheaton North</dd>
					<dd>Matt Keenan, New Trier</dd>
					<dd>Keith McKenna, Prairie Ridge</dd>
				<dt>Four tossups</dt>
					<dd>Denny Abraham, Leyden</dd>
					<dd>Paras Bhayani, Homewood-Flossmoor</dd>
					<dd>Mariusz Galczynski, Downers Grove North</dd>
					<dd>Sameer Gopal, Sterling</dd>
					<dd>Todd Mayer, Richmond-Burton</dd>
					<dd>Craig McKenna, Prairie Ridge</dd>
					<dd>Lori Sommars, Wheaton North</dd>
					<dd>Brent Stern, Homewood-Flossmoor</dd>
					<dd>Chris Temple, Bloomington</dd>
					<dd>David Vock, Wheaton North</dd>
			</dl>
			
			<h3>Music</h3>
			<p>The following numbers are guesses. The relative rankings are correct. It's possible that Jim et&nbsp;al actually answered seven, Parag et&nbsp;al answered six, and Dena et&nbsp;al answered five, or there was some other combination of point distributions between four and seven inclusive.</p>
			<dl>
				<dt>Six tossups</dt>
					<dd>Jim Davis, Latin</dd>
					<dd>Donnie Norton, Macomb</dd>
					<dd>Jacob Straub, Fremd</dd>
				<dt>Five tossups</dt>
					<dd>Parag Bhayani, Homewood-Flossmoor</dd>
					<dd>Mariusz Galczynski, Downers Grove North</dd>
					<dd>Phil Rasher, New Trier</dd>
					<dd>Chris Temple, Bloomington</dd>
					<dd>David Vock, Wheaton North</dd>
				<dt>Four tossups</dt>
					<dd>Dena Dittrich, Fremd</dd>
					<dd>Jacob Gold, New Trier</dd>
					<dd>Alan Ho, Fremd</dd>
					<dd>Matt Keenan, New Trier</dd>
					<dd>Aaron Mertz, Fremd</dd>
					<dd>Kelly Tourdot, Stillman Valley</dd>
			</dl>
			
			<h3>Nonfiction</h3>
			<p>The following numbers are guesses. The relative rankings are correct. It's possible that Jim actually answered seven, Matt et&nbsp;al answered six, and Denny et&nbsp;al answered five, or there was some other combination of point distributions between four and seven inclusive.</p>
			<dl>
				<dt>Six tossups</dt>
					<dd>Jim Davis, Latin</dd>
				<dt>Five tossups</dt>
					<dd>Matt Abbott, Fremd</dd>
					<dd>Parag Bhayani, Homewood-Flossmoor</dd>
					<dd>Lori Sommars, Wheaton North</dd>
				<dt>Four tossups</dt>
					<dd>Denny Abraham, Leyden</dd>
					<dd>Mariusz Galczynski, Downers Grove North</dd>
					<dd>Jacob Gold, New Trier</dd>
					<dd>Matt Keenan, New Trier</dd>
					<dd>Cezary Podkul, Leyden</dd>
					<dd>Jacob Straub, Fremd</dd>
					<dd>Kelly Tourdot, Stillman Valley</dd>
					<dd>Tony Wu, Fremd</dd>
			</dl>
			
			<h3>Physics</h3>
			<p>Jim Davis, Latin School of Chicago and Parag Bhayani, Homewood-Flossmoor were the only players to answer at least four physics tossups correctly. We don't know how many they each answered, but Jim answered more than Parag.</p>
			
			<h3>Popular Culture</h3>
			<dl>
				<dt>Seven tossups</dt>
					<dd>Alex Gordon, New Trier</dd>
				<dt>Six tossups</dt>
					<dd>Parag Bhayani, Homewood-Flossmoor</dd>
					<dd>Vince Cima, Leyden</dd>
					<dd>Jim Davis, Latin</dd>
					<dd>Donnie Norton, Macomb</dd>
					<dd>Mark Pliska, Fremd)
				<dt>Five tossups</dt>
					<dd>Greg Brown, Fremd</dd>
					<dd>James Lee, Fremd</dd>
					<dd>Dylan Whitcher, Guilford</dd>
					<dd>Tony Wu, Fremd</dd>
				<dt>Four tossups</dt>
					<dd>Jimmy Estrada, Sterling</dd>
					<dd>Mariusz Galczynski, Downers Grove North</dd>
					<dd>Alan Ho, Fremd</dd>
					<dd>Keith McKenna, Prairie Ridge</dd>
					<dd>Phil Rasher, New Trier</dd>
					<dd>Chris Temple, Bloomington</dd>
			</dl>
			
			<h3>Precalculus &amp; Calculus</h3>
			<dl>
				<dt>Some number of tossups <i>x</i> &ge; 5</dt>
					<dd>Tony Wu, Fremd</dd>
				<dt>Some smaller number of tossups <i>y</i> &ge; 4</dt>
					<dd>Olivia Johns, University of Chicago Lab Schools Schools</dd>
					<dd>David Vock, Wheaton North</dd>
			</dl>
			
			<h3>Religion &amp; Mythology</h3>
			<p>The following numbers are guesses. The relative rankings are correct. It's possible that Matt et&nbsp;al actually answered seven, Denny et&nbsp;al answered six, and Paul et&nbsp;al answered five, or there was some other combination of point distributions between four and seven inclusive.</p>
			<dl>
				<dt>Six tossups</dt>
					<dd>Matt Keenan, New Trier</dd>
					<dd>Ben Taylor, Guilford</dd>
					<dd>Kelly Tourdot, Stillman Valley</dd>
				<dt>Five tossups</dt>
					<dd>Denny Abraham, Leyden</dd>
					<dd>Parag Bhayani, Homewood-Flossmoor</dd>
					<dd>Jim Davis, Latin</dd>
					<dd>Eapen Mathew, Sterling</dd>
					<dd>Keith McKenna, Prairie Ridge</dd>
				<dt>Four tossups</dt>
					<dd>Paul Gauthier, Wheaton North</dd>
					<dd>John Keig, Moline</dd>
					<dd>Chris Marks, Downers Grove North</dd>
					<dd>Lori Sommars, Wheaton North</dd>
					<dd>Jacob Straub, Fremd</dd>
			</dl>
			
			<h3>Technology</h3>
			<dl>
				<dt>Seven tossups</dt>
					<dd>Matt Keenan, New Trier</dd>
				<dt>Six tossups</dt>
					<dd>Parag Bhayani, Homewood-Flossmoor</dd>
					<dd>James Lee, Fremd</dd>
					<dd>Keith McKenna, Prairie Ridge</dd>
				<dt>Five tossups</dt>
					<dd>Adam Beach, Sterling</dd>
					<dd>Jacob Gold, New Trier</dd>
					<dd>John Keig, Moline</dd>
					<dd>Kyle Platt, Prairie Ridge</dd>
					<dd>Lori Sommars, Wheaton North</dd>
					<dd>Chris Temple, Bloomington</dd>
				<dt>Four tossups</dt>
					<dd>Greg Brown, Fremd</dd>
					<dd>Vince Cima, Leyden</dd>
					<dd>Rebecca Diamond, University of Chicago Lab Schools</dd>
					<dd>Kristen Dorsey, Homewood-Flossmoor</dd>
					<dd>Paul Gauthier, Wheaton North</dd>
					<dd>Sameer Gopal, Sterling</dd>
					<dd>Olivia Johns, University of Chicago Lab Schools</dd>
					<dd>Andrew Lemkaw, Richmond-Burton</dd>
					<dd>Todd Mayer, Richmond-Burton</dd>
					<dd>Matt Nothnagel, Marian Central Catholic</dd>
					<dd>Cezary Podkul, Leyden</dd>
					<dd>Brent Stern, Homewood-Flossmoor</dd>
					<dd>Jacob Straub, Fremd</dd>
					<dd>Ben Taylor, Guilford</dd>
					<dd>Eli Wald, Von Steuben</dd>
					<dd>Ben Whitcher, Guilford</dd>
					<dd>Dylan Whitcher, Guilford</dd>
			</dl>
			
			<h3>U.S. History</h3>
			<p>The following numbers are guesses. The relative rankings are correct. It's possible that Matt et&nbsp;al actually answered seven, Paras et&nbsp;al answered six, and Greg et&nbsp;al answered five, or there was some other combination of point distributions between four and seven inclusive.</p>
			<dl>
				<dt>Six tossups</dt>
					<dd>Matt Abbott, Fremd</dd>
					<dd>Parag Bhayani, Homewood-Flossmoor</dd>
					<dd>Alan Ho, Fremd</dd>
					<dd>Mark Pliska, Fremd</dd>
					<dd>Kelly Tourdot, Stillman Valley</dd>
				<dt>Five tossups</dt>
					<dd>Paras Bhayani, Homewood-Flossmoor</dd>
					<dd>Jim Davis, Latin</dd>
					<dd>Dena Dittrich, Fremd</dd>
					<dd>Mike Landow, Homewood-Flossmoor</dd>
					<dd>Chris Marks, Downers Grove North</dd>
				<dt>Four tossups</dt>
					<dd>Greg Brown, Fremd</dd>
					<dd>Robert Dellsy, University of Chicago Lab Schools</dd>
					<dd>Mike Dietrich, Prairie Ridge</dd>
					<dd>Manuel Estrada, Sterling</dd>
					<dd>Paul Gauthier, Wheaton North</dd>
					<dd>John Keig, Moline</dd>
					<dd>James Lee, Fremd</dd>
					<dd>Ryan O'Shea, Bloomington</dd>
					<dd>Jacob Straub, Fremd</dd>
					<dd>Ben Taylor, Guilford</dd>
					<dd>Eli Wald, Von Steuben</dd>
			</dl>
			
			<h3>World History</h3>
			<dl>
				<dt>Seven tossups</dt>
					<dd>Kelly Tourdot, Stillman Valley</dd>
				<dt>Six tossups</dt>
					<dd>Parag Bhayani, Homewood-Flossmoor</dd>
					<dd>Matt Keenan, New Trier</dd>
					<dd>John Keig, Moline</dd>
				<dt>Five tossups</dt>
					<dd>Matt Abbott, Fremd</dd>
					<dd>Jim Davis, Latin</dd>
					<dd>Jimmy Estrada, Sterling</dd>
					<dd>Mariusz Galczynski, Downers Grove North</dd>
					<dd>Paul Gauthier, Wheaton North</dd>
					<dd>Afeefa Ismael, Von Steuben</dd>
					<dd>Cezary Podkul, Leyden</dd>
					<dd>Lori Sommars, Wheaton North</dd>
					<dd>Jacob Straub, Fremd</dd>
					<dd>David Vock, Wheaton North</dd>
				<dt>Four tossups</dt>
					<dd>Vince Cima, Leyden</dd>
					<dd>Dena Dittrich, Fremd</dd>
					<dd>Manuel Estrada, Sterling</dd>
					<dd>Eapen Mathew, Sterling</dd>
					<dd>Eli Wald, Von Steuben</dd>
					<dd>Ben Whitcher, Guilford</dd>
			</dl>
			
			<h3>World Literature</h3>
			<dl>
				<dt>Seven tossups</dt>
					<dd>Parag Bhayani, Homewood-Flossmoor</dd>
					<dd>Paul Gauthier, Wheaton North</dd>
				<dt>Six tossups</dt>
					<dd>Ben Taylor, Guilford</dd>
				<dt>Five tossups</dt>
					<dd>Mariusz Galczynski, Downers Grove North</dd>
					<dd>Chris Marks, Downers Grove North</dd>
					<dd>Kelly Tourdot, Stillman Valley</dd>
					<dd>Tony Wu, Fremd</dd>
				<dt>Four tossups</dt>
					<dd>Jim Davis, Latin</dd>
					<dd>John Keig, Moline</dd>
					<dd>Cezary Podkul, Leyden</dd>
					<dd>Lori Sommars, Wheaton North</dd>
					<dd>Jacob Straub, Fremd</dd>
					<dd>Paraskevi Vamulas, Von Steuben</dd>
					<dd>David Vock, Wheaton North</dd>
			</dl>
		</section>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />