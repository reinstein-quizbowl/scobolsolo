<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="2022" />
	<jsp:param name="pageTitle" value="Championship Match" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2022()).asTopLevel().output(request, \"championship-match\") %>" />
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
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1440#player_3148">Charles Young</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1440#player_3151">Colin Stewart</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1440#player_3149">Rohan Kher</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1450#player_3199">Soren Gjesfjeld</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1455">Dwij Bhatt</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1443#player_3220">Teigue Kelly</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1438#player_3139">Sinecio Morales</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1438#player_3158">Alex Crowell</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1452#player_3205">Jason Qin</a></th>
					<!-- <th class="answer" rowspan="2">Answer</th> -->
				</tr>
				<tr class="player-schools">
					<th>&nbsp;</th>
					<th class="player-school">Barrington</th><!-- Charles Young -->
					<th class="player-school">Barrington</th><!-- Colin Stewart -->
					<th class="player-school">Barrington</th><!-- Rohan Kher -->
					<th class="player-school">Bloomington</th><!-- Soren Gjesfjeld -->
					<th class="player-school">Fremd (Palatine)</th><!-- Dwij Bhatt -->
					<th class="player-school">Waubonsie Valley (Aurora)</th><!-- Teigue Kelly -->
					<th class="player-school">Auburn (Rockford)</th><!-- Sinecio Morales -->
					<th class="player-school">Auburn</th><!-- Alex Crowell -->
					<th class="player-school">IMSA (Aurora)</th><!-- Jason Qin -->
				</tr>
			</thead>
			<tbody>
				<tr class="score-check">
					<th class="score-check-label">Initial scores</th>
					<td class="player-score-check">&nbsp;</td><!-- Charles Young -->
					<td class="player-score-check">3</td><!-- Colin Stewart -->
					<td class="player-score-check">3</td><!-- Rohan Kher -->
					<td class="player-score-check">3</td><!-- Soren Gjesfjeld -->
					<td class="player-score-check">3</td><!-- Dwij Bhatt -->
					<td class="player-score-check">3</td><!-- Teigue Kelly -->
					<td class="player-score-check">3</td><!-- Sinecio Morales -->
					<td class="player-score-check">3</td><!-- Alex Crowell -->
					<td class="player-score-check">3</td><!-- Jason Qin -->
					<!-- <td class="answer-blank">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">1</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-correct-response">1</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Sinecio Morales -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">2</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-correct-response">1</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Sinecio Morales -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">3</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-correct-response">1</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Sinecio Morales -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">4</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-correct-response">1</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Sinecio Morales -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">5</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-incorrect-response">&minus;1</td><!-- Teigue Kelly -->
					<td class="player-correct-response">1</td><!-- Sinecio Morales -->
					<td class="player-incorrect-response">&minus;1</td><!-- Alex Crowell -->
					<td class="player-incorrect-response">&minus;1</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">6</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Sinecio Morales -->
					<td class="player-correct-response">1</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">7</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-correct-response">1</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Sinecio Morales -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">8</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Charles Young -->
					<td class="player-correct-response">1</td><!-- Colin Stewart -->
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-incorrect-response">&minus;1</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Sinecio Morales -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				<tr>
					<th class="question-number">9</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-incorrect-response">&minus;1</td><!-- Sinecio Morales -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-correct-response">1</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">10</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-correct-response">1</td><!-- Sinecio Morales -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">11</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Sinecio Morales -->
					<td class="player-correct-response">1</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">12</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Charles Young -->
					<td class="player-correct-response">1</td><!-- Colin Stewart -->
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Sinecio Morales -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">13</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-correct-response">1</td><!-- Rohan Kher -->
					<td class="player-incorrect-response">&minus;1</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Sinecio Morales -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">14</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Sinecio Morales -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-correct-response">1</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">15</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-correct-response">1</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Sinecio Morales -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">16</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-incorrect-response">&minus;1</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-correct-response">1</td><!-- Sinecio Morales -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">17</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Sinecio Morales -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-correct-response">1</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">18</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-correct-response">1</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Sinecio Morales -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">19</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-correct-response">1</td><!-- Sinecio Morales -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">20</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Charles Young -->
					<td class="player-incorrect-response">&minus;1</td><!-- Colin Stewart -->
					<td class="player-correct-response">1</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-incorrect-response">&minus;1</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Sinecio Morales -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr class="score-check">
					<th class="score-check-label">Scores through 20</th>
					<td class="player-score-check">&nbsp;</td><!-- Charles Young -->
					<td class="player-score-check">4</td><!-- Colin Stewart -->
					<td class="player-score-check">7</td><!-- Rohan Kher -->
					<td class="player-score-check">2</td><!-- Soren Gjesfjeld -->
					<td class="player-score-check">2</td><!-- Dwij Bhatt -->
					<td class="player-score-check">5</td><!-- Teigue Kelly -->
					<td class="player-score-check">6</td><!-- Sinecio Morales -->
					<td class="player-score-check">4</td><!-- Alex Crowell -->
					<td class="player-score-check">5</td><!-- Jason Qin -->
					<!-- <td class="answer-blank">&nbsp;</td> -->
				</tr>
				<tr class="note">
					<th>&nbsp;</th>
					<td colspan="9" class="note">Charles Young, as Morning Champion, entered the game with a score equal to that of the then-leader, Rohan Kher: 7.</td>
				</tr>
				<tr>
					<th class="question-number">21</td>
					<td class="player-incorrect-response">&minus;1</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Sinecio Morales -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">22</td>
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-correct-response">1</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Sinecio Morales -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">23</td>
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-correct-response">1</td><!-- Sinecio Morales -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">24</td>
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-correct-response">1</td><!-- Sinecio Morales -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">25</td>
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Sinecio Morales -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">26</td>
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-incorrect-response">&minus;1</td><!-- Colin Stewart -->
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Sinecio Morales -->
					<td class="player-incorrect-response">&minus;1</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">27</td>
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-correct-response">1</td><!-- Sinecio Morales -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">28</td>
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-correct-response">1</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Sinecio Morales -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">29</td>
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Sinecio Morales -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">30</td>
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-correct-response">1</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Sinecio Morales -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">31</td>
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-correct-response">1</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Sinecio Morales -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">32</td>
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-correct-response">1</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Sinecio Morales -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">33</td>
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-correct-response">1</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Sinecio Morales -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">34</td>
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Sinecio Morales -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">35</td>
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Sinecio Morales -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-correct-response">1</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">36</td>
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Sinecio Morales -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">37</td>
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Sinecio Morales -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">38</td>
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-correct-response">1</td><!-- Sinecio Morales -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">39</td>
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-incorrect-response">&minus;1</td><!-- Sinecio Morales -->
					<td class="player-correct-response">1</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">40</td>
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-correct-response">1</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Sinecio Morales -->
					<td class="player-no-response">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-no-response">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr class="score-check">
					<th class="score-check-label">Scores through 40</th>
					<td class="player-score-check">11</td><!-- Charles Young -->
					<td class="player-score-check">3</td><!-- Colin Stewart -->
					<td class="player-score-check">9</td><!-- Rohan Kher -->
					<td class="player-score-check">5</td><!-- Soren Gjesfjeld -->
					<td class="player-score-check">2</td><!-- Dwij Bhatt -->
					<td class="player-score-check">7</td><!-- Teigue Kelly -->
					<td class="player-score-check">9</td><!-- Sinecio Morales -->
					<td class="player-score-check">4</td><!-- Alex Crowell -->
					<td class="player-score-check">6</td><!-- Jason Qin -->
					<!-- <td class="answer-blank">&nbsp;</td> -->
				</tr>
				<tr class="note">
					<th>&nbsp;</th>
					<td colspan="9" class="note">
						The players with the lowest scores were eliminated until four players remained. Therefore, Colin Stewart, Soren Gjesfjeld, Dwij Bhatt, Alex Crowell, and Jason Qin were eliminated. Charles Young, Rohan Kher, Teigue Kelly, and Sinecio morales remained.
					</td>
				</tr>
				<tr>
					<th class="question-number">41</td>
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-not-in-game">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-correct-response">1</td><!-- Sinecio Morales -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">42</td>
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-not-in-game">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Sinecio Morales -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">43</td>
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-not-in-game">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-correct-response">1</td><!-- Sinecio Morales -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">44</td>
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-not-in-game">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Sinecio Morales -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">45</td>
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-not-in-game">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-incorrect-response">&minus;1</td><!-- Teigue Kelly -->
					<td class="player-incorrect-response">&minus;1</td><!-- Sinecio Morales -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">46</td>
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-not-in-game">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-correct-response">1</td><!-- Sinecio Morales -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">47</td>
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-not-in-game">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-correct-response">1</td><!-- Sinecio Morales -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">48</td>
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-not-in-game">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Sinecio Morales -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">49</td>
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-not-in-game">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-correct-response">1</td><!-- Sinecio Morales -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">50</td>
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-not-in-game">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-incorrect-response">&minus;1</td><!-- Teigue Kelly -->
					<td class="player-incorrect-response">&minus;1</td><!-- Sinecio Morales -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr class="score-check">
					<th class="score-check-label">Scores through 50</th>
					<td class="player-score-check">15</td><!-- Charles Young -->
					<td class="player-eliminated">eliminated</td><!-- Colin Stewart -->
					<td class="player-score-check">9</td><!-- Rohan Kher -->
					<td class="player-eliminated">eliminated</td><!-- Soren Gjesfjeld -->
					<td class="player-eliminated">eliminated</td><!-- Dwij Bhatt -->
					<td class="player-score-check">7</td><!-- Teigue Kelly -->
					<td class="player-score-check">9</td><!-- Sinecio Morales -->
					<td class="player-eliminated">eliminated</td><!-- Alex Crowell -->
					<td class="player-eliminated">eliminated</td><!-- Jason Qin -->
					<!-- <td class="answer-blank">&nbsp;</td> -->
				</tr>
				<tr class="note">
					<th>&nbsp;</th>
					<td colspan="9" class="note">
						The players with the lowest scores were eliminated until two players remained. Therefore, Rohan Kher and Teigue Kelly were eliminated. Charles Young and Sinecio Morales remained.
					</td>
				</tr>
				<tr>
					<th class="question-number">51</td>
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-not-in-game">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-not-in-game">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-not-in-game">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Sinecio Morales -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">52</td>
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-not-in-game">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-not-in-game">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-not-in-game">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Sinecio Morales -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">53</td>
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-not-in-game">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-not-in-game">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-not-in-game">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Sinecio Morales -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">54</td>
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-not-in-game">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-not-in-game">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-not-in-game">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-correct-response">1</td><!-- Sinecio Morales -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">55</td>
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-not-in-game">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-not-in-game">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-not-in-game">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Sinecio Morales -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">56</td>
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-not-in-game">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-not-in-game">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-not-in-game">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Sinecio Morales -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">57</td>
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-not-in-game">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-not-in-game">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-not-in-game">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Sinecio Morales -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">58</td>
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-not-in-game">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-not-in-game">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-not-in-game">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Sinecio Morales -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">59</td>
					<td class="player-incorrect-response">&minus;1</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-not-in-game">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-not-in-game">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-not-in-game">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-incorrect-response">&minus;1</td><!-- Sinecio Morales -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
				<tr>
					<th class="question-number">60</td>
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Colin Stewart -->
					<td class="player-not-in-game">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-not-in-game">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-not-in-game">&nbsp;</td><!-- Teigue Kelly -->
					<td class="player-no-response">&nbsp;</td><!-- Sinecio Morales -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex Crowell -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jason Qin -->
					<!-- <td class="answer">answer</td> -->
				</tr>
			</tbody>
			<tfoot>
				<tr class="score-check">
					<th class="score-check-label">Final scores</th>
					<td class="player-score-check">21</td><!-- Charles Young -->
					<td class="player-eliminated">eliminated</td><!-- Colin Stewart -->
					<td class="player-eliminated">eliminated</td><!-- Rohan Kher -->
					<td class="player-eliminated">eliminated</td><!-- Soren Gjesfjeld -->
					<td class="player-eliminated">eliminated</td><!-- Dwij Bhatt -->
					<td class="player-eliminated">eliminated</td><!-- Teigue Kelly -->
					<td class="player-score-check">12</td><!-- Sinecio Morales -->
					<td class="player-eliminated">eliminated</td><!-- Alex Crowell -->
					<td class="player-eliminated">eliminated</td><!-- Jason Qin -->
					<!-- <td class="answer-blank">&nbsp;</td> -->
				</tr>
			</tfoot>
		</table>
		
		<p>Charles Young of Barrington High School is the champion of the 2022 Scobol Solo. This is his <a href="/2021/">second consecutive championship</a>.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />
