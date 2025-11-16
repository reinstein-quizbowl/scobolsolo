<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="2025" />
	<jsp:param name="pageTitle" value="Championship Match" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2025()).asTopLevel().output(request, \"championship-match\") %>" />
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
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1553#player_3632">Steven Long (morning champion)</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1555#player_3641">Emily Hu</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1534#player_3607">Elena Whitford</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1540#player_3579">James Wray</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1535#player_3698">Ayaan Ghori</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1556#player_3645">Jeev Hora</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1534#player_3606">Simra Kuchay</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1550#player_3616">Felix Sacks</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1534#player_3608">Grant Liu</a></th>
					<%-- <th class="answer" rowspan="2">Answer</th> --%>
				</tr>
				<tr class="player-schools">
					<th>&nbsp;</th>
					<th class="player-school">Fremd</th><!-- Steven Long -->
					<th class="player-school">Naperville North</th><!-- Emily Hu -->
					<th class="player-school">Walter Payton</th><!-- Elena Whitford -->
					<th class="player-school">Glenbrook South</th><!-- James Wray -->
					<th class="player-school">Sandburg</th><!-- Ayaan Ghori -->
					<th class="player-school">IMSA</th><!-- Jeev Hora -->
					<th class="player-school">Walter Payton</th><!-- Simra Kuchay -->
					<th class="player-school">Lincoln-Way East</th><!-- Felix Sacks -->
					<th class="player-school">Walter Payton</th><!-- Grant Liu -->
				</tr>
			</thead>
			<tbody>
				<tr class="score-check">
					<th class="score-check-label">Initial scores</th>
					<td class="player-score-check">&nbsp;</td><!-- Steven Long -->
					<td class="player-score-check">3</td><!-- Emily Hu -->
					<td class="player-score-check">3</td><!-- Elena Whitford -->
					<td class="player-score-check">3</td><!-- James Wray -->
					<td class="player-score-check">3</td><!-- Ayaan Ghori -->
					<td class="player-score-check">3</td><!-- Jeev Hora -->
					<td class="player-score-check">3</td><!-- Simra Kuchay -->
					<td class="player-score-check">3</td><!-- Felix Sacks -->
					<td class="player-score-check">3</td><!-- Grant Liu-->
					<%-- <td class="answer-blank">&nbsp;</td> --%>
				</tr>
				<tr>
					<th class="question-number">1</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Emily Hu -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- James Wray -->
					<td class="player-no-response">&nbsp;</td><!-- Ayaan Ghori -->
					<td class="player-no-response">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-correct-response">1</td><!-- Grant Liu-->
					<%-- <td class="answer">law of cosines</td> --%>
				</tr>
				<tr>
					<th class="question-number">2</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-incorrect-response">&minus;1</td><!-- Emily Hu -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-correct-response">1</td><!-- James Wray -->
					<td class="player-no-response">&nbsp;</td><!-- Ayaan Ghori -->
					<td class="player-incorrect-response">&minus;1</td><!-- Jeev Hora -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-incorrect-response">&minus;1</td><!-- Grant Liu-->
					<%-- <td class="answer">Sea of Okhotsk</td> --%>
				</tr>
				<tr>
					<th class="question-number">3</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Emily Hu -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- James Wray -->
					<td class="player-correct-response">1</td><!-- Ayaan Ghori -->
					<td class="player-no-response">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer">Ralph Nader</td> --%>
				</tr>
				<tr>
					<th class="question-number">4</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-incorrect-response">&minus;1</td><!-- Emily Hu -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- James Wray -->
					<td class="player-incorrect-response">&minus;1</td><!-- Ayaan Ghori -->
					<td class="player-no-response">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-incorrect-response">&minus;1</td><!-- Simra Kuchay -->
					<td class="player-incorrect-response">&minus;1</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer">“The Chimney Sweeper”</td> --%>
				</tr>
				<tr>
					<th class="question-number">5</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-incorrect-response">&minus;1</td><!-- Emily Hu -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-correct-response">1</td><!-- James Wray -->
					<td class="player-no-response">&nbsp;</td><!-- Ayaan Ghori -->
					<td class="player-no-response">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-incorrect-response">&minus;1</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer">trojans (astronomical objects)</td> --%>
				</tr>
				<tr class="note">
					<th>&nbsp;</th>
					<td colspan="9" class="note">Emily Hu reached a score of 0 and was eliminated.</td>
				</tr>
				<tr>
					<th class="question-number">6</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- James Wray -->
					<td class="player-correct-response">1</td><!-- Ayaan Ghori -->
					<td class="player-no-response">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-incorrect-response">&minus;1</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer">Charles Mingus</td> --%>
				</tr>
				<tr class="note">
					<th>&nbsp;</th>
					<td colspan="9" class="note">Felix Sacks reached a score of 0 and was eliminated.</td>
				</tr>
				<tr>
					<th class="question-number">7</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-correct-response">1</td><!-- James Wray -->
					<td class="player-no-response">&nbsp;</td><!-- Ayaan Ghori -->
					<td class="player-no-response">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer">psychoanalysis</td> --%>
				</tr>
				<tr>
					<th class="question-number">8</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- James Wray -->
					<td class="player-correct-response">1</td><!-- Ayaan Ghori -->
					<td class="player-no-response">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer">Louis Philippe&nbsp;I</td> --%>
				<tr>
					<th class="question-number">9</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- James Wray -->
					<td class="player-correct-response">1</td><!-- Ayaan Ghori -->
					<td class="player-no-response">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-incorrect-response">&minus;1</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer"><i>The Birthday Party</i></td> --%>
				</tr>
				<tr>
					<th class="question-number">10</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-incorrect-response">&minus;1</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- James Wray -->
					<td class="player-no-response">&nbsp;</td><!-- Ayaan Ghori -->
					<td class="player-no-response">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer">Henry Purcell</td> --%>
				</tr>
				<tr>
					<th class="question-number">11</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- James Wray -->
					<td class="player-no-response">&nbsp;</td><!-- Ayaan Ghori -->
					<td class="player-correct-response">1</td><!-- Jeev Hora -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer">Henderson-Hasselbalch equation</td> --%>
				</tr>
				<tr>
					<th class="question-number">12</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-correct-response">1</td><!-- James Wray -->
					<td class="player-incorrect-response">&minus;1</td><!-- Ayaan Ghori -->
					<td class="player-no-response">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer">Hathor</td> --%>
				</tr>
				<tr>
					<th class="question-number">13</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- James Wray -->
					<td class="player-no-response">&nbsp;</td><!-- Ayaan Ghori -->
					<td class="player-no-response">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-correct-response">1</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer"><i>Angels in America</i></td> --%>
				</tr>
				<tr>
					<th class="question-number">14</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- James Wray -->
					<td class="player-correct-response">1</td><!-- Ayaan Ghori -->
					<td class="player-no-response">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer"><i>The Embarkation for Cythera</i></td> --%>
				</tr>
				<tr>
					<th class="question-number">15</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- James Wray -->
					<td class="player-correct-response">1</td><!-- Ayaan Ghori -->
					<td class="player-no-response">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer">“Mad” Anthony Wayne</td> --%>
				</tr>
				<tr>
					<th class="question-number">16</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- James Wray -->
					<td class="player-no-response">&nbsp;</td><!-- Ayaan Ghori -->
					<td class="player-correct-response">1</td><!-- Jeev Hora -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer">Brownian motion</td> --%>
				</tr>
				<tr>
					<th class="question-number">17</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- James Wray -->
					<td class="player-correct-response">1</td><!-- Ayaan Ghori -->
					<td class="player-no-response">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer"><i>The Conservationist</i></td> --%>
				</tr>
				<tr>
					<th class="question-number">18</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-correct-response">1</td><!-- James Wray -->
					<td class="player-no-response">&nbsp;</td><!-- Ayaan Ghori -->
					<td class="player-no-response">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer">Viktor Orbán</td> --%>
				</tr>
				<tr>
					<th class="question-number">19</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-correct-response">1</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- James Wray -->
					<td class="player-no-response">&nbsp;</td><!-- Ayaan Ghori -->
					<td class="player-no-response">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-incorrect-response">&minus;1</td><!-- Grant Liu-->
					<%-- <td class="answer">Uruguay</td> --%>
				</tr>
				<tr>
					<th class="question-number">20</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- James Wray -->
					<td class="player-no-response">&nbsp;</td><!-- Ayaan Ghori -->
					<td class="player-no-response">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-correct-response">1</td><!-- Grant Liu-->
					<%-- <td class="answer">electrophoresis</td> --%>
				</tr>
				<tr class="score-check">
					<th class="score-check-label">Scores through 20</th>
					<td class="player-score-check">&nbsp;</td><!-- Steven Long -->
					<td class="player-eliminated">eliminated</td><!-- Emily Hu -->
					<td class="player-score-check">3</td><!-- Elena Whitford -->
					<td class="player-score-check">8</td><!-- James Wray -->
					<td class="player-score-check">8</td><!-- Ayaan Ghori -->
					<td class="player-score-check">4</td><!-- Jeev Hora -->
					<td class="player-score-check">2</td><!-- Simra Kuchay -->
					<td class="player-eliminated">eliminated</td><!-- Felix Sacks -->
					<td class="player-score-check">3</td><!-- Grant Liu-->
					<%-- <td class="answer-blank">&nbsp;</td> --%>
				</tr>
				<tr class="note">
					<th>&nbsp;</th>
					<td colspan="9" class="note">Steven Long, as Morning Champion, entered the game with a score equal to that of the then-leaders, James Wray and Ayaan Ghori: 8.</td>
				</tr>
				<tr>
					<th class="question-number">21</th>
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- James Wray -->
					<td class="player-no-response">&nbsp;</td><!-- Ayaan Ghori -->
					<td class="player-correct-response">1</td><!-- Jeev Hora -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer">Franz Marc</td> --%>
				</tr>
				<tr>
					<th class="question-number">22</th>
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- James Wray -->
					<td class="player-no-response">&nbsp;</td><!-- Ayaan Ghori -->
					<td class="player-incorrect-response">&minus;1</td><!-- Jeev Hora -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-incorrect-response">&minus;1</td><!-- Grant Liu-->
					<%-- <td class="answer">extreme value theorem</td> --%>
				</tr>
				<tr>
					<th class="question-number">23</th>
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- James Wray -->
					<td class="player-no-response">&nbsp;</td><!-- Ayaan Ghori -->
					<td class="player-no-response">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-correct-response">1</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer">Lawrence Ferlinghetti</td> --%>
				</tr>
				<tr>
					<th class="question-number">24</th>
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- James Wray -->
					<td class="player-correct-response">1</td><!-- Ayaan Ghori -->
					<td class="player-no-response">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-incorrect-response">&minus;1</td><!-- Grant Liu-->
					<%-- <td class="answer"><i>Gibbons v. Ogden</i></td> --%>
				</tr>
				<tr>
					<th class="question-number">25</th>
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- James Wray -->
					<td class="player-no-response">&nbsp;</td><!-- Ayaan Ghori -->
					<td class="player-no-response">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer">Letitia James</td> --%>
				</tr>
				<tr>
					<th class="question-number">26</th>
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- James Wray -->
					<td class="player-no-response">&nbsp;</td><!-- Ayaan Ghori -->
					<td class="player-no-response">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-correct-response">1</td><!-- Grant Liu-->
					<%-- <td class="answer">acetylene</td> --%>
				</tr>
				<tr>
					<th class="question-number">27</th>
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- James Wray -->
					<td class="player-no-response">&nbsp;</td><!-- Ayaan Ghori -->
					<td class="player-no-response">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-correct-response">1</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer">Isaac Bashevis Singer</td> --%>
				</tr>
				<tr>
					<th class="question-number">28</th>
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-correct-response">1</td><!-- James Wray -->
					<td class="player-no-response">&nbsp;</td><!-- Ayaan Ghori -->
					<td class="player-no-response">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer">Marne River</td> --%>
				</tr>
				<tr>
					<th class="question-number">29</th>
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-incorrect-response">&minus;1</td><!-- James Wray -->
					<td class="player-no-response">&nbsp;</td><!-- Ayaan Ghori -->
					<td class="player-correct-response">1</td><!-- Jeev Hora -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer">cultural evolution</td> --%>
				</tr>
				<tr>
					<th class="question-number">30</th>
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- James Wray -->
					<td class="player-no-response">&nbsp;</td><!-- Ayaan Ghori -->
					<td class="player-no-response">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer">Cooper pairs</td> --%>
				</tr>
				<tr>
					<th class="question-number">31</th>
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- James Wray -->
					<td class="player-no-response">&nbsp;</td><!-- Ayaan Ghori -->
					<td class="player-no-response">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer">Alexander Scriabin</td> --%>
				</tr>
				<tr>
					<th class="question-number">32</th>
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-incorrect-response">&minus;1</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- James Wray -->
					<td class="player-incorrect-response">&minus;1</td><!-- Ayaan Ghori -->
					<td class="player-no-response">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer">Michael Romanov</td> --%>
				</tr>
				<tr>
					<th class="question-number">33</th>
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-correct-response">1</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- James Wray -->
					<td class="player-no-response">&nbsp;</td><!-- Ayaan Ghori -->
					<td class="player-no-response">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer">Ian McEwan</td> --%>
				</tr>
				<tr>
					<th class="question-number">34</th>
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- James Wray -->
					<td class="player-no-response">&nbsp;</td><!-- Ayaan Ghori -->
					<td class="player-incorrect-response">&minus;1</td><!-- Jeev Hora -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-correct-response">1</td><!-- Grant Liu-->
					<%-- <td class="answer">Arkansas River</td> --%>
				</tr>
				<tr>
					<th class="question-number">35</th>
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-correct-response">1</td><!-- James Wray -->
					<td class="player-no-response">&nbsp;</td><!-- Ayaan Ghori -->
					<td class="player-no-response">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer">magnesium</td> --%>
				</tr>
				<tr>
					<th class="question-number">36</th>
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- James Wray -->
					<td class="player-no-response">&nbsp;</td><!-- Ayaan Ghori -->
					<td class="player-no-response">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-correct-response">1</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer">Jeff Koons</td> --%>
				</tr>
				<tr>
					<th class="question-number">37</th>
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- James Wray -->
					<td class="player-correct-response">1</td><!-- Ayaan Ghori -->
					<td class="player-no-response">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer"><i>Maus</i></td> --%>
				</tr>
				<tr>
					<th class="question-number">38</th>
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- James Wray -->
					<td class="player-no-response">&nbsp;</td><!-- Ayaan Ghori -->
					<td class="player-incorrect-response">&minus;1</td><!-- Jeev Hora -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer">Jesse (biblical character)</td> --%>
				</tr>
				<tr>
					<th class="question-number">39</th>
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- James Wray -->
					<td class="player-no-response">&nbsp;</td><!-- Ayaan Ghori -->
					<td class="player-no-response">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer">lipases</td> --%>
				</tr>
				<tr>
					<th class="question-number">40</th>
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- James Wray -->
					<td class="player-no-response">&nbsp;</td><!-- Ayaan Ghori -->
					<td class="player-no-response">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-correct-response">1</td><!-- Grant Liu-->
					<%-- <td class="answer">Deng Xiaoping</td> --%>
				</tr>
				<tr class="score-check">
					<th class="score-check-label">Scores through 40</th>
					<td class="player-score-check">8</td><!-- Steven Long -->
					<td class="player-eliminated">eliminated</td><!-- Emily Hu -->
					<td class="player-score-check">3</td><!-- Elena Whitford -->
					<td class="player-score-check">9</td><!-- James Wray -->
					<td class="player-score-check">9</td><!-- Ayaan Ghori -->
					<td class="player-score-check">3</td><!-- Jeev Hora -->
					<td class="player-score-check">5</td><!-- Simra Kuchay -->
					<td class="player-eliminated">eliminated</td><!-- Felix Sacks -->
					<td class="player-score-check">4</td><!-- Grant Liu-->
					<%-- <td class="answer-blank">&nbsp;</td> --%>
				</tr>
				<tr class="note">
					<th>&nbsp;</th>
					<td colspan="9" class="note">
						The players with the lowest scores were eliminated until four players remained. Therefore, Elena Whitford, Jeev Hora, and Grant Liu were eliminated. Steven Long, James Wray, Ayaan Ghori, and Simra Kuchay remained.
					</td>
				</tr>
				<tr>
					<th class="question-number">41</th>
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-not-in-game">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-correct-response">1</td><!-- James Wray -->
					<td class="player-no-response">&nbsp;</td><!-- Ayaan Ghori -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer">precession</td> --%>
				</tr>
				<tr>
					<th class="question-number">42</th>
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-not-in-game">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-correct-response">1</td><!-- James Wray -->
					<td class="player-no-response">&nbsp;</td><!-- Ayaan Ghori -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer">Trajan</td> --%>
				</tr>
				<tr>
					<th class="question-number">43</th>
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-not-in-game">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-incorrect-response">&minus;1</td><!-- James Wray -->
					<td class="player-no-response">&nbsp;</td><!-- Ayaan Ghori -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-correct-response">1</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer">sibyls</td> --%>
				</tr>
				<tr>
					<th class="question-number">44</th>
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-not-in-game">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- James Wray -->
					<td class="player-no-response">&nbsp;</td><!-- Ayaan Ghori -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-correct-response">1</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer">Yukio Mishima</td> --%>
				</tr>
				<tr>
					<th class="question-number">45</th>
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-not-in-game">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- James Wray -->
					<td class="player-no-response">&nbsp;</td><!-- Ayaan Ghori -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-correct-response">1</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer">hippocampus</td> --%>
				</tr>
				<tr>
					<th class="question-number">46</th>
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-not-in-game">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- James Wray -->
					<td class="player-no-response">&nbsp;</td><!-- Ayaan Ghori -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-correct-response">1</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer">Winslow Homer</td> --%>
				</tr>
				<tr>
					<th class="question-number">47</th>
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-not-in-game">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-correct-response">1</td><!-- James Wray -->
					<td class="player-no-response">&nbsp;</td><!-- Ayaan Ghori -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer">al-Assad family</td> --%>
				</tr>
				<tr>
					<th class="question-number">48</th>
					<td class="player-correct-response">1</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-not-in-game">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- James Wray -->
					<td class="player-no-response">&nbsp;</td><!-- Ayaan Ghori -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer"><i>Go Tell It on the Mountain</i></td> --%>
				</tr>
				<tr>
					<th class="question-number">49</th>
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-not-in-game">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-correct-response">1</td><!-- James Wray -->
					<td class="player-no-response">&nbsp;</td><!-- Ayaan Ghori -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer">Javier Milei</td> --%>
				</tr>
				<tr>
					<th class="question-number">50</th>
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-not-in-game">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-correct-response">1</td><!-- James Wray -->
					<td class="player-no-response">&nbsp;</td><!-- Ayaan Ghori -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer">mean (math common link)</td> --%>
				</tr>
				<tr class="score-check">
					<th class="score-check-label">Scores through 50</th>
					<td class="player-score-check">9</td><!-- Steven Long -->
					<td class="player-eliminated">eliminated</td><!-- Emily Hu -->
					<td class="player-eliminated">eliminated</td><!-- Elena Whitford -->
					<td class="player-score-check">13</td><!-- James Wray -->
					<td class="player-score-check">9</td><!-- Ayaan Ghori -->
					<td class="player-eliminated">eliminated</td><!-- Jeev Hora -->
					<td class="player-score-check">9</td><!-- Simra Kuchay -->
					<td class="player-eliminated">eliminated</td><!-- Felix Sacks -->
					<td class="player-eliminated">eliminated</td><!-- Grant Liu-->
					<%-- <td class="answer-blank">&nbsp;</td> --%>
				</tr>
				<tr class="note">
					<th>&nbsp;</th>
					<td colspan="9" class="note">
						The players with the lowest scores were to be eliminated until two players remained. Since there was a three-way tie for one advancement spot, a tiebreaker tossup was read. Ayaan Ghori answered it incorrectly and was eliminated. Simra Kuchay then answered it correctly to advance, so Steven Long was implicitly eliminated.
					</td>
				</tr>
				<tr>
					<th class="question-number">TB</th>
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-not-in-game">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-not-in-game">&nbsp;</td><!-- James Wray -->
					<td class="player-incorrect-response">Incorrect</td><!-- Ayaan Ghori -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-correct-response">Correct</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer">Pali language</td> --%>
				</tr>
				<tr>
					<th class="question-number">51</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-not-in-game">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- James Wray -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ayaan Ghori -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer">Lodge family</td> --%>
				</tr>
				<tr>
					<th class="question-number">52</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-not-in-game">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- James Wray -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ayaan Ghori -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-correct-response">1</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer">Samuel Beckett</td> --%>
				</tr>
				<tr>
					<th class="question-number">53</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-not-in-game">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- James Wray -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ayaan Ghori -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-correct-response">1</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer">ionization energy</td> --%>
				</tr>
				<tr>
					<th class="question-number">54</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-not-in-game">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-incorrect-response">&minus;1</td><!-- James Wray -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ayaan Ghori -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-incorrect-response">&minus;1</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer"><i>Capriccio espagnol</i></td> --%>
				</tr>
				<tr>
					<th class="question-number">55</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-not-in-game">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- James Wray -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ayaan Ghori -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-correct-response">1</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer">Mary Wollstonecraft</td> --%>
				</tr>
				<tr>
					<th class="question-number">56</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-not-in-game">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- James Wray -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ayaan Ghori -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-incorrect-response">&minus;1</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer">Battle of Leipzig</td> --%>
				</tr>
				<tr>
					<th class="question-number">57</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-not-in-game">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- James Wray -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ayaan Ghori -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-correct-response">1</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer">Paul Verlaine</td> --%>
				</tr>
				<tr>
					<th class="question-number">58</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-not-in-game">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-correct-response">1</td><!-- James Wray -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ayaan Ghori -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer">troposphere</td> --%>
				</tr>
				<tr>
					<th class="question-number">59</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-not-in-game">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- James Wray -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ayaan Ghori -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-correct-response">1</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer">Zaha Hadid</td> --%>
				</tr>
				<tr>
					<th class="question-number">60</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-not-in-game">&nbsp;</td><!-- Emily Hu -->
					<td class="player-not-in-game">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-correct-response">1</td><!-- James Wray -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ayaan Ghori -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jeev Hora -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Grant Liu-->
					<%-- <td class="answer">Senegal</td> --%>
				</tr>
			</tbody>
			<tfoot>
				<tr class="score-check">
					<th class="score-check-label">Final scores</th>
					<td class="player-eliminated">eliminated</td><!-- Steven Long -->
					<td class="player-eliminated">eliminated</td><!-- Emily Hu -->
					<td class="player-eliminated">eliminated</td><!-- Elena Whitford -->
					<td class="player-score-check">14</td><!-- James Wray -->
					<td class="player-eliminated">eliminated</td><!-- Ayaan Ghori -->
					<td class="player-eliminated">eliminated</td><!-- Jeev Hora -->
					<td class="player-score-check">12</td><!-- Simra Kuchay -->
					<td class="player-eliminated">eliminated</td><!-- Felix Sacks -->
					<td class="player-eliminated">eliminated</td><!-- Grant Liu-->
					<%-- <td class="answer-blank">&nbsp;</td> --%>
				</tr>
			</tfoot>
		</table>
		
		<p>James Wray of Glenbrook South High School (Glenview) is the champion of the 2025 Scobol Solo. He is the first champion, and in fact the first player to make the championship match, from Glenbrook South.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />
