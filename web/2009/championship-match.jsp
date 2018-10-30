<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="2009" />
	<jsp:param name="pageTitle" value="Championship Match" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2009()).asTopLevel().output(request, \"championship-match\") %>" />
	<jsp:param name="h1" value="Championship Match" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>The participants in the Championship Match are the one player who won all seven preliminary matches (the Morning Champion), the seven players who won exactly six of their preliminary matches, and the (one) player who won the Desperation Shot, a difficult written test taken by all the players who won exactly five of their preliminary matches.</p>
		
		<p>Unlike in the preliminary rounds, all incorrect answers result in a deduction of 1&nbsp;point. This is true regardless of whether the incorrect answer interrupted the question; it is thus different from ordinary "negs".</p>
		
		<p>Each player starts with 3&nbsp;points. A player whose score reaches 0 is immediately removed from the match.</p>
		
		<p>If any player reaches a score of 10 during the first 20&nbsp;tossups, he or she sits out until tossup&nbsp;21.</p>
		
		<p>The Morning Champion sits out for the first 20&nbsp;tossups, and enters at tossup&nbsp;21 with a score equal to that of the leader at that time. After tossup&nbsp;40, the lowest-scoring players are removed until four remain; if necessary, tiebreaker tossups are used, but they do not count in the overall score of the championship match. After tossup&nbsp;50, the lowest-scoring remaining players are eliminated until two remain; the tiebreaker procedure is the same as before. At the conclusion of the match, tiebreaker tossups are read if and as necessary.</p>
		
		<table class="even-spacing unsortable championship-scoresheet">
			<thead>
				<tr class="player-names">
					<th>&nbsp;</th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1180#player_1859">Jeremiah Monk</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1200#player_1828">Isa Domin</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1190#player_1836">Andrew Deveau</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1199#player_1844">Greg Dzuricsko</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1177#player_1826">Steve Server</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1178#player_1824">Lloyd Sy</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1204#player_1850">Ben Carbery</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1186#player_1832">Christian Kreb</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1191#player_1875">Kevin Malis</a></th>
					<th class="answer" rowspan="2">Answer</th>
				</tr>
				<tr class="player-schools">
					<th>&nbsp;</th>
					<th class="player-school">Carbondale</th><!-- Jeremiah -->
					<th class="player-school">Niles North (Skokie)</th><!-- Isa -->
					<th class="player-school">St.&nbsp;Ignatius (Chicago)</th><!-- Andrew -->
					<th class="player-school">Lisle</th><!-- Greg -->
					<th class="player-school">New Trier (Winnetka)</th><!-- Steve -->
					<th class="player-school">Auburn (Rockford)</th><!-- Lloyd -->
					<th class="player-school">Oak Park-River Forest</th><!-- Ben -->
					<th class="player-school">Loyola Academy (Wilmette)</th><!-- Christian -->
					<th class="player-school">Stevenson (Lincolnshire)</th><!-- Kevin -->
				</tr>
			</thead>
			<tbody>
				<tr class="score-check">
					<th class="score-check-label">Initial scores</th>
					<td class="player-score-check">3</td><!-- Jeremiah -->
					<td class="player-score-check">3</td><!-- Isa -->
					<td class="player-score-check">3</td><!-- Andrew -->
					<td class="player-score-check">3</td><!-- Greg -->
					<td class="player-score-check">3</td><!-- Steve -->
					<td class="player-score-check">3</td><!-- Lloyd -->
					<td class="player-score-check">3</td><!-- Ben -->
					<td class="player-score-check">3</td><!-- Christian -->
					<td class="player-score-check">&nbsp;</td><!-- Kevin -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr>
					<th class="question-number">1</td>
					<td class="player-correct-response">1</td><!-- Jeremiah -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Steve -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Christian -->
					<td class="player-not-in-game">&nbsp;</td><!-- Kevin -->
					<td class="answer">ants (interdisciplinary)</td>
				</tr>
				<tr>
					<th class="question-number">2</td>
					<td class="player-no-response">&nbsp;</td><!-- Jeremiah -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-correct-response">1</td><!-- Steve -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Christian -->
					<td class="player-not-in-game">&nbsp;</td><!-- Kevin -->
					<td class="answer">Alan Grayson</td>
				</tr>
				<tr>
					<th class="question-number">3</td>
					<td class="player-no-response">&nbsp;</td><!-- Jeremiah -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-correct-response">1</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Steve -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Christian -->
					<td class="player-not-in-game">&nbsp;</td><!-- Kevin -->
					<td class="answer">Computation: intersection of curves defined by parametric equations</td>
				</tr>
				<tr>
					<th class="question-number">4</td>
					<td class="player-no-response">&nbsp;</td><!-- Jeremiah -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Steve -->
					<td class="player-correct-response">1</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Christian -->
					<td class="player-not-in-game">&nbsp;</td><!-- Kevin -->
					<td class="answer">Richard Lovelace</td>
				</tr>
				<tr>
					<th class="question-number">5</td>
					<td class="player-no-response">&nbsp;</td><!-- Jeremiah -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Steve -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-correct-response">1</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Christian -->
					<td class="player-not-in-game">&nbsp;</td><!-- Kevin -->
					<td class="answer">Tokugawa shogunate</td>
				</tr>
				<tr>
					<th class="question-number">6</td>
					<td class="player-no-response">&nbsp;</td><!-- Jeremiah -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Steve -->
					<td class="player-correct-response">1</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Christian -->
					<td class="player-not-in-game">&nbsp;</td><!-- Kevin -->
					<td class="answer">carboxyl group</td>
				</tr>
				<tr>
					<th class="question-number">7</td>
					<td class="player-no-response">&nbsp;</td><!-- Jeremiah -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Steve -->
					<td class="player-correct-response">1</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Christian -->
					<td class="player-not-in-game">&nbsp;</td><!-- Kevin -->
					<td class="answer">Giovanni Palestrina</td>
				</tr>
				<tr>
					<th class="question-number">8</td>
					<td class="player-no-response">&nbsp;</td><!-- Jeremiah -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Steve -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Christian -->
					<td class="player-not-in-game">&nbsp;</td><!-- Kevin -->
					<td class="answer">Computation: area enclosed by a curve defined in polar coordinates</td>
				<tr>
					<th class="question-number">9</td>
					<td class="player-no-response">&nbsp;</td><!-- Jeremiah -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-correct-response">1</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Steve -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Christian -->
					<td class="player-not-in-game">&nbsp;</td><!-- Kevin -->
					<td class="answer">David Hume</td>
				</tr>
				<tr>
					<th class="question-number">10</td>
					<td class="player-no-response">&nbsp;</td><!-- Jeremiah -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Steve -->
					<td class="player-correct-response">1</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Christian -->
					<td class="player-not-in-game">&nbsp;</td><!-- Kevin -->
					<td class="answer">Isabel Allende</td>
				</tr>
				<tr>
					<th class="question-number">11</td>
					<td class="player-no-response">&nbsp;</td><!-- Jeremiah -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-correct-response">1</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Steve -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Christian -->
					<td class="player-not-in-game">&nbsp;</td><!-- Kevin -->
					<td class="answer">neutron stars</td>
				</tr>
				<tr>
					<th class="question-number">12</td>
					<td class="player-no-response">&nbsp;</td><!-- Jeremiah -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Steve -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Christian -->
					<td class="player-not-in-game">&nbsp;</td><!-- Kevin -->
					<td class="answer">hysteresis</td>
				</tr>
				<tr>
					<th class="question-number">13</td>
					<td class="player-no-response">&nbsp;</td><!-- Jeremiah -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Steve -->
					<td class="player-correct-response">1</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Christian -->
					<td class="player-not-in-game">&nbsp;</td><!-- Kevin -->
					<td class="answer">corpus callosum</td>
				</tr>
				<tr>
					<th class="question-number">14</td>
					<td class="player-no-response">&nbsp;</td><!-- Jeremiah -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-correct-response">1</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Steve -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Christian -->
					<td class="player-not-in-game">&nbsp;</td><!-- Kevin -->
					<td class="answer">Robert Bork</td>
				</tr>
				<tr>
					<th class="question-number">15</td>
					<td class="player-no-response">&nbsp;</td><!-- Jeremiah -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Steve -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Christian -->
					<td class="player-not-in-game">&nbsp;</td><!-- Kevin -->
					<td class="answer">entablature</td>
				</tr>
				<tr>
					<th class="question-number">16</td>
					<td class="player-no-response">&nbsp;</td><!-- Jeremiah -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Steve -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Christian -->
					<td class="player-not-in-game">&nbsp;</td><!-- Kevin -->
					<td class="answer">"rank" (math common link)</td>
				</tr>
				<tr>
					<th class="question-number">17</td>
					<td class="player-correct-response">1</td><!-- Jeremiah -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Steve -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Christian -->
					<td class="player-not-in-game">&nbsp;</td><!-- Kevin -->
					<td class="answer">Psyche (goddess)</td>
				</tr>
				<tr>
					<th class="question-number">18</td>
					<td class="player-no-response">&nbsp;</td><!-- Jeremiah -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-correct-response">1</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Steve -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Christian -->
					<td class="player-not-in-game">&nbsp;</td><!-- Kevin -->
					<td class="answer">Computation: hoop rolling down a hill</td>
				</tr>
				<tr>
					<th class="question-number">19</td>
					<td class="player-no-response">&nbsp;</td><!-- Jeremiah -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Steve -->
					<td class="player-correct-response">1</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Christian -->
					<td class="player-not-in-game">&nbsp;</td><!-- Kevin -->
					<td class="answer"><i>Go Tell It on the Mountain</i></td>
				</tr>
				<tr>
					<th class="question-number">20</td>
					<td class="player-no-response">&nbsp;</td><!-- Jeremiah -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Steve -->
					<td class="player-correct-response">1</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Christian -->
					<td class="player-not-in-game">&nbsp;</td><!-- Kevin -->
					<td class="answer">Georges Danton</td>
				</tr>
				<tr class="score-check">
					<th class="score-check-label">Scores through 20</th>
					<td class="player-score-check">5</td><!-- Jeremiah -->
					<td class="player-score-check">3</td><!-- Isa -->
					<td class="player-score-check">7</td><!-- Andrew -->
					<td class="player-score-check">3</td><!-- Greg -->
					<td class="player-score-check">3</td><!-- Steve -->
					<td class="player-score-check">10</td><!-- Lloyd -->
					<td class="player-score-check">3</td><!-- Ben -->
					<td class="player-score-check">3</td><!-- Christian -->
					<td class="player-score-check">&nbsp;</td><!-- Kevin -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr class="note">
					<th>&nbsp;</th>
					<td colspan="10" class="note">Kevin Malis, as Morning Champion, entered the game with a score equal to that of the then-leader, Lloyd Sy: 10.</td>
				</tr>
				<tr>
					<th class="question-number">21</td>
					<td class="player-no-response">&nbsp;</td><!-- Jeremiah -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Steve -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-correct-response">1</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Christian -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="answer">Lorenz/Lorentz (last name common link)</td>
				</tr>
				<tr>
					<th class="question-number">22</td>
					<td class="player-no-response">&nbsp;</td><!-- Jeremiah -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-correct-response">1</td><!-- Steve -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Christian -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="answer">Bob McDonnell</td>
				</tr>
				<tr>
					<th class="question-number">23</td>
					<td class="player-no-response">&nbsp;</td><!-- Jeremiah -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-correct-response">1</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Steve -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Christian -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="answer">Computation: intersection of planes</td>
				</tr>
				<tr>
					<th class="question-number">24</td>
					<td class="player-no-response">&nbsp;</td><!-- Jeremiah -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Steve -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Christian -->
					<td class="player-correct-response">1</td><!-- Kevin -->
					<td class="answer"><i>The Mill on the Floss</i></td>
				</tr>
				<tr>
					<th class="question-number">25</td>
					<td class="player-no-response">&nbsp;</td><!-- Jeremiah -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Steve -->
					<td class="player-correct-response">1</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Christian -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="answer">Assyria</td>
				</tr>
				<tr>
					<th class="question-number">26</td>
					<td class="player-no-response">&nbsp;</td><!-- Jeremiah -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-correct-response">1</td><!-- Steve -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Christian -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="answer">Walther Nernst</td>
				</tr>
				<tr>
					<th class="question-number">27</td>
					<td class="player-no-response">&nbsp;</td><!-- Jeremiah -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-correct-response">1</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Steve -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Christian -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="answer"><i>The Firebird</i></td>
				</tr>
				<tr>
					<th class="question-number">28</td>
					<td class="player-no-response">&nbsp;</td><!-- Jeremiah -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Steve -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Christian -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="answer">Computation: distance between right angle and centroid in a right triangle</td>
				</tr>
				<tr>
					<th class="question-number">29</td>
					<td class="player-no-response">&nbsp;</td><!-- Jeremiah -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Steve -->
					<td class="player-correct-response">1</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Christian -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="answer">Alfred Adler</td>
				</tr>
				<tr>
					<th class="question-number">30</td>
					<td class="player-no-response">&nbsp;</td><!-- Jeremiah -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Steve -->
					<td class="player-correct-response">1</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Christian -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="answer">Pierre Corneille</td>
				</tr>
				<tr>
					<th class="question-number">31</td>
					<td class="player-no-response">&nbsp;</td><!-- Jeremiah -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-correct-response">1</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Steve -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Christian -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="answer">feldspar</td>
				</tr>
				<tr>
					<th class="question-number">32</td>
					<td class="player-no-response">&nbsp;</td><!-- Jeremiah -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-correct-response">1</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Steve -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Christian -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="answer">deconstructionism</td>
				</tr>
				<tr>
					<th class="question-number">33</td>
					<td class="player-correct-response">1</td><!-- Jeremiah -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Steve -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Christian -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="answer">gibberellins</td>
				</tr>
				<tr>
					<th class="question-number">34</td>
					<td class="player-no-response">&nbsp;</td><!-- Jeremiah -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-correct-response">1</td><!-- Steve -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Christian -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="answer">James G. Blaine</td>
				</tr>
				<tr>
					<th class="question-number">35</td>
					<td class="player-no-response">&nbsp;</td><!-- Jeremiah -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Steve -->
					<td class="player-correct-response">1</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Christian -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="answer">Masaccio</td>
				</tr>
				<tr>
					<th class="question-number">36</td>
					<td class="player-no-response">&nbsp;</td><!-- Jeremiah -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Steve -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Christian -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="answer">Computation: multiple problems leading to the same answer</td>
				</tr>
				<tr>
					<th class="question-number">37</td>
					<td class="player-no-response">&nbsp;</td><!-- Jeremiah -->
					<td class="player-correct-response">1</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Steve -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Christian -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="answer">"atman"</td>
				</tr>
				<tr>
					<th class="question-number">38</td>
					<td class="player-no-response">&nbsp;</td><!-- Jeremiah -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-correct-response">1</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Steve -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Christian -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="answer">dielectric</td>
				</tr>
				<tr>
					<th class="question-number">39</td>
					<td class="player-no-response">&nbsp;</td><!-- Jeremiah -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Steve -->
					<td class="player-correct-response">1</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Christian -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="answer"><i>Long Day's Journey Into Night</i></td>
				</tr>
				<tr>
					<th class="question-number">40</td>
					<td class="player-no-response">&nbsp;</td><!-- Jeremiah -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-correct-response">1</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Steve -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Christian -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="answer">Falange</td>
				</tr>
				<tr class="score-check">
					<th class="score-check-label">Scores through 40</th>
					<td class="player-score-check">6</td><!-- Jeremiah -->
					<td class="player-score-check">4</td><!-- Isa -->
					<td class="player-score-check">11</td><!-- Andrew -->
					<td class="player-score-check">3</td><!-- Greg -->
					<td class="player-score-check">6</td><!-- Steve -->
					<td class="player-score-check">15</td><!-- Lloyd -->
					<td class="player-score-check">4</td><!-- Ben -->
					<td class="player-score-check">2</td><!-- Christian -->
					<td class="player-score-check">11</td><!-- Kevin -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr class="note">
					<th>&nbsp;</th>
					<td colspan="10" class="note">
						The five players with the lowest scores were to be eliminated. Isa Domin, Greg Dzuricsko, Ben Carbery, and Christian Kreb were therefore eliminated. As Jeremiah Monk and Steve Server were tied, a tiebreaker was held to determine which would remain in the game. The first four tiebreakers (Henry Moseley, Eugene of Savoy, a computation question about a tetrahedron, and <i>Water Music</i>) went dead. Steve answered the fifth one (Ford Motor Company) correctly, so Jeremiah was eliminated and Steve continued.
					</td>
				</tr>
				<tr>
					<th class="question-number">41</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Jeremiah -->
					<td class="player-not-in-game">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Steve -->
					<td class="player-correct-response">1</td><!-- Lloyd -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="player-not-in-game">&nbsp;</td><!-- Christian -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="answer">snakes (common link)</td>
				</tr>
				<tr>
					<th class="question-number">42</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Jeremiah -->
					<td class="player-not-in-game">&nbsp;</td><!-- Isa -->
					<td class="player-correct-response">1</td><!-- Andrew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Steve -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="player-not-in-game">&nbsp;</td><!-- Christian -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="answer">Honduras (current events)</td>
				</tr>
				<tr>
					<th class="question-number">43</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Jeremiah -->
					<td class="player-not-in-game">&nbsp;</td><!-- Isa -->
					<td class="player-correct-response">1</td><!-- Andrew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Steve -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="player-not-in-game">&nbsp;</td><!-- Christian -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="answer">Computation: area enclosed by an implicit function with absolute values</td>
				</tr>
				<tr>
					<th class="question-number">44</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Jeremiah -->
					<td class="player-not-in-game">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Steve -->
					<td class="player-correct-response">1</td><!-- Lloyd -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="player-not-in-game">&nbsp;</td><!-- Christian -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="answer">Robert Graves</td>
				</tr>
				<tr>
					<th class="question-number">45</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Jeremiah -->
					<td class="player-not-in-game">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Greg -->
					<td class="player-correct-response">1</td><!-- Steve -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="player-not-in-game">&nbsp;</td><!-- Christian -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="answer">Han dynasty</td>
				</tr>
				<tr>
					<th class="question-number">46</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Jeremiah -->
					<td class="player-not-in-game">&nbsp;</td><!-- Isa -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Andrew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Greg -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Steve -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="player-not-in-game">&nbsp;</td><!-- Christian -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Kevin -->
					<td class="answer">glycerine</td>
				</tr>
				<tr>
					<th class="question-number">47</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Jeremiah -->
					<td class="player-not-in-game">&nbsp;</td><!-- Isa -->
					<td class="player-correct-response">1</td><!-- Andrew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Steve -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="player-not-in-game">&nbsp;</td><!-- Christian -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="answer">trills</td>
				</tr>
				<tr>
					<th class="question-number">48</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Jeremiah -->
					<td class="player-not-in-game">&nbsp;</td><!-- Isa -->
					<td class="player-correct-response">1</td><!-- Andrew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Steve -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="player-not-in-game">&nbsp;</td><!-- Christian -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="answer">Computation: trigonometry in an isosceles triangle</td>
				</tr>
				<tr>
					<th class="question-number">49</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Jeremiah -->
					<td class="player-not-in-game">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Steve -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="player-not-in-game">&nbsp;</td><!-- Christian -->
					<td class="player-correct-response">1</td><!-- Kevin -->
					<td class="answer">Hannah Arendt</td>
				</tr>
				<tr>
					<th class="question-number">50</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Jeremiah -->
					<td class="player-not-in-game">&nbsp;</td><!-- Isa -->
					<td class="player-correct-response">1</td><!-- Andrew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Steve -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="player-not-in-game">&nbsp;</td><!-- Christian -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="answer">Hesiod</td>
				</tr>
				<tr class="score-check">
					<th class="score-check-label">Scores through 50</th>
					<td class="player-eliminated">eliminated</td><!-- Jeremiah -->
					<td class="player-eliminated">eliminated</td><!-- Isa -->
					<td class="player-score-check">15</td><!-- Andrew -->
					<td class="player-eliminated">eliminated</td><!-- Greg -->
					<td class="player-score-check">6</td><!-- Steve -->
					<td class="player-score-check">17</td><!-- Lloyd -->
					<td class="player-eliminated">eliminated</td><!-- Ben -->
					<td class="player-eliminated">eliminated</td><!-- Christian -->
					<td class="player-score-check">11</td><!-- Kevin -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr class="note">
					<td>&nbsp;</td>
					<td colspan="10" class="note">
						The two remaining players with the lowest scores were eliminated: Steve Server and Kevin Malis.
					</td>
				</tr>
				<tr>
					<th class="question-number">51</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Jeremiah -->
					<td class="player-not-in-game">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Greg -->
					<td class="player-not-in-game">&nbsp;</td><!-- Steve -->
					<td class="player-correct-response">1</td><!-- Lloyd -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="player-not-in-game">&nbsp;</td><!-- Christian -->
					<td class="player-not-in-game">&nbsp;</td><!-- Kevin -->
					<td class="answer">Chad (country)</td>
				</tr>
				<tr>
					<th class="question-number">52</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Jeremiah -->
					<td class="player-not-in-game">&nbsp;</td><!-- Isa -->
					<td class="player-correct-response">1</td><!-- Andrew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Greg -->
					<td class="player-not-in-game">&nbsp;</td><!-- Steve -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="player-not-in-game">&nbsp;</td><!-- Christian -->
					<td class="player-not-in-game">&nbsp;</td><!-- Kevin -->
					<td class="answer">"hegemony"</td>
				</tr>
				<tr>
					<th class="question-number">53</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Jeremiah -->
					<td class="player-not-in-game">&nbsp;</td><!-- Isa -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Andrew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Greg -->
					<td class="player-not-in-game">&nbsp;</td><!-- Steve -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="player-not-in-game">&nbsp;</td><!-- Christian -->
					<td class="player-not-in-game">&nbsp;</td><!-- Kevin -->
					<td class="answer">glucagon</td>
				</tr>
				<tr>
					<th class="question-number">54</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Jeremiah -->
					<td class="player-not-in-game">&nbsp;</td><!-- Isa -->
					<td class="player-correct-response">1</td><!-- Andrew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Greg -->
					<td class="player-not-in-game">&nbsp;</td><!-- Steve -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="player-not-in-game">&nbsp;</td><!-- Christian -->
					<td class="player-not-in-game">&nbsp;</td><!-- Kevin -->
					<td class="answer">Alien and Sedition Acts</td>
				</tr>
				<tr>
					<th class="question-number">55</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Jeremiah -->
					<td class="player-not-in-game">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Greg -->
					<td class="player-not-in-game">&nbsp;</td><!-- Steve -->
					<td class="player-correct-response">1</td><!-- Lloyd -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="player-not-in-game">&nbsp;</td><!-- Christian -->
					<td class="player-not-in-game">&nbsp;</td><!-- Kevin -->
					<td class="answer">Diego Rivera</td>
				</tr>
				<tr>
					<th class="question-number">56</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Jeremiah -->
					<td class="player-not-in-game">&nbsp;</td><!-- Isa -->
					<td class="player-correct-response">1</td><!-- Andrew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Greg -->
					<td class="player-not-in-game">&nbsp;</td><!-- Steve -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="player-not-in-game">&nbsp;</td><!-- Christian -->
					<td class="player-not-in-game">&nbsp;</td><!-- Kevin -->
					<td class="answer">Computation: multiple problems leading to the same answer</td>
				</tr>
				<tr>
					<th class="question-number">57</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Jeremiah -->
					<td class="player-not-in-game">&nbsp;</td><!-- Isa -->
					<td class="player-correct-response">1</td><!-- Andrew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Greg -->
					<td class="player-not-in-game">&nbsp;</td><!-- Steve -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="player-not-in-game">&nbsp;</td><!-- Christian -->
					<td class="player-not-in-game">&nbsp;</td><!-- Kevin -->
					<td class="answer">Sleipnir</td>
				</tr>
				<tr>
					<th class="question-number">58</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Jeremiah -->
					<td class="player-not-in-game">&nbsp;</td><!-- Isa -->
					<td class="player-correct-response">1</td><!-- Andrew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Greg -->
					<td class="player-not-in-game">&nbsp;</td><!-- Steve -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="player-not-in-game">&nbsp;</td><!-- Christian -->
					<td class="player-not-in-game">&nbsp;</td><!-- Kevin -->
					<td class="answer">Coriolis effect</td>
				</tr>
				<tr>
					<th class="question-number">59</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Jeremiah -->
					<td class="player-not-in-game">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Greg -->
					<td class="player-not-in-game">&nbsp;</td><!-- Steve -->
					<td class="player-correct-response">1</td><!-- Lloyd -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="player-not-in-game">&nbsp;</td><!-- Christian -->
					<td class="player-not-in-game">&nbsp;</td><!-- Kevin -->
					<td class="answer"><i>The Hollow Men</i></td>
				</tr>
				<tr>
					<th class="question-number">60</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Jeremiah -->
					<td class="player-not-in-game">&nbsp;</td><!-- Isa -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Andrew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Greg -->
					<td class="player-not-in-game">&nbsp;</td><!-- Steve -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="player-not-in-game">&nbsp;</td><!-- Christian -->
					<td class="player-not-in-game">&nbsp;</td><!-- Kevin -->
					<td class="answer">Robert the Bruce</td>
				</tr>
			</tbody>
			<tfoot>
				<tr class="score-check">
					<th class="score-check-label">Final scores</th>
					<td class="player-eliminated">eliminated</td><!-- Jeremiah -->
					<td class="player-eliminated">eliminated</td><!-- Isa -->
					<td class="player-score-check">18</td><!-- Andrew -->
					<td class="player-eliminated">eliminated</td><!-- Greg -->
					<td class="player-eliminated">eliminated</td><!-- Steve -->
					<td class="player-score-check">20</td><!-- Lloyd -->
					<td class="player-eliminated">eliminated</td><!-- Ben -->
					<td class="player-eliminated">eliminated</td><!-- Christian -->
					<td class="player-eliminated">eliminated</td><!-- Kevin -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
			</tfoot>
		</table>
		
		<p>Lloyd Sy of Auburn High School in Rockford, Illinois is the champion of the 2009 Scobol Solo. He is the second player from Auburn to win the tournament (Siva Sundaram, <a href="/2008/">2008</a>).</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />
