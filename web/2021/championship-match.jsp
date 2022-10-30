<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="2021" />
	<jsp:param name="pageTitle" value="Championship Match" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2021()).asTopLevel().output(request, \"championship-match\") %>" />
	<jsp:param name="h1" value="Championship Match" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>The participants in the Championship Match are the one player who won all seven preliminary matches (the Morning Champion), the seven players who won six of their preliminary matches, and the <a href="/instructions/championship-match.jsp#tiebreaker-criterion">top player</a> among those who won five of their preliminary matches.</p>
		
		<p>Unlike in the preliminary rounds, all incorrect answers result in a deduction of 1&nbsp;point. This is true regardless of whether the incorrect answer interrupted the question; it is thus different from ordinary “negs”.</p>
		
		<p>Each player starts with 3&nbsp;points. A player whose score reaches 0 is immediately removed from the match.</p>
		
		<p>If any player reaches a score of 10 during the first 20&nbsp;tossups, they sit out until tossup&nbsp;21.</p>
		
		<p>The Morning Champion sits out for the first 20&nbsp;tossups, and enters at tossup&nbsp;21 with a score equal to that of the leader at that time. After tossup&nbsp;40, the lowest-scoring players are removed until four remain; if necessary, tiebreaker tossups are used, but they do not count in the overall score of the championship match. After tossup&nbsp;50, the lowest-scoring remaining players are eliminated until two remain; the tiebreaker procedure is the same as before. At the conclusion of the match, tiebreaker tossups are read if and as necessary.</p>
		
		<table class="even-spacing unsortable championship-scoresheet">
			<thead>
				<tr class="player-names">
					<th>&nbsp;</th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1416#player_3057">Rohan Ganeshan</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1423#player_3075">Teigue Kelly</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1428#player_3119">Anmol Dash</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1424#player_3076">Charles Young</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1412#player_3040">Michael Hunding</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1410#player_3030">Thomas Lu</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1410#player_3031">Megan Wang</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1405#player_3007">Alex Crowell</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1422#player_3069">Gavin Markoff</a></th>
					<th class="answer" rowspan="2">Answer</th>
				</tr>
				<tr class="player-schools">
					<th>&nbsp;</th>
					<th class="player-school">Buffalo Grove</th><!-- Rohan Ganeshan -->
					<th class="player-school">Waubonsie Valley (Aurora)</th><!-- Teigue Kelly -->
					<th class="player-school">Stevenson (Lincolnshire)</th><!-- Anmol Dash -->
					<th class="player-school">Barrington</th><!-- Charles Young -->
					<th class="player-school">IMSA (Aurora)</th><!-- Michael Hunding -->
					<th class="player-school">Fremd (Palatine)</th><!-- Thomas Lu -->
					<th class="player-school">Fremd</th><!-- Megan Wang -->
					<th class="player-school">Auburn (Rockford)</th><!-- Alex Crowell -->
					<th class="player-school">Herscher</th><!-- Gavin Markoff -->
				</tr>
			</thead>
			<tbody>
				<tr class="score-check">
					<th class="score-check-label">Initial scores</th>
					<td class="player-score-check">&nbsp;</td><!-- Rohan Ganeshan -->
					<td class="player-score-check">3</td><!-- Teigue Kelly -->
					<td class="player-score-check">3</td><!-- Anmol Dash -->
					<td class="player-score-check">3</td><!-- Charles Young -->
					<td class="player-score-check">3</td><!-- Michael Hunding -->
					<td class="player-score-check">3</td><!-- Thomas Lu -->
					<td class="player-score-check">3</td><!-- Megan Wang -->
					<td class="player-score-check">3</td><!-- Alex Crowell -->
					<td class="player-score-check">3</td><!-- Gavin Markoff-->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr>
					<th class="question-number">1</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Rohan Ganeshan -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-correct-response">1</td><!-- Anmol Dash -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-incorrect-response">&minus;1</td><!-- Megan Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer">ketones</td>
				</tr>
				<tr>
					<th class="question-number">2</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Rohan Ganeshan -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-no-response">&nbsp;</td><!-- Megan Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer">Kolkata</td>
				</tr>
				<tr>
					<th class="question-number">3</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Rohan Ganeshan -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-no-response">&nbsp;</td><!-- Megan Wang -->
					<td class="player-correct-response">1</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer"><i>The Hungarian Dances</i></td>
				</tr>
				<tr>
					<th class="question-number">4</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Rohan Ganeshan -->
					<td class="player-correct-response">1</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-no-response">&nbsp;</td><!-- Megan Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer">inferiority complex</td>
				</tr>
				<tr>
					<th class="question-number">5</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Rohan Ganeshan -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-incorrect-response">&minus;1</td><!-- Anmol Dash -->
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-no-response">&nbsp;</td><!-- Megan Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer">body size</td>
				</tr>
				<tr>
					<th class="question-number">6</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Rohan Ganeshan -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-no-response">&nbsp;</td><!-- Megan Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-correct-response">1</td><!-- Gavin Markoff-->
					<td class="answer">Caliban</td>
				</tr>
				<tr>
					<th class="question-number">7</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Rohan Ganeshan -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-no-response">&nbsp;</td><!-- Megan Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-correct-response">1</td><!-- Gavin Markoff-->
					<td class="answer">Battle of Gaugamela</td>
				</tr>
				<tr>
					<th class="question-number">8</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Rohan Ganeshan -->
					<td class="player-correct-response">1</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-no-response">&nbsp;</td><!-- Megan Wang -->
					<td class="player-correct-response">1</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer">firing squads (in paintings)</td>
				<tr>
					<th class="question-number">9</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Rohan Ganeshan -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-no-response">&nbsp;</td><!-- Megan Wang -->
					<td class="player-correct-response">1</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer">Crater Lake</td>
				</tr>
				<tr>
					<th class="question-number">10</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Rohan Ganeshan -->
					<td class="player-correct-response">1</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-no-response">&nbsp;</td><!-- Megan Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer">Pindar</td>
				</tr>
				<tr>
					<th class="question-number">11</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Rohan Ganeshan -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-no-response">&nbsp;</td><!-- Megan Wang -->
					<td class="player-correct-response">1</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer">capacitance</td>
				</tr>
				<tr>
					<th class="question-number">12</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Rohan Ganeshan -->
					<td class="player-incorrect-response">&minus;1</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-no-response">&nbsp;</td><!-- Megan Wang -->
					<td class="player-correct-response">1</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer"><i>A Love Supreme</i></td>
				</tr>
				<tr>
					<th class="question-number">13</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Rohan Ganeshan -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-no-response">&nbsp;</td><!-- Megan Wang -->
					<td class="player-correct-response">1</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer">South Sea Company</td>
				</tr>
				<tr>
					<th class="question-number">14</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Rohan Ganeshan -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-no-response">&nbsp;</td><!-- Megan Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-incorrect-response">&minus;1</td><!-- Gavin Markoff-->
					<td class="answer">Kenzaburo Oe</td>
				</tr>
				<tr>
					<th class="question-number">15</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Rohan Ganeshan -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-no-response">&nbsp;</td><!-- Megan Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-correct-response">1</td><!-- Gavin Markoff-->
					<td class="answer">&#8220;born again&#8221; (common link)</td>
				</tr>
				<tr>
					<th class="question-number">16</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Rohan Ganeshan -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-correct-response">1</td><!-- Michael Hunding -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-no-response">&nbsp;</td><!-- Megan Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer">differential equations</td>
				</tr>
				<tr>
					<th class="question-number">17</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Rohan Ganeshan -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-no-response">&nbsp;</td><!-- Megan Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-incorrect-response">&minus;1</td><!-- Gavin Markoff-->
					<td class="answer">Victoria Woodhull</td>
				</tr>
				<tr>
					<th class="question-number">18</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Rohan Ganeshan -->
					<td class="player-incorrect-response">&minus;1</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-no-response">&nbsp;</td><!-- Megan Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer">traveling preachers (in literature)</td>
				</tr>
				<tr>
					<th class="question-number">19</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Rohan Ganeshan -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-no-response">&nbsp;</td><!-- Megan Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-correct-response">1</td><!-- Gavin Markoff-->
					<td class="answer">Delaware (current events)</td>
				</tr>
				<tr>
					<th class="question-number">20</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Rohan Ganeshan -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-no-response">&nbsp;</td><!-- Megan Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer">sandstone</td>
				</tr>
				<tr class="score-check">
					<th class="score-check-label">Scores through 20</th>
					<td class="player-score-check">&nbsp;</td><!-- Rohan Ganeshan -->
					<td class="player-score-check">4</td><!-- Teigue Kelly -->
					<td class="player-score-check">3</td><!-- Anmol Dash -->
					<td class="player-score-check">7</td><!-- Charles Young -->
					<td class="player-score-check">4</td><!-- Michael Hunding -->
					<td class="player-score-check">3</td><!-- Thomas Lu -->
					<td class="player-score-check">2</td><!-- Megan Wang -->
					<td class="player-score-check">8</td><!-- Alex Crowell -->
					<td class="player-score-check">5</td><!-- Gavin Markoff-->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr class="note">
					<th>&nbsp;</th>
					<td colspan="10" class="note">Rohan Ganeshan, as Morning Champion, entered the game with a score equal to that of the then-leader, Alex Crowell: 8.</td>
				</tr>
				<tr>
					<th class="question-number">21</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Ganeshan -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-incorrect-response">&minus;1</td><!-- Michael Hunding -->
					<td class="player-correct-response">1</td><!-- Thomas Lu -->
					<td class="player-no-response">&nbsp;</td><!-- Megan Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer">cardioid</td>
				</tr>
				<tr>
					<th class="question-number">22</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Ganeshan -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-no-response">&nbsp;</td><!-- Megan Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer">Chimamanda Ngozi Adichie</td>
				</tr>
				<tr>
					<th class="question-number">23</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Ganeshan -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-correct-response">1</td><!-- Anmol Dash -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-no-response">&nbsp;</td><!-- Megan Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer">Alexi Navalny</td>
				</tr>
				<tr>
					<th class="question-number">24</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Ganeshan -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-no-response">&nbsp;</td><!-- Megan Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer">Michael Collins (the Irish revolutionary)</td>
				</tr>
				<tr>
					<th class="question-number">25</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Ganeshan -->
					<td class="player-correct-response">1</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-incorrect-response">&minus;1</td><!-- Thomas Lu -->
					<td class="player-no-response">&nbsp;</td><!-- Megan Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer"><i>Music for the Royal Fireworks</i></td>
				</tr>
				<tr>
					<th class="question-number">26</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Ganeshan -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-incorrect-response">&minus;1</td><!-- Michael Hunding -->
					<td class="player-correct-response">1</td><!-- Thomas Lu -->
					<td class="player-no-response">&nbsp;</td><!-- Megan Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer">Callisto (the moon)</td>
				</tr>
				<tr>
					<th class="question-number">27</td>
					<td class="player-correct-response">1</td><!-- Rohan Ganeshan -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-no-response">&nbsp;</td><!-- Megan Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer"><i>The Mill on the Floss</i></td>
				</tr>
				<tr>
					<th class="question-number">28</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Ganeshan -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-correct-response">1</td><!-- Michael Hunding -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-no-response">&nbsp;</td><!-- Megan Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer">Heraclitus</td>
				</tr>
				<tr>
					<th class="question-number">29</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Ganeshan -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-no-response">&nbsp;</td><!-- Megan Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer">Judith and Holofernes (as a painting subject)</td>
				</tr>
				<tr>
					<th class="question-number">30</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Ganeshan -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-correct-response">1</td><!-- Anmol Dash -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-no-response">&nbsp;</td><!-- Megan Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-incorrect-response">&minus;1</td><!-- Gavin Markoff-->
					<td class="answer">Battle of Fort Necessity</td>
				</tr>
				<tr>
					<th class="question-number">31</td>
					<td class="player-incorrect-response">&minus;1</td><!-- Rohan Ganeshan -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-no-response">&nbsp;</td><!-- Megan Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer">Rabindranath Tagore</td>
				</tr>
				<tr>
					<th class="question-number">32</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Ganeshan -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-no-response">&nbsp;</td><!-- Megan Wang -->
					<td class="player-correct-response">1</td><!-- Alex Crowell -->
					<td class="player-incorrect-response">&minus;1</td><!-- Gavin Markoff-->
					<td class="answer">gluons</td>
				</tr>
				<tr>
					<th class="question-number">33</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Ganeshan -->
					<td class="player-incorrect-response">&minus;1</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-no-response">&nbsp;</td><!-- Megan Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-correct-response">1</td><!-- Gavin Markoff-->
					<td class="answer">Leto</td>
				</tr>
				<tr>
					<th class="question-number">34</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Ganeshan -->
					<td class="player-incorrect-response">&minus;1</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-no-response">&nbsp;</td><!-- Megan Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer">Nineveh (historical)</td>
				</tr>
				<tr>
					<th class="question-number">35</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Ganeshan -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-no-response">&nbsp;</td><!-- Megan Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer">Ursula K. Le&nbsp;Guin</td>
				</tr>
				<tr>
					<th class="question-number">36</td>
					<td class="player-incorrect-response">&minus;1</td><!-- Rohan Ganeshan -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-no-response">&nbsp;</td><!-- Megan Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer">insertion reactions</td>
				</tr>
				<tr>
					<th class="question-number">37</td>
					<td class="player-correct-response">1</td><!-- Rohan Ganeshan -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-incorrect-response">&minus;1</td><!-- Thomas Lu -->
					<td class="player-no-response">&nbsp;</td><!-- Megan Wang -->
					<td class="player-incorrect-response">&minus;1</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer"><i>Der Rosenkavalier</i></td>
				</tr>
				<tr>
					<th class="question-number">38</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Ganeshan -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-no-response">&nbsp;</td><!-- Megan Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer">Justin Smith Morrill</td>
				</tr>
				<tr>
					<th class="question-number">39</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Ganeshan -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-correct-response">1</td><!-- Thomas Lu -->
					<td class="player-no-response">&nbsp;</td><!-- Megan Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer">Lake Turkana</td>
				</tr>
				<tr>
					<th class="question-number">40</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Ganeshan -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-no-response">&nbsp;</td><!-- Megan Wang -->
					<td class="player-correct-response">1</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer">genetic drift</td>
				</tr>
				<tr class="score-check">
					<th class="score-check-label">Scores through 40</th>
					<td class="player-score-check">8</td><!-- Rohan Ganeshan -->
					<td class="player-score-check">3</td><!-- Teigue Kelly -->
					<td class="player-score-check">5</td><!-- Anmol Dash -->
					<td class="player-score-check">13</td><!-- Charles Young -->
					<td class="player-score-check">3</td><!-- Michael Hunding -->
					<td class="player-score-check">4</td><!-- Thomas Lu -->
					<td class="player-score-check">2</td><!-- Megan Wang -->
					<td class="player-score-check">9</td><!-- Alex Crowell -->
					<td class="player-score-check">4</td><!-- Gavin Markoff-->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr class="note">
					<th>&nbsp;</th>
					<td colspan="10" class="note">
						The players with the lowest scores were eliminated until four players remained. Therefore, Teigue Kelly, Michael Hunding, Thomas Lu, Megan Wang, and Gavin Markoff were eliminated. Rohan Ganeshan, Anmol Dash, Charles Young, and Alex Crowell remained.
					</td>
				</tr>
				<tr>
					<th class="question-number">41</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Ganeshan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-not-in-game">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-not-in-game">&nbsp;</td><!-- Megan Wang -->
					<td class="player-correct-response">1</td><!-- Alex Crowell -->
					<td class="player-not-in-game">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer">Louis de&nbsp;Broglie</td>
				</tr>
				<tr>
					<th class="question-number">42</td>
					<td class="player-correct-response">1</td><!-- Rohan Ganeshan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-not-in-game">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-not-in-game">&nbsp;</td><!-- Megan Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-not-in-game">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer">Ralph Vaughan Williams</td>
				</tr>
				<tr>
					<th class="question-number">43</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Ganeshan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-correct-response">1</td><!-- Anmol Dash -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-not-in-game">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-not-in-game">&nbsp;</td><!-- Megan Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-not-in-game">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer">Battle of Sekigahara</td>
				</tr>
				<tr>
					<th class="question-number">44</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Ganeshan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-not-in-game">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-not-in-game">&nbsp;</td><!-- Megan Wang -->
					<td class="player-correct-response">1</td><!-- Alex Crowell -->
					<td class="player-not-in-game">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer">shamans</td>
				</tr>
				<tr>
					<th class="question-number">45</td>
					<td class="player-correct-response">1</td><!-- Rohan Ganeshan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-not-in-game">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-not-in-game">&nbsp;</td><!-- Megan Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-not-in-game">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer">grass (in poetry)</td>
				</tr>
				<tr>
					<th class="question-number">46</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Ganeshan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-not-in-game">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-not-in-game">&nbsp;</td><!-- Megan Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-not-in-game">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer">Vietnam War (photos thereof)</td>
				</tr>
				<tr>
					<th class="question-number">47</td>
					<td class="player-correct-response">1</td><!-- Rohan Ganeshan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-incorrect-response">&minus;1</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-not-in-game">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-not-in-game">&nbsp;</td><!-- Megan Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-not-in-game">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer">Elijah Muhammad</td>
				</tr>
				<tr>
					<th class="question-number">48</td>
					<td class="player-correct-response">1</td><!-- Rohan Ganeshan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-not-in-game">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-not-in-game">&nbsp;</td><!-- Megan Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-not-in-game">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer">electron affinity</td>
				</tr>
				<tr>
					<th class="question-number">49</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Ganeshan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-not-in-game">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-not-in-game">&nbsp;</td><!-- Megan Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-not-in-game">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer"><i>Tom Jones</i></td>
				</tr>
				<tr>
					<th class="question-number">50</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Ganeshan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-correct-response">1</td><!-- Anmol Dash -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-not-in-game">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-not-in-game">&nbsp;</td><!-- Megan Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-not-in-game">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer">Hamas</td>
				</tr>
				<tr class="score-check">
					<th class="score-check-label">Scores through 50</th>
					<td class="player-score-check">12</td><!-- Rohan Ganeshan -->
					<td class="player-eliminated">previously eliminated</td><!-- Teigue Kelly -->
					<td class="player-score-check">7</td><!-- Anmol Dash -->
					<td class="player-score-check">14</td><!-- Charles Young -->
					<td class="player-eliminated">previously eliminated</td><!-- Michael Hunding -->
					<td class="player-eliminated">previously eliminated</td><!-- Thomas Lu -->
					<td class="player-eliminated">previously eliminated</td><!-- Megan Wang -->
					<td class="player-score-check">11</td><!-- Alex Crowell -->
					<td class="player-eliminated">previously eliminated</td><!-- Gavin Markoff-->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr class="note">
					<th>&nbsp;</th>
					<td colspan="10" class="note">
						The players with the lowest scores were eliminated until two players remained. Therefore, Anmol Dash and Alex Crowell were eliminated. Rohan Ganeshan and Charles Young remained.
					</td>
				</tr>
				<tr>
					<th class="question-number">51</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Ganeshan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-not-in-game">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-not-in-game">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-not-in-game">&nbsp;</td><!-- Megan Wang -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-not-in-game">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer">Philip&nbsp;II</td>
				</tr>
				<tr>
					<th class="question-number">52</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Ganeshan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-not-in-game">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-not-in-game">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-not-in-game">&nbsp;</td><!-- Megan Wang -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-not-in-game">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer">troposphere</td>
				</tr>
				<tr>
					<th class="question-number">53</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Ganeshan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-not-in-game">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-not-in-game">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-not-in-game">&nbsp;</td><!-- Megan Wang -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-not-in-game">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer">Friedrich Schiller</td>
				</tr>
				<tr>
					<th class="question-number">54</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Ganeshan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-not-in-game">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-not-in-game">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-not-in-game">&nbsp;</td><!-- Megan Wang -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-not-in-game">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer">Henri Matisse</td>
				</tr>
				<tr>
					<th class="question-number">55</td>
					<td class="player-correct-response">1</td><!-- Rohan Ganeshan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-not-in-game">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-incorrect-response">&minus;1</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-not-in-game">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-not-in-game">&nbsp;</td><!-- Megan Wang -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-not-in-game">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer">Costa Rica (geography)</td>
				</tr>
				<tr>
					<th class="question-number">56</td>
					<td class="player-correct-response">1</td><!-- Rohan Ganeshan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-not-in-game">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-not-in-game">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-not-in-game">&nbsp;</td><!-- Megan Wang -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-not-in-game">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer">keratin</td>
				</tr>
				<tr>
					<th class="question-number">57</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Ganeshan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-not-in-game">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-not-in-game">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-not-in-game">&nbsp;</td><!-- Megan Wang -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-not-in-game">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer">Ptolemy (pharoah common link)</td>
				</tr>
				<tr>
					<th class="question-number">58</td>
					<td class="player-correct-response">1</td><!-- Rohan Ganeshan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-not-in-game">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-not-in-game">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-not-in-game">&nbsp;</td><!-- Megan Wang -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-not-in-game">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer"><i>As I Lay Dying</i></td>
				</tr>
				<tr>
					<th class="question-number">59</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Ganeshan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-not-in-game">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-not-in-game">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-not-in-game">&nbsp;</td><!-- Megan Wang -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-not-in-game">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer">halal</td>
				</tr>
				<tr>
					<th class="question-number">60</td>
					<td class="player-correct-response">1</td><!-- Rohan Ganeshan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-not-in-game">&nbsp;</td><!-- Anmol Dash -->
					<td class="player-incorrect-response">&minus;1</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael Hunding -->
					<td class="player-not-in-game">&nbsp;</td><!-- Thomas Lu -->
					<td class="player-not-in-game">&nbsp;</td><!-- Megan Wang -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-not-in-game">&nbsp;</td><!-- Gavin Markoff-->
					<td class="answer">trisection</td>
				</tr>
			</tbody>
			<tfoot>
				<tr class="score-check">
					<th class="score-check-label">Final scores</th>
					<td class="player-score-check">16</td><!-- Rohan Ganeshan -->
					<td class="player-eliminated">eliminated</td><!-- Teigue Kelly -->
					<td class="player-eliminated">eliminated</td><!-- Anmol Dash -->
					<td class="player-score-check">18</td><!-- Charles Young -->
					<td class="player-eliminated">eliminated</td><!-- Michael Hunding -->
					<td class="player-eliminated">eliminated</td><!-- Thomas Lu -->
					<td class="player-eliminated">eliminated</td><!-- Megan Wang -->
					<td class="player-eliminated">eliminated</td><!-- Alex Crowell -->
					<td class="player-eliminated">eliminated</td><!-- Gavin Markoff-->
					<td class="answer-blank">&nbsp;</td>
				</tr>
			</tfoot>
		</table>
		
		<p>Charles Young of Barrington High School is the champion of the 2021 Scobol Solo. He is the second player from Barrington to win the tournament (John Waldron, <a href="/2016/">2016</a>) and the first player to win the tournament after playing on a <a href="https://www.naqt.com/stats/tournament/team.jsp?team_id=310647">national champion team</a>.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />
